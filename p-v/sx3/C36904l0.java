package sx3;

import hy3.C33145a;
import java.util.Iterator;

/* renamed from: sx3.l0 */
public abstract class C36904l0 implements Iterator<Integer>, C33145a {
    /* renamed from: a */
    public abstract int mo59695a();

    public /* bridge */ /* synthetic */ Object next() {
        return Integer.valueOf(mo59695a());
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
