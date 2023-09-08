package org.webrtc;

import org.webrtc.VideoEncoder;

public abstract class WrappedNativeVideoEncoder implements VideoEncoder {
    public abstract long createNativeVideoEncoder();

    public final VideoCodecStatus encode(VideoFrame videoFrame, VideoEncoder.EncodeInfo encodeInfo) {
        throw new UnsupportedOperationException("Not implemented.");
    }

    public final String getImplementationName() {
        throw new UnsupportedOperationException("Not implemented.");
    }

    public /* synthetic */ VideoEncoder.ResolutionBitrateLimits[] getResolutionBitrateLimits() {
        return C21874f.m25067b(this);
    }

    public final VideoEncoder.ScalingSettings getScalingSettings() {
        throw new UnsupportedOperationException("Not implemented.");
    }

    public final VideoCodecStatus initEncode(VideoEncoder.Settings settings, VideoEncoder.Callback callback) {
        throw new UnsupportedOperationException("Not implemented.");
    }

    public abstract boolean isHardwareEncoder();

    public final VideoCodecStatus release() {
        throw new UnsupportedOperationException("Not implemented.");
    }

    public final VideoCodecStatus setRateAllocation(VideoEncoder.BitrateAllocation bitrateAllocation, int i) {
        throw new UnsupportedOperationException("Not implemented.");
    }

    public /* synthetic */ VideoCodecStatus setRates(VideoEncoder.RateControlParameters rateControlParameters) {
        return C21874f.m25069d(this, rateControlParameters);
    }
}
