package p170ic;

import fy3.C32226l;
import gy3.C87412m;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;
import rx3.C13598b0;
import sx3.C64188i0;
import sx3.C64197v;

/* renamed from: ic.c */
public final class C87689c {
    /* renamed from: a */
    public static final JSONObject m109088a(JSONObject jSONObject) {
        C87412m.m108594g(jSONObject, "<this>");
        String[] strArr = new String[jSONObject.length()];
        Iterator<String> keys = jSONObject.keys();
        C87412m.m108593f(keys, "this.keys()");
        int i = 0;
        while (keys.hasNext()) {
            int i2 = i + 1;
            if (i >= 0) {
                C64188i0 i0Var = new C64188i0(i, keys.next());
                strArr[i0Var.f181909a] = (String) i0Var.f181910b;
                i = i2;
            } else {
                C64197v.m75542k();
                throw null;
            }
        }
        return new JSONObject(jSONObject, strArr);
    }

    /* renamed from: b */
    public static final <T> void m109089b(JSONArray jSONArray, C32226l<? super T, C13598b0> lVar) {
        C87412m.m108594g(jSONArray, "<this>");
        C87412m.m108594g(lVar, "block");
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            lVar.invoke(jSONArray.get(i));
        }
    }
}
