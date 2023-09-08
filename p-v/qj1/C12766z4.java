package qj1;

import ak1.C0047e0;
import ak1.C54067f0;
import ak1.C54116w;
import cl1.C54991o;
import cl1.C55001u;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import ht1.C8777j5;
import o40.C61926c;
import org.json.JSONObject;
import rx3.C13598b0;

/* renamed from: qj1.z4 */
public final class C12766z4 extends C87413o implements C32226l<Boolean, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C12669t4 f36565d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C12766z4(C12669t4 t4Var) {
        super(1);
        this.f36565d = t4Var;
    }

    public Object invoke(Object obj) {
        if (((Boolean) obj).booleanValue()) {
            boolean z = false;
            C12723w4.m12223b(this.f36565d, false);
            C0047e0 e0Var = C0047e0.f58a;
            if (((C54991o) this.f36565d.mo87696x0(C54991o.class)).f154287Z0 == 2) {
                z = true;
            }
            long j = ((C55001u) this.f36565d.mo87696x0(C55001u.class)).f154416j;
            Class cls = C54116w.class;
            if (z) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("object_id", C61926c.m72691p(j));
                e0Var.mo54a(jSONObject);
                String jSONObject2 = jSONObject.toString();
                C87412m.m108593f(jSONObject2, "this.toString()");
                ((C8777j5) C86312j.m106911c(C8777j5.class)).hg0("watch_live_pay_succ", jSONObject2);
            } else {
                ((C54116w) C86312j.m106911c(cls)).Nx0(C54067f0.C54076o0.CHARGE_LIVE, 7, System.currentTimeMillis() - ((C54116w) C86312j.m106911c(cls)).f151950p);
            }
        } else {
            Log.m105924i("FinderLiveChargePayPluginEx", "showWecoinInfo fail!");
        }
        return C13598b0.f38549a;
    }
}
