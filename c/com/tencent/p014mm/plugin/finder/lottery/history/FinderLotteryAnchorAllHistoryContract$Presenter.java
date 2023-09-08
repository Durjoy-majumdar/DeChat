package com.tencent.p014mm.plugin.finder.lottery.history;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import bl3.C39818r;
import cm1.C0713b1;
import cm1.C0740i2;
import cm1.C0798z0;
import com.tencent.p014mm.plugin.finder.feed.model.C2780c;
import com.tencent.p014mm.plugin.finder.feed.model.FinderLiveLotteryAnchorAllHistoryLoader;
import com.tencent.p014mm.plugin.finder.feed.model.internal.BaseFeedLoader;
import com.tencent.p014mm.plugin.finder.feed.model.internal.IResponse;
import com.tencent.p014mm.plugin.finder.presenter.contract.BaseFinderLotteryContract;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.view.RefreshLoadMoreLayout;
import com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter;
import di3.C7335d;
import di3.C86312j;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import ht1.C60172g4;
import java.util.LinkedList;
import jq3.C60898l;
import jq3.C60905o;
import pe3.C89349b;
import rx3.C13598b0;
import te3.C49088d31;
import tf0.C13883o1;
import tf0.C64916p1;
import zc1.C66785b;

/* renamed from: com.tencent.mm.plugin.finder.lottery.history.FinderLotteryAnchorAllHistoryContract$Presenter */
public final class FinderLotteryAnchorAllHistoryContract$Presenter extends BaseFinderLotteryContract.Presenter {

    /* renamed from: h */
    public final int f15467h;

    /* renamed from: com.tencent.mm.plugin.finder.lottery.history.FinderLotteryAnchorAllHistoryContract$Presenter$a */
    public static final class C3255a implements C60898l.C9502b<C60905o> {

        /* renamed from: d */
        public final /* synthetic */ FinderLotteryAnchorAllHistoryContract$Presenter f15468d;

        public C3255a(FinderLotteryAnchorAllHistoryContract$Presenter finderLotteryAnchorAllHistoryContract$Presenter) {
            this.f15468d = finderLotteryAnchorAllHistoryContract$Presenter;
        }

        /* renamed from: q */
        public void mo734q(RecyclerView.C16613e eVar, View view, int i, RecyclerView.C16631z zVar) {
            C60905o oVar = (C60905o) zVar;
            C87412m.m108594g(eVar, "adapter");
            C87412m.m108594g(view, "view");
            C87412m.m108594g(oVar, "holder");
            C0713b1 b1Var = (C0713b1) oVar.f173503E;
            Intent intent = new Intent();
            C0798z0.C0799a aVar = C0798z0.f1856g;
            C49088d31 d312 = b1Var.f1710d;
            LinkedList<C0798z0> a = aVar.mo733a(d312.f132096p, d312);
            C7335d c = C86312j.m106911c(C64916p1.class);
            C87412m.m108593f(c, "getService(IFinderCommon…atureService::class.java)");
            ((C64916p1) c).Ve0(0, a, (C89349b) null, intent, (C2780c) null);
            intent.putExtra("KEY_LOTTERY_HISTORY_SCENE", this.f15468d.f15467h);
            intent.putExtra("KEY_LOTTERY_HISTORY_LIVE_ID", b1Var.f1710d.f132089f);
            intent.putExtra("KEY_LOTTERY_HISTORY_OBJECT_ID", b1Var.f1710d.f132090g);
            intent.putExtra("KEY_LOTTERY_HISTORY_OBJECT_NONCE_ID", b1Var.f1710d.f132091h);
            intent.putExtra("KEY_LIVE_ANCHOR_USERNAME", C66785b.f191882e.mo90662O5());
            intent.putExtra("KEY_SHOW_SETTING_TITLE", true);
            C39818r rVar = C39818r.f106831a;
            Context context = oVar.f173499A;
            C87412m.m108593f(context, "holder.context");
            Context context2 = oVar.f173499A;
            C87412m.m108593f(context2, "holder.context");
            ((C60172g4) rVar.mo62443b(context).mo62447c(C60172g4.class)).mo12860p3(context2, intent, 0, (String) null, 0, 0, false);
            C7335d c2 = C86312j.m106911c(C13883o1.class);
            C87412m.m108593f(c2, "getService(IActivityRouter::class.java)");
            Context context3 = view.getContext();
            C87412m.m108592e(context3, "null cannot be cast to non-null type android.app.Activity");
            ((C13883o1) c2).mo13295yB((Activity) context3, intent, false);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.lottery.history.FinderLotteryAnchorAllHistoryContract$Presenter$b */
    public static final class C3256b extends C87413o implements C32226l<IResponse<C0740i2>, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ FinderLotteryAnchorAllHistoryContract$Presenter f15469d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3256b(FinderLotteryAnchorAllHistoryContract$Presenter finderLotteryAnchorAllHistoryContract$Presenter) {
            super(1);
            this.f15469d = finderLotteryAnchorAllHistoryContract$Presenter;
        }

        public Object invoke(Object obj) {
            IResponse iResponse = (IResponse) obj;
            C87412m.m108594g(iResponse, LocaleUtil.ITALIAN);
            BaseFinderLotteryContract.ViewCallback viewCallback = this.f15469d.f15882f;
            RefreshLoadMoreLayout p = viewCallback != null ? viewCallback.mo3712p() : null;
            if (p != null) {
                p.setEnableLoadMore(iResponse.getHasMore());
            }
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderLotteryAnchorAllHistoryContract$Presenter(FinderLiveLotteryAnchorAllHistoryLoader finderLiveLotteryAnchorAllHistoryLoader, int i) {
        super(finderLiveLotteryAnchorAllHistoryLoader);
        C87412m.m108594g(finderLiveLotteryAnchorAllHistoryLoader, "loader");
        this.f15467h = i;
    }

    /* renamed from: e */
    public WxRecyclerAdapter<C0740i2> mo3455e() {
        WxRecyclerAdapter<C0740i2> wxRecyclerAdapter = new WxRecyclerAdapter<>(new C3257x6c118ba4(), this.f15880d.getDataListJustForAdapter(), false);
        wxRecyclerAdapter.f173488o = new C3255a(this);
        return wxRecyclerAdapter;
    }

    /* renamed from: q */
    public void mo3456q(BaseFinderLotteryContract.ViewCallback viewCallback) {
        C87412m.m108594g(viewCallback, "callback");
        super.mo3456q(viewCallback);
        BaseFeedLoader<C0740i2> baseFeedLoader = this.f15880d;
        FinderLiveLotteryAnchorAllHistoryLoader finderLiveLotteryAnchorAllHistoryLoader = baseFeedLoader instanceof FinderLiveLotteryAnchorAllHistoryLoader ? (FinderLiveLotteryAnchorAllHistoryLoader) baseFeedLoader : null;
        if (finderLiveLotteryAnchorAllHistoryLoader != null) {
            finderLiveLotteryAnchorAllHistoryLoader.f13725h = new C3256b(this);
        }
    }
}
