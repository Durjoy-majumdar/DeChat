package p257w;

import fy3.C32226l;
import gy3.C87413o;

/* renamed from: w.u0 */
public final class C37938u0 extends C87413o implements C32226l<Double, Double> {

    /* renamed from: d */
    public final /* synthetic */ double f100371d;

    /* renamed from: e */
    public final /* synthetic */ double f100372e;

    /* renamed from: f */
    public final /* synthetic */ double f100373f;

    /* renamed from: g */
    public final /* synthetic */ double f100374g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C37938u0(double d, double d2, double d3, double d4) {
        super(1);
        this.f100371d = d;
        this.f100372e = d2;
        this.f100373f = d3;
        this.f100374g = d4;
    }

    public Object invoke(Object obj) {
        double doubleValue = ((Number) obj).doubleValue();
        double d = this.f100371d;
        double d2 = this.f100372e;
        double exp = d * d2 * Math.exp(d2 * doubleValue);
        double d3 = this.f100373f;
        double d4 = this.f100374g;
        return Double.valueOf(exp + (d3 * d4 * Math.exp(d4 * doubleValue)));
    }
}
