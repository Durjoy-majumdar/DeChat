package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.WxFileIndexDirtyEvent */
public final class WxFileIndexDirtyEvent extends IEvent {

    /* renamed from: d */
    public C28856a f79070d = new C28856a();

    /* renamed from: com.tencent.mm.autogen.events.WxFileIndexDirtyEvent$a */
    public static final class C28856a {

        /* renamed from: a */
        public long f79071a;
    }

    public WxFileIndexDirtyEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof WxFileIndexDirtyEvent)) {
            return false;
        }
        return C46238a.m51546a(Long.valueOf(this.f79070d.f79071a), Long.valueOf(((WxFileIndexDirtyEvent) iEvent).f79070d.f79071a));
    }
}
