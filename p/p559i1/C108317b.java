package p559i1;

import fy3.C32226l;
import fy3.C32227p;
import gy3.C87412m;
import p1140p1.C110096b;
import p1140p1.C110098d;
import p1140p1.C110099e;
import p1140p1.C110100f;
import p559i1.C33176a;
import p721v0.C65503j;

/* renamed from: i1.b */
public class C108317b<T extends C33176a> implements C110096b, C110098d<C108317b<T>> {

    /* renamed from: d */
    public final C32226l<C33176a, Boolean> f324335d;

    /* renamed from: e */
    public final C32226l<C33176a, Boolean> f324336e;

    /* renamed from: f */
    public final C110100f<C108317b<T>> f324337f;

    /* renamed from: g */
    public C108317b<T> f324338g;

    public C108317b(C32226l<? super C33176a, Boolean> lVar, C32226l<? super C33176a, Boolean> lVar2, C110100f<C108317b<T>> fVar) {
        C87412m.m108594g(fVar, "key");
        this.f324335d = lVar;
        this.f324336e = lVar2;
        this.f324337f = fVar;
    }

    /* renamed from: S */
    public <R> R mo74969S(R r, C32227p<? super C65503j.C65506c, ? super R, ? extends R> pVar) {
        C87412m.m108594g(pVar, "operation");
        return pVar.invoke(this, r);
    }

    /* renamed from: U */
    public void mo145808U(C110099e eVar) {
        C87412m.m108594g(eVar, "scope");
        this.f324338g = (C108317b) eVar.mo161499a(this.f324337f);
    }

    /* renamed from: a */
    public boolean mo74970a(C32226l<? super C65503j.C65506c, Boolean> lVar) {
        C87412m.m108594g(lVar, "predicate");
        return C65503j.C65506c.C65507a.m77190a(this, lVar);
    }

    /* renamed from: b */
    public final boolean mo158778b(T t) {
        C32226l<C33176a, Boolean> lVar = this.f324335d;
        if (lVar != null && lVar.invoke(t).booleanValue()) {
            return true;
        }
        C108317b<T> bVar = this.f324338g;
        if (bVar != null) {
            return bVar.mo158778b(t);
        }
        return false;
    }

    /* renamed from: c */
    public <R> R mo74971c(R r, C32227p<? super R, ? super C65503j.C65506c, ? extends R> pVar) {
        C87412m.m108594g(pVar, "operation");
        return pVar.invoke(r, this);
    }

    /* renamed from: d */
    public final boolean mo158779d(T t) {
        C108317b<T> bVar = this.f324338g;
        if (bVar != null && bVar.mo158779d(t)) {
            return true;
        }
        C32226l<C33176a, Boolean> lVar = this.f324336e;
        if (lVar != null) {
            return lVar.invoke(t).booleanValue();
        }
        return false;
    }

    public C110100f<C108317b<T>> getKey() {
        return this.f324337f;
    }

    public Object getValue() {
        return this;
    }

    /* renamed from: i0 */
    public C65503j mo74972i0(C65503j jVar) {
        C87412m.m108594g(jVar, "other");
        return C65503j.C65505b.m77189a(this, jVar);
    }
}
