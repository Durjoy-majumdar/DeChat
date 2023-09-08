package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.EmojiUnicodeConfUpdateEvent */
public final class EmojiUnicodeConfUpdateEvent extends IEvent {

    /* renamed from: d */
    public C28733a f78778d = new C28733a();

    /* renamed from: com.tencent.mm.autogen.events.EmojiUnicodeConfUpdateEvent$a */
    public static final class C28733a {

        /* renamed from: a */
        public int f78779a = 0;
    }

    public EmojiUnicodeConfUpdateEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof EmojiUnicodeConfUpdateEvent)) {
            return false;
        }
        return C46238a.m51546a(Integer.valueOf(this.f78778d.f78779a), Integer.valueOf(((EmojiUnicodeConfUpdateEvent) iEvent).f78778d.f78779a));
    }
}
