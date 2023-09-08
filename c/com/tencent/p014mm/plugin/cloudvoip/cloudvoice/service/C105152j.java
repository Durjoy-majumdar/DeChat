package com.tencent.p014mm.plugin.cloudvoip.cloudvoice.service;

import android.media.MediaFormat;
import android.os.Environment;
import com.tencent.p014mm.compatible.deviceinfo.C104619a;
import com.tencent.p014mm.plugin.voip.model.C106349h;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.cloudvoip.cloudvoice.service.j */
public class C105152j {

    /* renamed from: x */
    public static int f312221x;

    /* renamed from: y */
    public static int f312222y = 18;

    /* renamed from: z */
    public static final String[] f312223z = {MediaCodecUtils.QCOM_PREFIX, MediaCodecUtils.EXYNOS_PREFIX, "OMX.hisi", "OMX.MTK", "OMX.sprd", "c2.exynos", "c2.qti", "c2.mtk", "c2.unisoc"};

    /* renamed from: a */
    public int f312224a;

    /* renamed from: b */
    public C104619a f312225b;

    /* renamed from: c */
    public MediaFormat f312226c;

    /* renamed from: d */
    public int f312227d;

    /* renamed from: e */
    public int f312228e;

    /* renamed from: f */
    public int f312229f;

    /* renamed from: g */
    public int f312230g;

    /* renamed from: h */
    public int f312231h = -2;

    /* renamed from: i */
    public boolean f312232i = false;

    /* renamed from: j */
    public byte[] f312233j = null;

    /* renamed from: k */
    public boolean f312234k = false;

    /* renamed from: l */
    public int f312235l;

    /* renamed from: m */
    public int f312236m;

    /* renamed from: n */
    public byte[] f312237n;

    /* renamed from: o */
    public long f312238o;

    /* renamed from: p */
    public long f312239p;

    /* renamed from: q */
    public C106349h f312240q = null;

    /* renamed from: r */
    public int f312241r;

    /* renamed from: s */
    public int f312242s;

    /* renamed from: t */
    public int f312243t;

    /* renamed from: u */
    public int f312244u;

    /* renamed from: v */
    public C105126a f312245v;

    /* renamed from: w */
    public int f312246w = 0;

    static {
        Environment.getExternalStorageDirectory().getAbsolutePath();
    }

    public C105152j(int i, int i2, int i3, int i4, int i5, String str) {
        this.f312227d = i;
        this.f312228e = i2;
        this.f312235l = i;
        this.f312236m = i2;
        this.f312229f = i3;
        this.f312230g = i4;
        f312221x = 0;
        this.f312238o = 0;
        this.f312245v = new C105126a();
        this.f312225b = null;
        this.f312242s = 8;
        this.f312241r = 0;
        this.f312243t = 0;
        this.f312224a = 0;
        this.f312237n = null;
        this.f312244u = 0;
        this.f312239p = 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:62:0x0188 A[Catch:{ Exception -> 0x01fe }] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0198 A[Catch:{ Exception -> 0x01fe }] */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x021b  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0224  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo149472a() {
        /*
            r16 = this;
            r1 = r16
            com.tencent.mm.compatible.deviceinfo.a r0 = r1.f312225b
            if (r0 == 0) goto L_0x0009
            r16.mo149473b()
        L_0x0009:
            int r0 = android.media.MediaCodecList.getCodecCount()
            r2 = 0
            r3 = 0
        L_0x000f:
            java.lang.String r4 = "OpenVoice[HWEnc]"
            java.lang.String r6 = "video/avc"
            if (r3 >= r0) goto L_0x0051
            android.media.MediaCodecInfo r7 = android.media.MediaCodecList.getCodecInfoAt(r3)
            boolean r8 = r7.isEncoder()
            if (r8 != 0) goto L_0x0021
            goto L_0x004e
        L_0x0021:
            java.lang.String[] r8 = r7.getSupportedTypes()
            r9 = 0
        L_0x0026:
            int r10 = r8.length
            if (r9 >= r10) goto L_0x004e
            r10 = r8[r9]
            boolean r10 = r10.equalsIgnoreCase(r6)
            if (r10 == 0) goto L_0x004b
            java.lang.String r0 = r7.getName()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r8 = "steve : H.264 HW encoder found:"
            r3.append(r8)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r4, r0)
            goto L_0x0052
        L_0x004b:
            int r9 = r9 + 1
            goto L_0x0026
        L_0x004e:
            int r3 = r3 + 1
            goto L_0x000f
        L_0x0051:
            r7 = 0
        L_0x0052:
            if (r7 != 0) goto L_0x0061
            java.lang.String r0 = "steve: Unable to find an appropriate codec for video/avc"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r0)
            r0 = 2001(0x7d1, float:2.804E-42)
            r1.f312224a = r0
            r0 = -2001(0xfffffffffffff82f, float:NaN)
            return r0
        L_0x0061:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "steve: found HW codec: "
            r0.append(r3)
            java.lang.String r3 = r7.getName()
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r0)
            int r0 = r1.f312227d
            int r3 = r1.f312228e
            android.media.MediaFormat r0 = android.media.MediaFormat.createVideoFormat(r6, r0, r3)
            r1.f312226c = r0
            r3 = 21
            java.lang.String r6 = "color-format"
            r0.setInteger(r6, r3)
            android.media.MediaFormat r0 = r1.f312226c
            int r3 = r1.f312230g
            int r3 = r3 * 1000
            java.lang.String r6 = "bitrate"
            r0.setInteger(r6, r3)
            android.media.MediaFormat r0 = r1.f312226c
            int r3 = r1.f312229f
            java.lang.String r6 = "frame-rate"
            r0.setInteger(r6, r3)
            android.media.MediaFormat r0 = r1.f312226c
            java.lang.String r3 = "i-frame-interval"
            r6 = 1
            r0.setInteger(r3, r6)
            android.media.MediaFormat r0 = r1.f312226c
            java.lang.String r3 = "mime"
            java.lang.String r3 = r0.getString(r3)
            r1.f312241r = r6
            java.lang.String r0 = r7.getName()
            java.lang.String[] r8 = f312223z
            int r9 = r8.length
            r10 = 0
        L_0x00b9:
            if (r10 >= r9) goto L_0x00dd
            r11 = r8[r10]
            boolean r11 = r0.startsWith(r11)
            if (r11 == 0) goto L_0x00da
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "steve : known H.264 HW encoder :"
            r8.append(r9)
            r8.append(r0)
            java.lang.String r0 = r8.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r4, r0)
            r0 = 1
            goto L_0x00de
        L_0x00da:
            int r10 = r10 + 1
            goto L_0x00b9
        L_0x00dd:
            r0 = 0
        L_0x00de:
            if (r0 == 0) goto L_0x0227
            r0 = 23
            boolean r9 = p206nj.C11171e.m11046c(r0)
            if (r9 == 0) goto L_0x0227
            int r9 = r1.f312242s
            r10 = 8
            if (r10 > r9) goto L_0x014b
            java.lang.String r9 = r7.getName()
            java.lang.String[] r11 = f312223z
            int r12 = r11.length
            r13 = 0
        L_0x00f6:
            if (r13 >= r12) goto L_0x014b
            r14 = r11[r13]
            boolean r14 = r9.startsWith(r14)
            if (r14 == 0) goto L_0x0145
            android.media.MediaCodecInfo$CodecCapabilities r14 = r7.getCapabilitiesForType(r3)     // Catch:{ Exception -> 0x0145 }
            android.media.MediaCodecInfo$CodecProfileLevel[] r14 = r14.profileLevels     // Catch:{ Exception -> 0x0145 }
            int r15 = r14.length     // Catch:{ Exception -> 0x0145 }
            r5 = 0
        L_0x0108:
            if (r5 >= r15) goto L_0x0145
            r10 = r14[r5]     // Catch:{ Exception -> 0x0145 }
            int r8 = r10.profile     // Catch:{ Exception -> 0x0145 }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0145 }
            r8.<init>()     // Catch:{ Exception -> 0x0145 }
            java.lang.String r6 = "steve : ["
            r8.append(r6)     // Catch:{ Exception -> 0x0145 }
            r8.append(r9)     // Catch:{ Exception -> 0x0145 }
            java.lang.String r6 = "] supported profiles:"
            r8.append(r6)     // Catch:{ Exception -> 0x0145 }
            int r6 = r10.profile     // Catch:{ Exception -> 0x0145 }
            r8.append(r6)     // Catch:{ Exception -> 0x0145 }
            java.lang.String r6 = ", maxAllowedProfile: "
            r8.append(r6)     // Catch:{ Exception -> 0x0145 }
            int r6 = r1.f312242s     // Catch:{ Exception -> 0x0145 }
            r8.append(r6)     // Catch:{ Exception -> 0x0145 }
            java.lang.String r6 = ", MIME:"
            r8.append(r6)     // Catch:{ Exception -> 0x0145 }
            r8.append(r3)     // Catch:{ Exception -> 0x0145 }
            java.lang.String r6 = r8.toString()     // Catch:{ Exception -> 0x0145 }
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r4, r6)     // Catch:{ Exception -> 0x0145 }
            int r5 = r5 + 1
            r6 = 1
            r10 = 8
            goto L_0x0108
        L_0x0145:
            int r13 = r13 + 1
            r6 = 1
            r10 = 8
            goto L_0x00f6
        L_0x014b:
            r5 = 256(0x100, float:3.59E-43)
            java.lang.String r6 = "level"
            java.lang.String r8 = "profile"
            int r9 = r1.f312242s
            boolean r0 = p206nj.C11171e.m11046c(r0)
            if (r0 == 0) goto L_0x0218
            android.media.MediaCodecInfo$CodecCapabilities r0 = r7.getCapabilitiesForType(r3)     // Catch:{ Exception -> 0x01fe }
            if (r0 == 0) goto L_0x0218
            android.media.MediaCodecInfo$CodecProfileLevel[] r0 = r0.profileLevels     // Catch:{ Exception -> 0x01fe }
            if (r0 == 0) goto L_0x0218
            android.media.MediaCodecInfo$CodecProfileLevel r7 = new android.media.MediaCodecInfo$CodecProfileLevel     // Catch:{ Exception -> 0x01fe }
            r7.<init>()     // Catch:{ Exception -> 0x01fe }
            r7.level = r2     // Catch:{ Exception -> 0x01fe }
            r7.profile = r2     // Catch:{ Exception -> 0x01fe }
            int r10 = r0.length     // Catch:{ Exception -> 0x01fe }
            r11 = 0
        L_0x016f:
            if (r11 >= r10) goto L_0x01ca
            r12 = r0[r11]     // Catch:{ Exception -> 0x01fe }
            int r13 = r12.profile     // Catch:{ Exception -> 0x01fe }
            int r12 = r12.level     // Catch:{ Exception -> 0x01fe }
            r14 = 1
            if (r13 == r14) goto L_0x0183
            r14 = 2
            if (r13 == r14) goto L_0x0183
            r14 = 8
            if (r13 == r14) goto L_0x0185
            r15 = 0
            goto L_0x0186
        L_0x0183:
            r14 = 8
        L_0x0185:
            r15 = 1
        L_0x0186:
            if (r15 == 0) goto L_0x0198
            int r15 = r7.profile     // Catch:{ Exception -> 0x01fe }
            if (r13 < r15) goto L_0x0196
            int r15 = r7.level     // Catch:{ Exception -> 0x01fe }
            if (r12 < r15) goto L_0x0196
            if (r13 > r9) goto L_0x0196
            r7.profile = r13     // Catch:{ Exception -> 0x01fe }
            r7.level = r12     // Catch:{ Exception -> 0x01fe }
        L_0x0196:
            r15 = 1
            goto L_0x0199
        L_0x0198:
            r15 = 0
        L_0x0199:
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01fe }
            r14.<init>()     // Catch:{ Exception -> 0x01fe }
            java.lang.String r2 = "steve : profile: "
            r14.append(r2)     // Catch:{ Exception -> 0x01fe }
            r14.append(r13)     // Catch:{ Exception -> 0x01fe }
            java.lang.String r2 = ", level: "
            r14.append(r2)     // Catch:{ Exception -> 0x01fe }
            r14.append(r12)     // Catch:{ Exception -> 0x01fe }
            java.lang.String r2 = ", maxProfile: "
            r14.append(r2)     // Catch:{ Exception -> 0x01fe }
            r14.append(r9)     // Catch:{ Exception -> 0x01fe }
            java.lang.String r2 = ", isRecognized:"
            r14.append(r2)     // Catch:{ Exception -> 0x01fe }
            r14.append(r15)     // Catch:{ Exception -> 0x01fe }
            java.lang.String r2 = r14.toString()     // Catch:{ Exception -> 0x01fe }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r2)     // Catch:{ Exception -> 0x01fe }
            int r11 = r11 + 1
            r2 = 0
            goto L_0x016f
        L_0x01ca:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01fe }
            r0.<init>()     // Catch:{ Exception -> 0x01fe }
            java.lang.String r2 = "best profile: "
            r0.append(r2)     // Catch:{ Exception -> 0x01fe }
            int r2 = r7.profile     // Catch:{ Exception -> 0x01fe }
            r0.append(r2)     // Catch:{ Exception -> 0x01fe }
            java.lang.String r2 = ", best level: "
            r0.append(r2)     // Catch:{ Exception -> 0x01fe }
            int r2 = r7.level     // Catch:{ Exception -> 0x01fe }
            r0.append(r2)     // Catch:{ Exception -> 0x01fe }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x01fe }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r0)     // Catch:{ Exception -> 0x01fe }
            int r0 = r7.profile     // Catch:{ Exception -> 0x01fe }
            if (r0 <= 0) goto L_0x0218
            int r2 = r7.level     // Catch:{ Exception -> 0x01fe }
            if (r2 < r5) goto L_0x0218
            android.media.MediaFormat r2 = r1.f312226c     // Catch:{ Exception -> 0x01fe }
            r2.setInteger(r8, r0)     // Catch:{ Exception -> 0x01fe }
            android.media.MediaFormat r0 = r1.f312226c     // Catch:{ Exception -> 0x01fe }
            r0.setInteger(r6, r5)     // Catch:{ Exception -> 0x01fe }
            r0 = 1
            goto L_0x0219
        L_0x01fe:
            r0 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r5 = "trySetProfile error: "
            r2.append(r5)
            java.lang.String r0 = r0.getMessage()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r0)
        L_0x0218:
            r0 = 0
        L_0x0219:
            if (r0 == 0) goto L_0x0224
            android.media.MediaFormat r0 = r1.f312226c
            int r0 = r0.getInteger(r8)
            r1.f312241r = r0
            goto L_0x0227
        L_0x0224:
            r2 = 1
            r1.f312241r = r2
        L_0x0227:
            android.media.MediaFormat r0 = r1.f312226c
            java.lang.String r2 = "bitrate-mode"
            r5 = 2
            r0.setInteger(r2, r5)
            r2 = 0
            com.tencent.mm.compatible.deviceinfo.a r0 = com.tencent.p014mm.compatible.deviceinfo.C104619a.m140212d(r3, r2)     // Catch:{ Exception -> 0x026f }
            r1.f312225b = r0     // Catch:{ Exception -> 0x026f }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "steve: mediaFormat: "
            r0.append(r2)
            android.media.MediaFormat r2 = r1.f312226c
            r0.append(r2)
            java.lang.String r2 = ", actProfile: "
            r0.append(r2)
            int r2 = r1.f312241r
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r0)
            com.tencent.mm.compatible.deviceinfo.a r0 = r1.f312225b
            android.media.MediaFormat r2 = r1.f312226c
            r3 = 0
            r4 = 1
            r0.mo148202a(r2, r3, r3, r4)
            com.tencent.mm.compatible.deviceinfo.a r0 = r1.f312225b
            r0.mo148222y()
            com.tencent.mm.plugin.voip.model.h r0 = new com.tencent.mm.plugin.voip.model.h
            r0.<init>()
            r1.f312240q = r0
            r0 = 2000(0x7d0, float:2.803E-42)
            return r0
        L_0x026f:
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
            r1.f312224a = r0
            r0 = -2002(0xfffffffffffff82e, float:NaN)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.cloudvoip.cloudvoice.service.C105152j.mo149472a():int");
    }

    /* renamed from: b */
    public final void mo149473b() {
        try {
            C104619a aVar = this.f312225b;
            if (aVar != null) {
                aVar.mo148223z();
                this.f312225b.mo148214p();
            }
        } catch (Exception e) {
            Log.m105920e("OpenVoice[HWEnc]", " error:" + e.toString());
        }
    }

    /* renamed from: c */
    public void mo149474c(byte[] bArr, int i, int i2) {
        if (bArr != null) {
            int i3 = f312222y;
            if (this.f312232i) {
                i3 |= 128;
            }
            int i4 = this.f312231h;
            byte[] bArr2 = bArr;
            int SendVideoData = C105172s.f312297c.SendVideoData(bArr2, bArr.length, i4, i, i3);
            if (SendVideoData > 0) {
                Log.m105918d("OpenVoice[HWEnc]", "steve: send successfully! frameLen = " + i2 + ", type = " + i + ", mEncIdx: " + this.f312231h + ", pkt cnt = " + SendVideoData);
            }
        }
    }
}
