package com.tencent.p014mm.autogen.events;

import android.content.Intent;
import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.ReportNewInstallAppEvent */
public final class ReportNewInstallAppEvent extends IEvent {

    /* renamed from: d */
    public C28802a f78925d = new C28802a();

    /* renamed from: com.tencent.mm.autogen.events.ReportNewInstallAppEvent$a */
    public static final class C28802a {

        /* renamed from: a */
        public Intent f78926a;
    }

    public ReportNewInstallAppEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof ReportNewInstallAppEvent)) {
            return false;
        }
        return C46238a.m51546a(this.f78925d.f78926a, ((ReportNewInstallAppEvent) iEvent).f78925d.f78926a);
    }
}
