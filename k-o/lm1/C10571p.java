package lm1;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import cm1.C0740i2;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter;
import er1.C58739j4;
import gy3.C87412m;
import java.util.ArrayList;
import jq3.C60898l;
import jq3.C60905o;
import ok1.C62042e;
import qo3.C77407n;

/* renamed from: lm1.p */
public final class C10571p implements C60898l.C9503c<C60905o> {

    /* renamed from: d */
    public final /* synthetic */ ArrayList<C0740i2> f31885d;

    /* renamed from: e */
    public final /* synthetic */ C10554j f31886e;

    public C10571p(ArrayList<C0740i2> arrayList, C10554j jVar) {
        this.f31885d = arrayList;
        this.f31886e = jVar;
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
        C0740i2 i2Var = this.f31885d.get(i - c6);
        C87412m.m108593f(i2Var, "data[pos]");
        C0740i2 i2Var2 = i2Var;
        boolean z = i2Var2 instanceof BaseFinderFeed;
        if (!z || !C58739j4.f168176a.mo83686O((BaseFinderFeed) i2Var2)) {
            Log.m105924i("NearbyLiveViewCallback", "onItemLongClick return for not live feed.");
        }
        if (!z) {
            return true;
        }
        BaseFinderFeed baseFinderFeed = (BaseFinderFeed) i2Var2;
        if (!C58739j4.f168176a.mo83686O(baseFinderFeed)) {
            return true;
        }
        C62042e eVar2 = C62042e.f176370a;
        Context context = oVar.f173499A;
        C87412m.m108593f(context, "holder.context");
        C77407n B0 = eVar2.mo86992B0(context, baseFinderFeed, 1001, this.f31886e.f31847h, new C10570o(this.f31885d, i2Var2, eVar, i));
        if (B0 == null) {
            return true;
        }
        B0.mo107573q();
        return true;
    }
}
