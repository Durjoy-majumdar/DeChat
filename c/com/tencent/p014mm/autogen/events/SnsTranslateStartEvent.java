package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.SnsTranslateStartEvent */
public final class SnsTranslateStartEvent extends IEvent {

    /* renamed from: d */
    public C92597a f265208d = new C92597a();

    /* renamed from: com.tencent.mm.autogen.events.SnsTranslateStartEvent$a */
    public static final class C92597a {

        /* renamed from: a */
        public int f265209a = 0;

        /* renamed from: b */
        public String f265210b;
    }

    public SnsTranslateStartEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof SnsTranslateStartEvent)) {
            return false;
        }
        C92597a aVar = ((SnsTranslateStartEvent) iEvent).f265208d;
        return C46238a.m51546a(Integer.valueOf(this.f265208d.f265209a), Integer.valueOf(aVar.f265209a)) && C46238a.m51546a(this.f265208d.f265210b, aVar.f265210b);
    }
}
