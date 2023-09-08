package com.tencent.p014mm.plugin.finder.presenter.contract;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import cm1.C0740i2;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.MMFragmentActivity;
import com.tencent.p014mm.plugin.finder.feed.model.internal.BaseFeedLoader;
import com.tencent.p014mm.view.RefreshLoadMoreLayout;
import com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import di3.C86312j;
import fo1.C59264a;
import fo1.C8178c;
import gy3.C8480h;
import gy3.C87412m;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import kotlin.Metadata;
import l31.C61212e;
import o40.C61926c;
import rl1.C13064o0;
import zp3.C16389w;

@Metadata(mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0005"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/presenter/contract/BaseFinderLotteryContract;", "", "()V", "Presenter", "ViewCallback", "plugin-finder-live_release"}, mo182095k = 1, mo182096mv = {1, 7, 1}, mo182098xi = 48)
/* renamed from: com.tencent.mm.plugin.finder.presenter.contract.BaseFinderLotteryContract */
public final class BaseFinderLotteryContract {

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/presenter/contract/BaseFinderLotteryContract$Presenter;", "Lfo1/a;", "Lcom/tencent/mm/plugin/finder/presenter/contract/BaseFinderLotteryContract$ViewCallback;", "Companion", "plugin-finder-live_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    /* renamed from: com.tencent.mm.plugin.finder.presenter.contract.BaseFinderLotteryContract$Presenter */
    public static abstract class Presenter implements C59264a<ViewCallback> {

        /* renamed from: d */
        public final BaseFeedLoader<C0740i2> f15880d;

        /* renamed from: e */
        public WxRecyclerAdapter<C0740i2> f15881e;

        /* renamed from: f */
        public ViewCallback f15882f;

        /* renamed from: g */
        public C16389w f15883g = new C16389w(this) {

            /* renamed from: d */
            public final /* synthetic */ Presenter f15884d;

            {
                this.f15884d = r1;
            }

            public void onChanged() {
                ViewCallback viewCallback = this.f15884d.f15882f;
                if (viewCallback != null) {
                    viewCallback.mo3712p().onChanged();
                }
            }

            public void onItemRangeChanged(int i, int i2) {
                ViewCallback viewCallback = this.f15884d.f15882f;
                if (viewCallback != null) {
                    viewCallback.mo3712p().onItemRangeChanged(i + this.f15884d.mo3710n().mo85796c6(), i2);
                }
            }

            public void onItemRangeInserted(int i, int i2) {
                ViewCallback viewCallback = this.f15884d.f15882f;
                if (viewCallback != null) {
                    viewCallback.mo3712p().onItemRangeInserted(i + this.f15884d.mo3710n().mo85796c6(), i2);
                }
            }

            public void onItemRangeMoved(int i, int i2, int i3) {
                ViewCallback viewCallback = this.f15884d.f15882f;
                if (viewCallback != null) {
                    viewCallback.mo3712p().onItemRangeMoved(i + this.f15884d.mo3710n().mo85796c6(), i2 + this.f15884d.mo3710n().mo85796c6(), i3);
                }
            }

            public void onItemRangeRemoved(int i, int i2) {
                ViewCallback viewCallback = this.f15884d.f15882f;
                if (viewCallback != null) {
                    viewCallback.mo3712p().onItemRangeRemoved(i + this.f15884d.mo3710n().mo85796c6(), i2);
                }
            }

            public void onPreFinishLoadMore(RefreshLoadMoreLayout.C7080c<Object> cVar) {
                C87412m.m108594g(cVar, TPReportKeys.PlayerStep.PLAYER_REASON);
                ViewCallback viewCallback = this.f15884d.f15882f;
                if (viewCallback != null) {
                    viewCallback.mo3712p().mo82441G(cVar);
                }
            }

            public void onPreFinishLoadMoreSmooth(RefreshLoadMoreLayout.C7080c<Object> cVar) {
                C87412m.m108594g(cVar, TPReportKeys.PlayerStep.PLAYER_REASON);
                ViewCallback viewCallback = this.f15884d.f15882f;
                if (viewCallback != null) {
                    viewCallback.mo3712p().onPreFinishLoadMoreSmooth(cVar);
                }
            }

            public void onPreFinishRefresh(RefreshLoadMoreLayout.C7080c<Object> cVar) {
                C87412m.m108594g(cVar, TPReportKeys.PlayerStep.PLAYER_REASON);
                ViewCallback viewCallback = this.f15884d.f15882f;
                if (viewCallback != null) {
                    viewCallback.mo3712p().onPreFinishRefresh(cVar);
                }
            }

            public void onItemRangeChanged(int i, int i2, Object obj) {
                ViewCallback viewCallback = this.f15884d.f15882f;
                if (viewCallback != null) {
                    viewCallback.mo3712p().onItemRangeChanged(i + this.f15884d.mo3710n().mo85796c6(), i2, obj);
                }
            }
        };

        @Metadata(mo182093d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/presenter/contract/BaseFinderLotteryContract$Presenter$Companion;", "", "()V", "TAG", "", "plugin-finder-live_release"}, mo182095k = 1, mo182096mv = {1, 7, 1}, mo182098xi = 48)
        /* renamed from: com.tencent.mm.plugin.finder.presenter.contract.BaseFinderLotteryContract$Presenter$Companion */
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

        public Presenter(BaseFeedLoader<C0740i2> baseFeedLoader) {
            C87412m.m108594g(baseFeedLoader, "loader");
            this.f15880d = baseFeedLoader;
        }

        /* renamed from: e */
        public abstract WxRecyclerAdapter<C0740i2> mo3455e();

        /* renamed from: n */
        public final WxRecyclerAdapter<C0740i2> mo3710n() {
            WxRecyclerAdapter<C0740i2> wxRecyclerAdapter = this.f15881e;
            if (wxRecyclerAdapter != null) {
                return wxRecyclerAdapter;
            }
            C87412m.m108603p("adapter");
            throw null;
        }

        public void onDetach() {
            this.f15880d.unregister(this.f15883g);
        }

        /* renamed from: q */
        public void mo3456q(ViewCallback viewCallback) {
            C87412m.m108594g(viewCallback, "callback");
            WxRecyclerAdapter<C0740i2> e = mo3455e();
            C87412m.m108594g(e, "<set-?>");
            this.f15881e = e;
            this.f15882f = viewCallback;
            C13064o0 o0Var = C13064o0.f37206a;
            View findViewById = viewCallback.f15885d.findViewById(C0966R.C0970id.f358641nb0);
            C87412m.m108593f(findViewById, "activity.findViewById(R.id.lottery_statement)");
            o0Var.mo12568g((TextView) findViewById);
            if (viewCallback.f15887f) {
                TextView textView = (TextView) viewCallback.f15885d.findViewById(C0966R.C0970id.f358641nb0);
                if (textView != null) {
                    textView.setVisibility(0);
                }
            } else {
                TextView textView2 = (TextView) viewCallback.f15885d.findViewById(C0966R.C0970id.f358641nb0);
                if (textView2 != null) {
                    textView2.setVisibility(8);
                }
            }
            View findViewById2 = viewCallback.f15885d.findViewById(C0966R.C0970id.ivb);
            C87412m.m108593f(findViewById2, "activity.findViewById(R.id.rl_layout)");
            viewCallback.f15888g = (RefreshLoadMoreLayout) findViewById2;
            viewCallback.mo3712p().setEnableRefresh(false);
            RecyclerView recyclerView = viewCallback.mo3712p().getRecyclerView();
            ((C61212e) C86312j.m106911c(C61212e.class)).o30(recyclerView, "finder_live_lottery_record_view");
            recyclerView.setLayoutManager(new LinearLayoutManager(viewCallback.f15885d));
            recyclerView.setAdapter(viewCallback.f15886e.mo3710n());
            viewCallback.mo3712p().setActionCallback(new BaseFinderLotteryContract$ViewCallback$initView$1(viewCallback, recyclerView));
            viewCallback.mo3711C0(true);
            C61926c.m72666K(300, new BaseFinderLotteryContract$ViewCallback$initView$2(viewCallback));
            this.f15880d.register(this.f15883g);
        }
    }

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/presenter/contract/BaseFinderLotteryContract$ViewCallback;", "Lfo1/c;", "Lcom/tencent/mm/plugin/finder/presenter/contract/BaseFinderLotteryContract$Presenter;", "plugin-finder-live_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    /* renamed from: com.tencent.mm.plugin.finder.presenter.contract.BaseFinderLotteryContract$ViewCallback */
    public static class ViewCallback implements C8178c<Presenter> {

        /* renamed from: d */
        public final MMActivity f15885d;

        /* renamed from: e */
        public final Presenter f15886e;

        /* renamed from: f */
        public final boolean f15887f;

        /* renamed from: g */
        public RefreshLoadMoreLayout f15888g;

        public ViewCallback(MMActivity mMActivity, Presenter presenter, boolean z) {
            C87412m.m108594g(mMActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
            C87412m.m108594g(presenter, "presenter");
            this.f15885d = mMActivity;
            this.f15886e = presenter;
            this.f15887f = z;
        }

        /* renamed from: C0 */
        public final void mo3711C0(boolean z) {
            View findViewById = this.f15885d.findViewById(C0966R.C0970id.g7s);
            if (findViewById != null) {
                int i = z ? 0 : 8;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(Integer.valueOf(i));
                View view = findViewById;
                C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/presenter/contract/BaseFinderLotteryContract$ViewCallback", "showProgress", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/mm/plugin/finder/presenter/contract/BaseFinderLotteryContract$ViewCallback", "showProgress", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }

        public MMFragmentActivity getActivity() {
            return this.f15885d;
        }

        /* renamed from: p */
        public final RefreshLoadMoreLayout mo3712p() {
            RefreshLoadMoreLayout refreshLoadMoreLayout = this.f15888g;
            if (refreshLoadMoreLayout != null) {
                return refreshLoadMoreLayout;
            }
            C87412m.m108603p("rlLayout");
            throw null;
        }
    }

    static {
        new BaseFinderLotteryContract();
    }

    private BaseFinderLotteryContract() {
    }
}
