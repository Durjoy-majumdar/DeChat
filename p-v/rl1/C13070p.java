package rl1;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import gy3.C87412m;

/* renamed from: rl1.p */
public final class C13070p extends RecyclerView.C0129l {

    /* renamed from: d */
    public final /* synthetic */ C13053n f37218d;

    public C13070p(C13053n nVar) {
        this.f37218d = nVar;
    }

    /* renamed from: g */
    public void mo21g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C16628w wVar) {
        C87412m.m108594g(rect, "outRect");
        C87412m.m108594g(view, "view");
        C87412m.m108594g(recyclerView, "parent");
        C87412m.m108594g(wVar, "state");
        rect.left = 0;
        rect.right = 0;
        rect.top = 0;
        rect.bottom = this.f37218d.f37179o.getContext().getResources().getDimensionPixelOffset(C0966R.dimen.f3736cp);
    }
}
