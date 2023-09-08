package xu3;

import pu3.C25467b;
import pu3.C25478i;
import pu3.C25499u;
import qu3.C25903a;
import yu3.C26639a;
import zu3.C26718e;
import zu3.C26722g;

/* renamed from: xu3.c */
public class C26549c extends C26555i<C25467b> {

    /* renamed from: d */
    public C25499u.C25500a f73883d = null;

    /* renamed from: e */
    public C25478i.C25484f f73884e = null;

    public C26549c(C26639a aVar, C25478i iVar, C25478i iVar2, C26722g gVar) {
        super(aVar, iVar, gVar);
        if (iVar2 != null) {
            C25499u.C25500a aVar2 = iVar2.f72125a.f72164k;
            this.f73883d = aVar2;
            this.f73884e = iVar2.mo52716d(aVar2);
        }
    }

    /* renamed from: a */
    public Comparable mo53495a(C26718e eVar, Comparable comparable) {
        C25467b bVar = (C25467b) comparable;
        eVar.getClass();
        int length = bVar.f72084e.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            int i2 = bVar.f72084e[i];
            C26722g gVar = (C26722g) eVar;
            int d = gVar.f74282g.mo162978d(i2);
            if (d >= 0) {
                i2 = gVar.f74282g.f333062e[d];
            } else if (i2 >= 0 && gVar.f74296u.mo183354a(i2)) {
                i2 = -1;
            }
            iArr[i] = i2;
        }
        return new C25467b(bVar.f72185d, iArr);
    }

    /* renamed from: c */
    public C25499u.C25500a mo53496c(C25478i iVar) {
        return iVar.f72125a.f72164k;
    }

    /* renamed from: d */
    public void mo53497d(C26722g gVar, int i, int i2) {
        if (i2 < 0) {
            gVar.getClass();
        } else {
            gVar.f74297v.mo183355b(i2, true);
        }
    }

    /* renamed from: e */
    public Comparable mo53498e(C25903a aVar) {
        return aVar.mo52727c();
    }

    /* renamed from: g */
    public void mo53499g(C26722g gVar, int i, int i2, int i3, int i4) {
        if (i2 != i4) {
            gVar.f74283h.mo162980f(i2, i4);
        }
    }

    /* renamed from: h */
    public int mo53500h(Comparable comparable) {
        C25467b bVar = (C25467b) comparable;
        this.f73883d.f72182f++;
        C25478i.C25484f fVar = this.f73884e;
        fVar.mo52740z(C25478i.this.f72125a.f72164k, true);
        int position = fVar.f72245a.position();
        fVar.mo52793v(bVar.f72084e.length);
        for (int v : bVar.f72084e) {
            fVar.mo52793v(v);
        }
        return position;
    }
}
