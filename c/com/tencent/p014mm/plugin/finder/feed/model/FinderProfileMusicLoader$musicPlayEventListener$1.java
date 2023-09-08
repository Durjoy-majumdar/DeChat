package com.tencent.p014mm.plugin.finder.feed.model;

import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.MusicPlayerEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, mo182094d2 = {"com/tencent/mm/plugin/finder/feed/model/FinderProfileMusicLoader$musicPlayEventListener$1", "Lcom/tencent/mm/sdk/event/IListener;", "Lcom/tencent/mm/autogen/events/MusicPlayerEvent;", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.feed.model.FinderProfileMusicLoader$musicPlayEventListener$1 */
public final class FinderProfileMusicLoader$musicPlayEventListener$1 extends IListener<MusicPlayerEvent> {

    /* renamed from: d */
    public final /* synthetic */ FinderProfileMusicLoader f158712d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderProfileMusicLoader$musicPlayEventListener$1(FinderProfileMusicLoader finderProfileMusicLoader, C40008f fVar) {
        super(fVar);
        this.f158712d = finderProfileMusicLoader;
    }

    public boolean callback(IEvent iEvent) {
        MusicPlayerEvent musicPlayerEvent = (MusicPlayerEvent) iEvent;
        C87412m.m108594g(musicPlayerEvent, "event");
        FinderProfileMusicLoader finderProfileMusicLoader = this.f158712d;
        MusicPlayerEvent.C1094a aVar = musicPlayerEvent.f9336d;
        Integer valueOf = aVar != null ? Integer.valueOf(aVar.f9337a) : null;
        boolean z = true;
        if (!(((((valueOf != null && valueOf.intValue() == 2) || (valueOf != null && valueOf.intValue() == 3)) || (valueOf != null && valueOf.intValue() == 4)) || (valueOf != null && valueOf.intValue() == 7)) || (valueOf != null && valueOf.intValue() == 0)) && (valueOf == null || valueOf.intValue() != 1)) {
            z = false;
        }
        if (z) {
            finderProfileMusicLoader.dispatcher().mo13376a();
        }
        return false;
    }
}
