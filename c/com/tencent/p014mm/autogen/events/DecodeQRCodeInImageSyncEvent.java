package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.DecodeQRCodeInImageSyncEvent */
public final class DecodeQRCodeInImageSyncEvent extends IEvent {

    /* renamed from: d */
    public C92469a f264662d = new C92469a();

    /* renamed from: e */
    public C92470b f264663e = new C92470b();

    /* renamed from: com.tencent.mm.autogen.events.DecodeQRCodeInImageSyncEvent$a */
    public static final class C92469a {

        /* renamed from: a */
        public String f264664a;
    }

    /* renamed from: com.tencent.mm.autogen.events.DecodeQRCodeInImageSyncEvent$b */
    public static final class C92470b {

        /* renamed from: a */
        public String[] f264665a;

        /* renamed from: b */
        public boolean f264666b = false;
    }

    public DecodeQRCodeInImageSyncEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof DecodeQRCodeInImageSyncEvent)) {
            return false;
        }
        DecodeQRCodeInImageSyncEvent decodeQRCodeInImageSyncEvent = (DecodeQRCodeInImageSyncEvent) iEvent;
        if (!C46238a.m51546a(this.f264662d.f264664a, decodeQRCodeInImageSyncEvent.f264662d.f264664a)) {
            return false;
        }
        C92470b bVar = decodeQRCodeInImageSyncEvent.f264663e;
        return C46238a.m51546a(this.f264663e.f264665a, bVar.f264665a) && C46238a.m51546a(Boolean.valueOf(this.f264663e.f264666b), Boolean.valueOf(bVar.f264666b));
    }
}
