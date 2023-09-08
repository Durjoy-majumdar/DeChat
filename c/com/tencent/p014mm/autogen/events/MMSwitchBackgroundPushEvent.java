package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.MMSwitchBackgroundPushEvent */
public final class MMSwitchBackgroundPushEvent extends IEvent {

    /* renamed from: d */
    public C28776a f78866d = new C28776a();

    /* renamed from: com.tencent.mm.autogen.events.MMSwitchBackgroundPushEvent$a */
    public static final class C28776a {
    }

    public MMSwitchBackgroundPushEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof MMSwitchBackgroundPushEvent)) {
            return false;
        }
        C28776a aVar = ((MMSwitchBackgroundPushEvent) iEvent).f78866d;
        this.f78866d.getClass();
        aVar.getClass();
        return C46238a.m51546a(0, 0);
    }
}
