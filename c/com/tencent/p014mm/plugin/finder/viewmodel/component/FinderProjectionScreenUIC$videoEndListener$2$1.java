package com.tencent.p014mm.plugin.finder.viewmodel.component;

import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.autogen.events.FeedMegaVideoAnimPlayEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import gy3.C87412m;
import kotlin.Metadata;
import o40.C61926c;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, mo182094d2 = {"com/tencent/mm/plugin/finder/viewmodel/component/FinderProjectionScreenUIC$videoEndListener$2$1", "Lcom/tencent/mm/sdk/event/IListener;", "Lcom/tencent/mm/autogen/events/FeedMegaVideoAnimPlayEvent;", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.viewmodel.component.FinderProjectionScreenUIC$videoEndListener$2$1 */
public final class FinderProjectionScreenUIC$videoEndListener$2$1 extends IListener<FeedMegaVideoAnimPlayEvent> {

    /* renamed from: d */
    public final /* synthetic */ C56711j f162505d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderProjectionScreenUIC$videoEndListener$2$1(AppCompatActivity appCompatActivity, C56711j jVar) {
        super(appCompatActivity);
        this.f162505d = jVar;
    }

    public boolean callback(IEvent iEvent) {
        FeedMegaVideoAnimPlayEvent feedMegaVideoAnimPlayEvent = (FeedMegaVideoAnimPlayEvent) iEvent;
        C87412m.m108594g(feedMegaVideoAnimPlayEvent, "event");
        if (!feedMegaVideoAnimPlayEvent.f9160d.f9164d) {
            return false;
        }
        C61926c.m72668M(new C56743n(this.f162505d, feedMegaVideoAnimPlayEvent));
        return false;
    }
}
