package ty3;

import gy3.C87412m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import sx3.C110818d0;
import sx3.C36907w;
import ty3.C26343l;
import vz3.C22826c;
import vz3.C26408b;

/* renamed from: ty3.c */
public final class C22554c {

    /* renamed from: a */
    public static final C22554c f64865a = new C22554c();

    /* renamed from: b */
    public static final Set<C26408b> f64866b;

    static {
        Set<C22558j> set = C22558j.f64873h;
        ArrayList arrayList = new ArrayList(C36907w.m41090l(set, 10));
        for (C22558j jVar : set) {
            C87412m.m108594g(jVar, "primitiveType");
            arrayList.add(C26343l.f73376j.mo35974c(jVar.f64883d));
        }
        C22826c i = C26343l.C26344a.f73417g.mo35993i();
        C87412m.m108593f(i, "string.toSafe()");
        List f0 = C110818d0.m150934f0(arrayList, i);
        C22826c i2 = C26343l.C26344a.f73419i.mo35993i();
        C87412m.m108593f(i2, "_boolean.toSafe()");
        List f05 = C110818d0.m150934f0(f0, i2);
        C22826c i3 = C26343l.C26344a.f73421k.mo35993i();
        C87412m.m108593f(i3, "_enum.toSafe()");
        List f06 = C110818d0.m150934f0(f05, i3);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = ((ArrayList) f06).iterator();
        while (it.hasNext()) {
            linkedHashSet.add(C26408b.m33992l((C22826c) it.next()));
        }
        f64866b = linkedHashSet;
    }
}
