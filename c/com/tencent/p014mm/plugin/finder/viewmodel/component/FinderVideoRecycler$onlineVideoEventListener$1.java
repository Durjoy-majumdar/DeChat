package com.tencent.p014mm.plugin.finder.viewmodel.component;

import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.OnlineVideoEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, mo182094d2 = {"com/tencent/mm/plugin/finder/viewmodel/component/FinderVideoRecycler$onlineVideoEventListener$1", "Lcom/tencent/mm/sdk/event/IListener;", "Lcom/tencent/mm/autogen/events/OnlineVideoEvent;", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.viewmodel.component.FinderVideoRecycler$onlineVideoEventListener$1 */
public final class FinderVideoRecycler$onlineVideoEventListener$1 extends IListener<OnlineVideoEvent> {

    /* renamed from: d */
    public final /* synthetic */ FinderVideoRecycler f162574d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderVideoRecycler$onlineVideoEventListener$1(FinderVideoRecycler finderVideoRecycler, C40008f fVar) {
        super(fVar);
        this.f162574d = finderVideoRecycler;
    }

    public boolean callback(IEvent iEvent) {
        OnlineVideoEvent onlineVideoEvent = (OnlineVideoEvent) iEvent;
        C87412m.m108594g(onlineVideoEvent, "event");
        FinderVideoRecycler finderVideoRecycler = this.f162574d;
        OnlineVideoEvent.C92538a aVar = onlineVideoEvent.f264965d;
        if (aVar.f264967b != -21112) {
            return false;
        }
        String str = aVar.f264968c;
        Log.m105928w("Finder.VideoRecycler", "[videoSourceChange] mediaId=" + str);
        finderVideoRecycler.mo80074d3(new C56745r(str, finderVideoRecycler));
        return false;
    }
}
