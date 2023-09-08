package p869y0;

import fy3.C32226l;
import fy3.C32227p;
import gy3.C87412m;
import p1140p1.C110096b;
import p1140p1.C110098d;
import p1140p1.C110099e;
import p1140p1.C110100f;
import p410k0.C108793e;
import p721v0.C65503j;

/* renamed from: y0.z */
public final class C112344z implements C110096b, C110098d<C112344z> {

    /* renamed from: d */
    public C112344z f336373d;

    /* renamed from: e */
    public final C108793e<C112321l> f336374e = new C108793e<>(new C112321l[16], 0);

    public C112344z(C112339w wVar) {
        C87412m.m108594g(wVar, "focusRequester");
        wVar.f336369a.mo159860b(this);
    }

    /* renamed from: S */
    public <R> R mo74969S(R r, C32227p<? super C65503j.C65506c, ? super R, ? extends R> pVar) {
        C87412m.m108594g(pVar, "operation");
        return pVar.invoke(this, r);
    }

    /* renamed from: U */
    public void mo145808U(C110099e eVar) {
        C87412m.m108594g(eVar, "scope");
        C112344z zVar = (C112344z) eVar.mo161499a(C112341y.f336370a);
        if (!C87412m.m108589b(zVar, this.f336373d)) {
            C112344z zVar2 = this.f336373d;
            if (zVar2 != null) {
                zVar2.mo164070f(this.f336374e);
            }
            if (zVar != null) {
                zVar.mo164068d(this.f336374e);
            }
            this.f336373d = zVar;
        }
    }

    /* renamed from: a */
    public boolean mo74970a(C32226l<? super C65503j.C65506c, Boolean> lVar) {
        C87412m.m108594g(lVar, "predicate");
        return C65503j.C65506c.C65507a.m77190a(this, lVar);
    }

    /* renamed from: b */
    public final void mo164067b(C112321l lVar) {
        C87412m.m108594g(lVar, "focusModifier");
        this.f336374e.mo159860b(lVar);
        C112344z zVar = this.f336373d;
        if (zVar != null) {
            zVar.mo164067b(lVar);
        }
    }

    /* renamed from: c */
    public <R> R mo74971c(R r, C32227p<? super R, ? super C65503j.C65506c, ? extends R> pVar) {
        C87412m.m108594g(pVar, "operation");
        return pVar.invoke(r, this);
    }

    /* renamed from: d */
    public final void mo164068d(C108793e<C112321l> eVar) {
        C87412m.m108594g(eVar, "newModifiers");
        C108793e<C112321l> eVar2 = this.f336374e;
        eVar2.mo159862d(eVar2.f325786f, eVar);
        C112344z zVar = this.f336373d;
        if (zVar != null) {
            zVar.mo164068d(eVar);
        }
    }

    /* renamed from: e */
    public final void mo164069e(C112321l lVar) {
        C87412m.m108594g(lVar, "focusModifier");
        this.f336374e.mo159869k(lVar);
        C112344z zVar = this.f336373d;
        if (zVar != null) {
            zVar.mo164069e(lVar);
        }
    }

    /* renamed from: f */
    public final void mo164070f(C108793e<C112321l> eVar) {
        C87412m.m108594g(eVar, "removedModifiers");
        this.f336374e.mo159870l(eVar);
        C112344z zVar = this.f336373d;
        if (zVar != null) {
            zVar.mo164070f(eVar);
        }
    }

    public C110100f<C112344z> getKey() {
        return C112341y.f336370a;
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
