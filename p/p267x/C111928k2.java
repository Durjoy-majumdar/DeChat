package p267x;

import a14.C0000n0;
import androidx.compose.p002ui.platform.C103645l0;
import fy3.C32228q;
import gy3.C87412m;
import gy3.C87413o;
import p175j0.C108504h;
import p175j0.C108515x;
import p175j0.C60655g0;
import p246u1.C111082p;
import p560i2.C33183o;
import p721v0.C65503j;
import p759y.C112195b0;
import p759y.C112202c;
import p759y.C112218f0;
import p759y.C112241i0;
import p759y.C112280r0;
import wx3.C66217g;

/* renamed from: x.k2 */
public final class C111928k2 extends C87413o implements C32228q<C65503j, C108504h, Integer, C65503j> {

    /* renamed from: d */
    public final /* synthetic */ boolean f335084d;

    /* renamed from: e */
    public final /* synthetic */ C111932l2 f335085e;

    /* renamed from: f */
    public final /* synthetic */ boolean f335086f;

    /* renamed from: g */
    public final /* synthetic */ C112195b0 f335087g;

    /* renamed from: h */
    public final /* synthetic */ boolean f335088h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C111928k2(boolean z, C111932l2 l2Var, boolean z2, C112195b0 b0Var, boolean z3) {
        super(3);
        this.f335084d = z;
        this.f335085e = l2Var;
        this.f335086f = z2;
        this.f335087g = b0Var;
        this.f335088h = z3;
    }

    public Object invoke(Object obj, Object obj2, Object obj3) {
        C108504h hVar = (C108504h) obj2;
        ((Number) obj3).intValue();
        C87412m.m108594g((C65503j) obj, "$this$composed");
        hVar.mo51557H(1478351300);
        boolean z = false;
        C112241i0 a = C112202c.m153101a(hVar, 0);
        hVar.mo51557H(773894976);
        hVar.mo51557H(-492369756);
        Object q = hVar.mo51606q();
        if (q == C108504h.C60656a.f172772a) {
            C108515x xVar = new C108515x(C60655g0.m70937h(C66217g.f190253d, hVar));
            hVar.mo51553F(xVar);
            q = xVar;
        }
        hVar.mo51565P();
        C0000n0 n0Var = ((C108515x) q).f324838d;
        hVar.mo51565P();
        C65503j.C65504a aVar = C65503j.C65504a.f188490d;
        C65503j b = C111082p.m151476b(aVar, false, new C111922j2(this.f335088h, this.f335084d, this.f335086f, this.f335085e, n0Var));
        boolean z2 = this.f335084d;
        C112218f0 f0Var = z2 ? C112218f0.Vertical : C112218f0.Horizontal;
        boolean z3 = !this.f335088h;
        if (hVar.mo51598m(C103645l0.f306130k) == C33183o.Rtl) {
            z = true;
        }
        boolean z4 = (!z || z2) ? z3 : !z3;
        C111932l2 l2Var = this.f335085e;
        C65503j b2 = C112280r0.m153172b(aVar, l2Var, f0Var, a, this.f335086f, z4, this.f335087g, l2Var.f335096b);
        C111935m2 m2Var = new C111935m2(this.f335085e, this.f335088h, this.f335084d, a);
        boolean z5 = this.f335084d;
        C87412m.m108594g(b, "<this>");
        C65503j i0 = b.mo74972i0(z5 ? C111902d2.f335013c : C111902d2.f335012b).mo74972i0(b2).mo74972i0(m2Var);
        hVar.mo51565P();
        return i0;
    }
}
