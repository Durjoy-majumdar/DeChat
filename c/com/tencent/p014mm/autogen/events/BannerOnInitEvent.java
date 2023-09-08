package com.tencent.p014mm.autogen.events;

import android.app.Activity;
import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.BannerOnInitEvent */
public final class BannerOnInitEvent extends IEvent {

    /* renamed from: d */
    public C67661a f193487d = new C67661a();

    /* renamed from: com.tencent.mm.autogen.events.BannerOnInitEvent$a */
    public static final class C67661a {

        /* renamed from: a */
        public Activity f193488a;
    }

    public BannerOnInitEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof BannerOnInitEvent)) {
            return false;
        }
        return C46238a.m51546a(this.f193487d.f193488a, ((BannerOnInitEvent) iEvent).f193487d.f193488a);
    }
}
