package jh1;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import fy3.C32229r;
import gy3.C87412m;
import jh1.C9421t;
import jq3.C60898l;
import jq3.C60905o;
import rx3.C13598b0;

/* renamed from: jh1.r */
public final class C9419r implements C60898l.C9502b<C60905o> {

    /* renamed from: d */
    public final /* synthetic */ C9421t f29387d;

    public C9419r(C9421t tVar) {
        this.f29387d = tVar;
    }

    /* renamed from: q */
    public void mo734q(RecyclerView.C16613e eVar, View view, int i, RecyclerView.C16631z zVar) {
        C60905o oVar = (C60905o) zVar;
        C87412m.m108594g(eVar, "adapter");
        C87412m.m108594g(view, "view");
        C87412m.m108594g(oVar, "holder");
        C32229r<? super RecyclerView.C16613e<C60905o>, ? super View, ? super Integer, ? super C60905o, C13598b0> rVar = this.f29387d.f29396h;
        if (rVar != null) {
            ((C9421t.C9425d) rVar).mo162I(eVar, view, Integer.valueOf(i), oVar);
        }
    }
}
