package qi0;

import android.graphics.Canvas;
import com.tencent.p014mm.plugin.appbrand.canvas.action.arg.DrawActionArg;
import com.tencent.p014mm.plugin.appbrand.canvas.action.arg.TranslateActionArg;
import js0.C88020k;
import org.json.JSONArray;
import pi0.C110229d;

/* renamed from: qi0.k0 */
public class C110425k0 implements C110408d {
    /* renamed from: a */
    public boolean mo161914a(C110229d dVar, Canvas canvas, DrawActionArg drawActionArg) {
        TranslateActionArg translateActionArg = (TranslateActionArg) drawActionArg;
        if (translateActionArg == null) {
            return false;
        }
        canvas.translate(translateActionArg.f311147e, translateActionArg.f311148f);
        return true;
    }

    /* renamed from: b */
    public boolean mo161915b(C110229d dVar, Canvas canvas, JSONArray jSONArray) {
        if (jSONArray.length() < 2) {
            return false;
        }
        canvas.translate(C88020k.m109557h(jSONArray, 0), C88020k.m109557h(jSONArray, 1));
        return true;
    }

    public String getMethod() {
        return "translate";
    }
}
