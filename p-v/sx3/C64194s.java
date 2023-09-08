package sx3;

import hy3.C33145a;
import java.util.Iterator;

/* renamed from: sx3.s */
public abstract class C64194s implements Iterator<Character>, C33145a {
    /* renamed from: a */
    public abstract char mo86521a();

    public /* bridge */ /* synthetic */ Object next() {
        return Character.valueOf(mo86521a());
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
