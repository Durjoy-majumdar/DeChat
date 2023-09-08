package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.NewEdgeScriptDeleteEvent */
public final class NewEdgeScriptDeleteEvent extends IEvent {

    /* renamed from: d */
    public C114681a f343578d = new C114681a();

    /* renamed from: com.tencent.mm.autogen.events.NewEdgeScriptDeleteEvent$a */
    public static final class C114681a {

        /* renamed from: a */
        public long f343579a;
    }

    public NewEdgeScriptDeleteEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof NewEdgeScriptDeleteEvent)) {
            return false;
        }
        return C46238a.m51546a(Long.valueOf(this.f343578d.f343579a), Long.valueOf(((NewEdgeScriptDeleteEvent) iEvent).f343578d.f343579a));
    }
}
