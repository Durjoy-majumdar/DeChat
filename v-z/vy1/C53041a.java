package vy1;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import gy3.C87412m;
import java.util.LinkedList;
import yt0.C53561a;

/* renamed from: vy1.a */
public final class C53041a extends RecyclerView.C0129l {

    /* renamed from: d */
    public final int f148060d;

    public C53041a(int i) {
        this.f148060d = i;
    }

    /* renamed from: g */
    public void mo21g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C16628w wVar) {
        C87412m.m108594g(rect, "outRect");
        C87412m.m108594g(view, "view");
        C87412m.m108594g(recyclerView, "parent");
        C87412m.m108594g(wVar, "state");
        super.mo21g(rect, view, recyclerView, wVar);
        RecyclerView.C16613e adapter = recyclerView.getAdapter();
        if (adapter instanceof C53561a) {
            int N0 = recyclerView.mo17029N0(view);
            C53561a aVar = (C53561a) adapter;
            if (((LinkedList) aVar.f150540g).size() > 0) {
                if (N0 == 0) {
                    return;
                }
                if (((LinkedList) aVar.f150541h).size() > 0 && N0 > aVar.getItemCount()) {
                    return;
                }
            }
            if (((LinkedList) aVar.f150541h).size() > 0 && N0 >= aVar.f150537d.getItemCount()) {
                return;
            }
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof StaggeredGridLayoutManager.LayoutParams) {
            rect.left = this.f148060d;
            if (((StaggeredGridLayoutManager.LayoutParams) layoutParams).mo17429e() == 0) {
                rect.right = 0;
            } else {
                rect.right = this.f148060d;
            }
        }
        rect.bottom = this.f148060d;
    }
}
