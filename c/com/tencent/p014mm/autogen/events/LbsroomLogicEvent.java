package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.LbsroomLogicEvent */
public final class LbsroomLogicEvent extends IEvent {

    /* renamed from: d */
    public C67727a f193724d = new C67727a();

    /* renamed from: e */
    public C67728b f193725e = new C67728b();

    /* renamed from: com.tencent.mm.autogen.events.LbsroomLogicEvent$a */
    public static final class C67727a {

        /* renamed from: a */
        public int f193726a = 0;
    }

    /* renamed from: com.tencent.mm.autogen.events.LbsroomLogicEvent$b */
    public static final class C67728b {

        /* renamed from: a */
        public boolean f193727a = false;
    }

    public LbsroomLogicEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof LbsroomLogicEvent)) {
            return false;
        }
        LbsroomLogicEvent lbsroomLogicEvent = (LbsroomLogicEvent) iEvent;
        if (!C46238a.m51546a(Integer.valueOf(this.f193724d.f193726a), Integer.valueOf(lbsroomLogicEvent.f193724d.f193726a))) {
            return false;
        }
        this.f193724d.getClass();
        if (!C46238a.m51546a((Object) null, (Object) null)) {
            return false;
        }
        this.f193724d.getClass();
        if (!C46238a.m51546a(0, 0)) {
            return false;
        }
        return C46238a.m51546a(Boolean.valueOf(this.f193725e.f193727a), Boolean.valueOf(lbsroomLogicEvent.f193725e.f193727a));
    }
}
