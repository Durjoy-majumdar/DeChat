package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.C2CNYPredownloadVoiceEvent */
public final class C2CNYPredownloadVoiceEvent extends IEvent {

    /* renamed from: d */
    public C67665a f193507d = new C67665a();

    /* renamed from: com.tencent.mm.autogen.events.C2CNYPredownloadVoiceEvent$a */
    public static final class C67665a {

        /* renamed from: a */
        public String f193508a;

        /* renamed from: b */
        public String f193509b;

        /* renamed from: c */
        public long f193510c;
    }

    public C2CNYPredownloadVoiceEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof C2CNYPredownloadVoiceEvent)) {
            return false;
        }
        C67665a aVar = ((C2CNYPredownloadVoiceEvent) iEvent).f193507d;
        return C46238a.m51546a(this.f193507d.f193508a, aVar.f193508a) && C46238a.m51546a(this.f193507d.f193509b, aVar.f193509b) && C46238a.m51546a(Long.valueOf(this.f193507d.f193510c), Long.valueOf(aVar.f193510c));
    }
}
