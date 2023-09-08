package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.SnsGetVideoThumbEvent */
public final class SnsGetVideoThumbEvent extends IEvent {

    /* renamed from: d */
    public C67791a f193938d = new C67791a();

    /* renamed from: e */
    public C67792b f193939e = new C67792b();

    /* renamed from: com.tencent.mm.autogen.events.SnsGetVideoThumbEvent$a */
    public static final class C67791a {

        /* renamed from: a */
        public String f193940a;
    }

    /* renamed from: com.tencent.mm.autogen.events.SnsGetVideoThumbEvent$b */
    public static final class C67792b {

        /* renamed from: a */
        public Object f193941a;
    }

    public SnsGetVideoThumbEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof SnsGetVideoThumbEvent)) {
            return false;
        }
        SnsGetVideoThumbEvent snsGetVideoThumbEvent = (SnsGetVideoThumbEvent) iEvent;
        if (!C46238a.m51546a(this.f193938d.f193940a, snsGetVideoThumbEvent.f193938d.f193940a)) {
            return false;
        }
        return C46238a.m51546a(this.f193939e.f193941a, snsGetVideoThumbEvent.f193939e.f193941a);
    }
}
