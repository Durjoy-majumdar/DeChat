package com.tencent.tavkit.composition.resource;

import com.tencent.tav.asset.Asset;
import com.tencent.tav.asset.AssetTrack;
import com.tencent.tav.asset.URLAsset;
import com.tencent.tav.coremedia.CMTime;
import com.tencent.tav.coremedia.CMTimeRange;
import java.util.ArrayList;
import java.util.List;

public class TAVAssetTrackResource extends TAVResource {
    private Asset asset;

    public TAVAssetTrackResource(String str) {
        this((Asset) new URLAsset(str));
    }

    public Asset getAsset() {
        return this.asset;
    }

    public TrackInfo trackInfoForType(int i, int i2) {
        TrackInfo trackInfo = new TrackInfo();
        trackInfo.setTrack(tracksForType(i).get(i2));
        trackInfo.setSelectedTimeRange(getSourceTimeRange());
        trackInfo.setScaleToDuration(getScaledDuration());
        return trackInfo;
    }

    public List<AssetTrack> tracksForType(int i) {
        Asset asset2 = this.asset;
        return asset2 != null ? asset2.tracksWithMediaType(i) : new ArrayList();
    }

    public TAVAssetTrackResource(Asset asset2) {
        this.asset = asset2;
        this.duration = asset2.getDuration();
        this.sourceTimeRange = new CMTimeRange(CMTime.CMTimeZero, asset2.getDuration());
    }

    public TAVResource clone() {
        TAVAssetTrackResource tAVAssetTrackResource = new TAVAssetTrackResource(this.asset);
        tAVAssetTrackResource.sourceTimeRange = this.sourceTimeRange.clone();
        tAVAssetTrackResource.scaledDuration = this.scaledDuration.clone();
        tAVAssetTrackResource.duration = this.duration.clone();
        return tAVAssetTrackResource;
    }
}
