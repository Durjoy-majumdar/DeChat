package ar1;

import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import org.json.JSONObject;

/* renamed from: ar1.f */
public final class C0199f extends C87413o implements C32224a<String> {

    /* renamed from: d */
    public final /* synthetic */ JSONObject f673d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0199f(JSONObject jSONObject) {
        super(0);
        this.f673d = jSONObject;
    }

    public Object invoke() {
        String jSONObject = this.f673d.toString();
        C87412m.m108593f(jSONObject, "json.toString()");
        return jSONObject;
    }
}
