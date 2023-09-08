package zz3;

import ez3.C24476d;
import fy3.C32226l;
import g04.C20770i;
import g04.C20774l;
import g04.C24531d;
import gy3.C87412m;
import java.util.Iterator;
import java.util.LinkedHashSet;
import n04.C25143j0;
import vz3.C22830f;
import wy3.C22935h;
import wy3.C26443c1;
import wy3.C26447e;
import wy3.C26469k;

/* renamed from: zz3.b */
public final class C26788b extends C26813w {
    /* renamed from: a */
    public static final void m35196a(C26447e eVar, LinkedHashSet<C26447e> linkedHashSet, C20770i iVar, boolean z) {
        boolean z2;
        for (C26469k kVar : C20774l.C20775a.m22732a(iVar, C24531d.f70106o, (C32226l) null, 2, (Object) null)) {
            if (kVar instanceof C26447e) {
                C26447e eVar2 = (C26447e) kVar;
                if (eVar2.mo51792P()) {
                    C22830f name = eVar2.getName();
                    C87412m.m108593f(name, "descriptor.name");
                    C22935h g = iVar.mo32462g(name, C24476d.WHEN_GET_ALL_DESCRIPTORS);
                    eVar2 = g instanceof C26447e ? (C26447e) g : g instanceof C26443c1 ? ((C26443c1) g).mo51922k() : null;
                }
                if (eVar2 == null) {
                    continue;
                } else if (eVar != null) {
                    int i = C26794h.f74523a;
                    Iterator<C25143j0> it = eVar2.mo36110l().mo37096r().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (C26794h.m35229q(it.next(), eVar.mo36109a())) {
                                z2 = true;
                                break;
                            }
                        } else {
                            z2 = false;
                            break;
                        }
                    }
                    if (z2) {
                        linkedHashSet.add(eVar2);
                    }
                    if (z) {
                        C20770i f0 = eVar2.mo51797f0();
                        C87412m.m108593f(f0, "refinedDescriptor.unsubstitutedInnerClassesScope");
                        m35196a(eVar, linkedHashSet, f0, z);
                    }
                } else {
                    C26794h.m35213a(27);
                    throw null;
                }
            }
        }
    }
}
