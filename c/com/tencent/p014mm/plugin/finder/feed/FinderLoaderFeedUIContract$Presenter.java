package com.tencent.p014mm.plugin.finder.feed;

import bl3.C39818r;
import cm1.C0740i2;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.finder.feed.model.BaseFinderFeedLoader;
import com.tencent.p014mm.plugin.finder.feed.model.internal.BaseFeedLoader;
import com.tencent.p014mm.plugin.finder.feed.model.internal.DataBuffer;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.plugin.finder.preload.MediaPreloadCore;
import com.tencent.p014mm.plugin.finder.video.FinderVideoCore;
import com.tencent.p014mm.plugin.finder.viewmodel.component.FinderFeedMegaVideoBtnAnimUIC;
import gy3.C8480h;
import gy3.C87412m;
import ht1.C60172g4;
import java.util.ArrayList;
import jq3.C9500j;
import kf1.C9640c;
import kf1.C9707f;
import kf1.C9854m5;
import rs1.C13442s8;
import rs1.C63547e;
import zp3.C16389w;

/* renamed from: com.tencent.mm.plugin.finder.feed.FinderLoaderFeedUIContract$Presenter */
public abstract class FinderLoaderFeedUIContract$Presenter extends C9640c {

    /* renamed from: r */
    public final String f13123r = "Finder.FinderLoaderFeedUIContract.Presenter";

    /* renamed from: s */
    public BaseFeedLoader<C0740i2> f13124s;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderLoaderFeedUIContract$Presenter(MMActivity mMActivity) {
        super(mMActivity, 0, 2, (C8480h) null);
        C87412m.m108594g(mMActivity, "context");
    }

    /* renamed from: G */
    public C0740i2 mo2486G(int i) {
        BaseFeedLoader<C0740i2> baseFeedLoader = this.f13124s;
        if (baseFeedLoader != null) {
            return baseFeedLoader.safeGet(i);
        }
        return null;
    }

    /* renamed from: N */
    public String mo2546N() {
        return this.f13123r;
    }

    /* renamed from: U */
    public C9500j mo2488U() {
        return new FinderLoaderFeedUIContract$Presenter$buildItemCoverts$1(this);
    }

    /* renamed from: a1 */
    public boolean mo2564a1() {
        return false;
    }

    /* renamed from: e */
    public int mo2490e(BaseFinderFeed baseFinderFeed) {
        DataBuffer<C0740i2> dataListJustForAdapter;
        C87412m.m108594g(baseFinderFeed, "feed");
        BaseFeedLoader<C0740i2> baseFeedLoader = this.f13124s;
        if (baseFeedLoader == null || (dataListJustForAdapter = baseFeedLoader.getDataListJustForAdapter()) == null) {
            return -1;
        }
        return dataListJustForAdapter.indexOf(baseFinderFeed);
    }

    /* renamed from: f0 */
    public DataBuffer<C0740i2> mo2491f0() {
        BaseFeedLoader<C0740i2> baseFeedLoader = this.f13124s;
        C87412m.m108591d(baseFeedLoader);
        return baseFeedLoader.getDataListJustForAdapter();
    }

    /* renamed from: n */
    public ArrayList<C0740i2> mo2492n() {
        BaseFeedLoader<C0740i2> baseFeedLoader = this.f13124s;
        if (baseFeedLoader != null) {
            return baseFeedLoader.getDataListJustForAdapter();
        }
        return null;
    }

    /* renamed from: n0 */
    public void mo2493n0() {
        BaseFeedLoader<C0740i2> baseFeedLoader;
        C9707f fVar = this.f29964g;
        C87412m.m108592e(fVar, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.feed.FinderLoaderFeedUIContract.ViewCallback");
        C16389w x0 = ((C9854m5) fVar).mo10283x0();
        if (!(x0 == null || (baseFeedLoader = this.f13124s) == null)) {
            baseFeedLoader.register(x0);
        }
        C9707f fVar2 = this.f29964g;
        C87412m.m108591d(fVar2);
        BaseFeedLoader<C0740i2> baseFeedLoader2 = this.f13124s;
        C87412m.m108591d(baseFeedLoader2);
        fVar2.mo5183d(baseFeedLoader2.getDataListJustForAdapter());
    }

    public void onDetach() {
        BaseFeedLoader<C0740i2> baseFeedLoader;
        C9707f fVar = this.f29964g;
        C87412m.m108592e(fVar, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.feed.FinderLoaderFeedUIContract.ViewCallback");
        C16389w x0 = ((C9854m5) fVar).mo10283x0();
        if (!(x0 == null || (baseFeedLoader = this.f13124s) == null)) {
            baseFeedLoader.unregister(x0);
        }
        super.onDetach();
    }

    /* renamed from: s1 */
    public void mo2565s1() {
        BaseFeedLoader<C0740i2> baseFeedLoader = this.f13124s;
        if (baseFeedLoader != null) {
            BaseFeedLoader.requestInit$default(baseFeedLoader, false, 1, (Object) null);
        }
    }

    /* renamed from: t1 */
    public void mo2547t1(BaseFinderFeedLoader baseFinderFeedLoader, C9854m5 m5Var) {
        C87412m.m108594g(baseFinderFeedLoader, "model");
        C87412m.m108594g(m5Var, "callback");
        this.f13124s = baseFinderFeedLoader;
        super.mo2487N0(m5Var);
        C39818r rVar = C39818r.f106831a;
        ((FinderFeedMegaVideoBtnAnimUIC) rVar.mo62444c(this.f29961d).mo75002a(FinderFeedMegaVideoBtnAnimUIC.class)).mo80031d3(m5Var.getRecyclerView());
        boolean z = MediaPreloadCore.f160304p;
        if (MediaPreloadCore.f160304p) {
            C63547e eVar = (C63547e) rVar.mo62444c(this.f29961d).mo75002a(C63547e.class);
            DataBuffer dataListJustForAdapter = baseFinderFeedLoader.getDataListJustForAdapter();
            FinderVideoCore finderVideoCore = this.f29969o;
            C13442s8 f = C13442s8.f38060Q0.mo12873f(this.f29961d);
            eVar.mo88403c3(dataListJustForAdapter, 0, finderVideoCore, f != null ? C60172g4.C60173a.m70189a(f, 0, 1, (Object) null) : null, -1);
        }
    }
}
