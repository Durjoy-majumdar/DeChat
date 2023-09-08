package com.tencent.p014mm.plugin.forcenotify.p058ui.view;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32227p;
import gy3.C87412m;
import hv1.C8822a;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import rx3.C13598b0;
import sx3.C64197v;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/forcenotify/ui/view/StackLayoutManager;", "Landroidx/recyclerview/widget/RecyclerView$LayoutManager;", "a", "b", "plugin-force-notify_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.forcenotify.ui.view.StackLayoutManager */
public final class StackLayoutManager extends RecyclerView.LayoutManager {

    /* renamed from: d */
    public final int f52639d;

    /* renamed from: e */
    public final int f52640e;

    /* renamed from: f */
    public final float f52641f;

    /* renamed from: g */
    public final boolean f52642g;

    /* renamed from: h */
    public final C32227p<Integer, Integer, C13598b0> f52643h;

    /* renamed from: i */
    public int f52644i;

    /* renamed from: j */
    public int f52645j;

    /* renamed from: n */
    public boolean f52646n;

    /* renamed from: o */
    public boolean f52647o;

    /* renamed from: p */
    public boolean f52648p;

    /* renamed from: q */
    public int f52649q = Integer.MAX_VALUE;

    /* renamed from: r */
    public int f52650r;

    /* renamed from: s */
    public final List<C18806b> f52651s;

    /* renamed from: t */
    public RecyclerView.C16633n f52652t;

    /* renamed from: u */
    public RecyclerView.C0130p f52653u;

    /* renamed from: com.tencent.mm.plugin.forcenotify.ui.view.StackLayoutManager$a */
    public enum C18803a {
        UP,
        DOWN,
        NONE
    }

    /* renamed from: com.tencent.mm.plugin.forcenotify.ui.view.StackLayoutManager$c */
    public static final class C18804c extends RecyclerView.C16633n {

        /* renamed from: a */
        public final /* synthetic */ StackLayoutManager f52658a;

        /* renamed from: b */
        public final /* synthetic */ RecyclerView f52659b;

        public C18804c(StackLayoutManager stackLayoutManager, RecyclerView recyclerView) {
            this.f52658a = stackLayoutManager;
            this.f52659b = recyclerView;
        }

        /* renamed from: a */
        public boolean mo17379a(int i, int i2) {
            C18803a aVar = i2 < 0 ? C18803a.DOWN : C18803a.UP;
            int height = this.f52658a.getHeight() * (this.f52658a.getItemCount() - 1);
            StackLayoutManager stackLayoutManager = this.f52658a;
            int i3 = stackLayoutManager.f52645j;
            boolean z = false;
            if (1 <= i3 && i3 < height) {
                z = true;
            }
            if (z) {
                stackLayoutManager.f52646n = true;
            }
            StackLayoutManager.m19557s(stackLayoutManager, this.f52659b, aVar);
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.forcenotify.ui.view.StackLayoutManager$d */
    public static final class C18805d extends RecyclerView.C0130p {

        /* renamed from: d */
        public final /* synthetic */ StackLayoutManager f52660d;

        /* renamed from: e */
        public final /* synthetic */ RecyclerView f52661e;

        public C18805d(StackLayoutManager stackLayoutManager, RecyclerView recyclerView) {
            this.f52660d = stackLayoutManager;
            this.f52661e = recyclerView;
        }

        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(recyclerView);
            arrayList.add(Integer.valueOf(i));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/forcenotify/ui/view/StackLayoutManager$onAttachedToWindow$2", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
            C87412m.m108594g(recyclerView, "recyclerView");
            if (i == 0) {
                StackLayoutManager stackLayoutManager = this.f52660d;
                if (!stackLayoutManager.f52646n) {
                    stackLayoutManager.f52646n = true;
                    StackLayoutManager.m19557s(stackLayoutManager, this.f52661e, C18803a.NONE);
                } else {
                    stackLayoutManager.f52646n = false;
                }
            } else if (i == 1) {
                this.f52660d.f52646n = false;
            }
            if (i == 1) {
                StackLayoutManager stackLayoutManager2 = this.f52660d;
                if (!stackLayoutManager2.f52647o) {
                    stackLayoutManager2.f52647o = true;
                    stackLayoutManager2.f52649q = (stackLayoutManager2.f52645j / stackLayoutManager2.getHeight()) * stackLayoutManager2.getHeight();
                }
            } else {
                this.f52660d.f52647o = false;
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/forcenotify/ui/view/StackLayoutManager$onAttachedToWindow$2", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
        }

        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(recyclerView);
            arrayList.add(Integer.valueOf(i));
            arrayList.add(Integer.valueOf(i2));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/forcenotify/ui/view/StackLayoutManager$onAttachedToWindow$2", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
            super.onScrolled(recyclerView, i, i2);
            C117292a.m165361g(this, "com/tencent/mm/plugin/forcenotify/ui/view/StackLayoutManager$onAttachedToWindow$2", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.forcenotify.ui.view.StackLayoutManager$b */
    public interface C18806b {
        /* renamed from: a */
        void mo9655a(View view);

        /* renamed from: b */
        void mo9656b(View view, int i, int i2, float f, View view2, View view3);
    }

    public StackLayoutManager(int i, int i2, float f, boolean z, C32227p<? super Integer, ? super Integer, C13598b0> pVar) {
        this.f52639d = i;
        this.f52640e = i2;
        this.f52641f = f;
        this.f52642g = z;
        this.f52643h = pVar;
        ArrayList arrayList = new ArrayList();
        this.f52651s = arrayList;
        C8822a aVar = new C8822a(i);
        if (!arrayList.contains(aVar)) {
            arrayList.add(aVar);
        }
    }

    /* renamed from: s */
    public static final void m19557s(StackLayoutManager stackLayoutManager, RecyclerView recyclerView, C18803a aVar) {
        int t = stackLayoutManager.mo23739t();
        C18803a aVar2 = C18803a.NONE;
        if (aVar == aVar2 ? stackLayoutManager.mo23741v() >= stackLayoutManager.f52641f : aVar == C18803a.UP) {
            t++;
        }
        boolean z = aVar != aVar2;
        if (z) {
            stackLayoutManager.f52647o = false;
            stackLayoutManager.f52648p = true;
        }
        if (recyclerView != null) {
            stackLayoutManager.mo23742w(t, recyclerView, true, z);
        }
    }

    public boolean canScrollVertically() {
        return getItemCount() != 0;
    }

    public RecyclerView.LayoutParams generateDefaultLayoutParams() {
        return new RecyclerView.LayoutParams(-2, -2);
    }

    public void onAttachedToWindow(RecyclerView recyclerView) {
        super.onAttachedToWindow(recyclerView);
        C18804c cVar = new C18804c(this, recyclerView);
        this.f52652t = cVar;
        if (recyclerView != null) {
            recyclerView.setOnFlingListener(cVar);
        }
        C18805d dVar = new C18805d(this, recyclerView);
        this.f52653u = dVar;
        if (recyclerView != null) {
            recyclerView.mo17043c(dVar);
        }
    }

    public void onDetachedFromWindow(RecyclerView recyclerView, RecyclerView.C16625r rVar) {
        super.onDetachedFromWindow(recyclerView, rVar);
        RecyclerView.C16633n onFlingListener = recyclerView != null ? recyclerView.getOnFlingListener() : null;
        RecyclerView.C16633n nVar = this.f52652t;
        if (nVar != null) {
            if (C87412m.m108589b(onFlingListener, nVar)) {
                recyclerView.setOnFlingListener((RecyclerView.C16633n) null);
            }
            if (recyclerView != null) {
                RecyclerView.C0130p pVar = this.f52653u;
                if (pVar != null) {
                    recyclerView.mo17098m1(pVar);
                } else {
                    C87412m.m108603p("onScrollListener");
                    throw null;
                }
            }
        } else {
            C87412m.m108603p("onFlingListener");
            throw null;
        }
    }

    public void onItemsAdded(RecyclerView recyclerView, int i, int i2) {
        C87412m.m108594g(recyclerView, "recyclerView");
        Log.m105924i("MsgWindow", "onItemsAdded positionStart = " + i + ", itemCount = " + i2);
        if (i > mo23739t()) {
            i2 = 0;
        }
        this.f52645j += getHeight() * i2;
        this.f52644i += i2;
        if (this.f52647o) {
            this.f52649q += i2 * getHeight();
        }
        this.f52645j = Math.max(this.f52645j, 0);
        this.f52644i = Math.max(this.f52644i, 0);
    }

    public void onItemsMoved(RecyclerView recyclerView, int i, int i2, int i3) {
        C87412m.m108594g(recyclerView, "recyclerView");
        Log.m105924i("MsgWindow", "onItemsMoved from = " + i + ", to = " + i2 + ", itemCount = " + i3);
        int i4 = 1;
        if (i3 == 1) {
            int t = mo23739t();
            if (i != t) {
                int i5 = i < t ? 1 : 0;
                if (i2 > t) {
                    i4 = 0;
                }
                int i6 = i4 - i5;
                this.f52645j += getHeight() * i6;
                this.f52644i += i6;
                if (this.f52647o) {
                    this.f52649q += i6 * getHeight();
                }
            } else {
                this.f52645j = (getHeight() * i2) + (this.f52645j % getHeight());
                this.f52644i = i2;
                if (this.f52647o) {
                    this.f52649q = i2 * getHeight();
                }
            }
            this.f52645j = mo23743x(this.f52645j);
        }
    }

    public void onItemsRemoved(RecyclerView recyclerView, int i, int i2) {
        C87412m.m108594g(recyclerView, "recyclerView");
        Log.m105924i("MsgWindow", "onItemsRemoved positionStart = " + i + ", itemCount = " + i2);
        int max = Math.max((Math.min((i2 + i) + -1, mo23739t() + -1) - i) + 1, 0);
        this.f52645j = this.f52645j - (getHeight() * max);
        this.f52644i = this.f52644i - max;
        if (this.f52647o) {
            this.f52649q -= max * getHeight();
        }
        this.f52645j = Math.max(this.f52645j, 0);
        this.f52644i = Math.max(this.f52644i, 0);
    }

    public void onLayoutChildren(RecyclerView.C16625r rVar, RecyclerView.C16628w wVar) {
        super.onLayoutChildren(rVar, wVar);
        if (rVar != null) {
            detachAndScrapAttachedViews(rVar);
            if (getItemCount() > 0) {
                this.f52645j = mo23743x(this.f52645j);
                mo23740u(rVar, false);
            }
        }
    }

    public void scrollToPosition(int i) {
        this.f52645j = getHeight() * i;
        this.f52644i = i;
        requestLayout();
    }

    public int scrollVerticallyBy(int i, RecyclerView.C16625r rVar, RecyclerView.C16628w wVar) {
        C18803a aVar = C18803a.UP;
        if (rVar == null) {
            return 0;
        }
        int i2 = this.f52645j + i;
        int i3 = this.f52649q;
        C18803a aVar2 = i2 > i3 ? aVar : C18803a.DOWN;
        if (this.f52642g && ((this.f52647o || this.f52648p) && i3 != Integer.MAX_VALUE && Math.abs(i2 - i3) > getHeight())) {
            i2 = aVar2 == aVar ? this.f52649q + getHeight() : this.f52649q - getHeight();
        }
        int x = mo23743x(i2);
        this.f52645j = x;
        if (this.f52648p && x == this.f52650r) {
            this.f52648p = false;
            if (!this.f52647o) {
                this.f52649q = Integer.MAX_VALUE;
            }
        }
        int i4 = (x - i2) + i;
        if (i4 == 0) {
            return 0;
        }
        detachAndScrapAttachedViews(rVar);
        mo23740u(rVar, true);
        return i4;
    }

    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.C16628w wVar, int i) {
        if (recyclerView != null) {
            mo23742w(i, recyclerView, true, false);
        }
    }

    /* renamed from: t */
    public final int mo23739t() {
        if (getWidth() == 0 || getHeight() == 0) {
            return 0;
        }
        return this.f52645j / getHeight();
    }

    /* renamed from: u */
    public final void mo23740u(RecyclerView.C16625r rVar, boolean z) {
        int i;
        int i2;
        RecyclerView.C16625r rVar2 = rVar;
        if (rVar2 != null) {
            int t = mo23739t();
            int min = Math.min(this.f52639d + t, getItemCount() - 1);
            boolean z2 = this.f52645j % getHeight() == 0;
            if (z && z2 && t != (i2 = this.f52644i)) {
                C32227p<Integer, Integer, C13598b0> pVar = this.f52643h;
                if (pVar != null) {
                    pVar.invoke(Integer.valueOf(i2), Integer.valueOf(t));
                }
                this.f52644i = t;
            }
            ArrayList arrayList = new ArrayList();
            if (t <= min) {
                int i3 = t;
                while (true) {
                    View e = rVar2.mo17341e(i3);
                    C87412m.m108593f(e, "recycler.getViewForPosition(position)");
                    arrayList.add(e);
                    if (i3 == min) {
                        break;
                    }
                    i3++;
                }
            }
            if (t <= min) {
                int i4 = min;
                while (true) {
                    View view = (View) arrayList.get(i4 - t);
                    addView(view);
                    measureChild(view, 0, 0);
                    if (i4 == t) {
                        break;
                    }
                    i4--;
                }
            }
            if (t <= min) {
                int i5 = min;
                while (true) {
                    int i6 = i5 - t;
                    View view2 = (View) arrayList.get(i6);
                    View view3 = null;
                    View view4 = i6 <= 0 ? null : (View) arrayList.get(i6 - 1);
                    if (i6 < C64197v.m75536e(arrayList)) {
                        view3 = (View) arrayList.get(i6 + 1);
                    }
                    View view5 = view3;
                    if (view2 != null) {
                        int width = (getWidth() - getDecoratedMeasuredWidth(view2)) / 2;
                        int height = i6 == 0 ? (-this.f52645j) % getHeight() : (int) (((float) this.f52640e) * (((float) i6) - mo23741v()));
                        layoutDecorated(view2, width, height, width + getDecoratedMeasuredWidth(view2), height + getDecoratedMeasuredHeight(view2));
                    }
                    Iterator it = ((ArrayList) this.f52651s).iterator();
                    while (it.hasNext()) {
                        ((C18806b) it.next()).mo9656b(view2, i5, t, mo23741v(), view4, view5);
                        arrayList = arrayList;
                        view2 = view2;
                        i5 = i5;
                        min = min;
                    }
                    int i7 = i5;
                    ArrayList arrayList2 = arrayList;
                    i = min;
                    if (i7 == t) {
                        break;
                    }
                    i5 = i7 - 1;
                    arrayList = arrayList2;
                    min = i;
                }
            } else {
                i = min;
            }
            int i8 = t - 1;
            if (i8 >= 0) {
                View e2 = rVar2.mo17341e(i8);
                C87412m.m108593f(e2, "recycler.getViewForPosition(currPos - 1)");
                Iterator it4 = ((ArrayList) this.f52651s).iterator();
                while (it4.hasNext()) {
                    ((C18806b) it4.next()).mo9655a(e2);
                }
                removeAndRecycleView(e2, rVar2);
            }
            int i9 = i + 1;
            if (i9 < getItemCount()) {
                View e3 = rVar2.mo17341e(i9);
                C87412m.m108593f(e3, "recycler.getViewForPosition(lastVisiblePos + 1)");
                Iterator it5 = ((ArrayList) this.f52651s).iterator();
                while (it5.hasNext()) {
                    ((C18806b) it5.next()).mo9655a(e3);
                }
                removeAndRecycleView(e3, rVar2);
            }
        }
    }

    /* renamed from: v */
    public final float mo23741v() {
        if (getWidth() == 0 || getHeight() == 0) {
            return 0.0f;
        }
        return (((float) (this.f52645j % getHeight())) * 1.0f) / ((float) getHeight());
    }

    /* renamed from: w */
    public final void mo23742w(int i, RecyclerView recyclerView, boolean z, boolean z2) {
        int height = i * getHeight();
        int i2 = height - this.f52645j;
        if (z2 && Math.abs(i2) > 0) {
            this.f52650r = height;
        } else if (z2) {
            this.f52648p = false;
            if (!this.f52647o) {
                this.f52649q = Integer.MAX_VALUE;
            }
        }
        if (z) {
            recyclerView.smoothScrollBy(0, i2);
        } else {
            recyclerView.scrollBy(0, i2);
        }
    }

    /* renamed from: x */
    public final int mo23743x(int i) {
        return Math.max(Math.min(i, getHeight() * (getItemCount() - 1)), 0);
    }
}
