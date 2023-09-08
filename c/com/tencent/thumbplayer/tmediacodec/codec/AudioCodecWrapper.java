package com.tencent.thumbplayer.tmediacodec.codec;

import android.media.MediaCodec;
import com.tencent.thumbplayer.tmediacodec.reuse.ReuseHelper;

public final class AudioCodecWrapper extends ReuseCodecWrapper {
    public AudioCodecWrapper(MediaCodec mediaCodec, FormatWrapper formatWrapper) {
        super(mediaCodec, formatWrapper);
    }

    public ReuseHelper.ReuseType canReuse(FormatWrapper formatWrapper) {
        return ReuseHelper.isSeamlessAdaptationSupported(this, formatWrapper) ? ReuseHelper.ReuseType.KEEP_CODEC_RESULT_YES_WITHOUT_RECONFIGURATION : ReuseHelper.ReuseType.KEEP_CODEC_RESULT_NO;
    }

    public String toString() {
        return "AudioCodecWrapper[" + hashCode() + ']';
    }
}
