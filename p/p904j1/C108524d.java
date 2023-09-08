package p904j1;

import android.view.KeyEvent;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C87412m;
import p1140p1.C110096b;
import p1140p1.C110098d;
import p1140p1.C110099e;
import p1140p1.C110100f;
import p410k0.C108793e;
import p631o1.C109847j0;
import p631o1.C109857o;
import p658q1.C110301j;
import p658q1.C110311s;
import p721v0.C65503j;
import p869y0.C112321l;
import p869y0.C112323m;

/* renamed from: j1.d */
public final class C108524d implements C110096b, C110098d<C108524d>, C109847j0 {

    /* renamed from: d */
    public final C32226l<C76379b, Boolean> f324860d;

    /* renamed from: e */
    public final C32226l<C76379b, Boolean> f324861e;

    /* renamed from: f */
    public C112321l f324862f;

    /* renamed from: g */
    public C108524d f324863g;

    /* renamed from: h */
    public C110301j f324864h;

    public C108524d(C32226l<? super C76379b, Boolean> lVar, C32226l<? super C76379b, Boolean> lVar2) {
        this.f324860d = lVar;
        this.f324861e = lVar2;
    }

    /* renamed from: S */
    public <R> R mo74969S(R r, C32227p<? super C65503j.C65506c, ? super R, ? extends R> pVar) {
        C87412m.m108594g(pVar, "operation");
        return pVar.invoke(this, r);
    }

    /* renamed from: U */
    public void mo145808U(C110099e eVar) {
        C108793e<C108524d> eVar2;
        C108793e<C108524d> eVar3;
        C87412m.m108594g(eVar, "scope");
        C112321l lVar = this.f324862f;
        if (!(lVar == null || (eVar3 = lVar.f336344u) == null)) {
            eVar3.mo159869k(this);
        }
        C112321l lVar2 = (C112321l) eVar.mo161499a(C112323m.f336346a);
        this.f324862f = lVar2;
        if (!(lVar2 == null || (eVar2 = lVar2.f336344u) == null)) {
            eVar2.mo159860b(this);
        }
        this.f324863g = (C108524d) eVar.mo161499a(C108525e.f324865a);
    }

    /* renamed from: a */
    public boolean mo74970a(C32226l<? super C65503j.C65506c, Boolean> lVar) {
        C87412m.m108594g(lVar, "predicate");
        return C65503j.C65506c.C65507a.m77190a(this, lVar);
    }

    /* renamed from: b */
    public final boolean mo159379b(KeyEvent keyEvent) {
        C87412m.m108594g(keyEvent, "keyEvent");
        C32226l<C76379b, Boolean> lVar = this.f324860d;
        Boolean invoke = lVar != null ? lVar.invoke(new C76379b(keyEvent)) : null;
        if (C87412m.m108589b(invoke, Boolean.TRUE)) {
            return invoke.booleanValue();
        }
        C108524d dVar = this.f324863g;
        if (dVar != null) {
            return dVar.mo159379b(keyEvent);
        }
        return false;
    }

    /* renamed from: c */
    public <R> R mo74971c(R r, C32227p<? super R, ? super C65503j.C65506c, ? extends R> pVar) {
        C87412m.m108594g(pVar, "operation");
        return pVar.invoke(r, this);
    }

    /* renamed from: d */
    public final boolean mo159380d(KeyEvent keyEvent) {
        C87412m.m108594g(keyEvent, "keyEvent");
        C108524d dVar = this.f324863g;
        Boolean valueOf = dVar != null ? Boolean.valueOf(dVar.mo159380d(keyEvent)) : null;
        if (C87412m.m108589b(valueOf, Boolean.TRUE)) {
            return valueOf.booleanValue();
        }
        C32226l<C76379b, Boolean> lVar = this.f324861e;
        if (lVar != null) {
            return lVar.invoke(new C76379b(keyEvent)).booleanValue();
        }
        return false;
    }

    public C110100f<C108524d> getKey() {
        return C108525e.f324865a;
    }

    public Object getValue() {
        return this;
    }

    /* renamed from: i0 */
    public C65503j mo74972i0(C65503j jVar) {
        C87412m.m108594g(jVar, "other");
        return C65503j.C65505b.m77189a(this, jVar);
    }

    /* renamed from: y */
    public void mo145809y(C109857o oVar) {
        C87412m.m108594g(oVar, "coordinates");
        this.f324864h = ((C110311s) oVar).f329972h;
    }
}
