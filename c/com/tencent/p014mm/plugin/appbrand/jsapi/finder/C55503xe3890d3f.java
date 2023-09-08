package com.tencent.p014mm.plugin.appbrand.jsapi.finder;

import androidx.lifecycle.C0124r;
import androidx.lifecycle.C112974b0;
import androidx.lifecycle.C39623j;
import com.tencent.p014mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask;
import com.tencent.p014mm.plugin.appbrand.jsapi.finder.JsApiNavigateToMiniProgramForFinderProductShare;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\u0004"}, mo182094d2 = {"com/tencent/mm/plugin/appbrand/jsapi/finder/JsApiNavigateToMiniProgramForFinderProductShare$NotifyClickTask$handleRequest$1", "Landroidx/lifecycle/r;", "Lrx3/b0;", "onActivityStopped", "plugin-appbrand-integration_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.finder.JsApiNavigateToMiniProgramForFinderProductShare$NotifyClickTask$handleRequest$1 */
public final class C55503xe3890d3f implements C0124r {

    /* renamed from: d */
    public final /* synthetic */ JsApiNavigateToMiniProgramForFinderProductShare.NotifyClickTask f158093d;

    public C55503xe3890d3f(JsApiNavigateToMiniProgramForFinderProductShare.NotifyClickTask notifyClickTask) {
        this.f158093d = notifyClickTask;
    }

    @C112974b0(C39623j.C39625b.ON_STOP)
    public final void onActivityStopped() {
        this.f158093d.getActivityContext().getLifecycle().removeObserver(this);
        this.f158093d.finishProcess((AppBrandProxyUIProcessTask.ProcessResult) null);
    }
}
