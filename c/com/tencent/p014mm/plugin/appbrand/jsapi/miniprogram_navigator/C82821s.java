package com.tencent.p014mm.plugin.appbrand.jsapi.miniprogram_navigator;

import com.tencent.p014mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask;
import com.tencent.p014mm.plugin.appbrand.launching.C83285a;
import com.tencent.p014mm.plugin.appbrand.launching.params.LaunchParcel;
import com.tencent.p014mm.plugin.appbrand.launching.precondition.C83428o;
import gy3.C87412m;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.s */
public final class C82821s extends AppBrandProxyUIProcessTask {
    public void handleRequest(AppBrandProxyUIProcessTask.ProcessRequest processRequest) {
        C87412m.m108592e(processRequest, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.NavigatorInterceptor.MMLaunchEntryProxyRequest");
        LaunchParcel launchParcel = ((NavigatorInterceptor$MMLaunchEntryProxyRequest) processRequest).f242152d;
        ((C83285a) C83428o.f243800a).mo115582b(getActivityContext(), launchParcel);
        finishProcess((AppBrandProxyUIProcessTask.ProcessResult) null);
    }
}
