package com.tencent.mars.xlog;

import com.tencent.mars.xlog.WindowCounter;

public final /* synthetic */ class LogMonitor$$c implements WindowCounter.TriggeredCallBack {
    public final void onThresholdTriggered(String str, String str2, int i) {
        LogMonitor.report(str, str2, i, 114, 18);
    }
}
