package rh3;

import gy3.C87412m;
import java.util.Iterator;
import my3.C61595o;
import org.json.JSONArray;
import sx3.C36904l0;

/* renamed from: rh3.b */
public final class C101378b {
    /* renamed from: a */
    public static final double[] m133022a(JSONArray jSONArray) {
        C87412m.m108594g(jSONArray, "<this>");
        double[] dArr = new double[jSONArray.length()];
        Iterator it = C61595o.m72301i(0, jSONArray.length()).iterator();
        while (it.hasNext()) {
            int a = ((C36904l0) it).mo59695a();
            dArr[a] = jSONArray.getDouble(a);
        }
        return dArr;
    }

    /* renamed from: b */
    public static final JSONArray m133023b(double[] dArr) {
        C87412m.m108594g(dArr, "<this>");
        JSONArray jSONArray = new JSONArray();
        for (double put : dArr) {
            jSONArray.put(put);
        }
        return jSONArray;
    }
}
