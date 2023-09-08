package p172io.flutter.embedding.android;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import p172io.flutter.Log;
import p172io.flutter.embedding.android.FlutterActivityAndFragmentDelegate;
import p172io.flutter.embedding.engine.FlutterEngine;
import p172io.flutter.embedding.engine.FlutterShellArgs;
import p172io.flutter.embedding.engine.renderer.FlutterUiDisplayListener;
import p172io.flutter.plugin.platform.PlatformPlugin;
import p172io.flutter.util.ViewUtils;

/* renamed from: io.flutter.embedding.android.FlutterBottomSheetFragment */
public class FlutterBottomSheetFragment extends BottomSheetDialogFragment implements FlutterActivityAndFragmentDelegate.Host {
    public static final String ARG_APP_BUNDLE_PATH = "app_bundle_path";
    public static final String ARG_CACHED_ENGINE_ID = "cached_engine_id";
    public static final String ARG_DART_ENTRYPOINT = "dart_entrypoint";
    public static final String ARG_DESTROY_ENGINE_WITH_FRAGMENT = "destroy_engine_with_fragment";
    public static final String ARG_ENABLE_STATE_RESTORATION = "enable_state_restoration";
    public static final String ARG_FLUTTERVIEW_RENDER_MODE = "flutterview_render_mode";
    public static final String ARG_FLUTTERVIEW_TRANSPARENCY_MODE = "flutterview_transparency_mode";
    public static final String ARG_FLUTTER_INITIALIZATION_ARGS = "initialization_args";
    public static final String ARG_HANDLE_DEEPLINKING = "handle_deeplinking";
    public static final String ARG_INITIAL_ROUTE = "initial_route";
    public static final String ARG_SHOULD_ATTACH_ENGINE_TO_ACTIVITY = "should_attach_engine_to_activity";
    public static final int FLUTTER_VIEW_ID = ViewUtils.generateViewId(61938);
    private static final String TAG = "FlutterBottomSheetFragment";
    public FlutterActivityAndFragmentDelegate delegate;

    /* renamed from: io.flutter.embedding.android.FlutterBottomSheetFragment$ActivityCallThrough */
    public @interface ActivityCallThrough {
    }

    /* renamed from: io.flutter.embedding.android.FlutterBottomSheetFragment$CachedEngineFragmentBuilder */
    public static class CachedEngineFragmentBuilder {
        private boolean destroyEngineWithFragment;
        private final String engineId;
        private final Class<? extends FlutterBottomSheetFragment> fragmentClass;
        private boolean handleDeeplinking;
        private RenderMode renderMode;
        private boolean shouldAttachEngineToActivity;
        private TransparencyMode transparencyMode;

        public <T extends FlutterBottomSheetFragment> T build() {
            try {
                T t = (FlutterBottomSheetFragment) this.fragmentClass.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                if (t != null) {
                    t.setArguments(createArgs());
                    return t;
                }
                throw new RuntimeException("The FlutterBottomSheetFragment subclass sent in the constructor (" + this.fragmentClass.getCanonicalName() + ") does not match the expected return type.");
            } catch (Exception e) {
                throw new RuntimeException("Could not instantiate FlutterBottomSheetFragment subclass (" + this.fragmentClass.getName() + ")", e);
            }
        }

        public Bundle createArgs() {
            Bundle bundle = new Bundle();
            bundle.putString("cached_engine_id", this.engineId);
            bundle.putBoolean("destroy_engine_with_fragment", this.destroyEngineWithFragment);
            bundle.putBoolean("handle_deeplinking", this.handleDeeplinking);
            RenderMode renderMode2 = this.renderMode;
            if (renderMode2 == null) {
                renderMode2 = RenderMode.surface;
            }
            bundle.putString("flutterview_render_mode", renderMode2.name());
            TransparencyMode transparencyMode2 = this.transparencyMode;
            if (transparencyMode2 == null) {
                transparencyMode2 = TransparencyMode.transparent;
            }
            bundle.putString("flutterview_transparency_mode", transparencyMode2.name());
            bundle.putBoolean("should_attach_engine_to_activity", this.shouldAttachEngineToActivity);
            return bundle;
        }

        public CachedEngineFragmentBuilder destroyEngineWithFragment(boolean z) {
            this.destroyEngineWithFragment = z;
            return this;
        }

        public CachedEngineFragmentBuilder handleDeeplinking(Boolean bool) {
            this.handleDeeplinking = bool.booleanValue();
            return this;
        }

        public CachedEngineFragmentBuilder renderMode(RenderMode renderMode2) {
            this.renderMode = renderMode2;
            return this;
        }

        public CachedEngineFragmentBuilder shouldAttachEngineToActivity(boolean z) {
            this.shouldAttachEngineToActivity = z;
            return this;
        }

        public CachedEngineFragmentBuilder transparencyMode(TransparencyMode transparencyMode2) {
            this.transparencyMode = transparencyMode2;
            return this;
        }

        private CachedEngineFragmentBuilder(String str) {
            this((Class<? extends FlutterBottomSheetFragment>) FlutterBottomSheetFragment.class, str);
        }

        public CachedEngineFragmentBuilder(Class<? extends FlutterBottomSheetFragment> cls, String str) {
            this.destroyEngineWithFragment = false;
            this.handleDeeplinking = false;
            this.renderMode = RenderMode.surface;
            this.transparencyMode = TransparencyMode.transparent;
            this.shouldAttachEngineToActivity = true;
            this.fragmentClass = cls;
            this.engineId = str;
        }
    }

    public FlutterBottomSheetFragment() {
        setArguments(new Bundle());
    }

    public static FlutterBottomSheetFragment createDefault() {
        return new NewEngineFragmentBuilder().build();
    }

    private boolean stillAttachedForEvent(String str) {
        if (this.delegate != null) {
            return true;
        }
        Log.m165290v(TAG, "FlutterBottomSheetFragment " + hashCode() + " " + str + " called after release.");
        return false;
    }

    public static CachedEngineFragmentBuilder withCachedEngine(String str) {
        return new CachedEngineFragmentBuilder(str);
    }

    public static NewEngineFragmentBuilder withNewEngine() {
        return new NewEngineFragmentBuilder();
    }

    public void cleanUpFlutterEngine(FlutterEngine flutterEngine) {
        FragmentActivity activity = getActivity();
        if (activity instanceof FlutterEngineConfigurator) {
            ((FlutterEngineConfigurator) activity).cleanUpFlutterEngine(flutterEngine);
        }
    }

    public void configureFlutterEngine(FlutterEngine flutterEngine) {
        FragmentActivity activity = getActivity();
        if (activity instanceof FlutterEngineConfigurator) {
            ((FlutterEngineConfigurator) activity).configureFlutterEngine(flutterEngine);
        }
    }

    public void detachFromFlutterEngine() {
        Log.m165290v(TAG, "FlutterBottomSheetFragment " + this + " connection to the engine " + getFlutterEngine() + " evicted by another attaching activity");
        this.delegate.onDestroyView();
        this.delegate.onDetach();
        this.delegate.release();
        this.delegate = null;
    }

    public /* bridge */ /* synthetic */ Activity getActivity() {
        return super.getActivity();
    }

    public String getAppBundlePath() {
        return getArguments().getString("app_bundle_path");
    }

    public String getCachedEngineId() {
        return getArguments().getString("cached_engine_id", (String) null);
    }

    public String getDartEntrypointFunctionName() {
        return getArguments().getString("dart_entrypoint", FlutterActivityLaunchConfigs.DEFAULT_DART_ENTRYPOINT);
    }

    public FlutterEngine getFlutterEngine() {
        return this.delegate.getFlutterEngine();
    }

    public FlutterShellArgs getFlutterShellArgs() {
        String[] stringArray = getArguments().getStringArray("initialization_args");
        if (stringArray == null) {
            stringArray = new String[0];
        }
        return new FlutterShellArgs(stringArray);
    }

    public String getInitialRoute() {
        return getArguments().getString("initial_route");
    }

    public RenderMode getRenderMode() {
        return RenderMode.valueOf(getArguments().getString("flutterview_render_mode", RenderMode.surface.name()));
    }

    public TransparencyMode getTransparencyMode() {
        return TransparencyMode.valueOf(getArguments().getString("flutterview_transparency_mode", TransparencyMode.transparent.name()));
    }

    public boolean isEnableSwitchSurface() {
        return false;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (stillAttachedForEvent("onActivityResult")) {
            this.delegate.onActivityResult(i, i2, intent);
        }
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        FlutterActivityAndFragmentDelegate flutterActivityAndFragmentDelegate = new FlutterActivityAndFragmentDelegate(this);
        this.delegate = flutterActivityAndFragmentDelegate;
        flutterActivityAndFragmentDelegate.onAttach(context);
    }

    public void onBackPressed() {
        if (stillAttachedForEvent("onBackPressed")) {
            this.delegate.onBackPressed();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.delegate.onRestoreInstanceState(bundle);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return this.delegate.onCreateView(layoutInflater, viewGroup, bundle, FLUTTER_VIEW_ID, getRenderMode() == RenderMode.surface);
    }

    public void onDestroyView() {
        super.onDestroyView();
        if (stillAttachedForEvent("onDestroyView")) {
            this.delegate.onDestroyView();
        }
    }

    public void onDetach() {
        super.onDetach();
        FlutterActivityAndFragmentDelegate flutterActivityAndFragmentDelegate = this.delegate;
        if (flutterActivityAndFragmentDelegate != null) {
            flutterActivityAndFragmentDelegate.onDetach();
            this.delegate.release();
            this.delegate = null;
            return;
        }
        Log.m165290v(TAG, "FlutterBottomSheetFragment " + this + " onDetach called after release.");
    }

    public void onFlutterSurfaceViewCreated(FlutterSurfaceView flutterSurfaceView) {
    }

    public void onFlutterTextureViewCreated(FlutterTextureView flutterTextureView) {
    }

    public void onFlutterUiDisplayed() {
        FragmentActivity activity = getActivity();
        if (activity instanceof FlutterUiDisplayListener) {
            ((FlutterUiDisplayListener) activity).onFlutterUiDisplayed();
        }
    }

    public void onFlutterUiNoLongerDisplayed() {
        FragmentActivity activity = getActivity();
        if (activity instanceof FlutterUiDisplayListener) {
            ((FlutterUiDisplayListener) activity).onFlutterUiNoLongerDisplayed();
        }
    }

    public void onLowMemory() {
        super.onLowMemory();
        if (stillAttachedForEvent("onLowMemory")) {
            this.delegate.onLowMemory();
        }
    }

    public void onNewIntent(Intent intent) {
        if (stillAttachedForEvent("onNewIntent")) {
            this.delegate.onNewIntent(intent);
        }
    }

    public void onPause() {
        super.onPause();
        this.delegate.onPause();
    }

    public void onPostResume() {
        this.delegate.onPostResume();
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (stillAttachedForEvent("onRequestPermissionsResult")) {
            this.delegate.onRequestPermissionsResult(i, strArr, iArr);
        }
    }

    public void onResume() {
        super.onResume();
        this.delegate.onResume();
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (stillAttachedForEvent("onSaveInstanceState")) {
            this.delegate.onSaveInstanceState(bundle);
        }
    }

    public void onStart() {
        super.onStart();
        this.delegate.onStart();
    }

    public void onStop() {
        super.onStop();
        if (stillAttachedForEvent("onStop")) {
            this.delegate.onStop();
        }
    }

    public void onTrimMemory(int i) {
        if (stillAttachedForEvent("onTrimMemory")) {
            this.delegate.onTrimMemory(i);
        }
    }

    public void onUserLeaveHint() {
        if (stillAttachedForEvent("onUserLeaveHint")) {
            this.delegate.onUserLeaveHint();
        }
    }

    public boolean popSystemNavigator() {
        return false;
    }

    public FlutterEngine provideFlutterEngine(Context context) {
        FragmentActivity activity = getActivity();
        if (!(activity instanceof FlutterEngineProvider)) {
            return null;
        }
        Log.m165290v(TAG, "Deferring to attached Activity to provide a FlutterEngine.");
        return ((FlutterEngineProvider) activity).provideFlutterEngine(getContext());
    }

    public PlatformPlugin providePlatformPlugin(Activity activity, FlutterEngine flutterEngine) {
        if (activity != null) {
            return new PlatformPlugin(getActivity(), flutterEngine.getPlatformChannel(), this);
        }
        return null;
    }

    public SplashScreen provideSplashScreen() {
        FragmentActivity activity = getActivity();
        if (activity instanceof SplashScreenProvider) {
            return ((SplashScreenProvider) activity).provideSplashScreen();
        }
        return null;
    }

    public void setDelegate(FlutterActivityAndFragmentDelegate flutterActivityAndFragmentDelegate) {
        this.delegate = flutterActivityAndFragmentDelegate;
    }

    public boolean shouldAttachEngineToActivity() {
        return getArguments().getBoolean("should_attach_engine_to_activity");
    }

    public boolean shouldDestroyEngineWithHost() {
        boolean z = getArguments().getBoolean("destroy_engine_with_fragment", false);
        return (getCachedEngineId() != null || this.delegate.isFlutterEngineFromHost()) ? z : getArguments().getBoolean("destroy_engine_with_fragment", true);
    }

    public boolean shouldHandleDeeplinking() {
        return getArguments().getBoolean("handle_deeplinking");
    }

    public boolean shouldRestoreAndSaveState() {
        return getArguments().containsKey("enable_state_restoration") ? getArguments().getBoolean("enable_state_restoration") : getCachedEngineId() == null;
    }

    public void updateSystemUiOverlays() {
        FlutterActivityAndFragmentDelegate flutterActivityAndFragmentDelegate = this.delegate;
        if (flutterActivityAndFragmentDelegate != null) {
            flutterActivityAndFragmentDelegate.updateSystemUiOverlays();
        }
    }

    /* renamed from: io.flutter.embedding.android.FlutterBottomSheetFragment$NewEngineFragmentBuilder */
    public static class NewEngineFragmentBuilder {
        private String appBundlePath;
        private String dartEntrypoint;
        private final Class<? extends FlutterBottomSheetFragment> fragmentClass;
        private boolean handleDeeplinking;
        private String initialRoute;
        private RenderMode renderMode;
        private FlutterShellArgs shellArgs;
        private boolean shouldAttachEngineToActivity;
        private TransparencyMode transparencyMode;

        public NewEngineFragmentBuilder() {
            this.dartEntrypoint = FlutterActivityLaunchConfigs.DEFAULT_DART_ENTRYPOINT;
            this.initialRoute = "/";
            this.handleDeeplinking = false;
            this.appBundlePath = null;
            this.shellArgs = null;
            this.renderMode = RenderMode.surface;
            this.transparencyMode = TransparencyMode.transparent;
            this.shouldAttachEngineToActivity = true;
            this.fragmentClass = FlutterBottomSheetFragment.class;
        }

        public NewEngineFragmentBuilder appBundlePath(String str) {
            this.appBundlePath = str;
            return this;
        }

        public <T extends FlutterBottomSheetFragment> T build() {
            try {
                T t = (FlutterBottomSheetFragment) this.fragmentClass.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                if (t != null) {
                    t.setArguments(createArgs());
                    return t;
                }
                throw new RuntimeException("The FlutterBottomSheetFragment subclass sent in the constructor (" + this.fragmentClass.getCanonicalName() + ") does not match the expected return type.");
            } catch (Exception e) {
                throw new RuntimeException("Could not instantiate FlutterBottomSheetFragment subclass (" + this.fragmentClass.getName() + ")", e);
            }
        }

        public Bundle createArgs() {
            Bundle bundle = new Bundle();
            bundle.putString("initial_route", this.initialRoute);
            bundle.putBoolean("handle_deeplinking", this.handleDeeplinking);
            bundle.putString("app_bundle_path", this.appBundlePath);
            bundle.putString("dart_entrypoint", this.dartEntrypoint);
            FlutterShellArgs flutterShellArgs = this.shellArgs;
            if (flutterShellArgs != null) {
                bundle.putStringArray("initialization_args", flutterShellArgs.toArray());
            }
            RenderMode renderMode2 = this.renderMode;
            if (renderMode2 == null) {
                renderMode2 = RenderMode.surface;
            }
            bundle.putString("flutterview_render_mode", renderMode2.name());
            TransparencyMode transparencyMode2 = this.transparencyMode;
            if (transparencyMode2 == null) {
                transparencyMode2 = TransparencyMode.transparent;
            }
            bundle.putString("flutterview_transparency_mode", transparencyMode2.name());
            bundle.putBoolean("should_attach_engine_to_activity", this.shouldAttachEngineToActivity);
            bundle.putBoolean("destroy_engine_with_fragment", true);
            return bundle;
        }

        public NewEngineFragmentBuilder dartEntrypoint(String str) {
            this.dartEntrypoint = str;
            return this;
        }

        public NewEngineFragmentBuilder flutterShellArgs(FlutterShellArgs flutterShellArgs) {
            this.shellArgs = flutterShellArgs;
            return this;
        }

        public NewEngineFragmentBuilder handleDeeplinking(Boolean bool) {
            this.handleDeeplinking = bool.booleanValue();
            return this;
        }

        public NewEngineFragmentBuilder initialRoute(String str) {
            this.initialRoute = str;
            return this;
        }

        public NewEngineFragmentBuilder renderMode(RenderMode renderMode2) {
            this.renderMode = renderMode2;
            return this;
        }

        public NewEngineFragmentBuilder shouldAttachEngineToActivity(boolean z) {
            this.shouldAttachEngineToActivity = z;
            return this;
        }

        public NewEngineFragmentBuilder transparencyMode(TransparencyMode transparencyMode2) {
            this.transparencyMode = transparencyMode2;
            return this;
        }

        public NewEngineFragmentBuilder(Class<? extends FlutterBottomSheetFragment> cls) {
            this.dartEntrypoint = FlutterActivityLaunchConfigs.DEFAULT_DART_ENTRYPOINT;
            this.initialRoute = "/";
            this.handleDeeplinking = false;
            this.appBundlePath = null;
            this.shellArgs = null;
            this.renderMode = RenderMode.surface;
            this.transparencyMode = TransparencyMode.transparent;
            this.shouldAttachEngineToActivity = true;
            this.fragmentClass = cls;
        }
    }
}
