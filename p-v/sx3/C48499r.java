package sx3;

import com.google.firebase.analytics.FirebaseAnalytics;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;

/* renamed from: sx3.r */
public final class C48499r {
    /* renamed from: a */
    public static final <T> Collection<T> m53870a(Iterable<? extends T> iterable, Iterable<? extends T> iterable2) {
        C87412m.m108594g(iterable, "<this>");
        C87412m.m108594g(iterable2, FirebaseAnalytics.C113379b.SOURCE);
        if (iterable instanceof Set) {
            return (Collection) iterable;
        }
        if (!(iterable instanceof Collection)) {
            return C48500t.f129710a ? C110818d0.m150951w0(iterable) : C110818d0.m150953y0(iterable);
        }
        if ((iterable2 instanceof Collection) && ((Collection) iterable2).size() < 2) {
            return (Collection) iterable;
        }
        Collection<T> collection = (Collection) iterable;
        return C48500t.f129710a && collection.size() > 2 && (collection instanceof ArrayList) ? C110818d0.m150951w0(iterable) : collection;
    }
}
