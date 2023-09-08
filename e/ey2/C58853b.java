package ey2;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import gy3.C87412m;
import kg3.C76577a;

/* renamed from: ey2.b */
public final class C58853b extends RecyclerView.C0129l {

    /* renamed from: d */
    public final /* synthetic */ Context f168481d;

    public C58853b(Context context) {
        this.f168481d = context;
    }

    /* renamed from: g */
    public void mo21g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C16628w wVar) {
        C87412m.m108594g(rect, "outRect");
        C87412m.m108594g(view, "view");
        C87412m.m108594g(recyclerView, "parent");
        C87412m.m108594g(wVar, "state");
        super.mo21g(rect, view, recyclerView, wVar);
        int N0 = recyclerView.mo17029N0(view);
        if (N0 == -1) {
            N0 = recyclerView.mo17031P0(view).f44857g;
        }
        int i = C75665a.f222260p;
        int i2 = C75665a.f222261q;
        rect.left = i2 / 2;
        rect.right = i2 / 2;
        if (N0 / 3 > 0) {
            rect.top = C76577a.m92155f(this.f168481d, C0966R.dimen.f3738cr);
        } else {
            rect.top = 0;
        }
        rect.bottom = 0;
    }
}
