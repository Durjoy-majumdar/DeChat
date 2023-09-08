package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.ForwardUpdateMsgIdEvent */
public final class ForwardUpdateMsgIdEvent extends IEvent {

    /* renamed from: d */
    public C92520a f264876d = new C92520a();

    /* renamed from: com.tencent.mm.autogen.events.ForwardUpdateMsgIdEvent$a */
    public static final class C92520a {

        /* renamed from: a */
        public long f264877a = -1;

        /* renamed from: b */
        public long f264878b = -1;

        /* renamed from: c */
        public String f264879c;
    }

    public ForwardUpdateMsgIdEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof ForwardUpdateMsgIdEvent)) {
            return false;
        }
        C92520a aVar = ((ForwardUpdateMsgIdEvent) iEvent).f264876d;
        return C46238a.m51546a(Long.valueOf(this.f264876d.f264877a), Long.valueOf(aVar.f264877a)) && C46238a.m51546a(Long.valueOf(this.f264876d.f264878b), Long.valueOf(aVar.f264878b)) && C46238a.m51546a(this.f264876d.f264879c, aVar.f264879c);
    }
}
