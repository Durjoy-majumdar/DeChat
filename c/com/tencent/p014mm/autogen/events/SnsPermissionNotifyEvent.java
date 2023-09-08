package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.SnsPermissionNotifyEvent */
public final class SnsPermissionNotifyEvent extends IEvent {

    /* renamed from: d */
    public C40168a f107766d = new C40168a();

    /* renamed from: com.tencent.mm.autogen.events.SnsPermissionNotifyEvent$a */
    public static final class C40168a {

        /* renamed from: a */
        public boolean f107767a;

        /* renamed from: b */
        public boolean f107768b;

        /* renamed from: c */
        public String f107769c;

        /* renamed from: d */
        public boolean f107770d;
    }

    public SnsPermissionNotifyEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof SnsPermissionNotifyEvent)) {
            return false;
        }
        C40168a aVar = ((SnsPermissionNotifyEvent) iEvent).f107766d;
        return C46238a.m51546a(Boolean.valueOf(this.f107766d.f107767a), Boolean.valueOf(aVar.f107767a)) && C46238a.m51546a(Boolean.valueOf(this.f107766d.f107768b), Boolean.valueOf(aVar.f107768b)) && C46238a.m51546a(this.f107766d.f107769c, aVar.f107769c) && C46238a.m51546a(Boolean.valueOf(this.f107766d.f107770d), Boolean.valueOf(aVar.f107770d));
    }
}
