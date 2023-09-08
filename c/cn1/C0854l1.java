package cn1;

import an1.C0103p;
import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import cm1.C0740i2;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter;
import er1.C58739j4;
import gy3.C87412m;
import jq3.C60898l;
import jq3.C60905o;
import ok1.C62042e;
import qo3.C77407n;
import sx3.C110818d0;

/* renamed from: cn1.l1 */
public final class C0854l1 implements C60898l.C9503c<C60905o> {

    /* renamed from: d */
    public final /* synthetic */ C0103p f2021d;

    /* renamed from: e */
    public final /* synthetic */ C0827e1 f2022e;

    public C0854l1(C0103p pVar, C0827e1 e1Var) {
        this.f2021d = pVar;
        this.f2022e = e1Var;
    }

    /* renamed from: n */
    public boolean mo759n(RecyclerView.C16613e eVar, View view, int i, RecyclerView.C16631z zVar) {
        C60905o oVar = (C60905o) zVar;
        C87412m.m108594g(eVar, "adapter");
        C87412m.m108594g(view, "view");
        C87412m.m108594g(oVar, "holder");
        int c6 = ((WxRecyclerAdapter) eVar).mo85796c6();
        if (i < c6) {
            return true;
        }
        int i2 = i - c6;
        C0740i2 i2Var = (C0740i2) C110818d0.m150917O(this.f2021d.f546e, i2);
        if (!(i2Var instanceof BaseFinderFeed)) {
            return true;
        }
        BaseFinderFeed baseFinderFeed = (BaseFinderFeed) i2Var;
        if (!C58739j4.f168176a.mo83686O(baseFinderFeed)) {
            return true;
        }
        C62042e eVar2 = C62042e.f176370a;
        Context context = oVar.f173499A;
        C87412m.m108593f(context, "holder.context");
        C77407n B0 = eVar2.mo86992B0(context, baseFinderFeed, 1005, this.f2022e.f1946g, new C0851k1(this.f2021d, i2, i2Var, eVar, i));
        if (B0 == null) {
            return true;
        }
        B0.mo107573q();
        return true;
    }
}
