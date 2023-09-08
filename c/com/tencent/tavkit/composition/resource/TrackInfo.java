package com.tencent.tavkit.composition.resource;

import com.tencent.tav.asset.AssetTrack;
import com.tencent.tav.asset.CompositionTrackSegment;
import com.tencent.tav.coremedia.CMTime;
import com.tencent.tav.coremedia.CMTimeRange;

public class TrackInfo {
    private CompositionTrackSegment compositionTrackSegment;
    private CMTime scaleToDuration;
    private CMTimeRange selectedTimeRange;
    private AssetTrack track;

    public CompositionTrackSegment getCompositionTrackSegment(CMTimeRange cMTimeRange) {
        return new CompositionTrackSegment(this.compositionTrackSegment.getSourcePath(), this.compositionTrackSegment.getSourceTrackID(), this.compositionTrackSegment.getTimeMapping().getSource(), cMTimeRange, this.compositionTrackSegment.getSourceType());
    }

    public int getMediaType() {
        AssetTrack assetTrack = this.track;
        if (assetTrack != null) {
            return assetTrack.getMediaType();
        }
        CompositionTrackSegment compositionTrackSegment2 = this.compositionTrackSegment;
        if (compositionTrackSegment2 == null) {
            return 0;
        }
        int sourceType = compositionTrackSegment2.getSourceType();
        if (sourceType == 3) {
            return 1;
        }
        return sourceType;
    }

    public CMTime getScaleToDuration() {
        return this.scaleToDuration;
    }

    public CMTimeRange getSelectedTimeRange() {
        return this.selectedTimeRange;
    }

    public AssetTrack getTrack() {
        return this.track;
    }

    public void setCompositionTrackSegment(CompositionTrackSegment compositionTrackSegment2) {
        this.compositionTrackSegment = compositionTrackSegment2;
    }

    public void setScaleToDuration(CMTime cMTime) {
        this.scaleToDuration = cMTime;
    }

    public void setSelectedTimeRange(CMTimeRange cMTimeRange) {
        this.selectedTimeRange = cMTimeRange;
    }

    public void setTrack(AssetTrack assetTrack) {
        this.track = assetTrack;
    }
}
