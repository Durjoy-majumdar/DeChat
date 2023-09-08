package com.tencent.thumbplayer.composition;

import android.text.TextUtils;
import com.tencent.thumbplayer.api.composition.ITPMediaTrackClip;
import java.io.Serializable;

public class TPMediaCompositionTrackClip extends TPMediaCommonAsset implements ITPMediaTrackClip, Serializable {
    private int mClipId;
    private String mClipPath;
    private int mClipType;
    private long mEndTime;
    private long mOriginalDuration;
    private long mStartPosition;
    private long mStartTime;

    private TPMediaCompositionTrackClip() {
    }

    public ITPMediaTrackClip clone(int i) {
        if (i != 3 && i != 2 && i != 1) {
            return null;
        }
        TPMediaCompositionTrackClip tPMediaCompositionTrackClip = new TPMediaCompositionTrackClip();
        tPMediaCompositionTrackClip.mClipType = i;
        tPMediaCompositionTrackClip.mClipId = TPMediaCompositionHelper.generateTrackClipId(this.mClipType);
        tPMediaCompositionTrackClip.mStartTime = this.mStartTime;
        tPMediaCompositionTrackClip.mEndTime = this.mEndTime;
        tPMediaCompositionTrackClip.mClipPath = this.mClipPath;
        return tPMediaCompositionTrackClip;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof TPMediaCompositionTrackClip)) {
            return false;
        }
        TPMediaCompositionTrackClip tPMediaCompositionTrackClip = (TPMediaCompositionTrackClip) obj;
        return this.mClipId == tPMediaCompositionTrackClip.getClipId() && this.mClipType == tPMediaCompositionTrackClip.getMediaType();
    }

    public int getClipId() {
        return this.mClipId;
    }

    public long getEndTimeMs() {
        return this.mEndTime;
    }

    public String getFilePath() {
        return this.mClipPath;
    }

    public int getMediaType() {
        return this.mClipType;
    }

    public long getOriginalDurationMs() {
        return this.mOriginalDuration;
    }

    public long getStartPositionMs() {
        return this.mStartPosition;
    }

    public long getStartTimeMs() {
        return this.mStartTime;
    }

    public String getUrl() {
        return this.mClipPath;
    }

    public void setCutTimeRange(long j, long j2) {
        if (j >= getOriginalDurationMs()) {
            throw new IllegalArgumentException("setCutTimeRange: Start time is greater than duration");
        } else if (j2 <= getOriginalDurationMs()) {
            if (j < 0) {
                j = 0;
            }
            if (j2 <= 0) {
                j2 = getOriginalDurationMs();
            }
            if (j < j2) {
                this.mStartTime = j;
                this.mEndTime = j2;
                return;
            }
            throw new IllegalArgumentException("setCutTimeRange: Start time is greater than end time");
        } else {
            throw new IllegalArgumentException("setCutTimeRange: Start time is greater than duration");
        }
    }

    public void setFilePath(String str) {
        this.mClipPath = str;
    }

    public void setOriginalDurationMs(long j) {
        this.mOriginalDuration = j;
    }

    public void setStartPositionMs(long j) {
        this.mStartPosition = j;
    }

    public TPMediaCompositionTrackClip(String str, int i) {
        this(str, i, 0, -1);
    }

    public TPMediaCompositionTrackClip(String str, int i, long j, long j2) {
        if (!TextUtils.isEmpty(str)) {
            this.mClipType = i;
            this.mClipPath = str;
            this.mStartTime = j;
            this.mEndTime = j2;
            if (j < 0) {
                this.mStartTime = 0;
            }
            if (j2 <= 0) {
                this.mEndTime = getOriginalDurationMs();
            }
            this.mClipId = TPMediaCompositionHelper.generateTrackClipId(this.mClipType);
            return;
        }
        throw new IllegalArgumentException("TPMediaCompositionTrackClip : clipPath empty");
    }
}
