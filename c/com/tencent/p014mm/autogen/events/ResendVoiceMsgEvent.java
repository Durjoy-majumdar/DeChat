package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.storage.C72963f4;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.ResendVoiceMsgEvent */
public final class ResendVoiceMsgEvent extends IEvent {

    /* renamed from: d */
    public C67781a f193917d = new C67781a();

    /* renamed from: com.tencent.mm.autogen.events.ResendVoiceMsgEvent$a */
    public static final class C67781a {

        /* renamed from: a */
        public C72963f4 f193918a;
    }

    public ResendVoiceMsgEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof ResendVoiceMsgEvent)) {
            return false;
        }
        return C46238a.m51546a(this.f193917d.f193918a, ((ResendVoiceMsgEvent) iEvent).f193917d.f193918a);
    }
}
