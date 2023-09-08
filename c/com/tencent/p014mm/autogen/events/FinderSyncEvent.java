package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.FinderSyncEvent */
public final class FinderSyncEvent extends IEvent {

    /* renamed from: d */
    public C28747a f78804d = new C28747a();

    /* renamed from: com.tencent.mm.autogen.events.FinderSyncEvent$a */
    public static final class C28747a {

        /* renamed from: a */
        public boolean f78805a = false;

        /* renamed from: b */
        public int f78806b = -1;

        /* renamed from: c */
        public int f78807c = -1;
    }

    public FinderSyncEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof FinderSyncEvent)) {
            return false;
        }
        C28747a aVar = ((FinderSyncEvent) iEvent).f78804d;
        return C46238a.m51546a(Boolean.valueOf(this.f78804d.f78805a), Boolean.valueOf(aVar.f78805a)) && C46238a.m51546a(Integer.valueOf(this.f78804d.f78806b), Integer.valueOf(aVar.f78806b)) && C46238a.m51546a(Integer.valueOf(this.f78804d.f78807c), Integer.valueOf(aVar.f78807c));
    }
}
