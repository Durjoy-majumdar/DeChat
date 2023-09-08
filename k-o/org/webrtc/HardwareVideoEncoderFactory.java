package org.webrtc;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.os.Build;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.webrtc.EglBase;
import org.webrtc.EglBase14;
import org.webrtc.VideoEncoderFactory;

public class HardwareVideoEncoderFactory implements VideoEncoderFactory {
    private static final List<String> H264_HW_EXCEPTION_MODELS = Arrays.asList(new String[]{"SAMSUNG-SGH-I337", "Nexus 7", "Nexus 4"});
    private static final int QCOM_VP8_KEY_FRAME_INTERVAL_ANDROID_L_MS = 15000;
    private static final int QCOM_VP8_KEY_FRAME_INTERVAL_ANDROID_M_MS = 20000;
    private static final int QCOM_VP8_KEY_FRAME_INTERVAL_ANDROID_N_MS = 15000;
    private static final String TAG = "HardwareVideoEncoderFactory";
    private final Predicate<MediaCodecInfo> codecAllowedPredicate;
    private final boolean enableH264HighProfile;
    private final boolean enableIntelVp8Encoder;
    private final EglBase14.Context sharedContext;

    /* renamed from: org.webrtc.HardwareVideoEncoderFactory$1 */
    public static /* synthetic */ class C218421 {
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
                org.webrtc.VideoCodecMimeType r1 = org.webrtc.VideoCodecMimeType.H264     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = $SwitchMap$org$webrtc$VideoCodecMimeType     // Catch:{ NoSuchFieldError -> 0x0033 }
                org.webrtc.VideoCodecMimeType r1 = org.webrtc.VideoCodecMimeType.AV1     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: org.webrtc.HardwareVideoEncoderFactory.C218421.<clinit>():void");
        }
    }

    public HardwareVideoEncoderFactory(EglBase.Context context, boolean z, boolean z2) {
        this(context, z, z2, (Predicate<MediaCodecInfo>) null);
    }

    private BitrateAdjuster createBitrateAdjuster(VideoCodecMimeType videoCodecMimeType, String str) {
        return str.startsWith(MediaCodecUtils.EXYNOS_PREFIX) ? videoCodecMimeType == VideoCodecMimeType.VP8 ? new DynamicBitrateAdjuster() : new FramerateBitrateAdjuster() : new BaseBitrateAdjuster();
    }

    private MediaCodecInfo findCodecForType(VideoCodecMimeType videoCodecMimeType) {
        int i = 0;
        while (true) {
            MediaCodecInfo mediaCodecInfo = null;
            if (i >= MediaCodecList.getCodecCount()) {
                return null;
            }
            try {
                mediaCodecInfo = MediaCodecList.getCodecInfoAt(i);
            } catch (IllegalArgumentException e) {
                Logging.m25024e(TAG, "Cannot retrieve encoder codec info", e);
            }
            if (mediaCodecInfo != null && mediaCodecInfo.isEncoder() && isSupportedCodec(mediaCodecInfo, videoCodecMimeType)) {
                return mediaCodecInfo;
            }
            i++;
        }
    }

    private int getForcedKeyFrameIntervalMs(VideoCodecMimeType videoCodecMimeType, String str) {
        if (videoCodecMimeType != VideoCodecMimeType.VP8 || !str.startsWith(MediaCodecUtils.QCOM_PREFIX)) {
            return 0;
        }
        int i = Build.VERSION.SDK_INT;
        if (!(i == 21 || i == 22)) {
            if (i == 23) {
                return 20000;
            }
            return i > 23 ? 15000 : 0;
        }
    }

    private int getKeyFrameIntervalSec(VideoCodecMimeType videoCodecMimeType) {
        int i = C218421.$SwitchMap$org$webrtc$VideoCodecMimeType[videoCodecMimeType.ordinal()];
        if (i == 1 || i == 2) {
            return 100;
        }
        if (i == 3) {
            return 20;
        }
        if (i == 4) {
            return 100;
        }
        throw new IllegalArgumentException("Unsupported VideoCodecMimeType " + videoCodecMimeType);
    }

    private boolean isH264HighProfileSupported(MediaCodecInfo mediaCodecInfo) {
        return this.enableH264HighProfile && Build.VERSION.SDK_INT > 23 && mediaCodecInfo.getName().startsWith(MediaCodecUtils.EXYNOS_PREFIX);
    }

    private boolean isHardwareSupportedInCurrentSdk(MediaCodecInfo mediaCodecInfo, VideoCodecMimeType videoCodecMimeType) {
        int i = C218421.$SwitchMap$org$webrtc$VideoCodecMimeType[videoCodecMimeType.ordinal()];
        if (i == 1) {
            return isHardwareSupportedInCurrentSdkVp8(mediaCodecInfo);
        }
        if (i == 2) {
            return isHardwareSupportedInCurrentSdkVp9(mediaCodecInfo);
        }
        if (i != 3) {
            return false;
        }
        return isHardwareSupportedInCurrentSdkH264(mediaCodecInfo);
    }

    private boolean isHardwareSupportedInCurrentSdkH264(MediaCodecInfo mediaCodecInfo) {
        if (H264_HW_EXCEPTION_MODELS.contains(Build.MODEL)) {
            return false;
        }
        String name = mediaCodecInfo.getName();
        return name.startsWith(MediaCodecUtils.QCOM_PREFIX) || name.startsWith(MediaCodecUtils.EXYNOS_PREFIX);
    }

    private boolean isHardwareSupportedInCurrentSdkVp8(MediaCodecInfo mediaCodecInfo) {
        String name = mediaCodecInfo.getName();
        return name.startsWith(MediaCodecUtils.QCOM_PREFIX) || (name.startsWith(MediaCodecUtils.EXYNOS_PREFIX) && Build.VERSION.SDK_INT >= 23) || (name.startsWith(MediaCodecUtils.INTEL_PREFIX) && this.enableIntelVp8Encoder);
    }

    private boolean isHardwareSupportedInCurrentSdkVp9(MediaCodecInfo mediaCodecInfo) {
        String name = mediaCodecInfo.getName();
        return (name.startsWith(MediaCodecUtils.QCOM_PREFIX) || name.startsWith(MediaCodecUtils.EXYNOS_PREFIX)) && Build.VERSION.SDK_INT >= 24;
    }

    private boolean isMediaCodecAllowed(MediaCodecInfo mediaCodecInfo) {
        Predicate<MediaCodecInfo> predicate = this.codecAllowedPredicate;
        if (predicate == null) {
            return true;
        }
        return predicate.test(mediaCodecInfo);
    }

    private boolean isSupportedCodec(MediaCodecInfo mediaCodecInfo, VideoCodecMimeType videoCodecMimeType) {
        return MediaCodecUtils.codecSupportsType(mediaCodecInfo, videoCodecMimeType) && MediaCodecUtils.selectColorFormat(MediaCodecUtils.ENCODER_COLOR_FORMATS, mediaCodecInfo.getCapabilitiesForType(videoCodecMimeType.mimeType())) != null && isHardwareSupportedInCurrentSdk(mediaCodecInfo, videoCodecMimeType) && isMediaCodecAllowed(mediaCodecInfo);
    }

    public VideoEncoder createEncoder(VideoCodecInfo videoCodecInfo) {
        VideoCodecMimeType fromSdpCodecName = VideoCodecMimeType.fromSdpCodecName(videoCodecInfo.getName());
        MediaCodecInfo findCodecForType = findCodecForType(fromSdpCodecName);
        if (findCodecForType == null) {
            return null;
        }
        String name = findCodecForType.getName();
        String mimeType = fromSdpCodecName.mimeType();
        Integer selectColorFormat = MediaCodecUtils.selectColorFormat(MediaCodecUtils.TEXTURE_COLOR_FORMATS, findCodecForType.getCapabilitiesForType(mimeType));
        Integer selectColorFormat2 = MediaCodecUtils.selectColorFormat(MediaCodecUtils.ENCODER_COLOR_FORMATS, findCodecForType.getCapabilitiesForType(mimeType));
        if (fromSdpCodecName == VideoCodecMimeType.H264) {
            boolean isSameH264Profile = H264Utils.isSameH264Profile(videoCodecInfo.params, MediaCodecUtils.getCodecProperties(fromSdpCodecName, true));
            boolean isSameH264Profile2 = H264Utils.isSameH264Profile(videoCodecInfo.params, MediaCodecUtils.getCodecProperties(fromSdpCodecName, false));
            if (!isSameH264Profile && !isSameH264Profile2) {
                return null;
            }
            if (isSameH264Profile && !isH264HighProfileSupported(findCodecForType)) {
                return null;
            }
        }
        return new HardwareVideoEncoder(new MediaCodecWrapperFactoryImpl(), name, fromSdpCodecName, selectColorFormat, selectColorFormat2, videoCodecInfo.params, getKeyFrameIntervalSec(fromSdpCodecName), getForcedKeyFrameIntervalMs(fromSdpCodecName, name), createBitrateAdjuster(fromSdpCodecName, name), this.sharedContext);
    }

    public /* synthetic */ VideoEncoderFactory.VideoEncoderSelector getEncoderSelector() {
        return C21875g.m25070a(this);
    }

    public /* synthetic */ VideoCodecInfo[] getImplementations() {
        return C21875g.m25071b(this);
    }

    public VideoCodecInfo[] getSupportedCodecs() {
        ArrayList arrayList = new ArrayList();
        VideoCodecMimeType[] videoCodecMimeTypeArr = {VideoCodecMimeType.VP8, VideoCodecMimeType.VP9, VideoCodecMimeType.H264, VideoCodecMimeType.AV1};
        for (int i = 0; i < 4; i++) {
            VideoCodecMimeType videoCodecMimeType = videoCodecMimeTypeArr[i];
            MediaCodecInfo findCodecForType = findCodecForType(videoCodecMimeType);
            if (findCodecForType != null) {
                String sdpCodecName = videoCodecMimeType.toSdpCodecName();
                if (videoCodecMimeType == VideoCodecMimeType.H264 && isH264HighProfileSupported(findCodecForType)) {
                    arrayList.add(new VideoCodecInfo(sdpCodecName, MediaCodecUtils.getCodecProperties(videoCodecMimeType, true)));
                }
                arrayList.add(new VideoCodecInfo(sdpCodecName, MediaCodecUtils.getCodecProperties(videoCodecMimeType, false)));
            }
        }
        return (VideoCodecInfo[]) arrayList.toArray(new VideoCodecInfo[arrayList.size()]);
    }

    public HardwareVideoEncoderFactory(EglBase.Context context, boolean z, boolean z2, Predicate<MediaCodecInfo> predicate) {
        if (context instanceof EglBase14.Context) {
            this.sharedContext = (EglBase14.Context) context;
        } else {
            Logging.m25026w(TAG, "No shared EglBase.Context.  Encoders will not use texture mode.");
            this.sharedContext = null;
        }
        this.enableIntelVp8Encoder = z;
        this.enableH264HighProfile = z2;
        this.codecAllowedPredicate = predicate;
    }

    @Deprecated
    public HardwareVideoEncoderFactory(boolean z, boolean z2) {
        this((EglBase.Context) null, z, z2);
    }
}
