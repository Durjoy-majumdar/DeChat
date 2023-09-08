package ap0;

import com.tencent.luggage.sdk.launching.C80247h;
import com.tencent.p014mm.autogen.mmdata.rpt.WeAppQualitySystemLaunchCGIStruct;
import com.tencent.p014mm.plugin.appbrand.config.AppBrandLaunchReferrer;
import com.tencent.p014mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.p014mm.plugin.appbrand.report.C84116i0;
import com.tencent.p014mm.plugin.appbrand.report.quality.C84201i;
import com.tencent.p014mm.plugin.appbrand.report.quality.QualitySession;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import gy3.C87412m;
import java.util.concurrent.FutureTask;
import ob0.C89132b;
import rp0.C90077a;
import te3.C90446wm2;

/* renamed from: ap0.g */
public final class C79625g extends C79619a<C89132b.C89134c<C90446wm2>> {

    /* renamed from: f */
    public final String f233481f;

    /* renamed from: g */
    public final int f233482g;

    /* renamed from: h */
    public final int f233483h;

    /* renamed from: i */
    public final String f233484i;

    /* renamed from: j */
    public final AppBrandStatObject f233485j;

    /* renamed from: k */
    public final AppBrandLaunchReferrer f233486k;

    /* renamed from: l */
    public final String f233487l;

    /* renamed from: m */
    public final String f233488m;

    /* renamed from: n */
    public final String f233489n;

    /* renamed from: o */
    public final C80247h f233490o;

    /* renamed from: p */
    public final String f233491p;

    /* renamed from: q */
    public final int f233492q;

    /* renamed from: r */
    public C89132b.C89134c<C90446wm2> f233493r;

    public C79625g(String str, int i, int i2, String str2, AppBrandStatObject appBrandStatObject, AppBrandLaunchReferrer appBrandLaunchReferrer, String str3, String str4, String str5, C80247h hVar, String str6, int i3) {
        this.f233481f = str;
        this.f233482g = i;
        this.f233483h = i2;
        this.f233484i = str2;
        this.f233485j = appBrandStatObject;
        this.f233486k = appBrandLaunchReferrer;
        this.f233487l = str3;
        this.f233488m = str4;
        this.f233489n = str5;
        this.f233490o = hVar;
        this.f233491p = str6;
        this.f233492q = i3;
    }

    /* renamed from: b */
    public int mo109763b() {
        return 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00d1  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo109764c() {
        /*
            r22 = this;
            r0 = r22
            r1 = 3
            ap0.C27992b.m38051a(r1)
            java.lang.String r1 = r0.f233487l
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L_0x0015
            int r1 = r1.length()
            if (r1 != 0) goto L_0x0013
            goto L_0x0015
        L_0x0013:
            r1 = 0
            goto L_0x0016
        L_0x0015:
            r1 = 1
        L_0x0016:
            java.lang.String r4 = ""
            r5 = 0
            if (r1 != 0) goto L_0x001e
            java.lang.String r1 = r0.f233487l
            goto L_0x0033
        L_0x001e:
            java.lang.Class<com.tencent.mm.plugin.appbrand.appstorage.f> r1 = com.tencent.p014mm.plugin.appbrand.appstorage.C29324f.class
            java.lang.Object r1 = com.tencent.p014mm.plugin.appbrand.app.C81161g2.Bx0(r1)
            com.tencent.mm.plugin.appbrand.appstorage.f r1 = (com.tencent.p014mm.plugin.appbrand.appstorage.C29324f) r1
            if (r1 == 0) goto L_0x002f
            java.lang.String r6 = r0.f233481f
            java.lang.String r1 = r1.mo56601Lo(r6)
            goto L_0x0030
        L_0x002f:
            r1 = r5
        L_0x0030:
            if (r1 != 0) goto L_0x0033
            r1 = r4
        L_0x0033:
            com.tencent.p014mm.plugin.appbrand.app.C81161g2.requireAccountInitializedOnDemand()
            com.tencent.mm.plugin.appbrand.launching.u2 r6 = com.tencent.p014mm.plugin.appbrand.app.C81161g2.f238475n
            com.tencent.mm.plugin.appbrand.launching.w2 r7 = new com.tencent.mm.plugin.appbrand.launching.w2
            r7.<init>()
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "preFetch: start with username["
            r8.append(r9)
            java.lang.String r9 = r0.f233481f
            r8.append(r9)
            java.lang.String r9 = "] savedAppId["
            r8.append(r9)
            r8.append(r1)
            java.lang.String r10 = "] enterPath["
            r8.append(r10)
            java.lang.String r11 = r0.f233484i
            r8.append(r11)
            r11 = 93
            r8.append(r11)
            java.lang.String r8 = r8.toString()
            java.lang.String r12 = "MicroMsg.AppBrand.PreFetchLaunchTask"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r8)
            r7.field_appId = r1
            if (r6 == 0) goto L_0x00a6
            int r8 = r0.f233483h
            com.tencent.mm.plugin.appbrand.config.AppBrandGlobalSystemConfig r13 = com.tencent.p014mm.plugin.appbrand.config.AppBrandGlobalSystemConfig.m100099b()
            int[] r13 = r13.f239316t
            if (r13 == 0) goto L_0x0083
            boolean r8 = p977hj.C87526a.m108856a(r13, r8)
            if (r8 == 0) goto L_0x0083
            r8 = 1
            goto L_0x0084
        L_0x0083:
            r8 = 0
        L_0x0084:
            if (r8 != 0) goto L_0x00a6
            java.lang.String r8 = "appId"
            java.lang.String[] r8 = new java.lang.String[]{r8}
            boolean r8 = r6.get(r7, r8)
            if (r8 == 0) goto L_0x00a6
            te3.au r8 = r7.field_jsapiInfo
            if (r8 == 0) goto L_0x0098
            r8 = 1
            goto L_0x0099
        L_0x0098:
            r8 = 0
        L_0x0099:
            if (r8 == 0) goto L_0x00a6
            te3.rm2 r7 = r7.field_launchAction
            if (r7 == 0) goto L_0x00a6
            int r7 = r7.f259816d
            if (r3 == r7) goto L_0x00a4
            goto L_0x00a6
        L_0x00a4:
            r7 = 0
            goto L_0x00a7
        L_0x00a6:
            r7 = 1
        L_0x00a7:
            if (r7 != 0) goto L_0x00d1
            r0.f233493r = r5
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "preFetch: skip with username:"
            r2.append(r3)
            java.lang.String r3 = r0.f233481f
            r2.append(r3)
            java.lang.String r3 = " appId:"
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = ", isSync=false"
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r1)
            goto L_0x022a
        L_0x00d1:
            com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader r8 = com.tencent.p014mm.plugin.appbrand.appcache.C81274j2.m99632a()
            if (r8 == 0) goto L_0x00dc
            int r8 = r8.mo113371a()
            goto L_0x00dd
        L_0x00dc:
            r8 = -1
        L_0x00dd:
            te3.p45 r14 = new te3.p45
            r14.<init>()
            int r15 = r0.f233482g
            r14.f259731d = r15
            r14.f259732e = r2
            int r15 = r0.f233483h
            r14.f259733f = r15
            r14.f259735h = r2
            java.lang.String r15 = r0.f233484i
            r14.f259734g = r15
            com.tencent.mm.plugin.appbrand.report.AppBrandStatObject r15 = r0.f233485j
            if (r15 == 0) goto L_0x00f9
            int r15 = r15.f245531d
            goto L_0x00fa
        L_0x00f9:
            r15 = 0
        L_0x00fa:
            r14.f259736i = r15
            com.tencent.mm.plugin.appbrand.config.AppBrandLaunchReferrer r15 = r0.f233486k
            te3.b85 r15 = wo0.C66142j.m77970b(r15)
            com.tencent.mm.plugin.appbrand.config.AppBrandLaunchReferrer r2 = r0.f233486k
            te3.l65 r2 = wo0.C66142j.m77969a(r2)
            te3.w65 r5 = new te3.w65
            r5.<init>()
            java.lang.String r13 = r0.f233488m
            r5.f143895d = r13
            java.lang.String r13 = r0.f233489n
            if (r13 == 0) goto L_0x011e
            int r13 = r13.length()
            if (r13 != 0) goto L_0x011c
            goto L_0x011e
        L_0x011c:
            r13 = 0
            goto L_0x011f
        L_0x011e:
            r13 = 1
        L_0x011f:
            if (r13 == 0) goto L_0x0123
            r13 = 0
            goto L_0x012c
        L_0x0123:
            te3.o65 r13 = new te3.o65
            r13.<init>()
            java.lang.String r11 = r0.f233489n
            r13.f138989d = r11
        L_0x012c:
            java.lang.String r11 = r0.f233481f
            java.lang.String r3 = r0.f233487l
            r16 = r4
            com.tencent.luggage.sdk.launching.h r4 = r0.f233490o
            r17 = r12
            java.lang.String r12 = r0.f233491p
            r18 = r10
            int r10 = r0.f233492q
            r19 = r1
            te3.vm2 r1 = new te3.vm2
            r1.<init>()
            r1.f259881e = r14
            if (r7 == 0) goto L_0x014b
            r21 = r9
            r9 = 1
            goto L_0x0150
        L_0x014b:
            r20 = 2
            r21 = r9
            r9 = 2
        L_0x0150:
            r1.f259882f = r9
            r1.f259885i = r15
            r1.f259886j = r2
            if (r3 != 0) goto L_0x015a
            r3 = r16
        L_0x015a:
            r1.f259880d = r3
            r2 = 1
            r1.f259891r = r2
            te3.u55 r3 = new te3.u55
            r3.<init>()
            r3.f259849d = r8
            r1.f259884h = r3
            r1.f259890q = r11
            r1.f259893t = r5
            r1.f259897x = r13
            te3.jy r3 = new te3.jy
            r3.<init>()
            int r5 = r14.f259733f
            r3.f259639d = r5
            com.tencent.luggage.sdk.launching.h r5 = com.tencent.luggage.sdk.launching.C80247h.PRE_RENDER
            if (r5 != r4) goto L_0x017d
            r4 = 1
            goto L_0x017e
        L_0x017d:
            r4 = 0
        L_0x017e:
            r3.f259640e = r4
            if (r7 == 0) goto L_0x0185
            r4 = 101(0x65, float:1.42E-43)
            goto L_0x0187
        L_0x0185:
            r4 = 102(0x66, float:1.43E-43)
        L_0x0187:
            r3.f259641f = r4
            r1.f259896w = r3
            r1.f259889p = r12
            r1.f259898y = r10
            ap0.d r3 = new ap0.d
            r3.<init>(r1, r7)
            long r4 = com.tencent.p014mm.sdk.platformtools.Util.nowMilliSecond()
            r0.f252812b = r4
            ob0.b$c r1 = r3.mo115600n()
            r0.f233493r = r1
            if (r1 == 0) goto L_0x01af
            T r1 = r1.f256796d
            te3.wm2 r1 = (te3.C90446wm2) r1
            if (r1 == 0) goto L_0x01af
            if (r6 == 0) goto L_0x01af
            java.lang.String r3 = r1.f259928j
            r6.mo115787Lo(r3, r1)
        L_0x01af:
            long r3 = com.tencent.p014mm.sdk.platformtools.Util.nowMilliSecond()
            r0.f252813c = r3
            long r5 = r0.f252812b
            long r3 = r3 - r5
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r5 = "preFetch: done with username["
            r1.append(r5)
            java.lang.String r5 = r0.f233481f
            r1.append(r5)
            r5 = r21
            r1.append(r5)
            r5 = r19
            r1.append(r5)
            r5 = r18
            r1.append(r5)
            java.lang.String r5 = r0.f233484i
            r1.append(r5)
            java.lang.String r5 = "] cost["
            r1.append(r5)
            r1.append(r3)
            java.lang.String r3 = " ms] ret=["
            r1.append(r3)
            ob0.b$c<te3.wm2> r3 = r0.f233493r
            if (r3 == 0) goto L_0x01ee
            goto L_0x01ef
        L_0x01ee:
            r2 = 0
        L_0x01ef:
            r1.append(r2)
            java.lang.String r2 = "],errCode=["
            r1.append(r2)
            ob0.b$c<te3.wm2> r2 = r0.f233493r
            if (r2 == 0) goto L_0x01fe
            int r2 = r2.f256794b
            goto L_0x01ff
        L_0x01fe:
            r2 = -1
        L_0x01ff:
            r1.append(r2)
            java.lang.String r2 = "], errType=["
            r1.append(r2)
            ob0.b$c<te3.wm2> r2 = r0.f233493r
            if (r2 == 0) goto L_0x020e
            int r13 = r2.f256793a
            goto L_0x020f
        L_0x020e:
            r13 = -1
        L_0x020f:
            r1.append(r13)
            java.lang.String r2 = "], isSync=["
            r1.append(r2)
            r1.append(r7)
            r2 = 93
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r2 = r17
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r1)
            ob0.b$c<te3.wm2> r5 = r0.f233493r
        L_0x022a:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ap0.C79625g.mo109764c():java.lang.Object");
    }

    /* renamed from: d */
    public void mo109758d(QualitySession qualitySession) {
        C90446wm2 wm22;
        C87412m.m108594g(qualitySession, "qualitySession");
        if (this.f233493r != null) {
            WeAppQualitySystemLaunchCGIStruct b = C84201i.m103805b(qualitySession);
            String str = b.f237211e;
            if (str == null || str.length() == 0) {
                C89132b.C89134c<C90446wm2> cVar = this.f233493r;
                b.f237211e = b.mo86045b("AppId", (cVar == null || (wm22 = (C90446wm2) cVar.f256796d) == null) ? null : wm22.f259928j, true);
            }
            b.f237223q = b.mo86045b("username", this.f233481f, true);
            b.f237224r = 1;
            b.f237221o = (long) C84201i.m103806c();
            b.mo112534u(C84116i0.m103659b(MMApplicationContext.getContext()));
            b.f237220n = WeAppQualitySystemLaunchCGIStruct.C80784b.sync;
            long j = this.f252812b;
            b.f237217k = j;
            b.mo86048e("StartTimeStampMs", j);
            long j2 = this.f252813c;
            b.f237218l = j2;
            b.mo86048e("EndTimeStampMs", j2);
            long j3 = this.f252813c - this.f252812b;
            b.f237215i = j3;
            b.mo86046c("CostTimeMs", j3);
            b.f237222p = 0;
            C89132b.C89134c<C90446wm2> cVar2 = this.f233493r;
            C87412m.m108591d(cVar2);
            int i = cVar2.f256793a;
            C89132b.C89134c<C90446wm2> cVar3 = this.f233493r;
            C87412m.m108591d(cVar3);
            int i2 = cVar3.f256794b;
            C89132b.C89134c<C90446wm2> cVar4 = this.f233493r;
            C87412m.m108591d(cVar4);
            if (C90077a.m112678a(i, i2, cVar4.f256796d)) {
                C89132b.C89134c<C90446wm2> cVar5 = this.f233493r;
                C87412m.m108591d(cVar5);
                T t = cVar5.f256796d;
                C87412m.m108591d(t);
                if (((C90446wm2) t).f259923e == null) {
                    b.f237219m = WeAppQualitySystemLaunchCGIStruct.C80785c.bundle_null;
                } else {
                    C89132b.C89134c<C90446wm2> cVar6 = this.f233493r;
                    C87412m.m108591d(cVar6);
                    T t2 = cVar6.f256796d;
                    C87412m.m108591d(t2);
                    if (((C90446wm2) t2).f259923e.f130770d == null) {
                        b.f237219m = WeAppQualitySystemLaunchCGIStruct.C80785c.jsapi_control_bytes_null;
                    } else {
                        b.f237219m = WeAppQualitySystemLaunchCGIStruct.C80785c.ok;
                    }
                }
            } else {
                b.f237219m = WeAppQualitySystemLaunchCGIStruct.C80785c.common_fail;
            }
            b.mo86054n();
        }
    }

    /* renamed from: e */
    public C89132b.C89134c<C90446wm2> mo109762a(int i) {
        FutureTask<T> futureTask = this.f252811a;
        if (futureTask != null) {
            if (futureTask.isDone()) {
                C27992b.m38051a(5);
            } else {
                C27992b.m38051a(6);
            }
            return (C89132b.C89134c) super.mo109762a(i);
        }
        throw new IllegalStateException();
    }
}
