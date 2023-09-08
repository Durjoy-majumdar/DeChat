package ti0;

import android.graphics.Path;
import com.tencent.p014mm.plugin.appbrand.canvas.action.arg.path.BasePathActionArg;
import com.tencent.p014mm.plugin.appbrand.canvas.action.arg.path.PathRectActionArg;
import js0.C88020k;
import org.json.JSONArray;

/* renamed from: ti0.j */
public class C111003j implements C110993a {
    /* renamed from: a */
    public boolean mo162678a(Path path, BasePathActionArg basePathActionArg) {
        PathRectActionArg pathRectActionArg = (PathRectActionArg) basePathActionArg;
        if (pathRectActionArg == null) {
            return false;
        }
        float f = pathRectActionArg.f311170e;
        float f2 = pathRectActionArg.f311171f;
        Path path2 = path;
        path2.addRect(f, f2, f + pathRectActionArg.f311172g, f2 + pathRectActionArg.f311173h, Path.Direction.CW);
        return true;
    }

    /* renamed from: b */
    public boolean mo162679b(Path path, JSONArray jSONArray) {
        if (jSONArray.length() < 4) {
            return false;
        }
        float h = C88020k.m109557h(jSONArray, 0);
        float h2 = C88020k.m109557h(jSONArray, 1);
        Path path2 = path;
        path2.addRect(h, h2, h + C88020k.m109557h(jSONArray, 2), h2 + C88020k.m109557h(jSONArray, 3), Path.Direction.CW);
        return true;
    }

    public String getMethod() {
        return "rect";
    }
}
