package ca0;

import androidx.compose.p002ui.platform.C103633i2;
import androidx.compose.p002ui.platform.C103645l0;
import fy3.C32224a;
import fy3.C32227p;
import fy3.C32228q;
import gy3.C87413o;
import p175j0.C108501g;
import p175j0.C108504h;
import p175j0.C108508o2;
import p175j0.C24665d;
import p175j0.C33489x1;
import p415q0.C35747b;
import p435a0.C103111a;
import p435a0.C103129b1;
import p435a0.C103199s0;
import p435a0.C103203t0;
import p435a0.C103206u0;
import p436a1.C103272w;
import p560i2.C108322d;
import p560i2.C33183o;
import p631o1.C109863q;
import p631o1.C109895y;
import p658q1.C110269a;
import p721v0.C111294a;
import p721v0.C65503j;
import rx3.C13598b0;

/* renamed from: ca0.m */
public final class C104350m extends C87413o implements C32227p<C108504h, Integer, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ long f308967d;

    /* renamed from: e */
    public final /* synthetic */ int f308968e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C104350m(long j, int i) {
        super(2);
        this.f308967d = j;
        this.f308968e = i;
    }

    public Object invoke(Object obj, Object obj2) {
        C108504h hVar = (C108504h) obj;
        if ((((Number) obj2).intValue() & 11) != 2 || !hVar.mo51575a()) {
            long j = this.f308967d;
            int i = this.f308968e;
            hVar.mo51557H(693286680);
            int i2 = C65503j.f188489K0;
            C65503j.C65504a aVar = C65503j.C65504a.f188490d;
            C103111a.C103115d dVar = C103111a.f304235b;
            int i3 = C111294a.f333218a;
            C109895y a = C103199s0.m136579a(dVar, C111294a.C111295a.f333226h, hVar, 0);
            hVar.mo51557H(-1323940314);
            C108322d dVar2 = (C108322d) hVar.mo51598m(C103645l0.f306124e);
            C33183o oVar = (C33183o) hVar.mo51598m(C103645l0.f306130k);
            C103633i2 i2Var = (C103633i2) hVar.mo51598m(C103645l0.f306134o);
            C110269a.f329831D0.getClass();
            C32224a<C110269a> aVar2 = C110269a.C110270a.f329833b;
            C32228q<C33489x1<C110269a>, C108504h, Integer, C13598b0> a2 = C109863q.m149330a(aVar);
            if (hVar.mo51543A() instanceof C24665d) {
                hVar.mo51615v();
                if (hVar.mo51621y()) {
                    hVar.mo51612t(aVar2);
                } else {
                    hVar.mo51579c();
                }
                hVar.mo51561L();
                C108508o2.m147049a(hVar, a, C110269a.C110270a.f329836e);
                C108508o2.m147049a(hVar, dVar2, C110269a.C110270a.f329835d);
                C108508o2.m147049a(hVar, oVar, C110269a.C110270a.f329837f);
                C108508o2.m147049a(hVar, i2Var, C110269a.C110270a.f329838g);
                hVar.mo51590i();
                ((C35747b) a2).invoke(new C33489x1(hVar), hVar, 0);
                hVar.mo51557H(2058660585);
                hVar.mo51557H(-678309503);
                C103206u0 u0Var = C103206u0.f304394a;
                long j2 = C103272w.f304514f;
                C108504h hVar2 = hVar;
                C104335e.m139320c(j, j2, hVar2, ((i >> 6) & 14) | 48);
                C103129b1.m136432a(C103203t0.C103204a.m136583a(u0Var, aVar, 1.0f, false, 2, (Object) null), hVar, 0);
                C104335e.m139320c(j2, j, hVar2, ((i >> 3) & 112) | 6);
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
