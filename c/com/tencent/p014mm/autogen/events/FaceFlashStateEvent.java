package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.FaceFlashStateEvent */
public final class FaceFlashStateEvent extends IEvent {

    /* renamed from: d */
    public C1034a f9152d = new C1034a();

    /* renamed from: com.tencent.mm.autogen.events.FaceFlashStateEvent$a */
    public static final class C1034a {

        /* renamed from: a */
        public boolean f9153a;
    }

    public FaceFlashStateEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof FaceFlashStateEvent)) {
            return false;
        }
        return C46238a.m51546a(Boolean.valueOf(this.f9152d.f9153a), Boolean.valueOf(((FaceFlashStateEvent) iEvent).f9152d.f9153a));
    }
}
