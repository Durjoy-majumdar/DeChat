package p1155sh;

import androidx.exifinterface.media.ExifInterface;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;

/* renamed from: sh.a */
public final class C110787a {

    /* renamed from: a */
    public boolean f331420a = true;

    /* renamed from: b */
    public Integer[] f331421b;

    /* renamed from: c */
    public Integer[] f331422c;

    public C110787a() {
        Integer[] numArr = new Integer[4];
        for (int i = 0; i < 4; i++) {
            numArr[i] = 0;
        }
        this.f331421b = numArr;
        Integer[] numArr2 = new Integer[4];
        for (int i2 = 0; i2 < 4; i2++) {
            numArr2[i2] = 0;
        }
        this.f331422c = numArr2;
    }

    /* renamed from: a */
    public final void mo162342a(int i, byte[] bArr) {
        C87412m.m108594g(bArr, "data");
        if (this.f331420a && i != 0) {
            int i2 = i / 2;
            short[] sArr = new short[i2];
            for (int i3 = 0; i3 < i2; i3++) {
                int i4 = i3 * 2;
                sArr[i3] = (short) (((bArr[i4 + 1] & ExifInterface.MARKER) << 8) | (bArr[i4] & ExifInterface.MARKER));
            }
            double d = 0.0d;
            for (int i5 = 0; i5 < i2; i5++) {
                short s = sArr[i5];
                d += (double) (s * s);
            }
            double sqrt = Math.sqrt(d / ((double) i2));
            if (sqrt < 50.0d) {
                Integer[] numArr = this.f331421b;
                numArr[0] = Integer.valueOf(numArr[0].intValue() + 1);
            } else if (sqrt < 300.0d) {
                Integer[] numArr2 = this.f331421b;
                numArr2[1] = Integer.valueOf(numArr2[1].intValue() + 1);
            } else if (sqrt < 2000.0d) {
                Integer[] numArr3 = this.f331421b;
                numArr3[2] = Integer.valueOf(numArr3[2].intValue() + 1);
            } else {
                Integer[] numArr4 = this.f331421b;
                numArr4[3] = Integer.valueOf(numArr4[3].intValue() + 1);
            }
        }
    }

    /* renamed from: b */
    public final void mo162343b(int i, int i2, String str, int i3) {
        String str2 = str;
        C87412m.m108594g(str2, "featureKey");
        int i4 = 0;
        for (Integer intValue : this.f331421b) {
            i4 += intValue.intValue();
        }
        if (i4 != 0) {
            int intValue2 = (this.f331421b[0].intValue() * 100) / i4;
            int intValue3 = (this.f331421b[1].intValue() * 100) / i4;
            int intValue4 = (this.f331421b[2].intValue() * 100) / i4;
            int intValue5 = (this.f331421b[3].intValue() * 100) / i4;
            int intValue6 = (this.f331422c[0].intValue() * 100) / i4;
            int intValue7 = (this.f331422c[1].intValue() * 100) / i4;
            int intValue8 = (this.f331422c[2].intValue() * 100) / i4;
            int intValue9 = (this.f331422c[3].intValue() * 100) / i4;
            Log.m105924i("MicroMsg.AudioPlayerReportUtil", "audioType = " + i + " ,scenes = " + i2 + ",featureKey=" + str2 + ",pcmSilent=" + intValue2 + ", pcmLow=" + intValue3 + ",pcmMiddle=" + intValue4 + ",pcmHigh=" + intValue5 + ",systemSilent=" + intValue6 + ",systemLow=" + intValue7 + ",systemMiddle=" + intValue8 + ",systemHigh=" + intValue9 + ",streamType=" + i3 + '}');
            C115669n.INSTANCE.mo160140o(18554, true, true, Integer.valueOf(i), Integer.valueOf(i2), str2, Integer.valueOf(intValue2), Integer.valueOf(intValue3), Integer.valueOf(intValue4), Integer.valueOf(intValue5), Integer.valueOf(intValue6), Integer.valueOf(intValue7), Integer.valueOf(intValue8), Integer.valueOf(intValue9), Integer.valueOf(i3));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:42:0x01bd  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x01c7  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo162344c(int r55) {
        /*
            r54 = this;
            r0 = r54
            r1 = r55
            boolean r2 = r0.f331420a
            if (r2 != 0) goto L_0x0009
            return
        L_0x0009:
            java.lang.Integer[] r2 = r0.f331421b
            int r3 = r2.length
            r5 = 0
            r6 = 0
        L_0x000e:
            if (r5 >= r3) goto L_0x001a
            r7 = r2[r5]
            int r7 = r7.intValue()
            int r6 = r6 + r7
            int r5 = r5 + 1
            goto L_0x000e
        L_0x001a:
            if (r6 == 0) goto L_0x065b
            java.lang.Integer[] r2 = r0.f331421b
            int r3 = r2.length
            r5 = 0
            r7 = 0
        L_0x0021:
            if (r5 >= r3) goto L_0x0646
            r8 = r2[r5]
            int r9 = r7 + 1
            int r8 = r8.intValue()
            r10 = 100
            int r8 = r8 * 100
            int r8 = r8 / r6
            long r14 = (long) r8
            boolean r11 = r0.f331420a
            java.lang.String r12 = "MicroMsg.VOIPPCMPlayerIDKeyStat"
            java.lang.String r13 = "MicroMsg.VoiceMsgPCMPlayerIDKeyStat"
            r16 = r13
            r13 = 1
            if (r11 != 0) goto L_0x003f
            r18 = r2
            goto L_0x0058
        L_0x003f:
            java.lang.String r11 = "markPCMAmplitudeHigh "
            java.lang.String r4 = "markPCMAmplitudeMiddle: "
            java.lang.String r10 = "markPCMAmplitudeInLow="
            r18 = r2
            java.lang.String r2 = "markPCMAmplitudeSilent "
            if (r1 == 0) goto L_0x0108
            if (r1 == r13) goto L_0x004e
            goto L_0x0058
        L_0x004e:
            if (r7 == 0) goto L_0x00db
            if (r7 == r13) goto L_0x00b1
            r2 = 2
            if (r7 == r2) goto L_0x0085
            r2 = 3
            if (r7 == r2) goto L_0x005e
        L_0x0058:
            r14 = r12
            r15 = r16
        L_0x005b:
            r12 = 1
            goto L_0x0118
        L_0x005e:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r11)
            r2.append(r14)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r2)
            com.tencent.mm.plugin.report.service.n r11 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r19 = 1207(0x4b7, double:5.963E-321)
            r21 = 28
            r2 = r12
            r10 = r16
            r4 = 1
            r12 = r19
            r16 = r14
            r14 = r21
            r11.mo175913w(r12, r14, r16)
            goto L_0x0104
        L_0x0085:
            r2 = r12
            r10 = r16
            r16 = r14
            r14 = 1
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r4)
            r12 = r16
            r11.append(r12)
            java.lang.String r4 = r11.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r4)
            com.tencent.mm.plugin.report.service.n r11 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r15 = 1207(0x4b7, double:5.963E-321)
            r19 = 21
            r21 = r12
            r12 = r15
            r4 = 1
            r14 = r19
            r16 = r21
            r11.mo175913w(r12, r14, r16)
            goto L_0x0104
        L_0x00b1:
            r2 = r12
            r21 = r14
            r14 = r16
            r4 = 1
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r10)
            r12 = r21
            r11.append(r12)
            java.lang.String r10 = r11.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r10)
            com.tencent.mm.plugin.report.service.n r11 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r15 = 1207(0x4b7, double:5.963E-321)
            r19 = 14
            r12 = r15
            r10 = r14
            r14 = r19
            r16 = r21
            r11.mo175913w(r12, r14, r16)
            goto L_0x0104
        L_0x00db:
            r21 = r14
            r10 = r16
            r4 = 1
            r14 = r12
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r2)
            r12 = r21
            r11.append(r12)
            java.lang.String r2 = r11.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r14, r2)
            com.tencent.mm.plugin.report.service.n r11 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r15 = 1207(0x4b7, double:5.963E-321)
            r19 = 7
            r12 = r15
            r2 = r14
            r14 = r19
            r16 = r21
            r11.mo175913w(r12, r14, r16)
        L_0x0104:
            r14 = r2
            r15 = r10
            goto L_0x005b
        L_0x0108:
            r21 = r14
            r15 = r16
            r14 = r12
            r12 = 1
            if (r7 == 0) goto L_0x0193
            if (r7 == r12) goto L_0x016d
            r2 = 2
            if (r7 == r2) goto L_0x0146
            r2 = 3
            if (r7 == r2) goto L_0x011d
        L_0x0118:
            r10 = r14
            r4 = r15
            r2 = 1
            goto L_0x01b9
        L_0x011d:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r11)
            r10 = r21
            r2.append(r10)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r15, r2)
            com.tencent.mm.plugin.report.service.n r2 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r16 = 1206(0x4b6, double:5.96E-321)
            r19 = 28
            r11 = r2
            r2 = 1
            r12 = r16
            r10 = r14
            r4 = r15
            r14 = r19
            r16 = r21
            r11.mo175913w(r12, r14, r16)
            goto L_0x01b9
        L_0x0146:
            r10 = r14
            r14 = r15
            r2 = 1
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r4)
            r12 = r21
            r11.append(r12)
            java.lang.String r4 = r11.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r14, r4)
            com.tencent.mm.plugin.report.service.n r11 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r15 = 1206(0x4b6, double:5.96E-321)
            r19 = 21
            r12 = r15
            r4 = r14
            r14 = r19
            r16 = r21
            r11.mo175913w(r12, r14, r16)
            goto L_0x01b9
        L_0x016d:
            r4 = r15
            r2 = 1
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r10)
            r12 = r21
            r11.append(r12)
            java.lang.String r10 = r11.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r10)
            com.tencent.mm.plugin.report.service.n r11 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r15 = 1206(0x4b6, double:5.96E-321)
            r19 = 14
            r12 = r15
            r10 = r14
            r14 = r19
            r16 = r21
            r11.mo175913w(r12, r14, r16)
            goto L_0x01b9
        L_0x0193:
            r10 = r14
            r4 = r15
            r14 = 1
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r2)
            r12 = r21
            r11.append(r12)
            java.lang.String r2 = r11.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r2)
            com.tencent.mm.plugin.report.service.n r11 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r15 = 1206(0x4b6, double:5.96E-321)
            r19 = 7
            r12 = r15
            r2 = 1
            r14 = r19
            r16 = r21
            r11.mo175913w(r12, r14, r16)
        L_0x01b9:
            boolean r11 = r0.f331420a
            if (r11 != 0) goto L_0x01c7
            r17 = r3
            r21 = r5
            r19 = r6
            r20 = r9
            goto L_0x0636
        L_0x01c7:
            java.lang.String r11 = "markPCMAmplitudeHighPercentAround40"
            java.lang.String r12 = "markPCMAmplitudeMiddlePercentAround40"
            java.lang.String r13 = "markPCMAmplitudeLowPercentAround40"
            java.lang.String r14 = "markPCMAmplitudeSilentPercentAround40"
            java.lang.String r15 = "markPCMAmplitudeHighPercentAround20"
            java.lang.String r2 = "markPCMAmplitudeMiddlePercentAround20"
            r17 = r3
            java.lang.String r3 = "markPCMAmplitudeLowPercentAround20"
            r19 = r6
            java.lang.String r6 = "markPCMAmplitudeSilentPercentAround20"
            r20 = r9
            java.lang.String r9 = "markPCMAmplitudeHighPercentAround0"
            java.lang.String r0 = "markPCMAmplitudeMiddlePercentAround0"
            r21 = r5
            java.lang.String r5 = "markPCMAmplitudeLowPercentAround0"
            r22 = r4
            java.lang.String r4 = "markPCMAmplitudeSilentPercentAround0"
            r23 = r14
            java.lang.String r14 = "markPCMAmplitudeMiddlePercentAround100"
            r24 = r6
            java.lang.String r6 = "markPCMAmplitudeHighPercentAround60"
            r25 = r4
            java.lang.String r4 = "markPCMAmplitudeMiddlePercentAround80"
            r26 = r13
            java.lang.String r13 = "markPCMAmplitudeLowPercentAround100"
            r27 = r13
            java.lang.String r13 = "markPCMAmplitudeMiddlePercentAround60"
            r28 = r3
            java.lang.String r3 = "markPCMAmplitudeLowPercentAround80"
            r29 = r3
            java.lang.String r3 = "markPCMAmplitudeSilentPercentAround100"
            r30 = r3
            java.lang.String r3 = "markPCMAmplitudeLowPercentAround60"
            r31 = r3
            java.lang.String r3 = "markPCMAmplitudeSilentPercentAround80"
            r32 = r3
            java.lang.String r3 = "markPCMAmplitudeSilentPercentAround60"
            r33 = r3
            java.lang.String r3 = "markPCMAmplitudeHighPercentAround100"
            r34 = r5
            java.lang.String r5 = "markPCMAmplitudeHighPercentAround80"
            r35 = r14
            if (r1 == 0) goto L_0x0420
            r14 = 1
            if (r1 == r14) goto L_0x0222
            goto L_0x0636
        L_0x0222:
            if (r7 == 0) goto L_0x039e
            if (r7 == r14) goto L_0x031c
            r14 = 2
            if (r7 == r14) goto L_0x02a4
            r14 = 3
            if (r7 == r14) goto L_0x022e
            goto L_0x0636
        L_0x022e:
            if (r8 != 0) goto L_0x0240
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r9)
            com.tencent.mm.plugin.report.service.n r22 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r23 = 1207(0x4b7, double:5.963E-321)
            r25 = 22
            r27 = 1
            r22.mo175913w(r23, r25, r27)
            goto L_0x0636
        L_0x0240:
            r0 = 20
            if (r8 > r0) goto L_0x0254
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r15)
            com.tencent.mm.plugin.report.service.n r22 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r23 = 1207(0x4b7, double:5.963E-321)
            r25 = 23
            r27 = 1
            r22.mo175913w(r23, r25, r27)
            goto L_0x0636
        L_0x0254:
            r0 = 40
            if (r8 > r0) goto L_0x0268
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r11)
            com.tencent.mm.plugin.report.service.n r22 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r23 = 1207(0x4b7, double:5.963E-321)
            r25 = 24
            r27 = 1
            r22.mo175913w(r23, r25, r27)
            goto L_0x0636
        L_0x0268:
            r0 = 60
            if (r8 > r0) goto L_0x027c
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r6)
            com.tencent.mm.plugin.report.service.n r22 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r23 = 1207(0x4b7, double:5.963E-321)
            r25 = 25
            r27 = 1
            r22.mo175913w(r23, r25, r27)
            goto L_0x0636
        L_0x027c:
            r0 = 80
            if (r8 > r0) goto L_0x0290
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r5)
            com.tencent.mm.plugin.report.service.n r22 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r23 = 1207(0x4b7, double:5.963E-321)
            r25 = 26
            r27 = 1
            r22.mo175913w(r23, r25, r27)
            goto L_0x0636
        L_0x0290:
            r0 = 100
            if (r8 > r0) goto L_0x0636
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r3)
            com.tencent.mm.plugin.report.service.n r22 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r23 = 1207(0x4b7, double:5.963E-321)
            r25 = 27
            r27 = 1
            r22.mo175913w(r23, r25, r27)
            goto L_0x0636
        L_0x02a4:
            if (r8 != 0) goto L_0x02b6
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r0)
            com.tencent.mm.plugin.report.service.n r2 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r3 = 1207(0x4b7, double:5.963E-321)
            r5 = 15
            r7 = 1
            r2.mo175913w(r3, r5, r7)
            goto L_0x0636
        L_0x02b6:
            r0 = 20
            if (r8 > r0) goto L_0x02ca
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r2)
            com.tencent.mm.plugin.report.service.n r22 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r23 = 1207(0x4b7, double:5.963E-321)
            r25 = 16
            r27 = 1
            r22.mo175913w(r23, r25, r27)
            goto L_0x0636
        L_0x02ca:
            r0 = 40
            if (r8 > r0) goto L_0x02de
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r12)
            com.tencent.mm.plugin.report.service.n r22 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r23 = 1207(0x4b7, double:5.963E-321)
            r25 = 17
            r27 = 1
            r22.mo175913w(r23, r25, r27)
            goto L_0x0636
        L_0x02de:
            r0 = 60
            if (r8 > r0) goto L_0x02f2
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r13)
            com.tencent.mm.plugin.report.service.n r22 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r23 = 1207(0x4b7, double:5.963E-321)
            r25 = 18
            r27 = 1
            r22.mo175913w(r23, r25, r27)
            goto L_0x0636
        L_0x02f2:
            r0 = 80
            if (r8 > r0) goto L_0x0306
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r4)
            com.tencent.mm.plugin.report.service.n r22 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r23 = 1207(0x4b7, double:5.963E-321)
            r25 = 19
            r27 = 1
            r22.mo175913w(r23, r25, r27)
            goto L_0x0636
        L_0x0306:
            r0 = 100
            if (r8 > r0) goto L_0x0636
            r14 = r35
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r14)
            com.tencent.mm.plugin.report.service.n r2 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r3 = 1207(0x4b7, double:5.963E-321)
            r5 = 20
            r7 = 1
            r2.mo175913w(r3, r5, r7)
            goto L_0x0636
        L_0x031c:
            if (r8 != 0) goto L_0x0330
            r0 = r34
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r0)
            com.tencent.mm.plugin.report.service.n r39 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r40 = 1207(0x4b7, double:5.963E-321)
            r42 = 8
            r44 = 1
            r39.mo175913w(r40, r42, r44)
            goto L_0x0636
        L_0x0330:
            r0 = 20
            if (r8 > r0) goto L_0x0346
            r0 = r28
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r0)
            com.tencent.mm.plugin.report.service.n r38 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r39 = 1207(0x4b7, double:5.963E-321)
            r41 = 9
            r43 = 1
            r38.mo175913w(r39, r41, r43)
            goto L_0x0636
        L_0x0346:
            r0 = 40
            if (r8 > r0) goto L_0x035c
            r0 = r26
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r0)
            com.tencent.mm.plugin.report.service.n r37 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r38 = 1207(0x4b7, double:5.963E-321)
            r40 = 10
            r42 = 1
            r37.mo175913w(r38, r40, r42)
            goto L_0x0636
        L_0x035c:
            r0 = 60
            if (r8 > r0) goto L_0x0372
            r0 = r31
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r0)
            com.tencent.mm.plugin.report.service.n r36 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r37 = 1207(0x4b7, double:5.963E-321)
            r39 = 11
            r41 = 1
            r36.mo175913w(r37, r39, r41)
            goto L_0x0636
        L_0x0372:
            r0 = 80
            if (r8 > r0) goto L_0x0388
            r0 = r29
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r0)
            com.tencent.mm.plugin.report.service.n r28 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r29 = 1207(0x4b7, double:5.963E-321)
            r31 = 12
            r33 = 1
            r28.mo175913w(r29, r31, r33)
            goto L_0x0636
        L_0x0388:
            r0 = 100
            if (r8 > r0) goto L_0x0636
            r0 = r27
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r0)
            com.tencent.mm.plugin.report.service.n r2 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r3 = 1207(0x4b7, double:5.963E-321)
            r5 = 13
            r7 = 1
            r2.mo175913w(r3, r5, r7)
            goto L_0x0636
        L_0x039e:
            if (r8 != 0) goto L_0x03b2
            r0 = r25
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r0)
            com.tencent.mm.plugin.report.service.n r39 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r40 = 1207(0x4b7, double:5.963E-321)
            r42 = 1
            r44 = 1
            r39.mo175913w(r40, r42, r44)
            goto L_0x0636
        L_0x03b2:
            r0 = 20
            if (r8 > r0) goto L_0x03c8
            r0 = r24
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r0)
            com.tencent.mm.plugin.report.service.n r38 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r39 = 1207(0x4b7, double:5.963E-321)
            r41 = 2
            r43 = 1
            r38.mo175913w(r39, r41, r43)
            goto L_0x0636
        L_0x03c8:
            r0 = 40
            if (r8 > r0) goto L_0x03de
            r0 = r23
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r0)
            com.tencent.mm.plugin.report.service.n r22 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r23 = 1207(0x4b7, double:5.963E-321)
            r25 = 3
            r27 = 1
            r22.mo175913w(r23, r25, r27)
            goto L_0x0636
        L_0x03de:
            r0 = 60
            if (r8 > r0) goto L_0x03f4
            r0 = r33
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r0)
            com.tencent.mm.plugin.report.service.n r22 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r23 = 1207(0x4b7, double:5.963E-321)
            r25 = 4
            r27 = 1
            r22.mo175913w(r23, r25, r27)
            goto L_0x0636
        L_0x03f4:
            r0 = 80
            if (r8 > r0) goto L_0x040a
            r0 = r32
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r0)
            com.tencent.mm.plugin.report.service.n r22 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r23 = 1207(0x4b7, double:5.963E-321)
            r25 = 5
            r27 = 1
            r22.mo175913w(r23, r25, r27)
            goto L_0x0636
        L_0x040a:
            r0 = 100
            if (r8 > r0) goto L_0x0636
            r0 = r30
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r0)
            com.tencent.mm.plugin.report.service.n r2 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r3 = 1207(0x4b7, double:5.963E-321)
            r5 = 6
            r7 = 1
            r2.mo175913w(r3, r5, r7)
            goto L_0x0636
        L_0x0420:
            r46 = r24
            r47 = r25
            r48 = r27
            r1 = r28
            r49 = r29
            r50 = r30
            r51 = r31
            r52 = r32
            r53 = r33
            r10 = r34
            r14 = r35
            if (r7 == 0) goto L_0x05b9
            r28 = r1
            r1 = 1
            if (r7 == r1) goto L_0x0537
            r1 = 2
            if (r7 == r1) goto L_0x04bf
            r1 = 3
            if (r7 == r1) goto L_0x0445
            goto L_0x0636
        L_0x0445:
            if (r8 != 0) goto L_0x0459
            r1 = r22
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r9)
            com.tencent.mm.plugin.report.service.n r22 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r23 = 1206(0x4b6, double:5.96E-321)
            r25 = 22
            r27 = 1
            r22.mo175913w(r23, r25, r27)
            goto L_0x0636
        L_0x0459:
            r1 = r22
            r0 = 20
            if (r8 > r0) goto L_0x046f
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r15)
            com.tencent.mm.plugin.report.service.n r22 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r23 = 1206(0x4b6, double:5.96E-321)
            r25 = 23
            r27 = 1
            r22.mo175913w(r23, r25, r27)
            goto L_0x0636
        L_0x046f:
            r0 = 40
            if (r8 > r0) goto L_0x0483
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r11)
            com.tencent.mm.plugin.report.service.n r22 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r23 = 1206(0x4b6, double:5.96E-321)
            r25 = 24
            r27 = 1
            r22.mo175913w(r23, r25, r27)
            goto L_0x0636
        L_0x0483:
            r0 = 60
            if (r8 > r0) goto L_0x0497
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r6)
            com.tencent.mm.plugin.report.service.n r9 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r10 = 1206(0x4b6, double:5.96E-321)
            r12 = 25
            r14 = 1
            r9.mo175913w(r10, r12, r14)
            goto L_0x0636
        L_0x0497:
            r0 = 80
            if (r8 > r0) goto L_0x04ab
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r5)
            com.tencent.mm.plugin.report.service.n r9 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r10 = 1206(0x4b6, double:5.96E-321)
            r12 = 26
            r14 = 1
            r9.mo175913w(r10, r12, r14)
            goto L_0x0636
        L_0x04ab:
            r0 = 100
            if (r8 != r0) goto L_0x0636
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r3)
            com.tencent.mm.plugin.report.service.n r9 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r10 = 1206(0x4b6, double:5.96E-321)
            r12 = 27
            r14 = 1
            r9.mo175913w(r10, r12, r14)
            goto L_0x0636
        L_0x04bf:
            r1 = r22
            if (r8 != 0) goto L_0x04d3
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
            com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r1 = 1206(0x4b6, double:5.96E-321)
            r3 = 15
            r5 = 1
            r0.mo175913w(r1, r3, r5)
            goto L_0x0636
        L_0x04d3:
            r0 = 20
            if (r8 > r0) goto L_0x04e7
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)
            com.tencent.mm.plugin.report.service.n r22 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r23 = 1206(0x4b6, double:5.96E-321)
            r25 = 16
            r27 = 1
            r22.mo175913w(r23, r25, r27)
            goto L_0x0636
        L_0x04e7:
            r0 = 40
            if (r8 > r0) goto L_0x04fb
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r12)
            com.tencent.mm.plugin.report.service.n r22 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r23 = 1206(0x4b6, double:5.96E-321)
            r25 = 17
            r27 = 1
            r22.mo175913w(r23, r25, r27)
            goto L_0x0636
        L_0x04fb:
            r0 = 60
            if (r8 > r0) goto L_0x050f
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r13)
            com.tencent.mm.plugin.report.service.n r22 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r23 = 1206(0x4b6, double:5.96E-321)
            r25 = 18
            r27 = 1
            r22.mo175913w(r23, r25, r27)
            goto L_0x0636
        L_0x050f:
            r0 = 80
            if (r8 > r0) goto L_0x0523
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r4)
            com.tencent.mm.plugin.report.service.n r22 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r23 = 1206(0x4b6, double:5.96E-321)
            r25 = 19
            r27 = 1
            r22.mo175913w(r23, r25, r27)
            goto L_0x0636
        L_0x0523:
            r0 = 100
            if (r8 != r0) goto L_0x0636
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r14)
            com.tencent.mm.plugin.report.service.n r22 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r23 = 1206(0x4b6, double:5.96E-321)
            r25 = 20
            r27 = 1
            r22.mo175913w(r23, r25, r27)
            goto L_0x0636
        L_0x0537:
            r1 = r22
            if (r8 != 0) goto L_0x054b
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r10)
            com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r1 = 1206(0x4b6, double:5.96E-321)
            r3 = 8
            r5 = 1
            r0.mo175913w(r1, r3, r5)
            goto L_0x0636
        L_0x054b:
            r0 = 20
            if (r8 > r0) goto L_0x0561
            r0 = r28
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
            com.tencent.mm.plugin.report.service.n r9 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r10 = 1206(0x4b6, double:5.96E-321)
            r12 = 9
            r14 = 1
            r9.mo175913w(r10, r12, r14)
            goto L_0x0636
        L_0x0561:
            r0 = 40
            if (r8 > r0) goto L_0x0577
            r0 = r26
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
            com.tencent.mm.plugin.report.service.n r9 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r10 = 1206(0x4b6, double:5.96E-321)
            r12 = 10
            r14 = 1
            r9.mo175913w(r10, r12, r14)
            goto L_0x0636
        L_0x0577:
            r0 = 60
            if (r8 > r0) goto L_0x058d
            r0 = r51
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
            com.tencent.mm.plugin.report.service.n r9 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r10 = 1206(0x4b6, double:5.96E-321)
            r12 = 11
            r14 = 1
            r9.mo175913w(r10, r12, r14)
            goto L_0x0636
        L_0x058d:
            r0 = 80
            if (r8 > r0) goto L_0x05a3
            r0 = r49
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
            com.tencent.mm.plugin.report.service.n r9 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r10 = 1206(0x4b6, double:5.96E-321)
            r12 = 12
            r14 = 1
            r9.mo175913w(r10, r12, r14)
            goto L_0x0636
        L_0x05a3:
            r0 = 100
            if (r8 != r0) goto L_0x0636
            r0 = r48
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
            com.tencent.mm.plugin.report.service.n r2 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r3 = 1206(0x4b6, double:5.96E-321)
            r5 = 13
            r7 = 1
            r2.mo175913w(r3, r5, r7)
            goto L_0x0636
        L_0x05b9:
            r1 = r22
            if (r8 != 0) goto L_0x05ce
            r0 = r47
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
            com.tencent.mm.plugin.report.service.n r9 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r10 = 1206(0x4b6, double:5.96E-321)
            r12 = 1
            r14 = 1
            r9.mo175913w(r10, r12, r14)
            goto L_0x0636
        L_0x05ce:
            r0 = 20
            if (r8 > r0) goto L_0x05e3
            r0 = r46
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
            com.tencent.mm.plugin.report.service.n r9 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r10 = 1206(0x4b6, double:5.96E-321)
            r12 = 2
            r14 = 1
            r9.mo175913w(r10, r12, r14)
            goto L_0x0636
        L_0x05e3:
            r0 = 40
            if (r8 > r0) goto L_0x05f8
            r0 = r23
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
            com.tencent.mm.plugin.report.service.n r9 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r10 = 1206(0x4b6, double:5.96E-321)
            r12 = 3
            r14 = 1
            r9.mo175913w(r10, r12, r14)
            goto L_0x0636
        L_0x05f8:
            r0 = 60
            if (r8 > r0) goto L_0x060d
            r0 = r53
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
            com.tencent.mm.plugin.report.service.n r9 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r10 = 1206(0x4b6, double:5.96E-321)
            r12 = 4
            r14 = 1
            r9.mo175913w(r10, r12, r14)
            goto L_0x0636
        L_0x060d:
            r0 = 80
            if (r8 > r0) goto L_0x0622
            r0 = r52
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
            com.tencent.mm.plugin.report.service.n r9 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r10 = 1206(0x4b6, double:5.96E-321)
            r12 = 5
            r14 = 1
            r9.mo175913w(r10, r12, r14)
            goto L_0x0636
        L_0x0622:
            r0 = 100
            if (r8 != r0) goto L_0x0636
            r0 = r50
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
            com.tencent.mm.plugin.report.service.n r2 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r3 = 1206(0x4b6, double:5.96E-321)
            r5 = 6
            r7 = 1
            r2.mo175913w(r3, r5, r7)
        L_0x0636:
            int r5 = r21 + 1
            r0 = r54
            r1 = r55
            r3 = r17
            r2 = r18
            r6 = r19
            r7 = r20
            goto L_0x0021
        L_0x0646:
            r0 = 4
            java.lang.Integer[] r1 = new java.lang.Integer[r0]
            r2 = 0
        L_0x064a:
            if (r2 >= r0) goto L_0x0656
            r3 = 0
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            r1[r2] = r4
            int r2 = r2 + 1
            goto L_0x064a
        L_0x0656:
            r2 = r54
            r2.f331421b = r1
            goto L_0x065c
        L_0x065b:
            r2 = r0
        L_0x065c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p1155sh.C110787a.mo162344c(int):void");
    }

    /* renamed from: d */
    public final void mo162345d(int i) {
        this.f331420a = false;
        if (i == 0) {
            Log.m105924i("MicroMsg.VoiceMsgPCMPlayerIDKeyStat", "markMsgPlayerReport");
            C115669n.INSTANCE.mo175913w(1206, 0, 1);
        } else if (i == 1) {
            Log.m105924i("MicroMsg.VOIPPCMPlayerIDKeyStat", "markMsgPlayerReport");
            C115669n.INSTANCE.mo175913w(1207, 0, 1);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:42:0x01bc  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x01c6  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo162346e(int r38) {
        /*
            r37 = this;
            r0 = r37
            r1 = r38
            boolean r2 = r0.f331420a
            if (r2 != 0) goto L_0x0009
            return
        L_0x0009:
            java.lang.Integer[] r2 = r0.f331422c
            int r3 = r2.length
            r5 = 0
            r6 = 0
        L_0x000e:
            if (r5 >= r3) goto L_0x001a
            r7 = r2[r5]
            int r7 = r7.intValue()
            int r6 = r6 + r7
            int r5 = r5 + 1
            goto L_0x000e
        L_0x001a:
            if (r6 == 0) goto L_0x0648
            java.lang.Integer[] r2 = r0.f331422c
            int r3 = r2.length
            r5 = 0
            r7 = 0
        L_0x0021:
            if (r5 >= r3) goto L_0x0633
            r8 = r2[r5]
            int r9 = r7 + 1
            int r8 = r8.intValue()
            r10 = 100
            int r8 = r8 * 100
            int r8 = r8 / r6
            long r14 = (long) r8
            boolean r11 = r0.f331420a
            java.lang.String r12 = "MicroMsg.VOIPPCMPlayerIDKeyStat"
            java.lang.String r13 = "MicroMsg.VoiceMsgPCMPlayerIDKeyStat"
            r16 = r13
            r13 = 1
            if (r11 != 0) goto L_0x003f
            r18 = r2
            goto L_0x004d
        L_0x003f:
            java.lang.String r11 = "markSystemVolumeHigh "
            java.lang.String r10 = "markSystemVolumeMiddle: "
            java.lang.String r4 = "markSystemVolumeLow="
            r18 = r2
            java.lang.String r2 = "markSystemVolumeSilent "
            if (r1 == 0) goto L_0x0108
            if (r1 == r13) goto L_0x0053
        L_0x004d:
            r4 = r12
            r10 = r16
        L_0x0050:
            r2 = 1
            goto L_0x01b8
        L_0x0053:
            if (r7 == 0) goto L_0x00db
            if (r7 == r13) goto L_0x00b1
            r2 = 2
            if (r7 == r2) goto L_0x0085
            r2 = 3
            if (r7 == r2) goto L_0x005e
            goto L_0x004d
        L_0x005e:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r11)
            r2.append(r14)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r2)
            com.tencent.mm.plugin.report.service.n r11 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r19 = 1207(0x4b7, double:5.963E-321)
            r21 = 56
            r2 = r12
            r4 = r16
            r10 = 1
            r12 = r19
            r16 = r14
            r14 = r21
            r11.mo175913w(r12, r14, r16)
            goto L_0x0104
        L_0x0085:
            r2 = r12
            r4 = r16
            r16 = r14
            r14 = 1
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r10)
            r12 = r16
            r11.append(r12)
            java.lang.String r10 = r11.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r10)
            com.tencent.mm.plugin.report.service.n r11 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r15 = 1207(0x4b7, double:5.963E-321)
            r19 = 49
            r21 = r12
            r12 = r15
            r10 = 1
            r14 = r19
            r16 = r21
            r11.mo175913w(r12, r14, r16)
            goto L_0x0104
        L_0x00b1:
            r2 = r12
            r21 = r14
            r14 = r16
            r10 = 1
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r4)
            r12 = r21
            r11.append(r12)
            java.lang.String r4 = r11.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r4)
            com.tencent.mm.plugin.report.service.n r11 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r15 = 1207(0x4b7, double:5.963E-321)
            r19 = 42
            r12 = r15
            r4 = r14
            r14 = r19
            r16 = r21
            r11.mo175913w(r12, r14, r16)
            goto L_0x0104
        L_0x00db:
            r21 = r14
            r4 = r16
            r10 = 1
            r14 = r12
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r2)
            r12 = r21
            r11.append(r12)
            java.lang.String r2 = r11.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r14, r2)
            com.tencent.mm.plugin.report.service.n r11 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r15 = 1207(0x4b7, double:5.963E-321)
            r19 = 35
            r12 = r15
            r2 = r14
            r14 = r19
            r16 = r21
            r11.mo175913w(r12, r14, r16)
        L_0x0104:
            r10 = r4
            r4 = r2
            goto L_0x0050
        L_0x0108:
            r21 = r14
            r15 = r16
            r14 = r12
            r12 = 1
            if (r7 == 0) goto L_0x0192
            if (r7 == r12) goto L_0x016c
            r2 = 2
            if (r7 == r2) goto L_0x0145
            r2 = 3
            if (r7 == r2) goto L_0x011c
            r4 = r14
            r10 = r15
            goto L_0x0050
        L_0x011c:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r11)
            r10 = r21
            r2.append(r10)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r15, r2)
            com.tencent.mm.plugin.report.service.n r2 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r16 = 1206(0x4b6, double:5.96E-321)
            r19 = 56
            r11 = r2
            r2 = 1
            r12 = r16
            r4 = r14
            r10 = r15
            r14 = r19
            r16 = r21
            r11.mo175913w(r12, r14, r16)
            goto L_0x01b8
        L_0x0145:
            r4 = r14
            r14 = r15
            r2 = 1
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r10)
            r12 = r21
            r11.append(r12)
            java.lang.String r10 = r11.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r14, r10)
            com.tencent.mm.plugin.report.service.n r11 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r15 = 1206(0x4b6, double:5.96E-321)
            r19 = 49
            r12 = r15
            r10 = r14
            r14 = r19
            r16 = r21
            r11.mo175913w(r12, r14, r16)
            goto L_0x01b8
        L_0x016c:
            r10 = r15
            r2 = 1
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r4)
            r12 = r21
            r11.append(r12)
            java.lang.String r4 = r11.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r4)
            com.tencent.mm.plugin.report.service.n r11 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r15 = 1206(0x4b6, double:5.96E-321)
            r19 = 42
            r12 = r15
            r4 = r14
            r14 = r19
            r16 = r21
            r11.mo175913w(r12, r14, r16)
            goto L_0x01b8
        L_0x0192:
            r4 = r14
            r10 = r15
            r14 = 1
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r2)
            r12 = r21
            r11.append(r12)
            java.lang.String r2 = r11.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r2)
            com.tencent.mm.plugin.report.service.n r11 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r15 = 1206(0x4b6, double:5.96E-321)
            r19 = 35
            r12 = r15
            r2 = 1
            r14 = r19
            r16 = r21
            r11.mo175913w(r12, r14, r16)
        L_0x01b8:
            boolean r11 = r0.f331420a
            if (r11 != 0) goto L_0x01c6
            r17 = r3
            r21 = r5
            r19 = r6
            r20 = r9
            goto L_0x0623
        L_0x01c6:
            java.lang.String r11 = "markSystemVolumeHighPercentAround40"
            java.lang.String r12 = "markSystemVolumeMiddlePercentAround40"
            java.lang.String r13 = "markSystemVolumeLowPercentAround40"
            java.lang.String r14 = "markSystemVolumeSilentPercentAround40"
            java.lang.String r15 = "markSystemVolumeHighPercentAround20"
            java.lang.String r2 = "markSystemVolumeMiddlePercentAround20"
            r17 = r3
            java.lang.String r3 = "markSystemVolumeLowPercentAround20"
            r19 = r6
            java.lang.String r6 = "markSystemVolumeSilentPercentAround20"
            r20 = r9
            java.lang.String r9 = "markSystemVolumeHighPercentAround0"
            java.lang.String r0 = "markSystemVolumeMiddlePercentAround0"
            r21 = r5
            java.lang.String r5 = "markSystemVolumeLowPercentAround0"
            r22 = r10
            java.lang.String r10 = "markSystemVolumeSilentPercentAround0"
            r23 = r14
            java.lang.String r14 = "markSystemVolumeMiddlePercentAround100"
            r24 = r6
            java.lang.String r6 = "markSystemVolumeHighPercentAround60"
            r25 = r10
            java.lang.String r10 = "markSystemVolumeMiddlePercentAround80"
            r26 = r13
            java.lang.String r13 = "markSystemVolumeLowPercentAround100"
            r27 = r13
            java.lang.String r13 = "markSystemVolumeMiddlePercentAround60"
            r28 = r3
            java.lang.String r3 = "markSystemVolumeLowPercentAround80"
            r29 = r3
            java.lang.String r3 = "markSystemVolumeSilentPercentAround100"
            r30 = r3
            java.lang.String r3 = "markSystemVolumeLowPercentAround60"
            r31 = r3
            java.lang.String r3 = "markSystemVolumeSilentPercentAround80"
            r32 = r3
            java.lang.String r3 = "markSystemVolumeSilentPercentAround60"
            r33 = r3
            if (r1 == 0) goto L_0x0417
            r3 = 1
            if (r1 == r3) goto L_0x0219
            goto L_0x0623
        L_0x0219:
            if (r7 == 0) goto L_0x0395
            if (r7 == r3) goto L_0x0315
            r3 = 2
            if (r7 == r3) goto L_0x029f
            r3 = 3
            if (r7 == r3) goto L_0x0225
            goto L_0x0623
        L_0x0225:
            if (r8 != 0) goto L_0x0237
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r9)
            com.tencent.mm.plugin.report.service.n r22 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r23 = 1207(0x4b7, double:5.963E-321)
            r25 = 50
            r27 = 1
            r22.mo175913w(r23, r25, r27)
            goto L_0x0623
        L_0x0237:
            r0 = 20
            if (r8 > r0) goto L_0x024b
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r15)
            com.tencent.mm.plugin.report.service.n r22 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r23 = 1207(0x4b7, double:5.963E-321)
            r25 = 51
            r27 = 1
            r22.mo175913w(r23, r25, r27)
            goto L_0x0623
        L_0x024b:
            r0 = 40
            if (r8 > r0) goto L_0x025f
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r11)
            com.tencent.mm.plugin.report.service.n r22 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r23 = 1207(0x4b7, double:5.963E-321)
            r25 = 52
            r27 = 1
            r22.mo175913w(r23, r25, r27)
            goto L_0x0623
        L_0x025f:
            r0 = 60
            if (r8 > r0) goto L_0x0273
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r6)
            com.tencent.mm.plugin.report.service.n r9 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r10 = 1207(0x4b7, double:5.963E-321)
            r12 = 53
            r14 = 1
            r9.mo175913w(r10, r12, r14)
            goto L_0x0623
        L_0x0273:
            r0 = 80
            if (r8 > r0) goto L_0x0289
            java.lang.String r0 = "markSystemVolumeHighPercentAround80"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r0)
            com.tencent.mm.plugin.report.service.n r5 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r6 = 1207(0x4b7, double:5.963E-321)
            r8 = 54
            r10 = 1
            r5.mo175913w(r6, r8, r10)
            goto L_0x0623
        L_0x0289:
            r0 = 100
            if (r8 > r0) goto L_0x0623
            java.lang.String r0 = "markSystemVolumeHighPercentAround100"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r0)
            com.tencent.mm.plugin.report.service.n r5 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r6 = 1207(0x4b7, double:5.963E-321)
            r8 = 55
            r10 = 1
            r5.mo175913w(r6, r8, r10)
            goto L_0x0623
        L_0x029f:
            if (r8 != 0) goto L_0x02b1
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r0)
            com.tencent.mm.plugin.report.service.n r22 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r23 = 1207(0x4b7, double:5.963E-321)
            r25 = 43
            r27 = 1
            r22.mo175913w(r23, r25, r27)
            goto L_0x0623
        L_0x02b1:
            r0 = 20
            if (r8 > r0) goto L_0x02c5
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r2)
            com.tencent.mm.plugin.report.service.n r22 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r23 = 1207(0x4b7, double:5.963E-321)
            r25 = 44
            r27 = 1
            r22.mo175913w(r23, r25, r27)
            goto L_0x0623
        L_0x02c5:
            r0 = 40
            if (r8 > r0) goto L_0x02d9
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r12)
            com.tencent.mm.plugin.report.service.n r22 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r23 = 1207(0x4b7, double:5.963E-321)
            r25 = 45
            r27 = 1
            r22.mo175913w(r23, r25, r27)
            goto L_0x0623
        L_0x02d9:
            r0 = 60
            if (r8 > r0) goto L_0x02ed
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r13)
            com.tencent.mm.plugin.report.service.n r22 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r23 = 1207(0x4b7, double:5.963E-321)
            r25 = 46
            r27 = 1
            r22.mo175913w(r23, r25, r27)
            goto L_0x0623
        L_0x02ed:
            r0 = 80
            if (r8 > r0) goto L_0x0301
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r10)
            com.tencent.mm.plugin.report.service.n r22 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r23 = 1207(0x4b7, double:5.963E-321)
            r25 = 47
            r27 = 1
            r22.mo175913w(r23, r25, r27)
            goto L_0x0623
        L_0x0301:
            r0 = 100
            if (r8 > r0) goto L_0x0623
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r14)
            com.tencent.mm.plugin.report.service.n r22 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r23 = 1207(0x4b7, double:5.963E-321)
            r25 = 48
            r27 = 1
            r22.mo175913w(r23, r25, r27)
            goto L_0x0623
        L_0x0315:
            if (r8 != 0) goto L_0x0327
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r5)
            com.tencent.mm.plugin.report.service.n r2 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r3 = 1207(0x4b7, double:5.963E-321)
            r5 = 36
            r7 = 1
            r2.mo175913w(r3, r5, r7)
            goto L_0x0623
        L_0x0327:
            r0 = 20
            if (r8 > r0) goto L_0x033d
            r3 = r28
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r3)
            com.tencent.mm.plugin.report.service.n r9 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r10 = 1207(0x4b7, double:5.963E-321)
            r12 = 37
            r14 = 1
            r9.mo175913w(r10, r12, r14)
            goto L_0x0623
        L_0x033d:
            r0 = 40
            if (r8 > r0) goto L_0x0353
            r0 = r26
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r0)
            com.tencent.mm.plugin.report.service.n r9 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r10 = 1207(0x4b7, double:5.963E-321)
            r12 = 38
            r14 = 1
            r9.mo175913w(r10, r12, r14)
            goto L_0x0623
        L_0x0353:
            r0 = 60
            if (r8 > r0) goto L_0x0369
            r0 = r31
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r0)
            com.tencent.mm.plugin.report.service.n r9 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r10 = 1207(0x4b7, double:5.963E-321)
            r12 = 39
            r14 = 1
            r9.mo175913w(r10, r12, r14)
            goto L_0x0623
        L_0x0369:
            r0 = 80
            if (r8 > r0) goto L_0x037f
            r0 = r29
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r0)
            com.tencent.mm.plugin.report.service.n r9 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r10 = 1207(0x4b7, double:5.963E-321)
            r12 = 40
            r14 = 1
            r9.mo175913w(r10, r12, r14)
            goto L_0x0623
        L_0x037f:
            r0 = 100
            if (r8 > r0) goto L_0x0623
            r0 = r27
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r0)
            com.tencent.mm.plugin.report.service.n r5 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r6 = 1207(0x4b7, double:5.963E-321)
            r8 = 41
            r10 = 1
            r5.mo175913w(r6, r8, r10)
            goto L_0x0623
        L_0x0395:
            if (r8 != 0) goto L_0x03a9
            r0 = r25
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r0)
            com.tencent.mm.plugin.report.service.n r9 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r10 = 1207(0x4b7, double:5.963E-321)
            r12 = 29
            r14 = 1
            r9.mo175913w(r10, r12, r14)
            goto L_0x0623
        L_0x03a9:
            r0 = 20
            if (r8 > r0) goto L_0x03bf
            r0 = r24
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r0)
            com.tencent.mm.plugin.report.service.n r9 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r10 = 1207(0x4b7, double:5.963E-321)
            r12 = 30
            r14 = 1
            r9.mo175913w(r10, r12, r14)
            goto L_0x0623
        L_0x03bf:
            r0 = 40
            if (r8 > r0) goto L_0x03d5
            r0 = r23
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r0)
            com.tencent.mm.plugin.report.service.n r9 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r10 = 1207(0x4b7, double:5.963E-321)
            r12 = 31
            r14 = 1
            r9.mo175913w(r10, r12, r14)
            goto L_0x0623
        L_0x03d5:
            r0 = 60
            if (r8 > r0) goto L_0x03eb
            r0 = r33
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r0)
            com.tencent.mm.plugin.report.service.n r9 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r10 = 1207(0x4b7, double:5.963E-321)
            r12 = 32
            r14 = 1
            r9.mo175913w(r10, r12, r14)
            goto L_0x0623
        L_0x03eb:
            r0 = 80
            if (r8 > r0) goto L_0x0401
            r0 = r32
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r0)
            com.tencent.mm.plugin.report.service.n r9 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r10 = 1207(0x4b7, double:5.963E-321)
            r12 = 33
            r14 = 1
            r9.mo175913w(r10, r12, r14)
            goto L_0x0623
        L_0x0401:
            r0 = 100
            if (r8 > r0) goto L_0x0623
            r0 = r30
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r0)
            com.tencent.mm.plugin.report.service.n r5 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r6 = 1207(0x4b7, double:5.963E-321)
            r8 = 34
            r10 = 1
            r5.mo175913w(r6, r8, r10)
            goto L_0x0623
        L_0x0417:
            r4 = r26
            r3 = r28
            r34 = r30
            r1 = r31
            r35 = r32
            r36 = r33
            if (r7 == 0) goto L_0x05a6
            r31 = r1
            r1 = 1
            if (r7 == r1) goto L_0x0528
            r1 = 2
            if (r7 == r1) goto L_0x04b0
            r1 = 3
            if (r7 == r1) goto L_0x0432
            goto L_0x0623
        L_0x0432:
            if (r8 != 0) goto L_0x0446
            r1 = r22
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r9)
            com.tencent.mm.plugin.report.service.n r22 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r23 = 1206(0x4b6, double:5.96E-321)
            r25 = 50
            r27 = 1
            r22.mo175913w(r23, r25, r27)
            goto L_0x0623
        L_0x0446:
            r1 = r22
            r0 = 20
            if (r8 > r0) goto L_0x045c
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r15)
            com.tencent.mm.plugin.report.service.n r22 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r23 = 1206(0x4b6, double:5.96E-321)
            r25 = 51
            r27 = 1
            r22.mo175913w(r23, r25, r27)
            goto L_0x0623
        L_0x045c:
            r0 = 40
            if (r8 > r0) goto L_0x0470
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r11)
            com.tencent.mm.plugin.report.service.n r22 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r23 = 1206(0x4b6, double:5.96E-321)
            r25 = 52
            r27 = 1
            r22.mo175913w(r23, r25, r27)
            goto L_0x0623
        L_0x0470:
            r0 = 60
            if (r8 > r0) goto L_0x0484
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r6)
            com.tencent.mm.plugin.report.service.n r9 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r10 = 1206(0x4b6, double:5.96E-321)
            r12 = 53
            r14 = 1
            r9.mo175913w(r10, r12, r14)
            goto L_0x0623
        L_0x0484:
            r0 = 80
            if (r8 > r0) goto L_0x049a
            java.lang.String r0 = "markSystemVolumeHighPercentAround80"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
            com.tencent.mm.plugin.report.service.n r2 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r3 = 1206(0x4b6, double:5.96E-321)
            r5 = 54
            r7 = 1
            r2.mo175913w(r3, r5, r7)
            goto L_0x0623
        L_0x049a:
            r0 = 100
            if (r8 != r0) goto L_0x0623
            java.lang.String r0 = "markSystemVolumeHighPercentAround100"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
            com.tencent.mm.plugin.report.service.n r2 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r3 = 1206(0x4b6, double:5.96E-321)
            r5 = 55
            r7 = 1
            r2.mo175913w(r3, r5, r7)
            goto L_0x0623
        L_0x04b0:
            r1 = r22
            if (r8 != 0) goto L_0x04c4
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
            com.tencent.mm.plugin.report.service.n r9 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r10 = 1206(0x4b6, double:5.96E-321)
            r12 = 43
            r14 = 1
            r9.mo175913w(r10, r12, r14)
            goto L_0x0623
        L_0x04c4:
            r0 = 20
            if (r8 > r0) goto L_0x04d8
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)
            com.tencent.mm.plugin.report.service.n r22 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r23 = 1206(0x4b6, double:5.96E-321)
            r25 = 44
            r27 = 1
            r22.mo175913w(r23, r25, r27)
            goto L_0x0623
        L_0x04d8:
            r0 = 40
            if (r8 > r0) goto L_0x04ec
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r12)
            com.tencent.mm.plugin.report.service.n r22 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r23 = 1206(0x4b6, double:5.96E-321)
            r25 = 45
            r27 = 1
            r22.mo175913w(r23, r25, r27)
            goto L_0x0623
        L_0x04ec:
            r0 = 60
            if (r8 > r0) goto L_0x0500
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r13)
            com.tencent.mm.plugin.report.service.n r22 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r23 = 1206(0x4b6, double:5.96E-321)
            r25 = 46
            r27 = 1
            r22.mo175913w(r23, r25, r27)
            goto L_0x0623
        L_0x0500:
            r0 = 80
            if (r8 > r0) goto L_0x0514
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r10)
            com.tencent.mm.plugin.report.service.n r22 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r23 = 1206(0x4b6, double:5.96E-321)
            r25 = 47
            r27 = 1
            r22.mo175913w(r23, r25, r27)
            goto L_0x0623
        L_0x0514:
            r0 = 100
            if (r8 != r0) goto L_0x0623
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r14)
            com.tencent.mm.plugin.report.service.n r22 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r23 = 1206(0x4b6, double:5.96E-321)
            r25 = 48
            r27 = 1
            r22.mo175913w(r23, r25, r27)
            goto L_0x0623
        L_0x0528:
            r1 = r22
            if (r8 != 0) goto L_0x053c
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r5)
            com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r1 = 1206(0x4b6, double:5.96E-321)
            r3 = 36
            r5 = 1
            r0.mo175913w(r1, r3, r5)
            goto L_0x0623
        L_0x053c:
            r0 = 20
            if (r8 > r0) goto L_0x0550
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r3)
            com.tencent.mm.plugin.report.service.n r9 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r10 = 1206(0x4b6, double:5.96E-321)
            r12 = 37
            r14 = 1
            r9.mo175913w(r10, r12, r14)
            goto L_0x0623
        L_0x0550:
            r0 = 40
            if (r8 > r0) goto L_0x0564
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r4)
            com.tencent.mm.plugin.report.service.n r9 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r10 = 1206(0x4b6, double:5.96E-321)
            r12 = 38
            r14 = 1
            r9.mo175913w(r10, r12, r14)
            goto L_0x0623
        L_0x0564:
            r0 = 60
            if (r8 > r0) goto L_0x057a
            r0 = r31
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
            com.tencent.mm.plugin.report.service.n r9 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r10 = 1206(0x4b6, double:5.96E-321)
            r12 = 39
            r14 = 1
            r9.mo175913w(r10, r12, r14)
            goto L_0x0623
        L_0x057a:
            r0 = 80
            if (r8 > r0) goto L_0x0590
            r0 = r29
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
            com.tencent.mm.plugin.report.service.n r9 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r10 = 1206(0x4b6, double:5.96E-321)
            r12 = 40
            r14 = 1
            r9.mo175913w(r10, r12, r14)
            goto L_0x0623
        L_0x0590:
            r0 = 100
            if (r8 != r0) goto L_0x0623
            r0 = r27
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
            com.tencent.mm.plugin.report.service.n r2 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r3 = 1206(0x4b6, double:5.96E-321)
            r5 = 41
            r7 = 1
            r2.mo175913w(r3, r5, r7)
            goto L_0x0623
        L_0x05a6:
            r1 = r22
            if (r8 != 0) goto L_0x05bb
            r0 = r25
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
            com.tencent.mm.plugin.report.service.n r9 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r10 = 1206(0x4b6, double:5.96E-321)
            r12 = 29
            r14 = 1
            r9.mo175913w(r10, r12, r14)
            goto L_0x0623
        L_0x05bb:
            r0 = 20
            if (r8 > r0) goto L_0x05d0
            r0 = r24
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
            com.tencent.mm.plugin.report.service.n r9 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r10 = 1206(0x4b6, double:5.96E-321)
            r12 = 30
            r14 = 1
            r9.mo175913w(r10, r12, r14)
            goto L_0x0623
        L_0x05d0:
            r0 = 40
            if (r8 > r0) goto L_0x05e5
            r0 = r23
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
            com.tencent.mm.plugin.report.service.n r9 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r10 = 1206(0x4b6, double:5.96E-321)
            r12 = 31
            r14 = 1
            r9.mo175913w(r10, r12, r14)
            goto L_0x0623
        L_0x05e5:
            r0 = 60
            if (r8 > r0) goto L_0x05fa
            r0 = r36
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
            com.tencent.mm.plugin.report.service.n r9 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r10 = 1206(0x4b6, double:5.96E-321)
            r12 = 32
            r14 = 1
            r9.mo175913w(r10, r12, r14)
            goto L_0x0623
        L_0x05fa:
            r0 = 80
            if (r8 > r0) goto L_0x060f
            r0 = r35
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
            com.tencent.mm.plugin.report.service.n r9 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r10 = 1206(0x4b6, double:5.96E-321)
            r12 = 33
            r14 = 1
            r9.mo175913w(r10, r12, r14)
            goto L_0x0623
        L_0x060f:
            r0 = 100
            if (r8 != r0) goto L_0x0623
            r0 = r34
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
            com.tencent.mm.plugin.report.service.n r2 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r3 = 1206(0x4b6, double:5.96E-321)
            r5 = 34
            r7 = 1
            r2.mo175913w(r3, r5, r7)
        L_0x0623:
            int r5 = r21 + 1
            r0 = r37
            r1 = r38
            r3 = r17
            r2 = r18
            r6 = r19
            r7 = r20
            goto L_0x0021
        L_0x0633:
            r0 = 4
            java.lang.Integer[] r1 = new java.lang.Integer[r0]
            r2 = 0
        L_0x0637:
            if (r2 >= r0) goto L_0x0643
            r3 = 0
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            r1[r2] = r4
            int r2 = r2 + 1
            goto L_0x0637
        L_0x0643:
            r2 = r37
            r2.f331422c = r1
            goto L_0x0649
        L_0x0648:
            r2 = r0
        L_0x0649:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p1155sh.C110787a.mo162346e(int):void");
    }
}
