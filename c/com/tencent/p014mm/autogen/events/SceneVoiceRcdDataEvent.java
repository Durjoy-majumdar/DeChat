package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.SceneVoiceRcdDataEvent */
public final class SceneVoiceRcdDataEvent extends IEvent {

    /* renamed from: d */
    public C92561a f265096d = new C92561a();

    /* renamed from: com.tencent.mm.autogen.events.SceneVoiceRcdDataEvent$a */
    public static final class C92561a {

        /* renamed from: a */
        public byte[] f265097a;

        /* renamed from: b */
        public int f265098b;
    }

    public SceneVoiceRcdDataEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof SceneVoiceRcdDataEvent)) {
            return false;
        }
        C92561a aVar = ((SceneVoiceRcdDataEvent) iEvent).f265096d;
        return C46238a.m51546a(this.f265096d.f265097a, aVar.f265097a) && C46238a.m51546a(Integer.valueOf(this.f265096d.f265098b), Integer.valueOf(aVar.f265098b));
    }
}
