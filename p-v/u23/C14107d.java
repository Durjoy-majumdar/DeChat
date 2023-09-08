package u23;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import gy3.C87412m;
import kg3.C76577a;

/* renamed from: u23.d */
public final class C14107d extends RecyclerView.C0129l {
    /* renamed from: g */
    public void mo21g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C16628w wVar) {
        C87412m.m108594g(rect, "outRect");
        C87412m.m108594g(view, "view");
        C87412m.m108594g(recyclerView, "parent");
        C87412m.m108594g(wVar, "state");
        int b = C76577a.m92151b(recyclerView.getContext(), 8);
        int N0 = recyclerView.mo17029N0(view);
        boolean z = true;
        if (N0 != 0) {
            RecyclerView.C16613e adapter = recyclerView.getAdapter();
            C87412m.m108591d(adapter);
            if (N0 != adapter.getItemCount() - 1) {
                z = false;
            }
        }
        if (!z) {
            int i = -b;
            rect.left = i;
            rect.right = i;
        }
    }
}
