package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.GetUnreadGameMsgCountEvent */
public final class GetUnreadGameMsgCountEvent extends IEvent {

    /* renamed from: d */
    public C40123a f107597d = new C40123a();

    /* renamed from: com.tencent.mm.autogen.events.GetUnreadGameMsgCountEvent$a */
    public static final class C40123a {

        /* renamed from: a */
        public int f107598a;

        /* renamed from: b */
        public int f107599b;

        /* renamed from: c */
        public boolean f107600c;

        /* renamed from: d */
        public boolean f107601d;
    }

    public GetUnreadGameMsgCountEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof GetUnreadGameMsgCountEvent)) {
            return false;
        }
        C40123a aVar = ((GetUnreadGameMsgCountEvent) iEvent).f107597d;
        return C46238a.m51546a(Integer.valueOf(this.f107597d.f107598a), Integer.valueOf(aVar.f107598a)) && C46238a.m51546a(Integer.valueOf(this.f107597d.f107599b), Integer.valueOf(aVar.f107599b)) && C46238a.m51546a(Boolean.valueOf(this.f107597d.f107600c), Boolean.valueOf(aVar.f107600c)) && C46238a.m51546a(Boolean.valueOf(this.f107597d.f107601d), Boolean.valueOf(aVar.f107601d));
    }
}
