package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.storage.C72963f4;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.VoiceReminderRemindEvent */
public final class VoiceReminderRemindEvent extends IEvent {

    /* renamed from: d */
    public C67816a f194010d = new C67816a();

    /* renamed from: com.tencent.mm.autogen.events.VoiceReminderRemindEvent$a */
    public static final class C67816a {

        /* renamed from: a */
        public String f194011a;

        /* renamed from: b */
        public String f194012b;

        /* renamed from: c */
        public C72963f4 f194013c;
    }

    public VoiceReminderRemindEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof VoiceReminderRemindEvent)) {
            return false;
        }
        C67816a aVar = ((VoiceReminderRemindEvent) iEvent).f194010d;
        return C46238a.m51546a(this.f194010d.f194011a, aVar.f194011a) && C46238a.m51546a(this.f194010d.f194012b, aVar.f194012b) && C46238a.m51546a(this.f194010d.f194013c, aVar.f194013c);
    }
}
