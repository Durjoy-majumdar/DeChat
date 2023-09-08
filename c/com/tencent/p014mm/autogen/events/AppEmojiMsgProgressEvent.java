package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.AppEmojiMsgProgressEvent */
public final class AppEmojiMsgProgressEvent extends IEvent {

    /* renamed from: d */
    public C67658a f193475d = new C67658a();

    /* renamed from: com.tencent.mm.autogen.events.AppEmojiMsgProgressEvent$a */
    public static final class C67658a {

        /* renamed from: a */
        public String f193476a;

        /* renamed from: b */
        public int f193477b;

        /* renamed from: c */
        public int f193478c;
    }

    public AppEmojiMsgProgressEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof AppEmojiMsgProgressEvent)) {
            return false;
        }
        C67658a aVar = ((AppEmojiMsgProgressEvent) iEvent).f193475d;
        return C46238a.m51546a(this.f193475d.f193476a, aVar.f193476a) && C46238a.m51546a(Integer.valueOf(this.f193475d.f193477b), Integer.valueOf(aVar.f193477b)) && C46238a.m51546a(Integer.valueOf(this.f193475d.f193478c), Integer.valueOf(aVar.f193478c));
    }
}
