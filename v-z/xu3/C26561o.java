package xu3;

import pu3.C25478i;
import pu3.C25499u;
import qu3.C25903a;
import yu3.C26639a;
import zu3.C26718e;
import zu3.C26722g;

/* renamed from: xu3.o */
public class C26561o extends C26555i<Integer> {

    /* renamed from: d */
    public C25499u.C25500a f73910d = null;

    /* renamed from: e */
    public C25478i.C25484f f73911e = null;

    public C26561o(C26639a aVar, C25478i iVar, C25478i iVar2, C26722g gVar) {
        super(aVar, iVar, gVar);
        if (iVar2 != null) {
            C25499u.C25500a aVar2 = iVar2.f72125a.f72156c;
            this.f73910d = aVar2;
            this.f73911e = iVar2.mo52716d(aVar2);
        }
    }

    /* renamed from: a */
    public Comparable mo53495a(C26718e eVar, Comparable comparable) {
        return Integer.valueOf(eVar.mo53711e(((Integer) comparable).intValue()));
    }

    /* renamed from: c */
    public C25499u.C25500a mo53496c(C25478i iVar) {
        return iVar.f72125a.f72156c;
    }

    /* renamed from: d */
    public void mo53497d(C26722g gVar, int i, int i2) {
        if (i < 0) {
            gVar.getClass();
        } else {
            gVar.f74291p.mo183355b(i, true);
        }
    }

    /* renamed from: e */
    public Comparable mo53498e(C25903a aVar) {
        return Integer.valueOf(aVar.mo52787l());
    }

    /* renamed from: g */
    public void mo53499g(C26722g gVar, int i, int i2, int i3, int i4) {
        if (i != i3) {
            gVar.f74277b.mo162980f(i, i3);
        }
    }

    /* renamed from: h */
    public int mo53500h(Comparable comparable) {
        int position = this.f73911e.f72245a.position();
        this.f73911e.mo52793v(((Integer) comparable).intValue());
        this.f73910d.f72182f++;
        return position;
    }
}
