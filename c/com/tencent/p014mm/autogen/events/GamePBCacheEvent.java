package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.GamePBCacheEvent */
public final class GamePBCacheEvent extends IEvent {

    /* renamed from: d */
    public C40109a f107561d = new C40109a();

    /* renamed from: com.tencent.mm.autogen.events.GamePBCacheEvent$a */
    public static final class C40109a {

        /* renamed from: a */
        public int f107562a;

        /* renamed from: b */
        public String f107563b;

        /* renamed from: c */
        public byte[] f107564c;
    }

    public GamePBCacheEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof GamePBCacheEvent)) {
            return false;
        }
        C40109a aVar = ((GamePBCacheEvent) iEvent).f107561d;
        return C46238a.m51546a(Integer.valueOf(this.f107561d.f107562a), Integer.valueOf(aVar.f107562a)) && C46238a.m51546a(this.f107561d.f107563b, aVar.f107563b) && C46238a.m51546a(this.f107561d.f107564c, aVar.f107564c);
    }
}
