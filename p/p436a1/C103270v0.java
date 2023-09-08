package p436a1;

import androidx.compose.p002ui.platform.C54172f1;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import java.util.Map;
import p631o1.C109827a0;
import p631o1.C109846j;
import p631o1.C109848k;
import p631o1.C109854n0;
import p631o1.C109866r;
import p631o1.C109893x;
import p631o1.C109899z;
import p721v0.C65503j;
import rx3.C13598b0;
import rx3.C90109v;

/* renamed from: a1.v0 */
public final class C103270v0 extends C54172f1 implements C109866r {

    /* renamed from: e */
    public final float f304492e;

    /* renamed from: f */
    public final float f304493f;

    /* renamed from: g */
    public final float f304494g;

    /* renamed from: h */
    public final float f304495h;

    /* renamed from: i */
    public final float f304496i;

    /* renamed from: j */
    public final float f304497j;

    /* renamed from: n */
    public final float f304498n;

    /* renamed from: o */
    public final float f304499o;

    /* renamed from: p */
    public final float f304500p;

    /* renamed from: q */
    public final float f304501q;

    /* renamed from: r */
    public final long f304502r;

    /* renamed from: s */
    public final C103266t0 f304503s;

    /* renamed from: t */
    public final boolean f304504t;

    /* renamed from: u */
    public final long f304505u;

    /* renamed from: v */
    public final long f304506v;

    /* renamed from: w */
    public final C32226l<C103224b0, C13598b0> f304507w = new C103268u0(this);

    /* renamed from: a1.v0$a */
    public static final class C103271a extends C87413o implements C32226l<C109854n0.C109855a, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C109854n0 f304508d;

        /* renamed from: e */
        public final /* synthetic */ C103270v0 f304509e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C103271a(C109854n0 n0Var, C103270v0 v0Var) {
            super(1);
            this.f304508d = n0Var;
            this.f304509e = v0Var;
        }

        public Object invoke(Object obj) {
            C109854n0.C109855a aVar = (C109854n0.C109855a) obj;
            C87412m.m108594g(aVar, "$this$layout");
            C109854n0.C109855a.m149308h(aVar, this.f304508d, 0, 0, 0.0f, this.f304509e.f304507w, 4, (Object) null);
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C103270v0(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f15, long j, C103266t0 t0Var, boolean z, C103256p0 p0Var, long j2, long j3, C32226l lVar, C8480h hVar) {
        super(lVar);
        this.f304492e = f;
        this.f304493f = f2;
        this.f304494g = f3;
        this.f304495h = f4;
        this.f304496i = f5;
        this.f304497j = f6;
        this.f304498n = f7;
        this.f304499o = f8;
        this.f304500p = f9;
        this.f304501q = f15;
        this.f304502r = j;
        this.f304503s = t0Var;
        this.f304504t = z;
        this.f304505u = j2;
        this.f304506v = j3;
    }

    /* renamed from: E */
    public int mo142876E(C109848k kVar, C109846j jVar, int i) {
        return C109866r.C109867a.m149338b(this, kVar, jVar, i);
    }

    /* renamed from: G */
    public C109899z mo142877G(C109827a0 a0Var, C109893x xVar, long j) {
        C87412m.m108594g(a0Var, "$this$measure");
        C87412m.m108594g(xVar, "measurable");
        C109854n0 K = xVar.mo161155K(j);
        return C109827a0.C109828a.m149247b(a0Var, K.f328779d, K.f328780e, (Map) null, new C103271a(K, this), 4, (Object) null);
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
        C103270v0 v0Var = obj instanceof C103270v0 ? (C103270v0) obj : null;
        if (v0Var == null) {
            return false;
        }
        if (!(this.f304492e == v0Var.f304492e)) {
            return false;
        }
        if (!(this.f304493f == v0Var.f304493f)) {
            return false;
        }
        if (!(this.f304494g == v0Var.f304494g)) {
            return false;
        }
        if (!(this.f304495h == v0Var.f304495h)) {
            return false;
        }
        if (!(this.f304496i == v0Var.f304496i)) {
            return false;
        }
        if (!(this.f304497j == v0Var.f304497j)) {
            return false;
        }
        if (!(this.f304498n == v0Var.f304498n)) {
            return false;
        }
        if (!(this.f304499o == v0Var.f304499o)) {
            return false;
        }
        if (!(this.f304500p == v0Var.f304500p)) {
            return false;
        }
        if (!(this.f304501q == v0Var.f304501q)) {
            return false;
        }
        long j = this.f304502r;
        long j2 = v0Var.f304502r;
        int i = C103222a1.f304425c;
        return ((j > j2 ? 1 : (j == j2 ? 0 : -1)) == 0) && C87412m.m108589b(this.f304503s, v0Var.f304503s) && this.f304504t == v0Var.f304504t && C87412m.m108589b((Object) null, (Object) null) && C103272w.m136781c(this.f304505u, v0Var.f304505u) && C103272w.m136781c(this.f304506v, v0Var.f304506v);
    }

    public int hashCode() {
        long j = this.f304502r;
        int i = C103222a1.f304425c;
        int floatToIntBits = ((((((((((((((((((((((Float.floatToIntBits(this.f304492e) * 31) + Float.floatToIntBits(this.f304493f)) * 31) + Float.floatToIntBits(this.f304494g)) * 31) + Float.floatToIntBits(this.f304495h)) * 31) + Float.floatToIntBits(this.f304496i)) * 31) + Float.floatToIntBits(this.f304497j)) * 31) + Float.floatToIntBits(this.f304498n)) * 31) + Float.floatToIntBits(this.f304499o)) * 31) + Float.floatToIntBits(this.f304500p)) * 31) + Float.floatToIntBits(this.f304501q)) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + this.f304503s.hashCode()) * 31;
        int i2 = this.f304504t ? 1231 : 1237;
        long j2 = this.f304505u;
        int i3 = C103272w.f304516h;
        return ((((((floatToIntBits + i2) * 31) + 0) * 31) + C90109v.m112737a(j2)) * 31) + C90109v.m112737a(this.f304506v);
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

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SimpleGraphicsLayerModifier(scaleX=");
        sb.append(this.f304492e);
        sb.append(", scaleY=");
        sb.append(this.f304493f);
        sb.append(", alpha = ");
        sb.append(this.f304494g);
        sb.append(", translationX=");
        sb.append(this.f304495h);
        sb.append(", translationY=");
        sb.append(this.f304496i);
        sb.append(", shadowElevation=");
        sb.append(this.f304497j);
        sb.append(", rotationX=");
        sb.append(this.f304498n);
        sb.append(", rotationY=");
        sb.append(this.f304499o);
        sb.append(", rotationZ=");
        sb.append(this.f304500p);
        sb.append(", cameraDistance=");
        sb.append(this.f304501q);
        sb.append(", transformOrigin=");
        long j = this.f304502r;
        int i = C103222a1.f304425c;
        sb.append("TransformOrigin(packedValue=" + j + ')');
        sb.append(", shape=");
        sb.append(this.f304503s);
        sb.append(", clip=");
        sb.append(this.f304504t);
        sb.append(", renderEffect=");
        sb.append((Object) null);
        sb.append(", ambientShadowColor=");
        sb.append(C103272w.m136787i(this.f304505u));
        sb.append(", spotShadowColor=");
        sb.append(C103272w.m136787i(this.f304506v));
        sb.append(')');
        return sb.toString();
    }

    /* renamed from: v */
    public int mo142883v(C109848k kVar, C109846j jVar, int i) {
        return C109866r.C109867a.m149337a(this, kVar, jVar, i);
    }
}
