package zi3;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import gy3.C87412m;

/* renamed from: zi3.h */
public final class C16215h extends RecyclerView.C0129l {

    /* renamed from: d */
    public final /* synthetic */ int f43434d;

    public C16215h(int i) {
        this.f43434d = i;
    }

    /* renamed from: g */
    public void mo21g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C16628w wVar) {
        C87412m.m108594g(rect, "outRect");
        C87412m.m108594g(view, "view");
        C87412m.m108594g(recyclerView, "parent");
        C87412m.m108594g(wVar, "state");
        super.mo21g(rect, view, recyclerView, wVar);
        int i = this.f43434d;
        rect.bottom = i;
        rect.left = i / 2;
        rect.right = i / 2;
    }
}
