package com.tencent.tavkit.composition.resource;

import com.tencent.tav.asset.CompositionTrackSegment;
import com.tencent.tav.coremedia.CGSize;
import com.tencent.tav.coremedia.CMTime;
import com.tencent.tav.coremedia.CMTimeRange;
import com.tencent.tavkit.ciimage.CIImage;

public class TAVImageTrackResource extends TAVResource {
    private boolean emptyAudioTrack;
    private String path;

    public TAVImageTrackResource(String str, CMTime cMTime) {
        this(str, cMTime, true);
    }

    public String getPath() {
        return this.path;
    }

    public CIImage imageAtTime(CMTime cMTime, CGSize cGSize) {
        return null;
    }

    public TrackInfo trackInfoForType(int i, int i2) {
        if (i != 1 && !this.emptyAudioTrack) {
            return null;
        }
        int i3 = i == 1 ? 3 : i;
        String str = this.path;
        CMTimeRange cMTimeRange = this.sourceTimeRange;
        CompositionTrackSegment compositionTrackSegment = new CompositionTrackSegment(str, 0, cMTimeRange, cMTimeRange, i3);
        TrackInfo trackInfo = new TrackInfo();
        trackInfo.setCompositionTrackSegment(compositionTrackSegment);
        trackInfo.setSelectedTimeRange(getSourceTimeRange());
        trackInfo.setScaleToDuration(getScaledDuration());
        return trackInfo;
    }

    public TAVImageTrackResource(String str, CMTime cMTime, boolean z) {
        this.path = str;
        this.emptyAudioTrack = z;
        this.duration = cMTime;
        this.sourceTimeRange = new CMTimeRange(CMTime.CMTimeZero, cMTime);
    }

    public TAVImageTrackResource clone() {
        TAVImageTrackResource tAVImageTrackResource = new TAVImageTrackResource(this.path, this.duration.clone());
        tAVImageTrackResource.sourceTimeRange = this.sourceTimeRange.clone();
        tAVImageTrackResource.scaledDuration = this.scaledDuration.clone();
        return tAVImageTrackResource;
    }
}
