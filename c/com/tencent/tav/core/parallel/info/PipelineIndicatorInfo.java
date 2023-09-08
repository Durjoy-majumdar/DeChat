package com.tencent.tav.core.parallel.info;

import com.tencent.tav.core.AVAssetReaderStatus;
import com.tencent.tav.core.AssetParallelSegmentStatus;
import com.tencent.tav.core.AssetWriterStatus;
import com.tencent.tav.core.ExportErrorStatus;
import com.tencent.tav.coremedia.CMTimeRange;
import java.util.Locale;

public class PipelineIndicatorInfo {
    public ExportErrorStatus errorStatus;
    private long exportEndTimeMs;
    private long exportStartTimeMs;
    private int index;
    private float progress;
    public AVAssetReaderStatus readerStatus;
    private int retryCount = 0;
    private AssetParallelSegmentStatus segmentStatus;
    public CMTimeRange timeRange;
    public int type;
    public AssetWriterStatus writerStatus;

    public PipelineIndicatorInfo(int i, int i2, CMTimeRange cMTimeRange) {
        this.type = i;
        this.index = i2;
        this.timeRange = cMTimeRange;
        this.segmentStatus = AssetParallelSegmentStatus.AssetParallelStatusUnknown;
        this.readerStatus = AVAssetReaderStatus.AssetReaderStatusUnknown;
        this.writerStatus = AssetWriterStatus.AssetWriterStatusUnknown;
        this.progress = 0.0f;
    }

    public static PipelineIndicatorInfo getAudioPipelineIndicatorInfo(CMTimeRange cMTimeRange) {
        return new PipelineIndicatorInfo(2, 0, cMTimeRange);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof PipelineIndicatorInfo)) {
            return false;
        }
        PipelineIndicatorInfo pipelineIndicatorInfo = (PipelineIndicatorInfo) obj;
        return this.type == pipelineIndicatorInfo.type && this.index == pipelineIndicatorInfo.index;
    }

    public boolean finished() {
        return this.segmentStatus == AssetParallelSegmentStatus.AssetReaderStatusWriteFinish;
    }

    public long getExportCostTimeMs() {
        return this.exportEndTimeMs - this.exportStartTimeMs;
    }

    public int getIndex() {
        return this.index;
    }

    public float getProgress() {
        return this.progress;
    }

    public int getRetryCount() {
        return this.retryCount;
    }

    public AssetParallelSegmentStatus getSegmentStatus() {
        return this.segmentStatus;
    }

    public void retry() {
        this.retryCount++;
        this.segmentStatus = AssetParallelSegmentStatus.AssetParallelStatusUnknown;
    }

    public void setCurrentTime(long j) {
        this.progress = (((float) j) * 1.0f) / ((float) this.timeRange.getDurationUs());
    }

    public void setProgress(float f) {
        this.progress = f;
    }

    public void setSegmentStatus(AssetParallelSegmentStatus assetParallelSegmentStatus) {
        this.segmentStatus = assetParallelSegmentStatus;
        if (assetParallelSegmentStatus == AssetParallelSegmentStatus.AssetParallelStatusStarted) {
            this.exportStartTimeMs = System.currentTimeMillis();
        } else if (assetParallelSegmentStatus == AssetParallelSegmentStatus.AssetReaderStatusWriteFinish || assetParallelSegmentStatus == AssetParallelSegmentStatus.AssetParallelStatusFailed || assetParallelSegmentStatus == AssetParallelSegmentStatus.AssetExportStatusCompleted || assetParallelSegmentStatus == AssetParallelSegmentStatus.AssetParallelStatusCancelled) {
            this.exportEndTimeMs = System.currentTimeMillis();
        }
    }

    public void setTimeRange(CMTimeRange cMTimeRange) {
        this.timeRange = cMTimeRange;
    }

    public String toString() {
        return String.format(Locale.ENGLISH, "index:%d type:%d status:%s timeRange:%s", new Object[]{Integer.valueOf(this.index), Integer.valueOf(this.type), this.segmentStatus, this.timeRange});
    }

    public boolean unKnown() {
        return this.segmentStatus == AssetParallelSegmentStatus.AssetParallelStatusUnknown;
    }
}
