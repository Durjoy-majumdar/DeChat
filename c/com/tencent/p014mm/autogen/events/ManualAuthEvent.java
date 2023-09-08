package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.ManualAuthEvent */
public final class ManualAuthEvent extends IEvent {

    /* renamed from: d */
    public C28777a f78867d = new C28777a();

    /* renamed from: com.tencent.mm.autogen.events.ManualAuthEvent$a */
    public static final class C28777a {

        /* renamed from: a */
        public boolean f78868a;
    }

    public ManualAuthEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof ManualAuthEvent)) {
            return false;
        }
        return C46238a.m51546a(Boolean.valueOf(this.f78867d.f78868a), Boolean.valueOf(((ManualAuthEvent) iEvent).f78867d.f78868a));
    }
}
