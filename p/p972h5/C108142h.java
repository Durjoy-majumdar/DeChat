package p972h5;

import a14.C53916l;
import fy3.C32226l;
import gy3.C87412m;
import java.util.concurrent.atomic.AtomicInteger;
import o24.C21760d0;
import o24.C21766h;
import o24.C21772m;
import rx3.C13598b0;

/* renamed from: h5.h */
public final class C108142h extends C21772m implements C32226l<Throwable, C13598b0> {

    /* renamed from: e */
    public final AtomicInteger f323808e;

    /* renamed from: f */
    public final Thread f323809f = Thread.currentThread();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C108142h(C53916l<?> lVar, C21760d0 d0Var) {
        super(d0Var);
        int i;
        C87412m.m108594g(lVar, "continuation");
        C87412m.m108594g(d0Var, "delegate");
        AtomicInteger atomicInteger = new AtomicInteger(1);
        this.f323808e = atomicInteger;
        lVar.mo74599v(this);
        do {
            i = atomicInteger.get();
            if (i != 1) {
                if (i != 3 && i != 4 && i != 5) {
                    mo158539b(i);
                    throw null;
                }
                return;
            }
        } while (!this.f323808e.compareAndSet(i, 1));
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: L0 */
    public long mo32327L0(C21766h hVar, long j) {
        C87412m.m108594g(hVar, "sink");
        try {
            mo158540c(false);
            long L0 = super.mo32327L0(hVar, j);
            mo158540c(true);
            return L0;
        } catch (Throwable th) {
            mo158540c(true);
            throw th;
        }
    }

    /* renamed from: a */
    public final void mo158538a() {
        AtomicInteger atomicInteger = this.f323808e;
        while (true) {
            int i = atomicInteger.get();
            if (i == 0 || i == 3) {
                if (this.f323808e.compareAndSet(i, 2)) {
                    return;
                }
            } else if (i != 4) {
                if (i == 5) {
                    Thread.interrupted();
                    return;
                } else {
                    mo158539b(i);
                    throw null;
                }
            }
        }
    }

    /* renamed from: b */
    public final Void mo158539b(int i) {
        throw new IllegalStateException(C87412m.m108600m("Illegal state: ", Integer.valueOf(i)).toString());
    }

    /* renamed from: c */
    public final void mo158540c(boolean z) {
        AtomicInteger atomicInteger = this.f323808e;
        while (true) {
            int i = atomicInteger.get();
            if (i == 0 || i == 1) {
                if (this.f323808e.compareAndSet(i, true ^ z ? 1 : 0)) {
                    return;
                }
            } else if (i != 3) {
                if (i != 4) {
                    if (i == 5) {
                        Thread.interrupted();
                        return;
                    } else {
                        mo158539b(i);
                        throw null;
                    }
                }
            } else if (this.f323808e.compareAndSet(i, 4)) {
                this.f323809f.interrupt();
                this.f323808e.set(5);
                return;
            }
        }
    }

    public Object invoke(Object obj) {
        Throwable th = (Throwable) obj;
        AtomicInteger atomicInteger = this.f323808e;
        while (true) {
            int i = atomicInteger.get();
            if (i != 0) {
                if (i != 1) {
                    if (i != 2 && i != 3 && i != 4 && i != 5) {
                        mo158539b(i);
                        throw null;
                    }
                } else if (this.f323808e.compareAndSet(i, 3)) {
                    break;
                }
            } else if (this.f323808e.compareAndSet(i, 4)) {
                this.f323809f.interrupt();
                this.f323808e.set(5);
                break;
            }
        }
        return C13598b0.f38549a;
    }
}
