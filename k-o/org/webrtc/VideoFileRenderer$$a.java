package org.webrtc;

import java.util.concurrent.CountDownLatch;

public final /* synthetic */ class VideoFileRenderer$$a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ VideoFileRenderer f61867d;

    /* renamed from: e */
    public final /* synthetic */ CountDownLatch f61868e;

    public /* synthetic */ VideoFileRenderer$$a(VideoFileRenderer videoFileRenderer, CountDownLatch countDownLatch) {
        this.f61867d = videoFileRenderer;
        this.f61868e = countDownLatch;
    }

    public final void run() {
        this.f61867d.lambda$release$2(this.f61868e);
    }
}
