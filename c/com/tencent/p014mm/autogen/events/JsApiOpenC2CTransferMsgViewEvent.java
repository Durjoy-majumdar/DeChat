package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.JsApiOpenC2CTransferMsgViewEvent */
public final class JsApiOpenC2CTransferMsgViewEvent extends IEvent {

    /* renamed from: d */
    public C28766a f78843d = new C28766a();

    /* renamed from: com.tencent.mm.autogen.events.JsApiOpenC2CTransferMsgViewEvent$a */
    public static final class C28766a {

        /* renamed from: a */
        public String f78844a;

        /* renamed from: b */
        public String f78845b;

        /* renamed from: c */
        public Long f78846c;
    }

    public JsApiOpenC2CTransferMsgViewEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof JsApiOpenC2CTransferMsgViewEvent)) {
            return false;
        }
        C28766a aVar = ((JsApiOpenC2CTransferMsgViewEvent) iEvent).f78843d;
        this.f78843d.getClass();
        aVar.getClass();
        return C46238a.m51546a((Object) null, (Object) null) && C46238a.m51546a(this.f78843d.f78844a, aVar.f78844a) && C46238a.m51546a(this.f78843d.f78845b, aVar.f78845b) && C46238a.m51546a(this.f78843d.f78846c, aVar.f78846c);
    }
}
