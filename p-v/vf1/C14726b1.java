package vf1;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import bl3.C39818r;
import cm1.C0740i2;
import com.tencent.p014mm.plugin.finder.feed.p052ui.FinderInteractionSearchUIContract$ViewCallback;
import di3.C7335d;
import di3.C86312j;
import dp1.C58417y0;
import gy3.C87412m;
import java.util.List;
import jq3.C60905o;
import rs1.C13442s8;
import sx3.C110818d0;
import te3.C49712hj1;
import zp3.C23555k;

/* renamed from: vf1.b1 */
public final class C14726b1 extends C23555k.C23558c {

    /* renamed from: a */
    public final /* synthetic */ FinderInteractionSearchUIContract$ViewCallback f40692a;

    public C14726b1(FinderInteractionSearchUIContract$ViewCallback finderInteractionSearchUIContract$ViewCallback) {
        this.f40692a = finderInteractionSearchUIContract$ViewCallback;
    }

    /* renamed from: d */
    public boolean mo777d() {
        return true;
    }

    /* renamed from: e */
    public void mo778e(View view, List<? extends RecyclerView.C16631z> list) {
        C0740i2 i2Var;
        C87412m.m108594g(view, "parent");
        C87412m.m108594g(list, "exposedHolders");
        FinderInteractionSearchUIContract$ViewCallback finderInteractionSearchUIContract$ViewCallback = this.f40692a;
        for (RecyclerView.C16631z zVar : list) {
            RecyclerView recyclerView = finderInteractionSearchUIContract$ViewCallback.getRecyclerView();
            int N0 = recyclerView != null ? recyclerView.mo17029N0(zVar.f44854d) : 0;
            C60905o oVar = zVar instanceof C60905o ? (C60905o) zVar : null;
            long itemId = (oVar == null || (i2Var = (C0740i2) oVar.f173503E) == null) ? 0 : i2Var.getItemId();
            C14844x0 x0Var = finderInteractionSearchUIContract$ViewCallback.f14446e;
            x0Var.getClass();
            C13442s8 s8Var = (C13442s8) C39818r.f106831a.mo62444c(x0Var.f40843d).mo62449e(C13442s8.class);
            C49712hj1 q3 = s8Var != null ? s8Var.mo12861q3() : null;
            int i = x0Var.f40845f == 2 ? 1 : 2;
            String str = (String) C110818d0.m150916N(x0Var.f40852p);
            if (str == null) {
                str = "";
            }
            String str2 = str;
            C7335d c = C86312j.m106911c(C58417y0.class);
            C87412m.m108593f(c, "getService(FinderReportLogic::class.java)");
            C58417y0.Gx0((C58417y0) c, q3, x0Var.f40851o, 2, i, str2, x0Var.f40850n, 0, itemId, N0, 64, (Object) null);
        }
    }
}
