package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.RefreshMainUIMultitalkIconEvent */
public final class RefreshMainUIMultitalkIconEvent extends IEvent {

    /* renamed from: d */
    public C104595a f310010d = new C104595a();

    /* renamed from: com.tencent.mm.autogen.events.RefreshMainUIMultitalkIconEvent$a */
    public static final class C104595a {

        /* renamed from: a */
        public int f310011a = 0;
    }

    public RefreshMainUIMultitalkIconEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof RefreshMainUIMultitalkIconEvent)) {
            return false;
        }
        return C46238a.m51546a(Integer.valueOf(this.f310010d.f310011a), Integer.valueOf(((RefreshMainUIMultitalkIconEvent) iEvent).f310010d.f310011a));
    }
}
