package em0;

/* renamed from: em0.l */
public class C107280l extends C86561i {
    public static final int CTRL_INDEX = -2;
    public static final String NAME = "operateCallTone";

    /* JADX WARNING: Removed duplicated region for block: B:31:0x00b8 A[Catch:{ Exception -> 0x00ef }] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00c1 A[Catch:{ Exception -> 0x00ef }] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x010e A[ADDED_TO_REGION, Catch:{ JSONException -> 0x02f0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x014f A[Catch:{ all -> 0x024d }] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x019d A[Catch:{ all -> 0x024d }] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x01a8 A[Catch:{ all -> 0x024d }] */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x01da A[Catch:{ all -> 0x024d }] */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x01fd A[Catch:{ all -> 0x024d }] */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0204 A[Catch:{ all -> 0x024d }] */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0221 A[Catch:{ all -> 0x024d }] */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0249 A[Catch:{ all -> 0x024d }] */
    /* renamed from: z */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo121015z(kr0.C88267e r18, org.json.JSONObject r19, int r20) {
        /*
            r17 = this;
            r1 = r17
            r2 = r18
            r0 = r19
            r3 = r20
            java.lang.Class<jp.b> r4 = p576jp.C88007b.class
            if (r0 != 0) goto L_0x0016
            java.lang.String r0 = "fail:data is null or nil"
            java.lang.String r0 = r1.mo115109j(r0)
            r2.mo109647a(r3, r0)
            return
        L_0x0016:
            java.lang.String r5 = r18.getAppId()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "hy: appId:"
            r6.append(r7)
            r6.append(r5)
            java.lang.String r5 = ", data:"
            r6.append(r5)
            java.lang.String r5 = r19.toString()
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            java.lang.String r6 = "MicroMsg.OpenVoice.JsApiOperateCallTone"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r5)
            r5 = 0
            java.lang.String r7 = "type"
            java.lang.String r0 = r0.getString(r7)     // Catch:{ JSONException -> 0x02f6 }
            java.lang.String r7 = "play"
            boolean r0 = r7.equalsIgnoreCase(r0)     // Catch:{ JSONException -> 0x02f6 }
            if (r0 == 0) goto L_0x02c8
            di3.d r0 = di3.C86312j.m106911c(r4)     // Catch:{ JSONException -> 0x02f0 }
            jp.b r0 = (p576jp.C88007b) r0     // Catch:{ JSONException -> 0x02f0 }
            jp.c r0 = r0.mo59116Bp()     // Catch:{ JSONException -> 0x02f0 }
            r4 = r0
            com.tencent.mm.plugin.cloudvoip.cloudvoice.service.w r4 = (com.tencent.p014mm.plugin.cloudvoip.cloudvoice.service.C105181w) r4     // Catch:{ JSONException -> 0x02f0 }
            int r0 = r4.f312388t     // Catch:{ JSONException -> 0x02f0 }
            r7 = 1
            if (r0 != r7) goto L_0x0060
            r8 = 0
            goto L_0x0061
        L_0x0060:
            r8 = 1
        L_0x0061:
            a43.i r9 = r4.f312379i     // Catch:{ JSONException -> 0x02f0 }
            if (r9 == 0) goto L_0x02c0
            java.lang.String r10 = "phonering"
            r9.f304602f = r5     // Catch:{ JSONException -> 0x02f0 }
            java.lang.String r11 = "ex"
            java.lang.String r12 = "MicroMsg.RingPlayer"
            java.lang.String r13 = "getService(SubCoreAudio::class.java)"
            java.lang.Class<pu0.b> r14 = pu0.C110248b.class
            boolean r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.isMMProcess()     // Catch:{ Exception -> 0x00f1 }
            if (r0 == 0) goto L_0x00af
            if (r8 != 0) goto L_0x0091
            f40.o r0 = f40.C86709a0.m107535s()     // Catch:{ Exception -> 0x00f1 }
            com.tencent.mm.storage.v1 r0 = r0.mo121142i()     // Catch:{ Exception -> 0x00f1 }
            r15 = 73217(0x11e01, float:1.02599E-40)
            java.lang.Boolean r5 = java.lang.Boolean.TRUE     // Catch:{ Exception -> 0x00f1 }
            java.lang.Object r0 = r0.mo119684e(r15, r5)     // Catch:{ Exception -> 0x00f1 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ Exception -> 0x00f1 }
            boolean r0 = r0.booleanValue()     // Catch:{ Exception -> 0x00f1 }
            goto L_0x00ad
        L_0x0091:
            if (r8 == r7) goto L_0x0096
            r5 = 2
            if (r8 != r5) goto L_0x00af
        L_0x0096:
            f40.o r0 = f40.C86709a0.m107535s()     // Catch:{ Exception -> 0x00f1 }
            com.tencent.mm.storage.v1 r0 = r0.mo121142i()     // Catch:{ Exception -> 0x00f1 }
            r5 = 73218(0x11e02, float:1.026E-40)
            java.lang.Boolean r15 = java.lang.Boolean.TRUE     // Catch:{ Exception -> 0x00f1 }
            java.lang.Object r0 = r0.mo119684e(r5, r15)     // Catch:{ Exception -> 0x00f1 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ Exception -> 0x00f1 }
            boolean r0 = r0.booleanValue()     // Catch:{ Exception -> 0x00f1 }
        L_0x00ad:
            r5 = r0
            goto L_0x00b0
        L_0x00af:
            r5 = 1
        L_0x00b0:
            r0 = 26
            boolean r0 = p206nj.C11171e.m11046c(r0)     // Catch:{ Exception -> 0x00ef }
            if (r0 == 0) goto L_0x00c1
            boolean r0 = p645pj.C77091b.m93021c()     // Catch:{ Exception -> 0x00ef }
            boolean r15 = p645pj.C77091b.m93027i()     // Catch:{ Exception -> 0x00ef }
            goto L_0x00c9
        L_0x00c1:
            boolean r0 = p645pj.C77091b.m93020b()     // Catch:{ Exception -> 0x00ef }
            boolean r15 = p645pj.C77091b.m93026h()     // Catch:{ Exception -> 0x00ef }
        L_0x00c9:
            java.lang.String r7 = "startPlayCustomRing, voipSound: %s, msgSound: %s, msgShake: %s, isCallingParty: %s"
            r2 = 4
            java.lang.Object[] r3 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x00ef }
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r5)     // Catch:{ Exception -> 0x00ef }
            r16 = 0
            r3[r16] = r2     // Catch:{ Exception -> 0x00ef }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ Exception -> 0x00ef }
            r2 = 1
            r3[r2] = r0     // Catch:{ Exception -> 0x00ef }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r15)     // Catch:{ Exception -> 0x00ef }
            r2 = 2
            r3[r2] = r0     // Catch:{ Exception -> 0x00ef }
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch:{ Exception -> 0x00ef }
            r2 = 3
            r3[r2] = r0     // Catch:{ Exception -> 0x00ef }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r12, r7, r3)     // Catch:{ Exception -> 0x00ef }
            r5 = 1
            goto L_0x010c
        L_0x00ef:
            r0 = move-exception
            goto L_0x00f3
        L_0x00f1:
            r0 = move-exception
            r5 = 1
        L_0x00f3:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ JSONException -> 0x02f0 }
            r2.<init>()     // Catch:{ JSONException -> 0x02f0 }
            java.lang.String r3 = "get voip sound failed: "
            r2.append(r3)     // Catch:{ JSONException -> 0x02f0 }
            java.lang.String r0 = r0.getMessage()     // Catch:{ JSONException -> 0x02f0 }
            r2.append(r0)     // Catch:{ JSONException -> 0x02f0 }
            java.lang.String r0 = r2.toString()     // Catch:{ JSONException -> 0x02f0 }
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r12, r0)     // Catch:{ JSONException -> 0x02f0 }
            r15 = 1
        L_0x010c:
            if (r5 != 0) goto L_0x0112
            if (r15 != 0) goto L_0x0112
            goto L_0x02c0
        L_0x0112:
            boolean r0 = r9.f304601e     // Catch:{ JSONException -> 0x02f0 }
            if (r0 == 0) goto L_0x0118
            goto L_0x02c0
        L_0x0118:
            if (r5 == 0) goto L_0x02c0
            long r2 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x02a7 }
            r9.f304603g = r2     // Catch:{ Exception -> 0x02a7 }
            dj.g r0 = new dj.g     // Catch:{ Exception -> 0x02a7 }
            r0.<init>()     // Catch:{ Exception -> 0x02a7 }
            r9.f304599c = r0     // Catch:{ Exception -> 0x02a7 }
            r2 = 1058642330(0x3f19999a, float:0.6)
            android.net.Uri r0 = r9.mo143087c(r10)     // Catch:{ all -> 0x024d }
            android.media.MediaPlayer r3 = r9.f304599c     // Catch:{ all -> 0x024d }
            android.content.Context r5 = r9.f304598b     // Catch:{ all -> 0x024d }
            r3.setDataSource(r5, r0)     // Catch:{ all -> 0x024d }
            android.media.MediaPlayer r0 = r9.f304599c     // Catch:{ all -> 0x024d }
            a43.g r3 = new a43.g     // Catch:{ all -> 0x024d }
            r3.<init>(r9)     // Catch:{ all -> 0x024d }
            r0.setOnCompletionListener(r3)     // Catch:{ all -> 0x024d }
            android.media.MediaPlayer r0 = r9.f304599c     // Catch:{ all -> 0x024d }
            a43.h r3 = new a43.h     // Catch:{ all -> 0x024d }
            r3.<init>(r9)     // Catch:{ all -> 0x024d }
            r0.setOnErrorListener(r3)     // Catch:{ all -> 0x024d }
            boolean r0 = pu0.C110248b.Jh0()     // Catch:{ all -> 0x024d }
            if (r0 == 0) goto L_0x0180
            di3.d r0 = di3.C86312j.m106911c(r14)     // Catch:{ all -> 0x024d }
            gy3.C87412m.m108593f(r0, r13)     // Catch:{ all -> 0x024d }
            pu0.b r0 = (pu0.C110248b) r0     // Catch:{ all -> 0x024d }
            ou0.a r0 = r0.f329779e     // Catch:{ all -> 0x024d }
            if (r0 != 0) goto L_0x0171
            ou0.c r0 = new ou0.c     // Catch:{ all -> 0x024d }
            r0.<init>()     // Catch:{ all -> 0x024d }
            di3.d r3 = di3.C86312j.m106911c(r14)     // Catch:{ all -> 0x024d }
            gy3.C87412m.m108593f(r3, r13)     // Catch:{ all -> 0x024d }
            pu0.b r3 = (pu0.C110248b) r3     // Catch:{ all -> 0x024d }
            java.lang.String[] r3 = r3.f329781g     // Catch:{ all -> 0x024d }
            java.lang.String r5 = "music"
            r7 = 0
            r3[r7] = r5     // Catch:{ all -> 0x024d }
        L_0x0171:
            android.media.AudioManager r0 = r0.f329358h     // Catch:{ all -> 0x024d }
            java.lang.String r3 = "audioManager"
            gy3.C87412m.m108594g(r0, r3)     // Catch:{ all -> 0x024d }
            boolean r0 = r0.isBluetoothScoAvailableOffCall()     // Catch:{ all -> 0x024d }
            if (r0 == 0) goto L_0x0180
            r0 = 1
            goto L_0x0181
        L_0x0180:
            r0 = 0
        L_0x0181:
            boolean r3 = pu0.C110248b.zx0()     // Catch:{ all -> 0x024d }
            java.lang.String r5 = "isBluetoothOn: %b, isHeadsetPlugged: %b"
            r7 = 2
            java.lang.Object[] r10 = new java.lang.Object[r7]     // Catch:{ all -> 0x024d }
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x024d }
            r13 = 0
            r10[r13] = r7     // Catch:{ all -> 0x024d }
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r3)     // Catch:{ all -> 0x024d }
            r13 = 1
            r10[r13] = r7     // Catch:{ all -> 0x024d }
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r12, r5, r10)     // Catch:{ all -> 0x024d }
            if (r0 == 0) goto L_0x01a8
            pu0.b$a r5 = pu0.C110248b.f329777h     // Catch:{ all -> 0x024d }
            int r5 = r5.mo161658c()     // Catch:{ all -> 0x024d }
            r7 = 0
            r9.mo143088d(r7)     // Catch:{ all -> 0x024d }
            goto L_0x01d2
        L_0x01a8:
            r5 = -1
            gj.c r7 = p156gj.C107835h0.f322846c     // Catch:{ all -> 0x024d }
            int r10 = r7.f322698K     // Catch:{ all -> 0x024d }
            if (r10 <= r5) goto L_0x01b0
            goto L_0x01b1
        L_0x01b0:
            r10 = 0
        L_0x01b1:
            if (r3 != 0) goto L_0x01cd
            r13 = 1
            if (r8 != r13) goto L_0x01b7
            goto L_0x01cd
        L_0x01b7:
            boolean r8 = r9.f304605i     // Catch:{ all -> 0x024d }
            if (r8 == 0) goto L_0x01c0
            r9.mo143088d(r13)     // Catch:{ all -> 0x024d }
            r5 = 2
            goto L_0x01d2
        L_0x01c0:
            int r7 = r7.f322692H     // Catch:{ all -> 0x024d }
            if (r7 <= r5) goto L_0x01c6
            r5 = 1
            goto L_0x01c8
        L_0x01c6:
            r5 = 1
            r7 = 3
        L_0x01c8:
            r9.mo143088d(r5)     // Catch:{ all -> 0x024d }
            r5 = r7
            goto L_0x01d2
        L_0x01cd:
            r5 = 0
            r9.mo143088d(r5)     // Catch:{ all -> 0x024d }
            r5 = r10
        L_0x01d2:
            r7 = 28
            boolean r7 = p206nj.C11171e.m11045b(r7)     // Catch:{ all -> 0x024d }
            if (r7 == 0) goto L_0x01fd
            android.media.MediaPlayer r7 = r9.f304599c     // Catch:{ all -> 0x024d }
            android.media.AudioAttributes$Builder r8 = new android.media.AudioAttributes$Builder     // Catch:{ all -> 0x024d }
            r8.<init>()     // Catch:{ all -> 0x024d }
            r10 = 6
            android.media.AudioAttributes$Builder r8 = r8.setUsage(r10)     // Catch:{ all -> 0x024d }
            android.media.AudioAttributes$Builder r8 = r8.setLegacyStreamType(r5)     // Catch:{ all -> 0x024d }
            r10 = 4
            android.media.AudioAttributes$Builder r8 = r8.setContentType(r10)     // Catch:{ all -> 0x024d }
            android.media.AudioAttributes r8 = r8.build()     // Catch:{ all -> 0x024d }
            r7.setAudioAttributes(r8)     // Catch:{ all -> 0x024d }
            java.lang.String r7 = "use audio attribute to play ring"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r7)     // Catch:{ all -> 0x024d }
            goto L_0x0202
        L_0x01fd:
            android.media.MediaPlayer r7 = r9.f304599c     // Catch:{ all -> 0x024d }
            r7.setAudioStreamType(r5)     // Catch:{ all -> 0x024d }
        L_0x0202:
            if (r3 != 0) goto L_0x020d
            if (r0 == 0) goto L_0x0207
            goto L_0x020d
        L_0x0207:
            android.media.MediaPlayer r0 = r9.f304599c     // Catch:{ all -> 0x024d }
            r0.setVolume(r2, r2)     // Catch:{ all -> 0x024d }
            goto L_0x022c
        L_0x020d:
            ou0.a r0 = pu0.C110248b.vx0()     // Catch:{ all -> 0x024d }
            int r0 = r0.mo157507d(r5)     // Catch:{ all -> 0x024d }
            ou0.a r3 = pu0.C110248b.vx0()     // Catch:{ all -> 0x024d }
            int r3 = r3.mo157506c(r5)     // Catch:{ all -> 0x024d }
            int r7 = r0 / 2
            if (r3 <= r7) goto L_0x0224
            r7 = 2
            int r3 = r0 / 2
        L_0x0224:
            ou0.a r0 = pu0.C110248b.vx0()     // Catch:{ all -> 0x024d }
            r7 = 0
            r0.mo157508g(r5, r3, r7)     // Catch:{ all -> 0x024d }
        L_0x022c:
            android.media.MediaPlayer r0 = r9.f304599c     // Catch:{ all -> 0x024d }
            r3 = 1
            r0.setLooping(r3)     // Catch:{ all -> 0x024d }
            android.media.MediaPlayer r0 = r9.f304599c     // Catch:{ all -> 0x024d }
            r0.prepare()     // Catch:{ all -> 0x024d }
            android.media.MediaPlayer r0 = r9.f304599c     // Catch:{ all -> 0x024d }
            r0.start()     // Catch:{ all -> 0x024d }
            long r7 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x024d }
            long r13 = r9.f304603g     // Catch:{ all -> 0x024d }
            long r7 = r7 - r13
            r13 = 2000(0x7d0, double:9.88E-321)
            int r0 = (r7 > r13 ? 1 : (r7 == r13 ? 0 : -1))
            if (r0 <= 0) goto L_0x02a3
            r3 = 3
            r9.f304602f = r3     // Catch:{ all -> 0x024d }
            goto L_0x02a3
        L_0x024d:
            r0 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x02a7 }
            r3.<init>()     // Catch:{ Exception -> 0x02a7 }
            java.lang.String r5 = "startPlayCustomRing failed, "
            r3.append(r5)     // Catch:{ Exception -> 0x02a7 }
            java.lang.String r0 = r0.getMessage()     // Catch:{ Exception -> 0x02a7 }
            r3.append(r0)     // Catch:{ Exception -> 0x02a7 }
            java.lang.String r0 = r3.toString()     // Catch:{ Exception -> 0x02a7 }
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r12, r0)     // Catch:{ Exception -> 0x02a7 }
            r3 = 2
            r9.f304602f = r3     // Catch:{ Exception -> 0x02a7 }
            android.content.Context r0 = r9.f304598b     // Catch:{ Exception -> 0x0298 }
            r3 = 1
            android.net.Uri r0 = android.media.RingtoneManager.getActualDefaultRingtoneUri(r0, r3)     // Catch:{ Exception -> 0x0298 }
            android.content.Context r3 = r9.f304598b     // Catch:{ Exception -> 0x0298 }
            dj.g r0 = p331dj.C97481g.m125558a(r3, r0)     // Catch:{ Exception -> 0x0298 }
            r9.f304599c = r0     // Catch:{ Exception -> 0x0298 }
            if (r0 != 0) goto L_0x027c
            goto L_0x02c0
        L_0x027c:
            r0.stop()     // Catch:{ Exception -> 0x0298 }
            android.media.MediaPlayer r0 = r9.f304599c     // Catch:{ Exception -> 0x0298 }
            r0.prepare()     // Catch:{ Exception -> 0x0298 }
            android.media.MediaPlayer r0 = r9.f304599c     // Catch:{ Exception -> 0x0298 }
            r3 = 1
            r0.setLooping(r3)     // Catch:{ Exception -> 0x0298 }
            android.media.MediaPlayer r0 = r9.f304599c     // Catch:{ Exception -> 0x0298 }
            r0.setVolume(r2, r2)     // Catch:{ Exception -> 0x0298 }
            android.media.MediaPlayer r0 = r9.f304599c     // Catch:{ Exception -> 0x0298 }
            r0.start()     // Catch:{ Exception -> 0x0298 }
            r2 = 0
            r9.f304602f = r2     // Catch:{ Exception -> 0x0298 }
            goto L_0x02a3
        L_0x0298:
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()     // Catch:{ Exception -> 0x02a7 }
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r11, r0)     // Catch:{ Exception -> 0x02a7 }
            r2 = 2
            r9.f304602f = r2     // Catch:{ Exception -> 0x02a7 }
        L_0x02a3:
            r2 = 1
            r9.f304601e = r2     // Catch:{ Exception -> 0x02a7 }
            goto L_0x02c0
        L_0x02a7:
            r0 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ JSONException -> 0x02f0 }
            r2.<init>()     // Catch:{ JSONException -> 0x02f0 }
            java.lang.String r3 = "new MediaPlayer failed, "
            r2.append(r3)     // Catch:{ JSONException -> 0x02f0 }
            java.lang.String r0 = r0.toString()     // Catch:{ JSONException -> 0x02f0 }
            r2.append(r0)     // Catch:{ JSONException -> 0x02f0 }
            java.lang.String r0 = r2.toString()     // Catch:{ JSONException -> 0x02f0 }
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r12, r0)     // Catch:{ JSONException -> 0x02f0 }
        L_0x02c0:
            com.tencent.mm.sdk.platformtools.MMHandler r0 = r4.f312360T0     // Catch:{ JSONException -> 0x02f0 }
            r2 = 272(0x110, float:3.81E-43)
            r0.sendEmptyMessage(r2)     // Catch:{ JSONException -> 0x02f0 }
            goto L_0x02e0
        L_0x02c8:
            java.lang.String r0 = "operate: stop ring"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r0)     // Catch:{ JSONException -> 0x02f0 }
            di3.d r0 = di3.C86312j.m106911c(r4)     // Catch:{ JSONException -> 0x02f0 }
            jp.b r0 = (p576jp.C88007b) r0     // Catch:{ JSONException -> 0x02f0 }
            jp.c r0 = r0.mo59116Bp()     // Catch:{ JSONException -> 0x02f0 }
            com.tencent.mm.plugin.cloudvoip.cloudvoice.service.w r0 = (com.tencent.p014mm.plugin.cloudvoip.cloudvoice.service.C105181w) r0     // Catch:{ JSONException -> 0x02f0 }
            a43.i r0 = r0.f312379i     // Catch:{ JSONException -> 0x02ee }
            if (r0 == 0) goto L_0x02e0
            r0.mo143090f()     // Catch:{ JSONException -> 0x02ee }
        L_0x02e0:
            java.lang.String r0 = "ok"
            java.lang.String r0 = r1.mo115109j(r0)     // Catch:{ JSONException -> 0x02f0 }
            r2 = r18
            r3 = r20
            r2.mo109647a(r3, r0)     // Catch:{ JSONException -> 0x02f6 }
            goto L_0x0308
        L_0x02ee:
            r0 = move-exception
            goto L_0x02f1
        L_0x02f0:
            r0 = move-exception
        L_0x02f1:
            r2 = r18
            r3 = r20
            goto L_0x02f7
        L_0x02f6:
            r0 = move-exception
        L_0x02f7:
            r4 = 0
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.String r5 = ""
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r6, r0, r5, r4)
            java.lang.String r0 = "fail: param error!"
            java.lang.String r0 = r1.mo115109j(r0)
            r2.mo109647a(r3, r0)
        L_0x0308:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: em0.C107280l.mo121015z(kr0.e, org.json.JSONObject, int):void");
    }
}
