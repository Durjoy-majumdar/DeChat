package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.GameSilentDownloadNotifyEvent */
public final class GameSilentDownloadNotifyEvent extends IEvent {

    /* renamed from: d */
    public C40111a f107567d = new C40111a();

    /* renamed from: com.tencent.mm.autogen.events.GameSilentDownloadNotifyEvent$a */
    public static final class C40111a {

        /* renamed from: a */
        public int f107568a;

        /* renamed from: b */
        public String f107569b;
    }

    public GameSilentDownloadNotifyEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof GameSilentDownloadNotifyEvent)) {
            return false;
        }
        C40111a aVar = ((GameSilentDownloadNotifyEvent) iEvent).f107567d;
        return C46238a.m51546a(Integer.valueOf(this.f107567d.f107568a), Integer.valueOf(aVar.f107568a)) && C46238a.m51546a(this.f107567d.f107569b, aVar.f107569b);
    }
}
