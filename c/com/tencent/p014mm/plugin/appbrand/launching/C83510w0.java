package com.tencent.p014mm.plugin.appbrand.launching;

/* renamed from: com.tencent.mm.plugin.appbrand.launching.w0 */
public final class C83510w0 {
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0070, code lost:
        if (r2.f259657h == r6.f259657h) goto L_0x00b6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
        r0 = r8.f182660d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00b4, code lost:
        if (gy3.C87412m.m108589b(com.tencent.p014mm.plugin.appbrand.appcache.ModulePkgInfo.MAIN_MODULE_NAME, r9.f243667e) != false) goto L_0x00b6;
     */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0028 A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final te3.C90415hz1[] m102478a(te3.C64310db r8, com.tencent.p014mm.plugin.appbrand.launching.C83397o1.C83398a r9) {
        /*
            java.lang.String r0 = "request"
            gy3.C87412m.m108594g(r9, r0)
            if (r8 == 0) goto L_0x0011
            java.util.LinkedList<te3.hz1> r0 = r8.f182660d
            if (r0 == 0) goto L_0x0011
            int r0 = r0.size()
            goto L_0x0012
        L_0x0011:
            r0 = -1
        L_0x0012:
            if (r0 > 0) goto L_0x0016
            r8 = 0
            return r8
        L_0x0016:
            r0 = 3
            te3.hz1[] r0 = new te3.C90415hz1[r0]
            gy3.C87412m.m108591d(r8)
            java.util.LinkedList<te3.hz1> r8 = r8.f182660d
            java.util.Iterator r8 = r8.iterator()
            java.lang.String r1 = "this!!.resp_list.iterator()"
            gy3.C87412m.m108593f(r8, r1)
        L_0x0028:
            boolean r1 = r8.hasNext()
            if (r1 == 0) goto L_0x00d3
            java.lang.Object r1 = r8.next()
            te3.hz1 r1 = (te3.C90415hz1) r1
            if (r1 != 0) goto L_0x003a
            r8.remove()
            goto L_0x0028
        L_0x003a:
            te3.kt3 r2 = r1.f259564n
            java.lang.String r3 = "item.req_package_info"
            gy3.C87412m.m108593f(r2, r3)
            boolean r3 = r9 instanceof te3.C90424kt3
            r4 = 1
            r5 = 0
            if (r3 == 0) goto L_0x0073
            java.lang.String r3 = r2.f259653d
            r6 = r9
            te3.kt3 r6 = (te3.C90424kt3) r6
            java.lang.String r7 = r6.f259653d
            boolean r3 = gy3.C87412m.m108589b(r3, r7)
            if (r3 == 0) goto L_0x00b8
            java.lang.String r3 = r2.f259655f
            java.lang.String r3 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r3)
            java.lang.String r7 = r6.f259655f
            java.lang.String r7 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r7)
            boolean r3 = gy3.C87412m.m108589b(r3, r7)
            if (r3 == 0) goto L_0x00b8
            int r3 = r2.f259656g
            int r7 = r6.f259656g
            if (r3 != r7) goto L_0x00b8
            int r2 = r2.f259657h
            int r3 = r6.f259657h
            if (r2 != r3) goto L_0x00b8
            goto L_0x00b6
        L_0x0073:
            java.lang.String r3 = r2.f259653d
            java.lang.String r6 = r9.f243666d
            boolean r3 = gy3.C87412m.m108589b(r3, r6)
            if (r3 == 0) goto L_0x00b8
            int r3 = r2.f259656g
            int r6 = r9.f243668f
            if (r3 != r6) goto L_0x00b8
            int r3 = r2.f259657h
            int r6 = r9.f243669g
            if (r3 != r6) goto L_0x00b8
            java.lang.String r3 = r2.f259655f
            java.lang.String r3 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r3)
            java.lang.String r6 = r9.f243667e
            java.lang.String r6 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r6)
            boolean r3 = gy3.C87412m.m108589b(r3, r6)
            if (r3 == 0) goto L_0x009c
            goto L_0x00b6
        L_0x009c:
            java.lang.String r2 = r2.f259655f
            if (r2 == 0) goto L_0x00a9
            int r2 = r2.length()
            if (r2 != 0) goto L_0x00a7
            goto L_0x00a9
        L_0x00a7:
            r2 = 0
            goto L_0x00aa
        L_0x00a9:
            r2 = 1
        L_0x00aa:
            if (r2 == 0) goto L_0x00b8
            java.lang.String r2 = r9.f243667e
            java.lang.String r3 = "__APP__"
            boolean r2 = gy3.C87412m.m108589b(r3, r2)
            if (r2 == 0) goto L_0x00b8
        L_0x00b6:
            r2 = 0
            goto L_0x00b9
        L_0x00b8:
            r2 = 1
        L_0x00b9:
            if (r2 != 0) goto L_0x0028
            r8.remove()
            boolean r2 = r1.f259562i
            if (r2 == 0) goto L_0x00c7
            r2 = 2
            r0[r2] = r1
            goto L_0x0028
        L_0x00c7:
            boolean r2 = r1.f259563j
            if (r2 == 0) goto L_0x00cf
            r0[r4] = r1
            goto L_0x0028
        L_0x00cf:
            r0[r5] = r1
            goto L_0x0028
        L_0x00d3:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.launching.C83510w0.m102478a(te3.db, com.tencent.mm.plugin.appbrand.launching.o1$a):te3.hz1[]");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0050, code lost:
        r12 = z04.C112550d0.m153799i0(r12).toString();
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final /* synthetic */ com.tencent.p014mm.plugin.appbrand.launching.C83368m1.C83374d m102479b(com.tencent.p014mm.plugin.appbrand.config.WxaAttributes.WxaPluginCodeInfo r12, int r13) {
        /*
            java.lang.String r0 = "<this>"
            gy3.C87412m.m108594g(r12, r0)
            com.tencent.mm.plugin.appbrand.launching.m1$d r0 = new com.tencent.mm.plugin.appbrand.launching.m1$d
            java.lang.String r2 = r12.f239437d
            java.lang.String r1 = "this.provider"
            gy3.C87412m.m108593f(r2, r1)
            java.lang.String r1 = r12.f239444n
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            r3 = 1
            r5 = r1 ^ 1
            if (r13 <= 0) goto L_0x0027
            com.tencent.mm.plugin.appbrand.launching.m1$g$c r12 = new com.tencent.mm.plugin.appbrand.launching.m1$g$c
            r8 = 0
            r10 = 2
            r11 = 0
            r6 = r12
            r7 = r13
            r6.<init>(r7, r8, r10, r11)
            goto L_0x008f
        L_0x0027:
            boolean r13 = r12.f239441h
            if (r13 == 0) goto L_0x0038
            com.tencent.mm.plugin.appbrand.launching.m1$g$b r13 = new com.tencent.mm.plugin.appbrand.launching.m1$g$b
            int r7 = r12.f239438e
            r8 = 0
            r9 = 0
            r10 = 6
            r11 = 0
            r6 = r13
            r6.<init>(r7, r8, r9, r10, r11)
            goto L_0x008f
        L_0x0038:
            java.lang.String r13 = r12.f239445o
            r1 = 0
            if (r13 == 0) goto L_0x0045
            int r13 = r13.length()
            if (r13 != 0) goto L_0x0044
            goto L_0x0045
        L_0x0044:
            r3 = 0
        L_0x0045:
            if (r3 != 0) goto L_0x006c
            com.tencent.mm.plugin.appbrand.launching.m1$g$b r13 = new com.tencent.mm.plugin.appbrand.launching.m1$g$b
            int r7 = r12.f239438e
            r8 = 0
            java.lang.String r12 = r12.f239445o
            if (r12 == 0) goto L_0x0063
            java.lang.CharSequence r12 = z04.C112550d0.m153799i0(r12)
            java.lang.String r12 = r12.toString()
            if (r12 == 0) goto L_0x0063
            java.lang.String r3 = " "
            java.lang.String r4 = ""
            java.lang.String r12 = z04.C112551y.m153814n(r12, r3, r4, r1)
            goto L_0x0064
        L_0x0063:
            r12 = 0
        L_0x0064:
            r9 = r12
            r10 = 2
            r11 = 0
            r6 = r13
            r6.<init>(r7, r8, r9, r10, r11)
            goto L_0x008f
        L_0x006c:
            java.lang.String r13 = r12.f239444n
            boolean r13 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r13)
            if (r13 != 0) goto L_0x0083
            com.tencent.mm.plugin.appbrand.launching.m1$g$a r13 = new com.tencent.mm.plugin.appbrand.launching.m1$g$a
            java.lang.String r12 = r12.f239444n
            java.lang.String r1 = "this.versionDesc"
            gy3.C87412m.m108593f(r12, r1)
            r13.<init>(r12)
            r6 = r13
            goto L_0x008f
        L_0x0083:
            com.tencent.mm.plugin.appbrand.launching.m1$g$c r13 = new com.tencent.mm.plugin.appbrand.launching.m1$g$c
            int r7 = r12.f239438e
            r8 = 0
            r10 = 2
            r11 = 0
            r6 = r13
            r6.<init>(r7, r8, r10, r11)
        L_0x008f:
            r7 = 0
            java.lang.String r3 = ""
            r4 = 6
            r1 = r0
            r1.<init>(r2, r3, r4, r5, r6, r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.launching.C83510w0.m102479b(com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaPluginCodeInfo, int):com.tencent.mm.plugin.appbrand.launching.m1$d");
    }
}
