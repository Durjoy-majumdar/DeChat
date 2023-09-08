package p257w;

import fy3.C32224a;
import gy3.C87412m;
import p175j0.C108494d2;
import p175j0.C108497e2;
import p175j0.C108500f2;
import p175j0.C60690y0;
import p257w.C37919o;
import rx3.C13598b0;

/* renamed from: w.g */
public final class C111640g<T, V extends C37919o> {

    /* renamed from: a */
    public final C37906k1<T, V> f334217a;

    /* renamed from: b */
    public final T f334218b;

    /* renamed from: c */
    public final long f334219c;

    /* renamed from: d */
    public final C32224a<C13598b0> f334220d;

    /* renamed from: e */
    public final C60690y0 f334221e;

    /* renamed from: f */
    public V f334222f;

    /* renamed from: g */
    public long f334223g;

    /* renamed from: h */
    public long f334224h = Long.MIN_VALUE;

    /* renamed from: i */
    public final C60690y0 f334225i;

    public C111640g(T t, C37906k1<T, V> k1Var, V v, long j, T t2, long j2, boolean z, C32224a<C13598b0> aVar) {
        C87412m.m108594g(k1Var, "typeConverter");
        C87412m.m108594g(v, "initialVelocityVector");
        C87412m.m108594g(aVar, "onCancel");
        this.f334217a = k1Var;
        this.f334218b = t2;
        this.f334219c = j2;
        this.f334220d = aVar;
        this.f334221e = C108500f2.m146996c(t, (C108497e2) null, 2, (Object) null);
        this.f334222f = C37921p.m41619a(v);
        this.f334223g = j;
        this.f334225i = C108500f2.m146996c(Boolean.valueOf(z), (C108497e2) null, 2, (Object) null);
    }

    /* renamed from: a */
    public final void mo163315a() {
        ((C108494d2) this.f334225i).setValue(Boolean.FALSE);
        this.f334220d.invoke();
    }

    /* renamed from: b */
    public final T mo163316b() {
        return this.f334221e.getValue();
    }

    /* renamed from: c */
    public final T mo163317c() {
        return this.f334217a.mo61400b().invoke(this.f334222f);
    }

    /* renamed from: d */
    public final boolean mo163318d() {
        return ((Boolean) this.f334225i.getValue()).booleanValue();
    }
}
