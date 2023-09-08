package k71;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.C16680w;
import androidx.recyclerview.widget.C16681x;
import androidx.recyclerview.widget.C16682y;
import androidx.recyclerview.widget.C54256s;
import androidx.recyclerview.widget.C54257t;
import androidx.recyclerview.widget.RecyclerView;
import gy3.C87412m;

/* renamed from: k71.c */
public final class C60981c extends C54257t {

    /* renamed from: f */
    public RecyclerView f173683f;

    /* renamed from: g */
    public C16682y f173684g;

    /* renamed from: h */
    public C16682y f173685h;

    /* renamed from: i */
    public C60982a f173686i;

    /* renamed from: k71.c$a */
    public interface C60982a {
        void onPageSelected(int i);
    }

    /* renamed from: k71.c$b */
    public static final class C60983b extends C54256s {

        /* renamed from: n */
        public final /* synthetic */ C60981c f173687n;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60983b(C60981c cVar, Context context) {
            super(context);
            this.f173687n = cVar;
        }

        /* renamed from: f */
        public void mo17385f(View view, RecyclerView.C16628w wVar, RecyclerView.C16634v.C16635a aVar) {
            C87412m.m108594g(view, "targetView");
            C87412m.m108594g(wVar, "state");
            C87412m.m108594g(aVar, "action");
            C60981c cVar = this.f173687n;
            RecyclerView recyclerView = cVar.f173683f;
            if (recyclerView != null) {
                RecyclerView.LayoutManager layoutManager = recyclerView != null ? recyclerView.getLayoutManager() : null;
                C87412m.m108591d(layoutManager);
                int[] c = cVar.mo75026c(layoutManager, view);
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
    }

    /* renamed from: b */
    public void mo75025b(RecyclerView recyclerView) {
        super.mo75025b(recyclerView);
        this.f173683f = recyclerView;
    }

    /* renamed from: d */
    public RecyclerView.C16634v mo75027d(RecyclerView.LayoutManager layoutManager) {
        C87412m.m108594g(layoutManager, "layoutManager");
        Context context = null;
        if (!(layoutManager instanceof RecyclerView.C16634v.C16636b)) {
            return null;
        }
        RecyclerView recyclerView = this.f173683f;
        if (recyclerView != null) {
            context = recyclerView.getContext();
        }
        return new C60983b(this, context);
    }

    /* renamed from: f */
    public View mo75029f(RecyclerView.LayoutManager layoutManager) {
        C16682y yVar;
        View view;
        int i;
        int i2;
        RecyclerView.LayoutParams layoutParams = null;
        if (layoutManager == null) {
            return null;
        }
        if (layoutManager.canScrollHorizontally()) {
            C16682y yVar2 = this.f173685h;
            if (yVar2 == null || yVar2.f45081a != layoutManager) {
                this.f173685h = new C16680w(layoutManager);
            }
            yVar = this.f173685h;
            C87412m.m108591d(yVar);
        } else {
            C16682y yVar3 = this.f173684g;
            if (yVar3 == null || yVar3.f45081a != layoutManager) {
                this.f173684g = new C16681x(layoutManager);
            }
            yVar = this.f173684g;
            C87412m.m108591d(yVar);
        }
        int childCount = layoutManager.getChildCount();
        if (childCount == 0) {
            view = null;
        } else {
            int k = layoutManager.getClipToPadding() ? yVar.mo17570k() + (yVar.mo17571l() / 2) : yVar.mo17565f() / 2;
            int i3 = Integer.MAX_VALUE;
            view = null;
            for (int i4 = 0; i4 < childCount; i4++) {
                View childAt = layoutManager.getChildAt(i4);
                if (childAt != null) {
                    if (layoutManager.canScrollHorizontally()) {
                        i2 = childAt.getLeft();
                        i = childAt.getMeasuredWidth() / 2;
                    } else {
                        i2 = childAt.getTop();
                        i = childAt.getMeasuredHeight() / 2;
                    }
                    int abs = Math.abs((i2 + i) - k);
                    if (abs < i3) {
                        view = childAt;
                        i3 = abs;
                    }
                }
            }
        }
        ViewGroup.LayoutParams layoutParams2 = view != null ? view.getLayoutParams() : null;
        if (layoutParams2 instanceof RecyclerView.LayoutParams) {
            layoutParams = (RecyclerView.LayoutParams) layoutParams2;
        }
        int a = layoutParams != null ? layoutParams.mo17279a() : -1;
        C60982a aVar = this.f173686i;
        if (aVar != null) {
            aVar.onPageSelected(a);
        }
        return view;
    }

    /* renamed from: g */
    public int mo75030g(RecyclerView.LayoutManager layoutManager, int i, int i2) {
        int g = super.mo75030g(layoutManager, i, i2);
        C60982a aVar = this.f173686i;
        if (aVar != null) {
            aVar.onPageSelected(g);
        }
        return g;
    }
}
