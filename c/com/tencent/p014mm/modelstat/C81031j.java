package com.tencent.p014mm.modelstat;

/* renamed from: com.tencent.mm.modelstat.j */
public class C81031j {

    /* renamed from: a */
    public C81032a f238012a = null;

    /* renamed from: b */
    public final String f238013b;

    /* renamed from: com.tencent.mm.modelstat.j$a */
    public static class C81032a {

        /* renamed from: a */
        public int f238014a = 0;

        /* renamed from: b */
        public String f238015b = "";

        /* renamed from: c */
        public int f238016c = 0;

        /* renamed from: d */
        public String f238017d = "";

        /* renamed from: e */
        public boolean f238018e = false;
    }

    public C81031j(String str) {
        this.f238013b = str;
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x0176  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x017f  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.tencent.p014mm.modelstat.C81031j.C81032a mo112913a() {
        /*
            r19 = this;
            r0 = r19
            com.tencent.mm.modelstat.j$a r1 = r0.f238012a
            if (r1 == 0) goto L_0x0007
            return r1
        L_0x0007:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r0.f238013b
            r1.append(r2)
            java.lang.String r2 = "mobileinfo.ini"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.tencent.mm.vfs.m1 r2 = new com.tencent.mm.vfs.m1
            r2.<init>((java.lang.String) r1)
            boolean r3 = r2.mo119967g()
            r7 = 2
            java.lang.String r8 = "extraInfo"
            java.lang.String r9 = "subType"
            java.lang.String r10 = "ispName"
            java.lang.String r11 = "ispCode"
            r12 = 1
            r13 = 0
            java.lang.String r14 = "MicroMsg.MobileInfoStorage ReportDataFlow"
            if (r3 != 0) goto L_0x0040
            java.lang.Object[] r2 = new java.lang.Object[r12]
            r2[r13] = r1
            java.lang.String r3 = "readConfig file not exist :%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r14, r3, r2)
            r15 = 0
            goto L_0x00e8
        L_0x0040:
            com.tencent.mm.sdk.storage.ConfigFile r3 = new com.tencent.mm.sdk.storage.ConfigFile
            r3.<init>(r1)
            com.tencent.mm.modelstat.j$a r15 = new com.tencent.mm.modelstat.j$a
            r15.<init>()
            java.lang.Integer r16 = r3.getIntegerValue(r11)
            int r6 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.Integer) r16)
            r15.f238014a = r6
            java.lang.String r6 = r3.getValue(r10)
            r15.f238015b = r6
            java.lang.Integer r6 = r3.getIntegerValue(r9)
            int r6 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.Integer) r6)
            r15.f238016c = r6
            java.lang.String r3 = r3.getValue(r8)
            r15.f238017d = r3
            long r2 = r2.mo119979q()
            r6 = 10011(0x271b, float:1.4028E-41)
            int r4 = sf0.C90188n0.f258950r
            if (r6 != r4) goto L_0x0096
            int r4 = sf0.C90188n0.f258951s
            if (r4 <= 0) goto L_0x0096
            long r2 = com.tencent.p014mm.sdk.platformtools.Util.nowMilliSecond()
            int r4 = sf0.C90188n0.f258951s
            long r5 = (long) r4
            long r2 = r2 - r5
            java.lang.Object[] r5 = new java.lang.Object[r7]
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r5[r13] = r4
            java.lang.Long r4 = java.lang.Long.valueOf(r2)
            r5[r12] = r4
            java.lang.String r4 = "readConfig DK_TEST_MOBILEINFOFILE_MODTIME val:%d lm:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r14, r4, r5)
            sf0.C90188n0.f258951s = r13
        L_0x0096:
            r4 = 0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 <= 0) goto L_0x00bd
            long r4 = com.tencent.p014mm.sdk.platformtools.Util.milliSecondsToNow(r2)
            r17 = 259200000(0xf731400, double:1.280618154E-315)
            int r6 = (r4 > r17 ? 1 : (r4 == r17 ? 0 : -1))
            if (r6 <= 0) goto L_0x00bd
            java.lang.Object[] r4 = new java.lang.Object[r7]
            long r2 = com.tencent.p014mm.sdk.platformtools.Util.milliSecondsToNow(r2)
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r4[r13] = r2
            r4[r12] = r1
            java.lang.String r2 = "readConfig  diff:%d file:%s cache expired remove!"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r14, r2, r4)
            r15.f238018e = r12
        L_0x00bd:
            r2 = 5
            java.lang.Object[] r2 = new java.lang.Object[r2]
            int r3 = r15.f238016c
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r2[r13] = r3
            int r3 = r15.f238014a
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r2[r12] = r3
            java.lang.String r3 = r15.f238015b
            r2[r7] = r3
            java.lang.String r3 = r15.f238017d
            r4 = 3
            r2[r4] = r3
            boolean r3 = r15.f238018e
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            r4 = 4
            r2[r4] = r3
            java.lang.String r3 = "readConfig MobileInfo subType:%d ispCode:%d ispName:%s extraInfo:%s expired:%b"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r14, r3, r2)
        L_0x00e8:
            r0.f238012a = r15
            if (r15 == 0) goto L_0x00f8
            boolean r2 = r15.f238018e
            if (r2 != 0) goto L_0x00f8
            java.lang.String r1 = "checkInfo mobile info cache Read file succ."
            com.tencent.p014mm.sdk.platformtools.Log.m105926v(r14, r1)
            com.tencent.mm.modelstat.j$a r1 = r0.f238012a
            return r1
        L_0x00f8:
            android.content.Context r2 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            if (r2 != 0) goto L_0x0106
            java.lang.String r2 = "readInfoBySystem MMApplicationContext is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r14, r2)
        L_0x0104:
            r6 = 0
            goto L_0x0174
        L_0x0106:
            android.content.Context r3 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.lang.String r4 = "connectivity"
            java.lang.Object r3 = r3.getSystemService(r4)
            android.net.ConnectivityManager r3 = (android.net.ConnectivityManager) r3
            if (r3 != 0) goto L_0x011b
            java.lang.String r2 = "readInfoBySystem ConnectivityManager is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r14, r2)
            goto L_0x0104
        L_0x011b:
            android.net.NetworkInfo r3 = r3.getActiveNetworkInfo()
            if (r3 != 0) goto L_0x0128
            java.lang.String r2 = "readInfoBySystem getActiveNetworkInfo is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r14, r2)
            goto L_0x0104
        L_0x0128:
            int r4 = r3.getType()
            if (r4 != r12) goto L_0x0135
            java.lang.String r2 = "readInfoBySystem net type is wifi"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r14, r2)
            goto L_0x0104
        L_0x0135:
            com.tencent.mm.modelstat.j$a r6 = new com.tencent.mm.modelstat.j$a
            r6.<init>()
            int r4 = r3.getSubtype()
            r6.f238016c = r4
            int r4 = com.tencent.p014mm.sdk.platformtools.NetStatusUtil.getISPCode(r2)
            r6.f238014a = r4
            java.lang.String r2 = com.tencent.p014mm.sdk.platformtools.NetStatusUtil.getISPName(r2)
            r6.f238015b = r2
            java.lang.String r2 = r3.getExtraInfo()
            r6.f238017d = r2
            r2 = 4
            java.lang.Object[] r2 = new java.lang.Object[r2]
            int r3 = r6.f238016c
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r2[r13] = r3
            int r3 = r6.f238014a
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r2[r12] = r3
            java.lang.String r3 = r6.f238015b
            r2[r7] = r3
            java.lang.String r3 = r6.f238017d
            r4 = 3
            r2[r4] = r3
            java.lang.String r3 = "readInfoBySystem subType:%d ispCode:%d ispName:%s extraInfo:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r14, r3, r2)
        L_0x0174:
            if (r6 != 0) goto L_0x017f
            java.lang.String r1 = "readInfoBySystem failed , use old."
            com.tencent.p014mm.sdk.platformtools.Log.m105926v(r14, r1)
            com.tencent.mm.modelstat.j$a r1 = r0.f238012a
            return r1
        L_0x017f:
            r0.f238012a = r6
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r2 == 0) goto L_0x018e
            java.lang.String r1 = "saveConfig path is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r14, r1)
            goto L_0x01a7
        L_0x018e:
            com.tencent.mm.sdk.storage.ConfigFile r2 = new com.tencent.mm.sdk.storage.ConfigFile
            r2.<init>(r1)
            int r1 = r6.f238014a
            r2.saveValue((java.lang.String) r11, (int) r1)
            java.lang.String r1 = r6.f238015b
            r2.saveValue((java.lang.String) r10, (java.lang.String) r1)
            int r1 = r6.f238016c
            r2.saveValue((java.lang.String) r9, (int) r1)
            java.lang.String r1 = r6.f238017d
            r2.saveValue((java.lang.String) r8, (java.lang.String) r1)
        L_0x01a7:
            com.tencent.mm.modelstat.j$a r1 = r0.f238012a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.modelstat.C81031j.mo112913a():com.tencent.mm.modelstat.j$a");
    }
}
