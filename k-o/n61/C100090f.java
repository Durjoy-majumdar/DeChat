package n61;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import gy3.C87412m;
import iy3.C60641c;
import p61.C100668o;

/* renamed from: n61.f */
public final class C100090f extends RecyclerView.C0129l {

    /* renamed from: d */
    public final int f293213d;

    /* renamed from: e */
    public final int f293214e;

    /* renamed from: f */
    public int f293215f;

    /* renamed from: g */
    public final C100668o f293216g;

    /* renamed from: h */
    public int f293217h;

    /* renamed from: i */
    public int f293218i;

    public C100090f(int i, int i2, int i3, C100668o oVar) {
        C87412m.m108594g(oVar, "sizeResolver");
        this.f293213d = i;
        this.f293214e = i2;
        this.f293215f = i3;
        this.f293216g = oVar;
    }

    /* renamed from: g */
    public void mo21g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C16628w wVar) {
        C87412m.m108594g(rect, "outRect");
        C87412m.m108594g(view, "view");
        C87412m.m108594g(recyclerView, "parent");
        C87412m.m108594g(wVar, "state");
        super.mo21g(rect, view, recyclerView, wVar);
        C100668o oVar = this.f293216g;
        this.f293217h = oVar.f294934c;
        this.f293218i = oVar.f294935d;
        RecyclerView.C16613e adapter = recyclerView.getAdapter();
        int itemCount = adapter != null ? adapter.getItemCount() : 0;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        C87412m.m108592e(layoutParams, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams");
        int b = ((RecyclerView.LayoutParams) layoutParams).mo17280b();
        if (b >= 0 && itemCount > 0) {
            RecyclerView.C16613e adapter2 = recyclerView.getAdapter();
            int itemViewType = adapter2 != null ? adapter2.getItemViewType(b) : -1;
            if (itemViewType == 4) {
                int i = b - this.f293215f;
                int i2 = this.f293217h;
                int i3 = i % i2;
                int i4 = i / i2;
                rect.bottom = this.f293213d;
                int i5 = this.f293214e;
                int i6 = this.f293218i;
                float f = (((float) ((i5 * 2) + ((i2 - 1) * i6))) * 1.0f) / ((float) i2);
                float f2 = ((float) i5) + (((float) i3) * (((float) i6) - f));
                rect.left = C60641c.m70921b(f2);
                rect.right = C60641c.m70921b(f - f2);
            } else if (itemViewType == 7) {
                int i7 = this.f293214e + this.f293216g.f294937f;
                rect.set(i7, 0, i7, 0);
            } else if (itemViewType == 8) {
                rect.set(0, 0, 0, 0);
            }
        }
    }
}
