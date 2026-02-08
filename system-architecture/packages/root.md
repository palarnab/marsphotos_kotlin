# Package: root

Files: E:/myProjects/lyx/convertTestAndroid/build.gradle.kts
E:/myProjects/lyx/convertTestAndroid/settings.gradle.kts
E:/myProjects/lyx/convertTestAndroid/app/build.gradle.kts
E:/myProjects/lyx/convertTestAndroid/app/src/main/java/com/example/marsphotos/MainActivity.kt
E:/myProjects/lyx/convertTestAndroid/app/src/main/java/com/example/marsphotos/MarsPhotosApplication.kt
E:/myProjects/lyx/convertTestAndroid/app/src/test/java/com/example/marsphotos/MarsViewModelTest.kt
E:/myProjects/lyx/convertTestAndroid/app/src/test/java/com/example/marsphotos/NetworkMarsRepositoryTest.kt
E:/myProjects/lyx/convertTestAndroid/app/src/main/java/com/example/marsphotos/data/AppContainer.kt
E:/myProjects/lyx/convertTestAndroid/app/src/main/java/com/example/marsphotos/data/MarsPhotosRepository.kt
E:/myProjects/lyx/convertTestAndroid/app/src/main/java/com/example/marsphotos/model/MarsPhoto.kt
E:/myProjects/lyx/convertTestAndroid/app/src/main/java/com/example/marsphotos/network/MarsApiService.kt
E:/myProjects/lyx/convertTestAndroid/app/src/main/java/com/example/marsphotos/ui/MarsPhotosApp.kt
E:/myProjects/lyx/convertTestAndroid/app/src/test/java/com/example/marsphotos/fake/FakeDataSource.kt
E:/myProjects/lyx/convertTestAndroid/app/src/test/java/com/example/marsphotos/fake/FakeMarsApiService.kt
E:/myProjects/lyx/convertTestAndroid/app/src/test/java/com/example/marsphotos/fake/FakeNetworkMarsPhotosRepository.kt
E:/myProjects/lyx/convertTestAndroid/app/src/test/java/com/example/marsphotos/rules/TestDispatcherRule.kt
E:/myProjects/lyx/convertTestAndroid/app/src/main/java/com/example/marsphotos/ui/screens/HomeScreen.kt
E:/myProjects/lyx/convertTestAndroid/app/src/main/java/com/example/marsphotos/ui/screens/MarsViewModel.kt
E:/myProjects/lyx/convertTestAndroid/app/src/main/java/com/example/marsphotos/ui/theme/Color.kt
E:/myProjects/lyx/convertTestAndroid/app/src/main/java/com/example/marsphotos/ui/theme/Shape.kt
E:/myProjects/lyx/convertTestAndroid/app/src/main/java/com/example/marsphotos/ui/theme/Theme.kt
E:/myProjects/lyx/convertTestAndroid/app/src/main/java/com/example/marsphotos/ui/theme/Type.kt

## Classes

- MainActivity (file: ..\..\..\lyx\convertTestAndroid\app\src\main\java\com\example\marsphotos\MainActivity.kt)

- MarsPhotosApplication (file: ..\..\..\lyx\convertTestAndroid\app\src\main\java\com\example\marsphotos\MarsPhotosApplication.kt)

- MarsViewModelTest (file: ..\..\..\lyx\convertTestAndroid\app\src\test\java\com\example\marsphotos\MarsViewModelTest.kt)

- NetworkMarsRepositoryTest (file: ..\..\..\lyx\convertTestAndroid\app\src\test\java\com\example\marsphotos\NetworkMarsRepositoryTest.kt)

- AppContainer (file: ..\..\..\lyx\convertTestAndroid\app\src\main\java\com\example\marsphotos\data\AppContainer.kt)

- DefaultAppContainer (file: ..\..\..\lyx\convertTestAndroid\app\src\main\java\com\example\marsphotos\data\AppContainer.kt)

- MarsPhotosRepository (file: ..\..\..\lyx\convertTestAndroid\app\src\main\java\com\example\marsphotos\data\MarsPhotosRepository.kt)

- NetworkMarsPhotosRepository (file: ..\..\..\lyx\convertTestAndroid\app\src\main\java\com\example\marsphotos\data\MarsPhotosRepository.kt)

- MarsPhoto (file: ..\..\..\lyx\convertTestAndroid\app\src\main\java\com\example\marsphotos\model\MarsPhoto.kt)

- MarsApiService (file: ..\..\..\lyx\convertTestAndroid\app\src\main\java\com\example\marsphotos\network\MarsApiService.kt)

- FakeDataSource (file: ..\..\..\lyx\convertTestAndroid\app\src\test\java\com\example\marsphotos\fake\FakeDataSource.kt)

- FakeMarsApiService (file: ..\..\..\lyx\convertTestAndroid\app\src\test\java\com\example\marsphotos\fake\FakeMarsApiService.kt)

- FakeNetworkMarsPhotosRepository (file: ..\..\..\lyx\convertTestAndroid\app\src\test\java\com\example\marsphotos\fake\FakeNetworkMarsPhotosRepository.kt)

- TestDispatcherRule (file: ..\..\..\lyx\convertTestAndroid\app\src\test\java\com\example\marsphotos\rules\TestDispatcherRule.kt)

- MarsUiState (file: ..\..\..\lyx\convertTestAndroid\app\src\main\java\com\example\marsphotos\ui\screens\MarsViewModel.kt)

- Success (file: ..\..\..\lyx\convertTestAndroid\app\src\main\java\com\example\marsphotos\ui\screens\MarsViewModel.kt)

- Error (file: ..\..\..\lyx\convertTestAndroid\app\src\main\java\com\example\marsphotos\ui\screens\MarsViewModel.kt)

- Loading (file: ..\..\..\lyx\convertTestAndroid\app\src\main\java\com\example\marsphotos\ui\screens\MarsViewModel.kt)

- MarsViewModel (file: ..\..\..\lyx\convertTestAndroid\app\src\main\java\com\example\marsphotos\ui\screens\MarsViewModel.kt)

## Functions

- onCreate (file: ..\..\..\lyx\convertTestAndroid\app\src\main\java\com\example\marsphotos\MainActivity.kt)

```Kotlin

override fun onCreate(savedInstanceState: Bundle?) {
        enableEdgeToEdge()
        super.onCreate(savedInstanceState)
        setContent {
            MarsPhotosTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                ) {
                    MarsPhotosApp()
                }
            }
        }
    }

```

- onCreate (file: ..\..\..\lyx\convertTestAndroid\app\src\main\java\com\example\marsphotos\MarsPhotosApplication.kt)

```Kotlin

override fun onCreate() {
        super.onCreate()
        container = DefaultAppContainer()
    }

```

- marsViewModel_getMarsPhotos_verifyMarsUiStateSuccess (file: ..\..\..\lyx\convertTestAndroid\app\src\test\java\com\example\marsphotos\MarsViewModelTest.kt)

```Kotlin

@Test
    fun marsViewModel_getMarsPhotos_verifyMarsUiStateSuccess() =
        runTest {
            val marsViewModel = MarsViewModel(
                marsPhotosRepository = FakeNetworkMarsPhotosRepository()
            )
            assertEquals(
                MarsUiState.Success(FakeDataSource.photosList),
                marsViewModel.marsUiState
            )
        }

```

- networkMarsPhotosRepository_getMarsPhotos_verifyPhotoList (file: ..\..\..\lyx\convertTestAndroid\app\src\test\java\com\example\marsphotos\NetworkMarsRepositoryTest.kt)

```Kotlin

@Test
    fun networkMarsPhotosRepository_getMarsPhotos_verifyPhotoList() =
        runTest {
            val repository = NetworkMarsPhotosRepository(
                marsApiService = FakeMarsApiService()
            )
            assertEquals(FakeDataSource.photosList, repository.getMarsPhotos())
        }

```

- getMarsPhotos (file: ..\..\..\lyx\convertTestAndroid\app\src\main\java\com\example\marsphotos\data\MarsPhotosRepository.kt)

```Kotlin

suspend fun getMarsPhotos(): List<MarsPhoto>

```

- getMarsPhotos (file: ..\..\..\lyx\convertTestAndroid\app\src\main\java\com\example\marsphotos\data\MarsPhotosRepository.kt)

```Kotlin

override suspend fun getMarsPhotos(): List<MarsPhoto> = marsApiService.getPhotos()

```

- getPhotos (file: ..\..\..\lyx\convertTestAndroid\app\src\main\java\com\example\marsphotos\network\MarsApiService.kt)

```Kotlin

@GET("photos")
    suspend fun getPhotos(): List<MarsPhoto>

```

- MarsPhotosApp (file: ..\..\..\lyx\convertTestAndroid\app\src\main\java\com\example\marsphotos\ui\MarsPhotosApp.kt)

```Kotlin

@Composable
fun MarsPhotosApp() {
    val scrollBehavior = TopAppBarDefaults.enterAlwaysScrollBehavior()
    Scaffold(
        modifier = Modifier.nestedScroll(scrollBehavior.nestedScrollConnection),
        topBar = { MarsTopAppBar(scrollBehavior = scrollBehavior) }
    ) {
        Surface(
            modifier = Modifier.fillMaxSize()
        ) {
            val marsViewModel: MarsViewModel =
                viewModel(factory = MarsViewModel.Factory)
            HomeScreen(
                marsUiState = marsViewModel.marsUiState,
                retryAction = marsViewModel::getMarsPhotos,
                contentPadding = it
            )
        }
    }
}

```

- MarsTopAppBar (file: ..\..\..\lyx\convertTestAndroid\app\src\main\java\com\example\marsphotos\ui\MarsPhotosApp.kt)

```Kotlin

@Composable
fun MarsTopAppBar(scrollBehavior: TopAppBarScrollBehavior, modifier: Modifier = Modifier) {
    CenterAlignedTopAppBar(
        scrollBehavior = scrollBehavior,
        title = {
            Text(
                text = stringResource(R.string.app_name),
                style = MaterialTheme.typography.headlineSmall,
            )
        },
        modifier = modifier
    )
}

```

- getPhotos (file: ..\..\..\lyx\convertTestAndroid\app\src\test\java\com\example\marsphotos\fake\FakeMarsApiService.kt)

```Kotlin

override suspend fun getPhotos(): List<MarsPhoto> {
        return FakeDataSource.photosList
    }

```

- getMarsPhotos (file: ..\..\..\lyx\convertTestAndroid\app\src\test\java\com\example\marsphotos\fake\FakeNetworkMarsPhotosRepository.kt)

```Kotlin

override suspend fun getMarsPhotos(): List<MarsPhoto> {
        return FakeDataSource.photosList
    }

```

- starting (file: ..\..\..\lyx\convertTestAndroid\app\src\test\java\com\example\marsphotos\rules\TestDispatcherRule.kt)

```Kotlin

override fun starting(description: Description) {
        Dispatchers.setMain(testDispatcher)
    }

```

- finished (file: ..\..\..\lyx\convertTestAndroid\app\src\test\java\com\example\marsphotos\rules\TestDispatcherRule.kt)

```Kotlin

override fun finished(description: Description) {
        Dispatchers.resetMain()
    }

```

- HomeScreen (file: ..\..\..\lyx\convertTestAndroid\app\src\main\java\com\example\marsphotos\ui\screens\HomeScreen.kt)

```Kotlin

@Composable
fun HomeScreen(
    marsUiState: MarsUiState,
    retryAction: () -> Unit,
    modifier: Modifier = Modifier,
    contentPadding: PaddingValues = PaddingValues(0.dp),
) {
    when (marsUiState) {
        is MarsUiState.Loading -> LoadingScreen(modifier = modifier.fillMaxSize())
        is MarsUiState.Success -> PhotosGridScreen(
            marsUiState.photos, contentPadding = contentPadding, modifier = modifier.fillMaxWidth()
        )
        is MarsUiState.Error -> ErrorScreen(retryAction, modifier = modifier.fillMaxSize())
    }
}

```

- LoadingScreen (file: ..\..\..\lyx\convertTestAndroid\app\src\main\java\com\example\marsphotos\ui\screens\HomeScreen.kt)

```Kotlin

@Composable
fun LoadingScreen(modifier: Modifier = Modifier) {
    Image(
        modifier = modifier.size(200.dp),
        painter = painterResource(R.drawable.loading_img),
        contentDescription = stringResource(R.string.loading)
    )
}

```

- ErrorScreen (file: ..\..\..\lyx\convertTestAndroid\app\src\main\java\com\example\marsphotos\ui\screens\HomeScreen.kt)

```Kotlin

@Composable
fun ErrorScreen(retryAction: () -> Unit, modifier: Modifier = Modifier) {
    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(id = R.drawable.ic_connection_error), contentDescription = ""
        )
        Text(text = stringResource(R.string.loading_failed), modifier = Modifier.padding(16.dp))
        Button(onClick = retryAction) {
            Text(stringResource(R.string.retry))
        }
    }
}

```

- PhotosGridScreen (file: ..\..\..\lyx\convertTestAndroid\app\src\main\java\com\example\marsphotos\ui\screens\HomeScreen.kt)

```Kotlin

@Composable
fun PhotosGridScreen(
    photos: List<MarsPhoto>,
    modifier: Modifier = Modifier,
    contentPadding: PaddingValues = PaddingValues(0.dp),
) {
    LazyVerticalGrid(
        columns = GridCells.Adaptive(150.dp),
        modifier = modifier.padding(horizontal = 4.dp),
        contentPadding = contentPadding,
    ) {
        items(items = photos, key = { photo -> photo.id }) { photo ->
            MarsPhotoCard(
                photo,
                modifier = Modifier
                    .padding(4.dp)
                    .fillMaxWidth()
                    .aspectRatio(1.5f)
            )
        }
    }
}

```

- MarsPhotoCard (file: ..\..\..\lyx\convertTestAndroid\app\src\main\java\com\example\marsphotos\ui\screens\HomeScreen.kt)

```Kotlin

@Composable
fun MarsPhotoCard(photo: MarsPhoto, modifier: Modifier = Modifier) {
    Card(
        modifier = modifier,
        shape = MaterialTheme.shapes.medium,
        elevation = CardDefaults.cardElevation(defaultElevation = 8.dp)
    ) {
        AsyncImage(
            model = ImageRequest.Builder(context = LocalContext.current).data(photo.imgSrc)
                .crossfade(true).build(),
            error = painterResource(R.drawable.ic_broken_image),
            placeholder = painterResource(R.drawable.loading_img),
            contentDescription = stringResource(R.string.mars_photo),
            contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxWidth()
        )
    }
}

```

- LoadingScreenPreview (file: ..\..\..\lyx\convertTestAndroid\app\src\main\java\com\example\marsphotos\ui\screens\HomeScreen.kt)

```Kotlin

@Preview(showBackground = true)
@Composable
fun LoadingScreenPreview() {
    MarsPhotosTheme {
        LoadingScreen()
    }
}

```

- ErrorScreenPreview (file: ..\..\..\lyx\convertTestAndroid\app\src\main\java\com\example\marsphotos\ui\screens\HomeScreen.kt)

```Kotlin

@Preview(showBackground = true)
@Composable
fun ErrorScreenPreview() {
    MarsPhotosTheme {
        ErrorScreen({})
    }
}

```

- PhotosGridScreenPreview (file: ..\..\..\lyx\convertTestAndroid\app\src\main\java\com\example\marsphotos\ui\screens\HomeScreen.kt)

```Kotlin

@Preview(showBackground = true)
@Composable
fun PhotosGridScreenPreview() {
    MarsPhotosTheme {
        val mockData = List(10) { MarsPhoto("$it", "") }
        PhotosGridScreen(mockData)
    }
}

```

- getMarsPhotos (file: ..\..\..\lyx\convertTestAndroid\app\src\main\java\com\example\marsphotos\ui\screens\MarsViewModel.kt)

```Kotlin

fun getMarsPhotos() {
        viewModelScope.launch {
            marsUiState = MarsUiState.Loading
            marsUiState = try {
                MarsUiState.Success(marsPhotosRepository.getMarsPhotos())
            } catch (e: IOException) {
                MarsUiState.Error
            } catch (e: HttpException) {
                MarsUiState.Error
            }
        }
    }

```

- MarsPhotosTheme (file: ..\..\..\lyx\convertTestAndroid\app\src\main\java\com\example\marsphotos\ui\theme\Theme.kt)

```Kotlin

@Composable
fun MarsPhotosTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    // Dynamic color is available on Android 12+
    // Dynamic color in this app is turned off for learning purposes
    dynamicColor: Boolean = false,
    content: @Composable () -> Unit
) {
    val colorScheme = when {
        dynamicColor && Build.VERSION.SDK_INT >= Build.VERSION_CODES.S -> {
            val context = LocalContext.current
            if (darkTheme) dynamicDarkColorScheme(context) else dynamicLightColorScheme(context)
        }

        darkTheme -> DarkColorScheme
        else -> LightColorScheme
    }
    val view = LocalView.current
    if (!view.isInEditMode) {
        SideEffect {
            val window = (view.context as Activity).window
            window.statusB

```
