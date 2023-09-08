package qi0;

import android.graphics.Canvas;
import com.tencent.p014mm.plugin.appbrand.canvas.action.arg.DrawActionArg;
import com.tencent.p014mm.plugin.appbrand.canvas.action.arg.SeMiterLimitActionArg;
import org.json.JSONArray;
import pi0.C110229d;

/* renamed from: qi0.c0 */
public class C110407c0 implements C110408d {
    /* renamed from: a */
    public boolean mo161914a(C110229d dVar, Canvas canvas, DrawActionArg drawActionArg) {
        SeMiterLimitActionArg seMiterLimitActionArg = (SeMiterLimitActionArg) drawActionArg;
        if (seMiterLimitActionArg == null) {
            return false;
        }
        float f = seMiterLimitActionArg.f311114e;
        dVar.f329745b.setStrokeMiter(f);
        dVar.f329744a.setStrokeMiter(f);
        return true;
    }

    /* renamed from: b */
    public boolean mo161915b(C110229d dVar, Canvas canvas, JSONArray jSONArray) {
        if (jSONArray.length() < 1) {
            return false;
        }
        float optDouble = (float) jSONArray.optDouble(0);
        dVar.f329745b.setStrokeMiter(optDouble);
        dVar.f329744a.setStrokeMiter(optDouble);
        return true;
    }

    public String getMethod() {
        return "setMiterLimit";
    }
}
