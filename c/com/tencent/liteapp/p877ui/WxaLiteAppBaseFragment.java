package com.tencent.liteapp.p877ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.tencent.liteapp.storage.WxaLiteAppInfo;
import com.tencent.p014mm.hellhoundlib.fragments.HellAndroidXFragment;
import com.tencent.p014mm.plugin.lite.LiteAppCenter;
import com.tencent.wxa.p1187ui.C116506a;
import java.util.Map;
import p1005ma.C88718b;
import p172io.flutter.embedding.android.FlutterActivityLaunchConfigs;
import p172io.flutter.embedding.android.RenderMode;
import p172io.flutter.embedding.android.TransparencyMode;
import p172io.flutter.embedding.engine.FlutterEngine;
import p172io.flutter.plugin.platform.PlatformPlugin;
import p172io.flutter.view.FlutterMain;
import tw3.C118552d;
import vw3.C118707a;
import vw3.C118708b;
import ww3.C118789a;
import xw3.C118908a;

/* renamed from: com.tencent.liteapp.ui.WxaLiteAppBaseFragment */
public class WxaLiteAppBaseFragment extends HellAndroidXFragment implements C116506a.C116510d, C118708b {

    /* renamed from: d */
    public String f339304d;

    /* renamed from: e */
    public C116506a f339305e;

    /* renamed from: f */
    public WxaLiteAppInfo f339306f;

    /* renamed from: g */
    public View f339307g;

    /* renamed from: h */
    public String f339308h;

    /* renamed from: i */
    public String f339309i;

    /* renamed from: j */
    public String f339310j;

    /* renamed from: n */
    public long f339311n = 0;

    /* renamed from: o */
    public int f339312o;

    static {
        FlutterActivityLaunchConfigs.BackgroundMode.opaque.name();
    }

    public WxaLiteAppBaseFragment() {
        LiteAppCenter.initLib();
    }

    /* renamed from: K */
    public FlutterActivityLaunchConfigs.BackgroundMode mo169808K() {
        return getArguments().containsKey("background_mode") ? FlutterActivityLaunchConfigs.BackgroundMode.valueOf(getArguments().getString("background_mode")) : getActivity().getIntent().hasExtra("background_mode") ? FlutterActivityLaunchConfigs.BackgroundMode.valueOf(getActivity().getIntent().getStringExtra("background_mode")) : FlutterActivityLaunchConfigs.BackgroundMode.opaque;
    }

    public void cleanUpFlutterEngine(FlutterEngine flutterEngine) {
    }

    public void configureFlutterEngine(FlutterEngine flutterEngine) {
    }

    public /* bridge */ /* synthetic */ Activity getActivity() {
        return super.getActivity();
    }

    public String getAppBundlePath() {
        return FlutterMain.findAppBundlePath();
    }

    public String getCachedEngineId() {
        return getArguments().containsKey("cached_engine_id") ? getArguments().getString("cached_engine_id") : getActivity().getIntent().getStringExtra("cached_engine_id");
    }

    public String getDartEntrypointFunctionName() {
        if (getArguments().containsKey("dart_entrypoint")) {
            return getArguments().getString("dart_entrypoint");
        }
        if (getActivity().getIntent().hasExtra("dart_entrypoint")) {
            return getActivity().getIntent().getStringExtra("dart_entrypoint");
        }
        try {
            Bundle bundle = getActivity().getPackageManager().getActivityInfo(getActivity().getComponentName(), 128).metaData;
            String string = bundle != null ? bundle.getString(FlutterActivityLaunchConfigs.DART_ENTRYPOINT_META_DATA_KEY) : null;
            return string != null ? string : FlutterActivityLaunchConfigs.DEFAULT_DART_ENTRYPOINT;
        } catch (PackageManager.NameNotFoundException e) {
            C88718b.m110680b("WxaLiteAp.WxaLiteAppBaseFragment", "getDartEntrypointFunctionName fail. %s", e.toString());
            return FlutterActivityLaunchConfigs.DEFAULT_DART_ENTRYPOINT;
        }
    }

    public C118708b getFlutterActivity() {
        return this;
    }

    public String getFlutterViewId() {
        if (getArguments().containsKey("activityId") && !TextUtils.isEmpty(getArguments().getString("activityId"))) {
            C88718b.m110681c("WxaLiteAp.WxaLiteAppBaseFragment", "getFlutterViewId from Arguments", new Object[0]);
            return getArguments().getString("activityId");
        } else if (!getActivity().getIntent().hasExtra("activityId") || TextUtils.isEmpty(getActivity().getIntent().getStringExtra("activityId"))) {
            if (TextUtils.isEmpty(this.f339304d)) {
                this.f339304d = String.format("%d-%d", new Object[]{Long.valueOf(System.currentTimeMillis()), Integer.valueOf(hashCode())});
            }
            return this.f339304d;
        } else {
            C88718b.m110681c("WxaLiteAp.WxaLiteAppBaseFragment", "getFlutterViewId from Activity Intent", new Object[0]);
            return getActivity().getIntent().getStringExtra("activityId");
        }
    }

    public String getFlutterViewName() {
        if (!getArguments().containsKey("name") || TextUtils.isEmpty(getArguments().getString("name"))) {
            return getActivity().getIntent().hasExtra("name") ? getActivity().getIntent().getStringExtra("name") : "";
        }
        C88718b.m110681c("WxaLiteAp.WxaLiteAppBaseFragment", "getFlutterViewName from Arguments", new Object[0]);
        return getArguments().getString("name");
    }

    public Map getFlutterViewParams() {
        if (!getArguments().containsKey("params") || !(getArguments().getSerializable("params") instanceof C118908a)) {
            if (getActivity().getIntent().hasExtra("params") && (getActivity().getIntent().getSerializableExtra("params") instanceof C118908a)) {
                ((C118908a) getActivity().getIntent().getSerializableExtra("params")).getClass();
                C88718b.m110681c("WxaLiteAp.WxaLiteAppBaseFragment", "getFlutterViewParams from Activity Intent", new Object[0]);
            }
            return null;
        }
        ((C118908a) getArguments().getSerializable("params")).getClass();
        C88718b.m110681c("WxaLiteAp.WxaLiteAppBaseFragment", "getFlutterViewParams from Arguments", new Object[0]);
        return null;
    }

    public String getInitialRoute() {
        if (getArguments().containsKey("initial_route")) {
            return getArguments().getString("initial_route");
        }
        if (getActivity().getIntent().hasExtra("initial_route")) {
            return getActivity().getIntent().getStringExtra("initial_route");
        }
        try {
            Bundle bundle = getActivity().getPackageManager().getActivityInfo(getActivity().getComponentName(), 128).metaData;
            String string = bundle != null ? bundle.getString(FlutterActivityLaunchConfigs.INITIAL_ROUTE_META_DATA_KEY) : null;
            return string != null ? string : "/";
        } catch (PackageManager.NameNotFoundException unused) {
            return "/";
        }
    }

    public RenderMode getRenderMode() {
        return mo169808K() == FlutterActivityLaunchConfigs.BackgroundMode.opaque ? RenderMode.surface : RenderMode.texture;
    }

    public TransparencyMode getTransparencyMode() {
        return mo169808K() == FlutterActivityLaunchConfigs.BackgroundMode.opaque ? TransparencyMode.opaque : TransparencyMode.transparent;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
    }

    public void onAttach(Context context) {
        super.onAttach(context);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        DisplayMetrics displayMetrics2 = LiteAppCenter.mDisplayMetrics;
        if (displayMetrics2 != null) {
            displayMetrics.setTo(displayMetrics2);
        }
        C116506a aVar = new C116506a(this);
        this.f339305e = aVar;
        this.f339312o = aVar.f349458a;
        aVar.mo180440d(getContext());
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View f = this.f339305e.mo180442f((LayoutInflater) null, (ViewGroup) null, (Bundle) null);
        this.f339307g = f;
        return f;
    }

    public void onDestroy() {
        super.onDestroy();
        this.f339305e.mo180443g();
        C116506a aVar = this.f339305e;
        aVar.getClass();
        C118789a.m167473d("WxaRouter.WxaFlutterActivityAndFragmentDelegate", "onCloseView()", new Object[0]);
        C118707a aVar2 = (C118707a) aVar.f349463f;
        aVar2.getClass();
        C118552d.m167207g().mo183268h(aVar2.f355217b, "closeView", aVar2.mo183459a());
        this.f339305e.mo180444h();
    }

    public void onDetach() {
        super.onDetach();
    }

    public void onFlutterUiDisplayed() {
    }

    public void onPause() {
        super.onPause();
        this.f339305e.mo180446j();
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    public void onResume() {
        super.onResume();
        this.f339305e.mo180449m();
    }

    public void onStart() {
        super.onStart();
        this.f339305e.mo180450n();
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
    }

    public PlatformPlugin providePlatformPlugin(Activity activity, FlutterEngine flutterEngine) {
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p172io.flutter.embedding.android.SplashScreen provideSplashScreen() {
        /*
            r4 = this;
            r0 = 0
            androidx.fragment.app.FragmentActivity r1 = r4.getActivity()     // Catch:{ NameNotFoundException -> 0x0051 }
            android.content.pm.PackageManager r1 = r1.getPackageManager()     // Catch:{ NameNotFoundException -> 0x0051 }
            androidx.fragment.app.FragmentActivity r2 = r4.getActivity()     // Catch:{ NameNotFoundException -> 0x0051 }
            android.content.ComponentName r2 = r2.getComponentName()     // Catch:{ NameNotFoundException -> 0x0051 }
            r3 = 128(0x80, float:1.794E-43)
            android.content.pm.ActivityInfo r1 = r1.getActivityInfo(r2, r3)     // Catch:{ NameNotFoundException -> 0x0051 }
            android.os.Bundle r1 = r1.metaData     // Catch:{ NameNotFoundException -> 0x0051 }
            if (r1 == 0) goto L_0x0026
            java.lang.String r2 = "io.flutter.embedding.android.SplashScreenDrawable"
            int r1 = r1.getInt(r2)     // Catch:{ NameNotFoundException -> 0x0051 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ NameNotFoundException -> 0x0051 }
            goto L_0x0027
        L_0x0026:
            r1 = r0
        L_0x0027:
            if (r1 == 0) goto L_0x0051
            int r2 = android.os.Build.VERSION.SDK_INT     // Catch:{ NameNotFoundException -> 0x0051 }
            r3 = 21
            if (r2 <= r3) goto L_0x0044
            android.content.res.Resources r2 = r4.getResources()     // Catch:{ NameNotFoundException -> 0x0051 }
            int r1 = r1.intValue()     // Catch:{ NameNotFoundException -> 0x0051 }
            androidx.fragment.app.FragmentActivity r3 = r4.getActivity()     // Catch:{ NameNotFoundException -> 0x0051 }
            android.content.res.Resources$Theme r3 = r3.getTheme()     // Catch:{ NameNotFoundException -> 0x0051 }
            android.graphics.drawable.Drawable r1 = r2.getDrawable(r1, r3)     // Catch:{ NameNotFoundException -> 0x0051 }
            goto L_0x0052
        L_0x0044:
            android.content.res.Resources r2 = r4.getResources()     // Catch:{ NameNotFoundException -> 0x0051 }
            int r1 = r1.intValue()     // Catch:{ NameNotFoundException -> 0x0051 }
            android.graphics.drawable.Drawable r1 = r2.getDrawable(r1)     // Catch:{ NameNotFoundException -> 0x0051 }
            goto L_0x0052
        L_0x0051:
            r1 = r0
        L_0x0052:
            if (r1 == 0) goto L_0x0059
            io.flutter.embedding.android.DrawableSplashScreen r0 = new io.flutter.embedding.android.DrawableSplashScreen
            r0.<init>(r1)
        L_0x0059:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.liteapp.p877ui.WxaLiteAppBaseFragment.provideSplashScreen():io.flutter.embedding.android.SplashScreen");
    }

    public void setIsPopGestureEnabled(boolean z) {
    }

    public boolean shouldAttachEngineToActivity() {
        return true;
    }
}
