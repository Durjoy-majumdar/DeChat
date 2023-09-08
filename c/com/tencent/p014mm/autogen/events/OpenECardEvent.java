package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;
import java.lang.ref.WeakReference;

/* renamed from: com.tencent.mm.autogen.events.OpenECardEvent */
public final class OpenECardEvent extends IEvent {

    /* renamed from: d */
    public C1105a f9381d = new C1105a();

    /* renamed from: com.tencent.mm.autogen.events.OpenECardEvent$a */
    public static final class C1105a {

        /* renamed from: a */
        public WeakReference f9382a;
    }

    public OpenECardEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof OpenECardEvent)) {
            return false;
        }
        C1105a aVar = ((OpenECardEvent) iEvent).f9381d;
        this.f9381d.getClass();
        aVar.getClass();
        return C46238a.m51546a(0, 0) && C46238a.m51546a(this.f9381d.f9382a, aVar.f9382a);
    }
}
