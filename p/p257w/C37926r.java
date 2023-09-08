package p257w;

import gy3.C87412m;

/* renamed from: w.r */
public final class C37926r {

    /* renamed from: a */
    public double f100340a;

    /* renamed from: b */
    public double f100341b;

    public C37926r(double d, double d2) {
        this.f100340a = d;
        this.f100341b = d2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C37926r)) {
            return false;
        }
        C37926r rVar = (C37926r) obj;
        return C87412m.m108589b(Double.valueOf(this.f100340a), Double.valueOf(rVar.f100340a)) && C87412m.m108589b(Double.valueOf(this.f100341b), Double.valueOf(rVar.f100341b));
    }

    public int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.f100340a);
        long doubleToLongBits2 = Double.doubleToLongBits(this.f100341b);
        return (((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)));
    }

    public String toString() {
        return "ComplexDouble(_real=" + this.f100340a + ", _imaginary=" + this.f100341b + ')';
    }
}
