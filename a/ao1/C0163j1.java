package ao1;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import gy3.C87412m;

/* renamed from: ao1.j1 */
public final class C0163j1 extends RecyclerView.C0129l {

    /* renamed from: d */
    public final /* synthetic */ C0157h1 f614d;

    public C0163j1(C0157h1 h1Var) {
        this.f614d = h1Var;
    }

    /* renamed from: g */
    public void mo21g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C16628w wVar) {
        C87412m.m108594g(rect, "outRect");
        C87412m.m108594g(view, "view");
        C87412m.m108594g(recyclerView, "parent");
        C87412m.m108594g(wVar, "state");
        int dimension = (int) view.getContext().getResources().getDimension(C0966R.dimen.f3703bv);
        rect.left = dimension;
        int N0 = recyclerView.mo17029N0(view);
        RecyclerView.C16613e adapter = recyclerView.getAdapter();
        if (N0 == (adapter != null ? adapter.getItemCount() : this.f614d.f602f) - 1) {
            rect.right = dimension * 6;
        } else {
            rect.right = dimension;
        }
    }
}
