package com.tencent.p014mm.plugin.cloudvoip.cloudvoice.service;

/* renamed from: com.tencent.mm.plugin.cloudvoip.cloudvoice.service.o0 */
public class C105167o0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ int f312284d;

    /* renamed from: e */
    public final /* synthetic */ int f312285e;

    /* renamed from: f */
    public final /* synthetic */ int f312286f;

    /* renamed from: g */
    public final /* synthetic */ byte[] f312287g;

    /* renamed from: h */
    public final /* synthetic */ C105181w f312288h;

    public C105167o0(C105181w wVar, int i, int i2, int i3, byte[] bArr) {
        this.f312288h = wVar;
        this.f312284d = i;
        this.f312285e = i2;
        this.f312286f = i3;
        this.f312287g = bArr;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r30v9, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v20, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r30v25, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v70, resolved type: short} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r30v30, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r30v31, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v48, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v96, resolved type: short} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v97, resolved type: short} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r30v32, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r30v51, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r30v52, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r30v53, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r30v54, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r30v59, resolved type: boolean} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:288:0x093a  */
    /* JADX WARNING: Removed duplicated region for block: B:289:0x093e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r33 = this;
            r1 = r33
            int r0 = r1.f312284d
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x000a
            r4 = 1
            goto L_0x000b
        L_0x000a:
            r4 = 0
        L_0x000b:
            com.tencent.mm.plugin.cloudvoip.cloudvoice.service.w r5 = r1.f312288h
            boolean r0 = r5.f312350M
            if (r0 != 0) goto L_0x0012
            return
        L_0x0012:
            java.lang.String r6 = "mHWScreenEncoderList["
            java.lang.String r7 = "mHWVideoEncoderList["
            java.lang.String r8 = "]: "
            java.lang.String r9 = ", mCapH: "
            java.lang.String r10 = "OpenVoice[HWEnc]"
            java.lang.String r11 = "i: "
            java.lang.String r12 = "MicroMsg.OpenVoice.OpenVoiceService"
            r15 = 2
            if (r4 != 0) goto L_0x044c
            boolean r0 = r5.f312358S0
            if (r0 == 0) goto L_0x044c
            if (r4 == 0) goto L_0x002e
            r0 = 78
            r2 = 78
            goto L_0x0032
        L_0x002e:
            r0 = 61
            r2 = 61
        L_0x0032:
            if (r4 == 0) goto L_0x0037
            int[] r0 = r5.f312367X
            goto L_0x0039
        L_0x0037:
            int[] r0 = r5.f312369Y
        L_0x0039:
            r17 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "bScreen: "
            r0.append(r3)
            r0.append(r4)
            java.lang.String r3 = ", nLoopCount: "
            r0.append(r3)
            r0.append(r15)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r12, r0)
            r0 = 0
            r3 = 0
            r13 = 0
            r18 = 0
        L_0x005c:
            if (r3 >= r15) goto L_0x043c
            com.tencent.mm.plugin.cloudvoip.cloudvoice.service.a r15 = r5.f312356R0
            byte[] r15 = r15.f312144k
            int r15 = com.tencent.p014mm.plugin.cloudvoip.cloudvoice.service.C105172s.m141221b(r2, r15, r3)
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            r14.append(r11)
            r14.append(r3)
            r20 = r2
            java.lang.String r2 = ", ret: "
            r14.append(r2)
            r14.append(r15)
            java.lang.String r2 = ", stQoS.s2p.length: "
            r14.append(r2)
            com.tencent.mm.plugin.cloudvoip.cloudvoice.service.a r2 = r5.f312356R0
            byte[] r2 = r2.f312144k
            int r2 = r2.length
            r14.append(r2)
            java.lang.String r2 = r14.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r12, r2)
            if (r15 != 0) goto L_0x0426
            com.tencent.mm.plugin.cloudvoip.cloudvoice.service.a r2 = r5.f312356R0
            byte[] r14 = r2.f312144k
            java.nio.ByteBuffer r14 = java.nio.ByteBuffer.wrap(r14)
            java.nio.ByteOrder r15 = java.nio.ByteOrder.LITTLE_ENDIAN
            r14.order(r15)
            r21 = r11
            short r11 = r14.getShort()
            r2.f312134a = r11
            byte r11 = r14.get()
            r2.f312135b = r11
            byte r11 = r14.get()
            r2.f312136c = r11
            byte r11 = r14.get()
            r2.f312137d = r11
            byte r11 = r14.get()
            r2.f312138e = r11
            byte r11 = r14.get()
            r2.f312139f = r11
            byte r11 = r14.get()
            r2.f312140g = r11
            byte r11 = r14.get()
            r2.f312141h = r11
            byte r11 = r14.get()
            r2.f312142i = r11
            byte r11 = r14.get()
            r2.f312143j = r11
            com.tencent.mm.plugin.cloudvoip.cloudvoice.service.a r2 = r5.f312356R0
            r2.getClass()
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r14 = "raw S2P:"
            r11.append(r14)
            byte[] r14 = r2.f312144k
            r11.append(r14)
            java.lang.String r11 = r11.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r10, r11)
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r14 = "-S2P- iKbps:"
            r11.append(r14)
            short r14 = r2.f312134a
            r11.append(r14)
            java.lang.String r14 = ", fps:"
            r11.append(r14)
            byte r14 = r2.f312135b
            r11.append(r14)
            java.lang.String r14 = ", IP:"
            r11.append(r14)
            byte r14 = r2.f312136c
            r11.append(r14)
            java.lang.String r14 = ", Reso:"
            r11.append(r14)
            byte r14 = r2.f312137d
            r11.append(r14)
            java.lang.String r14 = ", Codec:"
            r11.append(r14)
            byte r14 = r2.f312138e
            r11.append(r14)
            java.lang.String r14 = ", HWEnable:"
            r11.append(r14)
            byte r14 = r2.f312139f
            r11.append(r14)
            java.lang.String r14 = ", Skip:"
            r11.append(r14)
            byte r14 = r2.f312140g
            r11.append(r14)
            java.lang.String r14 = ", IReq:"
            r11.append(r14)
            byte r14 = r2.f312141h
            r11.append(r14)
            java.lang.String r14 = ", Rsvd1:"
            r11.append(r14)
            byte r14 = r2.f312142i
            r11.append(r14)
            java.lang.String r14 = ", DispRate:"
            r11.append(r14)
            byte r2 = r2.f312143j
            r11.append(r2)
            java.lang.String r2 = r11.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r10, r2)
            com.tencent.mm.plugin.cloudvoip.cloudvoice.service.a r2 = r5.f312356R0
            byte r11 = r2.f312142i
            r11 = r11 & 128(0x80, float:1.794E-43)
            if (r11 == 0) goto L_0x0423
            byte r2 = r2.f312137d
            short[] r11 = com.tencent.p014mm.plugin.cloudvoip.cloudvoice.service.C105181w.f312336d1
            short r2 = r11[r2]
            int r11 = r2 * 4
            r14 = 4
            int r11 = r11 / r14
            int r11 = r11 >> r14
            int r11 = r11 << r14
            if (r4 != 0) goto L_0x018e
            if (r2 <= r0) goto L_0x0181
            r0 = r2
        L_0x0181:
            if (r11 <= r13) goto L_0x0184
            r13 = r11
        L_0x0184:
            int r14 = r5.f312363V
            if (r2 <= r14) goto L_0x0189
            r2 = r14
        L_0x0189:
            int r14 = r5.f312365W
            if (r11 <= r14) goto L_0x018e
            r11 = r14
        L_0x018e:
            r32 = r2
            r2 = r0
            r0 = r32
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            r22 = r2
            java.lang.String r2 = "doHWQosCtrl: nEncWidth: "
            r14.append(r2)
            r14.append(r0)
            java.lang.String r0 = ", nEncHeight: "
            r14.append(r0)
            r14.append(r11)
            java.lang.String r0 = ", mCapW: "
            r14.append(r0)
            int r0 = r5.f312363V
            r14.append(r0)
            r14.append(r9)
            int r0 = r5.f312365W
            r14.append(r0)
            java.lang.String r0 = ", stQoS.cCodecType: "
            r14.append(r0)
            com.tencent.mm.plugin.cloudvoip.cloudvoice.service.a r0 = r5.f312356R0
            byte r0 = r0.f312138e
            r14.append(r0)
            java.lang.String r0 = r14.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r12, r0)
            com.tencent.mm.plugin.cloudvoip.cloudvoice.service.a r0 = r5.f312356R0
            byte r2 = r0.f312138e
            r11 = 8
            if (r11 == r2) goto L_0x01e4
            r14 = 4
            if (r14 != r2) goto L_0x01db
            goto L_0x01e4
        L_0x01db:
            r14 = 2
            r17[r3] = r14
            r24 = r9
            r23 = r13
            goto L_0x041c
        L_0x01e4:
            int r14 = r5.f312371Z
            r19 = r14 & 1
            if (r19 != 0) goto L_0x01ee
            if (r11 != r2) goto L_0x01ee
            r11 = 1
            goto L_0x01ef
        L_0x01ee:
            r11 = 0
        L_0x01ef:
            r14 = r14 & 2
            if (r14 != 0) goto L_0x01fa
            r14 = 4
            if (r14 != r2) goto L_0x01fa
            r23 = r13
            r14 = 1
            goto L_0x01fd
        L_0x01fa:
            r23 = r13
            r14 = 0
        L_0x01fd:
            byte r13 = r0.f312139f
            if (r13 == 0) goto L_0x03a1
            if (r11 != 0) goto L_0x0205
            if (r14 == 0) goto L_0x03a1
        L_0x0205:
            byte r11 = r0.f312140g
            r14 = 1
            if (r14 != r11) goto L_0x0212
            r0 = 16
            r17[r3] = r0
            r24 = r9
            goto L_0x039b
        L_0x0212:
            if (r4 == 0) goto L_0x0219
            com.tencent.mm.plugin.cloudvoip.cloudvoice.service.j[] r14 = r5.f312395y0
            r14 = r14[r3]
            goto L_0x021d
        L_0x0219:
            com.tencent.mm.plugin.cloudvoip.cloudvoice.service.j[] r14 = r5.f312354Q0
            r14 = r14[r3]
        L_0x021d:
            boolean r15 = r5.f312358S0
            if (r15 == 0) goto L_0x023f
            if (r14 != 0) goto L_0x023f
            r25 = 320(0x140, float:4.48E-43)
            r26 = 240(0xf0, float:3.36E-43)
            byte r2 = r0.f312135b
            short r0 = r0.f312134a
            r29 = -1
            com.tencent.mm.plugin.cloudvoip.cloudvoice.service.j r14 = new com.tencent.mm.plugin.cloudvoip.cloudvoice.service.j
            java.lang.String r30 = "video/avc"
            r24 = r14
            r27 = r2
            r28 = r0
            r24.<init>(r25, r26, r27, r28, r29, r30)
            r24 = r9
            goto L_0x032a
        L_0x023f:
            com.tencent.mm.plugin.cloudvoip.cloudvoice.service.a r15 = r14.f312245v
            r24 = r9
            if (r15 == 0) goto L_0x032a
            com.tencent.mm.compatible.deviceinfo.a r9 = r14.f312225b
            if (r9 != 0) goto L_0x024b
            goto L_0x032a
        L_0x024b:
            short r9 = r0.f312134a
            r15.f312134a = r9
            byte r1 = r0.f312135b
            r15.f312135b = r1
            byte r1 = r0.f312136c
            r15.f312136c = r1
            byte r1 = r0.f312137d
            r15.f312137d = r1
            r15.f312138e = r2
            r15.f312139f = r13
            r15.f312140g = r11
            byte r1 = r0.f312141h
            r15.f312141h = r1
            byte r1 = r0.f312142i
            r15.f312142i = r1
            byte r0 = r0.f312143j
            r15.f312143j = r0
            double r0 = (double) r9
            r25 = 4607632778762754458(0x3ff199999999999a, double:1.1)
            double r0 = r0 * r25
            int r1 = (int) r0
            int r0 = r14.f312230g
            if (r0 == r1) goto L_0x02e3
            android.os.Bundle r0 = new android.os.Bundle     // Catch:{ Exception -> 0x02a2 }
            r0.<init>()     // Catch:{ Exception -> 0x02a2 }
            int r2 = r1 * 1000
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x02a2 }
            r9.<init>()     // Catch:{ Exception -> 0x02a2 }
            java.lang.String r11 = "steve: setRates: "
            r9.append(r11)     // Catch:{ Exception -> 0x02a2 }
            r9.append(r2)     // Catch:{ Exception -> 0x02a2 }
            java.lang.String r9 = r9.toString()     // Catch:{ Exception -> 0x02a2 }
            com.tencent.p014mm.sdk.platformtools.Log.m105926v(r10, r9)     // Catch:{ Exception -> 0x02a2 }
            java.lang.String r9 = "video-bitrate"
            r0.putInt(r9, r2)     // Catch:{ Exception -> 0x02a2 }
            com.tencent.mm.compatible.deviceinfo.a r2 = r14.f312225b     // Catch:{ Exception -> 0x02a2 }
            r2.mo148220w(r0)     // Catch:{ Exception -> 0x02a2 }
            goto L_0x02b8
        L_0x02a2:
            r0 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r9 = "steve: setRates failed:"
            r2.append(r9)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r10, r0)
        L_0x02b8:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "steve[QoS]: Update BR! frameID: "
            r0.append(r2)
            int r2 = com.tencent.p014mm.plugin.cloudvoip.cloudvoice.service.C105152j.f312221x
            r0.append(r2)
            java.lang.String r2 = ", new_br: "
            r0.append(r2)
            int r2 = r14.f312230g
            r0.append(r2)
            java.lang.String r2 = ", tuneBR:"
            r0.append(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r0)
            r14.f312230g = r1
        L_0x02e3:
            com.tencent.mm.plugin.cloudvoip.cloudvoice.service.a r0 = r14.f312245v
            byte r0 = r0.f312141h
            r1 = 1
            if (r1 != r0) goto L_0x0320
            int r0 = com.tencent.p014mm.plugin.cloudvoip.cloudvoice.service.C105152j.f312221x
            if (r0 <= 0) goto L_0x0320
            com.tencent.mm.compatible.deviceinfo.a r0 = r14.f312225b
            if (r0 == 0) goto L_0x0309
            java.lang.String r0 = "steve: Sync frame request soon!"
            com.tencent.p014mm.sdk.platformtools.Log.m105926v(r10, r0)
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.lang.String r1 = "request-sync"
            r2 = 0
            r0.putInt(r1, r2)
            com.tencent.mm.compatible.deviceinfo.a r1 = r14.f312225b
            r1.mo148220w(r0)
        L_0x0309:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "steve[QoS]: Force I Frame! frameID: "
            r0.append(r1)
            int r1 = com.tencent.p014mm.plugin.cloudvoip.cloudvoice.service.C105152j.f312221x
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r0)
        L_0x0320:
            com.tencent.mm.plugin.cloudvoip.cloudvoice.service.a r0 = r14.f312245v
            byte r0 = r0.f312135b
            int r1 = r14.f312229f
            if (r0 == r1) goto L_0x032a
            r14.f312229f = r0
        L_0x032a:
            com.tencent.mm.plugin.cloudvoip.cloudvoice.service.a r0 = r5.f312356R0
            byte r0 = r0.f312138e
            r1 = 8
            if (r1 != r0) goto L_0x0336
            r2 = 4
            r17[r3] = r2
            goto L_0x0338
        L_0x0336:
            r17[r3] = r1
        L_0x0338:
            java.lang.String r0 = ", pEncModeList["
            if (r4 == 0) goto L_0x036b
            com.tencent.mm.plugin.cloudvoip.cloudvoice.service.j[] r1 = r5.f312395y0
            r1[r3] = r14
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r6)
            r1.append(r3)
            r1.append(r8)
            com.tencent.mm.plugin.cloudvoip.cloudvoice.service.j[] r2 = r5.f312395y0
            r2 = r2[r3]
            r1.append(r2)
            r1.append(r0)
            r1.append(r3)
            r1.append(r8)
            r0 = r17[r3]
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r12, r0)
            goto L_0x0399
        L_0x036b:
            com.tencent.mm.plugin.cloudvoip.cloudvoice.service.j[] r1 = r5.f312354Q0
            r1[r3] = r14
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r7)
            r1.append(r3)
            r1.append(r8)
            com.tencent.mm.plugin.cloudvoip.cloudvoice.service.j[] r2 = r5.f312354Q0
            r2 = r2[r3]
            r1.append(r2)
            r1.append(r0)
            r1.append(r3)
            r1.append(r8)
            r0 = r17[r3]
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r12, r0)
        L_0x0399:
            r14.f312231h = r3
        L_0x039b:
            r0 = r22
            r13 = r23
            goto L_0x042f
        L_0x03a1:
            r24 = r9
            r1 = 1
            java.lang.Object[] r0 = new java.lang.Object[r1]
            java.lang.Byte r1 = java.lang.Byte.valueOf(r2)
            r2 = 0
            r0[r2] = r1
            java.lang.String r1 = "herohe:[Waring] Engine should already disable HWCodec:%d!!!"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r12, r1, r0)
            com.tencent.mm.plugin.cloudvoip.cloudvoice.service.a r0 = r5.f312356R0
            byte r0 = r0.f312138e
            if (r0 >= 0) goto L_0x03ce
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Error targetCodec: "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r12, r0)
            r2 = 2
            goto L_0x0407
        L_0x03ce:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "closecodec: targetCodec: "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r2 = "codecFlag: "
            r1.append(r2)
            r2 = 2
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r1)
            r1 = 6
            java.nio.ByteBuffer r9 = java.nio.ByteBuffer.allocate(r1)
            r9.order(r15)
            r9.putShort(r2)
            short r0 = (short) r0
            r9.putShort(r0)
            r11 = 0
            r9.putShort(r11)
            r0 = 39
            byte[] r9 = r9.array()
            com.tencent.p014mm.plugin.cloudvoip.cloudvoice.service.C105172s.m141221b(r0, r9, r1)
        L_0x0407:
            r17[r3] = r2
            com.tencent.mm.plugin.cloudvoip.cloudvoice.service.a r0 = r5.f312356R0
            byte r0 = r0.f312138e
            r1 = 4
            if (r0 != r1) goto L_0x0416
            int r0 = r5.f312371Z
            r0 = r0 | r2
            r5.f312371Z = r0
            goto L_0x041c
        L_0x0416:
            int r0 = r5.f312371Z
            r1 = 1
            r0 = r0 | r1
            r5.f312371Z = r0
        L_0x041c:
            r0 = r22
            r13 = r23
            r18 = 1
            goto L_0x042f
        L_0x0423:
            r24 = r9
            goto L_0x042f
        L_0x0426:
            r24 = r9
            r21 = r11
            java.lang.String r1 = "get qos param failed!"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r12, r1)
        L_0x042f:
            int r3 = r3 + 1
            r15 = 2
            r1 = r33
            r2 = r20
            r11 = r21
            r9 = r24
            goto L_0x005c
        L_0x043c:
            r24 = r9
            r21 = r11
            if (r4 == 0) goto L_0x0447
            r1 = r18
            r5.f312384p0 = r1
            goto L_0x0450
        L_0x0447:
            r1 = r18
            r5.f312393x0 = r1
            goto L_0x0450
        L_0x044c:
            r24 = r9
            r21 = r11
        L_0x0450:
            r1 = r33
            com.tencent.mm.plugin.cloudvoip.cloudvoice.service.w r0 = r1.f312288h
            int r2 = r0.f312363V
            int r3 = r1.f312285e
            if (r2 != r3) goto L_0x0460
            int r2 = r0.f312365W
            int r5 = r1.f312286f
            if (r2 == r5) goto L_0x0466
        L_0x0460:
            r0.f312363V = r3
            int r2 = r1.f312286f
            r0.f312365W = r2
        L_0x0466:
            if (r4 == 0) goto L_0x046b
            int[] r2 = r0.f312367X
            goto L_0x046d
        L_0x046b:
            int[] r2 = r0.f312369Y
        L_0x046d:
            if (r4 != 0) goto L_0x09cd
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "nSendVideoData, mCapW: "
            r0.append(r3)
            com.tencent.mm.plugin.cloudvoip.cloudvoice.service.w r3 = r1.f312288h
            int r3 = r3.f312363V
            r0.append(r3)
            r3 = r24
            r0.append(r3)
            com.tencent.mm.plugin.cloudvoip.cloudvoice.service.w r3 = r1.f312288h
            int r3 = r3.f312365W
            r0.append(r3)
            java.lang.String r3 = ", width: "
            r0.append(r3)
            int r3 = r1.f312285e
            r0.append(r3)
            java.lang.String r3 = ", height: "
            r0.append(r3)
            int r3 = r1.f312286f
            r0.append(r3)
            java.lang.String r3 = ", bIsScreen: "
            r0.append(r3)
            r0.append(r4)
            java.lang.String r3 = ", mIsHWEncEnable: "
            r0.append(r3)
            com.tencent.mm.plugin.cloudvoip.cloudvoice.service.w r3 = r1.f312288h
            boolean r3 = r3.f312358S0
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r12, r0)
            r0 = r1
            r3 = 0
            r5 = 2
        L_0x04be:
            if (r3 >= r5) goto L_0x09c9
            r9 = r2[r3]
            r11 = 4
            r13 = 8
            if (r9 != r11) goto L_0x04c9
            r14 = 1
            goto L_0x04ca
        L_0x04c9:
            r14 = 0
        L_0x04ca:
            if (r9 != r13) goto L_0x04ce
            r9 = 1
            goto L_0x04cf
        L_0x04ce:
            r9 = 0
        L_0x04cf:
            java.lang.Object[] r15 = new java.lang.Object[r5]
            java.lang.Integer r5 = java.lang.Integer.valueOf(r3)
            r16 = 0
            r15[r16] = r5
            r5 = r2[r3]
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r17 = 1
            r15[r17] = r5
            java.lang.String r5 = "pEncModeList[%d] = %d, "
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r12, r5, r15)
            java.lang.String r5 = "] = "
            if (r4 == 0) goto L_0x0512
            com.tencent.mm.plugin.cloudvoip.cloudvoice.service.w r15 = r0.f312288h
            com.tencent.mm.plugin.cloudvoip.cloudvoice.service.j[] r15 = r15.f312395y0
            r15 = r15[r3]
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r6)
            r11.append(r3)
            r11.append(r5)
            com.tencent.mm.plugin.cloudvoip.cloudvoice.service.w r5 = r0.f312288h
            com.tencent.mm.plugin.cloudvoip.cloudvoice.service.j[] r5 = r5.f312395y0
            r5 = r5[r3]
            r11.append(r5)
            java.lang.String r5 = r11.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r12, r5)
            goto L_0x0536
        L_0x0512:
            com.tencent.mm.plugin.cloudvoip.cloudvoice.service.w r11 = r0.f312288h
            com.tencent.mm.plugin.cloudvoip.cloudvoice.service.j[] r11 = r11.f312354Q0
            r15 = r11[r3]
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r7)
            r11.append(r3)
            r11.append(r5)
            com.tencent.mm.plugin.cloudvoip.cloudvoice.service.w r5 = r0.f312288h
            com.tencent.mm.plugin.cloudvoip.cloudvoice.service.j[] r5 = r5.f312354Q0
            r5 = r5[r3]
            r11.append(r5)
            java.lang.String r5 = r11.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r12, r5)
        L_0x0536:
            if (r15 == 0) goto L_0x0975
            if (r14 != 0) goto L_0x053c
            if (r9 == 0) goto L_0x0975
        L_0x053c:
            byte[] r5 = r0.f312287g
            int r11 = r0.f312285e
            int r13 = r0.f312286f
            int r0 = r0.f312284d
            r17 = r2
            r2 = r0 & 128(0x80, float:1.794E-43)
            if (r2 == 0) goto L_0x054c
            r2 = 1
            goto L_0x054d
        L_0x054c:
            r2 = 0
        L_0x054d:
            r15.f312232i = r2
            int r2 = r15.f312235l
            if (r11 != r2) goto L_0x0557
            int r2 = r15.f312236m
            if (r13 == r2) goto L_0x055b
        L_0x0557:
            r15.f312235l = r11
            r15.f312236m = r13
        L_0x055b:
            byte[] r2 = r15.f312237n
            if (r2 != 0) goto L_0x056d
            int r2 = r15.f312235l
            int r11 = r15.f312236m
            int r2 = r2 * r11
            int r2 = r2 * 3
            r11 = 2
            int r2 = r2 / r11
            byte[] r2 = new byte[r2]
            r15.f312237n = r2
        L_0x056d:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r11 = "steve: m_framerate: "
            r2.append(r11)
            int r11 = r15.f312229f
            r2.append(r11)
            java.lang.String r11 = ", m_br_kbps:"
            r2.append(r11)
            int r11 = r15.f312230g
            r2.append(r11)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r10, r2)
            com.tencent.mm.plugin.cloudvoip.cloudvoice.service.a r2 = r15.f312245v
            byte r2 = r2.f312140g
            java.lang.String r11 = " error:"
            if (r2 != 0) goto L_0x06aa
            int r2 = r5.length
            int r13 = r15.f312235l
            r18 = r6
            int r6 = r15.f312236m
            r20 = r7
            byte[] r7 = r15.f312237n
            com.tencent.wxmm.v2conference r22 = com.tencent.p014mm.plugin.cloudvoip.cloudvoice.service.C105172s.f312297c
            r23 = r5
            r24 = r2
            r25 = r13
            r26 = r6
            r27 = r0
            r28 = r7
            r29 = r13
            r30 = r6
            int r2 = r22.videoHWProcess(r23, r24, r25, r26, r27, r28, r29, r30)
            if (r2 >= 0) goto L_0x05ed
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "videoHWProcess failed! length: "
            r6.append(r7)
            int r5 = r5.length
            r6.append(r5)
            java.lang.String r5 = ", m_CapW: "
            r6.append(r5)
            int r5 = r15.f312235l
            r6.append(r5)
            java.lang.String r5 = ", m_CapH: "
            r6.append(r5)
            int r5 = r15.f312236m
            r6.append(r5)
            java.lang.String r5 = ", format: "
            r6.append(r5)
            r6.append(r0)
            java.lang.String r0 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r10, r0)
            goto L_0x069d
        L_0x05ed:
            byte[] r2 = r15.f312237n
            com.tencent.wxmm.v2conference r0 = com.tencent.p014mm.plugin.cloudvoip.cloudvoice.service.C105172s.f312297c
            int r5 = r0.field_HWEncW
            int r0 = r0.field_HWEncH
            int r6 = r15.f312227d
            if (r6 != r5) goto L_0x0605
            int r6 = r15.f312228e
            if (r6 != r0) goto L_0x0605
            com.tencent.mm.compatible.deviceinfo.a r6 = r15.f312225b
            if (r6 != 0) goto L_0x0602
            goto L_0x0605
        L_0x0602:
            r5 = 0
            goto L_0x06a7
        L_0x0605:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "restart encoder! clipWH:"
            r6.append(r7)
            r6.append(r5)
            java.lang.String r7 = "x"
            r6.append(r7)
            r6.append(r0)
            java.lang.String r13 = ", wh:"
            r6.append(r13)
            int r13 = r15.f312227d
            r6.append(r13)
            r6.append(r7)
            int r7 = r15.f312228e
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r6)
            r15.f312227d = r5
            r15.f312228e = r0
            int r5 = r5 * r0
            int r5 = r5 * 3
            r6 = 1
            int r0 = r5 >> 1
            r15.f312246w = r0
            int r0 = r15.mo149472a()     // Catch:{ Exception -> 0x0648 }
        L_0x0646:
            r5 = r0
            goto L_0x066a
        L_0x0648:
            r0 = move-exception
            r5 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r6 = "mediacodec init error: "
            r0.append(r6)
            java.lang.String r5 = r5.getMessage()
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r10, r0)
            r0 = 2003(0x7d3, float:2.807E-42)
            r15.f312224a = r0
            int r0 = r15.f312224a
            int r0 = -r0
            goto L_0x0646
        L_0x066a:
            if (r5 >= 0) goto L_0x06a7
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "mediacodec init failed, stop HW encoding! ret: "
            r0.append(r2)
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r10, r0)
            r15.mo149473b()     // Catch:{ Exception -> 0x0684 }
            goto L_0x069c
        L_0x0684:
            r0 = move-exception
            r2 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r11)
            java.lang.String r2 = r2.toString()
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r10, r0)
        L_0x069c:
            r2 = r5
        L_0x069d:
            r30 = r4
            r31 = r8
            r25 = r9
            r24 = r14
            goto L_0x0886
        L_0x06a7:
            int r0 = com.tencent.p014mm.plugin.cloudvoip.cloudvoice.service.C105152j.f312221x
            goto L_0x06b0
        L_0x06aa:
            r18 = r6
            r20 = r7
            r2 = 0
            r5 = 0
        L_0x06b0:
            if (r2 == 0) goto L_0x0900
            com.tencent.mm.compatible.deviceinfo.a r0 = r15.f312225b
            if (r0 == 0) goto L_0x0900
            r6 = 0
            r15.f312244u = r6     // Catch:{ Exception -> 0x08df }
            long r6 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x08df }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x08df }
            r0.<init>()     // Catch:{ Exception -> 0x08df }
            java.lang.String r13 = "steve: put YUV into encoder, size:"
            r0.append(r13)     // Catch:{ Exception -> 0x08df }
            int r13 = r15.f312246w     // Catch:{ Exception -> 0x08df }
            r0.append(r13)     // Catch:{ Exception -> 0x08df }
            java.lang.String r13 = ", idx:"
            r0.append(r13)     // Catch:{ Exception -> 0x08df }
            int r13 = com.tencent.p014mm.plugin.cloudvoip.cloudvoice.service.C105152j.f312221x     // Catch:{ Exception -> 0x08df }
            r0.append(r13)     // Catch:{ Exception -> 0x08df }
            java.lang.String r13 = ", time:"
            r0.append(r13)     // Catch:{ Exception -> 0x08df }
            r0.append(r6)     // Catch:{ Exception -> 0x08df }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x08df }
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r10, r0)     // Catch:{ Exception -> 0x08df }
            com.tencent.mm.compatible.deviceinfo.a r0 = r15.f312225b     // Catch:{ Exception -> 0x08df }
            java.nio.ByteBuffer[] r0 = r0.mo148208j()     // Catch:{ Exception -> 0x08df }
            com.tencent.mm.compatible.deviceinfo.a r6 = r15.f312225b     // Catch:{ Exception -> 0x08df }
            java.nio.ByteBuffer[] r6 = r6.mo148211m()     // Catch:{ Exception -> 0x08df }
            com.tencent.mm.compatible.deviceinfo.a r7 = r15.f312225b     // Catch:{ Exception -> 0x08df }
            r13 = r4
            r22 = r5
            r4 = -1
            int r24 = r7.mo148204f(r4)     // Catch:{ Exception -> 0x08d7 }
            if (r24 < 0) goto L_0x075f
            long r4 = r15.f312238o     // Catch:{ Exception -> 0x0758 }
            int r7 = r15.f312229f     // Catch:{ Exception -> 0x0758 }
            r30 = r13
            r13 = 15
            int r7 = java.lang.Math.max(r7, r13)     // Catch:{ Exception -> 0x0755 }
            r13 = 30
            int r7 = java.lang.Math.min(r7, r13)     // Catch:{ Exception -> 0x0755 }
            r25 = 0
            int r13 = (r4 > r25 ? 1 : (r4 == r25 ? 0 : -1))
            if (r13 == 0) goto L_0x0729
            long r4 = r15.f312239p     // Catch:{ Exception -> 0x0755 }
            int r13 = (r4 > r25 ? 1 : (r4 == r25 ? 0 : -1))
            if (r13 != 0) goto L_0x071e
            goto L_0x0729
        L_0x071e:
            r13 = 1000000(0xf4240, float:1.401298E-39)
            int r13 = r13 / r7
            r31 = r8
            long r7 = (long) r13
            long r4 = r4 + r7
            r15.f312239p = r4     // Catch:{ Exception -> 0x08d1 }
            goto L_0x072f
        L_0x0729:
            r31 = r8
            r4 = 132(0x84, double:6.5E-322)
            r15.f312239p = r4     // Catch:{ Exception -> 0x08d1 }
        L_0x072f:
            long r4 = r15.f312239p     // Catch:{ Exception -> 0x08d1 }
            r0 = r0[r24]     // Catch:{ Exception -> 0x08d1 }
            r0.clear()     // Catch:{ Exception -> 0x08d1 }
            int r7 = r15.f312246w     // Catch:{ Exception -> 0x08d1 }
            r8 = 0
            r0.put(r2, r8, r7)     // Catch:{ Exception -> 0x08d1 }
            com.tencent.mm.compatible.deviceinfo.a r0 = r15.f312225b     // Catch:{ Exception -> 0x08d1 }
            r25 = 0
            int r2 = r15.f312246w     // Catch:{ Exception -> 0x08d1 }
            r29 = 0
            r23 = r0
            r26 = r2
            r27 = r4
            r23.mo148213o(r24, r25, r26, r27, r29)     // Catch:{ Exception -> 0x08d1 }
            long r4 = r15.f312238o     // Catch:{ Exception -> 0x08d1 }
            r7 = 1
            long r4 = r4 + r7
            r15.f312238o = r4     // Catch:{ Exception -> 0x08d1 }
            goto L_0x0763
        L_0x0755:
            r0 = move-exception
            goto L_0x08e2
        L_0x0758:
            r0 = move-exception
            r31 = r8
            r30 = r13
            goto L_0x08d2
        L_0x075f:
            r31 = r8
            r30 = r13
        L_0x0763:
            android.media.MediaCodec$BufferInfo r0 = new android.media.MediaCodec$BufferInfo     // Catch:{ Exception -> 0x08d1 }
            r0.<init>()     // Catch:{ Exception -> 0x08d1 }
            com.tencent.mm.compatible.deviceinfo.a r2 = r15.f312225b     // Catch:{ Exception -> 0x08d1 }
            r4 = 12000(0x2ee0, float:1.6816E-41)
            long r4 = (long) r4     // Catch:{ Exception -> 0x08d1 }
            int r2 = r2.mo148205g(r0, r4)     // Catch:{ Exception -> 0x08d1 }
            r7 = -2
            if (r2 != r7) goto L_0x078f
            com.tencent.mm.compatible.deviceinfo.a r7 = r15.f312225b     // Catch:{ Exception -> 0x08d1 }
            android.media.MediaFormat r7 = r7.mo148212n()     // Catch:{ Exception -> 0x08d1 }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x08d1 }
            r8.<init>()     // Catch:{ Exception -> 0x08d1 }
            java.lang.String r13 = "steve: encoder output format changed: "
            r8.append(r13)     // Catch:{ Exception -> 0x08d1 }
            r8.append(r7)     // Catch:{ Exception -> 0x08d1 }
            java.lang.String r7 = r8.toString()     // Catch:{ Exception -> 0x08d1 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r7)     // Catch:{ Exception -> 0x08d1 }
        L_0x078f:
            if (r2 < 0) goto L_0x08cb
            r7 = r6[r2]     // Catch:{ Exception -> 0x08d1 }
            int r8 = r0.size     // Catch:{ Exception -> 0x08d1 }
            byte[] r13 = new byte[r8]     // Catch:{ Exception -> 0x08d1 }
            r7.get(r13)     // Catch:{ Exception -> 0x08d1 }
            int r7 = r0.flags     // Catch:{ Exception -> 0x08d1 }
            r23 = r6
            java.lang.String r6 = "mediacodec reinit error: "
            r24 = r14
            java.lang.String r14 = ", checkCodeForBSlice:"
            java.lang.String r1 = "steve:B-frames exist in High Profile, reset to Baseline!!!,maxAllowedProfile:"
            r25 = r9
            r9 = 2
            if (r7 != r9) goto L_0x082d
            int r7 = r15.f312241r     // Catch:{ Exception -> 0x08c8 }
            r9 = 1
            if (r7 == r9) goto L_0x0805
            com.tencent.mm.plugin.voip.model.h r7 = r15.f312240q     // Catch:{ Exception -> 0x08c8 }
            boolean r7 = r7.mo152584b(r13)     // Catch:{ Exception -> 0x08c8 }
            if (r7 == 0) goto L_0x0805
            com.tencent.mm.plugin.voip.model.h r0 = r15.f312240q     // Catch:{ Exception -> 0x08c8 }
            int r0 = r0.f317324a     // Catch:{ Exception -> 0x08c8 }
            r15.f312243t = r0     // Catch:{ Exception -> 0x08c8 }
            r2 = 1
            r15.f312242s = r2     // Catch:{ Exception -> 0x08c8 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x08c8 }
            r0.<init>()     // Catch:{ Exception -> 0x08c8 }
            r0.append(r1)     // Catch:{ Exception -> 0x08c8 }
            int r1 = r15.f312242s     // Catch:{ Exception -> 0x08c8 }
            r0.append(r1)     // Catch:{ Exception -> 0x08c8 }
            r0.append(r14)     // Catch:{ Exception -> 0x08c8 }
            int r1 = r15.f312243t     // Catch:{ Exception -> 0x08c8 }
            r0.append(r1)     // Catch:{ Exception -> 0x08c8 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x08c8 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r0)     // Catch:{ Exception -> 0x08c8 }
            int r0 = r15.mo149472a()     // Catch:{ Exception -> 0x07e5 }
        L_0x07e2:
            r2 = r0
            goto L_0x0886
        L_0x07e5:
            r0 = move-exception
            r1 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x08c8 }
            r0.<init>()     // Catch:{ Exception -> 0x08c8 }
            r0.append(r6)     // Catch:{ Exception -> 0x08c8 }
            java.lang.String r1 = r1.getMessage()     // Catch:{ Exception -> 0x08c8 }
            r0.append(r1)     // Catch:{ Exception -> 0x08c8 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x08c8 }
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r10, r0)     // Catch:{ Exception -> 0x08c8 }
            r1 = 2005(0x7d5, float:2.81E-42)
            r15.f312224a = r1     // Catch:{ Exception -> 0x08c8 }
            int r0 = r15.f312224a     // Catch:{ Exception -> 0x08c8 }
            goto L_0x0883
        L_0x0805:
            byte[] r1 = r15.f312233j     // Catch:{ Exception -> 0x08c8 }
            if (r1 != 0) goto L_0x080f
            int r1 = r0.size     // Catch:{ Exception -> 0x08c8 }
            byte[] r1 = new byte[r1]     // Catch:{ Exception -> 0x08c8 }
            r15.f312233j = r1     // Catch:{ Exception -> 0x08c8 }
        L_0x080f:
            byte[] r1 = r15.f312233j     // Catch:{ Exception -> 0x08c8 }
            if (r1 == 0) goto L_0x0822
            int r6 = r0.size     // Catch:{ Exception -> 0x08c8 }
            int r1 = r1.length     // Catch:{ Exception -> 0x08c8 }
            if (r6 <= r1) goto L_0x081c
            byte[] r1 = new byte[r6]     // Catch:{ Exception -> 0x08c8 }
            r15.f312233j = r1     // Catch:{ Exception -> 0x08c8 }
        L_0x081c:
            byte[] r1 = r15.f312233j     // Catch:{ Exception -> 0x08c8 }
            r7 = 0
            java.lang.System.arraycopy(r13, r7, r1, r7, r6)     // Catch:{ Exception -> 0x08c6 }
        L_0x0822:
            r1 = 0
            r15.f312234k = r1     // Catch:{ Exception -> 0x08c8 }
            int r1 = r0.flags     // Catch:{ Exception -> 0x08c8 }
            r15.mo149474c(r13, r1, r8)     // Catch:{ Exception -> 0x08c8 }
            r1 = 1
            goto L_0x08a7
        L_0x082d:
            int r7 = r15.f312241r     // Catch:{ Exception -> 0x08c8 }
            r9 = 1
            if (r7 == r9) goto L_0x088a
            com.tencent.mm.plugin.voip.model.h r7 = r15.f312240q     // Catch:{ Exception -> 0x08c8 }
            boolean r7 = r7.mo152585c(r13)     // Catch:{ Exception -> 0x08c8 }
            if (r7 == 0) goto L_0x088a
            com.tencent.mm.plugin.voip.model.h r0 = r15.f312240q     // Catch:{ Exception -> 0x08c8 }
            int r0 = r0.f317324a     // Catch:{ Exception -> 0x08c8 }
            r15.f312243t = r0     // Catch:{ Exception -> 0x08c8 }
            r2 = 1
            r15.f312242s = r2     // Catch:{ Exception -> 0x08c8 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x08c8 }
            r0.<init>()     // Catch:{ Exception -> 0x08c8 }
            r0.append(r1)     // Catch:{ Exception -> 0x08c8 }
            int r1 = r15.f312242s     // Catch:{ Exception -> 0x08c8 }
            r0.append(r1)     // Catch:{ Exception -> 0x08c8 }
            r0.append(r14)     // Catch:{ Exception -> 0x08c8 }
            int r1 = r15.f312243t     // Catch:{ Exception -> 0x08c8 }
            r0.append(r1)     // Catch:{ Exception -> 0x08c8 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x08c8 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r0)     // Catch:{ Exception -> 0x08c8 }
            int r0 = r15.mo149472a()     // Catch:{ Exception -> 0x0865 }
            goto L_0x07e2
        L_0x0865:
            r0 = move-exception
            r1 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x08c8 }
            r0.<init>()     // Catch:{ Exception -> 0x08c8 }
            r0.append(r6)     // Catch:{ Exception -> 0x08c8 }
            java.lang.String r1 = r1.getMessage()     // Catch:{ Exception -> 0x08c8 }
            r0.append(r1)     // Catch:{ Exception -> 0x08c8 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x08c8 }
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r10, r0)     // Catch:{ Exception -> 0x08c8 }
            r1 = 2005(0x7d5, float:2.81E-42)
            r15.f312224a = r1     // Catch:{ Exception -> 0x08c8 }
            int r0 = r15.f312224a     // Catch:{ Exception -> 0x08c8 }
        L_0x0883:
            int r0 = -r0
            goto L_0x07e2
        L_0x0886:
            r5 = r2
            r7 = 0
            goto L_0x091c
        L_0x088a:
            boolean r1 = r15.f312234k     // Catch:{ Exception -> 0x08c8 }
            if (r1 == 0) goto L_0x089f
            int r1 = r0.flags     // Catch:{ Exception -> 0x08c8 }
            r6 = 1
            if (r1 != r6) goto L_0x089f
            java.lang.String r1 = "Need send SPS and PPS!!!"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r1)     // Catch:{ Exception -> 0x08c8 }
            byte[] r1 = r15.f312233j     // Catch:{ Exception -> 0x08c8 }
            int r6 = r1.length     // Catch:{ Exception -> 0x08c8 }
            r7 = 2
            r15.mo149474c(r1, r7, r6)     // Catch:{ Exception -> 0x08c8 }
        L_0x089f:
            int r1 = r0.flags     // Catch:{ Exception -> 0x08c8 }
            r15.mo149474c(r13, r1, r8)     // Catch:{ Exception -> 0x08c8 }
            r1 = 1
            r15.f312234k = r1     // Catch:{ Exception -> 0x08c8 }
        L_0x08a7:
            int r6 = r0.flags     // Catch:{ Exception -> 0x08c8 }
            int r7 = com.tencent.p014mm.plugin.cloudvoip.cloudvoice.service.C105152j.f312221x     // Catch:{ Exception -> 0x08c8 }
            int r7 = r7 + r1
            com.tencent.p014mm.plugin.cloudvoip.cloudvoice.service.C105152j.f312221x = r7     // Catch:{ Exception -> 0x08c8 }
            com.tencent.mm.compatible.deviceinfo.a r1 = r15.f312225b     // Catch:{ Exception -> 0x08c8 }
            r7 = 0
            r1.mo148216r(r2, r7)     // Catch:{ Exception -> 0x08c6 }
            com.tencent.mm.compatible.deviceinfo.a r1 = r15.f312225b     // Catch:{ Exception -> 0x08c6 }
            int r2 = r1.mo148205g(r0, r4)     // Catch:{ Exception -> 0x08c6 }
            r1 = r33
            r22 = r6
            r6 = r23
            r14 = r24
            r9 = r25
            goto L_0x078f
        L_0x08c6:
            r0 = move-exception
            goto L_0x08e5
        L_0x08c8:
            r0 = move-exception
        L_0x08c9:
            r7 = 0
            goto L_0x08e5
        L_0x08cb:
            r25 = r9
            r24 = r14
            r7 = 0
            goto L_0x091a
        L_0x08d1:
            r0 = move-exception
        L_0x08d2:
            r25 = r9
        L_0x08d4:
            r24 = r14
            goto L_0x08c9
        L_0x08d7:
            r0 = move-exception
            r31 = r8
            r25 = r9
            r30 = r13
            goto L_0x08d4
        L_0x08df:
            r0 = move-exception
            r30 = r4
        L_0x08e2:
            r31 = r8
            goto L_0x08d2
        L_0x08e5:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r11)
            java.lang.String r0 = r0.toString()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r10, r0)
            r0 = 2004(0x7d4, float:2.808E-42)
            r15.f312224a = r0
            goto L_0x0918
        L_0x0900:
            r30 = r4
            r22 = r5
            r31 = r8
            r25 = r9
            r24 = r14
            r7 = 0
            int r0 = r15.f312244u
            int r1 = r0 + 1
            r15.f312244u = r1
            r1 = 5
            if (r0 <= r1) goto L_0x091a
            r0 = 2006(0x7d6, float:2.811E-42)
            r15.f312224a = r0
        L_0x0918:
            int r5 = -r0
            goto L_0x091c
        L_0x091a:
            r5 = r22
        L_0x091c:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = r21
            r0.append(r1)
            r0.append(r3)
            java.lang.String r2 = "DoMediacodecEnc, ret: "
            r0.append(r2)
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r12, r0)
            if (r5 < 0) goto L_0x093e
            r5 = 2
            r2 = r33
            goto L_0x0971
        L_0x093e:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "StopHWEnc!! hw encoder error: "
            r0.append(r2)
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r12, r0)
            if (r25 == 0) goto L_0x095f
            r2 = r33
            com.tencent.mm.plugin.cloudvoip.cloudvoice.service.w r0 = r2.f312288h
            int r4 = r0.f312371Z
            r5 = 2
            r4 = r4 | r5
            r0.f312371Z = r4
            goto L_0x096c
        L_0x095f:
            r5 = 2
            r2 = r33
            if (r24 == 0) goto L_0x096c
            com.tencent.mm.plugin.cloudvoip.cloudvoice.service.w r0 = r2.f312288h
            int r4 = r0.f312371Z
            r6 = 1
            r4 = r4 | r6
            r0.f312371Z = r4
        L_0x096c:
            com.tencent.mm.plugin.cloudvoip.cloudvoice.service.w r0 = r2.f312288h
            r0.getClass()
        L_0x0971:
            r0 = r2
            r6 = r31
            goto L_0x09b9
        L_0x0975:
            r17 = r2
            r30 = r4
            r18 = r6
            r20 = r7
            r31 = r8
            r25 = r9
            r24 = r14
            r5 = 2
            r7 = 0
            r2 = r1
            r1 = r21
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r6 = "pHWEnc["
            r4.append(r6)
            r4.append(r3)
            r6 = r31
            r4.append(r6)
            r4.append(r15)
            java.lang.String r8 = ", bIsHW264: "
            r4.append(r8)
            r8 = r24
            r4.append(r8)
            java.lang.String r8 = ", bIsHW265: "
            r4.append(r8)
            r8 = r25
            r4.append(r8)
            java.lang.String r4 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r12, r4)
        L_0x09b9:
            int r3 = r3 + 1
            r21 = r1
            r1 = r2
            r8 = r6
            r2 = r17
            r6 = r18
            r7 = r20
            r4 = r30
            goto L_0x04be
        L_0x09c9:
            r2 = r1
            r30 = r4
            goto L_0x09d4
        L_0x09cd:
            r2 = r1
            r30 = r4
            r1 = 1
            r0.f312384p0 = r1
            r0 = r2
        L_0x09d4:
            if (r30 == 0) goto L_0x09dc
            com.tencent.mm.plugin.cloudvoip.cloudvoice.service.w r1 = r0.f312288h
            boolean r1 = r1.f312384p0
            if (r1 != 0) goto L_0x09e4
        L_0x09dc:
            if (r30 != 0) goto L_0x09f2
            com.tencent.mm.plugin.cloudvoip.cloudvoice.service.w r1 = r0.f312288h
            boolean r1 = r1.f312393x0
            if (r1 == 0) goto L_0x09f2
        L_0x09e4:
            byte[] r4 = r0.f312287g
            int r6 = r0.f312285e
            int r7 = r0.f312286f
            int r8 = r0.f312284d
            com.tencent.wxmm.v2conference r3 = com.tencent.p014mm.plugin.cloudvoip.cloudvoice.service.C105172s.f312297c
            int r5 = r4.length
            r3.SendVideoData(r4, r5, r6, r7, r8)
        L_0x09f2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.cloudvoip.cloudvoice.service.C105167o0.run():void");
    }
}
