package wn1;

import di0.C86295k;
import org.json.JSONObject;
import tn1.C14051a;

/* renamed from: wn1.k */
public final class C15562k implements C86295k {

    /* renamed from: d */
    public final /* synthetic */ C14051a f42166d;

    public C15562k(C14051a aVar) {
        this.f42166d = aVar;
    }

    /* renamed from: a */
    public final String mo3693a() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("orderDetailsJson", this.f42166d.f39400e);
        return jSONObject.toString();
    }
}
