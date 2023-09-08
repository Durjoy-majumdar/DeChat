package org.webrtc;

public final /* synthetic */ class Camera1Session$$a implements VideoSink {

    /* renamed from: d */
    public final /* synthetic */ Camera1Session f61799d;

    public /* synthetic */ Camera1Session$$a(Camera1Session camera1Session) {
        this.f61799d = camera1Session;
    }

    public final void onFrame(VideoFrame videoFrame) {
        this.f61799d.lambda$listenForTextureFrames$0(videoFrame);
    }
}
