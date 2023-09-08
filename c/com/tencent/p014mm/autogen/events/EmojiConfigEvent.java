package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.EmojiConfigEvent */
public final class EmojiConfigEvent extends IEvent {

    /* renamed from: d */
    public C92475a f264694d = new C92475a();

    /* renamed from: com.tencent.mm.autogen.events.EmojiConfigEvent$a */
    public static final class C92475a {

        /* renamed from: a */
        public int f264695a = 1;
    }

    public EmojiConfigEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof EmojiConfigEvent)) {
            return false;
        }
        return C46238a.m51546a(Integer.valueOf(this.f264694d.f264695a), Integer.valueOf(((EmojiConfigEvent) iEvent).f264694d.f264695a));
    }
}
