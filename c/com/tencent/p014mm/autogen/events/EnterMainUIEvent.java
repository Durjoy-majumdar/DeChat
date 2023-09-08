package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.EnterMainUIEvent */
public final class EnterMainUIEvent extends IEvent {

    /* renamed from: d */
    public C114672a f343547d = new C114672a();

    /* renamed from: com.tencent.mm.autogen.events.EnterMainUIEvent$a */
    public static final class C114672a {

        /* renamed from: a */
        public String f343548a;

        /* renamed from: b */
        public long f343549b;

        /* renamed from: c */
        public long f343550c;
    }

    public EnterMainUIEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof EnterMainUIEvent)) {
            return false;
        }
        C114672a aVar = ((EnterMainUIEvent) iEvent).f343547d;
        return C46238a.m51546a(this.f343547d.f343548a, aVar.f343548a) && C46238a.m51546a(Long.valueOf(this.f343547d.f343549b), Long.valueOf(aVar.f343549b)) && C46238a.m51546a(Long.valueOf(this.f343547d.f343550c), Long.valueOf(aVar.f343550c));
    }
}
