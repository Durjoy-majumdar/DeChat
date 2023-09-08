package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.FinishGetNewEmojiThumbEvent */
public final class FinishGetNewEmojiThumbEvent extends IEvent {

    /* renamed from: d */
    public C28748a f78808d = new C28748a();

    /* renamed from: com.tencent.mm.autogen.events.FinishGetNewEmojiThumbEvent$a */
    public static final class C28748a {
    }

    public FinishGetNewEmojiThumbEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof FinishGetNewEmojiThumbEvent)) {
            return false;
        }
        C28748a aVar = ((FinishGetNewEmojiThumbEvent) iEvent).f78808d;
        this.f78808d.getClass();
        aVar.getClass();
        return C46238a.m51546a((Object) null, (Object) null);
    }
}
