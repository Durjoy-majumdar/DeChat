package com.tencent.p014mm.plugin.appbrand.pip;

import android.content.Context;
import android.view.View;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntime;
import com.tencent.p014mm.plugin.appbrand.jsapi.media.C82724i0;
import com.tencent.p014mm.plugin.appbrand.jsapi.media.C82725i2;
import com.tencent.p014mm.plugin.appbrand.page.C83820i0;
import com.tencent.p014mm.plugin.appbrand.page.C83849m0;
import com.tencent.p014mm.plugin.appbrand.pip.C84021a;
import com.tencent.p014mm.plugin.appbrand.utils.C84790v1;
import com.tencent.p014mm.plugin.appbrand.widget.AppBrandPipContainerView;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C87412m;
import hm0.C87562h;
import hm0.C87564i;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.tencent.mm.plugin.appbrand.pip.t */
public final class C84059t {

    /* renamed from: A */
    public C84032c0 f245412A;

    /* renamed from: B */
    public C84036e f245413B;

    /* renamed from: C */
    public volatile boolean f245414C;

    /* renamed from: a */
    public final String f245415a = ("MicroMsg.AppBrand.AppBrandPipManager#" + hashCode());

    /* renamed from: b */
    public final Context f245416b;

    /* renamed from: c */
    public final AppBrandRuntime f245417c;

    /* renamed from: d */
    public final C83849m0 f245418d;

    /* renamed from: e */
    public AppBrandPipContainerView f245419e = null;

    /* renamed from: f */
    public volatile boolean f245420f = false;

    /* renamed from: g */
    public final Map<Integer, C84021a> f245421g = new ConcurrentHashMap();

    /* renamed from: h */
    public Map<Integer, Set<String>> f245422h = new ConcurrentHashMap();

    /* renamed from: i */
    public View f245423i = null;

    /* renamed from: j */
    public C84028c f245424j = null;

    /* renamed from: k */
    public C87562h f245425k = null;

    /* renamed from: l */
    public String f245426l = null;

    /* renamed from: m */
    public C83820i0 f245427m = null;

    /* renamed from: n */
    public boolean f245428n = true;

    /* renamed from: o */
    public C84021a.C84024c f245429o = null;

    /* renamed from: p */
    public C87564i.C87565a f245430p = null;

    /* renamed from: q */
    public volatile boolean f245431q = false;

    /* renamed from: r */
    public boolean f245432r = false;

    /* renamed from: s */
    public volatile Integer f245433s = null;

    /* renamed from: t */
    public boolean f245434t = false;

    /* renamed from: u */
    public boolean f245435u = false;

    /* renamed from: v */
    public C84790v1 f245436v = null;

    /* renamed from: w */
    public C84790v1 f245437w = null;

    /* renamed from: x */
    public C82724i0.C29521a f245438x = null;

    /* renamed from: y */
    public final C82725i2 f245439y;

    /* renamed from: z */
    public C84035d0 f245440z;

    /* renamed from: com.tencent.mm.plugin.appbrand.pip.t$a */
    public class C84060a implements C32224a<AppBrandRuntime> {
        public C84060a() {
        }

        public Object invoke() {
            return C84059t.this.f245417c;
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.pip.t$b */
    public class C84061b implements Runnable {
        public C84061b() {
        }

        public void run() {
            C84059t.m103575d(C84059t.this);
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.pip.t$c */
    public class C84062c implements C84027b0 {
        public C84062c() {
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.pip.t$d */
    public class C84063d implements Runnable {
        public C84063d() {
        }

        public void run() {
            View view;
            Log.m105924i(C84059t.this.f245415a, "transferFrom, dismissTask run");
            C84059t tVar = C84059t.this;
            tVar.f245436v = null;
            AppBrandPipContainerView appBrandPipContainerView = tVar.f245419e;
            if (appBrandPipContainerView != null && (view = tVar.f245423i) != null && tVar.f245425k != null) {
                appBrandPipContainerView.f247503y.removeView(view);
                C84059t tVar2 = C84059t.this;
                tVar2.f245425k.mo109567d(tVar2.f245423i);
                C84059t.this.f245419e.setVisibility(4);
                C84059t tVar3 = C84059t.this;
                tVar3.f245423i = null;
                tVar3.f245424j = null;
            }
        }
    }

    public C84059t(Context context, AppBrandRuntime appBrandRuntime) {
        C84060a aVar = new C84060a();
        this.f245438x = new C84058s(this);
        this.f245439y = new C82725i2(aVar, this.f245438x);
        this.f245440z = null;
        this.f245412A = null;
        this.f245413B = null;
        this.f245416b = context;
        this.f245417c = appBrandRuntime;
        this.f245418d = appBrandRuntime.mo113042Z();
        this.f245414C = !appBrandRuntime.f238122S;
    }

    /* renamed from: b */
    public static void m103573b(C84059t tVar, String str) {
        String str2 = tVar.f245415a;
        Log.m105918d(str2, str + ", requestAudioFocus");
        tVar.f245439y.requestFocus();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0018, code lost:
        r3 = (java.util.Set) ((java.util.concurrent.ConcurrentHashMap) r3.f245422h).get(r0);
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m103574c(com.tencent.p014mm.plugin.appbrand.pip.C84059t r3) {
        /*
            java.lang.Integer r0 = r3.f245433s
            r1 = 0
            if (r0 != 0) goto L_0x000d
            java.lang.String r3 = r3.f245415a
            java.lang.String r0 = "isVideoInPipVideoTargetPageViewPlaying, pipVideoTargetPageViewId is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r3, r0)
            goto L_0x002b
        L_0x000d:
            java.util.Map<java.lang.Integer, java.util.Set<java.lang.String>> r2 = r3.f245422h
            java.util.concurrent.ConcurrentHashMap r2 = (java.util.concurrent.ConcurrentHashMap) r2
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x0018
            goto L_0x002b
        L_0x0018:
            java.util.Map<java.lang.Integer, java.util.Set<java.lang.String>> r3 = r3.f245422h
            java.util.concurrent.ConcurrentHashMap r3 = (java.util.concurrent.ConcurrentHashMap) r3
            java.lang.Object r3 = r3.get(r0)
            java.util.Set r3 = (java.util.Set) r3
            if (r3 == 0) goto L_0x002b
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L_0x002b
            r1 = 1
        L_0x002b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.pip.C84059t.m103574c(com.tencent.mm.plugin.appbrand.pip.t):boolean");
    }

    /* renamed from: d */
    public static void m103575d(C84059t tVar) {
        if (tVar.mo116714l(false)) {
            tVar.mo116707a("exitPip");
            Log.m105924i(tVar.f245415a, "exitPip, clearPipVideoRelated");
            tVar.mo116709f(true, true);
        }
        AppBrandPipContainerView appBrandPipContainerView = tVar.f245419e;
        if (appBrandPipContainerView != null) {
            appBrandPipContainerView.setVisibility(4);
        }
    }

    /* renamed from: j */
    public static String m103576j(C83820i0 i0Var) {
        if (i0Var == null) {
            return "null";
        }
        return i0Var.getClass().getSimpleName() + "@" + i0Var.hashCode() + "(" + i0Var.getCurrentUrl() + ")";
    }

    /* renamed from: a */
    public final void mo116707a(String str) {
        String str2 = this.f245415a;
        Log.m105918d(str2, str + ", abandonAudioFocus");
        this.f245439y.mo115002L();
    }

    /* renamed from: e */
    public final void mo116708e(int i, String str, String str2) {
        Set set = (Set) ((ConcurrentHashMap) this.f245422h).get(Integer.valueOf(i));
        if (set == null) {
            set = new HashSet();
            ((ConcurrentHashMap) this.f245422h).put(Integer.valueOf(i), set);
        }
        String str3 = this.f245415a;
        Log.m105924i(str3, str2 + ", mPageView2VideosMap add " + str + " for " + i);
        set.add(str);
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [com.tencent.mm.plugin.appbrand.page.i0, com.tencent.mm.plugin.appbrand.pip.a$c] */
    /* JADX WARNING: type inference failed for: r2v2 */
    /* JADX WARNING: type inference failed for: r2v3 */
    /* JADX WARNING: type inference failed for: r2v5 */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00d9  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo116709f(boolean r20, boolean r21) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            r2 = r21
            java.lang.String r3 = r0.f245415a
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "clearPipVideoRelated, mayPause: "
            r4.append(r5)
            r4.append(r1)
            java.lang.String r5 = ", mayDestroyPage: "
            r4.append(r5)
            r4.append(r2)
            java.lang.String r4 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r4)
            java.lang.String r3 = r0.f245426l
            if (r3 == 0) goto L_0x003f
            com.tencent.mm.plugin.appbrand.pip.a$c r3 = r0.f245429o
            if (r3 == 0) goto L_0x003f
            com.tencent.mm.plugin.appbrand.page.i0 r4 = r0.f245427m
            if (r4 == 0) goto L_0x003f
            hm0.c r4 = r3.f245306e
            if (r4 == 0) goto L_0x003f
            int r3 = r3.f245302a
            hm0.a r3 = r4.mo109563a(r3)
            com.tencent.mm.plugin.appbrand.page.i0 r4 = r0.f245427m
            r3.mo122014s(r4)
        L_0x003f:
            java.lang.String r3 = r0.f245426l
            r4 = 0
            r0.f245426l = r4
            com.tencent.mm.plugin.appbrand.page.i0 r5 = r0.f245427m
            r6 = 1
            if (r5 == 0) goto L_0x00db
            com.tencent.mm.plugin.appbrand.page.d1 r5 = r5.getCurrentPageView()
            int r5 = r5.hashCode()
            java.lang.String r7 = "clearPipVideoRelated"
            r0.mo116708e(r5, r3, r7)
            r8 = 0
            if (r2 == 0) goto L_0x009b
            com.tencent.mm.plugin.appbrand.page.m0 r9 = r0.f245418d
            com.tencent.mm.plugin.appbrand.page.i0 r9 = r9.getCurrentPage()
            if (r9 != 0) goto L_0x0069
            java.lang.String r9 = r0.f245415a
            java.lang.String r10 = "clearPipVideoRelated, curPage is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r9, r10)
            goto L_0x009b
        L_0x0069:
            r10 = 2
            java.lang.Object[] r10 = new java.lang.Object[r10]
            com.tencent.mm.plugin.appbrand.page.h4 r15 = com.tencent.p014mm.plugin.appbrand.page.C83817h4.DISMISS_PIP
            r11 = 8
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r10[r8] = r11
            long r11 = com.tencent.p014mm.sdk.platformtools.Util.currentTicks()
            java.lang.Long r11 = java.lang.Long.valueOf(r11)
            r10[r6] = r11
            int r10 = java.util.Objects.hash(r10)
            long r13 = (long) r10
            r16 = 0
            r17 = 0
            r10 = r9
            r11 = r13
            r18 = r7
            r6 = r13
            r13 = r15
            r14 = r17
            r4 = r15
            r15 = r16
            r10.mo116299o(r11, r13, r14, r15)
            r9.mo116303q(r6, r4)
            goto L_0x009d
        L_0x009b:
            r18 = r7
        L_0x009d:
            com.tencent.mm.plugin.appbrand.page.i0 r4 = r0.f245427m
            r4.f244686K = r8
            if (r1 == 0) goto L_0x00ae
            com.tencent.mm.plugin.appbrand.pip.a$c r1 = r0.f245429o
            if (r1 == 0) goto L_0x00ae
            hm0.i r1 = r1.f245308g
            if (r1 == 0) goto L_0x00ae
            r1.pause()
        L_0x00ae:
            if (r2 == 0) goto L_0x00d9
            boolean r1 = r0.f245428n
            if (r1 != 0) goto L_0x00d9
            java.lang.String r1 = r0.f245415a
            java.lang.String r2 = "clearPipVideoRelated, performDestroy and performCleanup"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)
            com.tencent.mm.plugin.appbrand.page.i0 r1 = r0.f245427m
            r1.mo116225E()
            com.tencent.mm.plugin.appbrand.page.i0 r1 = r0.f245427m
            r1.mo116229f()
            r2 = 0
            r1.f244687y = r2
            com.tencent.mm.plugin.appbrand.pip.a$c r1 = r0.f245429o
            if (r1 == 0) goto L_0x00d3
            hm0.i r1 = r1.f245308g
            if (r1 == 0) goto L_0x00d3
            r1.mo110187d(r2)
        L_0x00d3:
            r1 = r18
            r0.mo116713k(r5, r3, r1)
            goto L_0x00dc
        L_0x00d9:
            r2 = 0
            goto L_0x00dc
        L_0x00db:
            r2 = r4
        L_0x00dc:
            r0.f245427m = r2
            com.tencent.mm.plugin.appbrand.page.m0 r1 = r0.f245418d
            r1.setPipVideoRelatedPage(r2)
            r1 = 1
            r0.f245428n = r1
            r0.f245429o = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.pip.C84059t.mo116709f(boolean, boolean):void");
    }

    /* renamed from: g */
    public final void mo116710g() {
        C84035d0 d0Var;
        if (this.f245419e != null && (d0Var = this.f245440z) != null) {
            if (this.f245412A == null) {
                String str = this.f245417c.f238147j;
                AppBrandPipContainerView appBrandPipContainerView = this.f245419e;
                ((C84037e0) d0Var).getClass();
                C87412m.m108594g(str, "appId");
                C87412m.m108594g(appBrandPipContainerView, "pipContainerView");
                this.f245412A = new C84039f0(str, appBrandPipContainerView);
            }
            this.f245412A.mo116689a(new C84062c());
        }
    }

    /* renamed from: h */
    public C84038f mo116711h(int i) {
        C84036e eVar;
        String str = this.f245415a;
        Log.m105924i(str, "exitPip, viewId: " + i);
        if (this.f245431q) {
            Log.m105928w(this.f245415a, "exitPip when mPipClickProcessing, return");
            return C84038f.FAIL_SINCE_IS_EXITING;
        }
        String str2 = this.f245426l;
        if (str2 == null || !str2.contains(String.valueOf(i))) {
            return C84038f.FAIL_SINCE_NOT_IN_PIP;
        }
        C84021a.C84024c cVar = this.f245429o;
        if (!(cVar == null || (eVar = this.f245413B) == null)) {
            ((C84025a0) eVar).mo116680b(cVar.f245309h, C84043h.EXIT_PIP_CALLED);
        }
        AppBrandPipContainerView appBrandPipContainerView = this.f245419e;
        if (appBrandPipContainerView != null) {
            appBrandPipContainerView.post(new C84061b());
        }
        return C84038f.SUCCESS;
    }

    /* renamed from: i */
    public final C84021a mo116712i(int i) {
        C84021a aVar = (C84021a) ((ConcurrentHashMap) this.f245421g).get(Integer.valueOf(i));
        if (aVar != null) {
            return aVar;
        }
        Log.m105928w(this.f245415a, "getPageScopedPipInfo, null == pageScopedPipInfo");
        return null;
    }

    /* renamed from: k */
    public final void mo116713k(int i, String str, String str2) {
        Set set = (Set) ((ConcurrentHashMap) this.f245422h).get(Integer.valueOf(i));
        if (set != null) {
            String str3 = this.f245415a;
            Log.m105924i(str3, str2 + ", mPageView2VideosMap remove " + str + " for " + i);
            set.remove(str);
        }
    }

    /* renamed from: l */
    public final boolean mo116714l(boolean z) {
        if (this.f245419e == null || this.f245425k == null || this.f245423i == null) {
            return false;
        }
        C84790v1 v1Var = this.f245437w;
        if (v1Var != null) {
            v1Var.f247219g.set(0);
            v1Var.run();
            this.f245437w = null;
        }
        C84063d dVar = new C84063d();
        Log.m105924i(this.f245415a, "transferFrom");
        if (z) {
            C87562h hVar = this.f245425k;
            View view = this.f245423i;
            C84790v1 v1Var2 = new C84790v1(dVar, 0, (Runnable) null);
            this.f245436v = v1Var2;
            hVar.mo109554b(view, v1Var2);
            return true;
        }
        this.f245425k.mo109554b(this.f245423i, (Runnable) null);
        dVar.run();
        return true;
    }
}
