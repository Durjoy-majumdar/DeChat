package p868x0;

import fy3.C32226l;
import fy3.C32227p;
import gy3.C87412m;
import p721v0.C65503j;
import p835c1.C54601d;

/* renamed from: x0.g */
public final class C111981g implements C111980f {

    /* renamed from: d */
    public final C111978c f335229d;

    /* renamed from: e */
    public final C32226l<C111978c, C111985j> f335230e;

    public C111981g(C111978c cVar, C32226l<? super C111978c, C111985j> lVar) {
        C87412m.m108594g(cVar, "cacheDrawScope");
        C87412m.m108594g(lVar, "onBuildDrawCache");
        this.f335229d = cVar;
        this.f335230e = lVar;
    }

    /* renamed from: S */
    public <R> R mo74969S(R r, C32227p<? super C65503j.C65506c, ? super R, ? extends R> pVar) {
        C87412m.m108594g(pVar, "operation");
        return pVar.invoke(this, r);
    }

    /* renamed from: V */
    public void mo90316V(C54601d dVar) {
        C87412m.m108594g(dVar, "<this>");
        C111985j jVar = this.f335229d.f335228e;
        C87412m.m108591d(jVar);
        jVar.f335232a.invoke(dVar);
    }

    /* renamed from: a */
    public boolean mo74970a(C32226l<? super C65503j.C65506c, Boolean> lVar) {
        C87412m.m108594g(lVar, "predicate");
        return C65503j.C65506c.C65507a.m77190a(this, lVar);
    }

    /* renamed from: c */
    public <R> R mo74971c(R r, C32227p<? super R, ? super C65503j.C65506c, ? extends R> pVar) {
        C87412m.m108594g(pVar, "operation");
        return pVar.invoke(r, this);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C111981g)) {
            return false;
        }
        C111981g gVar = (C111981g) obj;
        return C87412m.m108589b(this.f335229d, gVar.f335229d) && C87412m.m108589b(this.f335230e, gVar.f335230e);
    }

    public int hashCode() {
        return (this.f335229d.hashCode() * 31) + this.f335230e.hashCode();
    }

    /* renamed from: i0 */
    public C65503j mo74972i0(C65503j jVar) {
        C87412m.m108594g(jVar, "other");
        return C65503j.C65505b.m77189a(this, jVar);
    }

    /* renamed from: n0 */
    public void mo163643n0(C111977b bVar) {
        C87412m.m108594g(bVar, "params");
        C111978c cVar = this.f335229d;
        cVar.getClass();
        cVar.f335227d = bVar;
        cVar.f335228e = null;
        this.f335230e.invoke(cVar);
        if (cVar.f335228e == null) {
            throw new IllegalStateException("DrawResult not defined, did you forget to call onDraw?".toString());
        }
    }

    public String toString() {
        return "DrawContentCacheModifier(cacheDrawScope=" + this.f335229d + ", onBuildDrawCache=" + this.f335230e + ')';
    }
}
