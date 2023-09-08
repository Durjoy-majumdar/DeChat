package com.tencent.liteav.videoproducer.encoder;

import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.media.MediaFormat;
import android.util.Pair;
import com.google.android.gms.common.Scopes;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.liteav.base.system.LiteavSystemInfo;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.videoproducer.encoder.VideoEncoderDef;

/* renamed from: com.tencent.liteav.videoproducer.encoder.u */
final class C104544u {

    /* renamed from: a */
    public boolean f309902a = true;

    /* renamed from: b */
    public boolean f309903b = true;

    /* renamed from: c */
    public boolean f309904c = true;

    /* renamed from: d */
    private final MediaCodec f309905d;

    /* renamed from: e */
    private final String f309906e;

    /* renamed from: f */
    private final VideoEncodeParams f309907f;

    /* renamed from: com.tencent.liteav.videoproducer.encoder.u$1 */
    public static /* synthetic */ class C175261 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f47580a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f47581b;

        /* JADX WARNING: Can't wrap try/catch for region: R(15:0|(2:1|2)|3|(2:5|6)|7|9|10|11|13|14|15|16|17|18|20) */
        /* JADX WARNING: Can't wrap try/catch for region: R(17:0|1|2|3|5|6|7|9|10|11|13|14|15|16|17|18|20) */
        /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0039 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0043 */
        static {
            /*
                com.tencent.liteav.videoproducer.encoder.VideoEncoderDef$EncoderProfile[] r0 = com.tencent.liteav.videoproducer.encoder.VideoEncoderDef.EncoderProfile.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f47581b = r0
                r1 = 1
                com.tencent.liteav.videoproducer.encoder.VideoEncoderDef$EncoderProfile r2 = com.tencent.liteav.videoproducer.encoder.VideoEncoderDef.EncoderProfile.PROFILE_MAIN     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f47581b     // Catch:{ NoSuchFieldError -> 0x001d }
                com.tencent.liteav.videoproducer.encoder.VideoEncoderDef$EncoderProfile r3 = com.tencent.liteav.videoproducer.encoder.VideoEncoderDef.EncoderProfile.PROFILE_HIGH     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f47581b     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.tencent.liteav.videoproducer.encoder.VideoEncoderDef$EncoderProfile r4 = com.tencent.liteav.videoproducer.encoder.VideoEncoderDef.EncoderProfile.PROFILE_BASELINE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                com.tencent.liteav.videoproducer.encoder.VideoEncoderDef$BitrateMode[] r3 = com.tencent.liteav.videoproducer.encoder.VideoEncoderDef.BitrateMode.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                f47580a = r3
                com.tencent.liteav.videoproducer.encoder.VideoEncoderDef$BitrateMode r4 = com.tencent.liteav.videoproducer.encoder.VideoEncoderDef.BitrateMode.CBR     // Catch:{ NoSuchFieldError -> 0x0039 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0039 }
                r3[r4] = r1     // Catch:{ NoSuchFieldError -> 0x0039 }
            L_0x0039:
                int[] r1 = f47580a     // Catch:{ NoSuchFieldError -> 0x0043 }
                com.tencent.liteav.videoproducer.encoder.VideoEncoderDef$BitrateMode r3 = com.tencent.liteav.videoproducer.encoder.VideoEncoderDef.BitrateMode.VBR     // Catch:{ NoSuchFieldError -> 0x0043 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
                r1[r3] = r0     // Catch:{ NoSuchFieldError -> 0x0043 }
            L_0x0043:
                int[] r0 = f47580a     // Catch:{ NoSuchFieldError -> 0x004d }
                com.tencent.liteav.videoproducer.encoder.VideoEncoderDef$BitrateMode r1 = com.tencent.liteav.videoproducer.encoder.VideoEncoderDef.BitrateMode.CQ     // Catch:{ NoSuchFieldError -> 0x004d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004d }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x004d }
            L_0x004d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.liteav.videoproducer.encoder.C104544u.C175261.<clinit>():void");
        }
    }

    public C104544u(MediaCodec mediaCodec, String str, VideoEncodeParams videoEncodeParams) {
        this.f309905d = mediaCodec;
        this.f309906e = str;
        this.f309907f = videoEncodeParams;
    }

    /* renamed from: a */
    private static Pair<Integer, Integer> m139930a(MediaFormat mediaFormat) {
        int i;
        int i2 = 0;
        try {
            i = mediaFormat.getInteger(Scopes.PROFILE);
        } catch (Exception e) {
            LiteavLog.m16902i("MediaFormatBuilder", "get profile fail.", e);
            i = 0;
        }
        try {
            i2 = mediaFormat.getInteger(FirebaseAnalytics.C113379b.LEVEL);
        } catch (Exception e2) {
            LiteavLog.m16902i("MediaFormatBuilder", "get level fail.", e2);
        }
        return new Pair<>(Integer.valueOf(i), Integer.valueOf(i2));
    }

    /* renamed from: b */
    private MediaCodecInfo.CodecCapabilities m139931b() {
        try {
            int codecCount = MediaCodecList.getCodecCount();
            for (int i = 0; i < codecCount; i++) {
                MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i);
                if (codecInfoAt.isEncoder()) {
                    for (String equalsIgnoreCase : codecInfoAt.getSupportedTypes()) {
                        if (equalsIgnoreCase.equalsIgnoreCase(this.f309906e)) {
                            return codecInfoAt.getCapabilitiesForType(this.f309906e);
                        }
                    }
                    continue;
                }
            }
            return null;
        } catch (Exception e) {
            LiteavLog.m16899e("MediaFormatBuilder", "Mediacodec error.", (Throwable) e);
            return null;
        }
    }

    /* renamed from: a */
    private MediaCodecInfo.VideoCapabilities m139929a(int i, int i2) {
        MediaCodecInfo.CodecCapabilities createFromProfileLevel;
        if (LiteavSystemInfo.getSystemOSVersionInt() >= 21 && (createFromProfileLevel = MediaCodecInfo.CodecCapabilities.createFromProfileLevel(this.f309906e, i, i2)) != null) {
            return createFromProfileLevel.getVideoCapabilities();
        }
        return null;
    }

    /* renamed from: a */
    private static int m139928a(VideoEncoderDef.BitrateMode bitrateMode) {
        int i;
        if (bitrateMode == null || (i = C175261.f47580a[bitrateMode.ordinal()]) == 1) {
            return 2;
        }
        if (i != 2) {
            return i != 3 ? 2 : 0;
        }
        return 1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:115:0x0274  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x0346  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00e2  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.media.MediaFormat mo147228a() {
        /*
            r20 = this;
            r1 = r20
            java.lang.String r2 = "value"
            java.lang.String r3 = "key"
            com.tencent.liteav.videoproducer.encoder.VideoEncodeParams r0 = r1.f309907f
            int r4 = r0.width
            java.lang.String r5 = "bitrate"
            r6 = 0
            if (r4 == 0) goto L_0x004a
            int r7 = r0.height
            if (r7 == 0) goto L_0x004a
            int r8 = r0.bitrate
            if (r8 == 0) goto L_0x004a
            int r0 = r0.fps
            if (r0 != 0) goto L_0x001c
            goto L_0x004a
        L_0x001c:
            java.lang.String r0 = r1.f309906e
            android.media.MediaFormat r0 = android.media.MediaFormat.createVideoFormat(r0, r4, r7)
            if (r0 != 0) goto L_0x0025
            goto L_0x004a
        L_0x0025:
            com.tencent.liteav.videoproducer.encoder.VideoEncodeParams r4 = r1.f309907f
            int r4 = r4.bitrate
            int r4 = r4 * 1024
            r0.setInteger(r5, r4)
            com.tencent.liteav.videoproducer.encoder.VideoEncodeParams r4 = r1.f309907f
            int r4 = r4.fps
            java.lang.String r7 = "frame-rate"
            r0.setInteger(r7, r4)
            r4 = 2130708361(0x7f000789, float:1.701803E38)
            java.lang.String r7 = "color-format"
            r0.setInteger(r7, r4)
            com.tencent.liteav.videoproducer.encoder.VideoEncodeParams r4 = r1.f309907f
            int r4 = r4.gop
            java.lang.String r7 = "i-frame-interval"
            r0.setInteger(r7, r4)
            r4 = r0
            goto L_0x004b
        L_0x004a:
            r4 = r6
        L_0x004b:
            if (r4 != 0) goto L_0x004e
            return r6
        L_0x004e:
            android.media.MediaCodecInfo$CodecCapabilities r0 = r20.m139931b()
            r7 = 23
            r8 = 21
            r10 = 1
            r11 = 2
            if (r0 == 0) goto L_0x0160
            int r12 = com.tencent.liteav.base.system.LiteavSystemInfo.getSystemOSVersionInt()
            if (r12 < r8) goto L_0x0160
            android.media.MediaCodecInfo$EncoderCapabilities r12 = r0.getEncoderCapabilities()
            if (r12 == 0) goto L_0x007b
            android.util.Range r12 = r12.getComplexityRange()
            if (r12 == 0) goto L_0x007b
            java.lang.Comparable r12 = r12.getUpper()
            java.lang.Integer r12 = (java.lang.Integer) r12
            int r12 = r12.intValue()
            java.lang.String r13 = "complexity"
            r4.setInteger(r13, r12)
        L_0x007b:
            boolean r12 = r1.f309904c
            if (r12 == 0) goto L_0x00e7
            com.tencent.liteav.videoproducer.encoder.VideoEncodeParams r12 = r1.f309907f
            com.tencent.liteav.videoproducer.encoder.VideoEncoderDef$EncoderProfile r13 = r12.encoderProfile
            com.tencent.liteav.videobase.common.CodecType r12 = r12.codecType
            com.tencent.liteav.videobase.common.CodecType r14 = com.tencent.liteav.videobase.common.CodecType.H265
            if (r12 != r14) goto L_0x008b
            r12 = 1
            goto L_0x008c
        L_0x008b:
            r12 = 0
        L_0x008c:
            if (r12 == 0) goto L_0x0095
            int r12 = com.tencent.liteav.base.system.LiteavSystemInfo.getSystemOSVersionInt()
            if (r12 < r8) goto L_0x0095
            goto L_0x0097
        L_0x0095:
            if (r13 != 0) goto L_0x0099
        L_0x0097:
            r12 = 1
            goto L_0x00aa
        L_0x0099:
            int[] r12 = com.tencent.liteav.videoproducer.encoder.C104544u.C175261.f47581b
            int r13 = r13.ordinal()
            r12 = r12[r13]
            if (r12 == r10) goto L_0x00a9
            if (r12 == r11) goto L_0x00a6
            goto L_0x0097
        L_0x00a6:
            r12 = 8
            goto L_0x00aa
        L_0x00a9:
            r12 = 2
        L_0x00aa:
            r13 = -2147483648(0xffffffff80000000, float:-0.0)
            java.lang.String r14 = r1.f309906e
            java.lang.String r15 = "video/avc"
            boolean r14 = r14.equals(r15)
            if (r14 == 0) goto L_0x00b8
            r13 = 256(0x100, float:3.59E-43)
        L_0x00b8:
            android.media.MediaCodecInfo$CodecProfileLevel[] r14 = r0.profileLevels
            int r15 = r14.length
            r6 = 0
            r8 = 0
            r9 = 0
        L_0x00be:
            if (r6 >= r15) goto L_0x00d7
            r11 = r14[r6]
            int r10 = r11.level
            if (r10 < r13) goto L_0x00d2
            int r11 = r11.profile
            if (r11 > r12) goto L_0x00d2
            if (r11 > r9) goto L_0x00d0
            if (r11 != r9) goto L_0x00d2
            if (r10 <= r8) goto L_0x00d2
        L_0x00d0:
            r8 = r10
            r9 = r11
        L_0x00d2:
            int r6 = r6 + 1
            r10 = 1
            r11 = 2
            goto L_0x00be
        L_0x00d7:
            java.lang.String r6 = "profile"
            r4.setInteger(r6, r9)
            int r6 = com.tencent.liteav.base.system.LiteavSystemInfo.getSystemOSVersionInt()
            if (r6 < r7) goto L_0x00e7
            java.lang.String r6 = "level"
            r4.setInteger(r6, r8)
        L_0x00e7:
            int r6 = com.tencent.liteav.base.system.LiteavSystemInfo.getSystemOSVersionInt()
            if (r6 >= r7) goto L_0x00ef
            r6 = 0
            goto L_0x0109
        L_0x00ef:
            android.util.Pair r6 = m139930a((android.media.MediaFormat) r4)
            java.lang.Object r8 = r6.first
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            java.lang.Object r6 = r6.second
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            java.lang.String r9 = r1.f309906e
            android.media.MediaCodecInfo$CodecCapabilities r6 = android.media.MediaCodecInfo.CodecCapabilities.createFromProfileLevel(r9, r8, r6)
        L_0x0109:
            if (r6 == 0) goto L_0x010c
            r0 = r6
        L_0x010c:
            boolean r6 = r1.f309902a
            java.lang.String r8 = "bitrate-mode"
            if (r6 == 0) goto L_0x011e
            com.tencent.liteav.videoproducer.encoder.VideoEncodeParams r6 = r1.f309907f
            com.tencent.liteav.videoproducer.encoder.VideoEncoderDef$BitrateMode r6 = r6.bitrateMode
            int r6 = m139928a((com.tencent.liteav.videoproducer.encoder.VideoEncoderDef.BitrateMode) r6)
            r4.setInteger(r8, r6)
            goto L_0x0160
        L_0x011e:
            boolean r6 = r1.f309903b
            if (r6 == 0) goto L_0x0160
            com.tencent.liteav.videoproducer.encoder.VideoEncodeParams r6 = r1.f309907f
            com.tencent.liteav.videoproducer.encoder.VideoEncoderDef$BitrateMode r6 = r6.bitrateMode
            int r6 = m139928a((com.tencent.liteav.videoproducer.encoder.VideoEncoderDef.BitrateMode) r6)
            android.media.MediaCodecInfo$EncoderCapabilities r9 = r0.getEncoderCapabilities()
            if (r9 == 0) goto L_0x0160
            boolean r10 = r9.isBitrateModeSupported(r6)
            if (r10 == 0) goto L_0x013a
            r4.setInteger(r8, r6)
            goto L_0x0160
        L_0x013a:
            com.tencent.liteav.videoproducer.encoder.VideoEncodeParams r6 = r1.f309907f
            boolean r6 = r6.fullIFrame
            if (r6 == 0) goto L_0x0156
            r6 = 1
            boolean r10 = r9.isBitrateModeSupported(r6)
            if (r10 == 0) goto L_0x014b
            r4.setInteger(r8, r6)
            goto L_0x0160
        L_0x014b:
            r6 = 2
            boolean r9 = r9.isBitrateModeSupported(r6)
            if (r9 == 0) goto L_0x0160
            r4.setInteger(r8, r6)
            goto L_0x0160
        L_0x0156:
            r6 = 2
            boolean r9 = r9.isBitrateModeSupported(r6)
            if (r9 == 0) goto L_0x0160
            r4.setInteger(r8, r6)
        L_0x0160:
            r6 = 4
            r8 = 3
            java.lang.String r9 = "MediaFormatBuilder"
            if (r0 == 0) goto L_0x01b1
            int r10 = com.tencent.liteav.base.system.LiteavSystemInfo.getSystemOSVersionInt()
            r11 = 21
            if (r10 < r11) goto L_0x01b1
            android.media.MediaCodecInfo$VideoCapabilities r0 = r0.getVideoCapabilities()
            if (r0 == 0) goto L_0x01b1
            android.util.Range r0 = r0.getBitrateRange()
            int r10 = r4.getInteger(r5)
            java.lang.Integer r11 = java.lang.Integer.valueOf(r10)
            java.lang.Comparable r11 = r0.clamp(r11)
            java.lang.Integer r11 = (java.lang.Integer) r11
            int r11 = r11.intValue()
            java.lang.Object[] r12 = new java.lang.Object[r6]
            java.lang.Comparable r13 = r0.getLower()
            r14 = 0
            r12[r14] = r13
            java.lang.Comparable r0 = r0.getUpper()
            r13 = 1
            r12[r13] = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r10)
            r13 = 2
            r12[r13] = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r11)
            r12[r8] = r0
            java.lang.String r0 = "bitrateRange=(%d, %d),bitrate=%d,clampBitrate=%d"
            com.tencent.liteav.base.util.LiteavLog.m16902i(r9, r0, r12)
            if (r10 == r11) goto L_0x01b1
            r4.setInteger(r5, r11)
        L_0x01b1:
            int r0 = com.tencent.liteav.base.system.LiteavSystemInfo.getSystemOSVersionInt()
            if (r0 < r7) goto L_0x03be
            android.util.Pair r0 = m139930a((android.media.MediaFormat) r4)
            java.lang.Object r5 = r0.first
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            java.lang.Object r0 = r0.second
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            android.media.MediaCodecInfo$VideoCapabilities r7 = r1.m139929a(r5, r0)
            r10 = 1065353216(0x3f800000, float:1.0)
            java.lang.String r11 = "height"
            java.lang.String r12 = "width"
            if (r7 == 0) goto L_0x026c
            android.util.Range r13 = r7.getSupportedWidths()
            android.util.Range r7 = r7.getSupportedHeights()
            if (r13 == 0) goto L_0x026c
            if (r7 != 0) goto L_0x01e5
            goto L_0x026c
        L_0x01e5:
            java.lang.Comparable r13 = r13.getUpper()
            java.lang.Integer r13 = (java.lang.Integer) r13
            java.lang.Comparable r7 = r7.getUpper()
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r14 = r4.getInteger(r12)
            int r15 = r4.getInteger(r11)
            if (r14 <= r15) goto L_0x0205
            int r8 = r13.intValue()
            int r6 = r7.intValue()
            if (r8 < r6) goto L_0x0211
        L_0x0205:
            if (r14 >= r15) goto L_0x021b
            int r6 = r13.intValue()
            int r8 = r7.intValue()
            if (r6 <= r8) goto L_0x021b
        L_0x0211:
            int r6 = r13.intValue()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r13 = r7
            r7 = r6
        L_0x021b:
            int r6 = r13.intValue()
            if (r6 < r14) goto L_0x0227
            int r6 = r7.intValue()
            if (r6 >= r15) goto L_0x026c
        L_0x0227:
            int r6 = r13.intValue()
            float r6 = (float) r6
            float r8 = (float) r14
            float r17 = r8 * r10
            float r6 = r6 / r17
            int r10 = r7.intValue()
            float r10 = (float) r10
            r18 = r2
            float r2 = (float) r15
            r17 = 1065353216(0x3f800000, float:1.0)
            float r19 = r2 * r17
            float r10 = r10 / r19
            float r6 = java.lang.Math.min(r6, r10)
            float r8 = r8 * r6
            int r8 = (int) r8
            r4.setInteger(r12, r8)
            float r6 = r6 * r2
            int r2 = (int) r6
            r4.setInteger(r11, r2)
            r2 = 4
            java.lang.Object[] r6 = new java.lang.Object[r2]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r14)
            r8 = 0
            r6[r8] = r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r15)
            r8 = 1
            r6[r8] = r2
            r2 = 2
            r6[r2] = r13
            r2 = 3
            r6[r2] = r7
            java.lang.String r2 = "updateMediaFormatToUpperSize:srcWidth=%d,srcHeight=%d,upperW=%d,upperH=%d"
            com.tencent.liteav.base.util.LiteavLog.m16902i(r9, r2, r6)
            goto L_0x026e
        L_0x026c:
            r18 = r2
        L_0x026e:
            android.media.MediaCodecInfo$VideoCapabilities r2 = r1.m139929a(r5, r0)
            if (r2 == 0) goto L_0x0340
            android.util.Range r6 = r2.getSupportedWidths()
            android.util.Range r2 = r2.getSupportedHeights()
            if (r6 == 0) goto L_0x0340
            if (r2 != 0) goto L_0x0282
            goto L_0x0340
        L_0x0282:
            java.lang.Comparable r6 = r6.getLower()
            java.lang.Integer r6 = (java.lang.Integer) r6
            java.lang.Comparable r2 = r2.getLower()
            java.lang.Integer r2 = (java.lang.Integer) r2
            android.media.MediaCodec r7 = r1.f309905d
            if (r7 != 0) goto L_0x0295
        L_0x0292:
            r16 = 0
            goto L_0x02b3
        L_0x0295:
            int r7 = com.tencent.liteav.base.system.LiteavSystemInfo.getSystemOSVersionInt()
            r8 = 21
            if (r7 >= r8) goto L_0x029e
            goto L_0x0292
        L_0x029e:
            android.media.MediaCodec r7 = r1.f309905d
            android.media.MediaCodecInfo r7 = r7.getCodecInfo()
            java.lang.String r8 = r1.f309906e
            android.media.MediaCodecInfo$CodecCapabilities r7 = r7.getCapabilitiesForType(r8)
            if (r7 != 0) goto L_0x02ad
            goto L_0x0292
        L_0x02ad:
            android.media.MediaCodecInfo$VideoCapabilities r7 = r7.getVideoCapabilities()
            r16 = r7
        L_0x02b3:
            if (r16 == 0) goto L_0x02ed
            android.util.Range r7 = r16.getSupportedWidths()
            android.util.Range r8 = r16.getSupportedHeights()
            if (r7 == 0) goto L_0x02ed
            if (r8 == 0) goto L_0x02ed
            int r6 = r6.intValue()
            java.lang.Comparable r7 = r7.getLower()
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            int r6 = java.lang.Math.max(r6, r7)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            int r2 = r2.intValue()
            java.lang.Comparable r7 = r8.getLower()
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            int r2 = java.lang.Math.max(r2, r7)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
        L_0x02ed:
            int r7 = r6.intValue()
            if (r7 < 0) goto L_0x0340
            int r7 = r2.intValue()
            if (r7 >= 0) goto L_0x02fa
            goto L_0x0340
        L_0x02fa:
            int r7 = r4.getInteger(r12)
            int r8 = r4.getInteger(r11)
            int r10 = r6.intValue()
            if (r10 > r7) goto L_0x030e
            int r10 = r2.intValue()
            if (r10 <= r8) goto L_0x0340
        L_0x030e:
            int r10 = r6.intValue()
            float r10 = (float) r10
            float r7 = (float) r7
            r13 = 1065353216(0x3f800000, float:1.0)
            float r14 = r7 * r13
            float r10 = r10 / r14
            int r14 = r2.intValue()
            float r14 = (float) r14
            float r8 = (float) r8
            float r13 = r13 * r8
            float r14 = r14 / r13
            float r10 = java.lang.Math.max(r10, r14)
            float r7 = r7 * r10
            int r7 = (int) r7
            r4.setInteger(r12, r7)
            float r10 = r10 * r8
            int r7 = (int) r10
            r4.setInteger(r11, r7)
            r7 = 2
            java.lang.Object[] r8 = new java.lang.Object[r7]
            r7 = 0
            r8[r7] = r6
            r6 = 1
            r8[r6] = r2
            java.lang.String r2 = "updateMediaFormatToLowerSize:lowerW=%d,lowerH=%d"
            com.tencent.liteav.base.util.LiteavLog.m16902i(r9, r2, r8)
        L_0x0340:
            android.media.MediaCodecInfo$VideoCapabilities r0 = r1.m139929a(r5, r0)
            if (r0 == 0) goto L_0x03c0
            int r2 = r0.getWidthAlignment()
            int r0 = r0.getHeightAlignment()
            r5 = 2
            java.lang.Object[] r6 = new java.lang.Object[r5]
            java.lang.Integer r7 = java.lang.Integer.valueOf(r2)
            r8 = 0
            r6[r8] = r7
            java.lang.Integer r7 = java.lang.Integer.valueOf(r0)
            r8 = 1
            r6[r8] = r7
            java.lang.String r7 = "widthAlignment=%d,heightAlignment=%d"
            com.tencent.liteav.base.util.LiteavLog.m16902i(r9, r7, r6)
            if (r2 < r5) goto L_0x03c0
            if (r0 < r5) goto L_0x03c0
            int r5 = r2 % 2
            if (r5 != 0) goto L_0x03c0
            int r5 = r0 % 2
            if (r5 == 0) goto L_0x0371
            goto L_0x03c0
        L_0x0371:
            int r5 = r4.getInteger(r12)
            int r6 = r4.getInteger(r11)
            int r7 = r5 / r2
            int r7 = r7 * r2
            int r8 = r6 / r0
            int r8 = r8 * r0
            if (r5 != r7) goto L_0x0385
            if (r6 == r8) goto L_0x03c0
        L_0x0385:
            r4.setInteger(r12, r7)
            r4.setInteger(r11, r8)
            r10 = 6
            java.lang.Object[] r10 = new java.lang.Object[r10]
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r11 = 0
            r10[r11] = r5
            java.lang.Integer r5 = java.lang.Integer.valueOf(r6)
            r6 = 1
            r10[r6] = r5
            java.lang.Integer r5 = java.lang.Integer.valueOf(r7)
            r6 = 2
            r10[r6] = r5
            java.lang.Integer r5 = java.lang.Integer.valueOf(r8)
            r6 = 3
            r10[r6] = r5
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r5 = 4
            r10[r5] = r2
            r2 = 5
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r10[r2] = r0
            java.lang.String r0 = "updateMediaFormatWithAlignment,srcSize=(%d x %d),fixSize=(%d x %d),widthAlignment=%d,heightAlignment=%d"
            com.tencent.liteav.base.util.LiteavLog.m16902i(r9, r0, r10)
            goto L_0x03c0
        L_0x03be:
            r18 = r2
        L_0x03c0:
            com.tencent.liteav.videoproducer.encoder.VideoEncodeParams r0 = r1.f309907f
            org.json.JSONArray r0 = r0.mediaCodecDeviceRelatedParams
            if (r0 == 0) goto L_0x0431
            r14 = 0
        L_0x03c7:
            com.tencent.liteav.videoproducer.encoder.VideoEncodeParams r0 = r1.f309907f
            org.json.JSONArray r0 = r0.mediaCodecDeviceRelatedParams
            int r0 = r0.length()
            if (r14 >= r0) goto L_0x0431
            com.tencent.liteav.videoproducer.encoder.VideoEncodeParams r0 = r1.f309907f     // Catch:{ Exception -> 0x0418 }
            org.json.JSONArray r0 = r0.mediaCodecDeviceRelatedParams     // Catch:{ Exception -> 0x0418 }
            org.json.JSONObject r0 = r0.getJSONObject(r14)     // Catch:{ Exception -> 0x0418 }
            java.lang.String r2 = "setDeviceRelatedParams,index=%d,key=%s,value=%d"
            r5 = 3
            java.lang.Object[] r6 = new java.lang.Object[r5]     // Catch:{ Exception -> 0x0414 }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r14)     // Catch:{ Exception -> 0x0414 }
            r8 = 0
            r6[r8] = r7     // Catch:{ Exception -> 0x0410 }
            java.lang.String r7 = r0.optString(r3)     // Catch:{ Exception -> 0x0410 }
            r10 = 1
            r6[r10] = r7     // Catch:{ Exception -> 0x040c }
            r7 = r18
            int r11 = r0.optInt(r7)     // Catch:{ Exception -> 0x040a }
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch:{ Exception -> 0x040a }
            r12 = 2
            r6[r12] = r11     // Catch:{ Exception -> 0x0408 }
            com.tencent.liteav.base.util.LiteavLog.m16902i(r9, r2, r6)     // Catch:{ Exception -> 0x0408 }
            java.lang.String r2 = r0.optString(r3)     // Catch:{ Exception -> 0x0408 }
            int r0 = r0.optInt(r7)     // Catch:{ Exception -> 0x0408 }
            r4.setInteger(r2, r0)     // Catch:{ Exception -> 0x0408 }
            goto L_0x042c
        L_0x0408:
            r0 = move-exception
            goto L_0x041f
        L_0x040a:
            r0 = move-exception
            goto L_0x041e
        L_0x040c:
            r0 = move-exception
            r7 = r18
            goto L_0x041e
        L_0x0410:
            r0 = move-exception
            r7 = r18
            goto L_0x041d
        L_0x0414:
            r0 = move-exception
            r7 = r18
            goto L_0x041c
        L_0x0418:
            r0 = move-exception
            r7 = r18
            r5 = 3
        L_0x041c:
            r8 = 0
        L_0x041d:
            r10 = 1
        L_0x041e:
            r12 = 2
        L_0x041f:
            java.lang.String r2 = java.lang.String.valueOf(r14)
            java.lang.String r6 = "set mediaCodec device related params failed,index="
            java.lang.String r2 = r6.concat(r2)
            com.tencent.liteav.base.util.LiteavLog.m16899e((java.lang.String) r9, (java.lang.String) r2, (java.lang.Throwable) r0)
        L_0x042c:
            int r14 = r14 + 1
            r18 = r7
            goto L_0x03c7
        L_0x0431:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.liteav.videoproducer.encoder.C104544u.mo147228a():android.media.MediaFormat");
    }
}
