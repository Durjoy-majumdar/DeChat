package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.protocal.protobuf.FinderJumpInfo;
import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.PostJumpInfoEvent */
public final class PostJumpInfoEvent extends IEvent {

    /* renamed from: d */
    public C1109a f9401d = new C1109a();

    /* renamed from: com.tencent.mm.autogen.events.PostJumpInfoEvent$a */
    public static final class C1109a {

        /* renamed from: a */
        public FinderJumpInfo f9402a;
    }

    public PostJumpInfoEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof PostJumpInfoEvent)) {
            return false;
        }
        return C46238a.m51546a(this.f9401d.f9402a, ((PostJumpInfoEvent) iEvent).f9401d.f9402a);
    }
}
