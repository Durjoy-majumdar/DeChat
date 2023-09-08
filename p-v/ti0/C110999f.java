package ti0;

import android.graphics.Path;
import com.tencent.p014mm.plugin.appbrand.canvas.action.arg.path.BasePathActionArg;
import org.json.JSONArray;

/* renamed from: ti0.f */
public class C110999f implements C110993a {
    /* renamed from: a */
    public boolean mo162678a(Path path, BasePathActionArg basePathActionArg) {
        path.close();
        return true;
    }

    /* renamed from: b */
    public boolean mo162679b(Path path, JSONArray jSONArray) {
        path.close();
        return true;
    }

    public String getMethod() {
        return "closePath";
    }
}
