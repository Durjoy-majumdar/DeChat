package com.tencent.tavkit.component;

import com.tencent.tav.coremedia.CMTime;
import com.tencent.tav.coremedia.CMTimeRange;

public class TAVTimeEffect {
    private boolean freeze = false;
    private int loopCount = 1;
    private boolean reverse = false;
    private CMTime scaledDuration = CMTime.CMTimeInvalid;
    private CMTimeRange timeRange;

    public int getLoopCount() {
        return Math.abs(this.loopCount);
    }

    public CMTime getScaledDuration() {
        return this.scaledDuration;
    }

    public CMTimeRange getTimeRange() {
        return this.timeRange;
    }

    public boolean isFreeze() {
        return this.freeze;
    }

    public boolean isReverse() {
        return this.reverse;
    }

    public void setFreeze(boolean z) {
        this.freeze = z;
    }

    public void setLoopCount(int i) {
        this.loopCount = i;
    }

    public void setReverse(boolean z) {
        this.reverse = z;
    }

    public void setScaledDuration(CMTime cMTime) {
        this.scaledDuration = cMTime;
    }

    public void setTimeRange(CMTimeRange cMTimeRange) {
        this.timeRange = cMTimeRange;
    }
}
