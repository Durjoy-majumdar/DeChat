package p257w;

import fy3.C32226l;
import gy3.C87413o;

/* renamed from: w.r0 */
public final class C37927r0 extends C87413o implements C32226l<Double, Double> {

    /* renamed from: d */
    public final /* synthetic */ double f100342d;

    /* renamed from: e */
    public final /* synthetic */ double f100343e;

    /* renamed from: f */
    public final /* synthetic */ double f100344f;

    /* renamed from: g */
    public final /* synthetic */ double f100345g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C37927r0(double d, double d2, double d3, double d4) {
        super(1);
        this.f100342d = d;
        this.f100343e = d2;
        this.f100344f = d3;
        this.f100345g = d4;
    }

    public Object invoke(Object obj) {
        double doubleValue = ((Number) obj).doubleValue();
        return Double.valueOf(((this.f100342d + (this.f100343e * doubleValue)) * Math.exp(this.f100344f * doubleValue)) + this.f100345g);
    }
}
