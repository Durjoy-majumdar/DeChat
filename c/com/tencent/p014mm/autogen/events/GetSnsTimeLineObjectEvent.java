package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.protocal.protobuf.TimeLineObject;
import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.GetSnsTimeLineObjectEvent */
public final class GetSnsTimeLineObjectEvent extends IEvent {

    /* renamed from: d */
    public C92526a f264897d = new C92526a();

    /* renamed from: e */
    public C92527b f264898e = new C92527b();

    /* renamed from: com.tencent.mm.autogen.events.GetSnsTimeLineObjectEvent$a */
    public static final class C92526a {

        /* renamed from: a */
        public String f264899a;
    }

    /* renamed from: com.tencent.mm.autogen.events.GetSnsTimeLineObjectEvent$b */
    public static final class C92527b {

        /* renamed from: a */
        public TimeLineObject f264900a;
    }

    public GetSnsTimeLineObjectEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof GetSnsTimeLineObjectEvent)) {
            return false;
        }
        GetSnsTimeLineObjectEvent getSnsTimeLineObjectEvent = (GetSnsTimeLineObjectEvent) iEvent;
        if (!C46238a.m51546a(this.f264897d.f264899a, getSnsTimeLineObjectEvent.f264897d.f264899a)) {
            return false;
        }
        return C46238a.m51546a(this.f264898e.f264900a, getSnsTimeLineObjectEvent.f264898e.f264900a);
    }
}
