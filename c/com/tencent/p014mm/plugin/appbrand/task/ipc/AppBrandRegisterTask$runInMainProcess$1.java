package com.tencent.p014mm.plugin.appbrand.task.ipc;

import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.CoreAccountInitializationNotifiedEvent;
import com.tencent.p014mm.plugin.appbrand.config.AppBrandInitConfigWC;
import com.tencent.p014mm.plugin.appbrand.config.C81648d;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, mo182094d2 = {"com/tencent/mm/plugin/appbrand/task/ipc/AppBrandRegisterTask$runInMainProcess$1", "Lcom/tencent/mm/sdk/event/IListener;", "Lcom/tencent/mm/autogen/events/CoreAccountInitializationNotifiedEvent;", "plugin-appbrand-integration_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.appbrand.task.ipc.AppBrandRegisterTask$runInMainProcess$1 */
public final class AppBrandRegisterTask$runInMainProcess$1 extends IListener<CoreAccountInitializationNotifiedEvent> {

    /* renamed from: d */
    public final /* synthetic */ AppBrandInitConfigWC f246186d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AppBrandRegisterTask$runInMainProcess$1(AppBrandInitConfigWC appBrandInitConfigWC, C40008f fVar) {
        super(fVar);
        this.f246186d = appBrandInitConfigWC;
    }

    public boolean callback(IEvent iEvent) {
        C87412m.m108594g((CoreAccountInitializationNotifiedEvent) iEvent, "event");
        C81648d g = C81648d.m100144g();
        AppBrandInitConfigWC appBrandInitConfigWC = this.f246186d;
        g.mo124412e(appBrandInitConfigWC.f234839s, appBrandInitConfigWC);
        dead();
        return false;
    }
}
