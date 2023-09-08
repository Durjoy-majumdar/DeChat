package org.webrtc;

import org.webrtc.VideoProcessor;

/* renamed from: org.webrtc.j */
public final /* synthetic */ class C21878j {
    /* renamed from: a */
    public static void m25074a(VideoProcessor videoProcessor, VideoFrame videoFrame, VideoProcessor.FrameAdaptationParameters frameAdaptationParameters) {
        VideoFrame b = m25075b(videoFrame, frameAdaptationParameters);
        if (b != null) {
            videoProcessor.onFrameCaptured(b);
            b.release();
        }
    }

    /* renamed from: b */
    public static VideoFrame m25075b(VideoFrame videoFrame, VideoProcessor.FrameAdaptationParameters frameAdaptationParameters) {
        if (frameAdaptationParameters.drop) {
            return null;
        }
        return new VideoFrame(videoFrame.getBuffer().cropAndScale(frameAdaptationParameters.cropX, frameAdaptationParameters.cropY, frameAdaptationParameters.cropWidth, frameAdaptationParameters.cropHeight, frameAdaptationParameters.scaleWidth, frameAdaptationParameters.scaleHeight), videoFrame.getRotation(), frameAdaptationParameters.timestampNs);
    }
}
