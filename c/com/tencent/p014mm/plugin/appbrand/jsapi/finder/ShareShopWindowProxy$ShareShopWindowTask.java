package com.tencent.p014mm.plugin.appbrand.jsapi.finder;

import android.content.Intent;
import androidx.lifecycle.C0124r;
import androidx.lifecycle.C112974b0;
import androidx.lifecycle.C39623j;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask;
import di3.C86312j;
import gy3.C87412m;
import ht1.C60200t1;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0004\u001a\u00020\u0003H\u0007¨\u0006\u0007"}, mo182094d2 = {"com/tencent/mm/plugin/appbrand/jsapi/finder/ShareShopWindowProxy$ShareShopWindowTask", "Lcom/tencent/mm/plugin/appbrand/ipc/AppBrandProxyUIProcessTask;", "Landroidx/lifecycle/r;", "Lrx3/b0;", "onActivityStopped", "<init>", "()V", "plugin-appbrand-integration_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.finder.ShareShopWindowProxy$ShareShopWindowTask */
final class ShareShopWindowProxy$ShareShopWindowTask extends AppBrandProxyUIProcessTask implements C0124r {
    public void handleRequest(AppBrandProxyUIProcessTask.ProcessRequest processRequest) {
        Intent intent;
        C39623j lifecycle;
        ShareShopWindowProxy$ShareShopWindowRequest shareShopWindowProxy$ShareShopWindowRequest = processRequest instanceof ShareShopWindowProxy$ShareShopWindowRequest ? (ShareShopWindowProxy$ShareShopWindowRequest) processRequest : null;
        if (shareShopWindowProxy$ShareShopWindowRequest == null || (intent = shareShopWindowProxy$ShareShopWindowRequest.f158099d) == null) {
            finishProcess((AppBrandProxyUIProcessTask.ProcessResult) null);
            return;
        }
        MMActivity activityContext = getActivityContext();
        C87412m.m108593f(activityContext, "activityContext");
        ((C60200t1) C86312j.m106911c(C60200t1.class)).mo76805Rl(activityContext, intent);
        MMActivity activityContext2 = getActivityContext();
        if (activityContext2 != null && (lifecycle = activityContext2.getLifecycle()) != null) {
            lifecycle.addObserver(this);
        }
    }

    @C112974b0(C39623j.C39625b.ON_STOP)
    public final void onActivityStopped() {
        finishProcess((AppBrandProxyUIProcessTask.ProcessResult) null);
    }
}
