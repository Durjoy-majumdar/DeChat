package ti0;

import android.graphics.Path;
import com.tencent.p014mm.plugin.appbrand.canvas.action.arg.path.BasePathActionArg;
import com.tencent.p014mm.plugin.appbrand.canvas.action.arg.path.PathLineToActionArg;
import js0.C88020k;
import org.json.JSONArray;

/* renamed from: ti0.g */
public class C111000g implements C110993a {
    /* renamed from: a */
    public boolean mo162678a(Path path, BasePathActionArg basePathActionArg) {
        PathLineToActionArg pathLineToActionArg = (PathLineToActionArg) basePathActionArg;
        if (pathLineToActionArg == null) {
            return false;
        }
        path.lineTo(pathLineToActionArg.f311162e, pathLineToActionArg.f311163f);
        return true;
    }

    /* renamed from: b */
    public boolean mo162679b(Path path, JSONArray jSONArray) {
        if (jSONArray.length() < 2) {
            return false;
        }
        path.lineTo(C88020k.m109557h(jSONArray, 0), C88020k.m109557h(jSONArray, 1));
        return true;
    }

    public String getMethod() {
        return "lineTo";
    }
}
