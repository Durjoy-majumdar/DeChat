package t04;

import gy3.C87412m;
import hy3.C33145a;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: t04.j */
public final class C26264j extends C26253c {

    /* renamed from: d */
    public static final C26264j f73199d = new C26264j();

    /* renamed from: t04.j$a */
    public static final class C26265a implements Iterator, C33145a {
        public boolean hasNext() {
            return false;
        }

        public Object next() {
            throw new NoSuchElementException();
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* renamed from: f */
    public int mo53152f() {
        return 0;
    }

    public /* bridge */ /* synthetic */ Object get(int i) {
        return null;
    }

    /* renamed from: i */
    public void mo53154i(int i, Object obj) {
        C87412m.m108594g((Void) obj, "value");
        throw new IllegalStateException();
    }

    public Iterator iterator() {
        return new C26265a();
    }
}
