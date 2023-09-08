package com.tencent.p014mm.plugin.finder.presenter.contract;

import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import cm1.C0740i2;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.MMFragmentActivity;
import com.tencent.p014mm.plugin.finder.feed.model.FinderLiveWecoinHotLoader;
import com.tencent.p014mm.view.RefreshLoadMoreLayout;
import com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import fo1.C59264a;
import fo1.C8178c;
import gy3.C8480h;
import gy3.C87412m;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import kotlin.Metadata;
import zp3.C16389w;

@Metadata(mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0005"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/presenter/contract/FinderLiveChargeIncomeContract;", "", "()V", "Presenter", "ViewCallback", "plugin-finder-live_release"}, mo182095k = 1, mo182096mv = {1, 7, 1}, mo182098xi = 48)
/* renamed from: com.tencent.mm.plugin.finder.presenter.contract.FinderLiveChargeIncomeContract */
public final class FinderLiveChargeIncomeContract {

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/presenter/contract/FinderLiveChargeIncomeContract$Presenter;", "Lfo1/a;", "Lcom/tencent/mm/plugin/finder/presenter/contract/FinderLiveChargeIncomeContract$ViewCallback;", "Companion", "plugin-finder-live_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    /* renamed from: com.tencent.mm.plugin.finder.presenter.contract.FinderLiveChargeIncomeContract$Presenter */
    public static final class Presenter implements C59264a<ViewCallback> {

        /* renamed from: d */
        public final FinderLiveWecoinHotLoader f16047d;

        /* renamed from: e */
        public WxRecyclerAdapter<C0740i2> f16048e;

        /* renamed from: f */
        public ViewCallback f16049f;

        /* renamed from: g */
        public C16389w f16050g = new C16389w() {
            public void onChanged() {
            }

            public void onItemRangeChanged(int i, int i2) {
            }

            public void onItemRangeChanged(int i, int i2, Object obj) {
            }

            public void onItemRangeInserted(int i, int i2) {
            }

            public void onItemRangeMoved(int i, int i2, int i3) {
            }

            public void onItemRangeRemoved(int i, int i2) {
            }

            public void onPreFinishLoadMore(RefreshLoadMoreLayout.C7080c<Object> cVar) {
                C87412m.m108594g(cVar, TPReportKeys.PlayerStep.PLAYER_REASON);
            }

            public void onPreFinishLoadMoreSmooth(RefreshLoadMoreLayout.C7080c<Object> cVar) {
                C87412m.m108594g(cVar, TPReportKeys.PlayerStep.PLAYER_REASON);
            }

            public void onPreFinishRefresh(RefreshLoadMoreLayout.C7080c<Object> cVar) {
                C87412m.m108594g(cVar, TPReportKeys.PlayerStep.PLAYER_REASON);
            }
        };

        @Metadata(mo182093d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/presenter/contract/FinderLiveChargeIncomeContract$Presenter$Companion;", "", "()V", "TAG", "", "plugin-finder-live_release"}, mo182095k = 1, mo182096mv = {1, 7, 1}, mo182098xi = 48)
        /* renamed from: com.tencent.mm.plugin.finder.presenter.contract.FinderLiveChargeIncomeContract$Presenter$Companion */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(C8480h hVar) {
                this();
            }
        }

        static {
            new Companion((C8480h) null);
        }

        public Presenter(FinderLiveWecoinHotLoader finderLiveWecoinHotLoader) {
            C87412m.m108594g(finderLiveWecoinHotLoader, "loader");
            this.f16047d = finderLiveWecoinHotLoader;
        }

        /* renamed from: e */
        public void mo3751e(ViewCallback viewCallback) {
            C87412m.m108594g(viewCallback, "callback");
            this.f16048e = new WxRecyclerAdapter<>(new FinderLiveChargeIncomeContract$Presenter$onAttach$1(), this.f16047d.getDataListJustForAdapter(), false);
            this.f16047d.f13758i = new FinderLiveChargeIncomeContract$Presenter$onAttach$3(this);
            this.f16049f = viewCallback;
            View findViewById = viewCallback.f16051d.findViewById(C0966R.C0970id.djf);
            C87412m.m108593f(findViewById, "activity.findViewById(R.…_charge_income_top_group)");
            viewCallback.f16054g = (RelativeLayout) findViewById;
            View findViewById2 = viewCallback.f16051d.findViewById(C0966R.C0970id.dje);
            C87412m.m108593f(findViewById2, "activity.findViewById(R.…rge_income_top_back_icon)");
            viewCallback.f16055h = findViewById2;
            View findViewById3 = viewCallback.f16051d.findViewById(C0966R.C0970id.djd);
            C87412m.m108593f(findViewById3, "activity.findViewById(R.…rge_income_top_action_tv)");
            viewCallback.f16056i = (TextView) findViewById3;
            View findViewById4 = viewCallback.f16051d.findViewById(C0966R.C0970id.djj);
            C87412m.m108593f(findViewById4, "activity.findViewById(R.…ve_charge_user_amount_tv)");
            viewCallback.f16057j = (TextView) findViewById4;
            View findViewById5 = viewCallback.f16051d.findViewById(C0966R.C0970id.azq);
            C87412m.m108593f(findViewById5, "activity.findViewById(R.…harge_income_heat_amount)");
            viewCallback.f16058n = (TextView) findViewById5;
            View findViewById6 = viewCallback.f16051d.findViewById(C0966R.C0970id.dja);
            C87412m.m108593f(findViewById6, "activity.findViewById(R.…ve_charge_income_loading)");
            viewCallback.f16059o = findViewById6;
            View findViewById7 = viewCallback.f16051d.findViewById(C0966R.C0970id.dj_);
            C87412m.m108593f(findViewById7, "activity.findViewById(R.…_live_charge_income_list)");
            RecyclerView recyclerView = (RecyclerView) findViewById7;
            viewCallback.f16053f = recyclerView;
            recyclerView.setLayoutManager(new LinearLayoutManager(viewCallback.f16051d));
            RecyclerView recyclerView2 = viewCallback.f16053f;
            if (recyclerView2 != null) {
                WxRecyclerAdapter<C0740i2> wxRecyclerAdapter = viewCallback.f16052e.f16048e;
                if (wxRecyclerAdapter != null) {
                    recyclerView2.setAdapter(wxRecyclerAdapter);
                    RelativeLayout relativeLayout = viewCallback.f16054g;
                    if (relativeLayout != null) {
                        ViewGroup.LayoutParams layoutParams = relativeLayout.getLayoutParams();
                        C87412m.m108592e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                        ((ViewGroup.MarginLayoutParams) layoutParams).topMargin += C75044y4.m89994f(viewCallback.f16051d);
                        View view = viewCallback.f16055h;
                        if (view != null) {
                            view.setOnClickListener(new FinderLiveChargeIncomeContract$ViewCallback$initView$1(viewCallback));
                            TextView textView = viewCallback.f16056i;
                            if (textView != null) {
                                textView.setOnClickListener(new FinderLiveChargeIncomeContract$ViewCallback$initView$2(viewCallback));
                                Presenter presenter = viewCallback.f16052e;
                                presenter.f16047d.requestRefresh();
                                ViewCallback viewCallback2 = presenter.f16049f;
                                if (viewCallback2 != null) {
                                    View view2 = viewCallback2.f16059o;
                                    if (view2 != null) {
                                        C9556a aVar = new C9556a();
                                        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                                        aVar.mo10233c(0);
                                        View view3 = view2;
                                        C117292a.m165358d(view3, aVar.mo10232b(), "com/tencent/mm/plugin/finder/presenter/contract/FinderLiveChargeIncomeContract$ViewCallback", "showProgress", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                        view2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                                        C117292a.m165359e(view3, "com/tencent/mm/plugin/finder/presenter/contract/FinderLiveChargeIncomeContract$ViewCallback", "showProgress", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                    } else {
                                        C87412m.m108603p("loadingView");
                                        throw null;
                                    }
                                }
                                this.f16047d.register(this.f16050g);
                                return;
                            }
                            C87412m.m108603p("topActionTv");
                            throw null;
                        }
                        C87412m.m108603p("topBackBtn");
                        throw null;
                    }
                    C87412m.m108603p("topGroup");
                    throw null;
                }
                C87412m.m108603p("adapter");
                throw null;
            }
            C87412m.m108603p("chargeCustomerRecyclerView");
            throw null;
        }

        public void onDetach() {
            this.f16047d.unregister(this.f16050g);
        }
    }

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/presenter/contract/FinderLiveChargeIncomeContract$ViewCallback;", "Lfo1/c;", "Lcom/tencent/mm/plugin/finder/presenter/contract/FinderLiveChargeIncomeContract$Presenter;", "plugin-finder-live_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    /* renamed from: com.tencent.mm.plugin.finder.presenter.contract.FinderLiveChargeIncomeContract$ViewCallback */
    public static final class ViewCallback implements C8178c<Presenter> {

        /* renamed from: d */
        public final MMActivity f16051d;

        /* renamed from: e */
        public final Presenter f16052e;

        /* renamed from: f */
        public RecyclerView f16053f;

        /* renamed from: g */
        public RelativeLayout f16054g;

        /* renamed from: h */
        public View f16055h;

        /* renamed from: i */
        public TextView f16056i;

        /* renamed from: j */
        public TextView f16057j;

        /* renamed from: n */
        public TextView f16058n;

        /* renamed from: o */
        public View f16059o;

        public ViewCallback(MMActivity mMActivity, Presenter presenter) {
            C87412m.m108594g(mMActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
            C87412m.m108594g(presenter, "presenter");
            this.f16051d = mMActivity;
            this.f16052e = presenter;
        }

        public MMFragmentActivity getActivity() {
            return this.f16051d;
        }
    }

    static {
        new FinderLiveChargeIncomeContract();
    }

    private FinderLiveChargeIncomeContract() {
    }
}
