package com.tencent.mapsdk.internal;

import com.tencent.tencentmap.mapsdk.maps.interfaces.Coordinate;

/* renamed from: com.tencent.mapsdk.internal.fw */
public final class C113741fw implements Coordinate, Cloneable {

    /* renamed from: a */
    public static final double f340305a = 2.003750834E7d;

    /* renamed from: b */
    public double f340306b = Double.MIN_VALUE;

    /* renamed from: c */
    public double f340307c = Double.MIN_VALUE;

    public C113741fw(double d, double d2) {
        setX(d);
        setY(d2);
    }

    /* renamed from: a */
    private double m156896a() {
        return this.f340306b;
    }

    /* renamed from: b */
    private double m156897b() {
        return this.f340307c;
    }

    /* renamed from: c */
    private C113741fw m156898c() {
        return new C113741fw(this.f340307c, this.f340306b);
    }

    public final /* synthetic */ Object clone() {
        return new C113741fw(this.f340307c, this.f340306b);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj.hashCode() != hashCode() || !(obj instanceof C113741fw)) {
            return false;
        }
        C113741fw fwVar = (C113741fw) obj;
        return Double.doubleToLongBits(fwVar.f340307c) == Double.doubleToLongBits(this.f340307c) && Double.doubleToLongBits(fwVar.f340306b) == Double.doubleToLongBits(this.f340306b);
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.f340307c);
        long doubleToLongBits2 = Double.doubleToLongBits(this.f340306b);
        return ((((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32))) + 31) * 31) + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
    }

    public final void setX(double d) {
        this.f340307c = Math.max(-2.003750834E7d, Math.min(2.003750834E7d, d));
    }

    public final void setY(double d) {
        this.f340306b = Math.max(-2.003750834E7d, Math.min(2.003750834E7d, d));
    }

    public final void setZ(double d) {
    }

    public final String toString() {
        return "x=" + this.f340307c + ",y=" + this.f340306b;
    }

    /* renamed from: x */
    public final double mo172089x() {
        return this.f340307c;
    }

    /* renamed from: y */
    public final double mo172090y() {
        return this.f340306b;
    }

    /* renamed from: z */
    public final double mo172091z() {
        return 0.0d;
    }
}
