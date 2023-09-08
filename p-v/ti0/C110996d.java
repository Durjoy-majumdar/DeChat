package ti0;

import android.graphics.Path;
import com.tencent.p014mm.plugin.appbrand.canvas.action.arg.path.BasePathActionArg;
import com.tencent.p014mm.plugin.appbrand.canvas.action.arg.path.PathBezierCurveToActionArg;
import js0.C88020k;
import org.json.JSONArray;

/* renamed from: ti0.d */
public class C110996d implements C110993a {
    /* renamed from: a */
    public boolean mo162678a(Path path, BasePathActionArg basePathActionArg) {
        PathBezierCurveToActionArg pathBezierCurveToActionArg = (PathBezierCurveToActionArg) basePathActionArg;
        if (pathBezierCurveToActionArg == null) {
            return false;
        }
        path.cubicTo(pathBezierCurveToActionArg.f311156e, pathBezierCurveToActionArg.f311157f, pathBezierCurveToActionArg.f311158g, pathBezierCurveToActionArg.f311159h, pathBezierCurveToActionArg.f311160i, pathBezierCurveToActionArg.f311161j);
        return true;
    }

    /* renamed from: b */
    public boolean mo162679b(Path path, JSONArray jSONArray) {
        if (jSONArray.length() < 6) {
            return false;
        }
        path.cubicTo(C88020k.m109557h(jSONArray, 0), C88020k.m109557h(jSONArray, 1), C88020k.m109557h(jSONArray, 2), C88020k.m109557h(jSONArray, 3), C88020k.m109557h(jSONArray, 4), C88020k.m109557h(jSONArray, 5));
        return true;
    }

    public String getMethod() {
        return "bezierCurveTo";
    }
}
