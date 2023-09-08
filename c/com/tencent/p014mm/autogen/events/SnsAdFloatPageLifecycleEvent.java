package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.SnsAdFloatPageLifecycleEvent */
public final class SnsAdFloatPageLifecycleEvent extends IEvent {

    /* renamed from: d */
    public C92567a f265115d = new C92567a();

    /* renamed from: com.tencent.mm.autogen.events.SnsAdFloatPageLifecycleEvent$a */
    public static final class C92567a {

        /* renamed from: a */
        public String f265116a;

        /* renamed from: b */
        public int f265117b;
    }

    public SnsAdFloatPageLifecycleEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof SnsAdFloatPageLifecycleEvent)) {
            return false;
        }
        C92567a aVar = ((SnsAdFloatPageLifecycleEvent) iEvent).f265115d;
        return C46238a.m51546a(this.f265115d.f265116a, aVar.f265116a) && C46238a.m51546a(Integer.valueOf(this.f265115d.f265117b), Integer.valueOf(aVar.f265117b));
    }
}
