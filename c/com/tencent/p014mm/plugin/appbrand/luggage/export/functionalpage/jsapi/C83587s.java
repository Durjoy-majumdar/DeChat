package com.tencent.p014mm.plugin.appbrand.luggage.export.functionalpage.jsapi;

import android.util.SparseArray;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32226l;
import gy3.C87412m;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.jsapi.s */
public final class C83587s extends AppBrandProxyUIProcessTask {

    /* renamed from: d */
    public final String f244151d = "MicroMsg.AppBrand.FunctionalDirectApi.ProxyTask";

    public void handleRequest(AppBrandProxyUIProcessTask.ProcessRequest processRequest) {
        ProxyRequest proxyRequest = processRequest instanceof ProxyRequest ? (ProxyRequest) processRequest : null;
        if (proxyRequest == null) {
            Log.m105920e(this.f244151d, "errorReturn reason:Invalid ProxyRequest");
            finishProcess((AppBrandProxyUIProcessTask.ProcessResult) null);
            return;
        }
        SparseArray<C32226l<MMActivity, C13598b0>> sparseArray = C83567a.f244116a;
        int i = proxyRequest.f244115d;
        C87412m.m108594g(sparseArray, "<this>");
        C32226l<MMActivity, C13598b0> lVar = sparseArray.get(i);
        if (lVar != null) {
            sparseArray.remove(i);
        }
        C32226l lVar2 = lVar;
        if (lVar2 == null) {
            Log.m105920e(this.f244151d, "errorReturn reason:Invalid functionHash");
            finishProcess((AppBrandProxyUIProcessTask.ProcessResult) null);
            return;
        }
        MMActivity activityContext = getActivityContext();
        C87412m.m108593f(activityContext, "activityContext");
        lVar2.invoke(activityContext);
    }
}
