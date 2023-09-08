package lm1;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import cm1.C0740i2;
import com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter;
import com.tencent.p014mm.view.recyclerview.WxRecyclerView;
import gy3.C87412m;
import java.util.ArrayList;
import jq3.C60898l;
import jq3.C60905o;
import ln1.C10585g;

/* renamed from: lm1.n */
public final class C10569n implements C60898l.C9502b<C60905o> {

    /* renamed from: d */
    public final /* synthetic */ ArrayList<C0740i2> f31879d;

    /* renamed from: e */
    public final /* synthetic */ C10554j f31880e;

    public C10569n(ArrayList<C0740i2> arrayList, C10554j jVar) {
        this.f31879d = arrayList;
        this.f31880e = jVar;
    }

    /* renamed from: q */
    public void mo734q(RecyclerView.C16613e eVar, View view, int i, RecyclerView.C16631z zVar) {
        C87412m.m108594g(eVar, "adapter");
        C87412m.m108594g(view, "view");
        C87412m.m108594g((C60905o) zVar, "holder");
        int c6 = ((WxRecyclerAdapter) eVar).mo85796c6();
        if (i >= c6) {
            int i2 = i - c6;
            C0740i2 i2Var = this.f31879d.get(i2);
            C87412m.m108593f(i2Var, "data[pos]");
            C0740i2 i2Var2 = i2Var;
            String str = C10585g.f31934b;
            C10554j jVar = this.f31880e;
            String str2 = jVar.f31847h.f134672f;
            if (str2 == null) {
                str2 = "";
            }
            C10575t tVar = jVar.f31858v;
            ArrayList<C0740i2> arrayList = this.f31879d;
            WxRecyclerView p = jVar.mo10825p();
            C87412m.m108593f(p, "recyclerView");
            tVar.mo10832d(i2Var2, i, i2, view, arrayList, str, str2, p);
        }
    }
}
