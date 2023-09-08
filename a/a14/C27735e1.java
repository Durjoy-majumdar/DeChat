package a14;

import java.util.concurrent.Future;

/* renamed from: a14.e1 */
public final class C27735e1 implements C53883f1 {

    /* renamed from: d */
    public final Future<?> f76752d;

    public C27735e1(Future<?> future) {
        this.f76752d = future;
    }

    public void dispose() {
        this.f76752d.cancel(false);
    }

    public String toString() {
        return "DisposableFutureHandle[" + this.f76752d + ']';
    }
}
