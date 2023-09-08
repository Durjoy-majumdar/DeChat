package qi0;

import android.graphics.Canvas;
import com.tencent.p014mm.plugin.appbrand.canvas.action.arg.DrawActionArg;
import com.tencent.p014mm.plugin.appbrand.canvas.action.arg.FillRectActionArg;
import js0.C88020k;
import org.json.JSONArray;
import pi0.C110229d;

/* renamed from: qi0.k */
public class C110424k implements C110408d {
    /* renamed from: a */
    public boolean mo161914a(C110229d dVar, Canvas canvas, DrawActionArg drawActionArg) {
        FillRectActionArg fillRectActionArg = (FillRectActionArg) drawActionArg;
        if (fillRectActionArg == null) {
            return false;
        }
        float f = fillRectActionArg.f311081e;
        float f2 = fillRectActionArg.f311082f;
        Canvas canvas2 = canvas;
        canvas2.drawRect(f, f2, f + fillRectActionArg.f311083g, f2 + fillRectActionArg.f311084h, dVar.f329745b);
        return true;
    }

    /* renamed from: b */
    public boolean mo161915b(C110229d dVar, Canvas canvas, JSONArray jSONArray) {
        if (jSONArray.length() < 4) {
            return false;
        }
        float h = C88020k.m109557h(jSONArray, 0);
        float h2 = C88020k.m109557h(jSONArray, 1);
        Canvas canvas2 = canvas;
        canvas2.drawRect(h, h2, h + C88020k.m109557h(jSONArray, 2), h2 + C88020k.m109557h(jSONArray, 3), dVar.f329745b);
        return true;
    }

    public String getMethod() {
        return "fillRect";
    }
}
