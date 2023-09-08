package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.ShowFaceErrorEvent */
public final class ShowFaceErrorEvent extends IEvent {

    /* renamed from: d */
    public C1135a f9505d = new C1135a();

    /* renamed from: com.tencent.mm.autogen.events.ShowFaceErrorEvent$a */
    public static final class C1135a {
    }

    public ShowFaceErrorEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof ShowFaceErrorEvent)) {
            return false;
        }
        C1135a aVar = ((ShowFaceErrorEvent) iEvent).f9505d;
        this.f9505d.getClass();
        Boolean bool = Boolean.FALSE;
        aVar.getClass();
        if (!C46238a.m51546a(bool, bool)) {
            return false;
        }
        this.f9505d.getClass();
        if (!C46238a.m51546a(-1, -1)) {
            return false;
        }
        this.f9505d.getClass();
        return C46238a.m51546a((Object) null, (Object) null);
    }
}
