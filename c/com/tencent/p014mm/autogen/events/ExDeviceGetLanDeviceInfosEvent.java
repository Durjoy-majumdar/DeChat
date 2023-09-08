package com.tencent.p014mm.autogen.events;

import android.content.Context;
import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;
import org.json.JSONArray;

/* renamed from: com.tencent.mm.autogen.events.ExDeviceGetLanDeviceInfosEvent */
public final class ExDeviceGetLanDeviceInfosEvent extends IEvent {

    /* renamed from: d */
    public C1014a f9089d = new C1014a();

    /* renamed from: e */
    public C1015b f9090e = new C1015b();

    /* renamed from: com.tencent.mm.autogen.events.ExDeviceGetLanDeviceInfosEvent$a */
    public static final class C1014a {

        /* renamed from: a */
        public Context f9091a;

        /* renamed from: b */
        public String f9092b;
    }

    /* renamed from: com.tencent.mm.autogen.events.ExDeviceGetLanDeviceInfosEvent$b */
    public static final class C1015b {

        /* renamed from: a */
        public boolean f9093a;

        /* renamed from: b */
        public JSONArray f9094b;
    }

    public ExDeviceGetLanDeviceInfosEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof ExDeviceGetLanDeviceInfosEvent)) {
            return false;
        }
        ExDeviceGetLanDeviceInfosEvent exDeviceGetLanDeviceInfosEvent = (ExDeviceGetLanDeviceInfosEvent) iEvent;
        C1014a aVar = exDeviceGetLanDeviceInfosEvent.f9089d;
        if (!C46238a.m51546a(this.f9089d.f9091a, aVar.f9091a) || !C46238a.m51546a(this.f9089d.f9092b, aVar.f9092b)) {
            return false;
        }
        C1015b bVar = exDeviceGetLanDeviceInfosEvent.f9090e;
        return C46238a.m51546a(Boolean.valueOf(this.f9090e.f9093a), Boolean.valueOf(bVar.f9093a)) && C46238a.m51546a(this.f9090e.f9094b, bVar.f9094b);
    }
}
