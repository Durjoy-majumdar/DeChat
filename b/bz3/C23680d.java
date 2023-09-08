package bz3;

import cz3.C24416e0;
import cz3.C24435t;
import fz3.C24513s;
import gy3.C87412m;
import java.util.Set;
import mz3.C25055g;
import mz3.C25068t;
import vz3.C22826c;
import vz3.C26408b;
import z04.C112551y;

/* renamed from: bz3.d */
public final class C23680d implements C24513s {

    /* renamed from: a */
    public final ClassLoader f67869a;

    public C23680d(ClassLoader classLoader) {
        C87412m.m108594g(classLoader, "classLoader");
        this.f67869a = classLoader;
    }

    /* renamed from: a */
    public C25068t mo37220a(C22826c cVar, boolean z) {
        C87412m.m108594g(cVar, "fqName");
        return new C24416e0(cVar);
    }

    /* renamed from: b */
    public Set<String> mo37221b(C22826c cVar) {
        C87412m.m108594g(cVar, "packageFqName");
        return null;
    }

    /* renamed from: c */
    public C25055g mo37222c(C24513s.C20766a aVar) {
        C87412m.m108594g(aVar, "request");
        C26408b bVar = aVar.f58675a;
        C22826c h = bVar.mo53392h();
        C87412m.m108593f(h, "classId.packageFqName");
        String b = bVar.mo53394i().mo35973b();
        C87412m.m108593f(b, "classId.relativeClassName.asString()");
        String o = C112551y.m153815o(b, '.', '$', false, 4, (Object) null);
        if (!h.mo35975d()) {
            o = h.mo35973b() + '.' + o;
        }
        Class<?> a = C113219e.m154929a(this.f67869a, o);
        if (a != null) {
            return new C24435t(a);
        }
        return null;
    }
}
