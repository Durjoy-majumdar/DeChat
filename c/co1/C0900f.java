package co1;

import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import org.json.JSONObject;
import z04.C112551y;

/* renamed from: co1.f */
public final class C0900f extends C87413o implements C32224a<String> {

    /* renamed from: d */
    public final /* synthetic */ JSONObject f2119d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0900f(JSONObject jSONObject) {
        super(0);
        this.f2119d = jSONObject;
    }

    public Object invoke() {
        String jSONObject = this.f2119d.toString();
        C87412m.m108593f(jSONObject, "json.toString()");
        return C112551y.m153814n(jSONObject, ",", ";", false);
    }
}
