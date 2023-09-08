package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.NotifyGroupTodoEvent */
public final class NotifyGroupTodoEvent extends IEvent {

    /* renamed from: d */
    public C67740a f193762d = new C67740a();

    /* renamed from: com.tencent.mm.autogen.events.NotifyGroupTodoEvent$a */
    public static final class C67740a {

        /* renamed from: a */
        public int f193763a = 0;

        /* renamed from: b */
        public String f193764b;

        /* renamed from: c */
        public String f193765c;
    }

    public NotifyGroupTodoEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof NotifyGroupTodoEvent)) {
            return false;
        }
        C67740a aVar = ((NotifyGroupTodoEvent) iEvent).f193762d;
        return C46238a.m51546a(Integer.valueOf(this.f193762d.f193763a), Integer.valueOf(aVar.f193763a)) && C46238a.m51546a(this.f193762d.f193764b, aVar.f193764b) && C46238a.m51546a(this.f193762d.f193765c, aVar.f193765c);
    }
}
