package ak1;

import ak1.C54067f0;
import android.view.View;
import di3.C86312j;
import gy3.C87412m;
import ht1.C8777j5;
import o40.C61926c;
import org.json.JSONObject;
import zp3.C23555k;

/* renamed from: ak1.d0 */
public final class C0046d0 extends C23555k.C23562d {

    /* renamed from: a */
    public final /* synthetic */ boolean f56a;

    /* renamed from: b */
    public final /* synthetic */ long f57b;

    public C0046d0(boolean z, long j) {
        this.f56a = z;
        this.f57b = j;
    }

    /* renamed from: a */
    public long mo52a(View view) {
        C87412m.m108594g(view, "view");
        return this.f57b + ((long) view.hashCode());
    }

    /* renamed from: b */
    public void mo53b(View view, long j, long j2, boolean z) {
        Class cls = C54116w.class;
        C87412m.m108594g(view, "view");
        if (this.f56a) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("object_id", C61926c.m72691p(this.f57b));
            C0047e0.f58a.mo54a(jSONObject);
            String jSONObject2 = jSONObject.toString();
            C87412m.m108593f(jSONObject2, "this.toString()");
            ((C8777j5) C86312j.m106911c(C8777j5.class)).hg0("watch_live_pay_expose", jSONObject2);
            return;
        }
        ((C54116w) C86312j.m106911c(cls)).Nx0(C54067f0.C54076o0.CHARGE_LIVE, 0, System.currentTimeMillis() - ((C54116w) C86312j.m106911c(cls)).f151950p);
    }
}
