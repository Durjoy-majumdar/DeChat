package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.RtosWatchSaveQuickReplyEvent */
public final class RtosWatchSaveQuickReplyEvent extends IEvent {

    /* renamed from: d */
    public C28814a f78957d = new C28814a();

    /* renamed from: e */
    public C28815b f78958e = new C28815b();

    /* renamed from: com.tencent.mm.autogen.events.RtosWatchSaveQuickReplyEvent$a */
    public static final class C28814a {

        /* renamed from: a */
        public String f78959a;
    }

    /* renamed from: com.tencent.mm.autogen.events.RtosWatchSaveQuickReplyEvent$b */
    public static final class C28815b {

        /* renamed from: a */
        public String f78960a;
    }

    public RtosWatchSaveQuickReplyEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof RtosWatchSaveQuickReplyEvent)) {
            return false;
        }
        RtosWatchSaveQuickReplyEvent rtosWatchSaveQuickReplyEvent = (RtosWatchSaveQuickReplyEvent) iEvent;
        if (!C46238a.m51546a(this.f78957d.f78959a, rtosWatchSaveQuickReplyEvent.f78957d.f78959a)) {
            return false;
        }
        return C46238a.m51546a(this.f78958e.f78960a, rtosWatchSaveQuickReplyEvent.f78958e.f78960a);
    }
}
