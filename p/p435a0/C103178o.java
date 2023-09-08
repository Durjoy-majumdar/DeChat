package p435a0;

import androidx.compose.p002ui.platform.C103618e1;
import androidx.compose.p002ui.platform.C54172f1;
import com.tencent.map.geolocation.sapp.TencentLocation;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import iy3.C60641c;
import java.util.Map;
import my3.C61595o;
import p560i2.C108319b;
import p560i2.C108321c;
import p631o1.C109827a0;
import p631o1.C109846j;
import p631o1.C109848k;
import p631o1.C109854n0;
import p631o1.C109866r;
import p631o1.C109893x;
import p631o1.C109899z;
import p721v0.C65503j;
import rx3.C13598b0;

/* renamed from: a0.o */
public final class C103178o extends C54172f1 implements C109866r {

    /* renamed from: e */
    public final C103176n f304340e;

    /* renamed from: f */
    public final float f304341f;

    /* renamed from: a0.o$a */
    public static final class C103179a extends C87413o implements C32226l<C109854n0.C109855a, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C109854n0 f304342d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C103179a(C109854n0 n0Var) {
            super(1);
            this.f304342d = n0Var;
        }

        public Object invoke(Object obj) {
            C109854n0.C109855a aVar = (C109854n0.C109855a) obj;
            C87412m.m108594g(aVar, "$this$layout");
            C109854n0.C109855a.m149306f(aVar, this.f304342d, 0, 0, 0.0f, 4, (Object) null);
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C103178o(C103176n nVar, float f, C32226l<? super C103618e1, C13598b0> lVar) {
        super(lVar);
        C87412m.m108594g(nVar, TencentLocation.EXTRA_DIRECTION);
        C87412m.m108594g(lVar, "inspectorInfo");
        this.f304340e = nVar;
        this.f304341f = f;
    }

    /* renamed from: E */
    public int mo142876E(C109848k kVar, C109846j jVar, int i) {
        return C109866r.C109867a.m149338b(this, kVar, jVar, i);
    }

    /* renamed from: G */
    public C109899z mo142877G(C109827a0 a0Var, C109893x xVar, long j) {
        int i;
        int i2;
        int i3;
        int i4;
        C87412m.m108594g(a0Var, "$this$measure");
        C87412m.m108594g(xVar, "measurable");
        if (!C108319b.m146693d(j) || this.f304340e == C103176n.Vertical) {
            i2 = C108319b.m146699j(j);
            i = C108319b.m146697h(j);
        } else {
            i2 = C61595o.m72297e(C60641c.m70921b(((float) C108319b.m146697h(j)) * this.f304341f), C108319b.m146699j(j), C108319b.m146697h(j));
            i = i2;
        }
        if (!C108319b.m146692c(j) || this.f304340e == C103176n.Horizontal) {
            int i5 = C108319b.m146698i(j);
            i3 = C108319b.m146696g(j);
            i4 = i5;
        } else {
            i4 = C61595o.m72297e(C60641c.m70921b(((float) C108319b.m146696g(j)) * this.f304341f), C108319b.m146698i(j), C108319b.m146696g(j));
            i3 = i4;
        }
        C109854n0 K = xVar.mo161155K(C108321c.m146704a(i2, i, i4, i3));
        return C109827a0.C109828a.m149247b(a0Var, K.f328779d, K.f328780e, (Map) null, new C103179a(K), 4, (Object) null);
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
        if (obj instanceof C103178o) {
            C103178o oVar = (C103178o) obj;
            if (this.f304340e == oVar.f304340e) {
                if (this.f304341f == oVar.f304341f) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        return (this.f304340e.hashCode() * 31) + Float.floatToIntBits(this.f304341f);
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
