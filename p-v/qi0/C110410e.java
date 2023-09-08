package qi0;

import android.graphics.Canvas;
import android.graphics.RectF;
import com.tencent.p014mm.plugin.appbrand.canvas.action.arg.DrawActionArg;
import com.tencent.p014mm.plugin.appbrand.canvas.action.arg.DrawArcActionArg;
import js0.C88020k;
import org.json.JSONArray;
import pi0.C110229d;

/* renamed from: qi0.e */
public class C110410e implements C110408d {
    /* renamed from: a */
    public boolean mo161914a(C110229d dVar, Canvas canvas, DrawActionArg drawActionArg) {
        DrawArcActionArg drawArcActionArg = (DrawArcActionArg) drawActionArg;
        if (drawArcActionArg == null) {
            return false;
        }
        mo161920c(dVar, canvas, drawArcActionArg.f311058e, drawArcActionArg.f311059f, drawArcActionArg.f311060g, drawArcActionArg.f311061h, drawArcActionArg.f311062i);
        return true;
    }

    /* renamed from: b */
    public boolean mo161915b(C110229d dVar, Canvas canvas, JSONArray jSONArray) {
        if (jSONArray.length() < 5) {
            return false;
        }
        mo161920c(dVar, canvas, C88020k.m109557h(jSONArray, 0), C88020k.m109557h(jSONArray, 1), C88020k.m109557h(jSONArray, 2), (float) jSONArray.optDouble(3), (float) jSONArray.optDouble(4));
        return true;
    }

    /* renamed from: c */
    public final boolean mo161920c(C110229d dVar, Canvas canvas, float f, float f2, float f3, float f4, float f5) {
        canvas.drawArc(new RectF(f - f3, f2 - f3, f + f3, f2 + f3), (float) ((((double) f4) / 3.141592653589793d) * 180.0d), (float) ((((double) f5) / 3.141592653589793d) * 180.0d), true, dVar.f329744a);
        return true;
    }

    public String getMethod() {
        return "arc";
    }
}
