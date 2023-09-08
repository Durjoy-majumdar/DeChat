package com.tencent.tav.asset;

import android.graphics.Matrix;
import com.tencent.tav.asset.AssetTrackSegment;
import com.tencent.tav.coremedia.CGSize;
import com.tencent.tav.coremedia.CMTime;
import com.tencent.tav.coremedia.CMTimeRange;
import com.tencent.tav.coremedia.TimeUtil;
import com.tencent.tav.extractor.AssetExtractor;
import com.tencent.tav.extractor.ExtractorUtils;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

public class AssetTrack<Segment extends AssetTrackSegment> {
    public static final int PersistentTrackID_Invalid = -1;
    public WeakReference<Asset> asset;
    public List<String> availableMetadataFormats;
    public List<String> availableTrackAssociationTypes;
    public List<MetadataItem> commonMetadata;
    public boolean enabled = true;
    public float estimatedDataRate;
    public int mediaType;
    public CGSize naturalSize;
    public int naturalTimeScale;
    public float nominalFrameRate = 30.0f;
    public int preferredRotation = 0;
    public Matrix preferredTransform;
    public float preferredVolume = 1.0f;
    public List<Segment> segments = new ArrayList();
    public String sourcePath;
    public CMTimeRange timeRange;
    public long totalSampleDataLength;
    public int trackID;

    public AssetTrack() {
    }

    public List<AssetTrack> associatedTracksOfType(String str) {
        return null;
    }

    public void createAssetTrackSegments(Asset asset2) {
        if (this.segments == null) {
            this.segments = new ArrayList();
        }
        if (asset2 != null && asset2.getTrackCount() > this.trackID) {
            CMTimeRange cMTimeRange = this.timeRange;
            this.segments.add(new AssetTrackSegment(cMTimeRange, cMTimeRange));
        }
    }

    public Asset getAsset() {
        WeakReference<Asset> weakReference = this.asset;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public List<String> getAvailableMetadataFormats() {
        return this.availableMetadataFormats;
    }

    public List<String> getAvailableTrackAssociationTypes() {
        return this.availableTrackAssociationTypes;
    }

    public List<MetadataItem> getCommonMetadata() {
        return this.commonMetadata;
    }

    public CMTime getDuration() {
        CMTimeRange cMTimeRange = this.timeRange;
        return cMTimeRange != null ? cMTimeRange.getDuration() : CMTime.CMTimeZero;
    }

    public float getEstimatedDataRate() {
        return this.estimatedDataRate;
    }

    public int getMediaType() {
        return this.mediaType;
    }

    public CGSize getNaturalSize() {
        return this.naturalSize;
    }

    public int getNaturalTimeScale() {
        return this.naturalTimeScale;
    }

    public float getNominalFrameRate() {
        return this.nominalFrameRate;
    }

    public int getPreferredRotation() {
        return this.preferredRotation;
    }

    public Matrix getPreferredTransform() {
        return this.preferredTransform;
    }

    public float getPreferredVolume() {
        return this.preferredVolume;
    }

    public List<Segment> getSegments() {
        return this.segments;
    }

    public String getSourcePath() {
        return this.sourcePath;
    }

    public CMTimeRange getTimeRange() {
        CMTimeRange cMTimeRange = this.timeRange;
        if (cMTimeRange == null || cMTimeRange == CMTimeRange.CMTimeRangeInvalid) {
            this.timeRange = new CMTimeRange(CMTime.CMTimeZero, getDuration());
        }
        return this.timeRange;
    }

    public long getTotalSampleDataLength() {
        return this.totalSampleDataLength;
    }

    public int getTrackID() {
        return this.trackID;
    }

    public boolean hasMediaCharacteristic(String str) {
        return false;
    }

    public boolean isEnabled() {
        return this.enabled;
    }

    public List<MetadataItem> metadataForFormat(String str) {
        return null;
    }

    public CMTime samplePresentationTimeForTrackTime(CMTime cMTime) {
        AssetExtractor extractor;
        WeakReference<Asset> weakReference = this.asset;
        if (weakReference == null || weakReference.get() == null || (extractor = this.asset.get().getExtractor()) == null) {
            return null;
        }
        extractor.seekTo(cMTime.getTimeUs(), 2);
        if (extractor.getSampleTime() > cMTime.getTimeUs()) {
            extractor.seekTo(cMTime.getTimeUs(), 0);
        }
        return TimeUtil.us2CMTime(extractor.getSampleTime());
    }

    public AssetTrackSegment segmentForTrackTime(CMTime cMTime) {
        CMTimeRange target;
        List<Segment> list = this.segments;
        if (list == null) {
            return null;
        }
        for (Segment segment : list) {
            if (segment != null && (target = segment.getTimeMapping().getTarget()) != null && target.containsTime(cMTime)) {
                return segment;
            }
        }
        return null;
    }

    public void setPreferredRotation(int i) {
        this.preferredRotation = i;
    }

    public void setPreferredTransform(Matrix matrix) {
        this.preferredTransform = matrix;
    }

    public void setPreferredVolume(float f) {
        this.preferredVolume = f;
    }

    public AssetTrack(Asset asset2, int i, int i2, CMTimeRange cMTimeRange) {
        this.trackID = i;
        this.mediaType = i2;
        this.timeRange = cMTimeRange;
        if (asset2 != null && i < asset2.getTrackCount()) {
            this.asset = new WeakReference<>(asset2);
            this.nominalFrameRate = (float) ExtractorUtils.getFrameRate(asset2.getTrackFormat(i));
            this.naturalSize = asset2.getNaturalSize();
            this.sourcePath = asset2.getSourcePath();
        }
        createAssetTrackSegments(asset2);
    }
}
