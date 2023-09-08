package p398x9;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: x9.i */
public final class C38466i {

    /* renamed from: a */
    public static final Iterator<Object> f101453a = new C38467a();

    /* renamed from: x9.i$a */
    public static class C38467a implements Iterator<Object> {
        public final boolean hasNext() {
            return false;
        }

        public final Object next() {
            throw new NoSuchElementException();
        }

        public final void remove() {
            throw new IllegalStateException("no calls to next() since the last call to remove()");
        }
    }
}
