package com.tencent.p014mm.plugin.appbrand.report;

import com.tencent.p014mm.plugin.appbrand.report.AppBrandIDKeyBatchReport;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;

/* renamed from: com.tencent.mm.plugin.appbrand.report.h */
public class C84114h implements MTimerHandler.CallBack {
    public boolean onTimerExpired() {
        Log.m105918d("MicroMsg.AppBrandIDKeyBatchReport", "startReport run in TimerTask!");
        AppBrandIDKeyBatchReport.C84097b.m103642b();
        return true;
    }
}
