package qi0;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.util.DisplayMetrics;
import com.tencent.p014mm.plugin.appbrand.canvas.action.arg.DrawActionArg;
import com.tencent.p014mm.plugin.appbrand.canvas.action.arg.SetTransformActionArg;
import js0.C88020k;
import org.json.JSONArray;
import org.json.JSONException;
import pi0.C110229d;

/* renamed from: qi0.i0 */
public class C110421i0 implements C110408d {
    /* renamed from: a */
    public boolean mo161914a(C110229d dVar, Canvas canvas, DrawActionArg drawActionArg) {
        SetTransformActionArg setTransformActionArg = (SetTransformActionArg) drawActionArg;
        if (setTransformActionArg == null) {
            return false;
        }
        mo161925c(canvas, setTransformActionArg.f311141e, setTransformActionArg.f311142f, setTransformActionArg.f311143g, setTransformActionArg.f311144h, setTransformActionArg.f311145i, setTransformActionArg.f311146j);
        return true;
    }

    /* renamed from: b */
    public boolean mo161915b(C110229d dVar, Canvas canvas, JSONArray jSONArray) {
        if (jSONArray.length() < 6) {
            return false;
        }
        try {
            DisplayMetrics displayMetrics = C88020k.f254629a;
            mo161925c(canvas, (float) jSONArray.getDouble(0), (float) jSONArray.getDouble(1), (float) jSONArray.getDouble(2), (float) jSONArray.getDouble(3), C88020k.m109552c((float) jSONArray.getDouble(4)), C88020k.m109552c((float) jSONArray.getDouble(5)));
            return true;
        } catch (JSONException unused) {
            return false;
        }
    }

    /* renamed from: c */
    public final boolean mo161925c(Canvas canvas, float f, float f2, float f3, float f4, float f5, float f6) {
        Matrix matrix = new Matrix();
        matrix.reset();
        matrix.setValues(new float[]{f, f3, f5, f2, f4, f6, 0.0f, 0.0f, 1.0f});
        canvas.setMatrix(matrix);
        return true;
    }

    public String getMethod() {
        return "setTransform";
    }
}
