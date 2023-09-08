package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.GetMsgHandlerSizeEvent */
public final class GetMsgHandlerSizeEvent extends IEvent {

    /* renamed from: d */
    public C1082a f9303d = new C1082a();

    /* renamed from: com.tencent.mm.autogen.events.GetMsgHandlerSizeEvent$a */
    public static final class C1082a {
    }

    public GetMsgHandlerSizeEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof GetMsgHandlerSizeEvent)) {
            return false;
        }
        C1082a aVar = ((GetMsgHandlerSizeEvent) iEvent).f9303d;
        this.f9303d.getClass();
        aVar.getClass();
        return C46238a.m51546a(0, 0);
    }
}
