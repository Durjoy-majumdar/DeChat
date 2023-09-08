package com.tencent.p014mm.plugin.appbrand.page;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.actions.SearchIntents;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntime;
import com.tencent.p014mm.plugin.appbrand.config.C81634a;
import com.tencent.p014mm.plugin.appbrand.p026ui.AppBrandPluginUI;
import com.tencent.p014mm.plugin.appbrand.widget.input.C85004y;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.regex.Pattern;
import junit.framework.Assert;
import nj3.C88990b;
import org.json.JSONException;
import org.json.JSONObject;
import p170ic.C87690d;
import p225rc.C48016e;
import p225rc.C89917h;
import p225rc.C89925n;
import p361me.imid.swipebacklayout.lib.C88728a;
import p361me.imid.swipebacklayout.lib.SwipeBackLayout;
import rq0.C90086e;
import sq0.C90337g;
import sq0.C90339i;
import u24.C90599h;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.appbrand.page.i0 */
public abstract class C83820i0 extends SwipeBackLayout {

    /* renamed from: A */
    public boolean f244676A = true;

    /* renamed from: B */
    public boolean f244677B = false;

    /* renamed from: C */
    public boolean f244678C = false;

    /* renamed from: D */
    public final Map<C90339i, C90337g> f244679D = new HashMap();

    /* renamed from: E */
    public final Set<Runnable> f244680E = new HashSet();

    /* renamed from: F */
    public int f244681F;

    /* renamed from: G */
    public int f244682G;

    /* renamed from: H */
    public boolean f244683H = false;

    /* renamed from: I */
    public final boolean[] f244684I = {false};

    /* renamed from: J */
    public final SwipeBackLayout.C21490b f244685J = new C83824d();

    /* renamed from: K */
    public boolean f244686K = false;

    /* renamed from: y */
    public C83849m0 f244687y;

    /* renamed from: z */
    public View f244688z;

    /* renamed from: com.tencent.mm.plugin.appbrand.page.i0$a */
    public class C83821a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ Runnable f244689d;

        public C83821a(Runnable runnable) {
            this.f244689d = runnable;
        }

        public void run() {
            C83820i0.this.mo116286K(this.f244689d);
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.page.i0$b */
    public class C83822b extends AnimatorListenerAdapter {

        /* renamed from: d */
        public final /* synthetic */ Runnable f244691d;

        public C83822b(C83820i0 i0Var, Runnable runnable) {
            this.f244691d = runnable;
        }

        public void onAnimationCancel(Animator animator) {
            super.onAnimationCancel(animator);
            this.f244691d.run();
        }

        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            this.f244691d.run();
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.page.i0$c */
    public class C83823c implements Runnable {
        public C83823c() {
        }

        public void run() {
            C83820i0.this.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            C83820i0.this.setScrimColor(0);
            C83820i0 i0Var = C83820i0.this;
            i0Var.f244688z = i0Var.mo114317g();
            i0Var.addView(i0Var.getContentView());
            i0Var.setContentView(i0Var.getContentView());
            C83820i0 i0Var2 = C83820i0.this;
            i0Var2.mo33654a(i0Var2.f244685J);
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.page.i0$d */
    public class C83824d extends C88728a {

        /* renamed from: a */
        public int f244693a = -1;

        public C83824d() {
        }

        /* renamed from: b */
        public int mo33674b(boolean z) {
            return 1;
        }

        /* renamed from: d */
        public void mo33676d(int i, float f) {
            C83820i0 i0Var;
            C83817h4 h4Var = C83817h4.NAVIGATE_BACK;
            if (C83820i0.this.getContainer() == null || C83820i0.this.getContainer().getCurrentPage() != (i0Var = C83820i0.this)) {
                C83820i0.this.setEnableGesture(false);
            } else if (i0Var.f244687y.mo116356i0("scene_swipe_back", (Runnable) null)) {
                Log.m105924i("MicroMsg.AppBrandPage", "[onScrollStateChange] navigate back be intercepted");
                C83820i0.this.mo33655c();
            } else {
                C83849m0 container = C83820i0.this.getContainer();
                C83820i0 i0Var2 = C83820i0.this;
                C83820i0 t = i0Var2.f244687y.mo116377t(i0Var2);
                if (container == null) {
                    Log.m105928w("MicroMsg.AppBrandPage", "onScrollStateChange, null == pageContainer");
                } else {
                    float f2 = 100.0f * f;
                    int ceil = (int) Math.ceil((double) f2);
                    if (ceil == 0 || -1 == this.f244693a) {
                        C83820i0 i0Var3 = C83820i0.this;
                        if (i0Var3.f244683H) {
                            container.mo116360l(h4Var, i0Var3, t);
                        } else {
                            container.mo116363o(h4Var, i0Var3, t);
                        }
                    } else if (100 > ceil) {
                        container.mo116362n(h4Var, C83820i0.this, t, f2);
                    }
                    this.f244693a = ceil;
                }
                if (i != 0) {
                    C83820i0.this.f244683H = true;
                } else {
                    C83820i0.this.f244683H = false;
                    this.f244693a = -1;
                }
                if (Float.compare(1.0f, f) <= 0) {
                    C83820i0 i0Var4 = C83820i0.this;
                    if (!i0Var4.f244684I[0]) {
                        if (t != null) {
                            View contentView = t.getContentView();
                            i0Var4.getClass();
                            contentView.clearAnimation();
                            contentView.setTranslationX(0.0f);
                        }
                        C83820i0 i0Var5 = C83820i0.this;
                        i0Var5.getClass();
                        Log.m105919d("MicroMsg.AppBrandPage", "onSwipeBack %s", android.util.Log.getStackTraceString(new Throwable()));
                        i0Var5.f244683H = true;
                        i0Var5.post(new C83831j0(i0Var5));
                        C83820i0.this.f244684I[0] = true;
                    }
                } else if (t != null) {
                    t.mo116283G(f);
                }
                Log.m105927v("MicroMsg.AppBrandPage", "scrollPercent %f", Float.valueOf(f));
                if (C83820i0.this.getContainer().getPageCount() == 1 && C83820i0.this.getContainer().getRuntime().f238134Y && C83820i0.this.getContainer().getRuntime().f238132X != null) {
                    AppBrandPluginUI.C84437a aVar = (AppBrandPluginUI.C84437a) C83820i0.this.getContainer().getRuntime().f238132X;
                    aVar.getClass();
                    if (1 == i) {
                        Log.m105924i("MicroMsg.AppBrandPluginUI", "load convertActivityToTranslucent");
                        C88990b.m111194c(AppBrandPluginUI.this, (C88990b.C61771c) null);
                    }
                }
            }
        }
    }

    public C83820i0(Context context, C83849m0 m0Var) {
        super(context, (AttributeSet) null);
        this.f244687y = m0Var;
    }

    private String getLocalClassName() {
        return getClass().getName().replaceFirst(Pattern.quote("com.tencent.mm.plugin.appbrand"), "");
    }

    /* renamed from: B */
    public abstract void mo114316B(long j, String str, C83817h4 h4Var);

    /* renamed from: C */
    public void mo116223C() {
    }

    /* renamed from: D */
    public void mo116224D() {
        Log.m105919d("MicroMsg.AppBrandPage", "onPageBackground: %s", getCurrentUrl());
    }

    /* renamed from: E */
    public void mo116225E() {
        Log.m105919d("MicroMsg.AppBrandPage", "onPageDestroy: %s", getCurrentUrl());
    }

    /* renamed from: F */
    public void mo116226F() {
        Log.m105919d("MicroMsg.AppBrandPage", "onPageForeground: %s", getCurrentUrl());
        mo116285I();
        setVisibility(0);
    }

    /* renamed from: G */
    public final void mo116283G(float f) {
        boolean z = this.f244676A;
        if (z) {
            if (f >= 0.0f) {
                setVisibility(0);
            } else if (z) {
                setVisibility(4);
            }
        }
        clearAnimation();
        setTranslationX((((float) getWidth()) / 4.0f) * (1.0f - f) * -1.0f);
    }

    /* renamed from: H */
    public void mo116284H(C90339i iVar, C90337g gVar) {
        if (iVar != null) {
            synchronized (this.f244679D) {
                if (gVar == null) {
                    C90337g gVar2 = (C90337g) ((HashMap) this.f244679D).remove(iVar);
                    Log.m105924i("MicroMsg.AppBrandPage", "[registerNavigateBackInterceptionInfo] remove " + iVar);
                } else {
                    ((HashMap) this.f244679D).put(iVar, gVar);
                    Log.m105924i("MicroMsg.AppBrandPage", "[registerNavigateBackInterceptionInfo] add " + iVar);
                }
                Log.m105924i("MicroMsg.AppBrandPage", "[registerNavigateBackInterceptionInfo] navigateBackInterceptionInfos size=" + ((HashMap) this.f244679D).size());
            }
        }
    }

    /* renamed from: I */
    public void mo116285I() {
        if (!this.f244687y.getRuntime().f238151p0) {
            if (!(getCurrentPageView().mo116148C0() > 1)) {
                C83849m0 m0Var = this.f244687y;
                setEnableGesture(m0Var.getActualPageStackSize() > 1 || m0Var.getRuntime().f238134Y);
                setEdgeTrackingEnabled(1);
                mo116283G(1.0f);
                this.f244684I[0] = false;
                this.f244683H = false;
                mo33655c();
            }
        }
        setEnableGesture(false);
        setEdgeTrackingEnabled(1);
        mo116283G(1.0f);
        this.f244684I[0] = false;
        this.f244683H = false;
        mo33655c();
    }

    /* renamed from: J */
    public void mo116227J(long j, String str) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: K */
    public final void mo116286K(Runnable runnable) {
        if (runnable != null) {
            if (Looper.getMainLooper() != Looper.myLooper()) {
                ((C119157j) C119157j.f356862d).mo183895z(new C83821a(runnable));
                return;
            }
            Object tag = getTag(C0966R.C0970id.f5951t6);
            if (tag instanceof Animator) {
                ((Animator) tag).addListener(new C83822b(this, runnable));
            } else if (getAnimation() == null) {
                runnable.run();
            } else {
                ((HashSet) this.f244680E).add(runnable);
            }
        }
    }

    /* renamed from: L */
    public boolean mo116287L() {
        return getCurrentPageView().mo116205x1();
    }

    /* renamed from: N */
    public abstract void mo116228N(String str, C83780d1 d1Var);

    /* renamed from: e */
    public void mo116288e(C83780d1 d1Var, AppBrandPageFullScreenView appBrandPageFullScreenView) {
        if (appBrandPageFullScreenView != null && appBrandPageFullScreenView.getParent() == null) {
            View view = this.f244688z;
            if (view instanceof ViewGroup) {
                ((ViewGroup) view).addView(appBrandPageFullScreenView, new ViewGroup.LayoutParams(-1, -1));
            }
        }
    }

    /* renamed from: f */
    public void mo116229f() {
    }

    /* renamed from: g */
    public abstract View mo114317g();

    public String getAppId() {
        return this.f244687y.getAppId();
    }

    public C83849m0 getContainer() {
        return this.f244687y;
    }

    public final View getContentView() {
        return this.f244688z;
    }

    public abstract C83780d1 getCurrentPageView();

    public final int getCurrentRenderPagesCount() {
        C83780d1 currentPageView = getCurrentPageView();
        if (currentPageView == null) {
            return 1;
        }
        return currentPageView.mo116148C0();
    }

    public abstract String getCurrentUrl();

    public C81634a.C81639e getPageConfig() {
        return getCurrentPageView().mo116157L0();
    }

    public final C83849m0 getPageContainer() {
        return this.f244687y;
    }

    public final AppBrandRuntime getRuntime() {
        return this.f244687y.getRuntime();
    }

    /* renamed from: h */
    public boolean mo116296h(long j, String str, C83817h4 h4Var, JSONObject jSONObject) {
        Assert.assertTrue(mo116287L());
        if (!getCurrentPageView().mo116198u0(j, str, h4Var, jSONObject, true)) {
            return false;
        }
        mo116228N(str, getCurrentPageView());
        mo116304r(j, "onAppRoute", h4Var, (m0$$c0) null, jSONObject);
        return true;
    }

    /* renamed from: i */
    public int mo116297i(int i, JSONObject jSONObject, boolean z) {
        C83780d1 currentPageView = getCurrentPageView();
        if (currentPageView == null || !currentPageView.mo116205x1()) {
            return 0;
        }
        C83817h4 h4Var = C83817h4.NAVIGATE_BACK;
        long hash = (long) Objects.hash(new Object[]{2, Long.valueOf(Util.currentTicks())});
        int v0 = currentPageView.mo116200v0(hash, i, z);
        mo116228N(getCurrentPageView().mo116162Q0(), getCurrentPageView());
        if (z) {
            mo116304r(hash, "onAppRoute", h4Var, (m0$$c0) null, jSONObject);
        }
        return v0;
    }

    /* renamed from: l */
    public final void mo116298l(long j, C83817h4 h4Var, JSONObject jSONObject) {
        Assert.assertTrue(mo116287L());
        mo116304r(j, "onAppRouteDone", h4Var, (m0$$c0) null, jSONObject);
        mo116285I();
        if (h4Var == C83817h4.NAVIGATE_BACK) {
            mo116308x();
        }
    }

    /* renamed from: n */
    public abstract void mo116232n(String str, String str2, int[] iArr);

    /* renamed from: o */
    public final void mo116299o(long j, C83817h4 h4Var, m0$$c0 m0__c0, JSONObject jSONObject) {
        mo116304r(j, "onAppRoute", h4Var, m0__c0, jSONObject);
    }

    public final void onAnimationEnd() {
        super.onAnimationEnd();
        Iterator it = ((HashSet) this.f244680E).iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        ((HashSet) this.f244680E).clear();
    }

    public final void onConfigurationChanged(Configuration configuration) {
        if (this.f244676A) {
            this.f244677B = true;
        }
        C83780d1 currentPageView = getCurrentPageView();
        if (currentPageView != null && currentPageView.mo116158M0() != null) {
            currentPageView.mo116158M0().mo116488R(configuration);
        }
    }

    public void onMeasure(int i, int i2) {
        if (!this.f244678C && this.f244676A && !this.f244677B && this.f244681F > 0 && this.f244682G > 0) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(this.f244681F, 1073741824), View.MeasureSpec.makeMeasureSpec(this.f244682G, 1073741824));
            return;
        }
        super.onMeasure(i, i2);
        this.f244681F = getMeasuredWidth();
        this.f244682G = getMeasuredHeight();
    }

    /* renamed from: q */
    public final void mo116303q(long j, C83817h4 h4Var) {
        if (this.f244687y != null) {
            mo116223C();
            mo116304r(j, "onAppRouteDone", h4Var, (m0$$c0) null, (JSONObject) null);
            this.f244687y.mo116359k(getCurrentPageView());
            C83970x2 x2Var = this.f244687y.f244753x;
            x2Var.getClass();
            x2Var.mo116604a(j, "routeStartTime", Long.valueOf(Util.nowMilliSecond()), false);
        }
    }

    /* renamed from: r */
    public final void mo116304r(long j, String str, C83817h4 h4Var, m0$$c0 m0__c0, JSONObject jSONObject) {
        C83817h4 h4Var2;
        int B0;
        int componentId;
        int i;
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        JSONObject jSONObject4;
        JSONObject jSONObject5;
        long j2 = j;
        String str2 = str;
        C83817h4 h4Var3 = h4Var;
        m0$$c0 m0__c02 = m0__c0;
        HashMap hashMap = new HashMap();
        boolean equals = "onAppRouteDone".equals(str2);
        String currentUrl = getCurrentUrl();
        String a = C89925n.m112488a(currentUrl);
        Map<String, String> b = C89925n.m112489b(currentUrl);
        hashMap.put("path", a);
        hashMap.put(SearchIntents.EXTRA_QUERY, b);
        hashMap.put("rawPath", currentUrl);
        C83970x2 x2Var = this.f244687y.f244753x;
        x2Var.getClass();
        Objects.requireNonNull(h4Var);
        if (x2Var.f245152b.get(j2, (Object) null) != h4Var3 || (h4Var2 = x2Var.f245151a.get(j2, (Object) null)) == null) {
            h4Var2 = h4Var3;
        } else {
            Log.m105925i("MicroMsg.AppBrandPageContainer.AppRouteMetricsContext", "restore target(%s) -> source(%s), routeId:%d, isAppRouteDone:%b", h4Var3, h4Var2, Long.valueOf(j), Boolean.valueOf(equals));
        }
        hashMap.put("openType", h4Var2.f244671d);
        if (m0__c02 != null) {
            hashMap.put("pipMode", m0__c02.f244767d);
        }
        if (!equals) {
            hashMap.put("qualityData", this.f244687y.f244753x.f245153c.get(j2));
            C90086e eVar = (C90086e) getCurrentPageView().mo116150E0(C90086e.class);
            hashMap.put("resizing", Boolean.valueOf(eVar != null && eVar.mo116460a()));
            if (C83817h4.NAVIGATE_BACK != h4Var3) {
                C81634a appConfig = this.f244687y.getAppConfig();
                if (((!appConfig.mo113986e() || (jSONObject5 = appConfig.f239596D) == null || jSONObject5.length() == 0) ? appConfig.f239595C : appConfig.f239596D) != null) {
                    C81634a appConfig2 = this.f244687y.getAppConfig();
                    hashMap.put("page", ((!appConfig2.mo113986e() || (jSONObject4 = appConfig2.f239596D) == null || jSONObject4.length() == 0) ? appConfig2.f239595C : appConfig2.f239596D).opt(a));
                }
                C81634a appConfig3 = this.f244687y.getAppConfig();
                if (((!appConfig3.mo113986e() || (jSONObject3 = appConfig3.f239598F) == null || jSONObject3.length() == 0) ? appConfig3.f239597E : appConfig3.f239598F) != null) {
                    String o = C90599h.m113522o(a, 0, a.lastIndexOf(".html"));
                    C81634a appConfig4 = this.f244687y.getAppConfig();
                    hashMap.put("preloadRule", ((!appConfig4.mo113986e() || (jSONObject2 = appConfig4.f239598F) == null || jSONObject2.length() == 0) ? appConfig4.f239597E : appConfig4.f239598F).opt(o));
                }
            }
        }
        C83780d1 currentPageView = getCurrentPageView();
        if (!equals) {
            if (currentPageView.f244584y0) {
                hashMap.put("notFound", Boolean.TRUE);
            }
            if (C83817h4.REWRITE_ROUTE == h4Var3) {
                synchronized (currentPageView.f244565Q0) {
                    currentPageView.getComponentId();
                    i = currentPageView.f244567R0[0];
                }
                hashMap.put("originalWebviewId", Integer.valueOf(i));
            }
            C83905r1 M0 = currentPageView.mo116158M0();
            if (M0 != null) {
                M0.mo116489S(hashMap, h4Var3);
            }
        }
        if (currentPageView.mo116205x1()) {
            synchronized (currentPageView.f244565Q0) {
                B0 = currentPageView.mo116147B0();
                componentId = currentPageView.getComponentId();
            }
            JSONObject jSONObject6 = jSONObject == null ? new JSONObject() : jSONObject;
            try {
                jSONObject6.put("pageId", B0);
                jSONObject6.put("windowId", componentId);
                jSONObject6.put("isNewEngineHomePage", B0 == componentId);
            } catch (JSONException e) {
                Log.m105921e("MicroMsg.AppBrandPageView", "dispatchRouteImpl, event:%s, type:%s, put viewId for customRoute, get exception:%s", e);
            }
            hashMap.put("singlePageData", jSONObject6);
        }
        int optInt = getCurrentPageView().mo116205x1() ? ((JSONObject) hashMap.get("singlePageData")).optInt("pageId", 0) : getCurrentPageView().getComponentId();
        C48016e.m53378d(hashMap);
        String jSONObject7 = new JSONObject(hashMap).toString();
        Log.m105925i("MicroMsg.AppBrandPage", "dispatchRoute, appId:%s, event:%s, type:%s, webviewId:%d, pageId:%d, rawPath:%s, data:%s", getAppId(), str2, h4Var3.f244671d, Integer.valueOf(getCurrentPageView().getComponentId()), Integer.valueOf(optInt), currentUrl, jSONObject7);
        getCurrentPageView().mo109651e(str2, jSONObject7, (int[]) null);
    }

    /* renamed from: s */
    public abstract C83780d1 mo116233s(int i, boolean z);

    public void setForceDisableMeasureCache(boolean z) {
        this.f244678C = z;
    }

    public abstract void setInitialUrl(String str);

    public void setIsAnimating(boolean z) {
        C83780d1 currentPageView = getCurrentPageView();
        if (currentPageView != null) {
            currentPageView.mo116189p1(z);
        }
    }

    /* renamed from: t */
    public C90337g mo116307t(C90339i iVar) {
        C90337g gVar;
        synchronized (this.f244679D) {
            gVar = (C90337g) ((HashMap) this.f244679D).get(iVar);
        }
        return gVar;
    }

    /* renamed from: v */
    public abstract boolean mo116235v(String str);

    /* renamed from: x */
    public final void mo116308x() {
        C89917h.m112458a(getContext());
        C85004y d = C85004y.m104825d(getContentView());
        if (d != null) {
            d.mo117928c();
        }
    }

    /* renamed from: y */
    public boolean mo116309y(int[] iArr, int i) {
        if (iArr == null || iArr.length == 0) {
            return true;
        }
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: z */
    public void mo116310z() {
        C87690d.m109091b("AppBrandPageProfile| " + getLocalClassName() + " initView()", new C83823c());
    }
}
