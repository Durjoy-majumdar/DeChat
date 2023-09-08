package com.tencent.p014mm.plugin.multitalk.ilinkservice;

import android.media.MediaFormat;
import android.os.Environment;
import com.tencent.p014mm.compatible.deviceinfo.C104619a;
import com.tencent.p014mm.plugin.voip.model.C106349h;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.multitalk.ilinkservice.p */
public class C105674p {

    /* renamed from: x */
    public static int f314194x;

    /* renamed from: y */
    public static final String[] f314195y = {MediaCodecUtils.QCOM_PREFIX, MediaCodecUtils.EXYNOS_PREFIX, "OMX.hisi", "OMX.MTK", "OMX.sprd", "c2.exynos", "c2.qti", "c2.mtk", "c2.unisoc"};

    /* renamed from: a */
    public int f314196a;

    /* renamed from: b */
    public C104619a f314197b;

    /* renamed from: c */
    public MediaFormat f314198c;

    /* renamed from: d */
    public int f314199d;

    /* renamed from: e */
    public int f314200e;

    /* renamed from: f */
    public int f314201f;

    /* renamed from: g */
    public int f314202g;

    /* renamed from: h */
    public int f314203h = -2;

    /* renamed from: i */
    public boolean f314204i = false;

    /* renamed from: j */
    public byte[] f314205j = null;

    /* renamed from: k */
    public boolean f314206k = false;

    /* renamed from: l */
    public int f314207l;

    /* renamed from: m */
    public int f314208m;

    /* renamed from: n */
    public byte[] f314209n;

    /* renamed from: o */
    public long f314210o;

    /* renamed from: p */
    public long f314211p;

    /* renamed from: q */
    public C106349h f314212q = null;

    /* renamed from: r */
    public int f314213r;

    /* renamed from: s */
    public int f314214s;

    /* renamed from: t */
    public int f314215t;

    /* renamed from: u */
    public int f314216u;

    /* renamed from: v */
    public C105594a f314217v;

    /* renamed from: w */
    public int f314218w = 0;

    static {
        Environment.getExternalStorageDirectory().getAbsolutePath();
    }

    public C105674p(int i, int i2, int i3, int i4, int i5, String str) {
        this.f314199d = i;
        this.f314200e = i2;
        this.f314207l = i;
        this.f314208m = i2;
        this.f314201f = i3;
        this.f314202g = i4;
        f314194x = 0;
        this.f314210o = 0;
        this.f314217v = new C105594a();
        this.f314197b = null;
        this.f314214s = 8;
        this.f314213r = 0;
        this.f314215t = 0;
        this.f314196a = 0;
        this.f314209n = null;
        this.f314216u = 0;
        this.f314211p = 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:62:0x0181 A[Catch:{ Exception -> 0x01f6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0191 A[Catch:{ Exception -> 0x01f6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0212  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x021b  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo150539a() {
        /*
            r16 = this;
            r1 = r16
            com.tencent.mm.compatible.deviceinfo.a r0 = r1.f314197b
            if (r0 == 0) goto L_0x0009
            r16.mo150540b()
        L_0x0009:
            int r0 = android.media.MediaCodecList.getCodecCount()
            r2 = 0
            r3 = 0
        L_0x000f:
            java.lang.String r4 = "ILink[HWEnc]"
            java.lang.String r6 = "video/avc"
            if (r3 >= r0) goto L_0x004f
            android.media.MediaCodecInfo r7 = android.media.MediaCodecList.getCodecInfoAt(r3)
            boolean r8 = r7.isEncoder()
            if (r8 != 0) goto L_0x0020
            goto L_0x004c
        L_0x0020:
            java.lang.String[] r8 = r7.getSupportedTypes()
            r9 = 0
        L_0x0025:
            int r10 = r8.length
            if (r9 >= r10) goto L_0x004c
            r10 = r8[r9]
            boolean r10 = r10.equalsIgnoreCase(r6)
            if (r10 == 0) goto L_0x0049
            java.lang.String r0 = r7.getName()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r8 = "steve : H.264 HW encoder found:"
            r3.append(r8)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r4, r0)
            goto L_0x0050
        L_0x0049:
            int r9 = r9 + 1
            goto L_0x0025
        L_0x004c:
            int r3 = r3 + 1
            goto L_0x000f
        L_0x004f:
            r7 = 0
        L_0x0050:
            if (r7 != 0) goto L_0x005e
            java.lang.String r0 = "steve: Unable to find an appropriate codec for video/avc"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r0)
            r0 = 2001(0x7d1, float:2.804E-42)
            r1.f314196a = r0
            r0 = -2001(0xfffffffffffff82f, float:NaN)
            return r0
        L_0x005e:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "steve: found HW codec: "
            r0.append(r3)
            java.lang.String r3 = r7.getName()
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r0)
            int r0 = r1.f314199d
            int r3 = r1.f314200e
            android.media.MediaFormat r0 = android.media.MediaFormat.createVideoFormat(r6, r0, r3)
            r1.f314198c = r0
            r3 = 21
            java.lang.String r6 = "color-format"
            r0.setInteger(r6, r3)
            android.media.MediaFormat r0 = r1.f314198c
            int r3 = r1.f314202g
            int r3 = r3 * 1000
            java.lang.String r6 = "bitrate"
            r0.setInteger(r6, r3)
            android.media.MediaFormat r0 = r1.f314198c
            int r3 = r1.f314201f
            java.lang.String r6 = "frame-rate"
            r0.setInteger(r6, r3)
            android.media.MediaFormat r0 = r1.f314198c
            java.lang.String r3 = "i-frame-interval"
            r6 = 1
            r0.setInteger(r3, r6)
            android.media.MediaFormat r0 = r1.f314198c
            java.lang.String r3 = "mime"
            java.lang.String r3 = r0.getString(r3)
            r1.f314213r = r6
            java.lang.String r0 = r7.getName()
            java.lang.String[] r8 = f314195y
            int r9 = r8.length
            r10 = 0
        L_0x00b5:
            if (r10 >= r9) goto L_0x00d8
            r11 = r8[r10]
            boolean r11 = r0.startsWith(r11)
            if (r11 == 0) goto L_0x00d5
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "steve : known H.264 HW encoder :"
            r8.append(r9)
            r8.append(r0)
            java.lang.String r0 = r8.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r4, r0)
            r0 = 1
            goto L_0x00d9
        L_0x00d5:
            int r10 = r10 + 1
            goto L_0x00b5
        L_0x00d8:
            r0 = 0
        L_0x00d9:
            if (r0 == 0) goto L_0x021e
            r0 = 23
            boolean r9 = p206nj.C11171e.m11046c(r0)
            if (r9 == 0) goto L_0x021e
            int r9 = r1.f314214s
            r10 = 8
            if (r10 > r9) goto L_0x0145
            java.lang.String r9 = r7.getName()
            java.lang.String[] r11 = f314195y
            int r12 = r11.length
            r13 = 0
        L_0x00f1:
            if (r13 >= r12) goto L_0x0145
            r14 = r11[r13]
            boolean r14 = r9.startsWith(r14)
            if (r14 == 0) goto L_0x013f
            android.media.MediaCodecInfo$CodecCapabilities r14 = r7.getCapabilitiesForType(r3)     // Catch:{ Exception -> 0x013f }
            android.media.MediaCodecInfo$CodecProfileLevel[] r14 = r14.profileLevels     // Catch:{ Exception -> 0x013f }
            int r15 = r14.length     // Catch:{ Exception -> 0x013f }
            r5 = 0
        L_0x0103:
            if (r5 >= r15) goto L_0x013f
            r10 = r14[r5]     // Catch:{ Exception -> 0x013f }
            int r8 = r10.profile     // Catch:{ Exception -> 0x013f }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x013f }
            r8.<init>()     // Catch:{ Exception -> 0x013f }
            java.lang.String r6 = "steve : ["
            r8.append(r6)     // Catch:{ Exception -> 0x013f }
            r8.append(r9)     // Catch:{ Exception -> 0x013f }
            java.lang.String r6 = "] supported profiles:"
            r8.append(r6)     // Catch:{ Exception -> 0x013f }
            int r6 = r10.profile     // Catch:{ Exception -> 0x013f }
            r8.append(r6)     // Catch:{ Exception -> 0x013f }
            java.lang.String r6 = ", maxAllowedProfile: "
            r8.append(r6)     // Catch:{ Exception -> 0x013f }
            int r6 = r1.f314214s     // Catch:{ Exception -> 0x013f }
            r8.append(r6)     // Catch:{ Exception -> 0x013f }
            java.lang.String r6 = ", MIME:"
            r8.append(r6)     // Catch:{ Exception -> 0x013f }
            r8.append(r3)     // Catch:{ Exception -> 0x013f }
            java.lang.String r6 = r8.toString()     // Catch:{ Exception -> 0x013f }
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r4, r6)     // Catch:{ Exception -> 0x013f }
            int r5 = r5 + 1
            r6 = 1
            r10 = 8
            goto L_0x0103
        L_0x013f:
            int r13 = r13 + 1
            r6 = 1
            r10 = 8
            goto L_0x00f1
        L_0x0145:
            r5 = 256(0x100, float:3.59E-43)
            java.lang.String r6 = "level"
            java.lang.String r8 = "profile"
            int r9 = r1.f314214s
            boolean r0 = p206nj.C11171e.m11046c(r0)
            if (r0 == 0) goto L_0x020f
            android.media.MediaCodecInfo$CodecCapabilities r0 = r7.getCapabilitiesForType(r3)     // Catch:{ Exception -> 0x01f6 }
            if (r0 == 0) goto L_0x020f
            android.media.MediaCodecInfo$CodecProfileLevel[] r0 = r0.profileLevels     // Catch:{ Exception -> 0x01f6 }
            if (r0 == 0) goto L_0x020f
            android.media.MediaCodecInfo$CodecProfileLevel r7 = new android.media.MediaCodecInfo$CodecProfileLevel     // Catch:{ Exception -> 0x01f6 }
            r7.<init>()     // Catch:{ Exception -> 0x01f6 }
            r7.level = r2     // Catch:{ Exception -> 0x01f6 }
            r7.profile = r2     // Catch:{ Exception -> 0x01f6 }
            int r10 = r0.length     // Catch:{ Exception -> 0x01f6 }
            r11 = 0
        L_0x0168:
            if (r11 >= r10) goto L_0x01c2
            r12 = r0[r11]     // Catch:{ Exception -> 0x01f6 }
            int r13 = r12.profile     // Catch:{ Exception -> 0x01f6 }
            int r12 = r12.level     // Catch:{ Exception -> 0x01f6 }
            r14 = 1
            if (r13 == r14) goto L_0x017c
            r14 = 2
            if (r13 == r14) goto L_0x017c
            r14 = 8
            if (r13 == r14) goto L_0x017e
            r15 = 0
            goto L_0x017f
        L_0x017c:
            r14 = 8
        L_0x017e:
            r15 = 1
        L_0x017f:
            if (r15 == 0) goto L_0x0191
            int r15 = r7.profile     // Catch:{ Exception -> 0x01f6 }
            if (r13 < r15) goto L_0x018f
            int r15 = r7.level     // Catch:{ Exception -> 0x01f6 }
            if (r12 < r15) goto L_0x018f
            if (r13 > r9) goto L_0x018f
            r7.profile = r13     // Catch:{ Exception -> 0x01f6 }
            r7.level = r12     // Catch:{ Exception -> 0x01f6 }
        L_0x018f:
            r15 = 1
            goto L_0x0192
        L_0x0191:
            r15 = 0
        L_0x0192:
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01f6 }
            r14.<init>()     // Catch:{ Exception -> 0x01f6 }
            java.lang.String r2 = "steve : profile: "
            r14.append(r2)     // Catch:{ Exception -> 0x01f6 }
            r14.append(r13)     // Catch:{ Exception -> 0x01f6 }
            java.lang.String r2 = ", level: "
            r14.append(r2)     // Catch:{ Exception -> 0x01f6 }
            r14.append(r12)     // Catch:{ Exception -> 0x01f6 }
            java.lang.String r2 = ", maxProfile: "
            r14.append(r2)     // Catch:{ Exception -> 0x01f6 }
            r14.append(r9)     // Catch:{ Exception -> 0x01f6 }
            java.lang.String r2 = ", isRecognized:"
            r14.append(r2)     // Catch:{ Exception -> 0x01f6 }
            r14.append(r15)     // Catch:{ Exception -> 0x01f6 }
            java.lang.String r2 = r14.toString()     // Catch:{ Exception -> 0x01f6 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r2)     // Catch:{ Exception -> 0x01f6 }
            int r11 = r11 + 1
            r2 = 0
            goto L_0x0168
        L_0x01c2:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01f6 }
            r0.<init>()     // Catch:{ Exception -> 0x01f6 }
            java.lang.String r2 = "best profile: "
            r0.append(r2)     // Catch:{ Exception -> 0x01f6 }
            int r2 = r7.profile     // Catch:{ Exception -> 0x01f6 }
            r0.append(r2)     // Catch:{ Exception -> 0x01f6 }
            java.lang.String r2 = ", best level: "
            r0.append(r2)     // Catch:{ Exception -> 0x01f6 }
            int r2 = r7.level     // Catch:{ Exception -> 0x01f6 }
            r0.append(r2)     // Catch:{ Exception -> 0x01f6 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x01f6 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r0)     // Catch:{ Exception -> 0x01f6 }
            int r0 = r7.profile     // Catch:{ Exception -> 0x01f6 }
            if (r0 <= 0) goto L_0x020f
            int r2 = r7.level     // Catch:{ Exception -> 0x01f6 }
            if (r2 < r5) goto L_0x020f
            android.media.MediaFormat r2 = r1.f314198c     // Catch:{ Exception -> 0x01f6 }
            r2.setInteger(r8, r0)     // Catch:{ Exception -> 0x01f6 }
            android.media.MediaFormat r0 = r1.f314198c     // Catch:{ Exception -> 0x01f6 }
            r0.setInteger(r6, r5)     // Catch:{ Exception -> 0x01f6 }
            r0 = 1
            goto L_0x0210
        L_0x01f6:
            r0 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r5 = "trySetProfile error: "
            r2.append(r5)
            java.lang.String r0 = r0.getMessage()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r0)
        L_0x020f:
            r0 = 0
        L_0x0210:
            if (r0 == 0) goto L_0x021b
            android.media.MediaFormat r0 = r1.f314198c
            int r0 = r0.getInteger(r8)
            r1.f314213r = r0
            goto L_0x021e
        L_0x021b:
            r2 = 1
            r1.f314213r = r2
        L_0x021e:
            android.media.MediaFormat r0 = r1.f314198c
            java.lang.String r2 = "bitrate-mode"
            r5 = 2
            r0.setInteger(r2, r5)
            r2 = 0
            com.tencent.mm.compatible.deviceinfo.a r0 = com.tencent.p014mm.compatible.deviceinfo.C104619a.m140212d(r3, r2)     // Catch:{ Exception -> 0x0265 }
            r1.f314197b = r0     // Catch:{ Exception -> 0x0265 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "steve: mediaFormat: "
            r0.append(r2)
            android.media.MediaFormat r2 = r1.f314198c
            r0.append(r2)
            java.lang.String r2 = ", actProfile: "
            r0.append(r2)
            int r2 = r1.f314213r
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r0)
            com.tencent.mm.compatible.deviceinfo.a r0 = r1.f314197b
            android.media.MediaFormat r2 = r1.f314198c
            r3 = 0
            r4 = 1
            r0.mo148202a(r2, r3, r3, r4)
            com.tencent.mm.compatible.deviceinfo.a r0 = r1.f314197b
            r0.mo148222y()
            com.tencent.mm.plugin.voip.model.h r0 = new com.tencent.mm.plugin.voip.model.h
            r0.<init>()
            r1.f314212q = r0
            r0 = 2000(0x7d0, float:2.803E-42)
            return r0
        L_0x0265:
            r0 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = " error:"
            r2.append(r3)
            java.lang.String r0 = r0.toString()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r0)
            r0 = 2002(0x7d2, float:2.805E-42)
            r1.f314196a = r0
            r0 = -2002(0xfffffffffffff82e, float:NaN)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.multitalk.ilinkservice.C105674p.mo150539a():int");
    }

    /* renamed from: b */
    public final void mo150540b() {
        try {
            C104619a aVar = this.f314197b;
            if (aVar != null) {
                aVar.mo148223z();
                this.f314197b.mo148214p();
            }
        } catch (Exception e) {
            Log.m105920e("ILink[HWEnc]", " error:" + e.toString());
        }
    }

    /* renamed from: c */
    public void mo150541c(byte[] bArr, int i, int i2) {
        if (bArr != null) {
            int SendVideoData = C105714w.f314302c.SendVideoData(bArr, bArr.length, this.f314203h, i, this.f314204i ? 146 : 18);
            if (SendVideoData > 0) {
                Log.m105918d("ILink[HWEnc]", "steve: send successfully! frameLen = " + i2 + ", type = " + i + ", pkt cnt = " + SendVideoData);
            }
        }
    }
}
