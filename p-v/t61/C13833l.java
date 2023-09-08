package t61;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import gy3.C87412m;

/* renamed from: t61.l */
public final class C13833l extends RecyclerView.C0129l {

    /* renamed from: d */
    public final Drawable f38973d;

    /* renamed from: e */
    public final Drawable f38974e;

    /* renamed from: f */
    public final int f38975f;

    /* renamed from: g */
    public final Rect f38976g = new Rect();

    public C13833l(Drawable drawable, Drawable drawable2, int i) {
        C87412m.m108594g(drawable, "horizontalDivider");
        C87412m.m108594g(drawable2, "verticalDivider");
        this.f38973d = drawable;
        this.f38974e = drawable2;
        this.f38975f = i;
    }

    /* renamed from: g */
    public void mo21g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C16628w wVar) {
        C87412m.m108594g(rect, "outRect");
        C87412m.m108594g(view, "view");
        C87412m.m108594g(recyclerView, "parent");
        C87412m.m108594g(wVar, "state");
        super.mo21g(rect, view, recyclerView, wVar);
        int N0 = recyclerView.mo17029N0(view);
        int i = this.f38975f;
        boolean z = true;
        if (!(N0 % i == i - 1)) {
            rect.right = this.f38973d.getIntrinsicWidth();
        }
        if (wVar.mo17354b() / this.f38975f != recyclerView.mo17029N0(view) / this.f38975f) {
            z = false;
        }
        if (!z) {
            rect.bottom = this.f38974e.getIntrinsicHeight();
        }
    }

    /* renamed from: h */
    public void mo122h(Canvas canvas, RecyclerView recyclerView, RecyclerView.C16628w wVar) {
        C87412m.m108594g(canvas, "canvas");
        C87412m.m108594g(recyclerView, "parent");
        C87412m.m108594g(wVar, "state");
        int childCount = recyclerView.getChildCount();
        GridLayoutManager gridLayoutManager = (GridLayoutManager) recyclerView.getLayoutManager();
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            RecyclerView.m15804R0(childAt, this.f38976g);
            recyclerView.mo17029N0(childAt);
            if (gridLayoutManager == null || gridLayoutManager.f44666B.mo118c(recyclerView.mo17029N0(childAt)) != gridLayoutManager.f44669w) {
                int round = Math.round(childAt.getTranslationY());
                Rect rect = this.f38976g;
                int i2 = rect.bottom + round;
                int i3 = rect.top + round;
                if (rect.right < recyclerView.getWidth()) {
                    Drawable drawable = this.f38973d;
                    int i4 = this.f38976g.right;
                    drawable.setBounds(i4, i3, drawable.getIntrinsicWidth() + i4, i2);
                    this.f38973d.draw(canvas);
                }
                if (this.f38976g.bottom < recyclerView.getHeight()) {
                    Drawable drawable2 = this.f38974e;
                    Rect rect2 = this.f38976g;
                    drawable2.setBounds(rect2.left, i2, rect2.right, drawable2.getIntrinsicHeight() + i2);
                    this.f38974e.draw(canvas);
                }
            }
        }
    }
}
