package zm1;

import androidx.recyclerview.widget.RecyclerView;
import cm1.C0740i2;
import com.tencent.p014mm.plugin.finder.view.manager.FinderStaggeredGridLayoutManager;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import fy3.C32224a;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Iterator;
import pm1.C62381d;
import rx3.C13598b0;
import sx3.C110823p;
import up1.C37521f;
import xm1.C15829e0;

/* renamed from: zm1.f */
public final class C16302f extends RecyclerView.C0130p {

    /* renamed from: d */
    public final ArrayList<C0740i2> f43598d;

    /* renamed from: e */
    public final C32224a<C62381d> f43599e;

    /* renamed from: f */
    public final C15829e0 f43600f;

    /* renamed from: g */
    public final C32224a<C13598b0> f43601g;

    /* renamed from: h */
    public final C32224a<Boolean> f43602h;

    /* renamed from: i */
    public final int f43603i = C37521f.f99248O4.mo60266n().intValue();

    /* renamed from: j */
    public long f43604j;

    /* renamed from: n */
    public final int f43605n = MMApplicationContext.getContext().getResources().getDisplayMetrics().heightPixels;

    public C16302f(ArrayList<C0740i2> arrayList, C32224a<C62381d> aVar, C15829e0 e0Var, C32224a<C13598b0> aVar2, C32224a<Boolean> aVar3) {
        C87412m.m108594g(arrayList, "feedDataList");
        C87412m.m108594g(aVar, "autoPlayManager");
        C87412m.m108594g(e0Var, "caller");
        C87412m.m108594g(aVar2, "loadMoreCall");
        C87412m.m108594g(aVar3, "isLoadingMore");
        this.f43598d = arrayList;
        this.f43599e = aVar;
        this.f43600f = e0Var;
        this.f43601g = aVar2;
        this.f43602h = aVar3;
        C37521f.f99374d.getClass();
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0069  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo14789a(androidx.recyclerview.widget.RecyclerView r8) {
        /*
            r7 = this;
            if (r8 == 0) goto L_0x00ba
            androidx.recyclerview.widget.RecyclerView$LayoutManager r8 = r8.getLayoutManager()
            java.lang.String r0 = "null cannot be cast to non-null type com.tencent.mm.plugin.finder.view.manager.FinderStaggeredGridLayoutManager"
            gy3.C87412m.m108592e(r8, r0)
            com.tencent.mm.plugin.finder.view.manager.FinderStaggeredGridLayoutManager r8 = (com.tencent.p014mm.plugin.finder.view.manager.FinderStaggeredGridLayoutManager) r8
            r0 = 2
            int[] r1 = new int[r0]
            int[] r2 = new int[r0]
            r8.mo17394A(r1)
            r8.mo17395B(r2)
            int r1 = sx3.C110823p.m150975A(r1)
            int r2 = sx3.C110823p.m150988N(r2)
            int r3 = r7.f43605n
            int r3 = r3 / r0
            r0 = 0
            java.lang.String r4 = "Finder.NewEntranceRVScrollAutoPlayChecker"
            if (r1 > r2) goto L_0x0060
        L_0x0028:
            android.view.View r5 = r8.findViewByPosition(r1)
            if (r5 == 0) goto L_0x005b
            android.graphics.Rect r6 = new android.graphics.Rect
            r6.<init>()
            r5.getGlobalVisibleRect(r6)
            int r5 = r6.left
            boolean r5 = r6.contains(r5, r3)
            if (r5 == 0) goto L_0x005b
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r2 = "#findMiddleElement find it. index="
            r8.append(r2)
            r8.append(r1)
            java.lang.String r8 = r8.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r8)
            java.util.ArrayList<cm1.i2> r8 = r7.f43598d
            java.lang.Object r8 = sx3.C110818d0.m150917O(r8, r1)
            cm1.i2 r8 = (cm1.C0740i2) r8
            goto L_0x0061
        L_0x005b:
            if (r1 == r2) goto L_0x0060
            int r1 = r1 + 1
            goto L_0x0028
        L_0x0060:
            r8 = r0
        L_0x0061:
            if (r8 != 0) goto L_0x0069
            java.lang.String r8 = "#checkAutoPlay ops! you are git the margin"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r8)
            goto L_0x00ba
        L_0x0069:
            xm1.e0 r1 = r7.f43600f
            r1.getClass()
            java.util.List<xm1.e0$a> r1 = r1.f42636a
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            java.util.Iterator r1 = r1.iterator()
        L_0x0076:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0086
            java.lang.Object r2 = r1.next()
            xm1.e0$a r2 = (xm1.C15829e0.C15830a) r2
            r2.mo762c(r8)
            goto L_0x0076
        L_0x0086:
            fy3.a<pm1.d> r1 = r7.f43599e
            java.lang.Object r1 = r1.invoke()
            pm1.d r1 = (pm1.C62381d) r1
            if (r1 != 0) goto L_0x0091
            goto L_0x0096
        L_0x0091:
            boolean r8 = r8 instanceof bn1.C0331b
            r1.mo87447z(r8)
        L_0x0096:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r1 = "#checkAutoPlay find it. is my self play? "
            r8.append(r1)
            fy3.a<pm1.d> r1 = r7.f43599e
            java.lang.Object r1 = r1.invoke()
            pm1.d r1 = (pm1.C62381d) r1
            if (r1 == 0) goto L_0x00b0
            boolean r0 = r1.f177284C
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
        L_0x00b0:
            r8.append(r0)
            java.lang.String r8 = r8.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r8)
        L_0x00ba:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: zm1.C16302f.mo14789a(androidx.recyclerview.widget.RecyclerView):void");
    }

    /* renamed from: b */
    public final void mo14790b(RecyclerView recyclerView) {
        if (!this.f43602h.invoke().booleanValue()) {
            RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            C87412m.m108592e(layoutManager, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.view.manager.FinderStaggeredGridLayoutManager");
            int[] iArr = new int[2];
            ((FinderStaggeredGridLayoutManager) layoutManager).mo17395B(iArr);
            int N = C110823p.m150988N(iArr);
            boolean z = this.f43598d.size() > this.f43603i && N >= this.f43598d.size() - this.f43603i;
            Log.m105924i("Finder.NewEntranceRVScrollAutoPlayChecker", "checkLoadMore: enableLoadMore=" + z + ", lastPos=" + N + ", preloadCount=" + this.f43603i + ", dataSize=" + this.f43598d.size());
            if (z) {
                this.f43601g.invoke();
            }
        }
    }

    public void onScrollStateChanged(RecyclerView recyclerView, int i) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(Integer.valueOf(i));
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/nearby/newlivesquare/adapter/main/NewEntranceRVScrollAutoPlayChecker", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
        C87412m.m108594g(recyclerView, "recyclerView");
        super.onScrollStateChanged(recyclerView, i);
        if (i == 0) {
            mo14789a(recyclerView);
        }
        mo14790b(recyclerView);
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/nearby/newlivesquare/adapter/main/NewEntranceRVScrollAutoPlayChecker", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
    }

    public void onScrolled(RecyclerView recyclerView, int i, int i2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(Integer.valueOf(i));
        arrayList.add(Integer.valueOf(i2));
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/nearby/newlivesquare/adapter/main/NewEntranceRVScrollAutoPlayChecker", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
        C87412m.m108594g(recyclerView, "recyclerView");
        super.onScrolled(recyclerView, i, i2);
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.f43604j > 50) {
            this.f43604j = currentTimeMillis;
            mo14790b(recyclerView);
        }
        Iterator it = ((ArrayList) this.f43600f.f42636a).iterator();
        while (it.hasNext()) {
            ((C15829e0.C15830a) it.next()).mo764e();
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/nearby/newlivesquare/adapter/main/NewEntranceRVScrollAutoPlayChecker", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
    }
}
