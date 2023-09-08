package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.FinderSendMsgEvent */
public final class FinderSendMsgEvent extends IEvent {

    /* renamed from: d */
    public C1060a f9242d = new C1060a();

    /* renamed from: com.tencent.mm.autogen.events.FinderSendMsgEvent$a */
    public static final class C1060a {

        /* renamed from: a */
        public WXMediaMessage f9243a;

        /* renamed from: b */
        public String f9244b;

        /* renamed from: c */
        public int f9245c;

        /* renamed from: d */
        public String f9246d;
    }

    public FinderSendMsgEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof FinderSendMsgEvent)) {
            return false;
        }
        C1060a aVar = ((FinderSendMsgEvent) iEvent).f9242d;
        return C46238a.m51546a(this.f9242d.f9243a, aVar.f9243a) && C46238a.m51546a(this.f9242d.f9244b, aVar.f9244b) && C46238a.m51546a(Integer.valueOf(this.f9242d.f9245c), Integer.valueOf(aVar.f9245c)) && C46238a.m51546a(this.f9242d.f9246d, aVar.f9246d);
    }
}
