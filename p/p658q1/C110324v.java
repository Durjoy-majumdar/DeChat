package p658q1;

import fy3.C32226l;
import gy3.C87412m;
import p175j0.C108497e2;
import p175j0.C108500f2;
import p175j0.C60690y0;
import p436a1.C103224b0;
import p436a1.C103234g;
import p436a1.C103241i0;
import p436a1.C103262s;
import p436a1.C103272w;
import p560i2.C33177j;
import p560i2.C33183o;
import p631o1.C109827a0;
import p631o1.C109847j0;
import p631o1.C109854n0;
import p631o1.C109866r;
import p631o1.C61911a;
import p631o1.C61919i;
import rx3.C13598b0;

/* renamed from: q1.v */
public final class C110324v extends C110311s {

    /* renamed from: L */
    public static final C103241i0 f330025L;

    /* renamed from: H */
    public C110311s f330026H;

    /* renamed from: I */
    public C109866r f330027I;

    /* renamed from: J */
    public boolean f330028J;

    /* renamed from: K */
    public C60690y0<C109866r> f330029K;

    static {
        C103234g gVar = new C103234g();
        int i = C103272w.f304516h;
        gVar.mo142989c(C103272w.f304513e);
        gVar.mo143008t(1.0f);
        gVar.mo143009u(1);
        f330025L = gVar;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C110324v(C110311s sVar, C109866r rVar) {
        super(sVar.f329972h);
        C87412m.m108594g(sVar, "wrapped");
        C87412m.m108594g(rVar, "modifier");
        this.f330026H = sVar;
        this.f330027I = rVar;
    }

    /* renamed from: G */
    public int mo161154G(int i) {
        return mo161777b1().mo142882s0(mo161696H0(), this.f330026H, i);
    }

    /* renamed from: H0 */
    public C109827a0 mo161696H0() {
        return this.f330026H.mo161696H0();
    }

    /* renamed from: K */
    public C109854n0 mo161155K(long j) {
        mo161171s0(j);
        mo161754W0(this.f330027I.mo142877G(mo161696H0(), this.f330026H, j));
        C110281b0 b0Var = this.f329971B;
        if (b0Var != null) {
            b0Var.mo144763i(this.f328781f);
        }
        mo161751S0();
        return this;
    }

    /* renamed from: K0 */
    public C110311s mo161744K0() {
        return this.f330026H;
    }

    /* renamed from: S */
    public int mo161156S(int i) {
        return mo161777b1().mo142883v(mo161696H0(), this.f330026H, i);
    }

    /* renamed from: T0 */
    public void mo161752T0() {
        super.mo161752T0();
        C60690y0<C109866r> y0Var = this.f330029K;
        if (y0Var != null) {
            y0Var.setValue(this.f330027I);
        }
    }

    /* renamed from: U0 */
    public void mo161698U0(C103262s sVar) {
        C87412m.m108594g(sVar, "canvas");
        this.f330026H.mo161736B0(sVar);
        if (C110310r.m150081a(this.f329972h).getShowLayoutBounds()) {
            mo161737C0(sVar, f330025L);
        }
    }

    /* renamed from: V */
    public int mo161157V(int i) {
        return mo161777b1().mo142878Y(mo161696H0(), this.f330026H, i);
    }

    /* renamed from: Y */
    public int mo161158Y(int i) {
        return mo161777b1().mo142876E(mo161696H0(), this.f330026H, i);
    }

    /* renamed from: b1 */
    public final C109866r mo161777b1() {
        C60690y0<C109866r> y0Var = this.f330029K;
        if (y0Var == null) {
            y0Var = C108500f2.m146996c(this.f330027I, (C108497e2) null, 2, (Object) null);
        }
        this.f330029K = y0Var;
        return y0Var.getValue();
    }

    /* renamed from: c1 */
    public void mo161778c1() {
        C110281b0 b0Var = this.f329971B;
        if (b0Var != null) {
            b0Var.invalidate();
        }
        this.f330026H.f329973i = this;
    }

    /* renamed from: j0 */
    public void mo161160j0(long j, float f, C32226l<? super C103224b0, C13598b0> lVar) {
        super.mo161160j0(j, f, lVar);
        C110311s sVar = this.f329973i;
        boolean z = true;
        if (sVar == null || !sVar.f329984w) {
            z = false;
        }
        if (!z) {
            for (T t = this.f329986y[4]; t != null; t = t.f329963f) {
                ((C109847j0) ((C110302j0) t).f329962e).mo145809y(this);
            }
            C109854n0.C109855a.C109856a aVar = C109854n0.C109855a.f328783a;
            int i = (int) (this.f328781f >> 32);
            C33183o layoutDirection = mo161696H0().getLayoutDirection();
            aVar.getClass();
            int i2 = C109854n0.C109855a.f328785c;
            C33183o oVar = C109854n0.C109855a.f328784b;
            C109854n0.C109855a.f328785c = i;
            C109854n0.C109855a.f328784b = layoutDirection;
            mo161741G0().mo145549b();
            C109854n0.C109855a.f328785c = i2;
            C109854n0.C109855a.f328784b = oVar;
        }
    }

    /* renamed from: w0 */
    public int mo161699w0(C61911a aVar) {
        C87412m.m108594g(aVar, "alignmentLine");
        if (mo161741G0().mo145550d().containsKey(aVar)) {
            Integer num = mo161741G0().mo145550d().get(aVar);
            if (num != null) {
                return num.intValue();
            }
            return Integer.MIN_VALUE;
        }
        int F0 = this.f330026H.mo161740F0(aVar);
        if (F0 == Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        this.f329984w = true;
        mo161160j0(this.f329982u, this.f329983v, this.f329975n);
        this.f329984w = false;
        return F0 + (aVar instanceof C61919i ? C33177j.m39962a(this.f330026H.f329982u) : (int) (this.f330026H.f329982u >> 32));
    }
}
