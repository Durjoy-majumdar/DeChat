package ab1;

import com.tencent.p014mm.plugin.ext.voicecontrol.ExtControlProviderVoiceControl;

/* renamed from: ab1.a */
public class C39532a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f106130d;

    /* renamed from: e */
    public final /* synthetic */ String f106131e;

    /* renamed from: f */
    public final /* synthetic */ String f106132f;

    /* renamed from: g */
    public final /* synthetic */ String f106133g;

    /* renamed from: h */
    public final /* synthetic */ String f106134h;

    /* renamed from: i */
    public final /* synthetic */ ExtControlProviderVoiceControl f106135i;

    public C39532a(ExtControlProviderVoiceControl extControlProviderVoiceControl, String str, String str2, String str3, String str4, String str5) {
        this.f106135i = extControlProviderVoiceControl;
        this.f106130d = str;
        this.f106131e = str2;
        this.f106132f = str3;
        this.f106133g = str4;
        this.f106134h = str5;
    }

    /* JADX WARNING: Removed duplicated region for block: B:55:0x01ac  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x01bf  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x027c  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x028f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r21 = this;
            r1 = r21
            java.lang.String r0 = r1.f106130d
            r2 = 4
            int r3 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r0, (int) r2)
            r4 = 0
            java.lang.String r5 = "MicroMsg.ext.ExtControlProviderVoiceControl"
            r6 = 1
            if (r3 != r6) goto L_0x0076
            com.tencent.mm.plugin.ext.voicecontrol.ExtControlProviderVoiceControl r0 = r1.f106135i
            java.lang.String r7 = r1.f106131e
            r0.f111450x = r4
            long r8 = java.lang.System.currentTimeMillis()
            r0.f111449w = r8
            android.content.SharedPreferences r8 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getDefaultPreference()
            java.lang.String r9 = "hasInitVoiceControlData"
            boolean r8 = r8.getBoolean(r9, r6)
            java.lang.Object[] r9 = new java.lang.Object[r6]
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r8)
            r9[r4] = r10
            java.lang.String r10 = "localVoiceControl  hasInit:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r10, r9)
            if (r8 == 0) goto L_0x007b
            r8 = -1
            byte[] r7 = com.tencent.p014mm.vfs.C86013q1.m106433O(r7, r4, r8)
            q9.b r8 = p820q9.C47781b.C47782a.f128311a
            q9.c r0 = r0.f111451y
            q9.e r8 = r8.f128310a
            boolean r9 = r8.f128321d
            if (r9 != 0) goto L_0x0046
            r0 = -304(0xfffffffffffffed0, float:NaN)
            goto L_0x0067
        L_0x0046:
            boolean r9 = r8.f128322e
            if (r9 != 0) goto L_0x004b
            goto L_0x0065
        L_0x004b:
            q9.g r9 = r8.f128319b
            r9.f128324a = r0
            r8.f128320c = r7
            if (r7 != 0) goto L_0x0056
            r0 = -301(0xfffffffffffffed3, float:NaN)
            goto L_0x0067
        L_0x0056:
            q9.e$a r0 = new q9.e$a     // Catch:{ Exception -> 0x0065 }
            r0.<init>(r4)     // Catch:{ Exception -> 0x0065 }
            java.lang.Thread r7 = new java.lang.Thread     // Catch:{ Exception -> 0x0065 }
            r7.<init>(r0)     // Catch:{ Exception -> 0x0065 }
            r7.start()     // Catch:{ Exception -> 0x0065 }
            r0 = 0
            goto L_0x0067
        L_0x0065:
            r0 = -302(0xfffffffffffffed2, float:NaN)
        L_0x0067:
            java.lang.Object[] r7 = new java.lang.Object[r6]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r7[r4] = r0
            java.lang.String r0 = "recognize ret:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r0, r7)
            goto L_0x007b
        L_0x0076:
            java.lang.String r0 = "[voiceControl] not pcm, don't run localVoiceControl"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r0)
        L_0x007b:
            com.tencent.mm.plugin.ext.voicecontrol.ExtControlProviderVoiceControl r0 = r1.f106135i
            int r7 = com.tencent.p014mm.plugin.ext.voicecontrol.ExtControlProviderVoiceControl.f111440z
            java.lang.String r11 = r0.f269494g
            java.lang.String r7 = r1.f106132f
            int r7 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r7, (int) r2)
            java.lang.String r8 = r1.f106133g
            r9 = 16000(0x3e80, float:2.2421E-41)
            int r8 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r8, (int) r9)
            java.lang.String r9 = r1.f106134h
            r10 = 16
            int r9 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r9, (int) r10)
            java.lang.String r10 = r1.f106131e
            r0.getClass()
            java.lang.String r0 = "uploadVoiceStart "
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r0)
            if (r3 == r2) goto L_0x01c3
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r10)
            java.lang.String r13 = ".speex"
            r0.append(r13)
            java.lang.String r13 = r0.toString()
            java.util.concurrent.ArrayBlockingQueue r0 = new java.util.concurrent.ArrayBlockingQueue
            r14 = 1024(0x400, float:1.435E-42)
            r0.<init>(r14)
            p492dn.C45427v.m50377a()
            long r14 = java.lang.System.currentTimeMillis()
            java.lang.String r0 = "[voiceControl] decodePCMToSpeex filePath null"
            java.lang.String r2 = "MicroMsg.SpeexWriter"
            if (r10 == 0) goto L_0x01a4
            int r17 = r10.length()
            if (r17 > 0) goto L_0x00d1
            goto L_0x01a4
        L_0x00d1:
            com.tencent.mm.vfs.m1 r6 = new com.tencent.mm.vfs.m1
            r6.<init>((java.lang.String) r10)
            boolean r18 = r6.mo119967g()
            if (r18 != 0) goto L_0x00e3
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r0)
            r19 = r5
            goto L_0x01a9
        L_0x00e3:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r12 = "[voiceControl] decodePCMToSpeex pcmLen = "
            r0.append(r12)
            r19 = r5
            long r4 = r6.mo119980r()
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
            com.tencent.qqpinyin.voicerecoapi.a r0 = new com.tencent.qqpinyin.voicerecoapi.a     // Catch:{ Exception -> 0x018a }
            r0.<init>()     // Catch:{ Exception -> 0x018a }
            int r4 = r0.mo27826e()     // Catch:{ Exception -> 0x018a }
            if (r4 == 0) goto L_0x0112
            java.lang.String r4 = "[voiceControl] speexInit fail"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r4)     // Catch:{ Exception -> 0x018a }
            r0.mo27827f()     // Catch:{ Exception -> 0x018a }
            goto L_0x01a9
        L_0x0112:
            com.tencent.p014mm.vfs.C86013q1.m106447h(r13)     // Catch:{ Exception -> 0x018a }
            com.tencent.mm.vfs.m1 r4 = new com.tencent.mm.vfs.m1     // Catch:{ Exception -> 0x018a }
            r4.<init>((java.lang.String) r13)     // Catch:{ Exception -> 0x018a }
            r4.mo119964e()     // Catch:{ Exception -> 0x018a }
            r4 = 0
            r5 = 4096(0x1000, float:5.74E-42)
            byte[] r5 = new byte[r5]     // Catch:{ Exception -> 0x0180 }
            java.io.InputStream r4 = com.tencent.p014mm.vfs.C86013q1.m106423E(r10)     // Catch:{ Exception -> 0x0180 }
        L_0x0126:
            int r6 = r4.read(r5)     // Catch:{ Exception -> 0x0180 }
            if (r6 <= 0) goto L_0x015f
            r12 = 0
            byte[] r1 = r0.mo27825d(r5, r12, r6)     // Catch:{ Exception -> 0x0180 }
            if (r1 != 0) goto L_0x0138
            r4.close()     // Catch:{ Exception -> 0x0180 }
            goto L_0x01a9
        L_0x0138:
            int r1 = com.tencent.p014mm.vfs.C86013q1.m106440a(r13, r1)     // Catch:{ Exception -> 0x0180 }
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0180 }
            r12.<init>()     // Catch:{ Exception -> 0x0180 }
            r20 = r5
            java.lang.String r5 = "[voiceControl] appendToFile "
            r12.append(r5)     // Catch:{ Exception -> 0x0180 }
            r12.append(r1)     // Catch:{ Exception -> 0x0180 }
            java.lang.String r1 = ", readLen = "
            r12.append(r1)     // Catch:{ Exception -> 0x0180 }
            r12.append(r6)     // Catch:{ Exception -> 0x0180 }
            java.lang.String r1 = r12.toString()     // Catch:{ Exception -> 0x0180 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r1)     // Catch:{ Exception -> 0x0180 }
            r1 = r21
            r5 = r20
            goto L_0x0126
        L_0x015f:
            r4.close()     // Catch:{ Exception -> 0x0180 }
            r0.mo27827f()     // Catch:{ Exception -> 0x0180 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0180 }
            r1.<init>()     // Catch:{ Exception -> 0x0180 }
            java.lang.String r5 = "[voiceControl] decodePCMToSpeex = "
            r1.append(r5)     // Catch:{ Exception -> 0x0180 }
            long r5 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0180 }
            long r5 = r5 - r14
            r1.append(r5)     // Catch:{ Exception -> 0x0180 }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x0180 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r1)     // Catch:{ Exception -> 0x0180 }
            r0 = 1
            goto L_0x01aa
        L_0x0180:
            if (r4 == 0) goto L_0x0186
            r4.close()     // Catch:{ Exception -> 0x018a }
        L_0x0186:
            r0.mo27827f()     // Catch:{ Exception -> 0x018a }
            goto L_0x01a9
        L_0x018a:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r4 = "[voiceControl] Exception in decodePCMToSpeex, "
            r1.append(r4)
            java.lang.String r0 = r0.getMessage()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r0)
            goto L_0x01a9
        L_0x01a4:
            r19 = r5
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r0)
        L_0x01a9:
            r0 = 0
        L_0x01aa:
            if (r0 != 0) goto L_0x01bf
            r1 = 2
            java.lang.Object[] r0 = new java.lang.Object[r1]
            r1 = 0
            r0[r1] = r10
            r1 = 1
            r0[r1] = r13
            java.lang.String r1 = "[voiceControl] decodePCMToSpeex error,pcmPath:%s,speexFilePath:%s"
            r2 = r19
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r2, r1, r0)
            r4 = 0
            goto L_0x027a
        L_0x01bf:
            r2 = r19
            r14 = r13
            goto L_0x01c5
        L_0x01c3:
            r2 = r5
            r14 = r10
        L_0x01c5:
            long r0 = com.tencent.p014mm.vfs.C86013q1.m106451l(r14)
            int r13 = (int) r0
            te3.b7 r0 = new te3.b7
            r0.<init>()
            r1 = 4
            r0.f130986d = r1
            r0.f130987e = r1
            r0.f130988f = r8
            r0.f130989g = r9
            te3.a7 r1 = new te3.a7
            r1.<init>()
            r1.f130336d = r13
            r4 = 0
            r1.f130337e = r4
            r5 = 16384(0x4000, float:2.2959E-41)
            if (r13 > r5) goto L_0x01ed
            r1.f130338f = r13
            byte[] r6 = com.tencent.p014mm.vfs.C86013q1.m106433O(r14, r4, r13)
            goto L_0x01f3
        L_0x01ed:
            r1.f130338f = r5
            byte[] r6 = com.tencent.p014mm.vfs.C86013q1.m106433O(r14, r4, r5)
        L_0x01f3:
            r10 = 7
            java.lang.Object[] r10 = new java.lang.Object[r10]
            r10[r4] = r11
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r17 = 1
            r10[r17] = r3
            java.lang.Integer r3 = java.lang.Integer.valueOf(r7)
            r7 = 2
            r10[r7] = r3
            r3 = 3
            java.lang.Integer r7 = java.lang.Integer.valueOf(r8)
            r10[r3] = r7
            java.lang.Integer r3 = java.lang.Integer.valueOf(r9)
            r7 = 4
            r10[r7] = r3
            r3 = 5
            java.lang.Integer r7 = java.lang.Integer.valueOf(r13)
            r10[r3] = r7
            r3 = 6
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r10[r3] = r5
            java.lang.String r3 = "[voiceControl] uploadVoice appId=%s, FileType=%s, EncodeType=%s, sampleRate=%s, bps=%s, fileLen=%s, limit=%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r3, r10)
            if (r6 == 0) goto L_0x0275
            int r3 = r6.length
            if (r3 > 0) goto L_0x022e
            goto L_0x0275
        L_0x022e:
            te3.z6 r15 = new te3.z6
            r15.<init>()
            r15.f145714d = r0
            r15.f145715e = r1
            pe3.b r0 = pe3.C89349b.m111674a(r6)
            r15.f145716f = r0
            ab1.b r0 = new ab1.b
            r9 = 1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = ""
            r1.append(r3)
            long r3 = com.tencent.p014mm.sdk.platformtools.Util.nowMilliSecond()
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            int r1 = r1.hashCode()
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 == r3) goto L_0x0263
            int r1 = java.lang.Math.abs(r1)
            r10 = r1
            goto L_0x0265
        L_0x0263:
            r10 = -2147483648(0xffffffff80000000, float:-0.0)
        L_0x0265:
            r12 = 1
            r16 = 0
            r8 = r0
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16)
            ob0.b0 r1 = eb0.C97625j3.m125815e()
            r1.mo123460f(r0)
            r4 = 1
            goto L_0x027a
        L_0x0275:
            java.lang.String r0 = "[voiceControl] buf empty"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r0)
        L_0x027a:
            if (r4 != 0) goto L_0x028f
            java.lang.String r0 = "[voiceControl] !ok countDown"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r0)
            r1 = r21
            com.tencent.mm.plugin.ext.voicecontrol.ExtControlProviderVoiceControl r0 = r1.f106135i
            r2 = 3504(0xdb0, float:4.91E-42)
            r0.f111444r = r2
            cd3.b r0 = r0.f111448v
            r0.mo62559a()
            goto L_0x0291
        L_0x028f:
            r1 = r21
        L_0x0291:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ab1.C39532a.run():void");
    }
}
