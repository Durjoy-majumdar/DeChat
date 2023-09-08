package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.MulitTaskEvent */
public final class MulitTaskEvent extends IEvent {

    /* renamed from: d */
    public C67733a f193741d = new C67733a();

    /* renamed from: com.tencent.mm.autogen.events.MulitTaskEvent$a */
    public static final class C67733a {

        /* renamed from: a */
        public String f193742a;

        /* renamed from: b */
        public int f193743b;

        /* renamed from: c */
        public int f193744c;
    }

    public MulitTaskEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof MulitTaskEvent)) {
            return false;
        }
        C67733a aVar = ((MulitTaskEvent) iEvent).f193741d;
        return C46238a.m51546a(this.f193741d.f193742a, aVar.f193742a) && C46238a.m51546a(Integer.valueOf(this.f193741d.f193743b), Integer.valueOf(aVar.f193743b)) && C46238a.m51546a(Integer.valueOf(this.f193741d.f193744c), Integer.valueOf(aVar.f193744c));
    }
}
