package sx3;

import hy3.C33145a;
import java.util.Iterator;

/* renamed from: sx3.m0 */
public abstract class C36905m0 implements Iterator<Long>, C33145a {
    /* renamed from: a */
    public abstract long mo59697a();

    public /* bridge */ /* synthetic */ Object next() {
        return Long.valueOf(mo59697a());
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
