package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.RunAiEvent */
public final class RunAiEvent extends IEvent {

    /* renamed from: d */
    public C28816a f78961d = new C28816a();

    /* renamed from: com.tencent.mm.autogen.events.RunAiEvent$a */
    public static final class C28816a {

        /* renamed from: a */
        public String f78962a;
    }

    public RunAiEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof RunAiEvent)) {
            return false;
        }
        return C46238a.m51546a(this.f78961d.f78962a, ((RunAiEvent) iEvent).f78961d.f78962a);
    }
}
