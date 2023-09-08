package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.StartLauncherUIEvent */
public final class StartLauncherUIEvent extends IEvent {

    /* renamed from: d */
    public C1145a f9555d = new C1145a();

    /* renamed from: com.tencent.mm.autogen.events.StartLauncherUIEvent$a */
    public static final class C1145a {
    }

    public StartLauncherUIEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof StartLauncherUIEvent)) {
            return false;
        }
        C1145a aVar = ((StartLauncherUIEvent) iEvent).f9555d;
        this.f9555d.getClass();
        aVar.getClass();
        if (!C46238a.m51546a(0, 0)) {
            return false;
        }
        this.f9555d.getClass();
        return C46238a.m51546a((Object) null, (Object) null);
    }
}
