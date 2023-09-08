package com.tencent.p014mm.plugin.finder.view.manager;

import android.content.Context;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.view.MediaBanner;
import fy3.C32224a;
import fy3.C32227p;
import gs1.C59695l;
import gy3.C87412m;
import gy3.C87413o;
import kotlin.Metadata;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/view/manager/FinderLinearLayoutManager;", "Landroidx/recyclerview/widget/LinearLayoutManager;", "Lcom/tencent/mm/view/MediaBanner$a;", "Lgs1/l;", "plugin-finder-base_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager */
public final class FinderLinearLayoutManager extends LinearLayoutManager implements MediaBanner.C19880a, C59695l {

    /* renamed from: A */
    public boolean f162357A = true;

    /* renamed from: B */
    public C32227p<? super Long, ? super RecyclerView.C16628w, C13598b0> f162358B;

    /* renamed from: v */
    public Context f162359v;

    /* renamed from: w */
    public float f162360w = 5.0f;

    /* renamed from: x */
    public int f162361x = 100;

    /* renamed from: y */
    public final C13601g f162362y = C36568h.m40985a(new C56639a(this));

    /* renamed from: z */
    public int f162363z;

    /* renamed from: com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager$a */
    public static final class C56639a extends C87413o implements C32224a<C56642a> {

        /* renamed from: d */
        public final /* synthetic */ FinderLinearLayoutManager f162364d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C56639a(FinderLinearLayoutManager finderLinearLayoutManager) {
            super(0);
            this.f162364d = finderLinearLayoutManager;
        }

        public Object invoke() {
            FinderLinearLayoutManager finderLinearLayoutManager = this.f162364d;
            Context context = finderLinearLayoutManager.f162359v;
            if (context != null) {
                return new C56642a(finderLinearLayoutManager, context);
            }
            C87412m.m108603p("context");
            throw null;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager$b */
    public static final class C56640b extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public final /* synthetic */ FinderLinearLayoutManager f162365d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C56640b(FinderLinearLayoutManager finderLinearLayoutManager) {
            super(0);
            this.f162365d = finderLinearLayoutManager;
        }

        public Object invoke() {
            Context context = this.f162365d.f162359v;
            if (context != null) {
                return Integer.valueOf(ViewConfiguration.get(context).getScaledTouchSlop());
            }
            C87412m.m108603p("context");
            throw null;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderLinearLayoutManager(Context context) {
        super(context);
        C87412m.m108594g(context, "context");
        C36568h.m40985a(new C56640b(this));
        setItemPrefetchEnabled(false);
        this.f162359v = context;
    }

    /* renamed from: M */
    public int mo16966M(RecyclerView.C16628w wVar) {
        int i = this.f162361x;
        return i == -1 ? super.mo16966M(wVar) : i;
    }

    /* renamed from: V */
    public void mo16973V(int i, int i2) {
        super.mo16973V(i, i2);
        Log.m105924i("Finder.FinderLayoutManager", "[scrollToPositionWithOffset] position=" + i + " offset=" + i2);
    }

    public boolean canScrollHorizontally() {
        return super.canScrollHorizontally();
    }

    public boolean canScrollVertically() {
        return this.f162357A && super.canScrollVertically();
    }

    /* renamed from: d */
    public void mo77960d(C32227p<? super Long, ? super RecyclerView.C16628w, C13598b0> pVar) {
        this.f162358B = pVar;
    }

    /* renamed from: o */
    public void mo26566o(boolean z) {
        this.f162357A = z;
    }

    public void onScrollStateChanged(int i) {
        super.onScrollStateChanged(i);
        this.f162363z = i;
    }

    public int scrollHorizontallyBy(int i, RecyclerView.C16625r rVar, RecyclerView.C16628w wVar) {
        int scrollHorizontallyBy = super.scrollHorizontallyBy(i, rVar, wVar);
        if (scrollHorizontallyBy == 0 && i != 0 && this.f162363z == 2) {
            View childAt = getChildAt(0);
            RecyclerView recyclerView = null;
            ViewParent parent = childAt != null ? childAt.getParent() : null;
            if (parent instanceof RecyclerView) {
                recyclerView = (RecyclerView) parent;
            }
            Log.m105924i("Finder.FinderLayoutManager", "horizontal fling to end, " + i + ' ' + scrollHorizontallyBy + ", " + recyclerView);
            if (recyclerView != null) {
                recyclerView.mo17155w1();
            }
        }
        return scrollHorizontallyBy;
    }

    public void scrollToPosition(int i) {
        super.scrollToPosition(i);
        Log.m105924i("Finder.FinderLayoutManager", "[scrollToPosition] position=" + i);
    }

    public int scrollVerticallyBy(int i, RecyclerView.C16625r rVar, RecyclerView.C16628w wVar) {
        long currentTimeMillis = this.f162358B == null ? 0 : System.currentTimeMillis();
        try {
            int scrollVerticallyBy = super.scrollVerticallyBy(i, rVar, wVar);
            if (scrollVerticallyBy == 0 && i != 0 && this.f162363z == 2) {
                View childAt = getChildAt(0);
                RecyclerView recyclerView = null;
                ViewParent parent = childAt != null ? childAt.getParent() : null;
                if (parent instanceof RecyclerView) {
                    recyclerView = (RecyclerView) parent;
                }
                Log.m105924i("Finder.FinderLayoutManager", "vertical fling to end, " + i + ' ' + scrollVerticallyBy + ", " + recyclerView);
                if (recyclerView != null) {
                    recyclerView.mo17155w1();
                }
            }
            return scrollVerticallyBy;
        } finally {
            C32227p<? super Long, ? super RecyclerView.C16628w, C13598b0> pVar = this.f162358B;
            if (pVar != null && currentTimeMillis > 0) {
                pVar.invoke(Long.valueOf(System.currentTimeMillis() - currentTimeMillis), wVar);
            }
        }
    }

    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.C16628w wVar, int i) {
        Log.m105924i("Finder.FinderLayoutManager", "[smoothScrollToPosition] position=" + i);
        ((C56642a) ((C36570n) this.f162362y).getValue()).f44872a = i;
        startSmoothScroll((C56642a) ((C36570n) this.f162362y).getValue());
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderLinearLayoutManager(Context context, int i, boolean z) {
        super(context, i, z);
        C87412m.m108594g(context, "context");
        C36568h.m40985a(new C56640b(this));
        setItemPrefetchEnabled(false);
        this.f162359v = context;
    }
}
