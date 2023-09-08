package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.FTSWASearchRemoveWidgetViewEvent */
public final class FTSWASearchRemoveWidgetViewEvent extends IEvent {

    /* renamed from: d */
    public C28738a f78784d = new C28738a();

    /* renamed from: com.tencent.mm.autogen.events.FTSWASearchRemoveWidgetViewEvent$a */
    public static final class C28738a {
    }

    public FTSWASearchRemoveWidgetViewEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof FTSWASearchRemoveWidgetViewEvent)) {
            return false;
        }
        C28738a aVar = ((FTSWASearchRemoveWidgetViewEvent) iEvent).f78784d;
        this.f78784d.getClass();
        aVar.getClass();
        return C46238a.m51546a((Object) null, (Object) null);
    }
}
