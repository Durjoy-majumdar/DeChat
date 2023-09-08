package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.BackupStartMergeEvent */
public final class BackupStartMergeEvent extends IEvent {

    /* renamed from: d */
    public C92465a f264640d = new C92465a();

    /* renamed from: com.tencent.mm.autogen.events.BackupStartMergeEvent$a */
    public static final class C92465a {

        /* renamed from: a */
        public int f264641a;
    }

    public BackupStartMergeEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof BackupStartMergeEvent)) {
            return false;
        }
        return C46238a.m51546a(Integer.valueOf(this.f264640d.f264641a), Integer.valueOf(((BackupStartMergeEvent) iEvent).f264640d.f264641a));
    }
}
