package p269xe;

import gy3.C87412m;
import org.json.JSONObject;
import p723vf.C118672d;
import z04.C112551y;

/* renamed from: xe.l */
public final class C91191l {
    /* renamed from: a */
    public static final String m114455a(JSONObject jSONObject) {
        C87412m.m108594g(jSONObject, "<this>");
        try {
            String jSONObject2 = jSONObject.toString();
            C87412m.m108593f(jSONObject2, "toString()");
            return C112551y.m153814n(jSONObject2, ",", ";", false);
        } catch (Throwable th) {
            C118672d.m167354d("Matrix.Safe", th, "", new Object[0]);
            return "";
        }
    }
}
