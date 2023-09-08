package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.DeletePackageEvent */
public final class DeletePackageEvent extends IEvent {

    /* renamed from: d */
    public C92473a f264672d = new C92473a();

    /* renamed from: com.tencent.mm.autogen.events.DeletePackageEvent$a */
    public static final class C92473a {

        /* renamed from: a */
        public int f264673a = -1;
    }

    public DeletePackageEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof DeletePackageEvent)) {
            return false;
        }
        return C46238a.m51546a(Integer.valueOf(this.f264672d.f264673a), Integer.valueOf(((DeletePackageEvent) iEvent).f264672d.f264673a));
    }
}
