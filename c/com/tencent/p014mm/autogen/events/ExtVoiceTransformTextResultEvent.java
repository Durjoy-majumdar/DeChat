package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.ExtVoiceTransformTextResultEvent */
public final class ExtVoiceTransformTextResultEvent extends IEvent {

    /* renamed from: d */
    public C67689a f193580d = new C67689a();

    /* renamed from: com.tencent.mm.autogen.events.ExtVoiceTransformTextResultEvent$a */
    public static final class C67689a {

        /* renamed from: a */
        public String f193581a;

        /* renamed from: b */
        public int f193582b;
    }

    public ExtVoiceTransformTextResultEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof ExtVoiceTransformTextResultEvent)) {
            return false;
        }
        C67689a aVar = ((ExtVoiceTransformTextResultEvent) iEvent).f193580d;
        if (!C46238a.m51546a(this.f193580d.f193581a, aVar.f193581a)) {
            return false;
        }
        this.f193580d.getClass();
        if (!C46238a.m51546a(0, 0)) {
            return false;
        }
        this.f193580d.getClass();
        if (!C46238a.m51546a(0, 0)) {
            return false;
        }
        this.f193580d.getClass();
        if (!C46238a.m51546a(0, 0)) {
            return false;
        }
        this.f193580d.getClass();
        if (!C46238a.m51546a(0, 0)) {
            return false;
        }
        this.f193580d.getClass();
        if (!C46238a.m51546a(0, 0)) {
            return false;
        }
        this.f193580d.getClass();
        if (!C46238a.m51546a(0, 0)) {
            return false;
        }
        this.f193580d.getClass();
        return C46238a.m51546a(0, 0) && C46238a.m51546a(Integer.valueOf(this.f193580d.f193582b), Integer.valueOf(aVar.f193582b));
    }
}
