package p172io.flutter.embedding.android;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.lifecycle.C0125s;
import androidx.lifecycle.C103766u;
import androidx.lifecycle.C39623j;
import com.tencent.p014mm.hellhoundlib.activities.HellActivity;
import com.tencent.p014mm.sdk.platformtools.Log;
import p172io.flutter.embedding.android.FlutterActivityAndFragmentDelegate;
import p172io.flutter.embedding.android.FlutterActivityLaunchConfigs;
import p172io.flutter.embedding.engine.FlutterEngine;
import p172io.flutter.embedding.engine.FlutterShellArgs;
import p172io.flutter.embedding.engine.plugins.util.GeneratedPluginRegister;
import p172io.flutter.plugin.platform.PlatformPlugin;
import p172io.flutter.util.ViewUtils;
import p206nj.C11171e;

/* renamed from: io.flutter.embedding.android.PatchedFlutterActivity */
public class PatchedFlutterActivity extends HellActivity implements FlutterActivityAndFragmentDelegate.Host, C0125s {
    public static final String EXTRA_BACKGROUND_MODE = "background_mode";
    public static final String EXTRA_CACHED_ENGINE_ID = "cached_engine_id";
    public static final String EXTRA_DESTROY_ENGINE_WITH_ACTIVITY = "destroy_engine_with_activity";
    public static final String EXTRA_DISABLE_AUTO_FILL = "DisableAutoFill";
    public static final String EXTRA_ENGINE_CREATOR_ID = "engine_creator_id";
    public static final String EXTRA_ENGINE_GROUP_ID = "engine_group_id";
    public static final String EXTRA_LIGHT_NAVIGATION_BARS = "light_navigation_bars";
    public static final String EXTRA_LIGHT_STATUS_BARS = "light_status_bars";
    public static final String EXTRA_NAVIGATION_BAR_COLOR = "navigation_bar_color";
    public static final String EXTRA_PAGE_TYPE = "page_type";
    public static final String EXTRA_STATUS_BAR_COLOR = "status_bar_color";
    public static final String EXTRA_SUPPORT_SWIPE_BACK = "support_swipe_back";
    public static final int FLUTTER_VIEW_ID = ViewUtils.generateViewId(61938);
    public static final int PAGE_TYPE_ACTIVITY = 0;
    public static final int PAGE_TYPE_DIALOG = 1;
    private static final String TAG = "FlutterActivity";
    public FlutterActivityAndFragmentDelegate delegate;
    private C103766u lifecycle = new C103766u(this);

    /* renamed from: io.flutter.embedding.android.PatchedFlutterActivity$CachedEngineIntentBuilder */
    public static class CachedEngineIntentBuilder {
        private final Class<? extends Activity> activityClass;
        private String backgroundMode = FlutterActivityLaunchConfigs.DEFAULT_BACKGROUND_MODE;
        private final String cachedEngineId;
        private boolean destroyEngineWithActivity = false;
        private boolean disableAutofill = false;
        private String engineCreatorId;
        private String engineGroupId = "";
        private boolean hasSetLightNavigationBars = false;
        private boolean hasSetLightStatusBars = false;
        private boolean hasSetNavigationBarColor = false;
        private boolean hasSetStatuBarColor = false;
        private boolean hasSetSupportSwipeback = false;
        private boolean isLightNavigationBars = false;
        private boolean isLightStatusBars = false;
        private int navigationBarColor = -1;
        private int pageType = 0;
        private int statusBarColor = -1;
        private boolean supportSwipeBack = true;

        public CachedEngineIntentBuilder(Class<? extends Activity> cls, String str) {
            this.activityClass = cls;
            this.cachedEngineId = str;
        }

        public CachedEngineIntentBuilder backgroundMode(FlutterActivityLaunchConfigs.BackgroundMode backgroundMode2) {
            this.backgroundMode = backgroundMode2.name();
            return this;
        }

        public Intent build(Context context) {
            Intent putExtra = new Intent(context, this.activityClass).putExtra("cached_engine_id", this.cachedEngineId).putExtra("destroy_engine_with_activity", this.destroyEngineWithActivity).putExtra("background_mode", this.backgroundMode);
            if (this.disableAutofill) {
                putExtra.putExtra(PatchedFlutterActivity.EXTRA_DISABLE_AUTO_FILL, true);
            }
            if (this.hasSetLightStatusBars) {
                putExtra.putExtra(PatchedFlutterActivity.EXTRA_LIGHT_STATUS_BARS, this.isLightStatusBars);
            }
            if (this.hasSetLightNavigationBars) {
                putExtra.putExtra(PatchedFlutterActivity.EXTRA_LIGHT_NAVIGATION_BARS, this.isLightNavigationBars);
            }
            if (this.hasSetStatuBarColor) {
                putExtra.putExtra(PatchedFlutterActivity.EXTRA_STATUS_BAR_COLOR, this.statusBarColor);
            }
            if (this.hasSetNavigationBarColor) {
                putExtra.putExtra(PatchedFlutterActivity.EXTRA_NAVIGATION_BAR_COLOR, this.navigationBarColor);
            }
            if (this.hasSetSupportSwipeback) {
                putExtra.putExtra(PatchedFlutterActivity.EXTRA_SUPPORT_SWIPE_BACK, this.supportSwipeBack);
            }
            putExtra.putExtra(PatchedFlutterActivity.EXTRA_ENGINE_CREATOR_ID, this.engineCreatorId);
            putExtra.putExtra(PatchedFlutterActivity.EXTRA_PAGE_TYPE, this.pageType);
            putExtra.putExtra(PatchedFlutterActivity.EXTRA_ENGINE_GROUP_ID, this.engineGroupId);
            return putExtra;
        }

        public CachedEngineIntentBuilder destroyEngineWithActivity(boolean z) {
            this.destroyEngineWithActivity = z;
            return this;
        }

        public CachedEngineIntentBuilder disableAutofill() {
            this.disableAutofill = true;
            return this;
        }

        public CachedEngineIntentBuilder setAppearanceLightNavigationBars(boolean z) {
            this.hasSetLightNavigationBars = true;
            this.isLightNavigationBars = z;
            return this;
        }

        public CachedEngineIntentBuilder setAppearanceLightStatusBars(boolean z) {
            this.hasSetLightStatusBars = true;
            this.isLightStatusBars = z;
            return this;
        }

        public CachedEngineIntentBuilder setEngineCreatorId(String str) {
            this.engineCreatorId = str;
            return this;
        }

        public CachedEngineIntentBuilder setEngineGroupId(String str) {
            this.engineGroupId = str;
            return this;
        }

        public CachedEngineIntentBuilder setNavigationBarColor(int i) {
            this.hasSetNavigationBarColor = true;
            this.navigationBarColor = i;
            return this;
        }

        public CachedEngineIntentBuilder setPageType(int i) {
            this.pageType = i;
            return this;
        }

        public CachedEngineIntentBuilder setStatusBarColor(int i) {
            this.hasSetStatuBarColor = true;
            this.statusBarColor = i;
            return this;
        }

        public CachedEngineIntentBuilder setSupportSwipeBack(boolean z) {
            this.hasSetSupportSwipeback = true;
            this.supportSwipeBack = z;
            return this;
        }
    }

    /* renamed from: io.flutter.embedding.android.PatchedFlutterActivity$NewEngineIntentBuilder */
    public static class NewEngineIntentBuilder {
        private final Class<? extends FlutterActivity> activityClass;
        private String backgroundMode = FlutterActivityLaunchConfigs.DEFAULT_BACKGROUND_MODE;
        private String initialRoute = "/";

        public NewEngineIntentBuilder(Class<? extends FlutterActivity> cls) {
            this.activityClass = cls;
        }

        public NewEngineIntentBuilder backgroundMode(FlutterActivityLaunchConfigs.BackgroundMode backgroundMode2) {
            this.backgroundMode = backgroundMode2.name();
            return this;
        }

        public Intent build(Context context) {
            return new Intent(context, this.activityClass).putExtra("route", this.initialRoute).putExtra("background_mode", this.backgroundMode).putExtra("destroy_engine_with_activity", true);
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

    private void disableAutofill() {
        Window window;
        if (C11171e.m11046c(26) && (window = getWindow()) != null) {
            window.getDecorView().setImportantForAutofill(8);
        }
    }

    private Drawable getSplashScreenFromManifest() {
        try {
            Bundle metaData = getMetaData();
            int i = metaData != null ? metaData.getInt(FlutterActivityLaunchConfigs.SPLASH_SCREEN_META_DATA_KEY) : 0;
            if (i != 0) {
                return Build.VERSION.SDK_INT > 21 ? getResources().getDrawable(i, getTheme()) : getResources().getDrawable(i);
            }
            return null;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    private boolean isDebuggable() {
        return (getApplicationInfo().flags & 2) != 0;
    }

    private void release() {
        this.delegate.onDestroyView();
        this.delegate.onDetach();
        this.delegate.release();
        this.delegate = null;
    }

    private boolean stillAttachedForEvent(String str) {
        if (this.delegate != null) {
            return true;
        }
        Log.m105924i(TAG, "FlutterActivity " + hashCode() + " " + str + " called after release.");
        return false;
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
            Log.m105924i(TAG, "Using the launch theme as normal theme.");
        } catch (PackageManager.NameNotFoundException unused) {
            Log.m105920e(TAG, "Could not read meta-data for FlutterActivity. Using the launch theme as normal theme.");
        }
    }

    public static CachedEngineIntentBuilder withCachedEngine(String str) {
        return new CachedEngineIntentBuilder(PatchedFlutterActivity.class, str);
    }

    public static NewEngineIntentBuilder withNewEngine() {
        return new NewEngineIntentBuilder(FlutterActivity.class);
    }

    public void cleanUpFlutterEngine(FlutterEngine flutterEngine) {
    }

    public void configureFlutterEngine(FlutterEngine flutterEngine) {
        GeneratedPluginRegister.registerGeneratedPlugins(flutterEngine);
    }

    public void detachFromFlutterEngine() {
        Log.m105924i(TAG, "FlutterActivity " + this + " connection to the engine " + getFlutterEngine() + " evicted by another attaching activity");
        release();
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

    public /* synthetic */ boolean isEnableSwitchSurface() {
        return C117220a.m165311a(this);
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
        Intent intent = getIntent();
        if (intent.hasExtra(EXTRA_DISABLE_AUTO_FILL) && intent.getBooleanExtra(EXTRA_DISABLE_AUTO_FILL, false)) {
            disableAutofill();
        }
    }

    public void onDestroy() {
        super.onDestroy();
        if (stillAttachedForEvent("onDestroy")) {
            release();
        }
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

    public void updateSystemUiOverlays() {
        if (stillAttachedForEvent("updateSystemUiOverlays")) {
            this.delegate.updateSystemUiOverlays();
        }
    }
}
