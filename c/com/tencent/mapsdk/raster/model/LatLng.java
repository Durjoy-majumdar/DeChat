package com.tencent.mapsdk.raster.model;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public final class LatLng implements Cloneable {

    /* renamed from: df */
    private static DecimalFormat f342871df = new DecimalFormat("0.000000", new DecimalFormatSymbols(Locale.US));
    private final double latitude;
    private final double longitude;

    public LatLng(double d, double d2) {
        if (-180.0d > d2 || d2 >= 180.0d) {
            this.longitude = parseDouble(((((d2 - 180.0d) % 360.0d) + 360.0d) % 360.0d) - 180.0d);
        } else {
            this.longitude = parseDouble(d2);
        }
        this.latitude = parseDouble(Math.max(-85.0d, Math.min(85.0d, d)));
    }

    private static double parseDouble(double d) {
        return Double.parseDouble(f342871df.format(d));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LatLng)) {
            return false;
        }
        LatLng latLng = (LatLng) obj;
        return Double.doubleToLongBits(this.latitude) == Double.doubleToLongBits(latLng.latitude) && Double.doubleToLongBits(this.longitude) == Double.doubleToLongBits(latLng.longitude);
    }

    public double getLatitude() {
        return this.latitude;
    }

    public double getLongitude() {
        return this.longitude;
    }

    public int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.latitude);
        long doubleToLongBits2 = Double.doubleToLongBits(this.longitude);
        return ((((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) + 31) * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)));
    }

    public String toString() {
        return "lat/lng: (" + this.latitude + "," + this.longitude + ")";
    }

    public LatLng clone() {
        return new LatLng(this.latitude, this.longitude);
    }
}
