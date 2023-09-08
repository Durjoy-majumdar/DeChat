package androidx.recyclerview.widget;

import android.graphics.PointF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: androidx.recyclerview.widget.t */
public class C54257t extends C54240f0 {

    /* renamed from: d */
    public C16682y f152295d;

    /* renamed from: e */
    public C16682y f152296e;

    /* renamed from: c */
    public int[] mo75026c(RecyclerView.LayoutManager layoutManager, View view) {
        int[] iArr = new int[2];
        if (layoutManager.canScrollHorizontally()) {
            iArr[0] = mo75050i(layoutManager, view, mo75053l(layoutManager));
        } else {
            iArr[0] = 0;
        }
        if (layoutManager.canScrollVertically()) {
            iArr[1] = mo75050i(layoutManager, view, mo75054m(layoutManager));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    /* renamed from: f */
    public View mo75029f(RecyclerView.LayoutManager layoutManager) {
        if (layoutManager.canScrollVertically()) {
            return mo75052k(layoutManager, mo75054m(layoutManager));
        }
        if (layoutManager.canScrollHorizontally()) {
            return mo75052k(layoutManager, mo75053l(layoutManager));
        }
        return null;
    }

    /* renamed from: g */
    public int mo75030g(RecyclerView.LayoutManager layoutManager, int i, int i2) {
        int itemCount;
        View f;
        int position;
        int i3;
        PointF f2;
        int i4;
        int i5;
        if (!(layoutManager instanceof RecyclerView.C16634v.C16636b) || (itemCount = layoutManager.getItemCount()) == 0 || (f = mo75029f(layoutManager)) == null || (position = layoutManager.getPosition(f)) == -1 || (f2 = ((RecyclerView.C16634v.C16636b) layoutManager).mo16988f(i3)) == null) {
            return -1;
        }
        int i6 = 0;
        if (layoutManager.canScrollHorizontally()) {
            i4 = mo75051j(layoutManager, mo75053l(layoutManager), i, 0);
            if (f2.x < 0.0f) {
                i4 = -i4;
            }
        } else {
            i4 = 0;
        }
        if (layoutManager.canScrollVertically()) {
            i5 = mo75051j(layoutManager, mo75054m(layoutManager), 0, i2);
            if (f2.y < 0.0f) {
                i5 = -i5;
            }
        } else {
            i5 = 0;
        }
        if (layoutManager.canScrollVertically()) {
            i4 = i5;
        }
        if (i4 == 0) {
            return -1;
        }
        int i7 = position + i4;
        if (i7 >= 0) {
            i6 = i7;
        }
        return i6 >= itemCount ? itemCount - 1 : i6;
    }

    /* renamed from: i */
    public final int mo75050i(RecyclerView.LayoutManager layoutManager, View view, C16682y yVar) {
        return (yVar.mo17564e(view) + (yVar.mo17562c(view) / 2)) - (layoutManager.getClipToPadding() ? yVar.mo17570k() + (yVar.mo17571l() / 2) : yVar.mo17565f() / 2);
    }

    /* renamed from: j */
    public final int mo75051j(RecyclerView.LayoutManager layoutManager, C16682y yVar, int i, int i2) {
        int max;
        this.f152242b.fling(0, 0, i, i2, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
        int[] iArr = {this.f152242b.getFinalX(), this.f152242b.getFinalY()};
        int childCount = layoutManager.getChildCount();
        float f = 1.0f;
        if (childCount != 0) {
            View view = null;
            View view2 = null;
            int i3 = Integer.MAX_VALUE;
            int i4 = Integer.MIN_VALUE;
            for (int i5 = 0; i5 < childCount; i5++) {
                View childAt = layoutManager.getChildAt(i5);
                int position = layoutManager.getPosition(childAt);
                if (position != -1) {
                    if (position < i3) {
                        view = childAt;
                        i3 = position;
                    }
                    if (position > i4) {
                        view2 = childAt;
                        i4 = position;
                    }
                }
            }
            if (!(view == null || view2 == null || (max = Math.max(yVar.mo17561b(view), yVar.mo17561b(view2)) - Math.min(yVar.mo17564e(view), yVar.mo17564e(view2))) == 0)) {
                f = (((float) max) * 1.0f) / ((float) ((i4 - i3) + 1));
            }
        }
        if (f <= 0.0f) {
            return 0;
        }
        return Math.round(((float) (Math.abs(iArr[0]) > Math.abs(iArr[1]) ? iArr[0] : iArr[1])) / f);
    }

    /* renamed from: k */
    public final View mo75052k(RecyclerView.LayoutManager layoutManager, C16682y yVar) {
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
    public final C16682y mo75053l(RecyclerView.LayoutManager layoutManager) {
        C16682y yVar = this.f152296e;
        if (yVar == null || yVar.f45081a != layoutManager) {
            this.f152296e = new C16680w(layoutManager);
        }
        return this.f152296e;
    }

    /* renamed from: m */
    public final C16682y mo75054m(RecyclerView.LayoutManager layoutManager) {
        C16682y yVar = this.f152295d;
        if (yVar == null || yVar.f45081a != layoutManager) {
            this.f152295d = new C16681x(layoutManager);
        }
        return this.f152295d;
    }
}
