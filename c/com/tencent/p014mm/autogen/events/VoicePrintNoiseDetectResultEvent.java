package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.VoicePrintNoiseDetectResultEvent */
public final class VoicePrintNoiseDetectResultEvent extends IEvent {

    /* renamed from: d */
    public C114699a f343640d = new C114699a();

    /* renamed from: com.tencent.mm.autogen.events.VoicePrintNoiseDetectResultEvent$a */
    public static final class C114699a {

        /* renamed from: a */
        public boolean f343641a;
    }

    public VoicePrintNoiseDetectResultEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof VoicePrintNoiseDetectResultEvent)) {
            return false;
        }
        return C46238a.m51546a(Boolean.valueOf(this.f343640d.f343641a), Boolean.valueOf(((VoicePrintNoiseDetectResultEvent) iEvent).f343640d.f343641a));
    }
}
