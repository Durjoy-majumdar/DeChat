package p759y;

import a14.C0000n0;
import androidx.compose.p002ui.platform.C103612c1;
import c14.C54624g;
import c14.C54625h;
import c14.C54629k;
import fy3.C32224a;
import fy3.C32226l;
import fy3.C32227p;
import fy3.C32228q;
import gy3.C87412m;
import gy3.C87413o;
import p1165z.C112527l;
import p1166z0.C112539e;
import p175j0.C108497e2;
import p175j0.C108500f2;
import p175j0.C108504h;
import p175j0.C60655g0;
import p175j0.C60667k2;
import p175j0.C60690y0;
import p190l1.C109099h0;
import p190l1.C109105k0;
import p190l1.C109106l;
import p190l1.C109111s;
import p721v0.C111299g;
import p721v0.C65503j;
import rx3.C13598b0;
import wx3.C15601d;

/* renamed from: y.x */
public final class C112296x extends C87413o implements C32228q<C65503j, C108504h, Integer, C65503j> {

    /* renamed from: d */
    public final /* synthetic */ C32227p<C108504h, Integer, C112252k0> f336285d;

    /* renamed from: e */
    public final /* synthetic */ C112527l f336286e;

    /* renamed from: f */
    public final /* synthetic */ C32224a<Boolean> f336287f;

    /* renamed from: g */
    public final /* synthetic */ C32226l<C109111s, Boolean> f336288g;

    /* renamed from: h */
    public final /* synthetic */ C32228q<C0000n0, C112539e, C15601d<? super C13598b0>, Object> f336289h;

    /* renamed from: i */
    public final /* synthetic */ C32228q<C0000n0, Float, C15601d<? super C13598b0>, Object> f336290i;

    /* renamed from: j */
    public final /* synthetic */ C112218f0 f336291j;

    /* renamed from: n */
    public final /* synthetic */ boolean f336292n;

    /* renamed from: o */
    public final /* synthetic */ boolean f336293o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C112296x(C32227p<? super C108504h, ? super Integer, ? extends C112252k0> pVar, C112527l lVar, C32224a<Boolean> aVar, C32226l<? super C109111s, Boolean> lVar2, C32228q<? super C0000n0, ? super C112539e, ? super C15601d<? super C13598b0>, ? extends Object> qVar, C32228q<? super C0000n0, ? super Float, ? super C15601d<? super C13598b0>, ? extends Object> qVar2, C112218f0 f0Var, boolean z, boolean z2) {
        super(3);
        this.f336285d = pVar;
        this.f336286e = lVar;
        this.f336287f = aVar;
        this.f336288g = lVar2;
        this.f336289h = qVar;
        this.f336290i = qVar2;
        this.f336291j = f0Var;
        this.f336292n = z;
        this.f336293o = z2;
    }

    public Object invoke(Object obj, Object obj2, Object obj3) {
        C108504h hVar = (C108504h) obj2;
        ((Number) obj3).intValue();
        C87412m.m108594g((C65503j) obj, "$this$composed");
        hVar.mo51557H(-1487259950);
        C112252k0 invoke = this.f336285d.invoke(hVar, 0);
        hVar.mo51557H(-492369756);
        Object q = hVar.mo51606q();
        int i = C108504h.f324828a;
        Object obj4 = C108504h.C60656a.f172772a;
        if (q == obj4) {
            q = C108500f2.m146996c((Object) null, (C108497e2) null, 2, (Object) null);
            hVar.mo51553F(q);
        }
        hVar.mo51565P();
        C60690y0 y0Var = (C60690y0) q;
        C112527l lVar = this.f336286e;
        C60655g0.m70930a(lVar, new C112287u(y0Var, lVar), hVar, 0);
        hVar.mo51557H(-492369756);
        Object q2 = hVar.mo51606q();
        if (q2 == obj4) {
            q2 = C54629k.m61479a(Integer.MAX_VALUE, (C54624g) null, (C32226l) null, 6, (Object) null);
            hVar.mo51553F(q2);
        }
        hVar.mo51565P();
        C54625h hVar2 = (C54625h) q2;
        C60667k2<T> e = C108500f2.m146998e(this.f336287f, hVar, 0);
        C60667k2<T> e2 = C108500f2.m146998e(this.f336288g, hVar, 0);
        C60655g0.m70932c(invoke, new C112288v(hVar2, invoke, C108500f2.m146998e(new C112267o(this.f336289h, this.f336290i, y0Var, this.f336286e), hVar, 0), (C15601d<? super C112288v>) null), hVar, 0);
        int i2 = C65503j.f188489K0;
        C65503j.C65504a aVar = C65503j.C65504a.f188490d;
        Object[] objArr = {this.f336291j, Boolean.valueOf(this.f336292n), Boolean.valueOf(this.f336293o)};
        C112291w wVar = new C112291w(this.f336292n, e2, e, this.f336291j, hVar2, this.f336293o, (C15601d<? super C112291w>) null);
        C109106l lVar2 = C109099h0.f326691a;
        C65503j a = C111299g.m151786a(aVar, C103612c1.f306063a, new C109105k0(objArr, wVar));
        hVar.mo51565P();
        return a;
    }
}
