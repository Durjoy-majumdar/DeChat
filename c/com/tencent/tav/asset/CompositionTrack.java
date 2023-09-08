package com.tencent.tav.asset;

import com.tencent.tav.coremedia.CMTime;
import com.tencent.tav.coremedia.CMTimeRange;
import java.util.ArrayList;
import java.util.List;

public class CompositionTrack extends AssetTrack<CompositionTrackSegment> {
    public List<CompositionTrackSegment> segments = new ArrayList();

    public CompositionTrack() {
    }

    public List<CompositionTrackSegment> getSegments() {
        return this.segments;
    }

    public String toString() {
        return "CompositionTrack{segments=" + this.segments + ", trackID=" + this.trackID + ", mediaType=" + this.mediaType + '}';
    }

    public CompositionTrackSegment segmentForTrackTime(CMTime cMTime) {
        CMTimeRange target;
        List<CompositionTrackSegment> list = this.segments;
        if (list == null) {
            return null;
        }
        for (AssetTrackSegment next : list) {
            if (next != null && (target = next.getTimeMapping().getTarget()) != null && target.containsTime(cMTime) && (next instanceof CompositionTrackSegment)) {
                return (CompositionTrackSegment) next;
            }
        }
        return null;
    }

    public CompositionTrack(Asset asset, int i, int i2, CMTimeRange cMTimeRange) {
        super(asset, i, i2, cMTimeRange);
    }
}
