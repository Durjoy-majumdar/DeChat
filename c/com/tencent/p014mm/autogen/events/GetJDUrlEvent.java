package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.GetJDUrlEvent */
public final class GetJDUrlEvent extends IEvent {

    /* renamed from: d */
    public C80723a f236214d = new C80723a();

    /* renamed from: com.tencent.mm.autogen.events.GetJDUrlEvent$a */
    public static final class C80723a {

        /* renamed from: a */
        public String f236215a;
    }

    public GetJDUrlEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof GetJDUrlEvent)) {
            return false;
        }
        return C46238a.m51546a(this.f236214d.f236215a, ((GetJDUrlEvent) iEvent).f236214d.f236215a);
    }
}
