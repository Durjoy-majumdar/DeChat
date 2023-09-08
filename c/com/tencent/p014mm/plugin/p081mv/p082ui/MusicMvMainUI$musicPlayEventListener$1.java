package com.tencent.p014mm.plugin.p081mv.p082ui;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.MusicPlayerEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import kotlin.Metadata;
import nj3.C76912y0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, mo182094d2 = {"com/tencent/mm/plugin/mv/ui/MusicMvMainUI$musicPlayEventListener$1", "Lcom/tencent/mm/sdk/event/IListener;", "Lcom/tencent/mm/autogen/events/MusicPlayerEvent;", "plugin-mv_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.mv.ui.MusicMvMainUI$musicPlayEventListener$1 */
public final class MusicMvMainUI$musicPlayEventListener$1 extends IListener<MusicPlayerEvent> {

    /* renamed from: d */
    public final /* synthetic */ MusicMvMainUI f81842d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MusicMvMainUI$musicPlayEventListener$1(MusicMvMainUI musicMvMainUI, C40008f fVar) {
        super(fVar);
        this.f81842d = musicMvMainUI;
    }

    public boolean callback(IEvent iEvent) {
        MusicPlayerEvent musicPlayerEvent = (MusicPlayerEvent) iEvent;
        C87412m.m108594g(musicPlayerEvent, "event");
        MusicMvMainUI musicMvMainUI = this.f81842d;
        MusicPlayerEvent.C1094a aVar = musicPlayerEvent.f9336d;
        Integer valueOf = aVar != null ? Integer.valueOf(aVar.f9337a) : null;
        if (valueOf == null || valueOf.intValue() != 4) {
            return false;
        }
        Log.m105924i(musicMvMainUI.f163018e, "musicPlayEventListener error");
        String string = musicMvMainUI.getString(C0966R.string.f361077h32);
        C87412m.m108593f(string, "getString(com.tencent.mm…string.music_mv_play_err)");
        C76912y0.m92767f(musicMvMainUI.getContext(), string);
        return false;
    }
}
