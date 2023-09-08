package com.tencent.p014mm.plugin.music.p080ui;

import androidx.lifecycle.C0125s;
import com.tencent.p014mm.autogen.events.MusicPlayerEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;

/* renamed from: com.tencent.mm.plugin.music.ui.MusicBanner$2 */
class MusicBanner$2 extends IListener<MusicPlayerEvent> {

    /* renamed from: d */
    public final /* synthetic */ C94242j f272227d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MusicBanner$2(C94242j jVar, C0125s sVar) {
        super(sVar);
        this.f272227d = jVar;
        this.__eventId = -1155728636;
    }

    public boolean callback(IEvent iEvent) {
        int i = ((MusicPlayerEvent) iEvent).f9336d.f9337a;
        if (i != 0 && i != 1 && i != 2 && i != 3 && i != 4 && i != 7) {
            return false;
        }
        this.f272227d.mo129565h();
        return false;
    }
}
