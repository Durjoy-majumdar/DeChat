package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.ExtVoiceTransformTextClickEvent */
public final class ExtVoiceTransformTextClickEvent extends IEvent {

    /* renamed from: d */
    public C67688a f193576d = new C67688a();

    /* renamed from: com.tencent.mm.autogen.events.ExtVoiceTransformTextClickEvent$a */
    public static final class C67688a {

        /* renamed from: a */
        public String f193577a;

        /* renamed from: b */
        public int f193578b;

        /* renamed from: c */
        public int f193579c;
    }

    public ExtVoiceTransformTextClickEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof ExtVoiceTransformTextClickEvent)) {
            return false;
        }
        C67688a aVar = ((ExtVoiceTransformTextClickEvent) iEvent).f193576d;
        if (!C46238a.m51546a(this.f193576d.f193577a, aVar.f193577a) || !C46238a.m51546a(Integer.valueOf(this.f193576d.f193578b), Integer.valueOf(aVar.f193578b)) || !C46238a.m51546a(Integer.valueOf(this.f193576d.f193579c), Integer.valueOf(aVar.f193579c))) {
            return false;
        }
        this.f193576d.getClass();
        return C46238a.m51546a((Object) null, (Object) null);
    }
}
