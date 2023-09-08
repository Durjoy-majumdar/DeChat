package qi0;

import android.graphics.Canvas;
import com.tencent.p014mm.plugin.appbrand.canvas.action.arg.DrawActionArg;
import org.json.JSONArray;
import pi0.C110229d;
import ri0.C110571b;
import ri0.C110572c;
import si0.C110791a;

/* renamed from: qi0.m */
public class C110427m implements C110408d {
    /* renamed from: a */
    public boolean mo161914a(C110229d dVar, Canvas canvas, DrawActionArg drawActionArg) {
        mo161928c(dVar, canvas);
        return true;
    }

    /* renamed from: b */
    public boolean mo161915b(C110229d dVar, Canvas canvas, JSONArray jSONArray) {
        mo161928c(dVar, canvas);
        return true;
    }

    /* renamed from: c */
    public final boolean mo161928c(C110229d dVar, Canvas canvas) {
        canvas.restore();
        if (dVar.f329746c.isEmpty()) {
            return true;
        }
        C110791a aVar = dVar.f329744a;
        C110791a aVar2 = dVar.f329745b;
        dVar.f329744a = dVar.f329746c.pop();
        dVar.f329745b = dVar.f329747d.pop();
        if (!dVar.f329753j) {
            return true;
        }
        if (dVar.f329744a != aVar) {
            C110572c.f330728b.mo162068c(aVar);
        }
        if (dVar.f329745b == aVar2) {
            return true;
        }
        C110571b.f330727b.mo162067c(aVar2);
        return true;
    }

    public String getMethod() {
        return "restore";
    }
}
