package com.tencent.p014mm.plugin.appbrand;

import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.XWebViewInitCompleteEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.xweb.XWebSdk;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, mo182094d2 = {"com/tencent/mm/plugin/appbrand/AppBrandPersistentRuntimeConfig$watchApp$2", "Lcom/tencent/mm/sdk/event/IListener;", "Lcom/tencent/mm/autogen/events/XWebViewInitCompleteEvent;", "plugin-appbrand-integration_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.appbrand.AppBrandPersistentRuntimeConfig$watchApp$2 */
public final class AppBrandPersistentRuntimeConfig$watchApp$2 extends IListener<XWebViewInitCompleteEvent> {
    public AppBrandPersistentRuntimeConfig$watchApp$2(C40008f fVar) {
        super(fVar);
    }

    public boolean callback(IEvent iEvent) {
        C87412m.m108594g((XWebViewInitCompleteEvent) iEvent, "event");
        if (!XWebSdk.isXWebView()) {
            return false;
        }
        MultiProcessMMKV.getMMKV("MicroMsg.AppBrandPersistentRuntimeConfig").putBoolean("KEY_XWEB_INSTALLED", XWebSdk.hasXWebFeature(2003)).commit();
        return false;
    }
}
