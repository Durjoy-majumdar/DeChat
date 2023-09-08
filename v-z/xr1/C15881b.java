package xr1;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import gy3.C87412m;

/* renamed from: xr1.b */
public final class C15881b extends RecyclerView.C0129l {

    /* renamed from: d */
    public Drawable f42738d;

    /* renamed from: e */
    public int f42739e = 1;

    public C15881b(Drawable drawable, int i) {
        C87412m.m108594g(drawable, "divider");
        this.f42738d = drawable;
        drawable.setBounds(0, 0, 0, i);
    }

    /* renamed from: g */
    public void mo21g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C16628w wVar) {
        C87412m.m108594g(rect, "outRect");
        C87412m.m108594g(view, "view");
        C87412m.m108594g(recyclerView, "parent");
        C87412m.m108594g(wVar, "state");
        super.mo21g(rect, view, recyclerView, wVar);
        RecyclerView.C16631z P0 = recyclerView.mo17031P0(view);
        Integer valueOf = P0 != null ? Integer.valueOf(P0.f44859i) : null;
        if (valueOf == null || valueOf.intValue() != -2) {
            if (valueOf == null || valueOf.intValue() != -3) {
                if (valueOf == null || valueOf.intValue() != -4) {
                    if (valueOf == null || valueOf.intValue() != -5) {
                        if (this.f42739e == 0) {
                            rect.set(0, 0, this.f42738d.getBounds().width(), 0);
                        } else {
                            rect.set(0, 0, 0, this.f42738d.getBounds().height());
                        }
                    }
                }
            }
        }
    }

    /* renamed from: h */
    public void mo122h(Canvas canvas, RecyclerView recyclerView, RecyclerView.C16628w wVar) {
        C87412m.m108594g(canvas, "c");
        C87412m.m108594g(recyclerView, "parent");
        C87412m.m108594g(wVar, "state");
        if (this.f42739e == 0) {
            int childCount = recyclerView.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = recyclerView.getChildAt(i);
                RecyclerView.C16631z P0 = recyclerView.mo17031P0(childAt);
                Integer valueOf = P0 != null ? Integer.valueOf(P0.f44859i) : null;
                if ((valueOf == null || valueOf.intValue() != -2) && ((valueOf == null || valueOf.intValue() != -3) && ((valueOf == null || valueOf.intValue() != -4) && (valueOf == null || valueOf.intValue() != -5)))) {
                    ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                    C87412m.m108592e(layoutParams, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams");
                    RecyclerView.LayoutParams layoutParams2 = (RecyclerView.LayoutParams) layoutParams;
                    int right = childAt.getRight() + layoutParams2.rightMargin;
                    this.f42738d.setBounds(right, childAt.getTop() - layoutParams2.topMargin, this.f42738d.getBounds().width() + right, childAt.getBottom() + layoutParams2.bottomMargin);
                    this.f42738d.draw(canvas);
                }
            }
            return;
        }
        int childCount2 = recyclerView.getChildCount();
        for (int i2 = 0; i2 < childCount2; i2++) {
            View childAt2 = recyclerView.getChildAt(i2);
            ViewGroup.LayoutParams layoutParams3 = childAt2.getLayoutParams();
            C87412m.m108592e(layoutParams3, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams");
            RecyclerView.LayoutParams layoutParams4 = (RecyclerView.LayoutParams) layoutParams3;
            int bottom = childAt2.getBottom() + layoutParams4.bottomMargin + 0;
            this.f42738d.setBounds((childAt2.getLeft() - layoutParams4.leftMargin) + 0, bottom, (childAt2.getRight() + layoutParams4.rightMargin) - 0, (this.f42738d.getBounds().height() + bottom) - 0);
            this.f42738d.draw(canvas);
        }
    }
}
