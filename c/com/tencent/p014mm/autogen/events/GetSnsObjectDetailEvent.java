package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.protocal.protobuf.SnsObject;
import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.GetSnsObjectDetailEvent */
public final class GetSnsObjectDetailEvent extends IEvent {

    /* renamed from: d */
    public C1083a f9304d = new C1083a();

    /* renamed from: e */
    public C1084b f9305e = new C1084b();

    /* renamed from: com.tencent.mm.autogen.events.GetSnsObjectDetailEvent$a */
    public static final class C1083a {

        /* renamed from: a */
        public int f9306a;
    }

    /* renamed from: com.tencent.mm.autogen.events.GetSnsObjectDetailEvent$b */
    public static final class C1084b {

        /* renamed from: a */
        public SnsObject f9307a;
    }

    public GetSnsObjectDetailEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof GetSnsObjectDetailEvent)) {
            return false;
        }
        GetSnsObjectDetailEvent getSnsObjectDetailEvent = (GetSnsObjectDetailEvent) iEvent;
        if (!C46238a.m51546a(Integer.valueOf(this.f9304d.f9306a), Integer.valueOf(getSnsObjectDetailEvent.f9304d.f9306a))) {
            return false;
        }
        return C46238a.m51546a(this.f9305e.f9307a, getSnsObjectDetailEvent.f9305e.f9307a);
    }
}
