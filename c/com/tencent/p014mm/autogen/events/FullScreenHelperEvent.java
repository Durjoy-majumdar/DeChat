package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.FullScreenHelperEvent */
public final class FullScreenHelperEvent extends IEvent {

    /* renamed from: d */
    public C92521a f264880d = new C92521a();

    /* renamed from: com.tencent.mm.autogen.events.FullScreenHelperEvent$a */
    public static final class C92521a {

        /* renamed from: a */
        public int f264881a;
    }

    public FullScreenHelperEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof FullScreenHelperEvent)) {
            return false;
        }
        return C46238a.m51546a(Integer.valueOf(this.f264880d.f264881a), Integer.valueOf(((FullScreenHelperEvent) iEvent).f264880d.f264881a));
    }
}
