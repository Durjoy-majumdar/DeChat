package xu3;

import pu3.C25470e;
import pu3.C25478i;
import pu3.C25494p;
import pu3.C25499u;
import qu3.C25903a;
import yu3.C26639a;
import zu3.C26718e;
import zu3.C26722g;

/* renamed from: xu3.e */
public class C26551e extends C26555i<C25470e> {

    /* renamed from: d */
    public C25499u.C25500a f73887d = null;

    /* renamed from: e */
    public C25478i.C25484f f73888e = null;

    public C26551e(C26639a aVar, C25478i iVar, C25478i iVar2, C26722g gVar) {
        super(aVar, iVar, gVar);
        if (iVar2 != null) {
            C25499u.C25500a aVar2 = iVar2.f72125a.f72165l;
            this.f73887d = aVar2;
            this.f73888e = iVar2.mo52716d(aVar2);
        }
    }

    /* renamed from: a */
    public Comparable mo53495a(C26718e eVar, Comparable comparable) {
        C25470e eVar2 = (C25470e) comparable;
        eVar.getClass();
        C25470e.C25471a[] aVarArr = eVar2.f72090e;
        C25470e.C25471a[] aVarArr2 = new C25470e.C25471a[aVarArr.length];
        for (int i = 0; i < aVarArr.length; i++) {
            C25470e.C25471a aVar = aVarArr[i];
            aVarArr2[i] = new C25470e.C25471a(eVar.mo53708b(aVar.f72094d), aVar.f72095e);
        }
        C25470e.C25471a[] aVarArr3 = eVar2.f72091f;
        C25470e.C25471a[] aVarArr4 = new C25470e.C25471a[aVarArr3.length];
        for (int i2 = 0; i2 < aVarArr3.length; i2++) {
            C25470e.C25471a aVar2 = aVarArr3[i2];
            aVarArr4[i2] = new C25470e.C25471a(eVar.mo53708b(aVar2.f72094d), aVar2.f72095e);
        }
        return new C25470e(eVar2.f72185d, aVarArr2, aVarArr4, eVar.mo53710d(eVar2.f72092g), eVar.mo53710d(eVar2.f72093h));
    }

    /* renamed from: c */
    public C25499u.C25500a mo53496c(C25478i iVar) {
        return iVar.f72125a.f72165l;
    }

    /* renamed from: d */
    public void mo53497d(C26722g gVar, int i, int i2) {
        if (i2 < 0) {
            gVar.getClass();
        } else {
            gVar.f74301z.mo183355b(i2, true);
        }
    }

    /* renamed from: e */
    public Comparable mo53498e(C25903a aVar) {
        return aVar.mo52730f();
    }

    /* renamed from: g */
    public void mo53499g(C26722g gVar, int i, int i2, int i3, int i4) {
        if (i2 != i4) {
            gVar.f74287l.mo162980f(i2, i4);
        }
    }

    /* renamed from: h */
    public int mo53500h(Comparable comparable) {
        C25470e eVar = (C25470e) comparable;
        this.f73887d.f72182f++;
        C25478i.C25484f fVar = this.f73888e;
        fVar.mo52740z(C25478i.this.f72125a.f72165l, true);
        int position = fVar.f72245a.position();
        C25494p.m32919d(fVar, eVar.f72090e.length);
        C25494p.m32919d(fVar, eVar.f72091f.length);
        C25494p.m32919d(fVar, eVar.f72092g.length);
        C25494p.m32919d(fVar, eVar.f72093h.length);
        int i = 0;
        for (C25470e.C25471a aVar : eVar.f72090e) {
            C25494p.m32919d(fVar, aVar.f72094d - i);
            i = aVar.f72094d;
            C25494p.m32919d(fVar, aVar.f72095e);
        }
        int i2 = 0;
        for (C25470e.C25471a aVar2 : eVar.f72091f) {
            C25494p.m32919d(fVar, aVar2.f72094d - i2);
            i2 = aVar2.f72094d;
            C25494p.m32919d(fVar, aVar2.f72095e);
        }
        fVar.mo52794w(eVar.f72092g);
        fVar.mo52794w(eVar.f72093h);
        return position;
    }
}
