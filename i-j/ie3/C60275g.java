package ie3;

/* renamed from: ie3.g */
public class C60275g {
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0101 A[RETURN] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m70538a(com.tencent.p014mm.storage.C72963f4 r7) {
        /*
            int r0 = r7.getType()
            r1 = 0
            r2 = 0
            r3 = 1
            r4 = 419430449(0x19000031, float:6.6174836E-24)
            if (r0 != r4) goto L_0x0067
            int r0 = r7.mo108769t2()
            if (r0 != 0) goto L_0x0101
            java.lang.String r0 = r7.getContent()
            if (r0 == 0) goto L_0x0020
            java.lang.String r1 = r7.mo108775z2()
            com.tencent.mm.message.l$b r1 = com.tencent.p014mm.message.C68070l.C68072b.m80422u(r0, r1)
        L_0x0020:
            if (r1 == 0) goto L_0x0101
            java.lang.Class<com.tencent.mm.message.k> r0 = com.tencent.p014mm.message.C55268k.class
            com.tencent.mm.message.g r0 = r1.mo93555w(r0)
            com.tencent.mm.message.k r0 = (com.tencent.p014mm.message.C55268k) r0
            java.lang.String r7 = r7.mo108768t()
            boolean r7 = com.tencent.p014mm.storage.C72996z1.m85820U5(r7)
            if (r7 == 0) goto L_0x0041
            java.lang.String r7 = eb0.C75592q0.m90789s()
            java.lang.String r0 = r0.f157427c
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L_0x0041
            return r2
        L_0x0041:
            com.tencent.mm.autogen.events.WalletQueryRemittanceStatusEvent r7 = new com.tencent.mm.autogen.events.WalletQueryRemittanceStatusEvent
            r7.<init>()
            com.tencent.mm.autogen.events.WalletQueryRemittanceStatusEvent$a r0 = r7.f154909d
            java.lang.String r4 = r1.f195501J0
            r0.f154911a = r4
            r7.publish()
            com.tencent.mm.autogen.events.WalletQueryRemittanceStatusEvent$b r7 = r7.f154910e
            int r7 = r7.f154912a
            if (r7 > 0) goto L_0x0057
            int r7 = r1.f195489G0
        L_0x0057:
            if (r7 < 0) goto L_0x0101
            if (r7 == r3) goto L_0x0066
            r0 = 21
            if (r7 == r0) goto L_0x0066
            r0 = 7
            if (r7 == r0) goto L_0x0066
            r0 = 27
            if (r7 != r0) goto L_0x0101
        L_0x0066:
            return r3
        L_0x0067:
            int r0 = r7.getType()
            r4 = 436207665(0x1a000031, float:2.6469934E-23)
            if (r0 != r4) goto L_0x0101
            int r0 = r7.mo108769t2()
            if (r0 != 0) goto L_0x0101
            java.lang.String r0 = r7.getContent()
            if (r0 == 0) goto L_0x0080
            com.tencent.mm.message.l$b r1 = com.tencent.p014mm.message.C68070l.C68072b.m80422u(r0, r1)
        L_0x0080:
            if (r1 == 0) goto L_0x0101
            java.lang.String r0 = r1.f195604n1
            java.lang.String r4 = "1001"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L_0x00b5
            java.lang.String r0 = r7.mo108768t()
            boolean r0 = com.tencent.p014mm.storage.C72996z1.m85820U5(r0)
            if (r0 != 0) goto L_0x00b5
            com.tencent.mm.autogen.events.WalletQueryHbStatusEvent r7 = new com.tencent.mm.autogen.events.WalletQueryHbStatusEvent
            r7.<init>()
            java.lang.String r0 = r1.f195608o1
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 != 0) goto L_0x0101
            com.tencent.mm.autogen.events.WalletQueryHbStatusEvent$a r0 = r7.f154903d
            java.lang.String r1 = r1.f195608o1
            r0.f154905a = r1
            r7.publish()
            com.tencent.mm.autogen.events.WalletQueryHbStatusEvent$b r7 = r7.f154904e
            int r0 = r7.f154907b
            int r7 = r7.f154908c
            if (r7 != 0) goto L_0x0101
            return r3
        L_0x00b5:
            java.lang.String r7 = r7.mo108768t()
            boolean r7 = com.tencent.p014mm.storage.C72996z1.m85820U5(r7)
            if (r7 == 0) goto L_0x0101
            java.lang.String r7 = eb0.C75592q0.m90789s()
            java.util.List<java.lang.String> r0 = r1.f195470B1
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.util.List) r0)
            r4 = -1
            if (r0 != 0) goto L_0x00fb
            java.util.List<java.lang.String> r0 = r1.f195470B1
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            java.util.Iterator r0 = r0.iterator()
        L_0x00d4:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x00fb
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r5 = ","
            java.lang.String[] r1 = r1.split(r5)
            int r5 = r1.length
            r6 = 3
            if (r5 != r6) goto L_0x00d4
            r5 = r1[r2]
            boolean r5 = r5.equals(r7)
            if (r5 == 0) goto L_0x00d4
            r7 = 2
            r7 = r1[r7]
            int r4 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r7, (int) r4)
            r7 = 1
            goto L_0x00fc
        L_0x00fb:
            r7 = 0
        L_0x00fc:
            if (r7 == 0) goto L_0x0101
            if (r4 != r3) goto L_0x0101
            return r3
        L_0x0101:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: ie3.C60275g.m70538a(com.tencent.mm.storage.f4):boolean");
    }
}
