package com.tencent.p014mm.plugin.finder.service;

import ht1.C60179k4;
import ob0.C11385n;

/* renamed from: com.tencent.mm.plugin.finder.service.f1 */
public final class C41489f1 implements C11385n {

    /* renamed from: d */
    public static final C41489f1 f111738d = new C41489f1();

    /* renamed from: e */
    public static C60179k4.C46110b f111739e;

    /* JADX WARNING: Removed duplicated region for block: B:16:0x009b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onSceneEnd(int r23, int r24, java.lang.String r25, ob0.C117747y r26) {
        /*
            r22 = this;
            r0 = r23
            r1 = r24
            r2 = r26
            ob0.b0 r3 = f40.C86709a0.m107524d()
            r4 = 6218(0x184a, float:8.713E-42)
            r5 = r22
            r3.mo123470p(r4, r5)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "errType "
            r3.append(r4)
            r3.append(r0)
            java.lang.String r4 = ", errCode "
            r3.append(r4)
            r3.append(r1)
            java.lang.String r4 = ", errMsg "
            r3.append(r4)
            r4 = r25
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "Finder.FinderSessionStatusUpdater"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r3)
            r3 = 0
            if (r0 != 0) goto L_0x01b2
            if (r1 != 0) goto L_0x01b2
            boolean r0 = r2 instanceof je1.C33556k4
            if (r0 == 0) goto L_0x01b2
            ht1.k4$b r0 = f111739e
            java.lang.String r1 = "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderGetMsgSessionResponse"
            r6 = 0
            if (r0 == 0) goto L_0x00cd
            r7 = r2
            je1.k4 r7 = (je1.C33556k4) r7
            ob0.c r7 = r7.f90846g
            ob0.c$d r7 = r7.f127056b
            pe3.a r7 = r7.f127083a
            gy3.C87412m.m108592e(r7, r1)
            te3.ap0 r7 = (te3.C48746ap0) r7
            java.util.LinkedList<te3.rd1> r7 = r7.f130706d
            com.tencent.mm.ui.b4 r0 = (com.tencent.p014mm.p136ui.C44708b4) r0
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "sessionInfos size :"
            r8.append(r9)
            int r9 = r7.size()
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            java.lang.String r9 = "MicroMsg.SingleChatInfoUI"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r8)
            boolean r8 = r7.isEmpty()
            if (r8 != 0) goto L_0x0098
            java.util.Iterator r7 = r7.iterator()
        L_0x007f:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x0098
            java.lang.Object r8 = r7.next()
            te3.rd1 r8 = (te3.C51092rd1) r8
            java.lang.String r10 = r8.f140840e
            com.tencent.mm.ui.SingleChatInfoUI r11 = r0.f121231a
            java.lang.String r11 = r11.f121200n
            boolean r10 = r10.equals(r11)
            if (r10 == 0) goto L_0x007f
            goto L_0x0099
        L_0x0098:
            r8 = r3
        L_0x0099:
            if (r8 == 0) goto L_0x00c9
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r10 = "sessionId: "
            r7.append(r10)
            java.lang.String r10 = r8.f140840e
            r7.append(r10)
            java.lang.String r10 = ", sessionReject: "
            r7.append(r10)
            int r10 = r8.f140841f
            r7.append(r10)
            java.lang.String r7 = r7.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r7)
            com.tencent.mm.ui.SingleChatInfoUI r7 = r0.f121231a
            int r8 = r8.f140841f
            r9 = 1
            if (r8 != r9) goto L_0x00c3
            goto L_0x00c4
        L_0x00c3:
            r9 = 0
        L_0x00c4:
            boolean r8 = com.tencent.p014mm.p136ui.SingleChatInfoUI.f121192y
            r7.mo69886I7(r9)
        L_0x00c9:
            com.tencent.mm.ui.SingleChatInfoUI r0 = r0.f121231a
            r0.f121205s = r3
        L_0x00cd:
            r0 = r2
            je1.k4 r0 = (je1.C33556k4) r0
            ob0.c r0 = r0.f90846g
            ob0.c$d r0 = r0.f127056b
            pe3.a r0 = r0.f127083a
            gy3.C87412m.m108592e(r0, r1)
            te3.ap0 r0 = (te3.C48746ap0) r0
            java.util.LinkedList<te3.rd1> r0 = r0.f130706d
            if (r0 == 0) goto L_0x01b2
            java.util.Iterator r0 = r0.iterator()
        L_0x00e3:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x01b2
            java.lang.Object r1 = r0.next()
            te3.rd1 r1 = (te3.C51092rd1) r1
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r7 = "sessionId:"
            r2.append(r7)
            java.lang.String r7 = r1.f140840e
            r2.append(r7)
            java.lang.String r7 = " , reject:"
            r2.append(r7)
            int r7 = r1.f140841f
            r2.append(r7)
            java.lang.String r7 = ", enableAction:"
            r2.append(r7)
            int r7 = r1.f140842g
            r2.append(r7)
            java.lang.String r7 = ", followFlag:"
            r2.append(r7)
            int r7 = r1.f140844i
            r2.append(r7)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r2)
            java.lang.Class<com.tencent.mm.plugin.FinderCommonFeatureService> r2 = com.tencent.p014mm.plugin.FinderCommonFeatureService.class
            di3.d r2 = di3.C86312j.m106911c(r2)
            com.tencent.mm.plugin.FinderCommonFeatureService r2 = (com.tencent.p014mm.plugin.FinderCommonFeatureService) r2
            up1.l0 r2 = r2.mo76736Au()
            java.lang.String r7 = r1.f140840e
            if (r7 != 0) goto L_0x0135
            java.lang.String r7 = ""
        L_0x0135:
            int r8 = r1.f140841f
            int r9 = r1.f140842g
            int r1 = r1.f140844i
            ue1.f0 r7 = r2.mo71553G2(r7)
            r7.field_rejectMsg = r8
            r7.field_actionPermission = r9
            r7.field_followFlag = r1
            long r8 = android.os.SystemClock.uptimeMillis()
            java.lang.String[] r1 = new java.lang.String[r6]
            r2.updateNotify(r7, r6, r1)
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            java.lang.String r15 = r1.getName()
            java.lang.String r1 = "currentThread().name"
            gy3.C87412m.m108593f(r15, r1)
            r17 = 44
            r18 = 59
            r19 = 0
            r20 = 4
            r21 = 0
            java.lang.String r16 = "updateNotify"
            java.lang.String r12 = z04.C112551y.m153815o(r16, r17, r18, r19, r20, r21)
            long r10 = android.os.SystemClock.uptimeMillis()
            long r13 = r10 - r8
            ue1.e r1 = new ue1.e
            r16 = 0
            java.lang.String r11 = "FinderSessionInfoStorage.updateOpTypeAndAction"
            r10 = r1
            r10.<init>(r11, r12, r13, r15, r16)
            r1.mo89421a()
            java.lang.String[] r1 = new java.lang.String[r6]
            boolean r1 = r2.updateNotify(r7, r6, r1)
            if (r1 == 0) goto L_0x00e3
            java.util.concurrent.ConcurrentHashMap<java.lang.String, ue1.f0> r1 = r2.f146903e
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = r7.field_talker
            r8.append(r9)
            r9 = 95
            r8.append(r9)
            java.lang.String r9 = r7.field_senderUserName
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            r1.remove(r8)
            java.util.concurrent.ConcurrentHashMap<java.lang.String, ue1.f0> r1 = r2.f146904f
            java.lang.String r8 = r7.field_sessionId
            r1.remove(r8)
            java.lang.String r1 = r7.field_sessionId
            r2.doNotify(r1)
            goto L_0x00e3
        L_0x01b2:
            f111739e = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.service.C41489f1.onSceneEnd(int, int, java.lang.String, ob0.y):void");
    }
}
