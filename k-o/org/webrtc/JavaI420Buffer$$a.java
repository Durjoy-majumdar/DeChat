package org.webrtc;

import org.webrtc.VideoFrame;

public final /* synthetic */ class JavaI420Buffer$$a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ VideoFrame.I420Buffer f61833d;

    public /* synthetic */ JavaI420Buffer$$a(VideoFrame.I420Buffer i420Buffer) {
        this.f61833d = i420Buffer;
    }

    public final void run() {
        this.f61833d.release();
    }
}
