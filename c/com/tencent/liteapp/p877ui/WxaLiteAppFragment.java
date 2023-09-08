package com.tencent.liteapp.p877ui;

import android.content.Context;
import android.content.Intent;
import android.graphics.Point;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.actions.SearchIntents;
import com.tencent.liteapp.storage.WxaLiteAppInfo;
import com.tencent.p014mm.plugin.lite.C56832d;
import com.tencent.p014mm.plugin.lite.LiteAppCenter;
import gy3.C87412m;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import p1005ma.C88718b;
import p1020pa.C89330g;
import p1056vl.C90824b;
import p1198ka.C117396b;
import p1204oa.C117730c;
import p979ia.C117147b;

/* renamed from: com.tencent.liteapp.ui.WxaLiteAppFragment */
public class WxaLiteAppFragment extends WxaLiteAppBaseFragment implements LiteAppCenter.ILiteAppUICallback {

    /* renamed from: y */
    public static final /* synthetic */ int f339337y = 0;

    /* renamed from: p */
    public int f339338p = 0;

    /* renamed from: q */
    public long f339339q = -1;

    /* renamed from: r */
    public LiteAppCenter.PageInfo f339340r;

    /* renamed from: s */
    public long f339341s = -1;

    /* renamed from: t */
    public View f339342t;

    /* renamed from: u */
    public String f339343u;

    /* renamed from: v */
    public String[] f339344v;

    /* renamed from: w */
    public String[] f339345w;

    /* renamed from: x */
    public C56832d f339346x = null;

    /* renamed from: com.tencent.liteapp.ui.WxaLiteAppFragment$b */
    public class C67640b implements Runnable {
        public C67640b() {
        }

        public void run() {
            WxaLiteAppFragment.this.f339305e.mo180441e(true);
        }
    }

    /* renamed from: com.tencent.liteapp.ui.WxaLiteAppFragment$a */
    public class C113405a implements View.OnAttachStateChangeListener {
        public C113405a() {
        }

        public void onViewAttachedToWindow(View view) {
            C88718b.m110681c("WxaLiteAp.WxaLiteAppFragment", "content view attach to Window", new Object[0]);
            WxaLiteAppFragment wxaLiteAppFragment = WxaLiteAppFragment.this;
            int i = WxaLiteAppFragment.f339337y;
            View view2 = wxaLiteAppFragment.f339342t;
            if (view2 != null) {
                view2.getViewTreeObserver().addOnGlobalLayoutListener(new C117730c(wxaLiteAppFragment));
            }
        }

        public void onViewDetachedFromWindow(View view) {
        }
    }

    /* renamed from: com.tencent.liteapp.ui.WxaLiteAppFragment$c */
    public class C113406c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ boolean f339348d;

        public C113406c(boolean z) {
            this.f339348d = z;
        }

        public void run() {
            WxaLiteAppFragment.this.getView().setKeepScreenOn(this.f339348d);
        }
    }

    /* renamed from: com.tencent.liteapp.ui.WxaLiteAppFragment$d */
    public class C113407d implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ Method f339350d;

        /* renamed from: e */
        public final /* synthetic */ C117396b f339351e;

        /* renamed from: f */
        public final /* synthetic */ Object[] f339352f;

        public C113407d(WxaLiteAppFragment wxaLiteAppFragment, Method method, C117396b bVar, Object[] objArr) {
            this.f339350d = method;
            this.f339351e = bVar;
            this.f339352f = objArr;
        }

        public void run() {
            try {
                this.f339350d.invoke(this.f339351e, this.f339352f);
            } catch (IllegalAccessException | InvocationTargetException unused) {
            }
        }
    }

    /* renamed from: L */
    public final void mo169860L(View view) {
        LiteAppCenter.setIsHalfScreen(this.f339311n, true);
        Point b = C90824b.m113902b(getContext());
        Context context = C117147b.f350981b;
        if (context != null) {
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            float f = displayMetrics.density;
            int e = C89330g.m111653e(getContext());
            C89330g.m111650b(getContext());
            LiteAppCenter.setDisplayParams(this.f339311n, ((float) measuredWidth) / f, ((float) measuredHeight) / f, ((float) b.x) / f, ((float) b.y) / f, displayMetrics.densityDpi, f, (((float) 48) * f) / f, ((float) e) / f, ((float) 0) / f);
            C88718b.m110681c("WxaLiteAp.WxaLiteAppFragment", "updateLvCppDisplayParams SetDisplayParams w=%d h=%d screen=%d,%d densityDpi=%d density=%f statusBarHeight=%d navigationBarHeight=%d", Integer.valueOf(measuredWidth), Integer.valueOf(measuredHeight), Integer.valueOf(b.x), Integer.valueOf(b.y), Integer.valueOf(displayMetrics.densityDpi), Float.valueOf(displayMetrics.density), Integer.valueOf(e), 0);
            return;
        }
        C87412m.m108603p("appContext");
        throw null;
    }

    public void callDynamicModule(Method method, C117396b bVar, Object[] objArr) {
        new Handler(Looper.getMainLooper()).post(new C113407d(this, method, bVar, objArr));
    }

    public void closeWindow(Intent intent) {
        getActivity().finish();
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

    public String getFlutterViewId() {
        C88718b.m110679a("WxaLiteAp.WxaLiteAppFragment", "getFlutterViewId %s", Long.valueOf(this.f339339q));
        return String.valueOf(this.f339339q);
    }

    public String getFlutterViewName() {
        return String.valueOf(this.f339341s);
    }

    public Map getFlutterViewParams() {
        if (this.f339340r != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("activityId", Long.valueOf(this.f339340r.appUuid));
            hashMap.put("appId", this.f339306f.f339290d);
            hashMap.put("appPtr", Long.valueOf(this.f339340r.appPtr));
            hashMap.put("pageViewId", Long.valueOf(this.f339340r.pageId));
            hashMap.put("basePath", this.f339340r.basePath);
            hashMap.put("pageRenderPtr", Long.valueOf(this.f339340r.renderId));
            hashMap.put("flags", Integer.valueOf(this.f339340r.flags));
            hashMap.put("startTime", Long.valueOf(System.currentTimeMillis()));
            return hashMap;
        }
        super.getFlutterViewParams();
        return null;
    }

    public C56832d getStore() {
        return this.f339346x;
    }

    public LiteAppCenter.SystemInfo getSystemInfo() {
        LiteAppCenter.SystemInfo systemInfo = LiteAppCenter.mCallback.getSystemInfo();
        systemInfo.appId = this.f339308h;
        systemInfo.isHalfScreen = true;
        return systemInfo;
    }

    public boolean hasCutOut() {
        return false;
    }

    public void navigateBack(boolean z) {
        new Handler(Looper.getMainLooper()).post(new C67640b());
    }

    public void onCheckSumFail(String str, List<String> list) {
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    public void onCreateLitePageViewFinish(LiteAppCenter.PageInfo pageInfo) {
        this.f339340r = pageInfo;
        Map flutterViewParams = getFlutterViewParams();
        if (flutterViewParams != null) {
            HashMap hashMap = (HashMap) flutterViewParams;
            if (hashMap.containsKey("startTime")) {
                Long.valueOf(hashMap.get("startTime").toString()).longValue();
                System.currentTimeMillis();
            }
            if (hashMap.containsKey("appId")) {
                this.f339308h = String.valueOf(hashMap.get("appId"));
            }
            if (hashMap.containsKey("appPtr")) {
                this.f339311n = Long.valueOf(hashMap.get("appPtr").toString()).longValue();
            }
            if (hashMap.containsKey("pageViewId")) {
                this.f339341s = Long.valueOf(hashMap.get("pageViewId").toString()).longValue();
            }
            if (hashMap.containsKey("activityId")) {
                this.f339304d = hashMap.get("activityId").toString();
            }
            if (hashMap.containsKey("pageRenderPtr")) {
                Long.valueOf(hashMap.get("pageRenderPtr").toString()).longValue();
            }
        }
        mo169860L(this.f339342t);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        boolean z;
        if (getActivity().getIntent().hasExtra("bundle")) {
            Bundle bundleExtra = getActivity().getIntent().getBundleExtra("bundle");
            boolean z2 = bundleExtra.containsKey("transparent") ? bundleExtra.getBoolean("transparent", false) : false;
            if (bundleExtra.containsKey("sourceType")) {
                this.f339343u = bundleExtra.getString("sourceType");
            }
            if (bundleExtra.containsKey("enableActions")) {
                this.f339344v = bundleExtra.getStringArray("enableActions");
            }
            if (bundleExtra.containsKey("enableViews")) {
                this.f339345w = bundleExtra.getStringArray("enableViews");
            }
            z = z2;
        } else {
            z = false;
        }
        if (getArguments().containsKey("LiteApp")) {
            this.f339306f = (WxaLiteAppInfo) getArguments().getParcelable("LiteApp");
            C88718b.m110681c("WxaLiteAp.WxaLiteAppBaseFragment", "getWxaLiteAppInfo from Arguments KEY_LITE_APP", new Object[0]);
        } else if (getArguments().containsKey("LiteAppId")) {
            C87412m.m108594g(getArguments().getString("LiteAppId"), "appId");
            if (C117147b.f350980a != null) {
                throw new RuntimeException("Please setup storage first.");
            }
            C87412m.m108603p("config");
            throw null;
        } else if (getActivity().getIntent().hasExtra("LiteApp")) {
            this.f339306f = (WxaLiteAppInfo) getActivity().getIntent().getParcelableExtra("LiteApp");
            C88718b.m110681c("WxaLiteAp.WxaLiteAppBaseFragment", "getWxaLiteAppInfo from Activity Intent KEY_LITE_APP", new Object[0]);
        } else if (!getActivity().getIntent().hasExtra("LiteAppId")) {
            C88718b.m110682d("WxaLiteAp.WxaLiteAppBaseFragment", "Not contains app info.", new Object[0]);
        } else {
            C87412m.m108594g(getActivity().getIntent().getStringExtra("LiteAppId"), "appId");
            if (C117147b.f350980a != null) {
                throw new RuntimeException("Please setup storage first.");
            }
            C87412m.m108603p("config");
            throw null;
        }
        if (getArguments().containsKey(SearchIntents.EXTRA_QUERY)) {
            this.f339310j = getArguments().getString(SearchIntents.EXTRA_QUERY);
            C88718b.m110681c("WxaLiteAp.WxaLiteAppBaseFragment", "mQuery from Arguments KEY_QUERY", new Object[0]);
        } else if (getActivity().getIntent().hasExtra(SearchIntents.EXTRA_QUERY)) {
            this.f339310j = getActivity().getIntent().getStringExtra(SearchIntents.EXTRA_QUERY);
            C88718b.m110681c("WxaLiteAp.WxaLiteAppBaseFragment", "mQuery from Activity Intent KEY_QUERY", new Object[0]);
        } else {
            C88718b.m110682d("WxaLiteAp.WxaLiteAppBaseFragment", "Not contains query info.", new Object[0]);
        }
        if (getArguments().containsKey("page")) {
            this.f339309i = getArguments().getString("page");
            C88718b.m110681c("WxaLiteAp.WxaLiteAppBaseFragment", "mPage from Arguments KEY_PAGE", new Object[0]);
        } else if (getActivity().getIntent().hasExtra("page")) {
            this.f339309i = getActivity().getIntent().getStringExtra("page");
            C88718b.m110681c("WxaLiteAp.WxaLiteAppBaseFragment", "mPage from Activity Intent KEY_PAGE", new Object[0]);
        } else {
            C88718b.m110682d("WxaLiteAp.WxaLiteAppBaseFragment", "Not contains page info.", new Object[0]);
        }
        if (getActivity().getIntent().hasExtra("bundle")) {
            Bundle bundleExtra2 = getActivity().getIntent().getBundleExtra("bundle");
            if (bundleExtra2.containsKey("openWithNewTab")) {
                bundleExtra2.getBoolean("openWithNewTab", false);
            }
        }
        if (this.f339306f == null) {
            C88718b.m110680b("WxaLiteAp.WxaLiteAppFragment", "no WxaLiteAppInfo!", new Object[0]);
            getActivity().finish();
            return null;
        }
        int genAppUuid = LiteAppCenter.genAppUuid();
        this.f339338p = genAppUuid;
        C56832d dVar = this.f339346x;
        if (dVar != null) {
            dVar.f162865b = genAppUuid;
        }
        this.f339339q = (long) genAppUuid;
        this.f339341s = 0;
        this.f339342t = super.onCreateView(layoutInflater, viewGroup, bundle);
        LiteAppCenter.setUICallback(this.f339338p, this);
        WxaLiteAppInfo wxaLiteAppInfo = this.f339306f;
        if (wxaLiteAppInfo != null) {
            this.f339308h = wxaLiteAppInfo.f339290d;
            C88718b.m110681c("WxaLiteAp.WxaLiteAppFragment", "Use WxaLiteAppInfo", new Object[0]);
            if (TextUtils.isEmpty(this.f339309i)) {
                WxaLiteAppInfo wxaLiteAppInfo2 = this.f339306f;
                LiteAppCenter.showIndexView(wxaLiteAppInfo2.f339290d, wxaLiteAppInfo2.f339295i, wxaLiteAppInfo2.f339294h, this.f339310j, this.f339312o, this.f339338p, z, this.f339343u, this.f339344v, this.f339345w);
            } else {
                WxaLiteAppInfo wxaLiteAppInfo3 = this.f339306f;
                LiteAppCenter.showView(wxaLiteAppInfo3.f339290d, this.f339309i, this.f339310j, wxaLiteAppInfo3.f339295i, wxaLiteAppInfo3.f339294h, this.f339312o, this.f339338p, z, this.f339343u, this.f339344v, this.f339345w);
            }
        }
        View view = this.f339342t;
        if (view != null) {
            if (view.isAttachedToWindow()) {
                View view2 = this.f339342t;
                if (view2 != null) {
                    view2.getViewTreeObserver().addOnGlobalLayoutListener(new C117730c(this));
                }
            } else {
                this.f339342t.addOnAttachStateChangeListener(new C113405a());
            }
        }
        return this.f339342t;
    }

    public void onDestroy() {
        super.onDestroy();
        LiteAppCenter.unsetUICallback(this.f339338p, this);
    }

    public void onShowPageTimeStamp(long j, long j2) {
    }

    public void onStart() {
        super.onStart();
        LiteAppCenter.setLocale(Locale.getDefault().getLanguage(), Locale.getDefault().getCountry());
    }

    public void setFlags(int i) {
    }

    public void setKeepScreenOn(boolean z) {
        new Handler(Looper.getMainLooper()).post(new C113406c(z));
    }

    public void setPageOrientation(int i) {
    }

    public void setStore(C56832d dVar) {
        this.f339346x = dVar;
        dVar.f162865b = this.f339338p;
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
