package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.CreateBakBannerEvent */
public final class CreateBakBannerEvent extends IEvent {

    /* renamed from: d */
    public C24250a f69416d = new C24250a();

    /* renamed from: e */
    public C24251b f69417e = new C24251b();

    /* renamed from: com.tencent.mm.autogen.events.CreateBakBannerEvent$a */
    public static final class C24250a {
    }

    /* renamed from: com.tencent.mm.autogen.events.CreateBakBannerEvent$b */
    public static final class C24251b {
    }

    public CreateBakBannerEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof CreateBakBannerEvent)) {
            return false;
        }
        CreateBakBannerEvent createBakBannerEvent = (CreateBakBannerEvent) iEvent;
        C24250a aVar = createBakBannerEvent.f69416d;
        this.f69416d.getClass();
        aVar.getClass();
        if (!C46238a.m51546a((Object) null, (Object) null)) {
            return false;
        }
        C24251b bVar = createBakBannerEvent.f69417e;
        this.f69417e.getClass();
        bVar.getClass();
        return C46238a.m51546a((Object) null, (Object) null);
    }
}
