package xu3;

import pu3.C25468c;
import pu3.C25478i;
import pu3.C25499u;
import qu3.C25903a;
import yu3.C26639a;
import zu3.C26718e;
import zu3.C26722g;

/* renamed from: xu3.b */
public class C26548b extends C26555i<C25468c> {

    /* renamed from: d */
    public C25499u.C25500a f73881d = null;

    /* renamed from: e */
    public C25478i.C25484f f73882e = null;

    public C26548b(C26639a aVar, C25478i iVar, C25478i iVar2, C26722g gVar) {
        super(aVar, iVar, gVar);
        if (iVar2 != null) {
            C25499u.C25500a aVar2 = iVar2.f72125a.f72163j;
            this.f73881d = aVar2;
            this.f73882e = iVar2.mo52716d(aVar2);
        }
    }

    /* renamed from: a */
    public Comparable mo53495a(C26718e eVar, Comparable comparable) {
        C25468c cVar = (C25468c) comparable;
        eVar.getClass();
        int length = cVar.f72085e.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            iArr[i] = eVar.mo53707a(cVar.f72085e[i]);
        }
        return new C25468c(cVar.f72185d, iArr);
    }

    /* renamed from: c */
    public C25499u.C25500a mo53496c(C25478i iVar) {
        return iVar.f72125a.f72163j;
    }

    /* renamed from: d */
    public void mo53497d(C26722g gVar, int i, int i2) {
        if (i2 < 0) {
            gVar.getClass();
        } else {
            gVar.f74298w.mo183355b(i2, true);
        }
    }

    /* renamed from: e */
    public Comparable mo53498e(C25903a aVar) {
        return aVar.mo52728d();
    }

    /* renamed from: g */
    public void mo53499g(C26722g gVar, int i, int i2, int i3, int i4) {
        if (i2 != i4) {
            gVar.f74284i.mo162980f(i2, i4);
        }
    }

    /* renamed from: h */
    public int mo53500h(Comparable comparable) {
        C25468c cVar = (C25468c) comparable;
        this.f73881d.f72182f++;
        C25478i.C25484f fVar = this.f73882e;
        fVar.mo52740z(C25478i.this.f72125a.f72163j, true);
        int position = fVar.f72245a.position();
        fVar.mo52793v(cVar.f72085e.length);
        for (int v : cVar.f72085e) {
            fVar.mo52793v(v);
        }
        return position;
    }
}
