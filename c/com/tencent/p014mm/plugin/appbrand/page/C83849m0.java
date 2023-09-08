package com.tencent.p014mm.plugin.appbrand.page;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Looper;
import android.os.SystemClock;
import android.view.Choreographer;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.FrameLayout;
import androidx.camera.core.FocusMeteringAction;
import br0.C39836d;
import bt0.C79808b;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntime;
import com.tencent.p014mm.plugin.appbrand.C81547b0;
import com.tencent.p014mm.plugin.appbrand.C81879g;
import com.tencent.p014mm.plugin.appbrand.C85045z;
import com.tencent.p014mm.plugin.appbrand.config.C81634a;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82531i;
import com.tencent.p014mm.plugin.appbrand.page.C83810g4;
import com.tencent.p014mm.plugin.appbrand.pip.C84021a;
import com.tencent.p014mm.plugin.appbrand.pip.C84025a0;
import com.tencent.p014mm.plugin.appbrand.pip.C84028c;
import com.tencent.p014mm.plugin.appbrand.pip.C84036e;
import com.tencent.p014mm.plugin.appbrand.pip.C84043h;
import com.tencent.p014mm.plugin.appbrand.pip.C84045j;
import com.tencent.p014mm.plugin.appbrand.pip.C84046k;
import com.tencent.p014mm.plugin.appbrand.pip.C84047l;
import com.tencent.p014mm.plugin.appbrand.pip.C84055p;
import com.tencent.p014mm.plugin.appbrand.pip.C84056q;
import com.tencent.p014mm.plugin.appbrand.pip.C84057r;
import com.tencent.p014mm.plugin.appbrand.pip.C84059t;
import com.tencent.p014mm.plugin.appbrand.widget.AppBrandPipContainerView;
import com.tencent.p014mm.plugin.appbrand.widget.input.C85004y;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import fm0.C86958m;
import fm0.m$$a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import junit.framework.Assert;
import org.json.JSONObject;
import p170ic.C87690d;
import p225rc.C89925n;
import qq0.C89797e;
import sq0.C13773f;
import sq0.C90333e;
import sq0.C90339i;

/* renamed from: com.tencent.mm.plugin.appbrand.page.m0 */
public class C83849m0 extends FrameLayout {

    /* renamed from: G */
    public static final /* synthetic */ int f244729G = 0;

    /* renamed from: A */
    public boolean f244730A = true;

    /* renamed from: B */
    public m0$$a0 f244731B;

    /* renamed from: C */
    public m0$$d0 f244732C = null;

    /* renamed from: D */
    public m0$$c0 f244733D = null;

    /* renamed from: E */
    public boolean f244734E = false;

    /* renamed from: F */
    public m0$$z f244735F = null;

    /* renamed from: d */
    public volatile boolean f244736d = false;

    /* renamed from: e */
    public AppBrandRuntime f244737e;

    /* renamed from: f */
    public String f244738f;

    /* renamed from: g */
    public boolean f244739g = false;

    /* renamed from: h */
    public boolean f244740h = false;

    /* renamed from: i */
    public m0$$v f244741i;

    /* renamed from: j */
    public m0$$w f244742j;

    /* renamed from: n */
    public final Map<C90339i, C90333e> f244743n = new HashMap();

    /* renamed from: o */
    public final byte[] f244744o = new byte[0];

    /* renamed from: p */
    public final LinkedList<C83820i0> f244745p = new LinkedList<>();

    /* renamed from: q */
    public final LinkedList<C83820i0> f244746q = new LinkedList<>();

    /* renamed from: r */
    public final LinkedList<m0$$x> f244747r = new LinkedList<>();

    /* renamed from: s */
    public C83780d1 f244748s;

    /* renamed from: t */
    public C83780d1 f244749t;

    /* renamed from: u */
    public boolean f244750u = false;

    /* renamed from: v */
    public C83820i0 f244751v;

    /* renamed from: w */
    public C83810g4 f244752w;

    /* renamed from: x */
    public final C83970x2 f244753x = new C83970x2();

    /* renamed from: y */
    public long f244754y = 500;

    /* renamed from: z */
    public final C83758a3 f244755z = new C83758a3();

    public C83849m0(Context context, AppBrandRuntime appBrandRuntime) {
        super(context);
        Log.m105925i("MicroMsg.AppBrandPageContainer", "AppBrandPageContainerProfile| <init> appId[%s]", appBrandRuntime.f238147j);
        this.f244737e = appBrandRuntime;
        this.f244738f = appBrandRuntime.f238147j;
        this.f244752w = new C83810g4.C83811a();
    }

    /* renamed from: f */
    public static void m103129f(C83849m0 m0Var, int i, String str, JSONObject jSONObject, C13773f fVar) {
        m0Var.mo116366r();
        boolean z = false;
        long hash = (long) Objects.hash(new Object[]{2, Long.valueOf(Util.currentTicks())});
        Object[] objArr = new Object[4];
        objArr[0] = Integer.valueOf(i);
        objArr[1] = str;
        objArr[2] = Integer.valueOf(jSONObject == null ? -1 : jSONObject.length());
        if (fVar != null) {
            z = true;
        }
        objArr[3] = Boolean.valueOf(z);
        Log.m105925i("MicroMsg.AppBrandPageContainer", "navigateBackImpl delta:%d, scene:%s, customArgs.length:%s, interceptorCallback:%b", objArr);
        C83861o0 o0Var = new C83861o0(m0Var, i, jSONObject, hash);
        boolean i0 = m0Var.mo116356i0(str, o0Var);
        if (fVar != null) {
            m$$a m__a = (m$$a) fVar;
            C86958m mVar = m__a.f252399a;
            C81879g gVar = m__a.f252400b;
            int i2 = m__a.f252401c;
            if (i0) {
                gVar.mo109647a(i2, mVar.f252398h.mo115109j("fail:navigateBack intercepted"));
            } else {
                gVar.mo109647a(i2, mVar.f252398h.mo115109j("ok"));
            }
        }
        if (!i0) {
            o0Var.run();
        }
    }

    /* renamed from: A */
    public final void mo116330A(long j, String str, C83817h4 h4Var, boolean z, JSONObject jSONObject) {
        int size;
        C83820i0 currentPage;
        C83820i0 peekFirst;
        C83820i0 i0Var;
        boolean z2;
        C83820i0 i0Var2;
        C83780d1 currentPageView;
        long j2 = j;
        String str2 = str;
        C83817h4 h4Var2 = h4Var;
        C83817h4 h4Var3 = C83817h4.AUTO_RE_LAUNCH;
        C83817h4 h4Var4 = C83817h4.REDIRECT_TO;
        synchronized (this.f244744o) {
            size = this.f244746q.size();
            currentPage = getCurrentPage();
        }
        Object[] objArr = new Object[6];
        objArr[0] = Long.valueOf(j);
        objArr[1] = str2;
        objArr[2] = h4Var2;
        objArr[3] = Integer.valueOf(size);
        objArr[4] = Boolean.valueOf(z);
        objArr[5] = Integer.valueOf(jSONObject == null ? -1 : jSONObject.length());
        Log.m105925i("MicroMsg.AppBrandPageContainer", "navigateToNext: routeId:%d, url:%s, type:%s), Staging Count: %d, disableAnimation %b, customArgs.size:%d", objArr);
        if (currentPage != null && currentPage.mo116287L()) {
            C81634a.C81643i d = getAppConfig().mo113985d();
            if (currentPage.getCurrentPageView().mo116207y1(str2) && (d == null || !d.mo113990a(str2) || d.f239643f)) {
                if (C83829i4.m103115b(h4Var)) {
                    mo116355i(currentPage, (C83820i0) null);
                }
                currentPage.mo116296h(j, str, h4Var, jSONObject);
                return;
            } else if (h4Var.ordinal() == 3 && currentPage.getCurrentRenderPagesCount() > 1) {
                synchronized (this.f244744o) {
                    this.f244747r.push(new m0$$c(currentPage));
                }
                Log.m105925i("MicroMsg.AppBrandPageContainer", "navigateToNext: routeId:%d, redirectTo -> navigateTo", Long.valueOf(j));
                C83970x2 x2Var = this.f244753x;
                C83817h4 h4Var5 = C83817h4.NAVIGATE_TO;
                x2Var.f245151a.put(j2, h4Var4);
                x2Var.f245152b.put(j2, h4Var5);
                long j3 = j;
                x2Var.mo116604a(j3, "routePageOpenType", h4Var4, false);
                mo116330A(j3, str, h4Var5, z, jSONObject);
                return;
            }
        }
        C83820i0 i0Var3 = (C83820i0) C87690d.m109090a("AppBrandPageContainerProfile| createPage", new m0$$e(this, str2, h4Var2));
        Objects.requireNonNull(i0Var3);
        synchronized (this.f244744o) {
            peekFirst = this.f244745p.peekFirst();
        }
        if (i0Var3.getContentView() == null) {
            i0Var3.setInitialUrl(str2);
            i0Var3.mo116310z();
        }
        boolean z3 = z | (!C83829i4.m103114a(h4Var));
        boolean z4 = z3;
        C83820i0 i0Var4 = i0Var3;
        m0$$c0 H = mo110177H(peekFirst, i0Var3, h4Var, str, !z3);
        ViewGroup viewGroup = (ViewGroup) i0Var4.getParent();
        if (viewGroup != null) {
            Log.printErrStackTrace("MicroMsg.AppBrandPageContainer", new Throwable(), "page already has a parent", new Object[0]);
            i0Var = i0Var4;
            viewGroup.removeView(i0Var);
        } else {
            i0Var = i0Var4;
        }
        addView(i0Var, 0);
        m0$$f m0__f = r1;
        C83820i0 i0Var5 = i0Var;
        m0$$f m0__f2 = new m0$$f(this, h4Var, peekFirst, i0Var, j);
        m0__f.f244775e = z4;
        synchronized (this.f244744o) {
            try {
                this.f244746q.push(i0Var5);
                this.f244747r.push(m0__f);
                if (this.f244745p.size() == 0) {
                    postDelayed(m0__f, FocusMeteringAction.DEFAULT_AUTOCANCEL_DURATION);
                } else if (h4Var2 == h4Var3) {
                    postOnAnimation(m0__f);
                } else {
                    postDelayed(m0__f, this.f244754y);
                }
                if (!(h4Var2 == h4Var4 || h4Var2 == C83817h4.REWRITE_ROUTE || h4Var2 == C83817h4.SWITCH_TAB || h4Var2 == C83817h4.RE_LAUNCH)) {
                    if (h4Var2 != h4Var3) {
                        z2 = false;
                        if ((z2 && C83829i4.m103115b(h4Var)) || (i0Var2 = this.f244745p.peekFirst()) == null || i0Var2 == i0Var5) {
                            i0Var2 = null;
                        }
                        Log.m105925i("MicroMsg.AppBrandPageContainer", "navigateToNext mStagingStack push done, appId[%s] url[%s] type[%s]", getAppId(), str2, h4Var2);
                    }
                }
                z2 = true;
                if (!(z2 && C83829i4.m103115b(h4Var)) && (i0Var2 = this.f244745p.peekFirst()) == null) {
                    Log.m105925i("MicroMsg.AppBrandPageContainer", "navigateToNext mStagingStack push done, appId[%s] url[%s] type[%s]", getAppId(), str2, h4Var2);
                }
                i0Var2 = null;
                Log.m105925i("MicroMsg.AppBrandPageContainer", "navigateToNext mStagingStack push done, appId[%s] url[%s] type[%s]", getAppId(), str2, h4Var2);
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        if (!(i0Var2 == null || (currentPageView = i0Var2.getCurrentPageView()) == null)) {
            for (C82531i.C82539h a : currentPageView.f244657w.f241650i) {
                a.mo114872a();
            }
        }
        i0Var5.getCurrentPageView().mo116272g0(new m0$$g(this, Util.currentTicks(), h4Var, str, i0Var5, m0__f));
        if (C83817h4.APP_LAUNCH == h4Var2) {
            i0Var5.getCurrentPageView().f244578Y = true;
        }
        i0Var5.mo114316B(j, str2, h4Var2);
        mo116024I(i0Var5, h4Var2);
        i0Var5.mo116299o(j, h4Var, H, jSONObject);
    }

    /* renamed from: B */
    public void mo116023B() {
        boolean z;
        C83820i0 currentPage = getCurrentPage();
        if (currentPage != null && !currentPage.getCurrentPageView().mo116170Y0()) {
            synchronized (this.f244744o) {
                z = !this.f244746q.isEmpty();
            }
            if (z || currentPage.getTag(C0966R.C0970id.f5951t6) != null) {
                Log.m105928w("MicroMsg.AppBrandPageContainer", "onBackPressed, has navigating pages, skip");
            } else {
                mo116338c0(new C1952z0(this, "scene_back_key_pressed"));
            }
        }
    }

    /* renamed from: C */
    public void mo110172C() {
        C83820i0 peekFirst;
        synchronized (this.f244744o) {
            peekFirst = this.f244745p.peekFirst();
        }
        if (peekFirst != null && !peekFirst.f244676A) {
            peekFirst.f244676A = true;
            peekFirst.mo116224D();
        }
    }

    /* renamed from: D */
    public void mo110173D() {
    }

    /* renamed from: E */
    public void mo110174E() {
        C83820i0 peekFirst;
        synchronized (this.f244744o) {
            peekFirst = this.f244745p.peekFirst();
        }
        if (peekFirst != null) {
            if (peekFirst.f244676A) {
                peekFirst.f244676A = false;
                peekFirst.f244677B = false;
                peekFirst.mo116226F();
            }
            if (this.f244739g) {
                Log.m105919d("MicroMsg.AppBrandPageContainer", "onForeground, call onUserVisible, appId[%s] url[%s]", getAppId(), peekFirst.getCurrentPageView().mo116162Q0());
                peekFirst.getCurrentPageView().f244553E.setActuallyVisible(true);
            }
        }
    }

    /* renamed from: F */
    public m0$$c0 mo110175F(C83820i0 i0Var, C83820i0 i0Var2) {
        Objects.requireNonNull(i0Var2);
        Object[] objArr = new Object[4];
        objArr[0] = getAppId();
        objArr[1] = i0Var == null ? null : C89925n.m112488a(i0Var.getCurrentUrl());
        objArr[2] = C89925n.m112488a(i0Var2.getCurrentUrl());
        objArr[3] = Boolean.valueOf(this.f244739g);
        Log.m105925i("MicroMsg.AppBrandPageContainer", "onNavigateBack, appId[%s] out[%s], in[%s], mActuallyVisible[%b]", objArr);
        if (this.f244739g) {
            i0Var2.getCurrentPageView().f244553E.setActuallyVisible(true);
        }
        if (i0Var != null) {
            i0Var.mo116308x();
        }
        C89797e eVar = getRuntime().f238159x;
        C83780d1 currentPageView = i0Var2.getCurrentPageView();
        C83817h4 h4Var = C83817h4.NAVIGATE_BACK;
        eVar.mo124090c(currentPageView, h4Var);
        mo116336a0(i0Var2.getCurrentPageView());
        mo116363o(h4Var, i0Var, i0Var2);
        return this.f244733D;
    }

    /* renamed from: G */
    public void mo110176G(C83820i0 i0Var, C83820i0 i0Var2, C83817h4 h4Var) {
        Object[] objArr = new Object[5];
        objArr[0] = getAppId();
        objArr[1] = i0Var == null ? null : C89925n.m112488a(i0Var.getCurrentUrl());
        objArr[2] = C89925n.m112488a(i0Var2.getCurrentUrl());
        objArr[3] = Boolean.valueOf(this.f244739g);
        objArr[4] = h4Var;
        Log.m105925i("MicroMsg.AppBrandPageContainer", "onNavigateEnd, appId[%s] out[%s], in[%s], mActuallyVisible[%b], type[%s]", objArr);
        if (this.f244739g) {
            i0Var2.getCurrentPageView().f244553E.setActuallyVisible(true);
        }
        if (C83817h4.APP_LAUNCH != h4Var) {
            getRuntime().f238159x.mo124090c(i0Var2.getCurrentPageView(), h4Var);
        }
        if (mo115881f0(i0Var2)) {
            i0Var2.getCurrentPageView().mo116185n0();
        }
        mo116336a0(i0Var2.getCurrentPageView());
    }

    /* renamed from: H */
    public m0$$c0 mo110177H(C83820i0 i0Var, C83820i0 i0Var2, C83817h4 h4Var, String str, boolean z) {
        Object[] objArr = new Object[5];
        objArr[0] = getAppId();
        objArr[1] = i0Var == null ? null : C89925n.m112488a(i0Var.getCurrentUrl());
        objArr[2] = C89925n.m112488a(str);
        objArr[3] = Boolean.valueOf(this.f244739g);
        objArr[4] = h4Var;
        Log.m105925i("MicroMsg.AppBrandPageContainer", "onNavigateStart, appId[%s] out[%s], in[%s], mActuallyVisible[%b], type[%s]", objArr);
        if (i0Var != null) {
            i0Var.mo116308x();
        }
        mo116363o(h4Var, i0Var, i0Var2);
        if (C83817h4.APP_LAUNCH == h4Var) {
            getRuntime().f238159x.mo124090c(i0Var2.getCurrentPageView(), h4Var);
            mo116336a0(i0Var2.getCurrentPageView());
        }
        if (!(i0Var == null || i0Var.getCurrentPageView() == null || i0Var.getCurrentPageView().f244570T == null)) {
            i0Var.getCurrentPageView().f244570T.mo125168b(false);
        }
        if (!(i0Var == null || i0Var.getCurrentPageView() == null || i0Var.getCurrentPageView().mo116151F0() == null || !i0Var.getCurrentPageView().mo116151F0().mo62479g())) {
            i0Var.getCurrentPageView().mo116151F0().mo62476d();
        }
        return this.f244733D;
    }

    /* renamed from: I */
    public void mo116024I(C83820i0 i0Var, C83817h4 h4Var) {
    }

    /* renamed from: J */
    public final void mo116331J() {
        if (this.f244737e != null && this.f244730A) {
            m0$$a0 m0__a0 = this.f244731B;
            if (m0__a0 != null) {
                C85045z.C85046a aVar = (C85045z.C85046a) m0__a0;
                AppBrandRuntime appBrandRuntime = C85045z.this.f247827d;
                Log.m105925i("MicroMsg.AppBrandRuntime", "AppBrandRuntimeProfile|appId:%s, launch -> ready, cost %d", appBrandRuntime.f238147j, Long.valueOf(Util.currentTicks() - appBrandRuntime.f238160x0));
                Log.m105925i("MicroMsg.AppBrandRuntime", "AppBrandRuntimeProfile|appId:%s, initRuntimeImpl -> ready, cost %d", appBrandRuntime.f238147j, Long.valueOf(Util.currentTicks() - appBrandRuntime.f238162y0));
                appBrandRuntime.mo113020N0(new C81547b0(appBrandRuntime));
                AppBrandRuntime.m99065f(C85045z.this.f247827d, (Configuration) null);
            }
            mo116029P();
            this.f244730A = false;
        }
    }

    /* renamed from: K */
    public void mo116025K(C83817h4 h4Var, C83820i0 i0Var, C83820i0 i0Var2) {
    }

    /* renamed from: L */
    public void mo116026L(C83817h4 h4Var, C83820i0 i0Var, C83820i0 i0Var2) {
        View contentView;
        if (i0Var != i0Var2 && i0Var != null && (contentView = i0Var.getContentView()) != null) {
            Log.m105924i("MicroMsg.AppBrandPageContainer", "fixAccessibilityPageSwitchIssueOnEnd, " + i0Var.getCurrentUrl());
            contentView.setImportantForAccessibility(4);
        }
    }

    /* renamed from: N */
    public void mo116027N(C83817h4 h4Var, C83820i0 i0Var, C83820i0 i0Var2, float f) {
    }

    /* renamed from: O */
    public void mo116028O(C83817h4 h4Var, C83820i0 i0Var, C83820i0 i0Var2) {
        View contentView;
        if (i0Var != i0Var2 && i0Var2 != null && (contentView = i0Var2.getContentView()) != null) {
            Log.m105924i("MicroMsg.AppBrandPageContainer", "fixAccessibilityPageSwitchIssueOnStart, " + i0Var2.getCurrentUrl());
            contentView.setImportantForAccessibility(1);
        }
    }

    /* renamed from: P */
    public void mo116029P() {
    }

    /* renamed from: Q */
    public final void mo116332Q(String str) {
        C83780d1 d1Var;
        if (!MMHandlerThread.isMainThread()) {
            getRuntime().mo113024P0(new m0$$k(this, str));
        } else if (this.f244736d) {
            Log.m105929w("MicroMsg.AppBrandPageContainer", "preloadNext, destroyed, appId:%s, reason:%s", getAppId(), str);
        } else if (!this.f244739g) {
            this.f244740h = true;
            Log.m105925i("MicroMsg.AppBrandPageContainer", "preloadNext, deferred, appId:%s, reason:%s", getAppId(), str);
        } else {
            this.f244740h = false;
            m0$$v m0__v = this.f244741i;
            if (m0__v != null && m0__v.mo116037c(str)) {
                Log.m105925i("MicroMsg.AppBrandPageContainer", "preloadNext, intercepted, appId:%s, reason:%s", getAppId(), str);
            } else if (this.f244748s != null) {
                Log.m105925i("MicroMsg.AppBrandPageContainer", "preloadNext, already preloaded, appId:%s, reason:%s", getAppId(), str);
            } else {
                long currentTimeMillis = System.currentTimeMillis();
                m0$$v m0__v2 = this.f244741i;
                if (m0__v2 == null || (d1Var = m0__v2.mo115880d(this, "preload")) == null) {
                    d1Var = null;
                }
                if (d1Var == null) {
                    d1Var = new C83780d1();
                }
                d1Var.f244576W = getDecorWidgetFactory();
                d1Var.mo116166U0(getContext(), this.f244737e);
                d1Var.mo116273h0();
                addView(d1Var.f244552D, 0);
                this.f244748s = d1Var;
                Log.m105925i("MicroMsg.AppBrandPageContainer", "preloadNextPageView: appId:%s, cost:%d, reason:%s", getAppId(), Long.valueOf(System.currentTimeMillis() - currentTimeMillis), str);
            }
        }
    }

    /* renamed from: R */
    public boolean mo116030R() {
        C83780d1 d1Var;
        if (!MMHandlerThread.isMainThread()) {
            getRuntime().mo113024P0(new m0$$l(this));
            return true;
        } else if (this.f244749t != null) {
            Log.m105925i("MicroMsg.AppBrandPageContainer", "preloadNextSkylineView, already preloaded, appId:%s", getAppId());
            return true;
        } else {
            long currentTimeMillis = System.currentTimeMillis();
            m0$$v m0__v = this.f244741i;
            if (m0__v == null || (d1Var = m0__v.mo115880d(this, "preload_skyline")) == null) {
                d1Var = null;
            }
            if (d1Var == null) {
                d1Var = new C83780d1();
            }
            d1Var.f244576W = getDecorWidgetFactory();
            d1Var.mo116166U0(getContext(), this.f244737e);
            d1Var.mo116273h0();
            addView(d1Var.f244552D, 0);
            this.f244749t = d1Var;
            Log.m105925i("MicroMsg.AppBrandPageContainer", "preloadNextPageView: appId:%s, cost:%d", getAppId(), Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
            return true;
        }
    }

    /* renamed from: S */
    public final void mo116333S(C83817h4 h4Var, C83820i0 i0Var, C83820i0 i0Var2, m0$$b0 m0__b0) {
        Log.m105918d("MicroMsg.AppBrandPageContainer", "processPageSwitchResult, pageSwitchResult: " + m0__b0);
        Object obj = m0__b0.f244761a;
        if (obj instanceof ValueAnimator) {
            ValueAnimator valueAnimator = (ValueAnimator) obj;
            valueAnimator.addListener(new m0$$o(this, h4Var, i0Var, i0Var2));
            valueAnimator.addUpdateListener(new m0$$p(this, h4Var, i0Var, i0Var2));
        } else if (obj instanceof Animation) {
            Animation animation = (Animation) obj;
            Choreographer.getInstance().postFrameCallback(new m0$$q(this, SystemClock.elapsedRealtime(), animation.getDuration(), h4Var, i0Var, i0Var2, animation));
        } else {
            mo116361m(h4Var, i0Var, i0Var2);
        }
    }

    /* renamed from: T */
    public Object mo116031T(C83820i0 i0Var) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(i0Var, "translationX", new float[]{-(((float) i0Var.getWidth()) * 0.25f), 0.0f});
        ofFloat.setDuration(250);
        return ofFloat;
    }

    /* renamed from: U */
    public Object mo116032U(C83820i0 i0Var) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(i0Var, "translationX", new float[]{0.0f, (float) i0Var.getWidth()});
        ofFloat.setDuration(250);
        return ofFloat;
    }

    /* renamed from: W */
    public Object mo116033W(C83820i0 i0Var) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(i0Var, "translationX", new float[]{(float) i0Var.getWidth(), 0.0f});
        ofFloat.setDuration(250);
        return ofFloat;
    }

    /* renamed from: X */
    public Object mo116034X(C83820i0 i0Var) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(i0Var, "translationX", new float[]{0.0f, -(((float) i0Var.getWidth()) * 0.25f)});
        ofFloat.setDuration(250);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(i0Var, "translationX", new float[]{0.0f});
        ofFloat2.setDuration(0);
        new AnimatorSet().playSequentially(new Animator[]{ofFloat, ofFloat2});
        return ofFloat;
    }

    /* renamed from: Y */
    public void mo116334Y(C90339i iVar, C90333e eVar) {
        if (eVar != null && iVar != null) {
            synchronized (this.f244743n) {
                ((HashMap) this.f244743n).put(iVar, eVar);
            }
        }
    }

    /* renamed from: Z */
    public final void mo116335Z(C83820i0 i0Var) {
        m0$$d0 m0__d0 = this.f244732C;
        if (m0__d0 != null) {
            C84045j jVar = (C84045j) m0__d0;
            String str = jVar.f245393a.f245415a;
            Log.m105924i(str, "onPageDestroy, page: " + C84059t.m103576j(i0Var));
            if (!i0Var.f244686K) {
                C83780d1 currentPageView = i0Var.getCurrentPageView();
                String str2 = jVar.f245393a.f245415a;
                Log.m105924i(str2, "onPageDestroy, remove " + currentPageView + " from mPageView2PageScopedPipInfoMap");
                ((ConcurrentHashMap) jVar.f245393a.f245421g).remove(Integer.valueOf(currentPageView.hashCode()));
            } else {
                String str3 = jVar.f245393a.f245415a;
                Log.m105924i(str3, "onPageDestroy, " + C84059t.m103576j(i0Var) + " is PipVideoRelated");
            }
            C84059t tVar = jVar.f245393a;
            C83820i0 i0Var2 = tVar.f245427m;
            if (i0Var2 != null && i0Var == i0Var2) {
                tVar.f245428n = false;
                tVar.f245418d.setPipVideoRelatedPage(i0Var2);
            }
        }
        i0Var.setVisibility(8);
        if (!i0Var.f244676A) {
            i0Var.f244676A = true;
            i0Var.mo116224D();
        }
        if (!i0Var.f244686K) {
            i0Var.mo116225E();
        }
        removeView(i0Var);
        if (!i0Var.f244686K) {
            i0Var.mo116229f();
            i0Var.f244687y = null;
        }
        if (getRuntime() != null && getRuntime().mo113026R() != null && ((C85004y) getRuntime().mo113026R().findViewById(C0966R.C0970id.f6025v7)) != null) {
            ((C85004y) getRuntime().mo113026R().findViewById(C0966R.C0970id.f6025v7)).requestLayout();
        }
    }

    /* renamed from: a0 */
    public final void mo116336a0(C83780d1 d1Var) {
        C83854n nVar = getRuntime().f238125T0;
        C39836d F0 = d1Var.mo116151F0();
        nVar.f244874h = F0;
        F0.mo62473a(new C83863o2(nVar));
        getRuntime().f238125T0.mo116445w(new m0$$r(this, d1Var));
    }

    /* renamed from: b0 */
    public final boolean mo116337b0(int i, String str) {
        C83780d1 d1Var;
        int i2;
        int i3 = i;
        String str2 = str;
        if (i3 != 0) {
            C83780d1 q = mo116365q(i3, false);
            if (q == null) {
                Log.m105929w("MicroMsg.AppBrandPageContainer", "rewriteRoute invalid page appId:%s, webviewId:%d, url:%s", getAppId(), Integer.valueOf(i), str2);
                return false;
            }
            d1Var = q;
        } else if (getCurrentPage() == null || (d1Var = getCurrentPage().getCurrentPageView()) == null) {
            Log.m105929w("MicroMsg.AppBrandPageContainer", "rewriteRoute invalid page appId:%s, url:%s", getAppId(), str2);
            return false;
        }
        C83817h4 h4Var = C83817h4.REWRITE_ROUTE;
        long hash = (long) Objects.hash(new Object[]{4, Long.valueOf(Util.currentTicks())});
        if (d1Var.mo116205x1() || d1Var.mo116207y1(str2)) {
            throw new UnsupportedOperationException();
        } else if (d1Var.f244584y0) {
            synchronized (d1Var.f244565Q0) {
                d1Var.f244569S0 = new int[0];
                d1Var.getComponentId();
            }
            synchronized (d1Var.f244565Q0) {
                d1Var.getComponentId();
                i2 = d1Var.f244567R0[0];
            }
            int componentId = d1Var.getComponentId();
            d1Var.mo109652f("webviewIdChanged", String.format(Locale.ENGLISH, "{webviewId: %d}", new Object[]{Integer.valueOf(componentId)}), 0);
            Log.m105925i("MicroMsg.AppBrandPageView", "rewriteRoute --START-- appId:%s, url[%s]->[%s], componentId[%d]->[%d]", d1Var.getAppId(), d1Var.mo116162Q0(), str2, Integer.valueOf(i2), Integer.valueOf(componentId));
            d1Var.f244584y0 = false;
            d1Var.f244572U.mo116227J(hash, str2);
            d1Var.f244572U.mo116299o(hash, h4Var, (m0$$c0) null, (JSONObject) null);
            d1Var.f244572U.mo116303q(hash, h4Var);
            Log.m105925i("MicroMsg.AppBrandPageView", "rewriteRoute --END-- appId:%s, rewrittenURL:%s, rewrittenComponentId:%d", d1Var.getAppId(), str2, Integer.valueOf(d1Var.getComponentId()));
            return true;
        } else {
            Log.m105929w("MicroMsg.AppBrandPageView", "rewriteRoute condition mismatch, appId:%s, currentURL:%s, rewrittenURL:%s", d1Var.getAppId(), d1Var.mo116162Q0(), str2);
            return false;
        }
    }

    /* renamed from: c0 */
    public final void mo116338c0(Runnable runnable) {
        if (Looper.myLooper() == null || Looper.myLooper() != Looper.getMainLooper()) {
            AppBrandRuntime appBrandRuntime = this.f244737e;
            if (appBrandRuntime == null) {
                Log.m105929w("MicroMsg.AppBrandPageContainer", "runOnUiThread but mRuntime==NULL, appId:%s, stack:%s", getAppId(), android.util.Log.getStackTraceString(new Throwable()));
                return;
            }
            appBrandRuntime.mo113024P0(runnable);
            return;
        }
        runnable.run();
    }

    /* renamed from: e0 */
    public final void mo116339e0(C83780d1 d1Var) {
        boolean z;
        if (!MMHandlerThread.isMainThread()) {
            getRuntime().mo113024P0(new m0$$i(this, d1Var));
            return;
        }
        C83758a3 a3Var = this.f244755z;
        a3Var.getClass();
        boolean z2 = true;
        if (d1Var != null && a3Var.indexOfKey(d1Var.getComponentId()) < 0) {
            a3Var.put(d1Var.getComponentId(), d1Var.getComponentId());
            z = true;
        } else {
            z = false;
        }
        if (z && d1Var.f244572U != null) {
            synchronized (this.f244744o) {
                if (this.f244746q.contains(d1Var.f244572U)) {
                    z2 = false;
                }
            }
            if (z2) {
                mo116359k(d1Var);
            }
        }
    }

    /* renamed from: f0 */
    public boolean mo115881f0(C83820i0 i0Var) {
        C83780d1 currentPageView = i0Var.getCurrentPageView();
        if (currentPageView == null) {
            Log.m105921e("MicroMsg.AppBrandPageContainer", "shouldShowActionBarHomeButton, appId:%s, page:%s, get NULL PageView", getAppId(), i0Var.getCurrentUrl());
            return false;
        }
        boolean z = !i0Var.getCurrentUrl().startsWith(getRuntime().mo113008F().mo113983b());
        boolean[] zArr = new boolean[3];
        zArr[0] = (getPageCount() == 1 && z) || (currentPageView.mo116157L0() != null && currentPageView.mo116157L0().f239667q && getPageCount() != 1 && z);
        C79808b bVar = currentPageView.f244554F;
        zArr[1] = bVar != null && !bVar.f233903v;
        zArr[2] = !(i0Var instanceof C83966x);
        for (int i = 0; i < 3; i++) {
            if (!zArr[i]) {
                Log.m105925i("MicroMsg.AppBrandPageContainer", "[%s,%s]->shouldShowActionBarHomeButton: test fail cause #[%d] condition,", i0Var.getAppId(), i0Var.getCurrentUrl(), Integer.valueOf(i));
                return false;
            }
        }
        return true;
    }

    /* renamed from: g */
    public final void mo116340g(C83820i0 i0Var) {
        i0Var.clearAnimation();
        Object tag = i0Var.getTag(C0966R.C0970id.f5951t6);
        if (tag instanceof Animator) {
            Animator animator = (Animator) tag;
            animator.cancel();
            animator.removeAllListeners();
            i0Var.setIsAnimating(false);
        } else if (tag instanceof Animation) {
            Animation animation = (Animation) tag;
            animation.setAnimationListener((Animation.AnimationListener) null);
            animation.cancel();
            i0Var.setIsAnimating(false);
        }
    }

    /* renamed from: g0 */
    public final Object mo116341g0(C83820i0 i0Var, Object obj, Runnable runnable) {
        if (obj instanceof Animator) {
            Animator animator = (Animator) obj;
            mo116340g(i0Var);
            i0Var.setTag(C0966R.C0970id.f5951t6, animator);
            animator.addListener(new m0$$m(this, i0Var, runnable));
            animator.start();
        } else if (obj instanceof Animation) {
            Animation animation = (Animation) obj;
            animation.setAnimationListener(new m0$$n(this, runnable, i0Var));
            mo116340g(i0Var);
            i0Var.setTag(C0966R.C0970id.f5951t6, animation);
            i0Var.startAnimation(animation);
        } else if (obj != null) {
            throw new IllegalArgumentException("Page animation should be Animator or Animation");
        } else if (runnable != null) {
            runnable.run();
        }
        i0Var.setIsAnimating(true);
        return obj;
    }

    public final int getActualPageStackSize() {
        int size;
        synchronized (this.f244744o) {
            size = this.f244745p.size();
        }
        return size;
    }

    public final C81634a getAppConfig() {
        return this.f244737e.mo113008F();
    }

    public String getAppId() {
        return this.f244738f;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0062, code lost:
        return r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00b5, code lost:
        return r6;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.tencent.p014mm.plugin.appbrand.page.C83820i0 getCurrentPage() {
        /*
            r10 = this;
            byte[] r0 = r10.f244744o
            monitor-enter(r0)
            r1 = 3
            r2 = 2
            r3 = 4
            r4 = 1
            r5 = 0
            java.util.LinkedList<com.tencent.mm.plugin.appbrand.page.i0> r6 = r10.f244746q     // Catch:{ all -> 0x00b6 }
            boolean r6 = r6.isEmpty()     // Catch:{ all -> 0x00b6 }
            if (r6 != 0) goto L_0x0063
            java.util.LinkedList<com.tencent.mm.plugin.appbrand.page.i0> r6 = r10.f244746q     // Catch:{ all -> 0x00b6 }
            java.lang.Object r6 = r6.getFirst()     // Catch:{ all -> 0x00b6 }
            com.tencent.mm.plugin.appbrand.page.i0 r6 = (com.tencent.p014mm.plugin.appbrand.page.C83820i0) r6     // Catch:{ all -> 0x00b6 }
            com.tencent.mm.plugin.appbrand.AppBrandRuntime r7 = r10.f244737e     // Catch:{ all -> 0x00ff }
            if (r7 == 0) goto L_0x0061
            boolean r7 = r7.mo113039X0()     // Catch:{ all -> 0x00ff }
            if (r7 == 0) goto L_0x002a
            com.tencent.mm.plugin.appbrand.AppBrandRuntime r7 = r10.f244737e     // Catch:{ all -> 0x00ff }
            boolean r7 = r7.f238116N     // Catch:{ all -> 0x00ff }
            if (r7 != 0) goto L_0x002a
            r7 = 1
            goto L_0x002b
        L_0x002a:
            r7 = 0
        L_0x002b:
            if (r6 != 0) goto L_0x0061
            if (r7 != 0) goto L_0x0061
            java.lang.String r7 = "MicroMsg.AppBrandPageContainer"
            java.lang.String r8 = "getCurrentPage returns NULL, appId[%s] mStagingStack.size[%d] mPageStack.size[%d] stack:%s"
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ all -> 0x00ff }
            java.lang.String r9 = r10.getAppId()     // Catch:{ all -> 0x00ff }
            r3[r5] = r9     // Catch:{ all -> 0x00ff }
            java.util.LinkedList<com.tencent.mm.plugin.appbrand.page.i0> r5 = r10.f244746q     // Catch:{ all -> 0x00ff }
            int r5 = r5.size()     // Catch:{ all -> 0x00ff }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x00ff }
            r3[r4] = r5     // Catch:{ all -> 0x00ff }
            java.util.LinkedList<com.tencent.mm.plugin.appbrand.page.i0> r4 = r10.f244745p     // Catch:{ all -> 0x00ff }
            int r4 = r4.size()     // Catch:{ all -> 0x00ff }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x00ff }
            r3[r2] = r4     // Catch:{ all -> 0x00ff }
            java.lang.Throwable r2 = new java.lang.Throwable     // Catch:{ all -> 0x00ff }
            r2.<init>()     // Catch:{ all -> 0x00ff }
            java.lang.String r2 = android.util.Log.getStackTraceString(r2)     // Catch:{ all -> 0x00ff }
            r3[r1] = r2     // Catch:{ all -> 0x00ff }
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r7, r8, r3)     // Catch:{ all -> 0x00ff }
        L_0x0061:
            monitor-exit(r0)     // Catch:{ all -> 0x00ff }
            return r6
        L_0x0063:
            java.util.LinkedList<com.tencent.mm.plugin.appbrand.page.i0> r6 = r10.f244745p     // Catch:{ all -> 0x00b6 }
            java.lang.Object r6 = r6.peekFirst()     // Catch:{ all -> 0x00b6 }
            com.tencent.mm.plugin.appbrand.page.i0 r6 = (com.tencent.p014mm.plugin.appbrand.page.C83820i0) r6     // Catch:{ all -> 0x00b6 }
            com.tencent.mm.plugin.appbrand.AppBrandRuntime r7 = r10.f244737e     // Catch:{ all -> 0x00ff }
            if (r7 == 0) goto L_0x00b4
            boolean r7 = r7.mo113039X0()     // Catch:{ all -> 0x00ff }
            if (r7 == 0) goto L_0x007d
            com.tencent.mm.plugin.appbrand.AppBrandRuntime r7 = r10.f244737e     // Catch:{ all -> 0x00ff }
            boolean r7 = r7.f238116N     // Catch:{ all -> 0x00ff }
            if (r7 != 0) goto L_0x007d
            r7 = 1
            goto L_0x007e
        L_0x007d:
            r7 = 0
        L_0x007e:
            if (r6 != 0) goto L_0x00b4
            if (r7 != 0) goto L_0x00b4
            java.lang.String r7 = "MicroMsg.AppBrandPageContainer"
            java.lang.String r8 = "getCurrentPage returns NULL, appId[%s] mStagingStack.size[%d] mPageStack.size[%d] stack:%s"
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ all -> 0x00ff }
            java.lang.String r9 = r10.getAppId()     // Catch:{ all -> 0x00ff }
            r3[r5] = r9     // Catch:{ all -> 0x00ff }
            java.util.LinkedList<com.tencent.mm.plugin.appbrand.page.i0> r5 = r10.f244746q     // Catch:{ all -> 0x00ff }
            int r5 = r5.size()     // Catch:{ all -> 0x00ff }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x00ff }
            r3[r4] = r5     // Catch:{ all -> 0x00ff }
            java.util.LinkedList<com.tencent.mm.plugin.appbrand.page.i0> r4 = r10.f244745p     // Catch:{ all -> 0x00ff }
            int r4 = r4.size()     // Catch:{ all -> 0x00ff }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x00ff }
            r3[r2] = r4     // Catch:{ all -> 0x00ff }
            java.lang.Throwable r2 = new java.lang.Throwable     // Catch:{ all -> 0x00ff }
            r2.<init>()     // Catch:{ all -> 0x00ff }
            java.lang.String r2 = android.util.Log.getStackTraceString(r2)     // Catch:{ all -> 0x00ff }
            r3[r1] = r2     // Catch:{ all -> 0x00ff }
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r7, r8, r3)     // Catch:{ all -> 0x00ff }
        L_0x00b4:
            monitor-exit(r0)     // Catch:{ all -> 0x00ff }
            return r6
        L_0x00b6:
            r6 = move-exception
            com.tencent.mm.plugin.appbrand.AppBrandRuntime r7 = r10.f244737e     // Catch:{ all -> 0x00ff }
            if (r7 == 0) goto L_0x00fe
            boolean r7 = r7.mo113039X0()     // Catch:{ all -> 0x00ff }
            if (r7 == 0) goto L_0x00c9
            com.tencent.mm.plugin.appbrand.AppBrandRuntime r7 = r10.f244737e     // Catch:{ all -> 0x00ff }
            boolean r7 = r7.f238116N     // Catch:{ all -> 0x00ff }
            if (r7 != 0) goto L_0x00c9
            r7 = 1
            goto L_0x00ca
        L_0x00c9:
            r7 = 0
        L_0x00ca:
            if (r7 != 0) goto L_0x00fe
            java.lang.String r7 = "MicroMsg.AppBrandPageContainer"
            java.lang.String r8 = "getCurrentPage returns NULL, appId[%s] mStagingStack.size[%d] mPageStack.size[%d] stack:%s"
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ all -> 0x00ff }
            java.lang.String r9 = r10.getAppId()     // Catch:{ all -> 0x00ff }
            r3[r5] = r9     // Catch:{ all -> 0x00ff }
            java.util.LinkedList<com.tencent.mm.plugin.appbrand.page.i0> r5 = r10.f244746q     // Catch:{ all -> 0x00ff }
            int r5 = r5.size()     // Catch:{ all -> 0x00ff }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x00ff }
            r3[r4] = r5     // Catch:{ all -> 0x00ff }
            java.util.LinkedList<com.tencent.mm.plugin.appbrand.page.i0> r4 = r10.f244745p     // Catch:{ all -> 0x00ff }
            int r4 = r4.size()     // Catch:{ all -> 0x00ff }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x00ff }
            r3[r2] = r4     // Catch:{ all -> 0x00ff }
            java.lang.Throwable r2 = new java.lang.Throwable     // Catch:{ all -> 0x00ff }
            r2.<init>()     // Catch:{ all -> 0x00ff }
            java.lang.String r2 = android.util.Log.getStackTraceString(r2)     // Catch:{ all -> 0x00ff }
            r3[r1] = r2     // Catch:{ all -> 0x00ff }
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r7, r8, r3)     // Catch:{ all -> 0x00ff }
        L_0x00fe:
            throw r6     // Catch:{ all -> 0x00ff }
        L_0x00ff:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00ff }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.page.C83849m0.getCurrentPage():com.tencent.mm.plugin.appbrand.page.i0");
    }

    public String getCurrentUrl() {
        C83820i0 currentPage = getCurrentPage();
        if (currentPage != null) {
            return currentPage.getCurrentUrl();
        }
        return null;
    }

    public C83810g4 getDecorWidgetFactory() {
        return this.f244752w;
    }

    public List<C90333e> getNavigateBackInterceptorChain() {
        synchronized (this.f244743n) {
            if (((HashMap) this.f244743n).size() != 0) {
                if (getCurrentPage() != null) {
                    ArrayList arrayList = new ArrayList(((HashMap) this.f244743n).values());
                    Collections.sort(arrayList, new m0$$h(this));
                    return arrayList;
                }
            }
            return null;
        }
    }

    public final int getPageCount() {
        int size;
        synchronized (this.f244744o) {
            size = this.f244745p.size() + this.f244746q.size();
        }
        return size;
    }

    public final C83780d1 getPageView() {
        if (this.f244736d) {
            return null;
        }
        boolean a = this.f244737e.mo113044a();
        C83820i0 currentPage = getCurrentPage();
        if (currentPage == null) {
            if (a) {
                Assert.fail("getPageView() assert by NULL page, appId=" + getAppId());
            }
            return null;
        }
        C83780d1 currentPageView = currentPage.getCurrentPageView();
        if (currentPageView == null && a) {
            Assert.fail("getPageView() assert by NULL pv, appId=" + getAppId());
        }
        return currentPageView;
    }

    public final List<C83780d1> getPreloadedPageView() {
        LinkedList linkedList = new LinkedList();
        C83780d1 d1Var = this.f244748s;
        if (d1Var != null) {
            linkedList.add(d1Var);
        }
        C83780d1 d1Var2 = this.f244749t;
        if (d1Var2 != null) {
            linkedList.add(d1Var2);
        }
        return linkedList;
    }

    public final int getRenderPagesCount() {
        int i;
        synchronized (this.f244744o) {
            i = 0;
            Iterator<C83820i0> it = this.f244745p.iterator();
            while (it.hasNext()) {
                i += it.next().getCurrentPageView().mo116148C0();
            }
            Iterator<C83820i0> it4 = this.f244746q.iterator();
            while (it4.hasNext()) {
                i += it4.next().getCurrentPageView().mo116148C0();
            }
        }
        return i;
    }

    public AppBrandRuntime getRuntime() {
        return this.f244737e;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:14|15|16|17) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x0053 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0061 */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo116353h() {
        /*
            r6 = this;
            r0 = 1
            r6.f244736d = r0
            r6.mo110173D()
            java.util.LinkedList r1 = new java.util.LinkedList
            r1.<init>()
            java.util.LinkedList<com.tencent.mm.plugin.appbrand.page.i0> r2 = r6.f244745p
            monitor-enter(r2)
            java.util.LinkedList<com.tencent.mm.plugin.appbrand.page.i0> r3 = r6.f244745p     // Catch:{ all -> 0x0081 }
            r1.addAll(r3)     // Catch:{ all -> 0x0081 }
            java.util.LinkedList<com.tencent.mm.plugin.appbrand.page.i0> r3 = r6.f244746q     // Catch:{ all -> 0x0081 }
            r1.addAll(r3)     // Catch:{ all -> 0x0081 }
            java.util.LinkedList<com.tencent.mm.plugin.appbrand.page.i0> r3 = r6.f244745p     // Catch:{ all -> 0x0081 }
            r3.clear()     // Catch:{ all -> 0x0081 }
            java.util.LinkedList<com.tencent.mm.plugin.appbrand.page.i0> r3 = r6.f244746q     // Catch:{ all -> 0x0081 }
            r3.clear()     // Catch:{ all -> 0x0081 }
            monitor-exit(r2)     // Catch:{ all -> 0x0081 }
            java.util.Iterator r2 = r1.iterator()
        L_0x0027:
            boolean r3 = r2.hasNext()
            r4 = 0
            if (r3 == 0) goto L_0x0049
            java.lang.Object r3 = r2.next()
            com.tencent.mm.plugin.appbrand.page.i0 r3 = (com.tencent.p014mm.plugin.appbrand.page.C83820i0) r3
            boolean r5 = r3.f244676A
            if (r5 != 0) goto L_0x003d
            r3.f244676A = r0
            r3.mo116224D()
        L_0x003d:
            r3.mo116225E()
            r3.mo116229f()
            r3.f244687y = r4
            r6.mo116340g(r3)
            goto L_0x0027
        L_0x0049:
            r1.clear()
            com.tencent.mm.plugin.appbrand.page.d1 r0 = r6.f244748s
            if (r0 == 0) goto L_0x005a
            r0.mo116174c1()     // Catch:{ Exception -> 0x0053 }
        L_0x0053:
            com.tencent.mm.plugin.appbrand.page.d1 r0 = r6.f244748s     // Catch:{ Exception -> 0x0059 }
            r0.mo114329F()     // Catch:{ Exception -> 0x0059 }
            goto L_0x005a
        L_0x0059:
        L_0x005a:
            com.tencent.mm.plugin.appbrand.page.d1 r0 = r6.f244749t
            if (r0 == 0) goto L_0x0066
            r0.mo116174c1()     // Catch:{ Exception -> 0x0061 }
        L_0x0061:
            com.tencent.mm.plugin.appbrand.page.d1 r0 = r6.f244749t     // Catch:{ Exception -> 0x0066 }
            r0.mo114329F()     // Catch:{ Exception -> 0x0066 }
        L_0x0066:
            r6.removeAllViews()
            r6.f244731B = r4
            r6.f244737e = r4
            r6.f244732C = r4
            com.tencent.mm.plugin.appbrand.page.x2 r0 = r6.f244753x
            android.util.LongSparseArray<com.tencent.mm.plugin.appbrand.page.h4> r1 = r0.f245151a
            r1.clear()
            android.util.LongSparseArray<com.tencent.mm.plugin.appbrand.page.h4> r1 = r0.f245152b
            r1.clear()
            android.util.LongSparseArray<java.util.Map<java.lang.String, java.lang.Object>> r0 = r0.f245153c
            r0.clear()
            return
        L_0x0081:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0081 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.page.C83849m0.mo116353h():void");
    }

    /* renamed from: h0 */
    public final void mo116354h0(long j, C83820i0 i0Var, C83820i0 i0Var2, C83817h4 h4Var, m0$$c0 m0__c0) {
        Object obj;
        long j2 = j;
        C83820i0 i0Var3 = i0Var;
        C83820i0 i0Var4 = i0Var2;
        C83817h4 h4Var2 = h4Var;
        synchronized (this.f244744o) {
            this.f244745p.remove(i0Var4);
            this.f244746q.remove(i0Var4);
        }
        boolean z = !i0Var4.f244683H;
        mo116340g(i0Var4);
        Object obj2 = null;
        if (z) {
            m0$$x j0 = mo116358j0(new m0$$a(this, i0Var4));
            Object U = mo116032U(i0Var4);
            mo116341g0(i0Var4, U, j0);
            obj = U;
        } else {
            mo116335Z(i0Var4);
            obj = null;
        }
        Log.m105925i("MicroMsg.AppBrandPageContainer", "switchPageClear, in: %s out: %s", i0Var.getCurrentUrl(), i0Var2.getCurrentUrl());
        Log.m105919d("MicroMsg.AppBrandPageContainer", "switchPageClear, dispatchRoute, type: %s, pipMode: %s", h4Var2, m0__c0);
        i0Var.mo116299o(j, h4Var, m0__c0, (JSONObject) null);
        if (i0Var3.f244676A) {
            i0Var3.f244676A = false;
            i0Var3.f244677B = false;
            i0Var.mo116226F();
        }
        mo116340g(i0Var3);
        if (z) {
            m0$$x j05 = mo116358j0(new m0$$b(i0Var3, j2, h4Var2));
            obj2 = mo116031T(i0Var3);
            mo116341g0(i0Var3, obj2, j05);
        } else {
            i0Var3.mo116303q(j2, h4Var2);
        }
        mo116333S(h4Var2, i0Var4, i0Var3, new m0$$b0(obj2, obj));
    }

    /* renamed from: i */
    public final void mo116355i(C83820i0 i0Var, C83820i0 i0Var2) {
        LinkedList<C83820i0> linkedList = new LinkedList<>();
        synchronized (this.f244744o) {
            boolean z = false;
            Iterator<C83820i0> it = this.f244745p.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C83820i0 next = it.next();
                if (next == i0Var) {
                    z = true;
                } else if (next == i0Var2) {
                    break;
                } else if (z) {
                    linkedList.add(next);
                    it.remove();
                    this.f244746q.remove(next);
                }
            }
        }
        for (C83820i0 i0Var3 : linkedList) {
            mo116340g(i0Var3);
            mo116335Z(i0Var3);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:4:0x000c A[LOOP:0: B:4:0x000c->B:7:0x0020, LOOP_START, PHI: r1 
      PHI: (r1v1 boolean) = (r1v0 boolean), (r1v5 boolean) binds: [B:3:0x0008, B:7:0x0020] A[DONT_GENERATE, DONT_INLINE]] */
    /* renamed from: i0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo116356i0(java.lang.String r4, java.lang.Runnable r5) {
        /*
            r3 = this;
            java.util.List r0 = r3.getNavigateBackInterceptorChain()
            r1 = 0
            if (r0 != 0) goto L_0x0008
            return r1
        L_0x0008:
            java.util.Iterator r0 = r0.iterator()
        L_0x000c:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0022
            java.lang.Object r1 = r0.next()
            sq0.e r1 = (sq0.C90333e) r1
            com.tencent.mm.plugin.appbrand.AppBrandRuntime r2 = r3.getRuntime()
            boolean r1 = r1.mo124560b(r2, r4, r5)
            if (r1 == 0) goto L_0x000c
        L_0x0022:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.page.C83849m0.mo116356i0(java.lang.String, java.lang.Runnable):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x003e, code lost:
        if (r3 == 1) goto L_0x0006;
     */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0029  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x005e  */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.tencent.p014mm.plugin.appbrand.page.C83820i0 mo116357j(java.lang.String r5, com.tencent.p014mm.plugin.appbrand.page.C83817h4 r6) {
        /*
            r4 = this;
            com.tencent.mm.plugin.appbrand.page.h4 r0 = com.tencent.p014mm.plugin.appbrand.page.C83817h4.SWITCH_TAB
            r1 = 0
            r2 = 1
            if (r6 != r0) goto L_0x0008
        L_0x0006:
            r1 = 1
            goto L_0x0052
        L_0x0008:
            com.tencent.mm.plugin.appbrand.page.h4 r0 = com.tencent.p014mm.plugin.appbrand.page.C83817h4.RE_LAUNCH
            if (r6 == r0) goto L_0x0044
            com.tencent.mm.plugin.appbrand.page.h4 r0 = com.tencent.p014mm.plugin.appbrand.page.C83817h4.AUTO_RE_LAUNCH
            if (r6 != r0) goto L_0x0011
            goto L_0x0044
        L_0x0011:
            byte[] r0 = r4.f244744o
            monitor-enter(r0)
            com.tencent.mm.plugin.appbrand.page.h4 r3 = com.tencent.p014mm.plugin.appbrand.page.C83817h4.REDIRECT_TO     // Catch:{ all -> 0x0041 }
            if (r6 == r3) goto L_0x001f
            com.tencent.mm.plugin.appbrand.page.h4 r3 = com.tencent.p014mm.plugin.appbrand.page.C83817h4.REWRITE_ROUTE     // Catch:{ all -> 0x0041 }
            if (r6 != r3) goto L_0x001d
            goto L_0x001f
        L_0x001d:
            r6 = 0
            goto L_0x0020
        L_0x001f:
            r6 = 1
        L_0x0020:
            java.util.LinkedList<com.tencent.mm.plugin.appbrand.page.i0> r3 = r4.f244745p     // Catch:{ all -> 0x0041 }
            int r3 = r3.size()     // Catch:{ all -> 0x0041 }
            int r3 = r3 + r2
            if (r6 == 0) goto L_0x002b
            r6 = 1
            goto L_0x002c
        L_0x002b:
            r6 = 0
        L_0x002c:
            int r3 = r3 - r6
            monitor-exit(r0)     // Catch:{ all -> 0x0041 }
            com.tencent.mm.plugin.appbrand.AppBrandRuntime r6 = r4.f244737e
            com.tencent.mm.plugin.appbrand.config.a r6 = r6.mo113008F()
            com.tencent.mm.plugin.appbrand.config.a$i r6 = r6.mo113985d()
            boolean r5 = r6.mo113990a(r5)
            if (r5 == 0) goto L_0x0052
            if (r3 != r2) goto L_0x0052
            goto L_0x0006
        L_0x0041:
            r5 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0041 }
            throw r5
        L_0x0044:
            com.tencent.mm.plugin.appbrand.AppBrandRuntime r6 = r4.f244737e
            com.tencent.mm.plugin.appbrand.config.a r6 = r6.mo113008F()
            com.tencent.mm.plugin.appbrand.config.a$i r6 = r6.mo113985d()
            boolean r1 = r6.mo113990a(r5)
        L_0x0052:
            if (r1 == 0) goto L_0x005e
            com.tencent.mm.plugin.appbrand.page.x r5 = new com.tencent.mm.plugin.appbrand.page.x
            android.content.Context r6 = r4.getContext()
            r5.<init>(r6, r4)
            return r5
        L_0x005e:
            com.tencent.mm.plugin.appbrand.page.d2 r5 = new com.tencent.mm.plugin.appbrand.page.d2
            android.content.Context r6 = r4.getContext()
            r5.<init>(r6, r4)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.page.C83849m0.mo116357j(java.lang.String, com.tencent.mm.plugin.appbrand.page.h4):com.tencent.mm.plugin.appbrand.page.i0");
    }

    /* renamed from: j0 */
    public final m0$$x mo116358j0(Runnable runnable) {
        m0$$s m0__s = new m0$$s(this, runnable);
        synchronized (this.f244744o) {
            this.f244747r.push(m0__s);
        }
        return m0__s;
    }

    /* renamed from: k */
    public void mo116359k(C83780d1 d1Var) {
        int indexOfKey;
        C83758a3 a3Var = this.f244755z;
        a3Var.getClass();
        boolean z = false;
        if (d1Var != null && (indexOfKey = a3Var.indexOfKey(d1Var.getComponentId())) >= 0) {
            a3Var.removeAt(indexOfKey);
            z = true;
        }
        if (z) {
            postDelayed(new m0$$j(this), 200);
        }
    }

    /* renamed from: l */
    public void mo116360l(C83817h4 h4Var, C83820i0 i0Var, C83820i0 i0Var2) {
        boolean z;
        C84028c cVar;
        C84021a.C84024c cVar2;
        mo116363o(h4Var, i0Var, i0Var2);
        mo116025K(h4Var, i0Var, i0Var2);
        m0$$z m0__z = this.f244735F;
        if (m0__z != null) {
            C84047l lVar = (C84047l) m0__z;
            lVar.getClass();
            String j = C84059t.m103576j(i0Var);
            String j2 = C84059t.m103576j(i0Var2);
            Log.m105925i(lVar.f245396b.f245415a, "onPageSwitchCancel, type: %s, oldPage: %s, newPage: %s", h4Var, j, j2);
            C84059t tVar = lVar.f245396b;
            boolean z2 = tVar.f245434t;
            if (z2 && tVar.f245427m != null && tVar.f245419e != null) {
                tVar.f245433s = null;
                Log.m105924i(lVar.f245396b.f245415a, "onPageSwitchCancel, mPipVideoTargetPageViewId about null");
                C84059t tVar2 = lVar.f245396b;
                if (i0Var != tVar2.f245427m || !tVar2.mo116714l(true)) {
                    z = false;
                } else {
                    C84059t tVar3 = lVar.f245396b;
                    C84036e eVar = tVar3.f245413B;
                    if (!(eVar == null || (cVar2 = tVar3.f245429o) == null)) {
                        ((C84025a0) eVar).mo116680b(cVar2.f245309h, C84043h.OTHERS);
                    }
                    lVar.f245396b.mo116707a("onPageSwitchCancel");
                    lVar.f245396b.mo116709f(false, false);
                    z = true;
                }
                C84059t tVar4 = lVar.f245396b;
                if (tVar4.f245435u && (cVar = tVar4.f245424j) != null) {
                    cVar.mo116684c();
                }
                C84059t tVar5 = lVar.f245396b;
                tVar5.f245434t = false;
                tVar5.f245435u = false;
                tVar5.f245419e.mo117662f(true ^ z);
            } else if (z2) {
                Log.m105924i(tVar.f245415a, "onPageSwitchCancel, isTransfering but mPipVideoRelatedPage or mPipContainerView is null");
            } else if (i0Var == null) {
                Log.m105928w(tVar.f245415a, "onPageSwitchCancel, oldPage is null");
            } else {
                tVar.f245433s = Integer.valueOf(i0Var.getCurrentPageView().hashCode());
                C84059t tVar6 = lVar.f245396b;
                Log.m105925i(tVar6.f245415a, "onPageSwitchCancel, mPipVideoTargetPageViewId: %d(%s)", tVar6.f245433s, j2);
            }
        }
        this.f244734E = false;
    }

    /* renamed from: m */
    public final void mo116361m(C83817h4 h4Var, C83820i0 i0Var, C83820i0 i0Var2) {
        C84028c cVar;
        C83780d1 currentPageView;
        mo116363o(h4Var, i0Var, i0Var2);
        mo116026L(h4Var, i0Var, i0Var2);
        m0$$z m0__z = this.f244735F;
        if (m0__z != null) {
            C84047l lVar = (C84047l) m0__z;
            Log.m105925i(lVar.f245396b.f245415a, "onPageSwitchEnd, pageOpenType: %s, oldPage: %s, page: %s", h4Var, C84059t.m103576j(i0Var), C84059t.m103576j(i0Var2));
            if (!(i0Var == null || (currentPageView = i0Var.getCurrentPageView()) == null)) {
                C84021a aVar = (C84021a) ((ConcurrentHashMap) lVar.f245396b.f245421g).get(Integer.valueOf(currentPageView.hashCode()));
                if (!(aVar == null || C83817h4.NAVIGATE_BACK != h4Var || i0Var == lVar.f245396b.f245427m)) {
                    Log.m105924i(aVar.f245291a, "markCurPageDestroy");
                    synchronized (aVar.f245295e) {
                        aVar.f245296f.clear();
                        aVar.f245297g.clear();
                        aVar.f245298h.clear();
                    }
                    ((ConcurrentHashMap) aVar.f245299i).clear();
                }
            }
            C84059t tVar = lVar.f245396b;
            if (tVar.f245434t && tVar.f245435u) {
                Log.m105924i(tVar.f245415a, "onPageSwitchEnd, tryTransferFrom, isBack: " + lVar.f245395a);
                if (lVar.f245396b.mo116714l(true)) {
                    C84059t tVar2 = lVar.f245396b;
                    if (!(tVar2.f245413B == null || tVar2.f245429o == null)) {
                        C84043h hVar = C84043h.OTHERS;
                        if (tVar2.f245431q) {
                            hVar = C84043h.PIP_CLICKED;
                        } else if (!lVar.f245395a) {
                            hVar = C84043h.PAGE_RE_LAUNCH;
                        }
                        C84059t tVar3 = lVar.f245396b;
                        ((C84025a0) tVar3.f245413B).mo116680b(tVar3.f245429o.f245309h, hVar);
                    }
                    lVar.f245396b.mo116707a("onPageSwitchEnd 0");
                    if (!lVar.f245395a) {
                        Log.m105924i(lVar.f245396b.f245415a, "onPageSwitchEnd, clearPipVideoRelated");
                    }
                    C84059t tVar4 = lVar.f245396b;
                    boolean z = !lVar.f245395a;
                    tVar4.mo116709f(z, z);
                }
                lVar.f245396b.f245431q = false;
                C84059t tVar5 = lVar.f245396b;
                tVar5.f245435u = false;
                tVar5.f245434t = false;
            }
            C84059t tVar6 = lVar.f245396b;
            if (!(!tVar6.f245434t || tVar6.f245426l == null || (cVar = tVar6.f245424j) == null)) {
                cVar.mo116684c();
                C84059t tVar7 = lVar.f245396b;
                tVar7.f245434t = false;
                AppBrandPipContainerView appBrandPipContainerView = tVar7.f245419e;
                if (appBrandPipContainerView != null) {
                    appBrandPipContainerView.mo117662f(true);
                }
                C84059t.m103573b(lVar.f245396b, "onPageSwitchEnd");
            }
            if (C84059t.m103574c(lVar.f245396b)) {
                C84059t tVar8 = lVar.f245396b;
                if (!(tVar8.f245426l == null || tVar8.f245419e == null)) {
                    Log.m105924i(tVar8.f245415a, "onPageSwitchEnd, transferFrom for other video is playing");
                    lVar.f245396b.f245419e.post(new C84046k(lVar));
                }
            }
        }
        this.f244734E = false;
    }

    /* renamed from: n */
    public void mo116362n(C83817h4 h4Var, C83820i0 i0Var, C83820i0 i0Var2, float f) {
        C84028c cVar;
        mo116363o(h4Var, i0Var, i0Var2);
        mo116027N(h4Var, i0Var, i0Var2, f);
        m0$$z m0__z = this.f244735F;
        if (m0__z != null) {
            C84059t tVar = ((C84047l) m0__z).f245396b;
            if (tVar.f245434t && tVar.f245426l != null && (cVar = tVar.f245424j) != null) {
                if (tVar.f245435u) {
                    cVar.mo116686e(100.0f - f);
                } else {
                    cVar.mo116686e(f);
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:93:0x02b9  */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo116363o(com.tencent.p014mm.plugin.appbrand.page.C83817h4 r25, com.tencent.p014mm.plugin.appbrand.page.C83820i0 r26, com.tencent.p014mm.plugin.appbrand.page.C83820i0 r27) {
        /*
            r24 = this;
            r0 = r24
            r1 = r25
            r2 = r27
            boolean r3 = r0.f244734E
            if (r3 != 0) goto L_0x036f
            r24.mo116028O(r25, r26, r27)
            com.tencent.mm.plugin.appbrand.page.m0$$z r3 = r0.f244735F
            r4 = 1
            if (r3 == 0) goto L_0x036c
            com.tencent.mm.plugin.appbrand.pip.l r3 = (com.tencent.p014mm.plugin.appbrand.pip.C84047l) r3
            hm0.b$a r5 = hm0.C87554b.C87555a.PUSH_AND_POP
            java.lang.String r6 = com.tencent.p014mm.plugin.appbrand.pip.C84059t.m103576j(r26)
            java.lang.String r7 = com.tencent.p014mm.plugin.appbrand.pip.C84059t.m103576j(r27)
            com.tencent.mm.plugin.appbrand.pip.t r8 = r3.f245396b
            java.lang.String r8 = r8.f245415a
            r9 = 3
            java.lang.Object[] r9 = new java.lang.Object[r9]
            r10 = 0
            r9[r10] = r1
            r9[r4] = r6
            r6 = 2
            r9[r6] = r7
            java.lang.String r11 = "onPageSwitchStart, pageOpenType: %s, oldPage: %s, page: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r8, r11, r9)
            r8 = 0
            if (r26 == 0) goto L_0x0366
            if (r2 == 0) goto L_0x0366
            com.tencent.mm.plugin.appbrand.pip.t r9 = r3.f245396b
            com.tencent.mm.plugin.appbrand.widget.AppBrandPipContainerView r11 = r9.f245419e
            if (r11 != 0) goto L_0x003f
            goto L_0x0366
        L_0x003f:
            java.lang.String r11 = r9.f245426l
            java.lang.String r12 = "onPageSwitchStart, mPipVideoTargetPageViewId: %d(%s)"
            if (r11 == 0) goto L_0x00a0
            com.tencent.mm.plugin.appbrand.page.i0 r11 = r9.f245427m
            if (r11 == 0) goto L_0x00a0
            if (r2 != r11) goto L_0x004d
            r5 = 1
            goto L_0x004e
        L_0x004d:
            r5 = 0
        L_0x004e:
            r3.f245395a = r5
            if (r5 != 0) goto L_0x005a
            com.tencent.mm.plugin.appbrand.page.h4 r5 = com.tencent.p014mm.plugin.appbrand.page.C83817h4.RE_LAUNCH
            if (r5 == r1) goto L_0x005a
            com.tencent.mm.plugin.appbrand.page.h4 r5 = com.tencent.p014mm.plugin.appbrand.page.C83817h4.AUTO_RE_LAUNCH
            if (r5 != r1) goto L_0x007f
        L_0x005a:
            com.tencent.mm.plugin.appbrand.pip.c r1 = r9.f245424j
            if (r1 == 0) goto L_0x0078
            r9.f245433s = r8
            com.tencent.mm.plugin.appbrand.pip.t r1 = r3.f245396b
            java.lang.String r1 = r1.f245415a
            java.lang.String r2 = "onPageSwitchStart, mPipVideoTargetPageViewId about null"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)
            com.tencent.mm.plugin.appbrand.pip.t r1 = r3.f245396b
            r1.f245434t = r4
            r1.f245435u = r4
            com.tencent.mm.plugin.appbrand.widget.AppBrandPipContainerView r1 = r1.f245419e
            r1.mo117659c()
            com.tencent.mm.plugin.appbrand.page.m0$$c0 r8 = com.tencent.p014mm.plugin.appbrand.page.m0$$c0.MAX
            goto L_0x036a
        L_0x0078:
            java.lang.String r1 = r9.f245415a
            java.lang.String r5 = "onPageSwitchStart, null == mPipContainerOnPageSwitchHandler"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r1, r5)
        L_0x007f:
            com.tencent.mm.plugin.appbrand.pip.t r1 = r3.f245396b
            com.tencent.mm.plugin.appbrand.page.d1 r2 = r27.getCurrentPageView()
            int r2 = r2.hashCode()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r1.f245433s = r2
            com.tencent.mm.plugin.appbrand.pip.t r1 = r3.f245396b
            java.lang.String r2 = r1.f245415a
            java.lang.Object[] r3 = new java.lang.Object[r6]
            java.lang.Integer r1 = r1.f245433s
            r3[r10] = r1
            r3[r4] = r7
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r12, r3)
            goto L_0x036a
        L_0x00a0:
            java.util.Map<java.lang.Integer, com.tencent.mm.plugin.appbrand.pip.a> r9 = r9.f245421g
            java.util.concurrent.ConcurrentHashMap r9 = (java.util.concurrent.ConcurrentHashMap) r9
            java.util.Collection r9 = r9.values()
            java.util.Iterator r9 = r9.iterator()
        L_0x00ac:
            boolean r11 = r9.hasNext()
            if (r11 == 0) goto L_0x00bd
            java.lang.Object r11 = r9.next()
            com.tencent.mm.plugin.appbrand.pip.a r11 = (com.tencent.p014mm.plugin.appbrand.pip.C84021a) r11
            boolean r13 = r11.f245293c
            if (r13 == 0) goto L_0x00ac
            goto L_0x00be
        L_0x00bd:
            r11 = r8
        L_0x00be:
            if (r11 != 0) goto L_0x00c2
            goto L_0x036a
        L_0x00c2:
            com.tencent.mm.plugin.appbrand.page.d1 r9 = r11.f245292b
            com.tencent.mm.plugin.appbrand.page.i0 r9 = r9.f244572U
            boolean r9 = r2.equals(r9)
            if (r9 == 0) goto L_0x00ce
            goto L_0x036a
        L_0x00ce:
            java.lang.String r9 = r11.mo116677b()
            if (r9 != 0) goto L_0x00d6
            r9 = r8
            goto L_0x00e0
        L_0x00d6:
            java.util.Map<java.lang.String, com.tencent.mm.plugin.appbrand.pip.a$c> r13 = r11.f245299i
            java.util.concurrent.ConcurrentHashMap r13 = (java.util.concurrent.ConcurrentHashMap) r13
            java.lang.Object r9 = r13.get(r9)
            com.tencent.mm.plugin.appbrand.pip.a$c r9 = (com.tencent.p014mm.plugin.appbrand.pip.C84021a.C84024c) r9
        L_0x00e0:
            if (r9 != 0) goto L_0x00e4
            goto L_0x036a
        L_0x00e4:
            hm0.g r15 = r9.f245307f
            hm0.h$a r13 = r9.f245305d
            hm0.i r14 = r9.f245308g
            if (r15 == 0) goto L_0x0366
            if (r13 == 0) goto L_0x0366
            if (r14 != 0) goto L_0x00f2
            goto L_0x0366
        L_0x00f2:
            hm0.b$a r10 = r9.f245303b
            com.tencent.mm.plugin.appbrand.pip.t r6 = r3.f245396b
            r6.getClass()
            hm0.b$a r6 = hm0.C87554b.C87555a.PUSH
            if (r6 == r10) goto L_0x00ff
            if (r5 != r10) goto L_0x0105
        L_0x00ff:
            com.tencent.mm.plugin.appbrand.page.h4 r4 = com.tencent.p014mm.plugin.appbrand.page.C83817h4.NAVIGATE_TO
            if (r4 != r1) goto L_0x0105
            r4 = 1
            goto L_0x0106
        L_0x0105:
            r4 = 0
        L_0x0106:
            com.tencent.mm.plugin.appbrand.pip.t r8 = r3.f245396b
            r8.getClass()
            hm0.b$a r8 = hm0.C87554b.C87555a.POP
            if (r8 == r10) goto L_0x0111
            if (r5 != r10) goto L_0x0117
        L_0x0111:
            com.tencent.mm.plugin.appbrand.page.h4 r5 = com.tencent.p014mm.plugin.appbrand.page.C83817h4.NAVIGATE_BACK
            if (r5 != r1) goto L_0x0117
            r1 = 1
            goto L_0x0118
        L_0x0117:
            r1 = 0
        L_0x0118:
            if (r4 != 0) goto L_0x0120
            if (r1 == 0) goto L_0x011d
            goto L_0x0120
        L_0x011d:
            r4 = 0
            goto L_0x0367
        L_0x0120:
            com.tencent.mm.plugin.appbrand.pip.t r1 = r3.f245396b
            java.lang.String r1 = r1.f245415a
            java.lang.String r5 = "onPageSwitchStart, transferTo"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r5)
            com.tencent.mm.plugin.appbrand.pip.t r1 = r3.f245396b
            com.tencent.mm.plugin.appbrand.page.d1 r5 = r26.getCurrentPageView()
            com.tencent.mm.plugin.appbrand.widget.AppBrandPipContainerView r10 = r1.f245419e
            if (r10 != 0) goto L_0x013e
            r22 = r4
            r21 = r6
            r20 = r8
            r23 = r9
            r4 = 0
            goto L_0x02b6
        L_0x013e:
            com.tencent.mm.plugin.appbrand.utils.v1 r10 = r1.f245436v
            if (r10 == 0) goto L_0x0148
            r10.run()
            r10 = 0
            r1.f245436v = r10
        L_0x0148:
            hm0.h r10 = r13.mo109562a(r15)
            r1.f245425k = r10
            com.tencent.mm.plugin.appbrand.pip.x r10 = new com.tencent.mm.plugin.appbrand.pip.x
            r10.<init>(r1)
            com.tencent.mm.plugin.appbrand.pip.y r13 = new com.tencent.mm.plugin.appbrand.pip.y
            r13.<init>(r1)
            java.lang.String r2 = r1.f245415a
            r20 = r8
            java.lang.String r8 = "createVideoContainerView"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r8)
            hm0.h r2 = r1.f245425k
            android.content.Context r8 = r1.f245416b
            android.view.View r2 = r2.mo109555e(r8)
            r1.f245423i = r2
            com.tencent.mm.plugin.appbrand.widget.AppBrandPipContainerView r2 = r1.f245419e
            boolean r8 = r2.f247495q
            java.lang.String r0 = "MicroMsg.AppBrand.AppBrandPipContainerView"
            if (r8 == 0) goto L_0x0185
            java.lang.String r2 = "setInitPositionIfNeed, already set"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r0, r2)
            r22 = r4
            r21 = r6
            r23 = r9
            r16 = r14
            r17 = r15
            goto L_0x0200
        L_0x0185:
            int r8 = r2.getWidth()
            r16 = r14
            int r14 = r2.getHeight()
            r17 = r15
            int r15 = r2.mo117663g(r8)
            r21 = r6
            int r6 = r2.mo117666h(r14)
            r22 = r4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r23 = r9
            java.lang.String r9 = "setInitPositionIfNeed, x: "
            r4.append(r9)
            r4.append(r15)
            java.lang.String r9 = ", y: "
            r4.append(r9)
            r4.append(r6)
            java.lang.String r4 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r4)
            float r4 = (float) r15
            r2.setX(r4)
            float r4 = (float) r6
            r2.setY(r4)
            float r4 = r2.getY()
            r9 = 1
            r2.mo117679s(r4, r9)
            int r4 = r2.mo117669k(r15, r8)
            r2.f247496r = r4
            r2.mo117673o(r6, r14)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r6 = "setPosition, mStablePosX: "
            r4.append(r6)
            int r6 = r2.f247496r
            r4.append(r6)
            java.lang.String r6 = ", mStablePosY: "
            r4.append(r6)
            int r6 = r2.f247497s
            r4.append(r6)
            java.lang.String r4 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r4)
            int r4 = r2.f247496r
            int r6 = r2.f247497s
            r2.mo117660d(r4, r6)
            r4 = 1
            r2.f247495q = r4
        L_0x0200:
            com.tencent.mm.plugin.appbrand.widget.AppBrandPipContainerView r2 = r1.f245419e
            r2.mo117670l()
            com.tencent.mm.plugin.appbrand.pip.c r2 = r1.f245424j
            if (r2 == 0) goto L_0x0234
            java.lang.String r4 = r2.f245331a
            java.lang.String r6 = "release"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r6)
            com.tencent.mm.plugin.appbrand.pip.c$c r4 = r2.f245342l
            if (r4 == 0) goto L_0x022f
            com.tencent.mm.plugin.appbrand.widget.AppBrandPipContainerView r6 = r2.f245333c
            java.util.Set<com.tencent.mm.plugin.appbrand.widget.AppBrandPipContainerView$d> r8 = r6.f247498t
            if (r8 != 0) goto L_0x021c
            goto L_0x022f
        L_0x021c:
            java.util.HashSet r8 = (java.util.HashSet) r8
            r8.remove(r4)
            java.util.Set<com.tencent.mm.plugin.appbrand.widget.AppBrandPipContainerView$d> r4 = r6.f247498t
            java.util.HashSet r4 = (java.util.HashSet) r4
            boolean r4 = r4.isEmpty()
            if (r4 == 0) goto L_0x022f
            r4 = 0
            r6.f247498t = r4
            goto L_0x0230
        L_0x022f:
            r4 = 0
        L_0x0230:
            r6 = 1
            r2.f245339i = r6
            goto L_0x0235
        L_0x0234:
            r4 = 0
        L_0x0235:
            com.tencent.mm.plugin.appbrand.pip.c r2 = new com.tencent.mm.plugin.appbrand.pip.c
            com.tencent.mm.plugin.appbrand.widget.AppBrandPipContainerView r15 = r1.f245419e
            android.view.View r6 = r1.f245423i
            com.tencent.mm.plugin.appbrand.utils.v1 r8 = new com.tencent.mm.plugin.appbrand.utils.v1
            r9 = 2
            r8.<init>(r10, r9, r13)
            r1.f245437w = r8
            r13 = r2
            r9 = r16
            r14 = r5
            r5 = r17
            r16 = r6
            r18 = r9
            r19 = r8
            r13.<init>(r14, r15, r16, r17, r18, r19)
            r1.f245424j = r2
            com.tencent.mm.plugin.appbrand.widget.AppBrandPipContainerView r2 = r1.f245419e
            android.view.View r5 = r1.f245423i
            android.view.ViewGroup r6 = r2.f247503y
            r6.addView(r5)
            android.view.ViewOutlineProvider r6 = r2.f247501w
            r5.setOutlineProvider(r6)
            r6 = 1
            r5.setClipToOutline(r6)
            r2.mo117676p()
            hm0.h r2 = r1.f245425k
            hm0.d r2 = r2.mo109566c()
            boolean r2 = r2.mo122015a()
            if (r2 != 0) goto L_0x0289
            com.tencent.mm.plugin.appbrand.widget.AppBrandPipContainerView r2 = r1.f245419e
            r2.getClass()
            java.lang.String r5 = "disableInfoCovers"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r5)
            r2.mo117676p()
            r2.mo117670l()
            r0 = 0
            r2.f247482G = r0
            goto L_0x028a
        L_0x0289:
            r0 = 0
        L_0x028a:
            com.tencent.mm.plugin.appbrand.pip.c r2 = r1.f245424j
            r5 = 1
            boolean r2 = r2.mo116685d(r5)
            if (r2 == 0) goto L_0x02b6
            java.lang.String r2 = r1.f245415a
            java.lang.String r5 = "transferTo"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r5)
            com.tencent.mm.plugin.appbrand.widget.AppBrandPipContainerView r2 = r1.f245419e
            r2.mo117661e(r0)
            com.tencent.mm.plugin.appbrand.widget.AppBrandPipContainerView r2 = r1.f245419e
            r2.setVisibility(r0)
            hm0.h r0 = r1.f245425k
            android.view.View r2 = r1.f245423i
            com.tencent.mm.plugin.appbrand.pip.z r5 = new com.tencent.mm.plugin.appbrand.pip.z
            r5.<init>(r1)
            r0.mo109565a(r2, r5)
            r9.start()
            r0 = 1
            goto L_0x02b7
        L_0x02b6:
            r0 = 0
        L_0x02b7:
            if (r0 == 0) goto L_0x0367
            com.tencent.mm.plugin.appbrand.pip.t r0 = r3.f245396b
            com.tencent.mm.plugin.appbrand.page.d1 r1 = r27.getCurrentPageView()
            int r1 = r1.hashCode()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.f245433s = r1
            com.tencent.mm.plugin.appbrand.pip.t r0 = r3.f245396b
            java.lang.String r1 = r0.f245415a
            r2 = 2
            java.lang.Object[] r4 = new java.lang.Object[r2]
            java.lang.Integer r0 = r0.f245433s
            r2 = 0
            r4[r2] = r0
            r0 = 1
            r4[r0] = r7
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r12, r4)
            com.tencent.mm.plugin.appbrand.pip.t r1 = r3.f245396b
            r1.getClass()
            java.lang.String r2 = r11.mo116677b()
            r1.f245426l = r2
            com.tencent.mm.plugin.appbrand.page.d1 r2 = r11.f245292b
            com.tencent.mm.plugin.appbrand.page.i0 r2 = r2.f244572U
            r1.f245427m = r2
            if (r2 == 0) goto L_0x0300
            r2.f244686K = r0
            com.tencent.mm.plugin.appbrand.page.d1 r0 = r2.getCurrentPageView()
            int r0 = r0.hashCode()
            java.lang.String r2 = r1.f245426l
            java.lang.String r4 = "setPipVideoRelated"
            r1.mo116713k(r0, r2, r4)
        L_0x0300:
            r8 = r23
            r1.f245429o = r8
            java.lang.String r0 = r1.f245426l
            if (r0 == 0) goto L_0x031b
            com.tencent.mm.plugin.appbrand.page.i0 r0 = r1.f245427m
            if (r0 == 0) goto L_0x031b
            hm0.c r0 = r8.f245306e
            if (r0 == 0) goto L_0x031b
            int r2 = r8.f245302a
            hm0.a r0 = r0.mo109564b(r2)
            com.tencent.mm.plugin.appbrand.page.i0 r1 = r1.f245427m
            r0.mo122014s(r1)
        L_0x031b:
            com.tencent.mm.plugin.appbrand.pip.t r0 = r3.f245396b
            r1 = 0
            r0.f245432r = r1
            com.tencent.mm.plugin.appbrand.pip.a$c r2 = r0.f245429o
            if (r2 == 0) goto L_0x0354
            com.tencent.mm.plugin.appbrand.pip.e r0 = r0.f245413B
            if (r0 == 0) goto L_0x0354
            com.tencent.mm.plugin.appbrand.pip.d r2 = r2.f245309h
            if (r22 == 0) goto L_0x032f
            r8 = r21
            goto L_0x0331
        L_0x032f:
            r8 = r20
        L_0x0331:
            com.tencent.mm.plugin.appbrand.pip.a0 r0 = (com.tencent.p014mm.plugin.appbrand.pip.C84025a0) r0
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r1] = r2
            r1 = 1
            r4[r1] = r8
            java.lang.String r1 = "MicroMsg.AppBrand.AppBrandPipReporter"
            java.lang.String r5 = "onPipShow, baseInfo: %s, mode: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r1, r5, r4)
            com.tencent.mm.autogen.mmdata.rpt.WeAppFloatingVideoStruct r0 = r0.mo116679a(r2)
            r1 = r21
            if (r1 != r8) goto L_0x034d
            r1 = 2
            goto L_0x034f
        L_0x034d:
            r1 = 3
        L_0x034f:
            r0.f236590g = r1
            r0.mo86054n()
        L_0x0354:
            com.tencent.mm.plugin.appbrand.pip.t r0 = r3.f245396b
            r1 = 1
            r0.f245434t = r1
            r1 = 0
            r0.f245435u = r1
            com.tencent.mm.plugin.appbrand.widget.AppBrandPipContainerView r0 = r0.f245419e
            r0.mo117659c()
            com.tencent.mm.plugin.appbrand.page.m0$$c0 r8 = com.tencent.p014mm.plugin.appbrand.page.m0$$c0.MIN
            r0 = r24
            goto L_0x036a
        L_0x0366:
            r4 = r8
        L_0x0367:
            r0 = r24
            r8 = r4
        L_0x036a:
            r0.f244733D = r8
        L_0x036c:
            r1 = 1
            r0.f244734E = r1
        L_0x036f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.page.C83849m0.mo116363o(com.tencent.mm.plugin.appbrand.page.h4, com.tencent.mm.plugin.appbrand.page.i0, com.tencent.mm.plugin.appbrand.page.i0):void");
    }

    /* renamed from: p */
    public final C83780d1 mo116364p(String str) {
        boolean z;
        C83780d1 d;
        boolean z2 = !this.f244750u;
        this.f244750u = true;
        m0$$v m0__v = this.f244741i;
        boolean z3 = false;
        C83780d1 d1Var = null;
        if (m0__v != null ? m0__v.mo116038e(this.f244749t, str) : this.f244749t != null) {
            C83780d1 d1Var2 = this.f244749t;
            this.f244749t = null;
            if (z2) {
                d1Var2.f244578Y = true;
            }
            d1Var2.mo116276k0();
            removeView(d1Var2.f244552D);
            return d1Var2;
        }
        m0$$v m0__v2 = this.f244741i;
        if (m0__v2 != null) {
            z = m0__v2.mo116038e(this.f244748s, str);
        } else {
            if (this.f244748s != null) {
                z3 = true;
            }
            z = z3;
        }
        if (!z) {
            m0$$v m0__v3 = this.f244741i;
            if (!(m0__v3 == null || (d = m0__v3.mo115880d(this, str)) == null)) {
                d1Var = d;
            }
            if (d1Var == null) {
                d1Var = new C83780d1();
            }
            if (z2) {
                d1Var.f244578Y = true;
            }
            d1Var.f244576W = getDecorWidgetFactory();
            d1Var.mo116166U0(getContext(), this.f244737e);
            return d1Var;
        }
        C83780d1 d1Var3 = this.f244748s;
        this.f244748s = null;
        if (z2) {
            d1Var3.f244578Y = true;
        }
        d1Var3.mo116276k0();
        removeView(d1Var3.f244552D);
        return d1Var3;
    }

    /* renamed from: q */
    public C83780d1 mo116365q(int i, boolean z) {
        C83780d1 s;
        LinkedList linkedList = new LinkedList();
        synchronized (this.f244744o) {
            linkedList.addAll(this.f244746q);
            linkedList.addAll(this.f244745p);
            Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                C83820i0 i0Var = (C83820i0) it.next();
                if (i0Var != null && (s = i0Var.mo116233s(i, z)) != null) {
                    return s;
                }
            }
            return null;
        }
    }

    /* renamed from: r */
    public final void mo116366r() {
        LinkedList linkedList;
        synchronized (this.f244744o) {
            linkedList = new LinkedList(this.f244747r);
            this.f244747r.clear();
        }
        Iterator descendingIterator = linkedList.descendingIterator();
        while (descendingIterator.hasNext()) {
            m0$$x m0__x = (m0$$x) descendingIterator.next();
            m0__x.mo116384h5(true);
            m0__x.run();
            descendingIterator.remove();
        }
    }

    /* renamed from: s */
    public int mo116367s(C83820i0 i0Var) {
        for (int i = 0; i < this.f244745p.size(); i++) {
            if (i0Var == this.f244745p.get(i)) {
                return (this.f244745p.size() - 1) - i;
            }
        }
        return -1;
    }

    public void setActuallyVisible(boolean z) {
        boolean z2 = this.f244739g != z;
        this.f244739g = z;
        if (z && z2) {
            C83820i0 currentPage = getCurrentPage();
            if (currentPage != null) {
                currentPage.getCurrentPageView().f244553E.setActuallyVisible(true);
            }
            super.setVisibility(0);
            if (this.f244740h) {
                mo116332Q("setActuallyVisible");
            }
        }
        if (!z && z2) {
            super.setVisibility(4);
        }
    }

    public void setDecorWidgetFactory(C83810g4 g4Var) {
        if (g4Var != null) {
            this.f244752w = g4Var;
            return;
        }
        throw new NullPointerException("Should not be null");
    }

    public final void setDelegate(m0$$v m0__v) {
        if (this.f244741i == null) {
            m0$$w m0__w = this.f244742j;
            if (m0__w != null) {
                C84057r rVar = (C84057r) m0__w;
                if (m0__v == null) {
                    m0__v = new C84055p(rVar);
                }
                m0__v = new C84056q(rVar, m0__v);
            }
            this.f244741i = m0__v;
            return;
        }
        throw new IllegalAccessError("Duplicated call!!!");
    }

    public void setDelegateWrapperFactory(m0$$w m0__w) {
        this.f244742j = m0__w;
        m0$$v m0__v = this.f244741i;
        if (m0__v != null) {
            C84057r rVar = (C84057r) m0__w;
            rVar.getClass();
            this.f244741i = new C84056q(rVar, m0__v);
        }
    }

    public void setOnPageSwitchListener(m0$$z m0__z) {
        Log.m105918d("MicroMsg.AppBrandPageContainer", "setOnPageSwitchListener, onPageSwitchListener: " + m0__z);
        this.f244735F = m0__z;
    }

    public void setOnReadyListener(m0$$a0 m0__a0) {
        this.f244731B = m0__a0;
    }

    public void setPageNavigationPushTimeout(long j) {
        this.f244754y = Math.max(0, j);
    }

    public void setPipPageLifeCycleListener(m0$$d0 m0__d0) {
        this.f244732C = m0__d0;
    }

    public void setPipVideoRelatedPage(C83820i0 i0Var) {
        if (i0Var != null) {
            Log.m105925i("MicroMsg.AppBrandPageContainer", "setPipVideoRelatedPage, page(%s)", i0Var.getCurrentUrl());
        } else {
            Log.m105924i("MicroMsg.AppBrandPageContainer", "setPipVideoRelatedPage, page is null");
        }
        this.f244751v = i0Var;
    }

    /* renamed from: t */
    public C83820i0 mo116377t(C83820i0 i0Var) {
        synchronized (this.f244744o) {
            if (this.f244746q.contains(i0Var)) {
                C83820i0 peekFirst = this.f244745p.peekFirst();
                return peekFirst;
            }
            int indexOf = this.f244745p.indexOf(i0Var);
            if (indexOf >= this.f244745p.size() - 1) {
                return null;
            }
            C83820i0 i0Var2 = this.f244745p.get(indexOf + 1);
            return i0Var2;
        }
    }

    /* renamed from: v */
    public boolean mo116047v() {
        return false;
    }

    /* renamed from: w */
    public void mo115883w(String str) {
        Assert.assertSame(Looper.getMainLooper(), Looper.myLooper());
        mo116380z(str, C83817h4.APP_LAUNCH, (JSONObject) null);
    }

    /* renamed from: x */
    public void mo116378x(int i, String str, JSONObject jSONObject, C13773f fVar) {
        mo116338c0(new m0$$u(this, i, str, jSONObject, fVar));
    }

    /* renamed from: y */
    public void mo116379y(C83820i0 i0Var, String str) {
        mo116338c0(new m0$$d(this, i0Var, str));
    }

    /* renamed from: z */
    public final void mo116380z(String str, C83817h4 h4Var, JSONObject jSONObject) {
        String str2;
        C83966x xVar;
        C83966x xVar2;
        C83820i0 first;
        C83817h4 h4Var2 = h4Var;
        boolean z = true;
        boolean z2 = false;
        if (this.f244737e == null) {
            Log.m105921e("MicroMsg.AppBrandPageContainer", "navigateToImpl destroyed, url[%s], type[%s]", str, h4Var2);
            return;
        }
        C83970x2 x2Var = this.f244753x;
        x2Var.getClass();
        long hash = (long) Objects.hash(new Object[]{Integer.valueOf(h4Var.ordinal()), Long.valueOf(Util.currentTicks())});
        x2Var.mo116604a(hash, "routeStartTime", Long.valueOf(Util.nowMilliSecond()), true);
        long j = hash;
        x2Var.mo116604a(hash, "routePageOpenType", h4Var, false);
        Log.m105925i("MicroMsg.AppBrandPageContainer", "navigateTo: %s, type[%s]", str, h4Var2);
        String b = Util.isNullOrNil(str) ? this.f244737e.mo113008F().mo113983b() : str;
        if (b.startsWith("?")) {
            b = this.f244737e.mo113008F().mo113983b() + b;
        }
        String str3 = b;
        Log.m105925i("MicroMsg.AppBrandPageContainer", "navigateTo: %s fixed, type[%s]", str3, h4Var2);
        mo116366r();
        C83817h4 h4Var3 = C83817h4.SWITCH_TAB;
        if (h4Var2 == h4Var3) {
            C83820i0 currentPage = getCurrentPage();
            synchronized (this.f244744o) {
                C83820i0 peekFirst = this.f244745p.peekFirst();
                xVar = null;
                if (!(peekFirst instanceof C83966x) || !peekFirst.mo116235v(str3)) {
                    xVar2 = null;
                } else {
                    C83966x xVar3 = (C83966x) peekFirst;
                    xVar2 = xVar3;
                }
            }
            if (xVar2 != null) {
                xVar2.mo116594R(j, str3, new C83885q0(this, currentPage, new m0$$c0[1], j), h4Var3);
                str2 = str3;
            } else {
                C83817h4 h4Var4 = h4Var3;
                String str4 = str3;
                synchronized (this.f244744o) {
                    if (this.f244745p.size() >= 2) {
                        ListIterator<C83820i0> listIterator = this.f244745p.listIterator(1);
                        while (true) {
                            if (!listIterator.hasNext()) {
                                break;
                            }
                            C83820i0 next = listIterator.next();
                            if ((next instanceof C83966x) && next.mo116235v(str4)) {
                                C83966x xVar4 = (C83966x) next;
                                xVar = xVar4;
                                break;
                            }
                        }
                    }
                }
                if (xVar != null) {
                    m0$$c0[] m0__c0Arr = new m0$$c0[1];
                    xVar.mo116594R(j, str4, new C83904r0(this, currentPage, m0__c0Arr), h4Var4);
                    synchronized (this.f244744o) {
                        first = this.f244745p.getFirst();
                    }
                    mo116355i(first, xVar);
                    str2 = str4;
                    mo116354h0(j, xVar, first, h4Var4, m0__c0Arr[0]);
                } else {
                    str2 = str4;
                    z = false;
                }
            }
            if (z) {
                return;
            }
        } else {
            str2 = str3;
        }
        m0$$t m0__t = new m0$$t(this, str2, h4Var, j, jSONObject);
        m0$$v m0__v = this.f244741i;
        if (m0__v != null) {
            z2 = m0__v.mo116035a(str2, h4Var2, this, m0__t);
        }
        if (!z2) {
            m0__t.proceed();
        }
    }
}
