package com.tencent.p014mm.plugin.finder.convert;

import androidx.appcompat.app.AppCompatActivity;
import cm1.C0740i2;
import cm1.C0797z;
import com.tencent.p014mm.autogen.events.FeedLiveFeedExposeEvent;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import jq3.C60905o;
import kf1.C10008v1;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, mo182094d2 = {"com/tencent/mm/plugin/finder/convert/FinderFeedFullLiveConvert$liveFeedExposeListener$1", "Lcom/tencent/mm/sdk/event/IListener;", "Lcom/tencent/mm/autogen/events/FeedLiveFeedExposeEvent;", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.convert.FinderFeedFullLiveConvert$liveFeedExposeListener$1 */
public final class FinderFeedFullLiveConvert$liveFeedExposeListener$1 extends IListener<FeedLiveFeedExposeEvent> {

    /* renamed from: d */
    public final /* synthetic */ FinderFeedFullLiveConvert f12796d;

    /* renamed from: e */
    public final /* synthetic */ C10008v1 f12797e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderFeedFullLiveConvert$liveFeedExposeListener$1(FinderFeedFullLiveConvert finderFeedFullLiveConvert, C10008v1 v1Var, MMActivity mMActivity) {
        super(mMActivity);
        this.f12796d = finderFeedFullLiveConvert;
        this.f12797e = v1Var;
    }

    public boolean callback(IEvent iEvent) {
        FeedLiveFeedExposeEvent feedLiveFeedExposeEvent = (FeedLiveFeedExposeEvent) iEvent;
        C87412m.m108594g(feedLiveFeedExposeEvent, "event");
        Log.m105924i("Finder.FeedFullLiveConvert", "liveFeedExposeListener receive feedId: " + feedLiveFeedExposeEvent.f9158d.f9159a + " focusedHolder: " + this.f12796d.f12581y);
        if (!this.f12797e.getActivity().isPaused()) {
            return false;
        }
        FinderFeedFullLiveConvert finderFeedFullLiveConvert = this.f12796d;
        C60905o oVar = finderFeedFullLiveConvert.f12581y;
        C0797z zVar = null;
        C0740i2 i2Var = oVar != null ? (BaseFinderFeed) oVar.f173503E : null;
        if (i2Var instanceof C0797z) {
            zVar = (C0797z) i2Var;
        }
        if (zVar == null) {
            return false;
        }
        C10008v1 v1Var = this.f12797e;
        FinderItem o = zVar.mo3513o();
        AppCompatActivity context = v1Var.getActivity().getContext();
        C87412m.m108593f(context, "contract.getActivity().context");
        finderFeedFullLiveConvert.mo2399Z0(o, 68, context);
        return false;
    }
}
