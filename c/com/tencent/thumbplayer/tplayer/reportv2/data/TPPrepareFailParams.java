package com.tencent.thumbplayer.tplayer.reportv2.data;

import com.tencent.thumbplayer.tplayer.reportv2.data.TPCommonParams;

public class TPPrepareFailParams extends TPCommonParams {
    @TPCommonParams.TPReportParam(key = "errorcode")
    private int mErrorCode = -1;

    public int getErrorCode() {
        return this.mErrorCode;
    }

    public void setErrorCode(int i) {
        this.mErrorCode = i;
    }
}
