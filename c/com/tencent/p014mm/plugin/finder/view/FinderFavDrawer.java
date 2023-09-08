package com.tencent.p014mm.plugin.finder.view;

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
import k20.C60958c;
import k20.C9556a;
import kf1.C61028h1;
import kotlin.Metadata;
import up1.C37521f;
import ur1.C65466a;
import ur1.C65467c;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001#B\u001b\b\u0016\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b\u001f\u0010 B#\b\u0016\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\u0006\u0010!\u001a\u00020\u0003¢\u0006\u0004\b\u001f\u0010\"R\"\u0010\n\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR$\u0010\u0012\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R$\u0010\u001a\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006$"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/view/FinderFavDrawer;", "Lcom/tencent/mm/view/drawer/RecyclerViewDrawer;", "Lcom/tencent/mm/view/drawer/RecyclerViewDrawerSquares$c;", "", "z", "I", "getScene", "()I", "setScene", "(I)V", "scene", "Lur1/c;", "A", "Lur1/c;", "getBuilder", "()Lur1/c;", "setBuilder", "(Lur1/c;)V", "builder", "Lcom/tencent/mm/plugin/finder/storage/FinderItem;", "B", "Lcom/tencent/mm/plugin/finder/storage/FinderItem;", "getFeedObj", "()Lcom/tencent/mm/plugin/finder/storage/FinderItem;", "setFeedObj", "(Lcom/tencent/mm/plugin/finder/storage/FinderItem;)V", "feedObj", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Companion", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.view.FinderFavDrawer */
public final class FinderFavDrawer extends RecyclerViewDrawer {

    /* renamed from: C */
    public static final Companion f162097C = new Companion((C8480h) null);

    /* renamed from: A */
    public C65467c f162098A;

    /* renamed from: B */
    public FinderItem f162099B;

    /* renamed from: z */
    public int f162100z;

    /* renamed from: com.tencent.mm.plugin.finder.view.FinderFavDrawer$Companion */
    public static final class Companion {

        /* renamed from: com.tencent.mm.plugin.finder.view.FinderFavDrawer$Companion$a */
        public static final class C56563a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ Context f162101d;

            /* renamed from: e */
            public final /* synthetic */ FrameLayout.LayoutParams f162102e;

            /* renamed from: f */
            public final /* synthetic */ Window f162103f;

            /* renamed from: g */
            public final /* synthetic */ FinderFavDrawer f162104g;

            /* renamed from: h */
            public final /* synthetic */ C8479f0<C65467c> f162105h;

            public C56563a(Context context, FrameLayout.LayoutParams layoutParams, Window window, FinderFavDrawer finderFavDrawer, C8479f0<C65467c> f0Var) {
                this.f162101d = context;
                this.f162102e = layoutParams;
                this.f162103f = window;
                this.f162104g = finderFavDrawer;
                this.f162105h = f0Var;
            }

            public final void run() {
                int e = C75044y4.m89993e(this.f162101d);
                this.f162102e.bottomMargin = e;
                Log.m105924i("Finder.FinderFavDrawer", "[initView] bottomMargin= " + e);
                View decorView = this.f162103f.getDecorView();
                C87412m.m108592e(decorView, "null cannot be cast to non-null type android.widget.FrameLayout");
                ((FrameLayout) decorView).addView(this.f162104g, this.f162102e);
                C65467c cVar = (C65467c) this.f162105h.f27484d;
                Context context = this.f162101d;
                FrameLayout headerLayout = this.f162104g.getHeaderLayout();
                cVar.getClass();
                C87412m.m108594g(context, "context");
                C87412m.m108594g(headerLayout, "headerLayout");
                View inflate = C85868k2.m106137b(context).inflate(C0966R.C0971layout.b5y, cVar.mo89579b().getHeaderLayout());
                View findViewById = inflate.findViewById(C0966R.C0970id.f357887ca2);
                C87412m.m108593f(findViewById, "header.findViewById(R.id.drawer_header_tv)");
                TextView textView = (TextView) findViewById;
                cVar.f188390e = textView;
                C85875k4.m106189j0(textView.getPaint(), 0.8f);
                View findViewById2 = inflate.findViewById(C0966R.C0970id.bel);
                ViewGroup viewGroup = (ViewGroup) inflate.findViewById(C0966R.C0970id.be_);
                View findViewById3 = inflate.findViewById(C0966R.C0970id.ca4);
                if (C85875k4.m106211z()) {
                    findViewById2.setBackgroundResource(C0966R.C0969drawable.a5o);
                } else {
                    findViewById2.setBackgroundResource(C0966R.C0969drawable.a5p);
                }
                viewGroup.setOnClickListener(new C65466a(cVar));
                cVar.f188389d.mo85981d(context, headerLayout);
                FinderFavDrawer b = cVar.mo89579b();
                C87412m.m108593f(findViewById2, "closeBtn");
                b.mo82528c(findViewById2);
                FinderFavDrawer b2 = cVar.mo89579b();
                C87412m.m108593f(findViewById3, "moreBtn");
                b2.mo82528c(findViewById3);
                C65467c cVar2 = (C65467c) this.f162105h.f27484d;
                Context context2 = this.f162101d;
                RefreshLoadMoreLayout centerLayout = this.f162104g.getCenterLayout();
                cVar2.getClass();
                C87412m.m108594g(context2, "context");
                C87412m.m108594g(centerLayout, "rlLayout");
                cVar2.f188391f = centerLayout;
                cVar2.f188389d.mo85983f(centerLayout);
                View inflate2 = C85868k2.m106137b(context2).inflate(C0966R.C0971layout.b7t, (ViewGroup) null);
                C87412m.m108593f(inflate2, "getInflater(context).inf…t.load_more_footer, null)");
                centerLayout.setLoadMoreFooter(inflate2);
                RecyclerView recyclerView = centerLayout.getRecyclerView();
                recyclerView.setHasFixedSize(true);
                RecyclerView.C16616j itemAnimator = recyclerView.getItemAnimator();
                if (itemAnimator != null) {
                    itemAnimator.f44810f = 0;
                }
                recyclerView.setLayoutManager(cVar2.f188389d.mo85979b(context2));
                recyclerView.mo17085h0(cVar2.f188389d.mo85978a(context2));
                recyclerView.setAdapter(cVar2.f188389d.mo85980c(context2));
                C65467c cVar3 = (C65467c) this.f162105h.f27484d;
                Context context3 = this.f162101d;
                FrameLayout loadingLayout = this.f162104g.getLoadingLayout();
                cVar3.getClass();
                C87412m.m108594g(context3, "context");
                C87412m.m108594g(loadingLayout, "loadingLayout");
                cVar3.f188393h = loadingLayout;
                View inflate3 = LayoutInflater.from(context3).inflate(C0966R.C0971layout.aax, loadingLayout, true);
                View findViewById4 = inflate3.findViewById(C0966R.C0970id.f358543fo1);
                C87412m.m108593f(findViewById4, "loadingContentLayout.fin…Id(R.id.like_loading_bar)");
                cVar3.f188394i = findViewById4;
                View findViewById5 = inflate3.findViewById(C0966R.C0970id.hgh);
                C87412m.m108593f(findViewById5, "loadingContentLayout.fin…ewById(R.id.no_like_hint)");
                cVar3.f188395j = (TextView) findViewById5;
                cVar3.mo89580c().setText(context3.getString(C0966R.string.mlr));
                View findViewById6 = inflate3.findViewById(C0966R.C0970id.is9);
                C87412m.m108593f(findViewById6, "loadingContentLayout.fin…d(R.id.retry_like_layout)");
                cVar3.f188396n = findViewById6;
                View view = cVar3.f188394i;
                if (view != null) {
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(0);
                    View view2 = view;
                    C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/view/builder/FinderFavDrawerBuilder", "onBuildLoading", "(Landroid/content/Context;Landroid/widget/FrameLayout;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                    C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/view/builder/FinderFavDrawerBuilder", "onBuildLoading", "(Landroid/content/Context;Landroid/widget/FrameLayout;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    cVar3.mo89580c().setVisibility(8);
                    View d = cVar3.mo89581d();
                    C9556a aVar2 = new C9556a();
                    aVar2.mo10233c(8);
                    View view3 = d;
                    C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/view/builder/FinderFavDrawerBuilder", "onBuildLoading", "(Landroid/content/Context;Landroid/widget/FrameLayout;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    d.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                    C117292a.m165359e(view3, "com/tencent/mm/plugin/finder/view/builder/FinderFavDrawerBuilder", "onBuildLoading", "(Landroid/content/Context;Landroid/widget/FrameLayout;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    return;
                }
                C87412m.m108603p("loadingView");
                throw null;
            }
        }

        public Companion(C8480h hVar) {
        }

        /* renamed from: a */
        public final FinderFavDrawer mo79836a(Context context, Window window, int i) {
            C87412m.m108594g(context, "context");
            C87412m.m108594g(window, "window");
            Log.m105924i("Finder.FinderFavDrawer", "createDrawerToAttachWindow ");
            FinderFavDrawer finderFavDrawer = new FinderFavDrawer(context);
            finderFavDrawer.setScene(i);
            C37521f.f99374d.getClass();
            if (C37521f.f99579z7.mo60266n().intValue() == 1) {
                finderFavDrawer.setChangeBackgroundAlpha(false);
                finderFavDrawer.setBackgroundColorRes(C0966R.color.ahf);
            }
            finderFavDrawer.setTopOffset((int) (((float) C7865r3.f26468a.mo8968a()) * (((float) 1) - C7515a.f25777a.mo8637a(context))));
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            C8479f0 f0Var = new C8479f0();
            if (i == 0) {
                f0Var.f27484d = new C65467c(new C61028h1(context));
            } else {
                f0Var.f27484d = new C65467c(new C61028h1(context));
            }
            C65467c cVar = (C65467c) f0Var.f27484d;
            cVar.getClass();
            Context context2 = finderFavDrawer.getContext();
            C87412m.m108593f(context2, "drawer.context");
            cVar.f188397o = context2;
            if (cVar.f188389d.getScene() == 0) {
                finderFavDrawer.setId(C0966R.C0970id.n8a);
            } else {
                finderFavDrawer.setId(C0966R.C0970id.n8a);
            }
            cVar.f188392g = finderFavDrawer;
            finderFavDrawer.setSquaresBackgroundResource(C0966R.C0969drawable.b_3);
            finderFavDrawer.setEnableClickBackgroundToCloseDrawer(true);
            finderFavDrawer.mo82527b(cVar);
            finderFavDrawer.setBuilder((C65467c) f0Var.f27484d);
            window.getDecorView().post(new C56563a(context, layoutParams, window, finderFavDrawer, f0Var));
            if (context instanceof MMFragmentActivity) {
                ((MMFragmentActivity) context).getLifecycle().addObserver(new FinderFavDrawer$Companion$createDrawerToAttachWindow$2(finderFavDrawer, context));
            }
            return finderFavDrawer;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderFavDrawer(Context context) {
        super(context);
        C87412m.m108594g(context, "context");
    }

    public final C65467c getBuilder() {
        return this.f162098A;
    }

    public final FinderItem getFeedObj() {
        return this.f162099B;
    }

    public final int getScene() {
        return this.f162100z;
    }

    public final void setBuilder(C65467c cVar) {
        this.f162098A = cVar;
    }

    public final void setFeedObj(FinderItem finderItem) {
        this.f162099B = finderItem;
    }

    public final void setScene(int i) {
        this.f162100z = i;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderFavDrawer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderFavDrawer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
    }
}
