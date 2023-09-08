package qi0;

import android.graphics.Canvas;
import android.graphics.Paint;
import com.tencent.p014mm.plugin.appbrand.canvas.action.arg.DrawActionArg;
import com.tencent.p014mm.plugin.appbrand.canvas.action.arg.SetLineJoinActionArg;
import org.json.JSONArray;
import pi0.C110229d;

/* renamed from: qi0.a0 */
public class C110403a0 implements C110408d {
    /* renamed from: a */
    public boolean mo161914a(C110229d dVar, Canvas canvas, DrawActionArg drawActionArg) {
        SetLineJoinActionArg setLineJoinActionArg = (SetLineJoinActionArg) drawActionArg;
        if (setLineJoinActionArg == null) {
            return false;
        }
        mo161918c(dVar, setLineJoinActionArg.f311127e);
        return true;
    }

    /* renamed from: b */
    public boolean mo161915b(C110229d dVar, Canvas canvas, JSONArray jSONArray) {
        if (jSONArray.length() < 1) {
            return false;
        }
        mo161918c(dVar, jSONArray.optString(0));
        return true;
    }

    /* renamed from: c */
    public final boolean mo161918c(C110229d dVar, String str) {
        if ("miter".equalsIgnoreCase(str)) {
            dVar.f329745b.setStrokeJoin(Paint.Join.MITER);
            dVar.f329744a.setStrokeJoin(Paint.Join.MITER);
            return true;
        } else if ("round".equalsIgnoreCase(str)) {
            dVar.f329745b.setStrokeJoin(Paint.Join.ROUND);
            dVar.f329744a.setStrokeJoin(Paint.Join.ROUND);
            return true;
        } else if (!"bevel".equalsIgnoreCase(str)) {
            return true;
        } else {
            dVar.f329745b.setStrokeJoin(Paint.Join.BEVEL);
            dVar.f329744a.setStrokeJoin(Paint.Join.BEVEL);
            return true;
        }
    }

    public String getMethod() {
        return "setLineJoin";
    }
}
