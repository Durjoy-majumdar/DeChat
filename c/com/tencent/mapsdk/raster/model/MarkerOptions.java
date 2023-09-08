package com.tencent.mapsdk.raster.model;

import android.view.View;
import android.view.animation.Animation;
import com.tencent.tencentmap.mapsdk.maps.model.MarkerCollisionItem;

public final class MarkerOptions {
    private float alpha = 1.0f;
    private int anchorOffsetX;
    private int anchorOffsetY;
    private float anchorU = 0.5f;
    private float anchorV = 1.0f;
    private BitmapDescriptor bitmapDescriptor;
    private String contentDescription;
    private Animation hidingAnination;
    private int iLevel = OverlayLevel.OverlayLevelAboveLabels;

    /* renamed from: id */
    public String f342872id;
    private Animation infoWindowHideAnimation;
    private Animation infoWindowShowAnimation;
    private boolean isClockwise = true;
    private boolean isDraggable = false;
    private boolean isFlat = false;
    private boolean isGps = false;
    private boolean isVisible = true;
    private LatLng latLng;
    private MarkerCollisionItem[] mCollisions;
    private IndoorInfo mIndoorInfo;
    private View markerView;
    private float rotation = 0.0f;
    private Animation showingAnination;
    private String snippet;
    private Object tag;
    private String title;
    private int zIndex;

    public MarkerOptions alpha(float f) {
        this.alpha = f;
        return this;
    }

    public MarkerOptions anchor(float f, float f2) {
        this.anchorU = f;
        this.anchorV = f2;
        return this;
    }

    public MarkerOptions clockwise(boolean z) {
        this.isClockwise = z;
        return this;
    }

    public MarkerOptions contentDescription(String str) {
        this.contentDescription = str;
        return this;
    }

    public MarkerOptions draggable(boolean z) {
        this.isDraggable = z;
        return this;
    }

    public MarkerOptions flat(boolean z) {
        this.isFlat = z;
        return this;
    }

    public float getAlpha() {
        return this.alpha;
    }

    public float getAnchorU() {
        return this.anchorU;
    }

    public float getAnchorV() {
        return this.anchorV;
    }

    public MarkerCollisionItem[] getCollisions() {
        return this.mCollisions;
    }

    public String getContentDescription() {
        return this.contentDescription;
    }

    public Animation getHidingAnination() {
        return this.hidingAnination;
    }

    public BitmapDescriptor getIcon() {
        return this.bitmapDescriptor;
    }

    public IndoorInfo getIndoorInfo() {
        return this.mIndoorInfo;
    }

    public Animation getInfoWindowHideAnimation() {
        return this.infoWindowHideAnimation;
    }

    public int getInfoWindowOffsetX() {
        return this.anchorOffsetX;
    }

    public Animation getInfoWindowShowAnimation() {
        return this.infoWindowShowAnimation;
    }

    public int getInfowindowOffsetY() {
        return this.anchorOffsetY;
    }

    public int getLevel() {
        return this.iLevel;
    }

    public View getMarkerView() {
        return this.markerView;
    }

    public LatLng getPosition() {
        return this.latLng;
    }

    public float getRotation() {
        return this.rotation;
    }

    public Animation getShowingAnination() {
        return this.showingAnination;
    }

    public String getSnippet() {
        return this.snippet;
    }

    public Object getTag() {
        return this.tag;
    }

    public String getTitle() {
        return this.title;
    }

    public int getZIndex() {
        return this.zIndex;
    }

    public MarkerOptions icon(BitmapDescriptor bitmapDescriptor2) {
        this.bitmapDescriptor = bitmapDescriptor2;
        return this;
    }

    public MarkerOptions indoorInfo(IndoorInfo indoorInfo) {
        this.mIndoorInfo = indoorInfo;
        return this;
    }

    public MarkerOptions infoWindowHideAnimation(Animation animation) {
        this.infoWindowHideAnimation = animation;
        return this;
    }

    public MarkerOptions infoWindowOffset(int i, int i2) {
        this.anchorOffsetX = i;
        this.anchorOffsetY = i2;
        return this;
    }

    public MarkerOptions infoWindowShowAnimation(Animation animation) {
        this.infoWindowShowAnimation = animation;
        return this;
    }

    public boolean isClockwise() {
        return this.isClockwise;
    }

    public boolean isDraggable() {
        return this.isDraggable;
    }

    public boolean isFlat() {
        return this.isFlat;
    }

    public boolean isGps() {
        return this.isGps;
    }

    public boolean isVisible() {
        return this.isVisible;
    }

    public MarkerOptions level(int i) {
        if (i >= OverlayLevel.OverlayLevelAboveRoads && i <= OverlayLevel.OverlayLevelAboveLabels) {
            this.iLevel = i;
        }
        return this;
    }

    public MarkerOptions markerView(View view) {
        this.markerView = view;
        return this;
    }

    public MarkerOptions position(LatLng latLng2) {
        this.latLng = latLng2;
        return this;
    }

    public MarkerOptions rotation(float f) {
        this.rotation = f;
        return this;
    }

    public void setCollisions(MarkerCollisionItem... markerCollisionItemArr) {
        this.mCollisions = markerCollisionItemArr;
    }

    public MarkerOptions setHidingAnination(Animation animation) {
        this.hidingAnination = animation;
        return this;
    }

    public MarkerOptions setShowingAnination(Animation animation) {
        this.showingAnination = animation;
        return this;
    }

    public MarkerOptions snippet(String str) {
        this.snippet = str;
        return this;
    }

    public MarkerOptions tag(Object obj) {
        this.tag = obj;
        return this;
    }

    public MarkerOptions title(String str) {
        this.title = str;
        return this;
    }

    public MarkerOptions visible(boolean z) {
        this.isVisible = z;
        return this;
    }

    public MarkerOptions zIndex(int i) {
        this.zIndex = i;
        return this;
    }
}
