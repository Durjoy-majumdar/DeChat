package xu3;

import pu3.C25478i;
import pu3.C25495q;
import pu3.C25499u;
import qu3.C25903a;
import yu3.C26639a;
import zu3.C26718e;
import zu3.C26722g;

/* renamed from: xu3.k */
public class C26557k extends C26555i<C25495q> {

    /* renamed from: d */
    public C25499u.C25500a f73900d = null;

    /* renamed from: e */
    public C25478i.C25484f f73901e = null;

    public C26557k(C26639a aVar, C25478i iVar, C25478i iVar2, C26722g gVar) {
        super(aVar, iVar, gVar);
        if (iVar2 != null) {
            C25499u.C25500a aVar2 = iVar2.f72125a.f72159f;
            this.f73900d = aVar2;
            this.f73901e = iVar2.mo52716d(aVar2);
        }
    }

    /* renamed from: a */
    public Comparable mo53495a(C26718e eVar, Comparable comparable) {
        C25495q qVar = (C25495q) comparable;
        eVar.getClass();
        int f = eVar.mo53712f(qVar.f72147e);
        int i = qVar.f72148f;
        C26722g gVar = (C26722g) eVar;
        int d = gVar.f74278c.mo162978d(i);
        if (d >= 0) {
            i = gVar.f74278c.f333062e[d];
        } else if (i >= 0 && gVar.f74292q.mo183354a(i)) {
            i = -1;
        }
        return new C25495q(qVar.f72185d, f, i, eVar.mo53711e(qVar.f72149g));
    }

    /* renamed from: c */
    public C25499u.C25500a mo53496c(C25478i iVar) {
        return iVar.f72125a.f72159f;
    }

    /* renamed from: d */
    public void mo53497d(C26722g gVar, int i, int i2) {
        if (i < 0) {
            gVar.getClass();
        } else {
            gVar.f74294s.mo183355b(i, true);
        }
    }

    /* renamed from: e */
    public Comparable mo53498e(C25903a aVar) {
        return aVar.mo52736m();
    }

    /* renamed from: g */
    public void mo53499g(C26722g gVar, int i, int i2, int i3, int i4) {
        if (i != i3) {
            gVar.f74280e.mo162980f(i, i3);
        }
    }

    /* renamed from: h */
    public int mo53500h(Comparable comparable) {
        C25495q qVar = (C25495q) comparable;
        this.f73900d.f72182f++;
        C25478i.C25484f fVar = this.f73901e;
        fVar.mo52740z(C25478i.this.f72125a.f72159f, true);
        int position = fVar.f72245a.position();
        fVar.mo52796y(qVar.f72147e);
        fVar.mo52796y(qVar.f72148f);
        fVar.mo52793v(qVar.f72149g);
        return position;
    }
}
