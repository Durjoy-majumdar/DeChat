package s61;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import gy3.C87412m;
import kg3.C76577a;

/* renamed from: s61.l */
public final class C13625l extends RecyclerView.C0129l {

    /* renamed from: d */
    public final Context f38609d;

    public C13625l(Context context) {
        C87412m.m108594g(context, "context");
        this.f38609d = context;
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
            int h = C76577a.m92157h(this.f38609d, C0966R.dimen.f3723cd);
            int h2 = C76577a.m92157h(this.f38609d, C0966R.dimen.f3703bv);
            if (N0 == 0) {
                rect.set(h, 0, h2, 0);
                return;
            }
            boolean z = true;
            if (N0 == adapter.getItemCount() - 1) {
                RecyclerView.C16613e adapter2 = recyclerView.getAdapter();
                if (adapter2 == null || adapter2.getItemViewType(N0) != 3) {
                    z = false;
                }
                if (z) {
                    int h3 = C76577a.m92157h(this.f38609d, C0966R.dimen.f3766df);
                    rect.set(h3, h3, C76577a.m92157h(this.f38609d, C0966R.dimen.f3736cp), 0);
                    return;
                }
                rect.set(h2, 0, h, 0);
                return;
            }
            rect.set(h2, 0, h2, 0);
        }
    }
}
