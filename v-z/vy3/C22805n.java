package vy3;

import gy3.C87412m;
import java.util.ArrayList;
import java.util.Collection;
import jz3.C24803f;
import n04.C25143j0;
import w04.C22843b;
import wy3.C22935h;
import wy3.C26447e;

/* renamed from: vy3.n */
public final class C22805n<N> implements C22843b.C22846c {

    /* renamed from: a */
    public final /* synthetic */ C26397j f65566a;

    public C22805n(C26397j jVar) {
        this.f65566a = jVar;
    }

    /* renamed from: a */
    public Iterable mo33273a(Object obj) {
        Collection<C25143j0> r = ((C26447e) obj).mo36110l().mo37096r();
        C87412m.m108593f(r, "it.typeConstructor.supertypes");
        C26397j jVar = this.f65566a;
        ArrayList arrayList = new ArrayList();
        for (C25143j0 K0 : r) {
            C22935h o = K0.mo37081K0().mo37094o();
            C24803f fVar = null;
            C22935h a = o != null ? o.mo36109a() : null;
            C26447e eVar = a instanceof C26447e ? (C26447e) a : null;
            if (eVar != null) {
                fVar = jVar.mo53385f(eVar);
            }
            if (fVar != null) {
                arrayList.add(fVar);
            }
        }
        return arrayList;
    }
}
