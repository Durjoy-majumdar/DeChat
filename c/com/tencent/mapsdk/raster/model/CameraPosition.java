package com.tencent.mapsdk.raster.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.live2.jsplugin.V2TXJSAdapterConstants;

public final class CameraPosition implements Parcelable {
    public static final Parcelable.Creator<CameraPosition> CREATOR = new Parcelable.Creator<CameraPosition>() {
        public CameraPosition createFromParcel(Parcel parcel) {
            float readFloat = parcel.readFloat();
            float readFloat2 = parcel.readFloat();
            return new CameraPosition(new LatLng((double) readFloat, (double) readFloat2), parcel.readFloat(), parcel.readFloat(), parcel.readFloat());
        }

        public CameraPosition[] newArray(int i) {
            return new CameraPosition[i];
        }
    };
    private static final int EMPTY_ZOOMLEVEL = -1;
    private float bearing;
    private float skew;
    private final LatLng target;
    private float zoom;

    public CameraPosition(LatLng latLng, float f) {
        this(latLng, f, 0.0f, 0.0f);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static final CameraPosition fromLatLngZoom(LatLng latLng, float f) {
        return new CameraPosition(latLng, f);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CameraPosition)) {
            return false;
        }
        CameraPosition cameraPosition = (CameraPosition) obj;
        return getTarget().equals(cameraPosition.getTarget()) && Float.floatToIntBits(getZoom()) == Float.floatToIntBits(cameraPosition.getZoom());
    }

    public float getBearing() {
        return this.bearing;
    }

    public float getSkew() {
        return this.skew;
    }

    public LatLng getTarget() {
        return this.target;
    }

    public float getZoom() {
        return this.zoom;
    }

    public int hashCode() {
        return super.hashCode();
    }

    public String toString() {
        return "target" + this.target + V2TXJSAdapterConstants.PUSHER_KEY_ZOOM + this.zoom;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat((float) this.target.getLatitude());
        parcel.writeFloat((float) this.target.getLongitude());
        parcel.writeFloat(this.zoom);
        parcel.writeFloat(this.skew);
        parcel.writeFloat(this.bearing);
    }

    public CameraPosition(LatLng latLng, float f, float f2, float f3) {
        this.target = latLng;
        this.zoom = f;
        this.skew = f2;
        this.bearing = f3;
    }

    public static Builder builder(CameraPosition cameraPosition) {
        return new Builder(cameraPosition);
    }

    public static final class Builder {
        private float bearing = 0.0f;
        private float skew = 0.0f;
        private LatLng target;
        private float zoom = -1.0f;

        public Builder() {
        }

        public Builder bearing(float f) {
            this.bearing = f;
            return this;
        }

        public CameraPosition build() {
            return new CameraPosition(this.target, this.zoom, this.skew, this.bearing);
        }

        public Builder skew(float f) {
            this.skew = f;
            return this;
        }

        public Builder target(LatLng latLng) {
            this.target = latLng;
            return this;
        }

        public Builder zoom(float f) {
            this.zoom = f;
            return this;
        }

        public Builder(CameraPosition cameraPosition) {
            target(cameraPosition.getTarget()).zoom(cameraPosition.getZoom());
        }
    }
}
