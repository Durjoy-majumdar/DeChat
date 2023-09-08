package js0;

import java.util.concurrent.FutureTask;

/* renamed from: js0.q */
public class C88023q implements Runnable {

    /* renamed from: d */
    public final FutureTask<?> f254633d;

    public C88023q(Runnable runnable) {
        this.f254633d = new FutureTask<>(runnable, 0);
    }

    public void run() {
        this.f254633d.run();
    }
}
