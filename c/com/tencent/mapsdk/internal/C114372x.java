package com.tencent.mapsdk.internal;

import android.content.Context;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import com.tencent.map.lib.models.GeoPoint;
import com.tencent.mapsdk.internal.C113707es;
import com.tencent.tencentmap.mapsdk.maps.interfaces.Boundable;
import com.tencent.tencentmap.mapsdk.maps.model.LatLng;
import com.tencent.tencentmap.mapsdk.maps.model.LatLngBounds;
import com.tencent.tencentmap.mapsdk.maps.model.VisibleRegion;
import java.util.List;

/* renamed from: com.tencent.mapsdk.internal.x */
public final class C114372x implements C113707es {
    /* renamed from: a */
    public final double mo172022a(Point point, Point point2) {
        return 0.0d;
    }

    /* renamed from: a */
    public final float mo172023a(LatLng latLng, LatLng latLng2, int i, int i2, int i3, int i4, LatLng latLng3) {
        return 0.0f;
    }

    /* renamed from: a */
    public final GeoPoint mo172025a(C113732fo foVar) {
        return new GeoPoint();
    }

    /* renamed from: a */
    public final void mo172030a(List<? extends Boundable> list, List<GeoPoint> list2, Rect rect, C113707es.C113708a aVar) {
    }

    /* renamed from: a */
    public final LatLng[] mo172031a() {
        return new LatLng[4];
    }

    /* renamed from: b */
    public final C113741fw mo172032b(LatLng latLng) {
        return new C113741fw(0.0d, 0.0d);
    }

    public final LatLng fromScreenLocation(Point point) {
        return new LatLng();
    }

    public final VisibleRegion getVisibleRegion() {
        return new VisibleRegion(new LatLng(0.0d, 0.0d), new LatLng(0.0d, 0.0d), new LatLng(0.0d, 0.0d), new LatLng(0.0d, 0.0d), new LatLngBounds(new LatLng(0.0d, 0.0d), new LatLng(0.0d, 0.0d)));
    }

    public final float[] glModelMatrix(PointF pointF, float f) {
        return new float[16];
    }

    public final float glPixelRatio() {
        return 0.0f;
    }

    public final float[] glProjectionMatrix() {
        return new float[16];
    }

    public final PointF glVertexForCoordinate(LatLng latLng) {
        return new PointF();
    }

    public final float[] glViewMatrix() {
        return new float[16];
    }

    public final double metersPerPixel(double d) {
        return 0.0d;
    }

    public final Point toScreenLocation(LatLng latLng) {
        return new Point();
    }

    /* renamed from: a */
    public final C113732fo mo172027a(GeoPoint geoPoint) {
        return new C113732fo();
    }

    /* renamed from: a */
    public final PointF mo172024a(LatLng latLng) {
        return new PointF();
    }

    /* renamed from: a */
    public final LatLng mo172028a(PointF pointF) {
        return new LatLng();
    }

    /* renamed from: a */
    public final C113732fo mo172026a(Context context, LatLng latLng) {
        return new C113732fo();
    }

    /* renamed from: a */
    public final LatLng mo172029a(C113741fw fwVar) {
        return new LatLng();
    }
}
