package qi0;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import com.tencent.p014mm.plugin.appbrand.canvas.action.arg.DrawActionArg;
import com.tencent.p014mm.plugin.appbrand.canvas.action.arg.SetStrokeStyleActionArg;
import js0.C88020k;
import org.json.JSONArray;
import pi0.C110229d;

/* renamed from: qi0.f0 */
public class C110415f0 implements C110408d {
    /* renamed from: a */
    public boolean mo161914a(C110229d dVar, Canvas canvas, DrawActionArg drawActionArg) {
        SetStrokeStyleActionArg setStrokeStyleActionArg = (SetStrokeStyleActionArg) drawActionArg;
        if (setStrokeStyleActionArg == null) {
            return false;
        }
        return setStrokeStyleActionArg.mo148409a(dVar, canvas);
    }

    /* renamed from: b */
    public boolean mo161915b(C110229d dVar, Canvas canvas, JSONArray jSONArray) {
        JSONArray optJSONArray;
        JSONArray optJSONArray2;
        C110229d dVar2 = dVar;
        JSONArray jSONArray2 = jSONArray;
        if (jSONArray.length() < 2) {
            return false;
        }
        String optString = jSONArray2.optString(0);
        if ("linear".equalsIgnoreCase(optString)) {
            if (jSONArray.length() >= 3 && (optJSONArray2 = jSONArray2.optJSONArray(1)) != null && optJSONArray2.length() >= 4) {
                float h = C88020k.m109557h(optJSONArray2, 0);
                float h2 = C88020k.m109557h(optJSONArray2, 1);
                float h3 = C88020k.m109557h(optJSONArray2, 2);
                float h4 = C88020k.m109557h(optJSONArray2, 3);
                JSONArray optJSONArray3 = jSONArray2.optJSONArray(2);
                if (!(optJSONArray3 == null || optJSONArray3.length() == 0)) {
                    int[] iArr = new int[optJSONArray3.length()];
                    float[] fArr = new float[optJSONArray3.length()];
                    for (int i = 0; i < optJSONArray3.length(); i++) {
                        JSONArray optJSONArray4 = optJSONArray3.optJSONArray(i);
                        if (optJSONArray4.length() >= 2) {
                            fArr[i] = (float) optJSONArray4.optDouble(0);
                            iArr[i] = C88020k.m109551b(optJSONArray4.optJSONArray(1));
                        }
                    }
                    dVar2.f329744a.setShader(new LinearGradient(h, h2, h3, h4, iArr, fArr, Shader.TileMode.CLAMP));
                }
            }
            return false;
        } else if ("radial".equalsIgnoreCase(optString)) {
            if (jSONArray.length() < 3 || (optJSONArray = jSONArray2.optJSONArray(1)) == null || optJSONArray.length() < 3) {
                return false;
            }
            float h5 = C88020k.m109557h(optJSONArray, 1);
            float h6 = C88020k.m109557h(optJSONArray, 2);
            float h7 = C88020k.m109557h(optJSONArray, 3);
            JSONArray optJSONArray5 = jSONArray2.optJSONArray(2);
            int[] iArr2 = new int[optJSONArray5.length()];
            float[] fArr2 = new float[optJSONArray5.length()];
            for (int i2 = 0; i2 < optJSONArray5.length(); i2++) {
                JSONArray optJSONArray6 = optJSONArray5.optJSONArray(i2);
                if (optJSONArray6.length() >= 2) {
                    fArr2[i2] = (float) optJSONArray6.optDouble(0);
                    iArr2[i2] = C88020k.m109551b(optJSONArray6.optJSONArray(1));
                }
            }
            dVar2.f329744a.setShader(new RadialGradient(h5, h6, h7, iArr2, fArr2, Shader.TileMode.CLAMP));
        } else if ("normal".equalsIgnoreCase(optString)) {
            JSONArray optJSONArray7 = jSONArray2.optJSONArray(1);
            if (optJSONArray7 == null || optJSONArray7.length() < 4) {
                return false;
            }
            dVar2.f329744a.setColor(C88020k.m109551b(optJSONArray7));
        }
        return true;
    }

    public String getMethod() {
        return "setStrokeStyle";
    }
}
