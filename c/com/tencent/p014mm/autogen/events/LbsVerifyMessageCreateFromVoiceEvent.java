package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.storage.C72963f4;
import eb0.z3$$h;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.LbsVerifyMessageCreateFromVoiceEvent */
public final class LbsVerifyMessageCreateFromVoiceEvent extends IEvent {

    /* renamed from: d */
    public C67726a f193721d = new C67726a();

    /* renamed from: com.tencent.mm.autogen.events.LbsVerifyMessageCreateFromVoiceEvent$a */
    public static final class C67726a {

        /* renamed from: a */
        public C72963f4 f193722a;

        /* renamed from: b */
        public z3$$h f193723b;
    }

    public LbsVerifyMessageCreateFromVoiceEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof LbsVerifyMessageCreateFromVoiceEvent)) {
            return false;
        }
        C67726a aVar = ((LbsVerifyMessageCreateFromVoiceEvent) iEvent).f193721d;
        return C46238a.m51546a(this.f193721d.f193722a, aVar.f193722a) && C46238a.m51546a(this.f193721d.f193723b, aVar.f193723b);
    }
}
