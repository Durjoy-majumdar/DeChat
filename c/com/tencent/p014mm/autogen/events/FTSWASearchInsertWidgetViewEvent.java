package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.FTSWASearchInsertWidgetViewEvent */
public final class FTSWASearchInsertWidgetViewEvent extends IEvent {

    /* renamed from: d */
    public C28737a f78783d = new C28737a();

    /* renamed from: com.tencent.mm.autogen.events.FTSWASearchInsertWidgetViewEvent$a */
    public static final class C28737a {
    }

    public FTSWASearchInsertWidgetViewEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof FTSWASearchInsertWidgetViewEvent)) {
            return false;
        }
        C28737a aVar = ((FTSWASearchInsertWidgetViewEvent) iEvent).f78783d;
        this.f78783d.getClass();
        aVar.getClass();
        if (!C46238a.m51546a((Object) null, (Object) null)) {
            return false;
        }
        this.f78783d.getClass();
        return C46238a.m51546a((Object) null, (Object) null);
    }
}
