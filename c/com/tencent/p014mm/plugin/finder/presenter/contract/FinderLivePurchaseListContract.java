package com.tencent.p014mm.plugin.finder.presenter.contract;

import android.content.Context;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import bl3.C39818r;
import cm1.C0740i2;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.finder.feed.model.internal.BaseFeedLoader;
import com.tencent.p014mm.plugin.finder.live.loader.FinderLivePurchaseContentListLoader;
import com.tencent.p014mm.sdk.platformtools.WeChatBrands;
import com.tencent.p014mm.view.RefreshLoadMoreLayout;
import com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter;
import com.tencent.p014mm.view.recyclerview.WxRecyclerView;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import dp1.C7435f2;
import fo1.C59264a;
import gy3.C87412m;
import kotlin.Metadata;
import org.json.JSONObject;
import rs1.C13442s8;
import zp3.C16389w;
import zp3.C23564m;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/presenter/contract/FinderLivePurchaseListContract;", "", "<init>", "()V", "PurchaseListPresenter", "PurchaseListViewCallback", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.presenter.contract.FinderLivePurchaseListContract */
public final class FinderLivePurchaseListContract {

    /* renamed from: a */
    public static final FinderLivePurchaseListContract f16063a = new FinderLivePurchaseListContract();

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/presenter/contract/FinderLivePurchaseListContract$PurchaseListPresenter;", "Lfo1/a;", "Lcom/tencent/mm/plugin/finder/presenter/contract/FinderLivePurchaseListContract$PurchaseListViewCallback;", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    /* renamed from: com.tencent.mm.plugin.finder.presenter.contract.FinderLivePurchaseListContract$PurchaseListPresenter */
    public static final class PurchaseListPresenter implements C59264a<PurchaseListViewCallback> {

        /* renamed from: d */
        public final BaseFeedLoader<C0740i2> f16064d;

        /* renamed from: e */
        public PurchaseListViewCallback f16065e;

        /* renamed from: f */
        public WxRecyclerAdapter<C0740i2> f16066f;

        /* renamed from: g */
        public int f16067g = 1;

        public PurchaseListPresenter(BaseFeedLoader<C0740i2> baseFeedLoader) {
            C87412m.m108594g(baseFeedLoader, "loader");
            this.f16064d = baseFeedLoader;
        }

        /* renamed from: e */
        public final WxRecyclerAdapter<C0740i2> mo3754e() {
            WxRecyclerAdapter<C0740i2> wxRecyclerAdapter = this.f16066f;
            if (wxRecyclerAdapter != null) {
                return wxRecyclerAdapter;
            }
            C87412m.m108603p("adapter");
            throw null;
        }

        /* renamed from: n */
        public final PurchaseListViewCallback mo3755n() {
            PurchaseListViewCallback purchaseListViewCallback = this.f16065e;
            if (purchaseListViewCallback != null) {
                return purchaseListViewCallback;
            }
            C87412m.m108603p("viewCallback");
            throw null;
        }

        public void onDetach() {
            this.f16064d.unregister(mo3755n().f16075h);
        }

        /* renamed from: q */
        public void mo3756q(PurchaseListViewCallback purchaseListViewCallback) {
            C87412m.m108594g(purchaseListViewCallback, "callback");
            this.f16065e = purchaseListViewCallback;
            WxRecyclerAdapter<C0740i2> wxRecyclerAdapter = new WxRecyclerAdapter<>(new FinderLivePurchaseListContract$PurchaseListPresenter$onAttach$1(), this.f16064d.getDataListJustForAdapter(), false);
            wxRecyclerAdapter.f173488o = new C3413xe4d4f8bb(this);
            this.f16066f = wxRecyclerAdapter;
            WxRecyclerView wxRecyclerView = purchaseListViewCallback.f16072e;
            wxRecyclerView.setLayoutManager(new LinearLayoutManager(wxRecyclerView.getRootView().getContext()));
            wxRecyclerView.setAdapter(purchaseListViewCallback.f16069b.mo3754e());
            wxRecyclerView.mo17085h0(new C3414x13184fe9(purchaseListViewCallback));
            C23564m.m28137g(wxRecyclerView, new C3415x13184fea());
            purchaseListViewCallback.f16071d.setActionCallback(new C3416x702b725d(purchaseListViewCallback));
            purchaseListViewCallback.mo3757a(true);
            purchaseListViewCallback.f16070c.postDelayed(new C3418x702b725e(purchaseListViewCallback), 300);
            BaseFeedLoader<C0740i2> baseFeedLoader = this.f16064d;
            C87412m.m108592e(baseFeedLoader, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.live.loader.FinderLivePurchaseContentListLoader");
            ((FinderLivePurchaseContentListLoader) baseFeedLoader).f15075e = new FinderLivePurchaseListContract$PurchaseListPresenter$onAttach$3(this);
            this.f16064d.register(mo3755n().f16075h);
        }
    }

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/presenter/contract/FinderLivePurchaseListContract$PurchaseListViewCallback;", "", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    /* renamed from: com.tencent.mm.plugin.finder.presenter.contract.FinderLivePurchaseListContract$PurchaseListViewCallback */
    public static final class PurchaseListViewCallback {

        /* renamed from: a */
        public final MMActivity f16068a;

        /* renamed from: b */
        public final PurchaseListPresenter f16069b;

        /* renamed from: c */
        public final View f16070c;

        /* renamed from: d */
        public RefreshLoadMoreLayout f16071d;

        /* renamed from: e */
        public WxRecyclerView f16072e;

        /* renamed from: f */
        public ProgressBar f16073f;

        /* renamed from: g */
        public TextView f16074g;

        /* renamed from: h */
        public C16389w f16075h = new C3419xed6b735(this);

        public PurchaseListViewCallback(MMActivity mMActivity, PurchaseListPresenter purchaseListPresenter, View view) {
            C87412m.m108594g(mMActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
            C87412m.m108594g(purchaseListPresenter, "presenter");
            C87412m.m108594g(view, "rootView");
            this.f16068a = mMActivity;
            this.f16069b = purchaseListPresenter;
            this.f16070c = view;
            this.f16071d = (RefreshLoadMoreLayout) view.findViewById(C0966R.C0970id.dxy);
            this.f16072e = (WxRecyclerView) view.findViewById(C0966R.C0970id.dxx);
            this.f16073f = (ProgressBar) view.findViewById(C0966R.C0970id.i8s);
            this.f16074g = (TextView) view.findViewById(C0966R.C0970id.cj7);
        }

        /* renamed from: a */
        public final void mo3757a(boolean z) {
            this.f16073f.setVisibility(z ? 0 : 8);
        }
    }

    private FinderLivePurchaseListContract() {
    }

    /* renamed from: a */
    public static void m3516a(FinderLivePurchaseListContract finderLivePurchaseListContract, Context context, String str, boolean z, int i, Long l, Long l2, int i2, Object obj) {
        if ((i2 & 16) != 0) {
            l = -1L;
        }
        if ((i2 & 32) != 0) {
            l2 = -1L;
        }
        finderLivePurchaseListContract.getClass();
        C87412m.m108594g(context, "context");
        C87412m.m108594g(str, "itemType");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("card_type", str);
        if (C87412m.m108589b(str, "course")) {
            jSONObject.put("product_id", l);
        } else if (C87412m.m108589b(str, WeChatBrands.Business.GROUP_LIVE)) {
            jSONObject.put("live_id", l2);
        }
        jSONObject.put(TPReportKeys.Common.COMMON_SEQ, i);
        C7435f2.f25626a.mo8580d(((C13442s8) C39818r.f106831a.mo62443b(context).mo75002a(C13442s8.class)).mo12861q3(), "paid_content_card", z, jSONObject);
    }
}
