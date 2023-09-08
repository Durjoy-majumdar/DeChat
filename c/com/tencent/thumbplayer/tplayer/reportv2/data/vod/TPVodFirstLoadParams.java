package com.tencent.thumbplayer.tplayer.reportv2.data.vod;

import com.tencent.thumbplayer.tplayer.reportv2.data.TPCommonParams;

public class TPVodFirstLoadParams extends TPCommonParams {
    @TPCommonParams.TPReportParam(key = "costtimems")
    private long mCostTimeMs = -1;

    public long getCostTimeMs() {
        return this.mCostTimeMs;
    }

    public void setCostTimeMs(long j) {
        this.mCostTimeMs = j;
    }
}
