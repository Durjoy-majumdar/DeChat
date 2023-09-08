package e04;

import gy3.C87412m;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import sx3.C64175a0;
import vz3.C22830f;
import wy3.C26444d;
import wy3.C26447e;
import wy3.C26520x0;

/* renamed from: e04.a */
public final class C24466a implements C24470f {

    /* renamed from: b */
    public final List<C24470f> f69983b;

    public C24466a(List<? extends C24470f> list) {
        C87412m.m108594g(list, "inner");
        this.f69983b = list;
    }

    /* renamed from: a */
    public void mo51165a(C26447e eVar, List<C26444d> list) {
        C87412m.m108594g(eVar, "thisDescriptor");
        C87412m.m108594g(list, "result");
        for (C24470f a : this.f69983b) {
            a.mo51165a(eVar, list);
        }
    }

    /* renamed from: b */
    public List<C22830f> mo51166b(C26447e eVar) {
        C87412m.m108594g(eVar, "thisDescriptor");
        List<C24470f> list = this.f69983b;
        ArrayList arrayList = new ArrayList();
        for (C24470f b : list) {
            C64175a0.m75508p(arrayList, b.mo51166b(eVar));
        }
        return arrayList;
    }

    /* renamed from: c */
    public void mo51167c(C26447e eVar, C22830f fVar, Collection<C26520x0> collection) {
        C87412m.m108594g(eVar, "thisDescriptor");
        C87412m.m108594g(fVar, "name");
        C87412m.m108594g(collection, "result");
        for (C24470f c : this.f69983b) {
            c.mo51167c(eVar, fVar, collection);
        }
    }

    /* renamed from: d */
    public List<C22830f> mo51168d(C26447e eVar) {
        C87412m.m108594g(eVar, "thisDescriptor");
        List<C24470f> list = this.f69983b;
        ArrayList arrayList = new ArrayList();
        for (C24470f d : list) {
            C64175a0.m75508p(arrayList, d.mo51168d(eVar));
        }
        return arrayList;
    }

    /* renamed from: e */
    public void mo51169e(C26447e eVar, C22830f fVar, Collection<C26520x0> collection) {
        C87412m.m108594g(eVar, "thisDescriptor");
        C87412m.m108594g(fVar, "name");
        C87412m.m108594g(collection, "result");
        for (C24470f e : this.f69983b) {
            e.mo51169e(eVar, fVar, collection);
        }
    }
}
