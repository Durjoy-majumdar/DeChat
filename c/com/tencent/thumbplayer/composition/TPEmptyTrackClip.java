package com.tencent.thumbplayer.composition;

import com.tencent.thumbplayer.api.composition.ITPMediaTrackClip;
import java.io.Serializable;

public class TPEmptyTrackClip extends TPMediaCommonAsset implements ITPMediaTrackClip, Serializable {
    private int mClipId;
    private int mClipType;
    private long mEndTime = 0;
    private long mStartPosition;
    private long mStartTime = 0;

    public TPEmptyTrackClip(int i) {
        this.mClipType = i;
        this.mClipId = TPMediaCompositionHelper.generateTrackClipId(i);
    }

    public ITPMediaTrackClip clone(int i) {
        if (i != 3 && i != 2 && i != 1) {
            return null;
        }
        TPEmptyTrackClip tPEmptyTrackClip = new TPEmptyTrackClip(i);
        tPEmptyTrackClip.mClipId = TPMediaCompositionHelper.generateTrackClipId(i);
        tPEmptyTrackClip.mStartTime = this.mStartTime;
        tPEmptyTrackClip.mEndTime = this.mEndTime;
        return tPEmptyTrackClip;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof TPEmptyTrackClip)) {
            return false;
        }
        TPEmptyTrackClip tPEmptyTrackClip = (TPEmptyTrackClip) obj;
        return this.mClipId == tPEmptyTrackClip.getClipId() && this.mClipType == tPEmptyTrackClip.getMediaType();
    }

    public int getClipId() {
        return this.mClipId;
    }

    public long getEndTimeMs() {
        return this.mEndTime;
    }

    public String getFilePath() {
        return null;
    }

    public int getMediaType() {
        return this.mClipType;
    }

    public long getOriginalDurationMs() {
        return this.mEndTime - this.mStartTime;
    }

    public long getStartPositionMs() {
        return this.mStartPosition;
    }

    public long getStartTimeMs() {
        return this.mStartTime;
    }

    public String getUrl() {
        return null;
    }

    public void setCutTimeRange(long j, long j2) {
        if (j < 0) {
            j = 0;
        }
        if (j < j2) {
            this.mStartTime = j;
            this.mEndTime = j2;
            return;
        }
        throw new IllegalArgumentException("setCutTimeRange: Start time is greater than end time");
    }

    public void setOriginalDurationMs(long j) {
    }

    public void setStartPositionMs(long j) {
        this.mStartPosition = j;
    }
}
