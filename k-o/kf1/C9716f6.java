package kf1;

import cm1.C0740i2;
import cm1.C55018j0;
import com.tencent.p014mm.plugin.finder.feed.C2829n;
import dp1.C7435f2;
import dp1.C7450q;
import fy3.C32224a;
import gy3.C8478d0;
import gy3.C87413o;
import jq3.C60905o;
import o40.C61926c;
import org.json.JSONObject;
import rs1.C13442s8;
import rx3.C13598b0;
import te3.C49296ek1;
import te3.C49712hj1;

/* renamed from: kf1.f6 */
public final class C9716f6 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C2829n f30140d;

    /* renamed from: e */
    public final /* synthetic */ C55018j0 f30141e;

    /* renamed from: f */
    public final /* synthetic */ C8478d0 f30142f;

    /* renamed from: g */
    public final /* synthetic */ C60905o f30143g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9716f6(C2829n nVar, C55018j0 j0Var, C8478d0 d0Var, C60905o oVar) {
        super(0);
        this.f30140d = nVar;
        this.f30141e = j0Var;
        this.f30142f = d0Var;
        this.f30143g = oVar;
    }

    public Object invoke() {
        String str;
        C7435f2 f2Var = C7435f2.f25626a;
        C13442s8 f = C13442s8.f38060Q0.mo12873f(this.f30140d.f14111d);
        C49712hj1 q3 = f != null ? f.mo12861q3() : null;
        JSONObject jSONObject = new JSONObject();
        C2829n nVar = this.f30140d;
        C60905o oVar = this.f30143g;
        C55018j0 j0Var = this.f30141e;
        jSONObject.put("first_feedid", C61926c.m72691p(nVar.f14124t));
        jSONObject.put("feedid", C61926c.m72691p(((C0740i2) oVar.f173503E).getItemId()));
        jSONObject.put("next_feedid", C61926c.m72691p(j0Var.getItemId()));
        C49296ek1 ek12 = j0Var.mo3513o().getFeedObject().flow_card_recommand_reason;
        if (ek12 == null || (str = ek12.f132981d) == null) {
            str = "";
        }
        jSONObject.put("recommend_reason", str);
        C13598b0 b0Var = C13598b0.f38549a;
        f2Var.mo8577a(q3, "next_feed_play", 1, jSONObject);
        C2829n.m2663b(this.f30140d, this.f30141e, (Object) null, this.f30142f.f27483d, 2, (Object) null);
        C7450q.f25643a.mo8593a(this.f30140d.f14111d, this.f30141e, 54);
        return C13598b0.f38549a;
    }
}
