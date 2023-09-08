package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.StoryGalleryFullScreenEvent */
public final class StoryGalleryFullScreenEvent extends IEvent {

    /* renamed from: d */
    public C1149a f9560d = new C1149a();

    /* renamed from: com.tencent.mm.autogen.events.StoryGalleryFullScreenEvent$a */
    public static final class C1149a {
    }

    public StoryGalleryFullScreenEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof StoryGalleryFullScreenEvent)) {
            return false;
        }
        C1149a aVar = ((StoryGalleryFullScreenEvent) iEvent).f9560d;
        this.f9560d.getClass();
        Boolean bool = Boolean.FALSE;
        aVar.getClass();
        return C46238a.m51546a(bool, bool);
    }
}
