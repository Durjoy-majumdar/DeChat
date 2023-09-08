package p246u1;

import fy3.C32224a;
import gy3.C87412m;

/* renamed from: u1.i */
public final class C111073i {

    /* renamed from: a */
    public final C32224a<Float> f332605a;

    /* renamed from: b */
    public final C32224a<Float> f332606b;

    /* renamed from: c */
    public final boolean f332607c;

    public C111073i(C32224a<Float> aVar, C32224a<Float> aVar2, boolean z) {
        C87412m.m108594g(aVar, "value");
        C87412m.m108594g(aVar2, "maxValue");
        this.f332605a = aVar;
        this.f332606b = aVar2;
        this.f332607c = z;
    }

    public String toString() {
        return "ScrollAxisRange(value=" + this.f332605a.invoke().floatValue() + ", maxValue=" + this.f332606b.invoke().floatValue() + ", reverseScrolling=" + this.f332607c + ')';
    }
}
