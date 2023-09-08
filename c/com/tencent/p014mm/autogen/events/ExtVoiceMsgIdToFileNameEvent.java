package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.ExtVoiceMsgIdToFileNameEvent */
public final class ExtVoiceMsgIdToFileNameEvent extends IEvent {

    /* renamed from: d */
    public C92505a f264801d = new C92505a();

    /* renamed from: e */
    public C92506b f264802e = new C92506b();

    /* renamed from: com.tencent.mm.autogen.events.ExtVoiceMsgIdToFileNameEvent$a */
    public static final class C92505a {

        /* renamed from: a */
        public long f264803a;
    }

    /* renamed from: com.tencent.mm.autogen.events.ExtVoiceMsgIdToFileNameEvent$b */
    public static final class C92506b {

        /* renamed from: a */
        public String f264804a;
    }

    public ExtVoiceMsgIdToFileNameEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof ExtVoiceMsgIdToFileNameEvent)) {
            return false;
        }
        ExtVoiceMsgIdToFileNameEvent extVoiceMsgIdToFileNameEvent = (ExtVoiceMsgIdToFileNameEvent) iEvent;
        if (!C46238a.m51546a(Long.valueOf(this.f264801d.f264803a), Long.valueOf(extVoiceMsgIdToFileNameEvent.f264801d.f264803a))) {
            return false;
        }
        return C46238a.m51546a(this.f264802e.f264804a, extVoiceMsgIdToFileNameEvent.f264802e.f264804a);
    }
}
