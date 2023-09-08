package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;

/* renamed from: com.tencent.mm.autogen.events.BackupPcManagerEvent */
public final class BackupPcManagerEvent extends IEvent {
    public BackupPcManagerEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof BackupPcManagerEvent)) {
            return false;
        }
        BackupPcManagerEvent backupPcManagerEvent = (BackupPcManagerEvent) iEvent;
        return true;
    }
}
