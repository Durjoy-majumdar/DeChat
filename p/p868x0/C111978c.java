package p868x0;

import fy3.C32226l;
import gy3.C87412m;
import p560i2.C108322d;
import p835c1.C54601d;
import rx3.C13598b0;

/* renamed from: x0.c */
public final class C111978c implements C108322d {

    /* renamed from: d */
    public C111977b f335227d = C111986l.f335233a;

    /* renamed from: e */
    public C111985j f335228e;

    /* renamed from: F */
    public long mo143031F(float f) {
        return C108322d.C108323a.m146725g(this, f);
    }

    /* renamed from: M */
    public int mo143032M(float f) {
        return C108322d.C108323a.m146719a(this, f);
    }

    /* renamed from: O */
    public float mo143033O(long j) {
        return C108322d.C108323a.m146722d(this, j);
    }

    /* renamed from: T */
    public float mo143034T(float f) {
        return f * getDensity();
    }

    /* renamed from: a */
    public final C111985j mo163641a(C32226l<? super C54601d, C13598b0> lVar) {
        C87412m.m108594g(lVar, "block");
        C111985j jVar = new C111985j(lVar);
        this.f335228e = jVar;
        return jVar;
    }

    /* renamed from: d0 */
    public float mo143035d0(float f) {
        return f / getDensity();
    }

    /* renamed from: e */
    public final long mo163642e() {
        return this.f335227d.mo161690e();
    }

    /* renamed from: g0 */
    public long mo143036g0(long j) {
        return C108322d.C108323a.m146724f(this, j);
    }

    public float getDensity() {
        return this.f335227d.getDensity().getDensity();
    }

    public float getFontScale() {
        return this.f335227d.getDensity().getFontScale();
    }

    /* renamed from: m */
    public float mo143039m(int i) {
        return ((float) i) / getDensity();
    }

    /* renamed from: q */
    public long mo143040q(long j) {
        return C108322d.C108323a.m146721c(this, j);
    }
}
