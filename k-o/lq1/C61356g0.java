package lq1;

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
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.MMFragmentActivity;
import com.tencent.p014mm.plugin.finder.uniComments.UniCommentDrawer;
import com.tencent.p014mm.plugin.finder.uniComments.UniCommentFooter;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.view.RefreshLoadMoreLayout;
import com.tencent.p014mm.view.drawer.RecyclerViewDrawer;
import com.tencent.p014mm.view.drawer.RecyclerViewDrawerSquares;
import di3.C86312j;
import er1.C58784w3;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import ht1.C8808v4;
import j20.C117292a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;
import os1.C11744g;
import qq1.C63317a;
import rx3.C13598b0;
import up1.C37521f;

/* renamed from: lq1.g0 */
public class C61356g0 implements UniCommentDrawer.C56448a, RecyclerViewDrawerSquares.C45117c {

    /* renamed from: d */
    public final C61364h f174524d;

    /* renamed from: e */
    public TextView f174525e;

    /* renamed from: f */
    public RefreshLoadMoreLayout f174526f;

    /* renamed from: g */
    public UniCommentFooter f174527g;

    /* renamed from: h */
    public UniCommentDrawer f174528h;

    /* renamed from: i */
    public FrameLayout f174529i;

    /* renamed from: j */
    public FrameLayout f174530j;

    /* renamed from: n */
    public View f174531n;

    /* renamed from: o */
    public View f174532o;

    /* renamed from: p */
    public View f174533p;

    /* renamed from: q */
    public Context f174534q;

    /* renamed from: r */
    public View f174535r;

    /* renamed from: s */
    public C32226l<? super View, C13598b0> f174536s = new C61363g(this);

    /* renamed from: t */
    public C32224a<C13598b0> f174537t = new C61357a(this);

    /* renamed from: lq1.g0$a */
    public static final class C61357a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C61356g0 f174538d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C61357a(C61356g0 g0Var) {
            super(0);
            this.f174538d = g0Var;
        }

        public Object invoke() {
            this.f174538d.mo86312i().mo79202l();
            return C13598b0.f38549a;
        }
    }

    /* renamed from: lq1.g0$b */
    public static final class C61358b extends RecyclerView.C0130p {

        /* renamed from: d */
        public int f174539d;

        /* renamed from: e */
        public final /* synthetic */ C61356g0 f174540e;

        /* renamed from: f */
        public final /* synthetic */ Context f174541f;

        public C61358b(C61356g0 g0Var, Context context) {
            this.f174540e = g0Var;
            this.f174541f = context;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:8:0x0036, code lost:
            if (r10 != 5) goto L_0x0060;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onScrollStateChanged(androidx.recyclerview.widget.RecyclerView r9, int r10) {
            /*
                r8 = this;
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r0.add(r9)
                java.lang.Integer r1 = java.lang.Integer.valueOf(r10)
                r0.add(r1)
                java.lang.Object[] r7 = r0.toArray()
                r0.clear()
                java.lang.String r2 = "com/tencent/mm/plugin/finder/uniComments/UniTimelineDrawerBuilder$onBuildDrawerBody$1"
                java.lang.String r3 = "androidx/recyclerview/widget/RecyclerView$OnScrollListener"
                java.lang.String r4 = "onScrollStateChanged"
                java.lang.String r5 = "(Landroidx/recyclerview/widget/RecyclerView;I)V"
                r6 = r8
                j20.C117292a.m165356b(r2, r3, r4, r5, r6, r7)
                java.lang.String r0 = "recyclerView"
                gy3.C87412m.m108594g(r9, r0)
                super.onScrollStateChanged(r9, r10)
                if (r10 == 0) goto L_0x004a
                r0 = 1
                r1 = 3
                if (r10 == r0) goto L_0x0039
                if (r10 == r1) goto L_0x0039
                r0 = 4
                if (r10 == r0) goto L_0x004a
                r0 = 5
                if (r10 == r0) goto L_0x004a
                goto L_0x0060
            L_0x0039:
                int r9 = r8.f174539d
                if (r9 == r1) goto L_0x0060
                android.content.Context r9 = r8.f174541f
                java.lang.String r0 = "null cannot be cast to non-null type com.tencent.mm.ui.MMFragmentActivity"
                gy3.C87412m.m108592e(r9, r0)
                com.tencent.mm.ui.MMFragmentActivity r9 = (com.tencent.p014mm.p136ui.MMFragmentActivity) r9
                r9.hideVKB()
                goto L_0x0060
            L_0x004a:
                androidx.recyclerview.widget.RecyclerView$LayoutManager r9 = r9.getLayoutManager()
                java.lang.String r0 = "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager"
                gy3.C87412m.m108592e(r9, r0)
                androidx.recyclerview.widget.LinearLayoutManager r9 = (androidx.recyclerview.widget.LinearLayoutManager) r9
                lq1.g0 r0 = r8.f174540e
                lq1.h r0 = r0.f174524d
                int r9 = r9.mo16959E()
                r0.mo79247u1(r9)
            L_0x0060:
                r8.f174539d = r10
                java.lang.String r9 = "com/tencent/mm/plugin/finder/uniComments/UniTimelineDrawerBuilder$onBuildDrawerBody$1"
                java.lang.String r10 = "androidx/recyclerview/widget/RecyclerView$OnScrollListener"
                java.lang.String r0 = "onScrollStateChanged"
                java.lang.String r1 = "(Landroidx/recyclerview/widget/RecyclerView;I)V"
                j20.C117292a.m165361g(r8, r9, r10, r0, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: lq1.C61356g0.C61358b.onScrollStateChanged(androidx.recyclerview.widget.RecyclerView, int):void");
        }

        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(recyclerView);
            arrayList.add(Integer.valueOf(i));
            arrayList.add(Integer.valueOf(i2));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/uniComments/UniTimelineDrawerBuilder$onBuildDrawerBody$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
            super.onScrolled(recyclerView, i, i2);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/uniComments/UniTimelineDrawerBuilder$onBuildDrawerBody$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
        }
    }

    /* renamed from: lq1.g0$c */
    public static final class C61359c implements View.OnLayoutChangeListener {

        /* renamed from: d */
        public final /* synthetic */ C61356g0 f174542d;

        /* renamed from: e */
        public final /* synthetic */ View f174543e;

        public C61359c(C61356g0 g0Var, View view) {
            this.f174542d = g0Var;
            this.f174543e = view;
        }

        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            this.f174542d.mo86312i().getFooterLayout().removeOnLayoutChangeListener(this);
            View view2 = this.f174543e;
            view2.setPadding(view2.getPaddingLeft(), this.f174543e.getPaddingTop(), this.f174543e.getPaddingRight(), this.f174542d.mo86314k().getCommentEditTextLayout().getHeight());
            this.f174543e.requestLayout();
            Log.m105924i("MicroMsg.MusicUni.TimelineDrawerBuilder", "bottomMargin=" + this.f174542d.mo86314k().getCommentEditTextLayout().getHeight() + " paddingBottom=" + this.f174543e.getPaddingBottom());
        }
    }

    /* renamed from: lq1.g0$d */
    public static final class C61360d extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ boolean f174544d;

        /* renamed from: e */
        public final /* synthetic */ C61356g0 f174545e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C61360d(boolean z, C61356g0 g0Var) {
            super(0);
            this.f174544d = z;
            this.f174545e = g0Var;
        }

        public Object invoke() {
            if (!this.f174544d || this.f174545e.mo86314k().getFooterMode() != 2) {
                ((C61357a) this.f174545e.f174537t).invoke();
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: lq1.g0$e */
    public static final class C61361e extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C61356g0 f174546d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C61361e(C61356g0 g0Var) {
            super(0);
            this.f174546d = g0Var;
        }

        public Object invoke() {
            UniCommentDrawer i = this.f174546d.mo86312i();
            UniCommentFooter uniCommentFooter = i.f161364N;
            if (uniCommentFooter != null) {
                uniCommentFooter.getScene();
            }
            C58784w3 w3Var = C58784w3.f168295a;
            int i2 = i.f161354D;
            w3Var.getClass();
            int i3 = 2;
            if (i2 == 2) {
                i3 = 1;
            }
            i.f161354D = i3;
            C37521f.f99374d.mo61176c0(i3);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: lq1.g0$f */
    public static final class C61362f implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C61356g0 f174547d;

        public C61362f(C61356g0 g0Var) {
            this.f174547d = g0Var;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/uniComments/UniTimelineDrawerBuilder$onBuildDrawerHeader$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C32226l<? super View, C13598b0> lVar = this.f174547d.f174536s;
            C87412m.m108593f(view, LocaleUtil.ITALIAN);
            ((C61363g) lVar).invoke(view);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/uniComments/UniTimelineDrawerBuilder$onBuildDrawerHeader$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: lq1.g0$g */
    public static final class C61363g extends C87413o implements C32226l<View, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C61356g0 f174548d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C61363g(C61356g0 g0Var) {
            super(1);
            this.f174548d = g0Var;
        }

        public Object invoke(Object obj) {
            C87412m.m108594g((View) obj, LocaleUtil.ITALIAN);
            this.f174548d.mo86312i().mo79202l();
            return C13598b0.f38549a;
        }
    }

    public C61356g0(C61364h hVar) {
        C87412m.m108594g(hVar, "presenter");
        this.f174524d = hVar;
    }

    /* renamed from: a */
    public void mo79221a(Context context, FrameLayout frameLayout, boolean z) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(frameLayout, "headerLayout");
        this.f174529i = frameLayout;
        View inflate = z ? C85868k2.m106137b(context).inflate(C0966R.C0971layout.cmr, frameLayout) : C85868k2.m106137b(context).inflate(C0966R.C0971layout.cmq, frameLayout);
        View findViewById = inflate.findViewById(C0966R.C0970id.f357887ca2);
        C87412m.m108593f(findViewById, "header.findViewById(R.id.drawer_header_tv)");
        this.f174525e = (TextView) findViewById;
        View findViewById2 = inflate.findViewById(C0966R.C0970id.d7u);
        C87412m.m108593f(findViewById2, "header.findViewById(R.id.finder_comment_error_tip)");
        this.f174535r = findViewById2;
        View findViewById3 = inflate.findViewById(C0966R.C0970id.d7s);
        C87412m.m108593f(findViewById3, "header.findViewById(R.id.finder_comment_error_msg)");
        TextView textView = (TextView) findViewById3;
        C85875k4.m106189j0(mo86316m().getPaint(), 0.8f);
        View findViewById4 = inflate.findViewById(C0966R.C0970id.be_);
        if (findViewById4 != null) {
            findViewById4.setOnClickListener(new C61362f(this));
        }
        if (findViewById4 != null) {
            mo86312i().mo82528c(findViewById4);
        }
    }

    /* renamed from: b */
    public void mo79222b(Context context, RefreshLoadMoreLayout refreshLoadMoreLayout) {
        Class cls = C11744g.class;
        C87412m.m108594g(context, "context");
        C87412m.m108594g(refreshLoadMoreLayout, "rlLayout");
        this.f174526f = refreshLoadMoreLayout;
        View inflate = C85868k2.m106137b(context).inflate(C0966R.C0971layout.cmw, (ViewGroup) null);
        C87412m.m108593f(inflate, "getInflater(context).inf…i_load_more_footer, null)");
        refreshLoadMoreLayout.setLoadMoreFooter(inflate);
        RecyclerView recyclerView = refreshLoadMoreLayout.getRecyclerView();
        recyclerView.setHasFixedSize(true);
        recyclerView.setItemViewCacheSize(4);
        RecyclerView.C16616j itemAnimator = recyclerView.getItemAnimator();
        if (itemAnimator != null) {
            itemAnimator.f44810f = 0;
        }
        recyclerView.setLayoutManager(new LinearLayoutManager(context));
        recyclerView.setAdapter(this.f174524d.mo79231c(context));
        if (C85875k4.m106211z()) {
            recyclerView.setRecycledViewPool(((C11744g) C39818r.f106831a.mo62444c((MMFragmentActivity) context).mo75002a(cls)).f34395j);
        } else {
            recyclerView.setRecycledViewPool(((C11744g) C39818r.f106831a.mo62444c((MMFragmentActivity) context).mo75002a(cls)).f34394i);
        }
        recyclerView.mo17043c(new C61358b(this, context));
        RecyclerView.C0129l a = this.f174524d.mo79230a(context);
        if (a != null) {
            recyclerView.mo17085h0(a);
        }
        ViewParent parent = refreshLoadMoreLayout.getParent();
        C87412m.m108592e(parent, "null cannot be cast to non-null type android.view.View");
        mo86312i().getFooterLayout().addOnLayoutChangeListener(new C61359c(this, (View) parent));
    }

    /* renamed from: c */
    public void mo79223c(Context context, FrameLayout frameLayout, boolean z) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(frameLayout, "footerLayout");
        View findViewById = C85868k2.m106137b(context).inflate(C0966R.C0971layout.cmp, frameLayout).findViewById(C0966R.C0970id.d7v);
        C87412m.m108593f(findViewById, "view.findViewById(R.id.finder_comment_footer)");
        this.f174527g = (UniCommentFooter) findViewById;
        mo86314k().setBackClickListener(new C61360d(z, this));
        mo86314k().setSwitchSceneListener(new C61361e(this));
        mo86314k().setSelfProfile(mo86312i().f161355E);
        mo86314k().setScene(mo86312i().getSceneForReply());
        mo86314k().setBanSwitchScene(mo86312i().getBanSwitch());
        Log.m105924i("MicroMsg.MusicUni.TimelineDrawerBuilder", "drawerFooter.scene " + mo86314k().getScene());
        mo86314k().mo79286l(false);
        mo86314k().mo79285k(false);
        mo86312i().setKeyboardHeightObserver(mo86314k());
        mo86312i().setFooter(mo86314k());
    }

    /* renamed from: d */
    public void mo79224d(Context context, FrameLayout frameLayout) {
        FrameLayout frameLayout2 = frameLayout;
        C87412m.m108594g(context, "context");
        C87412m.m108594g(frameLayout2, "loadingLayout");
        this.f174530j = frameLayout2;
        View inflate = LayoutInflater.from(context).inflate(C0966R.C0971layout.cmv, frameLayout2, true);
        View findViewById = inflate.findViewById(C0966R.C0970id.bjv);
        C87412m.m108593f(findViewById, "loadingContentLayout.fin…R.id.comment_loading_bar)");
        this.f174531n = findViewById;
        View findViewById2 = inflate.findViewById(C0966R.C0970id.hgc);
        C87412m.m108593f(findViewById2, "loadingContentLayout.fin…yId(R.id.no_comment_hint)");
        this.f174532o = findViewById2;
        View findViewById3 = inflate.findViewById(C0966R.C0970id.is5);
        C87412m.m108593f(findViewById3, "loadingContentLayout.fin….id.retry_comment_layout)");
        this.f174533p = findViewById3;
        View view = this.f174531n;
        if (view != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/uniComments/UniTimelineDrawerBuilder", "onBuildLoading", "(Landroid/content/Context;Landroid/widget/FrameLayout;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/uniComments/UniTimelineDrawerBuilder", "onBuildLoading", "(Landroid/content/Context;Landroid/widget/FrameLayout;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View o = mo86318o();
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(8);
            View view3 = o;
            C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/uniComments/UniTimelineDrawerBuilder", "onBuildLoading", "(Landroid/content/Context;Landroid/widget/FrameLayout;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            o.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view3, "com/tencent/mm/plugin/finder/uniComments/UniTimelineDrawerBuilder", "onBuildLoading", "(Landroid/content/Context;Landroid/widget/FrameLayout;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View p = mo86319p();
            C9556a aVar3 = new C9556a();
            aVar3.mo10233c(8);
            C117292a.m165358d(p, aVar3.mo10232b(), "com/tencent/mm/plugin/finder/uniComments/UniTimelineDrawerBuilder", "onBuildLoading", "(Landroid/content/Context;Landroid/widget/FrameLayout;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
            C117292a.m165359e(p, "com/tencent/mm/plugin/finder/uniComments/UniTimelineDrawerBuilder", "onBuildLoading", "(Landroid/content/Context;Landroid/widget/FrameLayout;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        C87412m.m108603p("loadingView");
        throw null;
    }

    /* renamed from: e */
    public void mo9497e(float f) {
        if (mo86312i().f161357G && mo86314k().getFooterMode() == 2) {
            ((MMFragmentActivity) mo86313j()).hideVKB();
        }
    }

    /* renamed from: f */
    public void mo9498f() {
        this.f174524d.onDetach();
        mo86312i().mo82543k(this);
    }

    /* renamed from: g */
    public void mo3766g(boolean z, boolean z2, int i) {
        if (z && z2) {
            if (mo86312i().getShowFooter()) {
                mo86314k().setVisibility(0);
                View findViewById = mo86315l().findViewById(C0966R.C0970id.d7o);
                if (findViewById != null) {
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(8);
                    View view = findViewById;
                    C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/uniComments/UniTimelineDrawerBuilder", "onDrawerOpen", "(ZZI)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                    C117292a.m165359e(view, "com/tencent/mm/plugin/finder/uniComments/UniTimelineDrawerBuilder", "onDrawerOpen", "(ZZI)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            } else {
                mo86314k().setVisibility(8);
                if (mo86312i().getCloseComment()) {
                    View findViewById2 = mo86315l().findViewById(C0966R.C0970id.d7o);
                    if (findViewById2 != null) {
                        C9556a aVar2 = new C9556a();
                        ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                        aVar2.mo10233c(8);
                        View view2 = findViewById2;
                        C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/uniComments/UniTimelineDrawerBuilder", "showCommentClose", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        findViewById2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                        C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/uniComments/UniTimelineDrawerBuilder", "showCommentClose", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                    View o = mo86318o();
                    C9556a aVar3 = new C9556a();
                    ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
                    aVar3.mo10233c(8);
                    View view3 = o;
                    C117292a.m165358d(view3, aVar3.mo10232b(), "com/tencent/mm/plugin/finder/uniComments/UniTimelineDrawerBuilder", "showCommentClose", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    o.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                    C117292a.m165359e(view3, "com/tencent/mm/plugin/finder/uniComments/UniTimelineDrawerBuilder", "showCommentClose", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    View p = mo86319p();
                    C9556a aVar4 = new C9556a();
                    aVar4.mo10233c(8);
                    View view4 = p;
                    C117292a.m165358d(view4, aVar4.mo10232b(), "com/tencent/mm/plugin/finder/uniComments/UniTimelineDrawerBuilder", "showCommentClose", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    p.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
                    C117292a.m165359e(view4, "com/tencent/mm/plugin/finder/uniComments/UniTimelineDrawerBuilder", "showCommentClose", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    mo86317n().setVisibility(0);
                } else {
                    View findViewById3 = mo86315l().findViewById(C0966R.C0970id.d7o);
                    if (findViewById3 != null) {
                        C9556a aVar5 = new C9556a();
                        ThreadLocal<C9556a> threadLocal4 = C60958c.f173611a;
                        aVar5.mo10233c(8);
                        View view5 = findViewById3;
                        C117292a.m165358d(view5, aVar5.mo10232b(), "com/tencent/mm/plugin/finder/uniComments/UniTimelineDrawerBuilder", "onDrawerOpen", "(ZZI)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        findViewById3.setVisibility(((Integer) aVar5.mo10231a(0)).intValue());
                        C117292a.m165359e(view5, "com/tencent/mm/plugin/finder/uniComments/UniTimelineDrawerBuilder", "onDrawerOpen", "(ZZI)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                }
            }
            C61364h hVar = this.f174524d;
            UniCommentDrawer i2 = mo86312i();
            C63317a feedObj = mo86312i().getFeedObj();
            C87412m.m108591d(feedObj);
            hVar.mo79225B0(i2, this, feedObj, mo86312i().getOnCloseDrawerCallback(), mo86312i().getScene(), mo86312i().f161357G, mo86312i().getRefCommentId(), mo86312i().getReplyCommentObj(), mo86312i().getUseCache(), mo86312i().getBlinkRefComment(), mo86312i().getCloseComment(), mo86312i().getOldVersion(), mo86312i().f161367R);
        } else if (!z && z2) {
            this.f174524d.onDetach();
        }
    }

    /* renamed from: h */
    public final void mo86311h(boolean z) {
        if (mo86312i().f161367R) {
            mo86320q().setEnableRefresh(false);
        } else if (z) {
            mo86320q().setEnableRefresh(true);
            if (mo86320q().getRefreshHeader() == null) {
                RefreshLoadMoreLayout q = mo86320q();
                View inflate = C85868k2.m106137b(mo86313j()).inflate(C0966R.C0971layout.cmx, (ViewGroup) null);
                C87412m.m108593f(inflate, "getInflater(context).inf…uni_refresh_header, null)");
                q.setRefreshHeaderView(inflate);
            }
        } else {
            mo86320q().setEnableRefresh(false);
        }
    }

    /* renamed from: i */
    public final UniCommentDrawer mo86312i() {
        UniCommentDrawer uniCommentDrawer = this.f174528h;
        if (uniCommentDrawer != null) {
            return uniCommentDrawer;
        }
        C87412m.m108603p("commentDrawer");
        throw null;
    }

    /* renamed from: j */
    public final Context mo86313j() {
        Context context = this.f174534q;
        if (context != null) {
            return context;
        }
        C87412m.m108603p("context");
        throw null;
    }

    /* renamed from: k */
    public final UniCommentFooter mo86314k() {
        UniCommentFooter uniCommentFooter = this.f174527g;
        if (uniCommentFooter != null) {
            return uniCommentFooter;
        }
        C87412m.m108603p("drawerFooter");
        throw null;
    }

    /* renamed from: l */
    public final FrameLayout mo86315l() {
        FrameLayout frameLayout = this.f174529i;
        if (frameLayout != null) {
            return frameLayout;
        }
        C87412m.m108603p("headerLayout");
        throw null;
    }

    /* renamed from: m */
    public final TextView mo86316m() {
        TextView textView = this.f174525e;
        if (textView != null) {
            return textView;
        }
        C87412m.m108603p("headerTitleTv");
        throw null;
    }

    /* renamed from: n */
    public final FrameLayout mo86317n() {
        FrameLayout frameLayout = this.f174530j;
        if (frameLayout != null) {
            return frameLayout;
        }
        C87412m.m108603p("loadingLayout");
        throw null;
    }

    /* renamed from: o */
    public final View mo86318o() {
        View view = this.f174532o;
        if (view != null) {
            return view;
        }
        C87412m.m108603p("nothingView");
        throw null;
    }

    /* renamed from: p */
    public final View mo86319p() {
        View view = this.f174533p;
        if (view != null) {
            return view;
        }
        C87412m.m108603p("retryView");
        throw null;
    }

    /* renamed from: q */
    public final RefreshLoadMoreLayout mo86320q() {
        RefreshLoadMoreLayout refreshLoadMoreLayout = this.f174526f;
        if (refreshLoadMoreLayout != null) {
            return refreshLoadMoreLayout;
        }
        C87412m.m108603p("rlLayout");
        throw null;
    }

    /* renamed from: r */
    public void mo86321r(RecyclerViewDrawer recyclerViewDrawer, int i) {
        C87412m.m108594g(recyclerViewDrawer, "drawer");
        Context context = recyclerViewDrawer.getContext();
        C87412m.m108593f(context, "drawer.context");
        this.f174534q = context;
        recyclerViewDrawer.setId(C0966R.C0970id.d7q);
        this.f174528h = (UniCommentDrawer) recyclerViewDrawer;
        recyclerViewDrawer.setSquaresBackgroundResource(C0966R.C0969drawable.f5051v9);
        boolean z = true;
        recyclerViewDrawer.setEnableClickBackgroundToCloseDrawer(true);
        recyclerViewDrawer.mo82527b(this);
        mo86312i().setScene(i);
        UniCommentDrawer i2 = mo86312i();
        if (mo86312i().getScene() != 1) {
            z = false;
        }
        i2.setSelfProfile(z);
    }

    /* renamed from: s */
    public final void mo86322s() {
        if (((C8808v4) C86312j.m106911c(C8808v4.class)).mo9635e()) {
            Log.m105924i("MicroMsg.MusicUni.TimelineDrawerBuilder", "showLoading return for teen mode.");
            return;
        }
        mo86317n().setVisibility(0);
        View view = this.f174531n;
        if (view != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/uniComments/UniTimelineDrawerBuilder", "showLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/finder/uniComments/UniTimelineDrawerBuilder", "showLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View o = mo86318o();
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(8);
            View view2 = o;
            C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/uniComments/UniTimelineDrawerBuilder", "showLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            o.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/uniComments/UniTimelineDrawerBuilder", "showLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View p = mo86319p();
            C9556a aVar3 = new C9556a();
            aVar3.mo10233c(8);
            C117292a.m165358d(p, aVar3.mo10232b(), "com/tencent/mm/plugin/finder/uniComments/UniTimelineDrawerBuilder", "showLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
            C117292a.m165359e(p, "com/tencent/mm/plugin/finder/uniComments/UniTimelineDrawerBuilder", "showLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        C87412m.m108603p("loadingView");
        throw null;
    }
}
