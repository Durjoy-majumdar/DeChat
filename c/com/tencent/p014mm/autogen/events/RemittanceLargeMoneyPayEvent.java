package com.tencent.p014mm.autogen.events;

import android.app.Activity;
import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.RemittanceLargeMoneyPayEvent */
public final class RemittanceLargeMoneyPayEvent extends IEvent {

    /* renamed from: d */
    public C67776a f193891d = new C67776a();

    /* renamed from: com.tencent.mm.autogen.events.RemittanceLargeMoneyPayEvent$a */
    public static final class C67776a {

        /* renamed from: a */
        public String f193892a;

        /* renamed from: b */
        public double f193893b;

        /* renamed from: c */
        public Activity f193894c;
    }

    public RemittanceLargeMoneyPayEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof RemittanceLargeMoneyPayEvent)) {
            return false;
        }
        C67776a aVar = ((RemittanceLargeMoneyPayEvent) iEvent).f193891d;
        return C46238a.m51546a(this.f193891d.f193892a, aVar.f193892a) && C46238a.m51546a(Double.valueOf(this.f193891d.f193893b), Double.valueOf(aVar.f193893b)) && C46238a.m51546a(this.f193891d.f193894c, aVar.f193894c);
    }
}
