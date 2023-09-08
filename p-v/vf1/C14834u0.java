package vf1;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import gy3.C8480h;
import gy3.C87412m;

/* renamed from: vf1.u0 */
public final class C14834u0 extends RecyclerView.C0129l {

    /* renamed from: d */
    public final int f40832d;

    public C14834u0(Context context, int i, int i2, C8480h hVar) {
        i = (i2 & 2) != 0 ? (int) context.getResources().getDimension(C0966R.dimen.f3703bv) : i;
        C87412m.m108594g(context, "context");
        this.f40832d = i;
    }

    /* renamed from: g */
    public void mo21g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C16628w wVar) {
        C87412m.m108594g(rect, "outRect");
        C87412m.m108594g(view, "view");
        C87412m.m108594g(recyclerView, "parent");
        C87412m.m108594g(wVar, "state");
        int i = this.f40832d;
        rect.left = i;
        rect.right = i;
        rect.bottom = i;
        rect.top = i;
    }
}
