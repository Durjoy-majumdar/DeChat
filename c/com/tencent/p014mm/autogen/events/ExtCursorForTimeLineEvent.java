package com.tencent.p014mm.autogen.events;

import android.database.Cursor;
import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.ExtCursorForTimeLineEvent */
public final class ExtCursorForTimeLineEvent extends IEvent {

    /* renamed from: d */
    public C92492a f264752d = new C92492a();

    /* renamed from: e */
    public C92493b f264753e = new C92493b();

    /* renamed from: com.tencent.mm.autogen.events.ExtCursorForTimeLineEvent$a */
    public static final class C92492a {

        /* renamed from: a */
        public String f264754a;
    }

    /* renamed from: com.tencent.mm.autogen.events.ExtCursorForTimeLineEvent$b */
    public static final class C92493b {

        /* renamed from: a */
        public Cursor f264755a;
    }

    public ExtCursorForTimeLineEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof ExtCursorForTimeLineEvent)) {
            return false;
        }
        ExtCursorForTimeLineEvent extCursorForTimeLineEvent = (ExtCursorForTimeLineEvent) iEvent;
        if (!C46238a.m51546a(this.f264752d.f264754a, extCursorForTimeLineEvent.f264752d.f264754a)) {
            return false;
        }
        return C46238a.m51546a(this.f264753e.f264755a, extCursorForTimeLineEvent.f264753e.f264755a);
    }
}
