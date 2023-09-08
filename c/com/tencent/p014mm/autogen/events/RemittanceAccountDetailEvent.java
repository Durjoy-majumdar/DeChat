package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.RemittanceAccountDetailEvent */
public final class RemittanceAccountDetailEvent extends IEvent {

    /* renamed from: d */
    public C67774a f193883d = new C67774a();

    /* renamed from: com.tencent.mm.autogen.events.RemittanceAccountDetailEvent$a */
    public static final class C67774a {

        /* renamed from: a */
        public int f193884a;

        /* renamed from: b */
        public String f193885b;

        /* renamed from: c */
        public String f193886c;

        /* renamed from: d */
        public String f193887d;
    }

    public RemittanceAccountDetailEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof RemittanceAccountDetailEvent)) {
            return false;
        }
        C67774a aVar = ((RemittanceAccountDetailEvent) iEvent).f193883d;
        return C46238a.m51546a(Integer.valueOf(this.f193883d.f193884a), Integer.valueOf(aVar.f193884a)) && C46238a.m51546a(this.f193883d.f193885b, aVar.f193885b) && C46238a.m51546a(this.f193883d.f193886c, aVar.f193886c) && C46238a.m51546a(this.f193883d.f193887d, aVar.f193887d);
    }
}
