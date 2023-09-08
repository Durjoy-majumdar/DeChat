package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;
import te3.C50401mh0;

/* renamed from: com.tencent.mm.autogen.events.FinderSyncGotTabTipsEvent */
public final class FinderSyncGotTabTipsEvent extends IEvent {

    /* renamed from: d */
    public C40101a f107535d = new C40101a();

    /* renamed from: e */
    public C40102b f107536e = new C40102b();

    /* renamed from: com.tencent.mm.autogen.events.FinderSyncGotTabTipsEvent$a */
    public static final class C40101a {

        /* renamed from: a */
        public C50401mh0 f107537a;

        /* renamed from: b */
        public int f107538b;
    }

    /* renamed from: com.tencent.mm.autogen.events.FinderSyncGotTabTipsEvent$b */
    public static final class C40102b {

        /* renamed from: a */
        public boolean f107539a;
    }

    public FinderSyncGotTabTipsEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof FinderSyncGotTabTipsEvent)) {
            return false;
        }
        FinderSyncGotTabTipsEvent finderSyncGotTabTipsEvent = (FinderSyncGotTabTipsEvent) iEvent;
        C40101a aVar = finderSyncGotTabTipsEvent.f107535d;
        if (!C46238a.m51546a(this.f107535d.f107537a, aVar.f107537a) || !C46238a.m51546a(Integer.valueOf(this.f107535d.f107538b), Integer.valueOf(aVar.f107538b))) {
            return false;
        }
        return C46238a.m51546a(Boolean.valueOf(this.f107536e.f107539a), Boolean.valueOf(finderSyncGotTabTipsEvent.f107536e.f107539a));
    }
}
