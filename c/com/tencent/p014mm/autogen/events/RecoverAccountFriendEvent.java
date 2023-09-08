package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.RecoverAccountFriendEvent */
public final class RecoverAccountFriendEvent extends IEvent {

    /* renamed from: d */
    public C67773a f193880d = new C67773a();

    /* renamed from: com.tencent.mm.autogen.events.RecoverAccountFriendEvent$a */
    public static final class C67773a {

        /* renamed from: a */
        public String f193881a;

        /* renamed from: b */
        public int f193882b = 0;
    }

    public RecoverAccountFriendEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof RecoverAccountFriendEvent)) {
            return false;
        }
        C67773a aVar = ((RecoverAccountFriendEvent) iEvent).f193880d;
        return C46238a.m51546a(this.f193880d.f193881a, aVar.f193881a) && C46238a.m51546a(Integer.valueOf(this.f193880d.f193882b), Integer.valueOf(aVar.f193882b));
    }
}
