package p1087sj;

/* renamed from: sj.b */
public class C101637b {

    /* renamed from: a */
    public final /* synthetic */ String f297515a;

    /* renamed from: b */
    public final /* synthetic */ int f297516b;

    /* renamed from: c */
    public final /* synthetic */ int[] f297517c;

    /* renamed from: d */
    public final /* synthetic */ C101639d f297518d;

    /* renamed from: e */
    public final /* synthetic */ C101633a f297519e;

    public C101637b(C101633a aVar, String str, int i, int[] iArr, C101639d dVar) {
        this.f297519e = aVar;
        this.f297515a = str;
        this.f297516b = i;
        this.f297517c = iArr;
        this.f297518d = dVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:118:0x0763  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x0771  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0235  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0254  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x025a  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0276  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo141095a() {
        /*
            r23 = this;
            r1 = r23
            r2 = 1
            java.lang.Object[] r0 = new java.lang.Object[r2]
            java.lang.String r3 = r1.f297515a
            r4 = 0
            r0[r4] = r3
            java.lang.String r3 = "MicroMsg.AgingTestCommand"
            java.lang.String r5 = "[oneliang] batch insert test msg info, begin single transaction, username:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r5, r0)
            long r5 = java.lang.System.currentTimeMillis()
            r7 = 0
        L_0x0016:
            int r0 = r1.f297516b
            r8 = 2
            if (r7 >= r0) goto L_0x08eb
            sj.a r0 = r1.f297519e
            int[] r9 = r1.f297517c
            int r9 = r9.length
            int[] r10 = p1087sj.C101633a.f297502a
            int r0 = r0.mo141091f(r9)
            int[] r9 = r1.f297517c
            r9 = r9[r0]
            java.lang.String r10 = ".jpg"
            java.lang.String r0 = "7B00000000000000000000000000000000000000000000000100000000000000000000000000000000000000007D"
            java.lang.String r11 = ""
            r14 = 43
            r15 = 4
            r12 = 3
            if (r9 == r12) goto L_0x031e
            java.lang.String r13 = ":"
            if (r9 == r14) goto L_0x027a
            r14 = 47
            if (r9 == r14) goto L_0x0091
            sj.a r0 = r1.f297519e
            java.lang.String r11 = r1.f297515a
            r0.getClass()
            com.tencent.mm.storage.f4 r13 = new com.tencent.mm.storage.f4
            r13.<init>()
            r13.mo108749c3(r11)
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r14 = "text_"
            r11.append(r14)
            r11.append(r7)
            java.lang.String r11 = r11.toString()
            r13.mo108732L2(r11)
            r13.setType(r2)
            int[] r11 = p1087sj.C101633a.f297502a
            int r0 = r0.mo141091f(r8)
            r0 = r11[r0]
            r13.mo108740T2(r0)
            int r0 = r13.mo108769t2()
            if (r0 != r2) goto L_0x007a
            r13.mo100991d(r15)
            goto L_0x007d
        L_0x007a:
            r13.mo100991d(r12)
        L_0x007d:
            long r14 = java.lang.System.currentTimeMillis()
            r13.mo108745Y2(r14)
            r13.mo108733M2(r14)
            r4 = r3
            r17 = r5
        L_0x008a:
            r19 = r7
            r16 = r9
            r9 = r10
            goto L_0x0749
        L_0x0091:
            sj.d r4 = r1.f297518d
            java.util.List<sj.e<com.tencent.mm.storage.f4, com.tencent.mm.storage.emotion.EmojiInfo>> r4 = r4.f297523d
            java.util.ArrayList r4 = (java.util.ArrayList) r4
            boolean r4 = r4.isEmpty()
            if (r4 == 0) goto L_0x00a1
            r17 = r5
            goto L_0x032c
        L_0x00a1:
            sj.a r4 = r1.f297519e
            java.lang.String r12 = r1.f297515a
            sj.d r15 = r1.f297518d
            java.util.List<sj.e<com.tencent.mm.storage.f4, com.tencent.mm.storage.emotion.EmojiInfo>> r15 = r15.f297523d
            java.util.ArrayList r15 = (java.util.ArrayList) r15
            int r2 = r15.size()
            int r2 = r4.mo141091f(r2)
            java.lang.Object r2 = r15.get(r2)
            sj.e r2 = (p1087sj.C101640e) r2
            java.lang.Class<aq.g> r15 = p441aq.C92054g.class
            if (r2 != 0) goto L_0x00c2
            r17 = r5
            r13 = 0
            goto L_0x026f
        L_0x00c2:
            M r8 = r2.f297524a
            com.tencent.mm.storage.f4 r8 = (com.tencent.p014mm.storage.C72963f4) r8
            S r2 = r2.f297525b
            com.tencent.mm.storage.emotion.EmojiInfo r2 = (com.tencent.p014mm.storage.emotion.EmojiInfo) r2
            java.lang.String r14 = r8.getContent()
            r17 = r5
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r12)
            int r6 = r14.indexOf(r13)
            java.lang.String r6 = r14.substring(r6)
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            com.tencent.mm.storage.f4 r6 = new com.tencent.mm.storage.f4
            r6.<init>()
            r6.mo108749c3(r12)
            r6.mo108732L2(r5)
            r5 = 47
            r6.setType(r5)
            int[] r5 = p1087sj.C101633a.f297502a
            r12 = 2
            int r4 = r4.mo141091f(r12)
            r4 = r5[r4]
            r6.mo108740T2(r4)
            int r4 = r6.mo108769t2()
            r5 = 1
            if (r4 != r5) goto L_0x010f
            r4 = 4
            r6.mo100991d(r4)
            goto L_0x0113
        L_0x010f:
            r4 = 3
            r6.mo100991d(r4)
        L_0x0113:
            java.lang.String r4 = r8.mo108765s2()
            r6.mo108739S2(r4)
            byte[] r0 = com.tencent.p014mm.sdk.platformtools.Util.decodeHexString(r0)
            r6.mo108742V2(r0)
            long r4 = java.lang.System.currentTimeMillis()
            r6.mo108745Y2(r4)
            r6.mo108733M2(r4)
            com.tencent.mm.storage.emotion.EmojiInfo r4 = new com.tencent.mm.storage.emotion.EmojiInfo
            r4.<init>()
            java.lang.String r0 = r2.getMd5()
            r4.field_md5 = r0
            java.lang.String r0 = r2.field_svrid
            if (r0 != 0) goto L_0x013b
            goto L_0x013c
        L_0x013b:
            r11 = r0
        L_0x013c:
            r4.field_svrid = r11
            int r0 = r2.field_catalog
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r5 = 0
            int r0 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.Integer) r0, (int) r5)
            r4.field_catalog = r0
            int r0 = r2.field_type
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            int r0 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.Integer) r0, (int) r5)
            r4.field_type = r0
            int r0 = r2.field_size
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            int r0 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.Integer) r0, (int) r5)
            r4.field_size = r0
            int r0 = r2.field_start
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            int r0 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.Integer) r0, (int) r5)
            r4.field_start = r0
            int r0 = r2.field_state
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            int r0 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.Integer) r0, (int) r5)
            r4.field_state = r0
            int r0 = r2.field_reserved3
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            int r0 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.Integer) r0, (int) r5)
            r4.field_reserved3 = r0
            int r0 = r2.field_reserved4
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            int r0 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.Integer) r0, (int) r5)
            r4.field_reserved4 = r0
            java.lang.String r0 = r2.field_groupId
            r4.field_groupId = r0
            long r11 = r2.field_lastUseTime
            java.lang.Long r0 = java.lang.Long.valueOf(r11)
            r11 = 0
            long r13 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.Long) r0, (long) r11)
            r4.field_lastUseTime = r13
            int r0 = r2.field_idx
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            int r0 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.Integer) r0, (int) r5)
            r4.field_idx = r0
            int r0 = r2.field_temp
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            int r0 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.Integer) r0, (int) r5)
            r4.field_temp = r0
            int r0 = r2.field_source
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            int r0 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.Integer) r0, (int) r5)
            r4.field_source = r0
            int r0 = r2.field_needupload
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            int r0 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.Integer) r0, (int) r5)
            r4.field_needupload = r0
            java.lang.String r0 = r2.field_thumbUrl
            r4.field_thumbUrl = r0
            java.lang.String r0 = r2.field_cdnUrl
            r4.field_cdnUrl = r0
            java.lang.String r0 = r2.field_encrypturl
            r4.field_encrypturl = r0
            java.lang.String r0 = r2.field_aeskey
            r4.field_aeskey = r0
            int r0 = r2.field_width
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r5 = 0
            int r0 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.Integer) r0, (int) r5)
            r4.field_width = r0
            int r0 = r2.field_height
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            int r0 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.Integer) r0, (int) r5)
            r4.field_height = r0
            di3.d r0 = di3.C86312j.m106911c(r15)
            aq.g r0 = (p441aq.C92054g) r0
            r0.getClass()
            com.tencent.mm.storage.w2 r0 = com.tencent.p014mm.storage.C30790w2.m39221h()
            wh3.g r0 = r0.mo57717d()
            java.lang.String r2 = r2.getMd5()
            r0.getClass()
            java.lang.String r5 = "select * from EmojiInfo where md5=?"
            com.tencent.mm.sdk.storage.ISQLiteDatabase r0 = r0.f301704d     // Catch:{ Exception -> 0x023c, all -> 0x0239 }
            r8 = 1
            java.lang.String[] r11 = new java.lang.String[r8]     // Catch:{ Exception -> 0x023c, all -> 0x0239 }
            r8 = 0
            r11[r8] = r2     // Catch:{ Exception -> 0x023c, all -> 0x0239 }
            r8 = 2
            android.database.Cursor r5 = r0.rawQuery(r5, r11, r8)     // Catch:{ Exception -> 0x023c, all -> 0x0239 }
            if (r5 == 0) goto L_0x0232
            boolean r0 = r5.moveToFirst()     // Catch:{ Exception -> 0x0230 }
            if (r0 == 0) goto L_0x0232
            r0 = 1
            goto L_0x0233
        L_0x0230:
            r0 = move-exception
            goto L_0x023e
        L_0x0232:
            r0 = 0
        L_0x0233:
            if (r5 == 0) goto L_0x0258
            r5.close()
            goto L_0x0258
        L_0x0239:
            r0 = move-exception
            r15 = 0
            goto L_0x0274
        L_0x023c:
            r0 = move-exception
            r5 = 0
        L_0x023e:
            java.lang.String r8 = "MicroMsg.emoji.EmojiInfoStorage"
            java.lang.String r11 = "get judge is Exist EmojiInfo fail. md5 id is %s, err: %s"
            r12 = 2
            java.lang.Object[] r13 = new java.lang.Object[r12]     // Catch:{ all -> 0x0272 }
            r12 = 0
            r13[r12] = r2     // Catch:{ all -> 0x0272 }
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x0272 }
            r2 = 1
            r13[r2] = r0     // Catch:{ all -> 0x0272 }
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r8, r11, r13)     // Catch:{ all -> 0x0272 }
            if (r5 == 0) goto L_0x0257
            r5.close()
        L_0x0257:
            r0 = 0
        L_0x0258:
            if (r0 != 0) goto L_0x026e
            di3.d r0 = di3.C86312j.m106911c(r15)
            aq.g r0 = (p441aq.C92054g) r0
            r0.getClass()
            com.tencent.mm.storage.w2 r0 = com.tencent.p014mm.storage.C30790w2.m39221h()
            wh3.g r0 = r0.mo57717d()
            r0.insert(r4)
        L_0x026e:
            r13 = r6
        L_0x026f:
            r4 = r3
            goto L_0x008a
        L_0x0272:
            r0 = move-exception
            r15 = r5
        L_0x0274:
            if (r15 == 0) goto L_0x0279
            r15.close()
        L_0x0279:
            throw r0
        L_0x027a:
            r17 = r5
            sj.d r2 = r1.f297518d
            java.util.List<sj.e<com.tencent.mm.storage.f4, hd0.n0>> r2 = r2.f297522c
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x028a
            goto L_0x032c
        L_0x028a:
            sj.d r2 = r1.f297518d
            java.util.List<sj.e<com.tencent.mm.storage.f4, hd0.n0>> r2 = r2.f297522c
            sj.a r4 = r1.f297519e
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            int r5 = r2.size()
            int r4 = r4.mo141091f(r5)
            java.lang.Object r2 = r2.get(r4)
            sj.e r2 = (p1087sj.C101640e) r2
            sj.a r4 = r1.f297519e
            java.lang.String r5 = r1.f297515a
            r4.getClass()
            if (r2 != 0) goto L_0x02ab
            r8 = 0
            goto L_0x0316
        L_0x02ab:
            M r6 = r2.f297524a
            com.tencent.mm.storage.f4 r6 = (com.tencent.p014mm.storage.C72963f4) r6
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r5)
            java.lang.String r11 = r6.getContent()
            java.lang.String r6 = r6.getContent()
            int r6 = r6.indexOf(r13)
            java.lang.String r6 = r11.substring(r6)
            r8.append(r6)
            java.lang.String r6 = r8.toString()
            com.tencent.mm.storage.f4 r8 = new com.tencent.mm.storage.f4
            r8.<init>()
            r8.mo108749c3(r5)
            r8.mo108732L2(r6)
            r5 = 43
            r8.setType(r5)
            int[] r5 = p1087sj.C101633a.f297502a
            r6 = 2
            int r4 = r4.mo141091f(r6)
            r4 = r5[r4]
            r8.mo108740T2(r4)
            int r4 = r8.mo108769t2()
            r5 = 1
            if (r4 != r5) goto L_0x02f6
            r4 = 4
            r8.mo100991d(r4)
            goto L_0x02fa
        L_0x02f6:
            r4 = 3
            r8.mo100991d(r4)
        L_0x02fa:
            byte[] r0 = com.tencent.p014mm.sdk.platformtools.Util.decodeHexString(r0)
            r8.mo108742V2(r0)
            long r4 = java.lang.System.currentTimeMillis()
            r8.mo108745Y2(r4)
            r8.mo108733M2(r4)
            byte[] r0 = p1087sj.C101633a.m133493e(r4)
            java.lang.String r0 = p823sg.C90193h.m112878f(r0)
            r8.mo108739S2(r0)
        L_0x0316:
            r4 = r3
            r19 = r7
            r16 = r9
            r9 = r10
            goto L_0x074b
        L_0x031e:
            r17 = r5
            sj.d r2 = r1.f297518d
            java.util.List<sj.e<com.tencent.mm.storage.f4, com.tencent.mm.modelimage.k>> r2 = r2.f297521b
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x0332
        L_0x032c:
            r5 = r1
            r4 = r3
            r19 = r7
            goto L_0x08df
        L_0x0332:
            sj.a r2 = r1.f297519e
            java.lang.String r4 = r1.f297515a
            sj.d r5 = r1.f297518d
            java.util.List<sj.e<com.tencent.mm.storage.f4, com.tencent.mm.modelimage.k>> r5 = r5.f297521b
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            int r6 = r5.size()
            int r6 = r2.mo141091f(r6)
            java.lang.Object r5 = r5.get(r6)
            sj.e r5 = (p1087sj.C101640e) r5
            java.lang.Class<gt.k> r6 = p158gt.C98201k.class
            if (r5 != 0) goto L_0x0357
            r4 = r3
            r19 = r7
            r16 = r9
            r9 = r10
            r13 = 0
            goto L_0x0749
        L_0x0357:
            M r8 = r5.f297524a
            com.tencent.mm.storage.f4 r8 = (com.tencent.p014mm.storage.C72963f4) r8
            S r5 = r5.f297525b
            com.tencent.mm.modelimage.k r5 = (com.tencent.p014mm.modelimage.C92836k) r5
            com.tencent.mm.storage.f4 r13 = new com.tencent.mm.storage.f4
            r13.<init>()
            r13.mo108749c3(r4)
            java.lang.String r8 = r8.getContent()
            r13.mo108732L2(r8)
            r8 = 3
            r13.setType(r8)
            int[] r12 = p1087sj.C101633a.f297502a
            r14 = 2
            int r2 = r2.mo141091f(r14)
            r2 = r12[r2]
            r13.mo108740T2(r2)
            int r2 = r13.mo108769t2()
            r12 = 1
            if (r2 != r12) goto L_0x038a
            r2 = 4
            r13.mo100991d(r2)
            goto L_0x038d
        L_0x038a:
            r13.mo100991d(r8)
        L_0x038d:
            byte[] r0 = com.tencent.p014mm.sdk.platformtools.Util.decodeHexString(r0)
            r13.mo108742V2(r0)
            long r14 = java.lang.System.currentTimeMillis()
            byte[] r0 = p1087sj.C101633a.m133493e(r14)
            java.lang.String r0 = p823sg.C90193h.m112878f(r0)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r8 = "THUMBNAIL_DIRPATH://th_"
            r2.append(r8)
            r2.append(r0)
            java.lang.String r2 = r2.toString()
            r13.mo108745Y2(r14)
            r13.mo108733M2(r14)
            r13.mo108739S2(r2)
            di3.d r12 = di3.C86312j.m106911c(r6)
            gt.k r12 = (p158gt.C98201k) r12
            gt.m r12 = r12.mo137277xi()
            java.lang.String r1 = r5.f267378e
            r16 = r9
            java.lang.String r9 = r5.f267380g
            r19 = r7
            java.lang.String r7 = "."
            int r7 = r1.lastIndexOf(r7)
            if (r7 <= 0) goto L_0x03f7
            r20 = r10
            r10 = 0
            java.lang.String r21 = r1.substring(r10, r7)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r0)
            r22 = r3
            int r3 = r1.length()
            java.lang.String r1 = r1.substring(r7, r3)
            r10.append(r1)
            java.lang.String r1 = r10.toString()
            r3 = r21
            goto L_0x03fd
        L_0x03f7:
            r22 = r3
            r20 = r10
            r3 = r1
            r1 = r0
        L_0x03fd:
            com.tencent.mm.modelimage.k r7 = new com.tencent.mm.modelimage.k
            r7.<init>()
            int r10 = r5.f267376c
            r7.mo127126C(r10)
            int r10 = r5.f267377d
            r7.mo127129F(r10)
            di3.d r6 = di3.C86312j.m106911c(r6)
            gt.k r6 = (p158gt.C98201k) r6
            gt.m r6 = r6.mo137277xi()
            com.tencent.mm.modelimage.m r6 = (com.tencent.p014mm.modelimage.C92839m) r6
            r10 = r8
            r21 = r9
            long r8 = r6.mo127192mL(r4)
            r7.mo127154y(r8)
            r7.mo127147r(r1)
            r7.mo127128E(r2)
            long r1 = r13.mo108774y2()
            r7.mo127125B(r1)
            r1 = 1000(0x3e8, double:4.94E-321)
            long r14 = r14 / r1
            int r1 = (int) r14
            r7.mo127150u(r1)
            int r1 = r5.f267381h
            r7.mo127149t(r1)
            java.lang.String r1 = r5.f267379f
            r7.mo127155z(r1)
            int r1 = r5.f267390q
            r7.mo127151v(r1)
            java.lang.String r1 = r13.mo108768t()
            com.tencent.mm.modelimage.m r12 = (com.tencent.p014mm.modelimage.C92839m) r12
            java.lang.String r2 = "id"
            r12.wt0(r1, r2, r7)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            eb0.c r2 = eb0.C97625j3.m125812b()
            java.lang.String r2 = r2.mo105891f()
            r1.append(r2)
            java.lang.String r2 = "/image2/"
            r1.append(r2)
            r4 = 2
            r5 = 0
            java.lang.String r6 = r3.substring(r5, r4)
            r1.append(r6)
            java.lang.String r5 = "/"
            r1.append(r5)
            r6 = 4
            java.lang.String r7 = r3.substring(r4, r6)
            r1.append(r7)
            java.lang.String r1 = r1.toString()
            r6 = r21
            java.lang.String r6 = r6.replace(r10, r11)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            eb0.c r8 = eb0.C97625j3.m125812b()
            java.lang.String r8 = r8.mo105891f()
            r7.append(r8)
            r7.append(r2)
            r8 = 0
            java.lang.String r9 = r6.substring(r8, r4)
            r7.append(r9)
            r7.append(r5)
            r8 = 4
            java.lang.String r9 = r6.substring(r4, r8)
            r7.append(r9)
            java.lang.String r7 = r7.toString()
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            eb0.c r9 = eb0.C97625j3.m125812b()
            java.lang.String r9 = r9.mo105891f()
            r8.append(r9)
            r8.append(r2)
            r2 = 0
            java.lang.String r9 = r0.substring(r2, r4)
            r8.append(r9)
            r8.append(r5)
            r5 = 4
            java.lang.String r5 = r0.substring(r4, r5)
            r8.append(r5)
            java.lang.String r5 = r8.toString()
            java.lang.Object[] r8 = new java.lang.Object[r4]
            r8[r2] = r3
            r2 = 1
            r8[r2] = r0
            java.lang.String r2 = "[oneliang]old hash:%s,new hash:%s"
            r4 = r22
            com.tencent.p014mm.sdk.platformtools.Log.m105927v(r4, r2, r8)
            com.tencent.mm.vfs.m1 r2 = new com.tencent.mm.vfs.m1
            java.lang.String r8 = ".nomedia"
            r2.<init>((java.lang.String) r1, (java.lang.String) r8)
            com.tencent.mm.vfs.m1 r9 = new com.tencent.mm.vfs.m1
            r9.<init>((java.lang.String) r5, (java.lang.String) r8)
            boolean r10 = r2.mo119967g()
            if (r10 != 0) goto L_0x04fe
            com.tencent.mm.vfs.m1 r2 = new com.tencent.mm.vfs.m1
            r2.<init>((java.lang.String) r7, (java.lang.String) r8)
        L_0x04fe:
            boolean r8 = r2.mo119967g()
            if (r8 == 0) goto L_0x051a
            java.lang.String r8 = r9.mo119976n()
            java.lang.String r8 = com.tencent.p014mm.vfs.C86013q1.m106458s(r8)
            com.tencent.p014mm.vfs.C86013q1.m106461v(r8)
            java.lang.String r8 = r2.mo119971i()
            java.lang.String r10 = r9.mo119971i()
            com.tencent.p014mm.vfs.C86013q1.m106442c(r8, r10)
        L_0x051a:
            r8 = 3
            java.lang.Object[] r10 = new java.lang.Object[r8]
            boolean r8 = r2.mo119967g()
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)
            r11 = 0
            r10[r11] = r8
            java.lang.String r2 = r2.mo119971i()
            r8 = 1
            r10[r8] = r2
            java.lang.String r2 = r9.mo119971i()
            r8 = 2
            r10[r8] = r2
            java.lang.String r2 = "[oneliang]nomedia,exists:%s,old file:%s,new file:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105927v(r4, r2, r10)
            com.tencent.mm.vfs.m1 r2 = new com.tencent.mm.vfs.m1
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r3)
            r9 = r20
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            r2.<init>((java.lang.String) r1, (java.lang.String) r8)
            com.tencent.mm.vfs.m1 r8 = new com.tencent.mm.vfs.m1
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r0)
            r10.append(r9)
            java.lang.String r10 = r10.toString()
            r8.<init>((java.lang.String) r5, (java.lang.String) r10)
            boolean r10 = r2.mo119967g()
            if (r10 != 0) goto L_0x057f
            com.tencent.mm.vfs.m1 r2 = new com.tencent.mm.vfs.m1
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r6)
            r10.append(r9)
            java.lang.String r10 = r10.toString()
            r2.<init>((java.lang.String) r7, (java.lang.String) r10)
        L_0x057f:
            boolean r10 = r2.mo119967g()
            if (r10 == 0) goto L_0x059b
            java.lang.String r10 = r8.mo119976n()
            java.lang.String r10 = com.tencent.p014mm.vfs.C86013q1.m106458s(r10)
            com.tencent.p014mm.vfs.C86013q1.m106461v(r10)
            java.lang.String r10 = r2.mo119971i()
            java.lang.String r11 = r8.mo119971i()
            com.tencent.p014mm.vfs.C86013q1.m106442c(r10, r11)
        L_0x059b:
            r10 = 3
            java.lang.Object[] r11 = new java.lang.Object[r10]
            boolean r10 = r2.mo119967g()
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r10)
            r12 = 0
            r11[r12] = r10
            java.lang.String r2 = r2.mo119971i()
            r10 = 1
            r11[r10] = r2
            java.lang.String r2 = r8.mo119971i()
            r8 = 2
            r11[r8] = r2
            java.lang.String r2 = "[oneliang]jpg,exists:%s,old file:%s,new file:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105927v(r4, r2, r11)
            com.tencent.mm.vfs.m1 r2 = new com.tencent.mm.vfs.m1
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r3)
            java.lang.String r10 = ".png"
            r8.append(r10)
            java.lang.String r8 = r8.toString()
            r2.<init>((java.lang.String) r1, (java.lang.String) r8)
            com.tencent.mm.vfs.m1 r8 = new com.tencent.mm.vfs.m1
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r0)
            r11.append(r10)
            java.lang.String r11 = r11.toString()
            r8.<init>((java.lang.String) r5, (java.lang.String) r11)
            boolean r11 = r2.mo119967g()
            if (r11 != 0) goto L_0x0600
            com.tencent.mm.vfs.m1 r2 = new com.tencent.mm.vfs.m1
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r6)
            r11.append(r10)
            java.lang.String r10 = r11.toString()
            r2.<init>((java.lang.String) r7, (java.lang.String) r10)
        L_0x0600:
            boolean r10 = r2.mo119967g()
            if (r10 == 0) goto L_0x061c
            java.lang.String r10 = r8.mo119976n()
            java.lang.String r10 = com.tencent.p014mm.vfs.C86013q1.m106458s(r10)
            com.tencent.p014mm.vfs.C86013q1.m106461v(r10)
            java.lang.String r10 = r2.mo119971i()
            java.lang.String r11 = r8.mo119971i()
            com.tencent.p014mm.vfs.C86013q1.m106442c(r10, r11)
        L_0x061c:
            r10 = 3
            java.lang.Object[] r11 = new java.lang.Object[r10]
            boolean r10 = r2.mo119967g()
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r10)
            r12 = 0
            r11[r12] = r10
            java.lang.String r2 = r2.mo119971i()
            r10 = 1
            r11[r10] = r2
            java.lang.String r2 = r8.mo119971i()
            r8 = 2
            r11[r8] = r2
            java.lang.String r2 = "[oneliang]png,exists:%s,old file:%s,new file:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105927v(r4, r2, r11)
            com.tencent.mm.vfs.m1 r2 = new com.tencent.mm.vfs.m1
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r10 = "th_"
            r8.append(r10)
            r8.append(r3)
            java.lang.String r8 = r8.toString()
            r2.<init>((java.lang.String) r1, (java.lang.String) r8)
            com.tencent.mm.vfs.m1 r8 = new com.tencent.mm.vfs.m1
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r10)
            r11.append(r0)
            java.lang.String r11 = r11.toString()
            r8.<init>((java.lang.String) r5, (java.lang.String) r11)
            boolean r11 = r2.mo119967g()
            if (r11 != 0) goto L_0x0682
            com.tencent.mm.vfs.m1 r2 = new com.tencent.mm.vfs.m1
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r10)
            r11.append(r6)
            java.lang.String r11 = r11.toString()
            r2.<init>((java.lang.String) r7, (java.lang.String) r11)
        L_0x0682:
            boolean r11 = r2.mo119967g()
            if (r11 == 0) goto L_0x069e
            java.lang.String r11 = r8.mo119976n()
            java.lang.String r11 = com.tencent.p014mm.vfs.C86013q1.m106458s(r11)
            com.tencent.p014mm.vfs.C86013q1.m106461v(r11)
            java.lang.String r11 = r2.mo119971i()
            java.lang.String r12 = r8.mo119971i()
            com.tencent.p014mm.vfs.C86013q1.m106442c(r11, r12)
        L_0x069e:
            r11 = 3
            java.lang.Object[] r12 = new java.lang.Object[r11]
            boolean r11 = r2.mo119967g()
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r11)
            r14 = 0
            r12[r14] = r11
            java.lang.String r2 = r2.mo119971i()
            r11 = 1
            r12[r11] = r2
            java.lang.String r2 = r8.mo119971i()
            r8 = 2
            r12[r8] = r2
            java.lang.String r2 = "[oneliang]th_**,exists:%s,old file:%s,new file:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105927v(r4, r2, r12)
            com.tencent.mm.vfs.m1 r2 = new com.tencent.mm.vfs.m1
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r10)
            r8.append(r3)
            java.lang.String r3 = "hd"
            r8.append(r3)
            java.lang.String r8 = r8.toString()
            r2.<init>((java.lang.String) r1, (java.lang.String) r8)
            com.tencent.mm.vfs.m1 r1 = new com.tencent.mm.vfs.m1
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r10)
            r8.append(r0)
            r8.append(r3)
            java.lang.String r0 = r8.toString()
            r1.<init>((java.lang.String) r5, (java.lang.String) r0)
            boolean r0 = r2.mo119967g()
            if (r0 != 0) goto L_0x070c
            com.tencent.mm.vfs.m1 r2 = new com.tencent.mm.vfs.m1
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r10)
            r0.append(r6)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            r2.<init>((java.lang.String) r7, (java.lang.String) r0)
        L_0x070c:
            boolean r0 = r2.mo119967g()
            if (r0 == 0) goto L_0x0728
            java.lang.String r0 = r1.mo119976n()
            java.lang.String r0 = com.tencent.p014mm.vfs.C86013q1.m106458s(r0)
            com.tencent.p014mm.vfs.C86013q1.m106461v(r0)
            java.lang.String r0 = r2.mo119971i()
            java.lang.String r3 = r1.mo119971i()
            com.tencent.p014mm.vfs.C86013q1.m106442c(r0, r3)
        L_0x0728:
            r3 = 3
            java.lang.Object[] r0 = new java.lang.Object[r3]
            boolean r3 = r2.mo119967g()
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            r5 = 0
            r0[r5] = r3
            java.lang.String r2 = r2.mo119971i()
            r3 = 1
            r0[r3] = r2
            java.lang.String r1 = r1.mo119971i()
            r2 = 2
            r0[r2] = r1
            java.lang.String r1 = "[oneliang]th_**hd,exists:%s,old file:%s,new file:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105927v(r4, r1, r0)
        L_0x0749:
            r8 = r13
            r2 = 0
        L_0x074b:
            java.lang.Class<f62.k0> r0 = f62.C75700k0.class
            k40.a r0 = f40.C86709a0.m107533q(r0)
            f62.k0 r0 = (f62.C75700k0) r0
            g62.l r0 = r0.mo96095LE()
            com.tencent.mm.storage.g4 r0 = (com.tencent.p014mm.storage.C72972g4) r0
            long r0 = r0.my0(r8)
            r5 = 0
            int r3 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r3 > 0) goto L_0x0771
            if (r19 <= 0) goto L_0x076b
            int r7 = r19 + -1
            r5 = r23
            goto L_0x08e1
        L_0x076b:
            r5 = r23
            r1 = 1
            r7 = 0
            goto L_0x08e2
        L_0x0771:
            r3 = r16
            r5 = 43
            if (r3 != r5) goto L_0x08dd
            java.lang.Class<rz.s> r3 = p682rz.C101488s.class
            di3.d r3 = di3.C86312j.m106911c(r3)
            rz.s r3 = (p682rz.C101488s) r3
            rz.t r3 = r3.Kj0()
            r5 = r23
            sj.a r6 = r5.f297519e
            java.lang.String r7 = r5.f297515a
            int r1 = (int) r0
            r6.getClass()
            if (r2 != 0) goto L_0x0792
            r15 = 0
            goto L_0x08d7
        L_0x0792:
            S r0 = r2.f297525b
            hd0.n0 r0 = (hd0.C98408n0) r0
            long r10 = java.lang.System.currentTimeMillis()
            hd0.n0 r15 = new hd0.n0
            r15.<init>()
            java.lang.String r2 = r8.mo108765s2()
            r15.f288554a = r2
            long r12 = r8.mo108774y2()
            r15.f288556c = r12
            int r2 = r0.f288557d
            r15.f288557d = r2
            int r2 = r0.f288558e
            r15.f288558e = r2
            int r2 = r0.f288559f
            r15.f288559f = r2
            int r2 = r0.f288560g
            r15.f288560g = r2
            int r2 = r0.f288561h
            r15.f288561h = r2
            int r2 = r0.f288562i
            r15.f288562i = r2
            r15.f288563j = r10
            int r2 = r0.f288566m
            r15.f288566m = r2
            long r1 = (long) r1
            r15.f288567n = r1
            int r1 = r0.f288568o
            r15.f288568o = r1
            int r1 = r0.f288569p
            r15.f288569p = r1
            r15.f288570q = r7
            r15.f288571r = r7
            java.lang.String r1 = r0.mo137705i()
            r15.f288575v = r1
            int r1 = r0.f288576w
            r15.f288576w = r1
            long r1 = r0.f288577x
            r15.f288577x = r1
            int r1 = r0.f288537E
            r15.f288537E = r1
            java.lang.String r0 = r0.mo137700d()
            java.lang.String r1 = r8.mo108765s2()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            eb0.c r6 = eb0.C97625j3.m125812b()
            java.lang.String r6 = r6.mo105891f()
            r2.append(r6)
            java.lang.String r6 = "/video"
            r2.append(r6)
            java.lang.String r2 = r2.toString()
            com.tencent.mm.vfs.m1 r6 = new com.tencent.mm.vfs.m1
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r0)
            r7.append(r9)
            java.lang.String r7 = r7.toString()
            r6.<init>((java.lang.String) r2, (java.lang.String) r7)
            com.tencent.mm.vfs.m1 r7 = new com.tencent.mm.vfs.m1
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r1)
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            r7.<init>((java.lang.String) r2, (java.lang.String) r8)
            boolean r8 = r6.mo119967g()
            if (r8 == 0) goto L_0x084f
            java.lang.String r8 = r7.mo119976n()
            java.lang.String r8 = com.tencent.p014mm.vfs.C86013q1.m106458s(r8)
            com.tencent.p014mm.vfs.C86013q1.m106461v(r8)
            java.lang.String r8 = r6.mo119971i()
            java.lang.String r9 = r7.mo119971i()
            com.tencent.p014mm.vfs.C86013q1.m106442c(r8, r9)
        L_0x084f:
            r8 = 3
            java.lang.Object[] r9 = new java.lang.Object[r8]
            boolean r8 = r6.mo119967g()
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)
            r10 = 0
            r9[r10] = r8
            java.lang.String r6 = r6.mo119971i()
            r8 = 1
            r9[r8] = r6
            java.lang.String r6 = r7.mo119971i()
            r7 = 2
            r9[r7] = r6
            java.lang.String r6 = "[oneliang]video,jpg,exists:%s,old file:%s,new file:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105927v(r4, r6, r9)
            com.tencent.mm.vfs.m1 r6 = new com.tencent.mm.vfs.m1
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r0)
            java.lang.String r0 = ".mp4"
            r7.append(r0)
            java.lang.String r7 = r7.toString()
            r6.<init>((java.lang.String) r2, (java.lang.String) r7)
            com.tencent.mm.vfs.m1 r7 = new com.tencent.mm.vfs.m1
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r1)
            r8.append(r0)
            java.lang.String r0 = r8.toString()
            r7.<init>((java.lang.String) r2, (java.lang.String) r0)
            boolean r0 = r6.mo119967g()
            if (r0 == 0) goto L_0x08b6
            java.lang.String r0 = r7.mo119976n()
            java.lang.String r0 = com.tencent.p014mm.vfs.C86013q1.m106458s(r0)
            com.tencent.p014mm.vfs.C86013q1.m106461v(r0)
            java.lang.String r0 = r6.mo119971i()
            java.lang.String r1 = r7.mo119971i()
            com.tencent.p014mm.vfs.C86013q1.m106442c(r0, r1)
        L_0x08b6:
            r1 = 3
            java.lang.Object[] r0 = new java.lang.Object[r1]
            boolean r1 = r6.mo119967g()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r2 = 0
            r0[r2] = r1
            java.lang.String r1 = r6.mo119971i()
            r2 = 1
            r0[r2] = r1
            java.lang.String r1 = r7.mo119971i()
            r2 = 2
            r0[r2] = r1
            java.lang.String r1 = "[oneliang]video,mp4,exists:%s,old file:%s,new file:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105927v(r4, r1, r0)
        L_0x08d7:
            hd0.o0 r3 = (hd0.C98410o0) r3
            r3.mo137730s(r15)
            goto L_0x08df
        L_0x08dd:
            r5 = r23
        L_0x08df:
            r7 = r19
        L_0x08e1:
            r1 = 1
        L_0x08e2:
            int r7 = r7 + r1
            r3 = r4
            r1 = r5
            r5 = r17
            r2 = 1
            r4 = 0
            goto L_0x0016
        L_0x08eb:
            r4 = r3
            r17 = r5
            r2 = 2
            r5 = r1
            r1 = 1
            java.lang.Object[] r0 = new java.lang.Object[r2]
            java.lang.String r2 = r5.f297515a
            r3 = 0
            r0[r3] = r2
            long r2 = java.lang.System.currentTimeMillis()
            long r2 = r2 - r17
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r0[r1] = r2
            java.lang.String r1 = "[oneliang] batch insert test msg info, end single transaction, username:%s, cost:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p1087sj.C101637b.mo141095a():void");
    }
}
