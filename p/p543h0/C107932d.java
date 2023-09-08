package p543h0;

import androidx.compose.p002ui.platform.C103612c1;
import androidx.compose.p002ui.platform.C103633i2;
import androidx.compose.p002ui.platform.C103645l0;
import com.tencent.wxmm.v2helper;
import fy3.C32224a;
import fy3.C32227p;
import fy3.C32228q;
import gy3.C87412m;
import gy3.C87413o;
import p175j0.C108501g;
import p175j0.C108504h;
import p175j0.C108508o2;
import p175j0.C24665d;
import p175j0.C33489x1;
import p415q0.C35747b;
import p435a0.C103111a;
import p435a0.C103177n0;
import p435a0.C103182p0;
import p435a0.C103199s0;
import p435a0.C103203t0;
import p435a0.C103206u0;
import p435a0.C103214y0;
import p560i2.C108322d;
import p560i2.C33183o;
import p631o1.C109863q;
import p631o1.C109895y;
import p658q1.C110269a;
import p721v0.C111294a;
import p721v0.C65503j;
import rx3.C13598b0;

/* renamed from: h0.d */
public final class C107932d extends C87413o implements C32227p<C108504h, Integer, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C103177n0 f323179d;

    /* renamed from: e */
    public final /* synthetic */ C32228q<C103203t0, C108504h, Integer, C13598b0> f323180e;

    /* renamed from: f */
    public final /* synthetic */ int f323181f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C107932d(C103177n0 n0Var, C32228q<? super C103203t0, ? super C108504h, ? super Integer, C13598b0> qVar, int i) {
        super(2);
        this.f323179d = n0Var;
        this.f323180e = qVar;
        this.f323181f = i;
    }

    public Object invoke(Object obj, Object obj2) {
        C108504h hVar = (C108504h) obj;
        if ((((Number) obj2).intValue() & 11) != 2 || !hVar.mo51575a()) {
            int i = C65503j.f188489K0;
            C65503j d = C103214y0.m136588d(C65503j.C65504a.f188490d, C107925b.f323141b, C107925b.f323142c);
            C103177n0 n0Var = this.f323179d;
            C87412m.m108594g(d, "<this>");
            C87412m.m108594g(n0Var, "paddingValues");
            C65503j i0 = d.mo74972i0(new C103182p0(n0Var, C103612c1.f306063a));
            C103111a.C103116e eVar = C103111a.f304239f;
            int i2 = C111294a.f333218a;
            C111294a.C37634c cVar = C111294a.C111295a.f333227i;
            C32228q<C103203t0, C108504h, Integer, C13598b0> qVar = this.f323180e;
            int i3 = ((this.f323181f >> 18) & 7168) | v2helper.EMethodSetSendToNetworkOn;
            hVar.mo51557H(693286680);
            int i4 = i3 >> 3;
            C109895y a = C103199s0.m136579a(eVar, cVar, hVar, (i4 & 112) | (i4 & 14));
            hVar.mo51557H(-1323940314);
            C108322d dVar = (C108322d) hVar.mo51598m(C103645l0.f306124e);
            C33183o oVar = (C33183o) hVar.mo51598m(C103645l0.f306130k);
            C103633i2 i2Var = (C103633i2) hVar.mo51598m(C103645l0.f306134o);
            C110269a.f329831D0.getClass();
            C32224a<C110269a> aVar = C110269a.C110270a.f329833b;
            C32228q<C33489x1<C110269a>, C108504h, Integer, C13598b0> a2 = C109863q.m149330a(i0);
            int i5 = ((((i3 << 3) & 112) << 9) & 7168) | 6;
            if (hVar.mo51543A() instanceof C24665d) {
                hVar.mo51615v();
                if (hVar.mo51621y()) {
                    hVar.mo51612t(aVar);
                } else {
                    hVar.mo51579c();
                }
                hVar.mo51561L();
                C108508o2.m147049a(hVar, a, C110269a.C110270a.f329836e);
                C108508o2.m147049a(hVar, dVar, C110269a.C110270a.f329835d);
                C108508o2.m147049a(hVar, oVar, C110269a.C110270a.f329837f);
                C108508o2.m147049a(hVar, i2Var, C110269a.C110270a.f329838g);
                hVar.mo51590i();
                ((C35747b) a2).invoke(new C33489x1(hVar), hVar, Integer.valueOf((i5 >> 3) & 112));
                hVar.mo51557H(2058660585);
                hVar.mo51557H(-678309503);
                if (((i5 >> 9) & 14 & 11) != 2 || !hVar.mo51575a()) {
                    qVar.invoke(C103206u0.f304394a, hVar, Integer.valueOf(((i3 >> 6) & 112) | 6));
                } else {
                    hVar.mo51581d();
                }
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
