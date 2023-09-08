package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.SnsUnTranslateEvent */
public final class SnsUnTranslateEvent extends IEvent {

    /* renamed from: d */
    public C92598a f265211d = new C92598a();

    /* renamed from: com.tencent.mm.autogen.events.SnsUnTranslateEvent$a */
    public static final class C92598a {

        /* renamed from: a */
        public int f265212a;

        /* renamed from: b */
        public String f265213b;
    }

    public SnsUnTranslateEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof SnsUnTranslateEvent)) {
            return false;
        }
        C92598a aVar = ((SnsUnTranslateEvent) iEvent).f265211d;
        return C46238a.m51546a(Integer.valueOf(this.f265211d.f265212a), Integer.valueOf(aVar.f265212a)) && C46238a.m51546a(this.f265211d.f265213b, aVar.f265213b);
    }
}
