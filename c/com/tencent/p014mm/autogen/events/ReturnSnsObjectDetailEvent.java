package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.protocal.protobuf.SnsObject;
import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.ReturnSnsObjectDetailEvent */
public final class ReturnSnsObjectDetailEvent extends IEvent {

    /* renamed from: d */
    public C1124a f9459d = new C1124a();

    /* renamed from: com.tencent.mm.autogen.events.ReturnSnsObjectDetailEvent$a */
    public static final class C1124a {

        /* renamed from: a */
        public SnsObject f9460a;
    }

    public ReturnSnsObjectDetailEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof ReturnSnsObjectDetailEvent)) {
            return false;
        }
        return C46238a.m51546a(this.f9459d.f9460a, ((ReturnSnsObjectDetailEvent) iEvent).f9459d.f9460a);
    }
}
