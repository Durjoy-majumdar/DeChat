package qi0;

import android.graphics.Canvas;
import com.tencent.p014mm.plugin.appbrand.canvas.action.arg.DrawActionArg;
import com.tencent.p014mm.plugin.appbrand.canvas.action.arg.path.PathActionArgWrapper;
import org.json.JSONArray;
import pi0.C110229d;
import ti0.C110997e;

/* renamed from: qi0.c */
public class C110406c implements C110408d {
    /* renamed from: a */
    public boolean mo161914a(C110229d dVar, Canvas canvas, DrawActionArg drawActionArg) {
        canvas.clipPath(C110997e.C110998a.f332436a.mo162684b((PathActionArgWrapper) drawActionArg));
        return true;
    }

    /* renamed from: b */
    public boolean mo161915b(C110229d dVar, Canvas canvas, JSONArray jSONArray) {
        canvas.clipPath(C110997e.C110998a.f332436a.mo162685c(jSONArray));
        return true;
    }

    public String getMethod() {
        return "clipPath";
    }
}
