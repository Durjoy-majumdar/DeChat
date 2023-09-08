package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.SucceedUploadEmotionEvent */
public final class SucceedUploadEmotionEvent extends IEvent {

    /* renamed from: d */
    public C92603a f265230d = new C92603a();

    /* renamed from: com.tencent.mm.autogen.events.SucceedUploadEmotionEvent$a */
    public static final class C92603a {

        /* renamed from: a */
        public String f265231a;
    }

    public SucceedUploadEmotionEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof SucceedUploadEmotionEvent)) {
            return false;
        }
        if (!C46238a.m51546a(this.f265230d.f265231a, ((SucceedUploadEmotionEvent) iEvent).f265230d.f265231a)) {
            return false;
        }
        this.f265230d.getClass();
        if (!C46238a.m51546a((Object) null, (Object) null)) {
            return false;
        }
        this.f265230d.getClass();
        return C46238a.m51546a(0, 0);
    }
}
