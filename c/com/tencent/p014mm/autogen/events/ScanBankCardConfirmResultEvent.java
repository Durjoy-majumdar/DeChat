package com.tencent.p014mm.autogen.events;

import android.graphics.Bitmap;
import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.ScanBankCardConfirmResultEvent */
public final class ScanBankCardConfirmResultEvent extends IEvent {

    /* renamed from: d */
    public C1125a f9461d = new C1125a();

    /* renamed from: com.tencent.mm.autogen.events.ScanBankCardConfirmResultEvent$a */
    public static final class C1125a {

        /* renamed from: a */
        public String f9462a;

        /* renamed from: b */
        public int f9463b = 0;

        /* renamed from: c */
        public Bitmap f9464c;
    }

    public ScanBankCardConfirmResultEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof ScanBankCardConfirmResultEvent)) {
            return false;
        }
        C1125a aVar = ((ScanBankCardConfirmResultEvent) iEvent).f9461d;
        return C46238a.m51546a(this.f9461d.f9462a, aVar.f9462a) && C46238a.m51546a(Integer.valueOf(this.f9461d.f9463b), Integer.valueOf(aVar.f9463b)) && C46238a.m51546a(this.f9461d.f9464c, aVar.f9464c);
    }
}
