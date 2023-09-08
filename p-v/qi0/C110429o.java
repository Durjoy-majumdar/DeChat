package qi0;

import android.graphics.Canvas;
import com.tencent.p014mm.plugin.appbrand.canvas.action.arg.DrawActionArg;
import org.json.JSONArray;
import pi0.C110229d;
import ri0.C110571b;
import ri0.C110572c;
import si0.C110791a;

/* renamed from: qi0.o */
public class C110429o implements C110408d {
    /* renamed from: a */
    public boolean mo161914a(C110229d dVar, Canvas canvas, DrawActionArg drawActionArg) {
        mo161929c(dVar, canvas);
        return true;
    }

    /* renamed from: b */
    public boolean mo161915b(C110229d dVar, Canvas canvas, JSONArray jSONArray) {
        mo161929c(dVar, canvas);
        return true;
    }

    /* renamed from: c */
    public final boolean mo161929c(C110229d dVar, Canvas canvas) {
        canvas.save();
        C110791a aVar = dVar.f329744a;
        dVar.f329746c.push(aVar);
        if (dVar.f329753j) {
            C110791a a = C110572c.f330728b.mo162065a();
            dVar.f329744a = a;
            aVar.mo162349b(a);
        } else {
            dVar.f329744a = aVar.mo162348a();
        }
        if (dVar.f329744a == null) {
            dVar.f329744a = aVar;
        }
        C110791a aVar2 = dVar.f329745b;
        dVar.f329747d.push(aVar2);
        if (dVar.f329753j) {
            dVar.f329745b = C110571b.f330727b.mo162065a();
        } else {
            dVar.f329745b = aVar2.mo162348a();
        }
        aVar2.mo162349b(dVar.f329745b);
        if (dVar.f329745b != null) {
            return true;
        }
        dVar.f329745b = aVar2;
        return true;
    }

    public String getMethod() {
        return "save";
    }
}
