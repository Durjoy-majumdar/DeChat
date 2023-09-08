package com.tencent.map.sdk.utilities.visualization.datamodels;

public class TrailLatLng {
    private TimeLatLng[] trailData;

    public TrailLatLng(TimeLatLng[] timeLatLngArr) {
        boolean z;
        if (timeLatLngArr == null || timeLatLngArr.length < 2) {
            this.trailData = new TimeLatLng[0];
            return;
        }
        int i = 0;
        while (true) {
            z = true;
            if (i >= timeLatLngArr.length - 1) {
                break;
            }
            int time = timeLatLngArr[i].getTime();
            i++;
            if (time >= timeLatLngArr[i].getTime()) {
                z = false;
                break;
            }
        }
        if (z) {
            this.trailData = timeLatLngArr;
        } else {
            this.trailData = new TimeLatLng[0];
        }
    }

    public TimeLatLng[] getTrailData() {
        return this.trailData;
    }
}
