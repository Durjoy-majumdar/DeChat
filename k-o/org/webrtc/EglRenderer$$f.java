package org.webrtc;

public final /* synthetic */ class EglRenderer$$f implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ EglRenderer f61819d;

    /* renamed from: e */
    public final /* synthetic */ Runnable f61820e;

    public /* synthetic */ EglRenderer$$f(EglRenderer eglRenderer, Runnable runnable) {
        this.f61819d = eglRenderer;
        this.f61820e = runnable;
    }

    public final void run() {
        this.f61819d.lambda$releaseEglSurface$5(this.f61820e);
    }
}
