package kf1;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import cm1.C55018j0;
import dp1.C7435f2;
import ef1.C7639h;
import ef1.C7641j;
import gy3.C87412m;
import java.util.HashSet;
import java.util.List;
import jq3.C60898l;
import jq3.C60905o;
import o40.C61926c;
import org.json.JSONObject;
import rs1.C13442s8;
import rx3.C13598b0;
import te3.C49296ek1;
import te3.C49712hj1;
import zp3.C23555k;

/* renamed from: kf1.q5 */
public final class C9936q5 extends C23555k.C23558c {

    /* renamed from: a */
    public final HashSet<Long> f30573a = new HashSet<>();

    /* renamed from: b */
    public final /* synthetic */ C9868n5 f30574b;

    public C9936q5(C9868n5 n5Var) {
        this.f30574b = n5Var;
    }

    /* renamed from: d */
    public boolean mo777d() {
        return true;
    }

    /* renamed from: e */
    public void mo778e(View view, List<? extends RecyclerView.C16631z> list) {
        String str;
        C87412m.m108594g(view, "parent");
        C87412m.m108594g(list, "exposedHolders");
        HashSet hashSet = new HashSet();
        C9868n5 n5Var = this.f30574b;
        for (RecyclerView.C16631z zVar : list) {
            C7639h hVar = null;
            C60905o oVar = zVar instanceof C60905o ? (C60905o) zVar : null;
            if (oVar != null) {
                Object obj = oVar.f173503E;
                C55018j0 j0Var = obj instanceof C55018j0 ? (C55018j0) obj : null;
                if (j0Var != null) {
                    hashSet.add(Long.valueOf(j0Var.getItemId()));
                    if (!this.f30573a.contains(Long.valueOf(j0Var.getItemId()))) {
                        RecyclerView.C16613e eVar = oVar.f173500B;
                        C60898l lVar = eVar instanceof C60898l ? (C60898l) eVar : null;
                        int j = oVar.mo17363j();
                        int c6 = lVar != null ? j - lVar.mo85796c6() : j - 1;
                        C7435f2 f2Var = C7435f2.f25626a;
                        C13442s8.C13443a aVar = C13442s8.f38060Q0;
                        C13442s8 f = aVar.mo12873f(n5Var.f30449a);
                        C49712hj1 q3 = f != null ? f.mo12861q3() : null;
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("feedid", C61926c.m72691p(n5Var.f30450b.f14124t));
                        jSONObject.put("feed_location_id", c6);
                        C49296ek1 ek12 = j0Var.mo3513o().getFeedObject().flow_card_recommand_reason;
                        if (ek12 == null || (str = ek12.f132981d) == null) {
                            str = "";
                        }
                        jSONObject.put("recommend_reason", str);
                        C13598b0 b0Var = C13598b0.f38549a;
                        f2Var.mo8577a(q3, "more_recommend_feed", 0, jSONObject);
                        C13442s8 f2 = aVar.mo12873f(n5Var.f30449a);
                        if (f2 != null) {
                            if (f2.mo12844K3()) {
                                hVar = f2.f38085U;
                            }
                            if (hVar != null) {
                                C7641j jVar = new C7641j(1);
                                jVar.f25948c = j0Var;
                                hVar.mo8766a(jVar);
                            }
                        }
                    }
                }
            }
        }
        this.f30573a.clear();
        this.f30573a.addAll(hashSet);
    }
}
