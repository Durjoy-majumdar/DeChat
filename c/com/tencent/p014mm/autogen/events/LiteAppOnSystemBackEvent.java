package com.tencent.p014mm.autogen.events;

import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.LiteAppOnSystemBackEvent */
public final class LiteAppOnSystemBackEvent extends IEvent {

    /* renamed from: d */
    public C104593a f310001d = new C104593a();

    /* renamed from: com.tencent.mm.autogen.events.LiteAppOnSystemBackEvent$a */
    public static final class C104593a {

        /* renamed from: a */
        public AppCompatActivity f310002a;
    }

    public LiteAppOnSystemBackEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof LiteAppOnSystemBackEvent)) {
            return false;
        }
        return C46238a.m51546a(this.f310001d.f310002a, ((LiteAppOnSystemBackEvent) iEvent).f310001d.f310002a);
    }
}
