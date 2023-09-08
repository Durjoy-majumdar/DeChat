package oz2;

import android.view.View;
import androidx.recyclerview.widget.C16682y;
import androidx.recyclerview.widget.RecyclerView;
import gy3.C8480h;
import gy3.C87412m;
import p816jl.C60878a;

/* renamed from: oz2.f */
public final class C62185f extends C60878a {

    /* renamed from: p */
    public final boolean f176800p;

    public C62185f(boolean z, int i, C8480h hVar) {
        this.f176800p = (i & 1) != 0 ? true : z;
    }

    /* renamed from: o */
    public View mo85780o(RecyclerView.LayoutManager layoutManager) {
        if (layoutManager == null) {
            return null;
        }
        if (layoutManager.canScrollVertically()) {
            return mo85777j(layoutManager, mo83506m(layoutManager));
        }
        if (layoutManager.canScrollHorizontally()) {
            return mo85777j(layoutManager, mo85778l(layoutManager));
        }
        return null;
    }

    /* renamed from: p */
    public boolean mo85781p(View view, RecyclerView.LayoutManager layoutManager, C16682y yVar) {
        RecyclerView recyclerView;
        C87412m.m108594g(layoutManager, "layoutManager");
        C87412m.m108594g(yVar, "helper");
        if (!this.f176800p) {
            return false;
        }
        RecyclerView.C16631z zVar = null;
        if (!(view == null || (recyclerView = this.f173442h) == null)) {
            zVar = recyclerView.mo17031P0(view);
        }
        if (zVar != null && zVar.mo17363j() == layoutManager.getItemCount() - 1) {
            if ((yVar.mo17570k() + yVar.mo17571l()) - yVar.mo17564e(view) > yVar.mo17562c(view) / 2) {
                return true;
            }
        }
        super.mo85781p(view, layoutManager, yVar);
        return false;
    }
}
