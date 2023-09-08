package jt1;

import gy3.C87412m;
import i31.C117139g;
import jp3.C9487b;
import nr3.C89059e;
import ob0.C89132b;
import te3.C49335eu3;
import wx3.C15601d;
import wx3.C66218h;
import xx3.C66447b;

/* renamed from: jt1.c */
public abstract class C9519c<_key, _resp extends C49335eu3> extends C89132b<_resp> implements C117139g<_key, C89132b.C89134c<_resp>> {

    /* renamed from: i */
    public C9487b<?> f29698i;

    public C9519c(C9487b<?> bVar) {
        this.f29698i = bVar;
    }

    /* renamed from: a */
    public void mo10079a() {
        mo85581g();
        this.f29698i = null;
    }

    /* renamed from: b */
    public void mo10080b(Object obj) {
        C87412m.m108594g((C89132b.C89134c) obj, "value");
    }

    /* renamed from: f */
    public Object mo10083f(C15601d<? super C89132b.C89134c<_resp>> dVar) {
        C66218h hVar = new C66218h(C66447b.m78392b(dVar));
        C89059e i = mo9225i();
        C9487b<?> bVar = this.f29698i;
        if (bVar != null) {
            i.mo11397F(bVar);
        }
        this.f29698i = null;
        i.mo123420E(new C9518b(hVar));
        return hVar.mo90314b();
    }
}
