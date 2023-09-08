package com.tencent.thumbplayer.tplayer.reportv2.data.vod;

import com.tencent.thumbplayer.tplayer.reportv2.data.TPCommonParams;

public class TPVodSelectTrackParams extends TPCommonParams {
    @TPCommonParams.TPReportParam(key = "attachformat")
    private int mAttachFormat = -1;
    @TPCommonParams.TPReportParam(key = "costtimems")
    private long mCostTimeMs = -1;
    @TPCommonParams.TPReportParam(key = "errorcode")
    private int mErrorCode = -1;
    @TPCommonParams.TPReportParam(key = "mediatype")
    private int mMediaType = -1;

    public int getAttachFormat() {
        return this.mAttachFormat;
    }

    public long getCostTimeMs() {
        return this.mCostTimeMs;
    }

    public long getErrorCode() {
        return (long) this.mErrorCode;
    }

    public int getMediaType() {
        return this.mMediaType;
    }

    public void setAttachFormat(int i) {
        this.mAttachFormat = i;
    }

    public void setCostTimeMs(long j) {
        this.mCostTimeMs = j;
    }

    public void setErrorCode(int i) {
        this.mErrorCode = i;
    }

    public void setMediaType(int i) {
        this.mMediaType = i;
    }
}
