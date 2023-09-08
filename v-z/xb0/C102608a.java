package xb0;

import com.tencent.p014mm.modelcontrol.VideoTransPara;
import com.tencent.tavkit.component.TAVPlayer;
import com.tencent.wxmm.v2helper;

/* renamed from: xb0.a */
public class C102608a {

    /* renamed from: a */
    public static C102611k[] f302139a;

    static {
        C102611k[] kVarArr = new C102611k[2];
        f302139a = kVarArr;
        kVarArr[0] = new C102611k(0, 120, TAVPlayer.VIDEO_PLAYER_WIDTH, 960, 30, 1200000, 1200000);
        kVarArr[1] = new C102611k(120, 300, v2helper.VOIP_ENC_HEIGHT_LV1, 640, 24, 544000, 544000);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0003, code lost:
        if (r2.length <= 0) goto L_0x0005;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo142221a(xb0.C102611k[] r2, com.tencent.p014mm.modelcontrol.VideoTransPara r3, com.tencent.p014mm.modelcontrol.VideoTransPara r4) {
        /*
            r1 = this;
            if (r2 == 0) goto L_0x0005
            int r0 = r2.length     // Catch:{ Exception -> 0x000d }
            if (r0 > 0) goto L_0x0007
        L_0x0005:
            xb0.k[] r2 = f302139a     // Catch:{ Exception -> 0x000d }
        L_0x0007:
            int r0 = r2.length     // Catch:{ Exception -> 0x000d }
            int r2 = r1.mo142222b(r0, r2, r3, r4)     // Catch:{ Exception -> 0x000d }
            goto L_0x0029
        L_0x000d:
            r2 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "do calc bitrate error: "
            r3.append(r4)
            java.lang.String r2 = r2.toString()
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            java.lang.String r3 = "MicroMsg.BitrateCalculator"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r2)
            r2 = 0
        L_0x0029:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: xb0.C102608a.mo142221a(xb0.k[], com.tencent.mm.modelcontrol.VideoTransPara, com.tencent.mm.modelcontrol.VideoTransPara):int");
    }

    /* renamed from: b */
    public final int mo142222b(int i, C102611k[] kVarArr, VideoTransPara videoTransPara, VideoTransPara videoTransPara2) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8 = i;
        VideoTransPara videoTransPara3 = videoTransPara;
        VideoTransPara videoTransPara4 = videoTransPara2;
        videoTransPara4.f267166d = videoTransPara3.f267166d;
        videoTransPara4.f267167e = videoTransPara3.f267167e;
        videoTransPara4.f267168f = videoTransPara3.f267168f;
        videoTransPara4.f267169g = videoTransPara3.f267169g;
        int i9 = videoTransPara3.f267170h;
        videoTransPara4.f267170h = i9;
        int i15 = videoTransPara3.f267166d;
        int i16 = videoTransPara3.f267167e;
        boolean z = i15 > i16;
        int i17 = z ? i15 : i16;
        if (z) {
            i15 = i16;
        }
        int i18 = videoTransPara3.f267170h;
        if (i9 >= kVarArr[i8 - 1].f302166e && i9 >= f302139a[1].f302166e) {
            return 0;
        }
        int i19 = 0;
        while (i19 < i8) {
            C102611k kVar = kVarArr[i19];
            int i25 = kVar.f302165d;
            if (i18 < i25 || i18 >= (i5 = kVar.f302166e)) {
                i19++;
            } else {
                int i26 = kVar.f302167f;
                int i27 = kVar.f302168g;
                if (i17 > i26 || i15 > i27) {
                    int i28 = i17 * i27;
                    int i29 = i15 * i26;
                    if (i28 > i29) {
                        i6 = i29 / i17;
                        i7 = i26;
                    } else {
                        i7 = i28 / i15;
                        i6 = i27;
                    }
                    i17 = ((i7 + 8) >> 4) << 4;
                    i15 = ((i6 + 8) >> 4) << 4;
                }
                int i35 = z ? i17 : i15;
                videoTransPara4.f267166d = i35;
                if (!z) {
                    i15 = i17;
                }
                videoTransPara4.f267167e = i15;
                int i36 = videoTransPara4.f267168f;
                int i37 = kVar.f302169h;
                if (i36 > i37) {
                    i36 = i37;
                }
                videoTransPara4.f267168f = i36;
                int i38 = kVar.f302170i;
                int i39 = kVar.f302171j;
                int i44 = videoTransPara4.f267170h;
                int sqrt = (int) (((((double) (((((i38 * i5) + (i39 * i44)) - (i38 * i44)) - (i39 * i25)) / (i5 - i25))) * Math.sqrt((((double) (i35 * i15)) * 1.0d) / ((double) (i26 * i27)))) * ((double) (videoTransPara4.f267168f + 10))) / 40.0d);
                videoTransPara4.f267169g = sqrt;
                return sqrt;
            }
        }
        int i45 = 0;
        while (i45 < 2) {
            C102611k kVar2 = f302139a[i45];
            int i46 = kVar2.f302165d;
            if (i18 < i46 || i18 >= (i2 = kVar2.f302166e)) {
                i45++;
            } else {
                int i47 = kVar2.f302167f;
                int i48 = kVar2.f302168g;
                if (i17 > i47 || i15 > i48) {
                    int i49 = i17 * i48;
                    int i54 = i15 * i47;
                    if (i49 > i54) {
                        i3 = i54 / i17;
                        i4 = i47;
                    } else {
                        i4 = i49 / i15;
                        i3 = i48;
                    }
                    i17 = ((i4 + 8) >> 4) << 4;
                    i15 = ((i3 + 8) >> 4) << 4;
                }
                int i55 = z ? i17 : i15;
                videoTransPara4.f267166d = i55;
                if (!z) {
                    i15 = i17;
                }
                videoTransPara4.f267167e = i15;
                int i56 = videoTransPara4.f267168f;
                int i57 = kVar2.f302169h;
                if (i56 > i57) {
                    i56 = i57;
                }
                videoTransPara4.f267168f = i56;
                int i58 = kVar2.f302170i;
                int i59 = kVar2.f302171j;
                int i64 = videoTransPara4.f267170h;
                int sqrt2 = (int) (((((double) (((((i58 * i2) + (i59 * i64)) - (i58 * i64)) - (i59 * i46)) / (i2 - i46))) * Math.sqrt((((double) (i55 * i15)) * 1.0d) / ((double) (i47 * i48)))) * ((double) (videoTransPara4.f267168f + 10))) / 40.0d);
                videoTransPara4.f267169g = sqrt2;
                return sqrt2;
            }
        }
        return 0;
    }
}
