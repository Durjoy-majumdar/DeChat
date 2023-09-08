package l33;

import com.tencent.p014mm.autogen.events.VoipEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;

/* renamed from: l33.h */
public class C109253h extends IStaticListener<VoipEvent> {
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x021e, code lost:
        if (r10.size() != r0.f183128d) goto L_0x0224;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean callback(com.tencent.p014mm.sdk.event.IEvent r31) {
        /*
            r30 = this;
            r0 = r31
            com.tencent.mm.autogen.events.VoipEvent r0 = (com.tencent.p014mm.autogen.events.VoipEvent) r0
            java.lang.Class<aw.d> r1 = p447aw.C103918d.class
            java.lang.Class<f62.k0> r2 = f62.C75700k0.class
            boolean r3 = r0 instanceof com.tencent.p014mm.autogen.events.VoipEvent
            r4 = 0
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            if (r3 == 0) goto L_0x09c4
            boolean r3 = f40.C86709a0.m107522a()
            if (r3 != 0) goto L_0x0019
            goto L_0x09c4
        L_0x0019:
            com.tencent.mm.autogen.events.VoipEvent$a r3 = r0.f194019d
            int r3 = r3.f194022b
            java.lang.String r6 = ""
            java.lang.String r7 = "MicroMsg.Voip.VoipService"
            r8 = 4
            r10 = 3
            r11 = 0
            r12 = 0
            r14 = 2
            r15 = 1
            switch(r3) {
                case 1: goto L_0x0999;
                case 2: goto L_0x098e;
                case 3: goto L_0x07ef;
                case 4: goto L_0x0786;
                case 5: goto L_0x068a;
                case 6: goto L_0x00ed;
                case 7: goto L_0x002b;
                case 8: goto L_0x002b;
                case 9: goto L_0x006f;
                case 10: goto L_0x002d;
                default: goto L_0x002b;
            }
        L_0x002b:
            goto L_0x09c4
        L_0x002d:
            com.tencent.mm.plugin.voip.model.h0 r1 = l33.C109247e.xx0()
            com.tencent.mm.autogen.events.VoipEvent$a r0 = r0.f194019d
            byte[] r0 = r0.f194023c
            r1.getClass()
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((byte[]) r0)
            if (r2 != 0) goto L_0x09c4
            byte r2 = r0[r4]
            if (r2 == r14) goto L_0x0044
            goto L_0x09c4
        L_0x0044:
            java.lang.String r2 = "onAnswerNotify"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r2)     // Catch:{ Exception -> 0x005f }
            int r2 = r0.length     // Catch:{ Exception -> 0x005f }
            int r2 = r2 - r15
            byte[] r3 = new byte[r2]     // Catch:{ Exception -> 0x005f }
            java.lang.System.arraycopy(r0, r15, r3, r4, r2)     // Catch:{ Exception -> 0x005f }
            te3.yu4 r0 = new te3.yu4     // Catch:{ Exception -> 0x005f }
            r0.<init>()     // Catch:{ Exception -> 0x005f }
            r0.parseFrom(r3)     // Catch:{ Exception -> 0x005f }
            com.tencent.mm.plugin.voip.model.m0 r1 = r1.f317332a     // Catch:{ Exception -> 0x005f }
            r1.mo152665j(r0)     // Catch:{ Exception -> 0x005f }
            goto L_0x09c4
        L_0x005f:
            r0 = move-exception
            java.lang.Object[] r1 = new java.lang.Object[r15]
            java.lang.String r0 = r0.getMessage()
            r1[r4] = r0
            java.lang.String r0 = "onAnswerNotify error: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r7, r0, r1)
            goto L_0x09c4
        L_0x006f:
            com.tencent.mm.plugin.voip.model.h0 r1 = l33.C109247e.xx0()
            com.tencent.mm.autogen.events.VoipEvent$a r0 = r0.f194019d
            byte[] r0 = r0.f194023c
            r1.getClass()
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((byte[]) r0)
            if (r2 != 0) goto L_0x09c4
            byte r2 = r0[r4]
            if (r2 == r10) goto L_0x0086
            goto L_0x09c4
        L_0x0086:
            java.lang.String r2 = "onCancelNotify"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r2)     // Catch:{ Exception -> 0x00dd }
            int r2 = r0.length     // Catch:{ Exception -> 0x00dd }
            int r2 = r2 - r15
            byte[] r3 = new byte[r2]     // Catch:{ Exception -> 0x00dd }
            java.lang.System.arraycopy(r0, r15, r3, r4, r2)     // Catch:{ Exception -> 0x00dd }
            te3.yu4 r0 = new te3.yu4     // Catch:{ Exception -> 0x00dd }
            r0.<init>()     // Catch:{ Exception -> 0x00dd }
            r0.parseFrom(r3)     // Catch:{ Exception -> 0x00dd }
            int r2 = r0.f145520d     // Catch:{ Exception -> 0x00dd }
            te3.yu4 r3 = r1.f317349r     // Catch:{ Exception -> 0x00dd }
            if (r3 == 0) goto L_0x00b5
            int r3 = r3.f145520d     // Catch:{ Exception -> 0x00dd }
            if (r2 != r3) goto L_0x00b5
            com.tencent.mm.sdk.platformtools.MTimerHandler r2 = r1.f317328C     // Catch:{ Exception -> 0x00dd }
            boolean r2 = r2.stopped()     // Catch:{ Exception -> 0x00dd }
            if (r2 != 0) goto L_0x00b5
            r1.f317349r = r11     // Catch:{ Exception -> 0x00dd }
            r1.f317350s = r12     // Catch:{ Exception -> 0x00dd }
            com.tencent.mm.sdk.platformtools.MTimerHandler r2 = r1.f317328C     // Catch:{ Exception -> 0x00dd }
            r2.stopTimer()     // Catch:{ Exception -> 0x00dd }
        L_0x00b5:
            com.tencent.mm.plugin.voip.model.VoipIncomingCallManager r2 = r1.f317357z     // Catch:{ Exception -> 0x00dd }
            int r3 = r0.f145520d     // Catch:{ Exception -> 0x00dd }
            r2.mo152528w(r3)     // Catch:{ Exception -> 0x00dd }
            com.tencent.mm.plugin.voip.model.m0 r2 = r1.f317332a     // Catch:{ Exception -> 0x00dd }
            boolean r0 = r2.mo152666k(r0)     // Catch:{ Exception -> 0x00dd }
            if (r0 == 0) goto L_0x09c4
            z33.e r0 = r1.f317330E     // Catch:{ Exception -> 0x00dd }
            if (r0 == 0) goto L_0x00d2
            r0.mo164353v()     // Catch:{ Exception -> 0x00dd }
            z33.e r0 = r1.f317330E     // Catch:{ Exception -> 0x00dd }
            r0.mo164328B()     // Catch:{ Exception -> 0x00dd }
            r1.f317330E = r11     // Catch:{ Exception -> 0x00dd }
        L_0x00d2:
            h43.f0 r0 = r1.f317331F     // Catch:{ Exception -> 0x00dd }
            if (r0 == 0) goto L_0x09c4
            r0.mo158495j()     // Catch:{ Exception -> 0x00dd }
            r1.f317331F = r11     // Catch:{ Exception -> 0x00dd }
            goto L_0x09c4
        L_0x00dd:
            r0 = move-exception
            java.lang.Object[] r1 = new java.lang.Object[r15]
            java.lang.String r0 = r0.getMessage()
            r1[r4] = r0
            java.lang.String r0 = "onCancelNotify error: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r7, r0, r1)
            goto L_0x09c4
        L_0x00ed:
            com.tencent.mm.plugin.voip.model.h0 r1 = l33.C109247e.xx0()
            com.tencent.mm.autogen.events.VoipEvent$a r0 = r0.f194019d
            byte[] r0 = r0.f194023c
            r1.getClass()
            if (r0 != 0) goto L_0x0101
            java.lang.String r0 = "sidney:notify content null"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r0)
            goto L_0x09c4
        L_0x0101:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "____voipNotify with data size:"
            r2.append(r3)
            int r3 = r0.length
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r2)
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.wrap(r0, r4, r8)
            int r2 = r2.getInt()
            r3 = 8
            java.nio.ByteBuffer r3 = java.nio.ByteBuffer.wrap(r0, r8, r3)
            long r12 = r3.getLong()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = "voipNotify roomid:"
            r3.append(r5)
            r3.append(r2)
            java.lang.String r5 = " roomkey:"
            r3.append(r5)
            r3.append(r12)
            java.lang.String r3 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r3)
            te3.yu4 r3 = r1.f317349r
            java.lang.String r5 = "MicroMsg.Voip.VoipServiceEx"
            if (r3 != 0) goto L_0x017d
            com.tencent.mm.plugin.voip.model.m0 r3 = r1.f317332a
            java.lang.Object[] r11 = new java.lang.Object[r14]
            com.tencent.mm.plugin.voip.model.r r8 = r3.f317396a
            com.tencent.mm.plugin.voip.model.v2protocal r8 = r8.f317500x
            int r8 = r8.f317656n
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r11[r4] = r8
            java.lang.Integer r8 = java.lang.Integer.valueOf(r2)
            r11[r15] = r8
            java.lang.String r8 = "current roomid:%d, params roomid:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r8, r11)
            if (r2 == 0) goto L_0x0172
            com.tencent.mm.plugin.voip.model.r r3 = r3.f317396a
            com.tencent.mm.plugin.voip.model.v2protocal r3 = r3.f317500x
            int r3 = r3.f317656n
            if (r3 != r2) goto L_0x0172
            r3 = 1
            goto L_0x0173
        L_0x0172:
            r3 = 0
        L_0x0173:
            if (r3 != 0) goto L_0x017d
            java.lang.String r0 = "voipSyncStatus ignored , not current roomid"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r7, r0)
            goto L_0x09c4
        L_0x017d:
            int r3 = r0.length
            r8 = 12
            if (r3 <= r8) goto L_0x0656
            int r3 = r0.length
            int r3 = r3 - r8
            byte[] r11 = new byte[r3]
            r9 = 12
        L_0x0188:
            int r4 = r8 + r3
            if (r9 >= r4) goto L_0x0195
            int r4 = r9 + -12
            byte r18 = r0[r9]
            r11[r4] = r18
            int r9 = r9 + 1
            goto L_0x0188
        L_0x0195:
            java.lang.String r4 = "parse Voip notify relaydata item fail"
            java.lang.String r8 = "parse Voip notify status item fail"
            java.lang.String r0 = "__parse voip notify begin"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r0)
            com.tencent.mm.plugin.voip.model.m0 r0 = r1.f317332a
            com.tencent.mm.plugin.voip.model.r r0 = r0.f317396a
            byte[] r0 = r0.f317452C
            boolean r9 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((byte[]) r0)
            if (r9 == 0) goto L_0x01ab
            goto L_0x01d9
        L_0x01ab:
            te3.fe4 r9 = new te3.fe4     // Catch:{ Exception -> 0x0221 }
            r9.<init>()     // Catch:{ Exception -> 0x0221 }
            pe3.a r0 = r9.parseFrom(r0)     // Catch:{ Exception -> 0x0221 }
            te3.fe4 r0 = (te3.fe4) r0     // Catch:{ Exception -> 0x0221 }
            if (r0 != 0) goto L_0x01b9
            goto L_0x01d9
        L_0x01b9:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "dkpush : keyCount:"
            r9.append(r10)
            int r10 = r0.f183128d
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r7, r9)
            java.util.LinkedList<te3.yl2> r9 = r0.f183129e
            int r10 = r9.size()
            int r14 = r0.f183128d
            if (r10 == r14) goto L_0x01dc
        L_0x01d9:
            r23 = r12
            goto L_0x0224
        L_0x01dc:
            java.util.HashMap r10 = new java.util.HashMap
            r10.<init>()
            r14 = 0
        L_0x01e2:
            int r15 = r0.f183128d
            if (r14 >= r15) goto L_0x0216
            java.lang.Object r15 = r9.get(r14)
            te3.yl2 r15 = (te3.C64860yl2) r15
            int r15 = r15.f186575d
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)
            r19 = 4294967295(0xffffffff, double:2.1219957905E-314)
            java.lang.Object r21 = r9.get(r14)
            r22 = r9
            r9 = r21
            te3.yl2 r9 = (te3.C64860yl2) r9
            int r9 = r9.f186576e
            r23 = r12
            long r12 = (long) r9
            long r12 = r12 & r19
            java.lang.Long r9 = java.lang.Long.valueOf(r12)
            r10.put(r15, r9)
            int r14 = r14 + 1
            r9 = r22
            r12 = r23
            goto L_0x01e2
        L_0x0216:
            r23 = r12
            int r9 = r10.size()
            int r0 = r0.f183128d
            if (r9 == r0) goto L_0x0225
            goto L_0x0224
        L_0x0221:
            r23 = r12
        L_0x0224:
            r10 = 0
        L_0x0225:
            if (r10 != 0) goto L_0x0234
            java.lang.String r0 = "local voipsynckey buff nil"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r0)
            r9 = 0
            r12 = 0
            r14 = 0
            goto L_0x02aa
        L_0x0234:
            java.util.Set r0 = r10.keySet()
            java.util.Iterator r0 = r0.iterator()
            r12 = 0
            r14 = 0
            r19 = 0
        L_0x0242:
            boolean r9 = r0.hasNext()
            if (r9 == 0) goto L_0x02a6
            java.lang.Object r9 = r0.next()
            java.lang.Integer r9 = (java.lang.Integer) r9
            java.lang.Object r21 = r10.get(r9)
            r22 = r0
            r0 = r21
            java.lang.Long r0 = (java.lang.Long) r0
            r21 = r10
            int r10 = r9.intValue()
            r25 = r12
            r12 = 1
            if (r10 == r12) goto L_0x0299
            r12 = 2
            if (r10 == r12) goto L_0x0290
            r12 = 3
            if (r10 == r12) goto L_0x028a
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r12 = "parse local voipsynckey:"
            r10.append(r12)
            int r9 = r9.intValue()
            r10.append(r9)
            java.lang.String r9 = ",value:"
            r10.append(r9)
            r10.append(r0)
            java.lang.String r0 = r10.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r0)
            goto L_0x029f
        L_0x028a:
            long r9 = r0.longValue()
            r14 = r9
            goto L_0x029f
        L_0x0290:
            long r12 = r0.longValue()
            r10 = r21
            r0 = r22
            goto L_0x0242
        L_0x0299:
            long r9 = r0.longValue()
            r19 = r9
        L_0x029f:
            r10 = r21
            r0 = r22
            r12 = r25
            goto L_0x0242
        L_0x02a6:
            r25 = r12
            r9 = r19
        L_0x02aa:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r19 = r5
            java.lang.String r5 = "local voip synckey: statuskey:"
            r0.append(r5)
            r0.append(r9)
            java.lang.String r5 = " relayData key:"
            r0.append(r5)
            r0.append(r12)
            java.lang.String r5 = " connectingStatusKey:"
            r0.append(r5)
            r0.append(r14)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r0)
            te3.uu4 r0 = new te3.uu4     // Catch:{ Exception -> 0x05f9 }
            r0.<init>()     // Catch:{ Exception -> 0x05f9 }
            pe3.a r0 = r0.parseFrom(r11)     // Catch:{ Exception -> 0x05f9 }
            r5 = r0
            te3.uu4 r5 = (te3.uu4) r5     // Catch:{ Exception -> 0x05f9 }
            r3 = 0
            r16 = 0
            r20 = 0
            r25 = 0
        L_0x02e3:
            java.util.LinkedList<te3.tu4> r0 = r5.f143150e
            int r0 = r0.size()
            if (r3 >= r0) goto L_0x0530
            java.util.LinkedList<te3.tu4> r0 = r5.f143150e
            java.lang.Object r0 = r0.get(r3)
            r11 = r0
            te3.tu4 r11 = (te3.tu4) r11
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r22 = r5
            java.lang.String r5 = "__parse voip notify, item cmdid:"
            r0.append(r5)
            int r5 = r11.f142429d
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r0)
            int r0 = r11.f142429d
            java.lang.String r5 = "]"
            r27 = r2
            r2 = 1
            if (r0 != r2) goto L_0x0399
            te3.aw4 r0 = new te3.aw4     // Catch:{ IOException -> 0x0329 }
            r0.<init>()     // Catch:{ IOException -> 0x0329 }
            te3.qv3 r2 = r11.f142432g     // Catch:{ IOException -> 0x0329 }
            pe3.b r2 = r2.f140574f     // Catch:{ IOException -> 0x0329 }
            byte[] r2 = r2.f257327a     // Catch:{ IOException -> 0x0329 }
            pe3.a r0 = r0.parseFrom(r2)     // Catch:{ IOException -> 0x0329 }
            te3.aw4 r0 = (te3.aw4) r0     // Catch:{ IOException -> 0x0329 }
            r28 = r3
            goto L_0x0336
        L_0x0329:
            r0 = move-exception
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r8)
            r28 = r3
            r2 = 0
            java.lang.Object[] r3 = new java.lang.Object[r2]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r7, r0, r6, r3)
            r0 = 0
        L_0x0336:
            if (r0 == 0) goto L_0x0394
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "voip notify status:"
            r2.append(r3)
            int r3 = r0.f130810e
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r2)
            int r2 = r11.f142431f
            long r2 = (long) r2
            int r29 = (r16 > r2 ? 1 : (r16 == r2 ? 0 : -1))
            if (r29 >= 0) goto L_0x0358
            r16 = r2
        L_0x0358:
            int r29 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r29 <= 0) goto L_0x0528
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "voiop notify status key["
            r2.append(r3)
            int r3 = r11.f142431f
            r2.append(r3)
            java.lang.String r3 = "] > local status key["
            r2.append(r3)
            r2.append(r9)
            java.lang.String r3 = "] status["
            r2.append(r3)
            int r3 = r0.f130810e
            r2.append(r3)
            r2.append(r5)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r2)
            com.tencent.mm.plugin.voip.model.m0 r2 = r1.f317332a
            com.tencent.mm.plugin.voip.model.r r2 = r2.f317396a
            com.tencent.mm.plugin.voip.model.o0 r2 = r2.f317451B
            r3 = 1
            r2.mo152684c(r0, r3)
            goto L_0x0528
        L_0x0394:
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r8)
            goto L_0x0528
        L_0x0399:
            r28 = r3
            r2 = 2
            if (r0 != r2) goto L_0x04b2
            te3.pv4 r0 = new te3.pv4     // Catch:{ IOException -> 0x03b0 }
            r0.<init>()     // Catch:{ IOException -> 0x03b0 }
            te3.qv3 r2 = r11.f142432g     // Catch:{ IOException -> 0x03b0 }
            pe3.b r2 = r2.f140574f     // Catch:{ IOException -> 0x03b0 }
            byte[] r2 = r2.f257327a     // Catch:{ IOException -> 0x03b0 }
            pe3.a r0 = r0.parseFrom(r2)     // Catch:{ IOException -> 0x03b0 }
            te3.pv4 r0 = (te3.pv4) r0     // Catch:{ IOException -> 0x03b0 }
            goto L_0x03bb
        L_0x03b0:
            r0 = move-exception
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r4)
            r2 = 0
            java.lang.Object[] r3 = new java.lang.Object[r2]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r7, r0, r6, r3)
            r0 = 0
        L_0x03bb:
            if (r0 == 0) goto L_0x04ad
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "notify relay data type:"
            r2.append(r3)
            int r3 = r0.f184900d
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r2)
            int r2 = r11.f142431f
            long r2 = (long) r2
            int r29 = (r20 > r2 ? 1 : (r20 == r2 ? 0 : -1))
            if (r29 >= 0) goto L_0x03dc
            r20 = r2
        L_0x03dc:
            int r29 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
            if (r29 <= 0) goto L_0x048a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "notify relaydata key:["
            r2.append(r3)
            int r3 = r11.f142431f
            r2.append(r3)
            java.lang.String r3 = "] > local relaydata key["
            r2.append(r3)
            r2.append(r12)
            r2.append(r5)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r2)
            int r2 = r0.f184900d
            r3 = 5
            if (r2 != r3) goto L_0x041d
            com.tencent.mm.plugin.voip.model.m0 r2 = r1.f317332a
            com.tencent.mm.plugin.voip.model.r r2 = r2.f317396a
            com.tencent.mm.plugin.voip.model.o0 r2 = r2.f317451B
            r2.getClass()
            com.tencent.mm.sdk.platformtools.MMHandlerThread r3 = f40.C86709a0.m107525e()
            com.tencent.mm.plugin.voip.model.r0 r5 = new com.tencent.mm.plugin.voip.model.r0
            r5.<init>(r2, r0)
            r3.postToWorker(r5)
            goto L_0x0528
        L_0x041d:
            r3 = 1
            if (r2 != r3) goto L_0x0439
            com.tencent.mm.plugin.voip.model.m0 r2 = r1.f317332a
            com.tencent.mm.plugin.voip.model.r r2 = r2.f317396a
            com.tencent.mm.plugin.voip.model.o0 r2 = r2.f317451B
            com.tencent.mm.plugin.voip.model.r r2 = r2.f317444a
            te3.qv3 r0 = r0.f184901e
            pe3.b r0 = r0.f140574f
            byte[] r0 = r0.mo123703f()
            com.tencent.mm.plugin.voip.model.v2protocal r3 = r2.f317500x
            r3.f317677u = r0
            r2.mo152712o()
            goto L_0x0528
        L_0x0439:
            r3 = 6
            if (r2 != r3) goto L_0x0472
            te3.qv3 r0 = r0.f184901e
            pe3.b r0 = r0.f140574f
            byte[] r0 = r0.mo123703f()
            te3.iv4 r2 = new te3.iv4     // Catch:{ IOException -> 0x0450 }
            r2.<init>()     // Catch:{ IOException -> 0x0450 }
            pe3.a r0 = r2.parseFrom(r0)     // Catch:{ IOException -> 0x0450 }
            te3.iv4 r0 = (te3.iv4) r0     // Catch:{ IOException -> 0x0450 }
            goto L_0x0458
        L_0x0450:
            r0 = move-exception
            r2 = 0
            java.lang.Object[] r3 = new java.lang.Object[r2]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r7, r0, r6, r3)
            r0 = 0
        L_0x0458:
            if (r0 == 0) goto L_0x0528
            com.tencent.mm.plugin.voip.model.m0 r2 = r1.f317332a
            com.tencent.mm.plugin.voip.model.r r2 = r2.f317396a
            com.tencent.mm.plugin.voip.model.o0 r2 = r2.f317451B
            r2.getClass()
            com.tencent.mm.sdk.platformtools.MMHandlerThread r3 = f40.C86709a0.m107525e()
            com.tencent.mm.plugin.voip.model.q0 r5 = new com.tencent.mm.plugin.voip.model.q0
            r11 = 0
            r5.<init>(r2, r0, r11)
            r3.postToWorker(r5)
            goto L_0x0528
        L_0x0472:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "notify relaydata unknown type:"
            r2.append(r3)
            int r0 = r0.f184900d
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r0)
            goto L_0x0528
        L_0x048a:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "notify relaydata item key["
            r0.append(r2)
            int r2 = r11.f142431f
            r0.append(r2)
            java.lang.String r2 = "] <=local relaydatakey["
            r0.append(r2)
            r0.append(r12)
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r0)
            goto L_0x0528
        L_0x04ad:
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r4)
            goto L_0x0528
        L_0x04b2:
            r2 = 3
            if (r0 != r2) goto L_0x0528
            te3.qv3 r0 = new te3.qv3     // Catch:{ IOException -> 0x04c4 }
            r0.<init>()     // Catch:{ IOException -> 0x04c4 }
            te3.qv3 r2 = r11.f142432g     // Catch:{ IOException -> 0x04c4 }
            pe3.b r2 = r2.f140574f     // Catch:{ IOException -> 0x04c4 }
            byte[] r2 = r2.f257327a     // Catch:{ IOException -> 0x04c4 }
            r0.mo73348f(r2)     // Catch:{ IOException -> 0x04c4 }
            goto L_0x04cc
        L_0x04c4:
            r0 = move-exception
            r2 = 0
            java.lang.Object[] r3 = new java.lang.Object[r2]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r7, r0, r6, r3)
            r0 = 0
        L_0x04cc:
            if (r0 == 0) goto L_0x0528
            int r2 = r11.f142431f
            long r2 = (long) r2
            int r29 = (r25 > r2 ? 1 : (r25 == r2 ? 0 : -1))
            if (r29 >= 0) goto L_0x04d7
            r25 = r2
        L_0x04d7:
            int r29 = (r2 > r14 ? 1 : (r2 == r14 ? 0 : -1))
            if (r29 <= 0) goto L_0x0528
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "notify connectingStatkey["
            r2.append(r3)
            int r3 = r11.f142431f
            r2.append(r3)
            java.lang.String r3 = "]> local connectingstatus key["
            r2.append(r3)
            r2.append(r14)
            r2.append(r5)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r2)
            com.tencent.mm.plugin.voip.model.m0 r2 = r1.f317332a
            com.tencent.mm.plugin.voip.model.r r2 = r2.f317396a
            com.tencent.mm.plugin.voip.model.o0 r2 = r2.f317451B
            r2.mo152683b(r0)
            te3.yu4 r2 = r1.f317349r
            if (r2 == 0) goto L_0x0528
            pe3.b r0 = r0.f140574f
            byte[] r0 = r0.mo123703f()
            r2 = 0
            r3 = 0
        L_0x0511:
            r5 = 4
            if (r2 >= r5) goto L_0x051f
            byte r5 = r0[r2]
            r5 = r5 & 255(0xff, float:3.57E-43)
            int r11 = r2 * 8
            int r5 = r5 << r11
            r3 = r3 | r5
            int r2 = r2 + 1
            goto L_0x0511
        L_0x051f:
            r0 = r3 & 255(0xff, float:3.57E-43)
            r2 = 1
            if (r0 != r2) goto L_0x0528
            te3.yu4 r0 = r1.f317349r
            r0.f145526j = r2
        L_0x0528:
            int r3 = r28 + 1
            r5 = r22
            r2 = r27
            goto L_0x02e3
        L_0x0530:
            r27 = r2
            int r0 = (r16 > r9 ? 1 : (r16 == r9 ? 0 : -1))
            if (r0 <= 0) goto L_0x0538
            r9 = r16
        L_0x0538:
            int r0 = (r20 > r12 ? 1 : (r20 == r12 ? 0 : -1))
            if (r0 <= 0) goto L_0x053e
            r12 = r20
        L_0x053e:
            int r0 = (r25 > r14 ? 1 : (r25 == r14 ? 0 : -1))
            if (r0 <= 0) goto L_0x0544
            r14 = r25
        L_0x0544:
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r2 = 1
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Long r3 = java.lang.Long.valueOf(r9)
            r0.put(r2, r3)
            r2 = 2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Long r3 = java.lang.Long.valueOf(r12)
            r0.put(r2, r3)
            r2 = 3
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Long r3 = java.lang.Long.valueOf(r14)
            r0.put(r2, r3)
            te3.fe4 r2 = new te3.fe4
            r2.<init>()
            java.util.LinkedList r3 = new java.util.LinkedList
            r3.<init>()
            java.util.Set r4 = r0.keySet()
            java.util.Iterator r4 = r4.iterator()
        L_0x057f:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x05a6
            java.lang.Object r5 = r4.next()
            java.lang.Integer r5 = (java.lang.Integer) r5
            te3.yl2 r8 = new te3.yl2
            r8.<init>()
            int r11 = r5.intValue()
            r8.f186575d = r11
            java.lang.Object r5 = r0.get(r5)
            java.lang.Long r5 = (java.lang.Long) r5
            int r5 = r5.intValue()
            r8.f186576e = r5
            r3.push(r8)
            goto L_0x057f
        L_0x05a6:
            r2.f183129e = r3
            int r0 = r3.size()
            r2.f183128d = r0
            byte[] r0 = r2.toByteArray()     // Catch:{ IOException -> 0x05b3 }
            goto L_0x05bc
        L_0x05b3:
            r0 = move-exception
            r2 = r0
            r3 = 0
            java.lang.Object[] r0 = new java.lang.Object[r3]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r7, r2, r6, r0)
            r0 = 0
        L_0x05bc:
            com.tencent.mm.plugin.voip.model.m0 r2 = r1.f317332a
            com.tencent.mm.plugin.voip.model.r r2 = r2.f317396a
            com.tencent.mm.plugin.voip.model.v2protocal r3 = r2.f317500x
            int r4 = r3.f317656n
            r5 = r27
            if (r5 != r4) goto L_0x05f3
            long r3 = r3.f317665q
            int r5 = (r23 > r3 ? 1 : (r23 == r3 ? 0 : -1))
            if (r5 != 0) goto L_0x05f3
            r2.f317452C = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "voipNotify:ext notify data new keys:"
            r0.append(r2)
            r0.append(r9)
            java.lang.String r2 = ", "
            r0.append(r2)
            r0.append(r12)
            r0.append(r2)
            r0.append(r14)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r0)
        L_0x05f3:
            java.lang.String r0 = "__parse voip notify end"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r0)
            goto L_0x0658
        L_0x05f9:
            r0 = move-exception
            r2 = 0
            java.lang.Object[] r4 = new java.lang.Object[r2]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r7, r0, r6, r4)
            r0 = 0
        L_0x0601:
            if (r0 >= r3) goto L_0x0639
            byte r2 = r11[r0]
            r2 = r2 & 255(0xff, float:3.57E-43)
            java.lang.String r2 = java.lang.Integer.toHexString(r2)
            int r4 = r2.length()
            r5 = 1
            if (r4 != r5) goto L_0x0623
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r5 = 48
            r4.append(r5)
            r4.append(r2)
            java.lang.String r2 = r4.toString()
        L_0x0623:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r6)
            java.lang.String r2 = r2.toUpperCase()
            r4.append(r2)
            java.lang.String r6 = r4.toString()
            int r0 = r0 + 1
            goto L_0x0601
        L_0x0639:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "parse voip extNotifyData fail extNotifyData size "
            r0.append(r2)
            r0.append(r3)
            java.lang.String r2 = " first byte "
            r0.append(r2)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r0)
            goto L_0x0658
        L_0x0656:
            r19 = r5
        L_0x0658:
            com.tencent.mm.plugin.voip.model.m0 r0 = r1.f317332a
            r0.getClass()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = p206nj.C76861g.m92660c()
            r1.append(r2)
            java.lang.String r2 = " need doSync by notify, status:"
            r1.append(r2)
            com.tencent.mm.plugin.voip.model.r r2 = r0.f317396a
            int r2 = r2.f317476a
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r2 = r19
            z33.C112597j.m153938c(r2, r1)
            com.tencent.mm.plugin.voip.model.r r0 = r0.f317396a
            com.tencent.mm.plugin.voip.model.o0 r0 = r0.f317451B
            r1 = 7
            r2 = 0
            r3 = 0
            r0.mo152682a(r2, r3, r1)
            goto L_0x09c4
        L_0x068a:
            boolean r3 = p182kk.C61104a.m71644D()
            if (r3 == 0) goto L_0x069f
            com.tencent.mm.autogen.events.VoipEvent$a r0 = r0.f194019d
            android.content.Context r0 = r0.f194024d
            r1 = 2131838655(0x7f1146bf, float:1.931054E38)
            r2 = 2131821704(0x7f110488, float:1.9276159E38)
            nj3.C76879j.m92738i(r0, r1, r2)
            goto L_0x09c4
        L_0x069f:
            com.tencent.mm.autogen.events.VoipEvent$a r3 = r0.f194019d
            android.content.Context r3 = r3.f194024d
            r4 = 0
            boolean r3 = p182kk.C61104a.m71663s(r3, r4)
            if (r3 == 0) goto L_0x06ac
            goto L_0x09c4
        L_0x06ac:
            com.tencent.mm.autogen.events.VoipEvent$a r0 = r0.f194019d
            int r3 = r0.f194026f
            r4 = 2
            if (r3 != r4) goto L_0x06bc
            android.content.Context r1 = r0.f194024d
            java.lang.String r0 = r0.f194025e
            com.tencent.p014mm.plugin.voip.model.C106348g0.m143247h(r1, r0)
            goto L_0x09c4
        L_0x06bc:
            java.lang.String r4 = "MicroMsg.VoipPluginManager"
            r5 = 3
            if (r3 != r5) goto L_0x0738
            android.content.Context r3 = r0.f194024d
            java.lang.String r5 = r0.f194025e
            java.lang.Class<lc3.b> r0 = lc3.C10485b.class
            k40.a r0 = f40.C86709a0.m107533q(r0)
            lc3.b r0 = (lc3.C10485b) r0
            pj.d r0 = r0.g50()
            int r0 = r0.mo72515h()
            r7 = 2
            if (r0 != r7) goto L_0x06da
            r0 = 1
            goto L_0x06db
        L_0x06da:
            r0 = 0
        L_0x06db:
            if (r0 != 0) goto L_0x06f1
            java.lang.Object[] r7 = new java.lang.Object[r7]
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r8 = 0
            r7[r8] = r0
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r9 = 1
            r7[r9] = r0
            java.lang.String r0 = "showDouble %b, isLiteVersion: %b"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r0, r7)
            goto L_0x06f2
        L_0x06f1:
            r8 = 0
        L_0x06f2:
            com.tencent.p014mm.plugin.voip.model.C106348g0.f317314a = r8
            k40.a r0 = f40.C86709a0.m107533q(r2)     // Catch:{ Exception -> 0x070f }
            f62.k0 r0 = (f62.C75700k0) r0     // Catch:{ Exception -> 0x070f }
            g62.l r0 = r0.mo96095LE()     // Catch:{ Exception -> 0x070f }
            com.tencent.mm.storage.g4 r0 = (com.tencent.p014mm.storage.C72972g4) r0     // Catch:{ Exception -> 0x070f }
            com.tencent.mm.storage.f4 r0 = r0.Mx0(r5)     // Catch:{ Exception -> 0x070f }
            if (r0 == 0) goto L_0x0716
            r0.getCreateTime()     // Catch:{ Exception -> 0x070f }
            android.net.Uri r0 = z33.C91617n.f262467a     // Catch:{ Exception -> 0x070f }
            r2 = 1
            com.tencent.p014mm.plugin.voip.model.C106348g0.f317314a = r2     // Catch:{ Exception -> 0x070f }
            goto L_0x0716
        L_0x070f:
            r0 = move-exception
            r2 = 0
            java.lang.Object[] r7 = new java.lang.Object[r2]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r4, r0, r6, r7)
        L_0x0716:
            di3.d r0 = di3.C86312j.m106911c(r1)
            r7 = r0
            aw.d r7 = (p447aw.C103918d) r7
            r10 = 82
            com.tencent.mm.plugin.voip.model.g0$$h r13 = new com.tencent.mm.plugin.voip.model.g0$$h
            r13.<init>(r3)
            java.lang.String r9 = "android.permission.RECORD_AUDIO"
            java.lang.String r11 = ""
            java.lang.String r12 = ""
            r8 = r3
            boolean r0 = r7.mo125775MJ(r8, r9, r10, r11, r12, r13)
            if (r0 != 0) goto L_0x0733
            goto L_0x09c4
        L_0x0733:
            com.tencent.p014mm.plugin.voip.model.C106348g0.m143240a(r3, r5)
            goto L_0x09c4
        L_0x0738:
            r5 = 4
            if (r3 != r5) goto L_0x09c4
            android.content.Context r3 = r0.f194024d
            java.lang.String r5 = r0.f194025e
            r7 = 0
            com.tencent.p014mm.plugin.voip.model.C106348g0.f317314a = r7
            k40.a r0 = f40.C86709a0.m107533q(r2)     // Catch:{ Exception -> 0x075d }
            f62.k0 r0 = (f62.C75700k0) r0     // Catch:{ Exception -> 0x075d }
            g62.l r0 = r0.mo96095LE()     // Catch:{ Exception -> 0x075d }
            com.tencent.mm.storage.g4 r0 = (com.tencent.p014mm.storage.C72972g4) r0     // Catch:{ Exception -> 0x075d }
            com.tencent.mm.storage.f4 r0 = r0.Mx0(r5)     // Catch:{ Exception -> 0x075d }
            if (r0 == 0) goto L_0x0764
            r0.getCreateTime()     // Catch:{ Exception -> 0x075d }
            android.net.Uri r0 = z33.C91617n.f262467a     // Catch:{ Exception -> 0x075d }
            r2 = 1
            com.tencent.p014mm.plugin.voip.model.C106348g0.f317314a = r2     // Catch:{ Exception -> 0x075d }
            goto L_0x0764
        L_0x075d:
            r0 = move-exception
            r2 = 0
            java.lang.Object[] r7 = new java.lang.Object[r2]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r4, r0, r6, r7)
        L_0x0764:
            di3.d r0 = di3.C86312j.m106911c(r1)
            r7 = r0
            aw.d r7 = (p447aw.C103918d) r7
            r10 = 82
            com.tencent.mm.plugin.voip.model.g0$$i r13 = new com.tencent.mm.plugin.voip.model.g0$$i
            r13.<init>(r3)
            java.lang.String r9 = "android.permission.RECORD_AUDIO"
            java.lang.String r11 = ""
            java.lang.String r12 = ""
            r8 = r3
            boolean r0 = r7.mo125775MJ(r8, r9, r10, r11, r12, r13)
            if (r0 != 0) goto L_0x0781
            goto L_0x09c4
        L_0x0781:
            com.tencent.p014mm.plugin.voip.model.C106348g0.m143240a(r3, r5)
            goto L_0x09c4
        L_0x0786:
            com.tencent.mm.autogen.events.VoipEvent$b r0 = r0.f194020e
            com.tencent.mm.plugin.voip.model.h0 r8 = l33.C109247e.xx0()
            r8.getClass()
            android.content.Context r9 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            boolean r1 = r8.f317334c
            if (r1 == 0) goto L_0x07ea
            boolean r1 = r8.f317346o
            if (r1 == 0) goto L_0x07ea
            boolean r1 = r8.f317347p
            if (r1 != 0) goto L_0x07ea
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "isVideoCalling "
            r1.append(r3)
            boolean r3 = r8.f317335d
            r1.append(r3)
            java.lang.String r3 = " isAudioCalling "
            r1.append(r3)
            boolean r3 = r8.f317336e
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r7, r1)
            java.lang.String r1 = r8.f317338g
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r1 == 0) goto L_0x07c8
            goto L_0x07ea
        L_0x07c8:
            k40.a r1 = f40.C86709a0.m107533q(r2)
            f62.k0 r1 = (f62.C75700k0) r1
            com.tencent.mm.storage.u3 r1 = r1.mo96097Ni()
            java.lang.String r2 = r8.f317338g
            com.tencent.mm.storage.z1 r1 = r1.get(r2)
            if (r1 != 0) goto L_0x07db
            goto L_0x07ea
        L_0x07db:
            java.lang.String r10 = r8.f317338g
            long r11 = r8.mo152616o()
            r13 = 1
            boolean r14 = r8.f317335d
            r15 = 1
            r8.mo152595I(r9, r10, r11, r13, r14, r15)
            r15 = 1
            goto L_0x07eb
        L_0x07ea:
            r15 = 0
        L_0x07eb:
            r0.f194029c = r15
            goto L_0x09c4
        L_0x07ef:
            com.tencent.mm.plugin.voip.model.h0 r1 = l33.C109247e.xx0()
            com.tencent.mm.autogen.events.VoipEvent$a r0 = r0.f194019d
            byte[] r0 = r0.f194023c
            r1.getClass()
            if (r0 != 0) goto L_0x07fe
            goto L_0x09c4
        L_0x07fe:
            int r2 = r0.length
            r3 = 10
            if (r2 >= r3) goto L_0x0805
            goto L_0x09c4
        L_0x0805:
            r2 = 0
            byte r3 = r0[r2]
            r4 = 1
            if (r3 == r4) goto L_0x080d
            goto L_0x09c4
        L_0x080d:
            int r3 = r0.length
            int r3 = r3 - r4
            byte[] r8 = new byte[r3]
            java.lang.System.arraycopy(r0, r4, r8, r2, r3)
            com.tencent.mm.plugin.voip.model.m0 r0 = r1.f317332a
            com.tencent.mm.plugin.voip.model.r r0 = r0.f317396a
            com.tencent.mm.plugin.voip.model.v2protocal r0 = r0.f317500x
            com.tencent.mm.plugin.voip.model.z r0 = r0.f317568G1
            r0.getClass()
            long r2 = java.lang.System.currentTimeMillis()
            r0.f317754I = r2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "devin:recvInvite:"
            r2.append(r3)
            long r3 = r0.f317754I
            r2.append(r3)
            java.lang.String r0 = r2.toString()
            java.lang.String r2 = "MicroMsg.VoipDailReport"
            z33.C112597j.m153936a(r2, r0)
            te3.yu4 r0 = new te3.yu4     // Catch:{ IOException -> 0x0986 }
            r0.<init>()     // Catch:{ IOException -> 0x0986 }
            pe3.a r0 = r0.parseFrom(r8)     // Catch:{ IOException -> 0x0986 }
            te3.yu4 r0 = (te3.yu4) r0     // Catch:{ IOException -> 0x0986 }
            java.lang.String r2 = "doTaskCallin in onInviteNotify, roomid:%d, roomkey:%s, time:%d"
            r3 = 3
            java.lang.Object[] r4 = new java.lang.Object[r3]     // Catch:{ IOException -> 0x0986 }
            int r3 = r0.f145520d     // Catch:{ IOException -> 0x0986 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ IOException -> 0x0986 }
            r8 = 0
            r4[r8] = r3     // Catch:{ IOException -> 0x0986 }
            long r8 = r0.f145521e     // Catch:{ IOException -> 0x0986 }
            java.lang.Long r3 = java.lang.Long.valueOf(r8)     // Catch:{ IOException -> 0x0986 }
            r8 = 1
            r4[r8] = r3     // Catch:{ IOException -> 0x0986 }
            int r3 = r0.f145522f     // Catch:{ IOException -> 0x0986 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ IOException -> 0x0986 }
            r8 = 2
            r4[r8] = r3     // Catch:{ IOException -> 0x0986 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r2, r4)     // Catch:{ IOException -> 0x0986 }
            boolean r2 = r1.f317352u     // Catch:{ IOException -> 0x0986 }
            if (r2 != 0) goto L_0x087a
            int r2 = r0.f145520d     // Catch:{ IOException -> 0x0986 }
            long r3 = r0.f145521e     // Catch:{ IOException -> 0x0986 }
            r8 = 2
            r9 = 1
            z33.C112597j.m153945j(r2, r3, r9, r8)     // Catch:{ IOException -> 0x0986 }
            r1.f317352u = r9     // Catch:{ IOException -> 0x0986 }
        L_0x087a:
            com.tencent.mm.plugin.voip.model.m0 r2 = r1.f317332a     // Catch:{ IOException -> 0x0986 }
            boolean r2 = r2.mo152663h()     // Catch:{ IOException -> 0x0986 }
            r3 = 11523(0x2d03, float:1.6147E-41)
            if (r2 != 0) goto L_0x08c6
            com.tencent.mm.plugin.voip.model.VoipIncomingCallManager r2 = r1.f317357z     // Catch:{ IOException -> 0x0986 }
            te3.yu4 r2 = r2.f317150o     // Catch:{ IOException -> 0x0986 }
            if (r2 == 0) goto L_0x088c
            r2 = 1
            goto L_0x088d
        L_0x088c:
            r2 = 0
        L_0x088d:
            if (r2 != 0) goto L_0x08c6
            com.tencent.mm.plugin.report.service.n r2 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE     // Catch:{ IOException -> 0x0986 }
            r4 = 5
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ IOException -> 0x0986 }
            int r8 = r0.f145520d     // Catch:{ IOException -> 0x0986 }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ IOException -> 0x0986 }
            r9 = 0
            r4[r9] = r8     // Catch:{ IOException -> 0x0986 }
            long r8 = r0.f145521e     // Catch:{ IOException -> 0x0986 }
            java.lang.Long r8 = java.lang.Long.valueOf(r8)     // Catch:{ IOException -> 0x0986 }
            r9 = 1
            r4[r9] = r8     // Catch:{ IOException -> 0x0986 }
            int r8 = r0.f145526j     // Catch:{ IOException -> 0x0986 }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ IOException -> 0x0986 }
            r9 = 2
            r4[r9] = r8     // Catch:{ IOException -> 0x0986 }
            r8 = 3
            r4[r8] = r5     // Catch:{ IOException -> 0x0986 }
            long r8 = java.lang.System.currentTimeMillis()     // Catch:{ IOException -> 0x0986 }
            java.lang.Long r5 = java.lang.Long.valueOf(r8)     // Catch:{ IOException -> 0x0986 }
            r8 = 4
            r4[r8] = r5     // Catch:{ IOException -> 0x0986 }
            r5 = 1
            r2.mo160140o(r3, r5, r5, r4)     // Catch:{ IOException -> 0x0986 }
            r1.mo152611i(r0)     // Catch:{ IOException -> 0x0986 }
            goto L_0x09c4
        L_0x08c6:
            com.tencent.mm.plugin.voip.model.m0 r2 = r1.f317332a     // Catch:{ IOException -> 0x0986 }
            com.tencent.mm.plugin.voip.model.r r2 = r2.f317396a     // Catch:{ IOException -> 0x0986 }
            int r2 = r2.f317476a     // Catch:{ IOException -> 0x0986 }
            r4 = 5
            if (r2 < r4) goto L_0x08d1
            r2 = 1
            goto L_0x08d2
        L_0x08d1:
            r2 = 0
        L_0x08d2:
            if (r2 == 0) goto L_0x08ef
            com.tencent.mm.plugin.voip.model.VoipIncomingCallManager r2 = r1.f317357z     // Catch:{ IOException -> 0x0986 }
            int r4 = r0.f145526j     // Catch:{ IOException -> 0x0986 }
            if (r4 != 0) goto L_0x08dc
            r4 = 1
            goto L_0x08dd
        L_0x08dc:
            r4 = 0
        L_0x08dd:
            boolean r2 = r2.mo152525k(r4)     // Catch:{ IOException -> 0x0986 }
            if (r2 == 0) goto L_0x08ef
            java.lang.String r2 = "doTaskCallIn implVoip is connected, IncomingCallManager has take over this call!"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r2)     // Catch:{ IOException -> 0x0986 }
            com.tencent.mm.plugin.voip.model.VoipIncomingCallManager r1 = r1.f317357z     // Catch:{ IOException -> 0x0986 }
            r1.mo152524b(r0)     // Catch:{ IOException -> 0x0986 }
            goto L_0x09c4
        L_0x08ef:
            java.lang.String r2 = "doTaskCallIn, try response busy"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r2)     // Catch:{ IOException -> 0x0986 }
            com.tencent.mm.plugin.voip.model.m0 r2 = r1.f317332a     // Catch:{ IOException -> 0x0986 }
            int r2 = r2.mo152659e()     // Catch:{ IOException -> 0x0986 }
            int r4 = r0.f145520d     // Catch:{ IOException -> 0x0986 }
            if (r2 == r4) goto L_0x094c
            com.tencent.mm.plugin.voip.model.m0 r2 = r1.f317332a     // Catch:{ IOException -> 0x0986 }
            long r8 = r2.mo152660f()     // Catch:{ IOException -> 0x0986 }
            long r10 = r0.f145521e     // Catch:{ IOException -> 0x0986 }
            int r2 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r2 == 0) goto L_0x094c
            com.tencent.mm.plugin.voip.model.VoipIncomingCallManager r2 = r1.f317357z     // Catch:{ IOException -> 0x0986 }
            te3.yu4 r2 = r2.f317150o     // Catch:{ IOException -> 0x0986 }
            if (r2 == 0) goto L_0x0913
            int r4 = r2.f145520d     // Catch:{ IOException -> 0x0986 }
            goto L_0x0914
        L_0x0913:
            r4 = 0
        L_0x0914:
            int r8 = r0.f145520d     // Catch:{ IOException -> 0x0986 }
            if (r4 == r8) goto L_0x094c
            if (r2 == 0) goto L_0x091d
            long r12 = r2.f145521e     // Catch:{ IOException -> 0x0986 }
            goto L_0x091f
        L_0x091d:
            r12 = 0
        L_0x091f:
            int r2 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r2 == 0) goto L_0x094c
            java.lang.String r2 = "doTaskCallIn, response busy, %s %s"
            r4 = 2
            java.lang.Object[] r9 = new java.lang.Object[r4]     // Catch:{ IOException -> 0x0986 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r8)     // Catch:{ IOException -> 0x0986 }
            r8 = 0
            r9[r8] = r4     // Catch:{ IOException -> 0x0986 }
            long r10 = r0.f145521e     // Catch:{ IOException -> 0x0986 }
            java.lang.Long r4 = java.lang.Long.valueOf(r10)     // Catch:{ IOException -> 0x0986 }
            r8 = 1
            r9[r8] = r4     // Catch:{ IOException -> 0x0986 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r2, r9)     // Catch:{ IOException -> 0x0986 }
            com.tencent.mm.plugin.voip.model.m0 r10 = r1.f317332a     // Catch:{ IOException -> 0x0986 }
            int r11 = r0.f145520d     // Catch:{ IOException -> 0x0986 }
            long r12 = r0.f145521e     // Catch:{ IOException -> 0x0986 }
            r14 = 2
            r15 = 0
            r16 = 0
            java.lang.String r2 = r1.f317338g     // Catch:{ IOException -> 0x0986 }
            r17 = r2
            r10.mo152658d(r11, r12, r14, r15, r16, r17)     // Catch:{ IOException -> 0x0986 }
        L_0x094c:
            com.tencent.mm.plugin.voip.model.VoipIncomingCallManager r1 = r1.f317357z     // Catch:{ IOException -> 0x0986 }
            r2 = 9
            r1.mo152521G(r2, r0)     // Catch:{ IOException -> 0x0986 }
            com.tencent.mm.plugin.report.service.n r1 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE     // Catch:{ IOException -> 0x0986 }
            r2 = 5
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ IOException -> 0x0986 }
            int r4 = r0.f145520d     // Catch:{ IOException -> 0x0986 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ IOException -> 0x0986 }
            r8 = 0
            r2[r8] = r4     // Catch:{ IOException -> 0x0986 }
            long r8 = r0.f145521e     // Catch:{ IOException -> 0x0986 }
            java.lang.Long r4 = java.lang.Long.valueOf(r8)     // Catch:{ IOException -> 0x0986 }
            r8 = 1
            r2[r8] = r4     // Catch:{ IOException -> 0x0986 }
            int r0 = r0.f145526j     // Catch:{ IOException -> 0x0986 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ IOException -> 0x0986 }
            r4 = 2
            r2[r4] = r0     // Catch:{ IOException -> 0x0986 }
            r4 = 3
            r2[r4] = r5     // Catch:{ IOException -> 0x0986 }
            long r4 = java.lang.System.currentTimeMillis()     // Catch:{ IOException -> 0x0986 }
            java.lang.Long r0 = java.lang.Long.valueOf(r4)     // Catch:{ IOException -> 0x0986 }
            r4 = 4
            r2[r4] = r0     // Catch:{ IOException -> 0x0986 }
            r4 = 1
            r1.mo160140o(r3, r4, r4, r2)     // Catch:{ IOException -> 0x0986 }
            goto L_0x09c4
        L_0x0986:
            r0 = move-exception
            r1 = 0
            java.lang.Object[] r2 = new java.lang.Object[r1]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r7, r0, r6, r2)
            goto L_0x09c4
        L_0x098e:
            com.tencent.mm.autogen.events.VoipEvent$b r0 = r0.f194020e
            com.tencent.mm.plugin.voip.model.h0 r1 = l33.C109247e.xx0()
            boolean r1 = r1.f317334c
            r0.f194028b = r1
            goto L_0x09c4
        L_0x0999:
            com.tencent.mm.plugin.voip.model.h0 r1 = l33.C109247e.xx0()
            com.tencent.mm.autogen.events.VoipEvent$a r2 = r0.f194019d
            java.lang.String r2 = r2.f194021a
            com.tencent.mm.plugin.voip.model.a0$a r1 = r1.mo152626y(r2)
            if (r1 != 0) goto L_0x09a8
            goto L_0x09c4
        L_0x09a8:
            int r1 = r1.f317175d
            if (r1 != 0) goto L_0x09ae
            r12 = 1
            goto L_0x09af
        L_0x09ae:
            r12 = 0
        L_0x09af:
            if (r12 == 0) goto L_0x09b7
            com.tencent.mm.autogen.events.VoipEvent$b r0 = r0.f194020e
            r1 = 2
            r0.f194027a = r1
            goto L_0x09c4
        L_0x09b7:
            r2 = 1
            if (r1 != r2) goto L_0x09bc
            r15 = 1
            goto L_0x09bd
        L_0x09bc:
            r15 = 0
        L_0x09bd:
            if (r15 == 0) goto L_0x09c4
            com.tencent.mm.autogen.events.VoipEvent$b r0 = r0.f194020e
            r1 = 3
            r0.f194027a = r1
        L_0x09c4:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: l33.C109253h.callback(com.tencent.mm.sdk.event.IEvent):boolean");
    }
}
