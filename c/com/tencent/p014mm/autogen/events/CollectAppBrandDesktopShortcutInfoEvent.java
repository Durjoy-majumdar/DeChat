package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.CollectAppBrandDesktopShortcutInfoEvent */
public final class CollectAppBrandDesktopShortcutInfoEvent extends IEvent {

    /* renamed from: d */
    public C80710a f236167d = new C80710a();

    /* renamed from: e */
    public C80711b f236168e = new C80711b();

    /* renamed from: com.tencent.mm.autogen.events.CollectAppBrandDesktopShortcutInfoEvent$a */
    public static final class C80710a {

        /* renamed from: a */
        public String f236169a;
    }

    /* renamed from: com.tencent.mm.autogen.events.CollectAppBrandDesktopShortcutInfoEvent$b */
    public static final class C80711b {

        /* renamed from: a */
        public String f236170a;

        /* renamed from: b */
        public String f236171b;

        /* renamed from: c */
        public String[] f236172c;
    }

    public CollectAppBrandDesktopShortcutInfoEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof CollectAppBrandDesktopShortcutInfoEvent)) {
            return false;
        }
        CollectAppBrandDesktopShortcutInfoEvent collectAppBrandDesktopShortcutInfoEvent = (CollectAppBrandDesktopShortcutInfoEvent) iEvent;
        if (!C46238a.m51546a(this.f236167d.f236169a, collectAppBrandDesktopShortcutInfoEvent.f236167d.f236169a)) {
            return false;
        }
        C80711b bVar = collectAppBrandDesktopShortcutInfoEvent.f236168e;
        return C46238a.m51546a(this.f236168e.f236170a, bVar.f236170a) && C46238a.m51546a(this.f236168e.f236171b, bVar.f236171b) && C46238a.m51546a(this.f236168e.f236172c, bVar.f236172c);
    }
}
