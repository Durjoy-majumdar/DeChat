package a92;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import gy3.C87412m;
import v82.C111418b0;

/* renamed from: a92.e */
public final class C0018e extends RecyclerView.C0129l {

    /* renamed from: d */
    public Context f19d;

    /* renamed from: e */
    public int f20e;

    /* renamed from: f */
    public int f21f = (C111418b0.f333541b / 2);

    public C0018e(Context context) {
        C87412m.m108594g(context, "context");
        this.f19d = context;
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
        if (N0 == 0) {
            rect.set((recyclerView.getWidth() - this.f20e) / 2, 0, this.f21f, 0);
        } else if (N0 == itemCount - 1) {
            rect.set(this.f21f, 0, (recyclerView.getWidth() - this.f20e) / 2, 0);
        } else {
            int i = this.f21f;
            rect.set(i, 0, i, 0);
        }
    }
}
