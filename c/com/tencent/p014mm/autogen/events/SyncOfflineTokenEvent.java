package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.SyncOfflineTokenEvent */
public final class SyncOfflineTokenEvent extends IEvent {

    /* renamed from: d */
    public C28838a f79021d = new C28838a();

    /* renamed from: com.tencent.mm.autogen.events.SyncOfflineTokenEvent$a */
    public static final class C28838a {

        /* renamed from: a */
        public boolean f79022a;

        /* renamed from: b */
        public int f79023b;
    }

    public SyncOfflineTokenEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof SyncOfflineTokenEvent)) {
            return false;
        }
        C28838a aVar = ((SyncOfflineTokenEvent) iEvent).f79021d;
        if (!C46238a.m51546a(Boolean.valueOf(this.f79021d.f79022a), Boolean.valueOf(aVar.f79022a)) || !C46238a.m51546a(Integer.valueOf(this.f79021d.f79023b), Integer.valueOf(aVar.f79023b))) {
            return false;
        }
        this.f79021d.getClass();
        Boolean bool = Boolean.FALSE;
        if (!C46238a.m51546a(bool, bool)) {
            return false;
        }
        this.f79021d.getClass();
        return C46238a.m51546a(0, 0);
    }
}
