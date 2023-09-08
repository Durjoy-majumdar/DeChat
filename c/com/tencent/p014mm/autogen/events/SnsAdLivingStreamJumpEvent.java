package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.SnsAdLivingStreamJumpEvent */
public final class SnsAdLivingStreamJumpEvent extends IEvent {

    /* renamed from: d */
    public C55163a f154872d = new C55163a();

    /* renamed from: com.tencent.mm.autogen.events.SnsAdLivingStreamJumpEvent$a */
    public static final class C55163a {

        /* renamed from: a */
        public String f154873a;
    }

    public SnsAdLivingStreamJumpEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof SnsAdLivingStreamJumpEvent)) {
            return false;
        }
        if (!C46238a.m51546a(this.f154872d.f154873a, ((SnsAdLivingStreamJumpEvent) iEvent).f154872d.f154873a)) {
            return false;
        }
        this.f154872d.getClass();
        return C46238a.m51546a((Object) null, (Object) null);
    }
}
