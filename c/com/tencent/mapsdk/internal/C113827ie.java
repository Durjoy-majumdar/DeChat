package com.tencent.mapsdk.internal;

import android.view.animation.Interpolator;
import com.tencent.map.lib.models.GeoPoint;
import com.tencent.mapsdk.internal.C113820hz;

/* renamed from: com.tencent.mapsdk.internal.ie */
public final class C113827ie extends C113820hz {

    /* renamed from: i */
    private GeoPoint f340575i = null;

    /* renamed from: j */
    private GeoPoint f340576j = null;

    /* renamed from: k */
    private boolean f340577k = false;

    public C113827ie(GeoPoint geoPoint) {
        if (geoPoint != null) {
            this.f340576j = new GeoPoint(geoPoint.getLatitudeE6(), geoPoint.getLongitudeE6());
            this.f340577k = true;
        }
    }

    /* renamed from: a */
    public final void mo172201a(float f, Interpolator interpolator) {
        GeoPoint geoPoint = this.f340576j;
        if (geoPoint != null && this.f340575i != null) {
            int latitudeE6 = geoPoint.getLatitudeE6() - this.f340575i.getLatitudeE6();
            int longitudeE6 = this.f340576j.getLongitudeE6() - this.f340575i.getLongitudeE6();
            float interpolation = interpolator.getInterpolation(f);
            int latitudeE62 = this.f340575i.getLatitudeE6() + ((int) (((float) latitudeE6) * interpolation));
            int longitudeE62 = this.f340575i.getLongitudeE6() + ((int) (((float) longitudeE6) * interpolation));
            if (((double) (1.0f - f)) < 1.0E-4d) {
                latitudeE62 = this.f340576j.getLatitudeE6();
                longitudeE62 = this.f340576j.getLongitudeE6();
            }
            C113820hz.C113822b bVar = this.f340562h;
            if (bVar != null) {
                bVar.mo172211a(latitudeE62, longitudeE62);
            }
        }
    }

    /* renamed from: a */
    public final boolean mo172206a(GeoPoint geoPoint, GeoPoint geoPoint2) {
        if (!super.mo172206a((GeoPoint) null, (GeoPoint) null)) {
            return false;
        }
        if (geoPoint != null) {
            this.f340575i = new GeoPoint(geoPoint.getLatitudeE6(), geoPoint.getLongitudeE6());
        }
        if (this.f340577k || geoPoint2 == null) {
            return true;
        }
        this.f340576j = new GeoPoint(geoPoint2.getLatitudeE6(), geoPoint2.getLongitudeE6());
        return true;
    }
}
