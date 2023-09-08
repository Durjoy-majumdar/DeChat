package xr1;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import gy3.C87412m;

/* renamed from: xr1.a */
public final class C66416a extends RecyclerView.C0129l {

    /* renamed from: d */
    public Drawable f191160d;

    public C66416a(Drawable drawable, int i, int[] iArr, int i2) {
        C87412m.m108594g(drawable, "divider");
        C87412m.m108594g(iArr, "padding");
        this.f191160d = drawable;
        drawable.setBounds(0, 0, 0, i);
    }

    /* renamed from: g */
    public void mo21g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C16628w wVar) {
        C87412m.m108594g(rect, "outRect");
        C87412m.m108594g(view, "view");
        C87412m.m108594g(recyclerView, "parent");
        C87412m.m108594g(wVar, "state");
        super.mo21g(rect, view, recyclerView, wVar);
    }

    /* renamed from: h */
    public void mo122h(Canvas canvas, RecyclerView recyclerView, RecyclerView.C16628w wVar) {
        C87412m.m108594g(canvas, "c");
        C87412m.m108594g(recyclerView, "parent");
        C87412m.m108594g(wVar, "state");
    }
}
