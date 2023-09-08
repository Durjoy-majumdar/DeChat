package ub2;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

/* renamed from: ub2.c */
public class C14143c extends RecyclerView.C0129l {

    /* renamed from: d */
    public Drawable f39572d;

    /* renamed from: e */
    public boolean f39573e;

    /* renamed from: f */
    public int f39574f;

    /* renamed from: g */
    public int f39575g;

    public C14143c(int i, int i2, int i3, boolean z, C14144a aVar) {
        this.f39574f = i;
        this.f39573e = z;
        this.f39575g = i2;
        this.f39572d = new ColorDrawable(i3);
    }

    /* renamed from: g */
    public void mo21g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C16628w wVar) {
        int j = mo13554j(recyclerView);
        int itemCount = recyclerView.getAdapter().getItemCount();
        int b = ((RecyclerView.LayoutParams) view.getLayoutParams()).mo17280b();
        if (b >= 0) {
            int i = b % j;
            int i2 = this.f39575g;
            rect.set((i * i2) / j, 0, i2 - (((i + 1) * i2) / j), mo13555k(recyclerView, b, j, itemCount) ? this.f39573e ? this.f39574f : 0 : this.f39574f);
        }
    }

    /* renamed from: i */
    public void mo123i(Canvas canvas, RecyclerView recyclerView, RecyclerView.C16628w wVar) {
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            if (!mo13555k(recyclerView, i, mo13554j(recyclerView), childCount) || this.f39573e) {
                RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) childAt.getLayoutParams();
                int bottom = childAt.getBottom() + layoutParams.bottomMargin;
                this.f39572d.setBounds(childAt.getLeft() - layoutParams.leftMargin, bottom, childAt.getRight() + layoutParams.rightMargin, this.f39574f + bottom);
                this.f39572d.draw(canvas);
            }
        }
        int childCount2 = recyclerView.getChildCount();
        for (int i2 = 0; i2 < childCount2; i2++) {
            View childAt2 = recyclerView.getChildAt(i2);
            if ((recyclerView.mo17031P0(childAt2).mo17363j() + 1) % mo13554j(recyclerView) != 0) {
                RecyclerView.LayoutParams layoutParams2 = (RecyclerView.LayoutParams) childAt2.getLayoutParams();
                int top = childAt2.getTop() - layoutParams2.topMargin;
                int bottom2 = childAt2.getBottom() + layoutParams2.bottomMargin + this.f39574f;
                int right = childAt2.getRight() + layoutParams2.rightMargin;
                int i3 = this.f39575g;
                int i4 = right + i3;
                if (i2 == childCount2 - 1) {
                    i4 -= i3;
                }
                this.f39572d.setBounds(right, top, i4, bottom2);
                this.f39572d.draw(canvas);
            }
        }
    }

    /* renamed from: j */
    public final int mo13554j(RecyclerView recyclerView) {
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof GridLayoutManager) {
            return ((GridLayoutManager) layoutManager).f44669w;
        }
        if (layoutManager instanceof StaggeredGridLayoutManager) {
            return ((StaggeredGridLayoutManager) layoutManager).f44890d;
        }
        return -1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x002c A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0015 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo13555k(androidx.recyclerview.widget.RecyclerView r4, int r5, int r6, int r7) {
        /*
            r3 = this;
            androidx.recyclerview.widget.RecyclerView$LayoutManager r4 = r4.getLayoutManager()
            boolean r0 = r4 instanceof androidx.recyclerview.widget.GridLayoutManager
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0017
            int r4 = r7 % r6
            if (r4 != 0) goto L_0x0012
            int r7 = r7 - r6
            if (r5 < r7) goto L_0x0016
            goto L_0x0015
        L_0x0012:
            int r7 = r7 - r4
            if (r5 < r7) goto L_0x0016
        L_0x0015:
            r1 = 1
        L_0x0016:
            return r1
        L_0x0017:
            boolean r0 = r4 instanceof androidx.recyclerview.widget.StaggeredGridLayoutManager
            if (r0 == 0) goto L_0x0033
            androidx.recyclerview.widget.StaggeredGridLayoutManager r4 = (androidx.recyclerview.widget.StaggeredGridLayoutManager) r4
            int r4 = r4.f44894h
            if (r4 != r2) goto L_0x002e
            int r4 = r7 % r6
            if (r4 != 0) goto L_0x0029
            int r7 = r7 - r6
            if (r5 < r7) goto L_0x002d
            goto L_0x002c
        L_0x0029:
            int r7 = r7 - r4
            if (r5 < r7) goto L_0x002d
        L_0x002c:
            r1 = 1
        L_0x002d:
            return r1
        L_0x002e:
            int r5 = r5 + r2
            int r5 = r5 % r6
            if (r5 != 0) goto L_0x0033
            return r2
        L_0x0033:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ub2.C14143c.mo13555k(androidx.recyclerview.widget.RecyclerView, int, int, int):boolean");
    }
}
