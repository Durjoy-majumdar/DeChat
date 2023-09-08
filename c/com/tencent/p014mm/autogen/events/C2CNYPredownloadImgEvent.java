package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.C2CNYPredownloadImgEvent */
public final class C2CNYPredownloadImgEvent extends IEvent {

    /* renamed from: d */
    public C67664a f193503d = new C67664a();

    /* renamed from: com.tencent.mm.autogen.events.C2CNYPredownloadImgEvent$a */
    public static final class C67664a {

        /* renamed from: a */
        public String f193504a;

        /* renamed from: b */
        public String f193505b;

        /* renamed from: c */
        public int f193506c;
    }

    public C2CNYPredownloadImgEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof C2CNYPredownloadImgEvent)) {
            return false;
        }
        C67664a aVar = ((C2CNYPredownloadImgEvent) iEvent).f193503d;
        return C46238a.m51546a(this.f193503d.f193504a, aVar.f193504a) && C46238a.m51546a(this.f193503d.f193505b, aVar.f193505b) && C46238a.m51546a(Integer.valueOf(this.f193503d.f193506c), Integer.valueOf(aVar.f193506c));
    }
}
