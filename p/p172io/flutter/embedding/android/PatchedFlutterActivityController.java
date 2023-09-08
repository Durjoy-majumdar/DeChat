package p172io.flutter.embedding.android;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.lifecycle.C0125s;
import androidx.lifecycle.C103766u;
import androidx.lifecycle.C39623j;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.voip.p475ui.VideoActivity;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.HashSet;
import n33.C109681a;
import p172io.flutter.embedding.android.FlutterActivityAndFragmentDelegate;
import p172io.flutter.embedding.android.FlutterActivityLaunchConfigs;
import p172io.flutter.embedding.engine.FlutterEngine;
import p172io.flutter.embedding.engine.FlutterShellArgs;
import p172io.flutter.embedding.engine.plugins.util.GeneratedPluginRegister;
import p172io.flutter.plugin.platform.PlatformPlugin;
import p172io.flutter.util.ViewUtils;

/* renamed from: io.flutter.embedding.android.PatchedFlutterActivityController */
public abstract class PatchedFlutterActivityController implements FlutterActivityAndFragmentDelegate.Host, C0125s, C109681a {
    public static final int FLUTTER_VIEW_ID = ViewUtils.generateViewId(61938);
    private static final String TAG = "PatchedFlutterActivityController";
    public FlutterActivityAndFragmentDelegate delegate;
    private C103766u lifecycle;
    public VideoActivity vActivity;

    /* renamed from: io.flutter.embedding.android.PatchedFlutterActivityController$CachedEngineIntentBuilder */
    public static class CachedEngineIntentBuilder {
        private final Class<? extends Activity> activityClass;
        private String backgroundMode = FlutterActivityLaunchConfigs.DEFAULT_BACKGROUND_MODE;
        private final String cachedEngineId;
        private boolean destroyEngineWithActivity = false;

        public CachedEngineIntentBuilder(Class<? extends Activity> cls, String str) {
            this.activityClass = cls;
            this.cachedEngineId = str;
        }

        public CachedEngineIntentBuilder backgroundMode(FlutterActivityLaunchConfigs.BackgroundMode backgroundMode2) {
            this.backgroundMode = backgroundMode2.name();
            return this;
        }

        public Intent build(Context context) {
            return new Intent(context, this.activityClass).putExtra("cached_engine_id", this.cachedEngineId).putExtra("destroy_engine_with_activity", this.destroyEngineWithActivity).putExtra("background_mode", this.backgroundMode);
        }

        public CachedEngineIntentBuilder destroyEngineWithActivity(boolean z) {
            this.destroyEngineWithActivity = z;
            return this;
        }
    }

    /* renamed from: io.flutter.embedding.android.PatchedFlutterActivityController$NewEngineIntentBuilder */
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

    public PatchedFlutterActivityController(VideoActivity videoActivity) {
        this();
        this.vActivity = videoActivity;
    }

    private void configureStatusBarForFullscreenFlutterExperience() {
        Window window = this.vActivity.getWindow();
        window.addFlags(Integer.MIN_VALUE);
        window.setStatusBarColor(1073741824);
        window.getDecorView().setSystemUiVisibility(1280);
    }

    private void configureWindowForTransparency() {
        if (getBackgroundMode() == FlutterActivityLaunchConfigs.BackgroundMode.transparent) {
            this.vActivity.getWindow().setBackgroundDrawable(new ColorDrawable(0));
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
            if (i != 0) {
                return Build.VERSION.SDK_INT > 21 ? this.vActivity.getResources().getDrawable(i, this.vActivity.getTheme()) : this.vActivity.getResources().getDrawable(i);
            }
            return null;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    private boolean isDebuggable() {
        return (this.vActivity.getApplicationInfo().flags & 2) != 0;
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
                    this.vActivity.setTheme(i);
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

    public abstract /* synthetic */ void dealContentView(View view);

    public void detachFromFlutterEngine() {
        Log.m105924i(TAG, "FlutterActivity " + this + " connection to the engine " + getFlutterEngine() + " evicted by another attaching activity");
        release();
    }

    public abstract /* synthetic */ void finish();

    public void fixResources(Resources resources) {
        setupConfiguration(resources.getConfiguration());
    }

    public Activity getActivity() {
        return this.vActivity;
    }

    public String getAppBundlePath() {
        String dataString;
        if (!isDebuggable() || !"android.intent.action.RUN".equals(this.vActivity.getIntent().getAction()) || (dataString = this.vActivity.getIntent().getDataString()) == null) {
            return null;
        }
        return dataString;
    }

    public FlutterActivityLaunchConfigs.BackgroundMode getBackgroundMode() {
        return this.vActivity.getIntent().hasExtra("background_mode") ? FlutterActivityLaunchConfigs.BackgroundMode.valueOf(this.vActivity.getIntent().getStringExtra("background_mode")) : FlutterActivityLaunchConfigs.BackgroundMode.opaque;
    }

    public String getCachedEngineId() {
        return this.vActivity.getIntent().getStringExtra("cached_engine_id");
    }

    public Context getContext() {
        return this.vActivity;
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
        return FlutterShellArgs.fromIntent(this.vActivity.getIntent());
    }

    public abstract /* synthetic */ int getForceOrientation();

    public String getInitialRoute() {
        if (this.vActivity.getIntent().hasExtra("route")) {
            return this.vActivity.getIntent().getStringExtra("route");
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

    public abstract /* synthetic */ int getLayoutId();

    public C39623j getLifecycle() {
        return this.lifecycle;
    }

    public Bundle getMetaData() {
        return this.vActivity.getPackageManager().getActivityInfo(this.vActivity.getComponentName(), 128).metaData;
    }

    public RenderMode getRenderMode() {
        return getBackgroundMode() == FlutterActivityLaunchConfigs.BackgroundMode.opaque ? RenderMode.surface : RenderMode.texture;
    }

    public TransparencyMode getTransparencyMode() {
        return getBackgroundMode() == FlutterActivityLaunchConfigs.BackgroundMode.opaque ? TransparencyMode.opaque : TransparencyMode.transparent;
    }

    public abstract /* synthetic */ void importUIComponents(HashSet<Class<? extends UIComponent>> hashSet);

    public /* synthetic */ boolean isEnableSwitchSurface() {
        return C117220a.m165311a(this);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (stillAttachedForEvent("onActivityResult")) {
            this.delegate.onActivityResult(i, i2, intent);
        }
    }

    public boolean onBackPressed() {
        if (!stillAttachedForEvent("onBackPressed")) {
            return true;
        }
        this.delegate.onBackPressed();
        return true;
    }

    public abstract /* synthetic */ void onConfigurationChanged(Configuration configuration);

    public void onCreate(Bundle bundle) {
        switchLaunchThemeForNormalTheme();
        this.vActivity.setTheme(C0966R.style.f8620p1);
        this.vActivity.mo152913J7(bundle);
        setupConfiguration(this.vActivity.getResources().getConfiguration());
        FlutterActivityAndFragmentDelegate flutterActivityAndFragmentDelegate = new FlutterActivityAndFragmentDelegate(this);
        this.delegate = flutterActivityAndFragmentDelegate;
        flutterActivityAndFragmentDelegate.onAttach(this.vActivity);
        this.delegate.onRestoreInstanceState(bundle);
        this.lifecycle.mo145135c(C39623j.C39625b.ON_CREATE);
        configureWindowForTransparency();
        this.vActivity.setContentView(createFlutterView());
        configureStatusBarForFullscreenFlutterExperience();
    }

    public void onDestroy() {
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
            this.vActivity.reportFullyDrawn();
        }
    }

    public void onFlutterUiNoLongerDisplayed() {
    }

    public abstract /* synthetic */ boolean onKeyDown(int i, KeyEvent keyEvent);

    public void onNewIntent(Intent intent) {
        if (stillAttachedForEvent("onNewIntent")) {
            this.delegate.onNewIntent(intent);
        }
    }

    public void onPause() {
        if (stillAttachedForEvent("onPause")) {
            this.delegate.onPause();
        }
        this.lifecycle.mo145135c(C39623j.C39625b.ON_PAUSE);
    }

    public void onPostResume() {
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
        this.lifecycle.mo145135c(C39623j.C39625b.ON_RESUME);
        if (stillAttachedForEvent("onResume")) {
            this.delegate.onResume();
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        if (stillAttachedForEvent("onSaveInstanceState")) {
            this.delegate.onSaveInstanceState(bundle);
        }
    }

    public void onStart() {
        this.lifecycle.mo145135c(C39623j.C39625b.ON_START);
        if (stillAttachedForEvent("onStart")) {
            this.delegate.onStart();
        }
    }

    public void onStop() {
        if (stillAttachedForEvent("onStop")) {
            this.delegate.onStop();
        }
        this.lifecycle.mo145135c(C39623j.C39625b.ON_STOP);
    }

    public /* bridge */ /* synthetic */ void onSwipeBackFinish() {
    }

    public void onTrimMemory(int i) {
        if (stillAttachedForEvent("onTrimMemory")) {
            this.delegate.onTrimMemory(i);
        }
    }

    public boolean onUserLeaveHint() {
        if (!stillAttachedForEvent("onUserLeaveHint")) {
            return true;
        }
        this.delegate.onUserLeaveHint();
        return true;
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

    public abstract void setupConfiguration(Configuration configuration);

    public boolean shouldAttachEngineToActivity() {
        return true;
    }

    public boolean shouldDestroyEngineWithHost() {
        boolean booleanExtra = this.vActivity.getIntent().getBooleanExtra("destroy_engine_with_activity", false);
        return (getCachedEngineId() != null || this.delegate.isFlutterEngineFromHost()) ? booleanExtra : this.vActivity.getIntent().getBooleanExtra("destroy_engine_with_activity", true);
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
        return this.vActivity.getIntent().hasExtra("enable_state_restoration") ? this.vActivity.getIntent().getBooleanExtra("enable_state_restoration", false) : getCachedEngineId() == null;
    }

    public void updateSystemUiOverlays() {
        if (stillAttachedForEvent("updateSystemUiOverlays")) {
            this.delegate.updateSystemUiOverlays();
        }
    }

    private PatchedFlutterActivityController() {
        this.lifecycle = new C103766u(this);
    }
}
