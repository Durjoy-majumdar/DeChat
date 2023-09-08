package kf1;

import androidx.fragment.app.Fragment;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.finder.feed.model.BaseFinderFeedLoader;
import com.tencent.p014mm.plugin.finder.feed.model.internal.BaseFeedLoader;
import gy3.C87412m;
import jq3.C9500j;
import up1.C14367u0;

/* renamed from: kf1.f1 */
public final class C9712f1 extends C9732g {

    /* renamed from: h */
    public final Fragment f30137h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9712f1(MMActivity mMActivity, Fragment fragment, int i, int i2, BaseFinderFeedLoader baseFinderFeedLoader) {
        super(mMActivity, i, i2, baseFinderFeedLoader);
        C87412m.m108594g(mMActivity, "context");
        C87412m.m108594g(fragment, "fragment");
        C87412m.m108594g(baseFinderFeedLoader, "loader");
        this.f30137h = fragment;
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
    }

    /* renamed from: q */
    public void mo2523q() {
        BaseFeedLoader.requestInit$default(this.f30175e, false, 1, (Object) null);
    }

    public void requestRefresh() {
        this.f30175e.requestRefresh();
    }
}
