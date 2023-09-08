package o61;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import gy3.C87412m;

/* renamed from: o61.c */
public final class C11372c extends RecyclerView.C0129l {

    /* renamed from: d */
    public final int f33478d;

    public C11372c(int i) {
        this.f33478d = i;
    }

    /* renamed from: g */
    public void mo21g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C16628w wVar) {
        C87412m.m108594g(rect, "outRect");
        C87412m.m108594g(view, "view");
        C87412m.m108594g(recyclerView, "parent");
        C87412m.m108594g(wVar, "state");
        super.mo21g(rect, view, recyclerView, wVar);
        int N0 = recyclerView.mo17029N0(view);
        RecyclerView.C16613e adapter = recyclerView.getAdapter();
        if (N0 == (adapter != null ? adapter.getItemCount() : 0) - 1) {
            rect.right = this.f33478d;
        }
        rect.left = this.f33478d;
    }
}
