package com.tencent.mapsdk.internal;

import com.tencent.tencentmap.mapsdk.maps.model.Circle;
import com.tencent.tencentmap.mapsdk.maps.model.CircleOptions;
import com.tencent.tencentmap.mapsdk.maps.model.LatLng;

/* renamed from: com.tencent.mapsdk.internal.at */
public final class C113525at extends C113527av<C113514ah> implements Circle {

    /* renamed from: a */
    private C113514ah f339726a;

    public C113525at(C113514ah ahVar) {
        this.f339726a = ahVar;
    }

    /* renamed from: b */
    private C113514ah m155842b() {
        return this.f339726a;
    }

    public final boolean contains(LatLng latLng) {
        return this.f339726a.contains(latLng);
    }

    /* renamed from: f_ */
    public final /* bridge */ /* synthetic */ C113521ap mo171394f_() {
        return this.f339726a;
    }

    public final LatLng getCenter() {
        return this.f339726a.getCenter();
    }

    public final int getFillColor() {
        return this.f339726a.getFillColor();
    }

    public final double getRadius() {
        return this.f339726a.getRadius();
    }

    public final int getStrokeColor() {
        return this.f339726a.getStrokeColor();
    }

    public final float getStrokeWidth() {
        return this.f339726a.getStrokeWidth();
    }

    public final Object getTag() {
        return this.f339726a.getTag();
    }

    public final boolean isClickable() {
        return this.f339726a.isClickable();
    }

    public final void setCenter(LatLng latLng) {
        this.f339726a.setCenter(latLng);
    }

    public final void setClickable(boolean z) {
        this.f339726a.setClickable(z);
    }

    public final void setFillColor(int i) {
        this.f339726a.setFillColor(i);
    }

    @Deprecated
    public final void setOptions(CircleOptions circleOptions) {
        this.f339726a.setOptions(circleOptions);
    }

    public final void setRadius(double d) {
        this.f339726a.setRadius(d);
    }

    public final void setStrokeColor(int i) {
        this.f339726a.setStrokeColor(i);
    }

    public final void setStrokeWidth(float f) {
        this.f339726a.setStrokeWidth(f);
    }

    public final void setTag(Object obj) {
        this.f339726a.setTag(obj);
    }
}
