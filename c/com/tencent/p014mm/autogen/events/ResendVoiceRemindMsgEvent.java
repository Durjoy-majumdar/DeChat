package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.storage.C72963f4;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.ResendVoiceRemindMsgEvent */
public final class ResendVoiceRemindMsgEvent extends IEvent {

    /* renamed from: d */
    public C67782a f193919d = new C67782a();

    /* renamed from: com.tencent.mm.autogen.events.ResendVoiceRemindMsgEvent$a */
    public static final class C67782a {

        /* renamed from: a */
        public C72963f4 f193920a;
    }

    public ResendVoiceRemindMsgEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof ResendVoiceRemindMsgEvent)) {
            return false;
        }
        return C46238a.m51546a(this.f193919d.f193920a, ((ResendVoiceRemindMsgEvent) iEvent).f193919d.f193920a);
    }
}
