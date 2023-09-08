package wy3;

import gy3.C87412m;
import java.util.List;
import q04.C25528k;
import rx3.C13604l;
import sx3.C26236u;
import vz3.C22830f;

/* renamed from: wy3.x */
public final class C26519x<Type extends C25528k> extends C26455f1<Type> {

    /* renamed from: a */
    public final C22830f f73806a;

    /* renamed from: b */
    public final Type f73807b;

    public C26519x(C22830f fVar, Type type) {
        C87412m.m108594g(fVar, "underlyingPropertyName");
        C87412m.m108594g(type, "underlyingType");
        this.f73806a = fVar;
        this.f73807b = type;
    }

    /* renamed from: a */
    public List<C13604l<C22830f, Type>> mo53432a() {
        return C26236u.m33719b(new C13604l(this.f73806a, this.f73807b));
    }
}
