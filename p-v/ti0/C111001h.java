package ti0;

import android.graphics.Path;
import com.tencent.p014mm.plugin.appbrand.canvas.action.arg.path.BasePathActionArg;
import com.tencent.p014mm.plugin.appbrand.canvas.action.arg.path.PathMoveToActionArg;
import js0.C88020k;
import org.json.JSONArray;

/* renamed from: ti0.h */
public class C111001h implements C110993a {
    /* renamed from: a */
    public boolean mo162678a(Path path, BasePathActionArg basePathActionArg) {
        PathMoveToActionArg pathMoveToActionArg = (PathMoveToActionArg) basePathActionArg;
        if (pathMoveToActionArg == null) {
            return false;
        }
        path.moveTo(pathMoveToActionArg.f311164e, pathMoveToActionArg.f311165f);
        return true;
    }

    /* renamed from: b */
    public boolean mo162679b(Path path, JSONArray jSONArray) {
        if (jSONArray.length() < 2) {
            return false;
        }
        path.moveTo(C88020k.m109557h(jSONArray, 0), C88020k.m109557h(jSONArray, 1));
        return true;
    }

    public String getMethod() {
        return "moveTo";
    }
}
