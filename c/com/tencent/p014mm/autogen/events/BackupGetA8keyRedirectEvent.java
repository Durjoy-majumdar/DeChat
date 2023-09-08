package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.BackupGetA8keyRedirectEvent */
public final class BackupGetA8keyRedirectEvent extends IEvent {

    /* renamed from: d */
    public C28708a f78722d = new C28708a();

    /* renamed from: com.tencent.mm.autogen.events.BackupGetA8keyRedirectEvent$a */
    public static final class C28708a {

        /* renamed from: a */
        public String f78723a;
    }

    public BackupGetA8keyRedirectEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof BackupGetA8keyRedirectEvent)) {
            return false;
        }
        return C46238a.m51546a(this.f78722d.f78723a, ((BackupGetA8keyRedirectEvent) iEvent).f78722d.f78723a);
    }
}
