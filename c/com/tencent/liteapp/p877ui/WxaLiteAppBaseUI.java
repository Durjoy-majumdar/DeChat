package com.tencent.liteapp.p877ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import androidx.lifecycle.C103766u;
import androidx.lifecycle.C39623j;
import com.tencent.liteapp.storage.WxaLiteAppInfo;
import com.tencent.p014mm.ext.p313ui.SwipeBackActivity;
import com.tencent.p014mm.plugin.lite.LiteAppCenter;
import com.tencent.wxa.p1187ui.C116506a;
import java.util.Map;
import p172io.flutter.Log;
import p172io.flutter.embedding.android.FlutterActivityLaunchConfigs;
import p172io.flutter.embedding.android.RenderMode;
import p172io.flutter.embedding.android.TransparencyMode;
import p172io.flutter.embedding.engine.FlutterEngine;
import p172io.flutter.plugin.platform.PlatformPlugin;
import p172io.flutter.view.FlutterMain;
import tw3.C118552d;
import vw3.C118708b;
import xw3.C118908a;

/* renamed from: com.tencent.liteapp.ui.WxaLiteAppBaseUI */
public class WxaLiteAppBaseUI extends SwipeBackActivity implements C116506a.C116510d, C118708b {

    /* renamed from: f */
    public String f339313f;

    /* renamed from: g */
    public C116506a f339314g;

    /* renamed from: h */
    public WxaLiteAppInfo f339315h;

    /* renamed from: i */
    public boolean f339316i = false;

    /* renamed from: j */
    public boolean f339317j = false;

    /* renamed from: n */
    public boolean f339318n = false;

    /* renamed from: o */
    public View f339319o;

    /* renamed from: p */
    public LiteAppCenter.PageInfo f339320p;

    /* renamed from: q */
    public ProgressBar f339321q;

    /* renamed from: r */
    public int f339322r;

    /* renamed from: com.tencent.liteapp.ui.WxaLiteAppBaseUI$a */
    public class C113401a implements Runnable {
        public C113401a() {
        }

        public void run() {
            WxaLiteAppBaseUI wxaLiteAppBaseUI = WxaLiteAppBaseUI.this;
            if (!wxaLiteAppBaseUI.f339317j) {
                wxaLiteAppBaseUI.f339321q.setVisibility(0);
            }
        }
    }

    static {
        FlutterActivityLaunchConfigs.BackgroundMode.opaque.name();
    }

    public WxaLiteAppBaseUI() {
        LiteAppCenter.initLib();
    }

    /* renamed from: G7 */
    public View mo169825G7() {
        FrameLayout frameLayout = new FrameLayout(this);
        frameLayout.addView(this.f339314g.mo180442f((LayoutInflater) null, (ViewGroup) null, (Bundle) null), new FrameLayout.LayoutParams(-1, -1));
        this.f339321q = new ProgressBar(this);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(32, 32);
        layoutParams.gravity = 17;
        frameLayout.addView(this.f339321q, layoutParams);
        this.f339321q.setIndeterminate(true);
        this.f339321q.setLayoutParams(new FrameLayout.LayoutParams(-1, -2, 17));
        this.f339321q.setVisibility(4);
        new Handler(getMainLooper()).postDelayed(new C113401a(), 200);
        return frameLayout;
    }

    /* renamed from: H7 */
    public void mo169826H7() {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        DisplayMetrics displayMetrics2 = LiteAppCenter.mDisplayMetrics;
        if (displayMetrics2 != null) {
            displayMetrics.setTo(displayMetrics2);
        }
    }

    public void cleanUpFlutterEngine(FlutterEngine flutterEngine) {
    }

    public void configureFlutterEngine(FlutterEngine flutterEngine) {
    }

    public Activity getActivity() {
        return this;
    }

    public String getAppBundlePath() {
        String dataString;
        return (!((getApplicationInfo().flags & 2) != 0) || !"android.intent.action.RUN".equals(getIntent().getAction()) || (dataString = getIntent().getDataString()) == null) ? FlutterMain.findAppBundlePath() : dataString;
    }

    public String getCachedEngineId() {
        return getIntent().getStringExtra("cached_engine_id");
    }

    public Context getContext() {
        return this;
    }

    public String getDartEntrypointFunctionName() {
        if (getIntent().hasExtra("dart_entrypoint")) {
            return getIntent().getStringExtra("dart_entrypoint");
        }
        try {
            Bundle bundle = getPackageManager().getActivityInfo(getComponentName(), 128).metaData;
            String string = bundle != null ? bundle.getString(FlutterActivityLaunchConfigs.DART_ENTRYPOINT_META_DATA_KEY) : null;
            return string != null ? string : FlutterActivityLaunchConfigs.DEFAULT_DART_ENTRYPOINT;
        } catch (PackageManager.NameNotFoundException unused) {
            return FlutterActivityLaunchConfigs.DEFAULT_DART_ENTRYPOINT;
        }
    }

    public C118708b getFlutterActivity() {
        return this;
    }

    public String getFlutterViewId() {
        if (getIntent().hasExtra("activityId") && !TextUtils.isEmpty(getIntent().getStringExtra("activityId"))) {
            return getIntent().getStringExtra("activityId");
        }
        if (TextUtils.isEmpty(this.f339313f)) {
            this.f339313f = String.format("%d-%d", new Object[]{Long.valueOf(System.currentTimeMillis()), Integer.valueOf(hashCode())});
        }
        return this.f339313f;
    }

    public String getFlutterViewName() {
        return getIntent().hasExtra("name") ? getIntent().getStringExtra("name") : "";
    }

    public Map getFlutterViewParams() {
        if (!getIntent().hasExtra("params") || !(getIntent().getSerializableExtra("params") instanceof C118908a)) {
            return null;
        }
        ((C118908a) getIntent().getSerializableExtra("params")).getClass();
        if (!this.f339318n) {
            return null;
        }
        throw null;
    }

    public String getInitialRoute() {
        if (getIntent().hasExtra("initial_route")) {
            return getIntent().getStringExtra("initial_route");
        }
        try {
            Bundle bundle = getPackageManager().getActivityInfo(getComponentName(), 128).metaData;
            String string = bundle != null ? bundle.getString(FlutterActivityLaunchConfigs.INITIAL_ROUTE_META_DATA_KEY) : null;
            return string != null ? string : "/";
        } catch (PackageManager.NameNotFoundException unused) {
            return "/";
        }
    }

    public RenderMode getRenderMode() {
        return (getIntent().hasExtra("background_mode") ? FlutterActivityLaunchConfigs.BackgroundMode.valueOf(getIntent().getStringExtra("background_mode")) : FlutterActivityLaunchConfigs.BackgroundMode.opaque) == FlutterActivityLaunchConfigs.BackgroundMode.opaque ? RenderMode.surface : RenderMode.texture;
    }

    public TransparencyMode getTransparencyMode() {
        if (this.f339318n) {
            return TransparencyMode.transparent;
        }
        return (getIntent().hasExtra("background_mode") ? FlutterActivityLaunchConfigs.BackgroundMode.valueOf(getIntent().getStringExtra("background_mode")) : FlutterActivityLaunchConfigs.BackgroundMode.opaque) == FlutterActivityLaunchConfigs.BackgroundMode.opaque ? TransparencyMode.opaque : TransparencyMode.transparent;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        this.f339314g.mo180439c(i, i2, intent);
    }

    public void onBackPressed() {
        this.f339314g.mo180441e(true);
    }

    public void onCreate(Bundle bundle) {
        try {
            Bundle bundle2 = getPackageManager().getActivityInfo(getComponentName(), 128).metaData;
            if (bundle2 != null) {
                int i = bundle2.getInt(FlutterActivityLaunchConfigs.NORMAL_THEME_META_DATA_KEY, -1);
                if (i != -1) {
                    setTheme(i);
                }
            } else {
                Log.m165284d("FlutterActivity", "Using the launch theme as normal theme.");
            }
        } catch (PackageManager.NameNotFoundException unused) {
            Log.m165286e("FlutterActivity", "Could not read meta-data for FlutterActivity. Using the launch theme as normal theme.");
        }
        super.onCreate(bundle);
        mo169826H7();
        if (!(C118552d.m167207g().f354797a != null)) {
            finish();
            return;
        }
        ((C103766u) getLifecycle()).mo145135c(C39623j.C39625b.ON_CREATE);
        C116506a aVar = new C116506a(this);
        this.f339314g = aVar;
        this.f339322r = aVar.f349458a;
        aVar.mo180440d(this);
        View G7 = mo169825G7();
        this.f339319o = G7;
        setContentView(G7);
    }

    public void onDestroy() {
        super.onDestroy();
        C116506a aVar = this.f339314g;
        if (aVar != null) {
            aVar.mo180443g();
            this.f339314g.mo180444h();
            ((C103766u) getLifecycle()).mo145135c(C39623j.C39625b.ON_DESTROY);
        }
    }

    public void onFlutterUiDisplayed() {
    }

    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        this.f339314g.mo180445i(intent);
    }

    public void onPause() {
        super.onPause();
        this.f339314g.mo180446j();
        ((C103766u) getLifecycle()).mo145135c(C39623j.C39625b.ON_PAUSE);
    }

    public void onPostResume() {
        super.onPostResume();
        this.f339314g.mo180447k();
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.f339314g.mo180448l(i, strArr, iArr);
    }

    public void onResume() {
        super.onResume();
        ((C103766u) getLifecycle()).mo145135c(C39623j.C39625b.ON_RESUME);
        this.f339314g.mo180449m();
    }

    public void onStart() {
        super.onStart();
        ((C103766u) getLifecycle()).mo145135c(C39623j.C39625b.ON_START);
        this.f339314g.mo180450n();
    }

    public void onStop() {
        super.onStop();
        this.f339314g.mo180451o();
        ((C103766u) getLifecycle()).mo145135c(C39623j.C39625b.ON_STOP);
    }

    public void onTrimMemory(int i) {
        this.f339314g.mo180452p(i);
    }

    public void onUserLeaveHint() {
        this.f339314g.mo180453q();
    }

    public PlatformPlugin providePlatformPlugin(Activity activity, FlutterEngine flutterEngine) {
        if (activity != null) {
            return new PlatformPlugin(this, flutterEngine.getPlatformChannel());
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p172io.flutter.embedding.android.SplashScreen provideSplashScreen() {
        /*
            r4 = this;
            r0 = 0
            android.content.pm.PackageManager r1 = r4.getPackageManager()     // Catch:{ NameNotFoundException -> 0x004b }
            android.content.ComponentName r2 = r4.getComponentName()     // Catch:{ NameNotFoundException -> 0x004b }
            r3 = 128(0x80, float:1.794E-43)
            android.content.pm.ActivityInfo r1 = r1.getActivityInfo(r2, r3)     // Catch:{ NameNotFoundException -> 0x004b }
            android.os.Bundle r1 = r1.metaData     // Catch:{ NameNotFoundException -> 0x004b }
            if (r1 == 0) goto L_0x001e
            java.lang.String r2 = "io.flutter.embedding.android.SplashScreenDrawable"
            int r1 = r1.getInt(r2)     // Catch:{ NameNotFoundException -> 0x004b }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ NameNotFoundException -> 0x004b }
            goto L_0x001f
        L_0x001e:
            r1 = r0
        L_0x001f:
            if (r1 == 0) goto L_0x004b
            int r2 = r1.intValue()     // Catch:{ NameNotFoundException -> 0x004b }
            if (r2 == 0) goto L_0x004b
            int r2 = android.os.Build.VERSION.SDK_INT     // Catch:{ NameNotFoundException -> 0x004b }
            r3 = 21
            if (r2 <= r3) goto L_0x003e
            android.content.res.Resources r2 = r4.getResources()     // Catch:{ NameNotFoundException -> 0x004b }
            int r1 = r1.intValue()     // Catch:{ NameNotFoundException -> 0x004b }
            android.content.res.Resources$Theme r3 = r4.getTheme()     // Catch:{ NameNotFoundException -> 0x004b }
            android.graphics.drawable.Drawable r1 = r2.getDrawable(r1, r3)     // Catch:{ NameNotFoundException -> 0x004b }
            goto L_0x004c
        L_0x003e:
            android.content.res.Resources r2 = r4.getResources()     // Catch:{ NameNotFoundException -> 0x004b }
            int r1 = r1.intValue()     // Catch:{ NameNotFoundException -> 0x004b }
            android.graphics.drawable.Drawable r1 = r2.getDrawable(r1)     // Catch:{ NameNotFoundException -> 0x004b }
            goto L_0x004c
        L_0x004b:
            r1 = r0
        L_0x004c:
            if (r1 == 0) goto L_0x0053
            io.flutter.embedding.android.DrawableSplashScreen r0 = new io.flutter.embedding.android.DrawableSplashScreen
            r0.<init>(r1)
        L_0x0053:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.liteapp.p877ui.WxaLiteAppBaseUI.provideSplashScreen():io.flutter.embedding.android.SplashScreen");
    }

    public void setIsPopGestureEnabled(boolean z) {
        this.f339316i = !z;
        this.f343911d.setEnableGesture(!z);
    }

    public boolean shouldAttachEngineToActivity() {
        return true;
    }
}
