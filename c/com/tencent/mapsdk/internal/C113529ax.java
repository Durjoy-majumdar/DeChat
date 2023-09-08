package com.tencent.mapsdk.internal;

import com.tencent.tencentmap.mapsdk.maps.model.LatLng;
import com.tencent.tencentmap.mapsdk.maps.model.Polygon;
import com.tencent.tencentmap.mapsdk.maps.model.PolygonOptions;
import java.util.List;

/* renamed from: com.tencent.mapsdk.internal.ax */
public final class C113529ax extends C113527av<C113522aq> implements Polygon {

    /* renamed from: a */
    public C113522aq f339729a;

    public C113529ax(C113522aq aqVar) {
        this.f339729a = aqVar;
    }

    /* renamed from: b */
    private C113522aq m155850b() {
        return this.f339729a;
    }

    public final boolean contains(LatLng latLng) {
        return this.f339729a.contains(latLng);
    }

    /* renamed from: f_ */
    public final /* bridge */ /* synthetic */ C113521ap mo171394f_() {
        return this.f339729a;
    }

    public final int getFillColor() {
        return this.f339729a.getFillColor();
    }

    public final List<LatLng> getPoints() {
        return this.f339729a.getPoints();
    }

    public final int getStrokeColor() {
        return this.f339729a.getStrokeColor();
    }

    public final float getStrokeWidth() {
        return this.f339729a.getStrokeWidth();
    }

    public final Object getTag() {
        return this.f339729a.getTag();
    }

    public final boolean isClickable() {
        C113522aq aqVar = this.f339729a;
        if (aqVar != null) {
            return aqVar.isClickable();
        }
        return false;
    }

    public final void setClickable(boolean z) {
        this.f339729a.setClickable(z);
    }

    public final void setFillColor(int i) {
        this.f339729a.setFillColor(i);
    }

    public final void setHolePoints(List<List<LatLng>> list) {
        C113522aq aqVar = this.f339729a;
        if (aqVar != null) {
            aqVar.setHolePoints(list);
        }
    }

    public final void setOptions(PolygonOptions polygonOptions) {
        this.f339729a.setOptions(polygonOptions);
    }

    public final void setPoints(List<LatLng> list) {
        C113522aq aqVar = this.f339729a;
        if (aqVar != null) {
            aqVar.setPoints(list);
        }
    }

    public final void setStrokeColor(int i) {
        this.f339729a.setStrokeColor(i);
    }

    public final void setStrokeWidth(float f) {
        this.f339729a.setStrokeWidth(f);
    }

    public final void setTag(Object obj) {
        this.f339729a.setTag(obj);
    }
}
