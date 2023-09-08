package kf1;

import android.view.View;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.finder.feed.model.BaseFinderFeedLoader;
import com.tencent.p014mm.plugin.finder.feed.model.FinderHotWordFeedLoader;
import com.tencent.p014mm.plugin.finder.feed.model.internal.BaseFeedLoader;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.view.RefreshLoadMoreLayout;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import jq3.C9500j;
import o40.C61926c;
import pe3.C89349b;
import rx3.C13598b0;
import tf1.C13910j;
import z04.C119027c;
import zp3.C16389w;

/* renamed from: kf1.k3 */
public final class C9820k3 extends C9732g {

    /* renamed from: h */
    public C16389w f30366h = new C9821a(this);

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9820k3(MMActivity mMActivity, int i, int i2, BaseFinderFeedLoader baseFinderFeedLoader) {
        super(mMActivity, i, i2, baseFinderFeedLoader);
        C87412m.m108594g(mMActivity, "context");
        C87412m.m108594g(baseFinderFeedLoader, "loader");
    }

    /* renamed from: N */
    public final void mo10393N(RefreshLoadMoreLayout.C7080c<Object> cVar) {
        RefreshLoadMoreLayout refreshLoadMoreLayout;
        View loadMoreFooter;
        TextView textView;
        RefreshLoadMoreLayout refreshLoadMoreLayout2;
        View loadMoreFooter2;
        TextView textView2;
        C87412m.m108594g(cVar, TPReportKeys.PlayerStep.PLAYER_REASON);
        E e = cVar.f24950e;
        C87412m.m108592e(e, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.feed.model.FinderHotWordFeedLoader.HotWordResponse");
        boolean z = true;
        RefreshLoadMoreLayout refreshLoadMoreLayout3 = null;
        if (!((FinderHotWordFeedLoader.C2691e) e).getHasMore()) {
            C9753h hVar = this.f30176f;
            if (hVar != null) {
                refreshLoadMoreLayout3 = hVar.f30220j;
            }
            if (refreshLoadMoreLayout3 != null) {
                if (this.f30175e.getSize() <= 10) {
                    z = false;
                }
                refreshLoadMoreLayout3.setEnableLoadMore(z);
            }
            C9753h hVar2 = this.f30176f;
            if (!(hVar2 == null || (refreshLoadMoreLayout2 = hVar2.f30220j) == null || (loadMoreFooter2 = refreshLoadMoreLayout2.getLoadMoreFooter()) == null || (textView2 = (TextView) loadMoreFooter2.findViewById(C0966R.C0970id.g2t)) == null)) {
                textView2.setText(C0966R.string.eat);
            }
            C9753h hVar3 = this.f30176f;
            if (hVar3 != null && (refreshLoadMoreLayout = hVar3.f30220j) != null && (loadMoreFooter = refreshLoadMoreLayout.getLoadMoreFooter()) != null && (textView = (TextView) loadMoreFooter.findViewById(C0966R.C0970id.g2t)) != null) {
                textView.setTextColor(this.f30174d.getResources().getColor(C0966R.color.FG_2));
                return;
            }
            return;
        }
        C9753h hVar4 = this.f30176f;
        if (hVar4 != null) {
            refreshLoadMoreLayout3 = hVar4.f30220j;
        }
        if (refreshLoadMoreLayout3 != null) {
            refreshLoadMoreLayout3.setEnableLoadMore(true);
        }
    }

    /* renamed from: U */
    public C9500j mo2516U() {
        C9753h hVar = this.f30176f;
        C87412m.m108591d(hVar);
        return hVar.mo9296Z().mo3664a();
    }

    /* renamed from: e */
    public C16389w mo2638e() {
        return this.f30366h;
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
        BaseFinderFeedLoader baseFinderFeedLoader = this.f30175e;
        C87412m.m108592e(baseFinderFeedLoader, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.feed.model.FinderHotWordFeedLoader");
        BaseFeedLoader.requestLoadMore$default((FinderHotWordFeedLoader) baseFinderFeedLoader, false, 1, (Object) null);
    }

    public void requestRefresh() {
        C89349b bVar;
        byte[] bArr;
        BaseFinderFeedLoader baseFinderFeedLoader = this.f30175e;
        C87412m.m108592e(baseFinderFeedLoader, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.feed.model.FinderHotWordFeedLoader");
        FinderHotWordFeedLoader finderHotWordFeedLoader = (FinderHotWordFeedLoader) baseFinderFeedLoader;
        Log.m105924i(finderHotWordFeedLoader.getTAG(), "requestRefresh");
        String str = finderHotWordFeedLoader.f13629h;
        if (!(str == null || str.length() == 0)) {
            String str2 = finderHotWordFeedLoader.f13629h;
            if (str2 != null) {
                bArr = str2.getBytes(C119027c.f356488a);
                C87412m.m108593f(bArr, "this as java.lang.String).getBytes(charset)");
            } else {
                bArr = null;
            }
            bVar = new C89349b(bArr);
        } else {
            bVar = null;
        }
        FinderHotWordFeedLoader.C2689c cVar = new FinderHotWordFeedLoader.C2689c(finderHotWordFeedLoader.f13628g, bVar, finderHotWordFeedLoader.getContextObj());
        Log.m105924i(cVar.f13640a, cVar.toString());
        BaseFeedLoader.request$default(finderHotWordFeedLoader, cVar, (C13910j) null, 2, (Object) null);
        finderHotWordFeedLoader.f13625d = cVar;
    }

    /* renamed from: kf1.k3$a */
    public static final class C9821a implements C16389w {

        /* renamed from: d */
        public final /* synthetic */ C9820k3 f30367d;

        /* renamed from: kf1.k3$a$a */
        public static final class C9822a extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ C9820k3 f30368d;

            /* renamed from: e */
            public final /* synthetic */ RefreshLoadMoreLayout.C7080c<Object> f30369e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C9822a(C9820k3 k3Var, RefreshLoadMoreLayout.C7080c<Object> cVar) {
                super(0);
                this.f30368d = k3Var;
                this.f30369e = cVar;
            }

            public Object invoke() {
                this.f30368d.mo10393N(this.f30369e);
                return C13598b0.f38549a;
            }
        }

        /* renamed from: kf1.k3$a$b */
        public static final class C9823b extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ C9820k3 f30370d;

            /* renamed from: e */
            public final /* synthetic */ RefreshLoadMoreLayout.C7080c<Object> f30371e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C9823b(C9820k3 k3Var, RefreshLoadMoreLayout.C7080c<Object> cVar) {
                super(0);
                this.f30370d = k3Var;
                this.f30371e = cVar;
            }

            public Object invoke() {
                this.f30370d.mo10393N(this.f30371e);
                return C13598b0.f38549a;
            }
        }

        /* renamed from: kf1.k3$a$c */
        public static final class C9824c extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ C9820k3 f30372d;

            /* renamed from: e */
            public final /* synthetic */ RefreshLoadMoreLayout.C7080c<Object> f30373e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C9824c(C9820k3 k3Var, RefreshLoadMoreLayout.C7080c<Object> cVar) {
                super(0);
                this.f30372d = k3Var;
                this.f30373e = cVar;
            }

            public Object invoke() {
                RefreshLoadMoreLayout refreshLoadMoreLayout;
                C9753h hVar = this.f30372d.f30176f;
                if (!(hVar == null || (refreshLoadMoreLayout = hVar.f30220j) == null)) {
                    refreshLoadMoreLayout.onPreFinishRefresh(this.f30373e);
                }
                this.f30372d.mo10393N(this.f30373e);
                return C13598b0.f38549a;
            }
        }

        public C9821a(C9820k3 k3Var) {
            this.f30367d = k3Var;
        }

        public void onChanged() {
            RefreshLoadMoreLayout refreshLoadMoreLayout;
            C9753h hVar = this.f30367d.f30176f;
            if (hVar != null && (refreshLoadMoreLayout = hVar.f30220j) != null) {
                refreshLoadMoreLayout.onChanged();
            }
        }

        public void onItemRangeChanged(int i, int i2) {
            RefreshLoadMoreLayout refreshLoadMoreLayout;
            C9753h hVar = this.f30367d.f30176f;
            if (hVar != null && (refreshLoadMoreLayout = hVar.f30220j) != null) {
                refreshLoadMoreLayout.onItemRangeChanged(i + (hVar != null ? hVar.mo10346D().mo85796c6() : 0), i2);
            }
        }

        public void onItemRangeInserted(int i, int i2) {
            RefreshLoadMoreLayout refreshLoadMoreLayout;
            C9753h hVar = this.f30367d.f30176f;
            if (hVar != null && (refreshLoadMoreLayout = hVar.f30220j) != null) {
                refreshLoadMoreLayout.onItemRangeInserted(i + (hVar != null ? hVar.mo10346D().mo85796c6() : 0), i2);
            }
        }

        public void onItemRangeMoved(int i, int i2, int i3) {
            RefreshLoadMoreLayout refreshLoadMoreLayout;
            C9753h hVar = this.f30367d.f30176f;
            if (hVar != null && (refreshLoadMoreLayout = hVar.f30220j) != null) {
                int i4 = 0;
                int c6 = i + (hVar != null ? hVar.mo10346D().mo85796c6() : 0);
                C9753h hVar2 = this.f30367d.f30176f;
                if (hVar2 != null) {
                    i4 = hVar2.mo10346D().mo85796c6();
                }
                refreshLoadMoreLayout.onItemRangeMoved(c6, i2 + i4, i3);
            }
        }

        public void onItemRangeRemoved(int i, int i2) {
            RefreshLoadMoreLayout refreshLoadMoreLayout;
            C9753h hVar = this.f30367d.f30176f;
            if (!(hVar == null || (refreshLoadMoreLayout = hVar.f30220j) == null)) {
                refreshLoadMoreLayout.onItemRangeRemoved(i + (hVar != null ? hVar.mo10346D().mo85796c6() : 0), i2);
            }
            C9753h hVar2 = this.f30367d.f30176f;
            if (hVar2 != null) {
                hVar2.mo9295R0();
            }
        }

        public void onPreFinishLoadMore(RefreshLoadMoreLayout.C7080c<Object> cVar) {
            RefreshLoadMoreLayout refreshLoadMoreLayout;
            C87412m.m108594g(cVar, TPReportKeys.PlayerStep.PLAYER_REASON);
            C9753h hVar = this.f30367d.f30176f;
            if (!(hVar == null || (refreshLoadMoreLayout = hVar.f30220j) == null)) {
                refreshLoadMoreLayout.mo82441G(cVar);
            }
            C61926c.m72668M(new C9822a(this.f30367d, cVar));
        }

        public void onPreFinishLoadMoreSmooth(RefreshLoadMoreLayout.C7080c<Object> cVar) {
            RefreshLoadMoreLayout refreshLoadMoreLayout;
            C87412m.m108594g(cVar, TPReportKeys.PlayerStep.PLAYER_REASON);
            C9753h hVar = this.f30367d.f30176f;
            if (!(hVar == null || (refreshLoadMoreLayout = hVar.f30220j) == null)) {
                refreshLoadMoreLayout.onPreFinishLoadMoreSmooth(cVar);
            }
            C61926c.m72668M(new C9823b(this.f30367d, cVar));
        }

        public void onPreFinishRefresh(RefreshLoadMoreLayout.C7080c<Object> cVar) {
            C87412m.m108594g(cVar, TPReportKeys.PlayerStep.PLAYER_REASON);
            C61926c.m72668M(new C9824c(this.f30367d, cVar));
        }

        public void onItemRangeChanged(int i, int i2, Object obj) {
            RefreshLoadMoreLayout refreshLoadMoreLayout;
            C9753h hVar = this.f30367d.f30176f;
            if (hVar != null && (refreshLoadMoreLayout = hVar.f30220j) != null) {
                refreshLoadMoreLayout.onItemRangeChanged(i + (hVar != null ? hVar.mo10346D().mo85796c6() : 0), i2, obj);
            }
        }
    }
}
