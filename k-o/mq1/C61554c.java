package mq1;

import u60.C65222f;
import v60.C102152a;
import v60.C102156f;
import v60.C102157g;

/* renamed from: mq1.c */
public final class C61554c {

    /* renamed from: c */
    public static final C61554c f174955c = new C61554c();

    /* renamed from: a */
    public C65222f<C61556d> f174956a = new C65222f<>(new C102156f(new C102152a(100, Integer.MAX_VALUE), new C102157g(1, 5), 1, "uni_action_post_quene"));

    /* renamed from: b */
    public final Runnable f174957b = new C61555a(this);

    /* renamed from: mq1.c$a */
    public static final class C61555a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C61554c f174958d;

        public C61555a(C61554c cVar) {
            this.f174958d = cVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0097, code lost:
            r2 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0098, code lost:
            cy3.C58003b.m67160a(r1, r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x009b, code lost:
            throw r2;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
                r7 = this;
                mq1.c r0 = r7.f174958d
                r0.getClass()
                sq1.d$a r1 = sq1.C64149d.f181862f
                sq1.d r1 = r1.mo88889a()
                o40.b r2 = new o40.b
                java.lang.String r3 = "getRecentAction"
                r2.<init>(r3)
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = r1.f181867e
                r3.append(r4)
                java.lang.String r4 = " WHERE actionType = "
                r3.append(r4)
                r4 = 1
                r3.append(r4)
                java.lang.String r4 = " and state == 1 ORDER BY postTime DESC limit 1"
                r3.append(r4)
                java.lang.String r3 = r3.toString()
                com.tencent.mm.sdk.storage.ISQLiteDatabase r1 = r1.f181866d
                r4 = 0
                r5 = 2
                android.database.Cursor r1 = r1.rawQuery(r3, r4, r5)
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                java.lang.String r6 = "getRecentAction "
                r5.append(r6)
                r5.append(r2)
                r2 = 32
                r5.append(r2)
                r5.append(r3)
                java.lang.String r2 = r5.toString()
                java.lang.String r3 = "MicroMsg.MusicUni.UniActionStorage"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r2)
                boolean r2 = r1.moveToFirst()     // Catch:{ all -> 0x0095 }
                if (r2 == 0) goto L_0x0069
            L_0x005a:
                sq1.b r2 = new sq1.b     // Catch:{ all -> 0x0095 }
                r2.<init>()     // Catch:{ all -> 0x0095 }
                r2.convertFrom(r1)     // Catch:{ all -> 0x0095 }
                boolean r5 = r1.moveToNext()     // Catch:{ all -> 0x0095 }
                if (r5 != 0) goto L_0x005a
                goto L_0x006a
            L_0x0069:
                r2 = r4
            L_0x006a:
                rx3.b0 r5 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x0095 }
                cy3.C58003b.m67160a(r1, r4)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r6)
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r1)
                if (r2 == 0) goto L_0x0094
                mq1.d r1 = new mq1.d
                qq1.a r3 = r2.f181859P
                r1.<init>(r2, r3)
                u60.f<mq1.d> r2 = r0.f174956a
                mq1.b r3 = new mq1.b
                r3.<init>(r0)
                r2.mo89349c(r1, r3)
            L_0x0094:
                return
            L_0x0095:
                r0 = move-exception
                throw r0     // Catch:{ all -> 0x0097 }
            L_0x0097:
                r2 = move-exception
                cy3.C58003b.m67160a(r1, r0)
                throw r2
            */
            throw new UnsupportedOperationException("Method not decompiled: mq1.C61554c.C61555a.run():void");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:55:0x018b  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x01a6  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final sq1.C64147b mo86490a(long r18, java.lang.String r20, long r21, java.lang.String r23, java.lang.String r24, java.lang.String r25, java.lang.String r26, java.lang.Long r27, java.lang.String r28, java.lang.String r29, java.lang.String r30, int r31, boolean r32, com.tencent.p014mm.protocal.protobuf.FinderCommentInfo r33, int r34, java.util.List<lq1.C46889a> r35, java.util.LinkedList<java.lang.String> r36, qq1.C63317a r37) {
        /*
            r17 = this;
            r1 = r17
            r0 = r20
            r2 = r23
            r3 = r24
            r4 = r25
            r5 = r26
            r6 = r29
            r7 = r30
            r8 = r31
            r9 = r33
            r10 = r37
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
            r12 = r35
            gy3.C87412m.m108594g(r12, r11)
            java.lang.String r11 = "uniEntityItem"
            gy3.C87412m.m108594g(r10, r11)
            sq1.b r11 = new sq1.b
            r11.<init>()
            r12 = 1
            r11.field_actionType = r12
            r13 = r21
            r11.field_feedId = r13
            r11.field_objectNonceId = r2
            r13 = r18
            r11.field_localCommentId = r13
            com.tencent.mm.protocal.protobuf.FinderCommentInfo r2 = r11.mo88876n2()
            r12 = 0
            r2.displayid = r12
            if (r9 == 0) goto L_0x0061
            long r14 = r9.commentId
            goto L_0x0062
        L_0x0061:
            r14 = r12
        L_0x0062:
            te3.ye0 r2 = r11.field_actionInfo
            r2.f186500h = r14
            java.lang.String r2 = ""
            r14 = 0
            r15 = 1
            if (r8 != r15) goto L_0x008d
            com.tencent.mm.protocal.protobuf.FinderCommentInfo r15 = r11.mo88876n2()
            r15.username = r6
            fe1.d$b r15 = fe1.C58961d.f168673a
            zc1.b r16 = zc1.C66785b.f191882e
            java.lang.String r12 = r16.mo90662O5()
            fe1.q r12 = r15.mo84155b(r12)
            if (r12 == 0) goto L_0x0085
            java.lang.String r12 = r12.getAvatarUrl()
            goto L_0x0086
        L_0x0085:
            r12 = r2
        L_0x0086:
            com.tencent.mm.protocal.protobuf.FinderCommentInfo r13 = r11.mo88876n2()
            r13.headUrl = r12
            goto L_0x00ec
        L_0x008d:
            java.lang.String r12 = eb0.C75592q0.m90789s()
            java.lang.String r13 = "getUsernameFromUserInfo()"
            gy3.C87412m.m108593f(r12, r13)
            com.tencent.mm.protocal.protobuf.FinderCommentInfo r13 = r11.mo88876n2()
            r13.username = r12
            java.lang.Class<ln.g> r12 = p196ln.C76706g.class
            di3.d r12 = di3.C86312j.m106911c(r12)
            ln.g r12 = (p196ln.C76706g) r12
            ln.n r12 = r12.mo106832eg()
            java.lang.String r13 = r11.getUsername()
            com.tencent.mm.modelavatar.o r12 = (com.tencent.p014mm.modelavatar.C68098o) r12
            com.tencent.mm.modelavatar.n r12 = r12.mo93607Lo(r13)
            if (r12 == 0) goto L_0x00dc
            java.lang.String r13 = r12.mo93594c()
            if (r13 == 0) goto L_0x00c3
            int r13 = r13.length()
            if (r13 != 0) goto L_0x00c1
            goto L_0x00c3
        L_0x00c1:
            r13 = 0
            goto L_0x00c4
        L_0x00c3:
            r13 = 1
        L_0x00c4:
            if (r13 == 0) goto L_0x00cd
            java.lang.String r12 = r12.mo93597f()
            java.lang.String r13 = "imgFlag.smallUrl"
            goto L_0x00d3
        L_0x00cd:
            java.lang.String r12 = r12.mo93594c()
            java.lang.String r13 = "imgFlag.bigUrl"
        L_0x00d3:
            gy3.C87412m.m108593f(r12, r13)
            com.tencent.mm.protocal.protobuf.FinderCommentInfo r13 = r11.mo88876n2()
            r13.headUrl = r12
        L_0x00dc:
            java.lang.String r12 = r11.mo88880r2()
            boolean r12 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r12)
            if (r12 == 0) goto L_0x00ec
            com.tencent.mm.protocal.protobuf.FinderCommentInfo r12 = r11.mo88876n2()
            r12.headUrl = r2
        L_0x00ec:
            if (r3 == 0) goto L_0x00f4
            com.tencent.mm.protocal.protobuf.FinderCommentInfo r12 = r11.mo88876n2()
            r12.content = r3
        L_0x00f4:
            com.tencent.mm.protocal.protobuf.FinderCommentInfo r3 = r11.mo88876n2()
            r3.nickname = r7
            long r12 = eb0.C31543z5.m39451a()
            r15 = 1000(0x3e8, double:4.94E-321)
            long r12 = r12 / r15
            com.tencent.mm.protocal.protobuf.FinderCommentInfo r3 = r11.mo88876n2()
            r3.createtime = r12
            boolean r3 = gy3.C87412m.m108589b(r6, r0)
            if (r3 == 0) goto L_0x0111
            r3 = 2
            r3 = 1
            r6 = 2
            goto L_0x0118
        L_0x0111:
            r3 = 1
            if (r8 != r3) goto L_0x0117
            r6 = 8
            goto L_0x0118
        L_0x0117:
            r6 = 0
        L_0x0118:
            com.tencent.mm.protocal.protobuf.FinderCommentInfo r7 = r11.mo88876n2()
            r7.displayFlag = r6
            r11.field_state = r3
            r3 = 0
            if (r27 == 0) goto L_0x01a9
            r27.longValue()
            long r6 = r27.longValue()
            com.tencent.mm.protocal.protobuf.FinderCommentInfo r12 = r11.mo88876n2()
            r12.replyCommentId = r6
            if (r28 != 0) goto L_0x0134
            r6 = r2
            goto L_0x0136
        L_0x0134:
            r6 = r28
        L_0x0136:
            com.tencent.mm.protocal.protobuf.FinderCommentInfo r7 = r11.mo88876n2()
            r7.reply_content = r6
            com.tencent.mm.protocal.protobuf.FinderCommentInfo r6 = r11.mo88876n2()
            r6.reply_username = r4
            com.tencent.mm.protocal.protobuf.FinderCommentInfo r6 = r11.mo88876n2()
            r6.replyNickname = r5
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isEqual((java.lang.String) r4, (java.lang.String) r0)
            if (r0 == 0) goto L_0x015a
            int r0 = r11.mo88877o2()
            r0 = r0 | 4
            com.tencent.mm.protocal.protobuf.FinderCommentInfo r4 = r11.mo88876n2()
            r4.displayFlag = r0
        L_0x015a:
            if (r32 == 0) goto L_0x0168
            int r0 = r11.mo88877o2()
            r0 = r0 | 16
            com.tencent.mm.protocal.protobuf.FinderCommentInfo r4 = r11.mo88876n2()
            r4.displayFlag = r0
        L_0x0168:
            if (r9 == 0) goto L_0x01a9
            te3.ye0 r4 = r11.field_actionInfo
            com.tencent.mm.protocal.protobuf.FinderCommentInfo r0 = new com.tencent.mm.protocal.protobuf.FinderCommentInfo
            r0.<init>()
            byte[] r5 = r33.toByteArray()
            if (r5 != 0) goto L_0x0178
            goto L_0x0188
        L_0x0178:
            r0.parseFrom(r5)     // Catch:{ Exception -> 0x017c }
            goto L_0x0189
        L_0x017c:
            r0 = move-exception
            r5 = r0
            r6 = 1
            java.lang.Object[] r0 = new java.lang.Object[r6]
            r0[r14] = r5
            java.lang.String r5 = "safeParser"
            com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r5, r2, r0)
        L_0x0188:
            r0 = r3
        L_0x0189:
            if (r0 == 0) goto L_0x01a6
            int r2 = r0.expandCommentCount
            int r2 = r2 + -1
            r0.expandCommentCount = r2
            r0.upContinueFlag = r14
            if (r2 <= 0) goto L_0x0196
            r14 = 1
        L_0x0196:
            r0.continueFlag = r14
            java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderCommentInfo> r2 = r0.levelTwoComment
            if (r2 == 0) goto L_0x019f
            r2.clear()
        L_0x019f:
            r0.lastBuffer = r3
            r5 = 0
            r0.displayid = r5
            goto L_0x01a7
        L_0x01a6:
            r0 = r3
        L_0x01a7:
            r4.f186501i = r0
        L_0x01a9:
            java.lang.String r0 = java.lang.String.valueOf(r18)
            java.lang.String r2 = "value"
            gy3.C87412m.m108594g(r0, r2)
            com.tencent.mm.protocal.protobuf.FinderCommentInfo r2 = r11.mo88876n2()
            r2.client_id = r0
            r11.field_scene = r8
            long r4 = java.lang.System.currentTimeMillis()
            r11.field_postTime = r4
            r4 = 0
            r11.field_tryCount = r4
            te3.ye0 r0 = r11.field_actionInfo
            r0.f186503n = r3
            r2 = r34
            r0.f186504o = r2
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            te3.ye0 r2 = r11.field_actionInfo
            r2.f186505p = r0
            com.tencent.mm.protocal.protobuf.FinderCommentInfo r0 = r11.mo88876n2()
            r2 = 1
            r0.extFlag = r2
            r2 = r36
            r11.f181860Q = r2
            sq1.d$a r0 = sq1.C64149d.f181862f
            sq1.d r0 = r0.mo88889a()
            f40.o r2 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r2 = r2.mo121142i()
            com.tencent.mm.storage.y1$a r3 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_UNICOMMENT_FINDACTION_MAXID_LONG_SYNC
            r4 = 1
            long r6 = r2.mo119673G(r3, r4)
            f40.o r2 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r2 = r2.mo121142i()
            long r4 = r4 + r6
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r2.mo119677K(r3, r4)
            r11.field_localCommentId = r6
            android.content.ContentValues r2 = r11.convertTo()
            com.tencent.mm.sdk.storage.ISQLiteDatabase r3 = r0.f181866d
            java.lang.String r4 = "UniAction"
            java.lang.String r5 = "localCommentId"
            long r2 = r3.insert(r4, r5, r2)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "new feed action rowId "
            r4.append(r5)
            r4.append(r2)
            r2 = 32
            r4.append(r2)
            org.json.JSONObject r2 = o40.C61937h.m72709h(r11)
            r4.append(r2)
            java.lang.String r2 = " localID: "
            r4.append(r2)
            r4.append(r6)
            java.lang.String r2 = r4.toString()
            java.lang.String r3 = "MicroMsg.MusicUni.UniActionStorage"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r2)
            long r2 = r11.field_feedId
            long r4 = r11.mo88875m2()
            long r6 = r11.field_localCommentId
            r8 = 3
            r18 = r0
            r19 = r2
            r21 = r4
            r23 = r6
            r25 = r8
            r26 = r11
            r18.mo88887jo(r19, r21, r23, r25, r26)
            mq1.d r0 = new mq1.d
            r0.<init>(r11, r10)
            u60.f<mq1.d> r2 = r1.f174956a
            mq1.b r3 = new mq1.b
            r3.<init>(r1)
            r2.mo89349c(r0, r3)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: mq1.C61554c.mo86490a(long, java.lang.String, long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Long, java.lang.String, java.lang.String, java.lang.String, int, boolean, com.tencent.mm.protocal.protobuf.FinderCommentInfo, int, java.util.List, java.util.LinkedList, qq1.a):sq1.b");
    }
}
