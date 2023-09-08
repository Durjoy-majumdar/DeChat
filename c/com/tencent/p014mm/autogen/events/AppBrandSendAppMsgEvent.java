package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.AppBrandSendAppMsgEvent */
public final class AppBrandSendAppMsgEvent extends IEvent {

    /* renamed from: d */
    public C80704a f236151d = new C80704a();

    /* renamed from: com.tencent.mm.autogen.events.AppBrandSendAppMsgEvent$a */
    public static final class C80704a {

        /* renamed from: a */
        public WXMediaMessage f236152a;

        /* renamed from: b */
        public String f236153b;
    }

    public AppBrandSendAppMsgEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof AppBrandSendAppMsgEvent)) {
            return false;
        }
        C80704a aVar = ((AppBrandSendAppMsgEvent) iEvent).f236151d;
        return C46238a.m51546a(this.f236151d.f236152a, aVar.f236152a) && C46238a.m51546a(this.f236151d.f236153b, aVar.f236153b);
    }
}
