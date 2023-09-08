package qi0;

import android.graphics.Canvas;
import android.graphics.Paint;
import com.tencent.p014mm.plugin.appbrand.canvas.action.arg.DrawActionArg;
import com.tencent.p014mm.plugin.appbrand.canvas.action.arg.SetLineCapActionArg;
import org.json.JSONArray;
import pi0.C110229d;

/* renamed from: qi0.x */
public class C110438x implements C110408d {
    /* renamed from: a */
    public boolean mo161914a(C110229d dVar, Canvas canvas, DrawActionArg drawActionArg) {
        SetLineCapActionArg setLineCapActionArg = (SetLineCapActionArg) drawActionArg;
        if (setLineCapActionArg == null) {
            return false;
        }
        mo161933c(dVar, setLineCapActionArg.f311124e);
        return true;
    }

    /* renamed from: b */
    public boolean mo161915b(C110229d dVar, Canvas canvas, JSONArray jSONArray) {
        if (jSONArray.length() < 1) {
            return false;
        }
        mo161933c(dVar, jSONArray.optString(0));
        return true;
    }

    /* renamed from: c */
    public final boolean mo161933c(C110229d dVar, String str) {
        if ("butt".equalsIgnoreCase(str)) {
            dVar.f329745b.setStrokeCap(Paint.Cap.BUTT);
            dVar.f329744a.setStrokeCap(Paint.Cap.BUTT);
            return true;
        } else if ("round".equalsIgnoreCase(str)) {
            dVar.f329745b.setStrokeCap(Paint.Cap.ROUND);
            dVar.f329744a.setStrokeCap(Paint.Cap.ROUND);
            return true;
        } else if (!"square".equalsIgnoreCase(str)) {
            return true;
        } else {
            dVar.f329745b.setStrokeCap(Paint.Cap.SQUARE);
            dVar.f329744a.setStrokeCap(Paint.Cap.SQUARE);
            return true;
        }
    }

    public String getMethod() {
        return "setLineCap";
    }
}
