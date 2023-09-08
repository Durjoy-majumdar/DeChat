package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.storage.emotion.EmojiInfo;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.EmojiFileCheckerEvent */
public final class EmojiFileCheckerEvent extends IEvent {

    /* renamed from: d */
    public C40055a f107418d = new C40055a();

    /* renamed from: com.tencent.mm.autogen.events.EmojiFileCheckerEvent$a */
    public static final class C40055a {

        /* renamed from: a */
        public EmojiInfo f107419a;
    }

    public EmojiFileCheckerEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof EmojiFileCheckerEvent)) {
            return false;
        }
        C40055a aVar = ((EmojiFileCheckerEvent) iEvent).f107418d;
        this.f107418d.getClass();
        aVar.getClass();
        if (!C46238a.m51546a(0, 0) || !C46238a.m51546a(this.f107418d.f107419a, aVar.f107419a)) {
            return false;
        }
        this.f107418d.getClass();
        return C46238a.m51546a((Object) null, (Object) null);
    }
}
