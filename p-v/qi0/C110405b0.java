package qi0;

import android.graphics.Canvas;
import com.tencent.p014mm.plugin.appbrand.canvas.action.arg.DrawActionArg;
import com.tencent.p014mm.plugin.appbrand.canvas.action.arg.SetLineWidthActionArg;
import js0.C88020k;
import org.json.JSONArray;
import pi0.C110229d;

/* renamed from: qi0.b0 */
public class C110405b0 implements C110408d {
    /* renamed from: a */
    public boolean mo161914a(C110229d dVar, Canvas canvas, DrawActionArg drawActionArg) {
        SetLineWidthActionArg setLineWidthActionArg = (SetLineWidthActionArg) drawActionArg;
        if (setLineWidthActionArg == null) {
            return false;
        }
        float f = setLineWidthActionArg.f311128e;
        dVar.f329745b.setStrokeWidth(f);
        dVar.f329744a.setStrokeWidth(f);
        return true;
    }

    /* renamed from: b */
    public boolean mo161915b(C110229d dVar, Canvas canvas, JSONArray jSONArray) {
        if (jSONArray.length() < 1) {
            return false;
        }
        float h = C88020k.m109557h(jSONArray, 0);
        dVar.f329745b.setStrokeWidth(h);
        dVar.f329744a.setStrokeWidth(h);
        return true;
    }

    public String getMethod() {
        return "setLineWidth";
    }
}
