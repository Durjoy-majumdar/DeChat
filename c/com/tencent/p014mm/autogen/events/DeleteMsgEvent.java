package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.DeleteMsgEvent */
public final class DeleteMsgEvent extends IEvent {

    /* renamed from: d */
    public C28727a f78765d = new C28727a();

    /* renamed from: com.tencent.mm.autogen.events.DeleteMsgEvent$a */
    public static final class C28727a {

        /* renamed from: a */
        public long f78766a;

        /* renamed from: b */
        public String f78767b;

        /* renamed from: c */
        public int f78768c;
    }

    public DeleteMsgEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof DeleteMsgEvent)) {
            return false;
        }
        C28727a aVar = ((DeleteMsgEvent) iEvent).f78765d;
        return C46238a.m51546a(Long.valueOf(this.f78765d.f78766a), Long.valueOf(aVar.f78766a)) && C46238a.m51546a(this.f78765d.f78767b, aVar.f78767b) && C46238a.m51546a(Integer.valueOf(this.f78765d.f78768c), Integer.valueOf(aVar.f78768c));
    }
}
