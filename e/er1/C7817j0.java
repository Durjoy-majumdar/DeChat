package er1;

import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import org.json.JSONObject;
import rx3.C13598b0;

/* renamed from: er1.j0 */
public final class C7817j0 extends C87413o implements C32226l<JSONObject, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C7823k0 f26340d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C7817j0(C7823k0 k0Var) {
        super(1);
        this.f26340d = k0Var;
    }

    public Object invoke(Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        C87412m.m108594g(jSONObject, LocaleUtil.ITALIAN);
        if (jSONObject.has("eventDetail")) {
            JSONObject jSONObject2 = jSONObject.getJSONObject("eventDetail");
            int i = 0;
            int i2 = jSONObject2.has("listenEventType") ? jSONObject2.getInt("listenEventType") : 0;
            if (jSONObject2.has("playPercent")) {
                i = jSONObject2.getInt("playPercent");
            }
            C7806h0 h0Var = new C7806h0(i2, i);
            h0Var.f26326c = jSONObject2.has("stayTimeSecond") ? jSONObject2.getInt("stayTimeSecond") : -1;
            this.f26340d.f26360f.add(h0Var);
        }
        return C13598b0.f38549a;
    }
}
