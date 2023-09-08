package kf1;

import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.finder.feed.model.BaseFinderFeedLoader;
import com.tencent.p014mm.view.RefreshLoadMoreLayout;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import fo1.C59264a;
import gy3.C87412m;
import jp3.C9486a;
import jp3.C9487b;
import jq3.C9500j;
import zp3.C16389w;

/* renamed from: kf1.g */
public abstract class C9732g implements C59264a<C9753h>, C9487b<C9486a> {

    /* renamed from: d */
    public final MMActivity f30174d;

    /* renamed from: e */
    public final BaseFinderFeedLoader f30175e;

    /* renamed from: f */
    public C9753h f30176f;

    /* renamed from: g */
    public C16389w f30177g = new C9733a(this);

    public C9732g(MMActivity mMActivity, int i, int i2, BaseFinderFeedLoader baseFinderFeedLoader) {
        C87412m.m108594g(mMActivity, "context");
        C87412m.m108594g(baseFinderFeedLoader, "feedLoader");
        this.f30174d = mMActivity;
        this.f30175e = baseFinderFeedLoader;
    }

    /* renamed from: A7 */
    public void mo2513A7(RefreshLoadMoreLayout.C7080c<Object> cVar) {
        C87412m.m108594g(cVar, TPReportKeys.PlayerStep.PLAYER_REASON);
    }

    /* renamed from: G */
    public void mo2514G() {
    }

    /* renamed from: U */
    public abstract C9500j mo2516U();

    /* renamed from: e */
    public C16389w mo2638e() {
        return null;
    }

    public void keep(C9486a aVar) {
    }

    /* renamed from: n */
    public abstract void mo2519n();

    /* renamed from: o */
    public abstract void mo2521o();

    public void onDetach() {
        BaseFinderFeedLoader baseFinderFeedLoader = this.f30175e;
        C16389w e = mo2638e();
        if (e == null) {
            e = this.f30177g;
        }
        baseFinderFeedLoader.unregister(e);
    }

    public void onRefreshEnd(RefreshLoadMoreLayout.C7080c<Object> cVar) {
        C87412m.m108594g(cVar, TPReportKeys.PlayerStep.PLAYER_REASON);
    }

    /* renamed from: q */
    public void mo2523q() {
    }

    public abstract void requestRefresh();

    /* renamed from: t */
    public void mo2525t(C9753h hVar) {
        C87412m.m108594g(hVar, "callback");
        this.f30176f = hVar;
        BaseFinderFeedLoader baseFinderFeedLoader = this.f30175e;
        C16389w e = mo2638e();
        if (e == null) {
            e = this.f30177g;
        }
        baseFinderFeedLoader.register(e);
        mo2519n();
    }

    /* renamed from: x */
    public void mo2526x() {
    }

    /* renamed from: kf1.g$a */
    public static final class C9733a implements C16389w {

        /* renamed from: d */
        public final /* synthetic */ C9732g f30178d;

        public C9733a(C9732g gVar) {
            this.f30178d = gVar;
        }

        public void onChanged() {
            RefreshLoadMoreLayout refreshLoadMoreLayout;
            C9753h hVar = this.f30178d.f30176f;
            if (hVar != null && (refreshLoadMoreLayout = hVar.f30220j) != null) {
                refreshLoadMoreLayout.onChanged();
            }
        }

        public void onItemRangeChanged(int i, int i2) {
            RefreshLoadMoreLayout refreshLoadMoreLayout;
            C9753h hVar = this.f30178d.f30176f;
            if (hVar != null && (refreshLoadMoreLayout = hVar.f30220j) != null) {
                refreshLoadMoreLayout.onItemRangeChanged(i + (hVar != null ? hVar.mo10346D().mo85796c6() : 0), i2);
            }
        }

        public void onItemRangeInserted(int i, int i2) {
            RefreshLoadMoreLayout refreshLoadMoreLayout;
            C9753h hVar = this.f30178d.f30176f;
            if (hVar != null && (refreshLoadMoreLayout = hVar.f30220j) != null) {
                refreshLoadMoreLayout.onItemRangeInserted(i + (hVar != null ? hVar.mo10346D().mo85796c6() : 0), i2);
            }
        }

        public void onItemRangeMoved(int i, int i2, int i3) {
            RefreshLoadMoreLayout refreshLoadMoreLayout;
            C9753h hVar = this.f30178d.f30176f;
            if (hVar != null && (refreshLoadMoreLayout = hVar.f30220j) != null) {
                int i4 = 0;
                int c6 = i + (hVar != null ? hVar.mo10346D().mo85796c6() : 0);
                C9753h hVar2 = this.f30178d.f30176f;
                if (hVar2 != null) {
                    i4 = hVar2.mo10346D().mo85796c6();
                }
                refreshLoadMoreLayout.onItemRangeMoved(c6, i2 + i4, i3);
            }
        }

        public void onItemRangeRemoved(int i, int i2) {
            RefreshLoadMoreLayout refreshLoadMoreLayout;
            C9753h hVar = this.f30178d.f30176f;
            if (!(hVar == null || (refreshLoadMoreLayout = hVar.f30220j) == null)) {
                refreshLoadMoreLayout.onItemRangeRemoved(i + (hVar != null ? hVar.mo10346D().mo85796c6() : 0), i2);
            }
            C9753h hVar2 = this.f30178d.f30176f;
            if (hVar2 != null) {
                hVar2.mo9295R0();
            }
        }

        public void onPreFinishLoadMore(RefreshLoadMoreLayout.C7080c<Object> cVar) {
            RefreshLoadMoreLayout refreshLoadMoreLayout;
            C87412m.m108594g(cVar, TPReportKeys.PlayerStep.PLAYER_REASON);
            C9753h hVar = this.f30178d.f30176f;
            if (hVar != null && (refreshLoadMoreLayout = hVar.f30220j) != null) {
                refreshLoadMoreLayout.mo82441G(cVar);
            }
        }

        public void onPreFinishLoadMoreSmooth(RefreshLoadMoreLayout.C7080c<Object> cVar) {
            RefreshLoadMoreLayout refreshLoadMoreLayout;
            C87412m.m108594g(cVar, TPReportKeys.PlayerStep.PLAYER_REASON);
            C9753h hVar = this.f30178d.f30176f;
            if (hVar != null && (refreshLoadMoreLayout = hVar.f30220j) != null) {
                refreshLoadMoreLayout.onPreFinishLoadMoreSmooth(cVar);
            }
        }

        public void onPreFinishRefresh(RefreshLoadMoreLayout.C7080c<Object> cVar) {
            RefreshLoadMoreLayout refreshLoadMoreLayout;
            C87412m.m108594g(cVar, TPReportKeys.PlayerStep.PLAYER_REASON);
            C9753h hVar = this.f30178d.f30176f;
            if (hVar != null && (refreshLoadMoreLayout = hVar.f30220j) != null) {
                refreshLoadMoreLayout.onPreFinishRefresh(cVar);
            }
        }

        public void onItemRangeChanged(int i, int i2, Object obj) {
            RefreshLoadMoreLayout refreshLoadMoreLayout;
            C9753h hVar = this.f30178d.f30176f;
            if (hVar != null && (refreshLoadMoreLayout = hVar.f30220j) != null) {
                refreshLoadMoreLayout.onItemRangeChanged(i + (hVar != null ? hVar.mo10346D().mo85796c6() : 0), i2, obj);
            }
        }
    }
}
