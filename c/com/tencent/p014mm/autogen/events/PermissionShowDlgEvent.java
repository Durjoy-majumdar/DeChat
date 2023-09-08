package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.PermissionShowDlgEvent */
public final class PermissionShowDlgEvent extends IEvent {

    /* renamed from: d */
    public C92543a f264988d = new C92543a();

    /* renamed from: e */
    public C92544b f264989e = new C92544b();

    /* renamed from: com.tencent.mm.autogen.events.PermissionShowDlgEvent$a */
    public static final class C92543a {

        /* renamed from: a */
        public int f264990a;
    }

    /* renamed from: com.tencent.mm.autogen.events.PermissionShowDlgEvent$b */
    public static final class C92544b {
    }

    public PermissionShowDlgEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof PermissionShowDlgEvent)) {
            return false;
        }
        PermissionShowDlgEvent permissionShowDlgEvent = (PermissionShowDlgEvent) iEvent;
        if (!C46238a.m51546a(Integer.valueOf(this.f264988d.f264990a), Integer.valueOf(permissionShowDlgEvent.f264988d.f264990a))) {
            return false;
        }
        C92544b bVar = permissionShowDlgEvent.f264989e;
        this.f264989e.getClass();
        Boolean bool = Boolean.FALSE;
        bVar.getClass();
        return C46238a.m51546a(bool, bool);
    }
}
