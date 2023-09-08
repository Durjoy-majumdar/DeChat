package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.FindMoreFriendEntryRedDotEvent */
public final class FindMoreFriendEntryRedDotEvent extends IEvent {

    /* renamed from: d */
    public C28743a f78789d = new C28743a();

    /* renamed from: com.tencent.mm.autogen.events.FindMoreFriendEntryRedDotEvent$a */
    public static final class C28743a {

        /* renamed from: a */
        public String f78790a;

        /* renamed from: b */
        public boolean f78791b;
    }

    public FindMoreFriendEntryRedDotEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof FindMoreFriendEntryRedDotEvent)) {
            return false;
        }
        C28743a aVar = ((FindMoreFriendEntryRedDotEvent) iEvent).f78789d;
        return C46238a.m51546a(this.f78789d.f78790a, aVar.f78790a) && C46238a.m51546a(Boolean.valueOf(this.f78789d.f78791b), Boolean.valueOf(aVar.f78791b));
    }
}
