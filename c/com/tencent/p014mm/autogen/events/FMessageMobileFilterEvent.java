package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.FMessageMobileFilterEvent */
public final class FMessageMobileFilterEvent extends IEvent {

    /* renamed from: d */
    public C67696a f193606d = new C67696a();

    /* renamed from: e */
    public C67697b f193607e = new C67697b();

    /* renamed from: com.tencent.mm.autogen.events.FMessageMobileFilterEvent$a */
    public static final class C67696a {

        /* renamed from: a */
        public String f193608a;

        /* renamed from: b */
        public String f193609b;
    }

    /* renamed from: com.tencent.mm.autogen.events.FMessageMobileFilterEvent$b */
    public static final class C67697b {

        /* renamed from: a */
        public boolean f193610a = true;
    }

    public FMessageMobileFilterEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof FMessageMobileFilterEvent)) {
            return false;
        }
        FMessageMobileFilterEvent fMessageMobileFilterEvent = (FMessageMobileFilterEvent) iEvent;
        C67696a aVar = fMessageMobileFilterEvent.f193606d;
        if (!C46238a.m51546a(this.f193606d.f193608a, aVar.f193608a) || !C46238a.m51546a(this.f193606d.f193609b, aVar.f193609b)) {
            return false;
        }
        return C46238a.m51546a(Boolean.valueOf(this.f193607e.f193610a), Boolean.valueOf(fMessageMobileFilterEvent.f193607e.f193610a));
    }
}
