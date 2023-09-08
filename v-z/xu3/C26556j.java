package xu3;

import pu3.C25478i;
import pu3.C25493o;
import pu3.C25499u;
import qu3.C25903a;
import yu3.C26639a;
import zu3.C26718e;
import zu3.C26722g;

/* renamed from: xu3.j */
public class C26556j extends C26555i<C25493o> {

    /* renamed from: d */
    public C25499u.C25500a f73898d = null;

    /* renamed from: e */
    public C25478i.C25484f f73899e = null;

    public C26556j(C26639a aVar, C25478i iVar, C25478i iVar2, C26722g gVar) {
        super(aVar, iVar, gVar);
        if (iVar2 != null) {
            C25499u.C25500a aVar2 = iVar2.f72125a.f72158e;
            this.f73898d = aVar2;
            this.f73899e = iVar2.mo52716d(aVar2);
        }
    }

    /* renamed from: a */
    public Comparable mo53495a(C26718e eVar, Comparable comparable) {
        C25493o oVar = (C25493o) comparable;
        eVar.getClass();
        return new C25493o(oVar.f72185d, eVar.mo53712f(oVar.f72144e), eVar.mo53712f(oVar.f72145f), eVar.mo53711e(oVar.f72146g));
    }

    /* renamed from: c */
    public C25499u.C25500a mo53496c(C25478i iVar) {
        return iVar.f72125a.f72158e;
    }

    /* renamed from: d */
    public void mo53497d(C26722g gVar, int i, int i2) {
        if (i < 0) {
            gVar.getClass();
        } else {
            gVar.f74293r.mo183355b(i, true);
        }
    }

    /* renamed from: e */
    public Comparable mo53498e(C25903a aVar) {
        return aVar.mo52735k();
    }

    /* renamed from: g */
    public void mo53499g(C26722g gVar, int i, int i2, int i3, int i4) {
        if (i != i3) {
            gVar.f74279d.mo162980f(i, i3);
        }
    }

    /* renamed from: h */
    public int mo53500h(Comparable comparable) {
        C25493o oVar = (C25493o) comparable;
        this.f73898d.f72182f++;
        C25478i.C25484f fVar = this.f73899e;
        fVar.mo52740z(C25478i.this.f72125a.f72158e, true);
        int position = fVar.f72245a.position();
        fVar.mo52796y(oVar.f72144e);
        fVar.mo52796y(oVar.f72145f);
        fVar.mo52793v(oVar.f72146g);
        return position;
    }
}
