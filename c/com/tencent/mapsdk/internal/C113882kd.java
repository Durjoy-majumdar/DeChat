package com.tencent.mapsdk.internal;

import com.tencent.tencentmap.mapsdk.maps.model.LatLng;

/* renamed from: com.tencent.mapsdk.internal.kd */
public final class C113882kd {
    /* renamed from: a */
    private static double m157459a(LatLng latLng, LatLng latLng2) {
        LatLng latLng3 = latLng;
        LatLng latLng4 = latLng2;
        double d = latLng3.longitude;
        double d2 = latLng3.latitude;
        double d3 = d * 0.01745329251994329d;
        double d4 = d2 * 0.01745329251994329d;
        double d5 = latLng4.longitude * 0.01745329251994329d;
        double d6 = latLng4.latitude * 0.01745329251994329d;
        double sin = Math.sin(d3);
        double sin2 = Math.sin(d4);
        double cos = Math.cos(d3);
        double cos2 = Math.cos(d4);
        double sin3 = Math.sin(d5);
        double sin4 = Math.sin(d6);
        double cos3 = Math.cos(d5);
        double cos4 = Math.cos(d6);
        double d7 = sin4;
        double[] dArr = {cos * cos2, cos2 * sin, sin2};
        double d8 = cos3 * cos4;
        double d9 = cos4 * sin3;
        double d15 = dArr[0];
        double d16 = (d15 - d8) * (d15 - d8);
        double d17 = dArr[1];
        double d18 = dArr[2];
        double d19 = d7;
        return Math.asin(Math.sqrt((d16 + ((d17 - d9) * (d17 - d9))) + ((d18 - d19) * (d18 - d19))) / 2.0d) * 1.27420015798544E7d;
    }

    /* renamed from: b */
    private static LatLng m157460b(LatLng latLng, LatLng latLng2) {
        return new LatLng((latLng.latitude * 2.0d) - latLng2.latitude, (latLng.longitude * 2.0d) - latLng2.longitude);
    }
}
