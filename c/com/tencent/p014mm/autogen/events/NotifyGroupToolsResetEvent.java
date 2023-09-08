package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.storage.C72963f4;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.NotifyGroupToolsResetEvent */
public final class NotifyGroupToolsResetEvent extends IEvent {

    /* renamed from: d */
    public C28783a f78880d = new C28783a();

    /* renamed from: com.tencent.mm.autogen.events.NotifyGroupToolsResetEvent$a */
    public static final class C28783a {

        /* renamed from: a */
        public C72963f4 f78881a;
    }

    public NotifyGroupToolsResetEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof NotifyGroupToolsResetEvent)) {
            return false;
        }
        return C46238a.m51546a(this.f78880d.f78881a, ((NotifyGroupToolsResetEvent) iEvent).f78880d.f78881a);
    }
}
