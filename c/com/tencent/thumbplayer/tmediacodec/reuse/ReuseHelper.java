package com.tencent.thumbplayer.tmediacodec.reuse;

import android.media.MediaFormat;
import android.os.Build;
import android.text.TextUtils;
import com.tencent.thumbplayer.core.common.TPSystemInfo;
import com.tencent.thumbplayer.tmediacodec.TCodecManager;
import com.tencent.thumbplayer.tmediacodec.codec.AudioCodecWrapper;
import com.tencent.thumbplayer.tmediacodec.codec.FormatWrapper;
import com.tencent.thumbplayer.tmediacodec.codec.ReuseCodecWrapper;
import com.tencent.thumbplayer.tmediacodec.codec.VideoCodecWrapper;
import com.tencent.thumbplayer.tmediacodec.util.LogUtils;
import com.tencent.thumbplayer.tmediacodec.util.TUtils;

public final class ReuseHelper {
    public static final String TAG = "ReuseHelper";

    public enum AdaptationWorkaroundMode {
        ADAPTATION_WORKAROUND_MODE_NEVER,
        ADAPTATION_WORKAROUND_MODE_SAME_RESOLUTION,
        ADAPTATION_WORKAROUND_MODE_ALWAYS
    }

    public enum ReuseType {
        KEEP_CODEC_RESULT_NO,
        KEEP_CODEC_RESULT_YES_WITH_FLUSH,
        KEEP_CODEC_RESULT_YES_WITH_RECONFIGURATION,
        KEEP_CODEC_RESULT_YES_WITHOUT_RECONFIGURATION
    }

    private ReuseHelper() {
    }

    public static AdaptationWorkaroundMode codecAdaptationWorkaroundMode(String str) {
        int i = Build.VERSION.SDK_INT;
        if (i <= 25 && "OMX.Exynos.avc.dec.secure".equals(str) && (TPSystemInfo.getDeviceName().startsWith("SM-T585") || TPSystemInfo.getDeviceName().startsWith("SM-A510") || TPSystemInfo.getDeviceName().startsWith("SM-A520") || TPSystemInfo.getDeviceName().startsWith("SM-J700"))) {
            return AdaptationWorkaroundMode.ADAPTATION_WORKAROUND_MODE_ALWAYS;
        }
        if (i < 24 && ("OMX.Nvidia.h264.decode".equals(str) || "OMX.Nvidia.h264.decode.secure".equals(str))) {
            String str2 = Build.DEVICE;
            if ("flounder".equals(str2) || "flounder_lte".equals(str2) || "grouper".equals(str2) || "tilapia".equals(str2)) {
                return AdaptationWorkaroundMode.ADAPTATION_WORKAROUND_MODE_SAME_RESOLUTION;
            }
        }
        return AdaptationWorkaroundMode.ADAPTATION_WORKAROUND_MODE_NEVER;
    }

    public static void initFormatWrapper(FormatWrapper formatWrapper, MediaFormat mediaFormat) {
        ReusePolicy reusePolicy = TCodecManager.getInstance().getReusePolicy();
        int max = Math.max(reusePolicy.initWidth, formatWrapper.width);
        int max2 = Math.max(reusePolicy.initHeight, formatWrapper.height);
        if (reusePolicy.reConfigByRealFormat) {
            reusePolicy.initWidth = max;
            reusePolicy.initHeight = max2;
        }
        int max3 = Math.max(0, TUtils.getCodecMaxInputSize(formatWrapper.sampleMimeType, max, max2, false));
        if (LogUtils.isLogEnable()) {
            LogUtils.m21881d(TAG, "initFormatWrapper initWidth:" + max + " initHeight:" + max2 + " initMaxInputSize:" + max3 + ' ' + "reusePolicy:" + reusePolicy);
        }
        formatWrapper.maxWidth = max;
        formatWrapper.maxHeight = max2;
        formatWrapper.maxInputSize = max3;
        mediaFormat.setInteger("max-input-size", Math.max(max3, 0));
        if (formatWrapper.isVideo()) {
            mediaFormat.setInteger("max-width", max);
            mediaFormat.setInteger("max-height", max2);
        }
    }

    public static boolean isSeamlessAdaptationSupported(ReuseCodecWrapper reuseCodecWrapper, FormatWrapper formatWrapper) {
        return isSeamlessAdaptationSupported(reuseCodecWrapper, formatWrapper, false);
    }

    public static boolean isSeamlessAdaptationSupported(ReuseCodecWrapper reuseCodecWrapper, FormatWrapper formatWrapper, boolean z) {
        FormatWrapper formatWrapper2 = reuseCodecWrapper.mFormat;
        if (reuseCodecWrapper instanceof VideoCodecWrapper) {
            if (!TextUtils.equals(formatWrapper2.sampleMimeType, formatWrapper.sampleMimeType) || formatWrapper2.rotationDegrees != formatWrapper.rotationDegrees) {
                return false;
            }
            if (reuseCodecWrapper.mAdaptive || (formatWrapper2.width == formatWrapper.width && formatWrapper2.height == formatWrapper.height)) {
                return true;
            }
            return false;
        } else if (!(reuseCodecWrapper instanceof AudioCodecWrapper)) {
            return true;
        } else {
            if (TextUtils.equals("audio/mp4a-latm", formatWrapper2.sampleMimeType)) {
                TextUtils.equals(formatWrapper2.sampleMimeType, formatWrapper.sampleMimeType);
            }
            return false;
        }
    }
}
