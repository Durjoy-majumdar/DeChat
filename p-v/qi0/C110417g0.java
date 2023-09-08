package qi0;

import android.graphics.Canvas;
import android.graphics.Paint;
import com.tencent.p014mm.plugin.appbrand.canvas.action.arg.DrawActionArg;
import com.tencent.p014mm.plugin.appbrand.canvas.action.arg.SetTextAlignActionArg;
import org.json.JSONArray;
import pi0.C110229d;

/* renamed from: qi0.g0 */
public class C110417g0 implements C110408d {
    /* renamed from: a */
    public boolean mo161914a(C110229d dVar, Canvas canvas, DrawActionArg drawActionArg) {
        SetTextAlignActionArg setTextAlignActionArg = (SetTextAlignActionArg) drawActionArg;
        if (setTextAlignActionArg == null) {
            return false;
        }
        mo161922c(dVar, setTextAlignActionArg.f311139e);
        return true;
    }

    /* renamed from: b */
    public boolean mo161915b(C110229d dVar, Canvas canvas, JSONArray jSONArray) {
        if (jSONArray.length() < 1) {
            return false;
        }
        mo161922c(dVar, jSONArray.optString(0));
        return true;
    }

    /* renamed from: c */
    public final boolean mo161922c(C110229d dVar, String str) {
        if ("left".equalsIgnoreCase(str)) {
            dVar.f329744a.setTextAlign(Paint.Align.LEFT);
            dVar.f329745b.setTextAlign(Paint.Align.LEFT);
            return true;
        } else if ("right".equalsIgnoreCase(str)) {
            dVar.f329744a.setTextAlign(Paint.Align.RIGHT);
            dVar.f329745b.setTextAlign(Paint.Align.RIGHT);
            return true;
        } else if (!"center".equalsIgnoreCase(str)) {
            return true;
        } else {
            dVar.f329744a.setTextAlign(Paint.Align.CENTER);
            dVar.f329745b.setTextAlign(Paint.Align.CENTER);
            return true;
        }
    }

    public String getMethod() {
        return "setTextAlign";
    }
}
