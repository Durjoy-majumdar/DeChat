package kf1;

import androidx.recyclerview.widget.RecyclerView;
import gy3.C87412m;
import jq3.C60906r;
import jq3.C60907t;

/* renamed from: kf1.e9 */
public final class C9700e9 implements C60907t {

    /* renamed from: a */
    public final /* synthetic */ C9673c9 f30107a;

    public C9700e9(C9673c9 c9Var) {
        this.f30107a = c9Var;
    }

    /* renamed from: a */
    public void mo2587a(RecyclerView recyclerView, C60906r rVar) {
        C87412m.m108594g(recyclerView, "recyclerView");
        C87412m.m108594g(rVar, "data");
        C9673c9 c9Var = this.f30107a;
        if (c9Var.f30058q == null) {
            c9Var.f30058q = rVar.f173513i;
        } else {
            c9Var.mo10292p(rVar.f173513i);
        }
    }
}
