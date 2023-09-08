package com.tencent.p014mm.autogen.events;

import android.content.Context;
import android.os.Bundle;
import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.ApduEngineFuncEvent */
public final class ApduEngineFuncEvent extends IEvent {

    /* renamed from: d */
    public C40036a f107356d = new C40036a();

    /* renamed from: e */
    public C40037b f107357e = new C40037b();

    /* renamed from: com.tencent.mm.autogen.events.ApduEngineFuncEvent$a */
    public static final class C40036a {

        /* renamed from: a */
        public int f107358a;

        /* renamed from: b */
        public Context f107359b;

        /* renamed from: c */
        public String f107360c;

        /* renamed from: d */
        public boolean f107361d;

        /* renamed from: e */
        public boolean f107362e;
    }

    /* renamed from: com.tencent.mm.autogen.events.ApduEngineFuncEvent$b */
    public static final class C40037b {

        /* renamed from: a */
        public Bundle f107363a;
    }

    public ApduEngineFuncEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof ApduEngineFuncEvent)) {
            return false;
        }
        ApduEngineFuncEvent apduEngineFuncEvent = (ApduEngineFuncEvent) iEvent;
        C40036a aVar = apduEngineFuncEvent.f107356d;
        if (!C46238a.m51546a(Integer.valueOf(this.f107356d.f107358a), Integer.valueOf(aVar.f107358a)) || !C46238a.m51546a(this.f107356d.f107359b, aVar.f107359b) || !C46238a.m51546a(this.f107356d.f107360c, aVar.f107360c) || !C46238a.m51546a(Boolean.valueOf(this.f107356d.f107361d), Boolean.valueOf(aVar.f107361d)) || !C46238a.m51546a(Boolean.valueOf(this.f107356d.f107362e), Boolean.valueOf(aVar.f107362e))) {
            return false;
        }
        return C46238a.m51546a(this.f107357e.f107363a, apduEngineFuncEvent.f107357e.f107363a);
    }
}
