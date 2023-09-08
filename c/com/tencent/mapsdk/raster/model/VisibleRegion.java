package com.tencent.mapsdk.raster.model;

import java.util.Arrays;

public final class VisibleRegion {
    private final LatLng farLeft;
    private final LatLng farRight;
    private final LatLngBounds latLngBounds;
    private final int mVersionCode;
    private final LatLng nearLeft;
    private final LatLng nearRight;

    public VisibleRegion(int i, LatLng latLng, LatLng latLng2, LatLng latLng3, LatLng latLng4, LatLngBounds latLngBounds2) {
        this.mVersionCode = i;
        this.nearLeft = latLng;
        this.nearRight = latLng2;
        this.farLeft = latLng3;
        this.farRight = latLng4;
        this.latLngBounds = latLngBounds2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VisibleRegion)) {
            return false;
        }
        VisibleRegion visibleRegion = (VisibleRegion) obj;
        return getNearLeft().equals(visibleRegion.getNearLeft()) && getNearRight().equals(visibleRegion.getNearRight()) && getFarLeft().equals(visibleRegion.getFarLeft()) && getFarRight().equals(visibleRegion.getFarRight()) && getLatLngBounds().equals(visibleRegion.getLatLngBounds());
    }

    public LatLng getFarLeft() {
        return this.farLeft;
    }

    public LatLng getFarRight() {
        return this.farRight;
    }

    public LatLngBounds getLatLngBounds() {
        return this.latLngBounds;
    }

    public LatLng getNearLeft() {
        return this.nearLeft;
    }

    public LatLng getNearRight() {
        return this.nearRight;
    }

    public int getVersionCode() {
        return this.mVersionCode;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{getNearLeft(), getNearRight(), getFarLeft(), getFarRight(), getLatLngBounds()});
    }

    public String toString() {
        return "nearLeft" + this.nearLeft + "nearRight" + this.nearRight + "farLeft" + this.farLeft + "farRight" + this.farRight + "latLngBounds" + this.latLngBounds;
    }

    public VisibleRegion(LatLng latLng, LatLng latLng2, LatLng latLng3, LatLng latLng4, LatLngBounds latLngBounds2) {
        this(1, latLng, latLng2, latLng3, latLng4, latLngBounds2);
    }
}
