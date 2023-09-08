package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.FinderVideoStateEvent */
public final class FinderVideoStateEvent extends IEvent {

    /* renamed from: d */
    public C1069a f9265d = new C1069a();

    /* renamed from: com.tencent.mm.autogen.events.FinderVideoStateEvent$a */
    public static final class C1069a {
    }

    public FinderVideoStateEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof FinderVideoStateEvent)) {
            return false;
        }
        C1069a aVar = ((FinderVideoStateEvent) iEvent).f9265d;
        this.f9265d.getClass();
        aVar.getClass();
        if (!C46238a.m51546a(0, 0)) {
            return false;
        }
        this.f9265d.getClass();
        return C46238a.m51546a(0, 0);
    }
}
