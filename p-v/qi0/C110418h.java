package qi0;

import android.graphics.Canvas;
import com.tencent.p014mm.plugin.appbrand.canvas.action.arg.DrawActionArg;
import com.tencent.p014mm.plugin.appbrand.canvas.action.arg.DrawRectActionArg;
import js0.C88020k;
import org.json.JSONArray;
import pi0.C110229d;

/* renamed from: qi0.h */
public class C110418h implements C110408d {
    /* renamed from: a */
    public boolean mo161914a(C110229d dVar, Canvas canvas, DrawActionArg drawActionArg) {
        DrawRectActionArg drawRectActionArg = (DrawRectActionArg) drawActionArg;
        if (drawRectActionArg == null) {
            return false;
        }
        float f = drawRectActionArg.f311073e;
        float f2 = drawRectActionArg.f311074f;
        Canvas canvas2 = canvas;
        canvas2.drawRect(f, f2, f + drawRectActionArg.f311075g, f2 + drawRectActionArg.f311076h, dVar.f329744a);
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
        canvas2.drawRect(h, h2, h + C88020k.m109557h(jSONArray, 2), h2 + C88020k.m109557h(jSONArray, 3), dVar.f329744a);
        return true;
    }

    public String getMethod() {
        return "strokeRect";
    }
}
