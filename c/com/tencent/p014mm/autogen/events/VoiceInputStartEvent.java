package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.VoiceInputStartEvent */
public final class VoiceInputStartEvent extends IEvent {

    /* renamed from: d */
    public C67813a f194002d = new C67813a();

    /* renamed from: com.tencent.mm.autogen.events.VoiceInputStartEvent$a */
    public static final class C67813a {

        /* renamed from: a */
        public boolean f194003a;
    }

    public VoiceInputStartEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof VoiceInputStartEvent)) {
            return false;
        }
        return C46238a.m51546a(Boolean.valueOf(this.f194002d.f194003a), Boolean.valueOf(((VoiceInputStartEvent) iEvent).f194002d.f194003a));
    }
}
