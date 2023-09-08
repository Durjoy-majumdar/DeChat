package kx2;

import android.text.TextUtils;
import com.tencent.p014mm.plugin.surface.magiclivecard.p950mb.C85486a;
import e42.C86430i;
import gy3.C87412m;
import js0.C88020k;
import org.json.JSONObject;

/* renamed from: kx2.e */
public abstract class C88325e extends C86430i<C85486a> {
    /* renamed from: l */
    public boolean mo17l() {
        return true;
    }

    /* renamed from: r */
    public final float[] mo122712r(JSONObject jSONObject) {
        C87412m.m108594g(jSONObject, "data");
        try {
            JSONObject jSONObject2 = new JSONObject(jSONObject.optString("position"));
            float i = C88020k.m109558i(jSONObject2, "left", 0.0f);
            float i2 = C88020k.m109558i(jSONObject2, "top", 0.0f);
            float i3 = C88020k.m109558i(jSONObject2, "width", 0.0f);
            float i4 = C88020k.m109558i(jSONObject2, "height", 0.0f);
            float f = Float.NaN;
            if (!TextUtils.isEmpty("zIndex")) {
                double optDouble = jSONObject.optDouble("zIndex", (double) Float.NaN);
                if (!Double.isNaN(optDouble)) {
                    f = (float) optDouble;
                }
            }
            return new float[]{i, i2, i3, i4, f};
        } catch (Exception unused) {
            return null;
        }
    }
}
