package p172io.flutter.embedding.android;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.lifecycle.C0125s;
import androidx.lifecycle.C103766u;
import androidx.lifecycle.C39623j;
import com.tencent.p014mm.hellhoundlib.activities.HellActivity;
import p1050v2.C111325g;
import p172io.flutter.Log;
import p172io.flutter.embedding.android.FlutterActivityAndFragmentDelegate;
import p172io.flutter.embedding.android.FlutterActivityLaunchConfigs;
import p172io.flutter.embedding.engine.FlutterEngine;
import p172io.flutter.embedding.engine.FlutterShellArgs;
import p172io.flutter.embedding.engine.plugins.util.GeneratedPluginRegister;
import p172io.flutter.plugin.platform.PlatformPlugin;
import p172io.flutter.util.ViewUtils;

/* renamed from: io.flutter.embedding.android.FlutterActivity */
public class FlutterActivity extends HellActivity implements FlutterActivityAndFragmentDelegate.Host, C0125s {
    public static final int FLUTTER_VIEW_ID = ViewUtils.generateViewId(61938);
    private static final String TAG = "FlutterActivity";
    public FlutterActivityAndFragmentDelegate delegate;
    private C103766u lifecycle = new C103766u(this);

    /* renamed from: io.flutter.embedding.android.FlutterActivity$CachedEngineIntentBuilder */
    public static class CachedEngineIntentBuilder {
        private final Class<? extends FlutterActivity> activityClass;
        private String backgroundMode = FlutterActivityLaunchConfigs.DEFAULT_BACKGROUND_MODE;
        private final String cachedEngineId;
        private boolean destroyEngineWithActivity = false;
        private boolean enableSwitchSurface = false;

        public CachedEngineIntentBuilder(Class<? extends FlutterActivity> cls, String str) {
            this.activityClass = cls;
            this.cachedEngineId = str;
        }

        public CachedEngineIntentBuilder backgroundMode(FlutterActivityLaunchConfigs.BackgroundMode backgroundMode2) {
            this.backgroundMode = backgroundMode2.name();
            return this;
        }

        public Intent build(Context context) {
            return new Intent(context, this.activityClass).putExtra("cached_engine_id", this.cachedEngineId).putExtra("destroy_engine_with_activity", this.destroyEngineWithActivity).putExtra("background_mode", this.backgroundMode).putExtra(FlutterActivityLaunchConfigs.EXTRA_ENABLE_SWITCH_SURFACE, this.enableSwitchSurface);
        }

        public CachedEngineIntentBuilder destroyEngineWithActivity(boolean z) {
            this.destroyEngineWithActivity = z;
            return this;
        }

        public CachedEngineIntentBuilder enableSwitchSurface(boolean z) {
            this.enableSwitchSurface = z;
            return this;
        }
    }

    /* renamed from: io.flutter.embedding.android.FlutterActivity$NewEngineIntentBuilder */
    public static class NewEngineIntentBuilder {
        private final Class<? extends FlutterActivity> activityClass;
        private String backgroundMode = FlutterActivityLaunchConfigs.DEFAULT_BACKGROUND_MODE;
        private boolean enableSwitchSurface = false;
        private String initialRoute = "/";

        public NewEngineIntentBuilder(Class<? extends FlutterActivity> cls) {
            this.activityClass = cls;
        }

        public NewEngineIntentBuilder backgroundMode(FlutterActivityLaunchConfigs.BackgroundMode backgroundMode2) {
            this.backgroundMode = backgroundMode2.name();
            return this;
        }

        public Intent build(Context context) {
            return new Intent(context, this.activityClass).putExtra("route", this.initialRoute).putExtra("background_mode", this.backgroundMode).putExtra("destroy_engine_with_activity", true).putExtra(FlutterActivityLaunchConfigs.EXTRA_ENABLE_SWITCH_SURFACE, true);
        }

        public NewEngineIntentBuilder enableSwitchSurface(boolean z) {
            this.enableSwitchSurface = z;
            return this;
        }

        public NewEngineIntentBuilder initialRoute(String str) {
            this.initialRoute = str;
            return this;
        }
    }

    private void configureStatusBarForFullscreenFlutterExperience() {
        Window window = getWindow();
        window.addFlags(Integer.MIN_VALUE);
        window.setStatusBarColor(1073741824);
        window.getDecorView().setSystemUiVisibility(1280);
    }

    private void configureWindowForTransparency() {
        if (getBackgroundMode() == FlutterActivityLaunchConfigs.BackgroundMode.transparent) {
            getWindow().setBackgroundDrawable(new ColorDrawable(0));
        }
    }

    public static Intent createDefaultIntent(Context context) {
        return withNewEngine().build(context);
    }

    private View createFlutterView() {
        return this.delegate.onCreateView((LayoutInflater) null, (ViewGroup) null, (Bundle) null, FLUTTER_VIEW_ID, getRenderMode() == RenderMode.surface);
    }

    private Drawable getSplashScreenFromManifest() {
        try {
            Bundle metaData = getMetaData();
            int i = metaData != null ? metaData.getInt(FlutterActivityLaunchConfigs.SPLASH_SCREEN_META_DATA_KEY) : 0;
            if (i == 0) {
                return null;
            }
            Resources resources = getResources();
            Resources.Theme theme = getTheme();
            ThreadLocal<TypedValue> threadLocal = C111325g.f333301a;
            return resources.getDrawable(i, theme);
        } catch (Resources.NotFoundException e) {
            Log.m165286e(TAG, "Splash screen not found. Ensure the drawable exists and that it's valid.");
            throw e;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    private boolean isDebuggable() {
        return (getApplicationInfo().flags & 2) != 0;
    }

    private void release() {
        FlutterActivityAndFragmentDelegate flutterActivityAndFragmentDelegate = this.delegate;
        if (flutterActivityAndFragmentDelegate != null) {
            flutterActivityAndFragmentDelegate.release();
            this.delegate = null;
        }
    }

    private boolean stillAttachedForEvent(String str) {
        FlutterActivityAndFragmentDelegate flutterActivityAndFragmentDelegate = this.delegate;
        if (flutterActivityAndFragmentDelegate == null) {
            Log.m165292w(TAG, "FlutterActivity " + hashCode() + " " + str + " called after release.");
            return false;
        } else if (flutterActivityAndFragmentDelegate.isAttached()) {
            return true;
        } else {
            Log.m165292w(TAG, "FlutterActivity " + hashCode() + " " + str + " called after detach.");
            return false;
        }
    }

    private void switchLaunchThemeForNormalTheme() {
        try {
            Bundle metaData = getMetaData();
            if (metaData != null) {
                int i = metaData.getInt(FlutterActivityLaunchConfigs.NORMAL_THEME_META_DATA_KEY, -1);
                if (i != -1) {
                    setTheme(i);
                    return;
                }
                return;
            }
            Log.m165290v(TAG, "Using the launch theme as normal theme.");
        } catch (PackageManager.NameNotFoundException unused) {
            Log.m165286e(TAG, "Could not read meta-data for FlutterActivity. Using the launch theme as normal theme.");
        }
    }

    public static CachedEngineIntentBuilder withCachedEngine(String str) {
        return new CachedEngineIntentBuilder(FlutterActivity.class, str);
    }

    public static NewEngineIntentBuilder withNewEngine() {
        return new NewEngineIntentBuilder(FlutterActivity.class);
    }

    public void cleanUpFlutterEngine(FlutterEngine flutterEngine) {
    }

    public void configureFlutterEngine(FlutterEngine flutterEngine) {
        if (!this.delegate.isFlutterEngineFromHost()) {
            GeneratedPluginRegister.registerGeneratedPlugins(flutterEngine);
        }
    }

    public void detachFromFlutterEngine() {
        Log.m165292w(TAG, "FlutterActivity " + this + " connection to the engine " + getFlutterEngine() + " evicted by another attaching activity");
        FlutterActivityAndFragmentDelegate flutterActivityAndFragmentDelegate = this.delegate;
        if (flutterActivityAndFragmentDelegate != null) {
            flutterActivityAndFragmentDelegate.onDestroyView();
            this.delegate.onDetach();
        }
    }

    public Activity getActivity() {
        return this;
    }

    public String getAppBundlePath() {
        String dataString;
        if (!isDebuggable() || !"android.intent.action.RUN".equals(getIntent().getAction()) || (dataString = getIntent().getDataString()) == null) {
            return null;
        }
        return dataString;
    }

    public FlutterActivityLaunchConfigs.BackgroundMode getBackgroundMode() {
        return getIntent().hasExtra("background_mode") ? FlutterActivityLaunchConfigs.BackgroundMode.valueOf(getIntent().getStringExtra("background_mode")) : FlutterActivityLaunchConfigs.BackgroundMode.opaque;
    }

    public String getCachedEngineId() {
        return getIntent().getStringExtra("cached_engine_id");
    }

    public Context getContext() {
        return this;
    }

    public String getDartEntrypointFunctionName() {
        try {
            Bundle metaData = getMetaData();
            String string = metaData != null ? metaData.getString(FlutterActivityLaunchConfigs.DART_ENTRYPOINT_META_DATA_KEY) : null;
            return string != null ? string : FlutterActivityLaunchConfigs.DEFAULT_DART_ENTRYPOINT;
        } catch (PackageManager.NameNotFoundException unused) {
            return FlutterActivityLaunchConfigs.DEFAULT_DART_ENTRYPOINT;
        }
    }

    public FlutterEngine getFlutterEngine() {
        return this.delegate.getFlutterEngine();
    }

    public FlutterShellArgs getFlutterShellArgs() {
        return FlutterShellArgs.fromIntent(getIntent());
    }

    public String getInitialRoute() {
        if (getIntent().hasExtra("route")) {
            return getIntent().getStringExtra("route");
        }
        try {
            Bundle metaData = getMetaData();
            if (metaData != null) {
                return metaData.getString(FlutterActivityLaunchConfigs.INITIAL_ROUTE_META_DATA_KEY);
            }
            return null;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public C39623j getLifecycle() {
        return this.lifecycle;
    }

    public Bundle getMetaData() {
        return getPackageManager().getActivityInfo(getComponentName(), 128).metaData;
    }

    public RenderMode getRenderMode() {
        return getBackgroundMode() == FlutterActivityLaunchConfigs.BackgroundMode.opaque ? RenderMode.surface : RenderMode.texture;
    }

    public TransparencyMode getTransparencyMode() {
        return getBackgroundMode() == FlutterActivityLaunchConfigs.BackgroundMode.opaque ? TransparencyMode.opaque : TransparencyMode.transparent;
    }

    public boolean isEnableSwitchSurface() {
        return getIntent().getBooleanExtra(FlutterActivityLaunchConfigs.EXTRA_ENABLE_SWITCH_SURFACE, false);
    }

    public boolean isInSwapSurface() {
        FlutterActivityAndFragmentDelegate flutterActivityAndFragmentDelegate = this.delegate;
        if (flutterActivityAndFragmentDelegate != null) {
            return flutterActivityAndFragmentDelegate.isInSwapSurface();
        }
        return false;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (stillAttachedForEvent("onActivityResult")) {
            this.delegate.onActivityResult(i, i2, intent);
        }
    }

    public void onBackPressed() {
        if (stillAttachedForEvent("onBackPressed")) {
            this.delegate.onBackPressed();
        }
    }

    public void onCreate(Bundle bundle) {
        switchLaunchThemeForNormalTheme();
        super.onCreate(bundle);
        FlutterActivityAndFragmentDelegate flutterActivityAndFragmentDelegate = new FlutterActivityAndFragmentDelegate(this);
        this.delegate = flutterActivityAndFragmentDelegate;
        flutterActivityAndFragmentDelegate.onAttach(this);
        this.delegate.onRestoreInstanceState(bundle);
        this.lifecycle.mo145135c(C39623j.C39625b.ON_CREATE);
        configureWindowForTransparency();
        setContentView(createFlutterView());
        configureStatusBarForFullscreenFlutterExperience();
    }

    public void onDestroy() {
        super.onDestroy();
        if (stillAttachedForEvent("onDestroy")) {
            this.delegate.onDestroyView();
            this.delegate.onDetach();
        }
        release();
        this.lifecycle.mo145135c(C39623j.C39625b.ON_DESTROY);
    }

    public void onFlutterSurfaceViewCreated(FlutterSurfaceView flutterSurfaceView) {
    }

    public void onFlutterTextureViewCreated(FlutterTextureView flutterTextureView) {
    }

    public void onFlutterUiDisplayed() {
        if (Build.VERSION.SDK_INT >= 29) {
            reportFullyDrawn();
        }
    }

    public void onFlutterUiNoLongerDisplayed() {
    }

    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if (stillAttachedForEvent("onNewIntent")) {
            this.delegate.onNewIntent(intent);
        }
    }

    public void onPause() {
        super.onPause();
        if (stillAttachedForEvent("onPause")) {
            this.delegate.onPause();
        }
        this.lifecycle.mo145135c(C39623j.C39625b.ON_PAUSE);
    }

    public void onPostResume() {
        super.onPostResume();
        if (stillAttachedForEvent("onPostResume")) {
            this.delegate.onPostResume();
        }
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (stillAttachedForEvent("onRequestPermissionsResult")) {
            this.delegate.onRequestPermissionsResult(i, strArr, iArr);
        }
    }

    public void onResume() {
        super.onResume();
        this.lifecycle.mo145135c(C39623j.C39625b.ON_RESUME);
        if (stillAttachedForEvent("onResume")) {
            this.delegate.onResume();
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (stillAttachedForEvent("onSaveInstanceState")) {
            this.delegate.onSaveInstanceState(bundle);
        }
    }

    public void onStart() {
        super.onStart();
        this.lifecycle.mo145135c(C39623j.C39625b.ON_START);
        if (stillAttachedForEvent("onStart")) {
            this.delegate.onStart();
        }
    }

    public void onStop() {
        super.onStop();
        if (stillAttachedForEvent("onStop")) {
            this.delegate.onStop();
        }
        this.lifecycle.mo145135c(C39623j.C39625b.ON_STOP);
    }

    public void onTrimMemory(int i) {
        super.onTrimMemory(i);
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
        return null;
    }

    public PlatformPlugin providePlatformPlugin(Activity activity, FlutterEngine flutterEngine) {
        return new PlatformPlugin(getActivity(), flutterEngine.getPlatformChannel(), this);
    }

    public SplashScreen provideSplashScreen() {
        Drawable splashScreenFromManifest = getSplashScreenFromManifest();
        if (splashScreenFromManifest != null) {
            return new DrawableSplashScreen(splashScreenFromManifest);
        }
        return null;
    }

    public void setDelegate(FlutterActivityAndFragmentDelegate flutterActivityAndFragmentDelegate) {
        this.delegate = flutterActivityAndFragmentDelegate;
    }

    public boolean shouldAttachEngineToActivity() {
        return true;
    }

    public boolean shouldDestroyEngineWithHost() {
        boolean booleanExtra = getIntent().getBooleanExtra("destroy_engine_with_activity", false);
        return (getCachedEngineId() != null || this.delegate.isFlutterEngineFromHost()) ? booleanExtra : getIntent().getBooleanExtra("destroy_engine_with_activity", true);
    }

    public boolean shouldHandleDeeplinking() {
        try {
            Bundle metaData = getMetaData();
            if (metaData != null) {
                return metaData.getBoolean(FlutterActivityLaunchConfigs.HANDLE_DEEPLINKING_META_DATA_KEY);
            }
            return false;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    public boolean shouldRestoreAndSaveState() {
        return getIntent().hasExtra("enable_state_restoration") ? getIntent().getBooleanExtra("enable_state_restoration", false) : getCachedEngineId() == null;
    }

    public void switchSurface(boolean z) {
        FlutterActivityAndFragmentDelegate flutterActivityAndFragmentDelegate = this.delegate;
        if (flutterActivityAndFragmentDelegate != null) {
            flutterActivityAndFragmentDelegate.switchSurface(z);
        }
    }

    public void updateSystemUiOverlays() {
        FlutterActivityAndFragmentDelegate flutterActivityAndFragmentDelegate = this.delegate;
        if (flutterActivityAndFragmentDelegate != null) {
            flutterActivityAndFragmentDelegate.updateSystemUiOverlays();
        }
    }
}
