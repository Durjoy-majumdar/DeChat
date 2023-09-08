package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import gu2.C98214b;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.SnsInputEvent */
public final class SnsInputEvent extends IEvent {

    /* renamed from: d */
    public C92580a f265158d = new C92580a();

    /* renamed from: com.tencent.mm.autogen.events.SnsInputEvent$a */
    public static final class C92580a {

        /* renamed from: a */
        public C98214b f265159a;

        /* renamed from: b */
        public int f265160b;
    }

    public SnsInputEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof SnsInputEvent)) {
            return false;
        }
        C92580a aVar = ((SnsInputEvent) iEvent).f265158d;
        return C46238a.m51546a(this.f265158d.f265159a, aVar.f265159a) && C46238a.m51546a(Integer.valueOf(this.f265158d.f265160b), Integer.valueOf(aVar.f265160b));
    }
}
