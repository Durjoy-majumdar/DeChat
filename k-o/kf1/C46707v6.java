package kf1;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import cm1.C39994x1;
import com.tencent.p014mm.view.TouchableLayout;
import gy3.C87412m;
import jq3.C60898l;
import jq3.C60905o;
import te3.C51655v7;
import uo3.C78253a;

/* renamed from: kf1.v6 */
public final class C46707v6 implements C60898l.C9503c<C60905o> {

    /* renamed from: d */
    public final /* synthetic */ C46697b7 f125741d;

    public C46707v6(C46697b7 b7Var) {
        this.f125741d = b7Var;
    }

    /* renamed from: n */
    public boolean mo759n(RecyclerView.C16613e eVar, View view, int i, RecyclerView.C16631z zVar) {
        C60905o oVar = (C60905o) zVar;
        C87412m.m108594g(eVar, "adapter");
        C87412m.m108594g(view, "view");
        C87412m.m108594g(oVar, "holder");
        C39994x1 x1Var = (C39994x1) oVar.f173503E;
        if (x1Var != null && x1Var.f107217e == 2) {
            C51655v7 v7Var = x1Var.f107216d.f141492f;
            if (!(v7Var != null && v7Var.f143371d == 1)) {
                C46697b7 b7Var = this.f125741d;
                C78253a aVar = b7Var.f125718g;
                if (aVar != null) {
                    aVar.mo108266a();
                    C78253a aVar2 = b7Var.f125718g;
                    if (aVar2 != null) {
                        aVar2.mo108273h(view, new C46719z6(b7Var), new C46695a7(b7Var, x1Var, eVar, i), TouchableLayout.f24959d, TouchableLayout.f24960e);
                        return true;
                    }
                    C87412m.m108603p("popupMenu");
                    throw null;
                }
                C87412m.m108603p("popupMenu");
                throw null;
            }
        }
        return false;
    }
}
