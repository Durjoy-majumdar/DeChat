package com.tencent.p014mm.plugin.finder.feed;

import bl3.C39818r;
import cm1.C0740i2;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.finder.feed.model.BaseFinderFeedLoader;
import com.tencent.p014mm.plugin.finder.feed.model.C55776r;
import com.tencent.p014mm.plugin.finder.feed.model.internal.BaseFeedLoader;
import com.tencent.p014mm.plugin.finder.feed.p052ui.FinderPostPreviewUI;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import dp1.C7433e1;
import ef1.C58553c;
import er1.C58739j4;
import er1.C58784w3;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import ht1.C60172g4;
import jq3.C60905o;
import jq3.C9500j;
import kf1.C9854m5;
import nj3.C11182m0;
import nj3.C76874e0;
import qo3.C77407n;
import rs1.C13133c1;
import rs1.C13442s8;
import te3.C49712hj1;

/* renamed from: com.tencent.mm.plugin.finder.feed.FinderPreviewTimelineUIContract$Presenter */
public final class FinderPreviewTimelineUIContract$Presenter extends FinderLoaderFeedUIContract$Presenter {

    /* renamed from: t */
    public final FinderPostPreviewUI f13129t;

    /* renamed from: u */
    public final int f13130u;

    /* renamed from: v */
    public final C55776r f13131v = ((C13133c1) C39818r.f106831a.mo62444c(this.f29961d).mo75002a(C13133c1.class)).f37371d;

    /* renamed from: com.tencent.mm.plugin.finder.feed.FinderPreviewTimelineUIContract$Presenter$a */
    public static final class C2532a implements C11182m0 {

        /* renamed from: d */
        public final /* synthetic */ FinderPreviewTimelineUIContract$Presenter f13132d;

        /* renamed from: e */
        public final /* synthetic */ BaseFinderFeed f13133e;

        public C2532a(FinderPreviewTimelineUIContract$Presenter finderPreviewTimelineUIContract$Presenter, BaseFinderFeed baseFinderFeed) {
            this.f13132d = finderPreviewTimelineUIContract$Presenter;
            this.f13133e = baseFinderFeed;
        }

        public final void onCreateMMMenu(C76874e0 e0Var) {
            if (this.f13132d.mo10275L0(this.f13133e) && !C58739j4.f168176a.mo83686O(this.f13133e)) {
                e0Var.mo107135b(108, C0966R.string.f7944x1, C0966R.raw.icons_outlined_delete);
                MMActivity mMActivity = this.f13132d.f29961d;
                BaseFinderFeed baseFinderFeed = this.f13133e;
                C87412m.m108594g(mMActivity, "context");
                C87412m.m108594g(baseFinderFeed, "feed");
                if (baseFinderFeed.mo3513o().isCommentClose() || !C58784w3.f168295a.mo83889N0()) {
                    e0Var.mo107144g(107, mMActivity.getString(C0966R.string.d9v), C0966R.raw.icons_outlined_comment);
                } else {
                    e0Var.mo107144g(106, mMActivity.getString(C0966R.string.d8r), C0966R.raw.icons_outlined_comment_close);
                }
                if (!this.f13132d.f13129t.f14693K && (this.f13133e.mo75c() == 4 || this.f13133e.mo75c() == 2)) {
                    e0Var.mo107144g(112, this.f13132d.f29961d.getString(C0966R.string.d9y), C0966R.raw.finder_icons_outlined_max_window);
                }
            }
            C58784w3 w3Var = C58784w3.f168295a;
            if (w3Var.mo83980y0(this.f13133e.mo3513o())) {
                e0Var.mo107151k(109, w3Var.mo83909X(this.f13133e), C0966R.raw.icons_outlined_bgm_play, !this.f13133e.mo3513o().isPostFinish() || this.f13133e.mo3513o().isPostFailed() || w3Var.mo83979y(this.f13133e.mo3513o().getFeedObject()));
            }
            if (!this.f13132d.mo10275L0(this.f13133e)) {
                FinderPreviewTimelineUIContract$Presenter finderPreviewTimelineUIContract$Presenter = this.f13132d;
                int i = finderPreviewTimelineUIContract$Presenter.f29967j;
                if (!(i == 3 || i == 1)) {
                    e0Var.mo107144g(99, finderPreviewTimelineUIContract$Presenter.f29961d.getString(C0966R.string.gvx), C0966R.raw.finder_feed_dislike_new);
                }
                e0Var.mo107144g(101, this.f13132d.f29961d.getString(C0966R.string.gvt), C0966R.raw.icons_outlined_report_problem);
            }
            C7433e1 e1Var = C7433e1.f25622a;
            C87412m.m108593f(e0Var, "menu");
            e1Var.mo8573b(e0Var);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.FinderPreviewTimelineUIContract$Presenter$b */
    public static final class C2533b extends C87413o implements C32226l<Integer, C0740i2> {

        /* renamed from: d */
        public final /* synthetic */ FinderPreviewTimelineUIContract$Presenter f13134d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2533b(FinderPreviewTimelineUIContract$Presenter finderPreviewTimelineUIContract$Presenter) {
            super(1);
            this.f13134d = finderPreviewTimelineUIContract$Presenter;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x000f, code lost:
            r1 = r1.getDataListJustForAdapter();
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object invoke(java.lang.Object r3) {
            /*
                r2 = this;
                java.lang.Number r3 = (java.lang.Number) r3
                int r3 = r3.intValue()
                r0 = 0
                if (r3 < 0) goto L_0x0032
                com.tencent.mm.plugin.finder.feed.FinderPreviewTimelineUIContract$Presenter r1 = r2.f13134d
                com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader<cm1.i2> r1 = r1.f13124s
                if (r1 == 0) goto L_0x001a
                com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer r1 = r1.getDataListJustForAdapter()
                if (r1 == 0) goto L_0x001a
                int r1 = r1.size()
                goto L_0x001b
            L_0x001a:
                r1 = 0
            L_0x001b:
                if (r3 >= r1) goto L_0x0032
                com.tencent.mm.plugin.finder.feed.FinderPreviewTimelineUIContract$Presenter r1 = r2.f13134d
                com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader<cm1.i2> r1 = r1.f13124s
                if (r1 == 0) goto L_0x002a
                java.lang.Object r3 = r1.get(r3)
                cm1.i2 r3 = (cm1.C0740i2) r3
                goto L_0x002b
            L_0x002a:
                r3 = r0
            L_0x002b:
                boolean r1 = r3 instanceof com.tencent.p014mm.plugin.finder.model.BaseFinderFeed
                if (r1 == 0) goto L_0x0032
                r0 = r3
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r0 = (com.tencent.p014mm.plugin.finder.model.BaseFinderFeed) r0
            L_0x0032:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.feed.FinderPreviewTimelineUIContract$Presenter.C2533b.invoke(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderPreviewTimelineUIContract$Presenter(FinderPostPreviewUI finderPostPreviewUI, boolean z, String str, int i, int i2, C49712hj1 hj12) {
        super(finderPostPreviewUI);
        C87412m.m108594g(finderPostPreviewUI, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        C87412m.m108594g(str, "username");
        this.f13129t = finderPostPreviewUI;
        this.f13130u = i;
        this.f29967j = Integer.MIN_VALUE;
    }

    /* renamed from: U */
    public C9500j mo2488U() {
        return new FinderPreviewTimelineUIContract$Presenter$buildItemCoverts$1(this);
    }

    /* renamed from: d7 */
    public C11182m0 mo2568d7(BaseFinderFeed baseFinderFeed, C77407n nVar, C60905o oVar) {
        C87412m.m108594g(baseFinderFeed, "feed");
        C87412m.m108594g(nVar, "sheet");
        C87412m.m108594g(oVar, "holder");
        return new C2532a(this, baseFinderFeed);
    }

    /* renamed from: o */
    public void mo2494o() {
        BaseFeedLoader<C0740i2> baseFeedLoader = this.f13124s;
        if (baseFeedLoader != null) {
            BaseFeedLoader.requestLoadMore$default(baseFeedLoader, false, 1, (Object) null);
        }
    }

    public void onDetach() {
        C58553c a;
        this.f13131v.onDetach();
        C13442s8 f = C13442s8.f38060Q0.mo12873f(this.f29961d);
        if (!(f == null || (a = C60172g4.C60173a.m70189a(f, 0, 1, (Object) null)) == null)) {
            a.mo83453d(this.f13131v);
        }
        super.onDetach();
    }

    public void requestRefresh() {
        BaseFeedLoader<C0740i2> baseFeedLoader = this.f13124s;
        if (baseFeedLoader != null) {
            baseFeedLoader.requestRefresh();
        }
    }

    /* renamed from: t1 */
    public void mo2547t1(BaseFinderFeedLoader baseFinderFeedLoader, C9854m5 m5Var) {
        C58553c a;
        C87412m.m108594g(baseFinderFeedLoader, "model");
        C87412m.m108594g(m5Var, "callback");
        super.mo2547t1(baseFinderFeedLoader, m5Var);
        this.f13131v.mo77389H1(this.f13130u, this.f29962e, new C2533b(this));
        C13442s8 f = C13442s8.f38060Q0.mo12873f(this.f29961d);
        if (f != null && (a = C60172g4.C60173a.m70189a(f, 0, 1, (Object) null)) != null) {
            a.mo83450a(this.f13131v);
        }
    }
}
