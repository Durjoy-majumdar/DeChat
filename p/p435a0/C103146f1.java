package p435a0;

import androidx.compose.p002ui.platform.C103618e1;
import androidx.compose.p002ui.platform.C54172f1;
import com.tencent.map.geolocation.sapp.TencentLocation;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import java.util.Map;
import my3.C61595o;
import p560i2.C108319b;
import p560i2.C108321c;
import p560i2.C108329n;
import p560i2.C33177j;
import p560i2.C33181m;
import p560i2.C33183o;
import p631o1.C109827a0;
import p631o1.C109846j;
import p631o1.C109848k;
import p631o1.C109854n0;
import p631o1.C109866r;
import p631o1.C109893x;
import p631o1.C109899z;
import p721v0.C65503j;
import rx3.C13598b0;

/* renamed from: a0.f1 */
public final class C103146f1 extends C54172f1 implements C109866r {

    /* renamed from: e */
    public final C103176n f304281e;

    /* renamed from: f */
    public final boolean f304282f;

    /* renamed from: g */
    public final C32227p<C33181m, C33183o, C33177j> f304283g;

    /* renamed from: h */
    public final Object f304284h;

    /* renamed from: a0.f1$a */
    public static final class C103147a extends C87413o implements C32226l<C109854n0.C109855a, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C103146f1 f304285d;

        /* renamed from: e */
        public final /* synthetic */ int f304286e;

        /* renamed from: f */
        public final /* synthetic */ C109854n0 f304287f;

        /* renamed from: g */
        public final /* synthetic */ int f304288g;

        /* renamed from: h */
        public final /* synthetic */ C109827a0 f304289h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C103147a(C103146f1 f1Var, int i, C109854n0 n0Var, int i2, C109827a0 a0Var) {
            super(1);
            this.f304285d = f1Var;
            this.f304286e = i;
            this.f304287f = n0Var;
            this.f304288g = i2;
            this.f304289h = a0Var;
        }

        public Object invoke(Object obj) {
            C109854n0.C109855a aVar = (C109854n0.C109855a) obj;
            C87412m.m108594g(aVar, "$this$layout");
            C32227p<C33181m, C33183o, C33177j> pVar = this.f304285d.f304283g;
            int i = this.f304286e;
            C109854n0 n0Var = this.f304287f;
            C109854n0.C109855a.m149305e(aVar, this.f304287f, pVar.invoke(new C33181m(C108329n.m146743a(i - n0Var.f328779d, this.f304288g - n0Var.f328780e)), this.f304289h.getLayoutDirection()).f90052a, 0.0f, 2, (Object) null);
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C103146f1(C103176n nVar, boolean z, C32227p<? super C33181m, ? super C33183o, C33177j> pVar, Object obj, C32226l<? super C103618e1, C13598b0> lVar) {
        super(lVar);
        C87412m.m108594g(nVar, TencentLocation.EXTRA_DIRECTION);
        C87412m.m108594g(pVar, "alignmentCallback");
        C87412m.m108594g(obj, "align");
        C87412m.m108594g(lVar, "inspectorInfo");
        this.f304281e = nVar;
        this.f304282f = z;
        this.f304283g = pVar;
        this.f304284h = obj;
    }

    /* renamed from: E */
    public int mo142876E(C109848k kVar, C109846j jVar, int i) {
        return C109866r.C109867a.m149338b(this, kVar, jVar, i);
    }

    /* renamed from: G */
    public C109899z mo142877G(C109827a0 a0Var, C109893x xVar, long j) {
        C109893x xVar2 = xVar;
        C109827a0 a0Var2 = a0Var;
        C87412m.m108594g(a0Var, "$this$measure");
        C87412m.m108594g(xVar2, "measurable");
        C103176n nVar = this.f304281e;
        C103176n nVar2 = C103176n.Vertical;
        int i = 0;
        int j2 = nVar != nVar2 ? 0 : C108319b.m146699j(j);
        C103176n nVar3 = this.f304281e;
        C103176n nVar4 = C103176n.Horizontal;
        if (nVar3 == nVar4) {
            i = C108319b.m146698i(j);
        }
        int i2 = Integer.MAX_VALUE;
        int h = (this.f304281e == nVar2 || !this.f304282f) ? C108319b.m146697h(j) : Integer.MAX_VALUE;
        if (this.f304281e == nVar4 || !this.f304282f) {
            i2 = C108319b.m146696g(j);
        }
        C109854n0 K = xVar2.mo161155K(C108321c.m146704a(j2, h, i, i2));
        int e = C61595o.m72297e(K.f328779d, C108319b.m146699j(j), C108319b.m146697h(j));
        int e2 = C61595o.m72297e(K.f328780e, C108319b.m146698i(j), C108319b.m146696g(j));
        return C109827a0.C109828a.m149247b(a0Var, e, e2, (Map) null, new C103147a(this, e, K, e2, a0Var), 4, (Object) null);
    }

    /* renamed from: S */
    public <R> R mo74969S(R r, C32227p<? super C65503j.C65506c, ? super R, ? extends R> pVar) {
        C87412m.m108594g(pVar, "operation");
        return pVar.invoke(this, r);
    }

    /* renamed from: Y */
    public int mo142878Y(C109848k kVar, C109846j jVar, int i) {
        return C109866r.C109867a.m149339c(this, kVar, jVar, i);
    }

    /* renamed from: a */
    public boolean mo74970a(C32226l<? super C65503j.C65506c, Boolean> lVar) {
        C87412m.m108594g(lVar, "predicate");
        return C65503j.C65506c.C65507a.m77190a(this, lVar);
    }

    /* renamed from: c */
    public <R> R mo74971c(R r, C32227p<? super R, ? super C65503j.C65506c, ? extends R> pVar) {
        C87412m.m108594g(pVar, "operation");
        return pVar.invoke(r, this);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C103146f1)) {
            return false;
        }
        C103146f1 f1Var = (C103146f1) obj;
        return this.f304281e == f1Var.f304281e && this.f304282f == f1Var.f304282f && C87412m.m108589b(this.f304284h, f1Var.f304284h);
    }

    public int hashCode() {
        return (((this.f304281e.hashCode() * 31) + (this.f304282f ? 1231 : 1237)) * 31) + this.f304284h.hashCode();
    }

    /* renamed from: i0 */
    public C65503j mo74972i0(C65503j jVar) {
        C87412m.m108594g(jVar, "other");
        return C65503j.C65505b.m77189a(this, jVar);
    }

    /* renamed from: s0 */
    public int mo142882s0(C109848k kVar, C109846j jVar, int i) {
        return C109866r.C109867a.m149340d(this, kVar, jVar, i);
    }

    /* renamed from: v */
    public int mo142883v(C109848k kVar, C109846j jVar, int i) {
        return C109866r.C109867a.m149337a(this, kVar, jVar, i);
    }
}
