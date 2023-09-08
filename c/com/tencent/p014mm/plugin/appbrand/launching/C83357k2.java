package com.tencent.p014mm.plugin.appbrand.launching;

import com.tencent.p014mm.plugin.appbrand.appcache.WxaPkgWrappingInfo;
import com.tencent.p014mm.plugin.appbrand.config.WxaAttributes;
import fy3.C32224a;
import gy3.C87413o;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.appbrand.launching.k2 */
public final class C83357k2 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C83399o2 f243582d;

    /* renamed from: e */
    public final /* synthetic */ List<String> f243583e;

    /* renamed from: f */
    public final /* synthetic */ Map<String, WxaAttributes.WxaWidgetInfo> f243584f;

    /* renamed from: g */
    public final /* synthetic */ WxaPkgWrappingInfo f243585g;

    /* renamed from: h */
    public final /* synthetic */ AtomicReference<WxaPkgWrappingInfo> f243586h;

    /* renamed from: i */
    public final /* synthetic */ CountDownLatch f243587i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C83357k2(C83399o2 o2Var, List<String> list, Map<String, ? extends WxaAttributes.WxaWidgetInfo> map, WxaPkgWrappingInfo wxaPkgWrappingInfo, AtomicReference<WxaPkgWrappingInfo> atomicReference, CountDownLatch countDownLatch) {
        super(0);
        this.f243582d = o2Var;
        this.f243583e = list;
        this.f243584f = map;
        this.f243585g = wxaPkgWrappingInfo;
        this.f243586h = atomicReference;
        this.f243587i = countDownLatch;
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x0185  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x018c  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x01d7  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x01f2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object invoke() {
        /*
            r24 = this;
            r0 = r24
            com.tencent.mm.plugin.appbrand.launching.o2 r1 = r0.f243582d
            com.tencent.mm.plugin.appbrand.report.quality.QualitySession r1 = r1.f243683n
            java.lang.String r1 = r1.f245832d
            java.lang.String r2 = "reportQualitySession.instanceId"
            gy3.C87412m.m108593f(r1, r2)
            gc.d r2 = p969gc.C87176d.f252818a
            r3 = 0
            gc.c r1 = r2.mo121614b(r1, r3)
            r2 = 1
            if (r1 != 0) goto L_0x001a
            goto L_0x0119
        L_0x001a:
            java.util.HashMap<java.lang.Integer, gc.b<?>> r4 = r1.f252816a
            java.lang.Integer r5 = java.lang.Integer.valueOf(r2)
            java.lang.Object r4 = r4.get(r5)
            gc.b r4 = (p969gc.C87174b) r4
            if (r4 != 0) goto L_0x0029
            r4 = 0
        L_0x0029:
            if (r4 != 0) goto L_0x002d
            goto L_0x0119
        L_0x002d:
            r5 = 100
            java.lang.Object r4 = r4.mo109762a(r5)
            ob0.b$c r4 = (ob0.C89132b.C89134c) r4
            if (r4 == 0) goto L_0x0119
            T r4 = r4.f256796d
            te3.ng3 r4 = (te3.C50540ng3) r4
            if (r4 == 0) goto L_0x0119
            java.util.HashMap r5 = new java.util.HashMap
            r5.<init>()
            java.util.LinkedList<te3.ca3> r4 = r4.f138596f
            java.lang.String r6 = "preGetResp.package_info_list"
            gy3.C87412m.m108593f(r4, r6)
            java.util.Iterator r4 = r4.iterator()
        L_0x004e:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L_0x00c1
            java.lang.Object r6 = r4.next()
            te3.ca3 r6 = (te3.C48977ca3) r6
            boolean r7 = r6.f131601j
            if (r7 == 0) goto L_0x005f
            goto L_0x004e
        L_0x005f:
            com.tencent.mm.plugin.appbrand.launching.o1$a r7 = new com.tencent.mm.plugin.appbrand.launching.o1$a
            r7.<init>()
            java.lang.String r8 = r6.f131595d
            java.lang.String r9 = "info.appid"
            gy3.C87412m.m108593f(r8, r9)
            r7.f243666d = r8
            java.lang.String r8 = r6.f131596e
            r7.f243667e = r8
            int r8 = r6.f131597f
            r7.f243668f = r8
            r7.f243669g = r3
            int r8 = r6.f131598g
            r7.f243670h = r8
            int r8 = r6.f131603o
            r7.f243672j = r8
            java.lang.Object r8 = r5.get(r7)
            te3.hz1[] r8 = (te3.C90415hz1[]) r8
            if (r8 != 0) goto L_0x008d
            r8 = 3
            te3.hz1[] r8 = new te3.C90415hz1[r8]
            r5.put(r7, r8)
        L_0x008d:
            te3.hz1 r7 = new te3.hz1
            r7.<init>()
            java.lang.String r9 = r6.f131599h
            r7.f259558e = r9
            java.lang.String r9 = r6.f131600i
            r7.f259559f = r9
            te3.kt3 r9 = new te3.kt3
            r9.<init>()
            r7.f259564n = r9
            java.lang.String r10 = r6.f131595d
            r9.f259653d = r10
            java.lang.String r10 = r6.f131596e
            r9.f259655f = r10
            int r10 = r6.f131597f
            r9.f259656g = r10
            r9.f259657h = r3
            boolean r6 = r6.f131602n
            if (r6 == 0) goto L_0x00ba
            r7.f259562i = r3
            r7.f259563j = r2
            r8[r2] = r7
            goto L_0x004e
        L_0x00ba:
            r7.f259562i = r3
            r7.f259563j = r3
            r8[r3] = r7
            goto L_0x004e
        L_0x00c1:
            int r4 = r5.size()
            if (r4 <= 0) goto L_0x0119
            com.tencent.mm.plugin.appbrand.launching.j1 r4 = com.tencent.p014mm.plugin.appbrand.launching.C83344j1.f243546a
            r4.getClass()
            java.util.Set r4 = r5.entrySet()
            java.util.Iterator r4 = r4.iterator()
        L_0x00d4:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L_0x010a
            java.lang.Object r6 = r4.next()
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "addPreGetDownloadUrlResult "
            r7.append(r8)
            java.lang.Object r8 = r6.getKey()
            r7.append(r8)
            java.lang.String r8 = " -> "
            r7.append(r8)
            java.lang.Object r6 = r6.getValue()
            java.lang.Object[] r6 = (java.lang.Object[]) r6
            int r6 = r6.length
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            java.lang.String r7 = "MicroMsg.AppBrand.GetPkgDownloadUrlUnifiedCgiRouter"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r6)
            goto L_0x00d4
        L_0x010a:
            java.util.concurrent.ConcurrentHashMap<com.tencent.mm.plugin.appbrand.launching.o1$a, te3.hz1[]> r4 = com.tencent.p014mm.plugin.appbrand.launching.C83344j1.f243547b
            r4.putAll(r5)
            com.tencent.mm.plugin.appbrand.launching.x1 r4 = new com.tencent.mm.plugin.appbrand.launching.x1
            r4.<init>(r5)
            java.util.LinkedList<fy3.a<rx3.b0>> r1 = r1.f252817b
            r1.add(r4)
        L_0x0119:
            com.tencent.mm.plugin.appbrand.launching.BatchGetCodePkgExecutor r5 = com.tencent.p014mm.plugin.appbrand.launching.BatchGetCodePkgExecutor.f243304a
            com.tencent.mm.plugin.appbrand.launching.o2 r1 = r0.f243582d
            java.lang.String r6 = r1.f243676d
            com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaVersionInfo r7 = r1.f243681i
            int r8 = r1.f243677e
            java.util.List<java.lang.String> r9 = r0.f243583e
            java.util.Map<java.lang.String, com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaWidgetInfo> r10 = r0.f243584f
            com.tencent.mm.plugin.appbrand.report.quality.QualitySession r11 = r1.f243683n
            com.tencent.mm.plugin.appbrand.launching.g2 r12 = new com.tencent.mm.plugin.appbrand.launching.g2
            com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo r4 = r0.f243585g
            java.util.concurrent.atomic.AtomicReference<com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo> r13 = r0.f243586h
            java.util.concurrent.CountDownLatch r14 = r0.f243587i
            r12.<init>(r1, r4, r13, r14)
            com.tencent.mm.plugin.appbrand.launching.h2 r13 = new com.tencent.mm.plugin.appbrand.launching.h2
            com.tencent.mm.plugin.appbrand.launching.o2 r1 = r0.f243582d
            r13.<init>(r1)
            com.tencent.mm.plugin.appbrand.launching.i2 r14 = new com.tencent.mm.plugin.appbrand.launching.i2
            com.tencent.mm.plugin.appbrand.launching.o2 r1 = r0.f243582d
            java.util.concurrent.CountDownLatch r4 = r0.f243587i
            r14.<init>(r1, r4)
            com.tencent.mm.plugin.appbrand.launching.o2 r1 = r0.f243582d
            boolean r4 = r1.f243686q
            if (r4 != 0) goto L_0x015b
            int r4 = com.tencent.p014mm.plugin.appbrand.launching.C83344j1.C29580a.f80507a
            com.tencent.mm.plugin.appbrand.launching.j1$a$a r4 = com.tencent.p014mm.plugin.appbrand.launching.C83344j1.C29580a.C29581a.f80508b
            boolean r15 = r1.f243678f
            com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader r1 = r1.f243682j
            boolean r1 = r4.mo56822a(r15, r1)
            if (r1 != 0) goto L_0x0159
            goto L_0x015b
        L_0x0159:
            r15 = 0
            goto L_0x015c
        L_0x015b:
            r15 = 1
        L_0x015c:
            com.tencent.mm.plugin.appbrand.launching.o2 r1 = r0.f243582d
            te3.jy r4 = r1.f243684o
            com.tencent.mm.plugin.appbrand.report.quality.QualitySession r3 = r1.f243683n
            boolean r2 = r4.f259640e
            com.tencent.mm.plugin.appbrand.launching.j2 r0 = new com.tencent.mm.plugin.appbrand.launching.j2
            r0.<init>(r1)
            java.lang.String r1 = "reportQualitySession"
            gy3.C87412m.m108594g(r3, r1)
            te3.jy r1 = new te3.jy
            r1.<init>()
            r16 = r4
            int r4 = r3.f245836h
            r1.f259639d = r4
            r1.f259640e = r2
            r2 = 1
            r1.f259641f = r2
            int r4 = r3.f245835g
            r2 = 1004(0x3ec, float:1.407E-42)
            if (r4 != r2) goto L_0x018c
            com.tencent.mm.plugin.appbrand.launching.z1 r2 = new com.tencent.mm.plugin.appbrand.launching.z1
            r4 = 1
            r2.<init>(r4, r3, r1, r0)
            goto L_0x0191
        L_0x018c:
            com.tencent.mm.plugin.appbrand.launching.f2 r2 = new com.tencent.mm.plugin.appbrand.launching.f2
            r2.<init>(r3, r1, r0)
        L_0x0191:
            r17 = r2
            r18 = 0
            r19 = 0
            r20 = 12288(0x3000, float:1.7219E-41)
            r21 = 0
            com.tencent.p014mm.plugin.appbrand.launching.BatchGetCodePkgExecutor.m102215b(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            r0 = r24
            com.tencent.mm.plugin.appbrand.launching.o2 r1 = r0.f243582d
            java.util.Map<java.lang.String, com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaWidgetInfo> r7 = r0.f243584f
            r1.getClass()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r12 = "parallel: ["
            r2.append(r12)
            java.lang.String r3 = r1.f243676d
            r2.append(r3)
            java.lang.String r3 = "]: start..."
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.String r11 = "MicroMsg.LaunchCheckPkgHandlerSeparatedPluginsCompatible"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r2)
            java.lang.Class<h81.h> r2 = h81.C32735h.class
            di3.d r2 = di3.C86312j.m106911c(r2)
            h81.h r2 = (h81.C32735h) r2
            h81.h$c r3 = h81.C32735h.C32737c.clicfg_android_appbrand_parallel_download_subpackage
            r4 = 0
            int r2 = r2.mo58779Qe(r3, r4)
            r3 = 1
            if (r2 == r3) goto L_0x01f2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r12)
            java.lang.String r1 = r1.f243676d
            r2.append(r1)
            java.lang.String r1 = "]: x config, fast return"
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r1)
            goto L_0x02c3
        L_0x01f2:
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaVersionInfo r2 = r1.f243681i
            java.util.List<com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaVersionModuleInfo> r2 = r2.f239460o
            if (r2 != 0) goto L_0x01ff
            sx3.f0 r2 = sx3.C64186f0.f181907d
        L_0x01ff:
            java.util.Iterator r2 = r2.iterator()
        L_0x0203:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L_0x0220
            java.lang.Object r5 = r2.next()
            com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaVersionModuleInfo r5 = (com.tencent.p014mm.plugin.appbrand.config.WxaAttributes.WxaVersionModuleInfo) r5
            if (r5 == 0) goto L_0x0203
            boolean r8 = r5.f239481p
            if (r8 == 0) goto L_0x0203
            java.lang.String r5 = r5.f239472d
            java.lang.String r8 = "m.name"
            gy3.C87412m.m108593f(r5, r8)
            r6.add(r5)
            goto L_0x0203
        L_0x0220:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r12)
            java.lang.String r5 = r1.f243676d
            r2.append(r5)
            java.lang.String r5 = "]: collect : "
            r2.append(r5)
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 63
            r21 = 0
            r13 = r6
            java.lang.String r5 = sx3.C110818d0.m150921S(r13, r14, r15, r16, r17, r18, r19, r20, r21)
            r2.append(r5)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r2)
            int r2 = r6.size()
            if (r2 <= 0) goto L_0x02a5
            com.tencent.mm.plugin.appbrand.launching.BatchGetCodePkgExecutor r2 = com.tencent.p014mm.plugin.appbrand.launching.BatchGetCodePkgExecutor.f243304a
            java.lang.String r5 = r1.f243676d
            com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaVersionInfo r8 = r1.f243681i
            int r9 = r1.f243677e
            com.tencent.mm.plugin.appbrand.report.quality.QualitySession r10 = r1.f243683n
            com.tencent.mm.plugin.appbrand.launching.l2 r15 = new com.tencent.mm.plugin.appbrand.launching.l2
            r15.<init>(r1, r6)
            com.tencent.mm.plugin.appbrand.launching.m2 r19 = com.tencent.p014mm.plugin.appbrand.launching.C29584m2.f80512d
            com.tencent.mm.plugin.appbrand.launching.n2 r14 = new com.tencent.mm.plugin.appbrand.launching.n2
            r14.<init>(r1, r6)
            boolean r13 = r1.f243686q
            if (r13 != 0) goto L_0x0281
            int r13 = com.tencent.p014mm.plugin.appbrand.launching.C83344j1.C29580a.f80507a
            com.tencent.mm.plugin.appbrand.launching.j1$a$a r13 = com.tencent.p014mm.plugin.appbrand.launching.C83344j1.C29580a.C29581a.f80508b
            boolean r3 = r1.f243678f
            com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader r4 = r1.f243682j
            boolean r3 = r13.mo56822a(r3, r4)
            if (r3 != 0) goto L_0x027e
            goto L_0x0281
        L_0x027e:
            r22 = 0
            goto L_0x0283
        L_0x0281:
            r22 = 1
        L_0x0283:
            te3.jy r13 = r1.f243684o
            r3 = 0
            r20 = r14
            r14 = r3
            r21 = r15
            r15 = r3
            r16 = 0
            r17 = 14336(0x3800, float:2.0089E-41)
            r18 = 0
            r3 = r5
            r4 = r8
            r5 = r9
            r8 = r10
            r9 = r21
            r10 = r19
            r23 = r11
            r11 = r20
            r0 = r12
            r12 = r22
            com.tencent.p014mm.plugin.appbrand.launching.BatchGetCodePkgExecutor.m102215b(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            goto L_0x02a8
        L_0x02a5:
            r23 = r11
            r0 = r12
        L_0x02a8:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            java.lang.String r0 = r1.f243676d
            r2.append(r0)
            java.lang.String r0 = "]: done"
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1 = r23
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
        L_0x02c3:
            rx3.b0 r0 = rx3.C13598b0.f38549a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.launching.C83357k2.invoke():java.lang.Object");
    }
}
