package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.EmojiFileCleanTaskEvent */
public final class EmojiFileCleanTaskEvent extends IEvent {

    /* renamed from: d */
    public C28731a f78774d = new C28731a();

    /* renamed from: com.tencent.mm.autogen.events.EmojiFileCleanTaskEvent$a */
    public static final class C28731a {

        /* renamed from: a */
        public int f78775a = -1;
    }

    public EmojiFileCleanTaskEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof EmojiFileCleanTaskEvent)) {
            return false;
        }
        return C46238a.m51546a(Integer.valueOf(this.f78774d.f78775a), Integer.valueOf(((EmojiFileCleanTaskEvent) iEvent).f78774d.f78775a));
    }
}
