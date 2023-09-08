package com.tencent.p014mm.autogen.events;

import android.app.Activity;
import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.CancelDealQBarStrEvent */
public final class CancelDealQBarStrEvent extends IEvent {

    /* renamed from: d */
    public C92466a f264642d = new C92466a();

    /* renamed from: com.tencent.mm.autogen.events.CancelDealQBarStrEvent$a */
    public static final class C92466a {

        /* renamed from: a */
        public String f264643a;

        /* renamed from: b */
        public Activity f264644b;
    }

    public CancelDealQBarStrEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof CancelDealQBarStrEvent)) {
            return false;
        }
        C92466a aVar = ((CancelDealQBarStrEvent) iEvent).f264642d;
        return C46238a.m51546a(this.f264642d.f264643a, aVar.f264643a) && C46238a.m51546a(this.f264642d.f264644b, aVar.f264644b);
    }
}
