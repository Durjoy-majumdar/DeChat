package org.webrtc;

import java.util.concurrent.CountDownLatch;
import org.webrtc.EglRenderer;

public final /* synthetic */ class EglRenderer$$b implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ EglRenderer f61807d;

    /* renamed from: e */
    public final /* synthetic */ CountDownLatch f61808e;

    /* renamed from: f */
    public final /* synthetic */ EglRenderer.FrameListener f61809f;

    public /* synthetic */ EglRenderer$$b(EglRenderer eglRenderer, CountDownLatch countDownLatch, EglRenderer.FrameListener frameListener) {
        this.f61807d = eglRenderer;
        this.f61808e = countDownLatch;
        this.f61809f = frameListener;
    }

    public final void run() {
        this.f61807d.lambda$removeFrameListener$4(this.f61808e, this.f61809f);
    }
}
