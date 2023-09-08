package p152f0;

import androidx.compose.p002ui.platform.C103645l0;
import fy3.C32228q;
import gy3.C87412m;
import gy3.C87413o;
import p1165z.C112527l;
import p175j0.C108494d2;
import p175j0.C108500f2;
import p175j0.C108504h;
import p175j0.C60667k2;
import p560i2.C33183o;
import p721v0.C65503j;
import p759y.C112195b0;
import p759y.C112218f0;
import p759y.C112241i0;
import p759y.C112278q0;
import p759y.C112280r0;
import p759y.C112302z0;
import p759y.C66467a1;
import p759y.C66468h;

/* renamed from: f0.i2 */
public final class C107352i2 extends C87413o implements C32228q<C65503j, C108504h, Integer, C65503j> {

    /* renamed from: d */
    public final /* synthetic */ C107356k2 f321187d;

    /* renamed from: e */
    public final /* synthetic */ boolean f321188e;

    /* renamed from: f */
    public final /* synthetic */ C112527l f321189f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C107352i2(C107356k2 k2Var, boolean z, C112527l lVar) {
        super(3);
        this.f321187d = k2Var;
        this.f321188e = z;
        this.f321189f = lVar;
    }

    public Object invoke(Object obj, Object obj2, Object obj3) {
        boolean z;
        C108504h hVar = (C108504h) obj2;
        ((Number) obj3).intValue();
        C87412m.m108594g((C65503j) obj, "$this$composed");
        hVar.mo51557H(805428266);
        boolean z2 = ((C112218f0) ((C108494d2) this.f321187d.f321202e).getValue()) == C112218f0.Vertical || !(hVar.mo51598m(C103645l0.f306130k) == C33183o.Rtl);
        C107348h2 h2Var = new C107348h2(this.f321187d);
        hVar.mo51557H(-180460798);
        C60667k2 e = C108500f2.m146998e(h2Var, hVar, 0);
        hVar.mo51557H(-492369756);
        Object q = hVar.mo51606q();
        if (q == C108504h.C60656a.f172772a) {
            C66468h hVar2 = new C66468h(new C66467a1(e));
            hVar.mo51553F(hVar2);
            q = hVar2;
        }
        hVar.mo51565P();
        C112302z0 z0Var = (C112302z0) q;
        hVar.mo51565P();
        C65503j.C65504a aVar = C65503j.C65504a.f188490d;
        C112218f0 f0Var = (C112218f0) ((C108494d2) this.f321187d.f321202e).getValue();
        if (this.f321188e) {
            if (!(((Number) ((C108494d2) this.f321187d.f321199b).getValue()).floatValue() == 0.0f)) {
                z = true;
                C112527l lVar = this.f321189f;
                C112278q0 q0Var = C112280r0.f336211a;
                C87412m.m108594g(z0Var, "state");
                C87412m.m108594g(f0Var, "orientation");
                C65503j b = C112280r0.m153172b(aVar, z0Var, f0Var, (C112241i0) null, z, z2, (C112195b0) null, lVar);
                hVar.mo51565P();
                return b;
            }
        }
        z = false;
        C112527l lVar2 = this.f321189f;
        C112278q0 q0Var2 = C112280r0.f336211a;
        C87412m.m108594g(z0Var, "state");
        C87412m.m108594g(f0Var, "orientation");
        C65503j b2 = C112280r0.m153172b(aVar, z0Var, f0Var, (C112241i0) null, z, z2, (C112195b0) null, lVar2);
        hVar.mo51565P();
        return b2;
    }
}
