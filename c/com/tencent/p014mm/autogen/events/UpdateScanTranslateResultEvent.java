package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.UpdateScanTranslateResultEvent */
public final class UpdateScanTranslateResultEvent extends IEvent {

    /* renamed from: d */
    public C28846a f79041d = new C28846a();

    /* renamed from: com.tencent.mm.autogen.events.UpdateScanTranslateResultEvent$a */
    public static final class C28846a {
    }

    public UpdateScanTranslateResultEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof UpdateScanTranslateResultEvent)) {
            return false;
        }
        C28846a aVar = ((UpdateScanTranslateResultEvent) iEvent).f79041d;
        this.f79041d.getClass();
        aVar.getClass();
        if (!C46238a.m51546a((Object) null, (Object) null)) {
            return false;
        }
        this.f79041d.getClass();
        return C46238a.m51546a((Object) null, (Object) null);
    }
}
