package com.tencent.liteapp.p877ui;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.widget.FrameLayout;
import androidx.lifecycle.C0124r;
import androidx.lifecycle.C0125s;
import androidx.lifecycle.C103766u;
import androidx.lifecycle.C112974b0;
import androidx.lifecycle.C39623j;
import com.tencent.p014mm.plugin.lite.C56832d;
import com.tencent.p014mm.plugin.lite.LiteAppCenter;
import com.tencent.wxa.p1187ui.C116506a;
import gy3.C87412m;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p1005ma.C88718b;
import p1056vl.C90824b;
import p1198ka.C117396b;
import p1204oa.C117729b;
import p172io.flutter.embedding.android.FlutterActivityLaunchConfigs;
import p172io.flutter.embedding.android.RenderMode;
import p172io.flutter.embedding.android.SplashScreen;
import p172io.flutter.embedding.android.TransparencyMode;
import p172io.flutter.embedding.engine.FlutterEngine;
import p172io.flutter.embedding.engine.FlutterShellArgs;
import p172io.flutter.plugin.platform.PlatformPlugin;
import p172io.flutter.view.FlutterMain;
import p979ia.C117147b;
import vw3.C118708b;

/* renamed from: com.tencent.liteapp.ui.WxaLiteAppBaseView */
public class WxaLiteAppBaseView extends FrameLayout implements C116506a.C116510d, C0124r, C0125s, C118708b, LiteAppCenter.ILiteAppUICallback {

    /* renamed from: j */
    public static final /* synthetic */ int f339324j = 0;

    /* renamed from: d */
    public String f339325d;

    /* renamed from: e */
    public long f339326e = -1;

    /* renamed from: f */
    public LiteAppCenter.PageInfo f339327f;

    /* renamed from: g */
    public String f339328g;

    /* renamed from: h */
    public long f339329h = 0;

    /* renamed from: i */
    public C56832d f339330i = null;

    /* renamed from: com.tencent.liteapp.ui.WxaLiteAppBaseView$a */
    public class C113402a implements Runnable {
        public C113402a() {
        }

        public void run() {
            WxaLiteAppBaseView.this.getClass();
            throw null;
        }
    }

    /* renamed from: com.tencent.liteapp.ui.WxaLiteAppBaseView$b */
    public class C113403b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ boolean f339332d;

        public C113403b(boolean z) {
            this.f339332d = z;
        }

        public void run() {
            WxaLiteAppBaseView.this.setKeepScreenOn(this.f339332d);
        }
    }

    /* renamed from: com.tencent.liteapp.ui.WxaLiteAppBaseView$c */
    public class C113404c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ Method f339334d;

        /* renamed from: e */
        public final /* synthetic */ C117396b f339335e;

        /* renamed from: f */
        public final /* synthetic */ Object[] f339336f;

        public C113404c(WxaLiteAppBaseView wxaLiteAppBaseView, Method method, C117396b bVar, Object[] objArr) {
            this.f339334d = method;
            this.f339335e = bVar;
            this.f339336f = objArr;
        }

        public void run() {
            try {
                this.f339334d.invoke(this.f339335e, this.f339336f);
            } catch (IllegalAccessException | InvocationTargetException unused) {
            }
        }
    }

    static {
        FlutterActivityLaunchConfigs.BackgroundMode.opaque.name();
    }

    public WxaLiteAppBaseView(Context context) {
        super(context);
    }

    private Drawable getSplashScreenFromManifest() {
        try {
            Bundle bundle = getActivity().getPackageManager().getActivityInfo(getActivity().getComponentName(), 128).metaData;
            Integer valueOf = bundle != null ? Integer.valueOf(bundle.getInt(FlutterActivityLaunchConfigs.SPLASH_SCREEN_META_DATA_KEY)) : null;
            if (valueOf != null) {
                return Build.VERSION.SDK_INT > 21 ? getResources().getDrawable(valueOf.intValue(), getActivity().getTheme()) : getResources().getDrawable(valueOf.intValue());
            }
            return null;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: a */
    public final void mo169831a() {
        if (this.f339329h > 0) {
            Point b = C90824b.m113902b(getContext());
            Context context = C117147b.f350981b;
            if (context != null) {
                DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
                int measuredWidth = getMeasuredWidth();
                int measuredHeight = getMeasuredHeight();
                float f = displayMetrics.density;
                LiteAppCenter.setDisplayParams(this.f339329h, ((float) measuredWidth) / f, ((float) measuredHeight) / f, ((float) b.x) / f, ((float) b.y) / f, displayMetrics.densityDpi, f, (((float) 48) * f) / f, 0.0f, 0.0f);
                C88718b.m110681c("WxaLiteApp.WxaLiteAppBaseView", "updateLvCppDisplayParams SetDisplayParams appPtr=%d, w=%d h=%d screen=%d,%d densityDpi=%d density=%f", Long.valueOf(this.f339329h), Integer.valueOf(measuredWidth), Integer.valueOf(measuredHeight), Integer.valueOf(b.x), Integer.valueOf(b.y), Integer.valueOf(displayMetrics.densityDpi), Float.valueOf(displayMetrics.density));
                return;
            }
            C87412m.m108603p("appContext");
            throw null;
        }
    }

    public void callDynamicModule(Method method, C117396b bVar, Object[] objArr) {
        new Handler(Looper.getMainLooper()).post(new C113404c(this, method, bVar, objArr));
    }

    public void cleanUpFlutterEngine(FlutterEngine flutterEngine) {
    }

    public void closeWindow(Intent intent) {
    }

    public void configureFlutterEngine(FlutterEngine flutterEngine) {
    }

    public Activity getActivity() {
        for (Context context = getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
        }
        return null;
    }

    public String getActivityId() {
        if (TextUtils.isEmpty(this.f339325d)) {
            this.f339325d = String.format("%d-%d", new Object[]{Long.valueOf(System.currentTimeMillis()), Integer.valueOf(hashCode())});
        }
        return this.f339325d;
    }

    public String getAppBundlePath() {
        return FlutterMain.findAppBundlePath();
    }

    public FlutterActivityLaunchConfigs.BackgroundMode getBackgroundMode() {
        return FlutterActivityLaunchConfigs.BackgroundMode.opaque;
    }

    public String getCachedEngineId() {
        return null;
    }

    public String getDartEntrypointFunctionName() {
        return FlutterActivityLaunchConfigs.DEFAULT_DART_ENTRYPOINT;
    }

    public int getDataUuid() {
        return -1;
    }

    public Bundle getExtraData() {
        if (getActivity().getIntent().hasExtra("extraData")) {
            return getActivity().getIntent().getBundleExtra("extraData");
        }
        return null;
    }

    public C118708b getFlutterActivity() {
        return this;
    }

    public FlutterShellArgs getFlutterShellArgs() {
        return FlutterShellArgs.fromIntent(getActivity().getIntent());
    }

    public String getFlutterViewId() {
        C88718b.m110679a("WxaLiteApp.WxaLiteAppBaseView", "getFlutterViewId %s", Long.valueOf(this.f339326e));
        return String.valueOf(this.f339326e);
    }

    public String getFlutterViewName() {
        return "";
    }

    public Map getFlutterViewParams() {
        if (this.f339327f == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("activityId", Long.valueOf(this.f339327f.appUuid));
        hashMap.put("appId", this.f339328g);
        hashMap.put("appPtr", Long.valueOf(this.f339327f.appPtr));
        hashMap.put("pageViewId", Long.valueOf(this.f339327f.pageId));
        hashMap.put("basePath", this.f339327f.basePath);
        hashMap.put("pageRenderPtr", Long.valueOf(this.f339327f.renderId));
        hashMap.put("flags", Integer.valueOf(this.f339327f.flags));
        hashMap.put("startTime", Long.valueOf(System.currentTimeMillis()));
        return hashMap;
    }

    public String getInitialRoute() {
        return "/";
    }

    public C39623j getLifecycle() {
        return new C103766u(this);
    }

    public RenderMode getRenderMode() {
        return getBackgroundMode() == FlutterActivityLaunchConfigs.BackgroundMode.opaque ? RenderMode.surface : RenderMode.texture;
    }

    public C56832d getStore() {
        return this.f339330i;
    }

    public LiteAppCenter.SystemInfo getSystemInfo() {
        LiteAppCenter.SystemInfo systemInfo = LiteAppCenter.mCallback.getSystemInfo();
        systemInfo.appId = this.f339328g;
        systemInfo.isHalfScreen = true;
        return systemInfo;
    }

    public TransparencyMode getTransparencyMode() {
        return getBackgroundMode() == FlutterActivityLaunchConfigs.BackgroundMode.opaque ? TransparencyMode.opaque : TransparencyMode.transparent;
    }

    public boolean hasCutOut() {
        return false;
    }

    public void navigateBack(boolean z) {
        new Handler(Looper.getMainLooper()).post(new C113402a());
    }

    public void onCheckSumFail(String str, List<String> list) {
    }

    public void onCreateLitePageViewFinish(LiteAppCenter.PageInfo pageInfo) {
        this.f339327f = pageInfo;
        Map flutterViewParams = getFlutterViewParams();
        if (flutterViewParams != null) {
            if (flutterViewParams.containsKey("startTime")) {
                Long.valueOf(flutterViewParams.get("startTime").toString()).longValue();
                System.currentTimeMillis();
            }
            if (flutterViewParams.containsKey("appId")) {
                this.f339328g = String.valueOf(flutterViewParams.get("appId"));
            }
            if (flutterViewParams.containsKey("appPtr")) {
                this.f339329h = Long.valueOf(flutterViewParams.get("appPtr").toString()).longValue();
            }
            if (flutterViewParams.containsKey("pageViewId")) {
                Long.valueOf(flutterViewParams.get("pageViewId").toString()).longValue();
            }
            if (flutterViewParams.containsKey("activityId")) {
                this.f339325d = flutterViewParams.get("activityId").toString();
            }
            if (flutterViewParams.containsKey("pageRenderPtr")) {
                Long.valueOf(flutterViewParams.get("pageRenderPtr").toString()).longValue();
            }
        }
        mo169831a();
        getViewTreeObserver().addOnGlobalLayoutListener(new C117729b(this));
    }

    @C112974b0(C39623j.C39625b.ON_DESTROY)
    public void onDestroy() {
        C88718b.m110681c("WxaLiteApp.WxaLiteAppBaseView", "onDestroy", new Object[0]);
        throw null;
    }

    public void onFlutterUiDisplayed() {
    }

    @C112974b0(C39623j.C39625b.ON_PAUSE)
    public void onPause() {
        C88718b.m110681c("WxaLiteApp.WxaLiteAppBaseView", "onPause", new Object[0]);
        throw null;
    }

    @C112974b0(C39623j.C39625b.ON_RESUME)
    public void onResume() {
        C88718b.m110681c("WxaLiteApp.WxaLiteAppBaseView", "onResume", new Object[0]);
        throw null;
    }

    public void onShowPageTimeStamp(long j, long j2) {
    }

    @C112974b0(C39623j.C39625b.ON_START)
    public void onStart() {
        C88718b.m110681c("WxaLiteApp.WxaLiteAppBaseView", "onStart", new Object[0]);
        throw null;
    }

    @C112974b0(C39623j.C39625b.ON_STOP)
    public void onStop() {
        C88718b.m110681c("WxaLiteApp.WxaLiteAppBaseView", "onStop", new Object[0]);
        throw null;
    }

    public PlatformPlugin providePlatformPlugin(Activity activity, FlutterEngine flutterEngine) {
        return null;
    }

    public SplashScreen provideSplashScreen() {
        return null;
    }

    public void setFlags(int i) {
    }

    public void setIsPopGestureEnabled(boolean z) {
    }

    public void setKeepScreenOn(boolean z) {
        new Handler(Looper.getMainLooper()).post(new C113403b(z));
    }

    public void setPageOrientation(int i) {
    }

    public void setStore(C56832d dVar) {
        this.f339330i = dVar;
        dVar.f162865b = 0;
    }

    public boolean shouldAttachEngineToActivity() {
        return true;
    }

    public void showPage(LiteAppCenter.PageInfo pageInfo) {
    }

    public void vibrateLong(long j) {
        Vibrator vibrator = (Vibrator) getActivity().getSystemService("vibrator");
        if (vibrator != null) {
            vibrator.vibrate(j);
        }
    }

    public void vibrateShort(long j, int i) {
        Vibrator vibrator = (Vibrator) getActivity().getSystemService("vibrator");
        if (vibrator != null) {
            if (Build.VERSION.SDK_INT < 26 || !vibrator.hasAmplitudeControl()) {
                vibrator.vibrate(j);
            } else {
                vibrator.vibrate(VibrationEffect.createOneShot(j, i));
            }
        }
    }
}
