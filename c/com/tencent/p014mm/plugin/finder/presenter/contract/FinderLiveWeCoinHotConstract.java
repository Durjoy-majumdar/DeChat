package com.tencent.p014mm.plugin.finder.presenter.contract;

import android.content.Context;
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
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.plugin.finder.feed.model.FinderLiveWecoinHotLoader;
import com.tencent.p014mm.plugin.finder.live.widget.FinderLiveMemebrProfileWidget;
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
import ok1.C11471u;
import qj1.C62660c;
import zp3.C16389w;

@Metadata(mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0005"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/presenter/contract/FinderLiveWeCoinHotConstract;", "", "()V", "Presenter", "ViewCallback", "plugin-finder-live_release"}, mo182095k = 1, mo182096mv = {1, 7, 1}, mo182098xi = 48)
/* renamed from: com.tencent.mm.plugin.finder.presenter.contract.FinderLiveWeCoinHotConstract */
public final class FinderLiveWeCoinHotConstract {

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/presenter/contract/FinderLiveWeCoinHotConstract$Presenter;", "Lfo1/a;", "Lcom/tencent/mm/plugin/finder/presenter/contract/FinderLiveWeCoinHotConstract$ViewCallback;", "Companion", "plugin-finder-live_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    /* renamed from: com.tencent.mm.plugin.finder.presenter.contract.FinderLiveWeCoinHotConstract$Presenter */
    public static final class Presenter implements C59264a<ViewCallback> {

        /* renamed from: d */
        public final FinderLiveWecoinHotLoader f16085d;

        /* renamed from: e */
        public WxRecyclerAdapter<C0740i2> f16086e;

        /* renamed from: f */
        public ViewCallback f16087f;

        /* renamed from: g */
        public C16389w f16088g = new C16389w() {
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

        @Metadata(mo182093d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/presenter/contract/FinderLiveWeCoinHotConstract$Presenter$Companion;", "", "()V", "TAG", "", "plugin-finder-live_release"}, mo182095k = 1, mo182096mv = {1, 7, 1}, mo182098xi = 48)
        /* renamed from: com.tencent.mm.plugin.finder.presenter.contract.FinderLiveWeCoinHotConstract$Presenter$Companion */
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
            this.f16085d = finderLiveWecoinHotLoader;
        }

        /* renamed from: e */
        public void mo3760e(ViewCallback viewCallback) {
            C87412m.m108594g(viewCallback, "callback");
            WxRecyclerAdapter<C0740i2> wxRecyclerAdapter = new WxRecyclerAdapter<>(new FinderLiveWeCoinHotConstract$Presenter$onAttach$1(), this.f16085d.getDataListJustForAdapter(), false);
            wxRecyclerAdapter.f173488o = new FinderLiveWeCoinHotConstract$Presenter$onAttach$2$1(this);
            this.f16086e = wxRecyclerAdapter;
            this.f16085d.f13758i = new FinderLiveWeCoinHotConstract$Presenter$onAttach$3(this);
            this.f16087f = viewCallback;
            View findViewById = viewCallback.f16089d.findViewById(C0966R.C0970id.e2h);
            C87412m.m108593f(findViewById, "activity.findViewById(R.…ive_wecoin_hot_top_group)");
            viewCallback.f16092g = (RelativeLayout) findViewById;
            View findViewById2 = viewCallback.f16089d.findViewById(C0966R.C0970id.e2g);
            C87412m.m108593f(findViewById2, "activity.findViewById(R.…wecoin_hot_top_back_icon)");
            viewCallback.f16093h = findViewById2;
            View findViewById3 = viewCallback.f16089d.findViewById(C0966R.C0970id.e2f);
            C87412m.m108593f(findViewById3, "activity.findViewById(R.…wecoin_hot_top_action_tv)");
            viewCallback.f16094i = (TextView) findViewById3;
            View findViewById4 = viewCallback.f16089d.findViewById(C0966R.C0970id.e2c);
            C87412m.m108593f(findViewById4, "activity.findViewById(R.…e_wecoin_hot_title_group)");
            viewCallback.f16095j = (RelativeLayout) findViewById4;
            View findViewById5 = viewCallback.f16089d.findViewById(C0966R.C0970id.e2e);
            C87412m.m108593f(findViewById5, "activity.findViewById(R.…live_wecoin_hot_title_tv)");
            TextView textView = (TextView) findViewById5;
            View findViewById6 = viewCallback.f16089d.findViewById(C0966R.C0970id.e2d);
            C87412m.m108593f(findViewById6, "activity.findViewById(R.…ve_wecoin_hot_title_icon)");
            viewCallback.f16096n = (WeImageView) findViewById6;
            View findViewById7 = viewCallback.f16089d.findViewById(C0966R.C0970id.e2b);
            C87412m.m108593f(findViewById7, "activity.findViewById(R.…coin_hot_title_amount_tv)");
            viewCallback.f16097o = (TextView) findViewById7;
            View findViewById8 = viewCallback.f16089d.findViewById(C0966R.C0970id.f358247e21);
            C87412m.m108593f(findViewById8, "activity.findViewById(R.…ive_wecoin_hot_empty_tip)");
            viewCallback.f16098p = (TextView) findViewById8;
            View findViewById9 = viewCallback.f16089d.findViewById(C0966R.C0970id.e29);
            C87412m.m108593f(findViewById9, "activity.findViewById(R.…_live_wecoin_hot_loading)");
            viewCallback.f16099q = findViewById9;
            View findViewById10 = viewCallback.f16089d.findViewById(C0966R.C0970id.e28);
            C87412m.m108593f(findViewById10, "activity.findViewById(R.…der_live_wecoin_hot_list)");
            viewCallback.f16091f = (RecyclerView) findViewById10;
            viewCallback.mo3761p().setLayoutManager(new LinearLayoutManager(viewCallback.f16089d));
            RecyclerView p = viewCallback.mo3761p();
            WxRecyclerAdapter<C0740i2> wxRecyclerAdapter2 = viewCallback.f16090e.f16086e;
            if (wxRecyclerAdapter2 != null) {
                p.setAdapter(wxRecyclerAdapter2);
                RelativeLayout relativeLayout = viewCallback.f16095j;
                if (relativeLayout != null) {
                    relativeLayout.setVisibility(8);
                    viewCallback.mo3761p().setVisibility(8);
                    TextView textView2 = viewCallback.f16098p;
                    if (textView2 != null) {
                        textView2.setVisibility(8);
                        View view = viewCallback.f16099q;
                        if (view != null) {
                            C9556a aVar = new C9556a();
                            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                            aVar.mo10233c(8);
                            View view2 = view;
                            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/presenter/contract/FinderLiveWeCoinHotConstract$ViewCallback", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                            C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/presenter/contract/FinderLiveWeCoinHotConstract$ViewCallback", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            WeImageView weImageView = viewCallback.f16096n;
                            if (weImageView != null) {
                                weImageView.setOnClickListener(new FinderLiveWeCoinHotConstract$ViewCallback$initView$1(viewCallback));
                                RelativeLayout relativeLayout2 = viewCallback.f16092g;
                                if (relativeLayout2 != null) {
                                    ViewGroup.LayoutParams layoutParams = relativeLayout2.getLayoutParams();
                                    C87412m.m108592e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                                    ((ViewGroup.MarginLayoutParams) layoutParams).topMargin += C75044y4.m89994f(viewCallback.f16089d);
                                    View view3 = viewCallback.f16093h;
                                    if (view3 != null) {
                                        view3.setOnClickListener(new FinderLiveWeCoinHotConstract$ViewCallback$initView$2(viewCallback));
                                        TextView textView3 = viewCallback.f16094i;
                                        if (textView3 != null) {
                                            textView3.setOnClickListener(new FinderLiveWeCoinHotConstract$ViewCallback$initView$3(viewCallback));
                                            Context context = ((ViewGroup) viewCallback.f16089d.findViewById(C0966R.C0970id.n05)).getContext();
                                            C87412m.m108593f(context, "activity.findViewById<Vi…ile_ui_root_stub).context");
                                            FinderLiveMemebrProfileWidget finderLiveMemebrProfileWidget = new FinderLiveMemebrProfileWidget(context, (C62660c) null, (C11471u.C11473b) null, 6, (C8480h) null);
                                            viewCallback.f16100r = finderLiveMemebrProfileWidget;
                                            finderLiveMemebrProfileWidget.mo3432q();
                                            finderLiveMemebrProfileWidget.f15410o = new FinderLiveWeCoinHotConstract$ViewCallback$initView$4$1(viewCallback, finderLiveMemebrProfileWidget);
                                            viewCallback.f16090e.f16085d.requestRefresh();
                                            this.f16085d.register(this.f16088g);
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
                            C87412m.m108603p("titleIv");
                            throw null;
                        }
                        C87412m.m108603p("loadingView");
                        throw null;
                    }
                    C87412m.m108603p("emptyTv");
                    throw null;
                }
                C87412m.m108603p("titleGroup");
                throw null;
            }
            C87412m.m108603p("adapter");
            throw null;
        }

        public void onDetach() {
            FinderLiveMemebrProfileWidget finderLiveMemebrProfileWidget;
            this.f16085d.unregister(this.f16088g);
            ViewCallback viewCallback = this.f16087f;
            if (viewCallback != null && (finderLiveMemebrProfileWidget = viewCallback.f16100r) != null) {
                finderLiveMemebrProfileWidget.mo3433r();
            }
        }
    }

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/presenter/contract/FinderLiveWeCoinHotConstract$ViewCallback;", "Lfo1/c;", "Lcom/tencent/mm/plugin/finder/presenter/contract/FinderLiveWeCoinHotConstract$Presenter;", "plugin-finder-live_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    /* renamed from: com.tencent.mm.plugin.finder.presenter.contract.FinderLiveWeCoinHotConstract$ViewCallback */
    public static final class ViewCallback implements C8178c<Presenter> {

        /* renamed from: d */
        public final MMActivity f16089d;

        /* renamed from: e */
        public final Presenter f16090e;

        /* renamed from: f */
        public RecyclerView f16091f;

        /* renamed from: g */
        public RelativeLayout f16092g;

        /* renamed from: h */
        public View f16093h;

        /* renamed from: i */
        public TextView f16094i;

        /* renamed from: j */
        public RelativeLayout f16095j;

        /* renamed from: n */
        public WeImageView f16096n;

        /* renamed from: o */
        public TextView f16097o;

        /* renamed from: p */
        public TextView f16098p;

        /* renamed from: q */
        public View f16099q;

        /* renamed from: r */
        public FinderLiveMemebrProfileWidget f16100r;

        public ViewCallback(MMActivity mMActivity, Presenter presenter) {
            C87412m.m108594g(mMActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
            C87412m.m108594g(presenter, "presenter");
            this.f16089d = mMActivity;
            this.f16090e = presenter;
        }

        public MMFragmentActivity getActivity() {
            return this.f16089d;
        }

        /* renamed from: p */
        public final RecyclerView mo3761p() {
            RecyclerView recyclerView = this.f16091f;
            if (recyclerView != null) {
                return recyclerView;
            }
            C87412m.m108603p("wecoinRecyclerView");
            throw null;
        }
    }

    static {
        new FinderLiveWeCoinHotConstract();
    }

    private FinderLiveWeCoinHotConstract() {
    }
}
