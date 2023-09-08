package w04;

import gy3.C87412m;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import sx3.C110818d0;
import sx3.C26236u;
import sx3.C64186f0;

/* renamed from: w04.a */
public final class C26412a {
    /* renamed from: a */
    public static final <T> void m34008a(Collection<T> collection, T t) {
        C87412m.m108594g(collection, "<this>");
        if (t != null) {
            collection.add(t);
        }
    }

    /* renamed from: b */
    public static final <T> List<T> m34009b(ArrayList<T> arrayList) {
        C87412m.m108594g(arrayList, "<this>");
        int size = arrayList.size();
        if (size == 0) {
            return C64186f0.f181907d;
        }
        if (size == 1) {
            return C26236u.m33719b(C110818d0.m150914L(arrayList));
        }
        arrayList.trimToSize();
        return arrayList;
    }
}
