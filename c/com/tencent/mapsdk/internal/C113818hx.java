package com.tencent.mapsdk.internal;

import com.tencent.map.lib.models.GeoPoint;

/* renamed from: com.tencent.mapsdk.internal.hx */
public final class C113818hx implements C24236ix<GeoPoint> {
    /* renamed from: a */
    public final /* synthetic */ Object mo41013a(float f, Object obj, Object obj2) {
        GeoPoint geoPoint = (GeoPoint) obj;
        GeoPoint geoPoint2 = (GeoPoint) obj2;
        return new GeoPoint(geoPoint.getLatitudeE6() + ((int) (((float) (geoPoint2.getLatitudeE6() - geoPoint.getLatitudeE6())) * f)), geoPoint.getLongitudeE6() + ((int) (f * ((float) (geoPoint2.getLongitudeE6() - geoPoint.getLongitudeE6())))));
    }

    /* renamed from: a */
    private static GeoPoint m157190a(float f, GeoPoint geoPoint, GeoPoint geoPoint2) {
        return new GeoPoint(geoPoint.getLatitudeE6() + ((int) (((float) (geoPoint2.getLatitudeE6() - geoPoint.getLatitudeE6())) * f)), geoPoint.getLongitudeE6() + ((int) (f * ((float) (geoPoint2.getLongitudeE6() - geoPoint.getLongitudeE6())))));
    }
}
