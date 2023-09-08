package ky0;

/* renamed from: ky0.a */
public abstract class C46795a implements C46799c {
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0096  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo72016c(java.lang.String r8, iy0.C46353a r9, java.lang.String r10, int r11) {
        /*
            r7 = this;
            com.tencent.mm.plugin.brandservice.ui.timeline.preload.k0$b r0 = com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C40717k0.C40719b.HTML
            java.lang.String r1 = "url"
            gy3.C87412m.m108594g(r8, r1)
            java.lang.String r1 = "target"
            gy3.C87412m.m108594g(r9, r1)
            java.lang.String r1 = "host"
            gy3.C87412m.m108594g(r10, r1)
            r1 = 200(0xc8, float:2.8E-43)
            r2 = 1
            java.lang.String r4 = "MicroMsg.BaseContentFetcher"
            r5 = 0
            r6 = 1
            if (r11 == r1) goto L_0x00cf
            r1 = 304(0x130, float:4.26E-43)
            if (r11 == r1) goto L_0x00a1
            r1 = 301(0x12d, float:4.22E-43)
            if (r11 == r1) goto L_0x0052
            r1 = 302(0x12e, float:4.23E-43)
            if (r11 == r1) goto L_0x0052
            int r9 = r9.mo71768j()
            r0 = 5
            i93.C46206e.m51496c(r0, r2, r9)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "processResponseCode fetch error: respCode: "
            r9.append(r10)
            r9.append(r11)
            java.lang.String r10 = ", url: %s"
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            java.lang.Object[] r10 = new java.lang.Object[r6]
            r10[r5] = r8
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r4, r9, r10)
            goto L_0x00dc
        L_0x0052:
            java.util.HashMap r1 = r9.mo71770l()
            java.util.Set r1 = r1.keySet()
            java.lang.String r2 = "target.headers.keys"
            gy3.C87412m.m108593f(r1, r2)
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto L_0x0068
        L_0x0066:
            r1 = 0
            goto L_0x0090
        L_0x0068:
            java.util.Iterator r1 = r1.iterator()
        L_0x006c:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0066
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r3 = "it"
            gy3.C87412m.m108593f(r2, r3)
            java.lang.String r2 = r2.toLowerCase()
            java.lang.String r3 = "this as java.lang.String).toLowerCase()"
            gy3.C87412m.m108593f(r2, r3)
            java.lang.String r3 = "location"
            boolean r2 = gy3.C87412m.m108589b(r2, r3)
            if (r2 == 0) goto L_0x006c
            r1 = 1
        L_0x0090:
            if (r1 == 0) goto L_0x0096
            r9.mo71784z(r0, r10)
            goto L_0x00db
        L_0x0096:
            java.lang.Object[] r9 = new java.lang.Object[r6]
            r9[r5] = r8
            java.lang.String r8 = "processResponseCode fetch error: invalid headers url: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r4, r8, r9)
            goto L_0x00dc
        L_0x00a1:
            r9.mo71784z(r0, r10)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r0 = "update "
            r10.append(r0)
            r10.append(r8)
            java.lang.String r8 = ": "
            r10.append(r8)
            java.lang.String r8 = r9.mo71780v()
            r10.append(r8)
            java.lang.String r8 = r10.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r8)
            int r8 = r9.mo71768j()
            r9 = 4
            i93.C46206e.m51496c(r9, r2, r8)
            goto L_0x00db
        L_0x00cf:
            r9.mo71784z(r0, r10)
            int r8 = r9.mo71768j()
            r9 = 3
            i93.C46206e.m51496c(r9, r2, r8)
        L_0x00db:
            r5 = 1
        L_0x00dc:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "processResponseCode responseCode: "
            r8.append(r9)
            r8.append(r11)
            java.lang.String r9 = ", ret: "
            r8.append(r9)
            r8.append(r5)
            java.lang.String r8 = r8.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r8)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ky0.C46795a.mo72016c(java.lang.String, iy0.a, java.lang.String, int):boolean");
    }
}
