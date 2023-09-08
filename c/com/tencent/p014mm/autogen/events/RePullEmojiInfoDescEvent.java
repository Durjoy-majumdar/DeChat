package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.RePullEmojiInfoDescEvent */
public final class RePullEmojiInfoDescEvent extends IEvent {

    /* renamed from: d */
    public C28792a f78897d = new C28792a();

    /* renamed from: com.tencent.mm.autogen.events.RePullEmojiInfoDescEvent$a */
    public static final class C28792a {

        /* renamed from: a */
        public String f78898a;
    }

    public RePullEmojiInfoDescEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof RePullEmojiInfoDescEvent)) {
            return false;
        }
        return C46238a.m51546a(this.f78897d.f78898a, ((RePullEmojiInfoDescEvent) iEvent).f78897d.f78898a);
    }
}
