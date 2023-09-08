package com.tencent.wxa.p1187ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.C103568x;
import androidx.appcompat.widget.Toolbar;
import androidx.lifecycle.C103766u;
import androidx.lifecycle.C39623j;
import com.tencent.wxa.p1187ui.C116506a;
import java.util.Map;
import p172io.flutter.embedding.android.FlutterActivityLaunchConfigs;
import p172io.flutter.embedding.android.RenderMode;
import p172io.flutter.embedding.android.TransparencyMode;
import p172io.flutter.embedding.engine.FlutterEngine;
import p172io.flutter.plugin.platform.PlatformPlugin;
import p172io.flutter.view.FlutterMain;
import vw3.C118708b;
import ww3.C118789a;
import xw3.C118908a;

/* renamed from: com.tencent.wxa.ui.WxaFlutterActivity */
public class WxaFlutterActivity extends AppCompatActivity implements C116506a.C116510d, C118708b {

    /* renamed from: d */
    public Toolbar f349440d;

    /* renamed from: e */
    public String f349441e;

    /* renamed from: f */
    public C116506a f349442f;

    /* renamed from: g */
    public C103766u f349443g = new C103766u(this);

    static {
        FlutterActivityLaunchConfigs.BackgroundMode.opaque.name();
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
        if (TextUtils.isEmpty(this.f349441e)) {
            this.f349441e = String.format("%d-%d", new Object[]{Long.valueOf(System.currentTimeMillis()), Integer.valueOf(hashCode())});
        }
        return this.f349441e;
    }

    public String getFlutterViewName() {
        return getIntent().hasExtra("name") ? getIntent().getStringExtra("name") : "";
    }

    public Map getFlutterViewParams() {
        if (getIntent().hasExtra("params") && (getIntent().getSerializableExtra("params") instanceof C118908a)) {
            ((C118908a) getIntent().getSerializableExtra("params")).getClass();
        }
        return null;
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

    public C39623j getLifecycle() {
        return this.f349443g;
    }

    public RenderMode getRenderMode() {
        return (getIntent().hasExtra("background_mode") ? FlutterActivityLaunchConfigs.BackgroundMode.valueOf(getIntent().getStringExtra("background_mode")) : FlutterActivityLaunchConfigs.BackgroundMode.opaque) == FlutterActivityLaunchConfigs.BackgroundMode.opaque ? RenderMode.surface : RenderMode.texture;
    }

    public TransparencyMode getTransparencyMode() {
        return (getIntent().hasExtra("background_mode") ? FlutterActivityLaunchConfigs.BackgroundMode.valueOf(getIntent().getStringExtra("background_mode")) : FlutterActivityLaunchConfigs.BackgroundMode.opaque) == FlutterActivityLaunchConfigs.BackgroundMode.opaque ? TransparencyMode.opaque : TransparencyMode.transparent;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        this.f349442f.mo180439c(i, i2, intent);
    }

    public void onBackPressed() {
        this.f349442f.mo180441e(true);
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
                C118789a.m167470a("FlutterActivity", "Using the launch theme as normal theme.", new Object[0]);
            }
        } catch (PackageManager.NameNotFoundException unused) {
            C118789a.m167471b("FlutterActivity", "Could not read meta-data for FlutterActivity. Using the launch theme as normal theme.", new Object[0]);
        }
        super.onCreate(bundle);
        this.f349443g.mo145135c(C39623j.C39625b.ON_CREATE);
        C116506a aVar = new C116506a(this);
        this.f349442f = aVar;
        aVar.mo180440d(this);
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(1);
        Toolbar toolbar = new Toolbar(this, (AttributeSet) null);
        toolbar.setLayoutParams(new Toolbar.LayoutParams(-1, -2));
        if (toolbar.f305675z == null) {
            toolbar.f305675z = new C103568x();
        }
        C103568x xVar = toolbar.f305675z;
        xVar.f305863h = false;
        xVar.f305860e = 0;
        xVar.f305856a = 0;
        xVar.f305861f = 0;
        xVar.f305857b = 0;
        toolbar.setVisibility(8);
        this.f349440d = toolbar;
        linearLayout.addView(toolbar);
        setSupportActionBar(this.f349440d);
        linearLayout.addView(this.f349442f.mo180442f((LayoutInflater) null, (ViewGroup) null, (Bundle) null), new LinearLayout.LayoutParams(-1, -1));
        setContentView((View) linearLayout);
    }

    public void onDestroy() {
        super.onDestroy();
        this.f349442f.mo180443g();
        this.f349442f.mo180444h();
        this.f349443g.mo145135c(C39623j.C39625b.ON_DESTROY);
    }

    public void onFlutterUiDisplayed() {
    }

    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        this.f349442f.mo180445i(intent);
    }

    public void onPause() {
        super.onPause();
        this.f349442f.mo180446j();
        this.f349443g.mo145135c(C39623j.C39625b.ON_PAUSE);
    }

    public void onPostResume() {
        super.onPostResume();
        this.f349442f.mo180447k();
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.f349442f.mo180448l(i, strArr, iArr);
    }

    public void onResume() {
        super.onResume();
        this.f349443g.mo145135c(C39623j.C39625b.ON_RESUME);
        this.f349442f.mo180449m();
    }

    public void onStart() {
        super.onStart();
        this.f349443g.mo145135c(C39623j.C39625b.ON_START);
        this.f349442f.mo180450n();
    }

    public void onStop() {
        super.onStop();
        this.f349442f.mo180451o();
        this.f349443g.mo145135c(C39623j.C39625b.ON_STOP);
    }

    public void onTrimMemory(int i) {
        this.f349442f.mo180452p(i);
    }

    public void onUserLeaveHint() {
        this.f349442f.mo180453q();
    }

    public PlatformPlugin providePlatformPlugin(Activity activity, FlutterEngine flutterEngine) {
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
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.wxa.p1187ui.WxaFlutterActivity.provideSplashScreen():io.flutter.embedding.android.SplashScreen");
    }

    public void setIsPopGestureEnabled(boolean z) {
        C118789a.m167472c("WxaRouter.WxaFlutterActivity", "setIsPopGestureEnabled value:%b", Boolean.valueOf(z));
    }

    public boolean shouldAttachEngineToActivity() {
        return true;
    }
}
