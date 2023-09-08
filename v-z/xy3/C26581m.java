package xy3;

import fy3.C32226l;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import vz3.C22826c;

/* renamed from: xy3.m */
public final class C26581m implements C26571h {

    /* renamed from: d */
    public final C26571h f73946d;

    /* renamed from: e */
    public final C32226l<C22826c, Boolean> f73947e;

    public C26581m(C26571h hVar, C32226l<? super C22826c, Boolean> lVar) {
        C87412m.m108594g(hVar, "delegate");
        C87412m.m108594g(lVar, "fqNameFilter");
        this.f73946d = hVar;
        this.f73947e = lVar;
    }

    /* renamed from: b */
    public C26566c mo51476b(C22826c cVar) {
        C87412m.m108594g(cVar, "fqName");
        if (this.f73947e.invoke(cVar).booleanValue()) {
            return this.f73946d.mo51476b(cVar);
        }
        return null;
    }

    public boolean isEmpty() {
        boolean z;
        C26571h<C26566c> hVar = this.f73946d;
        if (!(hVar instanceof Collection) || !((Collection) hVar).isEmpty()) {
            for (C26566c d : hVar) {
                C22826c d2 = d.mo51298d();
                if (d2 == null || !this.f73947e.invoke(d2).booleanValue()) {
                    z = false;
                    continue;
                } else {
                    z = true;
                    continue;
                }
                if (z) {
                    return true;
                }
            }
        }
        return false;
    }

    public Iterator<C26566c> iterator() {
        C26571h hVar = this.f73946d;
        ArrayList arrayList = new ArrayList();
        for (Object next : hVar) {
            C22826c d = ((C26566c) next).mo51298d();
            if (d != null && this.f73947e.invoke(d).booleanValue()) {
                arrayList.add(next);
            }
        }
        return arrayList.iterator();
    }

    /* renamed from: q */
    public boolean mo51479q(C22826c cVar) {
        C87412m.m108594g(cVar, "fqName");
        if (this.f73947e.invoke(cVar).booleanValue()) {
            return this.f73946d.mo51479q(cVar);
        }
        return false;
    }
}
