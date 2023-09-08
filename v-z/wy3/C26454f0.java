package wy3;

import gy3.C87412m;
import java.util.List;
import java.util.Map;
import q04.C25528k;
import rx3.C13604l;
import sx3.C90364q0;
import vz3.C22830f;

/* renamed from: wy3.f0 */
public final class C26454f0<Type extends C25528k> extends C26455f1<Type> {

    /* renamed from: a */
    public final List<C13604l<C22830f, Type>> f73749a;

    /* renamed from: b */
    public final Map<C22830f, Type> f73750b;

    public C26454f0(List<? extends C13604l<C22830f, ? extends Type>> list) {
        C87412m.m108594g(list, "underlyingPropertyNamesToTypes");
        this.f73749a = list;
        Map<C22830f, Type> k = C90364q0.m113152k(list);
        if (k.size() == list.size()) {
            this.f73750b = k;
            return;
        }
        throw new IllegalArgumentException("Some properties have the same names".toString());
    }

    /* renamed from: a */
    public List<C13604l<C22830f, Type>> mo53432a() {
        return this.f73749a;
    }
}
