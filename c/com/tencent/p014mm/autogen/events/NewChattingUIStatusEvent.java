package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.NewChattingUIStatusEvent */
public final class NewChattingUIStatusEvent extends IEvent {

    /* renamed from: d */
    public C67735a f193747d = new C67735a();

    /* renamed from: com.tencent.mm.autogen.events.NewChattingUIStatusEvent$a */
    public static final class C67735a {

        /* renamed from: a */
        public int f193748a;
    }

    public NewChattingUIStatusEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof NewChattingUIStatusEvent)) {
            return false;
        }
        return C46238a.m51546a(Integer.valueOf(this.f193747d.f193748a), Integer.valueOf(((NewChattingUIStatusEvent) iEvent).f193747d.f193748a));
    }
}
