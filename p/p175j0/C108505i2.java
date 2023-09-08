package p175j0;

import java.util.concurrent.atomic.AtomicReference;
import p415q0.C110262d;
import p415q0.C110263e;
import rx3.C13598b0;

/* renamed from: j0.i2 */
public final class C108505i2<T> {

    /* renamed from: a */
    public final AtomicReference<C110262d> f324829a = new AtomicReference<>(C110263e.f329813a);

    /* renamed from: b */
    public final Object f324830b = new Object();

    /* renamed from: a */
    public final T mo159371a() {
        C110262d dVar = this.f324829a.get();
        int a = dVar.mo161673a(Thread.currentThread().getId());
        if (a >= 0) {
            return dVar.f329812c[a];
        }
        return null;
    }

    /* renamed from: b */
    public final void mo159372b(T t) {
        boolean z;
        long id = Thread.currentThread().getId();
        synchronized (this.f324830b) {
            C110262d dVar = this.f324829a.get();
            int a = dVar.mo161673a(id);
            if (a < 0) {
                z = false;
            } else {
                dVar.f329812c[a] = t;
                z = true;
            }
            if (!z) {
                this.f324829a.set(dVar.mo161674b(id, t));
                C13598b0 b0Var = C13598b0.f38549a;
            }
        }
    }
}
