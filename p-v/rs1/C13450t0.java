package rs1;

import bl3.C39818r;
import cm1.C0740i2;
import com.tencent.p014mm.plugin.finder.feed.model.internal.BaseFeedLoader;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.plugin.finder.viewmodel.component.AtFeedSelectStateMachine;
import com.tencent.p014mm.plugin.finder.viewmodel.component.FinderAtFeedManageUIC;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.view.RefreshLoadMoreLayout;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import gy3.C87412m;
import java.util.List;

/* renamed from: rs1.t0 */
public final class C13450t0 extends RefreshLoadMoreLayout.C57879a {

    /* renamed from: a */
    public final /* synthetic */ FinderAtFeedManageUIC f38124a;

    public C13450t0(FinderAtFeedManageUIC finderAtFeedManageUIC) {
        this.f38124a = finderAtFeedManageUIC;
    }

    /* renamed from: b */
    public void mo2561b(int i) {
        BaseFeedLoader.requestLoadMore$default(this.f38124a.mo5112e3(), false, 1, (Object) null);
    }

    /* renamed from: c */
    public void mo2562c(RefreshLoadMoreLayout.C7080c<Object> cVar) {
        C87412m.m108594g(cVar, TPReportKeys.PlayerStep.PLAYER_REASON);
        List<? extends C0740i2> list = this.f38124a.mo5112e3().f15440o;
        AtFeedSelectStateMachine atFeedSelectStateMachine = ((C13535y0) C39818r.f106831a.mo62444c(this.f38124a.getActivity()).mo75002a(C13535y0.class)).f38380j;
        if (atFeedSelectStateMachine != null) {
            AtFeedSelectStateMachine.C4245c cVar2 = atFeedSelectStateMachine.f18567c;
            if (cVar2 == AtFeedSelectStateMachine.C4245c.ENTER || cVar2 == AtFeedSelectStateMachine.C4245c.PRE_CONFIRM) {
                Log.m105924i("Finder.AtFeedSelectStateMachine", "onLoadMore update");
                if (list != null) {
                    for (C0740i2 i2Var : list) {
                        BaseFinderFeed baseFinderFeed = i2Var instanceof BaseFinderFeed ? (BaseFinderFeed) i2Var : null;
                        if (baseFinderFeed != null) {
                            atFeedSelectStateMachine.f18568d.put(Long.valueOf(baseFinderFeed.getItemId()), Integer.valueOf(baseFinderFeed.mo3513o().getMentionListSelected()));
                        }
                    }
                    return;
                }
                return;
            }
            return;
        }
        C87412m.m108603p("stateMachine");
        throw null;
    }
}
