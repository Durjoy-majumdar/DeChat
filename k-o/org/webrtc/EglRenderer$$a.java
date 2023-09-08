package org.webrtc;

public final /* synthetic */ class EglRenderer$$a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ EglRenderer f61806d;

    public /* synthetic */ EglRenderer$$a(EglRenderer eglRenderer) {
        this.f61806d = eglRenderer;
    }

    public final void run() {
        this.f61806d.renderFrameOnRenderThread();
    }
}
