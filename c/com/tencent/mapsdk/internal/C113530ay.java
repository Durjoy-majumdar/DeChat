package com.tencent.mapsdk.internal;

import android.graphics.Rect;
import com.tencent.tencentmap.mapsdk.maps.model.Animation;
import com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptor;
import com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptorFactory;
import com.tencent.tencentmap.mapsdk.maps.model.LatLng;
import com.tencent.tencentmap.mapsdk.maps.model.Polyline;
import com.tencent.tencentmap.mapsdk.maps.model.PolylineOptions;
import java.util.List;

/* renamed from: com.tencent.mapsdk.internal.ay */
public final class C113530ay extends C113527av<C113523ar> implements Polyline {
    @Deprecated

    /* renamed from: a */
    public static final int f339730a = 4;
    @Deprecated

    /* renamed from: b */
    public static final int f339731b = 3;
    @Deprecated

    /* renamed from: c */
    public static final int f339732c = 2;
    @Deprecated

    /* renamed from: d */
    public static final int f339733d = 1;
    @Deprecated

    /* renamed from: e */
    public static final int f339734e = 6;
    @Deprecated

    /* renamed from: f */
    public static final int f339735f = 0;
    @Deprecated

    /* renamed from: g */
    public static final int f339736g = 33;
    @Deprecated

    /* renamed from: h */
    public static final int f339737h = 19;

    /* renamed from: i */
    public final C113523ar f339738i;

    public C113530ay(C113523ar arVar) {
        this.f339738i = arVar;
    }

    /* renamed from: a */
    private void m155852a(boolean z) {
        this.f339738i.mo171391a(z);
    }

    /* renamed from: b */
    private C113523ar m155853b() {
        return this.f339738i;
    }

    public final void addTurnArrow(int i, int i2) {
        this.f339738i.addTurnArrow(i, i2);
    }

    public final void appendPoint(LatLng... latLngArr) {
        this.f339738i.appendPoint(latLngArr);
    }

    public final void appendPoints(List<LatLng> list) {
        this.f339738i.appendPoints(list);
    }

    public final void arrowSpacing(int i) {
        this.f339738i.arrowSpacing(i);
    }

    public final void cleanTurnArrow() {
        this.f339738i.cleanTurnArrow();
    }

    public final void eraseColor(int i) {
        this.f339738i.eraseColor(i);
    }

    public final void eraseTo(int i, LatLng latLng) {
        this.f339738i.mo171389a(i, latLng);
    }

    /* renamed from: f_ */
    public final /* bridge */ /* synthetic */ C113521ap mo171394f_() {
        return this.f339738i;
    }

    public final int getColor() {
        return this.f339738i.getColor();
    }

    public final int[][] getColors() {
        return this.f339738i.getColors();
    }

    public final List<Integer> getPattern() {
        return this.f339738i.getPattern();
    }

    public final List<LatLng> getPoints() {
        return this.f339738i.getPoints();
    }

    public final PolylineOptions getPolylineOptions() {
        return this.f339738i.getPolylineOptions();
    }

    public final Object getTag() {
        return this.f339738i.getTag();
    }

    public final PolylineOptions.Text getText() {
        C113523ar arVar = this.f339738i;
        if (arVar == null) {
            return null;
        }
        return arVar.getText();
    }

    public final Rect getVisibleRect() {
        return this.f339738i.getVisibleRect();
    }

    public final float getWidth() {
        return this.f339738i.getWidth();
    }

    public final boolean isAboveMaskLayer() {
        return this.f339738i.isAboveMaskLayer();
    }

    public final boolean isClickable() {
        C113523ar arVar = this.f339738i;
        if (arVar != null) {
            return arVar.isClickable();
        }
        return false;
    }

    public final boolean isGradientEnable() {
        return this.f339738i.isGradientEnable();
    }

    public final void pattern(List<Integer> list) {
        this.f339738i.pattern(list);
    }

    public final void setAboveMaskLayer(boolean z) {
        this.f339738i.setAboveMaskLayer(z);
    }

    public final void setAnimation(Animation animation) {
        this.f339738i.setAnimation(animation);
    }

    public final void setArrow(boolean z) {
        this.f339738i.setArrow(z);
    }

    public final void setBorderColors(int[] iArr) {
        this.f339738i.setBorderColors(iArr);
    }

    public final void setClickable(boolean z) {
        this.f339738i.setClickable(z);
    }

    public final void setColor(int i) {
        this.f339738i.setColor(i);
    }

    public final void setColorTexture(String str) {
        this.f339738i.setColorTexture(BitmapDescriptorFactory.fromAsset(str));
    }

    public final void setColors(int[] iArr, int[] iArr2) {
        this.f339738i.setColors(iArr, iArr2);
    }

    public final void setEraseable(boolean z) {
        this.f339738i.setEraseable(z);
    }

    public final void setGradientEnable(boolean z) {
        C113523ar arVar = this.f339738i;
        if (arVar != null) {
            arVar.setGradientEnable(z);
        }
    }

    public final void setPoints(List<LatLng> list) {
        this.f339738i.setPoints(list);
    }

    public final void setPolylineOptions(PolylineOptions polylineOptions) {
        if (polylineOptions != null) {
            this.f339738i.setPolylineOptions(polylineOptions);
        }
    }

    public final void setTag(Object obj) {
        this.f339738i.setTag(obj);
    }

    public final void setText(PolylineOptions.Text text) {
        C113523ar arVar = this.f339738i;
        if (arVar != null) {
            arVar.setText(text);
        }
    }

    public final void setWidth(float f) {
        this.f339738i.setWidth(f);
    }

    public final boolean startAnimation() {
        C113523ar arVar = this.f339738i;
        if (arVar != null) {
            return arVar.startAnimation();
        }
        return false;
    }

    public final void setColorTexture(BitmapDescriptor bitmapDescriptor) {
        this.f339738i.setColorTexture(bitmapDescriptor);
    }

    public final void startAnimation(Animation animation) {
        this.f339738i.startAnimation(animation);
    }
}
