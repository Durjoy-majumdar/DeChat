package com.tencent.p014mm.plugin.appbrand.launching;

import android.os.Parcelable;
import android.util.SparseArray;
import com.tencent.luggage.sdk.launching.C80243d;
import com.tencent.p014mm.ipcinvoker.type.IPCInteger;
import com.tencent.p014mm.ipcinvoker.type.IPCString;
import com.tencent.p014mm.plugin.appbrand.app.PluginAppBrand;
import com.tencent.p014mm.plugin.appbrand.appcache.C81289m;
import di0.C86299o;
import di3.C86312j;
import gy3.C87412m;
import kr0.C76633z0;
import o40.C61926c;
import z04.C112551y;

/* renamed from: com.tencent.mm.plugin.appbrand.launching.f1 */
public final class C83316f1 {

    /* renamed from: a */
    public static final C83316f1 f243478a = new C83316f1();

    /* renamed from: b */
    public static final SparseArray<C86299o> f243479b = new SparseArray<>();

    /* renamed from: com.tencent.mm.plugin.appbrand.launching.f1$a */
    public static final class C83317a<R extends Parcelable> implements C80243d {

        /* renamed from: a */
        public final /* synthetic */ C86299o f243480a;

        public C83317a(C86299o oVar) {
            this.f243480a = oVar;
        }

        /* renamed from: a */
        public void mo111348a(Parcelable parcelable) {
            C61926c.m72668M(new C1925e1(this.f243480a, (IPCString) parcelable));
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.launching.f1$b */
    public static final class C83318b<R extends Parcelable> implements C80243d {

        /* renamed from: a */
        public final /* synthetic */ C86299o f243481a;

        public C83318b(C86299o oVar) {
            this.f243481a = oVar;
        }

        /* renamed from: a */
        public void mo111348a(Parcelable parcelable) {
            C61926c.m72668M(new C40489g1(this.f243481a, (IPCInteger) parcelable));
        }
    }

    /* renamed from: a */
    public final void mo115607a(C86299o oVar) {
        if (oVar != null) {
            String str = oVar.f250929a;
            boolean z = true;
            if (str == null || str.length() == 0) {
                String str2 = oVar.f250930b;
                if (str2 == null || str2.length() == 0) {
                    throw new IllegalArgumentException("Both username & appId is EMPTY");
                }
            }
            String str3 = oVar.f250929a;
            if (!(str3 == null || str3.length() == 0)) {
                z = false;
            }
            if (!z) {
                String str4 = oVar.f250929a;
                C87412m.m108593f(str4, "username");
                if (!C112551y.m153808h(str4, "@app", false, 2, (Object) null)) {
                    throw new IllegalArgumentException("Invalid weapp username " + oVar.f250929a);
                }
            }
            if (!C81289m.C81290a.m99664b(oVar.f250931c) && !C81289m.C81290a.m99663a(oVar.f250931c)) {
                throw new IllegalArgumentException("Invalid weapp versionType " + oVar.f250931c);
            } else if (oVar.f250939k <= 1000) {
                throw new IllegalArgumentException("Invalid weapp enter scene " + oVar.f250939k);
            }
        } else {
            throw new IllegalArgumentException(new NullPointerException());
        }
    }

    /* renamed from: b */
    public final boolean mo115608b() {
        C76633z0 z0Var = (C76633z0) C86312j.m106911c(C76633z0.class);
        boolean z = true;
        if (z0Var == null || !z0Var.Sm0()) {
            z = false;
        }
        if (z) {
            return PluginAppBrand.getProcessSharedPrefs().getBoolean("com.tencent.mm.plugin.appbrand.launching.isForcedCloseDemoCheckForColdLaunchWxaApp", false);
        }
        return false;
    }

    /* renamed from: c */
    public final boolean mo115609c() {
        C76633z0 z0Var = (C76633z0) C86312j.m106911c(C76633z0.class);
        boolean z = true;
        if (z0Var == null || !z0Var.Sm0()) {
            z = false;
        }
        if (z) {
            return PluginAppBrand.getProcessSharedPrefs().getBoolean("com.tencent.mm.plugin.appbrand.launching.isForcedCloseDemoCheckForWarmLaunchWxaApp", false);
        }
        return false;
    }

    /* renamed from: d */
    public final boolean mo115610d() {
        C76633z0 z0Var = (C76633z0) C86312j.m106911c(C76633z0.class);
        boolean z = true;
        if (z0Var == null || !z0Var.Sm0()) {
            z = false;
        }
        if (z) {
            return PluginAppBrand.getProcessSharedPrefs().getBoolean("com.tencent.mm.plugin.appbrand.launching.isForcedOpenWxaAppForTypedDemo", false);
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0017, code lost:
        return r1;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final di0.C86299o mo115611e(int r4) {
        /*
            r3 = this;
            android.util.SparseArray<di0.o> r0 = f243479b
            monitor-enter(r0)
            int r4 = r0.indexOfKey(r4)     // Catch:{ all -> 0x001c }
            r1 = 0
            if (r4 < 0) goto L_0x0018
            java.lang.Object r2 = r0.valueAt(r4)     // Catch:{ all -> 0x001c }
            di0.o r2 = (di0.C86299o) r2     // Catch:{ all -> 0x001c }
            if (r2 == 0) goto L_0x0016
            r0.removeAt(r4)     // Catch:{ all -> 0x001c }
            r1 = r2
        L_0x0016:
            monitor-exit(r0)
            return r1
        L_0x0018:
            rx3.b0 r4 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x001c }
            monitor-exit(r0)
            return r1
        L_0x001c:
            r4 = move-exception
            monitor-exit(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.launching.C83316f1.mo115611e(int):di0.o");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:40:0x014f, code lost:
        if (r5 == false) goto L_0x0151;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.tencent.p014mm.plugin.appbrand.launching.params.LaunchParcel mo115612f(di0.C86299o r18) {
        /*
            r17 = this;
            r0 = r18
            java.lang.String r1 = "<this>"
            gy3.C87412m.m108594g(r0, r1)
            com.tencent.mm.plugin.appbrand.config.HalfScreenConfig r1 = r0.f250912A
            int r2 = r0.f250949u
            r3 = 3
            r4 = 2
            r5 = 0
            if (r1 != 0) goto L_0x0012
            r2 = 0
            goto L_0x0021
        L_0x0012:
            boolean r6 = r1.mo76931c()
            if (r6 == 0) goto L_0x0021
            com.tencent.mm.plugin.appbrand.config.HalfScreenConfig$e r1 = r1.f157932C
            com.tencent.mm.plugin.appbrand.config.HalfScreenConfig$e r2 = com.tencent.p014mm.plugin.appbrand.config.HalfScreenConfig.C55455e.EMBED
            if (r1 != r2) goto L_0x0020
            r2 = 3
            goto L_0x0021
        L_0x0020:
            r2 = 2
        L_0x0021:
            r0.f250949u = r2
            com.tencent.mm.plugin.appbrand.launching.params.LaunchParcel r1 = new com.tencent.mm.plugin.appbrand.launching.params.LaunchParcel
            r1.<init>()
            java.lang.String r2 = r0.f250929a
            r1.f243730d = r2
            java.lang.String r2 = r0.f250930b
            r1.f243731e = r2
            int r2 = r0.f250932d
            r1.f243732f = r2
            int r2 = r0.f250931c
            r1.f243733g = r2
            int r2 = r0.f250933e
            r1.f243734h = r2
            java.lang.String r2 = r0.f250934f
            r1.f243735i = r2
            java.lang.String r2 = r0.f250936h
            r1.f243736j = r2
            java.lang.Integer[] r2 = new java.lang.Integer[r3]
            r3 = 1176(0x498, float:1.648E-42)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r2[r5] = r3
            r3 = 1177(0x499, float:1.65E-42)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r6 = 1
            r2[r6] = r3
            r3 = 1246(0x4de, float:1.746E-42)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r2[r4] = r3
            int r3 = r0.f250939k
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            boolean r2 = sx3.C110823p.m151009y(r2, r3)
            if (r2 == 0) goto L_0x0073
            java.lang.String r2 = r1.f243735i
            java.lang.String r2 = com.tencent.p014mm.plugin.appbrand.launching.params.LaunchParcel.m102355a(r2)
            r1.f243735i = r2
        L_0x0073:
            di0.k r2 = r0.f250937i
            r3 = 0
            if (r2 == 0) goto L_0x007d
            java.lang.String r2 = r2.mo3693a()
            goto L_0x007e
        L_0x007d:
            r2 = r3
        L_0x007e:
            r1.f243743t = r2
            android.os.PersistableBundle r2 = r0.f250938j
            r1.f243744u = r2
            com.tencent.mm.plugin.appbrand.report.AppBrandStatObject r2 = new com.tencent.mm.plugin.appbrand.report.AppBrandStatObject
            r2.<init>()
            int r4 = r0.f250939k
            r2.f245533f = r4
            java.lang.String r4 = r0.f250940l
            r2.f245534g = r4
            int r4 = r0.f250941m
            r2.f245531d = r4
            java.lang.String r4 = r0.f250942n
            r2.f245532e = r4
            r1.f243738o = r2
            com.tencent.mm.plugin.appbrand.config.AppBrandLaunchReferrer r2 = r0.f250947s
            r1.f243739p = r2
            android.webkit.ValueCallback<java.lang.String> r2 = r0.f250943o
            if (r2 == 0) goto L_0x00ae
            com.tencent.mm.plugin.appbrand.launching.f1$a r2 = new com.tencent.mm.plugin.appbrand.launching.f1$a
            r2.<init>(r0)
            com.tencent.luggage.sdk.launching.b r4 = new com.tencent.luggage.sdk.launching.b
            r4.<init>(r2)
            goto L_0x00af
        L_0x00ae:
            r4 = r3
        L_0x00af:
            r1.f243746w = r4
            android.webkit.ValueCallback<java.lang.Integer> r2 = r0.f250944p
            if (r2 == 0) goto L_0x00bf
            com.tencent.mm.plugin.appbrand.launching.f1$b r2 = new com.tencent.mm.plugin.appbrand.launching.f1$b
            r2.<init>(r0)
            com.tencent.luggage.sdk.launching.b r3 = new com.tencent.luggage.sdk.launching.b
            r3.<init>(r2)
        L_0x00bf:
            r1.f243747x = r3
            int r2 = r0.f250945q
            r1.f243748y = r2
            java.lang.String r2 = r0.f250948t
            r1.f243710B = r2
            int r2 = r0.f250949u
            r1.f243711C = r2
            android.os.PersistableBundle r2 = new android.os.PersistableBundle
            r2.<init>()
            java.lang.String r3 = "KEY_OPENSDK_AD_TRACE_KEY"
            java.lang.String r4 = r0.f250946r
            r2.putString(r3, r4)
            r1.f243709A = r2
            com.tencent.mm.plugin.appbrand.config.AppBrandLaunchFromNotifyReferrer r2 = r0.f250950v
            r1.f243712D = r2
            com.tencent.mm.plugin.appbrand.api.WeAppOpenDeclarePromptBundle r2 = r0.f250951w
            r1.f243717I = r2
            com.tencent.mm.plugin.appbrand.config.HalfScreenConfig r2 = r0.f250912A
            r1.f243713E = r2
            boolean r2 = r0.f250925N
            r1.f243714F = r2
            boolean r2 = r0.f250935g
            r1.f243715G = r2
            com.tencent.luggage.sdk.config.AppBrandInitWindowConfig r2 = new com.tencent.luggage.sdk.config.AppBrandInitWindowConfig
            r8 = 0
            r9 = 0
            wi0.a0 r10 = r0.f250913B
            java.lang.String r11 = r0.f250914C
            boolean r12 = r0.f250915D
            wi0.z r13 = r0.f250923L
            java.lang.String r3 = "this.enterAnimation"
            gy3.C87412m.m108593f(r13, r3)
            wi0.z r14 = r0.f250924M
            java.lang.String r3 = "this.exitAnimation"
            gy3.C87412m.m108593f(r14, r3)
            r15 = 3
            r16 = 0
            r7 = r2
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r1.f243716H = r2
            java.lang.String r2 = r0.f250920I
            r1.f243722N = r2
            com.tencent.mm.plugin.appbrand.report.AppBrandStatObject r2 = r1.f243738o
            int r3 = r0.f250921J
            r2.f245541q = r3
            int r2 = r18.hashCode()
            r1.f243721M = r2
            android.util.SparseArray<di0.o> r2 = f243479b
            monitor-enter(r2)
            int r3 = r1.f243721M     // Catch:{ all -> 0x0187 }
            r2.put(r3, r0)     // Catch:{ all -> 0x0187 }
            rx3.b0 r3 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x0187 }
            monitor-exit(r2)
            com.tencent.mm.modelappbrand.LaunchParamsOptional r2 = new com.tencent.mm.modelappbrand.LaunchParamsOptional
            r2.<init>()
            r1.f243740q = r2
            java.lang.String r2 = r0.f250952x
            if (r2 == 0) goto L_0x0141
            int r2 = r2.length()
            if (r2 != 0) goto L_0x013f
            goto L_0x0141
        L_0x013f:
            r2 = 0
            goto L_0x0142
        L_0x0141:
            r2 = 1
        L_0x0142:
            if (r2 == 0) goto L_0x0151
            java.lang.String r2 = r0.f250953y
            if (r2 == 0) goto L_0x014e
            int r2 = r2.length()
            if (r2 != 0) goto L_0x014f
        L_0x014e:
            r5 = 1
        L_0x014f:
            if (r5 != 0) goto L_0x015b
        L_0x0151:
            com.tencent.mm.modelappbrand.LaunchParamsOptional r2 = r1.f243740q
            java.lang.String r3 = r0.f250952x
            r2.f237919e = r3
            java.lang.String r3 = r0.f250953y
            r2.f237918d = r3
        L_0x015b:
            com.tencent.mm.modelappbrand.LaunchParamsOptional r2 = r1.f243740q
            int r3 = r0.f250922K
            r2.f237922h = r3
            if (r3 == 0) goto L_0x0165
            r1.f243711C = r6
        L_0x0165:
            java.util.List<java.lang.String> r2 = r0.f250954z
            if (r2 == 0) goto L_0x0170
            java.util.List<java.lang.String> r3 = r1.f243719K
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            r3.addAll(r2)
        L_0x0170:
            java.lang.Class<? extends com.tencent.mm.plugin.appbrand.widget.i> r2 = r0.f250926O
            if (r2 == 0) goto L_0x017e
            java.lang.String r2 = r2.getName()
            r1.f243723P = r2
            java.lang.String r2 = r0.f250927P
            r1.f243725R = r2
        L_0x017e:
            boolean r2 = r0.f250918G
            r1.f243728U = r2
            wi0.m r0 = r0.f250928Q
            r1.f243724Q = r0
            return r1
        L_0x0187:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.launching.C83316f1.mo115612f(di0.o):com.tencent.mm.plugin.appbrand.launching.params.LaunchParcel");
    }
}
