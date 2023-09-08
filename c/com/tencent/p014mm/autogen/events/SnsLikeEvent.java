package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.SnsLikeEvent */
public final class SnsLikeEvent extends IEvent {

    /* renamed from: d */
    public C1140a f9520d = new C1140a();

    /* renamed from: com.tencent.mm.autogen.events.SnsLikeEvent$a */
    public static final class C1140a {
    }

    public SnsLikeEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof SnsLikeEvent)) {
            return false;
        }
        C1140a aVar = ((SnsLikeEvent) iEvent).f9520d;
        this.f9520d.getClass();
        Boolean bool = Boolean.FALSE;
        aVar.getClass();
        if (!C46238a.m51546a(bool, bool)) {
            return false;
        }
        this.f9520d.getClass();
        return C46238a.m51546a((Object) null, (Object) null);
    }
}
