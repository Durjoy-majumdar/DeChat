package org.webrtc;

public final /* synthetic */ class VideoSource$$b implements VideoSink {

    /* renamed from: d */
    public final /* synthetic */ VideoSource f61877d;

    public /* synthetic */ VideoSource$$b(VideoSource videoSource) {
        this.f61877d = videoSource;
    }

    public final void onFrame(VideoFrame videoFrame) {
        this.f61877d.lambda$setVideoProcessor$1(videoFrame);
    }
}
