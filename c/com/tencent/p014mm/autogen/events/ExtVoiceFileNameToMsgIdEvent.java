package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.ExtVoiceFileNameToMsgIdEvent */
public final class ExtVoiceFileNameToMsgIdEvent extends IEvent {

    /* renamed from: d */
    public C67686a f193572d = new C67686a();

    /* renamed from: e */
    public C67687b f193573e = new C67687b();

    /* renamed from: com.tencent.mm.autogen.events.ExtVoiceFileNameToMsgIdEvent$a */
    public static final class C67686a {

        /* renamed from: a */
        public String f193574a;
    }

    /* renamed from: com.tencent.mm.autogen.events.ExtVoiceFileNameToMsgIdEvent$b */
    public static final class C67687b {

        /* renamed from: a */
        public long f193575a = 0;
    }

    public ExtVoiceFileNameToMsgIdEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof ExtVoiceFileNameToMsgIdEvent)) {
            return false;
        }
        ExtVoiceFileNameToMsgIdEvent extVoiceFileNameToMsgIdEvent = (ExtVoiceFileNameToMsgIdEvent) iEvent;
        if (!C46238a.m51546a(this.f193572d.f193574a, extVoiceFileNameToMsgIdEvent.f193572d.f193574a)) {
            return false;
        }
        return C46238a.m51546a(Long.valueOf(this.f193573e.f193575a), Long.valueOf(extVoiceFileNameToMsgIdEvent.f193573e.f193575a));
    }
}
