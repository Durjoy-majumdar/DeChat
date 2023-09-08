package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.storage.C72963f4;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.UploadEmojiMsgEvent */
public final class UploadEmojiMsgEvent extends IEvent {

    /* renamed from: d */
    public C67812a f194000d = new C67812a();

    /* renamed from: com.tencent.mm.autogen.events.UploadEmojiMsgEvent$a */
    public static final class C67812a {

        /* renamed from: a */
        public C72963f4 f194001a;
    }

    public UploadEmojiMsgEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof UploadEmojiMsgEvent)) {
            return false;
        }
        return C46238a.m51546a(this.f194000d.f194001a, ((UploadEmojiMsgEvent) iEvent).f194000d.f194001a);
    }
}
