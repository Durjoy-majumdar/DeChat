package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.TalkRoomeStatusBarHideEvent */
public final class TalkRoomeStatusBarHideEvent extends IEvent {

    /* renamed from: d */
    public C67798a f193957d = new C67798a();

    /* renamed from: com.tencent.mm.autogen.events.TalkRoomeStatusBarHideEvent$a */
    public static final class C67798a {

        /* renamed from: a */
        public boolean f193958a = false;
    }

    public TalkRoomeStatusBarHideEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof TalkRoomeStatusBarHideEvent)) {
            return false;
        }
        return C46238a.m51546a(Boolean.valueOf(this.f193957d.f193958a), Boolean.valueOf(((TalkRoomeStatusBarHideEvent) iEvent).f193957d.f193958a));
    }
}
