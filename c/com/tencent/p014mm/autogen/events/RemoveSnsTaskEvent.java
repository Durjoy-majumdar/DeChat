package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.RemoveSnsTaskEvent */
public final class RemoveSnsTaskEvent extends IEvent {

    /* renamed from: d */
    public C28798a f78916d = new C28798a();

    /* renamed from: com.tencent.mm.autogen.events.RemoveSnsTaskEvent$a */
    public static final class C28798a {

        /* renamed from: a */
        public int f78917a = -1;
    }

    public RemoveSnsTaskEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof RemoveSnsTaskEvent)) {
            return false;
        }
        return C46238a.m51546a(Integer.valueOf(this.f78916d.f78917a), Integer.valueOf(((RemoveSnsTaskEvent) iEvent).f78916d.f78917a));
    }
}
