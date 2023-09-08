package com.tencent.p014mm.plugin.appbrand.report.quality;

import com.tencent.p014mm.appbrand.commonjni.CheckBitmapIsBlankResultDetails;
import com.tencent.p014mm.plugin.appbrand.page.C83780d1;
import com.tencent.p014mm.plugin.appbrand.report.quality.C84213o;
import java.util.List;

/* renamed from: com.tencent.mm.plugin.appbrand.report.quality.w */
public final class C84230w implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C84228v f246043d;

    /* renamed from: e */
    public final /* synthetic */ C84213o.C84214a f246044e;

    /* renamed from: f */
    public final /* synthetic */ boolean f246045f;

    /* renamed from: g */
    public final /* synthetic */ List<String> f246046g;

    /* renamed from: h */
    public final /* synthetic */ C83780d1 f246047h;

    /* renamed from: i */
    public final /* synthetic */ C84213o f246048i;

    /* renamed from: j */
    public final /* synthetic */ CheckBitmapIsBlankResultDetails f246049j;

    public C84230w(C84228v vVar, C84213o.C84214a aVar, boolean z, List<String> list, C83780d1 d1Var, C84213o oVar, CheckBitmapIsBlankResultDetails checkBitmapIsBlankResultDetails) {
        this.f246043d = vVar;
        this.f246044e = aVar;
        this.f246045f = z;
        this.f246046g = list;
        this.f246047h = d1Var;
        this.f246048i = oVar;
        this.f246049j = checkBitmapIsBlankResultDetails;
    }

    /* JADX WARNING: Removed duplicated region for block: B:53:0x00fe  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0135  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0140  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0142  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0145  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0153  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0157  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r17 = this;
            r0 = r17
            com.tencent.mm.plugin.appbrand.report.quality.v r1 = r0.f246043d
            com.tencent.mm.autogen.mmdata.rpt.WAQualityReportStruct r1 = r1.mo116914c()
            com.tencent.mm.plugin.appbrand.report.quality.o$a r2 = r0.f246044e
            boolean r3 = r0.f246045f
            com.tencent.mm.plugin.appbrand.report.quality.v r4 = r0.f246043d
            java.util.List<java.lang.String> r5 = r0.f246046g
            com.tencent.mm.plugin.appbrand.page.d1 r6 = r0.f246047h
            com.tencent.mm.plugin.appbrand.report.quality.o r7 = r0.f246048i
            com.tencent.mm.appbrand.commonjni.CheckBitmapIsBlankResultDetails r8 = r0.f246049j
            r9 = 2
            r1.f236546m = r9
            int r11 = r2.ordinal()
            r12 = 1
            r13 = 0
            if (r11 == 0) goto L_0x0033
            if (r11 == r12) goto L_0x0035
            r15 = 3
            if (r11 == r15) goto L_0x002a
            r9 = r13
            goto L_0x0035
        L_0x002a:
            if (r3 == 0) goto L_0x002f
            r15 = 3
            goto L_0x0031
        L_0x002f:
            r15 = 4
        L_0x0031:
            r9 = r15
            goto L_0x0035
        L_0x0033:
            r9 = 1
        L_0x0035:
            r1.f236547n = r9
            r4.mo116915d(r1, r5)
            java.lang.String r3 = r6.mo116163R0()
            java.lang.String r3 = p206nj.C117627q.m165908a(r3)
            r5 = 1024(0x400, float:1.435E-42)
            r9 = 0
            java.lang.String r3 = u24.C90599h.m113522o(r3, r9, r5)
            java.lang.String r5 = "QualityIssueHappenPagePath"
            java.lang.String r3 = r1.mo86045b(r5, r3, r12)
            r1.f236554u = r3
            boolean r3 = r6 instanceof com.tencent.p014mm.plugin.appbrand.page.C83928t1
            r5 = 0
            if (r3 == 0) goto L_0x005a
            r3 = r6
            com.tencent.mm.plugin.appbrand.page.t1 r3 = (com.tencent.p014mm.plugin.appbrand.page.C83928t1) r3
            goto L_0x005b
        L_0x005a:
            r3 = r5
        L_0x005b:
            if (r3 == 0) goto L_0x0062
            xn0.m r3 = r3.mo116520A1()
            goto L_0x0063
        L_0x0062:
            r3 = r5
        L_0x0063:
            if (r3 == 0) goto L_0x0068
            r10 = 1
            goto L_0x0069
        L_0x0068:
            r10 = r13
        L_0x0069:
            r1.f236558y = r10
            com.tencent.mm.plugin.appbrand.report.quality.s r3 = r4.f246041d
            float r3 = r3.f246014c
            r10 = 100
            float r4 = (float) r10
            float r3 = r3 * r4
            r10 = 0
            r11 = 1120403456(0x42c80000, float:100.0)
            float r3 = p282z2.C16095a.m14979a(r3, r10, r11)
            long r10 = (long) r3
            r1.f236555v = r10
            boolean r3 = r6.mo116168W0()
            if (r3 == 0) goto L_0x0087
            r10 = 1
            goto L_0x0088
        L_0x0087:
            r10 = r13
        L_0x0088:
            r1.f236535H = r10
            if (r7 == 0) goto L_0x00fa
            java.util.Map<java.lang.String, ? extends java.lang.Object> r3 = r7.f245971h
            if (r3 == 0) goto L_0x00e0
            java.lang.String r6 = "routePageOpenType"
            java.lang.Object r6 = r3.get(r6)
            if (r6 == 0) goto L_0x009e
            java.lang.String r6 = r6.toString()
            goto L_0x009f
        L_0x009e:
            r6 = r5
        L_0x009f:
            java.lang.String r10 = ""
            if (r6 != 0) goto L_0x00a4
            r6 = r10
        L_0x00a4:
            java.lang.String r11 = "AppRouteOpenType"
            java.lang.String r6 = r1.mo86045b(r11, r6, r12)
            r1.f236556w = r6
            java.lang.String r6 = "navId"
            java.lang.Object r6 = r3.get(r6)
            if (r6 == 0) goto L_0x00b9
            java.lang.String r6 = r6.toString()
            goto L_0x00ba
        L_0x00b9:
            r6 = r5
        L_0x00ba:
            if (r6 != 0) goto L_0x00bd
            goto L_0x00be
        L_0x00bd:
            r10 = r6
        L_0x00be:
            java.lang.String r6 = "AppRouteNavId"
            java.lang.String r6 = r1.mo86045b(r6, r10, r12)
            r1.f236557x = r6
            java.lang.String r6 = "routeStartTime"
            java.lang.Object r6 = r3.get(r6)
            long r10 = com.tencent.p014mm.sdk.platformtools.Util.nullAsLong(r6, r13)
            r1.f236559z = r10
            java.lang.String r6 = "routeInitReadyTime"
            java.lang.Object r3 = r3.get(r6)
            long r10 = com.tencent.p014mm.sdk.platformtools.Util.nullAsLong(r3, r13)
            r1.f236528A = r10
        L_0x00e0:
            long r10 = r7.f245968e
            r1.f236530C = r10
            com.tencent.mm.plugin.appbrand.report.quality.o$a r3 = com.tencent.p014mm.plugin.appbrand.report.quality.C84213o.C84214a.kPageLeave
            if (r3 != r2) goto L_0x00fa
            boolean r2 = r7.f245966c
            if (r2 == 0) goto L_0x00f1
            r2 = 2
            r1.f236536I = r2
            goto L_0x00fa
        L_0x00f1:
            boolean r2 = r7.f245965b
            if (r2 == 0) goto L_0x00fa
            r2 = 1
            r1.f236536I = r2
            goto L_0x00fc
        L_0x00fa:
            r2 = 1
        L_0x00fc:
            if (r8 == 0) goto L_0x0133
            java.util.Locale r6 = java.util.Locale.ENGLISH
            java.lang.Object[] r10 = new java.lang.Object[r12]
            r11 = 16777215(0xffffff, float:2.3509886E-38)
            int r15 = r8.majorColor
            r11 = r11 & r15
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r10[r9] = r11
            java.lang.Object[] r10 = java.util.Arrays.copyOf(r10, r12)
            java.lang.String r11 = "#%06X"
            java.lang.String r6 = java.lang.String.format(r6, r11, r10)
            java.lang.String r10 = "format(locale, format, *args)"
            gy3.C87412m.m108593f(r6, r10)
            java.lang.String r10 = "WhiteScreenHexColor"
            java.lang.String r6 = r1.mo86045b(r10, r6, r12)
            r1.f236531D = r6
            float r6 = r8.majorColorRatio
            float r6 = r6 * r4
            r4 = 1120403456(0x42c80000, float:100.0)
            r8 = 0
            float r4 = p282z2.C16095a.m14979a(r6, r8, r4)
            long r10 = (long) r4
            r1.f236532E = r10
        L_0x0133:
            if (r7 == 0) goto L_0x0137
            java.lang.String r5 = r7.f245970g
        L_0x0137:
            if (r5 == 0) goto L_0x0142
            int r4 = r5.length()
            if (r4 != 0) goto L_0x0140
            goto L_0x0142
        L_0x0140:
            r4 = 0
            goto L_0x0143
        L_0x0142:
            r4 = 1
        L_0x0143:
            if (r4 != 0) goto L_0x0151
            java.lang.String r4 = p206nj.C117627q.m165908a(r5)
            java.lang.String r5 = "ModalOrToastStr"
            java.lang.String r4 = r1.mo86045b(r5, r4, r12)
            r1.f236533F = r4
        L_0x0151:
            if (r7 == 0) goto L_0x0155
            boolean r9 = r7.f245969f
        L_0x0155:
            if (r9 == 0) goto L_0x0158
            r13 = r2
        L_0x0158:
            r1.f236534G = r13
            r1.mo86054n()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.report.quality.C84230w.run():void");
    }
}
