package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.TaskBarDataUpdateEvent */
public final class TaskBarDataUpdateEvent extends IEvent {

    /* renamed from: d */
    public C1151a f9562d = new C1151a();

    /* renamed from: com.tencent.mm.autogen.events.TaskBarDataUpdateEvent$a */
    public static final class C1151a {
    }

    public TaskBarDataUpdateEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof TaskBarDataUpdateEvent)) {
            return false;
        }
        C1151a aVar = ((TaskBarDataUpdateEvent) iEvent).f9562d;
        this.f9562d.getClass();
        aVar.getClass();
        if (!C46238a.m51546a((Object) null, (Object) null)) {
            return false;
        }
        this.f9562d.getClass();
        return C46238a.m51546a(0, 0);
    }
}
