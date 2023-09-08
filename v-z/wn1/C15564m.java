package wn1;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import gy3.C87412m;

/* renamed from: wn1.m */
public final class C15564m extends RecyclerView.C0129l {

    /* renamed from: d */
    public final /* synthetic */ Context f42169d;

    public C15564m(Context context) {
        this.f42169d = context;
    }

    /* renamed from: g */
    public void mo21g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C16628w wVar) {
        C87412m.m108594g(rect, "outRect");
        C87412m.m108594g(view, "view");
        C87412m.m108594g(recyclerView, "parent");
        C87412m.m108594g(wVar, "state");
        int dimension = (int) this.f42169d.getResources().getDimension(C0966R.dimen.f3766df);
        int dimension2 = (int) this.f42169d.getResources().getDimension(C0966R.dimen.a68);
        rect.left = dimension;
        rect.right = dimension;
        rect.bottom = dimension2;
        rect.top = dimension2;
    }
}
