package com.tencent.p014mm.plugin.appbrand.report;

import com.tencent.p014mm.plugin.appbrand.report.AppBrandIDKeyBatchReport;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;

/* renamed from: com.tencent.mm.plugin.appbrand.report.g */
public class C84113g implements MTimerHandler.CallBack {
    public boolean onTimerExpired() {
        AppBrandIDKeyBatchReport.C84097b.m103645e();
        Log.m105918d("MicroMsg.AppBrandIDKeyBatchReport", "on timer expired in monitor timer!");
        return true;
    }
}
