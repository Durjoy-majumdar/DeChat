package com.tencent.p014mm.plugin.rtos.p320ui;

import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.RtosCancelLoginEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import kotlin.Metadata;
import pk2.C21988n;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, mo182094d2 = {"com/tencent/mm/plugin/rtos/ui/RtosWatchLoginUI$rtosCancelLoginEventListener$1", "Lcom/tencent/mm/sdk/event/IListener;", "Lcom/tencent/mm/autogen/events/RtosCancelLoginEvent;", "feature-exdevice_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.rtos.ui.RtosWatchLoginUI$rtosCancelLoginEventListener$1 */
public final class RtosWatchLoginUI$rtosCancelLoginEventListener$1 extends IListener<RtosCancelLoginEvent> {

    /* renamed from: d */
    public final /* synthetic */ RtosWatchLoginUI f53384d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RtosWatchLoginUI$rtosCancelLoginEventListener$1(RtosWatchLoginUI rtosWatchLoginUI, C40008f fVar) {
        super(fVar);
        this.f53384d = rtosWatchLoginUI;
    }

    public boolean callback(IEvent iEvent) {
        C87412m.m108594g((RtosCancelLoginEvent) iEvent, "event");
        Log.m105924i("MicroMsg.Rtos.RtosWatchLoginUI", "callback rtos cancel login event.");
        this.f53384d.f53351H.sendEmptyMessage(1008);
        RtosWatchLoginUI rtosWatchLoginUI = this.f53384d;
        rtosWatchLoginUI.f53351H.postUI(new C21988n(rtosWatchLoginUI));
        this.f53384d.mo24201I7();
        return true;
    }
}
