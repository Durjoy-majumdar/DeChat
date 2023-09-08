package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;
import xd3.C78802b;

/* renamed from: com.tencent.mm.autogen.events.BannerToAddEvent */
public final class BannerToAddEvent extends IEvent {

    /* renamed from: d */
    public C67662a f193489d = new C67662a();

    /* renamed from: com.tencent.mm.autogen.events.BannerToAddEvent$a */
    public static final class C67662a {

        /* renamed from: a */
        public boolean f193490a = true;

        /* renamed from: b */
        public int f193491b = 1;

        /* renamed from: c */
        public C78802b f193492c;
    }

    public BannerToAddEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof BannerToAddEvent)) {
            return false;
        }
        C67662a aVar = ((BannerToAddEvent) iEvent).f193489d;
        return C46238a.m51546a(Boolean.valueOf(this.f193489d.f193490a), Boolean.valueOf(aVar.f193490a)) && C46238a.m51546a(Integer.valueOf(this.f193489d.f193491b), Integer.valueOf(aVar.f193491b)) && C46238a.m51546a(this.f193489d.f193492c, aVar.f193492c);
    }
}
