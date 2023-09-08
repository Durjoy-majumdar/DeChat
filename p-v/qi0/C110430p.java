package qi0;

import android.graphics.Canvas;
import com.tencent.p014mm.plugin.appbrand.canvas.action.arg.DrawActionArg;
import com.tencent.p014mm.plugin.appbrand.canvas.action.arg.ScaleActionArg;
import org.json.JSONArray;
import pi0.C110229d;

/* renamed from: qi0.p */
public class C110430p implements C110408d {
    /* renamed from: a */
    public boolean mo161914a(C110229d dVar, Canvas canvas, DrawActionArg drawActionArg) {
        ScaleActionArg scaleActionArg = (ScaleActionArg) drawActionArg;
        if (scaleActionArg == null) {
            return false;
        }
        canvas.scale(scaleActionArg.f311112e, scaleActionArg.f311113f);
        return true;
    }

    /* renamed from: b */
    public boolean mo161915b(C110229d dVar, Canvas canvas, JSONArray jSONArray) {
        if (jSONArray.length() < 2) {
            return false;
        }
        canvas.scale((float) jSONArray.optDouble(0), (float) jSONArray.optDouble(1));
        return true;
    }

    public String getMethod() {
        return "scale";
    }
}
