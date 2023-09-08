package com.tencent.tav.asset;

import com.tencent.tav.coremedia.CMTime;
import com.tencent.tav.coremedia.CMTimeMapping;
import com.tencent.tav.coremedia.CMTimeRange;

public class AssetTrackSegment {
    public boolean empty;
    public CMTime scaleDuration = CMTime.CMTimeZero;
    public CMTimeMapping timeMapping;
    public CMTimeRange timeRange;

    public AssetTrackSegment() {
    }

    public CMTime getScaleDuration() {
        return this.scaleDuration;
    }

    public CMTimeMapping getTimeMapping() {
        return this.timeMapping;
    }

    public boolean isEmpty() {
        return this.empty;
    }

    public AssetTrackSegment(CMTimeRange cMTimeRange, CMTimeRange cMTimeRange2) {
        this.timeMapping = new CMTimeMapping(cMTimeRange, cMTimeRange2);
        this.scaleDuration = cMTimeRange2.getDuration().clone();
        this.timeRange = cMTimeRange2.clone();
    }
}
