package com.tencent.p014mm.plugin.appbrand;

import android.util.DisplayMetrics;
import android.view.View;
import br0.C79774c;
import com.tencent.p014mm.plugin.appbrand.config.AppBrandInitConfigWC;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82531i;
import com.tencent.p014mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import di0.C86297n;
import dr0.C86395a;
import gy3.C87412m;
import lu3.C88656g;

/* renamed from: com.tencent.mm.plugin.appbrand.u3 */
public final class C84349u3 implements C88656g {

    /* renamed from: d */
    public final AppBrandInitConfigWC f246282d;

    /* renamed from: e */
    public final AppBrandStatObject f246283e;

    /* renamed from: f */
    public final int f246284f;

    /* renamed from: g */
    public final C86297n f246285g;

    /* renamed from: com.tencent.mm.plugin.appbrand.u3$a */
    public static final class C84350a implements Runnable {

        /* renamed from: d */
        public static final C84350a f246286d = new C84350a();

        public final void run() {
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.u3$b */
    public static final class C84351b implements C82531i.C82538g {

        /* renamed from: a */
        public final /* synthetic */ AppBrandRuntimeWC f246287a;

        /* renamed from: b */
        public final /* synthetic */ C84349u3 f246288b;

        /* renamed from: com.tencent.mm.plugin.appbrand.u3$b$a */
        public static final class C84352a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ AppBrandRuntimeWC f246289d;

            /* renamed from: e */
            public final /* synthetic */ C84349u3 f246290e;

            public C84352a(AppBrandRuntimeWC appBrandRuntimeWC, C84349u3 u3Var) {
                this.f246289d = appBrandRuntimeWC;
                this.f246290e = u3Var;
            }

            public final void run() {
                C84349u3.m103975a(this.f246289d, this.f246290e);
            }
        }

        public C84351b(AppBrandRuntimeWC appBrandRuntimeWC, C84349u3 u3Var) {
            this.f246287a = appBrandRuntimeWC;
            this.f246288b = u3Var;
        }

        public final void onReady() {
            MMHandlerThread.postToMainThread(new C84352a(this.f246287a, this.f246288b));
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.u3$c */
    public static final class C84353c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ AppBrandRuntimeWC f246291d;

        /* renamed from: e */
        public final /* synthetic */ C84349u3 f246292e;

        public C84353c(AppBrandRuntimeWC appBrandRuntimeWC, C84349u3 u3Var) {
            this.f246291d = appBrandRuntimeWC;
            this.f246292e = u3Var;
        }

        public final void run() {
            C84349u3.m103975a(this.f246291d, this.f246292e);
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.u3$d */
    public static final class C84354d implements C29608o3 {

        /* renamed from: a */
        public final /* synthetic */ AppBrandRuntimeWC f246293a;

        /* renamed from: b */
        public final /* synthetic */ C84349u3 f246294b;

        /* renamed from: com.tencent.mm.plugin.appbrand.u3$d$a */
        public static final class C84355a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ AppBrandRuntimeWC f246295d;

            /* renamed from: e */
            public final /* synthetic */ C84349u3 f246296e;

            public C84355a(AppBrandRuntimeWC appBrandRuntimeWC, C84349u3 u3Var) {
                this.f246295d = appBrandRuntimeWC;
                this.f246296e = u3Var;
            }

            public final void run() {
                C84349u3.m103975a(this.f246295d, this.f246296e);
            }
        }

        public C84354d(AppBrandRuntimeWC appBrandRuntimeWC, C84349u3 u3Var) {
            this.f246293a = appBrandRuntimeWC;
            this.f246294b = u3Var;
        }

        /* renamed from: a */
        public final void mo56845a() {
            this.f246293a.mo113212m1().post(new C84355a(this.f246293a, this.f246294b));
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.u3$e */
    public static final class C84356e implements C85038x3 {

        /* renamed from: a */
        public final /* synthetic */ C84349u3 f246297a;

        public C84356e(C84349u3 u3Var) {
            this.f246297a = u3Var;
        }

        /* renamed from: a */
        public void mo117038a(String str) {
            C86297n nVar = this.f246297a.f246285g;
            if (nVar != null) {
                C86297n.C86298a.m106900a(nVar, -7, (String) null, 2, (Object) null);
            }
        }

        /* renamed from: b */
        public void mo117039b() {
        }

        /* renamed from: c */
        public void mo117040c() {
        }

        /* renamed from: d */
        public void mo117041d() {
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.u3$f */
    public static final class C84357f implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ AppBrandRuntimeWC f246298d;

        public C84357f(AppBrandRuntimeWC appBrandRuntimeWC) {
            this.f246298d = appBrandRuntimeWC;
        }

        public final void run() {
            C84803v.m104484b(this.f246298d);
        }
    }

    public C84349u3(BindRemoteServiceData bindRemoteServiceData, C86297n nVar) {
        C87412m.m108594g(bindRemoteServiceData, "data");
        AppBrandInitConfigWC appBrandInitConfigWC = bindRemoteServiceData.f238355d;
        AppBrandStatObject appBrandStatObject = bindRemoteServiceData.f238356e;
        int i = bindRemoteServiceData.f238357f;
        C87412m.m108594g(appBrandInitConfigWC, "config");
        C87412m.m108594g(appBrandStatObject, "stat");
        this.f246282d = appBrandInitConfigWC;
        this.f246283e = appBrandStatObject;
        this.f246284f = i;
        this.f246285g = nVar;
    }

    /* renamed from: a */
    public static final void m103975a(AppBrandRuntimeWC appBrandRuntimeWC, C84349u3 u3Var) {
        C81820e3 e3Var = appBrandRuntimeWC.f238142e;
        AppBrandRuntimeContainerWC appBrandRuntimeContainerWC = e3Var instanceof AppBrandRuntimeContainerWC ? (AppBrandRuntimeContainerWC) e3Var : null;
        boolean z = true;
        if (appBrandRuntimeContainerWC == null || !appBrandRuntimeContainerWC.f238209q) {
            z = false;
        }
        Log.m105924i("MicroMsg.AppBrandPreRenderColdStartService.RemoteLoader", "run() callbackOnPreRenderComplete id:" + u3Var.f246284f + ", appId:" + appBrandRuntimeWC.f238147j + ", instanceId:" + appBrandRuntimeWC.mo113210l1().f234838r + ", hasResumedContainer:" + z);
        if (z) {
            C86297n nVar = u3Var.f246285g;
            if (nVar != null) {
                C86297n.C86298a.m106900a(nVar, -2, (String) null, 2, (Object) null);
                return;
            }
            return;
        }
        appBrandRuntimeWC.mo113086w();
        C84803v.m104484b(appBrandRuntimeWC);
        C86297n nVar2 = u3Var.f246285g;
        if (nVar2 != null) {
            nVar2.onSuccess();
        }
    }

    /* renamed from: b */
    public static final void m103976b(AppBrandRuntimeWC appBrandRuntimeWC, C84349u3 u3Var) {
        boolean z;
        Log.m105924i("MicroMsg.AppBrandPreRenderColdStartService.RemoteLoader", "run() waitForRuntimeInitReady id:" + u3Var.f246284f + ", appId:" + appBrandRuntimeWC.f238147j + ", instanceId:" + u3Var.f246282d.f234838r);
        C84354d dVar = new C84354d(appBrandRuntimeWC, u3Var);
        if (appBrandRuntimeWC.f238118Q) {
            dVar.mo56845a();
        } else {
            appBrandRuntimeWC.f238106D.add(dVar);
        }
        C84356e eVar = new C84356e(u3Var);
        C84888w3 w3Var = appBrandRuntimeWC.f238107E;
        if (!w3Var.f247413b.get()) {
            w3Var.f247412a.add(eVar);
        }
        synchronized (appBrandRuntimeWC) {
            z = appBrandRuntimeWC.f238120R;
        }
        if (!z) {
            appBrandRuntimeWC.mo113073p0();
        }
        C79774c f0 = appBrandRuntimeWC.mo113054f0();
        C87412m.m108592e(f0, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.platform.window.fake.PreRenderCustomWindowAndroid");
        DisplayMetrics vDisplayMetrics = ((C86395a) f0).getVDisplayMetrics();
        appBrandRuntimeWC.f238153r.measure(View.MeasureSpec.makeMeasureSpec(vDisplayMetrics.widthPixels, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(vDisplayMetrics.heightPixels, Integer.MIN_VALUE));
        appBrandRuntimeWC.mo113020N0(new C84357f(appBrandRuntimeWC));
    }

    public String getKey() {
        return "AppBrandPreRenderColdStartService.RemoteLoader-" + this.f246284f;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0071, code lost:
        if (r6.getStackSize() > 1) goto L_0x00db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x008e, code lost:
        if ((r6 != null && r6.f238209q) != false) goto L_0x00db;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r8 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "run()-start, id:"
            r0.append(r1)
            int r1 = r8.f246284f
            r0.append(r1)
            java.lang.String r1 = ", appId:"
            r0.append(r1)
            com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC r1 = r8.f246282d
            java.lang.String r1 = r1.f239362d
            r0.append(r1)
            java.lang.String r1 = ", instanceId:"
            r0.append(r1)
            com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC r1 = r8.f246282d
            java.lang.String r1 = r1.f234838r
            r0.append(r1)
            java.lang.String r1 = ", sessionId:"
            r0.append(r1)
            com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC r1 = r8.f246282d
            java.lang.String r1 = r1.f234837q
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "MicroMsg.AppBrandPreRenderColdStartService.RemoteLoader"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
            com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC r0 = r8.f246282d
            java.lang.String r0 = r0.f239362d
            com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC r0 = com.tencent.p014mm.plugin.appbrand.C81682d.m100222b(r0)
            r2 = 1
            r3 = 0
            r4 = 0
            if (r0 == 0) goto L_0x00dc
            boolean r5 = r0.mo113064k0()
            if (r5 == 0) goto L_0x0052
            goto L_0x00dc
        L_0x0052:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC> r5 = com.tencent.p014mm.plugin.appbrand.C84803v.f247240a
            boolean r6 = r5.containsValue(r0)
            if (r6 != 0) goto L_0x00dc
            boolean r6 = r0.mo113069n0()
            if (r6 != 0) goto L_0x0062
            goto L_0x00dc
        L_0x0062:
            boolean r6 = r0.mo113069n0()
            if (r6 == 0) goto L_0x0075
            com.tencent.mm.plugin.appbrand.e3 r6 = r0.f238142e
            gy3.C87412m.m108591d(r6)
            int r6 = r6.getStackSize()
            if (r6 <= r2) goto L_0x0075
            goto L_0x00db
        L_0x0075:
            boolean r6 = r0.mo113069n0()
            if (r6 == 0) goto L_0x0091
            com.tencent.mm.plugin.appbrand.e3 r6 = r0.f238142e
            boolean r7 = r6 instanceof com.tencent.p014mm.plugin.appbrand.AppBrandRuntimeContainerWC
            if (r7 == 0) goto L_0x0084
            com.tencent.mm.plugin.appbrand.AppBrandRuntimeContainerWC r6 = (com.tencent.p014mm.plugin.appbrand.AppBrandRuntimeContainerWC) r6
            goto L_0x0085
        L_0x0084:
            r6 = r4
        L_0x0085:
            if (r6 == 0) goto L_0x008d
            boolean r6 = r6.f238209q
            if (r6 != r2) goto L_0x008d
            r6 = 1
            goto L_0x008e
        L_0x008d:
            r6 = 0
        L_0x008e:
            if (r6 == 0) goto L_0x0091
            goto L_0x00db
        L_0x0091:
            boolean r5 = r5.containsValue(r0)
            if (r5 != 0) goto L_0x00db
            com.tencent.mm.plugin.appbrand.e3 r5 = r0.f238142e
            boolean r6 = r0.f238122S
            if (r6 == 0) goto L_0x00a0
            r0.mo113086w()
        L_0x00a0:
            if (r5 == 0) goto L_0x00a5
            r5.mo113137q(r0)
        L_0x00a5:
            com.tencent.mm.plugin.appbrand.widget.e r6 = r0.f238153r
            android.view.ViewParent r6 = r6.getParent()
            boolean r7 = r6 instanceof android.view.ViewGroup
            if (r7 == 0) goto L_0x00b2
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            goto L_0x00b3
        L_0x00b2:
            r6 = r4
        L_0x00b3:
            if (r6 == 0) goto L_0x00ba
            com.tencent.mm.plugin.appbrand.widget.e r7 = r0.f238153r
            r6.removeView(r7)
        L_0x00ba:
            r0.mo113196a2(r3)
            com.tencent.p014mm.plugin.appbrand.C84803v.m104484b(r0)
            boolean r6 = r5 instanceof com.tencent.p014mm.plugin.appbrand.AppBrandRuntimeContainerWC
            if (r6 == 0) goto L_0x00dc
            com.tencent.mm.plugin.appbrand.AppBrandRuntimeContainerWC r5 = (com.tencent.p014mm.plugin.appbrand.AppBrandRuntimeContainerWC) r5
            android.app.Activity r6 = r5.mo120548w()
            if (r6 == 0) goto L_0x00d4
            boolean r6 = r6.isFinishing()
            if (r6 != r2) goto L_0x00d4
            r6 = 1
            goto L_0x00d5
        L_0x00d4:
            r6 = 0
        L_0x00d5:
            if (r6 != 0) goto L_0x00dc
            r5.mo113152n0()
            goto L_0x00dc
        L_0x00db:
            r2 = 0
        L_0x00dc:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "run()-shouldReRender:"
            r5.append(r6)
            r5.append(r2)
            java.lang.String r6 = ", existedRt:"
            r5.append(r6)
            r5.append(r0)
            java.lang.String r6 = ", initialized:"
            r5.append(r6)
            if (r0 == 0) goto L_0x00fc
            boolean r6 = r0.f238116N
            goto L_0x00fd
        L_0x00fc:
            r6 = 0
        L_0x00fd:
            r5.append(r6)
            java.lang.String r6 = ", isResumed:"
            r5.append(r6)
            if (r0 == 0) goto L_0x010a
            boolean r6 = r0.f238122S
            goto L_0x010b
        L_0x010a:
            r6 = 0
        L_0x010b:
            r5.append(r6)
            java.lang.String r6 = ", isFinishing:"
            r5.append(r6)
            if (r0 == 0) goto L_0x0118
            boolean r6 = r0.f238117P
            goto L_0x0119
        L_0x0118:
            r6 = 0
        L_0x0119:
            r5.append(r6)
            java.lang.String r6 = ", destroyed:"
            r5.append(r6)
            if (r0 == 0) goto L_0x0128
            boolean r6 = r0.mo113064k0()
            goto L_0x0129
        L_0x0128:
            r6 = 0
        L_0x0129:
            r5.append(r6)
            java.lang.String r6 = ", versionType:"
            r5.append(r6)
            if (r0 == 0) goto L_0x0138
            com.tencent.mm.plugin.appbrand.config.AppBrandInitConfig r6 = r0.f238149o
            int r6 = r6.f239365g
            goto L_0x0139
        L_0x0138:
            r6 = -1
        L_0x0139:
            r5.append(r6)
            java.lang.String r6 = ", stashed:"
            r5.append(r6)
            if (r0 != 0) goto L_0x0146
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC> r6 = com.tencent.p014mm.plugin.appbrand.C84803v.f247240a
            goto L_0x014c
        L_0x0146:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC> r3 = com.tencent.p014mm.plugin.appbrand.C84803v.f247240a
            boolean r3 = r3.containsValue(r0)
        L_0x014c:
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r3)
            r1 = 2
            if (r2 != 0) goto L_0x0162
            di0.n r0 = r8.f246285g
            if (r0 == 0) goto L_0x0161
            r2 = -2
            di0.C86297n.C86298a.m106900a(r0, r2, r4, r1, r4)
        L_0x0161:
            return
        L_0x0162:
            com.tencent.mm.plugin.appbrand.u3$a r2 = com.tencent.p014mm.plugin.appbrand.C84349u3.C84350a.f246286d
            com.tencent.p014mm.plugin.appbrand.keepalive.C83202b.m102118a(r2)
            com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC r2 = r8.f246282d
            com.tencent.mm.plugin.appbrand.report.AppBrandStatObject r3 = r8.f246283e
            r2.f234834c1 = r3
            if (r0 == 0) goto L_0x01c5
            boolean r2 = r0.mo113064k0()
            if (r2 != 0) goto L_0x01c5
            boolean r2 = r0.f238116N
            if (r2 == 0) goto L_0x01c5
            com.tencent.mm.plugin.appbrand.config.AppBrandInitConfig r2 = r0.f238149o
            int r2 = r2.f239365g
            com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC r3 = r8.f246282d
            int r3 = r3.f239365g
            if (r2 != r3) goto L_0x01c5
            dr0.a r2 = new dr0.a
            r2.<init>()
            r0.f238143f = r2
            com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC r2 = r8.f246282d
            r0.mo113084v(r2)
            boolean r2 = r0.f238130W
            boolean r3 = r0.f238128V
            r0.mo113000A()
            if (r3 == 0) goto L_0x01ab
            boolean r2 = r0.mo113064k0()
            if (r2 == 0) goto L_0x01a7
            di0.n r0 = r8.f246285g
            if (r0 == 0) goto L_0x01d7
            r2 = -6
            di0.C86297n.C86298a.m106900a(r0, r2, r4, r1, r4)
            goto L_0x01d7
        L_0x01a7:
            m103976b(r0, r8)
            goto L_0x01d7
        L_0x01ab:
            if (r2 == 0) goto L_0x01bc
            com.tencent.mm.plugin.appbrand.page.t1 r1 = r0.mo113178J1()
            if (r1 == 0) goto L_0x01d7
            com.tencent.mm.plugin.appbrand.u3$b r2 = new com.tencent.mm.plugin.appbrand.u3$b
            r2.<init>(r0, r8)
            r1.mo116272g0(r2)
            goto L_0x01d7
        L_0x01bc:
            com.tencent.mm.plugin.appbrand.u3$c r1 = new com.tencent.mm.plugin.appbrand.u3$c
            r1.<init>(r0, r8)
            com.tencent.p014mm.sdk.platformtools.MMHandlerThread.postToMainThread(r1)
            goto L_0x01d7
        L_0x01c5:
            com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC r0 = new com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC
            dr0.a r1 = new dr0.a
            r1.<init>()
            r0.<init>((br0.C79774c) r1)
            com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC r1 = r8.f246282d
            r0.mo113060i0(r1)
            m103976b(r0, r8)
        L_0x01d7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.C84349u3.run():void");
    }
}
