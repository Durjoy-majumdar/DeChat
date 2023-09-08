package p816jl;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.C16682y;
import androidx.recyclerview.widget.C54256s;
import androidx.recyclerview.widget.C54259z;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: jl.a */
public class C60878a extends C54259z {

    /* renamed from: f */
    public C16682y f173440f;

    /* renamed from: g */
    public C16682y f173441g;

    /* renamed from: h */
    public RecyclerView f173442h;

    /* renamed from: i */
    public float f173443i = 50.0f;

    /* renamed from: j */
    public final C60884f f173444j = new C60884f(this);

    /* renamed from: k */
    public final C60881e f173445k = new C60881e(this);

    /* renamed from: l */
    public int f173446l = -1;

    /* renamed from: m */
    public C46560a f173447m;

    /* renamed from: n */
    public C46561b f173448n;

    /* renamed from: o */
    public C60879c f173449o;

    /* renamed from: jl.a$a */
    public interface C46560a {
        void onPageSelected(int i);
    }

    /* renamed from: jl.a$b */
    public interface C46561b {
        /* renamed from: a */
        void mo67434a(int i);
    }

    /* renamed from: jl.a$c */
    public interface C60879c {
        /* renamed from: a */
        void mo6660a(int i);
    }

    /* renamed from: jl.a$d */
    public static final class C60880d extends C54256s {

        /* renamed from: n */
        public final /* synthetic */ C60878a f173450n;

        /* renamed from: o */
        public final /* synthetic */ RecyclerView.LayoutManager f173451o;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60880d(C60878a aVar, RecyclerView.LayoutManager layoutManager, Context context) {
            super(context);
            this.f173450n = aVar;
            this.f173451o = layoutManager;
        }

        /* renamed from: f */
        public void mo17385f(View view, RecyclerView.C16628w wVar, RecyclerView.C16634v.C16635a aVar) {
            C87412m.m108594g(view, "targetView");
            C87412m.m108594g(wVar, "state");
            C87412m.m108594g(aVar, "action");
            C60878a aVar2 = this.f173450n;
            if (aVar2.f173442h != null) {
                int[] c = aVar2.mo75026c(this.f173451o, view);
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
            return this.f173450n.f173443i / ((float) displayMetrics.densityDpi);
        }
    }

    /* renamed from: jl.a$e */
    public static final class C60881e extends RecyclerView.C16615g {

        /* renamed from: a */
        public final /* synthetic */ C60878a f173452a;

        /* renamed from: jl.a$e$a */
        public static final class C60882a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ C60878a f173453d;

            public C60882a(C60878a aVar) {
                this.f173453d = aVar;
            }

            public final void run() {
                this.f173453d.mo85779n();
            }
        }

        /* renamed from: jl.a$e$b */
        public static final class C60883b implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ C60878a f173454d;

            public C60883b(C60878a aVar) {
                this.f173454d = aVar;
            }

            public final void run() {
                this.f173454d.mo85779n();
            }
        }

        public C60881e(C60878a aVar) {
            this.f173452a = aVar;
        }

        /* renamed from: b */
        public void mo2556b() {
            RecyclerView recyclerView;
            C60878a aVar = this.f173452a;
            if (aVar.f173446l == -1 && (recyclerView = aVar.f173442h) != null) {
                recyclerView.post(new C60882a(aVar));
            }
        }

        /* renamed from: e */
        public void mo2559e(int i, int i2) {
            RecyclerView recyclerView;
            C60878a aVar = this.f173452a;
            if (aVar.f173446l == -1 && (recyclerView = aVar.f173442h) != null) {
                recyclerView.post(new C60883b(aVar));
            }
        }
    }

    /* renamed from: jl.a$f */
    public static final class C60884f extends RecyclerView.C0130p {

        /* renamed from: d */
        public final /* synthetic */ C60878a f173455d;

        public C60884f(C60878a aVar) {
            this.f173455d = aVar;
        }

        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(recyclerView);
            arrayList.add(Integer.valueOf(i));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/emoji/panel/layout/CenterPagerSnapHelper$scrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
            C87412m.m108594g(recyclerView, "recyclerView");
            super.onScrollStateChanged(recyclerView, i);
            Log.m105924i("MicroMsg.CenterPagerSnapHelper", "onScrollStateChanged:" + i + ", snapPosition:" + this.f173455d.f173446l);
            if (i == 0) {
                this.f173455d.getClass();
                this.f173455d.mo85779n();
            }
            if (i == 1) {
                this.f173455d.getClass();
                C60878a aVar = this.f173455d;
                C60879c cVar = aVar.f173449o;
                if (cVar != null) {
                    cVar.mo6660a(aVar.f173446l);
                }
            }
            C117292a.m165361g(this, "com/tencent/mm/emoji/panel/layout/CenterPagerSnapHelper$scrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
        }

        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(recyclerView);
            arrayList.add(Integer.valueOf(i));
            arrayList.add(Integer.valueOf(i2));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/emoji/panel/layout/CenterPagerSnapHelper$scrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
            super.onScrolled(recyclerView, i, i2);
            C117292a.m165361g(this, "com/tencent/mm/emoji/panel/layout/CenterPagerSnapHelper$scrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
        }
    }

    /* renamed from: b */
    public void mo75025b(RecyclerView recyclerView) {
        RecyclerView.C16613e adapter;
        RecyclerView.C16613e adapter2;
        super.mo75025b(recyclerView);
        RecyclerView recyclerView2 = this.f173442h;
        if (recyclerView2 != null) {
            recyclerView2.mo17098m1(this.f173444j);
        }
        RecyclerView recyclerView3 = this.f173442h;
        if (!(recyclerView3 == null || (adapter2 = recyclerView3.getAdapter()) == null)) {
            adapter2.unregisterAdapterDataObserver(this.f173445k);
        }
        this.f173442h = recyclerView;
        if (recyclerView != null) {
            recyclerView.mo17043c(this.f173444j);
        }
        RecyclerView recyclerView4 = this.f173442h;
        if (!(recyclerView4 == null || (adapter = recyclerView4.getAdapter()) == null)) {
            adapter.registerAdapterDataObserver(this.f173445k);
        }
        mo85779n();
    }

    /* renamed from: d */
    public RecyclerView.C16634v mo75027d(RecyclerView.LayoutManager layoutManager) {
        Context context = null;
        if (!(layoutManager instanceof RecyclerView.C16634v.C16636b)) {
            return null;
        }
        RecyclerView recyclerView = this.f173442h;
        if (recyclerView != null) {
            context = recyclerView.getContext();
        }
        return new C60880d(this, layoutManager, context);
    }

    /* renamed from: f */
    public View mo75029f(RecyclerView.LayoutManager layoutManager) {
        View o = mo85780o(layoutManager);
        RecyclerView.LayoutParams layoutParams = null;
        ViewGroup.LayoutParams layoutParams2 = o != null ? o.getLayoutParams() : null;
        if (layoutParams2 instanceof RecyclerView.LayoutParams) {
            layoutParams = (RecyclerView.LayoutParams) layoutParams2;
        }
        int a = layoutParams != null ? layoutParams.mo17279a() : -1;
        if (this.f173446l != a) {
            this.f173446l = a;
            C46560a aVar = this.f173447m;
            if (aVar != null) {
                aVar.onPageSelected(a);
            }
        }
        return o;
    }

    /* renamed from: g */
    public int mo75030g(RecyclerView.LayoutManager layoutManager, int i, int i2) {
        int i3;
        int i4;
        PointF f;
        C87412m.m108594g(layoutManager, "layoutManager");
        int itemCount = layoutManager.getItemCount();
        if (itemCount == 0) {
            return -1;
        }
        C16682y m = layoutManager.canScrollVertically() ? mo83506m(layoutManager) : mo85778l(layoutManager);
        View j = mo85777j(layoutManager, m);
        if (j == null) {
            return -1;
        }
        int position = layoutManager.getPosition(j);
        if (m.mo17564e(j) < m.mo17570k()) {
            i3 = position + 1;
            i4 = position;
        } else {
            i4 = position - 1;
            i3 = position;
        }
        if (position == -1) {
            return -1;
        }
        int i5 = 0;
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
        if (i5 != this.f173446l) {
            this.f173446l = i5;
            C46560a aVar = this.f173447m;
            if (aVar != null) {
                aVar.onPageSelected(i5);
            }
        }
        return this.f173446l;
    }

    /* renamed from: j */
    public final View mo85777j(RecyclerView.LayoutManager layoutManager, C16682y yVar) {
        C87412m.m108594g(layoutManager, "layoutManager");
        C87412m.m108594g(yVar, "helper");
        int childCount = layoutManager.getChildCount();
        View view = null;
        if (childCount == 0) {
            return null;
        }
        int k = layoutManager.getClipToPadding() ? yVar.mo17570k() + (yVar.mo17571l() / 2) : yVar.mo17565f() / 2;
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = layoutManager.getChildAt(i2);
            int abs = Math.abs((yVar.mo17564e(childAt) + (yVar.mo17562c(childAt) / 2)) - k);
            if (mo85781p(childAt, layoutManager, yVar)) {
                return childAt;
            }
            if (abs < i) {
                view = childAt;
                i = abs;
            }
        }
        return view;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000e, code lost:
        if (r0.f45081a != r2) goto L_0x0010;
     */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final androidx.recyclerview.widget.C16682y mo85778l(androidx.recyclerview.widget.RecyclerView.LayoutManager r2) {
        /*
            r1 = this;
            java.lang.String r0 = "layoutManager"
            gy3.C87412m.m108594g(r2, r0)
            androidx.recyclerview.widget.y r0 = r1.f173441g
            if (r0 == 0) goto L_0x0010
            gy3.C87412m.m108591d(r0)
            androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r0.f45081a
            if (r0 == r2) goto L_0x0017
        L_0x0010:
            androidx.recyclerview.widget.w r0 = new androidx.recyclerview.widget.w
            r0.<init>(r2)
            r1.f173441g = r0
        L_0x0017:
            androidx.recyclerview.widget.y r2 = r1.f173441g
            gy3.C87412m.m108591d(r2)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p816jl.C60878a.mo85778l(androidx.recyclerview.widget.RecyclerView$LayoutManager):androidx.recyclerview.widget.y");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000e, code lost:
        if (r0.f45081a != r2) goto L_0x0010;
     */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final androidx.recyclerview.widget.C16682y mo83506m(androidx.recyclerview.widget.RecyclerView.LayoutManager r2) {
        /*
            r1 = this;
            java.lang.String r0 = "layoutManager"
            gy3.C87412m.m108594g(r2, r0)
            androidx.recyclerview.widget.y r0 = r1.f173440f
            if (r0 == 0) goto L_0x0010
            gy3.C87412m.m108591d(r0)
            androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r0.f45081a
            if (r0 == r2) goto L_0x0017
        L_0x0010:
            androidx.recyclerview.widget.x r0 = new androidx.recyclerview.widget.x
            r0.<init>(r2)
            r1.f173440f = r0
        L_0x0017:
            androidx.recyclerview.widget.y r2 = r1.f173440f
            gy3.C87412m.m108591d(r2)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p816jl.C60878a.mo83506m(androidx.recyclerview.widget.RecyclerView$LayoutManager):androidx.recyclerview.widget.y");
    }

    /* renamed from: n */
    public final void mo85779n() {
        RecyclerView recyclerView;
        RecyclerView.LayoutManager layoutManager;
        View f;
        C46561b bVar;
        if (this.f173448n != null && (recyclerView = this.f173442h) != null && (layoutManager = recyclerView.getLayoutManager()) != null && (f = mo75029f(layoutManager)) != null) {
            int[] c = mo75026c(layoutManager, f);
            if ((c[0] == 0 || c[1] == 0) && (bVar = this.f173448n) != null) {
                bVar.mo67434a(this.f173446l);
            }
        }
    }

    /* renamed from: o */
    public View mo85780o(RecyclerView.LayoutManager layoutManager) {
        return super.mo75029f(layoutManager);
    }

    /* renamed from: p */
    public boolean mo85781p(View view, RecyclerView.LayoutManager layoutManager, C16682y yVar) {
        C87412m.m108594g(layoutManager, "layoutManager");
        C87412m.m108594g(yVar, "helper");
        return false;
    }
}
