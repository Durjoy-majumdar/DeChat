package com.tencent.mapsdk.internal;

import android.content.Context;
import com.tencent.tencentmap.mapsdk.maps.TencentMap;
import com.tencent.tencentmap.mapsdk.maps.interfaces.Collision;
import com.tencent.tencentmap.mapsdk.maps.model.Animation;
import com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptor;
import com.tencent.tencentmap.mapsdk.maps.model.LatLng;
import com.tencent.tencentmap.mapsdk.maps.model.Marker;
import com.tencent.tencentmap.mapsdk.maps.model.MarkerOptions;

/* renamed from: com.tencent.mapsdk.internal.aw */
public final class C113528aw extends C113527av<C113520ao> implements Marker {

    /* renamed from: a */
    public C113520ao f339728a;

    public C113528aw(C113520ao aoVar) {
        this.f339728a = aoVar;
    }

    /* renamed from: b */
    private C113520ao m155848b() {
        return this.f339728a;
    }

    /* renamed from: f_ */
    public final /* bridge */ /* synthetic */ C113521ap mo171394f_() {
        return this.f339728a;
    }

    public final float getAlpha() {
        return this.f339728a.getAlpha();
    }

    public final float getAnchorU() {
        return this.f339728a.getAnchorU();
    }

    public final float getAnchorV() {
        return this.f339728a.getAnchorV();
    }

    public final String getContentDescription() {
        C113520ao aoVar = this.f339728a;
        if (aoVar != null) {
            return aoVar.getContentDescription();
        }
        return null;
    }

    public final int getDisplayLevel() {
        return this.f339728a.getDisplayLevel();
    }

    public final float getEqualScale() {
        C113520ao aoVar = this.f339728a;
        if (aoVar == null) {
            return 0.0f;
        }
        return aoVar.getEqualScale();
    }

    public final int getHeight(Context context) {
        C113520ao aoVar = this.f339728a;
        if (aoVar == null) {
            return 0;
        }
        return aoVar.getHeight(context);
    }

    public final TencentMap.OnMarkerDragListener getOnDragListener() {
        return this.f339728a.getOnDragListener();
    }

    public final MarkerOptions getOptions() {
        return this.f339728a.getOptions();
    }

    public final LatLng getPosition() {
        return this.f339728a.getPosition();
    }

    public final float getRotation() {
        C113520ao aoVar = this.f339728a;
        if (aoVar == null) {
            return 0.0f;
        }
        return aoVar.getRotation();
    }

    public final float[] getScale() {
        C113520ao aoVar = this.f339728a;
        return aoVar == null ? new float[]{0.0f, 0.0f} : aoVar.getScale();
    }

    public final String getSnippet() {
        return this.f339728a.getSnippet();
    }

    public final Object getTag() {
        return this.f339728a.getTag();
    }

    public final String getTitle() {
        return this.f339728a.getTitle();
    }

    public final int getWidth(Context context) {
        C113520ao aoVar = this.f339728a;
        if (aoVar == null) {
            return 0;
        }
        return aoVar.getWidth(context);
    }

    public final void hideInfoWindow() {
        C113520ao aoVar = this.f339728a;
        if (aoVar != null) {
            aoVar.hideInfoWindow();
        }
    }

    public final boolean isClickable() {
        C113520ao aoVar = this.f339728a;
        if (aoVar == null) {
            return false;
        }
        return aoVar.isClickable();
    }

    public final boolean isCollisionBy(Collision collision) {
        C113520ao aoVar = this.f339728a;
        if (aoVar != null) {
            return aoVar.isCollisionBy(collision);
        }
        return false;
    }

    public final boolean isDraggable() {
        return this.f339728a.isDraggable();
    }

    public final boolean isFastLoad() {
        C113520ao aoVar = this.f339728a;
        if (aoVar == null) {
            return false;
        }
        return aoVar.isFastLoad();
    }

    public final boolean isInMapCenterState() {
        return this.f339728a.isInMapCenterState();
    }

    public final boolean isInfoWindowAutoOverturn() {
        return this.f339728a.isInfoWindowAutoOverturn();
    }

    public final boolean isInfoWindowEnable() {
        return this.f339728a.isInfoWindowEnable();
    }

    public final boolean isInfoWindowShown() {
        C113520ao aoVar = this.f339728a;
        if (aoVar == null) {
            return false;
        }
        return aoVar.isInfoWindowShown();
    }

    public final boolean onTapMapViewBubbleHidden() {
        return this.f339728a.onTapMapViewBubbleHidden();
    }

    public final void refreshInfoWindow() {
        C113520ao aoVar = this.f339728a;
        if (aoVar != null) {
            aoVar.refreshInfoWindow();
        }
    }

    public final void setAlpha(float f) {
        C113520ao aoVar = this.f339728a;
        if (aoVar != null) {
            aoVar.setAlpha(f);
        }
    }

    public final void setAnchor(float f, float f2) {
        C113520ao aoVar = this.f339728a;
        if (aoVar != null) {
            aoVar.setAnchor(f, f2);
        }
    }

    public final void setAnimation(Animation animation) {
        C113520ao aoVar = this.f339728a;
        if (aoVar != null && animation != null) {
            aoVar.setAnimation(animation);
        }
    }

    public final void setClickable(boolean z) {
        C113520ao aoVar = this.f339728a;
        if (aoVar != null) {
            aoVar.setClickable(z);
        }
    }

    public final void setCollisions(Collision... collisionArr) {
        C113520ao aoVar = this.f339728a;
        if (aoVar != null) {
            aoVar.setCollisions(collisionArr);
        }
    }

    public final void setContentDescription(String str) {
        C113520ao aoVar = this.f339728a;
        if (aoVar != null) {
            aoVar.setContentDescription(str);
        }
    }

    public final void setDraggable(boolean z) {
        C113520ao aoVar = this.f339728a;
        if (aoVar != null) {
            aoVar.setDraggable(z);
            C113520ao aoVar2 = this.f339728a;
            aoVar2.setFixingPointEnable(!z && aoVar2.mo171375b());
        }
    }

    public final void setEqualScale(float f) {
        C113520ao aoVar = this.f339728a;
        if (aoVar != null) {
            aoVar.setEqualScale(f);
        }
    }

    public final void setFastLoad(boolean z) {
        this.f339728a.setFastLoad(z);
    }

    public final void setFixingPoint(int i, int i2) {
        this.f339728a.setFixingPoint(i, i2);
        this.f339728a.setDraggable(false);
    }

    public final void setFixingPointEnable(boolean z) {
        this.f339728a.setFixingPointEnable(z);
        if (this.f339728a.isDraggable()) {
            setDraggable(!z);
        }
        if (!z) {
            C113520ao aoVar = this.f339728a;
            aoVar.setPosition(aoVar.getPosition());
        }
    }

    public final void setIcon(BitmapDescriptor bitmapDescriptor) {
        C113520ao aoVar = this.f339728a;
        if (aoVar != null) {
            aoVar.setIcon(bitmapDescriptor);
        }
    }

    public final void setIconLooper(BitmapDescriptor bitmapDescriptor, boolean z, int i) {
        this.f339728a.setIconLooper(bitmapDescriptor, z, i);
    }

    public final void setInMapCenterState(boolean z) {
        C113520ao aoVar = this.f339728a;
        if (aoVar != null) {
            aoVar.setInMapCenterState(z);
        }
    }

    public final void setInfoWindowAnchor(float f, float f2) {
        C113520ao aoVar = this.f339728a;
        if (aoVar != null) {
            aoVar.setInfoWindowAnchor(f, f2);
            refreshInfoWindow();
        }
    }

    public final void setInfoWindowEnable(boolean z) {
        C113520ao aoVar = this.f339728a;
        if (aoVar != null) {
            aoVar.setInfoWindowEnable(z);
        }
    }

    public final void setInfoWindowOffset(int i, int i2) {
        C113520ao aoVar = this.f339728a;
        if (aoVar != null) {
            aoVar.setInfoWindowOffset(i, i2);
            refreshInfoWindow();
        }
    }

    public final void setMarkerOptions(MarkerOptions markerOptions) {
        if (markerOptions != null) {
            this.f339728a.setMarkerOptions(markerOptions);
        }
    }

    public final void setOnTapMapViewBubbleHidden(boolean z) {
        this.f339728a.mo171373a(z);
    }

    public final void setPosition(LatLng latLng) {
        C113520ao aoVar = this.f339728a;
        if (aoVar != null && latLng != null) {
            aoVar.setPosition(latLng);
        }
    }

    public final void setRotation(float f) {
        C113520ao aoVar = this.f339728a;
        if (aoVar != null) {
            aoVar.setRotation(f);
        }
    }

    public final void setScale(float f, float f2) {
        C113520ao aoVar = this.f339728a;
        if (aoVar != null) {
            aoVar.setScale(f, f2);
        }
    }

    public final void setSnippet(String str) {
        C113520ao aoVar = this.f339728a;
        if (aoVar != null) {
            aoVar.setSnippet(str);
        }
    }

    public final void setTag(Object obj) {
        this.f339728a.setTag(obj);
    }

    public final void setTitle(String str) {
        C113520ao aoVar = this.f339728a;
        if (aoVar != null) {
            aoVar.setTitle(str);
        }
    }

    public final void showInfoWindow() {
        C113520ao aoVar = this.f339728a;
        if (aoVar != null) {
            aoVar.showInfoWindow();
        }
    }

    public final boolean startAnimation() {
        C113520ao aoVar = this.f339728a;
        if (aoVar == null) {
            return false;
        }
        return aoVar.startAnimation();
    }

    public final void startAnimation(Animation animation) {
        setAnimation(animation);
        startAnimation();
    }
}
