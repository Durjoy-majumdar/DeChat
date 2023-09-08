package qi0;

import android.graphics.Canvas;
import com.tencent.p014mm.plugin.appbrand.canvas.action.arg.DrawActionArg;
import com.tencent.p014mm.plugin.appbrand.canvas.action.arg.SetShadowActionArg;
import js0.C88020k;
import org.json.JSONArray;
import pi0.C110229d;

/* renamed from: qi0.e0 */
public class C110411e0 implements C110408d {
    /* renamed from: a */
    public boolean mo161914a(C110229d dVar, Canvas canvas, DrawActionArg drawActionArg) {
        SetShadowActionArg setShadowActionArg = (SetShadowActionArg) drawActionArg;
        if (setShadowActionArg == null) {
            return false;
        }
        float f = setShadowActionArg.f311134e;
        float f2 = setShadowActionArg.f311135f;
        float f3 = setShadowActionArg.f311136g;
        int i = setShadowActionArg.f311137h;
        dVar.f329745b.setShadowLayer(f3, f, f2, i);
        dVar.f329744a.setShadowLayer(f3, f, f2, i);
        return true;
    }

    /* renamed from: b */
    public boolean mo161915b(C110229d dVar, Canvas canvas, JSONArray jSONArray) {
        if (jSONArray.length() < 4) {
            return false;
        }
        float h = C88020k.m109557h(jSONArray, 0);
        float h2 = C88020k.m109557h(jSONArray, 1);
        float h3 = C88020k.m109557h(jSONArray, 2);
        JSONArray optJSONArray = jSONArray.optJSONArray(3);
        if (optJSONArray == null || optJSONArray.length() < 4) {
            return false;
        }
        int b = C88020k.m109551b(optJSONArray);
        dVar.f329745b.setShadowLayer(h3, h, h2, b);
        dVar.f329744a.setShadowLayer(h3, h, h2, b);
        return true;
    }

    public String getMethod() {
        return "setShadow";
    }
}
