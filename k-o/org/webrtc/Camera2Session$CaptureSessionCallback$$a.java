package org.webrtc;

import org.webrtc.Camera2Session;

public final /* synthetic */ class Camera2Session$CaptureSessionCallback$$a implements VideoSink {

    /* renamed from: d */
    public final /* synthetic */ Camera2Session.CaptureSessionCallback f61804d;

    public /* synthetic */ Camera2Session$CaptureSessionCallback$$a(Camera2Session.CaptureSessionCallback captureSessionCallback) {
        this.f61804d = captureSessionCallback;
    }

    public final void onFrame(VideoFrame videoFrame) {
        this.f61804d.lambda$onConfigured$0(videoFrame);
    }
}
