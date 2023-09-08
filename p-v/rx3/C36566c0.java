package rx3;

import fy3.C32224a;
import gy3.C87412m;
import java.io.Serializable;

/* renamed from: rx3.c0 */
public final class C36566c0<T> implements C13601g<T>, Serializable {

    /* renamed from: d */
    public C32224a<? extends T> f97249d;

    /* renamed from: e */
    public Object f97250e = C36572x.f97264a;

    public C36566c0(C32224a<? extends T> aVar) {
        C87412m.m108594g(aVar, "initializer");
        this.f97249d = aVar;
    }

    public T getValue() {
        if (this.f97250e == C36572x.f97264a) {
            C32224a<? extends T> aVar = this.f97249d;
            C87412m.m108591d(aVar);
            this.f97250e = aVar.invoke();
            this.f97249d = null;
        }
        return this.f97250e;
    }

    public String toString() {
        return this.f97250e != C36572x.f97264a ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
