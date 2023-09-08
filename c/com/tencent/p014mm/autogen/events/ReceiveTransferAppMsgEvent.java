package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.ReceiveTransferAppMsgEvent */
public final class ReceiveTransferAppMsgEvent extends IEvent {

    /* renamed from: d */
    public C40157a f107727d = new C40157a();

    /* renamed from: com.tencent.mm.autogen.events.ReceiveTransferAppMsgEvent$a */
    public static final class C40157a {

        /* renamed from: a */
        public String f107728a;

        /* renamed from: b */
        public long f107729b;

        /* renamed from: c */
        public C68070l.C68072b f107730c;
    }

    public ReceiveTransferAppMsgEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof ReceiveTransferAppMsgEvent)) {
            return false;
        }
        C40157a aVar = ((ReceiveTransferAppMsgEvent) iEvent).f107727d;
        return C46238a.m51546a(this.f107727d.f107728a, aVar.f107728a) && C46238a.m51546a(Long.valueOf(this.f107727d.f107729b), Long.valueOf(aVar.f107729b)) && C46238a.m51546a(this.f107727d.f107730c, aVar.f107730c);
    }
}
