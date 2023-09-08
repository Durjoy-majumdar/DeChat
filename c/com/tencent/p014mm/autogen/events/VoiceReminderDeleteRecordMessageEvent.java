package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.VoiceReminderDeleteRecordMessageEvent */
public final class VoiceReminderDeleteRecordMessageEvent extends IEvent {

    /* renamed from: d */
    public C67815a f194008d = new C67815a();

    /* renamed from: com.tencent.mm.autogen.events.VoiceReminderDeleteRecordMessageEvent$a */
    public static final class C67815a {

        /* renamed from: a */
        public String f194009a;
    }

    public VoiceReminderDeleteRecordMessageEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof VoiceReminderDeleteRecordMessageEvent)) {
            return false;
        }
        return C46238a.m51546a(this.f194008d.f194009a, ((VoiceReminderDeleteRecordMessageEvent) iEvent).f194008d.f194009a);
    }
}
