package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.CheckEmojiFileEvent */
public final class CheckEmojiFileEvent extends IEvent {

    /* renamed from: d */
    public C28716a f78737d = new C28716a();

    /* renamed from: e */
    public C28717b f78738e = new C28717b();

    /* renamed from: com.tencent.mm.autogen.events.CheckEmojiFileEvent$a */
    public static final class C28716a {
    }

    /* renamed from: com.tencent.mm.autogen.events.CheckEmojiFileEvent$b */
    public static final class C28717b {
    }

    public CheckEmojiFileEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof CheckEmojiFileEvent)) {
            return false;
        }
        CheckEmojiFileEvent checkEmojiFileEvent = (CheckEmojiFileEvent) iEvent;
        C28716a aVar = checkEmojiFileEvent.f78737d;
        this.f78737d.getClass();
        aVar.getClass();
        if (!C46238a.m51546a(0, 0)) {
            return false;
        }
        this.f78737d.getClass();
        if (!C46238a.m51546a((Object) null, (Object) null)) {
            return false;
        }
        this.f78737d.getClass();
        if (!C46238a.m51546a((Object) null, (Object) null)) {
            return false;
        }
        C28717b bVar = checkEmojiFileEvent.f78738e;
        this.f78738e.getClass();
        Boolean bool = Boolean.FALSE;
        bVar.getClass();
        return C46238a.m51546a(bool, bool);
    }
}
