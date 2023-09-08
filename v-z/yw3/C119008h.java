package yw3;

import android.graphics.Point;
import com.tencent.mapsdk.raster.model.GeoPoint;
import com.tencent.mapsdk.raster.model.LatLng;
import com.tencent.tencentmap.mapsdk.map.Projection;
import com.tencent.tencentmap.mapsdk.maps.TencentMap;
import com.tencent.tencentmap.mapsdk.maps.model.LatLngBounds;
import com.tencent.tencentmap.mapsdk.maps.model.VisibleRegion;

/* renamed from: yw3.h */
public class C119008h implements Projection {

    /* renamed from: a */
    public com.tencent.tencentmap.mapsdk.maps.Projection f356449a;

    /* renamed from: b */
    public TencentMap f356450b;

    public C119008h(TencentMap tencentMap) {
        this.f356449a = tencentMap.getProjection();
        this.f356450b = tencentMap;
    }

    public double distanceBetween(LatLng latLng, LatLng latLng2) {
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
        double d3 = (cos * cos2) - (cos3 * cos4);
        double d4 = (cos2 * sin) - (cos4 * sin3);
        double d5 = sin2 - sin4;
        return Math.asin(Math.sqrt(((d3 * d3) + (d4 * d4)) + (d5 * d5)) / 2.0d) * 1.27420015798544E7d;
    }

    public LatLng fromScreenLocation(Point point) {
        return C119023n.m167767a(this.f356449a.fromScreenLocation(point));
    }

    public double getLatitudeSpan() {
        VisibleRegion visibleRegion = this.f356449a.getVisibleRegion();
        if (visibleRegion == null) {
            return -1.0d;
        }
        LatLngBounds latLngBounds = visibleRegion.latLngBounds;
        return latLngBounds.southwest.latitude - latLngBounds.northeast.latitude;
    }

    public double getLongitudeSpan() {
        VisibleRegion visibleRegion = this.f356449a.getVisibleRegion();
        if (visibleRegion == null) {
            return -1.0d;
        }
        LatLngBounds latLngBounds = visibleRegion.latLngBounds;
        return latLngBounds.southwest.longitude - latLngBounds.northeast.longitude;
    }

    public float getScalePerPixel() {
        return (float) this.f356449a.metersPerPixel(this.f356450b.getCameraPosition().target.latitude);
    }

    public com.tencent.mapsdk.raster.model.VisibleRegion getVisibleRegion() {
        VisibleRegion visibleRegion = this.f356449a.getVisibleRegion();
        com.tencent.mapsdk.raster.model.LatLngBounds latLngBounds = null;
        if (visibleRegion == null) {
            return null;
        }
        LatLng a = C119023n.m167767a(visibleRegion.nearLeft);
        LatLng a2 = C119023n.m167767a(visibleRegion.nearRight);
        LatLng a3 = C119023n.m167767a(visibleRegion.farLeft);
        LatLng a4 = C119023n.m167767a(visibleRegion.farRight);
        LatLngBounds latLngBounds2 = visibleRegion.latLngBounds;
        if (!(latLngBounds2 == null || latLngBounds2.northeast == null || latLngBounds2.southwest == null)) {
            com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng = latLngBounds2.southwest;
            LatLng latLng2 = new LatLng(latLng.latitude, latLng.longitude);
            com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng3 = latLngBounds2.northeast;
            latLngBounds = new com.tencent.mapsdk.raster.model.LatLngBounds(latLng2, new LatLng(latLng3.latitude, latLng3.longitude));
        }
        return new com.tencent.mapsdk.raster.model.VisibleRegion(a, a2, a3, a4, latLngBounds);
    }

    public float metersToEquatorPixels(float f) {
        return metersToPixels(0.0d, (double) f);
    }

    public float metersToPixels(double d, double d2) {
        return (float) (d2 / this.f356449a.metersPerPixel(d));
    }

    @Deprecated
    public Point toPixels(GeoPoint geoPoint, Point point) {
        LatLng g2l = GeoPoint.g2l(geoPoint);
        if (g2l == null) {
            return null;
        }
        return toScreenLocation(g2l);
    }

    public Point toScreenLocation(LatLng latLng) {
        return this.f356449a.toScreenLocation(C119023n.m167772f(latLng));
    }
}
