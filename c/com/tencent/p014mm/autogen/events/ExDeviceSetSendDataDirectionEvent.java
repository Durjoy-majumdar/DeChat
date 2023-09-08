package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.ExDeviceSetSendDataDirectionEvent */
public final class ExDeviceSetSendDataDirectionEvent extends IEvent {

    /* renamed from: d */
    public C1028a f9132d = new C1028a();

    /* renamed from: e */
    public C1029b f9133e = new C1029b();

    /* renamed from: com.tencent.mm.autogen.events.ExDeviceSetSendDataDirectionEvent$a */
    public static final class C1028a {

        /* renamed from: a */
        public String f9134a;

        /* renamed from: b */
        public int f9135b;

        /* renamed from: c */
        public boolean f9136c;
    }

    /* renamed from: com.tencent.mm.autogen.events.ExDeviceSetSendDataDirectionEvent$b */
    public static final class C1029b {

        /* renamed from: a */
        public boolean f9137a;
    }

    public ExDeviceSetSendDataDirectionEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof ExDeviceSetSendDataDirectionEvent)) {
            return false;
        }
        ExDeviceSetSendDataDirectionEvent exDeviceSetSendDataDirectionEvent = (ExDeviceSetSendDataDirectionEvent) iEvent;
        C1028a aVar = exDeviceSetSendDataDirectionEvent.f9132d;
        if (!C46238a.m51546a(this.f9132d.f9134a, aVar.f9134a) || !C46238a.m51546a(Integer.valueOf(this.f9132d.f9135b), Integer.valueOf(aVar.f9135b)) || !C46238a.m51546a(Boolean.valueOf(this.f9132d.f9136c), Boolean.valueOf(aVar.f9136c))) {
            return false;
        }
        return C46238a.m51546a(Boolean.valueOf(this.f9133e.f9137a), Boolean.valueOf(exDeviceSetSendDataDirectionEvent.f9133e.f9137a));
    }
}
