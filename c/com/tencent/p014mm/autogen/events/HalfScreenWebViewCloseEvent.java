package com.tencent.p014mm.autogen.events;

import android.content.Context;
import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.HalfScreenWebViewCloseEvent */
public final class HalfScreenWebViewCloseEvent extends IEvent {

    /* renamed from: d */
    public C40128a f107612d = new C40128a();

    /* renamed from: com.tencent.mm.autogen.events.HalfScreenWebViewCloseEvent$a */
    public static final class C40128a {

        /* renamed from: a */
        public Context f107613a;
    }

    public HalfScreenWebViewCloseEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof HalfScreenWebViewCloseEvent)) {
            return false;
        }
        if (!C46238a.m51546a(this.f107612d.f107613a, ((HalfScreenWebViewCloseEvent) iEvent).f107612d.f107613a)) {
            return false;
        }
        this.f107612d.getClass();
        Boolean bool = Boolean.TRUE;
        return C46238a.m51546a(bool, bool);
    }
}
