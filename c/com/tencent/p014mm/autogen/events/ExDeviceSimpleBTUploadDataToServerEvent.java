package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.ExDeviceSimpleBTUploadDataToServerEvent */
public final class ExDeviceSimpleBTUploadDataToServerEvent extends IEvent {

    /* renamed from: d */
    public C40089a f107506d = new C40089a();

    /* renamed from: e */
    public C40090b f107507e = new C40090b();

    /* renamed from: com.tencent.mm.autogen.events.ExDeviceSimpleBTUploadDataToServerEvent$a */
    public static final class C40089a {
    }

    /* renamed from: com.tencent.mm.autogen.events.ExDeviceSimpleBTUploadDataToServerEvent$b */
    public static final class C40090b {

        /* renamed from: a */
        public boolean f107508a;
    }

    public ExDeviceSimpleBTUploadDataToServerEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof ExDeviceSimpleBTUploadDataToServerEvent)) {
            return false;
        }
        ExDeviceSimpleBTUploadDataToServerEvent exDeviceSimpleBTUploadDataToServerEvent = (ExDeviceSimpleBTUploadDataToServerEvent) iEvent;
        C40089a aVar = exDeviceSimpleBTUploadDataToServerEvent.f107506d;
        this.f107506d.getClass();
        aVar.getClass();
        if (!C46238a.m51546a((Object) null, (Object) null)) {
            return false;
        }
        this.f107506d.getClass();
        if (!C46238a.m51546a((Object) null, (Object) null)) {
            return false;
        }
        this.f107506d.getClass();
        if (!C46238a.m51546a((Object) null, (Object) null)) {
            return false;
        }
        return C46238a.m51546a(Boolean.valueOf(this.f107507e.f107508a), Boolean.valueOf(exDeviceSimpleBTUploadDataToServerEvent.f107507e.f107508a));
    }
}
