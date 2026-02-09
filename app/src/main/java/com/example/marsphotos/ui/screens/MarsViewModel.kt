package com.example.marsphotos.ui.screens

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProvider.AndroidViewModelFactory.Companion.APPLICATION_KEY
import androidx.lifecycle.viewModelScope
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import com.example.marsphotos.MarsPhotosApplication
import com.example.marsphotos.data.MarsPhotosRepository
import com.example.marsphotos.model.MarsPhoto
import kotlinx.coroutines.launch
import retrofit2.HttpException
import java.io.IOException

/**
 * UI state for the Home screen
 */
sealed interface MarsUiState {
    data class Success(val photos: List<MarsPhoto>) : MarsUiState
    data class Error(val message: String) : MarsUiState
    object Loading : MarsUiState
}

class MarsViewModel(
    private val marsPhotosRepository: MarsPhotosRepository
) : ViewModel() {

    /** UI state exposed to Compose */
    var marsUiState: MarsUiState by mutableStateOf(MarsUiState.Loading)
        private set

    /** Cache to avoid unnecessary reloads */
    private var cachedPhotos: List<MarsPhoto>? = null

    init {
        loadPhotos()
    }

    /**
     * Loads Mars photos only if not already cached
     */
    fun loadPhotos(forceRefresh: Boolean = false) {
        if (!forceRefresh && cachedPhotos != null) {
            marsUiState = MarsUiState.Success(cachedPhotos!!)
            return
        }

        viewModelScope.launch {
            marsUiState = MarsUiState.Loading
            try {
                val photos = marsPhotosRepository.getMarsPhotos()
                cachedPhotos = photos
                marsUiState = MarsUiState.Success(photos)
            } catch (e: IOException) {
                marsUiState = MarsUiState.Error(
                    message = "Network error. Check your connection and try again."
                )
            } catch (e: HttpException) {
                marsUiState = MarsUiState.Error(
                    message = "Server error (${e.code()}). Please try later."
                )
            } catch (e: Exception) {
                marsUiState = MarsUiState.Error(
                    message = "Unexpected error occurred."
                )
            }
        }
    }

    /**
     * Explicit retry/refresh API for UI (e.g. pull-to-refresh or retry button)
     */
    fun refresh() {
        loadPhotos(forceRefresh = true)
    }

    companion object {
        val Factory: ViewModelProvider.Factory = viewModelFactory {
            initializer {
                val application =
                    this[APPLICATION_KEY] as MarsPhotosApplication
                MarsViewModel(
                    marsPhotosRepository = application
                        .container
                        .marsPhotosRepository
                )
            }
        }
    }
}
