package hd3;

import com.tencent.p014mm.autogen.events.AppBrandSendAppMsgEvent;
import com.tencent.p014mm.pluginsdk.model.app.C72695v;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;

/* renamed from: hd3.a */
public class C87483a extends IStaticListener<AppBrandSendAppMsgEvent> {
    public boolean callback(IEvent iEvent) {
        AppBrandSendAppMsgEvent.C80704a aVar = ((AppBrandSendAppMsgEvent) iEvent).f236151d;
        C72695v.m85049B(aVar.f236152a, "", "", aVar.f236153b, 2, (String) null);
        return false;
    }
}
