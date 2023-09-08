package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.FinderVideoStateActionEvent */
public final class FinderVideoStateActionEvent extends IEvent {

    /* renamed from: d */
    public C55137a f154816d = new C55137a();

    /* renamed from: com.tencent.mm.autogen.events.FinderVideoStateActionEvent$a */
    public static final class C55137a {

        /* renamed from: a */
        public boolean f154817a;

        /* renamed from: b */
        public boolean f154818b;
    }

    public FinderVideoStateActionEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof FinderVideoStateActionEvent)) {
            return false;
        }
        C55137a aVar = ((FinderVideoStateActionEvent) iEvent).f154816d;
        return C46238a.m51546a(Boolean.valueOf(this.f154816d.f154817a), Boolean.valueOf(aVar.f154817a)) && C46238a.m51546a(Boolean.valueOf(this.f154816d.f154818b), Boolean.valueOf(aVar.f154818b));
    }
}
