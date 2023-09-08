package p257w;

import fy3.C32226l;
import gy3.C87413o;

/* renamed from: w.s0 */
public final class C37930s0 extends C87413o implements C32226l<Double, Double> {

    /* renamed from: d */
    public final /* synthetic */ double f100346d;

    /* renamed from: e */
    public final /* synthetic */ double f100347e;

    /* renamed from: f */
    public final /* synthetic */ double f100348f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C37930s0(double d, double d2, double d3) {
        super(1);
        this.f100346d = d;
        this.f100347e = d2;
        this.f100348f = d3;
    }

    public Object invoke(Object obj) {
        double doubleValue = ((Number) obj).doubleValue();
        double d = this.f100346d;
        double d2 = this.f100347e;
        double d3 = doubleValue * d2;
        return Double.valueOf(((d * (((double) 1) + d3)) + (this.f100348f * d2)) * Math.exp(d3));
    }
}
