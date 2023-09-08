package qi0;

import android.graphics.Canvas;
import com.tencent.p014mm.plugin.appbrand.canvas.action.arg.DrawActionArg;
import com.tencent.p014mm.plugin.appbrand.canvas.action.arg.SetFontSizeActionArg;
import js0.C88020k;
import org.json.JSONArray;
import pi0.C110229d;

/* renamed from: qi0.s */
public class C110433s implements C110408d {
    /* renamed from: a */
    public boolean mo161914a(C110229d dVar, Canvas canvas, DrawActionArg drawActionArg) {
        SetFontSizeActionArg setFontSizeActionArg = (SetFontSizeActionArg) drawActionArg;
        if (setFontSizeActionArg == null) {
            return false;
        }
        float f = (float) setFontSizeActionArg.f311119e;
        dVar.f329745b.setTextSize(f);
        dVar.f329744a.setTextSize(f);
        return true;
    }

    /* renamed from: b */
    public boolean mo161915b(C110229d dVar, Canvas canvas, JSONArray jSONArray) {
        if (jSONArray.length() < 1) {
            return false;
        }
        float j = (float) C88020k.m109559j(jSONArray, 0);
        dVar.f329745b.setTextSize(j);
        dVar.f329744a.setTextSize(j);
        return true;
    }

    public String getMethod() {
        return "setFontSize";
    }
}
