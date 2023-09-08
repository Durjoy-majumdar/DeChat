package com.tencent.mapsdk.internal;

import com.tencent.mapsdk.internal.C113742fx;
import com.tencent.tencentmap.mapsdk.maps.model.LatLng;

/* renamed from: com.tencent.mapsdk.internal.bx */
public final class C113575bx implements C113742fx.C113743a {

    /* renamed from: a */
    public static final double f339901a = 1.0d;

    /* renamed from: d */
    private static final C113745fz f339902d = new C113745fz(1.0d);

    /* renamed from: b */
    public C113732fo f339903b;

    /* renamed from: c */
    public double f339904c;

    public C113575bx(LatLng latLng, double d) {
        this.f339903b = f339902d.mo172119c(latLng);
        if (d >= 0.0d) {
            this.f339904c = d;
        } else {
            this.f339904c = 1.0d;
        }
    }

    /* renamed from: b */
    private LatLng m156381b() {
        return f339902d.mo172118b(this.f339903b);
    }

    /* renamed from: c */
    private double m156382c() {
        return this.f339904c;
    }

    /* renamed from: a */
    public final C113732fo mo171874a() {
        return this.f339903b;
    }

    /* renamed from: a */
    private void m156380a(LatLng latLng) {
        this.f339903b = f339902d.mo172119c(latLng);
    }

    /* renamed from: a */
    private void m156379a(double d) {
        if (d >= 0.0d) {
            this.f339904c = d;
        } else {
            this.f339904c = 1.0d;
        }
    }

    public C113575bx(LatLng latLng) {
        this(latLng, 1.0d);
    }
}
