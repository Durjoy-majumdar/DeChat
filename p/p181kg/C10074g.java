package p181kg;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;

/* renamed from: kg.g */
public final class C10074g extends RecyclerView.C0129l {

    /* renamed from: d */
    public final int f30838d;

    /* renamed from: e */
    public final int f30839e;

    /* renamed from: f */
    public final int f30840f;

    /* renamed from: g */
    public final String f30841g = "MicroMsg.GridSpaceItemDecoration";

    public C10074g(int i, int i2, int i3) {
        this.f30838d = i;
        this.f30839e = i2;
        this.f30840f = i3;
    }

    /* renamed from: g */
    public void mo21g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C16628w wVar) {
        C87412m.m108594g(rect, "outRect");
        C87412m.m108594g(view, "view");
        C87412m.m108594g(recyclerView, "parent");
        C87412m.m108594g(wVar, "state");
        int N0 = recyclerView.mo17029N0(view);
        int i = this.f30838d;
        int i2 = N0 % i;
        int i3 = this.f30840f;
        rect.left = (i2 * i3) / i;
        rect.right = i3 - (((i2 + 1) * i3) / i);
        String str = this.f30841g;
        Log.m105918d(str, "position:" + N0 + "    columnIndex: " + i2 + "    left,right ->" + rect.left + ',' + rect.right);
        if (N0 >= this.f30838d) {
            rect.top = this.f30839e;
        }
    }
}
