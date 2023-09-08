package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.CancelScanTranslationEvent */
public final class CancelScanTranslationEvent extends IEvent {

    /* renamed from: d */
    public C92467a f264645d = new C92467a();

    /* renamed from: com.tencent.mm.autogen.events.CancelScanTranslationEvent$a */
    public static final class C92467a {

        /* renamed from: a */
        public int f264646a = 0;

        /* renamed from: b */
        public int f264647b;
    }

    public CancelScanTranslationEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof CancelScanTranslationEvent)) {
            return false;
        }
        C92467a aVar = ((CancelScanTranslationEvent) iEvent).f264645d;
        return C46238a.m51546a(Integer.valueOf(this.f264645d.f264646a), Integer.valueOf(aVar.f264646a)) && C46238a.m51546a(Integer.valueOf(this.f264645d.f264647b), Integer.valueOf(aVar.f264647b));
    }
}
