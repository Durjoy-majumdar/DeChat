package com.tencent.mapsdk.internal;

import android.graphics.Rect;
import com.tencent.map.lib.models.AccessibleTouchItem;
import com.tencent.map.lib.models.GeoPoint;
import com.tencent.mapsdk.vector.VectorMap;
import com.tencent.tencentmap.mapsdk.maps.TencentMap;
import com.tencent.tencentmap.mapsdk.maps.model.LatLng;
import com.tencent.tencentmap.mapsdk.maps.model.MapPoi;

/* renamed from: com.tencent.mapsdk.internal.pg */
public final class C114049pg extends AccessibleTouchItem {

    /* renamed from: a */
    private MapPoi f341241a;

    /* renamed from: b */
    private C114322sx f341242b;

    public C114049pg(C114322sx sxVar, MapPoi mapPoi) {
        this.f341241a = mapPoi;
        this.f341242b = sxVar;
    }

    public final Rect getBounds() {
        C113732fo a = ((VectorMap) this.f341242b.f339878e_).getProjection().mo172027a(GeoPoint.from(new LatLng(this.f341241a.getLatitude(), this.f341241a.getLongitude())));
        return new Rect((int) (a.f340215a - ((double) (C113798hb.m157097n() * 20.0f))), (int) (a.f340216b - ((double) (C113798hb.m157097n() * 20.0f))), (int) (a.f340215a + ((double) (C113798hb.m157097n() * 20.0f))), (int) (a.f340216b + ((double) (C113798hb.m157097n() * 20.0f))));
    }

    public final String getContentDescription() {
        return this.f341241a.getName();
    }

    public final void onClick() {
        TencentMap.OnMapPoiClickListener onMapPoiClickListener;
        C114322sx sxVar = this.f341242b;
        if (sxVar != null && (onMapPoiClickListener = sxVar.f342518A) != null) {
            MapPoi mapPoi = new MapPoi();
            mapPoi.position = new LatLng(this.f341241a.getLatitude(), this.f341241a.getLongitude());
            mapPoi.name = this.f341241a.getName();
            onMapPoiClickListener.onClicked(mapPoi);
        }
    }
}
