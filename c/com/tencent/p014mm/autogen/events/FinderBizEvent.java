package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.FinderBizEvent */
public final class FinderBizEvent extends IEvent {

    /* renamed from: d */
    public C17677a f48088d = new C17677a();

    /* renamed from: com.tencent.mm.autogen.events.FinderBizEvent$a */
    public static final class C17677a {

        /* renamed from: a */
        public int f48089a;

        /* renamed from: b */
        public String f48090b;

        /* renamed from: c */
        public int f48091c;
    }

    public FinderBizEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof FinderBizEvent)) {
            return false;
        }
        C17677a aVar = ((FinderBizEvent) iEvent).f48088d;
        return C46238a.m51546a(Integer.valueOf(this.f48088d.f48089a), Integer.valueOf(aVar.f48089a)) && C46238a.m51546a(this.f48088d.f48090b, aVar.f48090b) && C46238a.m51546a(Integer.valueOf(this.f48088d.f48091c), Integer.valueOf(aVar.f48091c));
    }
}
