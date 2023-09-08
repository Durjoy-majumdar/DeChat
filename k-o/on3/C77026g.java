package on3;

import f62.C31924c1;

/* renamed from: on3.g */
public final class C77026g implements C31924c1 {
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0049, code lost:
        r2 = z04.C66731x.m78731e(r2);
     */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00e6 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00e7  */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo8730o(java.lang.String r18, java.util.Map<java.lang.String, java.lang.String> r19, ob0.C35136m.C35137a r20) {
        /*
            r17 = this;
            r0 = r18
            r1 = r19
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "onNewXmlReceived() called with: subType = "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r3 = ", values = "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r3 = ", addMsgInfo = "
            r2.append(r3)
            r3 = r20
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "MicroMsg.TopMsgNewXmlReceiver"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r3, r2)
            if (r1 == 0) goto L_0x0256
            java.lang.String r2 = "mmchatroomtopmsg"
            boolean r0 = gy3.C87412m.m108589b(r0, r2)
            if (r0 == 0) goto L_0x0256
            java.lang.String r0 = ".sysmsg.mmchatroomtopmsg.chatroomname"
            java.lang.Object r0 = r1.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r2 = ".sysmsg.mmchatroomtopmsg.id"
            java.lang.Object r2 = r1.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            r4 = 0
            if (r2 == 0) goto L_0x0054
            java.lang.Integer r2 = z04.C66731x.m78731e(r2)
            if (r2 == 0) goto L_0x0054
            int r2 = r2.intValue()
            goto L_0x0055
        L_0x0054:
            r2 = 0
        L_0x0055:
            java.lang.String r5 = ".sysmsg.mmchatroomtopmsg.newmsgid"
            java.lang.Object r5 = r1.get(r5)
            java.lang.String r5 = (java.lang.String) r5
            java.lang.String r5 = ".sysmsg.chatroominfoversion"
            java.lang.Object r5 = r1.get(r5)
            java.lang.String r5 = (java.lang.String) r5
            r6 = -1
            if (r5 == 0) goto L_0x0073
            java.lang.Integer r5 = z04.C66731x.m78731e(r5)
            if (r5 == 0) goto L_0x0073
            int r5 = r5.intValue()
            goto L_0x0074
        L_0x0073:
            r5 = -1
        L_0x0074:
            java.lang.String r7 = ".sysmsg.mmchatroomtopmsg.username"
            java.lang.Object r7 = r1.get(r7)
            java.lang.String r7 = (java.lang.String) r7
            java.lang.String r8 = ".sysmsg.mmchatroomtopmsg.msgtype"
            java.lang.Object r8 = r1.get(r8)
            java.lang.String r8 = (java.lang.String) r8
            java.lang.String r8 = ".sysmsg.mmchatroomtopmsg.op"
            java.lang.Object r1 = r1.get(r8)
            java.lang.String r1 = (java.lang.String) r1
            if (r1 == 0) goto L_0x0099
            java.lang.Integer r1 = z04.C66731x.m78731e(r1)
            if (r1 == 0) goto L_0x0099
            int r1 = r1.intValue()
            goto L_0x009a
        L_0x0099:
            r1 = 0
        L_0x009a:
            java.lang.Class<on3.o> r8 = on3.C77029o.class
            di3.d r8 = di3.C86312j.m106911c(r8)
            on3.o r8 = (on3.C77029o) r8
            java.lang.String r9 = ""
            if (r0 != 0) goto L_0x00a8
            r10 = r9
            goto L_0x00a9
        L_0x00a8:
            r10 = r0
        L_0x00a9:
            on3.f r10 = r8.xx0(r10)
            r12 = 1
            if (r10 == 0) goto L_0x00e3
            java.util.List r10 = r10.mo107344b()
            java.util.Iterator r10 = r10.iterator()
        L_0x00b8:
            boolean r13 = r10.hasNext()
            if (r13 == 0) goto L_0x00d1
            java.lang.Object r13 = r10.next()
            r14 = r13
            com.tencent.mm.storage.d5 r14 = (com.tencent.p014mm.storage.C72958d5) r14
            int r14 = r14.getId()
            if (r14 != r2) goto L_0x00cd
            r14 = 1
            goto L_0x00ce
        L_0x00cd:
            r14 = 0
        L_0x00ce:
            if (r14 == 0) goto L_0x00b8
            goto L_0x00d2
        L_0x00d1:
            r13 = 0
        L_0x00d2:
            com.tencent.mm.storage.d5 r13 = (com.tencent.p014mm.storage.C72958d5) r13
            if (r13 == 0) goto L_0x00de
            boolean r10 = r13.mo108715m2()
            if (r10 != r12) goto L_0x00de
            r10 = 1
            goto L_0x00df
        L_0x00de:
            r10 = 0
        L_0x00df:
            if (r10 != r12) goto L_0x00e3
            r10 = 1
            goto L_0x00e4
        L_0x00e3:
            r10 = 0
        L_0x00e4:
            if (r10 == 0) goto L_0x00e7
            return
        L_0x00e7:
            r10 = 2
            java.lang.Class<a11.c> r14 = a11.C39479c.class
            k40.a r14 = f40.C86709a0.m107533q(r14)     // Catch:{ all -> 0x015b }
            a11.c r14 = (a11.C39479c) r14     // Catch:{ all -> 0x015b }
            eb0.m2 r14 = r14.mo62084mr()     // Catch:{ all -> 0x015b }
            com.tencent.mm.storage.n1 r14 = (com.tencent.p014mm.storage.C44662n1) r14     // Catch:{ all -> 0x015b }
            com.tencent.mm.storage.m1 r14 = r14.mo69799Lo(r0)     // Catch:{ all -> 0x015b }
            if (r14 != 0) goto L_0x0101
            com.tencent.mm.storage.m1 r14 = new com.tencent.mm.storage.m1     // Catch:{ all -> 0x015b }
            r14.<init>()     // Catch:{ all -> 0x015b }
        L_0x0101:
            int r15 = r14.field_chatroomVersion     // Catch:{ all -> 0x015b }
            if (r5 == r6) goto L_0x015b
            if (r5 <= r15) goto L_0x015b
            r14.field_chatroomVersion = r5     // Catch:{ all -> 0x015b }
            boolean r6 = eb0.C45612m0.m50680G(r14)     // Catch:{ all -> 0x015b }
            java.lang.Class<f62.k0> r14 = f62.C75700k0.class
            k40.a r14 = f40.C86709a0.m107533q(r14)     // Catch:{ all -> 0x015b }
            f62.k0 r14 = (f62.C75700k0) r14     // Catch:{ all -> 0x015b }
            com.tencent.mm.storage.v3 r14 = r14.mo96094Ku()     // Catch:{ all -> 0x015b }
            com.tencent.mm.storage.i2 r14 = (com.tencent.p014mm.storage.C44660i2) r14     // Catch:{ all -> 0x015b }
            boolean r14 = r14.mo69752X(r0)     // Catch:{ all -> 0x015b }
            boolean r16 = eb0.C45612m0.m50708y(r0)     // Catch:{ all -> 0x015b }
            java.lang.String r11 = "getDetailByXml ret:%s, isExist:%s, isNeedUpdate:%s, currVersion:%s, xmlVersion:%s"
            r13 = 5
            java.lang.Object[] r13 = new java.lang.Object[r13]     // Catch:{ all -> 0x015b }
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)     // Catch:{ all -> 0x015b }
            r13[r4] = r6     // Catch:{ all -> 0x015b }
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r14)     // Catch:{ all -> 0x015b }
            r13[r12] = r6     // Catch:{ all -> 0x015b }
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r16)     // Catch:{ all -> 0x015b }
            r13[r10] = r6     // Catch:{ all -> 0x015b }
            r6 = 3
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)     // Catch:{ all -> 0x015b }
            r13[r6] = r15     // Catch:{ all -> 0x015b }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x015b }
            r6 = 4
            r13[r6] = r5     // Catch:{ all -> 0x015b }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r11, r13)     // Catch:{ all -> 0x015b }
            if (r14 == 0) goto L_0x015b
            if (r16 == 0) goto L_0x015b
            com.tencent.mm.autogen.events.GetChatRoomInfoDetailEvent r3 = new com.tencent.mm.autogen.events.GetChatRoomInfoDetailEvent     // Catch:{ all -> 0x015b }
            r3.<init>()     // Catch:{ all -> 0x015b }
            com.tencent.mm.autogen.events.GetChatRoomInfoDetailEvent$a r5 = r3.f78814d     // Catch:{ all -> 0x015b }
            r5.f78815a = r0     // Catch:{ all -> 0x015b }
            r3.publish()     // Catch:{ all -> 0x015b }
        L_0x015b:
            com.tencent.mm.storage.f4 r3 = new com.tencent.mm.storage.f4
            r3.<init>()
            r3.mo108740T2(r4)
            r3.mo108749c3(r0)
            r5 = 4
            r3.mo100991d(r5)
            if (r1 == r12) goto L_0x01a1
            if (r1 == r10) goto L_0x016f
            goto L_0x01d2
        L_0x016f:
            java.lang.String r5 = eb0.C75592q0.m90789s()
            boolean r5 = gy3.C87412m.m108589b(r5, r7)
            if (r5 == 0) goto L_0x0185
            android.app.Application r5 = com.tencent.p014mm.sdk.platformtools.ApplicationGlobal.context()
            r6 = 2131823405(0x7f110b2d, float:1.9279609E38)
            java.lang.String r9 = r5.getString(r6)
            goto L_0x01d2
        L_0x0185:
            if (r7 != 0) goto L_0x0188
            goto L_0x0189
        L_0x0188:
            r9 = r7
        L_0x0189:
            java.lang.String r5 = r8.yx0(r0, r7)
            java.lang.String r5 = r8.zx0(r9, r5)
            android.app.Application r6 = com.tencent.p014mm.sdk.platformtools.ApplicationGlobal.context()
            r7 = 2131823403(0x7f110b2b, float:1.9279605E38)
            java.lang.Object[] r8 = new java.lang.Object[r12]
            r8[r4] = r5
            java.lang.String r9 = r6.getString(r7, r8)
            goto L_0x01d2
        L_0x01a1:
            java.lang.String r5 = eb0.C75592q0.m90789s()
            boolean r5 = gy3.C87412m.m108589b(r5, r7)
            if (r5 == 0) goto L_0x01b7
            android.app.Application r5 = com.tencent.p014mm.sdk.platformtools.ApplicationGlobal.context()
            r6 = 2131823406(0x7f110b2e, float:1.927961E38)
            java.lang.String r9 = r5.getString(r6)
            goto L_0x01d2
        L_0x01b7:
            if (r7 != 0) goto L_0x01ba
            goto L_0x01bb
        L_0x01ba:
            r9 = r7
        L_0x01bb:
            java.lang.String r5 = r8.yx0(r0, r7)
            java.lang.String r5 = r8.zx0(r9, r5)
            android.app.Application r6 = com.tencent.p014mm.sdk.platformtools.ApplicationGlobal.context()
            r7 = 2131823404(0x7f110b2c, float:1.9279607E38)
            java.lang.Object[] r8 = new java.lang.Object[r12]
            r8[r4] = r5
            java.lang.String r9 = r6.getString(r7, r8)
        L_0x01d2:
            r3.mo108732L2(r9)
            if (r1 != r10) goto L_0x0231
            java.lang.ref.WeakReference<ak3.a> r1 = ak3.C67056a.f192606o
            if (r1 == 0) goto L_0x01e2
            java.lang.Object r1 = r1.get()
            ak3.a r1 = (ak3.C67056a) r1
            goto L_0x01e3
        L_0x01e2:
            r1 = 0
        L_0x01e3:
            if (r1 == 0) goto L_0x0231
            java.util.LinkedList<ln3.a<?>> r1 = r1.f192612j
            java.util.Iterator r1 = r1.iterator()
        L_0x01eb:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L_0x0206
            java.lang.Object r5 = r1.next()
            ln3.a r5 = (ln3.C76709a) r5
            boolean r6 = r5 instanceof ln3.C76719m
            if (r6 == 0) goto L_0x01eb
            ln3.m r5 = (ln3.C76719m) r5
            com.tencent.mm.storage.d5 r6 = r5.f224452u
            int r6 = r6.getId()
            if (r6 != r2) goto L_0x01eb
            goto L_0x0207
        L_0x0206:
            r5 = 0
        L_0x0207:
            if (r5 == 0) goto L_0x0231
            java.lang.Class<l31.e> r1 = l31.C61212e.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            l31.e r1 = (l31.C61212e) r1
            r2 = 4
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            rx3.l r6 = new rx3.l
            java.lang.String r7 = "group_bar_close_scene"
            r6.<init>(r7, r2)
            java.util.Map r2 = sx3.C90363p0.m113143b(r6)
            java.util.Map r5 = r5.mo106997b()
            java.util.Map r2 = sx3.C90364q0.m113149h(r2, r5)
            r5 = 26356(0x66f4, float:3.6933E-41)
            java.lang.String r6 = "group_msg_set_top_detach"
            r7 = 0
            r1.mo86153W7(r6, r7, r2, r5)
        L_0x0231:
            long r1 = eb0.C31543z5.m39453c()
            r5 = 1000(0x3e8, double:4.94E-321)
            long r1 = r1 / r5
            long r0 = eb0.C75604z3.m90841m(r0, r1)
            r3.mo108733M2(r0)
            r0 = 10000(0x2710, float:1.4013E-41)
            r3.setType(r0)
            java.lang.String r0 = r3.getContent()
            if (r0 == 0) goto L_0x0250
            boolean r0 = z04.C112551y.m153811k(r0)
            if (r0 == 0) goto L_0x0251
        L_0x0250:
            r4 = 1
        L_0x0251:
            if (r4 != 0) goto L_0x0256
            eb0.C75604z3.m90852x(r3)
        L_0x0256:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: on3.C77026g.mo8730o(java.lang.String, java.util.Map, ob0.m$a):void");
    }
}
