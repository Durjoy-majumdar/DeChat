package ur0;

import java.util.concurrent.CountDownLatch;

/* renamed from: ur0.a */
public final class C90724a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ CountDownLatch f260587d;

    public C90724a(CountDownLatch countDownLatch) {
        this.f260587d = countDownLatch;
    }

    public final void run() {
        this.f260587d.countDown();
    }
}
