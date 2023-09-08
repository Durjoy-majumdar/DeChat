package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.PermissionOpMarkEvent */
public final class PermissionOpMarkEvent extends IEvent {

    /* renamed from: d */
    public C92541a f264983d = new C92541a();

    /* renamed from: e */
    public C92542b f264984e = new C92542b();

    /* renamed from: com.tencent.mm.autogen.events.PermissionOpMarkEvent$a */
    public static final class C92541a {

        /* renamed from: a */
        public boolean f264985a = false;

        /* renamed from: b */
        public int f264986b;

        /* renamed from: c */
        public boolean f264987c = false;
    }

    /* renamed from: com.tencent.mm.autogen.events.PermissionOpMarkEvent$b */
    public static final class C92542b {
    }

    public PermissionOpMarkEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof PermissionOpMarkEvent)) {
            return false;
        }
        PermissionOpMarkEvent permissionOpMarkEvent = (PermissionOpMarkEvent) iEvent;
        C92541a aVar = permissionOpMarkEvent.f264983d;
        if (!C46238a.m51546a(Boolean.valueOf(this.f264983d.f264985a), Boolean.valueOf(aVar.f264985a)) || !C46238a.m51546a(Integer.valueOf(this.f264983d.f264986b), Integer.valueOf(aVar.f264986b)) || !C46238a.m51546a(Boolean.valueOf(this.f264983d.f264987c), Boolean.valueOf(aVar.f264987c))) {
            return false;
        }
        C92542b bVar = permissionOpMarkEvent.f264984e;
        this.f264984e.getClass();
        Boolean bool = Boolean.FALSE;
        bVar.getClass();
        return C46238a.m51546a(bool, bool);
    }
}
