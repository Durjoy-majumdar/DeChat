package p152f0;

import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import iy3.C60641c;
import java.util.List;
import p560i2.C33181m;
import p560i2.C33183o;
import p631o1.C109827a0;
import p631o1.C109846j;
import p631o1.C109848k;
import p631o1.C109854n0;
import p631o1.C109893x;
import p631o1.C109895y;
import p631o1.C109899z;
import p631o1.C61912b;
import p735w1.C111688e;
import p735w1.C111703v;
import rx3.C13598b0;
import rx3.C13604l;
import sx3.C90364q0;

/* renamed from: f0.q */
public final class C107398q implements C109895y {

    /* renamed from: a */
    public final /* synthetic */ C107394p2 f321333a;

    /* renamed from: b */
    public final /* synthetic */ C32226l<C111703v, C13598b0> f321334b;

    /* renamed from: f0.q$a */
    public static final class C107399a extends C87413o implements C32226l<C109854n0.C109855a, C13598b0> {

        /* renamed from: d */
        public static final C107399a f321335d = new C107399a();

        public C107399a() {
            super(1);
        }

        public Object invoke(Object obj) {
            C87412m.m108594g((C109854n0.C109855a) obj, "$this$layout");
            return C13598b0.f38549a;
        }
    }

    public C107398q(C107394p2 p2Var, C32226l<? super C111703v, C13598b0> lVar) {
        this.f321333a = p2Var;
        this.f321334b = lVar;
    }

    /* renamed from: a */
    public int mo142884a(C109848k kVar, List<? extends C109846j> list, int i) {
        return C109895y.C109896a.m149387c(this, kVar, list, i);
    }

    /* renamed from: b */
    public int mo142885b(C109848k kVar, List<? extends C109846j> list, int i) {
        C87412m.m108594g(kVar, "<this>");
        C87412m.m108594g(list, "measurables");
        this.f321333a.f321313a.mo157804b(kVar.getLayoutDirection());
        C111688e eVar = this.f321333a.f321313a.f321176i;
        if (eVar != null) {
            return (int) ((float) Math.ceil((double) eVar.mo157585a()));
        }
        throw new IllegalStateException("layoutIntrinsics must be called first");
    }

    /* renamed from: c */
    public int mo142886c(C109848k kVar, List<? extends C109846j> list, int i) {
        return C109895y.C109896a.m149385a(this, kVar, list, i);
    }

    /* renamed from: d */
    public C109899z mo142887d(C109827a0 a0Var, List<? extends C109893x> list, long j) {
        C87412m.m108594g(a0Var, "$this$measure");
        C87412m.m108594g(list, "measurables");
        C107347h1 h1Var = this.f321333a.f321313a;
        C33183o layoutDirection = a0Var.getLayoutDirection();
        C107401q2 q2Var = this.f321333a.f321319g;
        C111703v vVar = null;
        C111703v vVar2 = q2Var != null ? q2Var.f321339a : null;
        C87412m.m108594g(h1Var, "textDelegate");
        C87412m.m108594g(layoutDirection, "layoutDirection");
        C111703v a = h1Var.mo157803a(j, layoutDirection, vVar2);
        Integer valueOf = Integer.valueOf((int) (a.f334373c >> 32));
        Integer valueOf2 = Integer.valueOf(C33181m.m39966b(a.f334373c));
        int intValue = valueOf.intValue();
        int intValue2 = valueOf2.intValue();
        C107401q2 q2Var2 = this.f321333a.f321319g;
        if (q2Var2 != null) {
            vVar = q2Var2.f321339a;
        }
        if (!C87412m.m108589b(vVar, a)) {
            this.f321333a.f321319g = new C107401q2(a);
            this.f321334b.invoke(a);
        }
        return a0Var.mo144573t(intValue, intValue2, C90364q0.m113147f(new C13604l(C61912b.f176019a, Integer.valueOf(C60641c.m70921b(a.f334374d))), new C13604l(C61912b.f176020b, Integer.valueOf(C60641c.m70921b(a.f334375e)))), C107399a.f321335d);
    }

    /* renamed from: e */
    public int mo142888e(C109848k kVar, List<? extends C109846j> list, int i) {
        return C109895y.C109896a.m149388d(this, kVar, list, i);
    }
}
