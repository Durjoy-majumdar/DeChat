package p257w;

import fy3.C32226l;
import gy3.C87413o;

/* renamed from: w.t0 */
public final class C37934t0 extends C87413o implements C32226l<Double, Double> {

    /* renamed from: d */
    public final /* synthetic */ double f100353d;

    /* renamed from: e */
    public final /* synthetic */ double f100354e;

    /* renamed from: f */
    public final /* synthetic */ double f100355f;

    /* renamed from: g */
    public final /* synthetic */ double f100356g;

    /* renamed from: h */
    public final /* synthetic */ double f100357h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C37934t0(double d, double d2, double d3, double d4, double d5) {
        super(1);
        this.f100353d = d;
        this.f100354e = d2;
        this.f100355f = d3;
        this.f100356g = d4;
        this.f100357h = d5;
    }

    public Object invoke(Object obj) {
        double doubleValue = ((Number) obj).doubleValue();
        return Double.valueOf((this.f100353d * Math.exp(this.f100354e * doubleValue)) + (this.f100355f * Math.exp(this.f100356g * doubleValue)) + this.f100357h);
    }
}
