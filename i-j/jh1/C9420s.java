package jh1;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import gy3.C87412m;

/* renamed from: jh1.s */
public final class C9420s extends RecyclerView.C0129l {

    /* renamed from: d */
    public final /* synthetic */ C9421t f29388d;

    public C9420s(C9421t tVar) {
        this.f29388d = tVar;
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
        rect.bottom = (int) this.f29388d.f29389a.getContext().getResources().getDimension(C0966R.dimen.f3723cd);
    }
}
