package xu3;

import pu3.C25478i;
import pu3.C25497s;
import pu3.C25499u;
import qu3.C25903a;
import yu3.C26639a;
import zu3.C26718e;
import zu3.C26722g;

/* renamed from: xu3.l */
public class C26558l extends C26555i<C25497s> {

    /* renamed from: d */
    public C25499u.C25500a f73902d = null;

    /* renamed from: e */
    public C25478i.C25484f f73903e = null;

    public C26558l(C26639a aVar, C25478i iVar, C25478i iVar2, C26722g gVar) {
        super(aVar, iVar, gVar);
        if (iVar2 != null) {
            C25499u.C25500a aVar2 = iVar2.f72125a.f72157d;
            this.f73902d = aVar2;
            this.f73903e = iVar2.mo52716d(aVar2);
        }
    }

    /* renamed from: a */
    public Comparable mo53495a(C26718e eVar, Comparable comparable) {
        C25497s sVar = (C25497s) comparable;
        eVar.getClass();
        int e = eVar.mo53711e(sVar.f72150e);
        int f = eVar.mo53712f(sVar.f72151f);
        int i = sVar.f72152g;
        C26722g gVar = (C26722g) eVar;
        int d = gVar.f74281f.mo162978d(i);
        if (d >= 0) {
            i = gVar.f74281f.f333062e[d];
        } else if (i >= 0 && gVar.f74295t.mo183354a(i)) {
            i = -1;
        }
        return new C25497s(sVar.f72185d, e, f, i);
    }

    /* renamed from: c */
    public C25499u.C25500a mo53496c(C25478i iVar) {
        return iVar.f72125a.f72157d;
    }

    /* renamed from: d */
    public void mo53497d(C26722g gVar, int i, int i2) {
        if (i < 0) {
            gVar.getClass();
        } else {
            gVar.f74292q.mo183355b(i, true);
        }
    }

    /* renamed from: e */
    public Comparable mo53498e(C25903a aVar) {
        return aVar.mo52737p();
    }

    /* renamed from: g */
    public void mo53499g(C26722g gVar, int i, int i2, int i3, int i4) {
        if (i != i3) {
            gVar.f74278c.mo162980f(i, i3);
        }
    }

    /* renamed from: h */
    public int mo53500h(Comparable comparable) {
        C25497s sVar = (C25497s) comparable;
        this.f73902d.f72182f++;
        C25478i.C25484f fVar = this.f73903e;
        fVar.mo52740z(C25478i.this.f72125a.f72157d, true);
        int position = fVar.f72245a.position();
        fVar.mo52793v(sVar.f72150e);
        fVar.mo52793v(sVar.f72151f);
        fVar.mo52793v(sVar.f72152g);
        return position;
    }
}
