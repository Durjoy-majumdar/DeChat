package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.GetEmojiIsUseUnicodeEvent */
public final class GetEmojiIsUseUnicodeEvent extends IEvent {

    /* renamed from: d */
    public C28756a f78823d = new C28756a();

    /* renamed from: com.tencent.mm.autogen.events.GetEmojiIsUseUnicodeEvent$a */
    public static final class C28756a {

        /* renamed from: a */
        public int f78824a = 0;
    }

    public GetEmojiIsUseUnicodeEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof GetEmojiIsUseUnicodeEvent)) {
            return false;
        }
        return C46238a.m51546a(Integer.valueOf(this.f78823d.f78824a), Integer.valueOf(((GetEmojiIsUseUnicodeEvent) iEvent).f78823d.f78824a));
    }
}
