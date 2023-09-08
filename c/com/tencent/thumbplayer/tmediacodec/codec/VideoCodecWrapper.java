package com.tencent.thumbplayer.tmediacodec.codec;

import android.media.MediaCodec;
import com.tencent.thumbplayer.tmediacodec.reuse.ReuseHelper;
import com.tencent.thumbplayer.tmediacodec.util.TUtils;

public final class VideoCodecWrapper extends ReuseCodecWrapper {
    public VideoCodecWrapper(MediaCodec mediaCodec, FormatWrapper formatWrapper) {
        super(mediaCodec, formatWrapper);
    }

    public ReuseHelper.ReuseType canReuse(FormatWrapper formatWrapper) {
        if (ReuseHelper.isSeamlessAdaptationSupported(this, formatWrapper)) {
            int i = formatWrapper.width;
            CodecMaxValues codecMaxValues = this.mCodecMaxValues;
            if (i <= codecMaxValues.width && formatWrapper.height <= codecMaxValues.height && TUtils.getMaxInputSize(this, formatWrapper) <= this.mCodecMaxValues.inputSize) {
                return formatWrapper.initializationDataEquals(this.mFormat) ? ReuseHelper.ReuseType.KEEP_CODEC_RESULT_YES_WITHOUT_RECONFIGURATION : ReuseHelper.ReuseType.KEEP_CODEC_RESULT_YES_WITH_RECONFIGURATION;
            }
        }
        return ReuseHelper.ReuseType.KEEP_CODEC_RESULT_NO;
    }

    public boolean isNeedKeep() {
        return super.isNeedKeep() && this.mSurface != null && this.mFormat.rotationDegrees == 0;
    }

    public String toString() {
        return "VideoCodecWrapper[" + hashCode() + ']';
    }
}
