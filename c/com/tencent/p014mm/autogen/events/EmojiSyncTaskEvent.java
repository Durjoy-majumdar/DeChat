package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.EmojiSyncTaskEvent */
public final class EmojiSyncTaskEvent extends IEvent {

    /* renamed from: d */
    public C40056a f107420d = new C40056a();

    /* renamed from: com.tencent.mm.autogen.events.EmojiSyncTaskEvent$a */
    public static final class C40056a {

        /* renamed from: a */
        public int f107421a;

        /* renamed from: b */
        public String f107422b;

        /* renamed from: c */
        public boolean f107423c;
    }

    public EmojiSyncTaskEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof EmojiSyncTaskEvent)) {
            return false;
        }
        C40056a aVar = ((EmojiSyncTaskEvent) iEvent).f107420d;
        return C46238a.m51546a(Integer.valueOf(this.f107420d.f107421a), Integer.valueOf(aVar.f107421a)) && C46238a.m51546a(this.f107420d.f107422b, aVar.f107422b) && C46238a.m51546a(Boolean.valueOf(this.f107420d.f107423c), Boolean.valueOf(aVar.f107423c));
    }
}
