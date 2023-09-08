package kf1;

import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.finder.feed.model.BaseFinderFeedLoader;
import com.tencent.p014mm.plugin.finder.feed.model.FinderLbsStreamFeedLoader;
import com.tencent.p014mm.plugin.finder.feed.model.internal.BaseFeedLoader;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.util.concurrent.ConcurrentHashMap;
import jq3.C9500j;
import up1.C14367u0;

/* renamed from: kf1.m3 */
public final class C9852m3 extends C9732g {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9852m3(MMActivity mMActivity, int i, int i2, BaseFinderFeedLoader baseFinderFeedLoader) {
        super(mMActivity, i, i2, baseFinderFeedLoader);
        C87412m.m108594g(mMActivity, "context");
        C87412m.m108594g(baseFinderFeedLoader, "loader");
    }

    /* renamed from: U */
    public C9500j mo2516U() {
        C9753h hVar = this.f30176f;
        C14367u0 Z = hVar != null ? hVar.mo9296Z() : null;
        C87412m.m108591d(Z);
        return Z.mo3664a();
    }

    /* renamed from: n */
    public void mo2519n() {
        C9753h hVar = this.f30176f;
        if (hVar != null) {
            hVar.mo9297d(this.f30175e.getDataListJustForAdapter());
        }
    }

    /* renamed from: o */
    public void mo2521o() {
        BaseFeedLoader.requestLoadMore$default(this.f30175e, false, 1, (Object) null);
    }

    public void onDetach() {
        super.onDetach();
        ConcurrentHashMap<Long, Object> concurrentHashMap = FinderLbsStreamFeedLoader.f13687g;
        Log.m105924i("Finder.LbsStreamFeedLoader", "clearCache");
        FinderLbsStreamFeedLoader.f13687g.clear();
    }

    /* renamed from: q */
    public void mo2523q() {
        BaseFeedLoader.requestInit$default(this.f30175e, false, 1, (Object) null);
    }

    public void requestRefresh() {
    }

    /* renamed from: t */
    public void mo2525t(C9753h hVar) {
        C87412m.m108594g(hVar, "callback");
        super.mo2525t(hVar);
    }
}
