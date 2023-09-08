package lo1;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import gy3.C87412m;

/* renamed from: lo1.g */
public final class C10593g extends RecyclerView.C0129l {

    /* renamed from: d */
    public final int f31948d;

    public C10593g(int i) {
        this.f31948d = i;
    }

    /* renamed from: g */
    public void mo21g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C16628w wVar) {
        C87412m.m108594g(rect, "outRect");
        C87412m.m108594g(view, "view");
        C87412m.m108594g(recyclerView, "parent");
        C87412m.m108594g(wVar, "state");
        int O0 = recyclerView.mo17030O0(view);
        boolean z = false;
        int childCount = (recyclerView.getChildCount() / 3) + (recyclerView.getChildCount() % 3 > 0 ? 3 : 0);
        int i = childCount - 2;
        if (O0 < 3) {
            rect.bottom = this.f31948d;
            return;
        }
        if (i <= O0 && O0 <= childCount) {
            z = true;
        }
        if (z) {
            rect.top = this.f31948d;
            return;
        }
        int i2 = this.f31948d;
        rect.top = i2;
        rect.bottom = i2;
    }
}
