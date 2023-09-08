package uq1;

import u60.C65222f;
import v60.C102152a;
import v60.C102156f;
import v60.C102157g;

/* renamed from: uq1.c */
public final class C65430c {

    /* renamed from: c */
    public static final C65430c f188287c = new C65430c();

    /* renamed from: a */
    public C65222f<C65428a> f188288a = new C65222f<>(new C102156f(new C102152a(100, Integer.MAX_VALUE), new C102157g(1, 5), 1, "finder_action_post_quene"));

    /* renamed from: b */
    public final Runnable f188289b = new C65431a(this);

    /* renamed from: uq1.c$a */
    public static final class C65431a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C65430c f188290d;

        public C65431a(C65430c cVar) {
            this.f188290d = cVar;
        }

        public final void run() {
            this.f188290d.mo89551b();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:56:0x0186  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final up1.C65426w0 mo89550a(long r19, java.lang.String r21, long r22, java.lang.String r24, java.lang.String r25, java.lang.String r26, java.lang.String r27, java.lang.Long r28, java.lang.String r29, java.lang.String r30, java.lang.String r31, int r32, boolean r33, com.tencent.p014mm.protocal.protobuf.FinderCommentInfo r34, te3.C49712hj1 r35, int r36, java.util.List<com.tencent.p014mm.plugin.finder.view.C41598v7> r37, java.util.LinkedList<java.lang.String> r38, java.lang.String r39) {
        /*
            r18 = this;
            r1 = r18
            r0 = r21
            r2 = r24
            r3 = r25
            r4 = r26
            r5 = r27
            r6 = r30
            r7 = r31
            r8 = r32
            r9 = r34
            r10 = r39
            java.lang.String r11 = "feedUsername"
            gy3.C87412m.m108594g(r0, r11)
            java.lang.String r11 = "objectNonceId"
            gy3.C87412m.m108594g(r2, r11)
            java.lang.String r11 = "replyUsername"
            gy3.C87412m.m108594g(r4, r11)
            java.lang.String r11 = "replyNickname"
            gy3.C87412m.m108594g(r5, r11)
            java.lang.String r11 = "username"
            gy3.C87412m.m108594g(r6, r11)
            java.lang.String r11 = "nickname"
            gy3.C87412m.m108594g(r7, r11)
            java.lang.String r11 = "mentionList"
            r12 = r37
            gy3.C87412m.m108594g(r12, r11)
            java.lang.String r11 = "udfKv"
            gy3.C87412m.m108594g(r10, r11)
            up1.w0 r11 = new up1.w0
            r11.<init>()
            r13 = 1
            r11.field_actionType = r13
            r14 = r22
            r11.field_feedId = r14
            r11.field_objectNonceId = r2
            r14 = r19
            r11.field_localCommentId = r14
            com.tencent.mm.protocal.protobuf.FinderCommentInfo r2 = r11.mo89532o2()
            r14 = 0
            r2.displayid = r14
            r11.f188279P = r13
            if (r9 == 0) goto L_0x0063
            long r14 = r9.commentId
            goto L_0x0065
        L_0x0063:
            r14 = 0
        L_0x0065:
            te3.ye0 r2 = r11.field_actionInfo
            r2.f186500h = r14
            java.lang.String r2 = ""
            if (r8 != r13) goto L_0x008e
            com.tencent.mm.protocal.protobuf.FinderCommentInfo r15 = r11.mo89532o2()
            r15.username = r6
            fe1.d$b r15 = fe1.C58961d.f168673a
            zc1.b r16 = zc1.C66785b.f191882e
            java.lang.String r14 = r16.mo90662O5()
            fe1.q r14 = r15.mo84155b(r14)
            if (r14 == 0) goto L_0x0086
            java.lang.String r14 = r14.getAvatarUrl()
            goto L_0x0087
        L_0x0086:
            r14 = r2
        L_0x0087:
            com.tencent.mm.protocal.protobuf.FinderCommentInfo r15 = r11.mo89532o2()
            r15.headUrl = r14
            goto L_0x00ed
        L_0x008e:
            java.lang.String r14 = eb0.C75592q0.m90789s()
            java.lang.String r15 = "getUsernameFromUserInfo()"
            gy3.C87412m.m108593f(r14, r15)
            com.tencent.mm.protocal.protobuf.FinderCommentInfo r15 = r11.mo89532o2()
            r15.username = r14
            java.lang.Class<ln.g> r14 = p196ln.C76706g.class
            di3.d r14 = di3.C86312j.m106911c(r14)
            ln.g r14 = (p196ln.C76706g) r14
            ln.n r14 = r14.mo106832eg()
            java.lang.String r15 = r11.getUsername()
            com.tencent.mm.modelavatar.o r14 = (com.tencent.p014mm.modelavatar.C68098o) r14
            com.tencent.mm.modelavatar.n r14 = r14.mo93607Lo(r15)
            if (r14 == 0) goto L_0x00dd
            java.lang.String r15 = r14.mo93594c()
            if (r15 == 0) goto L_0x00c4
            int r15 = r15.length()
            if (r15 != 0) goto L_0x00c2
            goto L_0x00c4
        L_0x00c2:
            r15 = 0
            goto L_0x00c5
        L_0x00c4:
            r15 = 1
        L_0x00c5:
            if (r15 == 0) goto L_0x00ce
            java.lang.String r14 = r14.mo93597f()
            java.lang.String r15 = "imgFlag.smallUrl"
            goto L_0x00d4
        L_0x00ce:
            java.lang.String r14 = r14.mo93594c()
            java.lang.String r15 = "imgFlag.bigUrl"
        L_0x00d4:
            gy3.C87412m.m108593f(r14, r15)
            com.tencent.mm.protocal.protobuf.FinderCommentInfo r15 = r11.mo89532o2()
            r15.headUrl = r14
        L_0x00dd:
            java.lang.String r14 = r11.mo89537t2()
            boolean r14 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r14)
            if (r14 == 0) goto L_0x00ed
            com.tencent.mm.protocal.protobuf.FinderCommentInfo r14 = r11.mo89532o2()
            r14.headUrl = r2
        L_0x00ed:
            if (r3 == 0) goto L_0x00f5
            com.tencent.mm.protocal.protobuf.FinderCommentInfo r14 = r11.mo89532o2()
            r14.content = r3
        L_0x00f5:
            com.tencent.mm.protocal.protobuf.FinderCommentInfo r3 = r11.mo89532o2()
            r3.nickname = r7
            long r14 = eb0.C31543z5.m39451a()
            r16 = 1000(0x3e8, double:4.94E-321)
            long r14 = r14 / r16
            com.tencent.mm.protocal.protobuf.FinderCommentInfo r3 = r11.mo89532o2()
            r3.createtime = r14
            boolean r3 = gy3.C87412m.m108589b(r6, r0)
            r7 = 8
            if (r3 == 0) goto L_0x0113
            r3 = 2
            goto L_0x0119
        L_0x0113:
            if (r8 != r13) goto L_0x0118
            r3 = 8
            goto L_0x0119
        L_0x0118:
            r3 = 0
        L_0x0119:
            r11.mo89523B2(r3)
            r11.field_state = r13
            r3 = 16
            if (r28 == 0) goto L_0x01a5
            r28.longValue()
            long r14 = r28.longValue()
            com.tencent.mm.protocal.protobuf.FinderCommentInfo r6 = r11.mo89532o2()
            r6.replyCommentId = r14
            if (r29 != 0) goto L_0x0133
            r6 = r2
            goto L_0x0135
        L_0x0133:
            r6 = r29
        L_0x0135:
            com.tencent.mm.protocal.protobuf.FinderCommentInfo r14 = r11.mo89532o2()
            r14.reply_content = r6
            com.tencent.mm.protocal.protobuf.FinderCommentInfo r6 = r11.mo89532o2()
            r6.reply_username = r4
            com.tencent.mm.protocal.protobuf.FinderCommentInfo r6 = r11.mo89532o2()
            r6.replyNickname = r5
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isEqual((java.lang.String) r4, (java.lang.String) r0)
            if (r0 == 0) goto L_0x0156
            int r0 = r11.mo89533p2()
            r0 = r0 | 4
            r11.mo89523B2(r0)
        L_0x0156:
            if (r33 == 0) goto L_0x0160
            int r0 = r11.mo89533p2()
            r0 = r0 | r3
            r11.mo89523B2(r0)
        L_0x0160:
            if (r9 == 0) goto L_0x01a5
            te3.ye0 r4 = r11.field_actionInfo
            com.tencent.mm.protocal.protobuf.FinderCommentInfo r0 = new com.tencent.mm.protocal.protobuf.FinderCommentInfo
            r0.<init>()
            byte[] r5 = r34.toByteArray()
            r6 = 0
            if (r5 != 0) goto L_0x0172
            r9 = 0
            goto L_0x0183
        L_0x0172:
            r0.parseFrom(r5)     // Catch:{ Exception -> 0x0177 }
            r9 = 0
            goto L_0x0184
        L_0x0177:
            r0 = move-exception
            r5 = r0
            java.lang.Object[] r0 = new java.lang.Object[r13]
            r9 = 0
            r0[r9] = r5
            java.lang.String r5 = "safeParser"
            com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r5, r2, r0)
        L_0x0183:
            r0 = r6
        L_0x0184:
            if (r0 == 0) goto L_0x01a3
            int r2 = r0.expandCommentCount
            int r2 = r2 + -1
            r0.expandCommentCount = r2
            r0.upContinueFlag = r9
            if (r2 <= 0) goto L_0x0192
            r2 = 1
            goto L_0x0193
        L_0x0192:
            r2 = 0
        L_0x0193:
            r0.continueFlag = r2
            java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderCommentInfo> r2 = r0.levelTwoComment
            if (r2 == 0) goto L_0x019c
            r2.clear()
        L_0x019c:
            r0.lastBuffer = r6
            r5 = 0
            r0.displayid = r5
            r6 = r0
        L_0x01a3:
            r4.f186501i = r6
        L_0x01a5:
            java.lang.String r0 = java.lang.String.valueOf(r19)
            java.lang.String r2 = "value"
            gy3.C87412m.m108594g(r0, r2)
            com.tencent.mm.protocal.protobuf.FinderCommentInfo r2 = r11.mo89532o2()
            r2.client_id = r0
            r11.field_scene = r8
            long r4 = java.lang.System.currentTimeMillis()
            r11.field_postTime = r4
            r4 = 0
            r11.field_tryCount = r4
            te3.ye0 r0 = r11.field_actionInfo
            r2 = r35
            r0.f186503n = r2
            r2 = r36
            r0.f186504o = r2
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            java.util.Iterator r2 = r37.iterator()
        L_0x01d4:
            boolean r4 = r2.hasNext()
            r5 = 32
            if (r4 == 0) goto L_0x027e
            java.lang.Object r4 = r2.next()
            com.tencent.mm.plugin.finder.view.v7 r4 = (com.tencent.p014mm.plugin.finder.view.C41598v7) r4
            er1.w3 r6 = er1.C58784w3.f168295a
            r6.getClass()
            java.lang.String r6 = "ct"
            gy3.C87412m.m108594g(r4, r6)
            byte[] r6 = new byte[r3]
            long r8 = r4.f111968c
            com.tencent.qqmusic.mediaplayer.util.BytesTransUtil r12 = com.tencent.qqmusic.mediaplayer.util.BytesTransUtil.getInstance()
            r14 = 0
            byte[] r8 = r12.getBytes((long) r8, (boolean) r14)
            r9 = 0
            r12 = 0
        L_0x01fb:
            if (r9 >= r7) goto L_0x0205
            byte r14 = r8[r9]
            r6[r12] = r14
            int r12 = r12 + r13
            int r9 = r9 + 1
            goto L_0x01fb
        L_0x0205:
            long r8 = r4.f111969d
            com.tencent.qqmusic.mediaplayer.util.BytesTransUtil r12 = com.tencent.qqmusic.mediaplayer.util.BytesTransUtil.getInstance()
            r14 = 0
            byte[] r8 = r12.getBytes((long) r8, (boolean) r14)
            r9 = 0
            r12 = 8
        L_0x0213:
            if (r9 >= r7) goto L_0x021d
            byte r14 = r8[r9]
            r6[r12] = r14
            int r12 = r12 + r13
            int r9 = r9 + 1
            goto L_0x0213
        L_0x021d:
            java.lang.String r8 = er1.C58784w3.f168296b
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r12 = "parseMentionContactToPb mentionCliBuf = "
            r9.append(r12)
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>(r5)
            r5 = 0
        L_0x022f:
            if (r5 >= r3) goto L_0x0258
            byte r14 = r6[r5]
            r15 = 2
            char[] r7 = new char[r15]
            r16 = r14
            r14 = 0
        L_0x0239:
            if (r14 >= r15) goto L_0x024b
            int r17 = 1 - r14
            r15 = r16 & 15
            char r15 = java.lang.Character.forDigit(r15, r3)
            r7[r17] = r15
            int r16 = r16 >> 4
            int r14 = r14 + 1
            r15 = 2
            goto L_0x0239
        L_0x024b:
            java.lang.String r14 = new java.lang.String
            r14.<init>(r7)
            r12.append(r14)
            int r5 = r5 + 1
            r7 = 8
            goto L_0x022f
        L_0x0258:
            java.lang.String r5 = r12.toString()
            r9.append(r5)
            java.lang.String r5 = r9.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r5)
            te3.xh0 r5 = new te3.xh0
            r5.<init>()
            pe3.b r7 = new pe3.b
            r8 = 0
            r7.<init>(r6, r8, r3)
            r5.f186300d = r7
            java.lang.String r4 = r4.f111966a
            r5.f186301e = r4
            r0.add(r5)
            r7 = 8
            goto L_0x01d4
        L_0x027e:
            te3.ye0 r2 = r11.field_actionInfo
            r2.f186505p = r0
            com.tencent.mm.protocal.protobuf.FinderCommentInfo r0 = r11.mo89532o2()
            r0.extFlag = r13
            r2 = r38
            r11.f188280Q = r2
            r11.f188281R = r10
            java.lang.Class<com.tencent.mm.plugin.FinderCommonFeatureService> r0 = com.tencent.p014mm.plugin.FinderCommonFeatureService.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            com.tencent.mm.plugin.FinderCommonFeatureService r0 = (com.tencent.p014mm.plugin.FinderCommonFeatureService) r0
            up1.c r0 = r0.Ex0()
            f40.o r2 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r2 = r2.mo121142i()
            com.tencent.mm.storage.y1$a r3 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_FINDER_FINDACTION_MAXID_LONG_SYNC
            r6 = 1
            long r8 = r2.mo119673G(r3, r6)
            f40.o r2 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r2 = r2.mo121142i()
            long r6 = r6 + r8
            java.lang.Long r4 = java.lang.Long.valueOf(r6)
            r2.mo119677K(r3, r4)
            r11.field_localCommentId = r8
            android.content.ContentValues r2 = r11.convertTo()
            com.tencent.mm.sdk.storage.ISQLiteDatabase r3 = r0.f188252d
            java.lang.String r4 = "FinderAction"
            java.lang.String r6 = "localCommentId"
            long r2 = r3.insert(r4, r6, r2)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r6 = "new feed action rowId "
            r4.append(r6)
            r4.append(r2)
            r4.append(r5)
            org.json.JSONObject r2 = o40.C61937h.m72709h(r11)
            r4.append(r2)
            java.lang.String r2 = " localID: "
            r4.append(r2)
            r4.append(r8)
            java.lang.String r2 = r4.toString()
            java.lang.String r3 = "Finder.FinderActionStorage"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r2)
            long r2 = r11.field_feedId
            long r4 = r11.mo89531n2()
            long r6 = r11.field_localCommentId
            r8 = 3
            r19 = r0
            r20 = r2
            r22 = r4
            r24 = r6
            r26 = r8
            r27 = r11
            r19.mo89493Lo(r20, r22, r24, r26, r27)
            uq1.a r0 = new uq1.a
            r0.<init>(r11)
            u60.f<uq1.a> r2 = r1.f188288a
            uq1.b r3 = new uq1.b
            r3.<init>(r1)
            r2.mo89349c(r0, r3)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: uq1.C65430c.mo89550a(long, java.lang.String, long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Long, java.lang.String, java.lang.String, java.lang.String, int, boolean, com.tencent.mm.protocal.protobuf.FinderCommentInfo, te3.hj1, int, java.util.List, java.util.LinkedList, java.lang.String):up1.w0");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0096, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0097, code lost:
        cy3.C58003b.m67160a(r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x009a, code lost:
        throw r2;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo89551b() {
        /*
            r6 = this;
            java.lang.Class<com.tencent.mm.plugin.FinderCommonFeatureService> r0 = com.tencent.p014mm.plugin.FinderCommonFeatureService.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            com.tencent.mm.plugin.FinderCommonFeatureService r0 = (com.tencent.p014mm.plugin.FinderCommonFeatureService) r0
            up1.c r0 = r0.Ex0()
            o40.b r1 = new o40.b
            java.lang.String r2 = "getRecentAction"
            r1.<init>(r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = r0.f188253e
            r2.append(r3)
            java.lang.String r3 = " WHERE actionType = "
            r2.append(r3)
            r3 = 1
            r2.append(r3)
            java.lang.String r3 = " and state == 1 ORDER BY postTime DESC limit 1"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            com.tencent.mm.sdk.storage.ISQLiteDatabase r0 = r0.f188252d
            r3 = 0
            r4 = 2
            android.database.Cursor r0 = r0.rawQuery(r2, r3, r4)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "getRecentAction "
            r4.append(r5)
            r4.append(r1)
            r1 = 32
            r4.append(r1)
            r4.append(r2)
            java.lang.String r1 = r4.toString()
            java.lang.String r2 = "Finder.FinderActionStorage"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r1)
            boolean r1 = r0.moveToFirst()     // Catch:{ all -> 0x0094 }
            if (r1 == 0) goto L_0x006a
        L_0x005b:
            up1.w0 r1 = new up1.w0     // Catch:{ all -> 0x0094 }
            r1.<init>()     // Catch:{ all -> 0x0094 }
            r1.convertFrom(r0)     // Catch:{ all -> 0x0094 }
            boolean r4 = r0.moveToNext()     // Catch:{ all -> 0x0094 }
            if (r4 != 0) goto L_0x005b
            goto L_0x006b
        L_0x006a:
            r1 = r3
        L_0x006b:
            rx3.b0 r4 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x0094 }
            cy3.C58003b.m67160a(r0, r3)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r5)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
            if (r1 == 0) goto L_0x0093
            uq1.a r0 = new uq1.a
            r0.<init>(r1)
            u60.f<uq1.a> r1 = r6.f188288a
            uq1.b r2 = new uq1.b
            r2.<init>(r6)
            r1.mo89349c(r0, r2)
        L_0x0093:
            return
        L_0x0094:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0096 }
        L_0x0096:
            r2 = move-exception
            cy3.C58003b.m67160a(r0, r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: uq1.C65430c.mo89551b():void");
    }
}
