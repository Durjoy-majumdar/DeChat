package com.tencent.mapsdk.internal;

import com.tencent.tencentmap.mapsdk.maps.model.LatLng;

/* renamed from: com.tencent.mapsdk.internal.fz */
public class C113745fz {

    /* renamed from: d */
    public final double f340318d;

    public C113745fz(double d) {
        this.f340318d = d;
    }

    /* renamed from: b */
    public final LatLng mo172118b(C113732fo foVar) {
        double d = foVar.f340215a;
        double d2 = this.f340318d;
        double d3 = ((d / d2) - 0.5d) * 360.0d;
        double degrees = 90.0d - Math.toDegrees(Math.atan(Math.exp(((-(0.5d - (foVar.f340216b / d2))) * 2.0d) * 3.141592653589793d)) * 2.0d);
        if (Double.isNaN(degrees)) {
            degrees = 0.0d;
        }
        if (Double.isNaN(d3)) {
            d3 = 0.0d;
        }
        return new LatLng(degrees, d3);
    }

    /* renamed from: c */
    public final C113732fo mo172119c(LatLng latLng) {
        double sin = Math.sin(Math.toRadians(latLng.latitude));
        double d = this.f340318d;
        return new C113732fo(((latLng.longitude / 360.0d) + 0.5d) * d, (((Math.log((sin + 1.0d) / (1.0d - sin)) * 0.5d) / -6.283185307179586d) + 0.5d) * d);
    }
}
