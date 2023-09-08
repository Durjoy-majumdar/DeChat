package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.VoipCallingStatusEvent */
public final class VoipCallingStatusEvent extends IEvent {

    /* renamed from: d */
    public C1158a f9577d = new C1158a();

    /* renamed from: com.tencent.mm.autogen.events.VoipCallingStatusEvent$a */
    public static final class C1158a {
    }

    public VoipCallingStatusEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof VoipCallingStatusEvent)) {
            return false;
        }
        C1158a aVar = ((VoipCallingStatusEvent) iEvent).f9577d;
        this.f9577d.getClass();
        Boolean bool = Boolean.FALSE;
        aVar.getClass();
        if (!C46238a.m51546a(bool, bool)) {
            return false;
        }
        this.f9577d.getClass();
        if (!C46238a.m51546a((Object) null, (Object) null)) {
            return false;
        }
        this.f9577d.getClass();
        return C46238a.m51546a(bool, bool);
    }
}
