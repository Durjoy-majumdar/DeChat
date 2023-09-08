package ur1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.mmdata.rpt.FinderSwitchCommentRoleStruct;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.MMFragmentActivity;
import com.tencent.p014mm.plugin.finder.presenter.contract.CommentDrawerContract;
import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import com.tencent.p014mm.plugin.finder.view.FinderCommentDrawer;
import com.tencent.p014mm.plugin.finder.view.FinderCommentFooter;
import com.tencent.p014mm.plugin.finder.view.manager.FinderLinearLayoutManager;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.view.RefreshLoadMoreLayout;
import com.tencent.p014mm.view.drawer.RecyclerViewDrawer;
import com.tencent.p014mm.view.drawer.RecyclerViewDrawerSquares;
import di3.C86312j;
import dp1.C58417y0;
import er1.C58784w3;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import h81.C59774i;
import ht1.C8808v4;
import j20.C117292a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;
import os1.C11744g;
import rs1.C13442s8;
import rx3.C13598b0;
import up1.C37521f;

/* renamed from: ur1.g */
public class C65468g implements FinderCommentDrawer.C56550a, RecyclerViewDrawerSquares.C45117c {

    /* renamed from: d */
    public final CommentDrawerContract.NPresenter f188399d;

    /* renamed from: e */
    public boolean f188400e;

    /* renamed from: f */
    public TextView f188401f;

    /* renamed from: g */
    public RefreshLoadMoreLayout f188402g;

    /* renamed from: h */
    public FinderCommentFooter f188403h;

    /* renamed from: i */
    public FinderCommentDrawer f188404i;

    /* renamed from: j */
    public FrameLayout f188405j;

    /* renamed from: n */
    public View f188406n;

    /* renamed from: o */
    public FrameLayout f188407o;

    /* renamed from: p */
    public View f188408p;

    /* renamed from: q */
    public View f188409q;

    /* renamed from: r */
    public View f188410r;

    /* renamed from: s */
    public Context f188411s;

    /* renamed from: t */
    public View f188412t;

    /* renamed from: u */
    public TextView f188413u;

    /* renamed from: v */
    public C32226l<? super View, C13598b0> f188414v = new C65475g(this);

    /* renamed from: w */
    public C32224a<C13598b0> f188415w = new C65469a(this);

    /* renamed from: ur1.g$a */
    public static final class C65469a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C65468g f188416d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C65469a(C65468g gVar) {
            super(0);
            this.f188416d = gVar;
        }

        public Object invoke() {
            this.f188416d.mo89585j().mo79715l();
            return C13598b0.f38549a;
        }
    }

    /* renamed from: ur1.g$b */
    public static final class C65470b extends RecyclerView.C0130p {

        /* renamed from: d */
        public int f188417d;

        /* renamed from: e */
        public final /* synthetic */ Context f188418e;

        /* renamed from: f */
        public final /* synthetic */ C65468g f188419f;

        public C65470b(Context context, C65468g gVar) {
            this.f188418e = context;
            this.f188419f = gVar;
        }

        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(recyclerView);
            arrayList.add(Integer.valueOf(i));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/view/builder/FinderTimelineDrawerBuilder$onBuildDrawerBody$2", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
            C87412m.m108594g(recyclerView, "recyclerView");
            super.onScrollStateChanged(recyclerView, i);
            if ((i == 1 || i == 3) && this.f188417d != 3) {
                Context context = this.f188418e;
                C87412m.m108592e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMFragmentActivity");
                ((MMFragmentActivity) context).hideVKB();
            }
            this.f188417d = i;
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/view/builder/FinderTimelineDrawerBuilder$onBuildDrawerBody$2", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
        }

        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(recyclerView);
            arrayList.add(Integer.valueOf(i));
            arrayList.add(Integer.valueOf(i2));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/view/builder/FinderTimelineDrawerBuilder$onBuildDrawerBody$2", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
            C87412m.m108594g(recyclerView, "recyclerView");
            super.onScrolled(recyclerView, i, i2);
            if (i2 > 0 && this.f188419f.f188399d.mo77337o1()) {
                RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
                C87412m.m108592e(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
                this.f188419f.f188399d.mo77324X(((LinearLayoutManager) layoutManager).mo16959E());
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/view/builder/FinderTimelineDrawerBuilder$onBuildDrawerBody$2", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
        }
    }

    /* renamed from: ur1.g$c */
    public static final class C65471c implements View.OnLayoutChangeListener {

        /* renamed from: d */
        public final /* synthetic */ C65468g f188420d;

        /* renamed from: e */
        public final /* synthetic */ View f188421e;

        public C65471c(C65468g gVar, View view) {
            this.f188420d = gVar;
            this.f188421e = view;
        }

        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            this.f188420d.mo89585j().getFooterLayout().removeOnLayoutChangeListener(this);
            View view2 = this.f188421e;
            view2.setPadding(view2.getPaddingLeft(), this.f188421e.getPaddingTop(), this.f188421e.getPaddingRight(), this.f188420d.mo89586k().getCommentEditTextLayout().getHeight());
            this.f188421e.requestLayout();
            Log.m105924i("Finder.TimelineDrawerBuilder", "bottomMargin=" + this.f188420d.mo89586k().getCommentEditTextLayout().getHeight() + " paddingBottom=" + this.f188421e.getPaddingBottom());
        }
    }

    /* renamed from: ur1.g$d */
    public static final class C65472d extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ boolean f188422d;

        /* renamed from: e */
        public final /* synthetic */ C65468g f188423e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C65472d(boolean z, C65468g gVar) {
            super(0);
            this.f188422d = z;
            this.f188423e = gVar;
        }

        public Object invoke() {
            if (!this.f188422d || this.f188423e.mo89586k().getFooterMode() != 2) {
                ((C65469a) this.f188423e.f188415w).invoke();
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: ur1.g$e */
    public static final class C65473e extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C65468g f188424d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C65473e(C65468g gVar) {
            super(0);
            this.f188424d = gVar;
        }

        public Object invoke() {
            FinderCommentDrawer j = this.f188424d.mo89585j();
            FinderCommentFooter finderCommentFooter = j.f162041P;
            int i = 0;
            int scene = finderCommentFooter != null ? finderCommentFooter.getScene() : 0;
            C58784w3 w3Var = C58784w3.f168295a;
            int i2 = j.f162030D;
            w3Var.getClass();
            int i3 = 2;
            if (i2 == 2) {
                i3 = 1;
            }
            j.f162030D = i3;
            C37521f.f99374d.mo61176c0(i3);
            FinderItem finderItem = j.f162027A;
            if (finderItem != null) {
                C13442s8.C13443a aVar = C13442s8.f38060Q0;
                Context context = j.getContext();
                C87412m.m108593f(context, "context");
                C13442s8 f = aVar.mo12873f(context);
                if (f != null) {
                    i = f.f38096i;
                }
                C58417y0 y0Var = (C58417y0) C86312j.m106911c(C58417y0.class);
                long id = finderItem.getId();
                FinderItem Br0 = y0Var.Br0(id);
                if (Br0 != null) {
                    FinderSwitchCommentRoleStruct finderSwitchCommentRoleStruct = new FinderSwitchCommentRoleStruct();
                    String Wb = ((C59774i) C86312j.m106911c(C59774i.class)).mo84751Wb();
                    if (Wb == null) {
                        Wb = "";
                    }
                    finderSwitchCommentRoleStruct.f156117d = finderSwitchCommentRoleStruct.mo86045b("sessionid", Wb, true);
                    finderSwitchCommentRoleStruct.f156118e = finderSwitchCommentRoleStruct.mo86045b("feedid", y0Var.xx0(id), true);
                    finderSwitchCommentRoleStruct.f156120g = (long) Br0.getLikeCount();
                    finderSwitchCommentRoleStruct.f156121h = (long) Br0.getCommentCount();
                    finderSwitchCommentRoleStruct.f156122i = (long) Br0.getFriendLikeCount();
                    finderSwitchCommentRoleStruct.f156119f = (long) i;
                    finderSwitchCommentRoleStruct.f156123j = (long) scene;
                    finderSwitchCommentRoleStruct.mo86054n();
                    y0Var.Ec0(finderSwitchCommentRoleStruct);
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: ur1.g$f */
    public static final class C65474f implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C65468g f188425d;

        public C65474f(C65468g gVar) {
            this.f188425d = gVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/view/builder/FinderTimelineDrawerBuilder$onBuildDrawerHeader$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C32226l<? super View, C13598b0> lVar = this.f188425d.f188414v;
            C87412m.m108593f(view, LocaleUtil.ITALIAN);
            ((C65475g) lVar).invoke(view);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/view/builder/FinderTimelineDrawerBuilder$onBuildDrawerHeader$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: ur1.g$g */
    public static final class C65475g extends C87413o implements C32226l<View, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C65468g f188426d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C65475g(C65468g gVar) {
            super(1);
            this.f188426d = gVar;
        }

        public Object invoke(Object obj) {
            C87412m.m108594g((View) obj, LocaleUtil.ITALIAN);
            this.f188426d.mo89585j().mo79715l();
            return C13598b0.f38549a;
        }
    }

    /* renamed from: ur1.g$h */
    public static final class C65476h implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C32224a<C13598b0> f188427d;

        public C65476h(C32224a<C13598b0> aVar) {
            this.f188427d = aVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/view/builder/FinderTimelineDrawerBuilder$showRetryView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            this.f188427d.invoke();
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/view/builder/FinderTimelineDrawerBuilder$showRetryView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    public C65468g(CommentDrawerContract.NPresenter nPresenter) {
        C87412m.m108594g(nPresenter, "presenter");
        this.f188399d = nPresenter;
    }

    /* renamed from: a */
    public void mo79737a(Context context, FrameLayout frameLayout, boolean z) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(frameLayout, "headerLayout");
        this.f188405j = frameLayout;
        View inflate = z ? C85868k2.m106137b(context).inflate(C0966R.C0971layout.f7034vn, frameLayout) : C85868k2.m106137b(context).inflate(C0966R.C0971layout.f7033vm, frameLayout);
        View findViewById = inflate.findViewById(C0966R.C0970id.f357887ca2);
        C87412m.m108593f(findViewById, "header.findViewById(R.id.drawer_header_tv)");
        this.f188401f = (TextView) findViewById;
        View findViewById2 = inflate.findViewById(C0966R.C0970id.d7u);
        C87412m.m108593f(findViewById2, "header.findViewById(R.id.finder_comment_error_tip)");
        this.f188412t = findViewById2;
        View findViewById3 = inflate.findViewById(C0966R.C0970id.d7s);
        C87412m.m108593f(findViewById3, "header.findViewById(R.id.finder_comment_error_msg)");
        this.f188413u = (TextView) findViewById3;
        TextView textView = this.f188401f;
        if (textView != null) {
            C85875k4.m106189j0(textView.getPaint(), 0.8f);
            View findViewById4 = inflate.findViewById(C0966R.C0970id.be_);
            if (findViewById4 != null) {
                findViewById4.setOnClickListener(new C65474f(this));
            }
            if (findViewById4 != null) {
                mo89585j().mo82528c(findViewById4);
                return;
            }
            return;
        }
        C87412m.m108603p("headerTitleTv");
        throw null;
    }

    /* renamed from: b */
    public void mo79738b(Context context, RefreshLoadMoreLayout refreshLoadMoreLayout) {
        Class cls = C11744g.class;
        C87412m.m108594g(context, "context");
        C87412m.m108594g(refreshLoadMoreLayout, "rlLayout");
        this.f188400e = true;
        this.f188402g = refreshLoadMoreLayout;
        View inflate = C85868k2.m106137b(context).inflate(C0966R.C0971layout.b7t, (ViewGroup) null);
        C87412m.m108593f(inflate, "getInflater(context).inf…t.load_more_footer, null)");
        refreshLoadMoreLayout.setLoadMoreFooter(inflate);
        RecyclerView recyclerView = refreshLoadMoreLayout.getRecyclerView();
        recyclerView.setHasFixedSize(true);
        recyclerView.setItemViewCacheSize(4);
        RecyclerView.C16616j itemAnimator = recyclerView.getItemAnimator();
        if (itemAnimator != null) {
            itemAnimator.f44810f = 0;
        }
        FinderLinearLayoutManager finderLinearLayoutManager = new FinderLinearLayoutManager(context);
        finderLinearLayoutManager.f162361x = -1;
        finderLinearLayoutManager.setItemPrefetchEnabled(true);
        recyclerView.setLayoutManager(finderLinearLayoutManager);
        recyclerView.setAdapter(this.f188399d.mo77328c(context));
        if (C85875k4.m106211z()) {
            recyclerView.setRecycledViewPool(((C11744g) C39818r.f106831a.mo62444c((MMFragmentActivity) context).mo75002a(cls)).f34395j);
        } else {
            recyclerView.setRecycledViewPool(((C11744g) C39818r.f106831a.mo62444c((MMFragmentActivity) context).mo75002a(cls)).f34394i);
        }
        recyclerView.mo17043c(new C65470b(context, this));
        RecyclerView.C0129l a = this.f188399d.mo77326a(context);
        if (a != null) {
            recyclerView.mo17085h0(a);
        }
        ViewParent parent = refreshLoadMoreLayout.getParent();
        C87412m.m108592e(parent, "null cannot be cast to non-null type android.view.View");
        mo89585j().getFooterLayout().addOnLayoutChangeListener(new C65471c(this, (View) parent));
    }

    /* renamed from: c */
    public void mo79739c(Context context, FrameLayout frameLayout, boolean z) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(frameLayout, "footerLayout");
        View inflate = C85868k2.m106137b(context).inflate(C0966R.C0971layout.f7032vl, frameLayout);
        frameLayout.setBackgroundResource(C0966R.color.ahf);
        View findViewById = inflate.findViewById(C0966R.C0970id.d7v);
        C87412m.m108593f(findViewById, "view.findViewById(R.id.finder_comment_footer)");
        this.f188403h = (FinderCommentFooter) findViewById;
        mo89586k().setBackClickListener(new C65472d(z, this));
        mo89586k().setSwitchSceneListener(new C65473e(this));
        mo89586k().setSelfProfile(mo89585j().f162031E);
        mo89586k().setScene(mo89585j().getSceneForReply());
        mo89586k().setBanSwitchScene(mo89585j().getBanSwitch());
        Log.m105924i("Finder.TimelineDrawerBuilder", "drawerFooter.scene " + mo89586k().getScene());
        mo89586k().mo79778l(false);
        mo89586k().mo79777k(false);
        mo89585j().setKeyboardHeightObserver(mo89586k());
        mo89585j().setFooter(mo89586k());
    }

    /* renamed from: d */
    public void mo79740d(Context context, FrameLayout frameLayout) {
        FrameLayout frameLayout2 = frameLayout;
        C87412m.m108594g(context, "context");
        C87412m.m108594g(frameLayout2, "loadingLayout");
        this.f188407o = frameLayout2;
        View inflate = LayoutInflater.from(context).inflate(C0966R.C0971layout.a9q, frameLayout2, true);
        View findViewById = inflate.findViewById(C0966R.C0970id.bjv);
        C87412m.m108593f(findViewById, "loadingContentLayout.fin…R.id.comment_loading_bar)");
        this.f188408p = findViewById;
        View findViewById2 = inflate.findViewById(C0966R.C0970id.hgc);
        C87412m.m108593f(findViewById2, "loadingContentLayout.fin…yId(R.id.no_comment_hint)");
        this.f188409q = findViewById2;
        View findViewById3 = inflate.findViewById(C0966R.C0970id.is5);
        C87412m.m108593f(findViewById3, "loadingContentLayout.fin….id.retry_comment_layout)");
        this.f188410r = findViewById3;
        View view = this.f188408p;
        if (view != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/view/builder/FinderTimelineDrawerBuilder", "onBuildLoading", "(Landroid/content/Context;Landroid/widget/FrameLayout;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/view/builder/FinderTimelineDrawerBuilder", "onBuildLoading", "(Landroid/content/Context;Landroid/widget/FrameLayout;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View n = mo89589n();
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(8);
            View view3 = n;
            C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/view/builder/FinderTimelineDrawerBuilder", "onBuildLoading", "(Landroid/content/Context;Landroid/widget/FrameLayout;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            n.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view3, "com/tencent/mm/plugin/finder/view/builder/FinderTimelineDrawerBuilder", "onBuildLoading", "(Landroid/content/Context;Landroid/widget/FrameLayout;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View o = mo89590o();
            C9556a aVar3 = new C9556a();
            aVar3.mo10233c(8);
            C117292a.m165358d(o, aVar3.mo10232b(), "com/tencent/mm/plugin/finder/view/builder/FinderTimelineDrawerBuilder", "onBuildLoading", "(Landroid/content/Context;Landroid/widget/FrameLayout;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            o.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
            C117292a.m165359e(o, "com/tencent/mm/plugin/finder/view/builder/FinderTimelineDrawerBuilder", "onBuildLoading", "(Landroid/content/Context;Landroid/widget/FrameLayout;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        C87412m.m108603p("loadingView");
        throw null;
    }

    /* renamed from: e */
    public void mo9497e(float f) {
        if (mo89585j().f162033G && mo89586k().getFooterMode() == 2) {
            Context context = this.f188411s;
            if (context != null) {
                ((MMFragmentActivity) context).hideVKB();
            } else {
                C87412m.m108603p("context");
                throw null;
            }
        }
    }

    /* renamed from: f */
    public void mo9498f() {
        this.f188399d.onDetach();
        mo89585j().mo82543k(this);
    }

    /* renamed from: g */
    public void mo3766g(boolean z, boolean z2, int i) {
        boolean z3 = z;
        boolean z4 = z2;
        if (!this.f188400e) {
            Log.m105928w("Finder.TimelineDrawerBuilder", "[onDrawerOpen] isOpen=" + z3 + " isBegin=" + z4 + " is nerver build before.");
            return;
        }
        if (z3 && z4) {
            if (mo89585j().getShowFooter()) {
                mo89586k().setVisibility(0);
                View findViewById = mo89587l().findViewById(C0966R.C0970id.d7o);
                if (findViewById != null) {
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(8);
                    View view = findViewById;
                    C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/view/builder/FinderTimelineDrawerBuilder", "onDrawerOpen", "(ZZI)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                    C117292a.m165359e(view, "com/tencent/mm/plugin/finder/view/builder/FinderTimelineDrawerBuilder", "onDrawerOpen", "(ZZI)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            } else {
                Log.m105924i("Finder.TimelineDrawerBuilder", "CommentInvisibleDebug commentDrawer.showFooter=" + mo89585j().getShowFooter() + " drawerFooter.visibility = View.GONE");
                mo89586k().setVisibility(8);
                if (mo89585j().getCloseComment()) {
                    View findViewById2 = mo89587l().findViewById(C0966R.C0970id.d7o);
                    if (findViewById2 != null) {
                        C9556a aVar2 = new C9556a();
                        ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                        aVar2.mo10233c(8);
                        View view2 = findViewById2;
                        C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/view/builder/FinderTimelineDrawerBuilder", "showCommentClose", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        findViewById2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                        C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/view/builder/FinderTimelineDrawerBuilder", "showCommentClose", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                    View n = mo89589n();
                    C9556a aVar3 = new C9556a();
                    ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
                    aVar3.mo10233c(8);
                    View view3 = n;
                    C117292a.m165358d(view3, aVar3.mo10232b(), "com/tencent/mm/plugin/finder/view/builder/FinderTimelineDrawerBuilder", "showCommentClose", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    n.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                    C117292a.m165359e(view3, "com/tencent/mm/plugin/finder/view/builder/FinderTimelineDrawerBuilder", "showCommentClose", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    View o = mo89590o();
                    C9556a aVar4 = new C9556a();
                    aVar4.mo10233c(8);
                    View view4 = o;
                    C117292a.m165358d(view4, aVar4.mo10232b(), "com/tencent/mm/plugin/finder/view/builder/FinderTimelineDrawerBuilder", "showCommentClose", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    o.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
                    C117292a.m165359e(view4, "com/tencent/mm/plugin/finder/view/builder/FinderTimelineDrawerBuilder", "showCommentClose", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    mo89588m().setVisibility(0);
                } else {
                    View findViewById3 = mo89587l().findViewById(C0966R.C0970id.d7o);
                    if (findViewById3 != null) {
                        C9556a aVar5 = new C9556a();
                        ThreadLocal<C9556a> threadLocal4 = C60958c.f173611a;
                        aVar5.mo10233c(8);
                        View view5 = findViewById3;
                        C117292a.m165358d(view5, aVar5.mo10232b(), "com/tencent/mm/plugin/finder/view/builder/FinderTimelineDrawerBuilder", "onDrawerOpen", "(ZZI)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        findViewById3.setVisibility(((Integer) aVar5.mo10231a(0)).intValue());
                        C117292a.m165359e(view5, "com/tencent/mm/plugin/finder/view/builder/FinderTimelineDrawerBuilder", "onDrawerOpen", "(ZZI)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                }
            }
            CommentDrawerContract.NPresenter nPresenter = this.f188399d;
            FinderCommentDrawer j = mo89585j();
            FinderItem feedObj = mo89585j().getFeedObj();
            C87412m.m108591d(feedObj);
            nPresenter.mo77320M(j, this, feedObj, mo89585j().getOnCloseDrawerCallback(), mo89585j().getScene(), mo89585j().f162033G, mo89585j().getRefCommentId(), mo89585j().getReplyCommentObj(), mo89585j().getUseCache(), mo89585j().getBlinkRefComment(), mo89585j().getBlinkDuration(), mo89585j().getCloseComment(), mo89585j().getOldVersion(), mo89585j().f162044S, i);
        } else if (!z3 && z4) {
            this.f188399d.onDetach();
            return;
        }
    }

    /* renamed from: h */
    public void mo79741h(RecyclerViewDrawer recyclerViewDrawer, int i) {
        C87412m.m108594g(recyclerViewDrawer, "drawer");
        Context context = recyclerViewDrawer.getContext();
        C87412m.m108593f(context, "drawer.context");
        this.f188411s = context;
        recyclerViewDrawer.setId(C0966R.C0970id.d7q);
        this.f188404i = (FinderCommentDrawer) recyclerViewDrawer;
        recyclerViewDrawer.setSquaresBackgroundResource(C0966R.C0969drawable.b_3);
        boolean z = true;
        recyclerViewDrawer.setEnableClickBackgroundToCloseDrawer(true);
        recyclerViewDrawer.mo82527b(this);
        mo89585j().setScene(i);
        FinderCommentDrawer j = mo89585j();
        if (mo89585j().getScene() != 1) {
            z = false;
        }
        j.setSelfProfile(z);
    }

    /* renamed from: i */
    public final void mo89584i(boolean z) {
        if (mo89585j().f162044S) {
            mo89591p().setEnableRefresh(false);
        } else if (z) {
            mo89591p().setEnableRefresh(true);
            if (mo89591p().getRefreshHeader() == null) {
                RefreshLoadMoreLayout p = mo89591p();
                Context context = this.f188411s;
                if (context != null) {
                    View inflate = C85868k2.m106137b(context).inflate(C0966R.C0971layout.f359941br1, (ViewGroup) null);
                    C87412m.m108593f(inflate, "getInflater(context).inf…out.refresh_header, null)");
                    p.setRefreshHeaderView(inflate);
                    return;
                }
                C87412m.m108603p("context");
                throw null;
            }
        } else {
            mo89591p().setEnableRefresh(false);
        }
    }

    /* renamed from: j */
    public final FinderCommentDrawer mo89585j() {
        FinderCommentDrawer finderCommentDrawer = this.f188404i;
        if (finderCommentDrawer != null) {
            return finderCommentDrawer;
        }
        C87412m.m108603p("commentDrawer");
        throw null;
    }

    /* renamed from: k */
    public final FinderCommentFooter mo89586k() {
        FinderCommentFooter finderCommentFooter = this.f188403h;
        if (finderCommentFooter != null) {
            return finderCommentFooter;
        }
        C87412m.m108603p("drawerFooter");
        throw null;
    }

    /* renamed from: l */
    public final FrameLayout mo89587l() {
        FrameLayout frameLayout = this.f188405j;
        if (frameLayout != null) {
            return frameLayout;
        }
        C87412m.m108603p("headerLayout");
        throw null;
    }

    /* renamed from: m */
    public final FrameLayout mo89588m() {
        FrameLayout frameLayout = this.f188407o;
        if (frameLayout != null) {
            return frameLayout;
        }
        C87412m.m108603p("loadingLayout");
        throw null;
    }

    /* renamed from: n */
    public final View mo89589n() {
        View view = this.f188409q;
        if (view != null) {
            return view;
        }
        C87412m.m108603p("nothingView");
        throw null;
    }

    /* renamed from: o */
    public final View mo89590o() {
        View view = this.f188410r;
        if (view != null) {
            return view;
        }
        C87412m.m108603p("retryView");
        throw null;
    }

    /* renamed from: p */
    public final RefreshLoadMoreLayout mo89591p() {
        RefreshLoadMoreLayout refreshLoadMoreLayout = this.f188402g;
        if (refreshLoadMoreLayout != null) {
            return refreshLoadMoreLayout;
        }
        C87412m.m108603p("rlLayout");
        throw null;
    }

    /* renamed from: q */
    public final void mo89592q() {
        mo89588m().setVisibility(8);
        mo89590o().setOnClickListener((View.OnClickListener) null);
    }

    /* renamed from: r */
    public final void mo89593r() {
        if (((C8808v4) C86312j.m106911c(C8808v4.class)).mo9635e()) {
            Log.m105924i("Finder.TimelineDrawerBuilder", "showLoading return for teen mode.");
            return;
        }
        mo89588m().setVisibility(0);
        View view = this.f188408p;
        if (view != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/view/builder/FinderTimelineDrawerBuilder", "showLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/finder/view/builder/FinderTimelineDrawerBuilder", "showLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View n = mo89589n();
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(8);
            View view2 = n;
            C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/view/builder/FinderTimelineDrawerBuilder", "showLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            n.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/view/builder/FinderTimelineDrawerBuilder", "showLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View o = mo89590o();
            C9556a aVar3 = new C9556a();
            aVar3.mo10233c(8);
            C117292a.m165358d(o, aVar3.mo10232b(), "com/tencent/mm/plugin/finder/view/builder/FinderTimelineDrawerBuilder", "showLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            o.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
            C117292a.m165359e(o, "com/tencent/mm/plugin/finder/view/builder/FinderTimelineDrawerBuilder", "showLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        C87412m.m108603p("loadingView");
        throw null;
    }

    /* renamed from: s */
    public final void mo89594s() {
        mo89588m().setVisibility(0);
        View view = this.f188408p;
        if (view != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/view/builder/FinderTimelineDrawerBuilder", "showNothingTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/finder/view/builder/FinderTimelineDrawerBuilder", "showNothingTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            if (mo89585j().getCloseComment()) {
                View n = mo89589n();
                C9556a aVar2 = new C9556a();
                aVar2.mo10233c(8);
                C117292a.m165358d(n, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/view/builder/FinderTimelineDrawerBuilder", "showNothingTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                n.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(n, "com/tencent/mm/plugin/finder/view/builder/FinderTimelineDrawerBuilder", "showNothingTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else {
                View n2 = mo89589n();
                C9556a aVar3 = new C9556a();
                aVar3.mo10233c(0);
                View view2 = n2;
                C117292a.m165358d(view2, aVar3.mo10232b(), "com/tencent/mm/plugin/finder/view/builder/FinderTimelineDrawerBuilder", "showNothingTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                n2.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/view/builder/FinderTimelineDrawerBuilder", "showNothingTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            View o = mo89590o();
            C9556a aVar4 = new C9556a();
            aVar4.mo10233c(8);
            View view3 = o;
            C117292a.m165358d(view3, aVar4.mo10232b(), "com/tencent/mm/plugin/finder/view/builder/FinderTimelineDrawerBuilder", "showNothingTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            o.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
            C117292a.m165359e(view3, "com/tencent/mm/plugin/finder/view/builder/FinderTimelineDrawerBuilder", "showNothingTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        C87412m.m108603p("loadingView");
        throw null;
    }

    /* renamed from: t */
    public final void mo89595t(C32224a<C13598b0> aVar) {
        C32224a<C13598b0> aVar2 = aVar;
        C87412m.m108594g(aVar2, "onClick");
        mo89588m().setVisibility(0);
        View view = this.f188408p;
        if (view != null) {
            C9556a aVar3 = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar3.mo10233c(8);
            C117292a.m165358d(view, aVar3.mo10232b(), "com/tencent/mm/plugin/finder/view/builder/FinderTimelineDrawerBuilder", "showRetryView", "(Lkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/finder/view/builder/FinderTimelineDrawerBuilder", "showRetryView", "(Lkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View n = mo89589n();
            C9556a aVar4 = new C9556a();
            aVar4.mo10233c(8);
            View view2 = n;
            C117292a.m165358d(view2, aVar4.mo10232b(), "com/tencent/mm/plugin/finder/view/builder/FinderTimelineDrawerBuilder", "showRetryView", "(Lkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            n.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/view/builder/FinderTimelineDrawerBuilder", "showRetryView", "(Lkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View o = mo89590o();
            C9556a aVar5 = new C9556a();
            aVar5.mo10233c(0);
            View view3 = o;
            C117292a.m165358d(view3, aVar5.mo10232b(), "com/tencent/mm/plugin/finder/view/builder/FinderTimelineDrawerBuilder", "showRetryView", "(Lkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            o.setVisibility(((Integer) aVar5.mo10231a(0)).intValue());
            C117292a.m165359e(view3, "com/tencent/mm/plugin/finder/view/builder/FinderTimelineDrawerBuilder", "showRetryView", "(Lkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            mo89590o().setOnClickListener(new C65476h(aVar2));
            return;
        }
        C87412m.m108603p("loadingView");
        throw null;
    }
}
