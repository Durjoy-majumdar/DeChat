package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.RemittanceBusiUIF2fDynamicActivityResultEvent */
public final class RemittanceBusiUIF2fDynamicActivityResultEvent extends IEvent {

    /* renamed from: d */
    public C67775a f193888d = new C67775a();

    /* renamed from: com.tencent.mm.autogen.events.RemittanceBusiUIF2fDynamicActivityResultEvent$a */
    public static final class C67775a {

        /* renamed from: a */
        public boolean f193889a = false;

        /* renamed from: b */
        public int f193890b = 0;
    }

    public RemittanceBusiUIF2fDynamicActivityResultEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof RemittanceBusiUIF2fDynamicActivityResultEvent)) {
            return false;
        }
        C67775a aVar = ((RemittanceBusiUIF2fDynamicActivityResultEvent) iEvent).f193888d;
        return C46238a.m51546a(Boolean.valueOf(this.f193888d.f193889a), Boolean.valueOf(aVar.f193889a)) && C46238a.m51546a(Integer.valueOf(this.f193888d.f193890b), Integer.valueOf(aVar.f193890b));
    }
}
