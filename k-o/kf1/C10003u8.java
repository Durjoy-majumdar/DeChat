package kf1;

import cm1.C0740i2;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.finder.feed.FinderLoaderFeedUIContract$Presenter;
import com.tencent.p014mm.plugin.finder.feed.model.internal.BaseFeedLoader;
import gy3.C87412m;

/* renamed from: kf1.u8 */
public final class C10003u8 extends FinderLoaderFeedUIContract$Presenter {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10003u8(MMActivity mMActivity) {
        super(mMActivity);
        C87412m.m108594g(mMActivity, "context");
    }

    /* renamed from: o */
    public void mo2494o() {
        BaseFeedLoader<C0740i2> baseFeedLoader = this.f13124s;
        if (baseFeedLoader != null) {
            BaseFeedLoader.requestLoadMore$default(baseFeedLoader, false, 1, (Object) null);
        }
    }

    public void requestRefresh() {
        BaseFeedLoader<C0740i2> baseFeedLoader = this.f13124s;
        if (baseFeedLoader != null) {
            baseFeedLoader.requestRefresh();
        }
    }
}
