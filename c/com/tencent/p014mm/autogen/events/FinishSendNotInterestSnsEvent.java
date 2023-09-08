package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.FinishSendNotInterestSnsEvent */
public final class FinishSendNotInterestSnsEvent extends IEvent {

    /* renamed from: d */
    public C92518a f264869d = new C92518a();

    /* renamed from: com.tencent.mm.autogen.events.FinishSendNotInterestSnsEvent$a */
    public static final class C92518a {

        /* renamed from: a */
        public boolean f264870a = false;

        /* renamed from: b */
        public long f264871b = 0;
    }

    public FinishSendNotInterestSnsEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof FinishSendNotInterestSnsEvent)) {
            return false;
        }
        C92518a aVar = ((FinishSendNotInterestSnsEvent) iEvent).f264869d;
        return C46238a.m51546a(Boolean.valueOf(this.f264869d.f264870a), Boolean.valueOf(aVar.f264870a)) && C46238a.m51546a(Long.valueOf(this.f264869d.f264871b), Long.valueOf(aVar.f264871b));
    }
}
