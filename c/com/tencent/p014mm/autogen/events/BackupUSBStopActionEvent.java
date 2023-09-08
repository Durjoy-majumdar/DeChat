package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.BackupUSBStopActionEvent */
public final class BackupUSBStopActionEvent extends IEvent {

    /* renamed from: d */
    public C28710a f78726d = new C28710a();

    /* renamed from: com.tencent.mm.autogen.events.BackupUSBStopActionEvent$a */
    public static final class C28710a {

        /* renamed from: a */
        public Object f78727a;
    }

    public BackupUSBStopActionEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof BackupUSBStopActionEvent)) {
            return false;
        }
        return C46238a.m51546a(this.f78726d.f78727a, ((BackupUSBStopActionEvent) iEvent).f78726d.f78727a);
    }
}
