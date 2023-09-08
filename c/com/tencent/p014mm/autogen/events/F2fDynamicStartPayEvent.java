package com.tencent.p014mm.autogen.events;

import android.app.Activity;
import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.F2fDynamicStartPayEvent */
public final class F2fDynamicStartPayEvent extends IEvent {

    /* renamed from: d */
    public C67691a f193584d = new C67691a();

    /* renamed from: com.tencent.mm.autogen.events.F2fDynamicStartPayEvent$a */
    public static final class C67691a {

        /* renamed from: a */
        public String f193585a;

        /* renamed from: b */
        public int f193586b;

        /* renamed from: c */
        public int f193587c = 0;

        /* renamed from: d */
        public Activity f193588d;
    }

    public F2fDynamicStartPayEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof F2fDynamicStartPayEvent)) {
            return false;
        }
        C67691a aVar = ((F2fDynamicStartPayEvent) iEvent).f193584d;
        return C46238a.m51546a(this.f193584d.f193585a, aVar.f193585a) && C46238a.m51546a(Integer.valueOf(this.f193584d.f193586b), Integer.valueOf(aVar.f193586b)) && C46238a.m51546a(Integer.valueOf(this.f193584d.f193587c), Integer.valueOf(aVar.f193587c)) && C46238a.m51546a(this.f193584d.f193588d, aVar.f193588d);
    }
}
