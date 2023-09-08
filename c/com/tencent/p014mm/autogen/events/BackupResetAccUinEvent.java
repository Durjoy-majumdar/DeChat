package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;

/* renamed from: com.tencent.mm.autogen.events.BackupResetAccUinEvent */
public final class BackupResetAccUinEvent extends IEvent {
    public BackupResetAccUinEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof BackupResetAccUinEvent)) {
            return false;
        }
        BackupResetAccUinEvent backupResetAccUinEvent = (BackupResetAccUinEvent) iEvent;
        return true;
    }
}
