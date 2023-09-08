package kf1;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.MMFragmentActivity;
import com.tencent.p014mm.plugin.finder.feed.C2550xa772c4da;
import com.tencent.p014mm.plugin.finder.feed.FinderProfileTimelineContract$ProfileTimelinePresenter;
import com.tencent.p014mm.plugin.finder.feed.model.internal.BaseFeedLoader;
import com.tencent.p014mm.plugin.finder.p056ui.C56437x0;
import com.tencent.p014mm.plugin.finder.view.manager.FinderLinearLayoutManager;
import com.tencent.p014mm.view.RefreshLoadMoreLayout;
import com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import fo1.C8178c;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13601g;
import rx3.C36568h;
import zp3.C16389w;

/* renamed from: kf1.g8 */
public final class C9745g8 implements C8178c<FinderProfileTimelineContract$ProfileTimelinePresenter> {

    /* renamed from: d */
    public final MMActivity f30197d;

    /* renamed from: e */
    public final String f30198e = "Finder.FinderProfileTimelineContract.ProfileTimelineViewCallback";

    /* renamed from: f */
    public final FinderProfileTimelineContract$ProfileTimelinePresenter f30199f;

    /* renamed from: g */
    public RefreshLoadMoreLayout f30200g;

    /* renamed from: h */
    public RecyclerView f30201h;

    /* renamed from: i */
    public boolean f30202i;

    /* renamed from: j */
    public C16389w f30203j;

    /* renamed from: kf1.g8$a */
    public static final class C9746a implements C16389w {

        /* renamed from: d */
        public final /* synthetic */ RefreshLoadMoreLayout f30204d;

        /* renamed from: e */
        public final /* synthetic */ C9745g8 f30205e;

        /* renamed from: f */
        public final /* synthetic */ FinderProfileTimelineContract$ProfileTimelinePresenter f30206f;

        public C9746a(C9745g8 g8Var, FinderProfileTimelineContract$ProfileTimelinePresenter finderProfileTimelineContract$ProfileTimelinePresenter) {
            this.f30205e = g8Var;
            this.f30206f = finderProfileTimelineContract$ProfileTimelinePresenter;
            RefreshLoadMoreLayout refreshLoadMoreLayout = g8Var.f30200g;
            if (refreshLoadMoreLayout != null) {
                this.f30204d = refreshLoadMoreLayout;
            } else {
                C87412m.m108603p("rlLayout");
                throw null;
            }
        }

        public void onChanged() {
            this.f30204d.onChanged();
        }

        public void onItemRangeChanged(int i, int i2) {
            this.f30204d.onItemRangeChanged(i, i2);
        }

        public void onItemRangeChanged(int i, int i2, Object obj) {
            this.f30204d.onItemRangeChanged(i, i2, obj);
        }

        public void onItemRangeInserted(int i, int i2) {
            this.f30204d.onItemRangeInserted(i, i2);
        }

        public void onItemRangeMoved(int i, int i2, int i3) {
            this.f30204d.onItemRangeMoved(i, i2, i3);
        }

        public void onItemRangeRemoved(int i, int i2) {
            RefreshLoadMoreLayout refreshLoadMoreLayout = this.f30205e.f30200g;
            if (refreshLoadMoreLayout != null) {
                refreshLoadMoreLayout.onItemRangeRemoved(i, i2);
                RefreshLoadMoreLayout refreshLoadMoreLayout2 = this.f30205e.f30200g;
                if (refreshLoadMoreLayout2 != null) {
                    RecyclerView.C16613e adapter = refreshLoadMoreLayout2.getRecyclerView().getAdapter();
                    if (adapter != null) {
                        int itemCount = adapter.getItemCount();
                        FinderProfileTimelineContract$ProfileTimelinePresenter finderProfileTimelineContract$ProfileTimelinePresenter = this.f30206f;
                        if (itemCount < 10) {
                            BaseFeedLoader.requestLoadMore$default(finderProfileTimelineContract$ProfileTimelinePresenter.mo2583x(), false, 1, (Object) null);
                            return;
                        }
                        return;
                    }
                    return;
                }
                C87412m.m108603p("rlLayout");
                throw null;
            }
            C87412m.m108603p("rlLayout");
            throw null;
        }

        public void onPreFinishLoadMore(RefreshLoadMoreLayout.C7080c<Object> cVar) {
            C87412m.m108594g(cVar, TPReportKeys.PlayerStep.PLAYER_REASON);
            RefreshLoadMoreLayout refreshLoadMoreLayout = this.f30204d;
            refreshLoadMoreLayout.getClass();
            refreshLoadMoreLayout.mo82441G(cVar);
        }

        public void onPreFinishLoadMoreSmooth(RefreshLoadMoreLayout.C7080c<Object> cVar) {
            C87412m.m108594g(cVar, TPReportKeys.PlayerStep.PLAYER_REASON);
            this.f30204d.onPreFinishLoadMoreSmooth(cVar);
        }

        public void onPreFinishRefresh(RefreshLoadMoreLayout.C7080c<Object> cVar) {
            C87412m.m108594g(cVar, TPReportKeys.PlayerStep.PLAYER_REASON);
            this.f30204d.onPreFinishRefresh(cVar);
        }
    }

    /* renamed from: kf1.g8$b */
    public static final class C9747b extends C87413o implements C32224a<C9780h8> {

        /* renamed from: d */
        public static final C9747b f30207d = new C9747b();

        public C9747b() {
            super(0);
        }

        public Object invoke() {
            C9780h8 h8Var = new C9780h8();
            h8Var.mo17336e(4, 8);
            h8Var.mo17336e(2, 8);
            h8Var.mo17336e(1, 8);
            h8Var.mo17336e(8, 8);
            h8Var.mo17336e(7, 8);
            return h8Var;
        }
    }

    public C9745g8(MMActivity mMActivity, FinderProfileTimelineContract$ProfileTimelinePresenter finderProfileTimelineContract$ProfileTimelinePresenter) {
        C87412m.m108594g(mMActivity, "context");
        C87412m.m108594g(finderProfileTimelineContract$ProfileTimelinePresenter, "presenter");
        this.f30197d = mMActivity;
        this.f30199f = finderProfileTimelineContract$ProfileTimelinePresenter;
        this.f30202i = true;
        C13601g a = C36568h.m40985a(C9747b.f30207d);
        View findViewById = mMActivity.findViewById(C0966R.C0970id.ivb);
        C87412m.m108593f(findViewById, "context.findViewById(R.id.rl_layout)");
        RefreshLoadMoreLayout refreshLoadMoreLayout = (RefreshLoadMoreLayout) findViewById;
        this.f30200g = refreshLoadMoreLayout;
        RecyclerView recyclerView = refreshLoadMoreLayout.getRecyclerView();
        this.f30201h = recyclerView;
        if (recyclerView != null) {
            FinderLinearLayoutManager finderLinearLayoutManager = new FinderLinearLayoutManager(mMActivity);
            finderLinearLayoutManager.f162360w = 25.0f;
            finderLinearLayoutManager.f162361x = 100;
            recyclerView.setLayoutManager(finderLinearLayoutManager);
            RecyclerView recyclerView2 = this.f30201h;
            if (recyclerView2 != null) {
                recyclerView2.setRecycledViewPool((RecyclerView.C16623q) a.getValue());
                RecyclerView recyclerView3 = this.f30201h;
                if (recyclerView3 != null) {
                    recyclerView3.setAdapter(new WxRecyclerAdapter(new C2550xa772c4da(finderProfileTimelineContract$ProfileTimelinePresenter), finderProfileTimelineContract$ProfileTimelinePresenter.mo2583x().getDataListJustForAdapter(), false));
                    C56437x0 x0Var = new C56437x0();
                    RecyclerView recyclerView4 = this.f30201h;
                    if (recyclerView4 != null) {
                        x0Var.mo75025b(recyclerView4);
                        this.f30203j = new C9746a(this, finderProfileTimelineContract$ProfileTimelinePresenter);
                        return;
                    }
                    C87412m.m108603p("recyclerView");
                    throw null;
                }
                C87412m.m108603p("recyclerView");
                throw null;
            }
            C87412m.m108603p("recyclerView");
            throw null;
        }
        C87412m.m108603p("recyclerView");
        throw null;
    }

    public MMFragmentActivity getActivity() {
        return this.f30197d;
    }

    public final RecyclerView getRecyclerView() {
        RecyclerView recyclerView = this.f30201h;
        if (recyclerView != null) {
            return recyclerView;
        }
        C87412m.m108603p("recyclerView");
        throw null;
    }
}
