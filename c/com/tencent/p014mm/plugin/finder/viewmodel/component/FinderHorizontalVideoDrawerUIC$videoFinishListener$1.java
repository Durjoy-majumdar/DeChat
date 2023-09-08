package com.tencent.p014mm.plugin.finder.viewmodel.component;

import androidx.appcompat.app.AppCompatActivity;
import as1.C0201a;
import bl3.C39818r;
import com.tencent.p014mm.autogen.events.FeedMegaVideoAnimPlayEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import kotlin.Metadata;
import rs1.C13298k5;
import rs1.C13554z;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, mo182094d2 = {"com/tencent/mm/plugin/finder/viewmodel/component/FinderHorizontalVideoDrawerUIC$videoFinishListener$1", "Lcom/tencent/mm/sdk/event/IListener;", "Lcom/tencent/mm/autogen/events/FeedMegaVideoAnimPlayEvent;", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.viewmodel.component.FinderHorizontalVideoDrawerUIC$videoFinishListener$1 */
public final class FinderHorizontalVideoDrawerUIC$videoFinishListener$1 extends IListener<FeedMegaVideoAnimPlayEvent> {

    /* renamed from: d */
    public final /* synthetic */ AppCompatActivity f18705d;

    /* renamed from: e */
    public final /* synthetic */ FinderHorizontalVideoDrawerUIC f18706e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderHorizontalVideoDrawerUIC$videoFinishListener$1(AppCompatActivity appCompatActivity, FinderHorizontalVideoDrawerUIC finderHorizontalVideoDrawerUIC) {
        super(appCompatActivity);
        this.f18705d = appCompatActivity;
        this.f18706e = finderHorizontalVideoDrawerUIC;
    }

    public boolean callback(IEvent iEvent) {
        FeedMegaVideoAnimPlayEvent feedMegaVideoAnimPlayEvent = (FeedMegaVideoAnimPlayEvent) iEvent;
        C87412m.m108594g(feedMegaVideoAnimPlayEvent, "event");
        if (feedMegaVideoAnimPlayEvent.f9160d.f9164d) {
            C39818r rVar = C39818r.f106831a;
            C13554z zVar = (C13554z) rVar.mo62444c(this.f18705d).mo62449e(C13554z.class);
            if (zVar != null && zVar.f38450t) {
                Log.m105924i("FinderHorizontalVideoDrawerUIC", "videoFinishListener: some drawer has been open");
            } else if (this.f18705d.getResources().getConfiguration().orientation != 1) {
                Log.m105924i("FinderHorizontalVideoDrawerUIC", "videoFinishListener: activity is not portrait");
            } else {
                Log.m105924i("FinderHorizontalVideoDrawerUIC", "videoFinishListener: isPeek=" + this.f18706e.f18676f);
                FinderHorizontalVideoDrawerUIC finderHorizontalVideoDrawerUIC = this.f18706e;
                if (finderHorizontalVideoDrawerUIC.f18676f) {
                    finderHorizontalVideoDrawerUIC.f18676f = false;
                    C0201a e3 = finderHorizontalVideoDrawerUIC.mo5141e3();
                    e3.mo4919k(-e3.f18132i, false);
                    ((C13298k5) rVar.mo62444c(this.f18705d).mo75002a(C13298k5.class)).f37738e = 1;
                }
            }
        }
        return true;
    }
}
