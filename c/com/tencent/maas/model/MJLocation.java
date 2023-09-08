package com.tencent.maas.model;

import java.util.Objects;

public class MJLocation {
    private final float latitude;
    private final float longitude;

    public MJLocation(float f, float f2) {
        this.longitude = f;
        this.latitude = f2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MJLocation mJLocation = (MJLocation) obj;
        return Float.compare(mJLocation.longitude, this.longitude) == 0 && Float.compare(mJLocation.latitude, this.latitude) == 0;
    }

    public float getLatitude() {
        return this.latitude;
    }

    public float getLongitude() {
        return this.longitude;
    }

    public int hashCode() {
        return Objects.hash(new Object[]{Integer.valueOf((int) (this.longitude * 100.0f)), Integer.valueOf((int) (this.latitude * 10.0f))});
    }
}
