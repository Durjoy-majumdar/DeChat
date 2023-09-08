package yl2;

import gy3.C87412m;
import org.json.JSONArray;

/* renamed from: yl2.f */
public final class C16051f {
    /* renamed from: a */
    public static final Object m14950a(JSONArray jSONArray, String str) {
        C87412m.m108594g(jSONArray, "<this>");
        C87412m.m108594g(str, "key");
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            if (C87412m.m108589b(jSONArray.get(i), str)) {
                return jSONArray.remove(i);
            }
        }
        return null;
    }
}
