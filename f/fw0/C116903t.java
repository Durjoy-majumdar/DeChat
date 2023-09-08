package fw0;

import jc3.C87947e;

/* renamed from: fw0.t */
public class C116903t implements C87947e {
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0207  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0224  */
    /* renamed from: W1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo119070W1(com.tencent.p014mm.booter.NotifyReceiver.NotifyService r25, int r26, byte[] r27, byte[] r28, long r29) {
        /*
            r24 = this;
            r0 = r25
            r2 = r27
            java.lang.String r6 = ""
            r1 = 6
            java.lang.String r3 = "NotifyReceiver.dealWithNotify:MM_PKT_VOIP_REQ"
            r4 = 5000(0x1388, double:2.4703E-320)
            r7 = 10
            r8 = 4
            r9 = 3
            r10 = -1
            r11 = 2
            r12 = 1
            r13 = 0
            java.lang.String r14 = "MicroMsg.NotifyReceiverCallbackImpl"
            switch(r26) {
                case 10: goto L_0x03a2;
                case 102: goto L_0x039c;
                case 120: goto L_0x02eb;
                case 174: goto L_0x02d6;
                case 192: goto L_0x02c8;
                case 241: goto L_0x027d;
                case 271: goto L_0x0238;
                case 318: goto L_0x0118;
                case 319: goto L_0x00d2;
                case 320: goto L_0x00c0;
                case 322: goto L_0x00ae;
                case 3941: goto L_0x0099;
                case 6238: goto L_0x0075;
                case 10098: goto L_0x0038;
                case 268369923: goto L_0x001a;
                default: goto L_0x0018;
            }
        L_0x0018:
            goto L_0x03d7
        L_0x001a:
            r0.mo112552l(r4, r3)
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((byte[]) r27)
            if (r0 != 0) goto L_0x03d7
            java.lang.String r0 = new java.lang.String
            r0.<init>(r2)
            com.tencent.mm.autogen.events.BroadcastEvent r1 = new com.tencent.mm.autogen.events.BroadcastEvent
            r1.<init>()
            com.tencent.mm.autogen.events.BroadcastEvent$a r2 = r1.f343529d
            r2.f236156a = r8
            r2.f236157b = r0
            r1.publish()
            goto L_0x03d7
        L_0x0038:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "receive weaknet notify "
            r0.append(r1)
            byte r3 = r2[r13]
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r14, r0)
            byte r0 = r2[r13]
            if (r0 != r12) goto L_0x0054
            goto L_0x0055
        L_0x0054:
            r12 = 0
        L_0x0055:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            r0.append(r12)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "WeaknetUtils"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r1, r0)
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r0 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getDefault()
            java.lang.String r1 = "weaknet_tag"
            r0.putBoolean(r1, r12)
            goto L_0x03d7
        L_0x0075:
            java.lang.String r0 = "do netid request"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r14, r0)
            java.util.concurrent.atomic.AtomicBoolean r0 = de0.C45329a.f122787f
            boolean r0 = r0.get()
            if (r0 != 0) goto L_0x0092
            f40.g r0 = f40.C86709a0.m107529k()
            ob0.b0 r0 = r0.f251779b
            de0.a r1 = new de0.a
            r1.<init>()
            r0.mo123460f(r1)
            goto L_0x03d7
        L_0x0092:
            java.lang.String r0 = "netid is requesting ,wait a minute"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r14, r0)
            goto L_0x03d7
        L_0x0099:
            java.lang.String r0 = "do disaster auth "
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r14, r0)
            f40.g r0 = f40.C86709a0.m107529k()
            ob0.b0 r0 = r0.f251779b
            com.tencent.mm.modelsimple.j r1 = new com.tencent.mm.modelsimple.j
            r1.<init>()
            r0.mo123460f(r1)
            goto L_0x03d7
        L_0x00ae:
            com.tencent.mm.autogen.events.BypNotifyActionEvent r0 = new com.tencent.mm.autogen.events.BypNotifyActionEvent
            r0.<init>()
            com.tencent.mm.autogen.events.BypNotifyActionEvent$a r1 = r0.f78730d
            r3 = 4
            r1.f78731a = r3
            r1.f78732b = r2
            r0.publish()
            goto L_0x03d7
        L_0x00c0:
            com.tencent.mm.autogen.events.BypNotifyActionEvent r0 = new com.tencent.mm.autogen.events.BypNotifyActionEvent
            r0.<init>()
            com.tencent.mm.autogen.events.BypNotifyActionEvent$a r1 = r0.f78730d
            r3 = 2
            r1.f78731a = r3
            r1.f78732b = r2
            r0.publish()
            goto L_0x03d7
        L_0x00d2:
            java.lang.Object[] r0 = new java.lang.Object[r12]
            if (r2 != 0) goto L_0x00d7
            goto L_0x00d8
        L_0x00d7:
            int r10 = r2.length
        L_0x00d8:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r10)
            r0[r13] = r1
            java.lang.String r1 = "summerbadcr on MM_PKT_BYP_NOTIFY notify respBuf len[%d]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r14, r1, r0)
            if (r2 == 0) goto L_0x03d7
            te3.nl r0 = new te3.nl
            r0.<init>()
            r0.parseFrom(r2)     // Catch:{ Exception -> 0x00fc }
            com.tencent.mm.autogen.events.BypNotifyEvent r1 = new com.tencent.mm.autogen.events.BypNotifyEvent     // Catch:{ Exception -> 0x00fc }
            r1.<init>()     // Catch:{ Exception -> 0x00fc }
            com.tencent.mm.autogen.events.BypNotifyEvent$a r2 = r1.f78733d     // Catch:{ Exception -> 0x00fc }
            r2.f78734a = r0     // Catch:{ Exception -> 0x00fc }
            r1.publish()     // Catch:{ Exception -> 0x00fc }
            goto L_0x03d7
        L_0x00fc:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "summerbadcr MM_PKT_BYP_NOTIFY secureData parseFrom e: "
            r1.append(r2)
            java.lang.String r0 = r0.getMessage()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r14, r0)
            goto L_0x03d7
        L_0x0118:
            java.lang.Object[] r0 = new java.lang.Object[r12]
            if (r2 != 0) goto L_0x011e
            r3 = -1
            goto L_0x011f
        L_0x011e:
            int r3 = r2.length
        L_0x011f:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r0[r13] = r3
            java.lang.String r3 = "summerbadcr on MM_PKT_SILENCE_NOTIFY notify respBuf len[%d]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r14, r3, r0)
            r3 = 0
            kj2.d r15 = kj2.C117407d.INSTANCE
            r16 = 403(0x193, double:1.99E-321)
            r18 = 38
            r20 = 1
            r22 = 0
            r15.idkeyStat(r16, r18, r20, r22)
            if (r2 == 0) goto L_0x0205
            te3.dz3 r0 = new te3.dz3
            r0.<init>()
            r0.parseFrom(r2)     // Catch:{ Exception -> 0x01df }
            java.lang.String r2 = "summerbadcr MM_PKT_SILENCE_NOTIFY secureData[%d, %d, %d, %d, %d, %d]"
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ Exception -> 0x01df }
            int r4 = r0.f353954d     // Catch:{ Exception -> 0x01df }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ Exception -> 0x01df }
            r1[r13] = r4     // Catch:{ Exception -> 0x01df }
            int r4 = r0.f353955e     // Catch:{ Exception -> 0x01df }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ Exception -> 0x01df }
            r1[r12] = r4     // Catch:{ Exception -> 0x01df }
            int r4 = r0.f353956f     // Catch:{ Exception -> 0x01df }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ Exception -> 0x01df }
            r1[r11] = r4     // Catch:{ Exception -> 0x01df }
            int r4 = r0.f353957g     // Catch:{ Exception -> 0x01df }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ Exception -> 0x01df }
            r1[r9] = r4     // Catch:{ Exception -> 0x01df }
            int r4 = r0.f353958h     // Catch:{ Exception -> 0x01df }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ Exception -> 0x01df }
            r1[r8] = r4     // Catch:{ Exception -> 0x01df }
            r4 = 5
            int r5 = r0.f353959i     // Catch:{ Exception -> 0x01df }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ Exception -> 0x01df }
            r1[r4] = r5     // Catch:{ Exception -> 0x01df }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r14, r2, r1)     // Catch:{ Exception -> 0x01df }
            int r1 = r0.f353954d     // Catch:{ Exception -> 0x01df }
            r2 = 13
            if (r1 != r2) goto L_0x01b7
            f40.C86709a0.m107528h()     // Catch:{ Exception -> 0x01df }
            f40.g r1 = f40.C86709a0.m107529k()     // Catch:{ Exception -> 0x01df }
            byte[] r1 = r1.mo121128c(r9)     // Catch:{ Exception -> 0x01df }
            pe3.b r0 = r0.f353961n     // Catch:{ Exception -> 0x01df }
            byte[] r0 = r0.f257327a     // Catch:{ Exception -> 0x01df }
            byte[] r2 = com.tencent.p014mm.jni.utils.UtilsJni.AesGcmDecryptWithUncompress(r1, r0)     // Catch:{ Exception -> 0x01df }
            java.lang.String r0 = "summerbadcr MM_PKT_SILENCE_NOTIFY AES_GCM_ENCRYPT serverSession[%s] data[%s]"
            java.lang.Object[] r3 = new java.lang.Object[r11]     // Catch:{ Exception -> 0x01b4 }
            if (r1 != 0) goto L_0x019e
            r1 = -1
            goto L_0x019f
        L_0x019e:
            int r1 = r1.length     // Catch:{ Exception -> 0x01b4 }
        L_0x019f:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ Exception -> 0x01b4 }
            r3[r13] = r1     // Catch:{ Exception -> 0x01b4 }
            if (r2 != 0) goto L_0x01a8
            goto L_0x01a9
        L_0x01a8:
            int r10 = r2.length     // Catch:{ Exception -> 0x01b4 }
        L_0x01a9:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r10)     // Catch:{ Exception -> 0x01b4 }
            r3[r12] = r1     // Catch:{ Exception -> 0x01b4 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r14, r0, r3)     // Catch:{ Exception -> 0x01b4 }
            r3 = r2
            goto L_0x0205
        L_0x01b4:
            r0 = move-exception
            r3 = r2
            goto L_0x01e0
        L_0x01b7:
            int r2 = r0.f353955e     // Catch:{ Exception -> 0x01df }
            int r4 = r0.f353956f     // Catch:{ Exception -> 0x01df }
            int r5 = r0.f353957g     // Catch:{ Exception -> 0x01df }
            int r6 = r0.f353958h     // Catch:{ Exception -> 0x01df }
            int r7 = r0.f353959i     // Catch:{ Exception -> 0x01df }
            int r8 = r0.f353960j     // Catch:{ Exception -> 0x01df }
            pe3.b r0 = r0.f353961n     // Catch:{ Exception -> 0x01df }
            byte[] r0 = r0.f257327a     // Catch:{ Exception -> 0x01df }
            r15 = r28
            r16 = r1
            r17 = r2
            r18 = r4
            r19 = r5
            r20 = r6
            r21 = r7
            r22 = r8
            r23 = r0
            byte[] r0 = com.tencent.p014mm.protocal.MMProtocalJni.decodeSecureNotifyData(r15, r16, r17, r18, r19, r20, r21, r22, r23)     // Catch:{ Exception -> 0x01df }
            r3 = r0
            goto L_0x0205
        L_0x01df:
            r0 = move-exception
        L_0x01e0:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "summerbadcr MM_PKT_SILENCE_NOTIFY secureData parseFrom e: "
            r1.append(r2)
            java.lang.String r0 = r0.getMessage()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r14, r0)
            kj2.d r4 = kj2.C117407d.INSTANCE
            r5 = 403(0x193, double:1.99E-321)
            r7 = 39
            r9 = 1
            r11 = 0
            r4.idkeyStat(r5, r7, r9, r11)
        L_0x0205:
            if (r3 == 0) goto L_0x0224
            java.lang.Object[] r0 = new java.lang.Object[r12]
            int r1 = r3.length
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0[r13] = r1
            java.lang.String r1 = "summerbadcr on MM_PKT_SILENCE_NOTIFY data len:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r14, r1, r0)
            com.tencent.mm.autogen.events.SilenceNotifyEvent r0 = new com.tencent.mm.autogen.events.SilenceNotifyEvent
            r0.<init>()
            com.tencent.mm.autogen.events.SilenceNotifyEvent$a r1 = r0.f193936d
            r1.f193937a = r3
            r0.publish()
            goto L_0x03d7
        L_0x0224:
            java.lang.String r0 = "summerbadcr on MM_PKT_SILENCE_NOTIFY data is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r14, r0)
            kj2.d r1 = kj2.C117407d.INSTANCE
            r2 = 403(0x193, double:1.99E-321)
            r4 = 40
            r6 = 1
            r8 = 0
            r1.idkeyStat(r2, r4, r6, r8)
            goto L_0x03d7
        L_0x0238:
            te3.ka4 r0 = new te3.ka4
            r0.<init>()
            r0.parseFrom(r2)     // Catch:{ Exception -> 0x0261 }
            fe0.a r10 = new fe0.a
            pe3.b r2 = r0.f354069d
            int r3 = r0.f354073h
            int r4 = r0.f354074i
            int r5 = r0.f354075j
            int r6 = r0.f354076n
            te3.ha4 r7 = r0.f354078p
            te3.ha4 r8 = r0.f354077o
            java.lang.String r9 = r0.f354070e
            r1 = r10
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            f40.g r0 = f40.C86709a0.m107529k()
            ob0.b0 r0 = r0.f251779b
            r0.mo123460f(r10)
            goto L_0x03d7
        L_0x0261:
            r0 = move-exception
            r1 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "speed test parse data failed. e: "
            r0.append(r2)
            java.lang.String r1 = r1.getMessage()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r14, r0)
            return
        L_0x027d:
            java.lang.String r0 = "jacks do voice notify UI"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r14, r0)
            int r0 = r2.length
            r1 = 8
            if (r0 >= r1) goto L_0x0289
            goto L_0x03d7
        L_0x0289:
            byte[] r0 = new byte[r8]
            byte[] r1 = new byte[r8]
            java.lang.System.arraycopy(r2, r13, r0, r13, r8)
            java.lang.System.arraycopy(r2, r8, r1, r13, r8)
            com.tencent.mm.autogen.events.NotifyCanPullVoiceTransResEvent r2 = new com.tencent.mm.autogen.events.NotifyCanPullVoiceTransResEvent
            r2.<init>()
            com.tencent.mm.autogen.events.NotifyCanPullVoiceTransResEvent$a r3 = r2.f193749d
            int r0 = p823sg.C90196p.m112885b(r0, r13)
            r3.f193750a = r0
            com.tencent.mm.autogen.events.NotifyCanPullVoiceTransResEvent$a r0 = r2.f193749d
            int r1 = p823sg.C90196p.m112885b(r1, r13)
            r0.f193751b = r1
            java.lang.Object[] r0 = new java.lang.Object[r11]
            com.tencent.mm.autogen.events.NotifyCanPullVoiceTransResEvent$a r1 = r2.f193749d
            int r1 = r1.f193750a
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0[r13] = r1
            com.tencent.mm.autogen.events.NotifyCanPullVoiceTransResEvent$a r1 = r2.f193749d
            int r1 = r1.f193751b
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0[r12] = r1
            java.lang.String r1 = "notifyId: %d, sequence: %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r14, r1, r0)
            r2.publish()
            goto L_0x03d7
        L_0x02c8:
            com.tencent.mm.autogen.events.FavNotifyEvent r0 = new com.tencent.mm.autogen.events.FavNotifyEvent
            r0.<init>()
            com.tencent.mm.autogen.events.FavNotifyEvent$a r1 = r0.f264824d
            r1.f264825a = r2
            r0.publish()
            goto L_0x03d7
        L_0x02d6:
            java.lang.String r0 = "dealWithNotify MMFunc_VoipSync do VoipSync"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r14, r0)
            com.tencent.mm.autogen.events.VoipEvent r0 = new com.tencent.mm.autogen.events.VoipEvent
            r0.<init>()
            com.tencent.mm.autogen.events.VoipEvent$a r3 = r0.f194019d
            r3.f194022b = r1
            r3.f194023c = r2
            r0.publish()
            goto L_0x03d7
        L_0x02eb:
            r0.mo112552l(r4, r3)
            com.tencent.mm.autogen.events.TalkRoomServerEvent r0 = new com.tencent.mm.autogen.events.TalkRoomServerEvent
            r0.<init>()
            com.tencent.mm.autogen.events.TalkRoomServerEvent$a r1 = r0.f154883d
            r1.f154885a = r12
            r0.publish()
            com.tencent.mm.autogen.events.TalkRoomServerEvent$b r0 = r0.f154884e
            java.lang.String r0 = r0.f154887a
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r1 != 0) goto L_0x0325
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "voipinvite, exit talkroom first: "
            r1.append(r3)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105926v(r14, r0)
            com.tencent.mm.autogen.events.TalkRoomServerEvent r0 = new com.tencent.mm.autogen.events.TalkRoomServerEvent
            r0.<init>()
            com.tencent.mm.autogen.events.TalkRoomServerEvent$a r1 = r0.f154883d
            r1.f154886b = r12
            r0.publish()
        L_0x0325:
            if (r2 == 0) goto L_0x03d7
            int r0 = r2.length
            if (r0 <= 0) goto L_0x03d7
            byte r0 = r2[r13]
            if (r0 != r12) goto L_0x0343
            java.lang.String r0 = "dealWithNotify case MM_VOIP_PUSHTYPE_INVITE, will launch voipUI"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r14, r0)
            com.tencent.mm.autogen.events.VoipEvent r0 = new com.tencent.mm.autogen.events.VoipEvent
            r0.<init>()
            com.tencent.mm.autogen.events.VoipEvent$a r1 = r0.f194019d
            r1.f194022b = r9
            r1.f194023c = r2
            r0.publish()
            goto L_0x03d7
        L_0x0343:
            r1 = 101(0x65, float:1.42E-43)
            if (r0 != r1) goto L_0x035a
            java.lang.String r0 = "dealWithNotify case MM_PSTN_PUSHTYPE_INVITE"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r14, r0)
            com.tencent.mm.autogen.events.IPCallSvrNotifyEvent r0 = new com.tencent.mm.autogen.events.IPCallSvrNotifyEvent
            r0.<init>()
            com.tencent.mm.autogen.events.IPCallSvrNotifyEvent$a r1 = r0.f154827d
            r1.f154828a = r2
            r0.publish()
            goto L_0x03d7
        L_0x035a:
            if (r0 != r9) goto L_0x0372
            java.lang.String r0 = "dealWithNotify, MM_VOIP_PUSHTYPE_CANCEL"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r14, r0)
            com.tencent.mm.autogen.events.VoipEvent r0 = new com.tencent.mm.autogen.events.VoipEvent
            r0.<init>()
            com.tencent.mm.autogen.events.VoipEvent$a r1 = r0.f194019d
            r3 = 9
            r1.f194022b = r3
            r1.f194023c = r2
            r0.publish()
            goto L_0x03d7
        L_0x0372:
            java.lang.String r1 = "dealWithNotify, MM_VOIP_PUSHTYPE_ANSWERED"
            if (r0 != r11) goto L_0x0388
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r14, r1)
            com.tencent.mm.autogen.events.VoipEvent r0 = new com.tencent.mm.autogen.events.VoipEvent
            r0.<init>()
            com.tencent.mm.autogen.events.VoipEvent$a r1 = r0.f194019d
            r1.f194022b = r7
            r1.f194023c = r2
            r0.publish()
            goto L_0x03d7
        L_0x0388:
            r3 = 102(0x66, float:1.43E-43)
            if (r0 != r3) goto L_0x03d7
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r14, r1)
            com.tencent.mm.autogen.events.VoipCSNotifyEvent r0 = new com.tencent.mm.autogen.events.VoipCSNotifyEvent
            r0.<init>()
            com.tencent.mm.autogen.events.VoipCSNotifyEvent$a r1 = r0.f265257d
            r1.f265258a = r2
            r0.publish()
            goto L_0x03d7
        L_0x039c:
            java.lang.String r0 = "dealWithNotify MM_VOIP_CS_PUSHTYPE_SYN do VoipSync"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r14, r0)
            goto L_0x03d7
        L_0x03a2:
            java.lang.String r0 = "on direct send notify"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r14, r0)
            qe3.c0$b r8 = new qe3.c0$b
            r8.<init>()
            java.lang.String r0 = p156gj.C87203t.m108273i()
            r8.f353302f = r0
            ob0.k0 r0 = new ob0.k0
            r0.<init>(r8, r7)
            r1 = 10
            r3 = 0
            r4 = 0
            r2 = r27
            boolean r0 = r0.Zi0(r1, r2, r3, r4)     // Catch:{ RemoteException -> 0x03d1 }
            if (r0 == 0) goto L_0x03d7
            ob0.b0 r0 = eb0.C97625j3.m125815e()     // Catch:{ RemoteException -> 0x03d1 }
            com.tencent.mm.modelsimple.q r1 = new com.tencent.mm.modelsimple.q     // Catch:{ RemoteException -> 0x03d1 }
            r1.<init>(r8)     // Catch:{ RemoteException -> 0x03d1 }
            r0.onSceneEnd(r13, r13, r6, r1)     // Catch:{ RemoteException -> 0x03d1 }
            goto L_0x03d7
        L_0x03d1:
            r0 = move-exception
            java.lang.Object[] r1 = new java.lang.Object[r13]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r14, r0, r6, r1)
        L_0x03d7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: fw0.C116903t.mo119070W1(com.tencent.mm.booter.NotifyReceiver$NotifyService, int, byte[], byte[], long):void");
    }
}
