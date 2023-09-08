package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.RecallVoiceTransTextActEvent */
public final class RecallVoiceTransTextActEvent extends IEvent {

    /* renamed from: d */
    public C67769a f193871d = new C67769a();

    /* renamed from: com.tencent.mm.autogen.events.RecallVoiceTransTextActEvent$a */
    public static final class C67769a {

        /* renamed from: a */
        public long f193872a;
    }

    public RecallVoiceTransTextActEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof RecallVoiceTransTextActEvent)) {
            return false;
        }
        return C46238a.m51546a(Long.valueOf(this.f193871d.f193872a), Long.valueOf(((RecallVoiceTransTextActEvent) iEvent).f193871d.f193872a));
    }
}
