package com.tencent.tencentmap.mapsdk.vector.compat.utils.p900a;

import com.tencent.mapsdk.raster.model.LatLng;

/* renamed from: com.tencent.tencentmap.mapsdk.vector.compat.utils.a.c */
public class C116378c {

    /* renamed from: a */
    public static double f349209a = 6378137.0d;

    /* renamed from: b */
    public final double f349210b;

    public C116378c() {
        this.f349210b = f349209a * 6.283185307179586d;
    }

    /* renamed from: a */
    public C116377b mo178914a(LatLng latLng) {
        double sin = Math.sin(Math.toRadians(latLng.getLatitude()));
        double d = this.f349210b;
        return new C116377b(((latLng.getLongitude() / 360.0d) + 0.5d) * d, (((Math.log((sin + 1.0d) / (1.0d - sin)) * 0.5d) / -6.283185307179586d) + 0.5d) * d);
    }

    public C116378c(double d) {
        this.f349210b = d;
    }

    /* renamed from: a */
    public LatLng mo178913a(C116377b bVar) {
        double d = bVar.f349207a;
        double d2 = this.f349210b;
        return new LatLng(90.0d - Math.toDegrees(Math.atan(Math.exp(((-(0.5d - (bVar.f349208b / d2))) * 2.0d) * 3.141592653589793d)) * 2.0d), ((d / d2) - 0.5d) * 360.0d);
    }

    /* renamed from: a */
    public double mo178912a(LatLng latLng, LatLng latLng2) {
        double longitude = latLng.getLongitude();
        double latitude = latLng.getLatitude();
        double d = longitude * 0.01745329251994329d;
        double d2 = latitude * 0.01745329251994329d;
        double longitude2 = latLng2.getLongitude() * 0.01745329251994329d;
        double latitude2 = latLng2.getLatitude() * 0.01745329251994329d;
        double sin = Math.sin(d);
        double sin2 = Math.sin(d2);
        double cos = Math.cos(d);
        double cos2 = Math.cos(d2);
        double sin3 = Math.sin(longitude2);
        double sin4 = Math.sin(latitude2);
        double cos3 = Math.cos(longitude2);
        double cos4 = Math.cos(latitude2);
        double d3 = sin4;
        double[] dArr = {cos * cos2, cos2 * sin, sin2};
        double d4 = cos3 * cos4;
        double d5 = cos4 * sin3;
        double d6 = dArr[0];
        double d7 = (d6 - d4) * (d6 - d4);
        double d8 = dArr[1];
        double d9 = dArr[2];
        double d15 = d3;
        return Math.asin(Math.sqrt((d7 + ((d8 - d5) * (d8 - d5))) + ((d9 - d15) * (d9 - d15))) / 2.0d) * this.f349210b * 3.141592653589793d;
    }
}
