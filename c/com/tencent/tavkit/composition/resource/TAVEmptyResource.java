package com.tencent.tavkit.composition.resource;

import com.tencent.tav.coremedia.CMTime;
import com.tencent.tav.coremedia.CMTimeRange;

public class TAVEmptyResource extends TAVResource {
    private boolean insertTimeRange;

    public TAVEmptyResource(CMTime cMTime) {
        this(cMTime, true);
    }

    public void setInsertTimeRange(boolean z) {
        this.insertTimeRange = z;
    }

    public TrackInfo trackInfoForType(int i, int i2) {
        if (this.insertTimeRange) {
            return super.trackInfoForType(i, i2);
        }
        return null;
    }

    public TAVEmptyResource(CMTime cMTime, boolean z) {
        this.insertTimeRange = z;
        this.duration = cMTime;
        this.sourceTimeRange = new CMTimeRange(CMTime.CMTimeZero, cMTime);
    }

    public TAVResource clone() {
        TAVEmptyResource tAVEmptyResource = new TAVEmptyResource(this.duration.clone());
        tAVEmptyResource.sourceTimeRange = this.sourceTimeRange.clone();
        tAVEmptyResource.scaledDuration = this.scaledDuration.clone();
        return tAVEmptyResource;
    }
}
