package com.tencent.p014mm.plugin.appbrand.launching.teenmode;

import com.tencent.p014mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask;
import com.tencent.p014mm.plugin.appbrand.launching.teenmode.AppBrandTeenModeTempAuthMgr;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32227p;
import kotlin.Metadata;
import rx3.C13598b0;
import z04.C112551y;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\u0006"}, mo182094d2 = {"com/tencent/mm/plugin/appbrand/launching/teenmode/AppBrandTeenModeTempAuthMgr$jumpToSendAuthorizationReqUI$3", "Lcom/tencent/mm/plugin/appbrand/ipc/AppBrandProxyUIProcessTask$b;", "Lcom/tencent/mm/plugin/appbrand/launching/teenmode/AppBrandTeenModeTempAuthMgr$IPCGoAuthResult;", "result", "Lrx3/b0;", "onReceiveResult", "plugin-appbrand-integration_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.appbrand.launching.teenmode.AppBrandTeenModeTempAuthMgr$jumpToSendAuthorizationReqUI$3 */
public final class AppBrandTeenModeTempAuthMgr$jumpToSendAuthorizationReqUI$3 implements AppBrandProxyUIProcessTask.C81943b<AppBrandTeenModeTempAuthMgr.IPCGoAuthResult> {
    public final /* synthetic */ C32227p<String, Boolean, C13598b0> $afterCheckAuthCallback;

    public AppBrandTeenModeTempAuthMgr$jumpToSendAuthorizationReqUI$3(C32227p<? super String, ? super Boolean, C13598b0> pVar) {
        this.$afterCheckAuthCallback = pVar;
    }

    public void onReceiveResult(AppBrandTeenModeTempAuthMgr.IPCGoAuthResult iPCGoAuthResult) {
        String q;
        Log.m105924i("MicroMsg.AppBrandTeenModeTempAuthMgr", "IProcessResultReceiver got");
        if (iPCGoAuthResult == null) {
            Log.m105924i("MicroMsg.AppBrandTeenModeTempAuthMgr", "IProcessResultReceiver got result null");
            return;
        }
        Log.m105924i("MicroMsg.AppBrandTeenModeTempAuthMgr", "IProcessResultReceiver got bizKey:" + iPCGoAuthResult.getBizKey() + " canGoOn:" + iPCGoAuthResult.getCanGoOn());
        C32227p<String, Boolean, C13598b0> pVar = this.$afterCheckAuthCallback;
        String bizKey = iPCGoAuthResult.getBizKey();
        String str = "";
        if (!(bizKey == null || (q = C112551y.m153817q(bizKey, "weapp_", str, false)) == null)) {
            str = q;
        }
        pVar.invoke(str, Boolean.valueOf(iPCGoAuthResult.getCanGoOn()));
    }
}
