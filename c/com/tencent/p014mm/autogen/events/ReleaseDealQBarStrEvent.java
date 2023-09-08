package com.tencent.p014mm.autogen.events;

import android.app.Activity;
import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.ReleaseDealQBarStrEvent */
public final class ReleaseDealQBarStrEvent extends IEvent {

    /* renamed from: d */
    public C92553a f265057d = new C92553a();

    /* renamed from: com.tencent.mm.autogen.events.ReleaseDealQBarStrEvent$a */
    public static final class C92553a {

        /* renamed from: a */
        public Activity f265058a;
    }

    public ReleaseDealQBarStrEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof ReleaseDealQBarStrEvent)) {
            return false;
        }
        return C46238a.m51546a(this.f265057d.f265058a, ((ReleaseDealQBarStrEvent) iEvent).f265057d.f265058a);
    }
}
