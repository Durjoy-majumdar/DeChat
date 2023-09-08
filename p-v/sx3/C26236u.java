package sx3;

import gy3.C87412m;
import java.util.Collections;
import java.util.List;
import tx3.C26314b;

/* renamed from: sx3.u */
public class C26236u {
    /* renamed from: a */
    public static final <E> List<E> m33718a(List<E> list) {
        C87412m.m108594g(list, "builder");
        C26314b bVar = (C26314b) list;
        if (bVar.f73323h == null) {
            bVar.mo53219m();
            bVar.f73322g = true;
            return bVar;
        }
        throw new IllegalStateException();
    }

    /* renamed from: b */
    public static final <T> List<T> m33719b(T t) {
        List<T> singletonList = Collections.singletonList(t);
        C87412m.m108593f(singletonList, "singletonList(element)");
        return singletonList;
    }
}
