package i72;

/* renamed from: i72.m */
public class C98610m {
    /* JADX WARNING: Removed duplicated region for block: B:53:0x01b1 A[Catch:{ Exception -> 0x01f9 }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x01b2 A[Catch:{ Exception -> 0x01f9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0210  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m128210a(java.lang.String r16, com.tencent.p014mm.modelcontrol.VideoTransPara r17, te3.C101783gu2 r18, i72.C98608f r19) {
        /*
            r1 = r16
            r0 = r17
            java.lang.Class<lc3.b> r2 = lc3.C10485b.class
            java.lang.String r3 = "MicroMsg.SightSendVideoLogic"
            r4 = 2
            r5 = 1
            r6 = 0
            boolean r7 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r16)     // Catch:{ Exception -> 0x01fc }
            if (r7 != 0) goto L_0x01fb
            if (r0 != 0) goto L_0x0015
            goto L_0x01fb
        L_0x0015:
            if (r18 != 0) goto L_0x001d
            te3.gu2 r7 = new te3.gu2     // Catch:{ Exception -> 0x01fc }
            r7.<init>()     // Catch:{ Exception -> 0x01fc }
            goto L_0x001f
        L_0x001d:
            r7 = r18
        L_0x001f:
            java.lang.String r8 = "check localCaptureVideo %s videoPath %s videoParams %s, finishPreSendProcess: %s"
            r9 = 4
            java.lang.Object[] r10 = new java.lang.Object[r9]     // Catch:{ Exception -> 0x01f9 }
            boolean r11 = r7.f298309e     // Catch:{ Exception -> 0x01f9 }
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r11)     // Catch:{ Exception -> 0x01f9 }
            r10[r6] = r11     // Catch:{ Exception -> 0x01f9 }
            r10[r5] = r1     // Catch:{ Exception -> 0x01f9 }
            r10[r4] = r0     // Catch:{ Exception -> 0x01f9 }
            boolean r11 = r7.f298313i     // Catch:{ Exception -> 0x01f9 }
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r11)     // Catch:{ Exception -> 0x01f9 }
            r12 = 3
            r10[r12] = r11     // Catch:{ Exception -> 0x01f9 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r8, r10)     // Catch:{ Exception -> 0x01f9 }
            boolean r8 = r7.f298313i     // Catch:{ Exception -> 0x01f9 }
            if (r8 == 0) goto L_0x004a
            java.lang.String r0 = "checkShouldRemuxing, already finish preSendProcess, videoPath: %s"
            java.lang.Object[] r2 = new java.lang.Object[r5]     // Catch:{ Exception -> 0x01f9 }
            r2[r6] = r1     // Catch:{ Exception -> 0x01f9 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r0, r2)     // Catch:{ Exception -> 0x01f9 }
            return r6
        L_0x004a:
            boolean r8 = r7.f298309e     // Catch:{ Exception -> 0x01f9 }
            if (r8 == 0) goto L_0x01f8
            boolean r8 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r16)     // Catch:{ Exception -> 0x01f9 }
            if (r8 != 0) goto L_0x01f8
            xb0.h r8 = xb0.C102609h.Fx0()     // Catch:{ Exception -> 0x01f9 }
            byte[] r8 = r8.Ix0()     // Catch:{ Exception -> 0x01f9 }
            com.tencent.p014mm.plugin.sight.base.SightVideoJNI.tagMP4Dscp(r1, r8)     // Catch:{ Exception -> 0x01f9 }
            java.lang.String r8 = r7.f298312h     // Catch:{ Exception -> 0x01f9 }
            boolean r8 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r8)     // Catch:{ Exception -> 0x01f9 }
            if (r8 != 0) goto L_0x006c
            java.lang.String r8 = r7.f298312h     // Catch:{ Exception -> 0x01f9 }
            com.tencent.p014mm.plugin.sight.base.SightVideoJNI.tagMp4RecordInfo(r1, r8)     // Catch:{ Exception -> 0x01f9 }
        L_0x006c:
            long r10 = com.tencent.p014mm.sdk.platformtools.Util.currentTicks()     // Catch:{ Exception -> 0x01f9 }
            com.tencent.p014mm.plugin.sight.base.SightVideoJNI.optimizeMP4VFS(r16)     // Catch:{ Exception -> 0x01f9 }
            java.lang.String r8 = "optimizeMP4 used %sms"
            java.lang.Object[] r13 = new java.lang.Object[r5]     // Catch:{ Exception -> 0x01f9 }
            long r10 = com.tencent.p014mm.sdk.platformtools.Util.ticksToNow(r10)     // Catch:{ Exception -> 0x01f9 }
            java.lang.Long r10 = java.lang.Long.valueOf(r10)     // Catch:{ Exception -> 0x01f9 }
            r13[r6] = r10     // Catch:{ Exception -> 0x01f9 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r8, r13)     // Catch:{ Exception -> 0x01f9 }
            r19.mo96066a()     // Catch:{ Exception -> 0x01f9 }
            java.lang.String r1 = com.tencent.p014mm.vfs.C86013q1.m106448i(r1, r6)     // Catch:{ Exception -> 0x01f9 }
            oj.c r8 = new oj.c     // Catch:{ Exception -> 0x01f9 }
            r8.<init>()     // Catch:{ Exception -> 0x01f9 }
            r8.setDataSource(r1)     // Catch:{ Exception -> 0x01f9 }
            r10 = 18
            java.lang.String r10 = r8.extractMetadata(r10)     // Catch:{ Exception -> 0x01f9 }
            int r10 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r10, (int) r6)     // Catch:{ Exception -> 0x01f9 }
            r11 = 19
            java.lang.String r11 = r8.extractMetadata(r11)     // Catch:{ Exception -> 0x01f9 }
            int r11 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r11, (int) r6)     // Catch:{ Exception -> 0x01f9 }
            r13 = 20
            java.lang.String r13 = r8.extractMetadata(r13)     // Catch:{ Exception -> 0x01f9 }
            int r13 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r13, (int) r6)     // Catch:{ Exception -> 0x01f9 }
            r8.release()     // Catch:{ Exception -> 0x01f9 }
            java.lang.String r8 = "videopath %d %d %s"
            java.lang.Object[] r14 = new java.lang.Object[r12]     // Catch:{ Exception -> 0x01f9 }
            java.lang.Integer r15 = java.lang.Integer.valueOf(r10)     // Catch:{ Exception -> 0x01f9 }
            r14[r6] = r15     // Catch:{ Exception -> 0x01f9 }
            java.lang.Integer r15 = java.lang.Integer.valueOf(r11)     // Catch:{ Exception -> 0x01f9 }
            r14[r5] = r15     // Catch:{ Exception -> 0x01f9 }
            java.lang.Integer r15 = java.lang.Integer.valueOf(r13)     // Catch:{ Exception -> 0x01f9 }
            r14[r4] = r15     // Catch:{ Exception -> 0x01f9 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r8, r14)     // Catch:{ Exception -> 0x01f9 }
            java.lang.String r8 = "videoParams %s %s %s %s"
            java.lang.Object[] r9 = new java.lang.Object[r9]     // Catch:{ Exception -> 0x01f9 }
            int r14 = r0.f267166d     // Catch:{ Exception -> 0x01f9 }
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)     // Catch:{ Exception -> 0x01f9 }
            r9[r6] = r14     // Catch:{ Exception -> 0x01f9 }
            int r14 = r0.f267167e     // Catch:{ Exception -> 0x01f9 }
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)     // Catch:{ Exception -> 0x01f9 }
            r9[r5] = r14     // Catch:{ Exception -> 0x01f9 }
            int r14 = r0.f267169g     // Catch:{ Exception -> 0x01f9 }
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)     // Catch:{ Exception -> 0x01f9 }
            r9[r4] = r14     // Catch:{ Exception -> 0x01f9 }
            int r14 = r0.f267181v     // Catch:{ Exception -> 0x01f9 }
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)     // Catch:{ Exception -> 0x01f9 }
            r9[r12] = r14     // Catch:{ Exception -> 0x01f9 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r8, r9)     // Catch:{ Exception -> 0x01f9 }
            int r8 = java.lang.Math.min(r10, r11)     // Catch:{ Exception -> 0x01f9 }
            gj.b0 r9 = p156gj.C107835h0.f322852i     // Catch:{ Exception -> 0x01f9 }
            int r9 = r9.f322662k     // Catch:{ Exception -> 0x01f9 }
            if (r9 != r5) goto L_0x0103
            r9 = 1
            goto L_0x0104
        L_0x0103:
            r9 = 0
        L_0x0104:
            k40.a r10 = f40.C86709a0.m107533q(r2)     // Catch:{ Exception -> 0x01f9 }
            lc3.b r10 = (lc3.C10485b) r10     // Catch:{ Exception -> 0x01f9 }
            pj.f r10 = r10.vh0()     // Catch:{ Exception -> 0x01f9 }
            java.lang.String r11 = "MMSightCheckSendVideoBitrate"
            java.lang.String r10 = r10.mo107405c(r11)     // Catch:{ Exception -> 0x01f9 }
            int r10 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r10, (int) r6)     // Catch:{ Exception -> 0x01f9 }
            if (r10 != r5) goto L_0x011c
            r10 = 1
            goto L_0x011d
        L_0x011c:
            r10 = 0
        L_0x011d:
            k40.a r11 = f40.C86709a0.m107533q(r2)     // Catch:{ Exception -> 0x01f9 }
            lc3.b r11 = (lc3.C10485b) r11     // Catch:{ Exception -> 0x01f9 }
            pj.f r11 = r11.vh0()     // Catch:{ Exception -> 0x01f9 }
            java.lang.String r14 = "MMSightCheckSendVideoBitrateLimit"
            java.lang.String r11 = r11.mo107405c(r14)     // Catch:{ Exception -> 0x01f9 }
            r14 = 1067869798(0x3fa66666, float:1.3)
            float r11 = com.tencent.p014mm.sdk.platformtools.Util.getFloat(r11, r14)     // Catch:{ Exception -> 0x01f9 }
            java.lang.String r14 = com.tencent.p014mm.plugin.sight.base.SightVideoJNI.getMP4CprtH(r1)     // Catch:{ Exception -> 0x01f9 }
            if (r14 == 0) goto L_0x0159
            int r15 = r14.length()     // Catch:{ Exception -> 0x01f9 }
            r12 = 17
            if (r15 < r12) goto L_0x0159
            java.lang.String r12 = r14.substring(r6, r12)     // Catch:{ Exception -> 0x01f9 }
            java.lang.String r15 = "AdaptiveBitrateUP"
            boolean r12 = r12.equals(r15)     // Catch:{ Exception -> 0x01f9 }
            if (r12 == 0) goto L_0x0159
            java.lang.String r11 = "ABA: checkShouldRemuxing use aba: %s "
            java.lang.Object[] r12 = new java.lang.Object[r5]     // Catch:{ Exception -> 0x01f9 }
            r12[r6] = r14     // Catch:{ Exception -> 0x01f9 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r11, r12)     // Catch:{ Exception -> 0x01f9 }
            r11 = 1073741824(0x40000000, float:2.0)
        L_0x0159:
            int r12 = r0.f267181v     // Catch:{ Exception -> 0x01f9 }
            r12 = r12 & r4
            if (r12 == 0) goto L_0x0161
            r15 = 1073741824(0x40000000, float:2.0)
            goto L_0x0162
        L_0x0161:
            r15 = r11
        L_0x0162:
            int r11 = r0.f267169g     // Catch:{ Exception -> 0x01f9 }
            float r11 = (float) r11     // Catch:{ Exception -> 0x01f9 }
            float r11 = r11 * r15
            boolean r12 = r7.f298315n     // Catch:{ Exception -> 0x01f9 }
            if (r12 == 0) goto L_0x0188
            java.lang.String r11 = "from skip compress, set to bitrate upper bound to 12000000"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r11)     // Catch:{ Exception -> 0x01f9 }
            k40.a r2 = f40.C86709a0.m107533q(r2)     // Catch:{ Exception -> 0x01f9 }
            lc3.b r2 = (lc3.C10485b) r2     // Catch:{ Exception -> 0x01f9 }
            pj.f r2 = r2.vh0()     // Catch:{ Exception -> 0x01f9 }
            java.lang.String r11 = "MMSightCheckSendVideoBitrateLimitFromSkipCompress"
            java.lang.String r2 = r2.mo107405c(r11)     // Catch:{ Exception -> 0x01f9 }
            r11 = 12000000(0xb71b00, float:1.6815582E-38)
            int r2 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r2, (int) r11)     // Catch:{ Exception -> 0x01f9 }
            float r11 = (float) r2     // Catch:{ Exception -> 0x01f9 }
        L_0x0188:
            java.lang.String r2 = "deviceConfigCheckBitrate: %s, serverConfigCheckBitrate: %s, bitrateLimitRatio: %s"
            r12 = 3
            java.lang.Object[] r12 = new java.lang.Object[r12]     // Catch:{ Exception -> 0x01f9 }
            java.lang.Boolean r14 = java.lang.Boolean.valueOf(r9)     // Catch:{ Exception -> 0x01f9 }
            r12[r6] = r14     // Catch:{ Exception -> 0x01f9 }
            java.lang.Boolean r14 = java.lang.Boolean.valueOf(r10)     // Catch:{ Exception -> 0x01f9 }
            r12[r5] = r14     // Catch:{ Exception -> 0x01f9 }
            java.lang.Float r14 = java.lang.Float.valueOf(r15)     // Catch:{ Exception -> 0x01f9 }
            r12[r4] = r14     // Catch:{ Exception -> 0x01f9 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r2, r12)     // Catch:{ Exception -> 0x01f9 }
            if (r9 != 0) goto L_0x01a9
            if (r10 == 0) goto L_0x01a7
            goto L_0x01a9
        L_0x01a7:
            r2 = 0
            goto L_0x01aa
        L_0x01a9:
            r2 = 1
        L_0x01aa:
            if (r2 == 0) goto L_0x01b2
            float r9 = (float) r13     // Catch:{ Exception -> 0x01f9 }
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 < 0) goto L_0x01b2
            return r5
        L_0x01b2:
            boolean r9 = r7.f298315n     // Catch:{ Exception -> 0x01f9 }
            if (r9 == 0) goto L_0x01b7
            return r6
        L_0x01b7:
            int r9 = r0.f267166d     // Catch:{ Exception -> 0x01f9 }
            if (r8 <= r9) goto L_0x01d3
            if (r8 <= r9) goto L_0x01ca
            int r10 = r8 % 16
            if (r10 != 0) goto L_0x01ca
            int r8 = r8 - r9
            int r8 = java.lang.Math.abs(r8)     // Catch:{ Exception -> 0x01f9 }
            r9 = 16
            if (r8 < r9) goto L_0x01d3
        L_0x01ca:
            if (r2 == 0) goto L_0x01d2
            float r8 = (float) r13     // Catch:{ Exception -> 0x01f9 }
            int r8 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r8 < 0) goto L_0x01d2
            goto L_0x01d3
        L_0x01d2:
            return r5
        L_0x01d3:
            boolean r8 = r7.f298308d     // Catch:{ Exception -> 0x01f9 }
            if (r8 == 0) goto L_0x01d8
            return r5
        L_0x01d8:
            if (r2 == 0) goto L_0x01f6
            float r2 = (float) r13     // Catch:{ Exception -> 0x01f9 }
            int r0 = r0.f267169g     // Catch:{ Exception -> 0x01f9 }
            float r0 = (float) r0     // Catch:{ Exception -> 0x01f9 }
            float r0 = r0 * r15
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x01f6
            java.lang.String r0 = "exceed video bitrate, need remux video"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r0)     // Catch:{ Exception -> 0x01f9 }
            com.tencent.mm.plugin.report.service.n r8 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE     // Catch:{ Exception -> 0x01f9 }
            r9 = 440(0x1b8, double:2.174E-321)
            r11 = 205(0xcd, double:1.013E-321)
            r13 = 1
            r15 = 0
            r8.idkeyStat(r9, r11, r13, r15)     // Catch:{ Exception -> 0x01f9 }
            return r5
        L_0x01f6:
            r7.f298313i = r5     // Catch:{ Exception -> 0x01f9 }
        L_0x01f8:
            return r6
        L_0x01f9:
            r0 = move-exception
            goto L_0x01ff
        L_0x01fb:
            return r6
        L_0x01fc:
            r0 = move-exception
            r7 = r18
        L_0x01ff:
            java.lang.Object[] r2 = new java.lang.Object[r4]
            java.lang.String r0 = r0.getMessage()
            r2[r6] = r0
            r2[r5] = r1
            java.lang.String r0 = "checkShouldRemuxing error: %s %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r3, r0, r2)
            if (r7 == 0) goto L_0x0212
            r7.f298313i = r5
        L_0x0212:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: i72.C98610m.m128210a(java.lang.String, com.tencent.mm.modelcontrol.VideoTransPara, te3.gu2, i72.f):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:54:0x017f A[Catch:{ Exception -> 0x02e9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x01a4 A[Catch:{ Exception -> 0x02e9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x01e4 A[Catch:{ Exception -> 0x02e9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0218 A[Catch:{ Exception -> 0x02e9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0237 A[Catch:{ Exception -> 0x02e9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x024d A[Catch:{ Exception -> 0x02e9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x02a0 A[Catch:{ Exception -> 0x02e9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x02a5 A[Catch:{ Exception -> 0x02e9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x02b4 A[Catch:{ Exception -> 0x02e9 }] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m128211b(java.lang.String r35, com.tencent.p014mm.modelcontrol.VideoTransPara r36, te3.C101783gu2 r37, i72.C98608f r38) {
        /*
            r0 = r35
            r1 = r36
            r2 = r37
            java.lang.String r3 = ".mp4"
            java.lang.String r4 = "/"
            if (r2 == 0) goto L_0x0300
            boolean r6 = r2.f298309e
            if (r6 == 0) goto L_0x0300
            boolean r6 = com.tencent.p014mm.vfs.C86013q1.m106450k(r35)
            if (r6 != 0) goto L_0x0018
            goto L_0x0300
        L_0x0018:
            boolean r6 = r2.f298313i
            java.lang.String r7 = "MicroMsg.SightSendVideoLogic"
            r8 = 0
            r9 = 1
            if (r6 == 0) goto L_0x0029
            java.lang.Object[] r6 = new java.lang.Object[r9]
            r6[r8] = r0
            java.lang.String r10 = "doRemuxingSendVideoMsg, already finish preSendProcess, videoPath: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r10, r6)
        L_0x0029:
            java.lang.String r6 = com.tencent.p014mm.vfs.C86013q1.m106458s(r35)     // Catch:{ Exception -> 0x02ed }
            boolean r10 = r6.endsWith(r4)     // Catch:{ Exception -> 0x02ed }
            if (r10 != 0) goto L_0x0042
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x02ed }
            r10.<init>()     // Catch:{ Exception -> 0x02ed }
            r10.append(r6)     // Catch:{ Exception -> 0x02ed }
            r10.append(r4)     // Catch:{ Exception -> 0x02ed }
            java.lang.String r6 = r10.toString()     // Catch:{ Exception -> 0x02ed }
        L_0x0042:
            android.net.Uri r10 = com.tencent.p014mm.vfs.C116299g2.m163858n(r35)     // Catch:{ Exception -> 0x02eb }
            java.lang.String r11 = r10.getPath()     // Catch:{ Exception -> 0x02eb }
            if (r11 == 0) goto L_0x0066
            java.lang.String r11 = com.tencent.p014mm.vfs.C116299g2.m163855k(r11, r8, r8)     // Catch:{ Exception -> 0x02eb }
            java.lang.String r12 = r10.getPath()     // Catch:{ Exception -> 0x02eb }
            boolean r12 = r12.equals(r11)     // Catch:{ Exception -> 0x02eb }
            if (r12 != 0) goto L_0x0066
            android.net.Uri$Builder r10 = r10.buildUpon()     // Catch:{ Exception -> 0x02eb }
            android.net.Uri$Builder r10 = r10.path(r11)     // Catch:{ Exception -> 0x02eb }
            android.net.Uri r10 = r10.build()     // Catch:{ Exception -> 0x02eb }
        L_0x0066:
            java.lang.String r10 = r10.getPath()     // Catch:{ Exception -> 0x02ed }
            int r4 = r10.lastIndexOf(r4)     // Catch:{ Exception -> 0x02ed }
            if (r4 >= 0) goto L_0x0071
            goto L_0x0076
        L_0x0071:
            int r4 = r4 + r9
            java.lang.String r10 = r10.substring(r4)     // Catch:{ Exception -> 0x02ed }
        L_0x0076:
            r4 = 46
            int r4 = r10.lastIndexOf(r4)     // Catch:{ Exception -> 0x02ed }
            if (r4 <= 0) goto L_0x0082
            java.lang.String r10 = r10.substring(r8, r4)     // Catch:{ Exception -> 0x02ed }
        L_0x0082:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x02ed }
            r4.<init>()     // Catch:{ Exception -> 0x02ed }
            r4.append(r6)     // Catch:{ Exception -> 0x02ed }
            r4.append(r10)     // Catch:{ Exception -> 0x02ed }
            java.lang.String r11 = "_hd"
            r4.append(r11)     // Catch:{ Exception -> 0x02ed }
            java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x02ed }
            boolean r11 = r0.endsWith(r3)     // Catch:{ Exception -> 0x02ed }
            if (r11 == 0) goto L_0x00ab
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x02ed }
            r11.<init>()     // Catch:{ Exception -> 0x02ed }
            r11.append(r4)     // Catch:{ Exception -> 0x02ed }
            r11.append(r3)     // Catch:{ Exception -> 0x02ed }
            java.lang.String r4 = r11.toString()     // Catch:{ Exception -> 0x02ed }
        L_0x00ab:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x02ed }
            r3.<init>()     // Catch:{ Exception -> 0x02ed }
            r3.append(r6)     // Catch:{ Exception -> 0x02ed }
            r3.append(r10)     // Catch:{ Exception -> 0x02ed }
            java.lang.String r11 = "tempRemuxing.mp4"
            r3.append(r11)     // Catch:{ Exception -> 0x02ed }
            java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x02ed }
            com.tencent.p014mm.vfs.C86013q1.m106442c(r0, r4)     // Catch:{ Exception -> 0x02ed }
            java.lang.String r11 = "doRemuxingSendVideoMsg, dir: %s, oldFileName: %s, hdFilePath: %s, remuxingOutputFile: %s extInfotrycount %d"
            r12 = 5
            java.lang.Object[] r13 = new java.lang.Object[r12]     // Catch:{ Exception -> 0x02ed }
            r13[r8] = r6     // Catch:{ Exception -> 0x02ed }
            r13[r9] = r10     // Catch:{ Exception -> 0x02ed }
            r6 = 2
            r13[r6] = r4     // Catch:{ Exception -> 0x02ed }
            r10 = 3
            r13[r10] = r3     // Catch:{ Exception -> 0x02ed }
            int r14 = r2.f298310f     // Catch:{ Exception -> 0x02ed }
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)     // Catch:{ Exception -> 0x02ed }
            r15 = 4
            r13[r15] = r14     // Catch:{ Exception -> 0x02ed }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r11, r13)     // Catch:{ Exception -> 0x02ed }
            java.lang.String r4 = com.tencent.p014mm.vfs.C86013q1.m106448i(r4, r9)     // Catch:{ Exception -> 0x02ed }
            java.lang.String r3 = com.tencent.p014mm.vfs.C86013q1.m106448i(r3, r9)     // Catch:{ Exception -> 0x02ed }
            oj.c r11 = new oj.c     // Catch:{ Exception -> 0x02ed }
            r11.<init>()     // Catch:{ Exception -> 0x02ed }
            r11.setDataSource(r4)     // Catch:{ Exception -> 0x02ed }
            r13 = 18
            java.lang.String r13 = r11.extractMetadata(r13)     // Catch:{ Exception -> 0x02ed }
            int r13 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r13, (int) r8)     // Catch:{ Exception -> 0x02ed }
            r14 = 19
            java.lang.String r11 = r11.extractMetadata(r14)     // Catch:{ Exception -> 0x02ed }
            int r11 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r11, (int) r8)     // Catch:{ Exception -> 0x02ed }
            int r14 = java.lang.Math.min(r13, r11)     // Catch:{ Exception -> 0x02ed }
            int r5 = r1.f267166d     // Catch:{ Exception -> 0x02ed }
            if (r14 <= r5) goto L_0x0147
            if (r14 <= r5) goto L_0x011a
            int r16 = r14 % 16
            if (r16 != 0) goto L_0x011a
            int r14 = r14 - r5
            int r5 = java.lang.Math.abs(r14)     // Catch:{ Exception -> 0x02ed }
            r14 = 16
            if (r5 >= r14) goto L_0x011a
            goto L_0x0147
        L_0x011a:
            r16 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            if (r13 >= r11) goto L_0x012d
            int r5 = r1.f267166d     // Catch:{ Exception -> 0x02ed }
            r14 = r7
            double r6 = (double) r13
            double r6 = r6 * r16
            double r9 = (double) r5
            double r6 = r6 / r9
            double r9 = (double) r11
            double r9 = r9 / r6
            int r6 = (int) r9
            r7 = r3
            r3 = r5
            r5 = r4
            goto L_0x013a
        L_0x012d:
            r14 = r7
            int r6 = r1.f267166d     // Catch:{ Exception -> 0x02e9 }
            double r9 = (double) r11     // Catch:{ Exception -> 0x02e9 }
            double r9 = r9 * r16
            r7 = r3
            r5 = r4
            double r3 = (double) r6     // Catch:{ Exception -> 0x02e9 }
            double r9 = r9 / r3
            double r3 = (double) r13     // Catch:{ Exception -> 0x02e9 }
            double r3 = r3 / r9
            int r3 = (int) r3     // Catch:{ Exception -> 0x02e9 }
        L_0x013a:
            int r4 = r6 % 2
            if (r4 == 0) goto L_0x0140
            int r6 = r6 + 1
        L_0x0140:
            int r4 = r3 % 2
            if (r4 == 0) goto L_0x014c
            int r3 = r3 + 1
            goto L_0x014c
        L_0x0147:
            r5 = r4
            r14 = r7
            r7 = r3
            r6 = r11
            r3 = r13
        L_0x014c:
            java.lang.String r4 = "start remuxing %s,  rawwith %s, rawheight %s, outputWidth: %s, outputHeight: %s videoParams: %s"
            r9 = 6
            java.lang.Object[] r10 = new java.lang.Object[r9]     // Catch:{ Exception -> 0x02e9 }
            r10[r8] = r0     // Catch:{ Exception -> 0x02e9 }
            java.lang.Integer r16 = java.lang.Integer.valueOf(r13)     // Catch:{ Exception -> 0x02e9 }
            r17 = 1
            r10[r17] = r16     // Catch:{ Exception -> 0x02e9 }
            java.lang.Integer r16 = java.lang.Integer.valueOf(r11)     // Catch:{ Exception -> 0x02e9 }
            r17 = 2
            r10[r17] = r16     // Catch:{ Exception -> 0x02e9 }
            java.lang.Integer r16 = java.lang.Integer.valueOf(r3)     // Catch:{ Exception -> 0x02e9 }
            r17 = 3
            r10[r17] = r16     // Catch:{ Exception -> 0x02e9 }
            java.lang.Integer r16 = java.lang.Integer.valueOf(r6)     // Catch:{ Exception -> 0x02e9 }
            r10[r15] = r16     // Catch:{ Exception -> 0x02e9 }
            r10[r12] = r1     // Catch:{ Exception -> 0x02e9 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r14, r4, r10)     // Catch:{ Exception -> 0x02e9 }
            long r32 = com.tencent.p014mm.sdk.platformtools.Util.currentTicks()     // Catch:{ Exception -> 0x02e9 }
            boolean r4 = r2.f298315n     // Catch:{ Exception -> 0x02e9 }
            if (r4 == 0) goto L_0x019f
            java.lang.String r4 = "from skip compress, set remux target bitrate to 12000000"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r14, r4)     // Catch:{ Exception -> 0x02e9 }
            java.lang.Class<lc3.b> r4 = lc3.C10485b.class
            k40.a r4 = f40.C86709a0.m107533q(r4)     // Catch:{ Exception -> 0x02e9 }
            lc3.b r4 = (lc3.C10485b) r4     // Catch:{ Exception -> 0x02e9 }
            pj.f r4 = r4.vh0()     // Catch:{ Exception -> 0x02e9 }
            java.lang.String r10 = "MMSightCheckSendVideoBitrateLimitFromSkipCompress"
            java.lang.String r4 = r4.mo107405c(r10)     // Catch:{ Exception -> 0x02e9 }
            r10 = 12000000(0xb71b00, float:1.6815582E-38)
            int r4 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r4, (int) r10)     // Catch:{ Exception -> 0x02e9 }
            r1.f267169g = r4     // Catch:{ Exception -> 0x02e9 }
        L_0x019f:
            int r4 = r1.f267180u     // Catch:{ Exception -> 0x02e9 }
            r10 = 1
            if (r4 == r10) goto L_0x01ac
            r10 = 2
            if (r4 != r10) goto L_0x01a8
            goto L_0x01ac
        L_0x01a8:
            r4 = 0
            r34 = r11
            goto L_0x0213
        L_0x01ac:
            int r4 = r1.f267168f     // Catch:{ Exception -> 0x02e9 }
            int r10 = r1.f267169g     // Catch:{ Exception -> 0x02e9 }
            r21 = 0
            r22 = 0
            r23 = 2
            float r9 = r1.f267182w     // Catch:{ Exception -> 0x02e9 }
            r25 = 0
            int r12 = r1.f267184y     // Catch:{ Exception -> 0x02e9 }
            int r15 = r1.f267185z     // Catch:{ Exception -> 0x02e9 }
            int r8 = r1.f267154A     // Catch:{ Exception -> 0x02e9 }
            int r2 = r1.f267155B     // Catch:{ Exception -> 0x02e9 }
            r34 = r11
            int r11 = r1.f267156C     // Catch:{ Exception -> 0x02e9 }
            r31 = 0
            r16 = r5
            r17 = r6
            r18 = r3
            r19 = r4
            r20 = r10
            r24 = r9
            r26 = r12
            r27 = r15
            r28 = r8
            r29 = r2
            r30 = r11
            com.tencent.mm.plugin.sight.base.ABAPrams r4 = com.tencent.p014mm.plugin.sight.base.AdaptiveAdjustBitrate.m119557b(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31)     // Catch:{ Exception -> 0x02e9 }
            if (r4 == 0) goto L_0x01ea
            int r2 = r4.outputKbps     // Catch:{ Exception -> 0x02e9 }
            int r2 = r2 * 1000
            r1.f267169g = r2     // Catch:{ Exception -> 0x02e9 }
        L_0x01ea:
            if (r4 == 0) goto L_0x01f4
            int r2 = r4.resolutionAdjust     // Catch:{ Exception -> 0x02e9 }
            if (r2 <= 0) goto L_0x01f4
            int r3 = r4.outputWidth     // Catch:{ Exception -> 0x02e9 }
            int r6 = r4.outputHeight     // Catch:{ Exception -> 0x02e9 }
        L_0x01f4:
            java.lang.String r2 = "ABA: MMsightSendVideoLogic Videobitrate: [%d] , Width: [%d], Height: [%d] "
            r8 = 3
            java.lang.Object[] r9 = new java.lang.Object[r8]     // Catch:{ Exception -> 0x02e9 }
            int r8 = r1.f267169g     // Catch:{ Exception -> 0x02e9 }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ Exception -> 0x02e9 }
            r10 = 0
            r9[r10] = r8     // Catch:{ Exception -> 0x02e9 }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r3)     // Catch:{ Exception -> 0x02e9 }
            r10 = 1
            r9[r10] = r8     // Catch:{ Exception -> 0x02e9 }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r6)     // Catch:{ Exception -> 0x02e9 }
            r10 = 2
            r9[r10] = r8     // Catch:{ Exception -> 0x02e9 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r14, r2, r9)     // Catch:{ Exception -> 0x02e9 }
        L_0x0213:
            int r2 = r1.f267181v     // Catch:{ Exception -> 0x02e9 }
            r8 = 1
            if (r2 != r8) goto L_0x0237
            java.lang.String r2 = "ABA: Using Min Max QP Limitation: [%d], [%d] "
            r8 = 2
            java.lang.Object[] r9 = new java.lang.Object[r8]     // Catch:{ Exception -> 0x02e9 }
            int r8 = r1.f267157D     // Catch:{ Exception -> 0x02e9 }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ Exception -> 0x02e9 }
            r10 = 0
            r9[r10] = r8     // Catch:{ Exception -> 0x02e9 }
            int r8 = r1.f267158E     // Catch:{ Exception -> 0x02e9 }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ Exception -> 0x02e9 }
            r10 = 1
            r9[r10] = r8     // Catch:{ Exception -> 0x02e9 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r14, r2, r9)     // Catch:{ Exception -> 0x02e9 }
            int r2 = r1.f267157D     // Catch:{ Exception -> 0x02e9 }
            int r8 = r1.f267158E     // Catch:{ Exception -> 0x02e9 }
            goto L_0x023a
        L_0x0237:
            r8 = 51
            r2 = 0
        L_0x023a:
            r1.f267157D = r2     // Catch:{ Exception -> 0x02e9 }
            r1.f267158E = r8     // Catch:{ Exception -> 0x02e9 }
            r1.f267166d = r3     // Catch:{ Exception -> 0x02e9 }
            r1.f267167e = r6     // Catch:{ Exception -> 0x02e9 }
            r2 = 30
            r1.f267168f = r2     // Catch:{ Exception -> 0x02e9 }
            r2 = 0
            int r8 = com.tencent.p014mm.pluginsdk.model.C96794v0.m124290b(r5, r7, r1, r2)     // Catch:{ Exception -> 0x02e9 }
            if (r8 > 0) goto L_0x0257
            java.lang.String r2 = "composition transcode failed, try use soft encoder"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r14, r2)     // Catch:{ Exception -> 0x02e9 }
            r2 = 1
            int r8 = com.tencent.p014mm.pluginsdk.model.C96794v0.m124290b(r5, r7, r1, r2)     // Catch:{ Exception -> 0x02e9 }
        L_0x0257:
            java.lang.String r2 = "doremuxing finish %s,  rawwith %s, rawheight %s, outputWidth: %s, outputHeight: %s duration: %s, used %sms"
            r5 = 7
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch:{ Exception -> 0x02e9 }
            r9 = 0
            r5[r9] = r0     // Catch:{ Exception -> 0x02e9 }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r13)     // Catch:{ Exception -> 0x02e9 }
            r10 = 1
            r5[r10] = r9     // Catch:{ Exception -> 0x02e9 }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r34)     // Catch:{ Exception -> 0x02e9 }
            r10 = 2
            r5[r10] = r9     // Catch:{ Exception -> 0x02e9 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ Exception -> 0x02e9 }
            r9 = 3
            r5[r9] = r3     // Catch:{ Exception -> 0x02e9 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r6)     // Catch:{ Exception -> 0x02e9 }
            r6 = 4
            r5[r6] = r3     // Catch:{ Exception -> 0x02e9 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r8)     // Catch:{ Exception -> 0x02e9 }
            r6 = 5
            r5[r6] = r3     // Catch:{ Exception -> 0x02e9 }
            long r9 = com.tencent.p014mm.sdk.platformtools.Util.ticksToNow(r32)     // Catch:{ Exception -> 0x02e9 }
            java.lang.Long r3 = java.lang.Long.valueOf(r9)     // Catch:{ Exception -> 0x02e9 }
            r6 = 6
            r5[r6] = r3     // Catch:{ Exception -> 0x02e9 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r14, r2, r5)     // Catch:{ Exception -> 0x02e9 }
            com.tencent.p014mm.vfs.C86013q1.m106463x(r7, r0)     // Catch:{ Exception -> 0x02e9 }
            r2 = 1
            java.lang.String r0 = com.tencent.p014mm.vfs.C86013q1.m106448i(r0, r2)     // Catch:{ Exception -> 0x02e9 }
            long r2 = com.tencent.p014mm.sdk.platformtools.Util.currentTicks()     // Catch:{ Exception -> 0x02e9 }
            int r5 = r1.f267180u     // Catch:{ Exception -> 0x02e9 }
            if (r5 <= 0) goto L_0x02a5
            r6 = 0
            com.tencent.p014mm.plugin.sight.base.SightVideoJNI.addReportMetadata(r0, r4, r5, r6)     // Catch:{ Exception -> 0x02e9 }
            goto L_0x02ae
        L_0x02a5:
            r6 = 0
            int r1 = r1.f267181v     // Catch:{ Exception -> 0x02e9 }
            r5 = 1
            if (r1 != r5) goto L_0x02ae
            com.tencent.p014mm.plugin.sight.base.SightVideoJNI.addReportMetadata(r0, r4, r6, r1)     // Catch:{ Exception -> 0x02e9 }
        L_0x02ae:
            r1 = r37
            boolean r4 = r1.f298309e     // Catch:{ Exception -> 0x02e9 }
            if (r4 == 0) goto L_0x02cf
            xb0.h r4 = xb0.C102609h.Fx0()     // Catch:{ Exception -> 0x02e9 }
            byte[] r4 = r4.Ix0()     // Catch:{ Exception -> 0x02e9 }
            com.tencent.p014mm.plugin.sight.base.SightVideoJNI.tagMP4Dscp(r0, r4)     // Catch:{ Exception -> 0x02e9 }
            java.lang.String r4 = r1.f298312h     // Catch:{ Exception -> 0x02e9 }
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)     // Catch:{ Exception -> 0x02e9 }
            if (r4 != 0) goto L_0x02cc
            java.lang.String r1 = r1.f298312h     // Catch:{ Exception -> 0x02e9 }
            com.tencent.p014mm.plugin.sight.base.SightVideoJNI.tagMp4RecordInfo(r0, r1)     // Catch:{ Exception -> 0x02e9 }
        L_0x02cc:
            com.tencent.p014mm.plugin.sight.base.SightVideoJNI.optimizeMP4VFS(r0)     // Catch:{ Exception -> 0x02e9 }
        L_0x02cf:
            r38.mo96066a()     // Catch:{ Exception -> 0x02e9 }
            java.lang.String r0 = "tagMP4Dscp used %sms"
            r1 = 1
            java.lang.Object[] r4 = new java.lang.Object[r1]     // Catch:{ Exception -> 0x02e7 }
            long r1 = com.tencent.p014mm.sdk.platformtools.Util.ticksToNow(r2)     // Catch:{ Exception -> 0x02e9 }
            java.lang.Long r1 = java.lang.Long.valueOf(r1)     // Catch:{ Exception -> 0x02e9 }
            r2 = 0
            r4[r2] = r1     // Catch:{ Exception -> 0x02e9 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r14, r0, r4)     // Catch:{ Exception -> 0x02e9 }
            return r8
        L_0x02e7:
            r0 = move-exception
            goto L_0x02f0
        L_0x02e9:
            r0 = move-exception
            goto L_0x02ef
        L_0x02eb:
            r0 = move-exception
            goto L_0x02ee
        L_0x02ed:
            r0 = move-exception
        L_0x02ee:
            r14 = r7
        L_0x02ef:
            r1 = 1
        L_0x02f0:
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r0 = r0.getMessage()
            r2 = 0
            r1[r2] = r0
            java.lang.String r0 = "doRemuxingSendVideoMsg error: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r14, r0, r1)
            r1 = -1
            return r1
        L_0x0300:
            r1 = -1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: i72.C98610m.m128211b(java.lang.String, com.tencent.mm.modelcontrol.VideoTransPara, te3.gu2, i72.f):int");
    }
}
