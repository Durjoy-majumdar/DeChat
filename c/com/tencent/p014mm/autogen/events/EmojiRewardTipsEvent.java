package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.EmojiRewardTipsEvent */
public final class EmojiRewardTipsEvent extends IEvent {

    /* renamed from: d */
    public C28732a f78776d = new C28732a();

    /* renamed from: com.tencent.mm.autogen.events.EmojiRewardTipsEvent$a */
    public static final class C28732a {

        /* renamed from: a */
        public boolean f78777a;
    }

    public EmojiRewardTipsEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof EmojiRewardTipsEvent)) {
            return false;
        }
        return C46238a.m51546a(Boolean.valueOf(this.f78776d.f78777a), Boolean.valueOf(((EmojiRewardTipsEvent) iEvent).f78776d.f78777a));
    }
}
