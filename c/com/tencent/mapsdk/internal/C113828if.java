package com.tencent.mapsdk.internal;

import com.tencent.map.lib.models.GeoPoint;

/* renamed from: com.tencent.mapsdk.internal.if */
public final class C113828if extends C113814ho {

    /* renamed from: g */
    private GeoPoint f340578g = null;

    /* renamed from: h */
    private GeoPoint f340579h = null;

    /* renamed from: i */
    private boolean f340580i = false;

    private C113828if(GeoPoint geoPoint, GeoPoint geoPoint2) {
        if (geoPoint != null) {
            this.f340578g = new GeoPoint(geoPoint.getLatitudeE6(), geoPoint.getLongitudeE6());
        }
        if (geoPoint2 != null) {
            this.f340579h = new GeoPoint(geoPoint2.getLatitudeE6(), geoPoint2.getLongitudeE6());
        }
    }

    /* renamed from: a */
    public final void mo172189a(float f) {
        GeoPoint geoPoint = this.f340579h;
        if (geoPoint != null && this.f340578g != null) {
            int latitudeE6 = geoPoint.getLatitudeE6() - this.f340578g.getLatitudeE6();
            int longitudeE6 = this.f340579h.getLongitudeE6() - this.f340578g.getLongitudeE6();
            int latitudeE62 = this.f340578g.getLatitudeE6() + ((int) (((float) latitudeE6) * f));
            int longitudeE62 = this.f340578g.getLongitudeE6() + ((int) (((float) longitudeE6) * f));
            if (this.f340549f != null) {
                new GeoPoint(latitudeE62, longitudeE62);
            }
        }
    }
}
