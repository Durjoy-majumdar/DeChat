package rs1;

import android.animation.Animator;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import bl3.C39818r;
import c30.C104289g;
import cm1.C0790x;
import cm1.C55018j0;
import com.google.android.material.appbar.AppBarLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.p136ui.tools.KeyboardHeightProvider;
import com.tencent.p014mm.plugin.finder.feed.FinderCommentDrawerPresenter;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.plugin.finder.p056ui.FinderImmersiveFeedUI;
import com.tencent.p014mm.plugin.finder.presenter.contract.CommentDrawerContract;
import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import com.tencent.p014mm.plugin.finder.view.FinderCommentDrawer;
import com.tencent.p014mm.plugin.finder.view.FinderCommentFooter;
import com.tencent.p014mm.plugin.finder.viewmodel.component.C26897z;
import com.tencent.p014mm.plugin.finder.viewmodel.component.FinderImmersiveImageUIC;
import com.tencent.p014mm.plugin.finder.viewmodel.component.FinderImmersiveVideoUIC;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.view.RefreshLoadMoreLayout;
import com.tencent.p014mm.view.refreshLayout.WxRefreshLayout;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import de1.C7290r;
import di3.C86312j;
import dp1.C58403t;
import dp1.C58417y0;
import dp1.C7435f2;
import dp1.C7450q;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C24564k0;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.ArrayList;
import kf1.C61025f0;
import kq1.C10399s;
import o40.C61926c;
import p599lr.C61381b;
import qq3.C63318b;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C13604l;
import rx3.C36568h;
import rx3.C36570n;
import sx3.C90364q0;
import te3.C49712hj1;
import u60.C14121l;
import u60.C65233m;
import up1.C65426w0;
import uq1.C65464w;
import ur1.C65468g;
import vp1.C65834e;
import ye1.C15978r;
import ye1.C66632n;
import zp3.C23564m;

/* renamed from: rs1.a6 */
public final class C63539a6 extends UIComponent {

    /* renamed from: d */
    public final C13601g f180202d = C36568h.m40985a(new C63540a(this));

    /* renamed from: e */
    public final C13601g f180203e;

    /* renamed from: f */
    public final C13601g f180204f;

    /* renamed from: g */
    public final C13601g f180205g;

    /* renamed from: h */
    public boolean f180206h;

    /* renamed from: h4 */
    public boolean f180207h4;

    /* renamed from: i */
    public int f180208i;

    /* renamed from: i4 */
    public C27665r f180209i4;

    /* renamed from: j */
    public int f180210j;

    /* renamed from: n */
    public boolean f180211n;

    /* renamed from: o */
    public boolean f180212o;

    /* renamed from: p */
    public boolean f180213p;

    /* renamed from: q */
    public long f180214q;

    /* renamed from: r */
    public long f180215r;

    /* renamed from: s */
    public boolean f180216s;

    /* renamed from: t */
    public boolean f180217t;

    /* renamed from: rs1.a6$k */
    public static final class C27656k implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C63539a6 f76587d;

        public C27656k(C63539a6 a6Var) {
            this.f76587d = a6Var;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/viewmodel/component/FinderImmersiveCommentUIC$onAttach$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            this.f76587d.mo88402i3(false);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/viewmodel/component/FinderImmersiveCommentUIC$onAttach$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: rs1.a6$l */
    public static final class C27657l implements FinderCommentFooter.C56552a {

        /* renamed from: d */
        public boolean f76588d;

        /* renamed from: e */
        public final /* synthetic */ C63539a6 f76589e;

        /* renamed from: rs1.a6$l$a */
        public static final class C27658a extends C7290r {

            /* renamed from: n */
            public final /* synthetic */ C63539a6 f76590n;

            /* renamed from: o */
            public final /* synthetic */ C27657l f76591o;

            public C27658a(C63539a6 a6Var, C27657l lVar) {
                this.f76590n = a6Var;
                this.f76591o = lVar;
            }

            public void onAnimationEnd(Animator animator) {
                C87412m.m108594g(animator, "animation");
                this.f76590n.mo88397c3().f42970d.setVisibility(8);
                this.f76591o.f76588d = false;
            }
        }

        /* renamed from: rs1.a6$l$b */
        public static final class C27659b extends C7290r {

            /* renamed from: n */
            public final /* synthetic */ C63539a6 f76592n;

            /* renamed from: o */
            public final /* synthetic */ C27657l f76593o;

            public C27659b(C63539a6 a6Var, C27657l lVar) {
                this.f76592n = a6Var;
                this.f76593o = lVar;
            }

            public void onAnimationEnd(Animator animator) {
                C87412m.m108594g(animator, "animation");
                this.f76592n.mo88397c3().f42970d.setAlpha(1.0f);
                this.f76593o.f76588d = false;
            }
        }

        public C27657l(C63539a6 a6Var) {
            this.f76589e = a6Var;
        }

        /* renamed from: e */
        public void mo55509e(int i, int i2) {
            if (!this.f76588d) {
                if (i2 == 0) {
                    this.f76588d = true;
                    ViewPropertyAnimator animate = this.f76589e.mo88397c3().f42970d.animate();
                    if (animate != null) {
                        animate.cancel();
                    }
                    this.f76589e.mo88397c3().f42970d.animate().alpha(0.0f).setDuration(120).setListener(new C27658a(this.f76589e, this)).start();
                } else if (i == 0) {
                    this.f76588d = true;
                    ViewPropertyAnimator animate2 = this.f76589e.mo88397c3().f42970d.animate();
                    if (animate2 != null) {
                        animate2.cancel();
                    }
                    this.f76589e.mo88397c3().f42970d.setVisibility(0);
                    this.f76589e.mo88397c3().f42970d.setAlpha(0.0f);
                    this.f76589e.mo88397c3().f42970d.animate().alpha(1.0f).setDuration(200).setListener(new C27659b(this.f76589e, this)).start();
                }
            }
        }
    }

    /* renamed from: rs1.a6$m */
    public static final class C27660m implements C63318b {

        /* renamed from: a */
        public final /* synthetic */ C63539a6 f76594a;

        public C27660m(C63539a6 a6Var) {
            this.f76594a = a6Var;
        }

        /* renamed from: a */
        public void mo3374a(boolean z) {
        }

        public void onLoadMore() {
            FinderCommentDrawerPresenter a = this.f76594a.mo88396a();
            C65233m mVar = a.f158600C;
            if (mVar != null) {
                mVar.mo11856a(new C14121l(new C61025f0(a), (String) null, 2, (C8480h) null));
            }
        }
    }

    /* renamed from: rs1.a6$n */
    public static final class C27661n extends C87413o implements C32226l<Integer, C13598b0> {

        /* renamed from: B */
        public final /* synthetic */ C63539a6 f76595B;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C27661n(C63539a6 a6Var) {
            super(1);
            this.f76595B = a6Var;
        }

        public Object invoke(Object obj) {
            FinderCommentFooter footer;
            if (((Number) obj).intValue() != 0) {
                FinderCommentDrawer finderCommentDrawer = this.f76595B.mo88396a().f158605H;
                FinderCommentFooter footer2 = finderCommentDrawer != null ? finderCommentDrawer.getFooter() : null;
                if (footer2 != null) {
                    footer2.setFrozen(true);
                }
            } else {
                FinderCommentDrawer finderCommentDrawer2 = this.f76595B.mo88396a().f158605H;
                if (!(finderCommentDrawer2 == null || (footer = finderCommentDrawer2.getFooter()) == null)) {
                    footer.postDelayed(new C26897z(this.f76595B), 500);
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: rs1.a6$o */
    public static final class C27662o implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C63539a6 f76596d;

        public C27662o(C63539a6 a6Var) {
            this.f76596d = a6Var;
        }

        public final void run() {
            this.f76596d.mo88398e3().setAdapter(this.f76596d.mo88396a().mo77328c(this.f76596d.getContext()));
        }
    }

    /* renamed from: rs1.a6$p */
    public static final class C27663p extends RefreshLoadMoreLayout {

        /* renamed from: V0 */
        public final /* synthetic */ C63539a6 f76597V0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C27663p(C63539a6 a6Var, Activity activity) {
            super(activity);
            this.f76597V0 = a6Var;
        }

        public void onPreFinishLoadMoreSmooth(RefreshLoadMoreLayout.C7080c<Object> cVar) {
            C87412m.m108594g(cVar, TPReportKeys.PlayerStep.PLAYER_REASON);
            super.onPreFinishLoadMoreSmooth(cVar);
            this.f76597V0.mo88400f3().mo26580f(cVar.f24953h > 0);
            this.f76597V0.mo88400f3().mo26642z(!cVar.f24951f);
        }

        public void onPreFinishRefresh(RefreshLoadMoreLayout.C7080c<Object> cVar) {
            C87412m.m108594g(cVar, TPReportKeys.PlayerStep.PLAYER_REASON);
            mo82443I(cVar);
            this.f76597V0.mo88400f3().mo26580f(cVar.f24953h > 0);
            this.f76597V0.mo88400f3().mo26642z(!cVar.f24951f);
        }

        /* renamed from: p */
        public void mo55513p(C32224a<C13598b0> aVar) {
            C87412m.m108594g(aVar, "callback");
            super.mo55513p(aVar);
            this.f76597V0.mo88400f3().mo26580f(true);
        }
    }

    /* renamed from: rs1.a6$q */
    public static final class C27664q extends C87413o implements C32224a<C66632n> {

        /* renamed from: B */
        public final /* synthetic */ C63539a6 f76598B;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C27664q(C63539a6 a6Var) {
            super(0);
            this.f76598B = a6Var;
        }

        public Object invoke() {
            return C66632n.m78606a(this.f76598B.getRootView().findViewById(C0966R.C0970id.edb));
        }
    }

    /* renamed from: rs1.a6$r */
    public static final class C27665r implements C65464w {

        /* renamed from: d */
        public final /* synthetic */ C63539a6 f76599d;

        /* renamed from: rs1.a6$r$a */
        public static final class C27666a extends C87413o implements C32224a<C13598b0> {

            /* renamed from: B */
            public final /* synthetic */ C63539a6 f76600B;

            /* renamed from: C */
            public final /* synthetic */ long f76601C;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C27666a(C63539a6 a6Var, long j) {
                super(0);
                this.f76600B = a6Var;
                this.f76601C = j;
            }

            public Object invoke() {
                ((C13188d6) C39818r.f106831a.mo62443b(this.f76600B.getContext()).mo75002a(C13188d6.class)).f37506e = C65834e.f189316a.mo89871e(this.f76601C);
                this.f76600B.mo88399f();
                return C13598b0.f38549a;
            }
        }

        public C27665r(C63539a6 a6Var) {
            this.f76599d = a6Var;
        }

        public void onPostEnd(long j, boolean z) {
        }

        public void onPostNotify(long j, boolean z) {
        }

        public void onPostOk(long j, long j2) {
            FinderItem finderItem = ((C13188d6) C39818r.f106831a.mo62443b(this.f76599d.getContext()).mo75002a(C13188d6.class)).f37506e;
            if (finderItem == null) {
                finderItem = new FinderItem();
            }
            if (finderItem.getLocalId() == j) {
                C61926c.m72668M(new C27666a(this.f76599d, j2));
            }
        }

        public void onPostStart(long j) {
        }
    }

    /* renamed from: rs1.a6$a */
    public static final class C63540a extends C87413o implements C32224a<C15978r> {

        /* renamed from: d */
        public final /* synthetic */ C63539a6 f180218d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C63540a(C63539a6 a6Var) {
            super(0);
            this.f180218d = a6Var;
        }

        public Object invoke() {
            return C15978r.m14889a(this.f180218d.getRootView());
        }
    }

    /* renamed from: rs1.a6$h */
    public static final class C63541h extends C87413o implements C32224a<FinderCommentDrawerPresenter> {

        /* renamed from: d */
        public final /* synthetic */ C63539a6 f180219d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C63541h(C63539a6 a6Var) {
            super(0);
            this.f180219d = a6Var;
        }

        public Object invoke() {
            FinderCommentDrawerPresenter finderCommentDrawerPresenter = new FinderCommentDrawerPresenter(this.f180219d.getContext());
            finderCommentDrawerPresenter.f158607J = true;
            return finderCommentDrawerPresenter;
        }
    }

    /* renamed from: rs1.a6$i */
    public static final class C63542i extends C87413o implements C32224a<RecyclerView> {

        /* renamed from: d */
        public final /* synthetic */ C63539a6 f180220d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C63542i(C63539a6 a6Var) {
            super(0);
            this.f180220d = a6Var;
        }

        public Object invoke() {
            return this.f180220d.mo88397c3().f42975i;
        }
    }

    /* renamed from: rs1.a6$j */
    public static final class C63543j extends C87413o implements C32224a<WxRefreshLayout> {

        /* renamed from: d */
        public final /* synthetic */ C63539a6 f180221d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C63543j(C63539a6 a6Var) {
            super(0);
            this.f180221d = a6Var;
        }

        public Object invoke() {
            return this.f180221d.mo88397c3().f42976j;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C63539a6(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        C36568h.m40985a(new C27664q(this));
        this.f180203e = C36568h.m40985a(new C63542i(this));
        this.f180204f = C36568h.m40985a(new C63543j(this));
        this.f180205g = C36568h.m40985a(new C63541h(this));
        this.f180206h = true;
        this.f180208i = -1;
        this.f180211n = true;
        this.f180212o = true;
        this.f180209i4 = new C27665r(this);
    }

    /* renamed from: a */
    public final FinderCommentDrawerPresenter mo88396a() {
        return (FinderCommentDrawerPresenter) this.f180205g.getValue();
    }

    /* renamed from: c3 */
    public final C15978r mo88397c3() {
        return (C15978r) this.f180202d.getValue();
    }

    /* renamed from: e3 */
    public final RecyclerView mo88398e3() {
        return (RecyclerView) this.f180203e.getValue();
    }

    /* renamed from: f */
    public final void mo88399f() {
        C39818r rVar = C39818r.f106831a;
        FinderItem finderItem = ((C13188d6) rVar.mo62443b(getContext()).mo75002a(C13188d6.class)).f37506e;
        if (finderItem == null) {
            finderItem = new FinderItem();
        }
        FinderItem finderItem2 = finderItem;
        mo88398e3().setLayoutManager(new LinearLayoutManager(getContext()));
        mo88398e3().mo17085h0(mo88396a().mo77326a(getContext()));
        FinderCommentDrawer finderCommentDrawer = r3;
        FinderCommentDrawer finderCommentDrawer2 = new FinderCommentDrawer(getContext());
        finderCommentDrawer2.setPresenter(mo88396a());
        C65468g gVar = r7;
        C65468g gVar2 = new C65468g(mo88396a());
        gVar2.mo79741h(finderCommentDrawer2, 2);
        gVar2.mo79737a(getContext(), finderCommentDrawer2.getHeaderLayout(), false);
        gVar2.mo79738b(getContext(), finderCommentDrawer2.getCenterLayout());
        Activity context = getContext();
        FrameLayout frameLayout = mo88397c3().f42974h;
        C87412m.m108593f(frameLayout, "binding.placeholderDrawerFooter");
        gVar2.mo79739c(context, frameLayout, false);
        gVar2.mo89586k().setHideFooterAtModeDefault(true);
        View inflate = C85868k2.m106137b(getContext()).inflate(C0966R.C0971layout.ai9, mo88398e3(), false);
        Activity context2 = getContext();
        View findViewById = inflate.findViewById(C0966R.C0970id.oej);
        C87412m.m108593f(findViewById, "headerConvertView.findVi…id.header_loading_layout)");
        gVar2.mo79740d(context2, (FrameLayout) findViewById);
        mo88397c3().f42970d.setOnClickListener(new C27656k(this));
        mo88396a().f158609L.add(new C27657l(this));
        mo88400f3().setOnSimpleAction(new C27660m(this));
        C27663p pVar = new C27663p(this, getContext());
        finderCommentDrawer2.setCenterLayout(pVar);
        gVar2.f188406n = inflate;
        gVar2.f188402g = pVar;
        RecyclerView e3 = mo88398e3();
        C87412m.m108593f(e3, "recyclerView");
        finderCommentDrawer2.setRecyclerView(e3);
        finderCommentDrawer2.setReason(7);
        mo88396a().mo77320M(finderCommentDrawer, gVar, finderItem2, (CommentDrawerContract.CloseDrawerCallback) null, 2, false, 0, (C65426w0) null, true, false, 0, false, false, false, 2);
        ((C63513a1) rVar.mo62444c(getActivity()).mo75002a(C63513a1.class)).f180142f = new C27661n(this);
        getActivity().getWindow().getDecorView().postDelayed(new C27662o(this), 380);
        mo88397c3().f42968b.mo146159a(new C63667x5(this, mo88397c3().f42973g.findViewById(C0966R.C0970id.ol_)));
        AppBarLayout appBarLayout = mo88397c3().f42968b;
        C87412m.m108593f(appBarLayout, "binding.appbarLayout");
        C23564m.m28138h(appBarLayout, new C63671y5(this));
        RecyclerView recyclerView = mo88397c3().f42975i;
        C87412m.m108593f(recyclerView, "binding.recyclerView");
        C23564m.m28138h(recyclerView, new C63675z5(this));
        C10399s sVar = (C10399s) rVar.mo62443b(getContext()).mo75002a(C10399s.class);
        FinderCommentDrawer finderCommentDrawer3 = mo88396a().f158605H;
        FinderCommentFooter footer = finderCommentDrawer3 != null ? finderCommentDrawer3.getFooter() : null;
        if (footer != null) {
            sVar.f31625e.add(footer);
            KeyboardHeightProvider keyboardHeightProvider = sVar.f31624d;
            if (keyboardHeightProvider != null) {
                keyboardHeightProvider.mo104022e();
                return;
            }
            return;
        }
        sVar.getClass();
    }

    /* renamed from: f3 */
    public final WxRefreshLayout mo88400f3() {
        return (WxRefreshLayout) this.f180204f.getValue();
    }

    /* renamed from: g3 */
    public final void mo88401g3() {
        boolean z = this.f180206h;
        boolean z2 = z && this.f180212o;
        boolean z3 = (!this.f180211n || !z) && this.f180213p;
        if (z2 != this.f180216s) {
            if (z2) {
                this.f180214q = System.currentTimeMillis();
            }
            C13442s8 f = C13442s8.f38060Q0.mo12873f(getContext());
            if (f != null) {
                C49712hj1 q3 = f.mo12861q3();
                C7435f2 f2Var = C7435f2.f25626a;
                int i = z2 ? 0 : 5;
                C104289g gVar = new C104289g();
                if (!z2) {
                    gVar.mo145954o("staytime", System.currentTimeMillis() - this.f180214q);
                }
                C13598b0 b0Var = C13598b0.f38549a;
                f2Var.mo8577a(q3, "detail_page_play_area", i, gVar);
            }
        }
        if (z3 != this.f180217t) {
            if (z3) {
                this.f180215r = System.currentTimeMillis();
            } else if (this.f180215r != 0) {
                RecyclerView.C16613e adapter = mo88398e3().getAdapter();
                if ((adapter != null ? adapter.getItemCount() : 0) > 1) {
                    AppCompatActivity activity = getActivity();
                    C87412m.m108592e(activity, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.ui.FinderImmersiveFeedUI");
                    int I7 = ((FinderImmersiveFeedUI) activity).mo2194I7();
                    BaseFinderFeed baseFinderFeed = I7 == 192 ? (C0790x) ((C36570n) ((FinderImmersiveImageUIC) C39818r.f106831a.mo62443b(getContext()).mo75002a(FinderImmersiveImageUIC.class)).f18713i).getValue() : (C55018j0) ((C36570n) ((FinderImmersiveVideoUIC) C39818r.f106831a.mo62443b(getContext()).mo75002a(FinderImmersiveVideoUIC.class)).f18740n).getValue();
                    C13442s8 f2 = C13442s8.f38060Q0.mo12873f(getContext());
                    if (f2 != null) {
                        C49712hj1 q35 = f2.mo12861q3();
                        long currentTimeMillis = System.currentTimeMillis();
                        Log.m105918d("Finder.ImmersiveCommentUIC", "21834 " + (currentTimeMillis - this.f180215r));
                        ((C58417y0) C86312j.m106911c(C58417y0.class)).zy0(q35.f134670d, q35.f134671e, q35.f134672f, I7, baseFinderFeed.mo3513o().getId(), this.f180215r, currentTimeMillis, 7);
                        C7450q.m7581f(C7450q.f25643a, ((C13442s8) C39818r.f106831a.mo62443b(getContext()).mo75002a(C13442s8.class)).mo12861q3(), baseFinderFeed, 75, C58403t.f167322q.mo83248b(C90364q0.m113147f(new C13604l("feedActionType", 75), new C13604l("value", Long.valueOf(currentTimeMillis - this.f180215r)))), 0, 16, (Object) null);
                    }
                }
            }
        }
        this.f180216s = z2;
        this.f180217t = z3;
    }

    /* renamed from: i3 */
    public final void mo88402i3(boolean z) {
        FinderCommentFooter footer;
        FinderCommentFooter footer2;
        Log.m105924i("Finder.ImmersiveCommentUIC", "[showCommentFooter] isShow=" + z);
        if (z) {
            FinderCommentDrawer finderCommentDrawer = mo88396a().f158605H;
            if (finderCommentDrawer != null && (footer2 = finderCommentDrawer.getFooter()) != null) {
                footer2.mo79779m(true);
                return;
            }
            return;
        }
        FinderCommentDrawer finderCommentDrawer2 = mo88396a().f158605H;
        if (finderCommentDrawer2 != null && (footer = finderCommentDrawer2.getFooter()) != null) {
            int i = footer.f162060L;
            if (i == 1) {
                footer.mo79776j(true);
            } else if (i == 2) {
                footer.mo79779m(false);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0017, code lost:
        r0 = r0.getFooter();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onBackPressed() {
        /*
            r4 = this;
            com.tencent.mm.plugin.finder.feed.FinderCommentDrawerPresenter r0 = r4.mo88396a()
            com.tencent.mm.plugin.finder.view.FinderCommentDrawer r0 = r0.f158605H
            if (r0 != 0) goto L_0x000d
            boolean r0 = super.onBackPressed()
            return r0
        L_0x000d:
            com.tencent.mm.plugin.finder.feed.FinderCommentDrawerPresenter r0 = r4.mo88396a()
            com.tencent.mm.plugin.finder.view.FinderCommentDrawer r0 = r0.f158605H
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0025
            com.tencent.mm.plugin.finder.view.FinderCommentFooter r0 = r0.getFooter()
            if (r0 == 0) goto L_0x0025
            int r0 = r0.getFooterMode()
            if (r0 != 0) goto L_0x0025
            r0 = 1
            goto L_0x0026
        L_0x0025:
            r0 = 0
        L_0x0026:
            if (r0 != 0) goto L_0x003d
            com.tencent.mm.plugin.finder.feed.FinderCommentDrawerPresenter r0 = r4.mo88396a()
            com.tencent.mm.plugin.finder.view.FinderCommentDrawer r0 = r0.f158605H
            if (r0 == 0) goto L_0x0035
            com.tencent.mm.plugin.finder.view.FinderCommentFooter r0 = r0.getFooter()
            goto L_0x0036
        L_0x0035:
            r0 = 0
        L_0x0036:
            if (r0 != 0) goto L_0x0039
            goto L_0x003c
        L_0x0039:
            r0.setFooterMode(r1)
        L_0x003c:
            return r2
        L_0x003d:
            ye1.r r0 = r4.mo88397c3()
            com.google.android.material.appbar.AppBarLayout r0 = r0.f42968b
            int r0 = r0.getHeight()
            ye1.r r3 = r4.mo88397c3()
            com.google.android.material.appbar.AppBarLayout r3 = r3.f42968b
            int r3 = r3.getBottom()
            int r0 = r0 - r3
            if (r0 != 0) goto L_0x0055
            r1 = 1
        L_0x0055:
            if (r1 != 0) goto L_0x0061
            ye1.r r0 = r4.mo88397c3()
            com.google.android.material.appbar.AppBarLayout r0 = r0.f42968b
            r0.mo146163d(r2, r2, r2)
            return r2
        L_0x0061:
            boolean r0 = super.onBackPressed()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: rs1.C63539a6.onBackPressed():boolean");
    }

    public void onCreateAfter(Bundle bundle) {
        super.onCreateAfter(bundle);
        ((C61381b) C86312j.m106911c(C61381b.class)).mo78545UQ().mo12412e(this.f180209i4);
        FinderItem finderItem = ((C13188d6) C39818r.f106831a.mo62443b(getContext()).mo75002a(C13188d6.class)).f37506e;
        if (finderItem == null) {
            finderItem = new FinderItem();
        }
        if (!this.f180207h4 || finderItem.isPostFinish()) {
            mo88399f();
        }
    }

    public void onCreateBefore(Bundle bundle) {
        super.onCreateBefore(bundle);
        getActivity().getWindow().setSoftInputMode(48);
        this.f180207h4 = getIntent().getBooleanExtra("key_posting_scene", false);
    }

    public void onDestroy() {
        super.onDestroy();
        mo88396a().onDetach();
        ((C61381b) C86312j.m106911c(C61381b.class)).mo78545UQ().mo12417j(this.f180209i4);
    }

    public void onWindowFocusChanged(boolean z) {
        KeyboardHeightProvider keyboardHeightProvider;
        Class cls = C10399s.class;
        super.onWindowFocusChanged(z);
        FinderCommentFooter finderCommentFooter = null;
        if (z) {
            C10399s sVar = (C10399s) C39818r.f106831a.mo62443b(getContext()).mo75002a(cls);
            FinderCommentDrawer finderCommentDrawer = mo88396a().f158605H;
            if (finderCommentDrawer != null) {
                finderCommentFooter = finderCommentDrawer.getFooter();
            }
            if (finderCommentFooter != null) {
                sVar.f31625e.add(finderCommentFooter);
                KeyboardHeightProvider keyboardHeightProvider2 = sVar.f31624d;
                if (keyboardHeightProvider2 != null) {
                    keyboardHeightProvider2.mo104022e();
                    return;
                }
                return;
            }
            sVar.getClass();
            return;
        }
        C10399s sVar2 = (C10399s) C39818r.f106831a.mo62443b(getContext()).mo75002a(cls);
        FinderCommentDrawer finderCommentDrawer2 = mo88396a().f158605H;
        if (finderCommentDrawer2 != null) {
            finderCommentFooter = finderCommentDrawer2.getFooter();
        }
        C24564k0.m30737a(sVar2.f31625e).remove(finderCommentFooter);
        if (sVar2.f31625e.isEmpty() && (keyboardHeightProvider = sVar2.f31624d) != null) {
            keyboardHeightProvider.mo104021d();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C63539a6(Fragment fragment) {
        super(fragment);
        C87412m.m108594g(fragment, "fragment");
        C36568h.m40985a(new C27664q(this));
        this.f180203e = C36568h.m40985a(new C63542i(this));
        this.f180204f = C36568h.m40985a(new C63543j(this));
        this.f180205g = C36568h.m40985a(new C63541h(this));
        this.f180206h = true;
        this.f180208i = -1;
        this.f180211n = true;
        this.f180212o = true;
        this.f180209i4 = new C27665r(this);
    }
}
