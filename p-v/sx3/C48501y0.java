package sx3;

import gy3.C87412m;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: sx3.y0 */
public class C48501y0 extends C110826x0 {
    /* renamed from: f */
    public static final <T> Set<T> m53871f(Set<? extends T> set, Iterable<? extends T> iterable) {
        C87412m.m108594g(set, "<this>");
        C87412m.m108594g(iterable, "elements");
        Collection<? extends T> a = C48499r.m53870a(iterable, set);
        if (a.isEmpty()) {
            return C110818d0.m150904D0(set);
        }
        if (a instanceof Set) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (T next : set) {
                if (!a.contains(next)) {
                    linkedHashSet.add(next);
                }
            }
            return linkedHashSet;
        }
        LinkedHashSet linkedHashSet2 = new LinkedHashSet(set);
        linkedHashSet2.removeAll(a);
        return linkedHashSet2;
    }

    /* renamed from: g */
    public static final <T> Set<T> m53872g(Set<? extends T> set, Iterable<? extends T> iterable) {
        C87412m.m108594g(set, "<this>");
        C87412m.m108594g(iterable, "elements");
        Integer valueOf = iterable instanceof Collection ? Integer.valueOf(((Collection) iterable).size()) : null;
        LinkedHashSet linkedHashSet = new LinkedHashSet(C90363p0.m113142a(valueOf != null ? set.size() + valueOf.intValue() : set.size() * 2));
        linkedHashSet.addAll(set);
        C64175a0.m75508p(linkedHashSet, iterable);
        return linkedHashSet;
    }

    /* renamed from: h */
    public static final <T> Set<T> m53873h(Set<? extends T> set, T t) {
        C87412m.m108594g(set, "<this>");
        LinkedHashSet linkedHashSet = new LinkedHashSet(C90363p0.m113142a(set.size() + 1));
        linkedHashSet.addAll(set);
        linkedHashSet.add(t);
        return linkedHashSet;
    }
}
