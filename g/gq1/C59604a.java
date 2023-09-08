package gq1;

import a14.C0000n0;
import a14.C53872d1;
import a14.C53884f2;
import a14.C53930o0;
import a14.C53959v2;
import a14.C53973z1;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import cm1.C0740i2;
import fo1.C59264a;
import gy3.C87412m;
import java.util.ArrayList;
import jq3.C60905o;

/* renamed from: gq1.a */
public abstract class C59604a implements C59264a<C59613h> {

    /* renamed from: d */
    public final ArrayList<C0740i2> f170312d = new ArrayList<>();

    /* renamed from: e */
    public C59613h f170313e;

    /* renamed from: f */
    public final C0000n0 f170314f = C53930o0.m60554a(((C53884f2) C53959v2.m60598a((C53973z1) null, 1, (Object) null)).plus(C53872d1.f151119c));

    /* renamed from: e */
    public final C59613h mo84620e() {
        C59613h hVar = this.f170313e;
        if (hVar != null) {
            return hVar;
        }
        C87412m.m108603p("viewCallback");
        throw null;
    }

    /* renamed from: n */
    public abstract boolean mo84621n();

    public void onDetach() {
        C0000n0 n0Var = this.f170314f;
        C53930o0.m60557d(n0Var, this + " onDetach", (Throwable) null, 2, (Object) null);
    }

    /* renamed from: q */
    public void mo84622q(RecyclerView.C16613e<C60905o> eVar, View view, int i, C60905o oVar) {
        C87412m.m108594g(eVar, "adapter");
        C87412m.m108594g(view, "view");
        C87412m.m108594g(oVar, "holder");
    }

    public abstract void requestRefresh();

    /* renamed from: t */
    public abstract void mo84624t();

    /* renamed from: x */
    public abstract void mo84625x();
}
