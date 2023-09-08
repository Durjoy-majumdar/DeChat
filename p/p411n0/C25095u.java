package p411n0;

import hy3.C33145a;
import java.util.Iterator;

/* renamed from: n0.u */
public abstract class C25095u<K, V, T> implements Iterator<T>, C33145a {

    /* renamed from: d */
    public Object[] f71529d = C25093t.f71522e.f71526d;

    /* renamed from: e */
    public int f71530e;

    /* renamed from: f */
    public int f71531f;

    public C25095u() {
        C25093t tVar = C25093t.f71522e;
    }

    public boolean hasNext() {
        return this.f71531f < this.f71530e;
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
