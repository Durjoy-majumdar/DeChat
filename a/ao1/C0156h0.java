package ao1;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import gy3.C87412m;

/* renamed from: ao1.h0 */
public final class C0156h0 extends RecyclerView.C0129l {
    /* renamed from: g */
    public void mo21g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C16628w wVar) {
        C87412m.m108594g(rect, "outRect");
        C87412m.m108594g(view, "view");
        C87412m.m108594g(recyclerView, "parent");
        C87412m.m108594g(wVar, "state");
        int dimension = (int) view.getContext().getResources().getDimension(C0966R.dimen.f3703bv);
        rect.left = dimension;
        rect.right = dimension;
        rect.bottom = dimension;
        rect.top = dimension;
    }
}
