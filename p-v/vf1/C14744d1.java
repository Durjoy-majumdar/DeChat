package vf1;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import cm1.C0734g2;
import com.google.android.gms.actions.SearchIntents;
import com.tencent.p014mm.p136ui.search.FTSSearchView;
import com.tencent.p014mm.plugin.finder.feed.p052ui.FinderInteractionSearchUIContract$ViewCallback;
import gy3.C87412m;
import java.util.LinkedList;
import java.util.List;
import jq3.C60898l;
import jq3.C60905o;
import sx3.C26236u;

/* renamed from: vf1.d1 */
public final class C14744d1 implements C60898l.C9502b<C60905o> {

    /* renamed from: d */
    public final /* synthetic */ FinderInteractionSearchUIContract$ViewCallback f40716d;

    public C14744d1(FinderInteractionSearchUIContract$ViewCallback finderInteractionSearchUIContract$ViewCallback) {
        this.f40716d = finderInteractionSearchUIContract$ViewCallback;
    }

    /* renamed from: q */
    public void mo734q(RecyclerView.C16613e eVar, View view, int i, RecyclerView.C16631z zVar) {
        C60905o oVar = (C60905o) zVar;
        C87412m.m108594g(eVar, "adapter");
        C87412m.m108594g(view, "view");
        C87412m.m108594g(oVar, "holder");
        C0734g2 g2Var = (C0734g2) oVar.f173503E;
        FinderInteractionSearchUIContract$ViewCallback finderInteractionSearchUIContract$ViewCallback = this.f40716d;
        C87412m.m108593f(g2Var, "topic");
        finderInteractionSearchUIContract$ViewCallback.getClass();
        List<C14848y0> b = C26236u.m33719b(new C14848y0(g2Var));
        FTSSearchView fTSSearchView = finderInteractionSearchUIContract$ViewCallback.f14455q;
        if (fTSSearchView != null) {
            String inEditTextQuery = fTSSearchView.getFtsEditText().getInEditTextQuery();
            FTSSearchView fTSSearchView2 = finderInteractionSearchUIContract$ViewCallback.f14455q;
            if (fTSSearchView2 != null) {
                fTSSearchView2.getFtsEditText().mo70356l(inEditTextQuery, b);
                LinkedList linkedList = new LinkedList();
                for (C14848y0 y0Var : b) {
                    String str = y0Var.f40860d.f1749d.f141617d;
                    if (str == null) {
                        str = "";
                    }
                    linkedList.add(str);
                }
                finderInteractionSearchUIContract$ViewCallback.f14445d.hideVKB();
                C14844x0 x0Var = finderInteractionSearchUIContract$ViewCallback.f14446e;
                C87412m.m108593f(inEditTextQuery, SearchIntents.EXTRA_QUERY);
                x0Var.mo13931t(inEditTextQuery, linkedList);
                return;
            }
            C87412m.m108603p("searchView");
            throw null;
        }
        C87412m.m108603p("searchView");
        throw null;
    }
}
