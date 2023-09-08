package ub2;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.C16680w;
import androidx.recyclerview.widget.C16681x;
import androidx.recyclerview.widget.C16682y;
import androidx.recyclerview.widget.C54256s;
import androidx.recyclerview.widget.C54259z;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: ub2.a */
public class C65257a extends C54259z {

    /* renamed from: f */
    public C16682y f187871f;

    /* renamed from: g */
    public C16682y f187872g;

    /* renamed from: h */
    public RecyclerView f187873h;

    /* renamed from: i */
    public float f187874i = 50.0f;

    /* renamed from: j */
    public boolean f187875j;

    /* renamed from: k */
    public final C65265f f187876k = new C65265f(this);

    /* renamed from: l */
    public final C65262e f187877l = new C65262e(this);

    /* renamed from: m */
    public int f187878m = -1;

    /* renamed from: n */
    public C65258a f187879n;

    /* renamed from: o */
    public C65259b f187880o;

    /* renamed from: p */
    public C65260c f187881p;

    /* renamed from: ub2.a$a */
    public interface C65258a {
        void onPageSelected(int i);
    }

    /* renamed from: ub2.a$b */
    public interface C65259b {
        /* renamed from: a */
        void mo80443a(int i);
    }

    /* renamed from: ub2.a$c */
    public interface C65260c {
        /* renamed from: a */
        void mo80467a(int i);
    }

    /* renamed from: ub2.a$d */
    public static final class C65261d extends C54256s {

        /* renamed from: n */
        public final /* synthetic */ C65257a f187882n;

        /* renamed from: o */
        public final /* synthetic */ RecyclerView.LayoutManager f187883o;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C65261d(C65257a aVar, RecyclerView.LayoutManager layoutManager, Context context) {
            super(context);
            this.f187882n = aVar;
            this.f187883o = layoutManager;
        }

        /* renamed from: f */
        public void mo17385f(View view, RecyclerView.C16628w wVar, RecyclerView.C16634v.C16635a aVar) {
            C87412m.m108594g(view, "targetView");
            C87412m.m108594g(wVar, "state");
            C87412m.m108594g(aVar, "action");
            C65257a aVar2 = this.f187882n;
            if (aVar2.f187873h != null) {
                int[] c = aVar2.mo75026c(this.f187883o, view);
                int i = c[0];
                int i2 = c[1];
                int l = mo10339l(Math.max(Math.abs(i), Math.abs(i2)));
                if (l > 0) {
                    aVar.mo17388b(i, i2, l, this.f152290i);
                } else {
                    aVar.mo17388b(i, i2, 1, this.f152290i);
                }
            }
        }

        /* renamed from: k */
        public float mo3227k(DisplayMetrics displayMetrics) {
            C87412m.m108594g(displayMetrics, "displayMetrics");
            return this.f187882n.f187874i / ((float) displayMetrics.densityDpi);
        }
    }

    /* renamed from: ub2.a$e */
    public static final class C65262e extends RecyclerView.C16615g {

        /* renamed from: a */
        public final /* synthetic */ C65257a f187884a;

        /* renamed from: ub2.a$e$a */
        public static final class C65263a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ C65257a f187885d;

            public C65263a(C65257a aVar) {
                this.f187885d = aVar;
            }

            public final void run() {
                this.f187885d.mo89392n();
            }
        }

        /* renamed from: ub2.a$e$b */
        public static final class C65264b implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ C65257a f187886d;

            public C65264b(C65257a aVar) {
                this.f187886d = aVar;
            }

            public final void run() {
                this.f187886d.mo89392n();
            }
        }

        public C65262e(C65257a aVar) {
            this.f187884a = aVar;
        }

        /* renamed from: b */
        public void mo2556b() {
            RecyclerView recyclerView;
            C65257a aVar = this.f187884a;
            if (aVar.f187878m == -1 && (recyclerView = aVar.f187873h) != null) {
                recyclerView.post(new C65263a(aVar));
            }
        }

        /* renamed from: e */
        public void mo2559e(int i, int i2) {
            RecyclerView recyclerView;
            C65257a aVar = this.f187884a;
            if (aVar.f187878m == -1 && (recyclerView = aVar.f187873h) != null) {
                recyclerView.post(new C65264b(aVar));
            }
        }
    }

    /* renamed from: ub2.a$f */
    public static final class C65265f extends RecyclerView.C0130p {

        /* renamed from: d */
        public final /* synthetic */ C65257a f187887d;

        public C65265f(C65257a aVar) {
            this.f187887d = aVar;
        }

        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(recyclerView);
            arrayList.add(Integer.valueOf(i));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/mv/ui/view/CenterPagerSnapHelper$scrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
            C87412m.m108594g(recyclerView, "recyclerView");
            super.onScrollStateChanged(recyclerView, i);
            Log.m105924i("MicroMsg.CenterPagerSnapHelper", "onScrollStateChanged:" + i + ", snapPosition:" + this.f187887d.f187878m);
            if (i == 0) {
                C65257a aVar = this.f187887d;
                aVar.f187875j = false;
                aVar.mo89392n();
            }
            if (i == 1) {
                C65257a aVar2 = this.f187887d;
                aVar2.f187875j = true;
                C65260c cVar = aVar2.f187881p;
                if (cVar != null) {
                    cVar.mo80467a(aVar2.f187878m);
                }
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/mv/ui/view/CenterPagerSnapHelper$scrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
        }

        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(recyclerView);
            arrayList.add(Integer.valueOf(i));
            arrayList.add(Integer.valueOf(i2));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/mv/ui/view/CenterPagerSnapHelper$scrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
            super.onScrolled(recyclerView, i, i2);
            C117292a.m165361g(this, "com/tencent/mm/plugin/mv/ui/view/CenterPagerSnapHelper$scrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
        }
    }

    /* renamed from: b */
    public void mo75025b(RecyclerView recyclerView) {
        RecyclerView.C16613e adapter;
        RecyclerView.C16613e adapter2;
        super.mo75025b(recyclerView);
        RecyclerView recyclerView2 = this.f187873h;
        if (recyclerView2 != null) {
            recyclerView2.mo17098m1(this.f187876k);
        }
        RecyclerView recyclerView3 = this.f187873h;
        if (!(recyclerView3 == null || (adapter2 = recyclerView3.getAdapter()) == null)) {
            adapter2.unregisterAdapterDataObserver(this.f187877l);
        }
        this.f187873h = recyclerView;
        if (recyclerView != null) {
            recyclerView.mo17043c(this.f187876k);
        }
        RecyclerView recyclerView4 = this.f187873h;
        if (!(recyclerView4 == null || (adapter = recyclerView4.getAdapter()) == null)) {
            adapter.registerAdapterDataObserver(this.f187877l);
        }
        mo89392n();
    }

    /* renamed from: d */
    public RecyclerView.C16634v mo75027d(RecyclerView.LayoutManager layoutManager) {
        C87412m.m108594g(layoutManager, "layoutManager");
        Context context = null;
        if (!(layoutManager instanceof RecyclerView.C16634v.C16636b)) {
            return null;
        }
        RecyclerView recyclerView = this.f187873h;
        if (recyclerView != null) {
            context = recyclerView.getContext();
        }
        return new C65261d(this, layoutManager, context);
    }

    /* renamed from: f */
    public View mo75029f(RecyclerView.LayoutManager layoutManager) {
        View f = super.mo75029f(layoutManager);
        RecyclerView.LayoutParams layoutParams = null;
        ViewGroup.LayoutParams layoutParams2 = f != null ? f.getLayoutParams() : null;
        if (layoutParams2 instanceof RecyclerView.LayoutParams) {
            layoutParams = (RecyclerView.LayoutParams) layoutParams2;
        }
        int a = layoutParams != null ? layoutParams.mo17279a() : -1;
        if (this.f187878m != a) {
            this.f187878m = a;
            C65258a aVar = this.f187879n;
            if (aVar != null) {
                aVar.onPageSelected(a);
            }
        }
        return f;
    }

    /* renamed from: g */
    public int mo75030g(RecyclerView.LayoutManager layoutManager, int i, int i2) {
        C16682y yVar;
        int i3;
        int i4;
        PointF f;
        C87412m.m108594g(layoutManager, "layoutManager");
        int itemCount = layoutManager.getItemCount();
        if (itemCount == 0) {
            return -1;
        }
        if (layoutManager.canScrollVertically()) {
            C16682y yVar2 = this.f187871f;
            if (yVar2 == null || yVar2.f45081a != layoutManager) {
                this.f187871f = new C16681x(layoutManager);
            }
            yVar = this.f187871f;
            C87412m.m108591d(yVar);
        } else {
            C16682y yVar3 = this.f187872g;
            if (yVar3 == null || yVar3.f45081a != layoutManager) {
                this.f187872g = new C16680w(layoutManager);
            }
            yVar = this.f187872g;
            C87412m.m108591d(yVar);
        }
        int childCount = layoutManager.getChildCount();
        View view = null;
        int i5 = 0;
        if (childCount != 0) {
            int k = layoutManager.getClipToPadding() ? yVar.mo17570k() + (yVar.mo17571l() / 2) : yVar.mo17565f() / 2;
            int i6 = Integer.MAX_VALUE;
            for (int i7 = 0; i7 < childCount; i7++) {
                View childAt = layoutManager.getChildAt(i7);
                int abs = Math.abs((yVar.mo17564e(childAt) + (yVar.mo17562c(childAt) / 2)) - k);
                if (abs < i6) {
                    view = childAt;
                    i6 = abs;
                }
            }
        }
        if (view == null) {
            return -1;
        }
        int position = layoutManager.getPosition(view);
        if (yVar.mo17564e(view) < yVar.mo17570k()) {
            i3 = position + 1;
            i4 = position;
        } else {
            i4 = position - 1;
            i3 = position;
        }
        if (position == -1) {
            return -1;
        }
        boolean z = !layoutManager.canScrollHorizontally() ? i2 > 0 : i > 0;
        if (!((layoutManager instanceof RecyclerView.C16634v.C16636b) && (f = ((RecyclerView.C16634v.C16636b) layoutManager).mo16988f(itemCount + -1)) != null && (f.x < 0.0f || f.y < 0.0f)) ? z : !z) {
            i4 = i3;
        }
        if (i4 >= 0) {
            i5 = i4;
        }
        if (i5 >= itemCount) {
            i5 = itemCount - 1;
        }
        if (i5 != this.f187878m) {
            this.f187878m = i5;
            C65258a aVar = this.f187879n;
            if (aVar != null) {
                aVar.onPageSelected(i5);
            }
        }
        return this.f187878m;
    }

    /* renamed from: n */
    public final void mo89392n() {
        RecyclerView recyclerView;
        RecyclerView.LayoutManager layoutManager;
        View f;
        C65259b bVar;
        if (this.f187880o != null && (recyclerView = this.f187873h) != null && (layoutManager = recyclerView.getLayoutManager()) != null && (f = mo75029f(layoutManager)) != null) {
            int[] c = mo75026c(layoutManager, f);
            if ((c[0] == 0 || c[1] == 0) && (bVar = this.f187880o) != null) {
                bVar.mo80443a(this.f187878m);
            }
        }
    }
}
