package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.QuitMainUIEvent */
public final class QuitMainUIEvent extends IEvent {

    /* renamed from: d */
    public C17687a f48115d = new C17687a();

    /* renamed from: com.tencent.mm.autogen.events.QuitMainUIEvent$a */
    public static final class C17687a {

        /* renamed from: a */
        public String f48116a;

        /* renamed from: b */
        public String f48117b;

        /* renamed from: c */
        public long f48118c;

        /* renamed from: d */
        public long f48119d;
    }

    public QuitMainUIEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof QuitMainUIEvent)) {
            return false;
        }
        C17687a aVar = ((QuitMainUIEvent) iEvent).f48115d;
        return C46238a.m51546a(this.f48115d.f48116a, aVar.f48116a) && C46238a.m51546a(this.f48115d.f48117b, aVar.f48117b) && C46238a.m51546a(Long.valueOf(this.f48115d.f48118c), Long.valueOf(aVar.f48118c)) && C46238a.m51546a(Long.valueOf(this.f48115d.f48119d), Long.valueOf(aVar.f48119d));
    }
}
