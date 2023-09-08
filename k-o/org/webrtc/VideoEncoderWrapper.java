package org.webrtc;

import org.webrtc.VideoEncoder;

class VideoEncoderWrapper {
    public static VideoEncoder.Callback createEncoderCallback(long j) {
        return new VideoEncoderWrapper$$a(j);
    }

    public static Integer getScalingSettingsHigh(VideoEncoder.ScalingSettings scalingSettings) {
        return scalingSettings.high;
    }

    public static Integer getScalingSettingsLow(VideoEncoder.ScalingSettings scalingSettings) {
        return scalingSettings.low;
    }

    public static boolean getScalingSettingsOn(VideoEncoder.ScalingSettings scalingSettings) {
        return scalingSettings.f61865on;
    }

    /* access modifiers changed from: private */
    public static native void nativeOnEncodedFrame(long j, EncodedImage encodedImage);
}
