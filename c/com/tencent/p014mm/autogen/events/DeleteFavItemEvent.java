package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.DeleteFavItemEvent */
public final class DeleteFavItemEvent extends IEvent {

    /* renamed from: d */
    public C28726a f78763d = new C28726a();

    /* renamed from: com.tencent.mm.autogen.events.DeleteFavItemEvent$a */
    public static final class C28726a {

        /* renamed from: a */
        public long f78764a = -1;
    }

    public DeleteFavItemEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof DeleteFavItemEvent)) {
            return false;
        }
        return C46238a.m51546a(Long.valueOf(this.f78763d.f78764a), Long.valueOf(((DeleteFavItemEvent) iEvent).f78763d.f78764a));
    }
}
