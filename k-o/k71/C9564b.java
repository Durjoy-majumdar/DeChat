package k71;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import gy3.C87412m;

/* renamed from: k71.b */
public final class C9564b extends RecyclerView.C0129l {

    /* renamed from: d */
    public final int f29791d;

    /* renamed from: e */
    public final int f29792e;

    public C9564b(Context context) {
        C87412m.m108594g(context, "context");
        this.f29791d = context.getResources().getDimensionPixelSize(C0966R.dimen.a3e);
        this.f29792e = context.getResources().getDimensionPixelSize(C0966R.dimen.f3766df);
    }

    /* renamed from: g */
    public void mo21g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C16628w wVar) {
        C87412m.m108594g(rect, "outRect");
        C87412m.m108594g(view, "view");
        C87412m.m108594g(recyclerView, "parent");
        C87412m.m108594g(wVar, "state");
        int N0 = recyclerView.mo17029N0(view);
        RecyclerView.C16613e adapter = recyclerView.getAdapter();
        int itemCount = adapter != null ? adapter.getItemCount() : 0;
        RecyclerView.C16613e adapter2 = recyclerView.getAdapter();
        Integer valueOf = adapter2 != null ? Integer.valueOf(adapter2.getItemViewType(N0)) : null;
        if (N0 == 0) {
            rect.set((recyclerView.getWidth() - this.f29791d) / 2, 0, this.f29792e, 0);
        } else if (N0 == itemCount - 1) {
            rect.set(this.f29792e, 0, (valueOf != null && valueOf.intValue() == 2) ? ((recyclerView.getWidth() / 2) - ((this.f29791d / 2) * 3)) - (this.f29792e * 2) : (recyclerView.getWidth() - this.f29791d) / 2, 0);
        } else {
            int i = this.f29792e;
            rect.set(i, 0, i, 0);
        }
    }
}
