package com.tencent.tav.core;

import com.tencent.tav.coremedia.CMSampleBuffer;
import com.tencent.tav.coremedia.CMTimeRange;
import com.tencent.tav.report.AverageTimeReporter;
import java.util.List;

public abstract class AssetReaderOutput {
    public boolean alwaysCopiesSampleData = false;
    public int mediaType;
    private StatusListener statusListener;
    public boolean supportsRandomAccess = false;
    public CMTimeRange timeRange;

    public interface StatusListener {
        void statusChanged(AssetReaderOutput assetReaderOutput, AVAssetReaderStatus aVAssetReaderStatus);
    }

    public void addStatusListener(StatusListener statusListener2) {
        this.statusListener = statusListener2;
    }

    public final CMSampleBuffer copyNextSampleBuffer(boolean z) {
        CMSampleBuffer nextSampleBuffer = nextSampleBuffer(z);
        if (nextSampleBuffer.getTime().getTimeUs() > 0) {
            return nextSampleBuffer;
        }
        if (nextSampleBuffer.getState().getStateCode() == -1) {
            StatusListener statusListener2 = this.statusListener;
            if (statusListener2 != null) {
                statusListener2.statusChanged(this, AVAssetReaderStatus.AssetReaderStatusCompleted);
            }
            return nextSampleBuffer;
        }
        StatusListener statusListener3 = this.statusListener;
        if (statusListener3 != null) {
            statusListener3.statusChanged(this, AVAssetReaderStatus.AssetReaderStatusFailed);
        }
        return nextSampleBuffer;
    }

    public long duration() {
        return 0;
    }

    public AverageTimeReporter getDecodePerformance() {
        return null;
    }

    public int getMediaType() {
        return this.mediaType;
    }

    public boolean isAlwaysCopiesSampleData() {
        return this.alwaysCopiesSampleData;
    }

    public boolean isSupportsRandomAccess() {
        return this.supportsRandomAccess;
    }

    public abstract void markConfigurationAsFinal();

    public abstract CMSampleBuffer nextSampleBuffer(boolean z);

    public abstract void release();

    public void reset(CMTimeRange cMTimeRange) {
    }

    public abstract void resetForReadingTimeRanges(List<CMTimeRange> list);

    public void setAlwaysCopiesSampleData(boolean z) {
        this.alwaysCopiesSampleData = z;
    }

    public void setSupportsRandomAccess(boolean z) {
        this.supportsRandomAccess = z;
    }

    public void start(IContextCreate iContextCreate, CMTimeRange cMTimeRange) {
        this.timeRange = cMTimeRange;
    }
}
