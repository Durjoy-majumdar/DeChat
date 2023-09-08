package ca0;

import androidx.compose.p002ui.platform.C103612c1;
import androidx.compose.p002ui.platform.C103633i2;
import androidx.compose.p002ui.platform.C103645l0;
import com.tencent.p014mm.C0966R;
import fy3.C32224a;
import fy3.C32227p;
import fy3.C32228q;
import gy3.C87412m;
import gy3.C87413o;
import p1104d1.C106969c;
import p175j0.C108501g;
import p175j0.C108504h;
import p175j0.C108508o2;
import p175j0.C24665d;
import p175j0.C33489x1;
import p267x.C111897d1;
import p415q0.C35747b;
import p435a0.C103138e;
import p435a0.C103141f;
import p435a0.C103214y0;
import p436a1.C103274x;
import p560i2.C108322d;
import p560i2.C33183o;
import p631o1.C109836f;
import p631o1.C109863q;
import p631o1.C109895y;
import p658q1.C110269a;
import p721v0.C111294a;
import p721v0.C65503j;
import rx3.C13598b0;
import ta0.C110954a;

/* renamed from: ca0.y */
public final class C104358y extends C87413o implements C32227p<C108504h, Integer, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C104344e0 f309005d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C104358y(C104344e0 e0Var) {
        super(2);
        this.f309005d = e0Var;
    }

    public Object invoke(Object obj, Object obj2) {
        C108504h hVar = (C108504h) obj;
        if ((((Number) obj2).intValue() & 11) != 2 || !hVar.mo51575a()) {
            int i = C65503j.f188489K0;
            C65503j.C65504a aVar = C65503j.C65504a.f188490d;
            C65503j f = C103214y0.m136590f(aVar, 0.0f, 1, (Object) null);
            C104344e0 e0Var = this.f309005d;
            hVar.mo51557H(733328855);
            int i2 = C111294a.f333218a;
            C109895y c = C103141f.m136472c(C111294a.C111295a.f333219a, false, hVar, 0);
            hVar.mo51557H(-1323940314);
            C108322d dVar = (C108322d) hVar.mo51598m(C103645l0.f306124e);
            C33183o oVar = (C33183o) hVar.mo51598m(C103645l0.f306130k);
            C103633i2 i2Var = (C103633i2) hVar.mo51598m(C103645l0.f306134o);
            C110269a.f329831D0.getClass();
            C32224a<C110269a> aVar2 = C110269a.C110270a.f329833b;
            C32228q<C33489x1<C110269a>, C108504h, Integer, C13598b0> a = C109863q.m149330a(f);
            if (hVar.mo51543A() instanceof C24665d) {
                hVar.mo51615v();
                if (hVar.mo51621y()) {
                    hVar.mo51612t(aVar2);
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
                C106969c a2 = C110954a.m151253a(C0966R.raw.arrow_down, e0Var.f308946e, hVar, 0);
                float f2 = (float) 8;
                C65503j k = C103214y0.m136595k(aVar, ((float) 2) * f2, ((float) 1) * f2);
                C111294a aVar3 = C111294a.C111295a.f333222d;
                C87412m.m108594g(k, "<this>");
                C111897d1.m152617a(a2, "close", k.mo74972i0(new C103138e(aVar3, false, C103612c1.f306063a)), (C111294a) null, (C109836f) null, 0.0f, (C103274x) null, hVar, 56, 120);
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
