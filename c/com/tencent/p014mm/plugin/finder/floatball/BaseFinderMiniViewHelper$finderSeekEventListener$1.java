package com.tencent.p014mm.plugin.finder.floatball;

import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.FinderSeekEvent;
import com.tencent.p014mm.plugin.finder.video.FinderThumbPlayerProxy;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Util;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, mo182094d2 = {"com/tencent/mm/plugin/finder/floatball/BaseFinderMiniViewHelper$finderSeekEventListener$1", "Lcom/tencent/mm/sdk/event/IListener;", "Lcom/tencent/mm/autogen/events/FinderSeekEvent;", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.floatball.BaseFinderMiniViewHelper$finderSeekEventListener$1 */
public final class BaseFinderMiniViewHelper$finderSeekEventListener$1 extends IListener<FinderSeekEvent> {

    /* renamed from: d */
    public final /* synthetic */ BaseFinderMiniViewHelper f159079d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BaseFinderMiniViewHelper$finderSeekEventListener$1(BaseFinderMiniViewHelper baseFinderMiniViewHelper, C40008f fVar) {
        super(fVar);
        this.f159079d = baseFinderMiniViewHelper;
    }

    public boolean callback(IEvent iEvent) {
        FinderThumbPlayerProxy videoView;
        FinderSeekEvent finderSeekEvent = (FinderSeekEvent) iEvent;
        C87412m.m108594g(finderSeekEvent, "event");
        if (!Util.isNullOrNil(finderSeekEvent.f154807d.f154809b)) {
            String str = finderSeekEvent.f154807d.f154809b;
            FinderThumbPlayerProxy videoView2 = this.f159079d.mo77450A0().getVideoView();
            if (C87412m.m108589b(str, videoView2 != null ? videoView2.getVideoMediaId() : null) && (videoView = this.f159079d.mo77450A0().getVideoView()) != null) {
                videoView.mo51223a((double) finderSeekEvent.f154807d.f154811d, true);
            }
        }
        return true;
    }
}
