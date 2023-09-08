package com.tencent.tencentmap.mapsdk.maps.model.transform;

import com.tencent.tencentmap.mapsdk.maps.model.LatLng;

public class SphericalMercatorProjection {
    public static double EARTH_RADIUS = 6378137.0d;
    public final double mWorldWidth;

    public SphericalMercatorProjection() {
        this.mWorldWidth = EARTH_RADIUS * 6.283185307179586d;
    }

    public double distanceBetween(LatLng latLng, LatLng latLng2) {
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
        return Math.asin(Math.sqrt((d16 + ((d17 - d9) * (d17 - d9))) + ((d18 - d19) * (d18 - d19))) / 2.0d) * this.mWorldWidth * 3.141592653589793d;
    }

    public LatLng toLatLng(Point point) {
        double d = point.f349191x;
        double d2 = this.mWorldWidth;
        return new LatLng(90.0d - Math.toDegrees(Math.atan(Math.exp(((-(0.5d - (point.f349192y / d2))) * 2.0d) * 3.141592653589793d)) * 2.0d), ((d / d2) - 0.5d) * 360.0d);
    }

    public Point toPoint(LatLng latLng) {
        double sin = Math.sin(Math.toRadians(latLng.latitude));
        double d = this.mWorldWidth;
        return new Point(((latLng.longitude / 360.0d) + 0.5d) * d, (((Math.log((sin + 1.0d) / (1.0d - sin)) * 0.5d) / -6.283185307179586d) + 0.5d) * d);
    }

    public SphericalMercatorProjection(double d) {
        this.mWorldWidth = d;
    }
}
