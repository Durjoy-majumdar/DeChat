package ub2;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.plugin.p081mv.p082ui.view.MusicMvCommentView;
import gy3.C87412m;

/* renamed from: ub2.c0 */
public final class C65268c0 extends RecyclerView.C0129l {
    /* renamed from: g */
    public void mo21g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C16628w wVar) {
        C87412m.m108594g(rect, "outRect");
        C87412m.m108594g(view, "view");
        C87412m.m108594g(recyclerView, "parent");
        C87412m.m108594g(wVar, "state");
        int N0 = recyclerView.mo17029N0(view);
        RecyclerView.C16613e adapter = recyclerView.getAdapter();
        if (N0 < (adapter != null ? adapter.getItemCount() : -1)) {
            rect.top = MusicMvCommentView.f163540i;
        } else {
            rect.top = 0;
        }
    }
}
