package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.StoryCheckedFavFromGalleryEvent */
public final class StoryCheckedFavFromGalleryEvent extends IEvent {

    /* renamed from: d */
    public C92602a f265227d = new C92602a();

    /* renamed from: com.tencent.mm.autogen.events.StoryCheckedFavFromGalleryEvent$a */
    public static final class C92602a {

        /* renamed from: a */
        public boolean f265228a = false;

        /* renamed from: b */
        public long f265229b = 0;
    }

    public StoryCheckedFavFromGalleryEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof StoryCheckedFavFromGalleryEvent)) {
            return false;
        }
        C92602a aVar = ((StoryCheckedFavFromGalleryEvent) iEvent).f265227d;
        return C46238a.m51546a(Boolean.valueOf(this.f265227d.f265228a), Boolean.valueOf(aVar.f265228a)) && C46238a.m51546a(Long.valueOf(this.f265227d.f265229b), Long.valueOf(aVar.f265229b));
    }
}
