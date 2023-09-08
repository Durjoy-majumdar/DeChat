package qi0;

import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import com.tencent.p014mm.plugin.appbrand.canvas.action.arg.DrawActionArg;
import com.tencent.p014mm.plugin.appbrand.canvas.action.arg.SetLineDashActionArg;
import js0.C88020k;
import org.json.JSONArray;
import org.json.JSONException;
import pi0.C110229d;

/* renamed from: qi0.y */
public class C110439y implements C110408d {
    /* renamed from: a */
    public boolean mo161914a(C110229d dVar, Canvas canvas, DrawActionArg drawActionArg) {
        SetLineDashActionArg setLineDashActionArg = (SetLineDashActionArg) drawActionArg;
        if (setLineDashActionArg == null) {
            return false;
        }
        float[] fArr = setLineDashActionArg.f311125e;
        float f = setLineDashActionArg.f311126f;
        if (fArr == null || f == Float.MIN_VALUE) {
            return true;
        }
        dVar.f329744a.setPathEffect(new DashPathEffect(fArr, f));
        return true;
    }

    /* renamed from: b */
    public boolean mo161915b(C110229d dVar, Canvas canvas, JSONArray jSONArray) {
        if (jSONArray.length() < 2) {
            return false;
        }
        try {
            JSONArray jSONArray2 = jSONArray.getJSONArray(0);
            if (jSONArray2 == null) {
                return false;
            }
            int length = jSONArray2.length();
            float[] fArr = new float[length];
            for (int i = 0; i < length; i++) {
                fArr[i] = C88020k.m109557h(jSONArray2, i);
            }
            float h = C88020k.m109557h(jSONArray, 1);
            if (h != Float.MIN_VALUE) {
                dVar.f329744a.setPathEffect(new DashPathEffect(fArr, h));
            }
            return true;
        } catch (JSONException unused) {
            return false;
        }
    }

    public String getMethod() {
        return "setLineDash";
    }
}
