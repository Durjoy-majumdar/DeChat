package pf1;

import di0.C86295k;
import org.json.JSONObject;
import p749xh.C66261f3;

/* renamed from: pf1.e0 */
public final class C11895e0 implements C86295k {

    /* renamed from: d */
    public final /* synthetic */ String f34763d;

    public C11895e0(String str) {
        this.f34763d = str;
    }

    /* renamed from: a */
    public final String mo3693a() {
        JSONObject jSONObject = new JSONObject();
        String str = this.f34763d;
        jSONObject.put(C66261f3.COL_FINDEROBJECT, str == null || str.length() == 0 ? "" : this.f34763d);
        return jSONObject.toString();
    }
}
