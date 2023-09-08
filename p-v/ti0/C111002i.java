package ti0;

import android.graphics.Path;
import com.tencent.p014mm.plugin.appbrand.canvas.action.arg.path.BasePathActionArg;
import com.tencent.p014mm.plugin.appbrand.canvas.action.arg.path.PathQuadraticCurveToActionArg;
import js0.C88020k;
import org.json.JSONArray;

/* renamed from: ti0.i */
public class C111002i implements C110993a {
    /* renamed from: a */
    public boolean mo162678a(Path path, BasePathActionArg basePathActionArg) {
        PathQuadraticCurveToActionArg pathQuadraticCurveToActionArg = (PathQuadraticCurveToActionArg) basePathActionArg;
        if (basePathActionArg == null) {
            return false;
        }
        path.quadTo(pathQuadraticCurveToActionArg.f311166e, pathQuadraticCurveToActionArg.f311167f, pathQuadraticCurveToActionArg.f311168g, pathQuadraticCurveToActionArg.f311169h);
        return true;
    }

    /* renamed from: b */
    public boolean mo162679b(Path path, JSONArray jSONArray) {
        if (jSONArray.length() < 4) {
            return false;
        }
        path.quadTo(C88020k.m109557h(jSONArray, 0), C88020k.m109557h(jSONArray, 1), C88020k.m109557h(jSONArray, 2), C88020k.m109557h(jSONArray, 3));
        return true;
    }

    public String getMethod() {
        return "quadraticCurveTo";
    }
}
