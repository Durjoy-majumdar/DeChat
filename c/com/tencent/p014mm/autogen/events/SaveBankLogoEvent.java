package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;
import java.util.LinkedList;

/* renamed from: com.tencent.mm.autogen.events.SaveBankLogoEvent */
public final class SaveBankLogoEvent extends IEvent {

    /* renamed from: d */
    public C28817a f78963d = new C28817a();

    /* renamed from: e */
    public C28818b f78964e = new C28818b();

    /* renamed from: com.tencent.mm.autogen.events.SaveBankLogoEvent$a */
    public static final class C28817a {

        /* renamed from: a */
        public LinkedList f78965a;
    }

    /* renamed from: com.tencent.mm.autogen.events.SaveBankLogoEvent$b */
    public static final class C28818b {
    }

    public SaveBankLogoEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof SaveBankLogoEvent)) {
            return false;
        }
        SaveBankLogoEvent saveBankLogoEvent = (SaveBankLogoEvent) iEvent;
        if (!C46238a.m51546a(this.f78963d.f78965a, saveBankLogoEvent.f78963d.f78965a)) {
            return false;
        }
        C28818b bVar = saveBankLogoEvent.f78964e;
        this.f78964e.getClass();
        bVar.getClass();
        return C46238a.m51546a(0, 0);
    }
}
