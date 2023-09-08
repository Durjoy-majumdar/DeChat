package com.tencent.p014mm.pluginsdk.model;

import ob0.C35136m;
import ob0.C35141t;
import p872ah.C67046a;

/* renamed from: com.tencent.mm.pluginsdk.model.x */
public class C72713x implements C35141t {
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x017c, code lost:
        if (((com.tencent.p014mm.storage.C72972g4) ((f62.C75700k0) f40.C86709a0.m107533q(r9)).mo96095LE()).h30(r0.f284160a, r0.f284169j).mo108774y2() == r0.f284169j) goto L_0x021d;
     */
    /* renamed from: Fg */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ob0.C35136m.C35139b mo56403Fg(ob0.C35136m.C35137a r26) {
        /*
            r25 = this;
            r1 = r26
            te3.j3 r2 = r1.f94242a
            java.lang.String r3 = "MicroMsg.EmojiExtension"
            r4 = 0
            if (r2 == 0) goto L_0x039e
            int r0 = r2.f227630g
            r5 = 47
            if (r0 == r5) goto L_0x0011
            goto L_0x039e
        L_0x0011:
            te3.rv3 r0 = r2.f227628e
            java.lang.String r0 = sf0.C48374j0.m53718g(r0)
            te3.rv3 r6 = r2.f227629f
            java.lang.String r6 = sf0.C48374j0.m53718g(r6)
            eb0.c r7 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.v1 r7 = r7.mo105906u()
            r8 = 2
            java.lang.Object r7 = r7.mo119684e(r8, r4)
            java.lang.String r7 = (java.lang.String) r7
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L_0x0033
            r0 = r6
        L_0x0033:
            te3.rv3 r6 = r2.f227631h
            java.lang.String r6 = sf0.C48374j0.m53718g(r6)
            java.lang.Class<z51.g> r7 = z51.C39315g.class
            di3.d r7 = di3.C86312j.m106911c(r7)
            z51.g r7 = (z51.C39315g) r7
            zc3.a r7 = r7.mo58035cm()
            long r9 = r2.f227638r
            java.lang.String r11 = r2.f227636p
            i61.h r7 = (i61.C98602h) r7
            r7.getClass()
            java.lang.Class<aq.g> r7 = p441aq.C92054g.class
            boolean r12 = com.tencent.p014mm.storage.C72996z1.m85812O4(r0)
            java.lang.String r13 = "prepareEmoji failed. emoji msg info is null."
            java.lang.String r14 = ""
            r15 = 3
            r4 = 1
            r5 = 0
            if (r12 == 0) goto L_0x025f
            java.lang.Class<dq.c> r12 = p495dq.C97518c.class
            di3.d r12 = di3.C86312j.m106911c(r12)
            dq.c r12 = (p495dq.C97518c) r12
            r12.getClass()
            com.tencent.mm.storage.s2 r0 = com.tencent.p014mm.storage.C96985s2.m124654a(r0, r6, r11)
            java.lang.String r6 = "MicroMsg.emoji.EmojiBypService"
            if (r0 != 0) goto L_0x0076
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r13)
            goto L_0x0316
        L_0x0076:
            r0.f284169j = r9
            java.lang.Object[] r11 = new java.lang.Object[r8]
            java.lang.Long r9 = java.lang.Long.valueOf(r9)
            r11[r5] = r9
            com.tencent.mm.sdk.platformtools.MMStack r9 = com.tencent.p014mm.sdk.platformtools.Util.getStack()
            r11[r4] = r9
            java.lang.String r9 = "prepareEmoji msgSvrId[%d], stack[%s]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r9, r11)
            java.lang.String r9 = r0.f284168i
            com.tencent.mm.sdk.platformtools.MMHandlerThread r10 = f40.C86709a0.m107525e()
            dq.b r11 = new dq.b
            r11.<init>(r12, r9)
            r10.postToWorker(r11)
            java.lang.Class<f62.k0> r9 = f62.C75700k0.class
            te3.j3 r10 = r1.f94242a
            if (r10 == 0) goto L_0x00b9
            long r10 = r10.f227638r
            long r12 = r0.f284169j
            int r16 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r16 != 0) goto L_0x00b9
            int r10 = eb0.C75604z3.m90845q(r26)
            r0.f284180u = r10
            te3.j3 r10 = r1.f94242a
            int r11 = r10.f227639s
            r0.f284181v = r11
            int r10 = r10.f227635o
            long r10 = (long) r10
            r0.f284182w = r10
        L_0x00b9:
            di3.d r10 = di3.C86312j.m106911c(r7)
            aq.g r10 = (p441aq.C92054g) r10
            r10.getClass()
            com.tencent.mm.storage.w2 r10 = com.tencent.p014mm.storage.C30790w2.m39221h()
            wh3.g r10 = r10.mo57717d()
            java.lang.String r11 = r0.f284163d
            com.tencent.mm.storage.emotion.EmojiInfo r10 = r10.mo142044TO(r11)
            if (r10 == 0) goto L_0x0101
            java.lang.Object[] r11 = new java.lang.Object[r15]
            java.lang.String r12 = r10.field_md5
            r11[r5] = r12
            java.lang.String r12 = r0.f284163d
            r11[r4] = r12
            long r12 = r0.f284169j
            java.lang.Long r12 = java.lang.Long.valueOf(r12)
            r11[r8] = r12
            java.lang.String r12 = "downloadEmoji: db emoji info not null %s msgInfomd5 %s svrId %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r12, r11)
            u61.C101964h.m134220b(r0, r10)
            di3.d r7 = di3.C86312j.m106911c(r7)
            aq.g r7 = (p441aq.C92054g) r7
            r7.getClass()
            com.tencent.mm.storage.w2 r7 = com.tencent.p014mm.storage.C30790w2.m39221h()
            wh3.g r7 = r7.mo57717d()
            r7.r50(r10)
            goto L_0x013d
        L_0x0101:
            java.lang.Object[] r10 = new java.lang.Object[r4]
            java.lang.String r11 = r0.f284163d
            r10[r5] = r11
            java.lang.String r11 = "downloadEmoji: create emoji info %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r11, r10)
            java.lang.Object[] r10 = new java.lang.Object[r4]
            java.lang.String r11 = r0.f284163d
            r10[r5] = r11
            java.lang.String r11 = "createEmojiInfo: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r11, r10)
            com.tencent.mm.storage.emotion.EmojiInfo r10 = new com.tencent.mm.storage.emotion.EmojiInfo
            r10.<init>()
            u61.C101964h.m134220b(r0, r10)
            r10.field_temp = r4
            r11 = 8
            r10.field_state = r11
            r11 = 65
            r10.field_catalog = r11
            di3.d r7 = di3.C86312j.m106911c(r7)
            aq.g r7 = (p441aq.C92054g) r7
            r7.getClass()
            com.tencent.mm.storage.w2 r7 = com.tencent.p014mm.storage.C30790w2.m39221h()
            wh3.g r7 = r7.mo57717d()
            r7.mo142040Ow(r10)
        L_0x013d:
            boolean r7 = r0.f284179t
            if (r7 == 0) goto L_0x021d
            java.lang.Object[] r7 = new java.lang.Object[r15]
            java.lang.String r11 = r0.f284163d
            r7[r5] = r11
            java.lang.String r11 = r10.field_md5
            r7[r4] = r11
            long r11 = r0.f284169j
            java.lang.Long r11 = java.lang.Long.valueOf(r11)
            r7[r8] = r11
            java.lang.String r11 = "insertEmojiMsg: %s, %s msgSvrId: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r11, r7)
            long r11 = r0.f284169j
            r16 = 0
            int r7 = (r11 > r16 ? 1 : (r11 == r16 ? 0 : -1))
            if (r7 == 0) goto L_0x0180
            k40.a r7 = f40.C86709a0.m107533q(r9)
            f62.k0 r7 = (f62.C75700k0) r7
            g62.l r7 = r7.mo96095LE()
            java.lang.String r11 = r0.f284160a
            long r12 = r0.f284169j
            com.tencent.mm.storage.g4 r7 = (com.tencent.p014mm.storage.C72972g4) r7
            com.tencent.mm.storage.f4 r7 = r7.h30(r11, r12)
            long r11 = r7.mo108774y2()
            long r4 = r0.f284169j
            int r7 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r7 != 0) goto L_0x0180
            goto L_0x021d
        L_0x0180:
            k40.a r4 = f40.C86709a0.m107533q(r9)
            f62.k0 r4 = (f62.C75700k0) r4
            com.tencent.mm.storage.u3 r4 = r4.mo96097Ni()
            java.lang.String r5 = r0.f284160a
            com.tencent.mm.storage.z1 r4 = r4.get(r5)
            if (r4 == 0) goto L_0x0197
            long r4 = r4.f108320R1
            int r5 = (int) r4
            if (r5 != 0) goto L_0x01ae
        L_0x0197:
            com.tencent.mm.storage.z1 r4 = new com.tencent.mm.storage.z1
            java.lang.String r5 = r0.f284160a
            r4.<init>(r5)
            r4.setType(r8)
            k40.a r5 = f40.C86709a0.m107533q(r9)
            f62.k0 r5 = (f62.C75700k0) r5
            com.tencent.mm.storage.u3 r5 = r5.mo96097Ni()
            r5.mo69667P3(r4)
        L_0x01ae:
            com.tencent.mm.storage.f4 r4 = new com.tencent.mm.storage.f4
            r4.<init>()
            r5 = 47
            r4.setType(r5)
            java.lang.String r5 = r0.f284160a
            r4.mo108749c3(r5)
            java.lang.String r5 = r0.f284161b
            boolean r5 = eb0.C75592q0.m90764L(r5)
            r4.mo108740T2(r5)
            java.lang.String r5 = r10.getMd5()
            r4.mo108739S2(r5)
            long r11 = r0.f284169j
            r4.mo108745Y2(r11)
            java.lang.String r5 = r0.f284161b
            r19 = 0
            boolean r7 = r10.mo62678k()
            if (r7 != 0) goto L_0x01e5
            boolean r7 = r10.mo135617o2()
            if (r7 != 0) goto L_0x01e5
            r21 = 1
            goto L_0x01e7
        L_0x01e5:
            r21 = 0
        L_0x01e7:
            java.lang.String r22 = r10.getMd5()
            r23 = 0
            java.lang.String r7 = r0.f284170k
            r18 = r5
            r24 = r7
            java.lang.String r5 = com.tencent.p014mm.storage.C72989o2.m85759f(r18, r19, r21, r22, r23, r24)
            r4.mo108732L2(r5)
            java.lang.String r5 = r4.mo108768t()
            long r11 = r0.f284182w
            long r11 = eb0.C75604z3.m90841m(r5, r11)
            r4.mo108733M2(r11)
            r4.mo100991d(r15)
            java.lang.String r5 = r0.f284171l
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)
            if (r5 != 0) goto L_0x0217
            java.lang.String r5 = r0.f284171l
            r4.mo101012p4(r5)
        L_0x0217:
            eb0.C75604z3.m90842n(r4, r1)
            eb0.C75604z3.m90852x(r4)
        L_0x021d:
            java.lang.Object[] r1 = new java.lang.Object[r8]
            java.lang.String r4 = r10.getMd5()
            r5 = 0
            r1[r5] = r4
            boolean r4 = r10.mo62633C1()
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            r5 = 1
            r1[r5] = r4
            java.lang.String r4 = "start download emoji %s, fileExist %b"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r4, r1)
            boolean r1 = r10.mo62633C1()
            if (r1 != 0) goto L_0x0316
            java.lang.String r1 = "cdnurl and cncrypt url is null. "
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r1)
            k40.a r1 = f40.C86709a0.m107533q(r9)
            f62.k0 r1 = (f62.C75700k0) r1
            g62.l r1 = r1.mo96095LE()
            g62.l$e r4 = new g62.l$e
            java.lang.String r0 = r0.f284160a
            java.lang.String r5 = "update"
            r6 = 0
            r7 = 0
            r4.<init>(r0, r5, r6, r7)
            com.tencent.mm.storage.g4 r1 = (com.tencent.p014mm.storage.C72972g4) r1
            r1.mo101123jo(r4)
            goto L_0x0316
        L_0x025f:
            di3.d r4 = di3.C86312j.m106911c(r7)
            aq.g r4 = (p441aq.C92054g) r4
            r4.getClass()
            com.tencent.mm.storage.s2 r5 = com.tencent.p014mm.storage.C96985s2.m124654a(r0, r6, r11)
            java.lang.String r6 = "MicroMsg.EmojiFeatureService"
            if (r5 != 0) goto L_0x0275
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r13)
            goto L_0x0316
        L_0x0275:
            r5.f284169j = r9
            r7 = 1
            java.lang.Object[] r0 = new java.lang.Object[r7]
            java.lang.Long r7 = java.lang.Long.valueOf(r9)
            r8 = 0
            r0[r8] = r7
            java.lang.String r7 = "summerbadcr prepareEmoji msgSvrId[%d]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r7, r0)
            java.lang.String r0 = r5.f284159G
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 == 0) goto L_0x0290
            goto L_0x02cc
        L_0x0290:
            java.lang.String r0 = r5.f284159G
            byte[] r0 = android.util.Base64.decode(r0, r8)
            te3.t03 r7 = new te3.t03
            r7.<init>()
            r7.parseFrom(r0)     // Catch:{ IOException -> 0x02c5 }
            com.tencent.mm.storage.w2 r0 = com.tencent.p014mm.storage.C30790w2.m39221h()     // Catch:{ IOException -> 0x02c5 }
            wh3.f r0 = r0.mo57714a()     // Catch:{ IOException -> 0x02c5 }
            java.lang.String r8 = r5.f284168i     // Catch:{ IOException -> 0x02c5 }
            java.lang.String r9 = r5.f284163d     // Catch:{ IOException -> 0x02c5 }
            r0.mo61532jo(r7, r8, r9)     // Catch:{ IOException -> 0x02c5 }
            java.util.LinkedList<te3.pm2> r0 = r7.f141885d     // Catch:{ IOException -> 0x02c5 }
            if (r0 == 0) goto L_0x02cc
            java.lang.String r7 = "emoji desc %s"
            r8 = 1
            java.lang.Object[] r9 = new java.lang.Object[r8]     // Catch:{ IOException -> 0x02c5 }
            int r0 = r0.size()     // Catch:{ IOException -> 0x02c5 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ IOException -> 0x02c5 }
            r8 = 0
            r9[r8] = r0     // Catch:{ IOException -> 0x02c5 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r7, r9)     // Catch:{ IOException -> 0x02c5 }
            goto L_0x02cc
        L_0x02c5:
            r0 = move-exception
            r7 = 0
            java.lang.Object[] r8 = new java.lang.Object[r7]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r6, r0, r14, r8)
        L_0x02cc:
            java.lang.Class<lc3.b> r0 = lc3.C10485b.class
            k40.a r0 = f40.C86709a0.m107533q(r0)
            lc3.b r0 = (lc3.C10485b) r0
            pj.f r0 = r0.vh0()
            java.lang.String r6 = "C2CEmojiNotAutoDownloadTimeRange"
            java.lang.String r0 = r0.mo107405c(r6)
            int r6 = com.tencent.p014mm.plugin.emoji.model.EmojiLogic.f268226a
            java.lang.String r6 = "MicroMsg.emoji.EmojiLogic"
            boolean r7 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r7 != 0) goto L_0x030e
            boolean r7 = xb0.C38471b.m41885a(r0)     // Catch:{ Exception -> 0x02fd }
            if (r7 == 0) goto L_0x030e
            java.lang.String r7 = "In Not Auto Download Time Range. timeRange:%s"
            r8 = 1
            java.lang.Object[] r9 = new java.lang.Object[r8]     // Catch:{ Exception -> 0x02fd }
            r8 = 0
            r9[r8] = r0     // Catch:{ Exception -> 0x02fd }
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r6, r7, r9)     // Catch:{ Exception -> 0x02fd }
            r7 = 1
            r16 = 1
            goto L_0x0311
        L_0x02fd:
            r0 = move-exception
            r7 = 1
            java.lang.Object[] r8 = new java.lang.Object[r7]
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.stackTraceToString(r0)
            r9 = 0
            r8[r9] = r0
            java.lang.String r0 = "isInNotAutoDownloadTimeRange :%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r6, r0, r8)
            goto L_0x030f
        L_0x030e:
            r7 = 1
        L_0x030f:
            r16 = 0
        L_0x0311:
            r0 = r16 ^ 1
            r4.vx0(r5, r1, r0)
        L_0x0316:
            java.lang.String r0 = r2.f227636p
            eb0.z3$$h r0 = eb0.C75604z3.m90851w(r0)
            if (r0 == 0) goto L_0x039c
            r1 = 1
            java.lang.Object[] r4 = new java.lang.Object[r1]
            java.lang.String r5 = r0.f222098e
            r6 = 0
            r4[r6] = r5
            java.lang.String r5 = "bizClientMsgId = %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r5, r4)
            java.lang.String r3 = r0.f222103j
            if (r3 == 0) goto L_0x039c
            int r3 = r0.f222104k
            if (r3 != r1) goto L_0x039c
            te3.rv3 r3 = r2.f227628e
            java.lang.String r3 = sf0.C48374j0.m53718g(r3)
            eb0.c r4 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.v1 r4 = r4.mo105906u()
            r5 = 73729(0x12001, float:1.03316E-40)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r4.mo119676J(r5, r1)
            com.tencent.mm.storage.b4 r1 = new com.tencent.mm.storage.b4
            r1.<init>()
            android.content.Context r4 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r5 = 2131833481(0x7f113289, float:1.9300045E38)
            java.lang.String r4 = r4.getString(r5)
            r1.field_content = r4
            long r4 = com.tencent.p014mm.sdk.platformtools.Util.nowSecond()
            r1.field_createtime = r4
            r1.field_imgpath = r14
            java.lang.String r4 = r1.field_content
            r1.field_sayhicontent = r4
            r1.field_sayhiuser = r3
            r4 = 18
            r1.field_scene = r4
            int r4 = r2.f227632i
            if (r4 <= r15) goto L_0x0374
            r15 = r4
        L_0x0374:
            r1.field_status = r15
            long r4 = r2.f227638r
            r1.field_svrid = r4
            r1.field_talker = r3
            int r2 = r2.f227630g
            r1.field_type = r2
            r2 = 0
            r1.field_isSend = r2
            r1.field_sayhiencryptuser = r3
            java.lang.String r0 = r0.f222103j
            r1.field_ticket = r0
            com.tencent.mm.storage.c4 r0 = fd0.C75743h.xx0()
            r0.insert(r1)
            com.tencent.mm.autogen.events.LbsSayHiEvent r0 = new com.tencent.mm.autogen.events.LbsSayHiEvent
            r0.<init>()
            com.tencent.mm.autogen.events.LbsSayHiEvent$a r1 = r0.f193718d
            r1.f193719a = r3
            r0.publish()
        L_0x039c:
            r1 = 0
            return r1
        L_0x039e:
            r1 = r4
            java.lang.String r0 = "parseEmojiMsg failed, invalid cmdAM"
            com.tencent.p014mm.sdk.platformtools.Log.m105922f(r3, r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.pluginsdk.model.C72713x.mo56403Fg(ob0.m$a):ob0.m$b");
    }

    /* renamed from: ld */
    public void mo56404ld(C35136m.C35138c cVar) {
    }

    /* renamed from: nA */
    public /* synthetic */ boolean mo56405nA(C67046a aVar, String str, long j, String str2, String str3, String str4, int i, String str5, String str6, String str7, int i2) {
        return false;
    }
}
