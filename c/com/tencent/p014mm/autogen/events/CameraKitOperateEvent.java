package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.CameraKitOperateEvent */
public final class CameraKitOperateEvent extends IEvent {

    /* renamed from: d */
    public C104590a f309992d = new C104590a();

    /* renamed from: com.tencent.mm.autogen.events.CameraKitOperateEvent$a */
    public static final class C104590a {

        /* renamed from: a */
        public int f309993a = -1;

        /* renamed from: b */
        public int f309994b = -1;

        /* renamed from: c */
        public String f309995c;
    }

    public CameraKitOperateEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof CameraKitOperateEvent)) {
            return false;
        }
        C104590a aVar = ((CameraKitOperateEvent) iEvent).f309992d;
        return C46238a.m51546a(Integer.valueOf(this.f309992d.f309993a), Integer.valueOf(aVar.f309993a)) && C46238a.m51546a(Integer.valueOf(this.f309992d.f309994b), Integer.valueOf(aVar.f309994b)) && C46238a.m51546a(this.f309992d.f309995c, aVar.f309995c);
    }
}
