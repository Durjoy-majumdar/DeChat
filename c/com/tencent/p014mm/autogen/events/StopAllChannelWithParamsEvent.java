package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.StopAllChannelWithParamsEvent */
public final class StopAllChannelWithParamsEvent extends IEvent {

    /* renamed from: d */
    public C40173a f107782d = new C40173a();

    /* renamed from: com.tencent.mm.autogen.events.StopAllChannelWithParamsEvent$a */
    public static final class C40173a {
    }

    public StopAllChannelWithParamsEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof StopAllChannelWithParamsEvent)) {
            return false;
        }
        C40173a aVar = ((StopAllChannelWithParamsEvent) iEvent).f107782d;
        this.f107782d.getClass();
        Boolean bool = Boolean.TRUE;
        aVar.getClass();
        return C46238a.m51546a(bool, bool);
    }
}
