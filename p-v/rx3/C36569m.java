package rx3;

import fy3.C32224a;
import gy3.C87412m;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: rx3.m */
public final class C36569m<T> implements C13601g<T>, Serializable {

    /* renamed from: f */
    public static final AtomicReferenceFieldUpdater<C36569m<?>, Object> f97256f = AtomicReferenceFieldUpdater.newUpdater(C36569m.class, Object.class, "e");

    /* renamed from: d */
    public volatile C32224a<? extends T> f97257d;

    /* renamed from: e */
    public volatile Object f97258e = C36572x.f97264a;

    public C36569m(C32224a<? extends T> aVar) {
        C87412m.m108594g(aVar, "initializer");
        this.f97257d = aVar;
    }

    public T getValue() {
        boolean z;
        T t = this.f97258e;
        T t2 = C36572x.f97264a;
        if (t != t2) {
            return t;
        }
        C32224a<? extends T> aVar = this.f97257d;
        if (aVar != null) {
            T invoke = aVar.invoke();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f97256f;
            while (true) {
                if (!atomicReferenceFieldUpdater.compareAndSet(this, t2, invoke)) {
                    if (atomicReferenceFieldUpdater.get(this) != t2) {
                        z = false;
                        break;
                    }
                } else {
                    z = true;
                    break;
                }
            }
            if (z) {
                this.f97257d = null;
                return invoke;
            }
        }
        return this.f97258e;
    }

    public String toString() {
        return this.f97258e != C36572x.f97264a ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
