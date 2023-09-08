package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.WearVoipControllerEvent */
public final class WearVoipControllerEvent extends IEvent {

    /* renamed from: d */
    public C40186a f107832d = new C40186a();

    /* renamed from: com.tencent.mm.autogen.events.WearVoipControllerEvent$a */
    public static final class C40186a {

        /* renamed from: a */
        public int f107833a;
    }

    public WearVoipControllerEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof WearVoipControllerEvent)) {
            return false;
        }
        return C46238a.m51546a(Integer.valueOf(this.f107832d.f107833a), Integer.valueOf(((WearVoipControllerEvent) iEvent).f107832d.f107833a));
    }
}
