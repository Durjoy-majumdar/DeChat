package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.VoipCheckIsDeviceUsingEvent */
public final class VoipCheckIsDeviceUsingEvent extends IEvent {

    /* renamed from: d */
    public C67817a f194014d = new C67817a();

    /* renamed from: com.tencent.mm.autogen.events.VoipCheckIsDeviceUsingEvent$a */
    public static final class C67817a {

        /* renamed from: a */
        public boolean f194015a = false;

        /* renamed from: b */
        public boolean f194016b = false;

        /* renamed from: c */
        public boolean f194017c = false;

        /* renamed from: d */
        public String f194018d;
    }

    public VoipCheckIsDeviceUsingEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof VoipCheckIsDeviceUsingEvent)) {
            return false;
        }
        C67817a aVar = ((VoipCheckIsDeviceUsingEvent) iEvent).f194014d;
        return C46238a.m51546a(Boolean.valueOf(this.f194014d.f194015a), Boolean.valueOf(aVar.f194015a)) && C46238a.m51546a(Boolean.valueOf(this.f194014d.f194016b), Boolean.valueOf(aVar.f194016b)) && C46238a.m51546a(Boolean.valueOf(this.f194014d.f194017c), Boolean.valueOf(aVar.f194017c)) && C46238a.m51546a(this.f194014d.f194018d, aVar.f194018d);
    }
}
