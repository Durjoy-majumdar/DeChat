package org.webrtc;

import java.util.concurrent.CountDownLatch;

public final /* synthetic */ class SurfaceEglRenderer$$a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ CountDownLatch f61836d;

    public /* synthetic */ SurfaceEglRenderer$$a(CountDownLatch countDownLatch) {
        this.f61836d = countDownLatch;
    }

    public final void run() {
        this.f61836d.countDown();
    }
}
