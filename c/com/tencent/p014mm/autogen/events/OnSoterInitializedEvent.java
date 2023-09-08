package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.OnSoterInitializedEvent */
public final class OnSoterInitializedEvent extends IEvent {

    /* renamed from: d */
    public C28786a f78887d = new C28786a();

    /* renamed from: com.tencent.mm.autogen.events.OnSoterInitializedEvent$a */
    public static final class C28786a {

        /* renamed from: a */
        public int f78888a = 0;

        /* renamed from: b */
        public String f78889b;
    }

    public OnSoterInitializedEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof OnSoterInitializedEvent)) {
            return false;
        }
        C28786a aVar = ((OnSoterInitializedEvent) iEvent).f78887d;
        return C46238a.m51546a(Integer.valueOf(this.f78887d.f78888a), Integer.valueOf(aVar.f78888a)) && C46238a.m51546a(this.f78887d.f78889b, aVar.f78889b);
    }
}
