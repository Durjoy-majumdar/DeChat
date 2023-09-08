package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.GameSilentDownloadEvent */
public final class GameSilentDownloadEvent extends IEvent {

    /* renamed from: d */
    public C40110a f107565d = new C40110a();

    /* renamed from: com.tencent.mm.autogen.events.GameSilentDownloadEvent$a */
    public static final class C40110a {

        /* renamed from: a */
        public String f107566a;
    }

    public GameSilentDownloadEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof GameSilentDownloadEvent)) {
            return false;
        }
        return C46238a.m51546a(this.f107565d.f107566a, ((GameSilentDownloadEvent) iEvent).f107565d.f107566a);
    }
}
