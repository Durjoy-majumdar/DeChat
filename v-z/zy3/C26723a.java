package zy3;

import fy3.C32226l;
import n04.C25146k0;
import n04.C25176s0;
import n04.C25187v1;
import o04.C25323e;
import wy3.C22935h;
import wy3.C26443c1;
import zy3.C26725b;

/* renamed from: zy3.a */
public class C26723a implements C32226l<C25323e, C25176s0> {

    /* renamed from: d */
    public final /* synthetic */ C26725b.C26726a f74302d;

    public C26723a(C26725b.C26726a aVar) {
        this.f74302d = aVar;
    }

    public Object invoke(Object obj) {
        C25323e eVar = (C25323e) obj;
        C22935h f = eVar.mo52412f(C26725b.this);
        return f == null ? (C25176s0) C26725b.this.f74305e.invoke() : f instanceof C26443c1 ? C25146k0.m31956b((C26443c1) f, C25187v1.m32085e(f.mo36110l().getParameters())) : f instanceof C26787w ? C25187v1.m32094n(f.mo36110l().mo37093n(eVar), ((C26787w) f).mo51790N(eVar), this) : f.mo36111s();
    }
}
