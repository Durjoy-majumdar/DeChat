package mo1;

import com.tencent.p014mm.plugin.finder.feed.model.internal.BaseFeedLoader;
import com.tencent.p014mm.plugin.finder.profile.uic.FinderProfileMusicUIC;
import com.tencent.p014mm.view.RefreshLoadMoreLayout;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import gy3.C87412m;

/* renamed from: mo1.g1 */
public final class C61510g1 extends RefreshLoadMoreLayout.C57879a {

    /* renamed from: a */
    public final /* synthetic */ FinderProfileMusicUIC f174863a;

    public C61510g1(FinderProfileMusicUIC finderProfileMusicUIC) {
        this.f174863a = finderProfileMusicUIC;
    }

    /* renamed from: b */
    public void mo2561b(int i) {
        BaseFeedLoader.requestLoadMore$default(this.f174863a.mo78514d3(), false, 1, (Object) null);
    }

    /* renamed from: d */
    public void mo3680d(int i) {
    }

    /* renamed from: e */
    public void mo3681e(RefreshLoadMoreLayout.C7080c<Object> cVar) {
        C87412m.m108594g(cVar, TPReportKeys.PlayerStep.PLAYER_REASON);
    }
}
