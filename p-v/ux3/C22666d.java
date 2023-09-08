package ux3;

import gy3.C87412m;
import java.util.Comparator;

/* renamed from: ux3.d */
public final class C22666d implements Comparator<Comparable<? super Object>> {

    /* renamed from: d */
    public static final C22666d f65197d = new C22666d();

    public int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        C87412m.m108594g(comparable, "a");
        C87412m.m108594g(comparable2, "b");
        return comparable.compareTo(comparable2);
    }

    public final Comparator<Comparable<Object>> reversed() {
        return C22667e.f65198d;
    }
}
