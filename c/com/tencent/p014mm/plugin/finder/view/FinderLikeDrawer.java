package com.tencent.p014mm.plugin.finder.view;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.MMFragmentActivity;
import com.tencent.p014mm.plugin.finder.feed.FinderFriendLikeListDrawerPresenter;
import com.tencent.p014mm.plugin.finder.feed.FinderLikeDrawerPresenter;
import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.view.RefreshLoadMoreLayout;
import com.tencent.p014mm.view.drawer.RecyclerViewDrawer;
import ds1.C7515a;
import er1.C7865r3;
import gy3.C8479f0;
import gy3.C8480h;
import gy3.C87412m;
import j20.C117292a;
import jq3.C60905o;
import k20.C60958c;
import k20.C9556a;
import kf1.C10047xb;
import kotlin.Metadata;
import pe3.C89349b;
import up1.C37521f;
import ur1.C14376d;
import ur1.C14378f;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001+B\u001b\b\u0016\u0012\u0006\u0010$\u001a\u00020#\u0012\b\u0010&\u001a\u0004\u0018\u00010%¢\u0006\u0004\b'\u0010(B#\b\u0016\u0012\u0006\u0010$\u001a\u00020#\u0012\b\u0010&\u001a\u0004\u0018\u00010%\u0012\u0006\u0010)\u001a\u00020\u0003¢\u0006\u0004\b'\u0010*R\"\u0010\n\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR$\u0010\u0012\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R$\u0010\u001a\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R$\u0010\"\u001a\u0004\u0018\u00010\u001b8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!¨\u0006,"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/view/FinderLikeDrawer;", "Lcom/tencent/mm/view/drawer/RecyclerViewDrawer;", "Lcom/tencent/mm/view/drawer/RecyclerViewDrawerSquares$c;", "", "z", "I", "getScene", "()I", "setScene", "(I)V", "scene", "Lur1/f;", "A", "Lur1/f;", "getBuilder", "()Lur1/f;", "setBuilder", "(Lur1/f;)V", "builder", "Lcom/tencent/mm/plugin/finder/storage/FinderItem;", "B", "Lcom/tencent/mm/plugin/finder/storage/FinderItem;", "getFeedObj", "()Lcom/tencent/mm/plugin/finder/storage/FinderItem;", "setFeedObj", "(Lcom/tencent/mm/plugin/finder/storage/FinderItem;)V", "feedObj", "Lpe3/b;", "C", "Lpe3/b;", "getLikeBuffer", "()Lpe3/b;", "setLikeBuffer", "(Lpe3/b;)V", "likeBuffer", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Companion", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.view.FinderLikeDrawer */
public final class FinderLikeDrawer extends RecyclerViewDrawer {

    /* renamed from: D */
    public static final Companion f17829D = new Companion((C8480h) null);

    /* renamed from: A */
    public C14378f f17830A;

    /* renamed from: B */
    public FinderItem f17831B;

    /* renamed from: C */
    public C89349b f17832C;

    /* renamed from: z */
    public int f17833z;

    /* renamed from: com.tencent.mm.plugin.finder.view.FinderLikeDrawer$Companion */
    public static final class Companion {

        /* renamed from: com.tencent.mm.plugin.finder.view.FinderLikeDrawer$Companion$a */
        public static final class C3964a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ Context f17834d;

            /* renamed from: e */
            public final /* synthetic */ FrameLayout.LayoutParams f17835e;

            /* renamed from: f */
            public final /* synthetic */ Window f17836f;

            /* renamed from: g */
            public final /* synthetic */ FinderLikeDrawer f17837g;

            /* renamed from: h */
            public final /* synthetic */ C8479f0<C14378f> f17838h;

            public C3964a(Context context, FrameLayout.LayoutParams layoutParams, Window window, FinderLikeDrawer finderLikeDrawer, C8479f0<C14378f> f0Var) {
                this.f17834d = context;
                this.f17835e = layoutParams;
                this.f17836f = window;
                this.f17837g = finderLikeDrawer;
                this.f17838h = f0Var;
            }

            public final void run() {
                int e = C75044y4.m89993e(this.f17834d);
                this.f17835e.bottomMargin = e;
                Log.m105924i("Finder.FinderLikeDrawer", "[initView] bottomMargin= " + e);
                View decorView = this.f17836f.getDecorView();
                C87412m.m108592e(decorView, "null cannot be cast to non-null type android.widget.FrameLayout");
                ((FrameLayout) decorView).addView(this.f17837g, this.f17835e);
                C14378f fVar = (C14378f) this.f17838h.f27484d;
                Context context = this.f17834d;
                FrameLayout headerLayout = this.f17837g.getHeaderLayout();
                fVar.getClass();
                C87412m.m108594g(context, "context");
                C87412m.m108594g(headerLayout, "headerLayout");
                View inflate = C85868k2.m106137b(context).inflate(C0966R.C0971layout.b5y, fVar.mo13678c().getHeaderLayout());
                View findViewById = inflate.findViewById(C0966R.C0970id.f357887ca2);
                C87412m.m108593f(findViewById, "header.findViewById(R.id.drawer_header_tv)");
                TextView textView = (TextView) findViewById;
                fVar.f39932e = textView;
                C85875k4.m106189j0(textView.getPaint(), 0.8f);
                View findViewById2 = inflate.findViewById(C0966R.C0970id.bel);
                ViewGroup viewGroup = (ViewGroup) inflate.findViewById(C0966R.C0970id.be_);
                View findViewById3 = inflate.findViewById(C0966R.C0970id.ca4);
                if (C85875k4.m106211z()) {
                    findViewById2.setBackgroundResource(C0966R.C0969drawable.a5o);
                } else {
                    findViewById2.setBackgroundResource(C0966R.C0969drawable.a5p);
                }
                viewGroup.setOnClickListener(new C14376d(fVar));
                fVar.f39931d.mo2534d(context, headerLayout);
                FinderLikeDrawer c = fVar.mo13678c();
                C87412m.m108593f(findViewById2, "closeBtn");
                c.mo82528c(findViewById2);
                FinderLikeDrawer c2 = fVar.mo13678c();
                C87412m.m108593f(findViewById3, "moreBtn");
                c2.mo82528c(findViewById3);
                C14378f fVar2 = (C14378f) this.f17838h.f27484d;
                Context context2 = this.f17834d;
                RefreshLoadMoreLayout centerLayout = this.f17837g.getCenterLayout();
                fVar2.getClass();
                C87412m.m108594g(context2, "context");
                C87412m.m108594g(centerLayout, "rlLayout");
                fVar2.f39933f = centerLayout;
                fVar2.f39931d.mo2535f(centerLayout);
                View inflate2 = C85868k2.m106137b(context2).inflate(C0966R.C0971layout.b7t, (ViewGroup) null);
                C87412m.m108593f(inflate2, "getInflater(context).inf…t.load_more_footer, null)");
                centerLayout.setLoadMoreFooter(inflate2);
                RecyclerView recyclerView = centerLayout.getRecyclerView();
                recyclerView.setHasFixedSize(true);
                RecyclerView.C16616j itemAnimator = recyclerView.getItemAnimator();
                if (itemAnimator != null) {
                    itemAnimator.f44810f = 0;
                }
                recyclerView.setLayoutManager(fVar2.f39931d.mo2532b(context2));
                recyclerView.mo17085h0(fVar2.f39931d.mo2531a(context2));
                recyclerView.setAdapter(fVar2.f39931d.mo2533c(context2));
                C14378f fVar3 = (C14378f) this.f17838h.f27484d;
                Context context3 = this.f17834d;
                FrameLayout loadingLayout = this.f17837g.getLoadingLayout();
                fVar3.getClass();
                C87412m.m108594g(context3, "context");
                C87412m.m108594g(loadingLayout, "loadingLayout");
                fVar3.f39935h = loadingLayout;
                View inflate3 = LayoutInflater.from(context3).inflate(C0966R.C0971layout.aax, loadingLayout, true);
                View findViewById4 = inflate3.findViewById(C0966R.C0970id.f358543fo1);
                C87412m.m108593f(findViewById4, "loadingContentLayout.fin…Id(R.id.like_loading_bar)");
                fVar3.f39936i = findViewById4;
                View findViewById5 = inflate3.findViewById(C0966R.C0970id.hgh);
                C87412m.m108593f(findViewById5, "loadingContentLayout.fin…ewById(R.id.no_like_hint)");
                fVar3.f39937j = (TextView) findViewById5;
                fVar3.mo13679d().setText(context3.getString(C0966R.string.fod));
                View findViewById6 = inflate3.findViewById(C0966R.C0970id.is9);
                C87412m.m108593f(findViewById6, "loadingContentLayout.fin…d(R.id.retry_like_layout)");
                fVar3.f39938n = findViewById6;
                View view = fVar3.f39936i;
                if (view != null) {
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(0);
                    View view2 = view;
                    C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/view/builder/FinderLikeDrawerBuilder", "onBuildLoading", "(Landroid/content/Context;Landroid/widget/FrameLayout;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                    C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/view/builder/FinderLikeDrawerBuilder", "onBuildLoading", "(Landroid/content/Context;Landroid/widget/FrameLayout;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    fVar3.mo13679d().setVisibility(8);
                    View h = fVar3.mo13680h();
                    C9556a aVar2 = new C9556a();
                    aVar2.mo10233c(8);
                    View view3 = h;
                    C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/view/builder/FinderLikeDrawerBuilder", "onBuildLoading", "(Landroid/content/Context;Landroid/widget/FrameLayout;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    h.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                    C117292a.m165359e(view3, "com/tencent/mm/plugin/finder/view/builder/FinderLikeDrawerBuilder", "onBuildLoading", "(Landroid/content/Context;Landroid/widget/FrameLayout;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    return;
                }
                C87412m.m108603p("loadingView");
                throw null;
            }
        }

        public Companion(C8480h hVar) {
        }

        /* renamed from: a */
        public final FinderLikeDrawer mo4621a(Context context, Window window, int i) {
            C87412m.m108594g(context, "context");
            C87412m.m108594g(window, "window");
            Log.m105924i("Finder.FinderLikeDrawer", "createDrawerToAttachWindow ");
            FinderLikeDrawer finderLikeDrawer = new FinderLikeDrawer(context);
            finderLikeDrawer.setScene(i);
            C37521f.f99374d.getClass();
            if (C37521f.f99579z7.mo60266n().intValue() == 1) {
                finderLikeDrawer.setChangeBackgroundAlpha(false);
                finderLikeDrawer.setBackgroundColorRes(C0966R.color.ahf);
            }
            finderLikeDrawer.setTopOffset((int) (((float) C7865r3.f26468a.mo8968a()) * (((float) 1) - C7515a.f25777a.mo8637a(context))));
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            C8479f0 f0Var = new C8479f0();
            if (i == 1) {
                f0Var.f27484d = new C14378f(new FinderFriendLikeListDrawerPresenter(context));
            } else if (i == 2) {
                f0Var.f27484d = new C14378f(new FinderLikeDrawerPresenter());
            } else {
                f0Var.f27484d = new C14378f(new FinderLikeDrawerPresenter());
            }
            C14378f fVar = (C14378f) f0Var.f27484d;
            fVar.getClass();
            Context context2 = finderLikeDrawer.getContext();
            C87412m.m108593f(context2, "drawer.context");
            fVar.f39939o = context2;
            int scene = fVar.f39931d.getScene();
            if (scene == 1) {
                finderLikeDrawer.setId(C0966R.C0970id.d96);
            } else if (scene == 2) {
                finderLikeDrawer.setId(C0966R.C0970id.f358072d93);
            }
            fVar.f39934g = finderLikeDrawer;
            finderLikeDrawer.setSquaresBackgroundResource(C0966R.C0969drawable.b_3);
            finderLikeDrawer.setEnableClickBackgroundToCloseDrawer(true);
            finderLikeDrawer.mo82527b(fVar);
            finderLikeDrawer.setBuilder((C14378f) f0Var.f27484d);
            window.getDecorView().post(new C3964a(context, layoutParams, window, finderLikeDrawer, f0Var));
            if (context instanceof MMFragmentActivity) {
                ((MMFragmentActivity) context).getLifecycle().addObserver(new FinderLikeDrawer$Companion$createDrawerToAttachWindow$2(finderLikeDrawer, context));
            }
            return finderLikeDrawer;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderLikeDrawer(Context context) {
        super(context);
        C87412m.m108594g(context, "context");
    }

    public final C14378f getBuilder() {
        return this.f17830A;
    }

    public final FinderItem getFeedObj() {
        return this.f17831B;
    }

    public final C89349b getLikeBuffer() {
        return this.f17832C;
    }

    public final int getScene() {
        return this.f17833z;
    }

    /* renamed from: l */
    public final void mo4615l() {
        if (mo82541i()) {
            mo82540h(true);
        }
    }

    /* renamed from: m */
    public final void mo4616m(C60905o oVar, FinderItem finderItem, C89349b bVar, int i) {
        C87412m.m108594g(finderItem, "feedObj");
        if (!mo82541i()) {
            this.f17831B = finderItem;
            this.f17832C = bVar;
            C14378f fVar = this.f17830A;
            FinderLikeDrawerPresenter finderLikeDrawerPresenter = null;
            C10047xb xbVar = fVar != null ? fVar.f39931d : null;
            if (xbVar instanceof FinderLikeDrawerPresenter) {
                finderLikeDrawerPresenter = (FinderLikeDrawerPresenter) xbVar;
            }
            if (finderLikeDrawerPresenter != null) {
                finderLikeDrawerPresenter.f13105i = oVar;
            }
            if (i > 0) {
                int f = C75044y4.m89994f(getContext());
                int e = C75044y4.m89993e(getContext());
                C7865r3 r3Var = C7865r3.f26468a;
                int a = (r3Var.mo8968a() - f) - e;
                Context context = getContext();
                C87412m.m108592e(context, "null cannot be cast to non-null type android.app.Activity");
                View decorView = ((Activity) context).getWindow().getDecorView();
                C87412m.m108593f(decorView, "context as Activity).window.decorView");
                setTopOffset((decorView.getSystemUiVisibility() & 1024) > 0 ? r3Var.mo8969b(getContext()) - i : Math.min((int) (((float) r3Var.mo8968a()) * 0.4f), (a - i) + f));
            }
            mo82542j(true, true, 0);
        }
    }

    public final void setBuilder(C14378f fVar) {
        this.f17830A = fVar;
    }

    public final void setFeedObj(FinderItem finderItem) {
        this.f17831B = finderItem;
    }

    public final void setLikeBuffer(C89349b bVar) {
        this.f17832C = bVar;
    }

    public final void setScene(int i) {
        this.f17833z = i;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderLikeDrawer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderLikeDrawer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
    }
}
