package com.tencent.mapsdk.internal;

import android.content.Context;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import com.tencent.map.lib.models.GeoPoint;
import com.tencent.tencentmap.mapsdk.maps.Projection;
import com.tencent.tencentmap.mapsdk.maps.interfaces.Boundable;
import com.tencent.tencentmap.mapsdk.maps.model.LatLng;
import java.util.List;

/* renamed from: com.tencent.mapsdk.internal.es */
public interface C113707es extends Projection {

    /* renamed from: com.tencent.mapsdk.internal.es$a */
    public interface C113708a {
        /* renamed from: a */
        void mo171665a(float f, GeoPoint geoPoint);
    }

    /* renamed from: a */
    double mo172022a(Point point, Point point2);

    /* renamed from: a */
    float mo172023a(LatLng latLng, LatLng latLng2, int i, int i2, int i3, int i4, LatLng latLng3);

    /* renamed from: a */
    PointF mo172024a(LatLng latLng);

    /* renamed from: a */
    GeoPoint mo172025a(C113732fo foVar);

    /* renamed from: a */
    C113732fo mo172026a(Context context, LatLng latLng);

    /* renamed from: a */
    C113732fo mo172027a(GeoPoint geoPoint);

    /* renamed from: a */
    LatLng mo172028a(PointF pointF);

    /* renamed from: a */
    LatLng mo172029a(C113741fw fwVar);

    /* renamed from: a */
    void mo172030a(List<? extends Boundable> list, List<GeoPoint> list2, Rect rect, C113708a aVar);

    /* renamed from: a */
    LatLng[] mo172031a();

    /* renamed from: b */
    C113741fw mo172032b(LatLng latLng);

    double metersPerPixel(double d);
}
