package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.WebSearchConfigEvent */
public final class WebSearchConfigEvent extends IEvent {

    /* renamed from: d */
    public C67831a f194103d = new C67831a();

    /* renamed from: com.tencent.mm.autogen.events.WebSearchConfigEvent$a */
    public static final class C67831a {

        /* renamed from: a */
        public int f194104a;
    }

    public WebSearchConfigEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof WebSearchConfigEvent)) {
            return false;
        }
        return C46238a.m51546a(Integer.valueOf(this.f194103d.f194104a), Integer.valueOf(((WebSearchConfigEvent) iEvent).f194103d.f194104a));
    }
}
