package sx3;

import gy3.C87412m;
import java.util.Iterator;
import java.util.Set;

/* renamed from: sx3.i */
public abstract class C22414i<E> extends C64173a<E> implements Set<E> {
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        C87412m.m108594g(set, "other");
        if (size() != set.size()) {
            return false;
        }
        return containsAll(set);
    }

    public int hashCode() {
        Iterator it = iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i += next != null ? next.hashCode() : 0;
        }
        return i;
    }
}
