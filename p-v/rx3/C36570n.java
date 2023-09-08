package rx3;

import fy3.C32224a;
import gy3.C8480h;
import gy3.C87412m;
import java.io.Serializable;

/* renamed from: rx3.n */
public final class C36570n<T> implements C13601g<T>, Serializable {

    /* renamed from: d */
    public C32224a<? extends T> f97259d;

    /* renamed from: e */
    public volatile Object f97260e;

    /* renamed from: f */
    public final Object f97261f;

    public C36570n(C32224a aVar, Object obj, int i, C8480h hVar) {
        obj = (i & 2) != 0 ? null : obj;
        C87412m.m108594g(aVar, "initializer");
        this.f97259d = aVar;
        this.f97260e = C36572x.f97264a;
        this.f97261f = obj == null ? this : obj;
    }

    public T getValue() {
        T t;
        T t2 = this.f97260e;
        T t3 = C36572x.f97264a;
        if (t2 != t3) {
            return t2;
        }
        synchronized (this.f97261f) {
            t = this.f97260e;
            if (t == t3) {
                C32224a aVar = this.f97259d;
                C87412m.m108591d(aVar);
                t = aVar.invoke();
                this.f97260e = t;
                this.f97259d = null;
            }
        }
        return t;
    }

    public String toString() {
        return this.f97260e != C36572x.f97264a ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
