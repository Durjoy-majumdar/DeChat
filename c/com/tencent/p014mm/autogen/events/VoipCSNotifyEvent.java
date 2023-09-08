package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.VoipCSNotifyEvent */
public final class VoipCSNotifyEvent extends IEvent {

    /* renamed from: d */
    public C92610a f265257d = new C92610a();

    /* renamed from: com.tencent.mm.autogen.events.VoipCSNotifyEvent$a */
    public static final class C92610a {

        /* renamed from: a */
        public byte[] f265258a;
    }

    public VoipCSNotifyEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof VoipCSNotifyEvent)) {
            return false;
        }
        C92610a aVar = ((VoipCSNotifyEvent) iEvent).f265257d;
        this.f265257d.getClass();
        aVar.getClass();
        if (!C46238a.m51546a((Object) null, (Object) null)) {
            return false;
        }
        this.f265257d.getClass();
        if (!C46238a.m51546a(0, 0) || !C46238a.m51546a(this.f265257d.f265258a, aVar.f265258a)) {
            return false;
        }
        this.f265257d.getClass();
        if (!C46238a.m51546a((Object) null, (Object) null)) {
            return false;
        }
        this.f265257d.getClass();
        if (!C46238a.m51546a((Object) null, (Object) null)) {
            return false;
        }
        this.f265257d.getClass();
        return C46238a.m51546a(0, 0);
    }
}
