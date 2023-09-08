package com.tencent.p014mm.autogen.events;

import android.app.Activity;
import android.os.Bundle;
import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.NotifyDealQBarStrResultEvent */
public final class NotifyDealQBarStrResultEvent extends IEvent {

    /* renamed from: d */
    public C92533a f264935d = new C92533a();

    /* renamed from: com.tencent.mm.autogen.events.NotifyDealQBarStrResultEvent$a */
    public static final class C92533a {

        /* renamed from: a */
        public String f264936a;

        /* renamed from: b */
        public Activity f264937b;

        /* renamed from: c */
        public int f264938c = 0;

        /* renamed from: d */
        public Bundle f264939d;
    }

    public NotifyDealQBarStrResultEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof NotifyDealQBarStrResultEvent)) {
            return false;
        }
        C92533a aVar = ((NotifyDealQBarStrResultEvent) iEvent).f264935d;
        return C46238a.m51546a(this.f264935d.f264936a, aVar.f264936a) && C46238a.m51546a(this.f264935d.f264937b, aVar.f264937b) && C46238a.m51546a(Integer.valueOf(this.f264935d.f264938c), Integer.valueOf(aVar.f264938c)) && C46238a.m51546a(this.f264935d.f264939d, aVar.f264939d);
    }
}
