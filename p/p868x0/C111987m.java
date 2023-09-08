package p868x0;

import androidx.compose.p002ui.platform.C103618e1;
import androidx.compose.p002ui.platform.C54172f1;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import iy3.C60641c;
import java.util.Map;
import p1104d1.C106969c;
import p1166z0.C112545k;
import p1166z0.C112546l;
import p436a1.C103274x;
import p560i2.C108319b;
import p560i2.C108321c;
import p560i2.C108329n;
import p560i2.C33177j;
import p631o1.C109827a0;
import p631o1.C109836f;
import p631o1.C109846j;
import p631o1.C109848k;
import p631o1.C109854n0;
import p631o1.C109866r;
import p631o1.C109877t0;
import p631o1.C109893x;
import p631o1.C109899z;
import p721v0.C111294a;
import p721v0.C65503j;
import p835c1.C54601d;
import rx3.C13598b0;

/* renamed from: x0.m */
public final class C111987m extends C54172f1 implements C109866r, C111982h {

    /* renamed from: e */
    public final C106969c f335237e;

    /* renamed from: f */
    public final boolean f335238f;

    /* renamed from: g */
    public final C111294a f335239g;

    /* renamed from: h */
    public final C109836f f335240h;

    /* renamed from: i */
    public final float f335241i;

    /* renamed from: j */
    public final C103274x f335242j;

    /* renamed from: x0.m$a */
    public static final class C111988a extends C87413o implements C32226l<C109854n0.C109855a, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C109854n0 f335243d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C111988a(C109854n0 n0Var) {
            super(1);
            this.f335243d = n0Var;
        }

        public Object invoke(Object obj) {
            C109854n0.C109855a aVar = (C109854n0.C109855a) obj;
            C87412m.m108594g(aVar, "$this$layout");
            C109854n0.C109855a.m149306f(aVar, this.f335243d, 0, 0, 0.0f, 4, (Object) null);
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C111987m(C106969c cVar, boolean z, C111294a aVar, C109836f fVar, float f, C103274x xVar, C32226l<? super C103618e1, C13598b0> lVar) {
        super(lVar);
        C87412m.m108594g(cVar, "painter");
        C87412m.m108594g(aVar, "alignment");
        C87412m.m108594g(fVar, "contentScale");
        C87412m.m108594g(lVar, "inspectorInfo");
        this.f335237e = cVar;
        this.f335238f = z;
        this.f335239g = aVar;
        this.f335240h = fVar;
        this.f335241i = f;
        this.f335242j = xVar;
    }

    /* renamed from: E */
    public int mo142876E(C109848k kVar, C109846j jVar, int i) {
        C87412m.m108594g(kVar, "<this>");
        C87412m.m108594g(jVar, "measurable");
        if (!mo163647b()) {
            return jVar.mo161158Y(i);
        }
        long f = mo163651f(C108321c.m146705b(0, 0, 0, i, 7, (Object) null));
        return Math.max(C108319b.m146699j(f), jVar.mo161158Y(i));
    }

    /* renamed from: G */
    public C109899z mo142877G(C109827a0 a0Var, C109893x xVar, long j) {
        C87412m.m108594g(a0Var, "$this$measure");
        C87412m.m108594g(xVar, "measurable");
        C109854n0 K = xVar.mo161155K(mo163651f(j));
        return C109827a0.C109828a.m149247b(a0Var, K.f328779d, K.f328780e, (Map) null, new C111988a(K), 4, (Object) null);
    }

    /* renamed from: S */
    public <R> R mo74969S(R r, C32227p<? super C65503j.C65506c, ? super R, ? extends R> pVar) {
        C87412m.m108594g(pVar, "operation");
        return pVar.invoke(this, r);
    }

    /* renamed from: V */
    public void mo90316V(C54601d dVar) {
        long j;
        C87412m.m108594g(dVar, "<this>");
        long h = this.f335237e.mo84458h();
        long a = C112546l.m153761a(mo163649e(h) ? C112545k.m153758d(h) : C112545k.m153758d(dVar.mo145819e()), mo163648d(h) ? C112545k.m153756b(h) : C112545k.m153756b(dVar.mo145819e()));
        boolean z = true;
        if (!(C112545k.m153758d(dVar.mo145819e()) == 0.0f)) {
            if (C112545k.m153756b(dVar.mo145819e()) != 0.0f) {
                z = false;
            }
            if (!z) {
                j = C109877t0.m149366b(a, this.f335240h.mo161161a(a, dVar.mo145819e()));
                long j2 = j;
                long a2 = this.f335239g.mo61256a(C108329n.m146743a(C60641c.m70921b(C112545k.m153758d(j2)), C60641c.m70921b(C112545k.m153756b(j2))), C108329n.m146743a(C60641c.m70921b(C112545k.m153758d(dVar.mo145819e())), C60641c.m70921b(C112545k.m153756b(dVar.mo145819e()))), dVar.getLayoutDirection());
                float f = (float) ((int) (a2 >> 32));
                float a3 = (float) C33177j.m39962a(a2);
                dVar.mo145815B().mo145836j().mo145841d(f, a3);
                this.f335237e.mo157379g(dVar, j2, this.f335241i, this.f335242j);
                dVar.mo145815B().mo145836j().mo145841d(-f, -a3);
                dVar.mo75508h0();
            }
        }
        int i = C112545k.f336975d;
        j = C112545k.f336973b;
        long j25 = j;
        long a25 = this.f335239g.mo61256a(C108329n.m146743a(C60641c.m70921b(C112545k.m153758d(j25)), C60641c.m70921b(C112545k.m153756b(j25))), C108329n.m146743a(C60641c.m70921b(C112545k.m153758d(dVar.mo145819e())), C60641c.m70921b(C112545k.m153756b(dVar.mo145819e()))), dVar.getLayoutDirection());
        float f2 = (float) ((int) (a25 >> 32));
        float a35 = (float) C33177j.m39962a(a25);
        dVar.mo145815B().mo145836j().mo145841d(f2, a35);
        this.f335237e.mo157379g(dVar, j25, this.f335241i, this.f335242j);
        dVar.mo145815B().mo145836j().mo145841d(-f2, -a35);
        dVar.mo75508h0();
    }

    /* renamed from: Y */
    public int mo142878Y(C109848k kVar, C109846j jVar, int i) {
        C87412m.m108594g(kVar, "<this>");
        C87412m.m108594g(jVar, "measurable");
        if (!mo163647b()) {
            return jVar.mo161157V(i);
        }
        long f = mo163651f(C108321c.m146705b(0, i, 0, 0, 13, (Object) null));
        return Math.max(C108319b.m146698i(f), jVar.mo161157V(i));
    }

    /* renamed from: a */
    public boolean mo74970a(C32226l<? super C65503j.C65506c, Boolean> lVar) {
        C87412m.m108594g(lVar, "predicate");
        return C65503j.C65506c.C65507a.m77190a(this, lVar);
    }

    /* renamed from: b */
    public final boolean mo163647b() {
        if (this.f335238f) {
            long h = this.f335237e.mo84458h();
            int i = C112545k.f336975d;
            if (h != C112545k.f336974c) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    public <R> R mo74971c(R r, C32227p<? super R, ? super C65503j.C65506c, ? extends R> pVar) {
        C87412m.m108594g(pVar, "operation");
        return pVar.invoke(r, this);
    }

    /* renamed from: d */
    public final boolean mo163648d(long j) {
        int i = C112545k.f336975d;
        if (!C112545k.m153755a(j, C112545k.f336974c)) {
            float b = C112545k.m153756b(j);
            if (!Float.isInfinite(b) && !Float.isNaN(b)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: e */
    public final boolean mo163649e(long j) {
        int i = C112545k.f336975d;
        if (!C112545k.m153755a(j, C112545k.f336974c)) {
            float d = C112545k.m153758d(j);
            if (!Float.isInfinite(d) && !Float.isNaN(d)) {
                return true;
            }
        }
        return false;
    }

    public boolean equals(Object obj) {
        C111987m mVar = obj instanceof C111987m ? (C111987m) obj : null;
        if (mVar == null || !C87412m.m108589b(this.f335237e, mVar.f335237e) || this.f335238f != mVar.f335238f || !C87412m.m108589b(this.f335239g, mVar.f335239g) || !C87412m.m108589b(this.f335240h, mVar.f335240h)) {
            return false;
        }
        return ((this.f335241i > mVar.f335241i ? 1 : (this.f335241i == mVar.f335241i ? 0 : -1)) == 0) && C87412m.m108589b(this.f335242j, mVar.f335242j);
    }

    /* renamed from: f */
    public final long mo163651f(long j) {
        boolean z = true;
        boolean z2 = C108319b.m146693d(j) && C108319b.m146692c(j);
        boolean z3 = C108319b.m146695f(j) && C108319b.m146694e(j);
        if ((mo163647b() || !z2) && !z3) {
            long h = this.f335237e.mo84458h();
            long a = C112546l.m153761a((float) C108321c.m146708e(j, mo163649e(h) ? C60641c.m70921b(C112545k.m153758d(h)) : C108319b.m146699j(j)), (float) C108321c.m146707d(j, mo163648d(h) ? C60641c.m70921b(C112545k.m153756b(h)) : C108319b.m146698i(j)));
            if (mo163647b()) {
                long a2 = C112546l.m153761a(!mo163649e(this.f335237e.mo84458h()) ? C112545k.m153758d(a) : C112545k.m153758d(this.f335237e.mo84458h()), !mo163648d(this.f335237e.mo84458h()) ? C112545k.m153756b(a) : C112545k.m153756b(this.f335237e.mo84458h()));
                if (!(C112545k.m153758d(a) == 0.0f)) {
                    if (C112545k.m153756b(a) != 0.0f) {
                        z = false;
                    }
                    if (!z) {
                        a = C109877t0.m149366b(a2, this.f335240h.mo161161a(a2, a));
                    }
                }
                a = C112545k.f336973b;
            }
            return C108319b.m146690a(j, C108321c.m146708e(j, C60641c.m70921b(C112545k.m153758d(a))), 0, C108321c.m146707d(j, C60641c.m70921b(C112545k.m153756b(a))), 0, 10, (Object) null);
        }
        return C108319b.m146690a(j, C108319b.m146697h(j), 0, C108319b.m146696g(j), 0, 10, (Object) null);
    }

    public int hashCode() {
        int hashCode = ((((((((this.f335237e.hashCode() * 31) + (this.f335238f ? 1231 : 1237)) * 31) + this.f335239g.hashCode()) * 31) + this.f335240h.hashCode()) * 31) + Float.floatToIntBits(this.f335241i)) * 31;
        C103274x xVar = this.f335242j;
        return hashCode + (xVar != null ? xVar.hashCode() : 0);
    }

    /* renamed from: i0 */
    public C65503j mo74972i0(C65503j jVar) {
        C87412m.m108594g(jVar, "other");
        return C65503j.C65505b.m77189a(this, jVar);
    }

    /* renamed from: s0 */
    public int mo142882s0(C109848k kVar, C109846j jVar, int i) {
        C87412m.m108594g(kVar, "<this>");
        C87412m.m108594g(jVar, "measurable");
        if (!mo163647b()) {
            return jVar.mo161154G(i);
        }
        long f = mo163651f(C108321c.m146705b(0, 0, 0, i, 7, (Object) null));
        return Math.max(C108319b.m146699j(f), jVar.mo161154G(i));
    }

    public String toString() {
        return "PainterModifier(painter=" + this.f335237e + ", sizeToIntrinsics=" + this.f335238f + ", alignment=" + this.f335239g + ", alpha=" + this.f335241i + ", colorFilter=" + this.f335242j + ')';
    }

    /* renamed from: v */
    public int mo142883v(C109848k kVar, C109846j jVar, int i) {
        C87412m.m108594g(kVar, "<this>");
        C87412m.m108594g(jVar, "measurable");
        if (!mo163647b()) {
            return jVar.mo161156S(i);
        }
        long f = mo163651f(C108321c.m146705b(0, i, 0, 0, 13, (Object) null));
        return Math.max(C108319b.m146698i(f), jVar.mo161156S(i));
    }
}
