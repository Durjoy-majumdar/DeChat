package ya0;

import androidx.compose.p002ui.platform.C103633i2;
import androidx.compose.p002ui.platform.C103645l0;
import fy3.C32224a;
import fy3.C32228q;
import fy3.C32229r;
import gy3.C87412m;
import gy3.C87413o;
import p004b0.C103941f;
import p175j0.C108501g;
import p175j0.C108504h;
import p175j0.C108508o2;
import p175j0.C24665d;
import p175j0.C33489x1;
import p415q0.C35747b;
import p435a0.C103141f;
import p435a0.C103214y0;
import p560i2.C108322d;
import p560i2.C33183o;
import p582k1.C108797b;
import p582k1.C108801c;
import p631o1.C109863q;
import p631o1.C109895y;
import p658q1.C110269a;
import p721v0.C111294a;
import p721v0.C65503j;
import rx3.C13598b0;
import um0.C22657f;

/* renamed from: ya0.f */
public final class C112428f extends C87413o implements C32229r<C103941f, Integer, C108504h, Integer, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C112408a f336650d;

    /* renamed from: e */
    public final /* synthetic */ C32229r<C66599g, Integer, C108504h, Integer, C13598b0> f336651e;

    /* renamed from: f */
    public final /* synthetic */ C112429h f336652f;

    /* renamed from: g */
    public final /* synthetic */ int f336653g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C112428f(C112408a aVar, C32229r<? super C66599g, ? super Integer, ? super C108504h, ? super Integer, C13598b0> rVar, C112429h hVar, int i) {
        super(4);
        this.f336650d = aVar;
        this.f336651e = rVar;
        this.f336652f = hVar;
        this.f336653g = i;
    }

    /* renamed from: I */
    public Object mo162I(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        C103941f fVar = (C103941f) obj;
        int intValue = ((Number) obj2).intValue();
        C108504h hVar = (C108504h) obj3;
        int intValue2 = ((Number) obj4).intValue();
        C87412m.m108594g(fVar, "$this$items");
        if ((intValue2 & 14) == 0) {
            i = (hVar.mo51619x(fVar) ? 4 : 2) | intValue2;
        } else {
            i = intValue2;
        }
        if ((intValue2 & 112) == 0) {
            i |= hVar.mo51592j(intValue) ? 32 : 16;
        }
        if ((i & 731) != 146 || !hVar.mo51575a()) {
            int i2 = C65503j.f188489K0;
            C65503j n = C103214y0.m136598n(fVar.mo145559a(C108801c.m147665a(C65503j.C65504a.f188490d, this.f336650d, (C108797b) null), 1.0f), (C111294a) null, false, 3, (Object) null);
            C32229r<C66599g, Integer, C108504h, Integer, C13598b0> rVar = this.f336651e;
            C112429h hVar2 = this.f336652f;
            int i3 = this.f336653g;
            hVar.mo51557H(733328855);
            int i4 = C111294a.f333218a;
            C109895y c = C103141f.m136472c(C111294a.C111295a.f333219a, false, hVar, 0);
            hVar.mo51557H(-1323940314);
            C108322d dVar = (C108322d) hVar.mo51598m(C103645l0.f306124e);
            C33183o oVar = (C33183o) hVar.mo51598m(C103645l0.f306130k);
            C103633i2 i2Var = (C103633i2) hVar.mo51598m(C103645l0.f306134o);
            C110269a.f329831D0.getClass();
            C32224a<C110269a> aVar = C110269a.C110270a.f329833b;
            C32228q<C33489x1<C110269a>, C108504h, Integer, C13598b0> a = C109863q.m149330a(n);
            if (hVar.mo51543A() instanceof C24665d) {
                hVar.mo51615v();
                if (hVar.mo51621y()) {
                    hVar.mo51612t(aVar);
                } else {
                    hVar.mo51579c();
                }
                hVar.mo51561L();
                C108508o2.m147049a(hVar, c, C110269a.C110270a.f329836e);
                C108508o2.m147049a(hVar, dVar, C110269a.C110270a.f329835d);
                C108508o2.m147049a(hVar, oVar, C110269a.C110270a.f329837f);
                C108508o2.m147049a(hVar, i2Var, C110269a.C110270a.f329838g);
                hVar.mo51590i();
                ((C35747b) a).invoke(new C33489x1(hVar), hVar, 0);
                hVar.mo51557H(2058660585);
                hVar.mo51557H(-2137368960);
                rVar.mo162I(hVar2, Integer.valueOf(intValue), hVar, Integer.valueOf((i & 112) | ((i3 << 3) & C22657f.CTRL_INDEX)));
                hVar.mo51565P();
                hVar.mo51565P();
                hVar.mo51610s();
                hVar.mo51565P();
                hVar.mo51565P();
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
