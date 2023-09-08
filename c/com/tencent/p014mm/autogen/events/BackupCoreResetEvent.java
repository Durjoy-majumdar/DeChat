package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;

/* renamed from: com.tencent.mm.autogen.events.BackupCoreResetEvent */
public final class BackupCoreResetEvent extends IEvent {
    public BackupCoreResetEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof BackupCoreResetEvent)) {
            return false;
        }
        BackupCoreResetEvent backupCoreResetEvent = (BackupCoreResetEvent) iEvent;
        return true;
    }
}
