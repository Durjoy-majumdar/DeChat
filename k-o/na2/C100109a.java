package na2;

/* renamed from: na2.a */
public class C100109a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C34754b f293260d;

    public C100109a(C34754b bVar) {
        this.f293260d = bVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0075, code lost:
        r5 = za2.C102984b.m136168e(r9);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r15 = this;
            na2.b r0 = r15.f293260d
            r0.getClass()
            java.lang.String r0 = "MicroMsg.PieceCacheCleanController"
            java.lang.String r1 = "scanMusicFile"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            long r1 = java.lang.System.currentTimeMillis()
            ra2.b r3 = ma2.C99814o0.wx0()
            r3.getClass()
            r4 = 1
            java.lang.Object[] r5 = new java.lang.Object[r4]
            r6 = 0
            java.lang.String r7 = "Music"
            r5[r6] = r7
            java.lang.String r8 = "SELECT * from %s WHERE updateTime < ? AND  musicType  <> 4  AND musicType  <> 10  AND musicType  <> 11   order by updateTime DESC limit 10"
            java.lang.String r5 = java.lang.String.format(r8, r5)
            long r8 = java.lang.System.currentTimeMillis()
            r10 = 86400000(0x5265c00, double:4.2687272E-316)
            long r8 = r8 - r10
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            com.tencent.mm.sdk.storage.ISQLiteDatabase r3 = r3.f296943e
            java.lang.String[] r11 = new java.lang.String[r4]
            java.lang.String r8 = java.lang.String.valueOf(r8)
            r11[r6] = r8
            android.database.Cursor r3 = r3.rawQuery(r5, r11)
        L_0x0041:
            boolean r5 = r3.moveToNext()
            if (r5 == 0) goto L_0x0053
            ra2.a r5 = new ra2.a
            r5.<init>()
            r5.convertFrom(r3)
            r10.add(r5)
            goto L_0x0041
        L_0x0053:
            r3.close()
            java.util.Iterator r3 = r10.iterator()
        L_0x005a:
            boolean r5 = r3.hasNext()
            r8 = 2
            if (r5 == 0) goto L_0x008f
            java.lang.Object r5 = r3.next()
            ra2.a r5 = (ra2.C101365a) r5
            java.lang.String r9 = r5.field_songWifiUrl
            if (r9 == 0) goto L_0x006c
            goto L_0x006e
        L_0x006c:
            java.lang.String r9 = r5.field_songWebUrl
        L_0x006e:
            boolean r5 = android.text.TextUtils.isEmpty(r9)
            if (r5 == 0) goto L_0x0075
            goto L_0x005a
        L_0x0075:
            java.lang.String r5 = za2.C102984b.m136168e(r9)
            boolean r9 = com.tencent.p014mm.vfs.C86013q1.m106447h(r5)
            if (r9 == 0) goto L_0x005a
            java.lang.Object[] r8 = new java.lang.Object[r8]
            r8[r6] = r5
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r9)
            r8[r4] = r5
            java.lang.String r5 = "delete music file,  %s, result:%b"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r5, r8)
            goto L_0x005a
        L_0x008f:
            ra2.b r3 = ma2.C99814o0.wx0()
            r3.getClass()
            java.lang.Object[] r5 = new java.lang.Object[r4]
            r5[r6] = r7
            java.lang.String r9 = "SELECT * from %s WHERE updateTime < ? AND musicType <> ?  order by updateTime DESC limit 10"
            java.lang.String r5 = java.lang.String.format(r9, r5)
            long r11 = java.lang.System.currentTimeMillis()
            r13 = 604800000(0x240c8400, double:2.988109026E-315)
            long r11 = r11 - r13
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            com.tencent.mm.sdk.storage.ISQLiteDatabase r3 = r3.f296943e
            java.lang.String[] r13 = new java.lang.String[r8]
            java.lang.String r11 = java.lang.String.valueOf(r11)
            r13[r6] = r11
            r11 = 6
            java.lang.String r11 = java.lang.String.valueOf(r11)
            r13[r4] = r11
            android.database.Cursor r3 = r3.rawQuery(r5, r13)
        L_0x00c2:
            boolean r5 = r3.moveToNext()
            if (r5 == 0) goto L_0x00d4
            ra2.a r5 = new ra2.a
            r5.<init>()
            r5.convertFrom(r3)
            r9.add(r5)
            goto L_0x00c2
        L_0x00d4:
            r3.close()
            r9.addAll(r10)
            java.util.Iterator r3 = r9.iterator()
        L_0x00de:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x0147
            java.lang.Object r5 = r3.next()
            ra2.a r5 = (ra2.C101365a) r5
            java.lang.String r9 = r5.field_musicId
            java.lang.String r9 = za2.C102984b.m136167d(r9, r4)
            java.lang.String r10 = r5.field_musicId
            java.lang.String r10 = za2.C102984b.m136167d(r10, r6)
            java.lang.String r11 = r5.field_musicId
            java.lang.String r11 = za2.C102984b.m136169f(r11, r6)
            java.lang.String r12 = r5.field_musicId
            java.lang.String r12 = za2.C102984b.m136169f(r12, r4)
            com.tencent.p014mm.vfs.C86013q1.m106447h(r9)
            com.tencent.p014mm.vfs.C86013q1.m106447h(r10)
            com.tencent.p014mm.vfs.C86013q1.m106447h(r11)
            com.tencent.p014mm.vfs.C86013q1.m106447h(r12)
            ra2.b r9 = ma2.C99814o0.wx0()
            java.lang.String r10 = r5.field_musicId
            sg.g<java.lang.String, ra2.a> r11 = r9.f296942d
            q90.d r11 = (q90.C101062d) r11
            r11.remove(r10)
            sg.g<java.lang.String, ma2.s> r9 = r9.f296944f
            q90.d r9 = (q90.C101062d) r9
            r9.remove(r10)
            ra2.b r9 = ma2.C99814o0.wx0()
            java.lang.String r10 = r5.field_musicId
            com.tencent.mm.sdk.storage.ISQLiteDatabase r9 = r9.f296943e
            java.lang.String[] r11 = new java.lang.String[r4]
            r11[r6] = r10
            java.lang.String r10 = "musicId=?"
            int r9 = r9.delete(r7, r10, r11)
            java.lang.Object[] r10 = new java.lang.Object[r8]
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r10[r6] = r9
            java.lang.String r5 = r5.field_musicId
            r10[r4] = r5
            java.lang.String r5 = "delete music %d %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r5, r10)
            goto L_0x00de
        L_0x0147:
            long r7 = java.lang.System.currentTimeMillis()
            long r7 = r7 - r1
            java.lang.Object[] r1 = new java.lang.Object[r4]
            java.lang.Long r2 = java.lang.Long.valueOf(r7)
            r1[r6] = r2
            java.lang.String r2 = "scanMusic UseTime=%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r2, r1)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            com.tencent.mars.smc.IDKey r1 = new com.tencent.mars.smc.IDKey
            r1.<init>()
            r2 = 285(0x11d, float:4.0E-43)
            r1.SetID(r2)
            r3 = 254(0xfe, float:3.56E-43)
            r1.SetKey(r3)
            int r3 = (int) r7
            long r3 = (long) r3
            r1.SetValue(r3)
            com.tencent.mars.smc.IDKey r3 = new com.tencent.mars.smc.IDKey
            r3.<init>()
            r3.SetID(r2)
            r2 = 255(0xff, float:3.57E-43)
            r3.SetKey(r2)
            r4 = 1
            r3.SetValue(r4)
            r0.add(r1)
            r0.add(r3)
            com.tencent.mm.plugin.report.service.n r1 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r1.mo160124a(r0, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: na2.C100109a.run():void");
    }
}
