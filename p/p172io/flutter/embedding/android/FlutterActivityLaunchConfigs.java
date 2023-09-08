package p172io.flutter.embedding.android;

/* renamed from: io.flutter.embedding.android.FlutterActivityLaunchConfigs */
public class FlutterActivityLaunchConfigs {
    public static final String DART_ENTRYPOINT_META_DATA_KEY = "io.flutter.Entrypoint";
    public static final String DEFAULT_BACKGROUND_MODE = BackgroundMode.opaque.name();
    public static final String DEFAULT_DART_ENTRYPOINT = "main";
    public static final String DEFAULT_INITIAL_ROUTE = "/";
    public static final String EXTRA_BACKGROUND_MODE = "background_mode";
    public static final String EXTRA_CACHED_ENGINE_ID = "cached_engine_id";
    public static final String EXTRA_DESTROY_ENGINE_WITH_ACTIVITY = "destroy_engine_with_activity";
    public static final String EXTRA_ENABLE_STATE_RESTORATION = "enable_state_restoration";
    public static final String EXTRA_ENABLE_SWITCH_SURFACE = "enable_switch_surface";
    public static final String EXTRA_INITIAL_ROUTE = "route";
    public static final String HANDLE_DEEPLINKING_META_DATA_KEY = "flutter_deeplinking_enabled";
    public static final String INITIAL_ROUTE_META_DATA_KEY = "io.flutter.InitialRoute";
    public static final String NORMAL_THEME_META_DATA_KEY = "io.flutter.embedding.android.NormalTheme";
    public static final String SPLASH_SCREEN_META_DATA_KEY = "io.flutter.embedding.android.SplashScreenDrawable";

    /* renamed from: io.flutter.embedding.android.FlutterActivityLaunchConfigs$BackgroundMode */
    public enum BackgroundMode {
        opaque,
        transparent
    }

    private FlutterActivityLaunchConfigs() {
    }
}
