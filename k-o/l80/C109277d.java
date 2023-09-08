package l80;

import android.media.MediaCodecInfo;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.tav.decoder.EncoderWriter;
import di3.C86312j;
import gy3.C8480h;
import gy3.C87412m;
import h81.C32735h;

/* renamed from: l80.d */
public class C109277d extends C99345a {

    /* renamed from: b */
    public int f327159b;

    /* renamed from: c */
    public int f327160c;

    /* renamed from: d */
    public int f327161d;

    /* renamed from: e */
    public int f327162e;

    /* renamed from: f */
    public int f327163f;

    /* renamed from: g */
    public int f327164g;

    /* renamed from: h */
    public String f327165h;

    /* renamed from: i */
    public boolean f327166i;

    /* renamed from: j */
    public boolean f327167j;

    /* renamed from: k */
    public int f327168k;

    /* renamed from: l */
    public int f327169l;

    /* renamed from: m */
    public MediaCodecInfo f327170m;

    /* renamed from: n */
    public String f327171n;

    public C109277d(boolean z) {
        this.f327163f = EncoderWriter.OUTPUT_VIDEO_COLOR_FORMAT;
        this.f327164g = 1;
        this.f327171n = "video/avc";
        Log.m105924i("MicroMsg.VideoCodecConfig", "init, enableHevc:" + z);
        if (z) {
            MediaCodecInfo a = mo138760a("video/hevc");
            this.f327170m = a;
            if (a == null) {
                Log.m105920e("MicroMsg.VideoCodecConfig", "cannot found hevc codec info! fallback to select avc codec");
                this.f327170m = mo138760a("video/avc");
                this.f327171n = "video/avc";
                C115669n.INSTANCE.mo175913w(1280, 61, 1);
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("success select hevc codec:");
                MediaCodecInfo mediaCodecInfo = this.f327170m;
                sb.append(mediaCodecInfo != null ? mediaCodecInfo.getName() : null);
                Log.m105924i("MicroMsg.VideoCodecConfig", sb.toString());
                this.f327171n = "video/hevc";
                C115669n.INSTANCE.mo175913w(1280, 60, 1);
            }
        } else {
            this.f327170m = mo138760a("video/avc");
            this.f327171n = "video/avc";
        }
        MediaCodecInfo mediaCodecInfo2 = this.f327170m;
        if (mediaCodecInfo2 == null) {
            C115669n.INSTANCE.mo175913w(1047, 0, 1);
            this.f327166i = true;
            return;
        }
        C87412m.m108591d(mediaCodecInfo2);
        this.f327165h = mediaCodecInfo2.getName();
        this.f327164g = ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_media_iframe, 1);
        Log.m105924i("MicroMsg.VideoCodecConfig", "codecInfo.name : " + this.f327165h + "  iFrameInterval " + this.f327164g);
    }

    /* JADX WARNING: Removed duplicated region for block: B:60:0x01b2  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x022a  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x022c  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0243  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.media.MediaFormat mo160510b() {
        /*
            r20 = this;
            r1 = r20
            java.lang.String r2 = "bitrate-mode"
            java.lang.Class<h81.h> r3 = h81.C32735h.class
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r4 = "targetWidth:"
            r0.append(r4)
            int r4 = r1.f327159b
            r0.append(r4)
            java.lang.String r4 = ", targetHeight:"
            r0.append(r4)
            int r4 = r1.f327160c
            r0.append(r4)
            java.lang.String r4 = ", bitrate:"
            r0.append(r4)
            int r4 = r1.f327161d
            r0.append(r4)
            java.lang.String r4 = ", frameRate:"
            r0.append(r4)
            int r4 = r1.f327162e
            r0.append(r4)
            java.lang.String r4 = ", colorFormat:"
            r0.append(r4)
            int r4 = r1.f327163f
            r0.append(r4)
            java.lang.String r4 = ", iFrameInterval:"
            r0.append(r4)
            int r4 = r1.f327164g
            r0.append(r4)
            java.lang.String r4 = ", value: minQP:"
            r0.append(r4)
            int r5 = r1.f327168k
            r0.append(r5)
            java.lang.String r5 = ", maxQP:"
            r0.append(r5)
            int r6 = r1.f327169l
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            java.lang.String r6 = "MicroMsg.VideoCodecConfig"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r0)
            java.lang.String r0 = r1.f327171n
            int r7 = r1.f327159b
            int r8 = r1.f327160c
            android.media.MediaFormat r7 = android.media.MediaFormat.createVideoFormat(r0, r7, r8)
            java.lang.String r0 = "createVideoFormat(mimeTy…argetWidth, targetHeight)"
            gy3.C87412m.m108593f(r7, r0)
            android.media.MediaCodecInfo r0 = r1.f327170m
            gy3.C87412m.m108591d(r0)
            java.lang.String r8 = r1.f327171n
            java.lang.String r9 = "level"
            java.lang.String r10 = "mimeType"
            gy3.C87412m.m108594g(r8, r10)
            r11 = 23
            boolean r11 = p206nj.C11171e.m11046c(r11)
            r12 = 2
            r14 = 0
            if (r11 == 0) goto L_0x013c
            android.media.MediaCodecInfo$CodecCapabilities r0 = r0.getCapabilitiesForType(r8)     // Catch:{ Exception -> 0x012c }
            if (r0 == 0) goto L_0x013c
            android.media.MediaCodecInfo$CodecProfileLevel[] r0 = r0.profileLevels     // Catch:{ Exception -> 0x012c }
            if (r0 == 0) goto L_0x013c
            android.media.MediaCodecInfo$CodecProfileLevel r8 = new android.media.MediaCodecInfo$CodecProfileLevel     // Catch:{ Exception -> 0x012c }
            r8.<init>()     // Catch:{ Exception -> 0x012c }
            r8.level = r14     // Catch:{ Exception -> 0x012c }
            r8.profile = r14     // Catch:{ Exception -> 0x012c }
            int r11 = r0.length     // Catch:{ Exception -> 0x012c }
            r15 = 0
        L_0x00a0:
            if (r15 >= r11) goto L_0x00e5
            r13 = r0[r15]     // Catch:{ Exception -> 0x012c }
            int r14 = r13.profile     // Catch:{ Exception -> 0x012c }
            int r13 = r13.level     // Catch:{ Exception -> 0x012c }
            r17 = r0
            java.lang.String r0 = "profile: %s, level: %s"
            r18 = r11
            java.lang.Object[] r11 = new java.lang.Object[r12]     // Catch:{ Exception -> 0x012c }
            java.lang.Integer r19 = java.lang.Integer.valueOf(r14)     // Catch:{ Exception -> 0x012c }
            r16 = 0
            r11[r16] = r19     // Catch:{ Exception -> 0x012c }
            java.lang.Integer r19 = java.lang.Integer.valueOf(r13)     // Catch:{ Exception -> 0x012c }
            r12 = 1
            r11[r12] = r19     // Catch:{ Exception -> 0x012c }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r0, r11)     // Catch:{ Exception -> 0x012c }
            if (r14 == r12) goto L_0x00cd
            r11 = 2
            if (r14 == r11) goto L_0x00cd
            r0 = 8
            if (r14 == r0) goto L_0x00cd
            r0 = 0
            goto L_0x00ce
        L_0x00cd:
            r0 = 1
        L_0x00ce:
            if (r0 == 0) goto L_0x00dc
            int r0 = r8.profile     // Catch:{ Exception -> 0x012c }
            if (r14 < r0) goto L_0x00dc
            int r0 = r8.level     // Catch:{ Exception -> 0x012c }
            if (r13 < r0) goto L_0x00dc
            r8.profile = r14     // Catch:{ Exception -> 0x012c }
            r8.level = r13     // Catch:{ Exception -> 0x012c }
        L_0x00dc:
            int r15 = r15 + 1
            r0 = r17
            r11 = r18
            r12 = 2
            r14 = 0
            goto L_0x00a0
        L_0x00e5:
            java.lang.String r0 = "best profile: %s, level: %s"
            r11 = 2
            java.lang.Object[] r12 = new java.lang.Object[r11]     // Catch:{ Exception -> 0x012c }
            int r11 = r8.profile     // Catch:{ Exception -> 0x012c }
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch:{ Exception -> 0x012c }
            r13 = 0
            r12[r13] = r11     // Catch:{ Exception -> 0x012c }
            int r11 = r8.level     // Catch:{ Exception -> 0x012c }
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch:{ Exception -> 0x012c }
            r13 = 1
            r12[r13] = r11     // Catch:{ Exception -> 0x012c }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r0, r12)     // Catch:{ Exception -> 0x012c }
            int r0 = r8.profile     // Catch:{ Exception -> 0x012c }
            if (r0 <= 0) goto L_0x013c
            int r11 = r8.level     // Catch:{ Exception -> 0x012c }
            r12 = 256(0x100, float:3.59E-43)
            if (r11 < r12) goto L_0x013c
            java.lang.String r11 = "profile"
            r7.setInteger(r11, r0)     // Catch:{ Exception -> 0x012c }
            int r0 = r8.level     // Catch:{ Exception -> 0x012c }
            r7.setInteger(r9, r0)     // Catch:{ Exception -> 0x012c }
            di3.d r0 = di3.C86312j.m106911c(r3)     // Catch:{ Exception -> 0x012c }
            h81.h r0 = (h81.C32735h) r0     // Catch:{ Exception -> 0x012c }
            h81.h$c r11 = h81.C32735h.C32737c.clicfg_mediacodec_level_limit     // Catch:{ Exception -> 0x012c }
            r12 = 1
            boolean r0 = r0.mo58784wf(r11, r12)     // Catch:{ Exception -> 0x012c }
            if (r0 == 0) goto L_0x013c
            int r0 = r8.level     // Catch:{ Exception -> 0x012c }
            r8 = 65536(0x10000, float:9.18355E-41)
            if (r0 < r8) goto L_0x013c
            r7.setInteger(r9, r8)     // Catch:{ Exception -> 0x012c }
            goto L_0x013c
        L_0x012c:
            r0 = move-exception
            r8 = 1
            java.lang.Object[] r9 = new java.lang.Object[r8]
            java.lang.String r0 = r0.getMessage()
            r8 = 0
            r9[r8] = r0
            java.lang.String r0 = "trySetProfile error: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r6, r0, r9)
        L_0x013c:
            android.media.MediaCodecInfo r0 = r1.f327170m
            gy3.C87412m.m108591d(r0)
            java.lang.String r8 = r1.f327171n
            gy3.C87412m.m108594g(r8, r10)
            r9 = 21
            boolean r9 = p206nj.C11171e.m11046c(r9)     // Catch:{ Exception -> 0x0182 }
            if (r9 == 0) goto L_0x0192
            android.media.MediaCodecInfo$CodecCapabilities r0 = r0.getCapabilitiesForType(r8)     // Catch:{ Exception -> 0x0182 }
            if (r0 == 0) goto L_0x0192
            android.media.MediaCodecInfo$EncoderCapabilities r0 = r0.getEncoderCapabilities()     // Catch:{ Exception -> 0x0182 }
            if (r0 == 0) goto L_0x0192
            r8 = 1
            boolean r9 = r0.isBitrateModeSupported(r8)     // Catch:{ Exception -> 0x0180 }
            if (r9 == 0) goto L_0x016a
            java.lang.String r0 = "support vbr bitrate mode"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r0)     // Catch:{ Exception -> 0x0180 }
            r7.setInteger(r2, r8)     // Catch:{ Exception -> 0x0180 }
            goto L_0x0192
        L_0x016a:
            r8 = 2
            boolean r0 = r0.isBitrateModeSupported(r8)     // Catch:{ Exception -> 0x0182 }
            if (r0 == 0) goto L_0x017a
            java.lang.String r0 = "support cbr bitrate mode"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r0)     // Catch:{ Exception -> 0x0182 }
            r7.setInteger(r2, r8)     // Catch:{ Exception -> 0x0182 }
            goto L_0x0192
        L_0x017a:
            java.lang.String r0 = "both vbr and cbr bitrate mode not support!"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r0)     // Catch:{ Exception -> 0x0182 }
            goto L_0x0192
        L_0x0180:
            r0 = move-exception
            goto L_0x0184
        L_0x0182:
            r0 = move-exception
            r8 = 1
        L_0x0184:
            java.lang.Object[] r9 = new java.lang.Object[r8]
            java.lang.String r0 = r0.getMessage()
            r8 = 0
            r9[r8] = r0
            java.lang.String r0 = "trySetBitRateMode error: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r6, r0, r9)
        L_0x0192:
            int r0 = r1.f327161d
            java.lang.String r8 = "bitrate"
            r7.setInteger(r8, r0)
            int r0 = r1.f327162e
            java.lang.String r8 = "frame-rate"
            r7.setInteger(r8, r0)
            int r0 = r1.f327163f
            java.lang.String r8 = "color-format"
            r7.setInteger(r8, r0)
            int r0 = r1.f327164g
            java.lang.String r8 = "i-frame-interval"
            r7.setInteger(r8, r0)
            boolean r0 = r1.f327167j
            if (r0 == 0) goto L_0x01c4
            r8 = 1
            java.lang.Object[] r0 = new java.lang.Object[r8]
            java.lang.String r8 = r7.toString()
            r9 = 0
            r0[r9] = r8
            java.lang.String r8 = "mediaformat force set BITRATE_MODE_CQ, %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r8, r0)
            r7.setInteger(r2, r9)
        L_0x01c4:
            int r0 = r1.f327168k
            if (r0 == 0) goto L_0x021b
            int r0 = r1.f327169l
            if (r0 == 0) goto L_0x021b
            java.lang.String r0 = "HardcoderQP"
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r0 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getMMKV(r0)
            if (r0 == 0) goto L_0x021b
            java.lang.String r2 = "HCMinQPKey"
            r8 = 0
            java.lang.String r2 = r0.decodeString(r2, r8)
            java.lang.String r9 = "HCMaxQPKey"
            java.lang.String r0 = r0.decodeString(r9, r8)
            if (r2 == 0) goto L_0x021b
            if (r0 == 0) goto L_0x021b
            int r8 = r1.f327169l
            r7.setInteger(r0, r8)
            int r8 = r1.f327168k
            r7.setInteger(r2, r8)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "steve:[hardcoder]configToFormat mediaformat set QP! key: min:"
            r8.append(r9)
            r8.append(r2)
            java.lang.String r2 = ", max:"
            r8.append(r2)
            r8.append(r0)
            r8.append(r4)
            int r0 = r1.f327168k
            r8.append(r0)
            r8.append(r5)
            int r0 = r1.f327169l
            r8.append(r0)
            java.lang.String r0 = r8.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r0)
        L_0x021b:
            di3.d r0 = di3.C86312j.m106911c(r3)
            h81.h r0 = (h81.C32735h) r0
            h81.h$c r2 = h81.C32735h.C32737c.clicfg_hardcoder_b_frame_enable
            r3 = 1
            int r0 = r0.mo58779Qe(r2, r3)
            if (r0 != r3) goto L_0x022c
            r0 = 1
            goto L_0x022d
        L_0x022c:
            r0 = 0
        L_0x022d:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "enableSetBFrameToCodec:"
            r2.append(r3)
            r2.append(r0)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r2)
            if (r0 == 0) goto L_0x02b3
            java.lang.String r0 = "HardcoderBFrame"
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r0 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getMMKV(r0)
            java.lang.String r2 = "BFrameKey"
            boolean r3 = r0.containsKey(r2)
            if (r3 == 0) goto L_0x02ae
            java.lang.String r3 = ""
            java.lang.String r2 = r0.getString(r2, r3)
            if (r2 != 0) goto L_0x025a
            goto L_0x025b
        L_0x025a:
            r3 = r2
        L_0x025b:
            r2 = -1
            java.lang.String r4 = "BFrameKeyOptionOpen"
            int r4 = r0.getInt(r4, r2)
            java.lang.String r5 = "BFrameKeyOptionClose"
            int r0 = r0.getInt(r5, r2)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r8 = "configBFrameFormat, get BFrameKey:"
            r5.append(r8)
            r5.append(r3)
            java.lang.String r8 = ", BFrameKeyOptionOpen:"
            r5.append(r8)
            r5.append(r4)
            java.lang.String r8 = ", BFrameKeyOptionClose:"
            r5.append(r8)
            r5.append(r0)
            java.lang.String r5 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r5)
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            if (r5 != 0) goto L_0x0299
            if (r4 == r2) goto L_0x0299
            if (r0 == r2) goto L_0x0299
            r7.setInteger(r3, r4)
        L_0x0299:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "finished configBFrame, mediaFormat:"
            r0.append(r2)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r0)
            goto L_0x02b3
        L_0x02ae:
            java.lang.String r0 = "configBFrameFormat, not contain BFrameKey"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r0)
        L_0x02b3:
            r2 = 1
            java.lang.Object[] r0 = new java.lang.Object[r2]
            r2 = 0
            r0[r2] = r7
            java.lang.String r2 = "mediaFormat: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r2, r0)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: l80.C109277d.mo160510b():android.media.MediaFormat");
    }

    public String toString() {
        return "VideoCodecConfig(targetWidth=" + this.f327159b + ", targetHeight=" + this.f327160c + ", bitrate=" + this.f327161d + ", frameRate=" + this.f327162e + ", colorFormat=" + this.f327163f + ", iFrameInterval=" + this.f327164g + ", name=" + this.f327165h + ", initError=" + this.f327166i + ", forceCQ=" + this.f327167j + ", codecInfo=" + this.f327170m + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C109277d(boolean z, int i, C8480h hVar) {
        this((i & 1) != 0 ? false : z);
    }
}
