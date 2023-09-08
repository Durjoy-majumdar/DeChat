package qi0;

import android.graphics.Canvas;
import android.graphics.Paint;
import com.tencent.p014mm.plugin.appbrand.canvas.action.arg.ClearRectActionArg;
import com.tencent.p014mm.plugin.appbrand.canvas.action.arg.DrawActionArg;
import com.tencent.p014mm.sdk.platformtools.Log;
import js0.C88020k;
import org.json.JSONArray;
import pi0.C110229d;
import pi0.C110232f;

/* renamed from: qi0.a */
public class C110402a implements C110408d {
    /* renamed from: a */
    public boolean mo161914a(C110229d dVar, Canvas canvas, DrawActionArg drawActionArg) {
        if (drawActionArg == null || !(drawActionArg instanceof ClearRectActionArg)) {
            return false;
        }
        ClearRectActionArg clearRectActionArg = (ClearRectActionArg) drawActionArg;
        return mo161916c(dVar, canvas, clearRectActionArg.f311051e, clearRectActionArg.f311052f, clearRectActionArg.f311053g, clearRectActionArg.f311054h);
    }

    /* renamed from: b */
    public boolean mo161915b(C110229d dVar, Canvas canvas, JSONArray jSONArray) {
        if (jSONArray.length() < 4) {
            return false;
        }
        return mo161916c(dVar, canvas, C88020k.m109557h(jSONArray, 0), C88020k.m109557h(jSONArray, 1), C88020k.m109557h(jSONArray, 2), C88020k.m109557h(jSONArray, 3));
    }

    /* renamed from: c */
    public final boolean mo161916c(C110229d dVar, Canvas canvas, float f, float f2, float f3, float f4) {
        C110229d dVar2 = dVar;
        Canvas canvas2 = canvas;
        float f5 = f;
        float f6 = f2;
        if (!canvas.isHardwareAccelerated()) {
            Paint paint = dVar2.f329749f;
            if (paint != null) {
                canvas.drawRect(f, f2, f5 + f3, f6 + f4, paint);
                Log.m105927v("MicroMsg.ClearRectAction", "clearRect(x : %s, y : %s, w : %s, h : %s) with custom clearPaint", Float.valueOf(f), Float.valueOf(f2), Float.valueOf(f3), Float.valueOf(f4));
                return true;
            }
            Paint paint2 = dVar2.f329748e;
            canvas.drawRect(f, f2, f5 + f3, f6 + f4, paint2);
            Log.m105927v("MicroMsg.ClearRectAction", "clearRect(x : %s, y : %s, w : %s, h : %s) with default clearPaint", Float.valueOf(f), Float.valueOf(f2), Float.valueOf(f3), Float.valueOf(f4));
            return false;
        } else if (canvas2 instanceof C110232f) {
            ((C110232f) canvas2).mo161638a(f5, f6, f5 + f3, f6 + f4);
            Log.m105927v("MicroMsg.ClearRectAction", "MCanvas.clearRect(x : %s, y : %s, w : %s, h : %s)", Float.valueOf(f), Float.valueOf(f2), Float.valueOf(f3), Float.valueOf(f4));
            return true;
        } else {
            Paint paint3 = dVar2.f329749f;
            if (paint3 != null) {
                canvas.drawRect(f, f2, f5 + f3, f6 + f4, paint3);
                Log.m105927v("MicroMsg.ClearRectAction", "clearRect(x : %s, y : %s, w : %s, h : %s) with custom clearPaint", Float.valueOf(f), Float.valueOf(f2), Float.valueOf(f3), Float.valueOf(f4));
                return true;
            }
            Log.m105927v("MicroMsg.ClearRectAction", "clearRect(x : %s, y : %s, w : %s, h : %s) failed", Float.valueOf(f), Float.valueOf(f2), Float.valueOf(f3), Float.valueOf(f4));
            return false;
        }
    }

    public String getMethod() {
        return "clearRect";
    }
}
