package xk1;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import gy3.C87412m;

/* renamed from: xk1.s0 */
public final class C66347s0 extends RecyclerView.C0129l {

    /* renamed from: d */
    public final /* synthetic */ C66350u0 f190980d;

    public C66347s0(C66350u0 u0Var) {
        this.f190980d = u0Var;
    }

    /* renamed from: g */
    public void mo21g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C16628w wVar) {
        C87412m.m108594g(rect, "outRect");
        C87412m.m108594g(view, "view");
        C87412m.m108594g(recyclerView, "parent");
        C87412m.m108594g(wVar, "state");
        if (recyclerView.mo17029N0(view) < 4) {
            rect.top = this.f190980d.f190983d;
        } else {
            rect.top = this.f190980d.f190984e;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        C87412m.m108592e(layoutParams, "null cannot be cast to non-null type androidx.recyclerview.widget.GridLayoutManager.LayoutParams");
        float f = this.f190980d.f190985f;
        int i = ((GridLayoutManager.LayoutParams) layoutParams).f44673h;
        float f2 = (float) 4;
        rect.left = (int) ((((float) i) * f) / f2);
        rect.right = (int) ((f * (3.0f - ((float) i))) / f2);
    }
}
