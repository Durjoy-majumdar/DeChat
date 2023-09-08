package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.ScrollChattingUIConversationListEvent */
public final class ScrollChattingUIConversationListEvent extends IEvent {

    /* renamed from: d */
    public C67784a f193923d = new C67784a();

    /* renamed from: com.tencent.mm.autogen.events.ScrollChattingUIConversationListEvent$a */
    public static final class C67784a {

        /* renamed from: a */
        public String f193924a;

        /* renamed from: b */
        public long f193925b;
    }

    public ScrollChattingUIConversationListEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof ScrollChattingUIConversationListEvent)) {
            return false;
        }
        C67784a aVar = ((ScrollChattingUIConversationListEvent) iEvent).f193923d;
        return C46238a.m51546a(this.f193923d.f193924a, aVar.f193924a) && C46238a.m51546a(Long.valueOf(this.f193923d.f193925b), Long.valueOf(aVar.f193925b));
    }
}
