package p170ic;

import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: ic.b */
public final class C87688b {

    /* renamed from: a */
    public final Runnable f253967a;

    /* renamed from: b */
    public final AtomicInteger f253968b;

    public C87688b(Runnable runnable, int i) {
        this.f253967a = runnable;
        if (i > 0) {
            this.f253968b = new AtomicInteger(i);
            return;
        }
        throw new IllegalArgumentException("count <= 0".toString());
    }

    /* renamed from: a */
    public final void mo122118a() {
        Runnable runnable;
        if (this.f253968b.decrementAndGet() == 0 && (runnable = this.f253967a) != null) {
            runnable.run();
        }
    }
}
