package zf1;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.tencent.p014mm.C0966R;
import gy3.C87412m;

/* renamed from: zf1.d */
public final class C16146d extends RecyclerView.C0129l {
    /* renamed from: g */
    public void mo21g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C16628w wVar) {
        C87412m.m108594g(rect, "outRect");
        C87412m.m108594g(view, "view");
        C87412m.m108594g(recyclerView, "parent");
        C87412m.m108594g(wVar, "state");
        int dimension = (int) view.getContext().getResources().getDimension(C0966R.dimen.f3703bv);
        int dimension2 = (int) view.getContext().getResources().getDimension(C0966R.dimen.a66);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        C87412m.m108592e(layoutParams, "null cannot be cast to non-null type androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams");
        if (((StaggeredGridLayoutManager.LayoutParams) layoutParams).f44911i) {
            rect.left = 0;
            rect.right = 0;
            rect.bottom = 0;
            rect.top = 0;
            return;
        }
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        C87412m.m108592e(layoutParams2, "null cannot be cast to non-null type androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams");
        if (((StaggeredGridLayoutManager.LayoutParams) layoutParams2).mo17429e() % 2 == 0) {
            rect.left = dimension;
            rect.right = dimension2;
            rect.bottom = dimension2;
            rect.top = dimension2;
            return;
        }
        rect.left = dimension2;
        rect.right = dimension;
        rect.bottom = dimension2;
        rect.top = dimension2;
    }
}
