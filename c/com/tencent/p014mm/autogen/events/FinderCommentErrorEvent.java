package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.FinderCommentErrorEvent */
public final class FinderCommentErrorEvent extends IEvent {

    /* renamed from: d */
    public C1043a f9188d = new C1043a();

    /* renamed from: com.tencent.mm.autogen.events.FinderCommentErrorEvent$a */
    public static final class C1043a {

        /* renamed from: a */
        public int f9189a;

        /* renamed from: b */
        public String f9190b;
    }

    public FinderCommentErrorEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof FinderCommentErrorEvent)) {
            return false;
        }
        C1043a aVar = ((FinderCommentErrorEvent) iEvent).f9188d;
        return C46238a.m51546a(Integer.valueOf(this.f9188d.f9189a), Integer.valueOf(aVar.f9189a)) && C46238a.m51546a(this.f9188d.f9190b, aVar.f9190b);
    }
}
