package xu3;

import java.io.ByteArrayOutputStream;
import pu3.C25478i;
import pu3.C25490l;
import pu3.C25492n;
import pu3.C25494p;
import pu3.C25499u;
import qu3.C25903a;
import yu3.C26639a;
import zu3.C26716c;
import zu3.C26718e;
import zu3.C26722g;

/* renamed from: xu3.m */
public class C26559m extends C26555i<C25490l> {

    /* renamed from: d */
    public C25499u.C25500a f73904d = null;

    /* renamed from: e */
    public C25478i.C25484f f73905e = null;

    public C26559m(C26639a aVar, C25478i iVar, C25478i iVar2, C26722g gVar) {
        super(aVar, iVar, gVar);
        if (iVar2 != null) {
            C25499u.C25500a aVar2 = iVar2.f72125a.f72170q;
            this.f73904d = aVar2;
            this.f73905e = iVar2.mo52716d(aVar2);
        }
    }

    /* renamed from: a */
    public Comparable mo53495a(C26718e eVar, Comparable comparable) {
        C25490l lVar = (C25490l) comparable;
        eVar.getClass();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(lVar.f72139e.length);
        C26716c cVar = new C26716c(eVar, byteArrayOutputStream);
        C26718e.C26719a aVar = new C26718e.C26719a(cVar);
        C25492n nVar = new C25492n(lVar, 28);
        nVar.mo52750a(28);
        nVar.f72141b = -1;
        int b = C25494p.m32917b(nVar.f72140a);
        C25494p.m32919d(cVar, b);
        for (int i = 0; i < b; i++) {
            aVar.mo53713a(nVar);
        }
        return new C25490l(lVar.f72185d, byteArrayOutputStream.toByteArray());
    }

    /* renamed from: c */
    public C25499u.C25500a mo53496c(C25478i iVar) {
        return iVar.f72125a.f72170q;
    }

    /* renamed from: d */
    public void mo53497d(C26722g gVar, int i, int i2) {
        if (i2 < 0) {
            gVar.getClass();
        } else {
            gVar.f74300y.mo183355b(i2, true);
        }
    }

    /* renamed from: e */
    public Comparable mo53498e(C25903a aVar) {
        return aVar.mo52734j();
    }

    /* renamed from: g */
    public void mo53499g(C26722g gVar, int i, int i2, int i3, int i4) {
        if (i2 != i4) {
            gVar.f74286k.mo162980f(i2, i4);
        }
    }

    /* renamed from: h */
    public int mo53500h(Comparable comparable) {
        this.f73904d.f72182f++;
        return this.f73905e.mo52725A((C25490l) comparable);
    }
}
