package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.NewNotificationEvent */
public final class NewNotificationEvent extends IEvent {

    /* renamed from: d */
    public C28781a f78873d = new C28781a();

    /* renamed from: com.tencent.mm.autogen.events.NewNotificationEvent$a */
    public static final class C28781a {

        /* renamed from: a */
        public String f78874a;

        /* renamed from: b */
        public int f78875b;

        /* renamed from: c */
        public boolean f78876c;

        /* renamed from: d */
        public boolean f78877d;
    }

    public NewNotificationEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof NewNotificationEvent)) {
            return false;
        }
        C28781a aVar = ((NewNotificationEvent) iEvent).f78873d;
        if (!C46238a.m51546a(this.f78873d.f78874a, aVar.f78874a) || !C46238a.m51546a(Integer.valueOf(this.f78873d.f78875b), Integer.valueOf(aVar.f78875b)) || !C46238a.m51546a(Boolean.valueOf(this.f78873d.f78876c), Boolean.valueOf(aVar.f78876c)) || !C46238a.m51546a(Boolean.valueOf(this.f78873d.f78877d), Boolean.valueOf(aVar.f78877d))) {
            return false;
        }
        this.f78873d.getClass();
        Boolean bool = Boolean.FALSE;
        return C46238a.m51546a(bool, bool);
    }
}
