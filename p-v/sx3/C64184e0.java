package sx3;

import hy3.C33145a;
import java.util.ListIterator;
import java.util.NoSuchElementException;

/* renamed from: sx3.e0 */
public final class C64184e0 implements ListIterator, C33145a {

    /* renamed from: d */
    public static final C64184e0 f181906d = new C64184e0();

    public /* bridge */ /* synthetic */ void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean hasNext() {
        return false;
    }

    public boolean hasPrevious() {
        return false;
    }

    public Object next() {
        throw new NoSuchElementException();
    }

    public int nextIndex() {
        return 0;
    }

    public Object previous() {
        throw new NoSuchElementException();
    }

    public int previousIndex() {
        return -1;
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* bridge */ /* synthetic */ void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
