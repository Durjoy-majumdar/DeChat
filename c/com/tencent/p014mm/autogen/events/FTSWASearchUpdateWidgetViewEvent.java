package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.FTSWASearchUpdateWidgetViewEvent */
public final class FTSWASearchUpdateWidgetViewEvent extends IEvent {

    /* renamed from: d */
    public C28739a f78785d = new C28739a();

    /* renamed from: com.tencent.mm.autogen.events.FTSWASearchUpdateWidgetViewEvent$a */
    public static final class C28739a {
    }

    public FTSWASearchUpdateWidgetViewEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof FTSWASearchUpdateWidgetViewEvent)) {
            return false;
        }
        C28739a aVar = ((FTSWASearchUpdateWidgetViewEvent) iEvent).f78785d;
        this.f78785d.getClass();
        aVar.getClass();
        return C46238a.m51546a((Object) null, (Object) null);
    }
}
