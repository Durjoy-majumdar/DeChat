package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.AutoGetBigImgOccChangedEvent */
public final class AutoGetBigImgOccChangedEvent extends IEvent {

    /* renamed from: d */
    public C28707a f78721d = new C28707a();

    /* renamed from: com.tencent.mm.autogen.events.AutoGetBigImgOccChangedEvent$a */
    public static final class C28707a {
    }

    public AutoGetBigImgOccChangedEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof AutoGetBigImgOccChangedEvent)) {
            return false;
        }
        C28707a aVar = ((AutoGetBigImgOccChangedEvent) iEvent).f78721d;
        this.f78721d.getClass();
        aVar.getClass();
        return C46238a.m51546a(0, 0);
    }
}
