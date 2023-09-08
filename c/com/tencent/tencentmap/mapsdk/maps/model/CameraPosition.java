package com.tencent.tencentmap.mapsdk.maps.model;

public final class CameraPosition {
    public final float bearing;
    public LatLng target;
    public final float tilt;
    public final float zoom;

    public CameraPosition(int i, LatLng latLng, float f, float f2, float f3) {
        this.target = latLng;
        this.zoom = f;
        this.tilt = f2;
        this.bearing = f3;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static final CameraPosition fromLatLngZoom(LatLng latLng, float f) {
        return new CameraPosition(latLng, f, 0.0f, 0.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CameraPosition)) {
            return false;
        }
        CameraPosition cameraPosition = (CameraPosition) obj;
        return this.target.equals(cameraPosition.target) && Float.floatToIntBits(this.zoom) == Float.floatToIntBits(cameraPosition.zoom) && Float.floatToIntBits(this.tilt) == Float.floatToIntBits(cameraPosition.tilt) && Float.floatToIntBits(this.bearing) == Float.floatToIntBits(cameraPosition.bearing);
    }

    public final String toString() {
        return "latlng:" + this.target.latitude + "," + this.target.longitude + ",zoom:" + this.zoom + ",tilt=" + this.tilt + ",bearing:" + this.bearing;
    }

    public static Builder builder(CameraPosition cameraPosition) {
        return new Builder(cameraPosition);
    }

    public static final class Builder {

        /* renamed from: p */
        private LatLng f349176p;

        /* renamed from: q */
        private float f349177q;

        /* renamed from: r */
        private float f349178r = Float.MIN_VALUE;

        /* renamed from: s */
        private float f349179s = Float.MIN_VALUE;

        public Builder() {
        }

        public final Builder bearing(float f) {
            this.f349179s = f;
            return this;
        }

        public final CameraPosition build() {
            return new CameraPosition(this.f349176p, this.f349177q, this.f349178r, this.f349179s);
        }

        public final Builder target(LatLng latLng) {
            this.f349176p = latLng;
            return this;
        }

        public final Builder tilt(float f) {
            this.f349178r = f;
            return this;
        }

        public final Builder zoom(float f) {
            this.f349177q = f;
            return this;
        }

        public Builder(CameraPosition cameraPosition) {
            this.f349176p = cameraPosition.target;
            this.f349177q = cameraPosition.zoom;
            this.f349178r = cameraPosition.tilt;
            this.f349179s = cameraPosition.bearing;
        }
    }

    public CameraPosition(LatLng latLng, float f, float f2, float f3) {
        this(1, latLng, f, f2, f3);
    }
}
