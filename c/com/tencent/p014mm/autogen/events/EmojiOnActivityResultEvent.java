package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.EmojiOnActivityResultEvent */
public final class EmojiOnActivityResultEvent extends IEvent {

    /* renamed from: d */
    public C1005a f9065d = new C1005a();

    /* renamed from: com.tencent.mm.autogen.events.EmojiOnActivityResultEvent$a */
    public static final class C1005a {
    }

    public EmojiOnActivityResultEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof EmojiOnActivityResultEvent)) {
            return false;
        }
        C1005a aVar = ((EmojiOnActivityResultEvent) iEvent).f9065d;
        this.f9065d.getClass();
        aVar.getClass();
        if (!C46238a.m51546a(0, 0)) {
            return false;
        }
        this.f9065d.getClass();
        if (!C46238a.m51546a(0, 0)) {
            return false;
        }
        this.f9065d.getClass();
        return C46238a.m51546a((Object) null, (Object) null);
    }
}
