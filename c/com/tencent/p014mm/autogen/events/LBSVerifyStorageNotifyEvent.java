package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.LBSVerifyStorageNotifyEvent */
public final class LBSVerifyStorageNotifyEvent extends IEvent {

    /* renamed from: d */
    public C28770a f78856d = new C28770a();

    /* renamed from: com.tencent.mm.autogen.events.LBSVerifyStorageNotifyEvent$a */
    public static final class C28770a {
    }

    public LBSVerifyStorageNotifyEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof LBSVerifyStorageNotifyEvent)) {
            return false;
        }
        C28770a aVar = ((LBSVerifyStorageNotifyEvent) iEvent).f78856d;
        this.f78856d.getClass();
        aVar.getClass();
        return C46238a.m51546a((Object) null, (Object) null);
    }
}
