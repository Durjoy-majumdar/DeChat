package org.webrtc;

import java.util.concurrent.CountDownLatch;

public final /* synthetic */ class EglRenderer$$c implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ EglRenderer f61810d;

    /* renamed from: e */
    public final /* synthetic */ CountDownLatch f61811e;

    public /* synthetic */ EglRenderer$$c(EglRenderer eglRenderer, CountDownLatch countDownLatch) {
        this.f61810d = eglRenderer;
        this.f61811e = countDownLatch;
    }

    public final void run() {
        this.f61810d.lambda$release$1(this.f61811e);
    }
}
