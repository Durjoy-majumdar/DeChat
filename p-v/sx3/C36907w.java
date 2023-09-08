package sx3;

import gy3.C87412m;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: sx3.w */
public class C36907w extends C64197v {
    /* renamed from: l */
    public static final <T> int m41090l(Iterable<? extends T> iterable, int i) {
        C87412m.m108594g(iterable, "<this>");
        return iterable instanceof Collection ? ((Collection) iterable).size() : i;
    }

    /* renamed from: m */
    public static final <T> List<T> m41091m(Iterable<? extends Iterable<? extends T>> iterable) {
        C87412m.m108594g(iterable, "<this>");
        ArrayList arrayList = new ArrayList();
        for (Iterable p : iterable) {
            C64175a0.m75508p(arrayList, p);
        }
        return arrayList;
    }
}
