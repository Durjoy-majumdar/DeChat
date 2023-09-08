package xu3;

import java.io.ByteArrayOutputStream;
import pu3.C25466a;
import pu3.C25478i;
import pu3.C25490l;
import pu3.C25492n;
import pu3.C25499u;
import qu3.C25903a;
import yu3.C26639a;
import zu3.C26717d;
import zu3.C26718e;
import zu3.C26722g;

/* renamed from: xu3.a */
public class C26547a extends C26555i<C25466a> {

    /* renamed from: d */
    public C25499u.C25500a f73879d = null;

    /* renamed from: e */
    public C25478i.C25484f f73880e = null;

    public C26547a(C26639a aVar, C25478i iVar, C25478i iVar2, C26722g gVar) {
        super(aVar, iVar, gVar);
        if (iVar2 != null) {
            C25499u.C25500a aVar2 = iVar2.f72125a.f72169p;
            this.f73879d = aVar2;
            this.f73880e = iVar2.mo52716d(aVar2);
        }
    }

    /* renamed from: a */
    public Comparable mo53495a(C26718e eVar, Comparable comparable) {
        C25466a aVar = (C25466a) comparable;
        eVar.getClass();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(aVar.f72083f.f72139e.length);
        new C26718e.C26719a(new C26717d(eVar, byteArrayOutputStream)).mo53714b(new C25492n(aVar.f72083f, 29));
        return new C25466a(aVar.f72185d, aVar.f72082e, new C25490l(aVar.f72083f.f72185d, byteArrayOutputStream.toByteArray()));
    }

    /* renamed from: c */
    public C25499u.C25500a mo53496c(C25478i iVar) {
        return iVar.f72125a.f72169p;
    }

    /* renamed from: d */
    public void mo53497d(C26722g gVar, int i, int i2) {
        if (i2 < 0) {
            gVar.getClass();
        } else {
            gVar.f74296u.mo183355b(i2, true);
        }
    }

    /* renamed from: e */
    public Comparable mo53498e(C25903a aVar) {
        return aVar.mo52726b();
    }

    /* renamed from: g */
    public void mo53499g(C26722g gVar, int i, int i2, int i3, int i4) {
        if (i2 != i4) {
            gVar.f74282g.mo162980f(i2, i4);
        }
    }

    /* renamed from: h */
    public int mo53500h(Comparable comparable) {
        C25466a aVar = (C25466a) comparable;
        this.f73879d.f72182f++;
        C25478i.C25484f fVar = this.f73880e;
        fVar.mo52740z(C25478i.this.f72125a.f72169p, true);
        int position = fVar.f72245a.position();
        fVar.mo52789o(aVar.f72082e);
        fVar.mo52725A(aVar.f72083f);
        return position;
    }
}
