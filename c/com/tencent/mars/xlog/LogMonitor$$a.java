package com.tencent.mars.xlog;

import com.tencent.mars.xlog.WindowCounter;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import p1035sf.C90183c;

public final /* synthetic */ class LogMonitor$$a implements WindowCounter.TriggeredCallBack {
    public final void onThresholdTriggered(String str, String str2, int i) {
        Log.m105929w(LogMonitor.TAG, "log print frequently. tag=%s, log=%s, stack=%s, process=%s, logCount=%d", str, str2, C90183c.m112853a(), MMApplicationContext.getProcessName(), Integer.valueOf(i));
    }
}
