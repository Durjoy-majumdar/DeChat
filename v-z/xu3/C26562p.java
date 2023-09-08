package xu3;

import pu3.C25478i;
import pu3.C25499u;
import pu3.C25502v;
import qu3.C25903a;
import yu3.C26639a;
import zu3.C26718e;
import zu3.C26722g;

/* renamed from: xu3.p */
public class C26562p extends C26555i<C25502v> {

    /* renamed from: d */
    public C25499u.C25500a f73912d = null;

    /* renamed from: e */
    public C25478i.C25484f f73913e = null;

    public C26562p(C26639a aVar, C25478i iVar, C25478i iVar2, C26722g gVar) {
        super(aVar, iVar, gVar);
        if (iVar2 != null) {
            C25499u.C25500a aVar2 = iVar2.f72125a.f72162i;
            this.f73912d = aVar2;
            this.f73913e = iVar2.mo52716d(aVar2);
        }
    }

    /* renamed from: a */
    public Comparable mo53495a(C26718e eVar, Comparable comparable) {
        C25502v vVar = (C25502v) comparable;
        eVar.getClass();
        if (vVar == C25502v.f72186f) {
            return vVar;
        }
        int length = vVar.f72187e.length;
        short[] sArr = new short[length];
        for (int i = 0; i < length; i++) {
            sArr[i] = (short) eVar.mo53712f(vVar.f72187e[i]);
        }
        return new C25502v(vVar.f72185d, sArr);
    }

    /* renamed from: c */
    public C25499u.C25500a mo53496c(C25478i iVar) {
        return iVar.f72125a.f72162i;
    }

    /* renamed from: d */
    public void mo53497d(C26722g gVar, int i, int i2) {
        if (i2 < 0) {
            gVar.getClass();
        } else {
            gVar.f74295t.mo183355b(i2, true);
        }
    }

    /* renamed from: e */
    public Comparable mo53498e(C25903a aVar) {
        return aVar.mo52739r();
    }

    /* renamed from: g */
    public void mo53499g(C26722g gVar, int i, int i2, int i3, int i4) {
        if (i2 != i4) {
            gVar.f74281f.mo162980f(i2, i4);
        }
    }

    /* renamed from: h */
    public int mo53500h(Comparable comparable) {
        this.f73912d.f72182f++;
        C25478i.C25484f fVar = this.f73913e;
        fVar.mo52740z(C25478i.this.f72125a.f72162i, true);
        int position = fVar.f72245a.position();
        short[] sArr = ((C25502v) comparable).f72187e;
        fVar.mo52793v(sArr.length);
        for (short x : sArr) {
            fVar.mo52795x(x);
        }
        return position;
    }
}
