package com.tencent.p014mm.plugin.finder.feed;

import cm1.C0740i2;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.finder.feed.model.BaseFinderFeedLoader;
import com.tencent.p014mm.plugin.finder.feed.model.FinderPoiRelateLoader;
import com.tencent.p014mm.plugin.finder.feed.model.internal.BaseFeedLoader;
import com.tencent.p014mm.plugin.finder.feed.model.internal.IResponse;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import jq3.C9500j;
import kf1.C9732g;
import kf1.C9753h;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.finder.feed.FinderPoiRelateUIContract$PoiRelatePresenter */
public final class FinderPoiRelateUIContract$PoiRelatePresenter extends C9732g {

    /* renamed from: com.tencent.mm.plugin.finder.feed.FinderPoiRelateUIContract$PoiRelatePresenter$a */
    public static final class C2531a extends C87413o implements C32226l<IResponse<C0740i2>, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ FinderPoiRelateUIContract$PoiRelatePresenter f13128d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2531a(FinderPoiRelateUIContract$PoiRelatePresenter finderPoiRelateUIContract$PoiRelatePresenter) {
            super(1);
            this.f13128d = finderPoiRelateUIContract$PoiRelatePresenter;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: kf1.c7} */
        /* JADX WARNING: type inference failed for: r4v0 */
        /* JADX WARNING: type inference failed for: r4v1, types: [android.view.View] */
        /* JADX WARNING: type inference failed for: r4v6 */
        /* JADX WARNING: type inference failed for: r4v7 */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object invoke(java.lang.Object r14) {
            /*
                r13 = this;
                com.tencent.mm.plugin.finder.feed.model.internal.IResponse r14 = (com.tencent.p014mm.plugin.finder.feed.model.internal.IResponse) r14
                java.lang.String r0 = "it"
                gy3.C87412m.m108594g(r14, r0)
                com.tencent.mm.plugin.finder.feed.FinderPoiRelateUIContract$PoiRelatePresenter r14 = r13.f13128d
                com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader r14 = r14.f30175e
                int r14 = r14.getSize()
                r0 = 0
                r1 = 1
                if (r14 != 0) goto L_0x0015
                r14 = 1
                goto L_0x0016
            L_0x0015:
                r14 = 0
            L_0x0016:
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "[fetchEndCallback], "
                r2.append(r3)
                r2.append(r14)
                java.lang.String r2 = r2.toString()
                java.lang.String r3 = "Finder.FinderPoiRelateUIContract"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r2)
                com.tencent.mm.plugin.finder.feed.FinderPoiRelateUIContract$PoiRelatePresenter r2 = r13.f13128d
                kf1.h r2 = r2.f30176f
                boolean r3 = r2 instanceof kf1.C9669c7
                r4 = 0
                if (r3 == 0) goto L_0x0038
                kf1.c7 r2 = (kf1.C9669c7) r2
                goto L_0x0039
            L_0x0038:
                r2 = r4
            L_0x0039:
                if (r2 == 0) goto L_0x0080
                if (r14 != 0) goto L_0x0080
                boolean r3 = r2.f30044z
                if (r3 != 0) goto L_0x0080
                r2.f30044z = r1
                r1 = 2131304946(0x7f0921f2, float:1.8228049E38)
                android.view.View r1 = r2.mo10357y(r1)
                android.widget.FrameLayout r1 = (android.widget.FrameLayout) r1
                if (r1 != 0) goto L_0x004f
                goto L_0x0052
            L_0x004f:
                r1.setVisibility(r0)
            L_0x0052:
                r1 = 2131315802(0x7f094c5a, float:1.8250068E38)
                android.view.View r1 = r2.mo10357y(r1)
                android.widget.TextView r1 = (android.widget.TextView) r1
                r2.f30041w = r1
                r1 = 2131315803(0x7f094c5b, float:1.825007E38)
                android.view.View r1 = r2.mo10357y(r1)
                android.widget.TextView r1 = (android.widget.TextView) r1
                r2.f30042x = r1
                android.widget.TextView r1 = r2.f30041w
                if (r1 == 0) goto L_0x0074
                kf1.e7 r3 = new kf1.e7
                r3.<init>(r2)
                r1.setOnClickListener(r3)
            L_0x0074:
                android.widget.TextView r1 = r2.f30042x
                if (r1 == 0) goto L_0x0080
                kf1.f7 r3 = new kf1.f7
                r3.<init>(r2)
                r1.setOnClickListener(r3)
            L_0x0080:
                if (r14 == 0) goto L_0x0093
                com.tencent.mm.plugin.finder.feed.FinderPoiRelateUIContract$PoiRelatePresenter r14 = r13.f13128d
                kf1.h r14 = r14.f30176f
                boolean r0 = r14 instanceof kf1.C9669c7
                if (r0 == 0) goto L_0x008d
                r4 = r14
                kf1.c7 r4 = (kf1.C9669c7) r4
            L_0x008d:
                if (r4 == 0) goto L_0x00e2
                r4.mo10288b1()
                goto L_0x00e2
            L_0x0093:
                com.tencent.mm.plugin.finder.feed.FinderPoiRelateUIContract$PoiRelatePresenter r14 = r13.f13128d
                kf1.h r14 = r14.f30176f
                if (r14 == 0) goto L_0x009d
                android.view.View r4 = r14.mo9299m0()
            L_0x009d:
                if (r4 != 0) goto L_0x00a0
                goto L_0x00e2
            L_0x00a0:
                r14 = 8
                k20.a r1 = new k20.a
                r1.<init>()
                java.lang.ThreadLocal<k20.a> r2 = k20.C60958c.f173611a
                java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
                r1.mo10233c(r14)
                java.lang.Object[] r6 = r1.mo10232b()
                java.lang.String r7 = "com/tencent/mm/plugin/finder/feed/FinderPoiRelateUIContract$PoiRelatePresenter$1"
                java.lang.String r8 = "invoke"
                java.lang.String r9 = "(Lcom/tencent/mm/plugin/finder/feed/model/internal/IResponse;)V"
                java.lang.String r10 = "android/view/View_EXEC_"
                java.lang.String r11 = "setVisibility"
                java.lang.String r12 = "(I)V"
                r5 = r4
                j20.C117292a.m165358d(r5, r6, r7, r8, r9, r10, r11, r12)
                java.lang.Object r14 = r1.mo10231a(r0)
                java.lang.Integer r14 = (java.lang.Integer) r14
                int r14 = r14.intValue()
                r4.setVisibility(r14)
                java.lang.String r6 = "com/tencent/mm/plugin/finder/feed/FinderPoiRelateUIContract$PoiRelatePresenter$1"
                java.lang.String r7 = "invoke"
                java.lang.String r8 = "(Lcom/tencent/mm/plugin/finder/feed/model/internal/IResponse;)V"
                java.lang.String r9 = "android/view/View_EXEC_"
                java.lang.String r10 = "setVisibility"
                java.lang.String r11 = "(I)V"
                j20.C117292a.m165359e(r5, r6, r7, r8, r9, r10, r11)
            L_0x00e2:
                rx3.b0 r14 = rx3.C13598b0.f38549a
                return r14
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.feed.FinderPoiRelateUIContract$PoiRelatePresenter.C2531a.invoke(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderPoiRelateUIContract$PoiRelatePresenter(MMActivity mMActivity, int i, int i2, BaseFinderFeedLoader baseFinderFeedLoader) {
        super(mMActivity, i, i2, baseFinderFeedLoader);
        C87412m.m108594g(mMActivity, "context");
        C87412m.m108594g(baseFinderFeedLoader, "loader");
        BaseFinderFeedLoader baseFinderFeedLoader2 = this.f30175e;
        FinderPoiRelateLoader finderPoiRelateLoader = baseFinderFeedLoader2 instanceof FinderPoiRelateLoader ? (FinderPoiRelateLoader) baseFinderFeedLoader2 : null;
        if (finderPoiRelateLoader != null) {
            finderPoiRelateLoader.f13790e = new C2531a(this);
        }
    }

    /* renamed from: U */
    public C9500j mo2516U() {
        return new FinderPoiRelateUIContract$PoiRelatePresenter$buildItemCoverts$1();
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

    /* renamed from: q */
    public void mo2523q() {
        BaseFeedLoader.requestInit$default(this.f30175e, false, 1, (Object) null);
    }

    public void requestRefresh() {
        this.f30175e.requestRefresh();
    }
}
