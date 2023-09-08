package p156gj;

/* renamed from: gj.v */
public class C107846v {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v6, resolved type: java.util.Map<java.lang.String, java.lang.String>} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo158254a(java.lang.String r43, p156gj.C107843r r44, p156gj.C107825d r45, p156gj.C107823c r46, p156gj.C107841m r47, p156gj.C107827d0 r48, p156gj.C107838j0 r49, p156gj.C107847w r50, p156gj.C107824c0 r51, p156gj.C107833g0 r52, p156gj.C107822b0 r53, p156gj.C87197b r54, p156gj.C107822b0 r55) {
        /*
            r42 = this;
            r1 = r43
            r2 = r44
            r3 = r45
            r4 = r46
            r5 = r47
            r6 = r49
            r7 = r50
            r8 = r51
            r9 = r52
            r10 = r53
            r11 = r54
            r12 = r55
            java.lang.String r13 = ".deviceinfoconfig.voip.camera.scannerFocusThreshold"
            java.lang.String r14 = ".deviceinfoconfig.voip.camera.videorecord.borientation"
            java.lang.String r15 = ".deviceinfoconfig.voip.camera.videorecord.brotate"
            java.lang.String r12 = ".deviceinfoconfig.voip.camera.videorecord.forientation"
            java.lang.String r10 = ".deviceinfoconfig.voip.camera.videorecord.frotate"
            java.lang.String r11 = ".deviceinfoconfig.voip.camera.front.height"
            java.lang.String r8 = ".deviceinfoconfig.voip.camera.front.width"
            java.lang.String r9 = ".deviceinfoconfig.voip.camera.front.isleft"
            java.lang.String r7 = ".deviceinfoconfig.voip.camera.front.rotate"
            java.lang.String r6 = ".deviceinfoconfig.voip.camera.front.orien"
            java.lang.String r5 = ".deviceinfoconfig.voip.camera.front.fps"
            java.lang.String r4 = ".deviceinfoconfig.voip.camera.front.enable"
            r16 = r13
            java.lang.String r13 = ".deviceinfoconfig.voip.camera.back.height"
            r17 = r14
            java.lang.String r14 = ".deviceinfoconfig.voip.camera.back.width"
            r18 = r15
            java.lang.String r15 = ".deviceinfoconfig.voip.camera.back.isleft"
            r19 = r12
            java.lang.String r12 = ".deviceinfoconfig.voip.camera.back.rotate"
            r20 = r10
            java.lang.String r10 = ".deviceinfoconfig.voip.camera.back.orien"
            r21 = r11
            java.lang.String r11 = ".deviceinfoconfig.voip.camera.back.fps"
            r22 = r8
            java.lang.String r8 = ".deviceinfoconfig.voip.camera.back.enable"
            r23 = r9
            java.lang.String r9 = ".deviceinfoconfig.voip.camera.manufloat"
            r24 = r7
            java.lang.String r7 = ".deviceinfoconfig.voip.camera.autofloatcamera"
            r25 = r6
            java.lang.String r6 = ".deviceinfoconfig.voip.camera.format"
            r26 = r5
            java.lang.String r5 = ".deviceinfoconfig.voip.camera.surface"
            r27 = r4
            java.lang.String r4 = ".deviceinfoconfig.voip.camera.num"
            r28 = r13
            java.lang.String r13 = ".deviceinfoconfig.voip.cpu.armv6"
            r29 = r14
            java.lang.String r14 = ".deviceinfoconfig.voip.cpu.armv7"
            r30 = r15
            java.lang.String r15 = ".deviceinfoconfig.voip.common.vcodec1MaxDecRes"
            r31 = r15
            java.lang.String r15 = ".deviceinfoconfig.voip.common.qrcam"
            r32 = r15
            java.lang.String r15 = ".deviceinfoconfig.voip.common.audioformat"
            r33 = r15
            java.lang.String r15 = ".deviceinfoconfig.voip.common.js"
            r34 = r15
            java.lang.String r15 = ".deviceinfoconfig.voip.audio.playenddelay"
            r35 = r15
            java.lang.String r15 = ".deviceinfoconfig.voip.camera.setframerate"
            r36 = r15
            java.lang.String r15 = ".deviceinfoconfig.voip.camera.videorecord.api20"
            r37 = r15
            java.lang.String r15 = ".deviceinfoconfig.voip.camera.videorecord.num"
            r38 = r15
            java.lang.String r15 = "MicroMsg.DeviceInfoParser"
            r39 = r12
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x1ce0 }
            r12.<init>()     // Catch:{ Exception -> 0x1ce0 }
            r40 = r10
            java.lang.String r10 = "xml: "
            r12.append(r10)     // Catch:{ Exception -> 0x1ce0 }
            r12.append(r1)     // Catch:{ Exception -> 0x1ce0 }
            java.lang.String r10 = r12.toString()     // Catch:{ Exception -> 0x1ce0 }
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r15, r10)     // Catch:{ Exception -> 0x1ce0 }
            java.lang.String r10 = "deviceinfoconfig"
            r12 = 0
            java.util.Map r10 = com.tencent.p014mm.sdk.platformtools.XmlParser.parseXml(r1, r10, r12)     // Catch:{ Exception -> 0x1ce0 }
            if (r10 != 0) goto L_0x00b9
            java.lang.String r1 = "hy: null device config"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r15, r1)     // Catch:{ Exception -> 0x00b4 }
            r1 = 0
            return r1
        L_0x00b4:
            r0 = move-exception
            r1 = r0
            r4 = r15
            goto L_0x1ce3
        L_0x00b9:
            java.lang.Object r41 = r10.get(r14)     // Catch:{ Exception -> 0x1ce0 }
            if (r41 == 0) goto L_0x00cf
            java.lang.Object r14 = r10.get(r14)     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r14 = (java.lang.String) r14     // Catch:{ Exception -> 0x00b4 }
            r12 = 0
            int r14 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r14, (int) r12)     // Catch:{ Exception -> 0x00b4 }
            r2.f322921b = r14     // Catch:{ Exception -> 0x00b4 }
            r12 = 1
            r2.f322920a = r12     // Catch:{ Exception -> 0x00b4 }
        L_0x00cf:
            java.lang.Object r12 = r10.get(r13)     // Catch:{ Exception -> 0x1ce0 }
            if (r12 == 0) goto L_0x00e5
            java.lang.Object r12 = r10.get(r13)     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ Exception -> 0x00b4 }
            r13 = 0
            int r12 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r12, (int) r13)     // Catch:{ Exception -> 0x00b4 }
            r2.f322922c = r12     // Catch:{ Exception -> 0x00b4 }
            r12 = 1
            r2.f322920a = r12     // Catch:{ Exception -> 0x00b4 }
        L_0x00e5:
            java.lang.Object r2 = r10.get(r4)     // Catch:{ Exception -> 0x1ce0 }
            if (r2 == 0) goto L_0x00fb
            java.lang.Object r2 = r10.get(r4)     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x00b4 }
            r4 = 0
            int r2 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r2, (int) r4)     // Catch:{ Exception -> 0x00b4 }
            r3.f322802a = r2     // Catch:{ Exception -> 0x00b4 }
            r2 = 1
            r3.f322803b = r2     // Catch:{ Exception -> 0x00b4 }
        L_0x00fb:
            java.lang.Object r2 = r10.get(r5)     // Catch:{ Exception -> 0x1ce0 }
            if (r2 == 0) goto L_0x0111
            java.lang.Object r2 = r10.get(r5)     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x00b4 }
            r4 = 0
            int r2 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r2, (int) r4)     // Catch:{ Exception -> 0x00b4 }
            r3.f322804c = r2     // Catch:{ Exception -> 0x00b4 }
            r2 = 1
            r3.f322805d = r2     // Catch:{ Exception -> 0x00b4 }
        L_0x0111:
            java.lang.Object r2 = r10.get(r6)     // Catch:{ Exception -> 0x1ce0 }
            if (r2 == 0) goto L_0x0127
            java.lang.Object r2 = r10.get(r6)     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x00b4 }
            r4 = 0
            int r2 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r2, (int) r4)     // Catch:{ Exception -> 0x00b4 }
            r3.f322808g = r2     // Catch:{ Exception -> 0x00b4 }
            r2 = 1
            r3.f322809h = r2     // Catch:{ Exception -> 0x00b4 }
        L_0x0127:
            java.lang.Object r2 = r10.get(r7)     // Catch:{ Exception -> 0x1ce0 }
            if (r2 == 0) goto L_0x013a
            java.lang.Object r2 = r10.get(r7)     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x00b4 }
            r4 = 0
            int r2 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r2, (int) r4)     // Catch:{ Exception -> 0x00b4 }
            r3.f322806e = r2     // Catch:{ Exception -> 0x00b4 }
        L_0x013a:
            java.lang.Object r2 = r10.get(r9)     // Catch:{ Exception -> 0x1ce0 }
            if (r2 == 0) goto L_0x014d
            java.lang.Object r2 = r10.get(r9)     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x00b4 }
            r4 = 0
            int r2 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r2, (int) r4)     // Catch:{ Exception -> 0x00b4 }
            r3.f322807f = r2     // Catch:{ Exception -> 0x00b4 }
        L_0x014d:
            java.lang.Object r2 = r10.get(r8)     // Catch:{ Exception -> 0x1ce0 }
            if (r2 == 0) goto L_0x0165
            gj.d$a r2 = r3.f322812k     // Catch:{ Exception -> 0x00b4 }
            java.lang.Object r4 = r10.get(r8)     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ Exception -> 0x00b4 }
            r5 = 0
            int r4 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r4, (int) r5)     // Catch:{ Exception -> 0x00b4 }
            r2.f322828a = r4     // Catch:{ Exception -> 0x00b4 }
            r2 = 1
            r3.f322813l = r2     // Catch:{ Exception -> 0x00b4 }
        L_0x0165:
            java.lang.Object r2 = r10.get(r11)     // Catch:{ Exception -> 0x1ce0 }
            if (r2 == 0) goto L_0x017d
            gj.d$a r2 = r3.f322812k     // Catch:{ Exception -> 0x00b4 }
            java.lang.Object r4 = r10.get(r11)     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ Exception -> 0x00b4 }
            r5 = 0
            int r4 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r4, (int) r5)     // Catch:{ Exception -> 0x00b4 }
            r2.f322829b = r4     // Catch:{ Exception -> 0x00b4 }
            r2 = 1
            r3.f322813l = r2     // Catch:{ Exception -> 0x00b4 }
        L_0x017d:
            r2 = r40
            java.lang.Object r4 = r10.get(r2)     // Catch:{ Exception -> 0x1ce0 }
            if (r4 == 0) goto L_0x0197
            gj.d$a r4 = r3.f322812k     // Catch:{ Exception -> 0x00b4 }
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x00b4 }
            r5 = 0
            int r2 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r2, (int) r5)     // Catch:{ Exception -> 0x00b4 }
            r4.f322830c = r2     // Catch:{ Exception -> 0x00b4 }
            r2 = 1
            r3.f322813l = r2     // Catch:{ Exception -> 0x00b4 }
        L_0x0197:
            r2 = r39
            java.lang.Object r4 = r10.get(r2)     // Catch:{ Exception -> 0x1ce0 }
            if (r4 == 0) goto L_0x01b1
            gj.d$a r4 = r3.f322812k     // Catch:{ Exception -> 0x00b4 }
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x00b4 }
            r5 = 0
            int r2 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r2, (int) r5)     // Catch:{ Exception -> 0x00b4 }
            r4.f322831d = r2     // Catch:{ Exception -> 0x00b4 }
            r2 = 1
            r3.f322813l = r2     // Catch:{ Exception -> 0x00b4 }
        L_0x01b1:
            r2 = r30
            java.lang.Object r4 = r10.get(r2)     // Catch:{ Exception -> 0x1ce0 }
            if (r4 == 0) goto L_0x01cb
            gj.d$a r4 = r3.f322812k     // Catch:{ Exception -> 0x00b4 }
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x00b4 }
            r5 = 0
            int r2 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r2, (int) r5)     // Catch:{ Exception -> 0x00b4 }
            r4.f322832e = r2     // Catch:{ Exception -> 0x00b4 }
            r2 = 1
            r3.f322813l = r2     // Catch:{ Exception -> 0x00b4 }
        L_0x01cb:
            r2 = r29
            java.lang.Object r4 = r10.get(r2)     // Catch:{ Exception -> 0x1ce0 }
            if (r4 == 0) goto L_0x01e5
            gj.d$a r4 = r3.f322812k     // Catch:{ Exception -> 0x00b4 }
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x00b4 }
            r5 = 0
            int r2 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r2, (int) r5)     // Catch:{ Exception -> 0x00b4 }
            r4.f322833f = r2     // Catch:{ Exception -> 0x00b4 }
            r2 = 1
            r3.f322813l = r2     // Catch:{ Exception -> 0x00b4 }
        L_0x01e5:
            r2 = r28
            java.lang.Object r4 = r10.get(r2)     // Catch:{ Exception -> 0x1ce0 }
            if (r4 == 0) goto L_0x01ff
            gj.d$a r4 = r3.f322812k     // Catch:{ Exception -> 0x00b4 }
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x00b4 }
            r5 = 0
            int r2 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r2, (int) r5)     // Catch:{ Exception -> 0x00b4 }
            r4.f322834g = r2     // Catch:{ Exception -> 0x00b4 }
            r2 = 1
            r3.f322813l = r2     // Catch:{ Exception -> 0x00b4 }
        L_0x01ff:
            r2 = r27
            java.lang.Object r4 = r10.get(r2)     // Catch:{ Exception -> 0x1ce0 }
            if (r4 == 0) goto L_0x0219
            gj.d$a r4 = r3.f322810i     // Catch:{ Exception -> 0x00b4 }
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x00b4 }
            r5 = 0
            int r2 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r2, (int) r5)     // Catch:{ Exception -> 0x00b4 }
            r4.f322828a = r2     // Catch:{ Exception -> 0x00b4 }
            r2 = 1
            r3.f322811j = r2     // Catch:{ Exception -> 0x00b4 }
        L_0x0219:
            r2 = r26
            java.lang.Object r4 = r10.get(r2)     // Catch:{ Exception -> 0x1ce0 }
            if (r4 == 0) goto L_0x0233
            gj.d$a r4 = r3.f322810i     // Catch:{ Exception -> 0x00b4 }
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x00b4 }
            r5 = 0
            int r2 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r2, (int) r5)     // Catch:{ Exception -> 0x00b4 }
            r4.f322829b = r2     // Catch:{ Exception -> 0x00b4 }
            r2 = 1
            r3.f322811j = r2     // Catch:{ Exception -> 0x00b4 }
        L_0x0233:
            r2 = r25
            java.lang.Object r4 = r10.get(r2)     // Catch:{ Exception -> 0x1ce0 }
            if (r4 == 0) goto L_0x024d
            gj.d$a r4 = r3.f322810i     // Catch:{ Exception -> 0x00b4 }
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x00b4 }
            r5 = 0
            int r2 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r2, (int) r5)     // Catch:{ Exception -> 0x00b4 }
            r4.f322830c = r2     // Catch:{ Exception -> 0x00b4 }
            r2 = 1
            r3.f322811j = r2     // Catch:{ Exception -> 0x00b4 }
        L_0x024d:
            r2 = r24
            java.lang.Object r4 = r10.get(r2)     // Catch:{ Exception -> 0x1ce0 }
            if (r4 == 0) goto L_0x0267
            gj.d$a r4 = r3.f322810i     // Catch:{ Exception -> 0x00b4 }
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x00b4 }
            r5 = 0
            int r2 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r2, (int) r5)     // Catch:{ Exception -> 0x00b4 }
            r4.f322831d = r2     // Catch:{ Exception -> 0x00b4 }
            r2 = 1
            r3.f322811j = r2     // Catch:{ Exception -> 0x00b4 }
        L_0x0267:
            r2 = r23
            java.lang.Object r4 = r10.get(r2)     // Catch:{ Exception -> 0x1ce0 }
            if (r4 == 0) goto L_0x0281
            gj.d$a r4 = r3.f322810i     // Catch:{ Exception -> 0x00b4 }
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x00b4 }
            r5 = 0
            int r2 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r2, (int) r5)     // Catch:{ Exception -> 0x00b4 }
            r4.f322832e = r2     // Catch:{ Exception -> 0x00b4 }
            r2 = 1
            r3.f322811j = r2     // Catch:{ Exception -> 0x00b4 }
        L_0x0281:
            r2 = r22
            java.lang.Object r4 = r10.get(r2)     // Catch:{ Exception -> 0x1ce0 }
            if (r4 == 0) goto L_0x029b
            gj.d$a r4 = r3.f322810i     // Catch:{ Exception -> 0x00b4 }
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x00b4 }
            r5 = 0
            int r2 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r2, (int) r5)     // Catch:{ Exception -> 0x00b4 }
            r4.f322833f = r2     // Catch:{ Exception -> 0x00b4 }
            r2 = 1
            r3.f322811j = r2     // Catch:{ Exception -> 0x00b4 }
        L_0x029b:
            r2 = r21
            java.lang.Object r4 = r10.get(r2)     // Catch:{ Exception -> 0x1ce0 }
            if (r4 == 0) goto L_0x02b5
            gj.d$a r4 = r3.f322810i     // Catch:{ Exception -> 0x00b4 }
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x00b4 }
            r5 = 0
            int r2 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r2, (int) r5)     // Catch:{ Exception -> 0x00b4 }
            r4.f322834g = r2     // Catch:{ Exception -> 0x00b4 }
            r2 = 1
            r3.f322811j = r2     // Catch:{ Exception -> 0x00b4 }
        L_0x02b5:
            r2 = r20
            java.lang.Object r4 = r10.get(r2)     // Catch:{ Exception -> 0x1ce0 }
            if (r4 == 0) goto L_0x02cd
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x00b4 }
            r4 = 0
            int r2 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r2, (int) r4)     // Catch:{ Exception -> 0x00b4 }
            r3.f322815n = r2     // Catch:{ Exception -> 0x00b4 }
            r2 = 1
            r3.f322814m = r2     // Catch:{ Exception -> 0x00b4 }
        L_0x02cd:
            r2 = r19
            java.lang.Object r4 = r10.get(r2)     // Catch:{ Exception -> 0x1ce0 }
            if (r4 == 0) goto L_0x02e5
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x00b4 }
            r4 = 0
            int r2 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r2, (int) r4)     // Catch:{ Exception -> 0x00b4 }
            r3.f322816o = r2     // Catch:{ Exception -> 0x00b4 }
            r2 = 1
            r3.f322814m = r2     // Catch:{ Exception -> 0x00b4 }
        L_0x02e5:
            r2 = r18
            java.lang.Object r4 = r10.get(r2)     // Catch:{ Exception -> 0x1ce0 }
            if (r4 == 0) goto L_0x02fd
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x00b4 }
            r4 = 0
            int r2 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r2, (int) r4)     // Catch:{ Exception -> 0x00b4 }
            r3.f322817p = r2     // Catch:{ Exception -> 0x00b4 }
            r2 = 1
            r3.f322814m = r2     // Catch:{ Exception -> 0x00b4 }
        L_0x02fd:
            r2 = r17
            java.lang.Object r4 = r10.get(r2)     // Catch:{ Exception -> 0x1ce0 }
            if (r4 == 0) goto L_0x0315
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x00b4 }
            r4 = 0
            int r2 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r2, (int) r4)     // Catch:{ Exception -> 0x00b4 }
            r3.f322818q = r2     // Catch:{ Exception -> 0x00b4 }
            r2 = 1
            r3.f322814m = r2     // Catch:{ Exception -> 0x00b4 }
        L_0x0315:
            r2 = r38
            java.lang.Object r4 = r10.get(r2)     // Catch:{ Exception -> 0x1ce0 }
            if (r4 == 0) goto L_0x032f
            java.lang.Object r4 = r10.get(r2)     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ Exception -> 0x00b4 }
            r5 = 0
            int r4 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r4, (int) r5)     // Catch:{ Exception -> 0x00b4 }
            r3.f322819r = r4     // Catch:{ Exception -> 0x00b4 }
            r4 = 1
            r3.f322820s = r4     // Catch:{ Exception -> 0x00b4 }
            r3.f322814m = r4     // Catch:{ Exception -> 0x00b4 }
        L_0x032f:
            r4 = r37
            java.lang.Object r5 = r10.get(r4)     // Catch:{ Exception -> 0x1ce0 }
            if (r5 == 0) goto L_0x0344
            java.lang.Object r5 = r10.get(r4)     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ Exception -> 0x00b4 }
            r6 = 0
            int r5 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r5, (int) r6)     // Catch:{ Exception -> 0x00b4 }
            r3.f322822u = r5     // Catch:{ Exception -> 0x00b4 }
        L_0x0344:
            r5 = r36
            java.lang.Object r6 = r10.get(r5)     // Catch:{ Exception -> 0x1ce0 }
            if (r6 == 0) goto L_0x0359
            java.lang.Object r6 = r10.get(r5)     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ Exception -> 0x00b4 }
            r7 = 0
            int r6 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r6, (int) r7)     // Catch:{ Exception -> 0x00b4 }
            r3.f322821t = r6     // Catch:{ Exception -> 0x00b4 }
        L_0x0359:
            r6 = r16
            java.lang.Object r7 = r10.get(r6)     // Catch:{ Exception -> 0x1ce0 }
            if (r7 == 0) goto L_0x036e
            java.lang.Object r6 = r10.get(r6)     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ Exception -> 0x00b4 }
            r7 = 0
            com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r6, (int) r7)     // Catch:{ Exception -> 0x00b4 }
            r45.getClass()     // Catch:{ Exception -> 0x00b4 }
        L_0x036e:
            java.lang.String r6 = ".deviceinfoconfig.voip.camera.scannerImageQuality"
            java.lang.Object r6 = r10.get(r6)     // Catch:{ Exception -> 0x1ce0 }
            if (r6 == 0) goto L_0x0385
            java.lang.String r6 = ".deviceinfoconfig.voip.camera.scannerImageQuality"
            java.lang.Object r6 = r10.get(r6)     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ Exception -> 0x00b4 }
            r7 = 0
            com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r6, (int) r7)     // Catch:{ Exception -> 0x00b4 }
            r45.getClass()     // Catch:{ Exception -> 0x00b4 }
        L_0x0385:
            java.lang.String r6 = ".deviceinfoconfig.voip.camera.autoFocusTimeInterval"
            java.lang.Object r6 = r10.get(r6)     // Catch:{ Exception -> 0x1ce0 }
            if (r6 == 0) goto L_0x039c
            java.lang.String r6 = ".deviceinfoconfig.voip.camera.autoFocusTimeInterval"
            java.lang.Object r6 = r10.get(r6)     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ Exception -> 0x00b4 }
            r7 = 0
            com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r6, (int) r7)     // Catch:{ Exception -> 0x00b4 }
            r45.getClass()     // Catch:{ Exception -> 0x00b4 }
        L_0x039c:
            java.lang.String r6 = ".deviceinfoconfig.voip.camera.focusType"
            java.lang.Object r6 = r10.get(r6)     // Catch:{ Exception -> 0x1ce0 }
            if (r6 == 0) goto L_0x03b3
            java.lang.String r6 = ".deviceinfoconfig.voip.camera.focusType"
            java.lang.Object r6 = r10.get(r6)     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ Exception -> 0x00b4 }
            r7 = 0
            int r6 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r6, (int) r7)     // Catch:{ Exception -> 0x00b4 }
            r3.f322793H = r6     // Catch:{ Exception -> 0x00b4 }
        L_0x03b3:
            java.lang.Object r6 = r10.get(r2)     // Catch:{ Exception -> 0x1ce0 }
            if (r6 == 0) goto L_0x03cb
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x00b4 }
            r6 = 0
            int r2 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r2, (int) r6)     // Catch:{ Exception -> 0x00b4 }
            r3.f322819r = r2     // Catch:{ Exception -> 0x00b4 }
            r2 = 1
            r3.f322820s = r2     // Catch:{ Exception -> 0x00b4 }
            r3.f322814m = r2     // Catch:{ Exception -> 0x00b4 }
        L_0x03cb:
            java.lang.Object r2 = r10.get(r4)     // Catch:{ Exception -> 0x1ce0 }
            if (r2 == 0) goto L_0x03de
            java.lang.Object r2 = r10.get(r4)     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x00b4 }
            r4 = 0
            int r2 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r2, (int) r4)     // Catch:{ Exception -> 0x00b4 }
            r3.f322822u = r2     // Catch:{ Exception -> 0x00b4 }
        L_0x03de:
            java.lang.Object r2 = r10.get(r5)     // Catch:{ Exception -> 0x1ce0 }
            if (r2 == 0) goto L_0x03f1
            java.lang.Object r2 = r10.get(r5)     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x00b4 }
            r4 = 0
            int r2 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r2, (int) r4)     // Catch:{ Exception -> 0x00b4 }
            r3.f322821t = r2     // Catch:{ Exception -> 0x00b4 }
        L_0x03f1:
            java.lang.String r2 = ".deviceinfoconfig.voip.camera.useFixFPSMode"
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x1ce0 }
            if (r2 == 0) goto L_0x0408
            java.lang.String r2 = ".deviceinfoconfig.voip.camera.useFixFPSMode"
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x00b4 }
            r4 = 0
            int r2 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r2, (int) r4)     // Catch:{ Exception -> 0x00b4 }
            r3.f322823v = r2     // Catch:{ Exception -> 0x00b4 }
        L_0x0408:
            java.lang.String r2 = ".deviceinfoconfig.voip.camera.useRangeFPSMode"
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x1ce0 }
            if (r2 == 0) goto L_0x041f
            java.lang.String r2 = ".deviceinfoconfig.voip.camera.useRangeFPSMode"
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x00b4 }
            r4 = 0
            int r2 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r2, (int) r4)     // Catch:{ Exception -> 0x00b4 }
            r3.f322824w = r2     // Catch:{ Exception -> 0x00b4 }
        L_0x041f:
            java.lang.String r2 = ".deviceinfoconfig.voip.camera.setYUV420SPFormat"
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x1ce0 }
            if (r2 == 0) goto L_0x0436
            java.lang.String r2 = ".deviceinfoconfig.voip.camera.setYUV420SPFormat"
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x00b4 }
            r4 = 0
            int r2 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r2, (int) r4)     // Catch:{ Exception -> 0x00b4 }
            r3.f322825x = r2     // Catch:{ Exception -> 0x00b4 }
        L_0x0436:
            java.lang.String r2 = ".deviceinfoconfig.voip.camera.useMeteringMode"
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x1ce0 }
            if (r2 == 0) goto L_0x044d
            java.lang.String r2 = ".deviceinfoconfig.voip.camera.useMeteringMode"
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x00b4 }
            r4 = 0
            int r2 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r2, (int) r4)     // Catch:{ Exception -> 0x00b4 }
            r3.f322826y = r2     // Catch:{ Exception -> 0x00b4 }
        L_0x044d:
            java.lang.String r2 = ".deviceinfoconfig.voip.camera.useContinueVideoFocusMode"
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x1ce0 }
            if (r2 == 0) goto L_0x0464
            java.lang.String r2 = ".deviceinfoconfig.voip.camera.useContinueVideoFocusMode"
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x00b4 }
            r4 = 0
            int r2 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r2, (int) r4)     // Catch:{ Exception -> 0x00b4 }
            r3.f322827z = r2     // Catch:{ Exception -> 0x00b4 }
        L_0x0464:
            java.lang.String r2 = ".deviceinfoconfig.voip.camera.mUsestabilizationsupported"
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x1ce0 }
            if (r2 == 0) goto L_0x047b
            java.lang.String r2 = ".deviceinfoconfig.voip.camera.mUsestabilizationsupported"
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x00b4 }
            r4 = 0
            int r2 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r2, (int) r4)     // Catch:{ Exception -> 0x00b4 }
            r3.f322786A = r2     // Catch:{ Exception -> 0x00b4 }
        L_0x047b:
            java.lang.String r2 = ".deviceinfoconfig.voip.camera.sightCameraID"
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x1ce0 }
            if (r2 == 0) goto L_0x0492
            java.lang.String r2 = ".deviceinfoconfig.voip.camera.sightCameraID"
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x00b4 }
            r4 = 0
            int r2 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r2, (int) r4)     // Catch:{ Exception -> 0x00b4 }
            r3.f322787B = r2     // Catch:{ Exception -> 0x00b4 }
        L_0x0492:
            java.lang.String r2 = ".deviceinfoconfig.voip.camera.needEnhance"
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x1ce0 }
            if (r2 == 0) goto L_0x04a9
            java.lang.String r2 = ".deviceinfoconfig.voip.camera.needEnhance"
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x00b4 }
            r4 = 0
            int r2 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r2, (int) r4)     // Catch:{ Exception -> 0x00b4 }
            r3.f322788C = r2     // Catch:{ Exception -> 0x00b4 }
        L_0x04a9:
            java.lang.String r2 = ".deviceinfoconfig.voip.camera.support480enc"
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x1ce0 }
            if (r2 == 0) goto L_0x04c0
            java.lang.String r2 = ".deviceinfoconfig.voip.camera.support480enc"
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x00b4 }
            r4 = 0
            int r2 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r2, (int) r4)     // Catch:{ Exception -> 0x00b4 }
            r3.f322789D = r2     // Catch:{ Exception -> 0x00b4 }
        L_0x04c0:
            java.lang.String r2 = ".deviceinfoconfig.voip.camera.supportHWenc"
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x1ce0 }
            if (r2 == 0) goto L_0x04d7
            java.lang.String r2 = ".deviceinfoconfig.voip.camera.supportHWenc"
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x00b4 }
            r4 = 0
            int r2 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r2, (int) r4)     // Catch:{ Exception -> 0x00b4 }
            r3.f322790E = r2     // Catch:{ Exception -> 0x00b4 }
        L_0x04d7:
            java.lang.String r2 = ".deviceinfoconfig.voip.camera.voipBeauty"
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x1ce0 }
            if (r2 == 0) goto L_0x04ee
            java.lang.String r2 = ".deviceinfoconfig.voip.camera.voipBeauty"
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x00b4 }
            r4 = 0
            int r2 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r2, (int) r4)     // Catch:{ Exception -> 0x00b4 }
            r3.f322794I = r2     // Catch:{ Exception -> 0x00b4 }
        L_0x04ee:
            java.lang.String r2 = ".deviceinfoconfig.voip.camera.voipBeautyWhite"
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x1ce0 }
            if (r2 == 0) goto L_0x0505
            java.lang.String r2 = ".deviceinfoconfig.voip.camera.voipBeautyWhite"
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x00b4 }
            r4 = 0
            int r2 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r2, (int) r4)     // Catch:{ Exception -> 0x00b4 }
            r3.f322795J = r2     // Catch:{ Exception -> 0x00b4 }
        L_0x0505:
            java.lang.String r2 = ".deviceinfoconfig.voip.camera.enable720cap"
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x1ce0 }
            if (r2 == 0) goto L_0x051c
            java.lang.String r2 = ".deviceinfoconfig.voip.camera.enable720cap"
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x00b4 }
            r4 = 0
            int r2 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r2, (int) r4)     // Catch:{ Exception -> 0x00b4 }
            r3.f322791F = r2     // Catch:{ Exception -> 0x00b4 }
        L_0x051c:
            java.lang.String r2 = ".deviceinfoconfig.voip.camera.mEnc720pCfg"
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x1ce0 }
            if (r2 == 0) goto L_0x0533
            java.lang.String r2 = ".deviceinfoconfig.voip.camera.mEnc720pCfg"
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x00b4 }
            r4 = 0
            int r2 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r2, (int) r4)     // Catch:{ Exception -> 0x00b4 }
            r3.f322792G = r2     // Catch:{ Exception -> 0x00b4 }
        L_0x0533:
            java.lang.String r2 = ".deviceinfoconfig.voip.camera.stFilter"
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x1ce0 }
            if (r2 == 0) goto L_0x054a
            java.lang.String r2 = ".deviceinfoconfig.voip.camera.stFilter"
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x00b4 }
            r4 = 0
            int r2 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r2, (int) r4)     // Catch:{ Exception -> 0x00b4 }
            r3.f322796K = r2     // Catch:{ Exception -> 0x00b4 }
        L_0x054a:
            java.lang.String r2 = ".deviceinfoconfig.voip.camera.stFilteroff"
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x1ce0 }
            if (r2 == 0) goto L_0x0561
            java.lang.String r2 = ".deviceinfoconfig.voip.camera.stFilteroff"
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x00b4 }
            r4 = 0
            int r2 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r2, (int) r4)     // Catch:{ Exception -> 0x00b4 }
            r3.f322797L = r2     // Catch:{ Exception -> 0x00b4 }
        L_0x0561:
            java.lang.String r2 = ".deviceinfoconfig.voip.camera.fpsMin"
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x1ce0 }
            if (r2 == 0) goto L_0x0578
            java.lang.String r2 = ".deviceinfoconfig.voip.camera.fpsMin"
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x00b4 }
            r4 = 0
            int r2 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r2, (int) r4)     // Catch:{ Exception -> 0x00b4 }
            r3.f322798M = r2     // Catch:{ Exception -> 0x00b4 }
        L_0x0578:
            java.lang.String r2 = ".deviceinfoconfig.voip.camera.fpsMax"
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x1ce0 }
            if (r2 == 0) goto L_0x058f
            java.lang.String r2 = ".deviceinfoconfig.voip.camera.fpsMax"
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x00b4 }
            r4 = 0
            int r2 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r2, (int) r4)     // Catch:{ Exception -> 0x00b4 }
            r3.f322799N = r2     // Catch:{ Exception -> 0x00b4 }
        L_0x058f:
            java.lang.String r2 = ".deviceinfoconfig.voip.camera.autoRotate"
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x1ce0 }
            if (r2 == 0) goto L_0x05a6
            java.lang.String r2 = ".deviceinfoconfig.voip.camera.autoRotate"
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x00b4 }
            r4 = 0
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.getBoolean(r2, r4)     // Catch:{ Exception -> 0x00b4 }
            r3.f322800O = r2     // Catch:{ Exception -> 0x00b4 }
        L_0x05a6:
            java.lang.String r2 = ".deviceinfoconfig.voip.camera.sharpenFilter"
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x1ce0 }
            if (r2 == 0) goto L_0x05bd
            java.lang.String r2 = ".deviceinfoconfig.voip.camera.sharpenFilter"
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x00b4 }
            r4 = 0
            int r2 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r2, (int) r4)     // Catch:{ Exception -> 0x00b4 }
            r3.f322801P = r2     // Catch:{ Exception -> 0x00b4 }
        L_0x05bd:
            java.lang.String r2 = ".deviceinfoconfig.voip.audio.streamtype"
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x1ce0 }
            if (r2 == 0) goto L_0x05da
            java.lang.String r2 = ".deviceinfoconfig.voip.audio.streamtype"
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x00b4 }
            r3 = 0
            int r2 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r2, (int) r3)     // Catch:{ Exception -> 0x00b4 }
            r3 = r46
            r3.f322733b = r2     // Catch:{ Exception -> 0x00b4 }
            r2 = 1
            r3.f322730a = r2     // Catch:{ Exception -> 0x00b4 }
            goto L_0x05dc
        L_0x05da:
            r3 = r46
        L_0x05dc:
            java.lang.String r2 = ".deviceinfoconfig.voip.audio.smode"
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x1ce0 }
            if (r2 == 0) goto L_0x05f6
            java.lang.String r2 = ".deviceinfoconfig.voip.audio.smode"
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x00b4 }
            r4 = 0
            int r2 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r2, (int) r4)     // Catch:{ Exception -> 0x00b4 }
            r3.f322735c = r2     // Catch:{ Exception -> 0x00b4 }
            r2 = 1
            r3.f322730a = r2     // Catch:{ Exception -> 0x00b4 }
        L_0x05f6:
            java.lang.String r2 = ".deviceinfoconfig.voip.audio.omode"
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x1ce0 }
            if (r2 == 0) goto L_0x0610
            java.lang.String r2 = ".deviceinfoconfig.voip.audio.omode"
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x00b4 }
            r4 = 0
            int r2 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r2, (int) r4)     // Catch:{ Exception -> 0x00b4 }
            r3.f322737d = r2     // Catch:{ Exception -> 0x00b4 }
            r2 = 1
            r3.f322730a = r2     // Catch:{ Exception -> 0x00b4 }
        L_0x0610:
            java.lang.String r2 = ".deviceinfoconfig.voip.audio.ospeaker"
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x1ce0 }
            if (r2 == 0) goto L_0x062a
            java.lang.String r2 = ".deviceinfoconfig.voip.audio.ospeaker"
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x00b4 }
            r4 = 0
            int r2 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r2, (int) r4)     // Catch:{ Exception -> 0x00b4 }
            r3.f322739e = r2     // Catch:{ Exception -> 0x00b4 }
            r2 = 1
            r3.f322730a = r2     // Catch:{ Exception -> 0x00b4 }
        L_0x062a:
            java.lang.String r2 = ".deviceinfoconfig.voip.audio.operating"
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x1ce0 }
            if (r2 == 0) goto L_0x0644
            java.lang.String r2 = ".deviceinfoconfig.voip.audio.operating"
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x00b4 }
            r4 = 0
            int r2 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r2, (int) r4)     // Catch:{ Exception -> 0x00b4 }
            r3.f322741f = r2     // Catch:{ Exception -> 0x00b4 }
            r2 = 1
            r3.f322730a = r2     // Catch:{ Exception -> 0x00b4 }
        L_0x0644:
            java.lang.String r2 = ".deviceinfoconfig.voip.audio.moperating"
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x1ce0 }
            if (r2 == 0) goto L_0x065e
            java.lang.String r2 = ".deviceinfoconfig.voip.audio.moperating"
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x00b4 }
            r4 = 0
            int r2 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r2, (int) r4)     // Catch:{ Exception -> 0x00b4 }
            r3.f322743g = r2     // Catch:{ Exception -> 0x00b4 }
            r2 = 1
            r3.f322730a = r2     // Catch:{ Exception -> 0x00b4 }
        L_0x065e:
            java.lang.String r2 = ".deviceinfoconfig.voip.audio.mstreamtype"
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x1ce0 }
            if (r2 == 0) goto L_0x0678
            java.lang.String r2 = ".deviceinfoconfig.voip.audio.mstreamtype"
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x00b4 }
            r4 = 0
            int r2 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r2, (int) r4)     // Catch:{ Exception -> 0x00b4 }
            r3.f322745h = r2     // Catch:{ Exception -> 0x00b4 }
            r2 = 1
            r3.f322730a = r2     // Catch:{ Exception -> 0x00b4 }
        L_0x0678:
            java.lang.String r2 = ".deviceinfoconfig.voip.audio.recordmode"
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x1ce0 }
            if (r2 == 0) goto L_0x068f
            java.lang.String r2 = ".deviceinfoconfig.voip.audio.recordmode"
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x00b4 }
            r4 = 0
            int r2 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r2, (int) r4)     // Catch:{ Exception -> 0x00b4 }
            r3.f322747i = r2     // Catch:{ Exception -> 0x00b4 }
        L_0x068f:
            r2 = r35
            java.lang.Object r4 = r10.get(r2)     // Catch:{ Exception -> 0x1ce0 }
            if (r4 == 0) goto L_0x06a4
            java.lang.Object r4 = r10.get(r2)     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ Exception -> 0x00b4 }
            r5 = 0
            int r4 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r4, (int) r5)     // Catch:{ Exception -> 0x00b4 }
            r3.f322749j = r4     // Catch:{ Exception -> 0x00b4 }
        L_0x06a4:
            java.lang.String r4 = ".deviceinfoconfig.voip.audio.aecmode"
            java.lang.Object r4 = r10.get(r4)     // Catch:{ Exception -> 0x1ce0 }
            if (r4 == 0) goto L_0x06bb
            java.lang.String r4 = ".deviceinfoconfig.voip.audio.aecmode"
            java.lang.Object r4 = r10.get(r4)     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ Exception -> 0x00b4 }
            r5 = 0
            int r4 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r4, (int) r5)     // Catch:{ Exception -> 0x00b4 }
            r3.f322751k = r4     // Catch:{ Exception -> 0x00b4 }
        L_0x06bb:
            java.lang.String r4 = ".deviceinfoconfig.voip.audio.nsmode"
            java.lang.Object r4 = r10.get(r4)     // Catch:{ Exception -> 0x1ce0 }
            if (r4 == 0) goto L_0x06d2
            java.lang.String r4 = ".deviceinfoconfig.voip.audio.nsmode"
            java.lang.Object r4 = r10.get(r4)     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ Exception -> 0x00b4 }
            r5 = 0
            int r4 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r4, (int) r5)     // Catch:{ Exception -> 0x00b4 }
            r3.f322753l = r4     // Catch:{ Exception -> 0x00b4 }
        L_0x06d2:
            java.lang.String r4 = ".deviceinfoconfig.voip.audio.volummode"
            java.lang.Object r4 = r10.get(r4)     // Catch:{ Exception -> 0x1ce0 }
            if (r4 == 0) goto L_0x06e9
            java.lang.String r4 = ".deviceinfoconfig.voip.audio.volummode"
            java.lang.Object r4 = r10.get(r4)     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ Exception -> 0x00b4 }
            r5 = 0
            int r4 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r4, (int) r5)     // Catch:{ Exception -> 0x00b4 }
            r3.f322755m = r4     // Catch:{ Exception -> 0x00b4 }
        L_0x06e9:
            java.lang.String r4 = ".deviceinfoconfig.voip.audio.sourcemode"
            java.lang.Object r4 = r10.get(r4)     // Catch:{ Exception -> 0x1ce0 }
            if (r4 == 0) goto L_0x0700
            java.lang.String r4 = ".deviceinfoconfig.voip.audio.sourcemode"
            java.lang.Object r4 = r10.get(r4)     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ Exception -> 0x00b4 }
            r5 = 0
            int r4 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r4, (int) r5)     // Catch:{ Exception -> 0x00b4 }
            r3.f322684D = r4     // Catch:{ Exception -> 0x00b4 }
        L_0x0700:
            java.lang.String r4 = ".deviceinfoconfig.voip.audio.micmode"
            java.lang.Object r4 = r10.get(r4)     // Catch:{ Exception -> 0x1ce0 }
            if (r4 == 0) goto L_0x0717
            java.lang.String r4 = ".deviceinfoconfig.voip.audio.micmode"
            java.lang.Object r4 = r10.get(r4)     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ Exception -> 0x00b4 }
            r5 = 0
            int r4 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r4, (int) r5)     // Catch:{ Exception -> 0x00b4 }
            r3.f322682C = r4     // Catch:{ Exception -> 0x00b4 }
        L_0x0717:
            java.lang.String r4 = ".deviceinfoconfig.voip.audio.speakerMode"
            java.lang.Object r4 = r10.get(r4)     // Catch:{ Exception -> 0x1ce0 }
            if (r4 == 0) goto L_0x072e
            java.lang.String r4 = ".deviceinfoconfig.voip.audio.speakerMode"
            java.lang.Object r4 = r10.get(r4)     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ Exception -> 0x00b4 }
            r5 = 0
            int r4 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r4, (int) r5)     // Catch:{ Exception -> 0x00b4 }
            r3.f322686E = r4     // Catch:{ Exception -> 0x00b4 }
        L_0x072e:
            java.lang.String r4 = ".deviceinfoconfig.voip.audio.phoneMode"
            java.lang.Object r4 = r10.get(r4)     // Catch:{ Exception -> 0x1ce0 }
            if (r4 == 0) goto L_0x0745
            java.lang.String r4 = ".deviceinfoconfig.voip.audio.phoneMode"
            java.lang.Object r4 = r10.get(r4)     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ Exception -> 0x00b4 }
            r5 = 0
            int r4 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r4, (int) r5)     // Catch:{ Exception -> 0x00b4 }
            r3.f322688F = r4     // Catch:{ Exception -> 0x00b4 }
        L_0x0745:
            java.lang.String r4 = ".deviceinfoconfig.voip.audio.deviceinfo.voipstreamType"
            java.lang.Object r4 = r10.get(r4)     // Catch:{ Exception -> 0x1ce0 }
            if (r4 == 0) goto L_0x075c
            java.lang.String r4 = ".deviceinfoconfig.voip.audio.deviceinfo.voipstreamType"
            java.lang.Object r4 = r10.get(r4)     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ Exception -> 0x00b4 }
            r5 = 0
            int r4 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r4, (int) r5)     // Catch:{ Exception -> 0x00b4 }
            r3.f322690G = r4     // Catch:{ Exception -> 0x00b4 }
        L_0x075c:
            java.lang.String r4 = ".deviceinfoconfig.voip.audio.speakerstreamtype"
            java.lang.Object r4 = r10.get(r4)     // Catch:{ Exception -> 0x1ce0 }
            if (r4 == 0) goto L_0x0773
            java.lang.String r4 = ".deviceinfoconfig.voip.audio.speakerstreamtype"
            java.lang.Object r4 = r10.get(r4)     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ Exception -> 0x00b4 }
            r5 = 0
            int r4 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r4, (int) r5)     // Catch:{ Exception -> 0x00b4 }
            r3.f322692H = r4     // Catch:{ Exception -> 0x00b4 }
        L_0x0773:
            java.lang.String r4 = ".deviceinfoconfig.voip.audio.phonestreamtype"
            java.lang.Object r4 = r10.get(r4)     // Catch:{ Exception -> 0x1ce0 }
            if (r4 == 0) goto L_0x078a
            java.lang.String r4 = ".deviceinfoconfig.voip.audio.phonestreamtype"
            java.lang.Object r4 = r10.get(r4)     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ Exception -> 0x00b4 }
            r5 = 0
            int r4 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r4, (int) r5)     // Catch:{ Exception -> 0x00b4 }
            r3.f322694I = r4     // Catch:{ Exception -> 0x00b4 }
        L_0x078a:
            java.lang.String r4 = ".deviceinfoconfig.voip.audio.ringphonestream"
            java.lang.Object r4 = r10.get(r4)     // Catch:{ Exception -> 0x1ce0 }
            if (r4 == 0) goto L_0x07a1
            java.lang.String r4 = ".deviceinfoconfig.voip.audio.ringphonestream"
            java.lang.Object r4 = r10.get(r4)     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ Exception -> 0x00b4 }
            r5 = 0
            int r4 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r4, (int) r5)     // Catch:{ Exception -> 0x00b4 }
            r3.f322698K = r4     // Catch:{ Exception -> 0x00b4 }
        L_0x07a1:
            java.lang.String r4 = ".deviceinfoconfig.voip.audio.ringphonemode"
            java.lang.Object r4 = r10.get(r4)     // Catch:{ Exception -> 0x1ce0 }
            if (r4 == 0) goto L_0x07b8
            java.lang.String r4 = ".deviceinfoconfig.voip.audio.ringphonemode"
            java.lang.Object r4 = r10.get(r4)     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ Exception -> 0x00b4 }
            r5 = 0
            int r4 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r4, (int) r5)     // Catch:{ Exception -> 0x00b4 }
            r3.f322700L = r4     // Catch:{ Exception -> 0x00b4 }
        L_0x07b8:
            java.lang.String r4 = ".deviceinfoconfig.voip.audio.ringspeakerstream"
            java.lang.Object r4 = r10.get(r4)     // Catch:{ Exception -> 0x1ce0 }
            if (r4 == 0) goto L_0x07cf
            java.lang.String r4 = ".deviceinfoconfig.voip.audio.ringspeakerstream"
            java.lang.Object r4 = r10.get(r4)     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ Exception -> 0x00b4 }
            r5 = 0
            int r4 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r4, (int) r5)     // Catch:{ Exception -> 0x00b4 }
            r3.f322702M = r4     // Catch:{ Exception -> 0x00b4 }
        L_0x07cf:
            java.lang.String r4 = ".deviceinfoconfig.voip.audio.ringspeakermode"
            java.lang.Object r4 = r10.get(r4)     // Catch:{ Exception -> 0x1ce0 }
            if (r4 == 0) goto L_0x07e6
            java.lang.String r4 = ".deviceinfoconfig.voip.audio.ringspeakermode"
            java.lang.Object r4 = r10.get(r4)     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ Exception -> 0x00b4 }
            r5 = 0
            int r4 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r4, (int) r5)     // Catch:{ Exception -> 0x00b4 }
            r3.f322704N = r4     // Catch:{ Exception -> 0x00b4 }
        L_0x07e6:
            java.lang.String r4 = ".deviceinfoconfig.voip.audio.aecmodenew"
            java.lang.Object r4 = r10.get(r4)     // Catch:{ Exception -> 0x1ce0 }
            if (r4 == 0) goto L_0x07fd
            java.lang.String r4 = ".deviceinfoconfig.voip.audio.aecmodenew"
            java.lang.Object r4 = r10.get(r4)     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ Exception -> 0x00b4 }
            r5 = 0
            int r4 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r4, (int) r5)     // Catch:{ Exception -> 0x00b4 }
            r3.f322706O = r4     // Catch:{ Exception -> 0x00b4 }
        L_0x07fd:
            java.lang.String r4 = ".deviceinfoconfig.voip.audio.nsmodenew"
            java.lang.Object r4 = r10.get(r4)     // Catch:{ Exception -> 0x1ce0 }
            if (r4 == 0) goto L_0x0814
            java.lang.String r4 = ".deviceinfoconfig.voip.audio.nsmodenew"
            java.lang.Object r4 = r10.get(r4)     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ Exception -> 0x00b4 }
            r5 = 0
            int r4 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r4, (int) r5)     // Catch:{ Exception -> 0x00b4 }
            r3.f322708P = r4     // Catch:{ Exception -> 0x00b4 }
        L_0x0814:
            java.lang.String r4 = ".deviceinfoconfig.voip.audio.nsModeNewMulti"
            java.lang.Object r4 = r10.get(r4)     // Catch:{ Exception -> 0x1ce0 }
            if (r4 == 0) goto L_0x082b
            java.lang.String r4 = ".deviceinfoconfig.voip.audio.nsModeNewMulti"
            java.lang.Object r4 = r10.get(r4)     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ Exception -> 0x00b4 }
            r5 = 0
            int r4 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r4, (int) r5)     // Catch:{ Exception -> 0x00b4 }
            r3.f322710Q = r4     // Catch:{ Exception -> 0x00b4 }
        L_0x082b:
            java.lang.String r4 = ".deviceinfoconfig.voip.audio.voipfullbandcfg"
            java.lang.Object r4 = r10.get(r4)     // Catch:{ Exception -> 0x1ce0 }
            if (r4 == 0) goto L_0x0842
            java.lang.String r4 = ".deviceinfoconfig.voip.audio.voipfullbandcfg"
            java.lang.Object r4 = r10.get(r4)     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ Exception -> 0x00b4 }
            r5 = 0
            int r4 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r4, (int) r5)     // Catch:{ Exception -> 0x00b4 }
            r3.f322712R = r4     // Catch:{ Exception -> 0x00b4 }
        L_0x0842:
            java.lang.String r4 = ".deviceinfoconfig.voip.audio.agcmodenew"
            java.lang.Object r4 = r10.get(r4)     // Catch:{ Exception -> 0x1ce0 }
            if (r4 == 0) goto L_0x0859
            java.lang.String r4 = ".deviceinfoconfig.voip.audio.agcmodenew"
            java.lang.Object r4 = r10.get(r4)     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ Exception -> 0x00b4 }
            r5 = 0
            int r4 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r4, (int) r5)     // Catch:{ Exception -> 0x00b4 }
            r3.f322714S = r4     // Catch:{ Exception -> 0x00b4 }
        L_0x0859:
            java.lang.String r4 = ".deviceinfoconfig.voip.audio.agcmode"
            java.lang.Object r4 = r10.get(r4)     // Catch:{ Exception -> 0x1ce0 }
            if (r4 == 0) goto L_0x0870
            java.lang.String r4 = ".deviceinfoconfig.voip.audio.agcmode"
            java.lang.Object r4 = r10.get(r4)     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ Exception -> 0x00b4 }
            r5 = 0
            int r4 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r4, (int) r5)     // Catch:{ Exception -> 0x00b4 }
            r3.f322716T = r4     // Catch:{ Exception -> 0x00b4 }
        L_0x0870:
            java.lang.String r4 = ".deviceinfoconfig.voip.audio.agctargetdb"
            java.lang.Object r4 = r10.get(r4)     // Catch:{ Exception -> 0x1ce0 }
            if (r4 == 0) goto L_0x0887
            java.lang.String r4 = ".deviceinfoconfig.voip.audio.agctargetdb"
            java.lang.Object r4 = r10.get(r4)     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ Exception -> 0x00b4 }
            r5 = 0
            int r4 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r4, (int) r5)     // Catch:{ Exception -> 0x00b4 }
            r3.f322718U = r4     // Catch:{ Exception -> 0x00b4 }
        L_0x0887:
            java.lang.String r4 = ".deviceinfoconfig.voip.audio.agcgaindb"
            java.lang.Object r4 = r10.get(r4)     // Catch:{ Exception -> 0x1ce0 }
            if (r4 == 0) goto L_0x089e
            java.lang.String r4 = ".deviceinfoconfig.voip.audio.agcgaindb"
            java.lang.Object r4 = r10.get(r4)     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ Exception -> 0x00b4 }
            r5 = 0
            int r4 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r4, (int) r5)     // Catch:{ Exception -> 0x00b4 }
            r3.f322720V = r4     // Catch:{ Exception -> 0x00b4 }
        L_0x089e:
            java.lang.String r4 = ".deviceinfoconfig.voip.audio.agcspkgaindb"
            java.lang.Object r4 = r10.get(r4)     // Catch:{ Exception -> 0x1ce0 }
            if (r4 == 0) goto L_0x08b5
            java.lang.String r4 = ".deviceinfoconfig.voip.audio.agcspkgaindb"
            java.lang.Object r4 = r10.get(r4)     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ Exception -> 0x00b4 }
            r5 = 0
            int r4 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r4, (int) r5)     // Catch:{ Exception -> 0x00b4 }
            r3.f322726Y = r4     // Catch:{ Exception -> 0x00b4 }
        L_0x08b5:
            java.lang.String r4 = ".deviceinfoconfig.voip.audio.agcphngaindb"
            java.lang.Object r4 = r10.get(r4)     // Catch:{ Exception -> 0x1ce0 }
            if (r4 == 0) goto L_0x08cc
            java.lang.String r4 = ".deviceinfoconfig.voip.audio.agcphngaindb"
            java.lang.Object r4 = r10.get(r4)     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ Exception -> 0x00b4 }
            r5 = 0
            int r4 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r4, (int) r5)     // Catch:{ Exception -> 0x00b4 }
            r3.f322728Z = r4     // Catch:{ Exception -> 0x00b4 }
        L_0x08cc:
            java.lang.String r4 = ".deviceinfoconfig.voip.audio.agchdsgaindb"
            java.lang.Object r4 = r10.get(r4)     // Catch:{ Exception -> 0x1ce0 }
            if (r4 == 0) goto L_0x08e3
            java.lang.String r4 = ".deviceinfoconfig.voip.audio.agchdsgaindb"
            java.lang.Object r4 = r10.get(r4)     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ Exception -> 0x00b4 }
            r5 = 0
            int r4 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r4, (int) r5)     // Catch:{ Exception -> 0x00b4 }
            r3.f322731a0 = r4     // Catch:{ Exception -> 0x00b4 }
        L_0x08e3:
            java.lang.String r4 = ".deviceinfoconfig.voip.audio.playvolvoip"
            java.lang.Object r4 = r10.get(r4)     // Catch:{ Exception -> 0x1ce0 }
            if (r4 == 0) goto L_0x08fa
            java.lang.String r4 = ".deviceinfoconfig.voip.audio.playvolvoip"
            java.lang.Object r4 = r10.get(r4)     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ Exception -> 0x00b4 }
            r5 = 0
            int r4 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r4, (int) r5)     // Catch:{ Exception -> 0x00b4 }
            r3.f322734b0 = r4     // Catch:{ Exception -> 0x00b4 }
        L_0x08fa:
            java.lang.String r4 = ".deviceinfoconfig.voip.audio.playvolmt"
            java.lang.Object r4 = r10.get(r4)     // Catch:{ Exception -> 0x1ce0 }
            if (r4 == 0) goto L_0x0911
            java.lang.String r4 = ".deviceinfoconfig.voip.audio.playvolmt"
            java.lang.Object r4 = r10.get(r4)     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ Exception -> 0x00b4 }
            r5 = 0
            int r4 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r4, (int) r5)     // Catch:{ Exception -> 0x00b4 }
            r3.f322736c0 = r4     // Catch:{ Exception -> 0x00b4 }
        L_0x0911:
            java.lang.String r4 = ".deviceinfoconfig.voip.audio.agcflag"
            java.lang.Object r4 = r10.get(r4)     // Catch:{ Exception -> 0x1ce0 }
            if (r4 == 0) goto L_0x0928
            java.lang.String r4 = ".deviceinfoconfig.voip.audio.agcflag"
            java.lang.Object r4 = r10.get(r4)     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ Exception -> 0x00b4 }
            r5 = 0
            int r4 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r4, (int) r5)     // Catch:{ Exception -> 0x00b4 }
            r3.f322722W = r4     // Catch:{ Exception -> 0x00b4 }
        L_0x0928:
            java.lang.String r4 = ".deviceinfoconfig.voip.audio.agclimiter"
            java.lang.Object r4 = r10.get(r4)     // Catch:{ Exception -> 0x1ce0 }
            if (r4 == 0) goto L_0x093f
            java.lang.String r4 = ".deviceinfoconfig.voip.audio.agclimiter"
            java.lang.Object r4 = r10.get(r4)     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ Exception -> 0x00b4 }
            r5 = 0
            int r4 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r4, (int) r5)     // Catch:{ Exception -> 0x00b4 }
            r3.f322724X = r4     // Catch:{ Exception -> 0x00b4 }
        L_0x093f:
            java.lang.String r4 = ".deviceinfoconfig.voip.audio.agcCompRatio"
            java.lang.Object r4 = r10.get(r4)     // Catch:{ Exception -> 0x1ce0 }
            if (r4 == 0) goto L_0x0956
            java.lang.String r4 = ".deviceinfoconfig.voip.audio.agcCompRatio"
            java.lang.Object r4 = r10.get(r4)     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ Exception -> 0x00b4 }
            r5 = 0
            int r4 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r4, (int) r5)     // Catch:{ Exception -> 0x00b4 }
            r3.f322738d0 = r4     // Catch:{ Exception -> 0x00b4 }
        L_0x0956:
            java.lang.String r4 = ".deviceinfoconfig.voip.audio.agcDnGainThr"
            java.lang.Object r4 = r10.get(r4)     // Catch:{ Exception -> 0x1ce0 }
            if (r4 == 0) goto L_0x096d
            java.lang.String r4 = ".deviceinfoconfig.voip.audio.agcDnGainThr"
            java.lang.Object r4 = r10.get(r4)     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ Exception -> 0x00b4 }
            r5 = 0
            int r4 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r4, (int) r5)     // Catch:{ Exception -> 0x00b4 }
            r3.f322740e0 = r4     // Catch:{ Exception -> 0x00b4 }
        L_0x096d:
            java.lang.String r4 = ".deviceinfoconfig.voip.audio.waveAgcMode"
            java.lang.Object r4 = r10.get(r4)     // Catch:{ Exception -> 0x1ce0 }
            if (r4 == 0) goto L_0x0984
            java.lang.String r4 = ".deviceinfoconfig.voip.audio.waveAgcMode"
            java.lang.Object r4 = r10.get(r4)     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ Exception -> 0x00b4 }
            r5 = 0
            int r4 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r4, (int) r5)     // Catch:{ Exception -> 0x00b4 }
            r3.f322742f0 = r4     // Catch:{ Exception -> 0x00b4 }
        L_0x0984:
            java.lang.String r4 = ".deviceinfoconfig.voip.audio.waveAgcSpkGain"
            java.lang.Object r4 = r10.get(r4)     // Catch:{ Exception -> 0x1ce0 }
            if (r4 == 0) goto L_0x099b
            java.lang.String r4 = ".deviceinfoconfig.voip.audio.waveAgcSpkGain"
            java.lang.Object r4 = r10.get(r4)     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ Exception -> 0x00b4 }
            r5 = 0
            int r4 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r4, (int) r5)     // Catch:{ Exception -> 0x00b4 }
            r3.f322744g0 = r4     // Catch:{ Exception -> 0x00b4 }
        L_0x099b:
            java.lang.String r4 = ".deviceinfoconfig.voip.audio.waveAgcPhnGain"
            java.lang.Object r4 = r10.get(r4)     // Catch:{ Exception -> 0x1ce0 }
            if (r4 == 0) goto L_0x09b2
            java.lang.String r4 = ".deviceinfoconfig.voip.audio.waveAgcPhnGain"
            java.lang.Object r4 = r10.get(r4)     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ Exception -> 0x00b4 }
            r5 = 0
            int r4 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r4, (int) r5)     // Catch:{ Exception -> 0x00b4 }
            r3.f322746h0 = r4     // Catch:{ Exception -> 0x00b4 }
        L_0x09b2:
            java.lang.String r4 = ".deviceinfoconfig.voip.audio.waveAgcHeadsetGain"
            java.lang.Object r4 = r10.get(r4)     // Catch:{ Exception -> 0x1ce0 }
            if (r4 == 0) goto L_0x09c9
            java.lang.String r4 = ".deviceinfoconfig.voip.audio.waveAgcHeadsetGain"
            java.lang.Object r4 = r10.get(r4)     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ Exception -> 0x00b4 }
            r5 = 0
            int r4 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r4, (int) r5)     // Catch:{ Exception -> 0x00b4 }
            r3.f322748i0 = r4     // Catch:{ Exception -> 0x00b4 }
        L_0x09c9:
            java.lang.String r4 = ".deviceinfoconfig.voip.audio.waveAgcCRatio"
            java.lang.Object r4 = r10.get(r4)     // Catch:{ Exception -> 0x1ce0 }
            if (r4 == 0) goto L_0x09e0
            java.lang.String r4 = ".deviceinfoconfig.voip.audio.waveAgcCRatio"
            java.lang.Object r4 = r10.get(r4)     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ Exception -> 0x00b4 }
            r5 = 0
            int r4 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r4, (int) r5)     // Catch:{ Exception -> 0x00b4 }
            r3.f322752k0 = r4     // Catch:{ Exception -> 0x00b4 }
        L_0x09e0:
            java.lang.String r4 = ".deviceinfoconfig.voip.audio.waveAgcDnTHR"
            java.lang.Object r4 = r10.get(r4)     // Catch:{ Exception -> 0x1ce0 }
            if (r4 == 0) goto L_0x09f7
            java.lang.String r4 = ".deviceinfoconfig.voip.audio.waveAgcDnTHR"
            java.lang.Object r4 = r10.get(r4)     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ Exception -> 0x00b4 }
            r5 = 0
            int r4 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r4, (int) r5)     // Catch:{ Exception -> 0x00b4 }
            r3.f322754l0 = r4     // Catch:{ Exception -> 0x00b4 }
        L_0x09f7:
            java.lang.String r4 = ".deviceinfoconfig.voip.audio.waveAgcTarget"
            java.lang.Object r4 = r10.get(r4)     // Catch:{ Exception -> 0x1ce0 }
            if (r4 == 0) goto L_0x0a0e
            java.lang.String r4 = ".deviceinfoconfig.voip.audio.waveAgcTarget"
            java.lang.Object r4 = r10.get(r4)     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ Exception -> 0x00b4 }
            r5 = 0
            int r4 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r4, (int) r5)     // Catch:{ Exception -> 0x00b4 }
            r3.f322750j0 = r4     // Catch:{ Exception -> 0x00b4 }
        L_0x0a0e:
            java.lang.String r4 = ".deviceinfoconfig.voip.audio.waveAgcBase"
            java.lang.Object r4 = r10.get(r4)     // Catch:{ Exception -> 0x1ce0 }
            if (r4 == 0) goto L_0x0a25
            java.lang.String r4 = ".deviceinfoconfig.voip.audio.waveAgcBase"
            java.lang.Object r4 = r10.get(r4)     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ Exception -> 0x00b4 }
            r5 = 0
            int r4 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r4, (int) r5)     // Catch:{ Exception -> 0x00b4 }
            r3.f322756m0 = r4     // Catch:{ Exception -> 0x00b4 }
        L_0x0a25:
            java.lang.String r4 = ".deviceinfoconfig.voip.audio.waveAgcGainTHR"
            java.lang.Object r4 = r10.get(r4)     // Catch:{ Exception -> 0x1ce0 }
            if (r4 == 0) goto L_0x0a3c
            java.lang.String r4 = ".deviceinfoconfig.voip.audio.waveAgcGainTHR"
            java.lang.Object r4 = r10.get(r4)     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ Exception -> 0x00b4 }
            r5 = 0
            int r4 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r4, (int) r5)     // Catch:{ Exception -> 0x00b4 }
            r3.f322758n0 = r4     // Catch:{ Exception -> 0x00b4 }
        L_0x0a3c:
            java.lang.String r4 = ".deviceinfoconfig.voip.audio.waveAgcDampTHR"
            java.lang.Object r4 = r10.get(r4)     // Catch:{ Exception -> 0x1ce0 }
            if (r4 == 0) goto L_0x0a53
            java.lang.String r4 = ".deviceinfoconfig.voip.audio.waveAgcDampTHR"
            java.lang.Object r4 = r10.get(r4)     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ Exception -> 0x00b4 }
            r5 = 0
            int r4 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r4, (int) r5)     // Catch:{ Exception -> 0x00b4 }
            r3.f322760o0 = r4     // Catch:{ Exception -> 0x00b4 }
        L_0x0a53:
            java.lang.String r4 = ".deviceinfoconfig.voip.audio.waveAgcDamper"
            java.lang.Object r4 = r10.get(r4)     // Catch:{ Exception -> 0x1ce0 }
            if (r4 == 0) goto L_0x0a6a
            java.lang.String r4 = ".deviceinfoconfig.voip.audio.waveAgcDamper"
            java.lang.Object r4 = r10.get(r4)     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ Exception -> 0x00b4 }
            r5 = 0
            int r4 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r4, (int) r5)     // Catch:{ Exception -> 0x00b4 }
            r3.f322762p0 = r4     // Catch:{ Exception -> 0x00b4 }
        L_0x0a6a:
            java.lang.String r4 = ".deviceinfoconfig.voip.audio.inputvolumescale"
            java.lang.Object r4 = r10.get(r4)     // Catch:{ Exception -> 0x1ce0 }
            if (r4 == 0) goto L_0x0a81
            java.lang.String r4 = ".deviceinfoconfig.voip.audio.inputvolumescale"
            java.lang.Object r4 = r10.get(r4)     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ Exception -> 0x00b4 }
            r5 = 0
            int r4 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r4, (int) r5)     // Catch:{ Exception -> 0x00b4 }
            r3.f322757n = r4     // Catch:{ Exception -> 0x00b4 }
        L_0x0a81:
            java.lang.String r4 = ".deviceinfoconfig.voip.audio.outputvolumescale"
            java.lang.Object r4 = r10.get(r4)     // Catch:{ Exception -> 0x1ce0 }
            if (r4 == 0) goto L_0x0a98
            java.lang.String r4 = ".deviceinfoconfig.voip.audio.outputvolumescale"
            java.lang.Object r4 = r10.get(r4)     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ Exception -> 0x00b4 }
            r5 = 0
            int r4 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r4, (int) r5)     // Catch:{ Exception -> 0x00b4 }
            r3.f322759o = r4     // Catch:{ Exception -> 0x00b4 }
        L_0x0a98:
            java.lang.String r4 = ".deviceinfoconfig.voip.audio.inputvolumescaleforspeaker"
            java.lang.Object r4 = r10.get(r4)     // Catch:{ Exception -> 0x1ce0 }
            if (r4 == 0) goto L_0x0aaf
            java.lang.String r4 = ".deviceinfoconfig.voip.audio.inputvolumescaleforspeaker"
            java.lang.Object r4 = r10.get(r4)     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ Exception -> 0x00b4 }
            r5 = 0
            int r4 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r4, (int) r5)     // Catch:{ Exception -> 0x00b4 }
            r3.f322761p = r4     // Catch:{ Exception -> 0x00b4 }
        L_0x0aaf:
            java.lang.String r4 = ".deviceinfoconfig.voip.audio.outputvolumescaleforspeaker"
            java.lang.Object r4 = r10.get(r4)     // Catch:{ Exception -> 0x1ce0 }
            if (r4 == 0) goto L_0x0ac6
            java.lang.String r4 = ".deviceinfoconfig.voip.audio.outputvolumescaleforspeaker"
            java.lang.Object r4 = r10.get(r4)     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ Exception -> 0x00b4 }
            r5 = 0
            int r4 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r4, (int) r5)     // Catch:{ Exception -> 0x00b4 }
            r3.f322763q = r4     // Catch:{ Exception -> 0x00b4 }
        L_0x0ac6:
            java.lang.String r4 = ".deviceinfoconfig.voip.audio.ehanceheadsetec"
            java.lang.Object r4 = r10.get(r4)     // Catch:{ Exception -> 0x1ce0 }
            if (r4 == 0) goto L_0x0add
            java.lang.String r4 = ".deviceinfoconfig.voip.audio.ehanceheadsetec"
            java.lang.Object r4 = r10.get(r4)     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ Exception -> 0x00b4 }
            r5 = 0
            int r4 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r4, (int) r5)     // Catch:{ Exception -> 0x00b4 }
            r3.f322777x = r4     // Catch:{ Exception -> 0x00b4 }
        L_0x0add:
            java.lang.String r4 = ".deviceinfoconfig.voip.audio.setecmodelevelforheadset"
            java.lang.Object r4 = r10.get(r4)     // Catch:{ Exception -> 0x1ce0 }
            if (r4 == 0) goto L_0x0af4
            java.lang.String r4 = ".deviceinfoconfig.voip.audio.setecmodelevelforheadset"
            java.lang.Object r4 = r10.get(r4)     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ Exception -> 0x00b4 }
            r5 = 0
            int r4 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r4, (int) r5)     // Catch:{ Exception -> 0x00b4 }
            r3.f322779y = r4     // Catch:{ Exception -> 0x00b4 }
        L_0x0af4:
            java.lang.String r4 = ".deviceinfoconfig.voip.audio.setecmodelevelforspeaker"
            java.lang.Object r4 = r10.get(r4)     // Catch:{ Exception -> 0x1ce0 }
            if (r4 == 0) goto L_0x0b0b
            java.lang.String r4 = ".deviceinfoconfig.voip.audio.setecmodelevelforspeaker"
            java.lang.Object r4 = r10.get(r4)     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ Exception -> 0x00b4 }
            r5 = 0
            int r4 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r4, (int) r5)     // Catch:{ Exception -> 0x00b4 }
            r3.f322781z = r4     // Catch:{ Exception -> 0x00b4 }
        L_0x0b0b:
            java.lang.String r4 = ".deviceinfoconfig.voip.audio.enablespeakerenhanceec"
            java.lang.Object r4 = r10.get(r4)     // Catch:{ Exception -> 0x1ce0 }
            if (r4 == 0) goto L_0x0b22
            java.lang.String r4 = ".deviceinfoconfig.voip.audio.enablespeakerenhanceec"
            java.lang.Object r4 = r10.get(r4)     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ Exception -> 0x00b4 }
            r5 = 0
            int r4 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r4, (int) r5)     // Catch:{ Exception -> 0x00b4 }
            r3.f322678A = r4     // Catch:{ Exception -> 0x00b4 }
        L_0x0b22:
            java.lang.String r4 = ".deviceinfoconfig.voip.audio.enablerectimer"
            java.lang.Object r4 = r10.get(r4)     // Catch:{ Exception -> 0x1ce0 }
            if (r4 == 0) goto L_0x0b39
            java.lang.String r4 = ".deviceinfoconfig.voip.audio.enablerectimer"
            java.lang.Object r4 = r10.get(r4)     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ Exception -> 0x00b4 }
            r5 = 0
            int r4 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r4, (int) r5)     // Catch:{ Exception -> 0x00b4 }
            r3.f322764q0 = r4     // Catch:{ Exception -> 0x00b4 }
        L_0x0b39:
            java.lang.String r4 = ".deviceinfoconfig.voip.audio.enablePlayTimer"
            java.lang.Object r4 = r10.get(r4)     // Catch:{ Exception -> 0x1ce0 }
            if (r4 == 0) goto L_0x0b50
            java.lang.String r4 = ".deviceinfoconfig.voip.audio.enablePlayTimer"
            java.lang.Object r4 = r10.get(r4)     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ Exception -> 0x00b4 }
            r5 = 0
            int r4 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r4, (int) r5)     // Catch:{ Exception -> 0x00b4 }
            r3.f322766r0 = r4     // Catch:{ Exception -> 0x00b4 }
        L_0x0b50:
            java.lang.String r4 = ".deviceinfoconfig.voip.audio.correctcof.cof0"
            java.lang.Object r4 = r10.get(r4)     // Catch:{ Exception -> 0x1ce0 }
            if (r4 == 0) goto L_0x0b6d
            short[] r4 = r3.f322770t0     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r5 = ".deviceinfoconfig.voip.audio.correctcof.cof0"
            java.lang.Object r5 = r10.get(r5)     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ Exception -> 0x00b4 }
            r6 = 0
            int r5 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r5, (int) r6)     // Catch:{ Exception -> 0x00b4 }
            short r5 = (short) r5     // Catch:{ Exception -> 0x00b4 }
            r4[r6] = r5     // Catch:{ Exception -> 0x00b4 }
            r4 = 1
            r3.f322768s0 = r4     // Catch:{ Exception -> 0x00b4 }
        L_0x0b6d:
            java.lang.String r4 = ".deviceinfoconfig.voip.audio.correctcof.cof1"
            java.lang.Object r4 = r10.get(r4)     // Catch:{ Exception -> 0x1ce0 }
            if (r4 == 0) goto L_0x0b8a
            short[] r4 = r3.f322770t0     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r5 = ".deviceinfoconfig.voip.audio.correctcof.cof1"
            java.lang.Object r5 = r10.get(r5)     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ Exception -> 0x00b4 }
            r6 = 0
            int r5 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r5, (int) r6)     // Catch:{ Exception -> 0x00b4 }
            short r5 = (short) r5     // Catch:{ Exception -> 0x00b4 }
            r6 = 1
            r4[r6] = r5     // Catch:{ Exception -> 0x00b4 }
            r3.f322768s0 = r6     // Catch:{ Exception -> 0x00b4 }
        L_0x0b8a:
            java.lang.String r4 = ".deviceinfoconfig.voip.audio.correctcof.cof2"
            java.lang.Object r4 = r10.get(r4)     // Catch:{ Exception -> 0x1ce0 }
            if (r4 == 0) goto L_0x0ba8
            short[] r4 = r3.f322770t0     // Catch:{ Exception -> 0x00b4 }
            r5 = 2
            java.lang.String r6 = ".deviceinfoconfig.voip.audio.correctcof.cof2"
            java.lang.Object r6 = r10.get(r6)     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ Exception -> 0x00b4 }
            r7 = 0
            int r6 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r6, (int) r7)     // Catch:{ Exception -> 0x00b4 }
            short r6 = (short) r6     // Catch:{ Exception -> 0x00b4 }
            r4[r5] = r6     // Catch:{ Exception -> 0x00b4 }
            r4 = 1
            r3.f322768s0 = r4     // Catch:{ Exception -> 0x00b4 }
        L_0x0ba8:
            java.lang.String r4 = ".deviceinfoconfig.voip.audio.correctcof.cof3"
            java.lang.Object r4 = r10.get(r4)     // Catch:{ Exception -> 0x1ce0 }
            if (r4 == 0) goto L_0x0bc6
            short[] r4 = r3.f322770t0     // Catch:{ Exception -> 0x00b4 }
            r5 = 3
            java.lang.String r6 = ".deviceinfoconfig.voip.audio.correctcof.cof3"
            java.lang.Object r6 = r10.get(r6)     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ Exception -> 0x00b4 }
            r7 = 0
            int r6 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r6, (int) r7)     // Catch:{ Exception -> 0x00b4 }
            short r6 = (short) r6     // Catch:{ Exception -> 0x00b4 }
            r4[r5] = r6     // Catch:{ Exception -> 0x00b4 }
            r4 = 1
            r3.f322768s0 = r4     // Catch:{ Exception -> 0x00b4 }
        L_0x0bc6:
            java.lang.String r4 = ".deviceinfoconfig.voip.audio.correctcof.cof4"
            java.lang.Object r4 = r10.get(r4)     // Catch:{ Exception -> 0x1ce0 }
            if (r4 == 0) goto L_0x0be4
            short[] r4 = r3.f322770t0     // Catch:{ Exception -> 0x00b4 }
            r5 = 4
            java.lang.String r6 = ".deviceinfoconfig.voip.audio.correctcof.cof4"
            java.lang.Object r6 = r10.get(r6)     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ Exception -> 0x00b4 }
            r7 = 0
            int r6 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r6, (int) r7)     // Catch:{ Exception -> 0x00b4 }
            short r6 = (short) r6     // Catch:{ Exception -> 0x00b4 }
            r4[r5] = r6     // Catch:{ Exception -> 0x00b4 }
            r4 = 1
            r3.f322768s0 = r4     // Catch:{ Exception -> 0x00b4 }
        L_0x0be4:
            java.lang.String r4 = ".deviceinfoconfig.voip.audio.correctcof.cof5"
            java.lang.Object r4 = r10.get(r4)     // Catch:{ Exception -> 0x1ce0 }
            if (r4 == 0) goto L_0x0c02
            short[] r4 = r3.f322770t0     // Catch:{ Exception -> 0x00b4 }
            r5 = 5
            java.lang.String r6 = ".deviceinfoconfig.voip.audio.correctcof.cof5"
            java.lang.Object r6 = r10.get(r6)     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ Exception -> 0x00b4 }
            r7 = 0
            int r6 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r6, (int) r7)     // Catch:{ Exception -> 0x00b4 }
            short r6 = (short) r6     // Catch:{ Exception -> 0x00b4 }
            r4[r5] = r6     // Catch:{ Exception -> 0x00b4 }
            r4 = 1
            r3.f322768s0 = r4     // Catch:{ Exception -> 0x00b4 }
        L_0x0c02:
            java.lang.String r4 = ".deviceinfoconfig.voip.audio.correctcof.cof6"
            java.lang.Object r4 = r10.get(r4)     // Catch:{ Exception -> 0x1ce0 }
            if (r4 == 0) goto L_0x0c20
            short[] r4 = r3.f322770t0     // Catch:{ Exception -> 0x00b4 }
            r5 = 6
            java.lang.String r6 = ".deviceinfoconfig.voip.audio.correctcof.cof6"
            java.lang.Object r6 = r10.get(r6)     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ Exception -> 0x00b4 }
            r7 = 0
            int r6 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r6, (int) r7)     // Catch:{ Exception -> 0x00b4 }
            short r6 = (short) r6     // Catch:{ Exception -> 0x00b4 }
            r4[r5] = r6     // Catch:{ Exception -> 0x00b4 }
            r4 = 1
            r3.f322768s0 = r4     // Catch:{ Exception -> 0x00b4 }
        L_0x0c20:
            java.lang.String r4 = ".deviceinfoconfig.voip.audio.correctcof.cof7"
            java.lang.Object r4 = r10.get(r4)     // Catch:{ Exception -> 0x1ce0 }
            if (r4 == 0) goto L_0x0c3e
            short[] r4 = r3.f322770t0     // Catch:{ Exception -> 0x00b4 }
            r5 = 7
            java.lang.String r6 = ".deviceinfoconfig.voip.audio.correctcof.cof7"
            java.lang.Object r6 = r10.get(r6)     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ Exception -> 0x00b4 }
            r7 = 0
            int r6 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r6, (int) r7)     // Catch:{ Exception -> 0x00b4 }
            short r6 = (short) r6     // Catch:{ Exception -> 0x00b4 }
            r4[r5] = r6     // Catch:{ Exception -> 0x00b4 }
            r4 = 1
            r3.f322768s0 = r4     // Catch:{ Exception -> 0x00b4 }
        L_0x0c3e:
            java.lang.String r4 = ".deviceinfoconfig.voip.audio.correctcof.cof8"
            java.lang.Object r4 = r10.get(r4)     // Catch:{ Exception -> 0x1ce0 }
            if (r4 == 0) goto L_0x0c5d
            short[] r4 = r3.f322770t0     // Catch:{ Exception -> 0x00b4 }
            r5 = 8
            java.lang.String r6 = ".deviceinfoconfig.voip.audio.correctcof.cof8"
            java.lang.Object r6 = r10.get(r6)     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ Exception -> 0x00b4 }
            r7 = 0
            int r6 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r6, (int) r7)     // Catch:{ Exception -> 0x00b4 }
            short r6 = (short) r6     // Catch:{ Exception -> 0x00b4 }
            r4[r5] = r6     // Catch:{ Exception -> 0x00b4 }
            r4 = 1
            r3.f322768s0 = r4     // Catch:{ Exception -> 0x00b4 }
        L_0x0c5d:
            java.lang.String r4 = ".deviceinfoconfig.voip.audio.correctcof.cof9"
            java.lang.Object r4 = r10.get(r4)     // Catch:{ Exception -> 0x1ce0 }
            if (r4 == 0) goto L_0x0c7c
            short[] r4 = r3.f322770t0     // Catch:{ Exception -> 0x00b4 }
            r5 = 9
            java.lang.String r6 = ".deviceinfoconfig.voip.audio.correctcof.cof9"
            java.lang.Object r6 = r10.get(r6)     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ Exception -> 0x00b4 }
            r7 = 0
            int r6 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r6, (int) r7)     // Catch:{ Exception -> 0x00b4 }
            short r6 = (short) r6     // Catch:{ Exception -> 0x00b4 }
            r4[r5] = r6     // Catch:{ Exception -> 0x00b4 }
            r4 = 1
            r3.f322768s0 = r4     // Catch:{ Exception -> 0x00b4 }
        L_0x0c7c:
            java.lang.String r4 = ".deviceinfoconfig.voip.audio.correctcof.cof10"
            java.lang.Object r4 = r10.get(r4)     // Catch:{ Exception -> 0x1ce0 }
            if (r4 == 0) goto L_0x0c9b
            short[] r4 = r3.f322770t0     // Catch:{ Exception -> 0x00b4 }
            r5 = 10
            java.lang.String r6 = ".deviceinfoconfig.voip.audio.correctcof.cof10"
            java.lang.Object r6 = r10.get(r6)     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ Exception -> 0x00b4 }
            r7 = 0
            int r6 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r6, (int) r7)     // Catch:{ Exception -> 0x00b4 }
            short r6 = (short) r6     // Catch:{ Exception -> 0x00b4 }
            r4[r5] = r6     // Catch:{ Exception -> 0x00b4 }
            r4 = 1
            r3.f322768s0 = r4     // Catch:{ Exception -> 0x00b4 }
        L_0x0c9b:
            java.lang.String r4 = ".deviceinfoconfig.voip.audio.correctcof.cof11"
            java.lang.Object r4 = r10.get(r4)     // Catch:{ Exception -> 0x1ce0 }
            r5 = 11
            if (r4 == 0) goto L_0x0cba
            short[] r4 = r3.f322770t0     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r6 = ".deviceinfoconfig.voip.audio.correctcof.cof11"
            java.lang.Object r6 = r10.get(r6)     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ Exception -> 0x00b4 }
            r7 = 0
            int r6 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r6, (int) r7)     // Catch:{ Exception -> 0x00b4 }
            short r6 = (short) r6     // Catch:{ Exception -> 0x00b4 }
            r4[r5] = r6     // Catch:{ Exception -> 0x00b4 }
            r4 = 1
            r3.f322768s0 = r4     // Catch:{ Exception -> 0x00b4 }
        L_0x0cba:
            java.lang.String r4 = ".deviceinfoconfig.voip.audio.correctcof.cof12"
            java.lang.Object r4 = r10.get(r4)     // Catch:{ Exception -> 0x1ce0 }
            if (r4 == 0) goto L_0x0cd9
            short[] r4 = r3.f322770t0     // Catch:{ Exception -> 0x00b4 }
            r6 = 12
            java.lang.String r7 = ".deviceinfoconfig.voip.audio.correctcof.cof12"
            java.lang.Object r7 = r10.get(r7)     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ Exception -> 0x00b4 }
            r8 = 0
            int r7 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r7, (int) r8)     // Catch:{ Exception -> 0x00b4 }
            short r7 = (short) r7     // Catch:{ Exception -> 0x00b4 }
            r4[r6] = r7     // Catch:{ Exception -> 0x00b4 }
            r4 = 1
            r3.f322768s0 = r4     // Catch:{ Exception -> 0x00b4 }
        L_0x0cd9:
            java.lang.String r4 = ".deviceinfoconfig.voip.audio.correctcof.cof13"
            java.lang.Object r4 = r10.get(r4)     // Catch:{ Exception -> 0x1ce0 }
            if (r4 == 0) goto L_0x0cf8
            short[] r4 = r3.f322770t0     // Catch:{ Exception -> 0x00b4 }
            r6 = 13
            java.lang.String r7 = ".deviceinfoconfig.voip.audio.correctcof.cof13"
            java.lang.Object r7 = r10.get(r7)     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ Exception -> 0x00b4 }
            r8 = 0
            int r7 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r7, (int) r8)     // Catch:{ Exception -> 0x00b4 }
            short r7 = (short) r7     // Catch:{ Exception -> 0x00b4 }
            r4[r6] = r7     // Catch:{ Exception -> 0x00b4 }
            r4 = 1
            r3.f322768s0 = r4     // Catch:{ Exception -> 0x00b4 }
        L_0x0cf8:
            java.lang.String r4 = ".deviceinfoconfig.voip.audio.correctcof.cof14"
            java.lang.Object r4 = r10.get(r4)     // Catch:{ Exception -> 0x1ce0 }
            if (r4 == 0) goto L_0x0d17
            short[] r4 = r3.f322770t0     // Catch:{ Exception -> 0x00b4 }
            r6 = 14
            java.lang.String r7 = ".deviceinfoconfig.voip.audio.correctcof.cof14"
            java.lang.Object r7 = r10.get(r7)     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ Exception -> 0x00b4 }
            r8 = 0
            int r7 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r7, (int) r8)     // Catch:{ Exception -> 0x00b4 }
            short r7 = (short) r7     // Catch:{ Exception -> 0x00b4 }
            r4[r6] = r7     // Catch:{ Exception -> 0x00b4 }
            r4 = 1
            r3.f322768s0 = r4     // Catch:{ Exception -> 0x00b4 }
        L_0x0d17:
            java.lang.String r4 = ".deviceinfoconfig.voip.audio.correctoff"
            java.lang.Object r4 = r10.get(r4)     // Catch:{ Exception -> 0x1ce0 }
            if (r4 == 0) goto L_0x0d31
            java.lang.String r4 = ".deviceinfoconfig.voip.audio.correctoff"
            java.lang.Object r4 = r10.get(r4)     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ Exception -> 0x00b4 }
            r6 = 0
            int r4 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r4, (int) r6)     // Catch:{ Exception -> 0x00b4 }
            r7 = 1
            if (r4 != r7) goto L_0x0d31
            r3.f322768s0 = r6     // Catch:{ Exception -> 0x00b4 }
        L_0x0d31:
            java.lang.String r4 = ".deviceinfoconfig.voip.audio.outputvolumegainforphone"
            java.lang.Object r4 = r10.get(r4)     // Catch:{ Exception -> 0x1ce0 }
            if (r4 == 0) goto L_0x0d48
            java.lang.String r4 = ".deviceinfoconfig.voip.audio.outputvolumegainforphone"
            java.lang.Object r4 = r10.get(r4)     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ Exception -> 0x00b4 }
            r6 = 0
            int r4 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r4, (int) r6)     // Catch:{ Exception -> 0x00b4 }
            r3.f322765r = r4     // Catch:{ Exception -> 0x00b4 }
        L_0x0d48:
            java.lang.String r4 = ".deviceinfoconfig.voip.audio.outputvolumegainforspeaker"
            java.lang.Object r4 = r10.get(r4)     // Catch:{ Exception -> 0x1ce0 }
            if (r4 == 0) goto L_0x0d5f
            java.lang.String r4 = ".deviceinfoconfig.voip.audio.outputvolumegainforspeaker"
            java.lang.Object r4 = r10.get(r4)     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ Exception -> 0x00b4 }
            r6 = 0
            int r4 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r4, (int) r6)     // Catch:{ Exception -> 0x00b4 }
            r3.f322767s = r4     // Catch:{ Exception -> 0x00b4 }
        L_0x0d5f:
            java.lang.String r4 = ".deviceinfoconfig.voip.audio.noisegatestrength.cof0"
            java.lang.Object r4 = r10.get(r4)     // Catch:{ Exception -> 0x1ce0 }
            if (r4 == 0) goto L_0x0d79
            short[] r4 = r3.f322772u0     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r6 = ".deviceinfoconfig.voip.audio.noisegatestrength.cof0"
            java.lang.Object r6 = r10.get(r6)     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ Exception -> 0x00b4 }
            r7 = 0
            int r6 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r6, (int) r7)     // Catch:{ Exception -> 0x00b4 }
            short r6 = (short) r6     // Catch:{ Exception -> 0x00b4 }
            r4[r7] = r6     // Catch:{ Exception -> 0x00b4 }
        L_0x0d79:
            java.lang.String r4 = ".deviceinfoconfig.voip.audio.noisegatestrength.cof1"
            java.lang.Object r4 = r10.get(r4)     // Catch:{ Exception -> 0x1ce0 }
            if (r4 == 0) goto L_0x0d94
            short[] r4 = r3.f322772u0     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r6 = ".deviceinfoconfig.voip.audio.noisegatestrength.cof1"
            java.lang.Object r6 = r10.get(r6)     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ Exception -> 0x00b4 }
            r7 = 0
            int r6 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r6, (int) r7)     // Catch:{ Exception -> 0x00b4 }
            short r6 = (short) r6     // Catch:{ Exception -> 0x00b4 }
            r7 = 1
            r4[r7] = r6     // Catch:{ Exception -> 0x00b4 }
        L_0x0d94:
            java.lang.String r4 = ".deviceinfoconfig.voip.audio.agcrxflag"
            java.lang.Object r4 = r10.get(r4)     // Catch:{ Exception -> 0x1ce0 }
            if (r4 == 0) goto L_0x0dab
            java.lang.String r4 = ".deviceinfoconfig.voip.audio.agcrxflag"
            java.lang.Object r4 = r10.get(r4)     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ Exception -> 0x00b4 }
            r6 = 0
            int r4 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r4, (int) r6)     // Catch:{ Exception -> 0x00b4 }
            r3.f322685D0 = r4     // Catch:{ Exception -> 0x00b4 }
        L_0x0dab:
            java.lang.String r4 = ".deviceinfoconfig.voip.audio.agcrxtargetdb"
            java.lang.Object r4 = r10.get(r4)     // Catch:{ Exception -> 0x1ce0 }
            if (r4 == 0) goto L_0x0dc2
            java.lang.String r4 = ".deviceinfoconfig.voip.audio.agcrxtargetdb"
            java.lang.Object r4 = r10.get(r4)     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ Exception -> 0x00b4 }
            r6 = 0
            int r4 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r4, (int) r6)     // Catch:{ Exception -> 0x00b4 }
            r3.f322687E0 = r4     // Catch:{ Exception -> 0x00b4 }
        L_0x0dc2:
            java.lang.String r4 = ".deviceinfoconfig.voip.audio.agcrxgaindb"
            java.lang.Object r4 = r10.get(r4)     // Catch:{ Exception -> 0x1ce0 }
            if (r4 == 0) goto L_0x0dd9
            java.lang.String r4 = ".deviceinfoconfig.voip.audio.agcrxgaindb"
            java.lang.Object r4 = r10.get(r4)     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ Exception -> 0x00b4 }
            r6 = 0
            int r4 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r4, (int) r6)     // Catch:{ Exception -> 0x00b4 }
            r3.f322689F0 = r4     // Catch:{ Exception -> 0x00b4 }
        L_0x0dd9:
            java.lang.String r4 = ".deviceinfoconfig.voip.audio.agcrxlimiter"
            java.lang.Object r4 = r10.get(r4)     // Catch:{ Exception -> 0x1ce0 }
            if (r4 == 0) goto L_0x0df0
            java.lang.String r4 = ".deviceinfoconfig.voip.audio.agcrxlimiter"
            java.lang.Object r4 = r10.get(r4)     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ Exception -> 0x00b4 }
            r6 = 0
            int r4 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r4, (int) r6)     // Catch:{ Exception -> 0x00b4 }
            r3.f322691G0 = r4     // Catch:{ Exception -> 0x00b4 }
        L_0x0df0:
            java.lang.String r4 = ".deviceinfoconfig.voip.audio.spkecenable"
            java.lang.Object r4 = r10.get(r4)     // Catch:{ Exception -> 0x1ce0 }
            if (r4 == 0) goto L_0x0e07
            java.lang.String r4 = ".deviceinfoconfig.voip.audio.spkecenable"
            java.lang.Object r4 = r10.get(r4)     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ Exception -> 0x00b4 }
            r6 = 0
            int r4 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r4, (int) r6)     // Catch:{ Exception -> 0x00b4 }
            r3.f322774v0 = r4     // Catch:{ Exception -> 0x00b4 }
        L_0x0e07:
            java.lang.String r4 = ".deviceinfoconfig.voip.audio.enableXnoiseSup"
            java.lang.Object r4 = r10.get(r4)     // Catch:{ Exception -> 0x1ce0 }
            if (r4 == 0) goto L_0x0e1e
            java.lang.String r4 = ".deviceinfoconfig.voip.audio.enableXnoiseSup"
            java.lang.Object r4 = r10.get(r4)     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ Exception -> 0x00b4 }
            r6 = 0
            int r4 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r4, (int) r6)     // Catch:{ Exception -> 0x00b4 }
            r3.f322680B = r4     // Catch:{ Exception -> 0x00b4 }
        L_0x0e1e:
            java.lang.Object r4 = r10.get(r2)     // Catch:{ Exception -> 0x1ce0 }
            if (r4 == 0) goto L_0x0e31
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x00b4 }
            r4 = 0
            int r2 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r2, (int) r4)     // Catch:{ Exception -> 0x00b4 }
            r3.f322749j = r2     // Catch:{ Exception -> 0x00b4 }
        L_0x0e31:
            java.lang.String r2 = ".deviceinfoconfig.voip.audio.mt3dFlag"
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x1ce0 }
            r4 = -1
            if (r2 == 0) goto L_0x0e48
            java.lang.String r2 = ".deviceinfoconfig.voip.audio.mt3dFlag"
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x00b4 }
            int r2 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r2, (int) r4)     // Catch:{ Exception -> 0x00b4 }
            r3.f322693H0 = r2     // Catch:{ Exception -> 0x00b4 }
        L_0x0e48:
            java.lang.String r2 = ".deviceinfoconfig.voip.audio.mt3dAzim1"
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x1ce0 }
            if (r2 == 0) goto L_0x0e5e
            java.lang.String r2 = ".deviceinfoconfig.voip.audio.mt3dAzim1"
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x00b4 }
            int r2 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r2, (int) r4)     // Catch:{ Exception -> 0x00b4 }
            r3.f322695I0 = r2     // Catch:{ Exception -> 0x00b4 }
        L_0x0e5e:
            java.lang.String r2 = ".deviceinfoconfig.voip.audio.mt3dAzim2"
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x1ce0 }
            if (r2 == 0) goto L_0x0e74
            java.lang.String r2 = ".deviceinfoconfig.voip.audio.mt3dAzim2"
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x00b4 }
            int r2 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r2, (int) r4)     // Catch:{ Exception -> 0x00b4 }
            r3.f322697J0 = r2     // Catch:{ Exception -> 0x00b4 }
        L_0x0e74:
            java.lang.String r2 = ".deviceinfoconfig.voip.audio.mt3dAzim3"
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x1ce0 }
            if (r2 == 0) goto L_0x0e8a
            java.lang.String r2 = ".deviceinfoconfig.voip.audio.mt3dAzim3"
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x00b4 }
            int r2 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r2, (int) r4)     // Catch:{ Exception -> 0x00b4 }
            r3.f322699K0 = r2     // Catch:{ Exception -> 0x00b4 }
        L_0x0e8a:
            java.lang.String r2 = ".deviceinfoconfig.voip.audio.mt3dAzim4"
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x1ce0 }
            if (r2 == 0) goto L_0x0ea0
            java.lang.String r2 = ".deviceinfoconfig.voip.audio.mt3dAzim4"
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x00b4 }
            int r2 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r2, (int) r4)     // Catch:{ Exception -> 0x00b4 }
            r3.f322701L0 = r2     // Catch:{ Exception -> 0x00b4 }
        L_0x0ea0:
            java.lang.String r2 = ".deviceinfoconfig.voip.audio.mt3dAzim5"
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x1ce0 }
            if (r2 == 0) goto L_0x0eb6
            java.lang.String r2 = ".deviceinfoconfig.voip.audio.mt3dAzim5"
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x00b4 }
            int r2 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r2, (int) r4)     // Catch:{ Exception -> 0x00b4 }
            r3.f322703M0 = r2     // Catch:{ Exception -> 0x00b4 }
        L_0x0eb6:
            java.lang.String r2 = ".deviceinfoconfig.voip.audio.mt3dAzim6"
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x1ce0 }
            if (r2 == 0) goto L_0x0ecc
            java.lang.String r2 = ".deviceinfoconfig.voip.audio.mt3dAzim6"
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x00b4 }
            int r2 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r2, (int) r4)     // Catch:{ Exception -> 0x00b4 }
            r3.f322705N0 = r2     // Catch:{ Exception -> 0x00b4 }
        L_0x0ecc:
            java.lang.String r2 = ".deviceinfoconfig.voip.audio.mt3dAzim7"
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x1ce0 }
            if (r2 == 0) goto L_0x0ee2
            java.lang.String r2 = ".deviceinfoconfig.voip.audio.mt3dAzim7"
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x00b4 }
            int r2 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r2, (int) r4)     // Catch:{ Exception -> 0x00b4 }
            r3.f322707O0 = r2     // Catch:{ Exception -> 0x00b4 }
        L_0x0ee2:
            java.lang.String r2 = ".deviceinfoconfig.voip.audio.mt3dAzim8"
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x1ce0 }
            if (r2 == 0) goto L_0x0ef8
            java.lang.String r2 = ".deviceinfoconfig.voip.audio.mt3dAzim8"
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x00b4 }
            int r2 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r2, (int) r4)     // Catch:{ Exception -> 0x00b4 }
            r3.f322709P0 = r2     // Catch:{ Exception -> 0x00b4 }
        L_0x0ef8:
            java.lang.String r2 = ".deviceinfoconfig.voip.audio.mt3dElvl1"
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x1ce0 }
            if (r2 == 0) goto L_0x0f0e
            java.lang.String r2 = ".deviceinfoconfig.voip.audio.mt3dElvl1"
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x00b4 }
            int r2 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r2, (int) r4)     // Catch:{ Exception -> 0x00b4 }
            r3.f322711Q0 = r2     // Catch:{ Exception -> 0x00b4 }
        L_0x0f0e:
            java.lang.String r2 = ".deviceinfoconfig.voip.audio.mt3dElvl2"
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x1ce0 }
            if (r2 == 0) goto L_0x0f24
            java.lang.String r2 = ".deviceinfoconfig.voip.audio.mt3dElvl2"
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x00b4 }
            int r2 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r2, (int) r4)     // Catch:{ Exception -> 0x00b4 }
            r3.f322713R0 = r2     // Catch:{ Exception -> 0x00b4 }
        L_0x0f24:
            java.lang.String r2 = ".deviceinfoconfig.voip.audio.mt3dElvl3"
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x1ce0 }
            if (r2 == 0) goto L_0x0f3a
            java.lang.String r2 = ".deviceinfoconfig.voip.audio.mt3dElvl3"
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x00b4 }
            int r2 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r2, (int) r4)     // Catch:{ Exception -> 0x00b4 }
            r3.f322715S0 = r2     // Catch:{ Exception -> 0x00b4 }
        L_0x0f3a:
            java.lang.String r2 = ".deviceinfoconfig.voip.audio.mt3dElvl4"
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x1ce0 }
            if (r2 == 0) goto L_0x0f50
            java.lang.String r2 = ".deviceinfoconfig.voip.audio.mt3dElvl4"
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x00b4 }
            int r2 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r2, (int) r4)     // Catch:{ Exception -> 0x00b4 }
            r3.f322717T0 = r2     // Catch:{ Exception -> 0x00b4 }
        L_0x0f50:
            java.lang.String r2 = ".deviceinfoconfig.voip.audio.mt3dElvl5"
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x1ce0 }
            if (r2 == 0) goto L_0x0f66
            java.lang.String r2 = ".deviceinfoconfig.voip.audio.mt3dElvl5"
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x00b4 }
            int r2 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r2, (int) r4)     // Catch:{ Exception -> 0x00b4 }
            r3.f322719U0 = r2     // Catch:{ Exception -> 0x00b4 }
        L_0x0f66:
            java.lang.String r2 = ".deviceinfoconfig.voip.audio.mt3dElvl6"
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x1ce0 }
            if (r2 == 0) goto L_0x0f7c
            java.lang.String r2 = ".deviceinfoconfig.voip.audio.mt3dElvl6"
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x00b4 }
            int r2 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r2, (int) r4)     // Catch:{ Exception -> 0x00b4 }
            r3.f322721V0 = r2     // Catch:{ Exception -> 0x00b4 }
        L_0x0f7c:
            java.lang.String r2 = ".deviceinfoconfig.voip.audio.mt3dElvl7"
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x1ce0 }
            if (r2 == 0) goto L_0x0f92
            java.lang.String r2 = ".deviceinfoconfig.voip.audio.mt3dElvl7"
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x00b4 }
            int r2 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r2, (int) r4)     // Catch:{ Exception -> 0x00b4 }
            r3.f322723W0 = r2     // Catch:{ Exception -> 0x00b4 }
        L_0x0f92:
            java.lang.String r2 = ".deviceinfoconfig.voip.audio.mt3dElvl8"
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x1ce0 }
            if (r2 == 0) goto L_0x0fa8
            java.lang.String r2 = ".deviceinfoconfig.voip.audio.mt3dElvl8"
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x00b4 }
            int r2 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r2, (int) r4)     // Catch:{ Exception -> 0x00b4 }
            r3.f322725X0 = r2     // Catch:{ Exception -> 0x00b4 }
        L_0x0fa8:
            java.lang.String r2 = ".deviceinfoconfig.voip.audio.forbiddenUseSco"
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x1ce0 }
            if (r2 == 0) goto L_0x0fbe
            java.lang.String r2 = ".deviceinfoconfig.voip.audio.forbidSco"
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x00b4 }
            int r2 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r2, (int) r4)     // Catch:{ Exception -> 0x00b4 }
            r3.f322769t = r2     // Catch:{ Exception -> 0x00b4 }
        L_0x0fbe:
            java.lang.String r2 = ".deviceinfoconfig.voip.audio.audioForbiddenStrategy"
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x1ce0 }
            if (r2 == 0) goto L_0x0fd4
            java.lang.String r2 = ".deviceinfoconfig.voip.audio.audioForbiddenStrategy"
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x00b4 }
            int r2 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r2, (int) r4)     // Catch:{ Exception -> 0x00b4 }
            r3.f322771u = r2     // Catch:{ Exception -> 0x00b4 }
        L_0x0fd4:
            java.lang.String r2 = ".deviceinfoconfig.voip.audio.audioForbiddenRefreshTime"
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x1ce0 }
            if (r2 == 0) goto L_0x0fea
            java.lang.String r2 = ".deviceinfoconfig.voip.audio.audioForbiddenRefreshTime"
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x00b4 }
            int r2 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r2, (int) r4)     // Catch:{ Exception -> 0x00b4 }
            r3.f322773v = r2     // Catch:{ Exception -> 0x00b4 }
        L_0x0fea:
            java.lang.String r2 = ".deviceinfoconfig.voip.audio.audioForbiddenRequestTimes"
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x1ce0 }
            if (r2 == 0) goto L_0x1000
            java.lang.String r2 = ".deviceinfoconfig.voip.audio.audioForbiddenRequestTimes"
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x00b4 }
            int r2 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r2, (int) r4)     // Catch:{ Exception -> 0x00b4 }
            r3.f322775w = r2     // Catch:{ Exception -> 0x00b4 }
        L_0x1000:
            java.lang.String r2 = ".deviceinfoconfig.voip.audio.mt3dPhi"
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x1ce0 }
            if (r2 == 0) goto L_0x1016
            java.lang.String r2 = ".deviceinfoconfig.voip.audio.mt3dPhi"
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x00b4 }
            int r2 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r2, (int) r4)     // Catch:{ Exception -> 0x00b4 }
            r3.f322727Y0 = r2     // Catch:{ Exception -> 0x00b4 }
        L_0x1016:
            java.lang.String r2 = ".deviceinfoconfig.voip.audio.mt3dTheta1"
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x1ce0 }
            if (r2 == 0) goto L_0x102c
            java.lang.String r2 = ".deviceinfoconfig.voip.audio.mt3dTheta1"
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x00b4 }
            int r2 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r2, (int) r4)     // Catch:{ Exception -> 0x00b4 }
            r3.f322729Z0 = r2     // Catch:{ Exception -> 0x00b4 }
        L_0x102c:
            java.lang.String r2 = ".deviceinfoconfig.voip.audio.mt3dTheta2"
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x1ce0 }
            if (r2 == 0) goto L_0x1042
            java.lang.String r2 = ".deviceinfoconfig.voip.audio.mt3dTheta2"
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x00b4 }
            int r2 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r2, (int) r4)     // Catch:{ Exception -> 0x00b4 }
            r3.f322732a1 = r2     // Catch:{ Exception -> 0x00b4 }
        L_0x1042:
            java.lang.String r2 = ".deviceinfoconfig.voip.ipcall.speakermode"
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x1ce0 }
            if (r2 == 0) goto L_0x105c
            java.lang.String r2 = ".deviceinfoconfig.voip.ipcall.speakermode"
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x00b4 }
            r6 = 0
            int r2 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r2, (int) r6)     // Catch:{ Exception -> 0x00b4 }
            r3.f322778x0 = r2     // Catch:{ Exception -> 0x00b4 }
            r2 = 1
            r3.f322776w0 = r2     // Catch:{ Exception -> 0x00b4 }
        L_0x105c:
            java.lang.String r2 = ".deviceinfoconfig.voip.ipcall.phonemode"
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x1ce0 }
            if (r2 == 0) goto L_0x1076
            java.lang.String r2 = ".deviceinfoconfig.voip.ipcall.phonemode"
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x00b4 }
            r6 = 0
            int r2 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r2, (int) r6)     // Catch:{ Exception -> 0x00b4 }
            r3.f322780y0 = r2     // Catch:{ Exception -> 0x00b4 }
            r2 = 1
            r3.f322776w0 = r2     // Catch:{ Exception -> 0x00b4 }
        L_0x1076:
            java.lang.String r2 = ".deviceinfoconfig.voip.ipcall.sourcemode"
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x1ce0 }
            if (r2 == 0) goto L_0x1090
            java.lang.String r2 = ".deviceinfoconfig.voip.ipcall.sourcemode"
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x00b4 }
            r6 = 0
            int r2 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r2, (int) r6)     // Catch:{ Exception -> 0x00b4 }
            r3.f322782z0 = r2     // Catch:{ Exception -> 0x00b4 }
            r2 = 1
            r3.f322776w0 = r2     // Catch:{ Exception -> 0x00b4 }
        L_0x1090:
            java.lang.String r2 = ".deviceinfoconfig.voip.ipcall.streamtype"
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x1ce0 }
            if (r2 == 0) goto L_0x10aa
            java.lang.String r2 = ".deviceinfoconfig.voip.ipcall.streamtype"
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x00b4 }
            r6 = 0
            int r2 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r2, (int) r6)     // Catch:{ Exception -> 0x00b4 }
            r3.f322679A0 = r2     // Catch:{ Exception -> 0x00b4 }
            r2 = 1
            r3.f322776w0 = r2     // Catch:{ Exception -> 0x00b4 }
        L_0x10aa:
            java.lang.String r2 = ".deviceinfoconfig.voip.ipcall.speakerstreamtype"
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x1ce0 }
            if (r2 == 0) goto L_0x10c4
            java.lang.String r2 = ".deviceinfoconfig.voip.ipcall.speakerstreamtype"
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x00b4 }
            r6 = 0
            int r2 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r2, (int) r6)     // Catch:{ Exception -> 0x00b4 }
            r3.f322681B0 = r2     // Catch:{ Exception -> 0x00b4 }
            r2 = 1
            r3.f322776w0 = r2     // Catch:{ Exception -> 0x00b4 }
        L_0x10c4:
            java.lang.String r2 = ".deviceinfoconfig.voip.ipcall.phonestreamtype"
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x1ce0 }
            if (r2 == 0) goto L_0x10de
            java.lang.String r2 = ".deviceinfoconfig.voip.ipcall.phonestreamtype"
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x00b4 }
            r6 = 0
            int r2 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r2, (int) r6)     // Catch:{ Exception -> 0x00b4 }
            r3.f322683C0 = r2     // Catch:{ Exception -> 0x00b4 }
            r2 = 1
            r3.f322776w0 = r2     // Catch:{ Exception -> 0x00b4 }
        L_0x10de:
            r2 = r34
            java.lang.Object r3 = r10.get(r2)     // Catch:{ Exception -> 0x1ce0 }
            if (r3 == 0) goto L_0x10f3
            r47.getClass()     // Catch:{ Exception -> 0x00b4 }
            java.lang.Object r3 = r10.get(r2)     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ Exception -> 0x00b4 }
            r6 = 0
            com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r3, (int) r6)     // Catch:{ Exception -> 0x00b4 }
        L_0x10f3:
            java.lang.Object r3 = r10.get(r2)     // Catch:{ Exception -> 0x1ce0 }
            if (r3 == 0) goto L_0x1109
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x00b4 }
            r3 = 0
            int r2 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r2, (int) r3)     // Catch:{ Exception -> 0x00b4 }
            r3 = r47
            r3.f322887a = r2     // Catch:{ Exception -> 0x00b4 }
            goto L_0x110b
        L_0x1109:
            r3 = r47
        L_0x110b:
            java.lang.String r2 = ".deviceinfoconfig.voip.common.stopbluetoothbr"
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x1ce0 }
            if (r2 == 0) goto L_0x1122
            java.lang.String r2 = ".deviceinfoconfig.voip.common.stopbluetoothbr"
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x00b4 }
            r6 = 0
            int r2 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r2, (int) r6)     // Catch:{ Exception -> 0x00b4 }
            r3.f322889b = r2     // Catch:{ Exception -> 0x00b4 }
        L_0x1122:
            java.lang.String r2 = ".deviceinfoconfig.voip.common.stopbluetoothbu"
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x1ce0 }
            if (r2 == 0) goto L_0x1139
            java.lang.String r2 = ".deviceinfoconfig.voip.common.stopbluetoothbu"
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x00b4 }
            r6 = 0
            int r2 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r2, (int) r6)     // Catch:{ Exception -> 0x00b4 }
            r3.f322891c = r2     // Catch:{ Exception -> 0x00b4 }
        L_0x1139:
            java.lang.String r2 = ".deviceinfoconfig.voip.common.setbluetoothscoon"
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x1ce0 }
            if (r2 == 0) goto L_0x1150
            java.lang.String r2 = ".deviceinfoconfig.voip.common.setbluetoothscoon"
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x00b4 }
            r6 = 0
            int r2 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r2, (int) r6)     // Catch:{ Exception -> 0x00b4 }
            r3.f322895e = r2     // Catch:{ Exception -> 0x00b4 }
        L_0x1150:
            java.lang.String r2 = ".deviceinfoconfig.voip.common.startbluetoothsco"
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x1ce0 }
            if (r2 == 0) goto L_0x1167
            java.lang.String r2 = ".deviceinfoconfig.voip.common.startbluetoothsco"
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x00b4 }
            r6 = 0
            int r2 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r2, (int) r6)     // Catch:{ Exception -> 0x00b4 }
            r3.f322893d = r2     // Catch:{ Exception -> 0x00b4 }
        L_0x1167:
            java.lang.String r2 = ".deviceinfoconfig.voip.common.voicesearchfastmode"
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x1ce0 }
            if (r2 == 0) goto L_0x117e
            java.lang.String r2 = ".deviceinfoconfig.voip.common.voicesearchfastmode"
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x00b4 }
            r6 = 0
            int r2 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r2, (int) r6)     // Catch:{ Exception -> 0x00b4 }
            r3.f322897f = r2     // Catch:{ Exception -> 0x00b4 }
        L_0x117e:
            java.lang.String r2 = ".deviceinfoconfig.voip.common.pcmreadmode"
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x1ce0 }
            if (r2 == 0) goto L_0x1195
            java.lang.String r2 = ".deviceinfoconfig.voip.common.pcmreadmode"
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x00b4 }
            r6 = 0
            int r2 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r2, (int) r6)     // Catch:{ Exception -> 0x00b4 }
            r3.f322901h = r2     // Catch:{ Exception -> 0x00b4 }
        L_0x1195:
            java.lang.String r2 = ".deviceinfoconfig.voip.common.pcmbufferrate"
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x1ce0 }
            if (r2 == 0) goto L_0x11ac
            java.lang.String r2 = ".deviceinfoconfig.voip.common.pcmbufferrate"
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x00b4 }
            r6 = 0
            int r2 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r2, (int) r6)     // Catch:{ Exception -> 0x00b4 }
            r3.f322899g = r2     // Catch:{ Exception -> 0x00b4 }
        L_0x11ac:
            java.lang.String r2 = ".deviceinfoconfig.voip.common.app"
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x1ce0 }
            if (r2 == 0) goto L_0x11c3
            java.lang.String r2 = ".deviceinfoconfig.voip.common.app"
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x00b4 }
            r6 = 0
            int r2 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r2, (int) r6)     // Catch:{ Exception -> 0x00b4 }
            r3.f322902i = r2     // Catch:{ Exception -> 0x00b4 }
        L_0x11c3:
            java.lang.String r2 = ".deviceinfoconfig.voip.common.deviceinfo.voipapp"
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x1ce0 }
            if (r2 == 0) goto L_0x11da
            java.lang.String r2 = ".deviceinfoconfig.voip.common.deviceinfo.voipapp"
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x00b4 }
            r6 = 0
            int r2 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r2, (int) r6)     // Catch:{ Exception -> 0x00b4 }
            r3.f322861A = r2     // Catch:{ Exception -> 0x00b4 }
        L_0x11da:
            java.lang.String r2 = ".deviceinfoconfig.voip.common.deviceinfo.voipappns"
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x1ce0 }
            if (r2 == 0) goto L_0x11f1
            java.lang.String r2 = ".deviceinfoconfig.voip.common.deviceinfo.voipappns"
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x00b4 }
            r6 = 0
            int r2 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r2, (int) r6)     // Catch:{ Exception -> 0x00b4 }
            r3.f322862B = r2     // Catch:{ Exception -> 0x00b4 }
        L_0x11f1:
            java.lang.String r2 = ".deviceinfoconfig.voip.common.deviceinfo.voipappaec"
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x1ce0 }
            if (r2 == 0) goto L_0x1208
            java.lang.String r2 = ".deviceinfoconfig.voip.common.deviceinfo.voipappaec"
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x00b4 }
            r6 = 0
            int r2 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r2, (int) r6)     // Catch:{ Exception -> 0x00b4 }
            r3.f322863C = r2     // Catch:{ Exception -> 0x00b4 }
        L_0x1208:
            java.lang.String r2 = ".deviceinfoconfig.voip.common.deviceinfo.voipappagc"
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x1ce0 }
            if (r2 == 0) goto L_0x121f
            java.lang.String r2 = ".deviceinfoconfig.voip.common.deviceinfo.voipappagc"
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x00b4 }
            r6 = 0
            int r2 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r2, (int) r6)     // Catch:{ Exception -> 0x00b4 }
            r3.f322864D = r2     // Catch:{ Exception -> 0x00b4 }
        L_0x121f:
            java.lang.String r2 = ".deviceinfoconfig.voip.common.voipnewrenderer"
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x1ce0 }
            if (r2 == 0) goto L_0x1236
            java.lang.String r2 = ".deviceinfoconfig.voip.common.voipnewrenderer"
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x00b4 }
            r6 = 0
            com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r2, (int) r6)     // Catch:{ Exception -> 0x00b4 }
            r47.getClass()     // Catch:{ Exception -> 0x00b4 }
        L_0x1236:
            java.lang.String r2 = ".deviceinfoconfig.voip.common.voipUseRemovePreviewCallback"
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x1ce0 }
            if (r2 == 0) goto L_0x124d
            java.lang.String r2 = ".deviceinfoconfig.voip.common.voipUseRemovePreviewCallback"
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x00b4 }
            r6 = 0
            com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r2, (int) r6)     // Catch:{ Exception -> 0x00b4 }
            r47.getClass()     // Catch:{ Exception -> 0x00b4 }
        L_0x124d:
            java.lang.String r2 = ".deviceinfoconfig.voip.common.voipForceUseEncodeMode"
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x1ce0 }
            if (r2 == 0) goto L_0x1264
            java.lang.String r2 = ".deviceinfoconfig.voip.common.voipForceUseEncodeMode"
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x00b4 }
            r6 = 0
            com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r2, (int) r6)     // Catch:{ Exception -> 0x00b4 }
            r47.getClass()     // Catch:{ Exception -> 0x00b4 }
        L_0x1264:
            java.lang.String r2 = ".deviceinfoconfig.voip.common.voipFaceBeautyUseHighRank"
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x1ce0 }
            if (r2 == 0) goto L_0x127b
            java.lang.String r2 = ".deviceinfoconfig.voip.common.voipFaceBeautyUseHighRank"
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x00b4 }
            r6 = 0
            int r2 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r2, (int) r6)     // Catch:{ Exception -> 0x00b4 }
            r3.f322870J = r2     // Catch:{ Exception -> 0x00b4 }
        L_0x127b:
            java.lang.String r2 = ".deviceinfoconfig.voip.common.voipUseCameraApi2"
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x1ce0 }
            if (r2 == 0) goto L_0x1292
            java.lang.String r2 = ".deviceinfoconfig.voip.common.voipUseCameraApi2"
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x00b4 }
            r6 = 0
            int r2 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r2, (int) r6)     // Catch:{ Exception -> 0x00b4 }
            r3.f322871K = r2     // Catch:{ Exception -> 0x00b4 }
        L_0x1292:
            java.lang.String r2 = ".deviceinfoconfig.voip.common.voipUseNewCameraModular"
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x1ce0 }
            if (r2 == 0) goto L_0x12a9
            java.lang.String r2 = ".deviceinfoconfig.voip.common.voipUseNewCameraModular"
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x00b4 }
            r6 = 0
            int r2 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r2, (int) r6)     // Catch:{ Exception -> 0x00b4 }
            r3.f322872L = r2     // Catch:{ Exception -> 0x00b4 }
        L_0x12a9:
            java.lang.String r2 = ".deviceinfoconfig.voip.common.voipgpurgb2yuv"
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x1ce0 }
            if (r2 == 0) goto L_0x12c0
            java.lang.String r2 = ".deviceinfoconfig.voip.common.voipgpurgb2yuv"
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x00b4 }
            r6 = 0
            com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r2, (int) r6)     // Catch:{ Exception -> 0x00b4 }
            r47.getClass()     // Catch:{ Exception -> 0x00b4 }
        L_0x12c0:
            java.lang.String r2 = ".deviceinfoconfig.voip.common.voipgpucrop"
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x1ce0 }
            if (r2 == 0) goto L_0x12d7
            java.lang.String r2 = ".deviceinfoconfig.voip.common.voipgpucrop"
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x00b4 }
            r6 = 0
            int r2 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r2, (int) r6)     // Catch:{ Exception -> 0x00b4 }
            r3.f322873M = r2     // Catch:{ Exception -> 0x00b4 }
        L_0x12d7:
            java.lang.String r2 = ".deviceinfoconfig.voip.common.groupRs"
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x1ce0 }
            if (r2 == 0) goto L_0x12ee
            java.lang.String r2 = ".deviceinfoconfig.voip.common.groupRs"
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x00b4 }
            r6 = 0
            int r2 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r2, (int) r6)     // Catch:{ Exception -> 0x00b4 }
            r3.f322919z = r2     // Catch:{ Exception -> 0x00b4 }
        L_0x12ee:
            java.lang.String r2 = ".deviceinfoconfig.voip.common.vmfd"
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x1ce0 }
            if (r2 == 0) goto L_0x1305
            java.lang.String r2 = ".deviceinfoconfig.voip.common.vmfd"
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x00b4 }
            r6 = 0
            int r2 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r2, (int) r6)     // Catch:{ Exception -> 0x00b4 }
            r3.f322903j = r2     // Catch:{ Exception -> 0x00b4 }
        L_0x1305:
            java.lang.String r2 = ".deviceinfoconfig.voip.common.htcvoicemode"
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x1ce0 }
            if (r2 == 0) goto L_0x131c
            java.lang.String r2 = ".deviceinfoconfig.voip.common.htcvoicemode"
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x00b4 }
            r6 = 0
            int r2 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r2, (int) r6)     // Catch:{ Exception -> 0x00b4 }
            r3.f322904k = r2     // Catch:{ Exception -> 0x00b4 }
        L_0x131c:
            java.lang.String r2 = ".deviceinfoconfig.voip.common.samsungvoicemode"
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x1ce0 }
            if (r2 == 0) goto L_0x1333
            java.lang.String r2 = ".deviceinfoconfig.voip.common.samsungvoicemode"
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x00b4 }
            r6 = 0
            int r2 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r2, (int) r6)     // Catch:{ Exception -> 0x00b4 }
            r3.f322905l = r2     // Catch:{ Exception -> 0x00b4 }
        L_0x1333:
            java.lang.String r2 = ".deviceinfoconfig.voip.common.speexbufferrate"
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x1ce0 }
            if (r2 == 0) goto L_0x134a
            java.lang.String r2 = ".deviceinfoconfig.voip.common.speexbufferrate"
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x00b4 }
            r6 = 0
            int r2 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r2, (int) r6)     // Catch:{ Exception -> 0x00b4 }
            r3.f322906m = r2     // Catch:{ Exception -> 0x00b4 }
        L_0x134a:
            java.lang.String r2 = ".deviceinfoconfig.voip.common.linespe"
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x1ce0 }
            if (r2 == 0) goto L_0x1361
            java.lang.String r2 = ".deviceinfoconfig.voip.common.linespe"
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x00b4 }
            r6 = 0
            int r2 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r2, (int) r6)     // Catch:{ Exception -> 0x00b4 }
            r3.f322907n = r2     // Catch:{ Exception -> 0x00b4 }
        L_0x1361:
            java.lang.String r2 = ".deviceinfoconfig.voip.common.fixspan"
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x1ce0 }
            if (r2 == 0) goto L_0x1378
            java.lang.String r2 = ".deviceinfoconfig.voip.common.fixspan"
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x00b4 }
            r6 = 0
            int r2 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r2, (int) r6)     // Catch:{ Exception -> 0x00b4 }
            r3.f322917x = r2     // Catch:{ Exception -> 0x00b4 }
        L_0x1378:
            java.lang.String r2 = ".deviceinfoconfig.voip.common.extvideo"
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x1ce0 }
            if (r2 == 0) goto L_0x138f
            java.lang.String r2 = ".deviceinfoconfig.voip.common.extvideo"
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x00b4 }
            r6 = 0
            int r2 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r2, (int) r6)     // Catch:{ Exception -> 0x00b4 }
            r3.f322908o = r2     // Catch:{ Exception -> 0x00b4 }
        L_0x138f:
            java.lang.String r2 = ".deviceinfoconfig.voip.common.extvideosam"
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x1ce0 }
            if (r2 == 0) goto L_0x13a6
            java.lang.String r2 = ".deviceinfoconfig.voip.common.extvideosam"
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x00b4 }
            r6 = 0
            int r2 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r2, (int) r6)     // Catch:{ Exception -> 0x00b4 }
            r3.f322909p = r2     // Catch:{ Exception -> 0x00b4 }
        L_0x13a6:
            java.lang.String r2 = ".deviceinfoconfig.voip.common.sysvideodegree"
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x1ce0 }
            if (r2 == 0) goto L_0x13bd
            java.lang.String r2 = ".deviceinfoconfig.voip.common.sysvideodegree"
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x00b4 }
            r6 = 0
            int r2 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r2, (int) r6)     // Catch:{ Exception -> 0x00b4 }
            r3.f322910q = r2     // Catch:{ Exception -> 0x00b4 }
        L_0x13bd:
            java.lang.String r2 = ".deviceinfoconfig.voip.common.mmnotify"
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x1ce0 }
            if (r2 == 0) goto L_0x13d4
            java.lang.String r2 = ".deviceinfoconfig.voip.common.mmnotify"
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x00b4 }
            r6 = 0
            int r2 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r2, (int) r6)     // Catch:{ Exception -> 0x00b4 }
            r3.f322912s = r2     // Catch:{ Exception -> 0x00b4 }
        L_0x13d4:
            java.lang.String r2 = ".deviceinfoconfig.voip.common.extsharevcard"
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x1ce0 }
            if (r2 == 0) goto L_0x13eb
            java.lang.String r2 = ".deviceinfoconfig.voip.common.extsharevcard"
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x00b4 }
            r6 = 0
            int r2 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r2, (int) r6)     // Catch:{ Exception -> 0x00b4 }
            r3.f322911r = r2     // Catch:{ Exception -> 0x00b4 }
        L_0x13eb:
            r2 = r33
            java.lang.Object r6 = r10.get(r2)     // Catch:{ Exception -> 0x1ce0 }
            if (r6 == 0) goto L_0x1400
            java.lang.Object r6 = r10.get(r2)     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ Exception -> 0x00b4 }
            r7 = 0
            int r6 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r6, (int) r7)     // Catch:{ Exception -> 0x00b4 }
            r3.f322913t = r6     // Catch:{ Exception -> 0x00b4 }
        L_0x1400:
            r6 = r32
            java.lang.Object r7 = r10.get(r6)     // Catch:{ Exception -> 0x1ce0 }
            if (r7 == 0) goto L_0x1415
            java.lang.Object r7 = r10.get(r6)     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ Exception -> 0x00b4 }
            r8 = 0
            int r7 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r7, (int) r8)     // Catch:{ Exception -> 0x00b4 }
            r3.f322914u = r7     // Catch:{ Exception -> 0x00b4 }
        L_0x1415:
            java.lang.String r7 = ".deviceinfoconfig.voip.common.sysvideofdegree"
            java.lang.Object r7 = r10.get(r7)     // Catch:{ Exception -> 0x1ce0 }
            if (r7 == 0) goto L_0x142c
            java.lang.String r7 = ".deviceinfoconfig.voip.common.sysvideofdegree"
            java.lang.Object r7 = r10.get(r7)     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ Exception -> 0x00b4 }
            r8 = 0
            com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r7, (int) r8)     // Catch:{ Exception -> 0x00b4 }
            r47.getClass()     // Catch:{ Exception -> 0x00b4 }
        L_0x142c:
            java.lang.Object r7 = r10.get(r2)     // Catch:{ Exception -> 0x1ce0 }
            if (r7 == 0) goto L_0x143f
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x00b4 }
            r7 = 0
            int r2 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r2, (int) r7)     // Catch:{ Exception -> 0x00b4 }
            r3.f322913t = r2     // Catch:{ Exception -> 0x00b4 }
        L_0x143f:
            java.lang.Object r2 = r10.get(r6)     // Catch:{ Exception -> 0x1ce0 }
            if (r2 == 0) goto L_0x1452
            java.lang.Object r2 = r10.get(r6)     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x00b4 }
            r6 = 0
            int r2 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r2, (int) r6)     // Catch:{ Exception -> 0x00b4 }
            r3.f322914u = r2     // Catch:{ Exception -> 0x00b4 }
        L_0x1452:
            java.lang.String r2 = ".deviceinfoconfig.voip.common.base"
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x1ce0 }
            if (r2 == 0) goto L_0x1464
            java.lang.String r2 = ".deviceinfoconfig.voip.common.base"
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x00b4 }
            r3.f322874N = r2     // Catch:{ Exception -> 0x00b4 }
        L_0x1464:
            java.lang.String r2 = ".deviceinfoconfig.voip.common.packageinfo"
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x1ce0 }
            if (r2 == 0) goto L_0x1476
            java.lang.String r2 = ".deviceinfoconfig.voip.common.packageinfo"
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x00b4 }
            r3.f322875O = r2     // Catch:{ Exception -> 0x00b4 }
        L_0x1476:
            java.lang.String r2 = ".deviceinfoconfig.voip.common.classloader"
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x1ce0 }
            if (r2 == 0) goto L_0x1488
            java.lang.String r2 = ".deviceinfoconfig.voip.common.classloader"
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x00b4 }
            r3.f322876P = r2     // Catch:{ Exception -> 0x00b4 }
        L_0x1488:
            java.lang.String r2 = ".deviceinfoconfig.voip.common.resources"
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x1ce0 }
            if (r2 == 0) goto L_0x149a
            java.lang.String r2 = ".deviceinfoconfig.voip.common.resources"
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x00b4 }
            r3.f322877Q = r2     // Catch:{ Exception -> 0x00b4 }
        L_0x149a:
            java.lang.String r2 = ".deviceinfoconfig.voip.common.sysvideofp"
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x1ce0 }
            if (r2 == 0) goto L_0x14b1
            java.lang.String r2 = ".deviceinfoconfig.voip.common.sysvideofp"
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x00b4 }
            r6 = 0
            int r2 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r2, (int) r6)     // Catch:{ Exception -> 0x00b4 }
            r3.f322915v = r2     // Catch:{ Exception -> 0x00b4 }
        L_0x14b1:
            java.lang.String r2 = ".deviceinfoconfig.voip.common.extstoragedir"
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x1ce0 }
            if (r2 == 0) goto L_0x14c3
            java.lang.String r2 = ".deviceinfoconfig.voip.common.extstoragedir"
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x00b4 }
            r3.f322878R = r2     // Catch:{ Exception -> 0x00b4 }
        L_0x14c3:
            java.lang.String r2 = ".deviceinfoconfig.voip.common.extpubdir"
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x1ce0 }
            if (r2 == 0) goto L_0x14d5
            java.lang.String r2 = ".deviceinfoconfig.voip.common.extpubdir"
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x00b4 }
            r3.f322879S = r2     // Catch:{ Exception -> 0x00b4 }
        L_0x14d5:
            java.lang.String r2 = ".deviceinfoconfig.voip.common.extdatadir"
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x1ce0 }
            if (r2 == 0) goto L_0x14e7
            java.lang.String r2 = ".deviceinfoconfig.voip.common.extdatadir"
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x00b4 }
            r3.f322880T = r2     // Catch:{ Exception -> 0x00b4 }
        L_0x14e7:
            java.lang.String r2 = ".deviceinfoconfig.voip.common.extrootdir"
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x1ce0 }
            if (r2 == 0) goto L_0x14f9
            java.lang.String r2 = ".deviceinfoconfig.voip.common.extrootdir"
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x00b4 }
            r3.f322881U = r2     // Catch:{ Exception -> 0x00b4 }
        L_0x14f9:
            java.lang.String r2 = ".deviceinfoconfig.voip.common.extstoragestate"
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x1ce0 }
            if (r2 == 0) goto L_0x150b
            java.lang.String r2 = ".deviceinfoconfig.voip.common.extstoragestate"
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x00b4 }
            r3.f322882V = r2     // Catch:{ Exception -> 0x00b4 }
        L_0x150b:
            java.lang.String r2 = ".deviceinfoconfig.voip.common.extcachedir"
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x1ce0 }
            if (r2 == 0) goto L_0x151d
            java.lang.String r2 = ".deviceinfoconfig.voip.common.extcachedir"
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x00b4 }
            r3.f322883W = r2     // Catch:{ Exception -> 0x00b4 }
        L_0x151d:
            java.lang.String r2 = ".deviceinfoconfig.voip.common.extvideoplayer"
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x1ce0 }
            if (r2 == 0) goto L_0x1533
            java.lang.String r2 = ".deviceinfoconfig.voip.common.extvideoplayer"
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x00b4 }
            int r2 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r2, (int) r4)     // Catch:{ Exception -> 0x00b4 }
            r3.f322916w = r2     // Catch:{ Exception -> 0x00b4 }
        L_0x1533:
            java.lang.String r2 = ".deviceinfoconfig.voip.common.loadDrawable"
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x1ce0 }
            if (r2 == 0) goto L_0x1545
            java.lang.String r2 = ".deviceinfoconfig.voip.common.loadDrawable"
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x00b4 }
            r3.f322884X = r2     // Catch:{ Exception -> 0x00b4 }
        L_0x1545:
            java.lang.String r2 = ".deviceinfoconfig.voip.common.loadXmlResourceParser"
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x1ce0 }
            if (r2 == 0) goto L_0x1557
            java.lang.String r2 = ".deviceinfoconfig.voip.common.loadXmlResourceParser"
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x00b4 }
            r3.f322885Y = r2     // Catch:{ Exception -> 0x00b4 }
        L_0x1557:
            java.lang.String r2 = ".deviceinfoconfig.voip.common.sensorNearFar"
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x1ce0 }
            if (r2 == 0) goto L_0x1571
            java.lang.String r2 = ".deviceinfoconfig.voip.common.sensorNearFar"
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x00b4 }
            r6 = 0
            int r2 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r2, (int) r6)     // Catch:{ Exception -> 0x00b4 }
            r6 = 1
            if (r6 != r2) goto L_0x1571
            com.tencent.p014mm.sdk.platformtools.SensorController.sensorNearFar = r6     // Catch:{ Exception -> 0x00b4 }
        L_0x1571:
            java.lang.String r2 = ".deviceinfoconfig.voip.common.sensorNearFarDivideRatio"
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x1ce0 }
            if (r2 == 0) goto L_0x1589
            java.lang.String r2 = ".deviceinfoconfig.voip.common.sensorNearFarDivideRatio"
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x00b4 }
            r6 = 0
            double r6 = com.tencent.p014mm.sdk.platformtools.Util.getDouble(r2, r6)     // Catch:{ Exception -> 0x00b4 }
            com.tencent.p014mm.sdk.platformtools.SensorController.configNearFarDivideRatio = r6     // Catch:{ Exception -> 0x00b4 }
        L_0x1589:
            java.lang.String r2 = ".deviceinfoconfig.voip.common.sightFullType"
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x1ce0 }
            if (r2 == 0) goto L_0x159b
            java.lang.String r2 = ".deviceinfoconfig.voip.common.sightFullType"
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x00b4 }
            r3.f322886Z = r2     // Catch:{ Exception -> 0x00b4 }
        L_0x159b:
            java.lang.String r2 = ".deviceinfoconfig.voip.common.slyTextureView"
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x1ce0 }
            if (r2 == 0) goto L_0x15b1
            java.lang.String r2 = ".deviceinfoconfig.voip.common.slyTextureView"
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x00b4 }
            int r2 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r2, (int) r4)     // Catch:{ Exception -> 0x00b4 }
            r3.f322888a0 = r2     // Catch:{ Exception -> 0x00b4 }
        L_0x15b1:
            java.lang.String r2 = ".deviceinfoconfig.voip.common.checkSightDraftMd5"
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x1ce0 }
            if (r2 == 0) goto L_0x15c8
            java.lang.String r2 = ".deviceinfoconfig.voip.common.checkSightDraftMd5"
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x00b4 }
            r6 = 1
            int r2 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r2, (int) r6)     // Catch:{ Exception -> 0x00b4 }
            r3.f322890b0 = r2     // Catch:{ Exception -> 0x00b4 }
        L_0x15c8:
            java.lang.String r2 = ".deviceinfoconfig.voip.common.swipeBackConfig"
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x1ce0 }
            if (r2 == 0) goto L_0x15e7
            java.lang.String r2 = ".deviceinfoconfig.voip.common.swipeBackConfig"
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x00b4 }
            r6 = 1
            int r2 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r2, (int) r6)     // Catch:{ Exception -> 0x00b4 }
            r3.f322892c0 = r2     // Catch:{ Exception -> 0x00b4 }
            if (r2 != r6) goto L_0x15e3
            r2 = 1
            goto L_0x15e4
        L_0x15e3:
            r2 = 0
        L_0x15e4:
            p605mj.C34575a.m40397b(r2)     // Catch:{ Exception -> 0x00b4 }
        L_0x15e7:
            java.lang.String r2 = ".deviceinfoconfig.voip.common.canDecodeWebp"
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x1ce0 }
            if (r2 == 0) goto L_0x15fe
            java.lang.String r2 = ".deviceinfoconfig.voip.common.canDecodeWebp"
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x00b4 }
            r6 = 1
            int r2 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r2, (int) r6)     // Catch:{ Exception -> 0x00b4 }
            r3.f322894d0 = r2     // Catch:{ Exception -> 0x00b4 }
        L_0x15fe:
            java.lang.String r2 = ".deviceinfoconfig.voip.common.isScanZoom"
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x1ce0 }
            if (r2 == 0) goto L_0x1614
            java.lang.String r2 = ".deviceinfoconfig.voip.common.isScanZoom"
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x00b4 }
            int r2 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r2, (int) r4)     // Catch:{ Exception -> 0x00b4 }
            r3.f322918y = r2     // Catch:{ Exception -> 0x00b4 }
        L_0x1614:
            java.lang.String r2 = ".deviceinfoconfig.voip.common.scanMaxZoomDivideRatio"
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x1ce0 }
            if (r2 == 0) goto L_0x162c
            java.lang.String r2 = ".deviceinfoconfig.voip.common.scanMaxZoomDivideRatio"
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x00b4 }
            r6 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            com.tencent.p014mm.sdk.platformtools.Util.getDouble(r2, r6)     // Catch:{ Exception -> 0x00b4 }
            r47.getClass()     // Catch:{ Exception -> 0x00b4 }
        L_0x162c:
            java.lang.String r2 = ".deviceinfoconfig.voip.common.notificationSetMode"
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x1ce0 }
            if (r2 == 0) goto L_0x1642
            java.lang.String r2 = ".deviceinfoconfig.voip.common.notificationSetMode"
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x00b4 }
            int r2 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r2, (int) r4)     // Catch:{ Exception -> 0x00b4 }
            r3.f322896e0 = r2     // Catch:{ Exception -> 0x00b4 }
        L_0x1642:
            java.lang.String r2 = ".deviceinfoconfig.voip.common.hevcTransCodeMediaCodec"
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x1ce0 }
            if (r2 == 0) goto L_0x1658
            java.lang.String r2 = ".deviceinfoconfig.voip.common.hevcTransCodeMediaCodec"
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x00b4 }
            int r2 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r2, (int) r4)     // Catch:{ Exception -> 0x00b4 }
            r3.f322898f0 = r2     // Catch:{ Exception -> 0x00b4 }
        L_0x1658:
            java.lang.String r2 = ".deviceinfoconfig.voip.common.videoSupportHevcDecode"
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x1ce0 }
            if (r2 == 0) goto L_0x166e
            java.lang.String r2 = ".deviceinfoconfig.voip.common.videoSupportHevcDecode"
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x00b4 }
            int r2 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r2, (int) r4)     // Catch:{ Exception -> 0x00b4 }
            r3.f322900g0 = r2     // Catch:{ Exception -> 0x00b4 }
        L_0x166e:
            java.lang.String r2 = ".deviceinfoconfig.voip.common.checkOnPauseWindowsFocus"
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x1ce0 }
            if (r2 == 0) goto L_0x1685
            java.lang.String r2 = ".deviceinfoconfig.voip.common.checkOnPauseWindowsFocus"
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x00b4 }
            r6 = 1
            com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r2, (int) r6)     // Catch:{ Exception -> 0x00b4 }
            r47.getClass()     // Catch:{ Exception -> 0x00b4 }
        L_0x1685:
            java.lang.String r2 = ".deviceinfoconfig.voip.common.vcodec1MaxEncRes"
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x1ce0 }
            if (r2 == 0) goto L_0x169b
            java.lang.String r2 = ".deviceinfoconfig.voip.common.vcodec1MaxEncRes"
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x00b4 }
            com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r2, (int) r4)     // Catch:{ Exception -> 0x00b4 }
            r47.getClass()     // Catch:{ Exception -> 0x00b4 }
        L_0x169b:
            java.lang.String r2 = ".deviceinfoconfig.voip.common.vcodec2MaxEncRes"
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x1ce0 }
            if (r2 == 0) goto L_0x16b1
            java.lang.String r2 = ".deviceinfoconfig.voip.common.vcodec2MaxEncRes"
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x00b4 }
            com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r2, (int) r4)     // Catch:{ Exception -> 0x00b4 }
            r47.getClass()     // Catch:{ Exception -> 0x00b4 }
        L_0x16b1:
            java.lang.String r2 = ".deviceinfoconfig.voip.common.hw264MaxEncRes"
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x1ce0 }
            if (r2 == 0) goto L_0x16c7
            java.lang.String r2 = ".deviceinfoconfig.voip.common.hw264MaxEncRes"
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x00b4 }
            com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r2, (int) r4)     // Catch:{ Exception -> 0x00b4 }
            r47.getClass()     // Catch:{ Exception -> 0x00b4 }
        L_0x16c7:
            java.lang.String r2 = ".deviceinfoconfig.voip.common.hw265MaxEncRes"
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x1ce0 }
            if (r2 == 0) goto L_0x16dd
            java.lang.String r2 = ".deviceinfoconfig.voip.common.hw265MaxEncRes"
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x00b4 }
            com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r2, (int) r4)     // Catch:{ Exception -> 0x00b4 }
            r47.getClass()     // Catch:{ Exception -> 0x00b4 }
        L_0x16dd:
            java.lang.String r2 = ".deviceinfoconfig.voip.common.vcodec1MixMaxEncRes"
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x1ce0 }
            if (r2 == 0) goto L_0x16f3
            java.lang.String r2 = ".deviceinfoconfig.voip.common.vcodec1MixMaxEncRes"
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x00b4 }
            com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r2, (int) r4)     // Catch:{ Exception -> 0x00b4 }
            r47.getClass()     // Catch:{ Exception -> 0x00b4 }
        L_0x16f3:
            r2 = r31
            java.lang.Object r6 = r10.get(r2)     // Catch:{ Exception -> 0x1ce0 }
            if (r6 == 0) goto L_0x1707
            java.lang.Object r6 = r10.get(r2)     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ Exception -> 0x00b4 }
            com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r6, (int) r4)     // Catch:{ Exception -> 0x00b4 }
            r47.getClass()     // Catch:{ Exception -> 0x00b4 }
        L_0x1707:
            java.lang.String r6 = ".deviceinfoconfig.voip.common.vcodec2MaxDecRes"
            java.lang.Object r6 = r10.get(r6)     // Catch:{ Exception -> 0x1ce0 }
            if (r6 == 0) goto L_0x171d
            java.lang.String r6 = ".deviceinfoconfig.voip.common.vcodec2MaxDecRes"
            java.lang.Object r6 = r10.get(r6)     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ Exception -> 0x00b4 }
            com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r6, (int) r4)     // Catch:{ Exception -> 0x00b4 }
            r47.getClass()     // Catch:{ Exception -> 0x00b4 }
        L_0x171d:
            java.lang.String r6 = ".deviceinfoconfig.voip.common.hw264MaxDecRes"
            java.lang.Object r6 = r10.get(r6)     // Catch:{ Exception -> 0x1ce0 }
            if (r6 == 0) goto L_0x1733
            java.lang.String r6 = ".deviceinfoconfig.voip.common.hw264MaxDecRes"
            java.lang.Object r6 = r10.get(r6)     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ Exception -> 0x00b4 }
            com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r6, (int) r4)     // Catch:{ Exception -> 0x00b4 }
            r47.getClass()     // Catch:{ Exception -> 0x00b4 }
        L_0x1733:
            java.lang.String r6 = ".deviceinfoconfig.voip.common.hw265MaxDecRes"
            java.lang.Object r6 = r10.get(r6)     // Catch:{ Exception -> 0x1ce0 }
            if (r6 == 0) goto L_0x1749
            java.lang.String r6 = ".deviceinfoconfig.voip.common.hw265MaxDecRes"
            java.lang.Object r6 = r10.get(r6)     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ Exception -> 0x00b4 }
            com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r6, (int) r4)     // Catch:{ Exception -> 0x00b4 }
            r47.getClass()     // Catch:{ Exception -> 0x00b4 }
        L_0x1749:
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x1ce0 }
            if (r2 == 0) goto L_0x175d
            java.lang.String r2 = ".deviceinfoconfig.voip.common.vcodec1MixMaxDecRes"
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x00b4 }
            com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r2, (int) r4)     // Catch:{ Exception -> 0x00b4 }
            r47.getClass()     // Catch:{ Exception -> 0x00b4 }
        L_0x175d:
            java.lang.String r2 = ".deviceinfoconfig.voip.mediaRecorder.useThisInfo"
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x1ce0 }
            if (r2 == 0) goto L_0x1774
            java.lang.String r2 = ".deviceinfoconfig.voip.mediaRecorder.useThisInfo"
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x00b4 }
            r6 = 0
            com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r2, (int) r6)     // Catch:{ Exception -> 0x00b4 }
            r48.getClass()     // Catch:{ Exception -> 0x00b4 }
        L_0x1774:
            java.lang.String r2 = ".deviceinfoconfig.voip.mediaRecorder.width"
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x1ce0 }
            if (r2 == 0) goto L_0x178b
            java.lang.String r2 = ".deviceinfoconfig.voip.mediaRecorder.width"
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x00b4 }
            r6 = 0
            com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r2, (int) r6)     // Catch:{ Exception -> 0x00b4 }
            r48.getClass()     // Catch:{ Exception -> 0x00b4 }
        L_0x178b:
            java.lang.String r2 = ".deviceinfoconfig.voip.mediaRecorder.height"
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x1ce0 }
            if (r2 == 0) goto L_0x17a2
            java.lang.String r2 = ".deviceinfoconfig.voip.mediaRecorder.height"
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x00b4 }
            r6 = 0
            com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r2, (int) r6)     // Catch:{ Exception -> 0x00b4 }
            r48.getClass()     // Catch:{ Exception -> 0x00b4 }
        L_0x17a2:
            java.lang.String r2 = ".deviceinfoconfig.voip.mediaRecorder.frameRate"
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x1ce0 }
            if (r2 == 0) goto L_0x17b9
            java.lang.String r2 = ".deviceinfoconfig.voip.mediaRecorder.frameRate"
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x00b4 }
            r6 = 0
            com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r2, (int) r6)     // Catch:{ Exception -> 0x00b4 }
            r48.getClass()     // Catch:{ Exception -> 0x00b4 }
        L_0x17b9:
            java.lang.String r2 = ".deviceinfoconfig.voip.mediaRecorder.encodingBitRate"
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x1ce0 }
            if (r2 == 0) goto L_0x17d0
            java.lang.String r2 = ".deviceinfoconfig.voip.mediaRecorder.encodingBitRate"
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x00b4 }
            r6 = 0
            com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r2, (int) r6)     // Catch:{ Exception -> 0x00b4 }
            r48.getClass()     // Catch:{ Exception -> 0x00b4 }
        L_0x17d0:
            java.lang.String r2 = ".deviceinfoconfig.voip.mediaRecorder.useSystem"
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x1ce0 }
            if (r2 == 0) goto L_0x17e7
            java.lang.String r2 = ".deviceinfoconfig.voip.mediaRecorder.useSystem"
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x00b4 }
            r6 = 0
            com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r2, (int) r6)     // Catch:{ Exception -> 0x00b4 }
            r48.getClass()     // Catch:{ Exception -> 0x00b4 }
        L_0x17e7:
            java.lang.String r2 = ".deviceinfoconfig.voip.mediaRecorder.yuv420SPSeek"
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x1ce0 }
            if (r2 == 0) goto L_0x17fe
            java.lang.String r2 = ".deviceinfoconfig.voip.mediaRecorder.yuv420SPSeek"
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x00b4 }
            r6 = 0
            com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r2, (int) r6)     // Catch:{ Exception -> 0x00b4 }
            r48.getClass()     // Catch:{ Exception -> 0x00b4 }
        L_0x17fe:
            java.lang.String r2 = ".deviceinfoconfig.voip.mediaRecorder.useMediaCodecEncodeAAC"
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x1ce0 }
            if (r2 == 0) goto L_0x1815
            java.lang.String r2 = ".deviceinfoconfig.voip.mediaRecorder.useMediaCodecEncodeAAC"
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x00b4 }
            r6 = 0
            com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r2, (int) r6)     // Catch:{ Exception -> 0x00b4 }
            r48.getClass()     // Catch:{ Exception -> 0x00b4 }
        L_0x1815:
            java.lang.String r2 = ".deviceinfoconfig.voip.mediaRecorder.AACSampleRate"
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x1ce0 }
            if (r2 == 0) goto L_0x182c
            java.lang.String r2 = ".deviceinfoconfig.voip.mediaRecorder.AACSampleRate"
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x00b4 }
            r6 = 0
            com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r2, (int) r6)     // Catch:{ Exception -> 0x00b4 }
            r48.getClass()     // Catch:{ Exception -> 0x00b4 }
        L_0x182c:
            java.lang.String r2 = ".deviceinfoconfig.voip.mediaRecorder.useTextureViewForCamera"
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x1ce0 }
            if (r2 == 0) goto L_0x1843
            java.lang.String r2 = ".deviceinfoconfig.voip.mediaRecorder.useTextureViewForCamera"
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x00b4 }
            r6 = 0
            com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r2, (int) r6)     // Catch:{ Exception -> 0x00b4 }
            r48.getClass()     // Catch:{ Exception -> 0x00b4 }
        L_0x1843:
            java.lang.String r2 = ".deviceinfoconfig.voip.mediaRecorder.useFDWithFileSize"
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x1ce0 }
            if (r2 == 0) goto L_0x185c
            java.lang.String r2 = ".deviceinfoconfig.voip.mediaRecorder.useFDWithFileSize"
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x00b4 }
            r6 = 0
            int r2 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r2, (int) r6)     // Catch:{ Exception -> 0x00b4 }
            r6 = r48
            r6.f322835a = r2     // Catch:{ Exception -> 0x00b4 }
        L_0x185c:
            java.lang.String r2 = ".deviceinfoconfig.voip.webview.notifythread"
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x1ce0 }
            if (r2 == 0) goto L_0x1873
            java.lang.String r2 = ".deviceinfoconfig.voip.webview.notifythread"
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x00b4 }
            r6 = 0
            com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r2, (int) r6)     // Catch:{ Exception -> 0x00b4 }
            r49.getClass()     // Catch:{ Exception -> 0x00b4 }
        L_0x1873:
            java.lang.String r2 = ".deviceinfoconfig.voip.webview.forceUseSysWebView"
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x1ce0 }
            if (r2 == 0) goto L_0x18ba
            java.lang.String r2 = ".deviceinfoconfig.voip.webview.forceUseSysWebView"
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x00b4 }
            r6 = 0
            int r2 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r2, (int) r6)     // Catch:{ Exception -> 0x00b4 }
            r6 = 1
            r7 = r49
            if (r2 != r6) goto L_0x188f
            r2 = 1
            goto L_0x1890
        L_0x188f:
            r2 = 0
        L_0x1890:
            r7.f322859a = r2     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r8 = "save forceusesystemwebview = %b"
            java.lang.Object[] r9 = new java.lang.Object[r6]     // Catch:{ Exception -> 0x00b4 }
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)     // Catch:{ Exception -> 0x00b4 }
            r6 = 0
            r9[r6] = r2     // Catch:{ Exception -> 0x00b4 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r15, r8, r9)     // Catch:{ Exception -> 0x00b4 }
            android.content.Context r2 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r6 = "com.tencent.mm_webview_x5_preferences"
            r8 = 4
            android.content.SharedPreferences r2 = r2.getSharedPreferences(r6, r8)     // Catch:{ Exception -> 0x00b4 }
            android.content.SharedPreferences$Editor r2 = r2.edit()     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r6 = "tbs_force_user_sys_webview"
            boolean r7 = r7.f322859a     // Catch:{ Exception -> 0x00b4 }
            android.content.SharedPreferences$Editor r2 = r2.putBoolean(r6, r7)     // Catch:{ Exception -> 0x00b4 }
            r2.commit()     // Catch:{ Exception -> 0x00b4 }
        L_0x18ba:
            r47.mo158247a()     // Catch:{ Exception -> 0x1ce0 }
            java.lang.String r2 = ".deviceinfoconfig.fingerprint.forceFingerprintStatus"
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x1ce0 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x1ce0 }
            r6 = 0
            int r2 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r2, (int) r6)     // Catch:{ Exception -> 0x1ce0 }
            java.lang.String r7 = ".deviceinfoconfig.fingerprint.supportExportEntrance"
            java.lang.Object r7 = r10.get(r7)     // Catch:{ Exception -> 0x1ce0 }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ Exception -> 0x1ce0 }
            int r7 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r7, (int) r6)     // Catch:{ Exception -> 0x1ce0 }
            java.lang.String r8 = "hy: got fingerprint force status: %d"
            r9 = 1
            java.lang.Object[] r11 = new java.lang.Object[r9]     // Catch:{ Exception -> 0x1ce0 }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r2)     // Catch:{ Exception -> 0x1ce0 }
            r11[r6] = r9     // Catch:{ Exception -> 0x1ce0 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r15, r8, r11)     // Catch:{ Exception -> 0x1ce0 }
            r6 = r50
            if (r6 == 0) goto L_0x18ee
            r6.mo158256b(r2)     // Catch:{ Exception -> 0x00b4 }
            r6.mo158255a(r7)     // Catch:{ Exception -> 0x00b4 }
        L_0x18ee:
            java.lang.String r8 = ".deviceinfoconfig.soter.isSupport"
            java.lang.Object r8 = r10.get(r8)     // Catch:{ Exception -> 0x1ce0 }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ Exception -> 0x1ce0 }
            r9 = 0
            int r8 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r8, (int) r9)     // Catch:{ Exception -> 0x1ce0 }
            java.lang.String r11 = "hy: get soter status: %d"
            r12 = 1
            java.lang.Object[] r13 = new java.lang.Object[r12]     // Catch:{ Exception -> 0x1ce0 }
            java.lang.Integer r14 = java.lang.Integer.valueOf(r8)     // Catch:{ Exception -> 0x1ce0 }
            r13[r9] = r14     // Catch:{ Exception -> 0x1ce0 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r15, r11, r13)     // Catch:{ Exception -> 0x1ce0 }
            r9 = r52
            if (r9 == 0) goto L_0x1918
            if (r8 < r12) goto L_0x1911
            r11 = 1
            goto L_0x1912
        L_0x1911:
            r11 = 0
        L_0x1912:
            r9.mo158244b(r11)     // Catch:{ Exception -> 0x00b4 }
            r9.mo158243a(r8)     // Catch:{ Exception -> 0x00b4 }
        L_0x1918:
            if (r2 != r5) goto L_0x1930
            if (r7 != r5) goto L_0x1930
            if (r9 == 0) goto L_0x1930
            r2 = 1
            r6.mo158256b(r2)     // Catch:{ Exception -> 0x00b4 }
            r6.mo158255a(r2)     // Catch:{ Exception -> 0x00b4 }
            r9.mo158244b(r2)     // Catch:{ Exception -> 0x00b4 }
            r9.mo158243a(r2)     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r2 = "py: hw patch is available now!"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r15, r2)     // Catch:{ Exception -> 0x00b4 }
        L_0x1930:
            java.lang.String r2 = ".deviceinfoconfig.freeWifi.operations.bizUserName"
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x1ce0 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x1ce0 }
            java.lang.String r5 = "lm: got PublicNum: %s"
            r6 = 1
            java.lang.Object[] r7 = new java.lang.Object[r6]     // Catch:{ Exception -> 0x1ce0 }
            r6 = 0
            r7[r6] = r2     // Catch:{ Exception -> 0x1ce0 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r15, r5, r7)     // Catch:{ Exception -> 0x1ce0 }
            java.lang.String r2 = "manufacturerName"
            r5 = 0
            java.util.Map r1 = com.tencent.p014mm.sdk.platformtools.XmlParser.parseXml(r1, r2, r5)     // Catch:{ Exception -> 0x1ce0 }
            java.lang.String r2 = "lm: got manufacturerNameMaps: %s"
            r5 = 1
            java.lang.Object[] r6 = new java.lang.Object[r5]     // Catch:{ Exception -> 0x1ce0 }
            r5 = 0
            r6[r5] = r1     // Catch:{ Exception -> 0x1ce0 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r15, r2, r6)     // Catch:{ Exception -> 0x1ce0 }
            r2 = r51
            if (r2 == 0) goto L_0x195c
            r2.mo158237a(r1)     // Catch:{ Exception -> 0x00b4 }
        L_0x195c:
            java.lang.String r1 = ".deviceinfoconfig.style.swipback"
            java.lang.Object r1 = r10.get(r1)     // Catch:{ Exception -> 0x1ce0 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ Exception -> 0x1ce0 }
            r5 = 0
            int r1 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r1, (int) r5)     // Catch:{ Exception -> 0x1ce0 }
            java.lang.String r6 = "lm: got swipback: %d"
            r7 = 1
            java.lang.Object[] r8 = new java.lang.Object[r7]     // Catch:{ Exception -> 0x1ce0 }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r1)     // Catch:{ Exception -> 0x1ce0 }
            r8[r5] = r7     // Catch:{ Exception -> 0x1ce0 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r15, r6, r8)     // Catch:{ Exception -> 0x1ce0 }
            if (r2 == 0) goto L_0x197c
            r2.mo158238b(r1)     // Catch:{ Exception -> 0x00b4 }
        L_0x197c:
            java.lang.String r1 = ".deviceinfoconfig.game.isLimit"
            java.lang.Object r1 = r10.get(r1)     // Catch:{ Exception -> 0x1ce0 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ Exception -> 0x1ce0 }
            r2 = 0
            int r1 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r1, (int) r2)     // Catch:{ Exception -> 0x1cdd }
            java.lang.String r2 = ".deviceinfoconfig.game.limitPrompt"
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x1ce0 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x1ce0 }
            java.lang.String r5 = "lm: get game status: %d,gamePrompt:%s"
            r6 = 2
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch:{ Exception -> 0x1ce0 }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r1)     // Catch:{ Exception -> 0x1ce0 }
            r8 = 0
            r6[r8] = r7     // Catch:{ Exception -> 0x1ce0 }
            r7 = 1
            r6[r7] = r2     // Catch:{ Exception -> 0x1ce0 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r15, r5, r6)     // Catch:{ Exception -> 0x1ce0 }
            r5 = r54
            if (r5 == 0) goto L_0x19b2
            if (r1 != r7) goto L_0x19ab
            r1 = 1
            goto L_0x19ac
        L_0x19ab:
            r1 = 0
        L_0x19ac:
            r5.mo121632a(r1)     // Catch:{ Exception -> 0x00b4 }
            r5.mo121633b(r2)     // Catch:{ Exception -> 0x00b4 }
        L_0x19b2:
            java.lang.String r1 = ".deviceinfoconfig.appbrand.enableV8Lite"
            java.lang.Object r1 = r10.get(r1)     // Catch:{ Exception -> 0x1ce0 }
            if (r1 == 0) goto L_0x19c9
            java.lang.String r1 = ".deviceinfoconfig.appbrand.enableV8Lite"
            java.lang.Object r1 = r10.get(r1)     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ Exception -> 0x00b4 }
            r2 = 0
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.getBoolean(r1, r2)     // Catch:{ Exception -> 0x00b4 }
            p156gj.C32460a.f86250a = r1     // Catch:{ Exception -> 0x00b4 }
        L_0x19c9:
            java.lang.String r1 = ".deviceinfoconfig.debug.multitalkSdkApply"
            java.lang.Object r1 = r10.get(r1)     // Catch:{ Exception -> 0x1ce0 }
            if (r1 == 0) goto L_0x19e0
            java.lang.String r1 = ".deviceinfoconfig.debug.multitalkSdkApply"
            java.lang.Object r1 = r10.get(r1)     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ Exception -> 0x00b4 }
            r2 = 0
            int r1 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r1, (int) r2)     // Catch:{ Exception -> 0x00b4 }
            r3.f322865E = r1     // Catch:{ Exception -> 0x00b4 }
        L_0x19e0:
            java.lang.String r1 = ".deviceinfoconfig.debug.screenPcCastDebug"
            java.lang.Object r1 = r10.get(r1)     // Catch:{ Exception -> 0x1ce0 }
            if (r1 == 0) goto L_0x19f7
            java.lang.String r1 = ".deviceinfoconfig.debug.screenPcCastDebug"
            java.lang.Object r1 = r10.get(r1)     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ Exception -> 0x00b4 }
            r2 = 0
            int r1 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r1, (int) r2)     // Catch:{ Exception -> 0x00b4 }
            r3.f322866F = r1     // Catch:{ Exception -> 0x00b4 }
        L_0x19f7:
            java.lang.String r1 = ".deviceinfoconfig.debug.screenPcCastUseAsyncCodec"
            java.lang.Object r1 = r10.get(r1)     // Catch:{ Exception -> 0x1ce0 }
            if (r1 == 0) goto L_0x1a0e
            java.lang.String r1 = ".deviceinfoconfig.debug.screenPcCastUseAsyncCodec"
            java.lang.Object r1 = r10.get(r1)     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ Exception -> 0x00b4 }
            r2 = 0
            int r1 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r1, (int) r2)     // Catch:{ Exception -> 0x00b4 }
            r3.f322867G = r1     // Catch:{ Exception -> 0x00b4 }
        L_0x1a0e:
            java.lang.String r1 = ".deviceinfoconfig.debug.screenCast2PcRenderUseAsyncCodec"
            java.lang.Object r1 = r10.get(r1)     // Catch:{ Exception -> 0x1ce0 }
            if (r1 == 0) goto L_0x1a25
            java.lang.String r1 = ".deviceinfoconfig.debug.screenCast2PcRenderUseAsyncCodec"
            java.lang.Object r1 = r10.get(r1)     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ Exception -> 0x00b4 }
            r2 = 0
            int r1 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r1, (int) r2)     // Catch:{ Exception -> 0x00b4 }
            r3.f322868H = r1     // Catch:{ Exception -> 0x00b4 }
        L_0x1a25:
            java.lang.String r1 = ".deviceinfoconfig.debug.screenCast2PcDebugIgnoreScan"
            java.lang.Object r1 = r10.get(r1)     // Catch:{ Exception -> 0x1ce0 }
            if (r1 == 0) goto L_0x1a3c
            java.lang.String r1 = ".deviceinfoconfig.debug.screenCast2PcDebugIgnoreScan"
            java.lang.Object r1 = r10.get(r1)     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ Exception -> 0x00b4 }
            r2 = 0
            int r1 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r1, (int) r2)     // Catch:{ Exception -> 0x00b4 }
            r3.f322869I = r1     // Catch:{ Exception -> 0x00b4 }
        L_0x1a3c:
            java.lang.String r1 = ".deviceinfoconfig.debug.blackBoardProjectDebug"
            java.lang.Object r1 = r10.get(r1)     // Catch:{ Exception -> 0x1ce0 }
            if (r1 == 0) goto L_0x1a50
            java.lang.String r1 = ".deviceinfoconfig.debug.blackBoardProjectDebug"
            java.lang.Object r1 = r10.get(r1)     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ Exception -> 0x00b4 }
            r2 = 0
            com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r1, (int) r2)     // Catch:{ Exception -> 0x00b4 }
        L_0x1a50:
            java.lang.String r1 = ".deviceinfoconfig.mmsight.recordertype"
            java.lang.Object r1 = r10.get(r1)     // Catch:{ Exception -> 0x1ce0 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ Exception -> 0x1ce0 }
            int r1 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r1, (int) r4)     // Catch:{ Exception -> 0x1ce0 }
            java.lang.String r2 = ".deviceinfoconfig.mmsight.needRotateEachFrame"
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x1ce0 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x1ce0 }
            int r2 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r2, (int) r4)     // Catch:{ Exception -> 0x1ce0 }
            java.lang.String r3 = ".deviceinfoconfig.mmsight.enableHighResolutionRecord"
            java.lang.Object r3 = r10.get(r3)     // Catch:{ Exception -> 0x1ce0 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ Exception -> 0x1ce0 }
            int r3 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r3, (int) r4)     // Catch:{ Exception -> 0x1ce0 }
            java.lang.String r5 = ".deviceinfoconfig.mmsight.landscapeRecordModeEnable"
            java.lang.Object r5 = r10.get(r5)     // Catch:{ Exception -> 0x1ce0 }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ Exception -> 0x1ce0 }
            int r5 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r5, (int) r4)     // Catch:{ Exception -> 0x1ce0 }
            java.lang.String r6 = ".deviceinfoconfig.mmsight.transcodeDecoderType"
            java.lang.Object r6 = r10.get(r6)     // Catch:{ Exception -> 0x1ce0 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ Exception -> 0x1ce0 }
            int r6 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r6, (int) r4)     // Catch:{ Exception -> 0x1ce0 }
            java.lang.String r7 = ".deviceinfoconfig.mmsight.mediaPlayerType"
            java.lang.Object r7 = r10.get(r7)     // Catch:{ Exception -> 0x1ce0 }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ Exception -> 0x1ce0 }
            int r7 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r7, (int) r4)     // Catch:{ Exception -> 0x1ce0 }
            java.lang.String r8 = ".deviceinfoconfig.mmsight.strategyMask"
            java.lang.Object r8 = r10.get(r8)     // Catch:{ Exception -> 0x1ce0 }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ Exception -> 0x1ce0 }
            int r8 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r8, (int) r4)     // Catch:{ Exception -> 0x1ce0 }
            java.lang.String r9 = ".deviceinfoconfig.mmsight.recorderOption"
            java.lang.Object r9 = r10.get(r9)     // Catch:{ Exception -> 0x1ce0 }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ Exception -> 0x1ce0 }
            int r9 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r9, (int) r4)     // Catch:{ Exception -> 0x1ce0 }
            java.lang.String r11 = ".deviceinfoconfig.mmsight.useMetering"
            java.lang.Object r11 = r10.get(r11)     // Catch:{ Exception -> 0x1ce0 }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ Exception -> 0x1ce0 }
            int r11 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r11, (int) r4)     // Catch:{ Exception -> 0x1ce0 }
            java.lang.String r12 = ".deviceinfoconfig.mmsight.transcodeEncoderType"
            java.lang.Object r12 = r10.get(r12)     // Catch:{ Exception -> 0x1ce0 }
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ Exception -> 0x1ce0 }
            int r12 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r12, (int) r4)     // Catch:{ Exception -> 0x1ce0 }
            java.lang.String r13 = ".deviceinfoconfig.mmsight.checkSendVideoBitrate"
            java.lang.Object r13 = r10.get(r13)     // Catch:{ Exception -> 0x1ce0 }
            java.lang.String r13 = (java.lang.String) r13     // Catch:{ Exception -> 0x1ce0 }
            int r13 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r13, (int) r4)     // Catch:{ Exception -> 0x1ce0 }
            java.lang.String r14 = ".deviceinfoconfig.mmsight.cpuCrop"
            java.lang.Object r14 = r10.get(r14)     // Catch:{ Exception -> 0x1ce0 }
            java.lang.String r14 = (java.lang.String) r14     // Catch:{ Exception -> 0x1ce0 }
            int r14 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r14, (int) r4)     // Catch:{ Exception -> 0x1ce0 }
            java.lang.String r4 = ".deviceinfoconfig.mmsight.storyRecorderType"
            java.lang.Object r4 = r10.get(r4)     // Catch:{ Exception -> 0x1ce0 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ Exception -> 0x1ce0 }
            r43 = r14
            r14 = -1
            int r4 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r4, (int) r14)     // Catch:{ Exception -> 0x1ce0 }
            java.lang.String r14 = ".deviceinfoconfig.mmsight.backgroundRemux"
            java.lang.Object r14 = r10.get(r14)     // Catch:{ Exception -> 0x1ce0 }
            java.lang.String r14 = (java.lang.String) r14     // Catch:{ Exception -> 0x1ce0 }
            r45 = r4
            r4 = -1
            int r14 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r14, (int) r4)     // Catch:{ Exception -> 0x1ce0 }
            java.lang.String r4 = ".deviceinfoconfig.mmsight.emojiPreviewSize"
            java.lang.Object r4 = r10.get(r4)     // Catch:{ Exception -> 0x1ce0 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ Exception -> 0x1ce0 }
            r46 = r14
            r14 = -1
            int r4 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r4, (int) r14)     // Catch:{ Exception -> 0x1ce0 }
            java.lang.String r14 = ".deviceinfoconfig.mmsight.emojiStickerSampleSize"
            java.lang.Object r14 = r10.get(r14)     // Catch:{ Exception -> 0x1ce0 }
            java.lang.String r14 = (java.lang.String) r14     // Catch:{ Exception -> 0x1ce0 }
            r16 = r15
            r15 = -1
            int r14 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r14, (int) r15)     // Catch:{ Exception -> 0x1cd8 }
            java.lang.String r15 = ".deviceinfoconfig.mmsight.emojiUseSmallModel"
            java.lang.Object r15 = r10.get(r15)     // Catch:{ Exception -> 0x1cd8 }
            java.lang.String r15 = (java.lang.String) r15     // Catch:{ Exception -> 0x1cd8 }
            r47 = r14
            r14 = -1
            int r15 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r15, (int) r14)     // Catch:{ Exception -> 0x1cd8 }
            java.lang.String r14 = ".deviceinfoconfig.mmsight.emojiUseGpuSegment"
            java.lang.Object r14 = r10.get(r14)     // Catch:{ Exception -> 0x1cd8 }
            java.lang.String r14 = (java.lang.String) r14     // Catch:{ Exception -> 0x1cd8 }
            r48 = r15
            r15 = -1
            int r14 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r14, (int) r15)     // Catch:{ Exception -> 0x1cd8 }
            java.lang.String r15 = ".deviceinfoconfig.mmsight.c2cRemuxUseSoftEncode"
            java.lang.Object r15 = r10.get(r15)     // Catch:{ Exception -> 0x1cd8 }
            java.lang.String r15 = (java.lang.String) r15     // Catch:{ Exception -> 0x1cd8 }
            r49 = r14
            r14 = -1
            int r15 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r15, (int) r14)     // Catch:{ Exception -> 0x1cd8 }
            java.lang.String r14 = ".deviceinfoconfig.mmsight.snsRemuxUseSoftEncode"
            java.lang.Object r14 = r10.get(r14)     // Catch:{ Exception -> 0x1cd8 }
            java.lang.String r14 = (java.lang.String) r14     // Catch:{ Exception -> 0x1cd8 }
            r50 = r15
            r15 = -1
            int r14 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r14, (int) r15)     // Catch:{ Exception -> 0x1cd8 }
            java.lang.String r15 = ".deviceinfoconfig.mmsight.takePhotoAlignType"
            java.lang.Object r15 = r10.get(r15)     // Catch:{ Exception -> 0x1cd8 }
            java.lang.String r15 = (java.lang.String) r15     // Catch:{ Exception -> 0x1cd8 }
            r51 = r14
            r14 = -1
            int r15 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r15, (int) r14)     // Catch:{ Exception -> 0x1cd8 }
            java.lang.String r14 = ".deviceinfoconfig.mmsight.nativeToThumb"
            java.lang.Object r14 = r10.get(r14)     // Catch:{ Exception -> 0x1cd8 }
            java.lang.String r14 = (java.lang.String) r14     // Catch:{ Exception -> 0x1cd8 }
            r52 = r15
            r15 = -1
            int r14 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r14, (int) r15)     // Catch:{ Exception -> 0x1cd8 }
            java.lang.String r15 = ".deviceinfoconfig.mmsight.HWQPCfg"
            java.lang.Object r15 = r10.get(r15)     // Catch:{ Exception -> 0x1cd8 }
            java.lang.String r15 = (java.lang.String) r15     // Catch:{ Exception -> 0x1cd8 }
            r54 = r14
            r14 = -1
            int r15 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r15, (int) r14)     // Catch:{ Exception -> 0x1cd8 }
            java.lang.String r14 = ".deviceinfoconfig.mmsight.useCameraApi2"
            java.lang.Object r14 = r10.get(r14)     // Catch:{ Exception -> 0x1cd8 }
            java.lang.String r14 = (java.lang.String) r14     // Catch:{ Exception -> 0x1cd8 }
            r17 = r15
            r15 = -1
            int r14 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r14, (int) r15)     // Catch:{ Exception -> 0x1cd8 }
            java.lang.String r15 = ".deviceinfoconfig.mmsight.fullFuncApi2"
            java.lang.Object r15 = r10.get(r15)     // Catch:{ Exception -> 0x1cd8 }
            java.lang.String r15 = (java.lang.String) r15     // Catch:{ Exception -> 0x1cd8 }
            r18 = r14
            r14 = -1
            int r15 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r15, (int) r14)     // Catch:{ Exception -> 0x1cd8 }
            java.lang.String r14 = ".deviceinfoconfig.mmsight.camera2UseRecordStream"
            java.lang.Object r14 = r10.get(r14)     // Catch:{ Exception -> 0x1cd8 }
            java.lang.String r14 = (java.lang.String) r14     // Catch:{ Exception -> 0x1cd8 }
            r19 = r15
            r15 = -1
            int r14 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r14, (int) r15)     // Catch:{ Exception -> 0x1cd8 }
            java.lang.String r15 = ".deviceinfoconfig.mmsight.vendorCameraEffectSupported"
            java.lang.Object r15 = r10.get(r15)     // Catch:{ Exception -> 0x1cd8 }
            java.lang.String r15 = (java.lang.String) r15     // Catch:{ Exception -> 0x1cd8 }
            r20 = r14
            r14 = -1
            int r15 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r15, (int) r14)     // Catch:{ Exception -> 0x1cd8 }
            java.lang.String r14 = ".deviceinfoconfig.mmsight.useImageStreamCapture"
            java.lang.Object r14 = r10.get(r14)     // Catch:{ Exception -> 0x1cd8 }
            java.lang.String r14 = (java.lang.String) r14     // Catch:{ Exception -> 0x1cd8 }
            r21 = r15
            r15 = -1
            int r14 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r14, (int) r15)     // Catch:{ Exception -> 0x1cd8 }
            java.lang.String r15 = ".deviceinfoconfig.mmsight.useRenderScriptCropImage"
            java.lang.Object r15 = r10.get(r15)     // Catch:{ Exception -> 0x1cd8 }
            java.lang.String r15 = (java.lang.String) r15     // Catch:{ Exception -> 0x1cd8 }
            r22 = r14
            r14 = -1
            int r15 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r15, (int) r14)     // Catch:{ Exception -> 0x1cd8 }
            java.lang.String r14 = ".deviceinfoconfig.mmsight.isVendorDebugModeSupported"
            java.lang.Object r14 = r10.get(r14)     // Catch:{ Exception -> 0x1cd8 }
            java.lang.String r14 = (java.lang.String) r14     // Catch:{ Exception -> 0x1cd8 }
            r23 = r15
            r15 = -1
            int r14 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r14, (int) r15)     // Catch:{ Exception -> 0x1cd8 }
            java.lang.String r15 = ".deviceinfoconfig.mmsight.captureHwHevcEncodeEnable"
            java.lang.Object r15 = r10.get(r15)     // Catch:{ Exception -> 0x1cd8 }
            java.lang.String r15 = (java.lang.String) r15     // Catch:{ Exception -> 0x1cd8 }
            r24 = r14
            r14 = -1
            int r15 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r15, (int) r14)     // Catch:{ Exception -> 0x1cd8 }
            java.lang.String r14 = ".deviceinfoconfig.mmsight.captureSwHevcEncodeEnable"
            java.lang.Object r14 = r10.get(r14)     // Catch:{ Exception -> 0x1cd8 }
            java.lang.String r14 = (java.lang.String) r14     // Catch:{ Exception -> 0x1cd8 }
            r25 = r15
            r15 = -1
            int r14 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r14, (int) r15)     // Catch:{ Exception -> 0x1cd8 }
            java.lang.String r15 = ".deviceinfoconfig.mmsight.remuxHwHevcEncodeEnable"
            java.lang.Object r15 = r10.get(r15)     // Catch:{ Exception -> 0x1cd8 }
            java.lang.String r15 = (java.lang.String) r15     // Catch:{ Exception -> 0x1cd8 }
            r26 = r14
            r14 = -1
            int r15 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r15, (int) r14)     // Catch:{ Exception -> 0x1cd8 }
            java.lang.String r14 = ".deviceinfoconfig.mmsight.remuxSwHevcEncodeEnable"
            java.lang.Object r10 = r10.get(r14)     // Catch:{ Exception -> 0x1cd8 }
            java.lang.String r10 = (java.lang.String) r10     // Catch:{ Exception -> 0x1cd8 }
            r14 = -1
            int r10 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r10, (int) r14)     // Catch:{ Exception -> 0x1cd8 }
            r14 = r53
            if (r14 == 0) goto L_0x1c9e
            r14.f322652a = r1     // Catch:{ Exception -> 0x1cd8 }
            r14.f322653b = r2     // Catch:{ Exception -> 0x1cd8 }
            r14.f322654c = r3     // Catch:{ Exception -> 0x1cd8 }
            r14.f322655d = r5     // Catch:{ Exception -> 0x1cd8 }
            r14.f322656e = r6     // Catch:{ Exception -> 0x1cd8 }
            r14.f322657f = r7     // Catch:{ Exception -> 0x1cd8 }
            r14.f322658g = r8     // Catch:{ Exception -> 0x1cd8 }
            r14.f322659h = r9     // Catch:{ Exception -> 0x1cd8 }
            r14.f322660i = r11     // Catch:{ Exception -> 0x1cd8 }
            r14.f322661j = r12     // Catch:{ Exception -> 0x1cd8 }
            r14.f322662k = r13     // Catch:{ Exception -> 0x1cd8 }
            r14.f322665n = r4     // Catch:{ Exception -> 0x1cd8 }
            r1 = r47
            r14.f322666o = r1     // Catch:{ Exception -> 0x1cd8 }
            r1 = r48
            r14.f322667p = r1     // Catch:{ Exception -> 0x1cd8 }
            r1 = r49
            r14.f322668q = r1     // Catch:{ Exception -> 0x1cd8 }
            r1 = r50
            r14.f322676y = r1     // Catch:{ Exception -> 0x1cd8 }
            r1 = r51
            r14.f322677z = r1     // Catch:{ Exception -> 0x1cd8 }
            r1 = r52
            r14.f322646B = r1     // Catch:{ Exception -> 0x1cd8 }
            r1 = r54
            r14.f322647C = r1     // Catch:{ Exception -> 0x1cd8 }
            r1 = r17
            r14.f322645A = r1     // Catch:{ Exception -> 0x1cd8 }
            r1 = r18
            r14.f322669r = r1     // Catch:{ Exception -> 0x1cd8 }
            r1 = r19
            r14.f322671t = r1     // Catch:{ Exception -> 0x1cd8 }
            r1 = r20
            r14.f322670s = r1     // Catch:{ Exception -> 0x1cd8 }
            r1 = r21
            r14.f322672u = r1     // Catch:{ Exception -> 0x1cd8 }
            r1 = r22
            r14.f322673v = r1     // Catch:{ Exception -> 0x1cd8 }
            r1 = r23
            r14.f322674w = r1     // Catch:{ Exception -> 0x1cd8 }
            r1 = r24
            r14.f322675x = r1     // Catch:{ Exception -> 0x1cd8 }
            r1 = r25
            r14.f322648D = r1     // Catch:{ Exception -> 0x1cd8 }
            r1 = r26
            r14.f322649E = r1     // Catch:{ Exception -> 0x1cd8 }
            r14.f322650F = r15     // Catch:{ Exception -> 0x1cd8 }
            r14.f322651G = r10     // Catch:{ Exception -> 0x1cd8 }
            java.lang.String r1 = "get mmSightRecorderInfo: %s"
            r4 = 1
            java.lang.Object[] r10 = new java.lang.Object[r4]     // Catch:{ Exception -> 0x1cd8 }
            java.lang.String r4 = r53.toString()     // Catch:{ Exception -> 0x1cd8 }
            r14 = 0
            r10[r14] = r4     // Catch:{ Exception -> 0x1cd8 }
            r4 = r16
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r1, r10)     // Catch:{ Exception -> 0x1cd4 }
            goto L_0x1ca0
        L_0x1c9e:
            r4 = r16
        L_0x1ca0:
            r1 = r55
            if (r1 == 0) goto L_0x1cd6
            r10 = r45
            r1.f322652a = r10     // Catch:{ Exception -> 0x1cd4 }
            r1.f322653b = r2     // Catch:{ Exception -> 0x1cd4 }
            r1.f322654c = r3     // Catch:{ Exception -> 0x1cd4 }
            r1.f322655d = r5     // Catch:{ Exception -> 0x1cd4 }
            r1.f322656e = r6     // Catch:{ Exception -> 0x1cd4 }
            r1.f322657f = r7     // Catch:{ Exception -> 0x1cd4 }
            r1.f322658g = r8     // Catch:{ Exception -> 0x1cd4 }
            r1.f322659h = r9     // Catch:{ Exception -> 0x1cd4 }
            r1.f322660i = r11     // Catch:{ Exception -> 0x1cd4 }
            r1.f322661j = r12     // Catch:{ Exception -> 0x1cd4 }
            r1.f322662k = r13     // Catch:{ Exception -> 0x1cd4 }
            r2 = r43
            r1.f322663l = r2     // Catch:{ Exception -> 0x1cd4 }
            r2 = r46
            r1.f322664m = r2     // Catch:{ Exception -> 0x1cd4 }
            java.lang.String r2 = "get mmStoryRecorderInfo: %s"
            r3 = 1
            java.lang.Object[] r5 = new java.lang.Object[r3]     // Catch:{ Exception -> 0x1cd4 }
            java.lang.String r1 = r55.toString()     // Catch:{ Exception -> 0x1cd4 }
            r3 = 0
            r5[r3] = r1     // Catch:{ Exception -> 0x1cd4 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r2, r5)     // Catch:{ Exception -> 0x1cd4 }
            goto L_0x1cd6
        L_0x1cd4:
            r0 = move-exception
            goto L_0x1cdb
        L_0x1cd6:
            r1 = 1
            return r1
        L_0x1cd8:
            r0 = move-exception
            r4 = r16
        L_0x1cdb:
            r1 = r0
            goto L_0x1ce3
        L_0x1cdd:
            r0 = move-exception
            r4 = r15
            goto L_0x1cdb
        L_0x1ce0:
            r0 = move-exception
            r4 = r15
            goto L_0x1cdb
        L_0x1ce3:
            r2 = 0
            java.lang.Object[] r3 = new java.lang.Object[r2]
            java.lang.String r5 = ""
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r4, r1, r5, r3)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p156gj.C107846v.mo158254a(java.lang.String, gj.r, gj.d, gj.c, gj.m, gj.d0, gj.j0, gj.w, gj.c0, gj.g0, gj.b0, gj.b, gj.b0):boolean");
    }
}
