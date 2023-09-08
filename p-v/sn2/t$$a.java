package sn2;

public final /* synthetic */ class t$$a implements C22375l {

    /* renamed from: a */
    public final /* synthetic */ C22378t f129641a;

    public /* synthetic */ t$$a(C22378t tVar) {
        this.f129641a = tVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:140:0x06b8, code lost:
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x06c5, code lost:
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x06c6, code lost:
        if (r0 == false) goto L_0x06f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x06c8, code lost:
        r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE;
        r0.mo160131h(10987, 1, "", 1, java.lang.Integer.valueOf((int) (java.lang.System.currentTimeMillis() - r2.f63454g)));
        r0.mo175913w(835, 0, 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x06f6, code lost:
        r2 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE;
        r2.mo160131h(10987, 1, "", 5, java.lang.Long.valueOf(r7));
        r2.mo175913w(835, 4, 1);
     */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x055a  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x05a7  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x05f9  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x0606  */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x0660  */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x06ba  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00e7  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0184  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x01a7  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x020e  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0242  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x024f  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x02af  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x02df  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x02ec  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0339  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x038e  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x039b  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x03f6  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x044f  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x045c  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo35517a(te3.C49335eu3 r27, long r28, boolean r30) {
        /*
            r26 = this;
            r1 = r26
            sn2.t r2 = r1.f129641a
            r2.getClass()
            r3 = 1
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            java.lang.Object[] r0 = new java.lang.Object[r3]
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r30)
            r6 = 0
            r0[r6] = r5
            java.lang.String r5 = "Micromsg.ShakeTVService"
            java.lang.String r7 = "hy: shake tv call back. isNetworkFail; %b"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r7, r0)
            long r7 = r2.f63454g
            int r0 = (r28 > r7 ? 1 : (r28 == r7 ? 0 : -1))
            if (r0 <= 0) goto L_0x0029
            long r7 = java.lang.System.currentTimeMillis()
            long r7 = r7 - r28
            goto L_0x0030
        L_0x0029:
            long r7 = java.lang.System.currentTimeMillis()
            long r9 = r2.f63454g
            long r7 = r7 - r9
        L_0x0030:
            java.lang.String r9 = ""
            r13 = 2
            if (r27 == 0) goto L_0x071e
            r0 = r27
            te3.v34 r0 = (te3.C51641v34) r0
            java.lang.String r10 = r0.f143288f
            boolean r10 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r10)
            if (r10 != 0) goto L_0x071e
            java.lang.Object[] r10 = new java.lang.Object[r13]
            int r11 = r0.f143287e
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r10[r6] = r11
            java.lang.String r11 = r0.f143288f
            r10[r3] = r11
            java.lang.String r11 = "resCallback Type:%d, xml:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r5, r11, r10)
            java.lang.String r10 = r0.f143288f
            r11 = 0
            if (r10 == 0) goto L_0x007f
            java.lang.String r10 = r10.trim()
            r0.f143288f = r10
            java.lang.String r13 = "<tvinfo>"
            int r10 = r10.indexOf(r13)
            if (r10 <= 0) goto L_0x0075
            java.lang.String r13 = r0.f143288f
            java.lang.String r13 = r13.substring(r6, r10)
            java.lang.String r12 = r0.f143288f
            java.lang.String r10 = r12.substring(r10)
            goto L_0x0081
        L_0x0075:
            if (r10 != 0) goto L_0x007b
            java.lang.String r10 = r0.f143288f
            r13 = r11
            goto L_0x0081
        L_0x007b:
            java.lang.String r13 = r0.f143288f
            r10 = r11
            goto L_0x0081
        L_0x007f:
            r10 = r11
            r13 = r10
        L_0x0081:
            boolean r12 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r10)
            if (r12 == 0) goto L_0x0088
            goto L_0x00e2
        L_0x0088:
            java.lang.String r12 = "tvinfo"
            java.util.Map r10 = com.tencent.p014mm.sdk.platformtools.XmlParser.parseXml(r10, r12, r11)
            if (r10 == 0) goto L_0x00e2
            java.lang.String r12 = ".tvinfo.username"
            java.lang.Object r12 = r10.get(r12)
            java.lang.String r12 = (java.lang.String) r12
            boolean r16 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r12)
            if (r16 == 0) goto L_0x00a0
            goto L_0x00e2
        L_0x00a0:
            sn2.a0 r14 = new sn2.a0
            r14.<init>()
            r14.field_username = r12
            java.lang.String r12 = ".tvinfo.iconurl"
            java.lang.Object r12 = r10.get(r12)
            java.lang.String r12 = (java.lang.String) r12
            java.lang.String r12 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r12)
            r14.field_iconurl = r12
            java.lang.String r12 = ".tvinfo.title"
            java.lang.Object r12 = r10.get(r12)
            java.lang.String r12 = (java.lang.String) r12
            java.lang.String r12 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r12)
            r14.field_title = r12
            java.lang.String r12 = ".tvinfo.deeplinkjumpurl"
            java.lang.Object r12 = r10.get(r12)
            java.lang.String r12 = (java.lang.String) r12
            java.lang.String r12 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r12)
            r14.field_deeplink = r12
            java.lang.String r12 = ".tvinfo.createtime"
            java.lang.Object r10 = r10.get(r12)
            java.lang.String r10 = (java.lang.String) r10
            r11 = 0
            long r10 = com.tencent.p014mm.sdk.platformtools.Util.getLong(r10, r11)
            r14.field_createtime = r10
            goto L_0x00e3
        L_0x00e2:
            r14 = 0
        L_0x00e3:
            if (r14 != 0) goto L_0x00e7
            goto L_0x0177
        L_0x00e7:
            sn2.b0 r10 = nn2.C76942m.Bx0()
            java.lang.String r11 = r14.field_username
            com.tencent.mm.sdk.storage.ISQLiteDatabase r10 = r10.f97613d
            java.lang.String[] r12 = new java.lang.String[r3]
            r12[r6] = r11
            r19 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 2
            java.lang.String r18 = "shaketvhistory"
            java.lang.String r20 = "username=?"
            r17 = r10
            r21 = r12
            android.database.Cursor r10 = r17.query(r18, r19, r20, r21, r22, r23, r24, r25)
            boolean r12 = r10.moveToFirst()
            java.lang.String r15 = "MicroMsg.ShakeTvHistoryStorage"
            if (r12 != 0) goto L_0x012c
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r6 = "get null with username:"
            r12.append(r6)
            r12.append(r11)
            java.lang.String r6 = r12.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r15, r6)
            r10.close()
            r6 = 0
            goto L_0x0137
        L_0x012c:
            sn2.a0 r6 = new sn2.a0
            r6.<init>()
            r6.convertFrom(r10)
            r10.close()
        L_0x0137:
            if (r6 == 0) goto L_0x016a
            java.lang.String r6 = "processShakeTvHistory upate"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r6)
            sn2.b0 r6 = nn2.C76942m.Bx0()
            java.lang.String r10 = r14.field_username
            r6.getClass()
            boolean r11 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r10)
            if (r11 == 0) goto L_0x0155
            java.lang.String r6 = "update fail username null"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r15, r6)
            goto L_0x0177
        L_0x0155:
            com.tencent.mm.sdk.storage.ISQLiteDatabase r6 = r6.f97613d
            android.content.ContentValues r11 = r14.convertTo()
            java.lang.String[] r12 = new java.lang.String[r3]
            r14 = 0
            r12[r14] = r10
            java.lang.String r10 = "shaketvhistory"
            java.lang.String r14 = "username=?"
            r6.update(r10, r11, r14, r12)
            goto L_0x0177
        L_0x016a:
            java.lang.String r6 = "processShakeTvHistory new insert"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r6)
            sn2.b0 r6 = nn2.C76942m.Bx0()
            r6.insert(r14)
        L_0x0177:
            int r6 = r0.f143287e
            java.lang.String r10 = ", thumbUrl="
            java.lang.String r11 = ", title="
            java.lang.String r12 = "MicroMsg.ShakeTVXmlParser"
            r14 = 1
            switch(r6) {
                case 0: goto L_0x0606;
                case 1: goto L_0x055a;
                case 2: goto L_0x045c;
                case 3: goto L_0x039b;
                case 4: goto L_0x02ec;
                case 5: goto L_0x024f;
                case 6: goto L_0x01a7;
                default: goto L_0x0184;
            }
        L_0x0184:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r10 = "parse unknown type:"
            r6.append(r10)
            int r0 = r0.f143287e
            r6.append(r0)
            java.lang.String r0 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r5, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r5 = 4
            r2.mo35518f(r0, r5)
            goto L_0x06c5
        L_0x01a7:
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.lang.String r0 = "program"
            r10 = 0
            java.util.Map r0 = com.tencent.p014mm.sdk.platformtools.XmlParser.parseXml(r13, r0, r10)
            if (r0 == 0) goto L_0x020b
            sn2.u r10 = new sn2.u     // Catch:{ Exception -> 0x0204 }
            r10.<init>()     // Catch:{ Exception -> 0x0204 }
            java.lang.String r11 = ".program.title"
            java.lang.Object r11 = r0.get(r11)     // Catch:{ Exception -> 0x0204 }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ Exception -> 0x0204 }
            java.lang.String r11 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r11)     // Catch:{ Exception -> 0x0204 }
            r10.f129642a = r11     // Catch:{ Exception -> 0x0204 }
            java.lang.String r11 = ".program.thumburl"
            java.lang.Object r11 = r0.get(r11)     // Catch:{ Exception -> 0x0204 }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ Exception -> 0x0204 }
            java.lang.String r11 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r11)     // Catch:{ Exception -> 0x0204 }
            r10.f129643b = r11     // Catch:{ Exception -> 0x0204 }
            java.lang.String r11 = ".program.username"
            java.lang.Object r11 = r0.get(r11)     // Catch:{ Exception -> 0x0204 }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ Exception -> 0x0204 }
            java.lang.String r11 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r11)     // Catch:{ Exception -> 0x0204 }
            r10.f129644c = r11     // Catch:{ Exception -> 0x0204 }
            java.lang.String r11 = ".program.path"
            java.lang.Object r11 = r0.get(r11)     // Catch:{ Exception -> 0x0204 }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ Exception -> 0x0204 }
            java.lang.String r11 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r11)     // Catch:{ Exception -> 0x0204 }
            r10.f129645d = r11     // Catch:{ Exception -> 0x0204 }
            java.lang.String r11 = ".program.version"
            java.lang.Object r0 = r0.get(r11)     // Catch:{ Exception -> 0x0204 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x0204 }
            r11 = 0
            int r0 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r0, (int) r11)     // Catch:{ Exception -> 0x0204 }
            r10.f129646e = r0     // Catch:{ Exception -> 0x0204 }
            r11 = r10
            goto L_0x020c
        L_0x0204:
            r0 = move-exception
            r10 = 0
            java.lang.Object[] r11 = new java.lang.Object[r10]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r12, r0, r9, r11)
        L_0x020b:
            r11 = 0
        L_0x020c:
            if (r11 == 0) goto L_0x0242
            nn2.f r0 = new nn2.f
            r0.<init>()
            java.lang.String r5 = r11.f129644c
            r0.field_username = r5
            java.lang.String r5 = r11.f129642a
            r0.field_nickname = r5
            java.lang.String r5 = r11.f129645d
            r0.field_reserved3 = r5
            java.lang.String r5 = r11.f129643b
            r0.field_sns_bgurl = r5
            int r5 = r11.f129646e
            r0.field_reserved2 = r5
            r5 = 13
            r0.field_type = r5
            r0.field_insertBatch = r3
            byte[] r5 = r13.getBytes()
            r0.field_lvbuffer = r5
            nn2.g r5 = nn2.C76942m.zx0()
            r5.mo72324Yt(r0, r3)
            r6.add(r0)
            r2.mo35518f(r6, r14)
            goto L_0x06b8
        L_0x0242:
            java.lang.String r0 = "parse appBrand fail"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r5, r0)
            r10 = 4
            r2.mo35518f(r6, r10)
            goto L_0x06c5
        L_0x024f:
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.lang.String r0 = "tempsession"
            r10 = 0
            java.util.Map r0 = com.tencent.p014mm.sdk.platformtools.XmlParser.parseXml(r13, r0, r10)
            if (r0 == 0) goto L_0x02a4
            sn2.x r10 = new sn2.x     // Catch:{ Exception -> 0x029d }
            r10.<init>()     // Catch:{ Exception -> 0x029d }
            java.lang.String r11 = ".tempsession.title"
            java.lang.Object r11 = r0.get(r11)     // Catch:{ Exception -> 0x029d }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ Exception -> 0x029d }
            java.lang.String r11 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r11)     // Catch:{ Exception -> 0x029d }
            r10.f129654a = r11     // Catch:{ Exception -> 0x029d }
            java.lang.String r11 = ".tempsession.thumburl"
            java.lang.Object r11 = r0.get(r11)     // Catch:{ Exception -> 0x029d }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ Exception -> 0x029d }
            java.lang.String r11 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r11)     // Catch:{ Exception -> 0x029d }
            r10.f129655b = r11     // Catch:{ Exception -> 0x029d }
            java.lang.String r11 = ".tempsession.username"
            java.lang.Object r11 = r0.get(r11)     // Catch:{ Exception -> 0x029d }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ Exception -> 0x029d }
            java.lang.String r11 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r11)     // Catch:{ Exception -> 0x029d }
            r10.f129656c = r11     // Catch:{ Exception -> 0x029d }
            java.lang.String r11 = ".tempsession.deeplinkjumpurl"
            java.lang.Object r0 = r0.get(r11)     // Catch:{ Exception -> 0x029d }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x029d }
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r0)     // Catch:{ Exception -> 0x029d }
            r10.f129657d = r0     // Catch:{ Exception -> 0x029d }
            r11 = r10
            goto L_0x02a5
        L_0x029d:
            r0 = move-exception
            r10 = 0
            java.lang.Object[] r11 = new java.lang.Object[r10]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r12, r0, r9, r11)
        L_0x02a4:
            r11 = 0
        L_0x02a5:
            if (r11 == 0) goto L_0x02df
            java.lang.String r0 = r11.f129657d
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 != 0) goto L_0x02df
            nn2.f r0 = new nn2.f
            r0.<init>()
            java.lang.String r5 = r11.f129657d
            r0.field_username = r5
            java.lang.String r5 = r11.f129654a
            r0.field_nickname = r5
            java.lang.String r5 = r11.f129656c
            r0.field_distance = r5
            java.lang.String r5 = r11.f129655b
            r0.field_sns_bgurl = r5
            r5 = 12
            r0.field_type = r5
            r0.field_insertBatch = r3
            byte[] r5 = r13.getBytes()
            r0.field_lvbuffer = r5
            nn2.g r5 = nn2.C76942m.zx0()
            r5.mo72324Yt(r0, r3)
            r6.add(r0)
            r2.mo35518f(r6, r14)
            goto L_0x06b8
        L_0x02df:
            java.lang.String r0 = "parse TempSession fail"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r5, r0)
            r10 = 4
            r2.mo35518f(r6, r10)
            goto L_0x06c5
        L_0x02ec:
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.lang.String r0 = "product"
            r14 = 0
            java.util.Map r0 = com.tencent.p014mm.sdk.platformtools.XmlParser.parseXml(r13, r0, r14)
            if (r0 == 0) goto L_0x0332
            sn2.w r14 = new sn2.w     // Catch:{ Exception -> 0x032b }
            r14.<init>()     // Catch:{ Exception -> 0x032b }
            java.lang.String r15 = ".product.title"
            java.lang.Object r15 = r0.get(r15)     // Catch:{ Exception -> 0x032b }
            java.lang.String r15 = (java.lang.String) r15     // Catch:{ Exception -> 0x032b }
            java.lang.String r15 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r15)     // Catch:{ Exception -> 0x032b }
            r14.f129651a = r15     // Catch:{ Exception -> 0x032b }
            java.lang.String r15 = ".product.thumburl"
            java.lang.Object r15 = r0.get(r15)     // Catch:{ Exception -> 0x032b }
            java.lang.String r15 = (java.lang.String) r15     // Catch:{ Exception -> 0x032b }
            java.lang.String r15 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r15)     // Catch:{ Exception -> 0x032b }
            r14.f129652b = r15     // Catch:{ Exception -> 0x032b }
            java.lang.String r15 = ".product.product_id"
            java.lang.Object r0 = r0.get(r15)     // Catch:{ Exception -> 0x032b }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x032b }
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r0)     // Catch:{ Exception -> 0x032b }
            r14.f129653c = r0     // Catch:{ Exception -> 0x032b }
            goto L_0x0333
        L_0x032b:
            r0 = move-exception
            r14 = 0
            java.lang.Object[] r15 = new java.lang.Object[r14]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r12, r0, r9, r15)
        L_0x0332:
            r14 = 0
        L_0x0333:
            if (r14 == 0) goto L_0x038e
            java.lang.String r0 = r14.f129653c
            if (r0 == 0) goto L_0x038e
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r12 = "parese pruduct: product_id="
            r0.append(r12)
            java.lang.String r12 = r14.f129653c
            r0.append(r12)
            r0.append(r11)
            java.lang.String r11 = r14.f129651a
            r0.append(r11)
            r0.append(r10)
            java.lang.String r10 = r14.f129652b
            r0.append(r10)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r5, r0)
            nn2.f r0 = new nn2.f
            r0.<init>()
            java.lang.String r5 = r14.f129653c
            r0.field_username = r5
            java.lang.String r5 = r14.f129651a
            r0.field_nickname = r5
            java.lang.String r5 = r14.f129652b
            r0.field_sns_bgurl = r5
            r5 = 10
            r0.field_type = r5
            r0.field_insertBatch = r3
            byte[] r5 = r13.getBytes()
            r0.field_lvbuffer = r5
            nn2.g r5 = nn2.C76942m.zx0()
            r5.mo72324Yt(r0, r3)
            r6.add(r0)
            r10 = 1
            r2.mo35518f(r6, r10)
            goto L_0x06b8
        L_0x038e:
            java.lang.String r0 = "parse product fail"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r5, r0)
            r10 = 4
            r2.mo35518f(r6, r10)
            goto L_0x06c5
        L_0x039b:
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.lang.String r0 = "nativepay"
            r14 = 0
            java.util.Map r0 = com.tencent.p014mm.sdk.platformtools.XmlParser.parseXml(r13, r0, r14)
            if (r0 == 0) goto L_0x03ef
            sn2.v r14 = new sn2.v     // Catch:{ Exception -> 0x03e8 }
            r14.<init>()     // Catch:{ Exception -> 0x03e8 }
            java.lang.String r15 = ".nativepay.title"
            java.lang.Object r15 = r0.get(r15)     // Catch:{ Exception -> 0x03e8 }
            java.lang.String r15 = (java.lang.String) r15     // Catch:{ Exception -> 0x03e8 }
            java.lang.String r15 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r15)     // Catch:{ Exception -> 0x03e8 }
            r14.f129647a = r15     // Catch:{ Exception -> 0x03e8 }
            java.lang.String r15 = ".nativepay.thumburl"
            java.lang.Object r15 = r0.get(r15)     // Catch:{ Exception -> 0x03e8 }
            java.lang.String r15 = (java.lang.String) r15     // Catch:{ Exception -> 0x03e8 }
            java.lang.String r15 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r15)     // Catch:{ Exception -> 0x03e8 }
            r14.f129648b = r15     // Catch:{ Exception -> 0x03e8 }
            java.lang.String r15 = ".nativepay.wx_pay_url"
            java.lang.Object r15 = r0.get(r15)     // Catch:{ Exception -> 0x03e8 }
            java.lang.String r15 = (java.lang.String) r15     // Catch:{ Exception -> 0x03e8 }
            java.lang.String r15 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r15)     // Catch:{ Exception -> 0x03e8 }
            r14.f129649c = r15     // Catch:{ Exception -> 0x03e8 }
            java.lang.String r15 = ".nativepay.price"
            java.lang.Object r0 = r0.get(r15)     // Catch:{ Exception -> 0x03e8 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x03e8 }
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r0)     // Catch:{ Exception -> 0x03e8 }
            r14.f129650d = r0     // Catch:{ Exception -> 0x03e8 }
            goto L_0x03f0
        L_0x03e8:
            r0 = move-exception
            r14 = 0
            java.lang.Object[] r15 = new java.lang.Object[r14]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r12, r0, r9, r15)
        L_0x03ef:
            r14 = 0
        L_0x03f0:
            if (r14 == 0) goto L_0x044f
            java.lang.String r0 = r14.f129649c
            if (r0 == 0) goto L_0x044f
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r12 = "parese pay: wx_pay_url="
            r0.append(r12)
            java.lang.String r12 = r14.f129649c
            r0.append(r12)
            r0.append(r11)
            java.lang.String r11 = r14.f129647a
            r0.append(r11)
            r0.append(r10)
            java.lang.String r10 = r14.f129648b
            r0.append(r10)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r5, r0)
            nn2.f r0 = new nn2.f
            r0.<init>()
            java.lang.String r5 = r14.f129649c
            r0.field_username = r5
            java.lang.String r5 = r14.f129647a
            r0.field_nickname = r5
            java.lang.String r5 = r14.f129648b
            r0.field_sns_bgurl = r5
            java.lang.String r5 = r14.f129650d
            r0.field_distance = r5
            r5 = 9
            r0.field_type = r5
            r0.field_insertBatch = r3
            byte[] r5 = r13.getBytes()
            r0.field_lvbuffer = r5
            nn2.g r5 = nn2.C76942m.zx0()
            r5.mo72324Yt(r0, r3)
            r6.add(r0)
            r10 = 1
            r2.mo35518f(r6, r10)
            goto L_0x06b8
        L_0x044f:
            java.lang.String r0 = "parse pay fail"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r5, r0)
            r10 = 4
            r2.mo35518f(r6, r10)
            goto L_0x06c5
        L_0x045c:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            if (r13 == 0) goto L_0x053f
            java.lang.String r6 = "<tv"
            boolean r6 = r13.startsWith(r6)
            if (r6 != 0) goto L_0x046d
            goto L_0x053f
        L_0x046d:
            un2.c$a r6 = un2.C102057c.m134444b(r13)
            if (r6 != 0) goto L_0x0483
            java.lang.String r6 = "shakeTV resCallback xml error"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r6)
            r5 = 0
            sn2.C22378t.f63451i = r5
            r5 = 4
            r2.mo35518f(r0, r5)
            goto L_0x06c5
        L_0x0483:
            nn2.f r10 = new nn2.f
            r10.<init>()
            java.lang.String r11 = r6.field_subtitle
            java.lang.String r11 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r11)
            r10.field_username = r11
            java.lang.String r11 = r6.field_topic
            java.lang.String r11 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r11)
            r10.field_nickname = r11
            java.lang.String r11 = r6.field_title
            java.lang.String r11 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r11)
            r10.field_distance = r11
            java.lang.String r6 = r6.field_thumburl
            if (r6 == 0) goto L_0x04a6
            r10.field_sns_bgurl = r6
        L_0x04a6:
            r6 = 8
            r10.field_type = r6
            r10.field_insertBatch = r3
            byte[] r11 = r13.getBytes()
            r10.field_lvbuffer = r11
            long r11 = com.tencent.p014mm.sdk.platformtools.Util.nowSecond()
            int r12 = (int) r11
            r10.field_reserved2 = r12
            r0.add(r10)
            nn2.g r11 = nn2.C76942m.zx0()
            r11.getClass()
            nn2.f r12 = new nn2.f
            r12.<init>()
            r13 = 0
            java.lang.String[] r14 = new java.lang.String[r13]
            java.lang.String r13 = "select shakeitem1.shakeItemID,shakeitem1.username,shakeitem1.nickname,shakeitem1.province,shakeitem1.city,shakeitem1.signature,shakeitem1.distance,shakeitem1.sex,shakeitem1.imgstatus,shakeitem1.hasHDImg,shakeitem1.insertBatch,shakeitem1.reserved1,shakeitem1.reserved2,shakeitem1.reserved3,shakeitem1.reserved4,shakeitem1.type,shakeitem1.lvbuffer,shakeitem1.regionCode,shakeitem1.snsFlag,shakeitem1.sns_bgurl from shakeitem1   order by shakeItemID desc limit 1"
            android.database.Cursor r11 = r11.rawQuery(r13, r14)
            int r13 = r11.getCount()
            if (r13 == 0) goto L_0x04de
            r11.moveToFirst()
            r12.convertFrom(r11)
        L_0x04de:
            r11.close()
            int r11 = r12.field_type
            if (r11 != r6) goto L_0x052b
            java.lang.String r6 = r10.field_distance
            java.lang.String r11 = r12.field_distance
            boolean r6 = r6.equals(r11)
            if (r6 == 0) goto L_0x052b
            java.lang.String r6 = r10.field_nickname
            java.lang.String r11 = r12.field_nickname
            boolean r6 = r6.equals(r11)
            if (r6 == 0) goto L_0x052b
            int r6 = r10.field_reserved2
            int r11 = r12.field_reserved2
            int r6 = r6 - r11
            r11 = 1800(0x708, float:2.522E-42)
            if (r6 >= r11) goto L_0x052b
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r11 = "Del the old tv item history, curTime="
            r6.append(r11)
            int r11 = r10.field_reserved2
            r6.append(r11)
            java.lang.String r11 = ", oldOneCreatedTime="
            r6.append(r11)
            int r11 = r12.field_reserved2
            r6.append(r11)
            java.lang.String r6 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r5, r6)
            nn2.g r6 = nn2.C76942m.zx0()
            int r11 = r12.field_shakeItemID
            r6.mo72322Lo(r11)
        L_0x052b:
            nn2.g r6 = nn2.C76942m.zx0()
            r6.mo72324Yt(r10, r3)
            r10 = 1
            r2.mo35518f(r0, r10)
            java.lang.String r0 = "process get tv OK"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r5, r0)
            goto L_0x06b8
        L_0x053f:
            java.lang.Object[] r6 = new java.lang.Object[r3]
            if (r13 != 0) goto L_0x0545
            r10 = 1
            goto L_0x0546
        L_0x0545:
            r10 = 0
        L_0x0546:
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r10)
            r11 = 0
            r6[r11] = r10
            java.lang.String r10 = "wrong args, xml == null ? [%s]"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r5, r10, r6)
            r5 = 2
            r2.mo35518f(r0, r5)
            goto L_0x06c5
        L_0x055a:
            java.lang.String r0 = "bizprofile"
            r6 = 0
            java.util.Map r0 = com.tencent.p014mm.sdk.platformtools.XmlParser.parseXml(r13, r0, r6)
            if (r0 == 0) goto L_0x059b
            sn2.z r6 = new sn2.z     // Catch:{ Exception -> 0x0594 }
            r6.<init>()     // Catch:{ Exception -> 0x0594 }
            java.lang.String r10 = ".bizprofile.nickname"
            java.lang.Object r10 = r0.get(r10)     // Catch:{ Exception -> 0x0594 }
            java.lang.String r10 = (java.lang.String) r10     // Catch:{ Exception -> 0x0594 }
            java.lang.String r10 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r10)     // Catch:{ Exception -> 0x0594 }
            r6.f129662a = r10     // Catch:{ Exception -> 0x0594 }
            java.lang.String r10 = ".bizprofile.username"
            java.lang.Object r10 = r0.get(r10)     // Catch:{ Exception -> 0x0594 }
            java.lang.String r10 = (java.lang.String) r10     // Catch:{ Exception -> 0x0594 }
            java.lang.String r10 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r10)     // Catch:{ Exception -> 0x0594 }
            r6.f129663b = r10     // Catch:{ Exception -> 0x0594 }
            java.lang.String r10 = ".bizprofile.showchat"
            java.lang.Object r0 = r0.get(r10)     // Catch:{ Exception -> 0x0594 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x0594 }
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r0)     // Catch:{ Exception -> 0x0594 }
            r6.f129664c = r0     // Catch:{ Exception -> 0x0594 }
            r11 = r6
            goto L_0x059c
        L_0x0594:
            r0 = move-exception
            r6 = 0
            java.lang.Object[] r10 = new java.lang.Object[r6]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r12, r0, r9, r10)
        L_0x059b:
            r11 = 0
        L_0x059c:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            if (r11 == 0) goto L_0x05f9
            java.lang.String r6 = r11.f129663b
            if (r6 == 0) goto L_0x05f9
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r10 = "parse user: username="
            r6.append(r10)
            java.lang.String r10 = r11.f129663b
            r6.append(r10)
            java.lang.String r10 = ", nickname="
            r6.append(r10)
            java.lang.String r10 = r11.f129662a
            r6.append(r10)
            java.lang.String r10 = ", showchat="
            r6.append(r10)
            java.lang.String r10 = r11.f129664c
            r6.append(r10)
            java.lang.String r6 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r5, r6)
            nn2.f r5 = new nn2.f
            r5.<init>()
            java.lang.String r6 = r11.f129663b
            r5.field_username = r6
            java.lang.String r6 = r11.f129662a
            r5.field_nickname = r6
            r6 = 6
            r5.field_type = r6
            r5.field_insertBatch = r3
            java.lang.String r6 = r11.f129664c
            r5.field_distance = r6
            nn2.g r6 = nn2.C76942m.zx0()
            r6.mo72324Yt(r5, r3)
            r0.add(r5)
            r5 = 1
            r2.mo35518f(r0, r5)
            goto L_0x06b8
        L_0x05f9:
            java.lang.String r6 = "parse user fail"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r5, r6)
            r5 = 4
            r2.mo35518f(r0, r5)
            goto L_0x06c5
        L_0x0606:
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.lang.String r0 = "h5url"
            r10 = 0
            java.util.Map r0 = com.tencent.p014mm.sdk.platformtools.XmlParser.parseXml(r13, r0, r10)
            if (r0 == 0) goto L_0x0659
            sn2.y r14 = new sn2.y     // Catch:{ Exception -> 0x0652 }
            r14.<init>()     // Catch:{ Exception -> 0x0652 }
            java.lang.String r15 = ".h5url.title"
            java.lang.Object r15 = r0.get(r15)     // Catch:{ Exception -> 0x0652 }
            java.lang.String r15 = (java.lang.String) r15     // Catch:{ Exception -> 0x0652 }
            java.lang.String r15 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r15)     // Catch:{ Exception -> 0x0652 }
            r14.f129658a = r15     // Catch:{ Exception -> 0x0652 }
            java.lang.String r15 = ".h5url.thumburl"
            java.lang.Object r15 = r0.get(r15)     // Catch:{ Exception -> 0x0652 }
            java.lang.String r15 = (java.lang.String) r15     // Catch:{ Exception -> 0x0652 }
            java.lang.String r15 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r15)     // Catch:{ Exception -> 0x0652 }
            r14.f129659b = r15     // Catch:{ Exception -> 0x0652 }
            java.lang.String r15 = ".h5url.link"
            java.lang.Object r15 = r0.get(r15)     // Catch:{ Exception -> 0x0652 }
            java.lang.String r15 = (java.lang.String) r15     // Catch:{ Exception -> 0x0652 }
            java.lang.String r15 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r15)     // Catch:{ Exception -> 0x0652 }
            r14.f129660c = r15     // Catch:{ Exception -> 0x0652 }
            java.lang.String r15 = ".h5url.username"
            java.lang.Object r0 = r0.get(r15)     // Catch:{ Exception -> 0x0652 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x0652 }
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r0)     // Catch:{ Exception -> 0x0652 }
            r14.f129661d = r0     // Catch:{ Exception -> 0x0652 }
            goto L_0x065a
        L_0x0652:
            r0 = move-exception
            r14 = 0
            java.lang.Object[] r15 = new java.lang.Object[r14]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r12, r0, r9, r15)
        L_0x0659:
            r14 = r10
        L_0x065a:
            if (r14 == 0) goto L_0x06ba
            java.lang.String r0 = r14.f129660c
            if (r0 == 0) goto L_0x06ba
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r10 = "parse url: link="
            r0.append(r10)
            java.lang.String r10 = r14.f129660c
            r0.append(r10)
            r0.append(r11)
            java.lang.String r10 = r14.f129658a
            r0.append(r10)
            java.lang.String r10 = ", thumburl="
            r0.append(r10)
            java.lang.String r10 = r14.f129659b
            r0.append(r10)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r5, r0)
            nn2.f r0 = new nn2.f
            r0.<init>()
            java.lang.String r5 = r14.f129660c
            r0.field_username = r5
            java.lang.String r5 = r14.f129658a
            r0.field_nickname = r5
            java.lang.String r5 = r14.f129661d
            r0.field_distance = r5
            java.lang.String r5 = r14.f129659b
            r0.field_sns_bgurl = r5
            r5 = 7
            r0.field_type = r5
            r0.field_insertBatch = r3
            byte[] r5 = r13.getBytes()
            r0.field_lvbuffer = r5
            nn2.g r5 = nn2.C76942m.zx0()
            r5.mo72324Yt(r0, r3)
            r6.add(r0)
            r10 = 1
            r2.mo35518f(r6, r10)
        L_0x06b8:
            r0 = 1
            goto L_0x06c6
        L_0x06ba:
            java.lang.String r0 = "parse url fail"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r5, r0)
            r10 = 4
            r2.mo35518f(r6, r10)
        L_0x06c5:
            r0 = 0
        L_0x06c6:
            if (r0 == 0) goto L_0x06f6
            com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r5 = 4
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r6 = 0
            r5[r6] = r4
            r5[r3] = r9
            r3 = 2
            r5[r3] = r4
            long r3 = java.lang.System.currentTimeMillis()
            long r6 = r2.f63454g
            long r3 = r3 - r6
            int r2 = (int) r3
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3 = 3
            r5[r3] = r2
            r2 = 10987(0x2aeb, float:1.5396E-41)
            r0.mo160131h(r2, r5)
            r19 = 835(0x343, double:4.125E-321)
            r21 = 0
            r23 = 1
            r18 = r0
            r18.mo175913w(r19, r21, r23)
            goto L_0x0787
        L_0x06f6:
            com.tencent.mm.plugin.report.service.n r2 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r5 = 4
            java.lang.Object[] r0 = new java.lang.Object[r5]
            r5 = 0
            r0[r5] = r4
            r0[r3] = r9
            r3 = 5
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r4 = 2
            r0[r4] = r3
            java.lang.Long r3 = java.lang.Long.valueOf(r7)
            r4 = 3
            r0[r4] = r3
            r3 = 10987(0x2aeb, float:1.5396E-41)
            r2.mo160131h(r3, r0)
            r3 = 835(0x343, double:4.125E-321)
            r5 = 4
            r7 = 1
            r2.mo175913w(r3, r5, r7)
            goto L_0x0787
        L_0x071e:
            if (r30 == 0) goto L_0x0754
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r5 = 4
            r2.mo35518f(r0, r5)
            com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r2 = 4
            java.lang.Object[] r5 = new java.lang.Object[r2]
            r6 = 0
            r5[r6] = r4
            r5[r3] = r9
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3 = 2
            r5[r3] = r2
            int r2 = (int) r7
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3 = 3
            r5[r3] = r2
            r2 = 10987(0x2aeb, float:1.5396E-41)
            r0.mo160131h(r2, r5)
            r19 = 835(0x343, double:4.125E-321)
            r21 = 3
            r23 = 1
            r18 = r0
            r18.mo175913w(r19, r21, r23)
            goto L_0x0787
        L_0x0754:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r5 = 4
            r2.mo35518f(r0, r5)
            com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r2 = 4
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r5 = 0
            r2[r5] = r4
            r2[r3] = r9
            r3 = 3
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            r5 = 2
            r2[r5] = r4
            int r4 = (int) r7
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r2[r3] = r4
            r3 = 10987(0x2aeb, float:1.5396E-41)
            r0.mo160131h(r3, r2)
            r19 = 835(0x343, double:4.125E-321)
            r21 = 2
            r23 = 1
            r18 = r0
            r18.mo175913w(r19, r21, r23)
        L_0x0787:
            r2 = 0
            sn2.C22378t.f63451i = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: sn2.t$$a.mo35517a(te3.eu3, long, boolean):void");
    }
}
