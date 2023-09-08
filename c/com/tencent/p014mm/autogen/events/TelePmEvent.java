package com.tencent.p014mm.autogen.events;

import android.telephony.PhoneStateListener;
import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.TelePmEvent */
public final class TelePmEvent extends IEvent {

    /* renamed from: d */
    public C114697a f343626d = new C114697a();

    /* renamed from: com.tencent.mm.autogen.events.TelePmEvent$a */
    public static final class C114697a {

        /* renamed from: a */
        public PhoneStateListener f343627a;

        /* renamed from: b */
        public int f343628b;

        /* renamed from: c */
        public int f343629c;
    }

    public TelePmEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof TelePmEvent)) {
            return false;
        }
        C114697a aVar = ((TelePmEvent) iEvent).f343626d;
        return C46238a.m51546a(this.f343626d.f343627a, aVar.f343627a) && C46238a.m51546a(Integer.valueOf(this.f343626d.f343628b), Integer.valueOf(aVar.f343628b)) && C46238a.m51546a(Integer.valueOf(this.f343626d.f343629c), Integer.valueOf(aVar.f343629c));
    }
}
