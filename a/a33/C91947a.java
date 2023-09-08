package a33;

import com.tencent.p014mm.modelcontrol.VideoTransPara;
import com.tencent.p014mm.plugin.sight.base.ABAPrams;
import com.tencent.p014mm.plugin.sight.base.AdaptiveAdjustBitrate;

/* renamed from: a33.a */
public final class C91947a {

    /* renamed from: a */
    public AdaptiveAdjustBitrate f263223a;

    /* renamed from: b */
    public ABAPrams f263224b;

    /* renamed from: c */
    public boolean f263225c;

    /* renamed from: d */
    public int f263226d;

    /* renamed from: e */
    public int f263227e;

    /* renamed from: f */
    public int f263228f;

    /* renamed from: g */
    public int f263229g;

    /* renamed from: h */
    public int f263230h;

    /* renamed from: i */
    public String f263231i = "";

    /* renamed from: j */
    public int f263232j;

    /* renamed from: a */
    public final void mo125795a(VideoTransPara videoTransPara) {
        int i = this.f263230h;
        if (i == 90 || i == 270) {
            if (videoTransPara != null) {
                videoTransPara.f267166d = this.f263227e;
            }
            if (videoTransPara != null) {
                videoTransPara.f267167e = this.f263226d;
            }
        } else {
            if (videoTransPara != null) {
                videoTransPara.f267166d = this.f263226d;
            }
            if (videoTransPara != null) {
                videoTransPara.f267167e = this.f263227e;
            }
        }
        if (videoTransPara != null) {
            videoTransPara.f267169g = this.f263228f;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:105:?, code lost:
        return 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0080, code lost:
        if ((r1 != null && r1.f273431g == 2) != false) goto L_0x0082;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00a2, code lost:
        if ((r1 != null && r1.f273430f == 4) != false) goto L_0x00c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00a5, code lost:
        r1 = new java.lang.Object[2];
        r1[0] = java.lang.Integer.valueOf(r0.f263228f);
        r2 = r0.f263223a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00b1, code lost:
        if (r2 == null) goto L_0x00b9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00b3, code lost:
        r8 = java.lang.Integer.valueOf(r2.f273442r);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00b9, code lost:
        r1[1] = r8;
        com.tencent.p014mm.sdk.platformtools.Log.m105925i("MicroMsg.ABAParamsUtil", "ABA: No use ABA algorithm: final bitrate: [%d], takePhotosVideoBR: [%d]", r1);
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo125796b() {
        /*
            r24 = this;
            r0 = r24
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "ABA: Input encoding prams :Br: [%d]  height: [%d]  width: [%d] forceResolution:"
            r1.append(r2)
            boolean r2 = r0.f263225c
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r2 = 3
            java.lang.Object[] r3 = new java.lang.Object[r2]
            int r4 = r0.f263228f
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r5 = 0
            r3[r5] = r4
            int r4 = r0.f263227e
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r6 = 1
            r3[r6] = r4
            int r4 = r0.f263226d
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r7 = 2
            r3[r7] = r4
            java.lang.String r4 = "MicroMsg.ABAParamsUtil"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r1, r3)
            java.lang.Object[] r1 = new java.lang.Object[r2]
            com.tencent.mm.plugin.sight.base.AdaptiveAdjustBitrate r3 = r0.f263223a
            r8 = 0
            if (r3 == 0) goto L_0x0046
            int r3 = r3.f273430f
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            goto L_0x0047
        L_0x0046:
            r3 = r8
        L_0x0047:
            r1[r5] = r3
            com.tencent.mm.plugin.sight.base.AdaptiveAdjustBitrate r3 = r0.f263223a
            if (r3 == 0) goto L_0x0054
            int r3 = r3.f273431g
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            goto L_0x0055
        L_0x0054:
            r3 = r8
        L_0x0055:
            r1[r6] = r3
            com.tencent.mm.plugin.sight.base.AdaptiveAdjustBitrate r3 = r0.f263223a
            if (r3 == 0) goto L_0x0062
            int r3 = r3.f273432h
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            goto L_0x0063
        L_0x0062:
            r3 = r8
        L_0x0063:
            r1[r7] = r3
            java.lang.String r3 = "Scene: [%d], ABASwitch: [%d], QPSwitch: [%d]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r3, r1)
            com.tencent.mm.plugin.sight.base.AdaptiveAdjustBitrate r1 = r0.f263223a
            if (r1 == 0) goto L_0x0074
            int r3 = r1.f273431g
            if (r3 != r6) goto L_0x0074
            r3 = 1
            goto L_0x0075
        L_0x0074:
            r3 = 0
        L_0x0075:
            if (r3 != 0) goto L_0x0082
            if (r1 == 0) goto L_0x007f
            int r3 = r1.f273431g
            if (r3 != r7) goto L_0x007f
            r3 = 1
            goto L_0x0080
        L_0x007f:
            r3 = 0
        L_0x0080:
            if (r3 == 0) goto L_0x00a5
        L_0x0082:
            if (r1 == 0) goto L_0x008a
            int r3 = r1.f273430f
            if (r3 != r7) goto L_0x008a
            r3 = 1
            goto L_0x008b
        L_0x008a:
            r3 = 0
        L_0x008b:
            if (r3 != 0) goto L_0x00c2
            if (r1 == 0) goto L_0x0095
            int r3 = r1.f273430f
            if (r3 != r6) goto L_0x0095
            r3 = 1
            goto L_0x0096
        L_0x0095:
            r3 = 0
        L_0x0096:
            if (r3 != 0) goto L_0x00c2
            if (r1 == 0) goto L_0x00a1
            int r3 = r1.f273430f
            r9 = 4
            if (r3 != r9) goto L_0x00a1
            r3 = 1
            goto L_0x00a2
        L_0x00a1:
            r3 = 0
        L_0x00a2:
            if (r3 == 0) goto L_0x00a5
            goto L_0x00c2
        L_0x00a5:
            java.lang.Object[] r1 = new java.lang.Object[r7]
            int r2 = r0.f263228f
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r1[r5] = r2
            com.tencent.mm.plugin.sight.base.AdaptiveAdjustBitrate r2 = r0.f263223a
            if (r2 == 0) goto L_0x00b9
            int r2 = r2.f273442r
            java.lang.Integer r8 = java.lang.Integer.valueOf(r2)
        L_0x00b9:
            r1[r6] = r8
            java.lang.String r2 = "ABA: No use ABA algorithm: final bitrate: [%d], takePhotosVideoBR: [%d]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r2, r1)
            goto L_0x0215
        L_0x00c2:
            java.lang.String r3 = r0.f263231i
            int r9 = r0.f263227e
            int r10 = r0.f263226d
            int r11 = r0.f263229g
            int r12 = r0.f263228f
            if (r1 == 0) goto L_0x00d5
            int r1 = r1.f273429e
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            goto L_0x00d6
        L_0x00d5:
            r1 = r8
        L_0x00d6:
            gy3.C87412m.m108591d(r1)
            int r1 = r1.intValue()
            com.tencent.mm.plugin.sight.base.AdaptiveAdjustBitrate r13 = r0.f263223a
            if (r13 == 0) goto L_0x00e8
            int r13 = r13.f273428d
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            goto L_0x00e9
        L_0x00e8:
            r13 = r8
        L_0x00e9:
            gy3.C87412m.m108591d(r13)
            int r13 = r13.intValue()
            int r1 = r1 - r13
            int r1 = r1 / 1000
            float r13 = (float) r1
            com.tencent.mm.plugin.sight.base.AdaptiveAdjustBitrate r1 = r0.f263223a
            if (r1 == 0) goto L_0x00ff
            int r1 = r1.f273428d
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            goto L_0x0100
        L_0x00ff:
            r1 = r8
        L_0x0100:
            gy3.C87412m.m108591d(r1)
            int r1 = r1.intValue()
            int r1 = r1 / 1000
            float r14 = (float) r1
            com.tencent.mm.plugin.sight.base.AdaptiveAdjustBitrate r1 = r0.f263223a
            if (r1 == 0) goto L_0x0115
            int r1 = r1.f273430f
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            goto L_0x0116
        L_0x0115:
            r1 = r8
        L_0x0116:
            gy3.C87412m.m108591d(r1)
            int r15 = r1.intValue()
            com.tencent.mm.plugin.sight.base.AdaptiveAdjustBitrate r1 = r0.f263223a
            if (r1 == 0) goto L_0x0128
            float r1 = r1.f273433i
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            goto L_0x0129
        L_0x0128:
            r1 = r8
        L_0x0129:
            gy3.C87412m.m108591d(r1)
            float r16 = r1.floatValue()
            r17 = 0
            com.tencent.mm.plugin.sight.base.AdaptiveAdjustBitrate r1 = r0.f263223a
            if (r1 == 0) goto L_0x013d
            int r1 = r1.f273435k
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            goto L_0x013e
        L_0x013d:
            r1 = r8
        L_0x013e:
            gy3.C87412m.m108591d(r1)
            int r18 = r1.intValue()
            com.tencent.mm.plugin.sight.base.AdaptiveAdjustBitrate r1 = r0.f263223a
            if (r1 == 0) goto L_0x0150
            int r1 = r1.f273436l
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            goto L_0x0151
        L_0x0150:
            r1 = r8
        L_0x0151:
            gy3.C87412m.m108591d(r1)
            int r19 = r1.intValue()
            com.tencent.mm.plugin.sight.base.AdaptiveAdjustBitrate r1 = r0.f263223a
            if (r1 == 0) goto L_0x0163
            int r1 = r1.f273437m
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            goto L_0x0164
        L_0x0163:
            r1 = r8
        L_0x0164:
            gy3.C87412m.m108591d(r1)
            int r20 = r1.intValue()
            com.tencent.mm.plugin.sight.base.AdaptiveAdjustBitrate r1 = r0.f263223a
            if (r1 == 0) goto L_0x0176
            int r1 = r1.f273438n
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            goto L_0x0177
        L_0x0176:
            r1 = r8
        L_0x0177:
            gy3.C87412m.m108591d(r1)
            int r21 = r1.intValue()
            com.tencent.mm.plugin.sight.base.AdaptiveAdjustBitrate r1 = r0.f263223a
            if (r1 == 0) goto L_0x0188
            int r1 = r1.f273439o
            java.lang.Integer r8 = java.lang.Integer.valueOf(r1)
        L_0x0188:
            gy3.C87412m.m108591d(r8)
            int r22 = r8.intValue()
            r23 = 0
            r8 = r3
            com.tencent.mm.plugin.sight.base.ABAPrams r1 = com.tencent.p014mm.plugin.sight.base.AdaptiveAdjustBitrate.m119557b(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            r0.f263224b = r1
            if (r1 == 0) goto L_0x01a3
            gy3.C87412m.m108591d(r1)
            int r1 = r1.outputKbps
            int r1 = r1 * 1000
            r0.f263228f = r1
        L_0x01a3:
            com.tencent.mm.plugin.sight.base.ABAPrams r1 = r0.f263224b
            if (r1 == 0) goto L_0x01c4
            gy3.C87412m.m108591d(r1)
            int r1 = r1.resolutionAdjust
            if (r1 <= 0) goto L_0x01c4
            boolean r1 = r0.f263225c
            if (r1 != 0) goto L_0x01c4
            com.tencent.mm.plugin.sight.base.ABAPrams r1 = r0.f263224b
            gy3.C87412m.m108591d(r1)
            int r1 = r1.outputWidth
            r0.f263226d = r1
            com.tencent.mm.plugin.sight.base.ABAPrams r1 = r0.f263224b
            gy3.C87412m.m108591d(r1)
            int r1 = r1.outputHeight
            r0.f263227e = r1
        L_0x01c4:
            java.lang.Object[] r1 = new java.lang.Object[r2]
            int r2 = r0.f263228f
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r1[r5] = r2
            int r2 = r0.f263226d
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r1[r6] = r2
            int r2 = r0.f263227e
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r1[r7] = r2
            java.lang.String r2 = "ABA: Adaptive Bitrate Methods:videoBitrate [%d]  targetWidth [%d]  targetHeight [%d]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r2, r1)
            com.tencent.mm.modelcdntran.e0 r1 = hd0.C98398h0.xx0()
            com.tencent.mm.plugin.sight.base.ABAPrams r2 = r0.f263224b
            r1.mo126991o(r2)
            com.tencent.mm.plugin.sight.base.ABAPrams r1 = r0.f263224b
            gy3.C87412m.m108591d(r1)
            int r1 = r1.bitrateAdaptiveUP
            if (r1 > 0) goto L_0x020b
            com.tencent.mm.plugin.sight.base.ABAPrams r1 = r0.f263224b
            gy3.C87412m.m108591d(r1)
            int r1 = r1.bitrateAdaptiveDown
            if (r1 > 0) goto L_0x020b
            com.tencent.mm.plugin.sight.base.ABAPrams r1 = r0.f263224b
            gy3.C87412m.m108591d(r1)
            int r1 = r1.resolutionAdjust
            if (r1 <= 0) goto L_0x0208
            goto L_0x020b
        L_0x0208:
            r0.f263232j = r5
            goto L_0x0215
        L_0x020b:
            com.tencent.mm.plugin.sight.base.ABAPrams r1 = r0.f263224b
            gy3.C87412m.m108591d(r1)
            int r1 = r1.bitrateAdaptiveUP
            r0.f263232j = r1
            r5 = 1
        L_0x0215:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: a33.C91947a.mo125796b():int");
    }
}
