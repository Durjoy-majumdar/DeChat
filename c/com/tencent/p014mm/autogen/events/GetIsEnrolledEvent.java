package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.GetIsEnrolledEvent */
public final class GetIsEnrolledEvent extends IEvent {

    /* renamed from: d */
    public C17679a f48096d = new C17679a();

    /* renamed from: e */
    public C17680b f48097e = new C17680b();

    /* renamed from: com.tencent.mm.autogen.events.GetIsEnrolledEvent$a */
    public static final class C17679a {

        /* renamed from: a */
        public int f48098a = -1;
    }

    /* renamed from: com.tencent.mm.autogen.events.GetIsEnrolledEvent$b */
    public static final class C17680b {

        /* renamed from: a */
        public int f48099a = 0;
    }

    public GetIsEnrolledEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof GetIsEnrolledEvent)) {
            return false;
        }
        GetIsEnrolledEvent getIsEnrolledEvent = (GetIsEnrolledEvent) iEvent;
        if (!C46238a.m51546a(Integer.valueOf(this.f48096d.f48098a), Integer.valueOf(getIsEnrolledEvent.f48096d.f48098a))) {
            return false;
        }
        return C46238a.m51546a(Integer.valueOf(this.f48097e.f48099a), Integer.valueOf(getIsEnrolledEvent.f48097e.f48099a));
    }
}
