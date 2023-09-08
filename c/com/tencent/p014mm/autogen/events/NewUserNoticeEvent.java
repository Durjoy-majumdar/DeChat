package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.NewUserNoticeEvent */
public final class NewUserNoticeEvent extends IEvent {

    /* renamed from: d */
    public C40145a f107660d = new C40145a();

    /* renamed from: com.tencent.mm.autogen.events.NewUserNoticeEvent$a */
    public static final class C40145a {

        /* renamed from: a */
        public int f107661a = 0;

        /* renamed from: b */
        public String f107662b;

        /* renamed from: c */
        public String f107663c;

        /* renamed from: d */
        public long f107664d = 0;
    }

    public NewUserNoticeEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof NewUserNoticeEvent)) {
            return false;
        }
        C40145a aVar = ((NewUserNoticeEvent) iEvent).f107660d;
        return C46238a.m51546a(Integer.valueOf(this.f107660d.f107661a), Integer.valueOf(aVar.f107661a)) && C46238a.m51546a(this.f107660d.f107662b, aVar.f107662b) && C46238a.m51546a(this.f107660d.f107663c, aVar.f107663c) && C46238a.m51546a(Long.valueOf(this.f107660d.f107664d), Long.valueOf(aVar.f107664d));
    }
}
