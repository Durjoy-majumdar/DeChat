package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.WearDownloadEmojiEvent */
public final class WearDownloadEmojiEvent extends IEvent {

    /* renamed from: d */
    public C40184a f107823d = new C40184a();

    /* renamed from: com.tencent.mm.autogen.events.WearDownloadEmojiEvent$a */
    public static final class C40184a {

        /* renamed from: a */
        public int f107824a;

        /* renamed from: b */
        public String[] f107825b;
    }

    public WearDownloadEmojiEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof WearDownloadEmojiEvent)) {
            return false;
        }
        C40184a aVar = ((WearDownloadEmojiEvent) iEvent).f107823d;
        return C46238a.m51546a(Integer.valueOf(this.f107823d.f107824a), Integer.valueOf(aVar.f107824a)) && C46238a.m51546a(this.f107823d.f107825b, aVar.f107825b);
    }
}
