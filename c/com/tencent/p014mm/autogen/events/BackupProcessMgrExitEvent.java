package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.BackupProcessMgrExitEvent */
public final class BackupProcessMgrExitEvent extends IEvent {

    /* renamed from: d */
    public C28709a f78724d = new C28709a();

    /* renamed from: com.tencent.mm.autogen.events.BackupProcessMgrExitEvent$a */
    public static final class C28709a {

        /* renamed from: a */
        public boolean f78725a;
    }

    public BackupProcessMgrExitEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof BackupProcessMgrExitEvent)) {
            return false;
        }
        return C46238a.m51546a(Boolean.valueOf(this.f78724d.f78725a), Boolean.valueOf(((BackupProcessMgrExitEvent) iEvent).f78724d.f78725a));
    }
}
