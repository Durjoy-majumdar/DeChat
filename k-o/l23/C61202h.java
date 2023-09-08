package l23;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import gy3.C87412m;

/* renamed from: l23.h */
public final class C61202h extends RecyclerView.C0129l {

    /* renamed from: d */
    public final float f174236d = MMApplicationContext.getContext().getResources().getDimension(C0966R.dimen.f3736cp);

    /* renamed from: e */
    public final /* synthetic */ C61196g f174237e;

    public C61202h(C61196g gVar) {
        this.f174237e = gVar;
    }

    /* renamed from: g */
    public void mo21g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C16628w wVar) {
        C87412m.m108594g(rect, "outRect");
        C87412m.m108594g(view, "view");
        C87412m.m108594g(recyclerView, "parent");
        C87412m.m108594g(wVar, "state");
        super.mo21g(rect, view, recyclerView, wVar);
        int j = recyclerView.mo17031P0(view).mo17363j();
        C61196g gVar = this.f174237e;
        rect.left = (int) this.f174236d;
        if (j + 1 == gVar.f174216g.size()) {
            rect.right = (int) this.f174236d;
        }
    }
}
