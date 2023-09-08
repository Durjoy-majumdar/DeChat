package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.CreateBackupBannerEvent */
public final class CreateBackupBannerEvent extends IEvent {

    /* renamed from: d */
    public C24248a f69414d = new C24248a();

    /* renamed from: e */
    public C24249b f69415e = new C24249b();

    /* renamed from: com.tencent.mm.autogen.events.CreateBackupBannerEvent$a */
    public static final class C24248a {
    }

    /* renamed from: com.tencent.mm.autogen.events.CreateBackupBannerEvent$b */
    public static final class C24249b {
    }

    public CreateBackupBannerEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof CreateBackupBannerEvent)) {
            return false;
        }
        CreateBackupBannerEvent createBackupBannerEvent = (CreateBackupBannerEvent) iEvent;
        C24248a aVar = createBackupBannerEvent.f69414d;
        this.f69414d.getClass();
        aVar.getClass();
        if (!C46238a.m51546a((Object) null, (Object) null)) {
            return false;
        }
        C24249b bVar = createBackupBannerEvent.f69415e;
        this.f69415e.getClass();
        bVar.getClass();
        return C46238a.m51546a((Object) null, (Object) null);
    }
}
