package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.CheckF2FCameraIsOpenEvent */
public final class CheckF2FCameraIsOpenEvent extends IEvent {

    /* renamed from: d */
    public C104591a f309996d = new C104591a();

    /* renamed from: com.tencent.mm.autogen.events.CheckF2FCameraIsOpenEvent$a */
    public static final class C104591a {
    }

    public CheckF2FCameraIsOpenEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof CheckF2FCameraIsOpenEvent)) {
            return false;
        }
        C104591a aVar = ((CheckF2FCameraIsOpenEvent) iEvent).f309996d;
        this.f309996d.getClass();
        Boolean bool = Boolean.FALSE;
        aVar.getClass();
        return C46238a.m51546a(bool, bool);
    }
}
