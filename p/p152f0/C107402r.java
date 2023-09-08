package p152f0;

import androidx.compose.p002ui.platform.C103633i2;
import androidx.compose.p002ui.platform.C103645l0;
import fy3.C32224a;
import fy3.C32226l;
import fy3.C32227p;
import fy3.C32228q;
import gy3.C87413o;
import p155g0.C107601b0;
import p175j0.C108501g;
import p175j0.C108504h;
import p175j0.C108508o2;
import p175j0.C24665d;
import p175j0.C33489x1;
import p415q0.C35747b;
import p560i2.C108322d;
import p560i2.C33183o;
import p631o1.C109857o;
import p631o1.C109863q;
import p658q1.C110269a;
import p721v0.C65503j;
import p735w1.C111703v;
import rx3.C13598b0;

/* renamed from: f0.r */
public final class C107402r extends C87413o implements C32227p<C108504h, Integer, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C107601b0 f321342d;

    /* renamed from: e */
    public final /* synthetic */ C107394p2 f321343e;

    /* renamed from: f */
    public final /* synthetic */ boolean f321344f;

    /* renamed from: g */
    public final /* synthetic */ boolean f321345g;

    /* renamed from: h */
    public final /* synthetic */ C32226l<C111703v, C13598b0> f321346h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C107402r(C107601b0 b0Var, C107394p2 p2Var, boolean z, boolean z2, C32226l<? super C111703v, C13598b0> lVar) {
        super(2);
        this.f321342d = b0Var;
        this.f321343e = p2Var;
        this.f321344f = z;
        this.f321345g = z2;
        this.f321346h = lVar;
    }

    public Object invoke(Object obj, Object obj2) {
        C109857o oVar;
        C108504h hVar = (C108504h) obj;
        if ((((Number) obj2).intValue() & 11) != 2 || !hVar.mo51575a()) {
            C107398q qVar = new C107398q(this.f321343e, this.f321346h);
            hVar.mo51557H(-1323940314);
            int i = C65503j.f188489K0;
            C65503j.C65504a aVar = C65503j.C65504a.f188490d;
            C108322d dVar = (C108322d) hVar.mo51598m(C103645l0.f306124e);
            C33183o oVar2 = (C33183o) hVar.mo51598m(C103645l0.f306130k);
            C103633i2 i2Var = (C103633i2) hVar.mo51598m(C103645l0.f306134o);
            C110269a.f329831D0.getClass();
            C32224a<C110269a> aVar2 = C110269a.C110270a.f329833b;
            C32228q<C33489x1<C110269a>, C108504h, Integer, C13598b0> a = C109863q.m149330a(aVar);
            if (hVar.mo51543A() instanceof C24665d) {
                hVar.mo51615v();
                if (hVar.mo51621y()) {
                    hVar.mo51612t(aVar2);
                } else {
                    hVar.mo51579c();
                }
                hVar.mo51561L();
                C108508o2.m147049a(hVar, qVar, C110269a.C110270a.f329836e);
                C108508o2.m147049a(hVar, dVar, C110269a.C110270a.f329835d);
                C108508o2.m147049a(hVar, oVar2, C110269a.C110270a.f329837f);
                C108508o2.m147049a(hVar, i2Var, C110269a.C110270a.f329838g);
                hVar.mo51590i();
                boolean z = false;
                ((C35747b) a).invoke(new C33489x1(hVar), hVar, 0);
                hVar.mo51557H(2058660585);
                hVar.mo51557H(1714611517);
                hVar.mo51565P();
                hVar.mo51565P();
                hVar.mo51610s();
                hVar.mo51565P();
                C107601b0 b0Var = this.f321342d;
                if (this.f321343e.mo157811a() == C107346h0.Selection && (oVar = this.f321343e.f321318f) != null && oVar.mo161183y() && this.f321344f) {
                    z = true;
                }
                C107364m.m145496d(b0Var, z, hVar, 8);
                if (this.f321343e.mo157811a() == C107346h0.Cursor && !this.f321345g && this.f321344f) {
                    C107364m.m145495c(this.f321342d, hVar, 8);
                }
            } else {
                C108501g.m147000a();
                throw null;
            }
        } else {
            hVar.mo51581d();
        }
        return C13598b0.f38549a;
    }
}
