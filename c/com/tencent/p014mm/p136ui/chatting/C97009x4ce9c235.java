package com.tencent.p014mm.p136ui.chatting;

import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.ExDeviceScanNetworkDeviceResultEvent;
import com.tencent.p014mm.p136ui.chatting.ChattingSendDataToDeviceUI;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, mo182094d2 = {"com/tencent/mm/ui/chatting/ChattingSendDataToDeviceUI$exDeviceScanNetworkDeviceResultListener$1", "Lcom/tencent/mm/sdk/event/IListener;", "Lcom/tencent/mm/autogen/events/ExDeviceScanNetworkDeviceResultEvent;", "feature-exdevice_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.ui.chatting.ChattingSendDataToDeviceUI$exDeviceScanNetworkDeviceResultListener$1 */
public final class C97009x4ce9c235 extends IListener<ExDeviceScanNetworkDeviceResultEvent> {

    /* renamed from: d */
    public final /* synthetic */ ChattingSendDataToDeviceUI f284303d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C97009x4ce9c235(ChattingSendDataToDeviceUI chattingSendDataToDeviceUI, C40008f fVar) {
        super(fVar);
        this.f284303d = chattingSendDataToDeviceUI;
    }

    public boolean callback(IEvent iEvent) {
        ExDeviceScanNetworkDeviceResultEvent exDeviceScanNetworkDeviceResultEvent = (ExDeviceScanNetworkDeviceResultEvent) iEvent;
        C87412m.m108594g(exDeviceScanNetworkDeviceResultEvent, "event");
        ChattingSendDataToDeviceUI chattingSendDataToDeviceUI = this.f284303d;
        if (chattingSendDataToDeviceUI.f284260V == null) {
            chattingSendDataToDeviceUI.f284260V = new ChattingSendDataToDeviceUI.C97003b();
        }
        ChattingSendDataToDeviceUI.C97003b bVar = chattingSendDataToDeviceUI.f284260V;
        if (bVar == null) {
            return false;
        }
        bVar.mo135703a(exDeviceScanNetworkDeviceResultEvent);
        return true;
    }
}
