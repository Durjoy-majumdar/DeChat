package sx3;

import gy3.C87412m;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: sx3.x0 */
public class C110826x0 extends C22415w0 {
    /* renamed from: b */
    public static final <T> HashSet<T> m151014b(T... tArr) {
        C87412m.m108594g(tArr, "elements");
        HashSet<T> hashSet = new HashSet<>(C90363p0.m113142a(tArr.length));
        C110823p.m150997W(tArr, hashSet);
        HashSet hashSet2 = hashSet;
        return hashSet;
    }

    /* renamed from: c */
    public static final <T> Set<T> m151015c(T... tArr) {
        C87412m.m108594g(tArr, "elements");
        LinkedHashSet linkedHashSet = new LinkedHashSet(C90363p0.m113142a(tArr.length));
        C110823p.m150997W(tArr, linkedHashSet);
        return linkedHashSet;
    }

    /* renamed from: d */
    public static final <T> Set<T> m151016d(Set<? extends T> set) {
        C87412m.m108594g(set, "<this>");
        int size = set.size();
        return size != 0 ? size != 1 ? set : C22415w0.m26092a(set.iterator().next()) : C64187h0.f181908d;
    }

    /* renamed from: e */
    public static final <T> Set<T> m151017e(T... tArr) {
        C87412m.m108594g(tArr, "elements");
        return tArr.length > 0 ? C110823p.m151004d0(tArr) : C64187h0.f181908d;
    }
}
