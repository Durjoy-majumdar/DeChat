package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.KindaGotoExternAppEvent */
public final class KindaGotoExternAppEvent extends IEvent {

    /* renamed from: d */
    public C67722a f193709d = new C67722a();

    /* renamed from: com.tencent.mm.autogen.events.KindaGotoExternAppEvent$a */
    public static final class C67722a {

        /* renamed from: a */
        public String f193710a;

        /* renamed from: b */
        public int f193711b;

        /* renamed from: c */
        public String f193712c;
    }

    public KindaGotoExternAppEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof KindaGotoExternAppEvent)) {
            return false;
        }
        C67722a aVar = ((KindaGotoExternAppEvent) iEvent).f193709d;
        return C46238a.m51546a(this.f193709d.f193710a, aVar.f193710a) && C46238a.m51546a(Integer.valueOf(this.f193709d.f193711b), Integer.valueOf(aVar.f193711b)) && C46238a.m51546a(this.f193709d.f193712c, aVar.f193712c);
    }
}
