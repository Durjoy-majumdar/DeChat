package com.tencent.thumbplayer.tplayer.reportv2.data.vod;

import com.tencent.thumbplayer.tplayer.reportv2.data.TPCommonParams;

public class TPVodBufferingParams extends TPCommonParams {
    @TPCommonParams.TPReportParam(key = "costtimems")
    private long mCostTimeMs = -1;
    @TPCommonParams.TPReportParam(key = "playspeed")
    private float mPlaySpeed = -1.0f;

    public long getCostTimeMs() {
        return this.mCostTimeMs;
    }

    public float getPlaySpeed() {
        return this.mPlaySpeed;
    }

    public void setCostTimeMs(long j) {
        this.mCostTimeMs = j;
    }

    public void setPlaySpeed(float f) {
        this.mPlaySpeed = f;
    }
}
