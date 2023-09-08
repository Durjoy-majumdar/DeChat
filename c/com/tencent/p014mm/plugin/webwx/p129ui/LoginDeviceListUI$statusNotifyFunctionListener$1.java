package com.tencent.p014mm.plugin.webwx.p129ui;

import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.StatusNotifyFunctionEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, mo182094d2 = {"com/tencent/mm/plugin/webwx/ui/LoginDeviceListUI$statusNotifyFunctionListener$1", "Lcom/tencent/mm/sdk/event/IListener;", "Lcom/tencent/mm/autogen/events/StatusNotifyFunctionEvent;", "app_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.webwx.ui.LoginDeviceListUI$statusNotifyFunctionListener$1 */
public final class LoginDeviceListUI$statusNotifyFunctionListener$1 extends IListener<StatusNotifyFunctionEvent> {

    /* renamed from: d */
    public final /* synthetic */ LoginDeviceListUI f82448d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LoginDeviceListUI$statusNotifyFunctionListener$1(LoginDeviceListUI loginDeviceListUI, C40008f fVar) {
        super(fVar);
        this.f82448d = loginDeviceListUI;
    }

    public boolean callback(IEvent iEvent) {
        StatusNotifyFunctionEvent statusNotifyFunctionEvent = (StatusNotifyFunctionEvent) iEvent;
        C87412m.m108594g(statusNotifyFunctionEvent, "event");
        Log.m105918d("MicroMsg.LoginDeviceListUI", "status Notify function");
        if (statusNotifyFunctionEvent.f79014d.f79015a != 8) {
            return false;
        }
        this.f82448d.finish();
        return false;
    }
}
