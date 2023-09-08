package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.FaceBookBindOperationEvent */
public final class FaceBookBindOperationEvent extends IEvent {

    /* renamed from: d */
    public C92507a f264805d = new C92507a();

    /* renamed from: e */
    public C92508b f264806e = new C92508b();

    /* renamed from: com.tencent.mm.autogen.events.FaceBookBindOperationEvent$a */
    public static final class C92507a {
    }

    /* renamed from: com.tencent.mm.autogen.events.FaceBookBindOperationEvent$b */
    public static final class C92508b {
    }

    public FaceBookBindOperationEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof FaceBookBindOperationEvent)) {
            return false;
        }
        FaceBookBindOperationEvent faceBookBindOperationEvent = (FaceBookBindOperationEvent) iEvent;
        C92507a aVar = faceBookBindOperationEvent.f264805d;
        this.f264805d.getClass();
        aVar.getClass();
        if (!C46238a.m51546a(-1, -1)) {
            return false;
        }
        C92508b bVar = faceBookBindOperationEvent.f264806e;
        this.f264806e.getClass();
        Boolean bool = Boolean.FALSE;
        bVar.getClass();
        return C46238a.m51546a(bool, bool);
    }
}
