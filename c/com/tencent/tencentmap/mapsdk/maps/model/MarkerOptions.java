package com.tencent.tencentmap.mapsdk.maps.model;

import android.os.Parcel;
import com.tencent.tencentmap.mapsdk.maps.interfaces.Collision;

public class MarkerOptions {
    private boolean bFlat = false;
    private BitmapDescriptor bitmapDesctor;
    private boolean boDragable;
    private boolean boInfoWindowEnable = true;
    private boolean boVisible = true;
    private String contentDescription;
    private float fAlpha = 1.0f;
    private float fAngle = 0.0f;
    private float fanchorU = 0.5f;
    private float fanchorV = 0.5f;
    private int iLevel = 2;
    private boolean mClockwise = true;
    private Collision[] mCollisions = new Collision[0];
    private int mIconLooperDuration = 500;
    private boolean mIconLooperEnable;
    private IndoorInfo mIndoorInfo;
    private float mInfowindowAnchorU = 0.5f;
    private float mInfowindowAnchorV = 1.0f;
    private int mInfowindowOffsetX = 0;
    private int mInfowindowOffsetY = 0;
    private boolean mIsFastLoad = true;
    private boolean mIsViewInfowindow = false;
    private Object mTag;
    private LatLng mlatlng;
    private String strSnippet;
    private String strtitle = "";
    private float zIndex = 0.0f;

    public MarkerOptions(LatLng latLng) {
        this.mlatlng = latLng;
    }

    public MarkerOptions alpha(float f) {
        this.fAlpha = f;
        return this;
    }

    public MarkerOptions anchor(float f, float f2) {
        this.fanchorU = f;
        this.fanchorV = f2;
        return this;
    }

    public MarkerOptions clockwise(boolean z) {
        this.mClockwise = z;
        return this;
    }

    public MarkerOptions collisionBy(MarkerCollisionItem... markerCollisionItemArr) {
        this.mCollisions = markerCollisionItemArr;
        return this;
    }

    public MarkerOptions contentDescription(String str) {
        this.contentDescription = str;
        return this;
    }

    public MarkerOptions draggable(boolean z) {
        this.boDragable = z;
        return this;
    }

    public MarkerOptions fastLoad(boolean z) {
        this.mIsFastLoad = z;
        return this;
    }

    public MarkerOptions flat(boolean z) {
        this.bFlat = z;
        return this;
    }

    public float getAlpha() {
        return this.fAlpha;
    }

    public float getAnchorU() {
        return this.fanchorU;
    }

    public float getAnchorV() {
        return this.fanchorV;
    }

    public Collision[] getCollisions() {
        return this.mCollisions;
    }

    public String getContentDescription() {
        return this.contentDescription;
    }

    public BitmapDescriptor getIcon() {
        return this.bitmapDesctor;
    }

    public int getIconLooperDuration() {
        return this.mIconLooperDuration;
    }

    public IndoorInfo getIndoorInfo() {
        return this.mIndoorInfo;
    }

    public float getInfoWindowAnchorU() {
        return this.mInfowindowAnchorU;
    }

    public float getInfoWindowAnchorV() {
        return this.mInfowindowAnchorV;
    }

    public int getInfoWindowOffsetX() {
        return this.mInfowindowOffsetX;
    }

    public int getInfowindowOffsetY() {
        return this.mInfowindowOffsetY;
    }

    public int getLevel() {
        return this.iLevel;
    }

    public LatLng getPosition() {
        return this.mlatlng;
    }

    public float getRotation() {
        return this.fAngle;
    }

    public String getSnippet() {
        return this.strSnippet;
    }

    public Object getTag() {
        return this.mTag;
    }

    public String getTitle() {
        return this.strtitle;
    }

    public float getZIndex() {
        return this.zIndex;
    }

    public MarkerOptions icon(BitmapDescriptor bitmapDescriptor) {
        this.bitmapDesctor = bitmapDescriptor;
        return this;
    }

    public MarkerOptions iconLooper(boolean z) {
        this.mIconLooperEnable = z;
        return this;
    }

    public MarkerOptions indoorInfo(IndoorInfo indoorInfo) {
        this.mIndoorInfo = indoorInfo;
        return this;
    }

    public MarkerOptions infoWindowAnchor(float f, float f2) {
        this.mInfowindowAnchorU = f;
        this.mInfowindowAnchorV = f2;
        return this;
    }

    public MarkerOptions infoWindowEnable(boolean z) {
        this.boInfoWindowEnable = z;
        return this;
    }

    public MarkerOptions infoWindowOffset(int i, int i2) {
        this.mInfowindowOffsetX = i;
        this.mInfowindowOffsetY = i2;
        return this;
    }

    public boolean isClockwise() {
        return this.mClockwise;
    }

    public boolean isDraggable() {
        return this.boDragable;
    }

    public boolean isFastLoad() {
        return this.mIsFastLoad;
    }

    public boolean isFlat() {
        return this.bFlat;
    }

    public boolean isIconLooperEnable() {
        return this.mIconLooperEnable;
    }

    public boolean isInfoWindowEnable() {
        return this.boInfoWindowEnable;
    }

    public boolean isViewInfowindow() {
        return this.mIsViewInfowindow;
    }

    public boolean isVisible() {
        return this.boVisible;
    }

    public MarkerOptions level(int i) {
        if (i >= 0 && i <= 2) {
            this.iLevel = i;
        }
        return this;
    }

    public MarkerOptions position(LatLng latLng) {
        this.mlatlng = latLng;
        return this;
    }

    public MarkerOptions rotation(float f) {
        this.fAngle = f;
        return this;
    }

    public MarkerOptions snippet(String str) {
        this.strSnippet = str;
        return this;
    }

    public MarkerOptions tag(Object obj) {
        this.mTag = obj;
        return this;
    }

    public MarkerOptions title(String str) {
        this.strtitle = str;
        return this;
    }

    public MarkerOptions viewInfoWindow(boolean z) {
        this.mIsViewInfowindow = z;
        return this;
    }

    public MarkerOptions visible(boolean z) {
        this.boVisible = z;
        return this;
    }

    public void writeToParcel(Parcel parcel, int i) {
        LatLng latLng;
        if (parcel != null && (latLng = this.mlatlng) != null) {
            parcel.writeString(latLng.toString());
        }
    }

    public MarkerOptions zIndex(float f) {
        this.zIndex = f;
        return this;
    }

    public MarkerOptions iconLooper(boolean z, int i) {
        this.mIconLooperEnable = z;
        this.mIconLooperDuration = i;
        return this;
    }

    @Deprecated
    public MarkerOptions() {
    }
}
