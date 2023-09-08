package com.tencent.p014mm.autogen.events;

import android.graphics.Bitmap;
import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.ScanBankCardResultEvent */
public final class ScanBankCardResultEvent extends IEvent {

    /* renamed from: d */
    public C1126a f9465d = new C1126a();

    /* renamed from: com.tencent.mm.autogen.events.ScanBankCardResultEvent$a */
    public static final class C1126a {

        /* renamed from: a */
        public String f9466a;

        /* renamed from: b */
        public Bitmap f9467b;
    }

    public ScanBankCardResultEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof ScanBankCardResultEvent)) {
            return false;
        }
        C1126a aVar = ((ScanBankCardResultEvent) iEvent).f9465d;
        return C46238a.m51546a(this.f9465d.f9466a, aVar.f9466a) && C46238a.m51546a(this.f9465d.f9467b, aVar.f9467b);
    }
}
