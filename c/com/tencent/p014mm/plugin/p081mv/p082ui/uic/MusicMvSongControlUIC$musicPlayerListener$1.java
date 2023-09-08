package com.tencent.p014mm.plugin.p081mv.p082ui.uic;

import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.MusicPlayerEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import gy3.C87412m;
import hb2.C59829j;
import kotlin.Metadata;
import la2.C99364n;
import qc0.C101093a;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, mo182094d2 = {"com/tencent/mm/plugin/mv/ui/uic/MusicMvSongControlUIC$musicPlayerListener$1", "Lcom/tencent/mm/sdk/event/IListener;", "Lcom/tencent/mm/autogen/events/MusicPlayerEvent;", "plugin-mv_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.mv.ui.uic.MusicMvSongControlUIC$musicPlayerListener$1 */
public final class MusicMvSongControlUIC$musicPlayerListener$1 extends IListener<MusicPlayerEvent> {
    public MusicMvSongControlUIC$musicPlayerListener$1(C40008f fVar) {
        super(fVar);
    }

    public boolean callback(IEvent iEvent) {
        MusicPlayerEvent musicPlayerEvent = (MusicPlayerEvent) iEvent;
        C87412m.m108594g(musicPlayerEvent, "event");
        if (musicPlayerEvent.f9336d.f9337a != 7) {
            return false;
        }
        C59829j.f170804f++;
        C99364n.m129616h().mo138826e(C101093a.m132480b());
        return false;
    }
}
