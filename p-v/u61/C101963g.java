package u61;

import te3.C101824o80;

/* renamed from: u61.g */
public class C101963g {
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0042, code lost:
        if (r3 != null) goto L_0x0053;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0051, code lost:
        if (r3 == null) goto L_0x0056;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m134216a() {
        /*
            java.lang.Class<aq.g> r0 = p441aq.C92054g.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            aq.g r0 = (p441aq.C92054g) r0
            r0.getClass()
            com.tencent.mm.storage.w2 r0 = com.tencent.p014mm.storage.C30790w2.m39221h()
            wh3.c r0 = r0.mo57715b()
            r0.getClass()
            java.lang.String r1 = "select * from EmojiGroupInfo where type=?"
            r2 = 0
            r3 = 0
            com.tencent.mm.sdk.storage.ISQLiteDatabase r0 = r0.f301702d     // Catch:{ Exception -> 0x0047 }
            java.lang.String r4 = "1"
            java.lang.String[] r4 = new java.lang.String[]{r4}     // Catch:{ Exception -> 0x0047 }
            r5 = 2
            android.database.Cursor r3 = r0.rawQuery(r1, r4, r5)     // Catch:{ Exception -> 0x0047 }
            if (r3 == 0) goto L_0x0042
            boolean r0 = r3.moveToFirst()     // Catch:{ Exception -> 0x0047 }
            if (r0 == 0) goto L_0x0042
            com.tencent.mm.storage.emotion.EmojiGroupInfo r0 = new com.tencent.mm.storage.emotion.EmojiGroupInfo     // Catch:{ Exception -> 0x0047 }
            r0.<init>()     // Catch:{ Exception -> 0x0047 }
            r0.convertFrom(r3)     // Catch:{ Exception -> 0x0047 }
            int r0 = r0.field_flag     // Catch:{ Exception -> 0x0047 }
            r0 = r0 & 256(0x100, float:3.59E-43)
            r1 = 1
            if (r0 <= 0) goto L_0x0040
            r2 = 1
        L_0x0040:
            r2 = r2 ^ r1
            goto L_0x0053
        L_0x0042:
            if (r3 == 0) goto L_0x0056
            goto L_0x0053
        L_0x0045:
            r0 = move-exception
            goto L_0x0057
        L_0x0047:
            r0 = move-exception
            java.lang.String r1 = "MicroMsg.emoji.EmojiGroupInfoStorage"
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0045 }
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r1, r0)     // Catch:{ all -> 0x0045 }
            if (r3 == 0) goto L_0x0056
        L_0x0053:
            r3.close()
        L_0x0056:
            return r2
        L_0x0057:
            if (r3 == 0) goto L_0x005c
            r3.close()
        L_0x005c:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: u61.C101963g.m134216a():boolean");
    }

    /* renamed from: b */
    public static boolean m134217b(String str) {
        if (str == null) {
            return false;
        }
        return str.equals("17");
    }

    /* renamed from: c */
    public static boolean m134218c(C101824o80 o802) {
        if (o802 == null) {
            return false;
        }
        return m134217b(o802.f298994d);
    }
}
