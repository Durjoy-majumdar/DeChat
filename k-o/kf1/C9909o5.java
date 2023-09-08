package kf1;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import cm1.C55018j0;
import com.tencent.p014mm.plugin.finder.feed.C2829n;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.sdk.platformtools.Log;
import dp1.C7435f2;
import dp1.C7450q;
import gy3.C87412m;
import jq3.C60898l;
import jq3.C60905o;
import o40.C61926c;
import org.json.JSONObject;
import rs1.C13442s8;
import rx3.C13598b0;
import te3.C49296ek1;
import te3.C49712hj1;

/* renamed from: kf1.o5 */
public final class C9909o5 implements C60898l.C9502b<C60905o> {

    /* renamed from: d */
    public final /* synthetic */ C9868n5 f30532d;

    public C9909o5(C9868n5 n5Var) {
        this.f30532d = n5Var;
    }

    /* renamed from: q */
    public void mo734q(RecyclerView.C16613e eVar, View view, int i, RecyclerView.C16631z zVar) {
        String str;
        C60905o oVar = (C60905o) zVar;
        C87412m.m108594g(eVar, "adapter");
        C87412m.m108594g(view, "view");
        C87412m.m108594g(oVar, "holder");
        int c6 = i - ((C60898l) eVar).mo85796c6();
        if (c6 >= 0 && c6 < this.f30532d.f30450b.mo2930e().getSize()) {
            C2829n nVar = this.f30532d.f30450b;
            nVar.getClass();
            C55018j0 j0Var = (C55018j0) oVar.f173503E;
            Object obj = nVar.mo2931f().f173503E;
            C49712hj1 hj12 = null;
            BaseFinderFeed baseFinderFeed = obj instanceof BaseFinderFeed ? (BaseFinderFeed) obj : null;
            boolean z = false;
            if (baseFinderFeed != null && baseFinderFeed.getItemId() == j0Var.getItemId()) {
                z = true;
            }
            if (z) {
                Log.m105924i("FinderLongVideoShareContract", "onGridItemClick: click same item, position = " + c6 + ", id = " + C61926c.m72691p(j0Var.getItemId()));
                return;
            }
            Log.m105924i("FinderLongVideoShareContract", "onGridItemClick: position = " + c6 + ", id = " + C61926c.m72691p(j0Var.getItemId()));
            C2829n.m2663b(nVar, j0Var, (Object) null, c6, 2, (Object) null);
            nVar.mo2930e().f13561d = j0Var.mo3513o().getId();
            nVar.mo2930e().mo2706d(j0Var.mo3513o().getObjectNonceId());
            C7435f2 f2Var = C7435f2.f25626a;
            C13442s8 f = C13442s8.f38060Q0.mo12873f(nVar.f14111d);
            if (f != null) {
                hj12 = f.mo12861q3();
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("feedid", C61926c.m72691p(nVar.f14124t));
            jSONObject.put("feed_location_id", c6);
            C49296ek1 ek12 = j0Var.mo3513o().getFeedObject().flow_card_recommand_reason;
            if (ek12 == null || (str = ek12.f132981d) == null) {
                str = "";
            }
            jSONObject.put("recommend_reason", str);
            C13598b0 b0Var = C13598b0.f38549a;
            f2Var.mo8577a(hj12, "more_recommend_feed", 1, jSONObject);
            C7450q.f25643a.mo8593a(nVar.f14111d, j0Var, 54);
        }
    }
}
