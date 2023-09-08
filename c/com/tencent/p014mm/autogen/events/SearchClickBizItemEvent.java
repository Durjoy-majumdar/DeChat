package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;
import te3.C50044jw;

/* renamed from: com.tencent.mm.autogen.events.SearchClickBizItemEvent */
public final class SearchClickBizItemEvent extends IEvent {

    /* renamed from: d */
    public C17690a f48124d = new C17690a();

    /* renamed from: com.tencent.mm.autogen.events.SearchClickBizItemEvent$a */
    public static final class C17690a {

        /* renamed from: a */
        public C50044jw f48125a;
    }

    public SearchClickBizItemEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof SearchClickBizItemEvent)) {
            return false;
        }
        return C46238a.m51546a(this.f48124d.f48125a, ((SearchClickBizItemEvent) iEvent).f48124d.f48125a);
    }
}
