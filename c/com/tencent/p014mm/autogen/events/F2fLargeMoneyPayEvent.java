package com.tencent.p014mm.autogen.events;

import android.app.Activity;
import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.F2fLargeMoneyPayEvent */
public final class F2fLargeMoneyPayEvent extends IEvent {

    /* renamed from: d */
    public C67692a f193589d = new C67692a();

    /* renamed from: com.tencent.mm.autogen.events.F2fLargeMoneyPayEvent$a */
    public static final class C67692a {

        /* renamed from: a */
        public String f193590a;

        /* renamed from: b */
        public int f193591b;

        /* renamed from: c */
        public Activity f193592c;

        /* renamed from: d */
        public String f193593d;
    }

    public F2fLargeMoneyPayEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof F2fLargeMoneyPayEvent)) {
            return false;
        }
        C67692a aVar = ((F2fLargeMoneyPayEvent) iEvent).f193589d;
        return C46238a.m51546a(this.f193589d.f193590a, aVar.f193590a) && C46238a.m51546a(Integer.valueOf(this.f193589d.f193591b), Integer.valueOf(aVar.f193591b)) && C46238a.m51546a(this.f193589d.f193592c, aVar.f193592c) && C46238a.m51546a(this.f193589d.f193593d, aVar.f193593d);
    }
}
