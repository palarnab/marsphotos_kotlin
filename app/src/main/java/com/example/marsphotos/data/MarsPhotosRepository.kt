package com.example.marsphotos.data

import com.example.marsphotos.model.MarsPhoto
import com.example.marsphotos.network.MarsApiService
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.flow

/**
 * Network Implementation of Repository that fetches mars photos list from marsApi.
 */
class NetworkMarsPhotosRepository(
    private val marsApiService: MarsApiService
) : MarsPhotosRepository {

    override fun getMarsPhotos(): Flow<DataResult<List<MarsPhoto>>> = flow {
        emit(DataResult.Loading)

        val photos = marsApiService.getPhotos()
        emit(DataResult.Success(photos))
    }.catch { throwable ->
        emit(DataResult.Error(throwable))
    }
	
	override fun getMarsPhotosById(id): Flow<DataResult<List<MarsPhoto>>> = flow {
        emit(DataResult.Loading)

        val photos = marsApiService.getPhotos(id)
        emit(DataResult.Success(photos))
    }.catch { throwable ->
        emit(DataResult.Error(throwable))
    }
}
