package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.FinderCreateAccountResultEvent */
public final class FinderCreateAccountResultEvent extends IEvent {

    /* renamed from: d */
    public C1044a f9191d = new C1044a();

    /* renamed from: com.tencent.mm.autogen.events.FinderCreateAccountResultEvent$a */
    public static final class C1044a {

        /* renamed from: a */
        public int f9192a;
    }

    public FinderCreateAccountResultEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof FinderCreateAccountResultEvent)) {
            return false;
        }
        return C46238a.m51546a(Integer.valueOf(this.f9191d.f9192a), Integer.valueOf(((FinderCreateAccountResultEvent) iEvent).f9191d.f9192a));
    }
}
