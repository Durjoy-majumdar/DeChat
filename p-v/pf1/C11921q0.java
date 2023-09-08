package pf1;

import androidx.lifecycle.C54219z;
import rx3.C13598b0;

/* renamed from: pf1.q0 */
public final class C11921q0<T> extends C54219z<T> {

    /* renamed from: d */
    public final Object f34853d = new Object();

    /* renamed from: e */
    public T f34854e;

    public T getValue() {
        T t = this.f34854e;
        return t == null ? super.getValue() : t;
    }

    public void postValue(T t) {
        super.postValue(t);
        synchronized (this.f34853d) {
            this.f34854e = t;
            C13598b0 b0Var = C13598b0.f38549a;
        }
    }

    public void setValue(T t) {
        super.setValue(t);
        synchronized (this.f34853d) {
            this.f34854e = null;
            C13598b0 b0Var = C13598b0.f38549a;
        }
    }
}
