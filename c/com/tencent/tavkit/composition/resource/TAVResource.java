package com.tencent.tavkit.composition.resource;

import com.tencent.tav.asset.AssetTrack;
import com.tencent.tav.asset.MutableComposition;
import com.tencent.tav.asset.MutableCompositionTrack;
import com.tencent.tav.coremedia.CGSize;
import com.tencent.tav.coremedia.CMTime;
import com.tencent.tav.coremedia.CMTimeRange;
import com.tencent.tavkit.ciimage.CIImage;
import java.util.ArrayList;
import java.util.List;

public abstract class TAVResource implements Cloneable {
    public CMTime duration;
    public CMTime scaledDuration = CMTime.CMTimeInvalid;
    public CMTimeRange sourceTimeRange;

    public TAVResource() {
        CMTime cMTime = CMTime.CMTimeZero;
        this.duration = cMTime;
        this.sourceTimeRange = new CMTimeRange(cMTime, cMTime);
    }

    public abstract TAVResource clone();

    public CMTime getDuration() {
        return this.duration;
    }

    public CMTime getScaledDuration() {
        return this.scaledDuration.equals(CMTime.CMTimeInvalid) ? this.sourceTimeRange.getDuration() : this.scaledDuration;
    }

    public CMTimeRange getSourceTimeRange() {
        return this.sourceTimeRange;
    }

    public CIImage imageAtTime(CMTime cMTime, CGSize cGSize) {
        return null;
    }

    public TrackInfo newEmptyTrackInfo(int i, int i2) {
        TrackInfo trackInfo = new TrackInfo();
        trackInfo.setTrack(tracksForType(i).get(i2));
        trackInfo.setSelectedTimeRange(new CMTimeRange(CMTime.CMTimeZero, new CMTime(1, 30)));
        trackInfo.setScaleToDuration(getScaledDuration());
        return trackInfo;
    }

    public void setDuration(CMTime cMTime) {
        this.duration = cMTime;
    }

    public void setScaledDuration(CMTime cMTime) {
        this.scaledDuration = cMTime;
    }

    public void setSourceTimeRange(CMTimeRange cMTimeRange) {
        this.sourceTimeRange = cMTimeRange.clone();
    }

    public String toString() {
        return "TAVResource{durationUs=" + this.duration.getTimeUs() + ", sourceTimeRange=" + this.sourceTimeRange.toSimpleString() + ", scaledDurationUs=" + this.scaledDuration.getTimeUs() + '}';
    }

    public TrackInfo trackInfoForType(int i, int i2) {
        return newEmptyTrackInfo(i, i2);
    }

    public List<AssetTrack> tracksForType(int i) {
        ArrayList arrayList = new ArrayList();
        MutableCompositionTrack addMutableTrackWithMediaType = new MutableComposition().addMutableTrackWithMediaType(i, 0);
        addMutableTrackWithMediaType.insertEmptyTimeRange(new CMTimeRange(CMTime.CMTimeZero, this.duration));
        arrayList.add(addMutableTrackWithMediaType);
        return arrayList;
    }
}
