package p267x;

import android.view.View;
import androidx.compose.p002ui.platform.C103645l0;
import androidx.compose.p002ui.platform.C103691v;
import c14.C54624g;
import d14.C58017a1;
import d14.C58085t0;
import fy3.C32226l;
import fy3.C32228q;
import gy3.C87412m;
import gy3.C87413o;
import p1166z0.C112539e;
import p175j0.C108497e2;
import p175j0.C108500f2;
import p175j0.C108504h;
import p175j0.C60655g0;
import p175j0.C60667k2;
import p175j0.C60690y0;
import p246u1.C111082p;
import p560i2.C108322d;
import p560i2.C108328i;
import p631o1.C109845i0;
import p721v0.C65503j;
import p868x0.C111983i;
import rx3.C13598b0;
import wx3.C15601d;

/* renamed from: x.r1 */
public final class C111953r1 extends C87413o implements C32228q<C65503j, C108504h, Integer, C65503j> {

    /* renamed from: d */
    public final /* synthetic */ C32226l<C108322d, C112539e> f335148d;

    /* renamed from: e */
    public final /* synthetic */ C32226l<C108322d, C112539e> f335149e;

    /* renamed from: f */
    public final /* synthetic */ float f335150f;

    /* renamed from: g */
    public final /* synthetic */ C32226l<C108328i, C13598b0> f335151g;

    /* renamed from: h */
    public final /* synthetic */ C111884a2 f335152h;

    /* renamed from: i */
    public final /* synthetic */ C111959t1 f335153i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C111953r1(C32226l<? super C108322d, C112539e> lVar, C32226l<? super C108322d, C112539e> lVar2, float f, C32226l<? super C108328i, C13598b0> lVar3, C111884a2 a2Var, C111959t1 t1Var) {
        super(3);
        this.f335148d = lVar;
        this.f335149e = lVar2;
        this.f335150f = f;
        this.f335151g = lVar3;
        this.f335152h = a2Var;
        this.f335153i = t1Var;
    }

    public Object invoke(Object obj, Object obj2, Object obj3) {
        C65503j jVar = (C65503j) obj;
        C108504h hVar = (C108504h) obj2;
        ((Number) obj3).intValue();
        C87412m.m108594g(jVar, "$this$composed");
        hVar.mo51557H(-454877003);
        View view = (View) hVar.mo51598m(C103691v.f306272f);
        C108322d dVar = (C108322d) hVar.mo51598m(C103645l0.f306124e);
        hVar.mo51557H(-492369756);
        Object q = hVar.mo51606q();
        Object obj4 = C108504h.C60656a.f172772a;
        if (q == obj4) {
            q = C108500f2.m146996c(new C112539e(C112539e.f336957d), (C108497e2) null, 2, (Object) null);
            hVar.mo51553F(q);
        }
        hVar.mo51565P();
        C60690y0 y0Var = (C60690y0) q;
        C60667k2<T> e = C108500f2.m146998e(this.f335148d, hVar, 0);
        C60667k2<T> e2 = C108500f2.m146998e(this.f335149e, hVar, 0);
        C60667k2 e3 = C108500f2.m146998e(Float.valueOf(this.f335150f), hVar, 0);
        C60667k2<T> e4 = C108500f2.m146998e(this.f335151g, hVar, 0);
        hVar.mo51557H(-492369756);
        Object q2 = hVar.mo51606q();
        if (q2 == obj4) {
            q2 = C108500f2.m146994a(new C111951q1(dVar, e, y0Var));
            hVar.mo51553F(q2);
        }
        hVar.mo51565P();
        C60667k2 k2Var = (C60667k2) q2;
        hVar.mo51557H(-492369756);
        Object q3 = hVar.mo51606q();
        if (q3 == obj4) {
            q3 = C108500f2.m146994a(new C111948p1(k2Var));
            hVar.mo51553F(q3);
        }
        hVar.mo51565P();
        C60667k2 k2Var2 = (C60667k2) q3;
        hVar.mo51557H(-492369756);
        Object q4 = hVar.mo51606q();
        if (q4 == obj4) {
            q4 = C58017a1.m67173b(1, 0, C54624g.DROP_OLDEST, 2, (Object) null);
            hVar.mo51553F(q4);
        }
        hVar.mo51565P();
        C58085t0 t0Var = (C58085t0) q4;
        float f = this.f335152h.mo163623a() ? 0.0f : this.f335150f;
        C111959t1 t1Var = this.f335153i;
        Object[] objArr = {view, dVar, Float.valueOf(f), t1Var, Boolean.valueOf(C87412m.m108589b(t1Var, C111959t1.f335173h))};
        C111884a2 a2Var = this.f335152h;
        C111959t1 t1Var2 = this.f335153i;
        C111925k1 k1Var = r4;
        C111925k1 k1Var2 = new C111925k1(a2Var, t1Var2, view, dVar, this.f335150f, t0Var, e4, k2Var2, k2Var, e2, y0Var, e3, (C15601d<? super C111925k1>) null);
        C60655g0.m70935f(objArr, k1Var, hVar, 8);
        C65503j b = C111082p.m151476b(C111983i.m152700a(C109845i0.m149273a(jVar, new C111931l1(y0Var)), new C66225m1(t0Var)), false, new C111945o1(k2Var));
        hVar.mo51565P();
        return b;
    }
}
