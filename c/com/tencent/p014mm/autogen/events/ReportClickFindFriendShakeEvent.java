package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.ReportClickFindFriendShakeEvent */
public final class ReportClickFindFriendShakeEvent extends IEvent {

    /* renamed from: d */
    public C28801a f78924d = new C28801a();

    /* renamed from: com.tencent.mm.autogen.events.ReportClickFindFriendShakeEvent$a */
    public static final class C28801a {
    }

    public ReportClickFindFriendShakeEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof ReportClickFindFriendShakeEvent)) {
            return false;
        }
        C28801a aVar = ((ReportClickFindFriendShakeEvent) iEvent).f78924d;
        this.f78924d.getClass();
        aVar.getClass();
        return C46238a.m51546a(1, 1);
    }
}
