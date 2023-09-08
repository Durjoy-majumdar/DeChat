package kf1;

import android.view.View;
import android.view.Window;
import androidx.lifecycle.C39622i0;
import androidx.recyclerview.widget.RecyclerView;
import bl3.C39818r;
import cm1.C0740i2;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.MMFragmentActivity;
import com.tencent.p014mm.plugin.finder.event.recyclerview.FinderRecyclerView;
import com.tencent.p014mm.plugin.finder.p056ui.C56437x0;
import com.tencent.p014mm.plugin.finder.view.C56597e1;
import com.tencent.p014mm.plugin.finder.view.FinderFavDrawer;
import com.tencent.p014mm.plugin.finder.view.FinderLikeDrawer;
import com.tencent.p014mm.plugin.finder.view.manager.FinderLinearLayoutManager;
import com.tencent.p014mm.view.RefreshLoadMoreLayout;
import com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import ef1.C58556f;
import ef1.C58563g;
import fo1.C8178c;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;
import rs1.C13442s8;
import rs1.C63545b1;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import zt3.C119157j;

/* renamed from: kf1.f */
public abstract class C9707f implements C8178c<C9640c> {

    /* renamed from: d */
    public final MMActivity f30122d;

    /* renamed from: e */
    public final C9640c f30123e;

    /* renamed from: f */
    public final C13601g f30124f = C36568h.m40985a(new C9711b(this));

    /* renamed from: g */
    public FinderLikeDrawer f30125g;

    /* renamed from: h */
    public FinderLikeDrawer f30126h;

    /* renamed from: i */
    public FinderFavDrawer f30127i;

    /* renamed from: j */
    public WxRecyclerAdapter<?> f30128j;

    /* renamed from: n */
    public C56437x0 f30129n;

    /* renamed from: o */
    public boolean f30130o = true;

    /* renamed from: kf1.f$a */
    public static final class C9708a extends RefreshLoadMoreLayout.C57879a {

        /* renamed from: a */
        public boolean f30131a = true;

        /* renamed from: b */
        public final /* synthetic */ C9707f f30132b;

        /* renamed from: c */
        public final /* synthetic */ RecyclerView f30133c;

        /* renamed from: kf1.f$a$a */
        public static final class C9709a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ C9707f f30134d;

            public C9709a(C9707f fVar) {
                this.f30134d = fVar;
            }

            public final void run() {
                this.f30134d.f30123e.mo2494o();
            }
        }

        /* renamed from: kf1.f$a$b */
        public static final class C9710b implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ C9707f f30135d;

            public C9710b(C9707f fVar) {
                this.f30135d = fVar;
            }

            public final void run() {
                this.f30135d.f30123e.requestRefresh();
            }
        }

        public C9708a(C9707f fVar, RecyclerView recyclerView) {
            this.f30132b = fVar;
            this.f30133c = recyclerView;
        }

        /* renamed from: a */
        public void mo3747a(int i) {
            this.f30132b.mo10282E0(i);
            if (this.f30131a && i > 0) {
                C39622i0 a = C39818r.f106831a.mo62444c(this.f30132b.f30122d).mo75002a(C13442s8.class);
                C87412m.m108593f(a, "UICProvider.of(context).…rReporterUIC::class.java)");
                C13442s8.C13443a aVar = C13442s8.f38060Q0;
                C58556f j3 = ((C13442s8) a).mo12854j3(-1);
                if (j3 != null) {
                    new C58563g(j3).onScrollStateChanged(this.f30133c, 5);
                }
                this.f30131a = false;
            }
        }

        /* renamed from: b */
        public void mo2561b(int i) {
            ((C119157j) C119157j.f356862d).mo183875f(new C9709a(this.f30132b));
        }

        /* renamed from: c */
        public void mo2562c(RefreshLoadMoreLayout.C7080c<Object> cVar) {
            C87412m.m108594g(cVar, TPReportKeys.PlayerStep.PLAYER_REASON);
            this.f30132b.f30123e.mo2545A7(cVar);
        }

        /* renamed from: d */
        public void mo3680d(int i) {
            ((C119157j) C119157j.f356862d).mo183875f(new C9710b(this.f30132b));
        }

        /* renamed from: e */
        public void mo3681e(RefreshLoadMoreLayout.C7080c<Object> cVar) {
            C87412m.m108594g(cVar, TPReportKeys.PlayerStep.PLAYER_REASON);
            View x = this.f30132b.mo5184x();
            if (x != null) {
                RecyclerView.C16613e adapter = this.f30132b.getRecyclerView().getAdapter();
                RecyclerView recyclerView = null;
                WxRecyclerAdapter wxRecyclerAdapter = adapter instanceof WxRecyclerAdapter ? (WxRecyclerAdapter) adapter : null;
                if ((wxRecyclerAdapter != null ? wxRecyclerAdapter.mo82597F4() : 0) <= 0) {
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(0);
                    C117292a.m165358d(x, aVar.mo10232b(), "com/tencent/mm/plugin/finder/feed/FinderBaseFeedUIContract$ViewCallback$initRecyclerView$2", "onRefreshEnd", "(Lcom/tencent/mm/view/RefreshLoadMoreLayout$MoreReason;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    x.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                    C117292a.m165359e(x, "com/tencent/mm/plugin/finder/feed/FinderBaseFeedUIContract$ViewCallback$initRecyclerView$2", "onRefreshEnd", "(Lcom/tencent/mm/view/RefreshLoadMoreLayout$MoreReason;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    if (wxRecyclerAdapter != null) {
                        recyclerView = wxRecyclerAdapter.mo85797d6();
                    }
                    if (recyclerView != null) {
                        recyclerView.setVisibility(8);
                    }
                    View findViewById = x.findViewById(C0966R.C0970id.is_);
                    if (findViewById != null) {
                        C9556a aVar2 = new C9556a();
                        aVar2.mo10233c(0);
                        C117292a.m165358d(findViewById, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/feed/FinderBaseFeedUIContract$ViewCallback$initRecyclerView$2", "onRefreshEnd", "(Lcom/tencent/mm/view/RefreshLoadMoreLayout$MoreReason;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        findViewById.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                        C117292a.m165359e(findViewById, "com/tencent/mm/plugin/finder/feed/FinderBaseFeedUIContract$ViewCallback$initRecyclerView$2", "onRefreshEnd", "(Lcom/tencent/mm/view/RefreshLoadMoreLayout$MoreReason;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                    View findViewById2 = x.findViewById(C0966R.C0970id.i7j);
                    if (findViewById2 != null) {
                        C9556a aVar3 = new C9556a();
                        aVar3.mo10233c(8);
                        View view = findViewById2;
                        C117292a.m165358d(view, aVar3.mo10232b(), "com/tencent/mm/plugin/finder/feed/FinderBaseFeedUIContract$ViewCallback$initRecyclerView$2", "onRefreshEnd", "(Lcom/tencent/mm/view/RefreshLoadMoreLayout$MoreReason;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        findViewById2.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                        C117292a.m165359e(view, "com/tencent/mm/plugin/finder/feed/FinderBaseFeedUIContract$ViewCallback$initRecyclerView$2", "onRefreshEnd", "(Lcom/tencent/mm/view/RefreshLoadMoreLayout$MoreReason;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                } else {
                    C9556a aVar4 = new C9556a();
                    ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                    aVar4.mo10233c(8);
                    C117292a.m165358d(x, aVar4.mo10232b(), "com/tencent/mm/plugin/finder/feed/FinderBaseFeedUIContract$ViewCallback$initRecyclerView$2", "onRefreshEnd", "(Lcom/tencent/mm/view/RefreshLoadMoreLayout$MoreReason;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    x.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
                    C117292a.m165359e(x, "com/tencent/mm/plugin/finder/feed/FinderBaseFeedUIContract$ViewCallback$initRecyclerView$2", "onRefreshEnd", "(Lcom/tencent/mm/view/RefreshLoadMoreLayout$MoreReason;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    if (wxRecyclerAdapter != null) {
                        recyclerView = wxRecyclerAdapter.mo85797d6();
                    }
                    if (recyclerView != null) {
                        recyclerView.setVisibility(0);
                    }
                }
            }
            this.f30132b.f30123e.onRefreshEnd(cVar);
        }
    }

    /* renamed from: kf1.f$b */
    public static final class C9711b extends C87413o implements C32224a<RefreshLoadMoreLayout> {

        /* renamed from: d */
        public final /* synthetic */ C9707f f30136d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C9711b(C9707f fVar) {
            super(0);
            this.f30136d = fVar;
        }

        public Object invoke() {
            return this.f30136d.mo5182G0();
        }
    }

    public C9707f(MMActivity mMActivity, C9640c cVar, int i, int i2, boolean z) {
        C87412m.m108594g(mMActivity, "context");
        C87412m.m108594g(cVar, "presenter");
        this.f30122d = mMActivity;
        this.f30123e = cVar;
    }

    /* renamed from: D */
    public final RefreshLoadMoreLayout mo10308D() {
        return (RefreshLoadMoreLayout) ((C36570n) this.f30124f).getValue();
    }

    /* renamed from: E0 */
    public void mo10282E0(int i) {
    }

    /* renamed from: F0 */
    public abstract void mo5181F0();

    /* renamed from: G0 */
    public RefreshLoadMoreLayout mo5182G0() {
        View findViewById = this.f30122d.findViewById(C0966R.C0970id.ivb);
        C87412m.m108593f(findViewById, "context.findViewById(R.id.rl_layout)");
        return (RefreshLoadMoreLayout) findViewById;
    }

    /* renamed from: Z */
    public void mo10309Z() {
        FinderLikeDrawer.Companion companion = FinderLikeDrawer.f17829D;
        MMActivity mMActivity = this.f30122d;
        Window window = mMActivity.getWindow();
        C87412m.m108593f(window, "getActivity().window");
        this.f30125g = companion.mo4621a(mMActivity, window, 2);
        MMActivity mMActivity2 = this.f30122d;
        Window window2 = mMActivity2.getWindow();
        C87412m.m108593f(window2, "getActivity().window");
        this.f30126h = companion.mo4621a(mMActivity2, window2, 1);
        FinderFavDrawer.Companion companion2 = FinderFavDrawer.f162097C;
        MMActivity mMActivity3 = this.f30122d;
        Window window3 = mMActivity3.getWindow();
        C87412m.m108593f(window3, "getActivity().window");
        this.f30127i = companion2.mo79836a(mMActivity3, window3, 0);
    }

    /* renamed from: d */
    public void mo5183d(ArrayList<C0740i2> arrayList) {
        C87412m.m108594g(arrayList, "data");
        mo10309Z();
        mo9301k0(arrayList);
    }

    public MMFragmentActivity getActivity() {
        return this.f30122d;
    }

    public RecyclerView getRecyclerView() {
        return mo10308D().getRecyclerView();
    }

    /* renamed from: k0 */
    public void mo9301k0(ArrayList<C0740i2> arrayList) {
        C87412m.m108594g(arrayList, "data");
        RecyclerView recyclerView = mo10308D().getRecyclerView();
        FinderLinearLayoutManager finderLinearLayoutManager = new FinderLinearLayoutManager(this.f30122d);
        finderLinearLayoutManager.f162360w = 25.0f;
        finderLinearLayoutManager.f162361x = 100;
        recyclerView.setLayoutManager(finderLinearLayoutManager);
        C56437x0 x0Var = null;
        if (recyclerView instanceof FinderRecyclerView) {
            FinderRecyclerView finderRecyclerView = (FinderRecyclerView) recyclerView;
            RecyclerView.LayoutManager layoutManager = finderRecyclerView.getLayoutManager();
            FinderRecyclerView.m63293z1(finderRecyclerView, layoutManager instanceof FinderLinearLayoutManager ? (FinderLinearLayoutManager) layoutManager : null, (String) null, 2, (Object) null);
        }
        WxRecyclerAdapter<?> wxRecyclerAdapter = new WxRecyclerAdapter<>(this.f30123e.mo2488U(), arrayList, mo10311m0());
        this.f30128j = wxRecyclerAdapter;
        recyclerView.setAdapter(wxRecyclerAdapter);
        if (this.f30130o) {
            C56437x0 x0Var2 = this.f30129n;
            if (x0Var2 == null) {
                x0Var2 = new C56437x0();
            }
            x0Var = x0Var2;
            this.f30129n = x0Var;
        }
        if (x0Var != null) {
            x0Var.mo75025b(recyclerView);
        }
        mo10308D().setActionCallback(new C9708a(this, recyclerView));
        C39622i0 a = C39818r.f106831a.mo62444c(this.f30122d).mo75002a(C13442s8.class);
        C87412m.m108593f(a, "UICProvider.of(context).…rReporterUIC::class.java)");
        C13442s8.C13443a aVar = C13442s8.f38060Q0;
        C58556f j3 = ((C13442s8) a).mo12854j3(-1);
        if (j3 != null) {
            j3.mo83455c(recyclerView);
        }
        mo5181F0();
    }

    /* renamed from: m0 */
    public boolean mo10311m0() {
        return this instanceof C10069z8;
    }

    /* renamed from: p */
    public WxRecyclerAdapter<?> mo10312p() {
        WxRecyclerAdapter<?> wxRecyclerAdapter = this.f30128j;
        if (wxRecyclerAdapter != null) {
            return wxRecyclerAdapter;
        }
        C87412m.m108603p("adapter");
        throw null;
    }

    /* renamed from: v */
    public C56597e1 mo10313v() {
        return ((C63545b1) C39818r.f106831a.mo62444c(this.f30122d).mo75002a(C63545b1.class)).f180225d;
    }

    /* renamed from: x */
    public abstract View mo5184x();

    /* renamed from: y */
    public FinderLikeDrawer mo10314y() {
        FinderLikeDrawer finderLikeDrawer = this.f30125g;
        if (finderLikeDrawer != null) {
            return finderLikeDrawer;
        }
        C87412m.m108603p("likeDrawer");
        throw null;
    }
}
