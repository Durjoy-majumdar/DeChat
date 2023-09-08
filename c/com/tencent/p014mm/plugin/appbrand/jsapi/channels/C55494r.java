package com.tencent.p014mm.plugin.appbrand.jsapi.channels;

import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask;
import com.tencent.p014mm.plugin.appbrand.jsapi.EmptyResult;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import gy3.C87412m;
import ht1.C60200t1;
import p565ir.C60605m;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.channels.r */
public final class C55494r extends AppBrandProxyUIProcessTask {
    public void handleRequest(AppBrandProxyUIProcessTask.ProcessRequest processRequest) {
        C60605m mVar;
        if (!(processRequest instanceof OpenChannelsPostPageRequest)) {
            Log.m105928w("MicroMsg.AppBrand.JsApiOpenChannelsPostPage", "handleRequest#OpenChannelsPostPageTask, request is not OpenChannelsPostPageRequest");
            return;
        }
        if (!(getActivityContext().getResources().getConfiguration().orientation == 1 || (mVar = (C60605m) C86312j.m106911c(C60605m.class)) == null)) {
            mVar.J50();
        }
        C60200t1 t1Var = (C60200t1) C86312j.m106911c(C60200t1.class);
        if (t1Var != null) {
            MMActivity activityContext = getActivityContext();
            C87412m.m108593f(activityContext, "activityContext");
            t1Var.mo76841dm(activityContext, ((OpenChannelsPostPageRequest) processRequest).f158066d);
        }
        finishProcess(new EmptyResult());
    }
}
