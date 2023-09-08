package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.UploadImgProgressEvent */
public final class UploadImgProgressEvent extends IEvent {

    /* renamed from: d */
    public C1157a f9576d = new C1157a();

    /* renamed from: com.tencent.mm.autogen.events.UploadImgProgressEvent$a */
    public static final class C1157a {
    }

    public UploadImgProgressEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof UploadImgProgressEvent)) {
            return false;
        }
        C1157a aVar = ((UploadImgProgressEvent) iEvent).f9576d;
        this.f9576d.getClass();
        aVar.getClass();
        if (!C46238a.m51546a((Object) null, (Object) null)) {
            return false;
        }
        this.f9576d.getClass();
        return C46238a.m51546a(0, 0);
    }
}
