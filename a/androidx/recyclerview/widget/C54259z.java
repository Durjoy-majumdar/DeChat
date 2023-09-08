package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: androidx.recyclerview.widget.z */
public class C54259z extends C54240f0 {

    /* renamed from: d */
    public C16682y f152297d;

    /* renamed from: e */
    public C16682y f152298e;

    /* renamed from: androidx.recyclerview.widget.z$a */
    public class C54260a extends C54256s {
        public C54260a(Context context) {
            super(context);
        }

        /* renamed from: f */
        public void mo17385f(View view, RecyclerView.C16628w wVar, RecyclerView.C16634v.C16635a aVar) {
            C54259z zVar = C54259z.this;
            int[] c = zVar.mo75026c(zVar.f152241a.getLayoutManager(), view);
            int i = c[0];
            int i2 = c[1];
            int l = mo10339l(Math.max(Math.abs(i), Math.abs(i2)));
            if (l > 0) {
                aVar.mo17388b(i, i2, l, this.f152290i);
            }
        }

        /* renamed from: k */
        public float mo3227k(DisplayMetrics displayMetrics) {
            return 100.0f / ((float) displayMetrics.densityDpi);
        }

        /* renamed from: m */
        public int mo10340m(int i) {
            return Math.min(100, super.mo10340m(i));
        }
    }

    /* renamed from: j */
    private View mo85777j(RecyclerView.LayoutManager layoutManager, C16682y yVar) {
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
            if (abs < i) {
                view = childAt;
                i = abs;
            }
        }
        return view;
    }

    /* renamed from: l */
    private C16682y mo85778l(RecyclerView.LayoutManager layoutManager) {
        C16682y yVar = this.f152298e;
        if (yVar == null || yVar.f45081a != layoutManager) {
            this.f152298e = new C16680w(layoutManager);
        }
        return this.f152298e;
    }

    /* renamed from: m */
    private C16682y mo83506m(RecyclerView.LayoutManager layoutManager) {
        C16682y yVar = this.f152297d;
        if (yVar == null || yVar.f45081a != layoutManager) {
            this.f152297d = new C16681x(layoutManager);
        }
        return this.f152297d;
    }

    /* renamed from: c */
    public int[] mo75026c(RecyclerView.LayoutManager layoutManager, View view) {
        int[] iArr = new int[2];
        if (layoutManager.canScrollHorizontally()) {
            iArr[0] = mo75055i(layoutManager, view, mo85778l(layoutManager));
        } else {
            iArr[0] = 0;
        }
        if (layoutManager.canScrollVertically()) {
            iArr[1] = mo75055i(layoutManager, view, mo83506m(layoutManager));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    /* renamed from: e */
    public C54256s mo75028e(RecyclerView.LayoutManager layoutManager) {
        if (!(layoutManager instanceof RecyclerView.C16634v.C16636b)) {
            return null;
        }
        return new C54260a(this.f152241a.getContext());
    }

    /* renamed from: f */
    public View mo75029f(RecyclerView.LayoutManager layoutManager) {
        if (layoutManager.canScrollVertically()) {
            return mo85777j(layoutManager, mo83506m(layoutManager));
        }
        if (layoutManager.canScrollHorizontally()) {
            return mo85777j(layoutManager, mo85778l(layoutManager));
        }
        return null;
    }

    /* renamed from: g */
    public int mo75030g(RecyclerView.LayoutManager layoutManager, int i, int i2) {
        int position;
        PointF f;
        int itemCount = layoutManager.getItemCount();
        if (itemCount == 0) {
            return -1;
        }
        View view = null;
        if (layoutManager.canScrollVertically()) {
            view = mo75056k(layoutManager, mo83506m(layoutManager));
        } else if (layoutManager.canScrollHorizontally()) {
            view = mo75056k(layoutManager, mo85778l(layoutManager));
        }
        if (view == null || (position = layoutManager.getPosition(view)) == -1) {
            return -1;
        }
        boolean z = false;
        boolean z2 = !layoutManager.canScrollHorizontally() ? i2 > 0 : i > 0;
        if ((layoutManager instanceof RecyclerView.C16634v.C16636b) && (f = ((RecyclerView.C16634v.C16636b) layoutManager).mo16988f(itemCount - 1)) != null && (f.x < 0.0f || f.y < 0.0f)) {
            z = true;
        }
        return z ? z2 ? position - 1 : position : z2 ? position + 1 : position;
    }

    /* renamed from: i */
    public final int mo75055i(RecyclerView.LayoutManager layoutManager, View view, C16682y yVar) {
        return (yVar.mo17564e(view) + (yVar.mo17562c(view) / 2)) - (layoutManager.getClipToPadding() ? yVar.mo17570k() + (yVar.mo17571l() / 2) : yVar.mo17565f() / 2);
    }

    /* renamed from: k */
    public final View mo75056k(RecyclerView.LayoutManager layoutManager, C16682y yVar) {
        int childCount = layoutManager.getChildCount();
        View view = null;
        if (childCount == 0) {
            return null;
        }
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = layoutManager.getChildAt(i2);
            int e = yVar.mo17564e(childAt);
            if (e < i) {
                view = childAt;
                i = e;
            }
        }
        return view;
    }
}
