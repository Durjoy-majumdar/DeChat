package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.CheckSnsSightUploadEvent */
public final class CheckSnsSightUploadEvent extends IEvent {

    /* renamed from: d */
    public C55112a f154739d = new C55112a();

    /* renamed from: e */
    public C55113b f154740e = new C55113b();

    /* renamed from: com.tencent.mm.autogen.events.CheckSnsSightUploadEvent$a */
    public static final class C55112a {
    }

    /* renamed from: com.tencent.mm.autogen.events.CheckSnsSightUploadEvent$b */
    public static final class C55113b {
    }

    public CheckSnsSightUploadEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof CheckSnsSightUploadEvent)) {
            return false;
        }
        CheckSnsSightUploadEvent checkSnsSightUploadEvent = (CheckSnsSightUploadEvent) iEvent;
        C55112a aVar = checkSnsSightUploadEvent.f154739d;
        this.f154739d.getClass();
        aVar.getClass();
        if (!C46238a.m51546a((Object) null, (Object) null)) {
            return false;
        }
        this.f154739d.getClass();
        if (!C46238a.m51546a(0, 0)) {
            return false;
        }
        this.f154739d.getClass();
        if (!C46238a.m51546a((Object) null, (Object) null)) {
            return false;
        }
        this.f154739d.getClass();
        if (!C46238a.m51546a((Object) null, (Object) null)) {
            return false;
        }
        C55113b bVar = checkSnsSightUploadEvent.f154740e;
        this.f154740e.getClass();
        bVar.getClass();
        return C46238a.m51546a(0, 0);
    }
}
