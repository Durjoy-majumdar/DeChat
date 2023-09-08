package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.LbsSayHiEvent */
public final class LbsSayHiEvent extends IEvent {

    /* renamed from: d */
    public C67725a f193718d = new C67725a();

    /* renamed from: com.tencent.mm.autogen.events.LbsSayHiEvent$a */
    public static final class C67725a {

        /* renamed from: a */
        public String f193719a;

        /* renamed from: b */
        public int f193720b = 0;
    }

    public LbsSayHiEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof LbsSayHiEvent)) {
            return false;
        }
        C67725a aVar = ((LbsSayHiEvent) iEvent).f193718d;
        return C46238a.m51546a(this.f193718d.f193719a, aVar.f193719a) && C46238a.m51546a(Integer.valueOf(this.f193718d.f193720b), Integer.valueOf(aVar.f193720b));
    }
}
