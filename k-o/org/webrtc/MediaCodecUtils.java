package org.webrtc;

import android.media.MediaCodecInfo;
import android.os.Build;
import java.util.HashMap;
import java.util.Map;

class MediaCodecUtils {
    public static final int COLOR_QCOM_FORMATYUV420PackedSemiPlanar32m = 2141391876;
    public static final int COLOR_QCOM_FORMATYVU420PackedSemiPlanar16m4ka = 2141391874;
    public static final int COLOR_QCOM_FORMATYVU420PackedSemiPlanar32m4ka = 2141391873;
    public static final int COLOR_QCOM_FORMATYVU420PackedSemiPlanar64x32Tile2m8ka = 2141391875;
    public static final int[] DECODER_COLOR_FORMATS = {19, 21, 2141391872, COLOR_QCOM_FORMATYVU420PackedSemiPlanar32m4ka, COLOR_QCOM_FORMATYVU420PackedSemiPlanar16m4ka, COLOR_QCOM_FORMATYVU420PackedSemiPlanar64x32Tile2m8ka, COLOR_QCOM_FORMATYUV420PackedSemiPlanar32m};
    public static final int[] ENCODER_COLOR_FORMATS = {19, 21, 2141391872, COLOR_QCOM_FORMATYUV420PackedSemiPlanar32m};
    public static final String EXYNOS_PREFIX = "OMX.Exynos.";
    public static final String INTEL_PREFIX = "OMX.Intel.";
    public static final String NVIDIA_PREFIX = "OMX.Nvidia.";
    public static final String QCOM_PREFIX = "OMX.qcom.";
    public static final String[] SOFTWARE_IMPLEMENTATION_PREFIXES = {"OMX.google.", "OMX.SEC.", "c2.android"};
    private static final String TAG = "MediaCodecUtils";
    public static final int[] TEXTURE_COLOR_FORMATS = getTextureColorFormats();

    /* renamed from: org.webrtc.MediaCodecUtils$1 */
    public static /* synthetic */ class C218441 {
        public static final /* synthetic */ int[] $SwitchMap$org$webrtc$VideoCodecMimeType;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                org.webrtc.VideoCodecMimeType[] r0 = org.webrtc.VideoCodecMimeType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$org$webrtc$VideoCodecMimeType = r0
                org.webrtc.VideoCodecMimeType r1 = org.webrtc.VideoCodecMimeType.VP8     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$org$webrtc$VideoCodecMimeType     // Catch:{ NoSuchFieldError -> 0x001d }
                org.webrtc.VideoCodecMimeType r1 = org.webrtc.VideoCodecMimeType.VP9     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = $SwitchMap$org$webrtc$VideoCodecMimeType     // Catch:{ NoSuchFieldError -> 0x0028 }
                org.webrtc.VideoCodecMimeType r1 = org.webrtc.VideoCodecMimeType.AV1     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = $SwitchMap$org$webrtc$VideoCodecMimeType     // Catch:{ NoSuchFieldError -> 0x0033 }
                org.webrtc.VideoCodecMimeType r1 = org.webrtc.VideoCodecMimeType.H264     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: org.webrtc.MediaCodecUtils.C218441.<clinit>():void");
        }
    }

    private MediaCodecUtils() {
    }

    public static boolean codecSupportsType(MediaCodecInfo mediaCodecInfo, VideoCodecMimeType videoCodecMimeType) {
        for (String equals : mediaCodecInfo.getSupportedTypes()) {
            if (videoCodecMimeType.mimeType().equals(equals)) {
                return true;
            }
        }
        return false;
    }

    public static Map<String, String> getCodecProperties(VideoCodecMimeType videoCodecMimeType, boolean z) {
        int i = C218441.$SwitchMap$org$webrtc$VideoCodecMimeType[videoCodecMimeType.ordinal()];
        if (i == 1 || i == 2 || i == 3) {
            return new HashMap();
        }
        if (i == 4) {
            return H264Utils.getDefaultH264Params(z);
        }
        throw new IllegalArgumentException("Unsupported codec: " + videoCodecMimeType);
    }

    private static int[] getTextureColorFormats() {
        return new int[]{2130708361};
    }

    public static boolean isHardwareAccelerated(MediaCodecInfo mediaCodecInfo) {
        return Build.VERSION.SDK_INT >= 29 ? isHardwareAcceleratedQOrHigher(mediaCodecInfo) : !isSoftwareOnly(mediaCodecInfo);
    }

    private static boolean isHardwareAcceleratedQOrHigher(MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isHardwareAccelerated();
    }

    public static boolean isSoftwareOnly(MediaCodecInfo mediaCodecInfo) {
        if (Build.VERSION.SDK_INT >= 29) {
            return isSoftwareOnlyQOrHigher(mediaCodecInfo);
        }
        String name = mediaCodecInfo.getName();
        for (String startsWith : SOFTWARE_IMPLEMENTATION_PREFIXES) {
            if (name.startsWith(startsWith)) {
                return true;
            }
        }
        return false;
    }

    private static boolean isSoftwareOnlyQOrHigher(MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isSoftwareOnly();
    }

    public static Integer selectColorFormat(int[] iArr, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        for (int i : iArr) {
            for (int i2 : codecCapabilities.colorFormats) {
                if (i2 == i) {
                    return Integer.valueOf(i2);
                }
            }
        }
        return null;
    }
}
