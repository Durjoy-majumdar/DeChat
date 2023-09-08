package o24;

import gy3.C87412m;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* renamed from: o24.e0 */
public class C21762e0 {

    /* renamed from: d */
    public static final C21762e0 f61689d = new C21763a();

    /* renamed from: a */
    public boolean f61690a;

    /* renamed from: b */
    public long f61691b;

    /* renamed from: c */
    public long f61692c;

    /* renamed from: o24.e0$a */
    public static final class C21763a extends C21762e0 {
        /* renamed from: d */
        public C21762e0 mo34105d(long j) {
            return this;
        }

        /* renamed from: f */
        public void mo34107f() {
        }

        /* renamed from: g */
        public C21762e0 mo34108g(long j, TimeUnit timeUnit) {
            C87412m.m108594g(timeUnit, "unit");
            return this;
        }
    }

    /* renamed from: a */
    public C21762e0 mo34102a() {
        this.f61690a = false;
        return this;
    }

    /* renamed from: b */
    public C21762e0 mo34103b() {
        this.f61692c = 0;
        return this;
    }

    /* renamed from: c */
    public long mo34104c() {
        if (this.f61690a) {
            return this.f61691b;
        }
        throw new IllegalStateException("No deadline".toString());
    }

    /* renamed from: d */
    public C21762e0 mo34105d(long j) {
        this.f61690a = true;
        this.f61691b = j;
        return this;
    }

    /* renamed from: e */
    public boolean mo34106e() {
        return this.f61690a;
    }

    /* renamed from: f */
    public void mo34107f() {
        Thread currentThread = Thread.currentThread();
        C87412m.m108593f(currentThread, "Thread.currentThread()");
        if (currentThread.isInterrupted()) {
            throw new InterruptedIOException("interrupted");
        } else if (this.f61690a && this.f61691b - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    /* renamed from: g */
    public C21762e0 mo34108g(long j, TimeUnit timeUnit) {
        C87412m.m108594g(timeUnit, "unit");
        if (j >= 0) {
            this.f61692c = timeUnit.toNanos(j);
            return this;
        }
        throw new IllegalArgumentException(("timeout < 0: " + j).toString());
    }
}
