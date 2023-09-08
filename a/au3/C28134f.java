package au3;

import gy3.C87412m;
import lu3.C109426i;

/* renamed from: au3.f */
public final class C28134f implements C109426i {

    /* renamed from: d */
    public final Runnable f77587d;

    /* renamed from: e */
    public final boolean f77588e;

    public C28134f(Runnable runnable, boolean z) {
        C87412m.m108595h(runnable, "runnable");
        this.f77587d = runnable;
        this.f77588e = z;
    }

    public String getKey() {
        return toString();
    }

    public boolean isLogging() {
        return this.f77588e;
    }

    public void run() {
        this.f77587d.run();
    }

    public String toString() {
        return "thread-pool-coroutine-runnable-" + this.f77587d;
    }
}
