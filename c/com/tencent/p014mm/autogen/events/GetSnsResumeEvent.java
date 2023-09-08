package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.GetSnsResumeEvent */
public final class GetSnsResumeEvent extends IEvent {

    /* renamed from: d */
    public C92525a f264895d = new C92525a();

    /* renamed from: com.tencent.mm.autogen.events.GetSnsResumeEvent$a */
    public static final class C92525a {

        /* renamed from: a */
        public boolean f264896a = false;
    }

    public GetSnsResumeEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof GetSnsResumeEvent)) {
            return false;
        }
        return C46238a.m51546a(Boolean.valueOf(this.f264895d.f264896a), Boolean.valueOf(((GetSnsResumeEvent) iEvent).f264895d.f264896a));
    }
}
