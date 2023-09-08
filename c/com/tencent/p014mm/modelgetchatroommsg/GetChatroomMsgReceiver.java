package com.tencent.p014mm.modelgetchatroommsg;

import com.tencent.p014mm.autogen.events.SilenceNotifyEvent;
import com.tencent.p014mm.modelgetchatroommsg.C68111c;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.storage.MStorage;
import com.tencent.p014mm.sdk.storage.MStorageEventData;
import com.tencent.p014mm.sdk.storage.MStorageEx;
import com.tencent.p014mm.storage.C30776s3;
import com.tencent.p014mm.storage.C72988o1;
import di3.C86312j;
import f40.C86709a0;
import f62.C75700k0;
import g62.C75871e;
import java.util.HashMap;
import java.util.Map;
import p788aj.C67054d;
import pc0.C77064b0;
import sf0.C77702q0;
import zt3.C119157j;

/* renamed from: com.tencent.mm.modelgetchatroommsg.GetChatroomMsgReceiver */
public class GetChatroomMsgReceiver extends IListener<SilenceNotifyEvent> implements MStorageEx.IOnStorageChange, MStorage.IOnStorageChange, C68111c.C68113b {

    /* renamed from: d */
    public final IListener f195752d;

    /* renamed from: e */
    public Map<Long, C30776s3> f195753e = new HashMap();

    /* renamed from: com.tencent.mm.modelgetchatroommsg.GetChatroomMsgReceiver$a */
    public class C68107a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ Object f195754d;

        public C68107a(GetChatroomMsgReceiver getChatroomMsgReceiver, Object obj) {
            this.f195754d = obj;
        }

        public void run() {
            C75871e cU = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96101cU();
            String str = (String) this.f195754d;
            if (cU.mo101205k(str)) {
                C72988o1 v = cU.mo101216v(str);
                C67054d dVar = v.field_seqBlockInfo;
                if (dVar != null) {
                    dVar.f192605d.clear();
                }
                v.field_lastLocalSeq = v.field_lastPushSeq;
                v.field_lastLocalCreateTime = v.field_lastPushCreateTime;
                long E = cU.mo101203E(v);
                Log.m105924i("MicroMsg.GetChatroomMsgReceiver", "[onNotifyChange] username:" + str + " ret:" + E + " chatroomMsgSeq:" + v.toString());
            }
        }
    }

    /* renamed from: com.tencent.mm.modelgetchatroommsg.GetChatroomMsgReceiver$b */
    public static class C68108b implements Runnable {

        /* renamed from: d */
        public SilenceNotifyEvent f195755d;

        public C68108b(SilenceNotifyEvent silenceNotifyEvent, C68107a aVar) {
            this.f195755d = silenceNotifyEvent;
        }

        /* JADX WARNING: Removed duplicated region for block: B:107:0x0429  */
        /* JADX WARNING: Removed duplicated region for block: B:113:0x0490  */
        /* JADX WARNING: Removed duplicated region for block: B:115:0x0499  */
        /* JADX WARNING: Removed duplicated region for block: B:116:0x04dd  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo93617a() {
            /*
                r33 = this;
                java.lang.Class<f62.k0> r1 = f62.C75700k0.class
                java.lang.String r2 = ""
                boolean r0 = f40.C86709a0.m107522a()
                java.lang.String r3 = "MicroMsg.GetChatroomMsgReceiver"
                if (r0 != 0) goto L_0x0012
                java.lang.String r0 = "[UpdateMsgSeqStorageTask$run] accHasReady no!"
                com.tencent.p014mm.sdk.platformtools.Log.m105928w(r3, r0)
                return
            L_0x0012:
                r4 = r33
                com.tencent.mm.autogen.events.SilenceNotifyEvent r0 = r4.f195755d
                com.tencent.mm.autogen.events.SilenceNotifyEvent$a r0 = r0.f193936d
                byte[] r0 = r0.f193937a
                if (r0 == 0) goto L_0x0547
                te3.k3 r5 = new te3.k3
                r5.<init>()
                r6 = 0
                r5.parseFrom(r0)     // Catch:{ Exception -> 0x0026 }
                goto L_0x002d
            L_0x0026:
                r0 = move-exception
                r7 = r0
                java.lang.Object[] r0 = new java.lang.Object[r6]
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r3, r7, r2, r0)
            L_0x002d:
                long r7 = java.lang.System.currentTimeMillis()
                te3.rv3 r0 = r5.f227726d
                java.lang.String r0 = sf0.C48374j0.m53718g(r0)
                int r9 = r5.f227728f
                int r10 = r5.f227729g
                long r10 = (long) r10
                r12 = 1000(0x3e8, double:4.94E-321)
                long r10 = r10 * r12
                k40.a r14 = f40.C86709a0.m107533q(r1)
                f62.k0 r14 = (f62.C75700k0) r14
                g62.e r14 = r14.mo96101cU()
                boolean r15 = r14.mo101205k(r0)
                r18 = 0
                r13 = 5
                r20 = 4
                r12 = 1
                if (r15 == 0) goto L_0x0087
                r22 = r7
                long r6 = (long) r9
                boolean r6 = r14.mo101219y(r0, r6)
                boolean r7 = r14.mo101218x(r0, r10)
                java.lang.Object[] r8 = new java.lang.Object[r13]
                r14 = 0
                r8[r14] = r0
                java.lang.Integer r0 = java.lang.Integer.valueOf(r9)
                r8[r12] = r0
                java.lang.Boolean r0 = java.lang.Boolean.valueOf(r6)
                r6 = 2
                r8[r6] = r0
                java.lang.Long r0 = java.lang.Long.valueOf(r10)
                r6 = 3
                r8[r6] = r0
                java.lang.Boolean r0 = java.lang.Boolean.valueOf(r7)
                r8[r20] = r0
                java.lang.String r0 = "[UpdateMsgSeqStorageTask$run#update] chatRoomId:%s updatePushSeqRet[%s]:%s updatePushCreateTimeRet[%s]:%s"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r0, r8)
                goto L_0x014a
            L_0x0087:
                r22 = r7
                k40.a r6 = f40.C86709a0.m107533q(r1)
                f62.k0 r6 = (f62.C75700k0) r6
                g62.l r6 = r6.mo96095LE()
                com.tencent.mm.storage.g4 r6 = (com.tencent.p014mm.storage.C72972g4) r6
                com.tencent.mm.storage.f4 r6 = r6.Mx0(r0)
                if (r6 == 0) goto L_0x00a9
                long r7 = r6.getMsgId()
                int r24 = (r7 > r18 ? 1 : (r7 == r18 ? 0 : -1))
                if (r24 != 0) goto L_0x00a9
                java.lang.String r6 = "[UpdateMsgSeqStorageTask$run] has not any ReceivedMsg!"
                com.tencent.p014mm.sdk.platformtools.Log.m105928w(r3, r6)
                r6 = 0
            L_0x00a9:
                if (r6 == 0) goto L_0x00d1
                long r7 = r6.getCreateTime()
                r16 = 1000(0x3e8, double:4.94E-321)
                long r7 = r7 / r16
                java.lang.String r15 = "yyyy-MM-dd HH:mm:ss"
                java.lang.String r7 = com.tencent.p014mm.pluginsdk.platformtools.C72715f.m85111d(r15, r7)
                r8 = 2
                java.lang.Object[] r15 = new java.lang.Object[r8]
                java.lang.String r8 = r6.getContent()
                java.lang.String r8 = com.tencent.p014mm.sdk.platformtools.Util.secPrint(r8)
                r24 = 0
                r15[r24] = r8
                r8 = r15
                r8[r12] = r7
                java.lang.String r7 = "[lastFaultMsgInfo] lastFaultMsgInfo:%s timeFormat:%s"
                com.tencent.p014mm.sdk.platformtools.Log.m105929w(r3, r7, r8)
            L_0x00d1:
                com.tencent.mm.storage.o1 r7 = new com.tencent.mm.storage.o1
                r7.<init>()
                r7.field_username = r0
                long r12 = (long) r9
                r7.field_lastPushSeq = r12
                if (r6 == 0) goto L_0x00e2
                long r12 = r6.mo108772w2()
                goto L_0x00e5
            L_0x00e2:
                int r12 = r9 + -1
                long r12 = (long) r12
            L_0x00e5:
                r7.field_lastLocalSeq = r12
                r7.field_lastPushCreateTime = r10
                r12 = 1
                if (r6 == 0) goto L_0x00f2
                long r25 = r6.getCreateTime()
                goto L_0x00f4
            L_0x00f2:
                long r25 = r10 - r12
            L_0x00f4:
                r12 = r25
                r7.field_lastLocalCreateTime = r12
                long r12 = r14.mo101201C(r7)
                r7 = 6
                java.lang.Object[] r14 = new java.lang.Object[r7]
                java.lang.Long r7 = java.lang.Long.valueOf(r12)
                r12 = 0
                r14[r12] = r7
                r7 = 1
                r14[r7] = r0
                java.lang.Integer r0 = java.lang.Integer.valueOf(r9)
                r12 = 2
                r14[r12] = r0
                java.lang.Long r0 = java.lang.Long.valueOf(r10)
                r12 = 3
                r14[r12] = r0
                if (r6 == 0) goto L_0x011e
                long r12 = r6.mo108772w2()
                goto L_0x0120
            L_0x011e:
                int r9 = r9 - r7
                long r12 = (long) r9
            L_0x0120:
                java.lang.Long r0 = java.lang.Long.valueOf(r12)
                r14[r20] = r0
                if (r6 == 0) goto L_0x012d
                long r6 = r6.getCreateTime()
                goto L_0x0131
            L_0x012d:
                r6 = 1
                long r6 = r10 - r6
            L_0x0131:
                java.lang.Long r0 = java.lang.Long.valueOf(r6)
                r6 = 5
                r14[r6] = r0
                java.lang.String r0 = "[UpdateMsgSeqStorageTask$run#insert] ret:%s,chatRoomId:%s updatePushSeq:%s updatePushCreateTime:%s field_lastLocalSeq:%s field_lastLocalCreateTime:%s"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r0, r14)
                kj2.d r25 = kj2.C117407d.INSTANCE
                r26 = 403(0x193, double:1.99E-321)
                r28 = 77
                r30 = 1
                r32 = 1
                r25.idkeyStat(r26, r28, r30, r32)
            L_0x014a:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r6 = "[updateChatroomMsgSeq] cost:"
                r0.append(r6)
                long r6 = java.lang.System.currentTimeMillis()
                long r6 = r6 - r22
                r0.append(r6)
                java.lang.String r0 = r0.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105918d(r3, r0)
                long r6 = java.lang.System.currentTimeMillis()
                te3.rv3 r0 = r5.f227726d
                java.lang.String r0 = sf0.C48374j0.m53718g(r0)
                int r9 = r5.f227728f
                long r10 = r5.f227727e
                int r12 = r5.f227729g
                int r13 = r5.f227732j
                int r14 = r5.f227733n
                int r8 = r5.f227730h
                te3.rv3 r5 = r5.f227731i
                java.lang.String r5 = sf0.C48374j0.m53718g(r5)
                r15 = 8
                java.lang.Object[] r15 = new java.lang.Object[r15]
                r23 = 0
                r15[r23] = r0
                java.lang.Long r10 = java.lang.Long.valueOf(r10)
                r11 = 1
                r15[r11] = r10
                java.lang.Integer r10 = java.lang.Integer.valueOf(r12)
                r11 = 2
                r15[r11] = r10
                java.lang.Integer r10 = java.lang.Integer.valueOf(r13)
                r11 = 3
                r15[r11] = r10
                java.lang.Integer r10 = java.lang.Integer.valueOf(r9)
                r15[r20] = r10
                java.lang.Integer r10 = java.lang.Integer.valueOf(r14)
                r11 = 5
                r15[r11] = r10
                java.lang.Integer r11 = java.lang.Integer.valueOf(r8)
                r21 = 6
                r15[r21] = r11
                java.lang.String r11 = com.tencent.p014mm.sdk.platformtools.Util.secPrint(r5)
                r21 = 7
                r15[r21] = r11
                java.lang.String r11 = "summerbadcr updateConv chatRoomId[%s], newMsgId[%d], createTime[%d], isActed[%d], msgseq[%d], msgType[%d], unDeliverCount[%d], content[%s]"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r11, r15)
                k40.a r11 = f40.C86709a0.m107533q(r1)
                f62.k0 r11 = (f62.C75700k0) r11
                com.tencent.mm.storage.v3 r11 = r11.mo96094Ku()
                com.tencent.mm.storage.i2 r11 = (com.tencent.p014mm.storage.C44660i2) r11
                com.tencent.mm.storage.h2 r11 = r11.mo69771j(r0)
                if (r11 != 0) goto L_0x0228
                com.tencent.mm.storage.h2 r11 = new com.tencent.mm.storage.h2
                r11.<init>(r0)
                r22 = r6
                long r6 = (long) r12
                r15 = 1000(0x3e8, double:4.94E-321)
                long r6 = r6 * r15
                r11.mo108793N2(r6)
                long r6 = (long) r9
                r11.mo108804Z2(r6)
                r8 = 1
                r11.mo108812g3(r8)
                r11.mo108811f3(r8)
                com.tencent.mm.modelgetchatroommsg.c r8 = com.tencent.p014mm.modelgetchatroommsg.C68111c.m80513e()
                r8.mo93621c(r0)
                k40.a r8 = f40.C86709a0.m107533q(r1)
                f62.k0 r8 = (f62.C75700k0) r8
                g62.f r8 = r8.mo96093DX()
                com.tencent.mm.storage.n2 r8 = (com.tencent.p014mm.storage.C72986n2) r8
                long r16 = r8.mo101180Lo(r0)
                r8 = 2
                java.lang.Object[] r12 = new java.lang.Object[r8]
                java.lang.Long r8 = java.lang.Long.valueOf(r16)
                r15 = 0
                r12[r15] = r8
                java.lang.Integer r8 = java.lang.Integer.valueOf(r9)
                r9 = 1
                r12[r9] = r8
                java.lang.String r8 = "summerbadcr updateConv new conv lastDeleteSeq(FirstUnDeliverSeq)[%d], msgSeq[%d]"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r8, r12)
                int r8 = (r16 > r18 ? 1 : (r16 == r18 ? 0 : -1))
                if (r8 <= 0) goto L_0x0220
                r6 = r16
            L_0x0220:
                r11.mo108798S2(r6)
                r21 = r5
                r4 = 1
                goto L_0x0303
            L_0x0228:
                r22 = r6
                long r6 = r11.mo108833z2()
                int r7 = (int) r6
                if (r9 <= r7) goto L_0x02f2
                r6 = r5
                long r4 = (long) r9
                r11.mo108804Z2(r4)
                int r4 = r11.mo108785F2()
                r11.mo108811f3(r8)
                r21 = r6
                long r5 = (long) r12
                r16 = 1000(0x3e8, double:4.94E-321)
                long r5 = r5 * r16
                r11.mo108793N2(r5)
                int r5 = r11.mo108786G2()
                if (r8 <= r5) goto L_0x024e
                goto L_0x0254
            L_0x024e:
                int r5 = r11.mo108786G2()
                int r8 = r8 - r4
                int r8 = r8 + r5
            L_0x0254:
                if (r8 >= 0) goto L_0x0268
                r4 = 1
                java.lang.Object[] r5 = new java.lang.Object[r4]
                java.lang.Integer r4 = java.lang.Integer.valueOf(r8)
                r15 = 0
                r5[r15] = r4
                java.lang.String r4 = "why???, unreadCount %d"
                com.tencent.p014mm.sdk.platformtools.Log.m105921e(r3, r4, r5)
                r8 = 0
                goto L_0x0269
            L_0x0268:
                r15 = 0
            L_0x0269:
                r11.mo108812g3(r8)
                long r4 = r11.mo108827t2()
                r6 = 3
                java.lang.Object[] r8 = new java.lang.Object[r6]
                java.lang.Integer r6 = java.lang.Integer.valueOf(r9)
                r8[r15] = r6
                java.lang.Long r6 = java.lang.Long.valueOf(r4)
                r9 = 1
                r8[r9] = r6
                java.lang.Integer r6 = java.lang.Integer.valueOf(r7)
                r9 = 2
                r8[r9] = r6
                java.lang.String r6 = "summerbadcr updateConv  msgSeq[%d], firstSeq[%d], lastseq[%d]"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r6, r8)
                int r6 = (r4 > r18 ? 1 : (r4 == r18 ? 0 : -1))
                if (r6 <= 0) goto L_0x02b2
                k40.a r4 = f40.C86709a0.m107533q(r1)
                f62.k0 r4 = (f62.C75700k0) r4
                g62.l r4 = r4.mo96095LE()
                long r5 = (long) r7
                com.tencent.mm.storage.g4 r4 = (com.tencent.p014mm.storage.C72972g4) r4
                com.tencent.mm.storage.f4 r4 = r4.v10(r0, r5)
                long r5 = r4.getMsgId()
                int r7 = (r5 > r18 ? 1 : (r5 == r18 ? 0 : -1))
                if (r7 <= 0) goto L_0x0302
                long r4 = r4.mo108772w2()
                r11.mo108798S2(r4)
                goto L_0x0302
            L_0x02b2:
                k40.a r4 = f40.C86709a0.m107533q(r1)
                f62.k0 r4 = (f62.C75700k0) r4
                g62.f r4 = r4.mo96093DX()
                com.tencent.mm.storage.n2 r4 = (com.tencent.p014mm.storage.C72986n2) r4
                long r4 = r4.mo101180Lo(r0)
                int r6 = (r4 > r18 ? 1 : (r4 == r18 ? 0 : -1))
                if (r6 <= 0) goto L_0x02ca
                r11.mo108798S2(r4)
                goto L_0x0302
            L_0x02ca:
                k40.a r4 = f40.C86709a0.m107533q(r1)
                f62.k0 r4 = (f62.C75700k0) r4
                g62.l r4 = r4.mo96095LE()
                com.tencent.mm.storage.g4 r4 = (com.tencent.p014mm.storage.C72972g4) r4
                long r4 = r4.Kx0(r0)
                r6 = 1
                java.lang.Object[] r7 = new java.lang.Object[r6]
                java.lang.Long r6 = java.lang.Long.valueOf(r4)
                r8 = 0
                r7[r8] = r6
                java.lang.String r6 = "summerbadcr updateConv lastMsgSeq[%s]"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r6, r7)
                int r6 = (r4 > r18 ? 1 : (r4 == r18 ? 0 : -1))
                if (r6 <= 0) goto L_0x0302
                r11.mo108798S2(r4)
                goto L_0x0302
            L_0x02f2:
                r21 = r5
                if (r9 != r7) goto L_0x0302
                if (r8 != 0) goto L_0x0302
                int r4 = r11.mo108786G2()
                if (r4 <= 0) goto L_0x0302
                r4 = 0
                r11.mo108812g3(r4)
            L_0x0302:
                r4 = 0
            L_0x0303:
                if (r13 <= 0) goto L_0x030d
                int r5 = r11.mo108818l2()
                int r5 = r5 + r13
                r11.mo108789J2(r5)
            L_0x030d:
                com.tencent.mm.storage.f4 r5 = new com.tencent.mm.storage.f4
                r5.<init>()
                r6 = 0
                r5.mo108740T2(r6)
                r5.mo108749c3(r0)
                r5.setType(r14)
                r6 = r21
                r5.mo108732L2(r6)
                r7 = 49
                if (r14 != r7) goto L_0x0342
                java.lang.String r8 = com.tencent.p014mm.pluginsdk.model.app.C72689q.m85025D(r0, r2, r6)
                r9 = 0
                com.tencent.mm.message.l$b r8 = com.tencent.p014mm.message.C68070l.C68072b.m80422u(r8, r9)
                int r9 = com.tencent.p014mm.pluginsdk.model.app.C72695v.m85070l(r8)
                r5.setType(r9)
                boolean r9 = r5.mo100967F3()
                if (r9 == 0) goto L_0x033d
                java.lang.String r6 = r8.f195598m
            L_0x033d:
                r5.mo108732L2(r6)
                goto L_0x0401
            L_0x0342:
                r8 = 10002(0x2712, float:1.4016E-41)
                if (r14 != r8) goto L_0x0401
                java.lang.Class<f62.s0> r9 = f62.C75707s0.class
                di3.d r9 = di3.C86312j.m106911c(r9)
                f62.s0 r9 = (f62.C75707s0) r9
                eb0.v5 r9 = r9.H60()
                r9.getClass()
                int r9 = r5.getType()
                if (r9 != r8) goto L_0x0401
                boolean r8 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r6)
                if (r8 == 0) goto L_0x0363
                goto L_0x0401
            L_0x0363:
                boolean r8 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r6)
                java.lang.String r9 = "MicroMsg.SysCmdMsgExtension"
                if (r8 == 0) goto L_0x0372
                java.lang.String r6 = "null msg content"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r9, r6)
                goto L_0x0401
            L_0x0372:
                java.lang.String r8 = "~SEMI_XML~"
                boolean r8 = r6.startsWith(r8)
                if (r8 == 0) goto L_0x0391
                java.util.Map r8 = com.tencent.p014mm.sdk.platformtools.SemiXml.decode(r6)
                if (r8 != 0) goto L_0x038e
                r12 = 1
                java.lang.Object[] r8 = new java.lang.Object[r12]
                r12 = 0
                r8[r12] = r6
                java.lang.String r6 = "SemiXml values is null, msgContent %s"
                com.tencent.p014mm.sdk.platformtools.Log.m105921e(r9, r6, r8)
                goto L_0x0401
            L_0x038e:
                java.lang.String r6 = "brand_service"
                goto L_0x03c2
            L_0x0391:
                java.lang.String r8 = "<sysmsg"
                int r8 = r6.indexOf(r8)
                r12 = -1
                if (r8 != r12) goto L_0x03a0
                java.lang.String r6 = "msgContent not start with <sysmsg"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r9, r6)
                goto L_0x0401
            L_0x03a0:
                java.lang.String r8 = r6.substring(r8)
                java.lang.String r12 = "sysmsg"
                r13 = 0
                java.util.Map r8 = com.tencent.p014mm.sdk.platformtools.XmlParser.parseXml(r8, r12, r13)
                if (r8 != 0) goto L_0x03ba
                r12 = 1
                java.lang.Object[] r8 = new java.lang.Object[r12]
                r12 = 0
                r8[r12] = r6
                java.lang.String r6 = "XmlParser values is null, msgContent %s"
                com.tencent.p014mm.sdk.platformtools.Log.m105921e(r9, r6, r8)
                goto L_0x0401
            L_0x03ba:
                java.lang.String r6 = ".sysmsg.$type"
                java.lang.Object r6 = r8.get(r6)
                java.lang.String r6 = (java.lang.String) r6
            L_0x03c2:
                if (r6 != 0) goto L_0x03c5
                goto L_0x0401
            L_0x03c5:
                java.lang.String r12 = "revokemsg"
                boolean r6 = r6.equals(r12)
                if (r6 == 0) goto L_0x0401
                java.lang.String r6 = "mm hit MM_DATA_SYSCMD_NEWXML_SUBTYPE_REVOKE"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r6)
                java.lang.String r6 = ".sysmsg.revokemsg.session"
                java.lang.Object r6 = r8.get(r6)
                java.lang.String r6 = (java.lang.String) r6
                java.lang.String r6 = ".sysmsg.revokemsg.newmsgid"
                java.lang.Object r6 = r8.get(r6)
                java.lang.String r6 = (java.lang.String) r6
                java.lang.String r12 = ".sysmsg.revokemsg.replacemsg"
                java.lang.Object r8 = r8.get(r12)
                java.lang.String r8 = (java.lang.String) r8
                r12 = 2
                java.lang.Object[] r13 = new java.lang.Object[r12]
                r12 = 0
                r13[r12] = r6
                r6 = 1
                r13[r6] = r8
                java.lang.String r6 = "ashutest::[oneliang][xml parse] ,msgId:%s,replaceMsg:%s "
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r9, r6, r13)
                r5.mo108732L2(r8)
                r6 = 10000(0x2710, float:1.4013E-41)
                r5.setType(r6)
                goto L_0x0402
            L_0x0401:
                r12 = 0
            L_0x0402:
                r11.mo108803Y2(r12)
                java.lang.String r6 = r5.getContent()
                r11.mo108792M2(r6)
                int r6 = r5.getType()
                java.lang.String r6 = java.lang.Integer.toString(r6)
                r11.mo108806b3(r6)
                k40.a r6 = f40.C86709a0.m107533q(r1)
                f62.k0 r6 = (f62.C75700k0) r6
                com.tencent.mm.storage.v3 r6 = r6.mo96094Ku()
                com.tencent.mm.storage.i2 r6 = (com.tencent.p014mm.storage.C44660i2) r6
                com.tencent.mm.storage.v3$b r6 = r6.mo69741L()
                if (r6 == 0) goto L_0x0490
                com.tencent.mm.pointers.PString r6 = new com.tencent.mm.pointers.PString
                r6.<init>()
                com.tencent.mm.pointers.PString r8 = new com.tencent.mm.pointers.PString
                r8.<init>()
                com.tencent.mm.pointers.PInt r9 = new com.tencent.mm.pointers.PInt
                r9.<init>()
                r12 = 0
                p875ci.C67379u.m79740d(r5, r6, r8, r9, r12)
                java.lang.String r6 = r6.value
                r11.mo108794O2(r6)
                java.lang.String r6 = r8.value
                r11.mo108795P2(r6)
                int r6 = r9.value
                r11.mo108801W2(r6)
                int r5 = r5.getType()
                if (r5 != r7) goto L_0x0497
                java.lang.String r5 = r11.getContent()
                java.lang.String r6 = "msg"
                r7 = 0
                java.util.Map r5 = com.tencent.p014mm.sdk.platformtools.XmlParser.parseXml(r5, r6, r7)
                java.lang.String r6 = ".msg.appmsg.title"
                java.lang.Object r5 = r5.get(r6)
                java.lang.String r5 = (java.lang.String) r5
                java.lang.String r6 = r11.mo108822p2()
                java.lang.String r6 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r6)
                boolean r7 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)
                if (r7 == 0) goto L_0x0473
                goto L_0x0488
            L_0x0473:
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r7 = " "
                r2.append(r7)
                java.lang.String r5 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r5)
                r2.append(r5)
                java.lang.String r2 = r2.toString()
            L_0x0488:
                java.lang.String r2 = r6.concat(r2)
                r11.mo108794O2(r2)
                goto L_0x0497
            L_0x0490:
                java.lang.String r2 = r11.getContent()
                r11.mo108794O2(r2)
            L_0x0497:
                if (r4 == 0) goto L_0x04dd
                k40.a r1 = f40.C86709a0.m107533q(r1)
                f62.k0 r1 = (f62.C75700k0) r1
                com.tencent.mm.storage.v3 r1 = r1.mo96094Ku()
                com.tencent.mm.storage.i2 r1 = (com.tencent.p014mm.storage.C44660i2) r1
                long r1 = r1.mo69751W(r11)
                r4 = 5
                java.lang.Object[] r4 = new java.lang.Object[r4]
                r5 = 0
                r4[r5] = r0
                java.lang.Long r0 = java.lang.Long.valueOf(r1)
                r1 = 1
                r4[r1] = r0
                long r0 = r11.mo108827t2()
                java.lang.Long r0 = java.lang.Long.valueOf(r0)
                r1 = 2
                r4[r1] = r0
                long r0 = r11.mo108833z2()
                java.lang.Long r0 = java.lang.Long.valueOf(r0)
                r1 = 3
                r4[r1] = r0
                int r0 = r11.mo108785F2()
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                r4[r20] = r0
                java.lang.String r0 = "summerbadcr updateConv insert username[%s], ret[%d], firstSeq[%d], lastSeq[%d], undeliver[%d]"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r0, r4)
                goto L_0x052c
            L_0x04dd:
                int r2 = r11.mo108819m2()
                r4 = -1048577(0xffffffffffefffff, float:NaN)
                r2 = r2 & r4
                r11.mo108790K2(r2)
                k40.a r1 = f40.C86709a0.m107533q(r1)
                f62.k0 r1 = (f62.C75700k0) r1
                com.tencent.mm.storage.v3 r1 = r1.mo96094Ku()
                com.tencent.mm.storage.i2 r1 = (com.tencent.p014mm.storage.C44660i2) r1
                r2 = 1
                int r1 = r1.mo69775m0(r11, r0, r2, r2)
                long r4 = (long) r1
                r1 = 5
                java.lang.Object[] r1 = new java.lang.Object[r1]
                r6 = 0
                r1[r6] = r0
                java.lang.Long r0 = java.lang.Long.valueOf(r4)
                r1[r2] = r0
                long r4 = r11.mo108827t2()
                java.lang.Long r0 = java.lang.Long.valueOf(r4)
                r2 = 2
                r1[r2] = r0
                long r4 = r11.mo108833z2()
                java.lang.Long r0 = java.lang.Long.valueOf(r4)
                r2 = 3
                r1[r2] = r0
                int r0 = r11.mo108785F2()
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                r1[r20] = r0
                java.lang.String r0 = "summerbadcr updateConv update username[%s], ret[%d], firstSeq[%d], lastSeq[%d], undeliver[%d]"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r0, r1)
            L_0x052c:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "[updateConv] cost:"
                r0.append(r1)
                long r1 = java.lang.System.currentTimeMillis()
                long r1 = r1 - r22
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105918d(r3, r0)
                goto L_0x054c
            L_0x0547:
                java.lang.String r0 = "[UpdateMsgSeqStorageTask$run] data is null"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r0)
            L_0x054c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.modelgetchatroommsg.GetChatroomMsgReceiver.C68108b.mo93617a():void");
        }

        public void run() {
            long currentTimeMillis = System.currentTimeMillis();
            try {
                mo93617a();
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.GetChatroomMsgReceiver", e, "", new Object[0]);
            }
            Log.m105918d("MicroMsg.GetChatroomMsgReceiver", "[HandlePushTask$run] cost:" + (System.currentTimeMillis() - currentTimeMillis));
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public GetChatroomMsgReceiver() {
        /*
            r2 = this;
            com.tencent.mm.app.f r0 = com.tencent.p014mm.app.C40008f.f107254d
            r2.<init>(r0)
            com.tencent.mm.modelgetchatroommsg.GetChatroomMsgReceiver$2 r1 = new com.tencent.mm.modelgetchatroommsg.GetChatroomMsgReceiver$2
            r1.<init>(r2, r0)
            r2.f195752d = r1
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r2.f195753e = r0
            r1.alive()
            com.tencent.mm.modelgetchatroommsg.c r0 = com.tencent.p014mm.modelgetchatroommsg.C68111c.m80513e()
            r0.f195761d = r2
            java.lang.Class<f62.k0> r0 = f62.C75700k0.class
            k40.a r0 = f40.C86709a0.m107533q(r0)
            f62.k0 r0 = (f62.C75700k0) r0
            com.tencent.mm.storage.v3 r0 = r0.mo96094Ku()
            com.tencent.mm.sdk.platformtools.MMHandlerThread r1 = f40.C86709a0.m107525e()
            android.os.Looper r1 = r1.getLooper()
            r0.add((com.tencent.p014mm.sdk.storage.MStorageEx.IOnStorageChange) r2, (android.os.Looper) r1)
            java.lang.Class<pc0.b0> r0 = pc0.C77064b0.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            pc0.b0 r0 = (pc0.C77064b0) r0
            g62.t r0 = r0.mo107372mC()
            com.tencent.mm.sdk.platformtools.MMHandlerThread r1 = f40.C86709a0.m107525e()
            android.os.Looper r1 = r1.getLooper()
            r0.add((com.tencent.p014mm.sdk.storage.MStorage.IOnStorageChange) r2, (android.os.Looper) r1)
            r0 = 562497440(0x218707a0, float:9.149974E-19)
            r2.__eventId = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.modelgetchatroommsg.GetChatroomMsgReceiver.<init>():void");
    }

    public boolean callback(IEvent iEvent) {
        C86709a0.m107525e().postToWorker(new C68108b((SilenceNotifyEvent) iEvent, (C68107a) null));
        return true;
    }

    public void onNotifyChange(int i, MStorageEx mStorageEx, Object obj) {
        if (mStorageEx == ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96094Ku() && (obj instanceof String) && 5 == i) {
            ((C119157j) C119157j.f356862d).mo183875f(new C68107a(this, obj));
        }
    }

    public void onNotifyChange(String str, MStorageEventData mStorageEventData) {
        if (!C77702q0.m93719b(str)) {
            try {
                long longValue = Long.valueOf(str).longValue();
                C30776s3 s3Var = new C30776s3();
                s3Var.field_originSvrId = longValue;
                if (((C77064b0) C86312j.m106911c(C77064b0.class)).mo107372mC().get(s3Var, new String[0])) {
                    ((HashMap) this.f195753e).put(Long.valueOf(longValue), s3Var);
                    Log.m105925i("MicroMsg.GetChatroomMsgReceiver", "summerbadcr dealSysCmdMsg onNotifyChange put info systemRowid[%d], svrId[%d]", Long.valueOf(s3Var.systemRowid), Long.valueOf(longValue));
                    return;
                }
                ((HashMap) this.f195753e).remove(Long.valueOf(longValue));
                Log.m105925i("MicroMsg.GetChatroomMsgReceiver", "summerbadcr dealSysCmdMsg onNotifyChange remove info svrId[%d]", Long.valueOf(longValue));
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.GetChatroomMsgReceiver", e, "summerbadcr dealSysCmdMsg onNotifyChange:", new Object[0]);
            }
        }
    }
}
