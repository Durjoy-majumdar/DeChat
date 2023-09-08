package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.NewEdgeSqlDeleteEvent */
public final class NewEdgeSqlDeleteEvent extends IEvent {

    /* renamed from: d */
    public C114683a f343583d = new C114683a();

    /* renamed from: com.tencent.mm.autogen.events.NewEdgeSqlDeleteEvent$a */
    public static final class C114683a {

        /* renamed from: a */
        public long f343584a;
    }

    public NewEdgeSqlDeleteEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof NewEdgeSqlDeleteEvent)) {
            return false;
        }
        return C46238a.m51546a(Long.valueOf(this.f343583d.f343584a), Long.valueOf(((NewEdgeSqlDeleteEvent) iEvent).f343583d.f343584a));
    }
}
