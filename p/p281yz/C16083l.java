package p281yz;

import com.tencent.p014mm.autogen.events.RequestEnterWalletEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import di3.C86312j;
import gy3.C87412m;

/* renamed from: yz.l */
public final class C16083l extends IStaticListener<RequestEnterWalletEvent> {
    public boolean callback(IEvent iEvent) {
        RequestEnterWalletEvent requestEnterWalletEvent = (RequestEnterWalletEvent) iEvent;
        C87412m.m108594g(requestEnterWalletEvent, "event");
        RequestEnterWalletEvent.C1116a aVar = requestEnterWalletEvent.f9428d;
        ((C79173v) C86312j.m106911c(C79173v.class)).vx0(aVar.f9429a, aVar.f9430b);
        return true;
    }
}
