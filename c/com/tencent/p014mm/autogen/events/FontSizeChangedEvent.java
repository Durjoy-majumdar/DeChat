package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.FontSizeChangedEvent */
public final class FontSizeChangedEvent extends IEvent {

    /* renamed from: d */
    public C67701a f193623d = new C67701a();

    /* renamed from: com.tencent.mm.autogen.events.FontSizeChangedEvent$a */
    public static final class C67701a {

        /* renamed from: a */
        public float f193624a = 0.0f;

        /* renamed from: b */
        public float f193625b = 0.0f;
    }

    public FontSizeChangedEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof FontSizeChangedEvent)) {
            return false;
        }
        C67701a aVar = ((FontSizeChangedEvent) iEvent).f193623d;
        return C46238a.m51546a(Float.valueOf(this.f193623d.f193624a), Float.valueOf(aVar.f193624a)) && C46238a.m51546a(Float.valueOf(this.f193623d.f193625b), Float.valueOf(aVar.f193625b));
    }
}
