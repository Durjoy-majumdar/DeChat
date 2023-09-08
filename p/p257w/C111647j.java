package p257w;

import gy3.C8480h;
import gy3.C87412m;
import p175j0.C108497e2;
import p175j0.C108500f2;
import p175j0.C60667k2;
import p175j0.C60690y0;
import p257w.C37919o;

/* renamed from: w.j */
public final class C111647j<T, V extends C37919o> implements C60667k2<T> {

    /* renamed from: d */
    public final C37906k1<T, V> f334234d;

    /* renamed from: e */
    public final C60690y0 f334235e;

    /* renamed from: f */
    public V f334236f;

    /* renamed from: g */
    public long f334237g;

    /* renamed from: h */
    public long f334238h;

    /* renamed from: i */
    public boolean f334239i;

    public C111647j(C37906k1<T, V> k1Var, T t, V v, long j, long j2, boolean z) {
        C87412m.m108594g(k1Var, "typeConverter");
        this.f334234d = k1Var;
        this.f334235e = C108500f2.m146996c(t, (C108497e2) null, 2, (Object) null);
        this.f334236f = v != null ? C37921p.m41619a(v) : C111651k.m152179c(k1Var, t);
        this.f334237g = j;
        this.f334238h = j2;
        this.f334239i = z;
    }

    public T getValue() {
        return this.f334235e.getValue();
    }

    public String toString() {
        return "AnimationState(value=" + getValue() + ", velocity=" + this.f334234d.mo61400b().invoke(this.f334236f) + ", isRunning=" + this.f334239i + ", lastFrameTimeNanos=" + this.f334237g + ", finishedTimeNanos=" + this.f334238h + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C111647j(C37906k1 k1Var, Object obj, C37919o oVar, long j, long j2, boolean z, int i, C8480h hVar) {
        this(k1Var, obj, (i & 4) != 0 ? null : oVar, (i & 8) != 0 ? Long.MIN_VALUE : j, (i & 16) != 0 ? Long.MIN_VALUE : j2, (i & 32) != 0 ? false : z);
    }
}
