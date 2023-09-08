package com.tencent.p014mm.plugin.finder.profile.uic;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.MusicCheckErrorEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import gy3.C87412m;
import kotlin.Metadata;
import nj3.C76912y0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, mo182094d2 = {"com/tencent/mm/plugin/finder/profile/uic/FinderProfileMusicUIC$musicCheckErrorListener$1", "Lcom/tencent/mm/sdk/event/IListener;", "Lcom/tencent/mm/autogen/events/MusicCheckErrorEvent;", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.profile.uic.FinderProfileMusicUIC$musicCheckErrorListener$1 */
public final class FinderProfileMusicUIC$musicCheckErrorListener$1 extends IListener<MusicCheckErrorEvent> {

    /* renamed from: d */
    public final /* synthetic */ FinderProfileMusicUIC f160642d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderProfileMusicUIC$musicCheckErrorListener$1(FinderProfileMusicUIC finderProfileMusicUIC, C40008f fVar) {
        super(fVar);
        this.f160642d = finderProfileMusicUIC;
    }

    public boolean callback(IEvent iEvent) {
        MusicCheckErrorEvent musicCheckErrorEvent = (MusicCheckErrorEvent) iEvent;
        C87412m.m108594g(musicCheckErrorEvent, "event");
        Log.m105924i("Finder.FinderProfileMusicUIC", "musicCheckErrorListener check error");
        MusicCheckErrorEvent.C55147a aVar = musicCheckErrorEvent.f154842d;
        if (aVar.f154843a == 0) {
            Log.m105920e("Finder.FinderProfileMusicUIC", "musicCheckErrorListener, must has error.");
            return false;
        }
        String string = !Util.isNullOrNil(aVar.f154844b) ? musicCheckErrorEvent.f154842d.f154844b : this.f160642d.getActivity().getString(C0966R.string.f361077h32);
        FinderProfileMusicUIC finderProfileMusicUIC = this.f160642d;
        C87412m.m108593f(string, "errMsg");
        C76912y0.m92767f(finderProfileMusicUIC.getActivity(), string);
        return false;
    }
}
