package xb3;

import gy3.C87412m;

/* renamed from: xb3.c */
public final class C38481c {

    /* renamed from: a */
    public final double f101476a;

    /* renamed from: b */
    public final double f101477b;

    /* renamed from: c */
    public final double f101478c;

    public C38481c(double d, double d2, double d3) {
        this.f101476a = d;
        this.f101477b = d2;
        this.f101478c = d3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C38481c)) {
            return false;
        }
        C38481c cVar = (C38481c) obj;
        return C87412m.m108589b(Double.valueOf(this.f101476a), Double.valueOf(cVar.f101476a)) && C87412m.m108589b(Double.valueOf(this.f101477b), Double.valueOf(cVar.f101477b)) && C87412m.m108589b(Double.valueOf(this.f101478c), Double.valueOf(cVar.f101478c));
    }

    public int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.f101476a);
        long doubleToLongBits2 = Double.doubleToLongBits(this.f101477b);
        long doubleToLongBits3 = Double.doubleToLongBits(this.f101478c);
        return (((((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)))) * 31) + ((int) (doubleToLongBits3 ^ (doubleToLongBits3 >>> 32)));
    }

    public String toString() {
        return "LABColor(L=" + this.f101476a + ", a=" + this.f101477b + ", b=" + this.f101478c + ')';
    }
}
