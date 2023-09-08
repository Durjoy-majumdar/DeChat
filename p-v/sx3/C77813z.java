package sx3;

import gy3.C87412m;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* renamed from: sx3.z */
public class C77813z extends C77812y {
    /* renamed from: n */
    public static final <T extends Comparable<? super T>> void m93908n(List<T> list) {
        C87412m.m108594g(list, "<this>");
        if (list.size() > 1) {
            Collections.sort(list);
        }
    }

    /* renamed from: o */
    public static final <T> void m93909o(List<T> list, Comparator<? super T> comparator) {
        C87412m.m108594g(list, "<this>");
        C87412m.m108594g(comparator, "comparator");
        if (list.size() > 1) {
            Collections.sort(list, comparator);
        }
    }
}
