package org.webrtc;

public final /* synthetic */ class VideoFileRenderer$$c implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ VideoFileRenderer f61870d;

    /* renamed from: e */
    public final /* synthetic */ VideoFrame f61871e;

    public /* synthetic */ VideoFileRenderer$$c(VideoFileRenderer videoFileRenderer, VideoFrame videoFrame) {
        this.f61870d = videoFileRenderer;
        this.f61871e = videoFrame;
    }

    public final void run() {
        this.f61870d.lambda$onFrame$0(this.f61871e);
    }
}
