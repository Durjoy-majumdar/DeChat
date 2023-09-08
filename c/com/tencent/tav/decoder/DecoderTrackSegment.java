package com.tencent.tav.decoder;

import com.tencent.tav.asset.AssetTrack;
import com.tencent.tav.asset.AssetTrackSegment;
import com.tencent.tav.coremedia.CMTime;
import com.tencent.tav.coremedia.CMTimeRange;

public class DecoderTrackSegment {
    private CMTime decoderStartTime;
    private CMTime scaledDuration;
    private CMTimeRange timeRange;
    private DecoderAssetTrack videoAsset;

    public DecoderTrackSegment(long j) {
        this(new CMTimeRange(CMTime.CMTimeZero, new CMTime(((float) j) / 1000.0f)), (DecoderAssetTrack) null);
    }

    public CMTime getDecoderStartTime() {
        return this.decoderStartTime;
    }

    public CMTime getScaledDuration() {
        return this.scaledDuration;
    }

    public CMTimeRange getTimeRange() {
        return this.timeRange;
    }

    public DecoderAssetTrack getVideoAsset() {
        return this.videoAsset;
    }

    public void setScaledDuration(CMTime cMTime) {
        this.scaledDuration = cMTime;
    }

    public void setTimeRange(CMTimeRange cMTimeRange) {
        this.timeRange = cMTimeRange;
    }

    public DecoderTrackSegment(CMTimeRange cMTimeRange, DecoderAssetTrack decoderAssetTrack) {
        this.videoAsset = decoderAssetTrack;
        this.timeRange = cMTimeRange;
        this.scaledDuration = cMTimeRange.getDuration();
        this.decoderStartTime = CMTime.CMTimeZero;
    }

    public DecoderTrackSegment(AssetTrack assetTrack, AssetTrackSegment assetTrackSegment) {
        this(assetTrackSegment.getTimeMapping().getSource().clone(), DecoderAssetTrack.create(assetTrack, assetTrackSegment));
        setScaledDuration(assetTrackSegment.getScaleDuration());
    }
}
