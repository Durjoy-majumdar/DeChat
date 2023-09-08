package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.SnsAdNativePageLifecycleEvent */
public final class SnsAdNativePageLifecycleEvent extends IEvent {

    /* renamed from: d */
    public C92571a f265125d = new C92571a();

    /* renamed from: com.tencent.mm.autogen.events.SnsAdNativePageLifecycleEvent$a */
    public static final class C92571a {

        /* renamed from: a */
        public int f265126a = 0;
    }

    public SnsAdNativePageLifecycleEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof SnsAdNativePageLifecycleEvent)) {
            return false;
        }
        return C46238a.m51546a(Integer.valueOf(this.f265125d.f265126a), Integer.valueOf(((SnsAdNativePageLifecycleEvent) iEvent).f265125d.f265126a));
    }
}
