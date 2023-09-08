package ca0;

import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import ky3.C88337e;
import p1166z0.C112540f;
import p1166z0.C112546l;
import p175j0.C60690y0;
import p436a1.C103274x;
import p835c1.C104231f;
import p835c1.C104233g;
import rx3.C13598b0;

/* renamed from: ca0.l0 */
public final class C104349l0 extends C87413o implements C32226l<C104231f, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ int f308959d;

    /* renamed from: e */
    public final /* synthetic */ boolean f308960e;

    /* renamed from: f */
    public final /* synthetic */ float f308961f;

    /* renamed from: g */
    public final /* synthetic */ float f308962g;

    /* renamed from: h */
    public final /* synthetic */ long f308963h;

    /* renamed from: i */
    public final /* synthetic */ float f308964i;

    /* renamed from: j */
    public final /* synthetic */ float f308965j;

    /* renamed from: n */
    public final /* synthetic */ C60690y0<Integer> f308966n;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C104349l0(int i, boolean z, float f, float f2, long j, float f3, float f4, C60690y0<Integer> y0Var) {
        super(1);
        this.f308959d = i;
        this.f308960e = z;
        this.f308961f = f;
        this.f308962g = f2;
        this.f308963h = j;
        this.f308964i = f3;
        this.f308965j = f4;
        this.f308966n = y0Var;
    }

    public Object invoke(Object obj) {
        C104231f fVar = (C104231f) obj;
        C87412m.m108594g(fVar, "$this$drawBehind");
        int intValue = this.f308966n.getValue().intValue();
        C88337e eVar = new C88337e(intValue, intValue >> 31);
        for (int i = 0; i < this.f308959d; i++) {
            float e = (this.f308960e ? eVar.mo122716e() * 0.9f : 0.0f) + this.f308961f;
            float f = this.f308962g;
            float f2 = e * f;
            C104231f.C104232a.m139087f(fVar, this.f308963h, C112540f.m153745a(((float) i) * this.f308964i, f - f2), C112546l.m153761a(this.f308964i - this.f308965j, f2 * ((float) 2)), 0.0f, (C104233g) null, (C103274x) null, 0, 120, (Object) null);
        }
        return C13598b0.f38549a;
    }
}
