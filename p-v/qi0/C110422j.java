package qi0;

import android.graphics.Canvas;
import com.tencent.p014mm.plugin.appbrand.canvas.action.arg.DrawActionArg;
import com.tencent.p014mm.plugin.appbrand.canvas.action.arg.path.PathActionArgWrapper;
import org.json.JSONArray;
import pi0.C110229d;
import ti0.C110997e;

/* renamed from: qi0.j */
public class C110422j implements C110408d {
    /* renamed from: a */
    public boolean mo161914a(C110229d dVar, Canvas canvas, DrawActionArg drawActionArg) {
        canvas.drawPath(C110997e.C110998a.f332436a.mo162684b((PathActionArgWrapper) drawActionArg), dVar.f329745b);
        return true;
    }

    /* renamed from: b */
    public boolean mo161915b(C110229d dVar, Canvas canvas, JSONArray jSONArray) {
        canvas.drawPath(C110997e.C110998a.f332436a.mo162685c(jSONArray), dVar.f329745b);
        return true;
    }

    public String getMethod() {
        return "fillPath";
    }
}
