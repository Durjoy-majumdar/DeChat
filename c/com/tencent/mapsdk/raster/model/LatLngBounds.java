package com.tencent.mapsdk.raster.model;

import java.util.Arrays;

public class LatLngBounds {
    private int mVersionCode;
    private LatLng northeast;
    private LatLng southwest;

    public LatLngBounds(int i, LatLng latLng, LatLng latLng2) {
        Builder include = new Builder().include(latLng).include(latLng2);
        this.southwest = new LatLng(include.mSouth, include.mWest);
        this.northeast = new LatLng(include.mNorth, include.mEast);
        this.mVersionCode = i;
    }

    public static Builder builder() {
        return new Builder();
    }

    private boolean containsLatitude(double d) {
        return this.southwest.getLatitude() <= d && d <= this.northeast.getLatitude();
    }

    private boolean containsLongitude(double d) {
        return this.southwest.getLongitude() <= this.northeast.getLongitude() ? this.southwest.getLongitude() <= d && d <= this.northeast.getLongitude() : this.southwest.getLongitude() <= d || d <= this.northeast.getLongitude();
    }

    private boolean intersect(LatLngBounds latLngBounds) {
        LatLng latLng;
        if (latLngBounds == null || (latLng = latLngBounds.northeast) == null || latLngBounds.southwest == null || this.northeast == null || this.southwest == null) {
            return false;
        }
        return Math.abs(((latLng.getLongitude() + latLngBounds.southwest.getLongitude()) - this.northeast.getLongitude()) - this.southwest.getLongitude()) < ((this.northeast.getLongitude() - this.southwest.getLongitude()) + latLngBounds.northeast.getLongitude()) - latLngBounds.southwest.getLongitude() && Math.abs(((latLngBounds.northeast.getLatitude() + latLngBounds.southwest.getLatitude()) - this.northeast.getLatitude()) - this.southwest.getLatitude()) < ((this.northeast.getLatitude() - this.southwest.getLatitude()) + latLngBounds.northeast.getLatitude()) - latLngBounds.southwest.getLatitude();
    }

    /* access modifiers changed from: private */
    public static double longitudeDistanceHeadingEast(double d, double d2) {
        return ((d2 - d) + 360.0d) % 360.0d;
    }

    /* access modifiers changed from: private */
    public static double longitudeDistanceHeadingWest(double d, double d2) {
        return ((d - d2) + 360.0d) % 360.0d;
    }

    public boolean contains(LatLng latLng) {
        return containsLatitude(latLng.getLatitude()) && containsLongitude(latLng.getLongitude());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LatLngBounds)) {
            return false;
        }
        LatLngBounds latLngBounds = (LatLngBounds) obj;
        return this.southwest.equals(latLngBounds.southwest) && this.northeast.equals(latLngBounds.northeast);
    }

    public LatLng getNortheast() {
        return this.northeast;
    }

    public LatLng getSouthwest() {
        return this.southwest;
    }

    public int getVersionCode() {
        return this.mVersionCode;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.southwest, this.northeast});
    }

    public LatLngBounds including(LatLng latLng) {
        double min = Math.min(this.southwest.getLatitude(), latLng.getLatitude());
        double max = Math.max(this.northeast.getLatitude(), latLng.getLatitude());
        double longitude = this.northeast.getLongitude();
        double longitude2 = this.southwest.getLongitude();
        double longitude3 = latLng.getLongitude();
        if (!containsLongitude(longitude3)) {
            if (longitudeDistanceHeadingWest(longitude2, longitude3) < longitudeDistanceHeadingEast(longitude, longitude3)) {
                longitude2 = longitude3;
            } else {
                longitude = longitude3;
            }
        }
        return new LatLngBounds(new LatLng(min, longitude2), new LatLng(max, longitude));
    }

    public boolean intersects(LatLngBounds latLngBounds) {
        if (latLngBounds == null) {
            return false;
        }
        return intersect(latLngBounds) || latLngBounds.intersect(this);
    }

    public String toString() {
        return "southwest" + this.southwest + "northeast" + this.northeast;
    }

    public boolean contains(LatLngBounds latLngBounds) {
        if (latLngBounds != null && contains(latLngBounds.southwest) && contains(latLngBounds.northeast)) {
            return true;
        }
        return false;
    }

    public LatLngBounds(LatLng latLng, LatLng latLng2) {
        this(1, latLng, latLng2);
    }

    public static final class Builder {
        /* access modifiers changed from: private */
        public double mEast = Double.NaN;
        /* access modifiers changed from: private */
        public double mNorth = Double.NEGATIVE_INFINITY;
        /* access modifiers changed from: private */
        public double mSouth = Double.POSITIVE_INFINITY;
        /* access modifiers changed from: private */
        public double mWest = Double.NaN;

        private boolean containsLongitude(double d) {
            double d2 = this.mWest;
            double d3 = this.mEast;
            return d2 <= d3 ? d2 <= d && d <= d3 : d2 <= d || d <= d3;
        }

        public LatLngBounds build() {
            return new LatLngBounds(new LatLng(this.mSouth, this.mWest), new LatLng(this.mNorth, this.mEast));
        }

        public Builder include(LatLng latLng) {
            this.mSouth = Math.min(this.mSouth, latLng.getLatitude());
            this.mNorth = Math.max(this.mNorth, latLng.getLatitude());
            double longitude = latLng.getLongitude();
            if (Double.isNaN(this.mWest)) {
                this.mWest = longitude;
                this.mEast = longitude;
            } else if (!containsLongitude(longitude)) {
                if (LatLngBounds.longitudeDistanceHeadingWest(this.mWest, longitude) < LatLngBounds.longitudeDistanceHeadingEast(this.mEast, longitude)) {
                    this.mWest = longitude;
                } else {
                    this.mEast = longitude;
                }
            }
            return this;
        }

        public Builder include(Iterable<LatLng> iterable) {
            if (iterable != null) {
                for (LatLng include : iterable) {
                    include(include);
                }
            }
            return this;
        }
    }
}
