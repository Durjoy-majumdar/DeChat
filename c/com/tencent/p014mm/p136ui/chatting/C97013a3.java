package com.tencent.p014mm.p136ui.chatting;

import com.tencent.p014mm.autogen.events.ExDeviceSendDataToNetworkDeviceStateEvent;
import com.tencent.p014mm.plugin.exdevice.model.C93366l1;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import te3.C64454it2;
import te3.C64478jt2;

/* renamed from: com.tencent.mm.ui.chatting.a3 */
public final class C97013a3 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ IEvent f284327d;

    /* renamed from: e */
    public final /* synthetic */ ChattingSendDataToDeviceUI f284328e;

    public C97013a3(IEvent iEvent, ChattingSendDataToDeviceUI chattingSendDataToDeviceUI) {
        this.f284327d = iEvent;
        this.f284328e = chattingSendDataToDeviceUI;
    }

    public final void run() {
        IEvent iEvent = this.f284327d;
        C87412m.m108592e(iEvent, "null cannot be cast to non-null type com.tencent.mm.autogen.events.ExDeviceSendDataToNetworkDeviceStateEvent");
        ExDeviceSendDataToNetworkDeviceStateEvent exDeviceSendDataToNetworkDeviceStateEvent = (ExDeviceSendDataToNetworkDeviceStateEvent) iEvent;
        ExDeviceSendDataToNetworkDeviceStateEvent.C92487a aVar = exDeviceSendDataToNetworkDeviceStateEvent.f264737d;
        String str = aVar.f264739a;
        String str2 = aVar.f264741c;
        Log.m105925i(this.f284328e.f284273d, "sendDataState %s deviceId %s progress %d", str, str2, Integer.valueOf(aVar.f264740b), exDeviceSendDataToNetworkDeviceStateEvent.f264737d.f264742d);
        C93366l1 l1Var = this.f284328e.f284264X;
        if (l1Var != null && C87412m.m108589b(l1Var.f269424d, str2)) {
            C64478jt2 jt22 = null;
            if (exDeviceSendDataToNetworkDeviceStateEvent.f264737d.f264742d != null) {
                Log.m105924i(this.f284328e.f284273d, "event.data.msg != null");
                jt22 = new C64478jt2();
                jt22.parseFrom(exDeviceSendDataToNetworkDeviceStateEvent.f264737d.f264742d);
            }
            C64478jt2 jt23 = jt22;
            if (exDeviceSendDataToNetworkDeviceStateEvent.f264737d.f264743e != null) {
                C64454it2 it22 = new C64454it2();
                it22.parseFrom(exDeviceSendDataToNetworkDeviceStateEvent.f264737d.f264743e);
                ChattingSendDataToDeviceUI chattingSendDataToDeviceUI = this.f284328e;
                C87412m.m108593f(str, "sendDataState");
                ChattingSendDataToDeviceUI.m124692O7(chattingSendDataToDeviceUI, str, it22, jt23, (String) null, 8, (Object) null);
                return;
            }
            ChattingSendDataToDeviceUI chattingSendDataToDeviceUI2 = this.f284328e;
            C87412m.m108593f(str, "sendDataState");
            ChattingSendDataToDeviceUI.m124692O7(chattingSendDataToDeviceUI2, str, (C64454it2) null, jt23, (String) null, 8, (Object) null);
        }
    }
}
