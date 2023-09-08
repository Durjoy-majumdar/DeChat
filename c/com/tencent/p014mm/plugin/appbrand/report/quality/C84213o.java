package com.tencent.p014mm.plugin.appbrand.report.quality;

import com.tencent.p014mm.plugin.appbrand.page.C83928t1;
import gy3.C87412m;
import java.util.Map;

/* renamed from: com.tencent.mm.plugin.appbrand.report.quality.o */
public final class C84213o {

    /* renamed from: a */
    public final C83928t1 f245964a;

    /* renamed from: b */
    public boolean f245965b;

    /* renamed from: c */
    public boolean f245966c;

    /* renamed from: d */
    public boolean f245967d;

    /* renamed from: e */
    public long f245968e;

    /* renamed from: f */
    public boolean f245969f;

    /* renamed from: g */
    public String f245970g;

    /* renamed from: h */
    public Map<String, ? extends Object> f245971h;

    /* renamed from: com.tencent.mm.plugin.appbrand.report.quality.o$a */
    public enum C84214a {
        kAppRoute,
        kInitReady,
        kInitReadyDoubleCheck,
        kPageLeave
    }

    public C84213o(C83928t1 t1Var) {
        C87412m.m108594g(t1Var, "pageView");
        this.f245964a = t1Var;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0071, code lost:
        if (r0.findViewById(com.tencent.p014mm.C0966R.C0970id.jkd) == null) goto L_0x0073;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo116905a() {
        /*
            r5 = this;
            com.tencent.mm.plugin.appbrand.page.t1 r0 = r5.f245964a
            com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC r0 = r0.getRuntime()
            r1 = 1
            if (r0 == 0) goto L_0x0015
            gt0.k r0 = r0.f238157v
            if (r0 == 0) goto L_0x0015
            gt0.k0 r0 = r0.getCurrentDialog()
            if (r0 == 0) goto L_0x0015
            r5.f245969f = r1
        L_0x0015:
            com.tencent.mm.plugin.appbrand.page.t1 r0 = r5.f245964a
            com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC r0 = r0.getRuntime()
            r2 = 0
            if (r0 == 0) goto L_0x0044
            gt0.k r0 = r0.f238156u
            if (r0 == 0) goto L_0x0044
            gt0.k0 r0 = r0.getCurrentDialog()
            if (r0 == 0) goto L_0x0044
            r5.f245969f = r1
            boolean r3 = r0 instanceof gt0.C87325b
            if (r3 == 0) goto L_0x0031
            gt0.b r0 = (gt0.C87325b) r0
            goto L_0x0032
        L_0x0031:
            r0 = r2
        L_0x0032:
            if (r0 == 0) goto L_0x003d
            java.lang.CharSequence r0 = r0.f253081W
            if (r0 == 0) goto L_0x003d
            java.lang.String r0 = r0.toString()
            goto L_0x003e
        L_0x003d:
            r0 = r2
        L_0x003e:
            if (r0 != 0) goto L_0x0042
            java.lang.String r0 = ""
        L_0x0042:
            r5.f245970g = r0
        L_0x0044:
            java.lang.String r0 = r5.f245970g
            if (r0 == 0) goto L_0x0050
            int r0 = r0.length()
            if (r0 != 0) goto L_0x004f
            goto L_0x0050
        L_0x004f:
            r1 = 0
        L_0x0050:
            if (r1 == 0) goto L_0x008f
            com.tencent.mm.plugin.appbrand.page.t1 r0 = r5.f245964a
            wt0.d r0 = r0.f244570T
            wt0.d$b r1 = r0.f261300b
            if (r1 != 0) goto L_0x005b
            goto L_0x0073
        L_0x005b:
            int r1 = r1.getChildCount()
            if (r1 > 0) goto L_0x0062
            goto L_0x0073
        L_0x0062:
            wt0.d$b r0 = r0.f261300b
            int r1 = r1 + -1
            android.view.View r0 = r0.getChildAt(r1)
            r1 = 2131313541(0x7f094385, float:1.8245482E38)
            android.view.View r1 = r0.findViewById(r1)
            if (r1 != 0) goto L_0x0074
        L_0x0073:
            r0 = r2
        L_0x0074:
            if (r0 == 0) goto L_0x008f
            r1 = 2131315360(0x7f094aa0, float:1.8249171E38)
            android.view.View r0 = r0.findViewById(r1)
            android.widget.TextView r0 = (android.widget.TextView) r0
            if (r0 == 0) goto L_0x008f
            java.lang.CharSequence r0 = r0.getText()
            if (r0 == 0) goto L_0x008f
            java.lang.String r0 = r0.toString()
            if (r0 == 0) goto L_0x008f
            r5.f245970g = r0
        L_0x008f:
            com.tencent.mm.plugin.appbrand.page.t1 r0 = r5.f245964a
            com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC r0 = r0.getRuntime()
            if (r0 == 0) goto L_0x00b5
            com.tencent.mm.plugin.appbrand.page.AppBrandPageContainerWC r0 = r0.mo113212m1()
            if (r0 == 0) goto L_0x00b5
            com.tencent.mm.plugin.appbrand.page.t1 r1 = r5.f245964a
            long r3 = r1.mo116149D0()
            com.tencent.mm.plugin.appbrand.page.x2 r0 = r0.f244753x
            android.util.LongSparseArray<java.util.Map<java.lang.String, java.lang.Object>> r0 = r0.f245153c
            java.lang.Object r0 = r0.get(r3)
            java.util.Map r0 = (java.util.Map) r0
            if (r0 != 0) goto L_0x00b0
            goto L_0x00b5
        L_0x00b0:
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>(r0)
        L_0x00b5:
            r5.f245971h = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.report.quality.C84213o.mo116905a():void");
    }
}
