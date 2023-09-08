package org.webrtc;

import org.webrtc.VideoFrame;

public final /* synthetic */ class VideoFileRenderer$$d implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ VideoFileRenderer f61872d;

    /* renamed from: e */
    public final /* synthetic */ VideoFrame.I420Buffer f61873e;

    /* renamed from: f */
    public final /* synthetic */ VideoFrame f61874f;

    public /* synthetic */ VideoFileRenderer$$d(VideoFileRenderer videoFileRenderer, VideoFrame.I420Buffer i420Buffer, VideoFrame videoFrame) {
        this.f61872d = videoFileRenderer;
        this.f61873e = i420Buffer;
        this.f61874f = videoFrame;
    }

    public final void run() {
        this.f61872d.lambda$renderFrameOnRenderThread$1(this.f61873e, this.f61874f);
    }
}
