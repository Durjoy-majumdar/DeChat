package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.storage.C72963f4;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.AppMsgInsertEvent */
public final class AppMsgInsertEvent extends IEvent {

    /* renamed from: d */
    public C28706a f78718d = new C28706a();

    /* renamed from: com.tencent.mm.autogen.events.AppMsgInsertEvent$a */
    public static final class C28706a {

        /* renamed from: a */
        public C72963f4 f78719a;

        /* renamed from: b */
        public C68070l.C68072b f78720b;
    }

    public AppMsgInsertEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof AppMsgInsertEvent)) {
            return false;
        }
        C28706a aVar = ((AppMsgInsertEvent) iEvent).f78718d;
        return C46238a.m51546a(this.f78718d.f78719a, aVar.f78719a) && C46238a.m51546a(this.f78718d.f78720b, aVar.f78720b);
    }
}
