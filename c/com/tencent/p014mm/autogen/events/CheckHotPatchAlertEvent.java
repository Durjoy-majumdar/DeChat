package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.CheckHotPatchAlertEvent */
public final class CheckHotPatchAlertEvent extends IEvent {

    /* renamed from: d */
    public C28718a f78739d = new C28718a();

    /* renamed from: e */
    public C28719b f78740e = new C28719b();

    /* renamed from: com.tencent.mm.autogen.events.CheckHotPatchAlertEvent$a */
    public static final class C28718a {
    }

    /* renamed from: com.tencent.mm.autogen.events.CheckHotPatchAlertEvent$b */
    public static final class C28719b {

        /* renamed from: a */
        public boolean f78741a;

        /* renamed from: b */
        public String f78742b;
    }

    public CheckHotPatchAlertEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof CheckHotPatchAlertEvent)) {
            return false;
        }
        CheckHotPatchAlertEvent checkHotPatchAlertEvent = (CheckHotPatchAlertEvent) iEvent;
        C28718a aVar = checkHotPatchAlertEvent.f78739d;
        this.f78739d.getClass();
        aVar.getClass();
        if (!C46238a.m51546a(0, 0)) {
            return false;
        }
        C28719b bVar = checkHotPatchAlertEvent.f78740e;
        if (!C46238a.m51546a(Boolean.valueOf(this.f78740e.f78741a), Boolean.valueOf(bVar.f78741a))) {
            return false;
        }
        this.f78740e.getClass();
        return C46238a.m51546a((Object) null, (Object) null) && C46238a.m51546a(this.f78740e.f78742b, bVar.f78742b);
    }
}
