package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.TranslateMessageListResultEvent */
public final class TranslateMessageListResultEvent extends IEvent {

    /* renamed from: d */
    public C28843a f79036d = new C28843a();

    /* renamed from: com.tencent.mm.autogen.events.TranslateMessageListResultEvent$a */
    public static final class C28843a {
    }

    public TranslateMessageListResultEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof TranslateMessageListResultEvent)) {
            return false;
        }
        C28843a aVar = ((TranslateMessageListResultEvent) iEvent).f79036d;
        this.f79036d.getClass();
        aVar.getClass();
        return C46238a.m51546a((Object) null, (Object) null);
    }
}
