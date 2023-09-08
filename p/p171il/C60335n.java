package p171il;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import gy3.C87412m;

/* renamed from: il.n */
public final class C60335n extends RecyclerView.C0129l {

    /* renamed from: d */
    public final C60338x f171985d;

    public C60335n(C60338x xVar) {
        C87412m.m108594g(xVar, "sizeResolver");
        this.f171985d = xVar;
    }

    /* renamed from: g */
    public void mo21g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C16628w wVar) {
        int N0;
        C87412m.m108594g(rect, "outRect");
        C87412m.m108594g(view, "view");
        C87412m.m108594g(recyclerView, "parent");
        C87412m.m108594g(wVar, "state");
        RecyclerView.C16613e adapter = recyclerView.getAdapter();
        if (adapter != null && (N0 = recyclerView.mo17029N0(view)) != -1) {
            int itemViewType = adapter.getItemViewType(N0);
            int i = this.f171985d.f171994f;
            if (itemViewType == 2) {
                rect.set(i, 0, i, 0);
            }
        }
    }
}
