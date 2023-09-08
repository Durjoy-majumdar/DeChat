package org.webrtc;

public final /* synthetic */ class VideoSource$$a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ VideoSource f61875d;

    /* renamed from: e */
    public final /* synthetic */ VideoFrame f61876e;

    public /* synthetic */ VideoSource$$a(VideoSource videoSource, VideoFrame videoFrame) {
        this.f61875d = videoSource;
        this.f61876e = videoFrame;
    }

    public final void run() {
        this.f61875d.lambda$setVideoProcessor$0(this.f61876e);
    }
}
