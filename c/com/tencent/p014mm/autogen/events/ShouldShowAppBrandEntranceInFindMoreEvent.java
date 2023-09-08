package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.ShouldShowAppBrandEntranceInFindMoreEvent */
public final class ShouldShowAppBrandEntranceInFindMoreEvent extends IEvent {

    /* renamed from: d */
    public C80741a f236288d = new C80741a();

    /* renamed from: e */
    public C80742b f236289e = new C80742b();

    /* renamed from: com.tencent.mm.autogen.events.ShouldShowAppBrandEntranceInFindMoreEvent$a */
    public static final class C80741a {

        /* renamed from: a */
        public boolean f236290a;
    }

    /* renamed from: com.tencent.mm.autogen.events.ShouldShowAppBrandEntranceInFindMoreEvent$b */
    public static final class C80742b {

        /* renamed from: a */
        public boolean f236291a;

        /* renamed from: b */
        public boolean f236292b;

        /* renamed from: c */
        public boolean f236293c;
    }

    public ShouldShowAppBrandEntranceInFindMoreEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof ShouldShowAppBrandEntranceInFindMoreEvent)) {
            return false;
        }
        ShouldShowAppBrandEntranceInFindMoreEvent shouldShowAppBrandEntranceInFindMoreEvent = (ShouldShowAppBrandEntranceInFindMoreEvent) iEvent;
        C80741a aVar = shouldShowAppBrandEntranceInFindMoreEvent.f236288d;
        this.f236288d.getClass();
        aVar.getClass();
        if (!C46238a.m51546a((Object) null, (Object) null) || !C46238a.m51546a(Boolean.valueOf(this.f236288d.f236290a), Boolean.valueOf(aVar.f236290a))) {
            return false;
        }
        C80742b bVar = shouldShowAppBrandEntranceInFindMoreEvent.f236289e;
        return C46238a.m51546a(Boolean.valueOf(this.f236289e.f236291a), Boolean.valueOf(bVar.f236291a)) && C46238a.m51546a(Boolean.valueOf(this.f236289e.f236292b), Boolean.valueOf(bVar.f236292b)) && C46238a.m51546a(Boolean.valueOf(this.f236289e.f236293c), Boolean.valueOf(bVar.f236293c));
    }
}
