package com.tencent.p014mm.autogen.events;

import android.content.Context;
import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;
import org.json.JSONArray;

/* renamed from: com.tencent.mm.autogen.events.ExDeviceGetDeviceInfosEvent */
public final class ExDeviceGetDeviceInfosEvent extends IEvent {

    /* renamed from: d */
    public C1012a f9083d = new C1012a();

    /* renamed from: e */
    public C1013b f9084e = new C1013b();

    /* renamed from: com.tencent.mm.autogen.events.ExDeviceGetDeviceInfosEvent$a */
    public static final class C1012a {

        /* renamed from: a */
        public Context f9085a;

        /* renamed from: b */
        public String f9086b;
    }

    /* renamed from: com.tencent.mm.autogen.events.ExDeviceGetDeviceInfosEvent$b */
    public static final class C1013b {

        /* renamed from: a */
        public boolean f9087a;

        /* renamed from: b */
        public JSONArray f9088b;
    }

    public ExDeviceGetDeviceInfosEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof ExDeviceGetDeviceInfosEvent)) {
            return false;
        }
        ExDeviceGetDeviceInfosEvent exDeviceGetDeviceInfosEvent = (ExDeviceGetDeviceInfosEvent) iEvent;
        C1012a aVar = exDeviceGetDeviceInfosEvent.f9083d;
        if (!C46238a.m51546a(this.f9083d.f9085a, aVar.f9085a) || !C46238a.m51546a(this.f9083d.f9086b, aVar.f9086b)) {
            return false;
        }
        C1013b bVar = exDeviceGetDeviceInfosEvent.f9084e;
        return C46238a.m51546a(Boolean.valueOf(this.f9084e.f9087a), Boolean.valueOf(bVar.f9087a)) && C46238a.m51546a(this.f9084e.f9088b, bVar.f9088b);
    }
}
