package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.EmojiUpdatePanelEvent */
public final class EmojiUpdatePanelEvent extends IEvent {

    /* renamed from: d */
    public C67678a f193547d = new C67678a();

    /* renamed from: e */
    public C67679b f193548e = new C67679b();

    /* renamed from: com.tencent.mm.autogen.events.EmojiUpdatePanelEvent$a */
    public static final class C67678a {

        /* renamed from: a */
        public int f193549a;
    }

    /* renamed from: com.tencent.mm.autogen.events.EmojiUpdatePanelEvent$b */
    public static final class C67679b {

        /* renamed from: a */
        public boolean f193550a;
    }

    public EmojiUpdatePanelEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof EmojiUpdatePanelEvent)) {
            return false;
        }
        EmojiUpdatePanelEvent emojiUpdatePanelEvent = (EmojiUpdatePanelEvent) iEvent;
        if (!C46238a.m51546a(Integer.valueOf(this.f193547d.f193549a), Integer.valueOf(emojiUpdatePanelEvent.f193547d.f193549a))) {
            return false;
        }
        return C46238a.m51546a(Boolean.valueOf(this.f193548e.f193550a), Boolean.valueOf(emojiUpdatePanelEvent.f193548e.f193550a));
    }
}
