package com.tencent.p014mm.plugin.appbrand.page;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import aw0.C103928o;
import br0.C79773b;
import com.tencent.p014mm.autogen.mmdata.rpt.WeAppQualityLibInjectStruct;
import com.tencent.p014mm.autogen.mmdata.rpt.WeAppQualityPageframeInjectStruct;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntimeWC;
import com.tencent.p014mm.plugin.appbrand.C81879g;
import com.tencent.p014mm.plugin.appbrand.C83608m4;
import com.tencent.p014mm.plugin.appbrand.config.HalfScreenConfig;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82870p;
import com.tencent.p014mm.plugin.appbrand.jsapi.C83033t;
import com.tencent.p014mm.plugin.appbrand.jsapi.file.C82492w;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C83155d0;
import com.tencent.p014mm.plugin.appbrand.keylogger.C83226n;
import com.tencent.p014mm.plugin.appbrand.performance.AppBrandPerformanceManager;
import com.tencent.p014mm.plugin.appbrand.performance.C83997d;
import com.tencent.p014mm.plugin.appbrand.performance.C84003h;
import com.tencent.p014mm.plugin.appbrand.performance.C84009k;
import com.tencent.p014mm.plugin.appbrand.report.C84240s;
import com.tencent.p014mm.plugin.appbrand.report.quality.C84185b;
import com.tencent.p014mm.plugin.appbrand.report.quality.C84191e;
import com.tencent.p014mm.plugin.appbrand.report.quality.QualitySessionRuntime;
import com.tencent.p014mm.plugin.appbrand.step.KSProcessWeAppLaunch;
import com.tencent.p014mm.plugin.appbrand.utils.C2039g2;
import com.tencent.p014mm.plugin.appbrand.weishi.C84904e;
import com.tencent.p014mm.plugin.appbrand.weishi.C84905f;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import fy3.C32224a;
import gy3.C87412m;
import iu0.C33407g;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import kr0.C88267e;
import p1044ub.C90636f;
import p170ic.C87690d;
import rq0.C90087f;
import rq0.C90091i;
import ym0.C91516n;

/* renamed from: com.tencent.mm.plugin.appbrand.page.s1 */
public class C83910s1 extends C83930t3<C83928t1> implements C82492w.C82496b {

    /* renamed from: F */
    public long f244976F;

    /* renamed from: G */
    public long f244977G;

    /* renamed from: H */
    public long f244978H;

    /* renamed from: I */
    public final Set<String> f244979I = new HashSet();

    /* renamed from: J */
    public final Set<C40521t2> f244980J = Collections.synchronizedSet(new HashSet());

    /* renamed from: K */
    public C83982z2 f244981K = null;

    /* renamed from: L */
    public final C40521t2 f244982L = new C40518c();

    /* renamed from: com.tencent.mm.plugin.appbrand.page.s1$c */
    public class C40518c implements C40521t2 {
        public C40518c() {
        }

        /* renamed from: g */
        public void mo63352g(int i, int i2, boolean z, boolean z2) {
            Iterator it = new HashSet(C83910s1.this.f244980J).iterator();
            while (it.hasNext()) {
                C40521t2 t2Var = (C40521t2) it.next();
                if (t2Var != null) {
                    t2Var.mo63352g(i, i2, z, z2);
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.page.s1$d */
    public class C40519d implements C32224a<C40502j2> {

        /* renamed from: d */
        public final /* synthetic */ Context f108846d;

        public C40519d(C83910s1 s1Var, Context context) {
            this.f108846d = context;
        }

        public Object invoke() {
            return new C40514m(this.f108846d);
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.page.s1$a */
    public class C83911a extends C79773b {
        public C83911a(C83910s1 s1Var) {
        }

        /* renamed from: e */
        public void mo109900e() {
            C103928o.m138641a(true, true, false);
        }

        /* renamed from: f */
        public void mo109901f() {
            C103928o.m138641a(false, true, false);
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.page.s1$b */
    public class C83912b implements C32224a<Map<String, C82870p>> {
        public C83912b(C83910s1 s1Var) {
        }

        public Object invoke() {
            return C83033t.m101845f();
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.page.s1$e */
    public class C83913e extends C83864o3 {
        public C83913e(C83910s1 s1Var) {
            super(s1Var);
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.page.s1$f */
    public class C83914f implements Runnable {
        public C83914f() {
        }

        public void run() {
            C83910s1.this.mo116498d0().f238284l1.mo115918e(3, Util.ticksToNow(C83910s1.this.f244976F));
            C83997d.m103518a(C83910s1.this.mo125215b0(), "Native", "WebViewInit+PageFrameLoad", C83910s1.this.f244976F, System.currentTimeMillis(), "");
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.page.s1$g */
    public class C83915g implements Runnable {
        public C83915g() {
        }

        public void run() {
            C83910s1.this.f244977G = Util.currentTicks();
        }
    }

    public C83910s1(C83928t1 t1Var) {
        super(t1Var);
    }

    /* renamed from: C */
    public void mo111238C() {
        super.mo111238C();
        mo116498d0().f238284l1.mo115918e(4, Util.ticksToNow(this.f244977G));
        AppBrandPerformanceManager.m103495d(mo116498d0(), 203, System.currentTimeMillis() - this.f244978H);
        C83997d.m103518a(mo125215b0(), "Native", "PageLoad", this.f244978H, System.currentTimeMillis(), "");
    }

    /* renamed from: C0 */
    public AppBrandRuntimeWC mo116498d0() {
        return (AppBrandRuntimeWC) super.mo116498d0();
    }

    /* renamed from: D0 */
    public C40502j2 mo116495D0() {
        C83797e3 e3Var = this.f244454g;
        if (e3Var instanceof C40502j2) {
            return (C40502j2) e3Var;
        }
        if (!(e3Var instanceof C83955v2)) {
            return null;
        }
        C83797e3 e3Var2 = ((C83955v2) e3Var).f245101d;
        if (e3Var2 instanceof C40502j2) {
            return (C40502j2) e3Var2;
        }
        return null;
    }

    /* renamed from: E0 */
    public final void mo116496E0(String str, String str2, String str3, boolean z, long j, long j2) {
        long j3;
        long j4 = j;
        long j5 = j2;
        if (mo116067n0()) {
            if (z) {
                C83226n.m102129f(mo125215b0(), KSProcessWeAppLaunch.stepInjectJSPageScript, str2, j, j2);
            } else {
                C83226n.m102127d(mo125215b0(), KSProcessWeAppLaunch.stepInjectJSPageScript, "", str2, j, j2);
            }
            QualitySessionRuntime c = C84185b.m103770c(mo125215b0(), true);
            if (c != null) {
                WeAppQualityPageframeInjectStruct weAppQualityPageframeInjectStruct = new WeAppQualityPageframeInjectStruct();
                weAppQualityPageframeInjectStruct.f236996d = weAppQualityPageframeInjectStruct.mo86045b("InstanceId", c.f245832d, true);
                weAppQualityPageframeInjectStruct.f236997e = weAppQualityPageframeInjectStruct.mo86045b("AppId", mo125215b0(), true);
                weAppQualityPageframeInjectStruct.f236998f = (long) c.f245837i;
                int i = c.f245834f;
                weAppQualityPageframeInjectStruct.f236999g = i != 1 ? i != 2 ? i != 3 ? null : WeAppQualityPageframeInjectStruct.C80771a.demo : WeAppQualityPageframeInjectStruct.C80771a.debug : WeAppQualityPageframeInjectStruct.C80771a.release;
                weAppQualityPageframeInjectStruct.f237000h = (long) c.f245835g;
                long j6 = j5 - j4;
                weAppQualityPageframeInjectStruct.f237001i = j6;
                weAppQualityPageframeInjectStruct.mo86046c("CostTimeMs", j6);
                weAppQualityPageframeInjectStruct.f237002j = (long) c.f245836h;
                weAppQualityPageframeInjectStruct.f237003k = j4;
                weAppQualityPageframeInjectStruct.mo86048e("StartTimeStampMs", j4);
                weAppQualityPageframeInjectStruct.f237004l = j5;
                weAppQualityPageframeInjectStruct.mo86048e("EndTimeStampMs", j5);
                String str4 = str;
                weAppQualityPageframeInjectStruct.f237005m = weAppQualityPageframeInjectStruct.mo86045b("package", str, true);
                weAppQualityPageframeInjectStruct.f237006n = (long) Util.nullAsNil(Integer.valueOf(str3.length()));
                String str5 = str3;
                if (str3.startsWith("//XWEB_SCRIPT:")) {
                    String str6 = str2;
                    if (((HashSet) this.f244979I).contains(str2)) {
                        j3 = 1;
                        weAppQualityPageframeInjectStruct.f237007o = j3;
                        C84191e eVar = C84185b.f245912a;
                        weAppQualityPageframeInjectStruct.f237008p = eVar.mo116901e((C83928t1) mo124764Z());
                        weAppQualityPageframeInjectStruct.f237009q = weAppQualityPageframeInjectStruct.mo86045b("engineVersion", eVar.mo116900d() + "", true);
                        weAppQualityPageframeInjectStruct.mo86054n();
                        return;
                    }
                }
                j3 = 0;
                weAppQualityPageframeInjectStruct.f237007o = j3;
                C84191e eVar2 = C84185b.f245912a;
                weAppQualityPageframeInjectStruct.f237008p = eVar2.mo116901e((C83928t1) mo124764Z());
                weAppQualityPageframeInjectStruct.f237009q = weAppQualityPageframeInjectStruct.mo86045b("engineVersion", eVar2.mo116900d() + "", true);
                weAppQualityPageframeInjectStruct.mo86054n();
                return;
            }
        }
    }

    /* renamed from: F0 */
    public final void mo116497F0(String str, String str2, long j, long j2) {
        boolean z;
        WeAppQualityLibInjectStruct g = C84185b.f245912a.mo116888g((C81879g) mo124764Z());
        g.mo112531s(str);
        g.f236930p = (long) str2.length();
        long j3 = 1;
        g.f236932r = (!str2.startsWith("//XWEB_SCRIPT:") || !((HashSet) this.f244979I).contains(str)) ? 0 : 1;
        C88267e K1 = ((C83928t1) mo124764Z()).mo116160O0();
        if (K1 == null) {
            z = false;
        } else {
            z = K1.mo122650O0();
            if (!z) {
                z = true;
            }
        }
        if (!z) {
            j3 = 0;
        }
        g.f236933s = j3;
        g.f236925k = j;
        g.mo86048e("StartTimeStampMs", j);
        g.f236926l = j2;
        g.mo86048e("EndTimeStampMs", j2);
        long j4 = g.f236926l - g.f236925k;
        g.f236923i = j4;
        g.mo86046c("CostTimeMs", j4);
        g.mo86054n();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:56:0x011a, code lost:
        if (r1 == com.tencent.p014mm.plugin.appbrand.report.quality.C84217q.PreloadOnProcessCreated) goto L_0x011c;
     */
    /* renamed from: J */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo111243J(java.lang.String r7, com.tencent.p014mm.plugin.appbrand.page.C83817h4 r8) {
        /*
            r6 = this;
            long r0 = java.lang.System.currentTimeMillis()
            r6.f244978H = r0
            com.tencent.mm.plugin.appbrand.page.e3 r0 = r6.f244454g
            com.tencent.mm.plugin.appbrand.page.y3 r0 = (com.tencent.p014mm.plugin.appbrand.page.C83978y3) r0
            com.tencent.mm.plugin.appbrand.page.s1$g r1 = new com.tencent.mm.plugin.appbrand.page.s1$g
            r1.<init>()
            r0.mo72054M0(r1)
            r6.mo116498d0()     // Catch:{ Exception -> 0x003e }
            boolean r0 = com.tencent.p014mm.plugin.appbrand.AppBrandRuntimeWC.f238264Q1     // Catch:{ Exception -> 0x003e }
            if (r0 != 0) goto L_0x001a
            goto L_0x003e
        L_0x001a:
            android.content.Context r0 = r6.mo125216c0()     // Catch:{ Exception -> 0x003e }
            java.lang.Class<android.view.accessibility.AccessibilityManager> r1 = android.view.accessibility.AccessibilityManager.class
            java.lang.Object r0 = p385u2.C111105a.m151502d(r0, r1)     // Catch:{ Exception -> 0x003e }
            android.view.accessibility.AccessibilityManager r0 = (android.view.accessibility.AccessibilityManager) r0     // Catch:{ Exception -> 0x003e }
            if (r0 == 0) goto L_0x003e
            boolean r0 = r0.isTouchExplorationEnabled()     // Catch:{ Exception -> 0x003e }
            if (r0 == 0) goto L_0x002f
            goto L_0x003e
        L_0x002f:
            com.tencent.mm.plugin.appbrand.jsapi.f r0 = r6.mo124764Z()     // Catch:{ Exception -> 0x003e }
            com.tencent.mm.plugin.appbrand.page.t1 r0 = (com.tencent.p014mm.plugin.appbrand.page.C83928t1) r0     // Catch:{ Exception -> 0x003e }
            android.view.ViewGroup r0 = r0.f244552D     // Catch:{ Exception -> 0x003e }
            java.lang.String r1 = p225rc.C89925n.m112488a(r7)     // Catch:{ Exception -> 0x003e }
            r0.setContentDescription(r1)     // Catch:{ Exception -> 0x003e }
        L_0x003e:
            com.tencent.mm.plugin.appbrand.jsapi.f r0 = r6.mo124764Z()
            r1 = 0
            if (r0 == 0) goto L_0x0050
            com.tencent.mm.plugin.appbrand.jsapi.f r0 = r6.mo124764Z()
            com.tencent.mm.plugin.appbrand.page.t1 r0 = (com.tencent.p014mm.plugin.appbrand.page.C83928t1) r0
            com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC r0 = r0.getRuntime()
            goto L_0x0051
        L_0x0050:
            r0 = r1
        L_0x0051:
            r2 = 0
            if (r0 == 0) goto L_0x0078
            com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC r0 = r0.mo113210l1()
            com.tencent.mm.plugin.appbrand.config.HalfScreenConfig r0 = r0.f234815R0
            boolean r0 = r0.f157948h
            if (r0 == 0) goto L_0x0078
            com.tencent.mm.plugin.appbrand.page.j2 r0 = r6.mo116495D0()
            if (r0 == 0) goto L_0x0078
            com.tencent.xweb.WebSettings r3 = r0.getSettings()
            if (r3 == 0) goto L_0x0078
            com.tencent.xweb.WebSettings r0 = r0.getSettings()
            r0.setForceDarkMode(r2)
            java.lang.String r0 = "MicroMsg.AppBrandPageViewRendererWC"
            java.lang.String r3 = "[applyDarkModeConfig] set FORCE_DARK_OFF reason[ half screen force-light-mode]"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r3)
        L_0x0078:
            com.tencent.mm.plugin.appbrand.page.e3 r0 = r6.f244454g
            com.tencent.mm.plugin.appbrand.page.y3 r0 = (com.tencent.p014mm.plugin.appbrand.page.C83978y3) r0
            com.tencent.mm.plugin.appbrand.jsapi.f r3 = r6.mo124764Z()
            com.tencent.mm.plugin.appbrand.page.t1 r3 = (com.tencent.p014mm.plugin.appbrand.page.C83928t1) r3
            android.content.Context r3 = r3.getContext()
            r0.mo63312f(r3)
            boolean r7 = super.mo111243J(r7, r8)
            com.tencent.mm.plugin.appbrand.jsapi.f r8 = r6.mo124764Z()
            com.tencent.mm.plugin.appbrand.page.t1 r8 = (com.tencent.p014mm.plugin.appbrand.page.C83928t1) r8
            java.lang.String r0 = "<this>"
            gy3.C87412m.m108594g(r8, r0)
            com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC r0 = r8.getRuntime()
            if (r0 != 0) goto L_0x00a0
            goto L_0x0142
        L_0x00a0:
            com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC r0 = r8.getRuntime()
            boolean r0 = r0.mo113064k0()
            if (r0 == 0) goto L_0x00ac
            goto L_0x0142
        L_0x00ac:
            com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC r0 = r8.getRuntime()
            boolean r0 = r0.mo121254q1()
            if (r0 == 0) goto L_0x00b8
            goto L_0x0142
        L_0x00b8:
            com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC r0 = r8.getRuntime()
            if (r0 == 0) goto L_0x00c1
            java.lang.String r0 = r0.f238147j
            goto L_0x00c2
        L_0x00c1:
            r0 = r1
        L_0x00c2:
            java.lang.String r3 = "wxfe02ecfe70800f46"
            boolean r0 = gy3.C87412m.m108589b(r0, r3)
            if (r0 == 0) goto L_0x00cd
            goto L_0x0142
        L_0x00cd:
            boolean r0 = r8.f244578Y
            if (r0 != 0) goto L_0x00d3
            goto L_0x0142
        L_0x00d3:
            com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC r0 = r8.getRuntime()
            com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC r0 = r0.mo113210l1()
            wi0.a0 r0 = r0.mo111304q()
            wi0.a0 r3 = wi0.C90973a0.TRANSPARENT
            if (r0 != r3) goto L_0x00e4
            goto L_0x0142
        L_0x00e4:
            com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC r0 = r8.getRuntime()
            com.tencent.mm.plugin.appbrand.ui.k4 r0 = r0.f238154s
            boolean r0 = r0 instanceof com.tencent.p014mm.plugin.appbrand.p026ui.C84537h4
            if (r0 == 0) goto L_0x00ef
            goto L_0x0142
        L_0x00ef:
            com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC r0 = r8.getRuntime()
            boolean r0 = r0.mo113194Y1()
            r3 = 1
            if (r0 != 0) goto L_0x011c
            bt0.b r0 = r8.f244554F
            boolean r0 = r0.f233903v
            if (r0 == 0) goto L_0x0109
            com.tencent.mm.plugin.appbrand.page.i0 r0 = r8.f244572U
            boolean r0 = r0 instanceof com.tencent.p014mm.plugin.appbrand.page.C83966x
            if (r0 == 0) goto L_0x0107
            goto L_0x0109
        L_0x0107:
            r0 = 0
            goto L_0x010a
        L_0x0109:
            r0 = 1
        L_0x010a:
            if (r0 != 0) goto L_0x011c
            java.lang.String r0 = r8.getAppId()
            com.tencent.mm.plugin.appbrand.report.quality.QualitySessionRuntime r0 = com.tencent.p014mm.plugin.appbrand.report.quality.C84185b.m103770c(r0, r3)
            if (r0 == 0) goto L_0x0118
            com.tencent.mm.plugin.appbrand.report.quality.q r1 = r0.f245843D
        L_0x0118:
            com.tencent.mm.plugin.appbrand.report.quality.q r0 = com.tencent.p014mm.plugin.appbrand.report.quality.C84217q.PreloadOnProcessCreated
            if (r1 != r0) goto L_0x0142
        L_0x011c:
            java.lang.Boolean[] r0 = new java.lang.Boolean[r3]
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r0[r2] = r1
            android.view.View[] r1 = new android.view.View[r3]
            java.lang.Long[] r3 = new java.lang.Long[r3]
            r4 = 0
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r3[r2] = r4
            com.tencent.mm.plugin.appbrand.h r2 = new com.tencent.mm.plugin.appbrand.h
            r2.<init>(r0, r3, r8, r1)
            r8.mo116272g0(r2)
            android.view.ViewGroup r2 = r8.f244552D
            if (r2 == 0) goto L_0x0142
            com.tencent.mm.plugin.appbrand.i r4 = new com.tencent.mm.plugin.appbrand.i
            r4.<init>(r0, r8, r1, r3)
            r2.post(r4)
        L_0x0142:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.page.C83910s1.mo111243J(java.lang.String, com.tencent.mm.plugin.appbrand.page.h4):boolean");
    }

    /* renamed from: N */
    public void mo114828N(String str, C90636f.C90637a[] aVarArr, boolean[] zArr, Object[] objArr, long j, long j2) {
        boolean z;
        C90636f.C90637a[] aVarArr2 = aVarArr;
        long j3 = j;
        long j4 = j2;
        String uuid = (!TextUtils.isEmpty(str) || !BuildInfo.DEBUG) ? str : UUID.randomUUID().toString();
        if (!TextUtils.isEmpty(uuid) && aVarArr2.length != 0 && zArr.length != 0) {
            int length = aVarArr2.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    z = true;
                    break;
                } else if (aVarArr2[i] != null) {
                    z = false;
                    break;
                } else {
                    i++;
                }
            }
            if (!z) {
                long j5 = 0;
                for (C90636f.C90637a aVar : aVarArr2) {
                    if (aVar != null) {
                        j5 += aVar.f260400k;
                    }
                }
                AppBrandRuntimeWC C0 = mo116498d0();
                WeAppQualityPageframeInjectStruct.C80771a aVar2 = null;
                QualitySessionRuntime a = C0 == null ? null : C84185b.m103768a(C0);
                if (a != null) {
                    WeAppQualityPageframeInjectStruct weAppQualityPageframeInjectStruct = new WeAppQualityPageframeInjectStruct();
                    weAppQualityPageframeInjectStruct.f236996d = weAppQualityPageframeInjectStruct.mo86045b("InstanceId", a.f245832d, true);
                    weAppQualityPageframeInjectStruct.f236997e = weAppQualityPageframeInjectStruct.mo86045b("AppId", mo125215b0(), true);
                    weAppQualityPageframeInjectStruct.f236998f = (long) a.f245837i;
                    int i2 = a.f245834f;
                    if (i2 == 1) {
                        aVar2 = WeAppQualityPageframeInjectStruct.C80771a.release;
                    } else if (i2 == 2) {
                        aVar2 = WeAppQualityPageframeInjectStruct.C80771a.debug;
                    } else if (i2 == 3) {
                        aVar2 = WeAppQualityPageframeInjectStruct.C80771a.demo;
                    }
                    weAppQualityPageframeInjectStruct.f236999g = aVar2;
                    weAppQualityPageframeInjectStruct.f237000h = (long) a.f245835g;
                    long j6 = j4 - j3;
                    weAppQualityPageframeInjectStruct.f237001i = j6;
                    weAppQualityPageframeInjectStruct.mo86046c("CostTimeMs", j6);
                    weAppQualityPageframeInjectStruct.f237002j = (long) a.f245836h;
                    weAppQualityPageframeInjectStruct.f237003k = j3;
                    weAppQualityPageframeInjectStruct.mo86048e("StartTimeStampMs", j3);
                    weAppQualityPageframeInjectStruct.f237004l = j4;
                    weAppQualityPageframeInjectStruct.mo86048e("EndTimeStampMs", j4);
                    weAppQualityPageframeInjectStruct.f237006n = j5;
                    weAppQualityPageframeInjectStruct.f237007o = 0;
                    C84191e eVar = C84185b.f245912a;
                    weAppQualityPageframeInjectStruct.f237008p = eVar.mo116901e((C83928t1) mo124764Z());
                    weAppQualityPageframeInjectStruct.f237009q = weAppQualityPageframeInjectStruct.mo86045b("engineVersion", eVar.mo116900d() + "", true);
                    weAppQualityPageframeInjectStruct.f237010r = weAppQualityPageframeInjectStruct.mo86045b("lazyLoadKey", uuid, true);
                    weAppQualityPageframeInjectStruct.mo86054n();
                }
            }
        }
    }

    /* renamed from: T */
    public void mo111246T() {
        if (C83155d0.m102047e((C83780d1) mo124764Z())) {
            Log.m105924i("MicroMsg.AppBrandPageViewRendererWC", "page initNativeTransServiceId");
            C83155d0.m102044b(((C83928t1) mo124764Z()).getJsRuntime(), ((C83928t1) mo124764Z()).mo116160O0().hashCode(), ((C83928t1) mo124764Z()).getComponentId(), mo125215b0());
        }
        super.mo111246T();
        mo116072t(C90087f.class);
        ((C83978y3) this.f244454g).mo72054M0(new C83914f());
        if (C84905f.m104620a(((C83928t1) mo124764Z()).getRuntime())) {
            mo124765a0(C90091i.class, new C84904e((C83780d1) mo124764Z()));
        }
    }

    /* renamed from: W */
    public void mo111247W(View view) {
        super.mo111247W(view);
        ((C83928t1) mo124764Z()).mo116151F0().mo62473a(new C83911a(this));
    }

    /* renamed from: f0 */
    public C84003h mo116059f0() {
        return new C84009k((C83928t1) mo124764Z());
    }

    /* renamed from: k */
    public void mo111264k() {
        super.mo111264k();
        HalfScreenConfig halfScreenConfig = mo116498d0().mo113210l1().f234815R0;
        if (halfScreenConfig.mo76931c()) {
            C83797e3 e3Var = this.f244454g;
            if (halfScreenConfig.f157948h) {
                e3Var.setBackgroundColor(-1);
            }
            C40502j2 D0 = mo116495D0();
            if (!(D0 instanceof C40514m) || !halfScreenConfig.f157951n) {
                ((C40514m) D0).setFixSizeEnable(false);
            } else {
                ((C40514m) D0).setFixSizeEnable(true);
            }
        }
    }

    /* renamed from: k0 */
    public String mo116064k0() {
        AppBrandRuntimeWC C0 = mo116498d0();
        C87412m.m108594g(C0, "embedWxa");
        HalfScreenConfig halfScreenConfig = C0.mo113210l1().f234815R0;
        C87412m.m108593f(halfScreenConfig, "embedWxa.initConfig.halfScreenConfig");
        return halfScreenConfig.mo76931c() && halfScreenConfig.f157932C == HalfScreenConfig.C55455e.EMBED ? "portrait" : super.mo116064k0();
    }

    /* renamed from: o0 */
    public C83816h3 mo116068o0() {
        Objects.requireNonNull(mo116495D0());
        if (!mo116495D0().supportFeature(2002) || !mo116495D0().supportFeature(2004)) {
            return null;
        }
        C33407g gVar = C33407g.f90517a;
        return new C83913e(this);
    }

    /* renamed from: p */
    public Map<String, C82870p> mo111268p() {
        return (Map) C87690d.m109090a("AppBrandPageViewRendererWC.onCreateJsApiPool()", new C83912b(this));
    }

    /* renamed from: s0 */
    public void mo116071s0(String str) {
        super.mo116071s0(str);
        C84240s.m103846l(mo125215b0(), 27, 0);
    }

    /* renamed from: t */
    public final <T> T mo116072t(Class<T> cls) {
        Class cls2 = C90087f.class;
        if (cls2 != cls) {
            return super.mo116072t(cls);
        }
        C90087f fVar = (C90087f) super.mo116072t(cls2);
        if (fVar == null) {
            return null;
        }
        if (this.f244981K == null) {
            this.f244981K = new C83982z2(fVar);
        }
        C83928t1 t1Var = (C83928t1) mo124764Z();
        Objects.requireNonNull(t1Var);
        this.f244981K.mo116617i(t1Var.mo116520A1());
        return cls.cast(this.f244981K);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: v0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo116075v0(p1044ub.C90636f.C90637a r27, boolean r28, long r29, long r31, java.lang.Object r33) {
        /*
            r26 = this;
            r9 = r26
            r0 = r27
            r10 = r29
            r12 = r31
            super.mo116075v0(r27, r28, r29, r31, r33)
            com.tencent.mm.plugin.appbrand.jsapi.f r1 = r26.mo124764Z()
            if (r1 != 0) goto L_0x0012
            return
        L_0x0012:
            java.lang.String r8 = r0.f260398i
            java.lang.String r14 = r0.f260399j
            boolean r1 = android.text.TextUtils.isEmpty(r8)
            if (r1 == 0) goto L_0x001d
            return
        L_0x001d:
            r1 = 4
            java.lang.String r15 = "MicroMsg.AppBrandPageViewRendererWC"
            r2 = 3
            r3 = 2
            r7 = 0
            r5 = 1
            if (r28 != 0) goto L_0x0044
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r4 = r26.mo125215b0()
            r1[r7] = r4
            r1[r5] = r8
            java.lang.String r4 = r9.f244457j
            r1[r3] = r4
            int r4 = r26.hashCode()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r1[r2] = r4
            java.lang.String r4 = "[!]reportBootstrapScriptEvaluateResult !succeed appID[%s] name[%s] url[%s] hash[%d]"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r15, r4, r1)
            goto L_0x0061
        L_0x0044:
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r4 = r26.mo125215b0()
            r1[r7] = r4
            r1[r5] = r8
            java.lang.String r4 = r9.f244457j
            r1[r3] = r4
            int r4 = r26.hashCode()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r1[r2] = r4
            java.lang.String r4 = "[+]reportBootstrapScriptEvaluateResult succeed appId[%s] name[%s] url[%s] hash[%d]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r15, r4, r1)
        L_0x0061:
            java.lang.String[] r1 = p1044ub.C90636f.f260395H0
            boolean r1 = u24.C90595a.m113498b(r1, r8)
            if (r1 == 0) goto L_0x006a
            return
        L_0x006a:
            com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC r1 = r26.mo116498d0()
            if (r1 == 0) goto L_0x00a6
            java.lang.String[] r1 = p1044ub.C90636f.f260396I0
            boolean r1 = u24.C90595a.m113498b(r1, r8)
            if (r1 != 0) goto L_0x00a6
            com.tencent.mm.plugin.appbrand.jsapi.f r1 = r26.mo124764Z()
            com.tencent.mm.plugin.appbrand.page.t1 r1 = (com.tencent.p014mm.plugin.appbrand.page.C83928t1) r1
            java.lang.Class<com.tencent.mm.plugin.appbrand.page.c1> r4 = com.tencent.p014mm.plugin.appbrand.page.C83773c1.class
            com.tencent.mm.plugin.appbrand.jsapi.m r1 = r1.mo109671p(r4)
            com.tencent.mm.plugin.appbrand.page.c1 r1 = (com.tencent.p014mm.plugin.appbrand.page.C83773c1) r1
            boolean r1 = r1.mo116114a()
            if (r1 == 0) goto L_0x00a6
            if (r28 == 0) goto L_0x00a5
            java.lang.String r1 = r0.f260398i
            ub.f$a[] r2 = new p1044ub.C90636f.C90637a[r5]
            r2[r7] = r0
            boolean[] r3 = new boolean[r5]
            r3[r7] = r28
            java.lang.Object[] r4 = new java.lang.Object[r5]
            r4[r7] = r33
            r0 = r26
            r5 = r29
            r7 = r31
            r0.mo114828N(r1, r2, r3, r4, r5, r7)
        L_0x00a5:
            return
        L_0x00a6:
            r8.getClass()
            int r0 = r8.hashCode()
            r16 = -1
            switch(r0) {
                case -827637304: goto L_0x00d6;
                case -710717014: goto L_0x00cb;
                case -30302838: goto L_0x00bf;
                case 1779653932: goto L_0x00b4;
                default: goto L_0x00b2;
            }
        L_0x00b2:
            r0 = -1
            goto L_0x00e0
        L_0x00b4:
            java.lang.String r0 = "WAVConsole.js"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x00bd
            goto L_0x00b2
        L_0x00bd:
            r0 = 3
            goto L_0x00e0
        L_0x00bf:
            java.lang.String r0 = "page-frame.html"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x00c9
            goto L_0x00b2
        L_0x00c9:
            r0 = 2
            goto L_0x00e0
        L_0x00cb:
            java.lang.String r0 = "app-wxss.js"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x00d4
            goto L_0x00b2
        L_0x00d4:
            r0 = 1
            goto L_0x00e0
        L_0x00d6:
            java.lang.String r0 = "WAWebview.js"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x00df
            goto L_0x00b2
        L_0x00df:
            r0 = 0
        L_0x00e0:
            switch(r0) {
                case 0: goto L_0x0227;
                case 1: goto L_0x0216;
                case 2: goto L_0x0216;
                case 3: goto L_0x01fd;
                default: goto L_0x00e3;
            }
        L_0x00e3:
            java.lang.String r0 = "page-frame.js"
            boolean r0 = r8.endsWith(r0)
            if (r0 == 0) goto L_0x0105
            int r0 = r8.length()
            int r0 = r0 + -13
            java.lang.String r1 = r8.substring(r7, r0)
            r0 = r26
            r2 = r8
            r3 = r14
            r4 = r28
            r5 = r29
            r7 = r31
            r0.mo116496E0(r1, r2, r3, r4, r5, r7)
            goto L_0x02e2
        L_0x0105:
            java.lang.String r0 = r9.f244457j
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x02e2
            boolean r0 = r26.mo116067n0()
            if (r0 != 0) goto L_0x0114
            return
        L_0x0114:
            java.lang.String r0 = r26.mo125215b0()
            com.tencent.mm.plugin.appbrand.report.quality.QualitySessionRuntime r0 = com.tencent.p014mm.plugin.appbrand.report.quality.C84185b.m103770c(r0, r5)
            if (r0 == 0) goto L_0x02e2
            com.tencent.mm.autogen.mmdata.rpt.WeAppQualityPageHtmlInjectStruct r1 = new com.tencent.mm.autogen.mmdata.rpt.WeAppQualityPageHtmlInjectStruct
            r1.<init>()
            java.lang.String r4 = r0.f245832d
            java.lang.String r6 = "InstanceId"
            java.lang.String r4 = r1.mo86045b(r6, r4, r5)
            r1.f236976d = r4
            java.lang.String r4 = r26.mo125215b0()
            java.lang.String r6 = "AppId"
            java.lang.String r4 = r1.mo86045b(r6, r4, r5)
            r1.f236977e = r4
            int r4 = r0.f245837i
            long r6 = (long) r4
            r1.f236978f = r6
            int r4 = r0.f245834f
            if (r4 == r5) goto L_0x014e
            if (r4 == r3) goto L_0x014b
            if (r4 == r2) goto L_0x0148
            r2 = 0
            goto L_0x0150
        L_0x0148:
            com.tencent.mm.autogen.mmdata.rpt.WeAppQualityPageHtmlInjectStruct$a r2 = com.tencent.p014mm.autogen.mmdata.rpt.WeAppQualityPageHtmlInjectStruct.C80770a.demo
            goto L_0x0150
        L_0x014b:
            com.tencent.mm.autogen.mmdata.rpt.WeAppQualityPageHtmlInjectStruct$a r2 = com.tencent.p014mm.autogen.mmdata.rpt.WeAppQualityPageHtmlInjectStruct.C80770a.debug
            goto L_0x0150
        L_0x014e:
            com.tencent.mm.autogen.mmdata.rpt.WeAppQualityPageHtmlInjectStruct$a r2 = com.tencent.p014mm.autogen.mmdata.rpt.WeAppQualityPageHtmlInjectStruct.C80770a.release
        L_0x0150:
            r1.f236979g = r2
            int r2 = r0.f245835g
            long r2 = (long) r2
            r1.f236980h = r2
            long r2 = r12 - r10
            r1.f236981i = r2
            java.lang.String r4 = "CostTimeMs"
            r1.mo86046c(r4, r2)
            int r0 = r0.f245836h
            long r2 = (long) r0
            r1.f236982j = r2
            r1.f236983k = r10
            java.lang.String r0 = "StartTimeStampMs"
            r1.mo86048e(r0, r10)
            r1.f236984l = r12
            java.lang.String r0 = "EndTimeStampMs"
            r1.mo86048e(r0, r12)
            int r0 = r14.length()
            long r2 = (long) r0
            r1.f236987o = r2
            java.lang.String r0 = p206nj.C117627q.m165908a(r8)
            java.lang.String r2 = "path"
            java.lang.String r0 = r1.mo86045b(r2, r0, r5)
            r1.f236985m = r0
            com.tencent.mm.plugin.appbrand.jsapi.f r0 = r26.mo124764Z()     // Catch:{ NullPointerException -> 0x01b4 }
            com.tencent.mm.plugin.appbrand.page.t1 r0 = (com.tencent.p014mm.plugin.appbrand.page.C83928t1) r0     // Catch:{ NullPointerException -> 0x01b4 }
            com.tencent.mm.plugin.appbrand.page.i0 r0 = r0.f244572U     // Catch:{ NullPointerException -> 0x01b4 }
            com.tencent.mm.plugin.appbrand.jsapi.f r2 = r26.mo124764Z()     // Catch:{ NullPointerException -> 0x01b4 }
            com.tencent.mm.plugin.appbrand.page.t1 r2 = (com.tencent.p014mm.plugin.appbrand.page.C83928t1) r2     // Catch:{ NullPointerException -> 0x01b4 }
            com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC r2 = r2.getRuntime()     // Catch:{ NullPointerException -> 0x01b4 }
            com.tencent.mm.plugin.appbrand.page.AppBrandPageContainerWC r2 = r2.mo113212m1()     // Catch:{ NullPointerException -> 0x01b4 }
            com.tencent.mm.plugin.appbrand.page.i0 r0 = r2.mo116377t(r0)     // Catch:{ NullPointerException -> 0x01b4 }
            if (r0 == 0) goto L_0x01b4
            com.tencent.mm.plugin.appbrand.page.d1 r0 = r0.getCurrentPageView()     // Catch:{ NullPointerException -> 0x01b4 }
            java.lang.String r0 = r0.mo116162Q0()     // Catch:{ NullPointerException -> 0x01b4 }
            java.lang.String r2 = "referrer"
            java.lang.String r0 = r1.mo86045b(r2, r0, r5)     // Catch:{ NullPointerException -> 0x01b4 }
            r1.f236986n = r0     // Catch:{ NullPointerException -> 0x01b4 }
        L_0x01b4:
            com.tencent.mm.plugin.appbrand.report.quality.e r0 = com.tencent.p014mm.plugin.appbrand.report.quality.C84185b.f245912a
            com.tencent.mm.plugin.appbrand.jsapi.f r2 = r26.mo124764Z()
            com.tencent.mm.plugin.appbrand.page.t1 r2 = (com.tencent.p014mm.plugin.appbrand.page.C83928t1) r2
            long r2 = r0.mo116901e(r2)
            r1.f236989q = r2
            java.lang.String r2 = "//XWEB_SCRIPT:"
            boolean r2 = r14.startsWith(r2)
            if (r2 == 0) goto L_0x01d7
            java.util.Set<java.lang.String> r2 = r9.f244979I
            java.util.HashSet r2 = (java.util.HashSet) r2
            boolean r2 = r2.contains(r8)
            if (r2 == 0) goto L_0x01d7
            r2 = 1
            goto L_0x01d9
        L_0x01d7:
            r2 = 0
        L_0x01d9:
            r1.f236988p = r2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            long r3 = r0.mo116900d()
            r2.append(r3)
            java.lang.String r0 = ""
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            java.lang.String r2 = "engineVersion"
            java.lang.String r0 = r1.mo86045b(r2, r0, r5)
            r1.f236990r = r0
            r1.mo86054n()
            goto L_0x02e2
        L_0x01fd:
            boolean r0 = r26.mo116544n()
            if (r0 != 0) goto L_0x0209
            boolean r0 = r26.mo116067n0()
            if (r0 == 0) goto L_0x02e2
        L_0x0209:
            r0 = r26
            r1 = r8
            r2 = r14
            r3 = r29
            r5 = r31
            r0.mo116497F0(r1, r2, r3, r5)
            goto L_0x02e2
        L_0x0216:
            java.lang.String r1 = "__APP__"
            r0 = r26
            r2 = r8
            r3 = r14
            r4 = r28
            r5 = r29
            r7 = r31
            r0.mo116496E0(r1, r2, r3, r4, r5, r7)
            goto L_0x02e2
        L_0x0227:
            com.tencent.mm.plugin.report.service.n r25 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r18 = 370(0x172, double:1.83E-321)
            r20 = 1
            r22 = 1
            r24 = 0
            r17 = r25
            r17.idkeyStat(r18, r20, r22, r24)
            com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC r0 = r26.mo116498d0()
            if (r0 == 0) goto L_0x0260
            if (r28 == 0) goto L_0x024e
            java.lang.String r0 = r26.mo125215b0()
            uo0.a r1 = com.tencent.p014mm.plugin.appbrand.step.KSProcessWeAppLaunch.stepInjectJSWAWebview
            r2 = r8
            r3 = r29
            r9 = 1
            r5 = r31
            com.tencent.p014mm.plugin.appbrand.keylogger.C83226n.m102129f(r0, r1, r2, r3, r5)
            goto L_0x0261
        L_0x024e:
            r9 = 1
            java.lang.String r0 = r26.mo125215b0()
            uo0.a r1 = com.tencent.p014mm.plugin.appbrand.step.KSProcessWeAppLaunch.stepInjectJSWAWebview
            java.lang.String r2 = ""
            r3 = r8
            r4 = r29
            r6 = r31
            com.tencent.p014mm.plugin.appbrand.keylogger.C83226n.m102127d(r0, r1, r2, r3, r4, r6)
            goto L_0x0261
        L_0x0260:
            r9 = 1
        L_0x0261:
            if (r28 == 0) goto L_0x0288
            boolean r0 = r26.mo116544n()
            if (r0 != 0) goto L_0x026f
            boolean r0 = r26.mo116067n0()
            if (r0 == 0) goto L_0x027a
        L_0x026f:
            r0 = r26
            r1 = r8
            r2 = r14
            r3 = r29
            r5 = r31
            r0.mo116497F0(r1, r2, r3, r5)
        L_0x027a:
            r16 = 370(0x172, double:1.83E-321)
            r18 = 3
            r20 = 1
            r22 = 0
            r15 = r25
            r15.idkeyStat(r16, r18, r20, r22)
            goto L_0x02e2
        L_0x0288:
            java.lang.Object[] r0 = new java.lang.Object[r9]
            java.lang.String r1 = r26.mo125215b0()
            r2 = 0
            r0[r2] = r1
            java.lang.String r1 = "Inject SDK Page Script Failed   appId = %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r15, r1, r0)
            r18 = 370(0x172, double:1.83E-321)
            r20 = 2
            r22 = 1
            r24 = 0
            r17 = r25
            r17.idkeyStat(r18, r20, r22, r24)
            java.lang.String r0 = r26.mo125215b0()
            r1 = 24
            com.tencent.p014mm.plugin.appbrand.report.C84240s.m103846l(r0, r1, r2)
            com.tencent.mm.plugin.appbrand.jsapi.f r0 = r26.mo124764Z()
            com.tencent.mm.plugin.appbrand.page.t1 r0 = (com.tencent.p014mm.plugin.appbrand.page.C83928t1) r0
            com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC r0 = r0.getRuntime()
            if (r0 == 0) goto L_0x02cb
            com.tencent.mm.plugin.appbrand.config.AppBrandSysConfigWC r1 = r0.mo113213o1()
            com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo r1 = r1.f261072r
            int r7 = r1.pkgVersion
            com.tencent.mm.plugin.appbrand.config.AppBrandSysConfigWC r0 = r0.mo113213o1()
            com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo r0 = r0.f261072r
            int r0 = r0.f238585d
            r16 = r0
            r2 = r7
        L_0x02cb:
            java.lang.String r0 = r26.mo125215b0()
            r1 = 370(0x172, float:5.18E-43)
            r3 = 2
            r4 = 1
            r27 = r0
            r28 = r2
            r29 = r16
            r30 = r1
            r31 = r3
            r32 = r4
            com.tencent.p014mm.plugin.appbrand.report.C84240s.m103843i(r27, r28, r29, r30, r31, r32)
        L_0x02e2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.page.C83910s1.mo116075v0(ub.f$a, boolean, long, long, java.lang.Object):void");
    }

    /* renamed from: w0 */
    public boolean mo116076w0(C83817h4 h4Var) {
        if (!C91516n.m114822a(mo125215b0()) && !C83608m4.m102642a(((C83928t1) mo124764Z()).getRuntime()) && !((C83928t1) mo124764Z()).getRuntime().mo113210l1().f234815R0.mo76931c() && !((C83928t1) mo124764Z()).getRuntime().mo121251g1() && !((C83928t1) mo124764Z()).getRuntime().mo113194Y1()) {
            return super.mo116076w0(h4Var);
        }
        return false;
    }

    /* renamed from: y0 */
    public C40501f3 mo116499y0(Context context) {
        String str;
        this.f244976F = Util.currentTicks();
        C40519d dVar = new C40519d(this, context);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        Object invoke = dVar.invoke();
        if (invoke instanceof C87690d.C87691a) {
            str = ((C87690d.C87691a) invoke).mo63320l();
        } else if (invoke == null || (str = invoke.toString()) == null) {
            str = "";
        }
        boolean a = C2039g2.m1987a();
        long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
        if (elapsedRealtime2 <= 32 || !a) {
            Log.m105924i("Luggage.Utils.Profile", "runProfiled:log:" + "onCreateRealWebView" + " cost " + elapsedRealtime2 + " ms result:" + str + " isMainThread: " + a + ' ');
        } else {
            Log.m105928w("Luggage.Utils.Profile", "block main thread and skip " + ((int) (elapsedRealtime2 / ((long) 16))) + " frames! runProfiled:log:" + "onCreateRealWebView" + " cost " + elapsedRealtime2 + " ms result:" + str + " isMainThread: " + a + ' ');
        }
        C40502j2 j2Var = (C40502j2) invoke;
        j2Var.setOverScrolledListener(this.f244982L);
        return j2Var;
    }

    /* renamed from: z0 */
    public final void mo116500z0(String str, long j, long j2) {
        boolean z;
        if (mo124764Z() != null && mo116067n0()) {
            C84191e eVar = C84185b.f245912a;
            C81879g gVar = (C81879g) mo124764Z();
            C88267e K1 = ((C83928t1) mo124764Z()).mo116160O0();
            if (K1 == null) {
                z = false;
            } else {
                boolean O0 = K1.mo122650O0();
                if (!O0) {
                    O0 = true;
                }
                z = O0;
            }
            eVar.mo116892k(gVar, str, j, j2, z, 0);
        }
    }
}
