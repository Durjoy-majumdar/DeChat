package y03;

import a13.C53849g;
import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.recyclerview.widget.C16680w;
import androidx.recyclerview.widget.C16681x;
import androidx.recyclerview.widget.C16682y;
import androidx.recyclerview.widget.C54256s;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: y03.b */
public class C66481b extends C53849g {

    /* renamed from: c */
    public C16682y f191257c;

    /* renamed from: d */
    public C16682y f191258d;

    /* renamed from: y03.b$a */
    public class C66482a extends C54256s {
        public C66482a(Context context) {
            super(context);
        }

        /* renamed from: f */
        public void mo17385f(View view, RecyclerView.C16628w wVar, RecyclerView.C16634v.C16635a aVar) {
            C66481b bVar = C66481b.this;
            int[] c = bVar.mo74460c(bVar.f151090a.getLayoutManager(), view);
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

    /* renamed from: c */
    public int[] mo74460c(RecyclerView.LayoutManager layoutManager, View view) {
        int[] iArr = new int[2];
        if (layoutManager.canScrollHorizontally()) {
            iArr[0] = mo90562h(layoutManager, view, mo90565k(layoutManager));
        } else {
            iArr[0] = 0;
        }
        if (layoutManager.canScrollVertically()) {
            iArr[1] = mo90562h(layoutManager, view, mo90566l(layoutManager));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    /* renamed from: d */
    public C54256s mo74461d(RecyclerView.LayoutManager layoutManager) {
        if (!(layoutManager instanceof RecyclerView.C16634v.C16636b)) {
            return null;
        }
        return new C66482a(this.f151090a.getContext());
    }

    /* renamed from: e */
    public View mo74462e(RecyclerView.LayoutManager layoutManager) {
        if (layoutManager.canScrollVertically()) {
            return mo90563i(layoutManager, mo90566l(layoutManager));
        }
        if (layoutManager.canScrollHorizontally()) {
            return mo90563i(layoutManager, mo90565k(layoutManager));
        }
        return null;
    }

    /* renamed from: f */
    public int mo74463f(RecyclerView.LayoutManager layoutManager, int i, int i2) {
        int itemCount;
        int position;
        PointF f;
        if (Math.abs(i2) <= 500 || Math.abs(i) >= Math.abs(i2) || (itemCount = layoutManager.getItemCount()) == 0) {
            return -1;
        }
        View view = null;
        if (layoutManager.canScrollVertically()) {
            view = mo90564j(layoutManager, mo90566l(layoutManager));
        } else if (layoutManager.canScrollHorizontally()) {
            view = mo90564j(layoutManager, mo90565k(layoutManager));
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

    /* renamed from: h */
    public final int mo90562h(RecyclerView.LayoutManager layoutManager, View view, C16682y yVar) {
        return (yVar.mo17564e(view) + (yVar.mo17562c(view) / 2)) - (layoutManager.getClipToPadding() ? yVar.mo17570k() + (yVar.mo17571l() / 2) : yVar.mo17565f() / 2);
    }

    /* renamed from: i */
    public final View mo90563i(RecyclerView.LayoutManager layoutManager, C16682y yVar) {
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

    /* renamed from: j */
    public final View mo90564j(RecyclerView.LayoutManager layoutManager, C16682y yVar) {
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

    /* renamed from: k */
    public final C16682y mo90565k(RecyclerView.LayoutManager layoutManager) {
        C16682y yVar = this.f191258d;
        if (yVar == null || yVar.f45081a != layoutManager) {
            this.f191258d = new C16680w(layoutManager);
        }
        return this.f191258d;
    }

    /* renamed from: l */
    public final C16682y mo90566l(RecyclerView.LayoutManager layoutManager) {
        C16682y yVar = this.f191257c;
        if (yVar == null || yVar.f45081a != layoutManager) {
            this.f191257c = new C16681x(layoutManager);
        }
        return this.f191257c;
    }
}
