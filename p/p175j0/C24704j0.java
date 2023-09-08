package p175j0;

import gy3.C87412m;
import hy3.C33145a;
import java.util.ConcurrentModificationException;
import java.util.Iterator;

/* renamed from: j0.j0 */
public final class C24704j0 implements Iterator<Object>, C33145a {

    /* renamed from: d */
    public final C24729z1 f70459d;

    /* renamed from: e */
    public final int f70460e;

    /* renamed from: f */
    public int f70461f;

    /* renamed from: g */
    public final int f70462g;

    public C24704j0(C24729z1 z1Var, int i, int i2) {
        C87412m.m108594g(z1Var, "table");
        this.f70459d = z1Var;
        this.f70460e = i2;
        this.f70461f = i;
        this.f70462g = z1Var.f70559j;
        if (z1Var.f70558i) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean hasNext() {
        return this.f70461f < this.f70460e;
    }

    public Object next() {
        C24729z1 z1Var = this.f70459d;
        if (z1Var.f70559j == this.f70462g) {
            int i = this.f70461f;
            this.f70461f = C24659a2.m30850b(z1Var.f70553d, i) + i;
            return new C24701i0(this, i);
        }
        throw new ConcurrentModificationException();
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
