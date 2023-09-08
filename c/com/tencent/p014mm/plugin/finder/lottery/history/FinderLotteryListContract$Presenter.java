package com.tencent.p014mm.plugin.finder.lottery.history;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import cl1.C54991o;
import cm1.C0718c1;
import cm1.C0740i2;
import com.tencent.p014mm.plugin.finder.feed.model.FinderLiveLotteryListLoader;
import com.tencent.p014mm.plugin.finder.feed.model.internal.BaseFeedLoader;
import com.tencent.p014mm.plugin.finder.feed.model.internal.IResponse;
import com.tencent.p014mm.plugin.finder.presenter.contract.BaseFinderLotteryContract;
import com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter;
import di3.C86312j;
import dp1.C58363h;
import fj1.C45795b;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import ht1.C60172g4;
import java.util.HashSet;
import java.util.List;
import jq3.C60905o;
import rx3.C13598b0;
import tf0.C64916p1;
import zc1.C66785b;
import zp3.C23555k;
import zp3.C23564m;

/* renamed from: com.tencent.mm.plugin.finder.lottery.history.FinderLotteryListContract$Presenter */
public final class FinderLotteryListContract$Presenter extends BaseFinderLotteryContract.Presenter {

    /* renamed from: h */
    public boolean f15480h = true;

    /* renamed from: i */
    public final boolean f15481i;

    /* renamed from: com.tencent.mm.plugin.finder.lottery.history.FinderLotteryListContract$Presenter$a */
    public static final class C3260a extends C87413o implements C32226l<IResponse<C0740i2>, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ FinderLotteryListContract$Presenter f15482d;

        /* renamed from: e */
        public final /* synthetic */ BaseFinderLotteryContract.ViewCallback f15483e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3260a(FinderLotteryListContract$Presenter finderLotteryListContract$Presenter, BaseFinderLotteryContract.ViewCallback viewCallback) {
            super(1);
            this.f15482d = finderLotteryListContract$Presenter;
            this.f15483e = viewCallback;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:14:0x003b, code lost:
            if ((r0 != null && r0.size() == 0) != false) goto L_0x003f;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object invoke(java.lang.Object r13) {
            /*
                r12 = this;
                com.tencent.mm.plugin.finder.feed.model.internal.IResponse r13 = (com.tencent.p014mm.plugin.finder.feed.model.internal.IResponse) r13
                java.lang.String r0 = "resp"
                gy3.C87412m.m108594g(r13, r0)
                com.tencent.mm.plugin.finder.lottery.history.FinderLotteryListContract$Presenter r0 = r12.f15482d
                com.tencent.mm.plugin.finder.presenter.contract.BaseFinderLotteryContract$ViewCallback r0 = r0.f15882f
                r1 = 0
                if (r0 == 0) goto L_0x0013
                com.tencent.mm.view.RefreshLoadMoreLayout r0 = r0.mo3712p()
                goto L_0x0014
            L_0x0013:
                r0 = r1
            L_0x0014:
                if (r0 != 0) goto L_0x0017
                goto L_0x001e
            L_0x0017:
                boolean r2 = r13.getHasMore()
                r0.setEnableLoadMore(r2)
            L_0x001e:
                com.tencent.mm.plugin.finder.lottery.history.FinderLotteryListContract$Presenter r0 = r12.f15482d
                com.tencent.mm.view.recyclerview.WxRecyclerAdapter r0 = r0.mo3710n()
                int r0 = r0.mo82597F4()
                r2 = 1
                r3 = 0
                if (r0 != 0) goto L_0x003e
                java.util.List r0 = r13.getIncrementList()
                if (r0 == 0) goto L_0x003a
                int r0 = r0.size()
                if (r0 != 0) goto L_0x003a
                r0 = 1
                goto L_0x003b
            L_0x003a:
                r0 = 0
            L_0x003b:
                if (r0 == 0) goto L_0x003e
                goto L_0x003f
            L_0x003e:
                r2 = 0
            L_0x003f:
                boolean r0 = r13 instanceof com.tencent.p014mm.plugin.finder.feed.model.FinderLiveLotteryListLoader.C2722b
                if (r0 == 0) goto L_0x0046
                com.tencent.mm.plugin.finder.feed.model.FinderLiveLotteryListLoader$b r13 = (com.tencent.p014mm.plugin.finder.feed.model.FinderLiveLotteryListLoader.C2722b) r13
                goto L_0x0047
            L_0x0046:
                r13 = r1
            L_0x0047:
                if (r13 == 0) goto L_0x007d
                te3.z21 r5 = r13.f13746a
                if (r5 == 0) goto L_0x007d
                com.tencent.mm.plugin.finder.lottery.history.FinderLotteryListContract$Presenter r0 = r12.f15482d
                com.tencent.mm.view.recyclerview.WxRecyclerAdapter r4 = r0.mo3710n()
                int r4 = r4.mo85796c6()
                if (r4 != 0) goto L_0x006e
                com.tencent.mm.view.recyclerview.WxRecyclerAdapter r10 = r0.mo3710n()
                cm1.d1 r11 = new cm1.d1
                java.lang.String r7 = r13.f13748c
                java.lang.String r8 = r13.f13749d
                int r9 = r13.f13750e
                r4 = r11
                r6 = r2
                r4.<init>(r5, r6, r7, r8, r9)
                r4 = 2
                jq3.C60898l.m71328U5(r10, r11, r3, r4, r1)
            L_0x006e:
                boolean r1 = r0.f15480h
                boolean r13 = r13.f13747b
                if (r1 == r13) goto L_0x007d
                r0.f15480h = r13
                com.tencent.mm.view.recyclerview.WxRecyclerAdapter r13 = r0.mo3710n()
                r13.notifyDataSetChanged()
            L_0x007d:
                if (r2 == 0) goto L_0x0089
                com.tencent.mm.plugin.finder.lottery.history.a r13 = new com.tencent.mm.plugin.finder.lottery.history.a
                com.tencent.mm.plugin.finder.presenter.contract.BaseFinderLotteryContract$ViewCallback r0 = r12.f15483e
                r13.<init>(r0)
                o40.C61926c.m72668M(r13)
            L_0x0089:
                rx3.b0 r13 = rx3.C13598b0.f38549a
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.lottery.history.FinderLotteryListContract$Presenter.C3260a.invoke(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.lottery.history.FinderLotteryListContract$Presenter$b */
    public static final class C3261b extends C23555k.C23558c {

        /* renamed from: a */
        public final HashSet<Long> f15484a = new HashSet<>();

        /* renamed from: b */
        public final /* synthetic */ FinderLotteryListContract$Presenter f15485b;

        public C3261b(FinderLotteryListContract$Presenter finderLotteryListContract$Presenter) {
            this.f15485b = finderLotteryListContract$Presenter;
        }

        /* renamed from: d */
        public boolean mo777d() {
            return true;
        }

        /* renamed from: e */
        public void mo778e(View view, List<? extends RecyclerView.C16631z> list) {
            C87412m.m108594g(view, "parent");
            C87412m.m108594g(list, "exposedHolders");
            FinderLotteryListContract$Presenter finderLotteryListContract$Presenter = this.f15485b;
            for (RecyclerView.C16631z zVar : list) {
                if (zVar instanceof C60905o) {
                    Object obj = ((C60905o) zVar).f173503E;
                    if (obj instanceof C0718c1) {
                        C0718c1 c1Var = (C0718c1) obj;
                        if (!this.f15484a.contains(Long.valueOf((long) c1Var.hashCode()))) {
                            C58363h hVar = C58363h.f167137a;
                            C58363h.C58364b bVar = C58363h.f167143g;
                            String O5 = C66785b.f191882e.mo90662O5();
                            String str = c1Var.f1725d.f143824d;
                            if (str == null) {
                                str = "";
                            }
                            bVar.mo83123c(O5, str, "");
                            BaseFinderLotteryContract.ViewCallback viewCallback = finderLotteryListContract$Presenter.f15882f;
                            C87412m.m108591d(viewCallback);
                            C60172g4 gr02 = ((C64916p1) C86312j.m106911c(C64916p1.class)).gr0(viewCallback.f15885d);
                            C58363h.C58364b.m67609b(bVar, gr02 != null ? gr02.mo12861q3() : null, 4, (Long) null, 4, (Object) null);
                            this.f15484a.add(Long.valueOf((long) c1Var.hashCode()));
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderLotteryListContract$Presenter(FinderLiveLotteryListLoader finderLiveLotteryListLoader) {
        super(finderLiveLotteryListLoader);
        C87412m.m108594g(finderLiveLotteryListLoader, "loader");
        boolean z = true;
        C45795b.C32059a aVar = C45795b.f123697j;
        C45795b bVar = C45795b.f123698n;
        this.f15481i = (bVar == null || !((C54991o) bVar.mo71262a(C54991o.class)).f154190D) ? false : z;
    }

    /* renamed from: e */
    public WxRecyclerAdapter<C0740i2> mo3455e() {
        return new WxRecyclerAdapter<>(new FinderLotteryListContract$Presenter$generateAdapter$1(this), this.f15880d.getDataListJustForAdapter(), false);
    }

    /* renamed from: q */
    public void mo3456q(BaseFinderLotteryContract.ViewCallback viewCallback) {
        RecyclerView recyclerView;
        C87412m.m108594g(viewCallback, "callback");
        super.mo3456q(viewCallback);
        BaseFeedLoader<C0740i2> baseFeedLoader = this.f15880d;
        FinderLiveLotteryListLoader finderLiveLotteryListLoader = baseFeedLoader instanceof FinderLiveLotteryListLoader ? (FinderLiveLotteryListLoader) baseFeedLoader : null;
        if (finderLiveLotteryListLoader != null) {
            finderLiveLotteryListLoader.f13744i = new C3260a(this, viewCallback);
        }
        BaseFinderLotteryContract.ViewCallback viewCallback2 = this.f15882f;
        if (viewCallback2 != null && (recyclerView = viewCallback2.mo3712p().getRecyclerView()) != null) {
            C23564m.m28137g(recyclerView, new C3261b(this));
        }
    }
}
