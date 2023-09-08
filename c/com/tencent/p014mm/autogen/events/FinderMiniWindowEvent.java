package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.FinderMiniWindowEvent */
public final class FinderMiniWindowEvent extends IEvent {

    /* renamed from: d */
    public C55133a f154804d = new C55133a();

    /* renamed from: com.tencent.mm.autogen.events.FinderMiniWindowEvent$a */
    public static final class C55133a {

        /* renamed from: a */
        public int f154805a;

        /* renamed from: b */
        public int f154806b;
    }

    public FinderMiniWindowEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof FinderMiniWindowEvent)) {
            return false;
        }
        C55133a aVar = ((FinderMiniWindowEvent) iEvent).f154804d;
        return C46238a.m51546a(Integer.valueOf(this.f154804d.f154805a), Integer.valueOf(aVar.f154805a)) && C46238a.m51546a(Integer.valueOf(this.f154804d.f154806b), Integer.valueOf(aVar.f154806b));
    }
}
