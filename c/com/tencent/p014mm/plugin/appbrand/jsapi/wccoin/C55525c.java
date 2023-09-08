package com.tencent.p014mm.plugin.appbrand.jsapi.wccoin;

import com.tencent.p014mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask;
import com.tencent.p014mm.sdk.platformtools.Log;
import f40.C86709a0;
import gy3.C87412m;
import m53.C10756c;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.wccoin.c */
public final class C55525c extends AppBrandProxyUIProcessTask {

    /* renamed from: d */
    public final String f158126d = "MicroMsg.EnterWCCoinHomePageTask";

    public void handleRequest(AppBrandProxyUIProcessTask.ProcessRequest processRequest) {
        C87412m.m108594g(processRequest, "request");
        EnterWCCoinHomePageResult enterWCCoinHomePageResult = new EnterWCCoinHomePageResult();
        if (!(processRequest instanceof EnterWCCoinHomePageRequest)) {
            Log.m105928w(this.f158126d, "handleRequest, request not instance of ConsumeWCCoinRequest");
            enterWCCoinHomePageResult.f158120d = "fail";
            finishProcess(enterWCCoinHomePageResult);
            return;
        }
        if (((EnterWCCoinHomePageRequest) processRequest).f158119d.length() == 0) {
            enterWCCoinHomePageResult.f158120d = "fail";
            finishProcess(enterWCCoinHomePageResult);
            return;
        }
        ((C10756c) C86709a0.m107533q(C10756c.class)).mo10993S4(getActivityContext());
        enterWCCoinHomePageResult.f158120d = "ok";
        finishProcess(enterWCCoinHomePageResult);
    }
}
