package com.tencent.p014mm.plugin.finder.live.multistream.panel;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.C39623j;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.finder.live.multistream.adapter.MultiStreamItemConvertFactory;
import com.tencent.p014mm.plugin.finder.view.manager.FinderStaggeredGridLayoutManager;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter;
import fy3.C32224a;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import il1.C8961e;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Iterator;
import jq3.C60898l;
import jq3.C60905o;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import mj1.C61491e;
import nj1.C61755b;
import o40.C61926c;
import oj1.C62033a;
import ok1.C11471u;
import pj1.C62312d;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;

/* renamed from: com.tencent.mm.plugin.finder.live.multistream.panel.FinderLiveMultiStreamBottomPanelWidget */
public final class FinderLiveMultiStreamBottomPanelWidget extends C8961e {

    /* renamed from: h */
    public final C61755b f159460h;

    /* renamed from: i */
    public View f159461i;

    /* renamed from: j */
    public RecyclerView f159462j;

    /* renamed from: n */
    public WxRecyclerAdapter<MultiStreamItemConvertFactory.C55940a> f159463n;

    /* renamed from: o */
    public final ArrayList<MultiStreamItemConvertFactory.C55940a> f159464o;

    /* renamed from: p */
    public final ArrayList<C62033a> f159465p = new ArrayList<>();

    /* renamed from: q */
    public int f159466q;

    /* renamed from: r */
    public final C13601g f159467r;

    /* renamed from: s */
    public final FinderLiveMultiStreamBottomPanelWidget$lifeObserver$1 f159468s;

    /* renamed from: com.tencent.mm.plugin.finder.live.multistream.panel.FinderLiveMultiStreamBottomPanelWidget$d */
    public static final class C3158d extends RecyclerView.C0129l {
        /* renamed from: g */
        public void mo21g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C16628w wVar) {
            C87412m.m108594g(rect, "outRect");
            C87412m.m108594g(view, "view");
            C87412m.m108594g(recyclerView, "parent");
            C87412m.m108594g(wVar, "state");
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            C87412m.m108592e(layoutParams, "null cannot be cast to non-null type androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams");
            StaggeredGridLayoutManager.LayoutParams layoutParams2 = (StaggeredGridLayoutManager.LayoutParams) layoutParams;
            RecyclerView.C16631z P0 = recyclerView.mo17031P0(view);
            C60905o oVar = P0 instanceof C60905o ? (C60905o) P0 : null;
            int j = oVar != null ? oVar.mo17363j() : -1;
            int i = 0;
            if (layoutParams2.mo17429e() % 2 == 0) {
                rect.left = 0;
                rect.right = MMApplicationContext.getContext().getResources().getDimensionPixelSize(C0966R.dimen.f3766df);
                rect.bottom = MMApplicationContext.getContext().getResources().getDimensionPixelSize(C0966R.dimen.f3743cv);
                if (j == 0) {
                    i = MMApplicationContext.getContext().getResources().getDimensionPixelSize(C0966R.dimen.f3766df);
                }
                rect.top = i;
                return;
            }
            rect.left = MMApplicationContext.getContext().getResources().getDimensionPixelSize(C0966R.dimen.f3766df);
            rect.right = 0;
            rect.bottom = MMApplicationContext.getContext().getResources().getDimensionPixelSize(C0966R.dimen.f3743cv);
            if (j == 1) {
                i = MMApplicationContext.getContext().getResources().getDimensionPixelSize(C0966R.dimen.f3766df);
            }
            rect.top = i;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.live.multistream.panel.FinderLiveMultiStreamBottomPanelWidget$a */
    public static final class C55943a extends WxRecyclerAdapter<MultiStreamItemConvertFactory.C55940a> {

        /* renamed from: G */
        public final /* synthetic */ FinderLiveMultiStreamBottomPanelWidget f159469G;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C55943a(FinderLiveMultiStreamBottomPanelWidget finderLiveMultiStreamBottomPanelWidget, MultiStreamItemConvertFactory multiStreamItemConvertFactory, ArrayList<MultiStreamItemConvertFactory.C55940a> arrayList) {
            super(multiStreamItemConvertFactory, arrayList, true);
            this.f159469G = finderLiveMultiStreamBottomPanelWidget;
        }

        /* renamed from: A6 */
        public void onViewDetachedFromWindow(C60905o oVar) {
            C87412m.m108594g(oVar, "holder");
            super.onViewDetachedFromWindow(oVar);
        }

        /* renamed from: z6 */
        public void onViewAttachedToWindow(C60905o oVar) {
            C87412m.m108594g(oVar, "holder");
            super.onViewAttachedToWindow(oVar);
            if (oVar.mo17365l() < this.f159469G.f159464o.size()) {
                C61491e.m72198b(C61491e.f174819a, 4, this.f159469G.f159464o.get(oVar.mo17365l()).f159457d.f176355b.f182132e, (String) null, 4, (Object) null);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.live.multistream.panel.FinderLiveMultiStreamBottomPanelWidget$b */
    public static final class C55944b implements C60898l.C9502b<C60905o> {

        /* renamed from: d */
        public final /* synthetic */ FinderLiveMultiStreamBottomPanelWidget f159470d;

        public C55944b(FinderLiveMultiStreamBottomPanelWidget finderLiveMultiStreamBottomPanelWidget) {
            this.f159470d = finderLiveMultiStreamBottomPanelWidget;
        }

        /* renamed from: q */
        public void mo734q(RecyclerView.C16613e eVar, View view, int i, RecyclerView.C16631z zVar) {
            C87412m.m108594g(eVar, "adapter");
            C87412m.m108594g(view, "view");
            C87412m.m108594g((C60905o) zVar, "holder");
            FinderLiveMultiStreamBottomPanelWidget finderLiveMultiStreamBottomPanelWidget = this.f159470d;
            int i2 = finderLiveMultiStreamBottomPanelWidget.f159466q;
            finderLiveMultiStreamBottomPanelWidget.f159464o.size();
            this.f159470d.mo9763a();
            FinderLiveMultiStreamBottomPanelWidget finderLiveMultiStreamBottomPanelWidget2 = this.f159470d;
            if (finderLiveMultiStreamBottomPanelWidget2.f159466q < finderLiveMultiStreamBottomPanelWidget2.f159464o.size() && i < this.f159470d.f159464o.size()) {
                C61491e eVar2 = C61491e.f174819a;
                String str = this.f159470d.f159464o.get(i).f159457d.f176355b.f182132e;
                FinderLiveMultiStreamBottomPanelWidget finderLiveMultiStreamBottomPanelWidget3 = this.f159470d;
                eVar2.mo86466a(5, str, finderLiveMultiStreamBottomPanelWidget3.f159464o.get(finderLiveMultiStreamBottomPanelWidget3.f159466q).f159457d.f176355b.f182132e);
            }
            this.f159470d.f159460h.getEvent().mo86650M(i);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.live.multistream.panel.FinderLiveMultiStreamBottomPanelWidget$c */
    public static final class C55945c implements C60898l.C9503c<C60905o> {

        /* renamed from: d */
        public final /* synthetic */ FinderLiveMultiStreamBottomPanelWidget f159471d;

        public C55945c(FinderLiveMultiStreamBottomPanelWidget finderLiveMultiStreamBottomPanelWidget) {
            this.f159471d = finderLiveMultiStreamBottomPanelWidget;
        }

        /* renamed from: n */
        public boolean mo759n(RecyclerView.C16613e eVar, View view, int i, RecyclerView.C16631z zVar) {
            C87412m.m108594g(eVar, "adapter");
            C87412m.m108594g(view, "view");
            C87412m.m108594g((C60905o) zVar, "holder");
            this.f159471d.mo77678q().mo87392a(i);
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.live.multistream.panel.FinderLiveMultiStreamBottomPanelWidget$e */
    public static final class C55946e extends C87413o implements C32224a<C62312d> {

        /* renamed from: d */
        public final /* synthetic */ Context f159472d;

        /* renamed from: e */
        public final /* synthetic */ FinderLiveMultiStreamBottomPanelWidget f159473e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C55946e(Context context, FinderLiveMultiStreamBottomPanelWidget finderLiveMultiStreamBottomPanelWidget) {
            super(0);
            this.f159472d = context;
            this.f159473e = finderLiveMultiStreamBottomPanelWidget;
        }

        public Object invoke() {
            Context context = this.f159472d;
            int b = C76577a.m92151b(context, 400);
            FinderLiveMultiStreamBottomPanelWidget finderLiveMultiStreamBottomPanelWidget = this.f159473e;
            RecyclerView recyclerView = finderLiveMultiStreamBottomPanelWidget.f159462j;
            if (recyclerView != null) {
                return new C62312d(context, b, recyclerView, finderLiveMultiStreamBottomPanelWidget.f159465p);
            }
            C87412m.m108603p("recyclerView");
            throw null;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.live.multistream.panel.FinderLiveMultiStreamBottomPanelWidget$f */
    public static final class C55947f extends C87413o implements C32224a<MultiStreamItemConvertFactory> {

        /* renamed from: d */
        public final /* synthetic */ FinderLiveMultiStreamBottomPanelWidget f159474d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C55947f(FinderLiveMultiStreamBottomPanelWidget finderLiveMultiStreamBottomPanelWidget) {
            super(0);
            this.f159474d = finderLiveMultiStreamBottomPanelWidget;
        }

        public Object invoke() {
            return new MultiStreamItemConvertFactory(this.f159474d.f159460h);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.live.multistream.panel.FinderLiveMultiStreamBottomPanelWidget$g */
    public static final class C55948g extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ FinderLiveMultiStreamBottomPanelWidget f159475d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C55948g(FinderLiveMultiStreamBottomPanelWidget finderLiveMultiStreamBottomPanelWidget) {
            super(0);
            this.f159475d = finderLiveMultiStreamBottomPanelWidget;
        }

        public Object invoke() {
            C39623j lifecycle;
            Context context = this.f159475d.f28306d;
            MMActivity mMActivity = context instanceof MMActivity ? (MMActivity) context : null;
            if (!(mMActivity == null || (lifecycle = mMActivity.getLifecycle()) == null)) {
                lifecycle.addObserver(this.f159475d.f159468s);
            }
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderLiveMultiStreamBottomPanelWidget(Context context, C61755b bVar) {
        super(context, false, (C11471u.C11473b) null, 6, (C8480h) null);
        C87412m.m108594g(context, "context");
        C87412m.m108594g(bVar, "service");
        this.f159460h = bVar;
        ArrayList<MultiStreamItemConvertFactory.C55940a> arrayList = new ArrayList<>();
        this.f159464o = arrayList;
        C13601g a = C36568h.m40985a(new C55947f(this));
        this.f159467r = C36568h.m40985a(new C55946e(context, this));
        RecyclerView recyclerView = this.f159462j;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(new FinderStaggeredGridLayoutManager() {
                public boolean supportsPredictiveItemAnimations() {
                    return false;
                }
            });
            RecyclerView recyclerView2 = this.f159462j;
            if (recyclerView2 != null) {
                recyclerView2.mo17085h0(new C3158d());
                C55943a aVar = new C55943a(this, (MultiStreamItemConvertFactory) a.getValue(), arrayList);
                this.f159463n = aVar;
                aVar.f173488o = new C55944b(this);
                aVar.f173487n = new C55945c(this);
                RecyclerView recyclerView3 = this.f159462j;
                if (recyclerView3 != null) {
                    recyclerView3.setAdapter(aVar);
                    RecyclerView recyclerView4 = this.f159462j;
                    if (recyclerView4 != null) {
                        recyclerView4.setHasFixedSize(true);
                        this.f159468s = new FinderLiveMultiStreamBottomPanelWidget$lifeObserver$1(this);
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

    /* renamed from: g */
    public int mo3425g() {
        return C0966R.C0971layout.ct7;
    }

    /* renamed from: j */
    public String mo9449j() {
        String string = this.f28306d.getResources().getString(C0966R.string.maw);
        C87412m.m108593f(string, "context.resources.getStr…e_multi_stream_tip_title)");
        return string;
    }

    /* renamed from: k */
    public void mo3428k(View view) {
        C87412m.m108594g(view, "rootView");
        this.f159461i = view;
        View findViewById = view.findViewById(C0966R.C0970id.muf);
        C87412m.m108593f(findViewById, "rootView.findViewById(R.id.panel_recycler_view)");
        RecyclerView recyclerView = (RecyclerView) findViewById;
        this.f159462j = recyclerView;
        recyclerView.setNestedScrollingEnabled(false);
    }

    /* renamed from: m */
    public void mo3429m() {
        C39623j lifecycle;
        C62312d q = mo77678q();
        Iterator<C62312d.C62313a> it = q.f177132e.iterator();
        while (it.hasNext()) {
            q.mo87396e(it.next());
        }
        q.f177132e.clear();
        Context context = this.f28306d;
        MMActivity mMActivity = context instanceof MMActivity ? (MMActivity) context : null;
        if (!(mMActivity == null || (lifecycle = mMActivity.getLifecycle()) == null)) {
            lifecycle.removeObserver(this.f159468s);
        }
        RecyclerView recyclerView = this.f159462j;
        if (recyclerView != null) {
            recyclerView.setAdapter(this.f159463n);
            mo77679r(this.f159466q);
            return;
        }
        C87412m.m108603p("recyclerView");
        throw null;
    }

    /* renamed from: p */
    public void mo3431p() {
        super.mo3431p();
        C61926c.m72666K(300, new C55948g(this));
    }

    /* renamed from: q */
    public final C62312d mo77678q() {
        return (C62312d) ((C36570n) this.f159467r).getValue();
    }

    /* renamed from: r */
    public final void mo77679r(int i) {
        if (i % 2 != 0) {
            i--;
        }
        RecyclerView recyclerView = this.f159462j;
        if (recyclerView != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Integer.valueOf(i));
            RecyclerView recyclerView2 = recyclerView;
            C117292a.m165358d(recyclerView2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/multistream/panel/FinderLiveMultiStreamBottomPanelWidget", "scrollToPosition", "(I)V", "Undefined", "scrollToPosition", "(I)V");
            recyclerView.mo17115r1(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(recyclerView2, "com/tencent/mm/plugin/finder/live/multistream/panel/FinderLiveMultiStreamBottomPanelWidget", "scrollToPosition", "(I)V", "Undefined", "scrollToPosition", "(I)V");
            return;
        }
        C87412m.m108603p("recyclerView");
        throw null;
    }
}
