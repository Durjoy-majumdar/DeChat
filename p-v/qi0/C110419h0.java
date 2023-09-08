package qi0;

import android.graphics.Canvas;
import com.tencent.p014mm.plugin.appbrand.canvas.action.arg.DrawActionArg;
import com.tencent.p014mm.plugin.appbrand.canvas.action.arg.SetTextBaseLineActionArg;
import com.tencent.p014mm.sdk.platformtools.Log;
import org.json.JSONArray;
import pi0.C110229d;
import si0.C110791a;

/* renamed from: qi0.h0 */
public class C110419h0 implements C110408d {
    /* renamed from: a */
    public boolean mo161914a(C110229d dVar, Canvas canvas, DrawActionArg drawActionArg) {
        SetTextBaseLineActionArg setTextBaseLineActionArg = (SetTextBaseLineActionArg) drawActionArg;
        if (setTextBaseLineActionArg == null) {
            return false;
        }
        mo161923c(dVar, setTextBaseLineActionArg.f311140e);
        return true;
    }

    /* renamed from: b */
    public boolean mo161915b(C110229d dVar, Canvas canvas, JSONArray jSONArray) {
        if (jSONArray.length() < 1) {
            return false;
        }
        mo161923c(dVar, jSONArray.optString(0));
        return true;
    }

    /* renamed from: c */
    public final boolean mo161923c(C110229d dVar, String str) {
        Log.m105925i("MicroMsg.SetTextBaselineAction", "SetTextBaselineAction, align:%s", str);
        if ("top".equalsIgnoreCase(str)) {
            C110791a aVar = dVar.f329744a;
            C110791a.C110792a aVar2 = C110791a.C110792a.TOP;
            aVar.f331431d = aVar2;
            dVar.f329745b.f331431d = aVar2;
        } else if ("middle".equalsIgnoreCase(str)) {
            C110791a aVar3 = dVar.f329744a;
            C110791a.C110792a aVar4 = C110791a.C110792a.MIDDLE;
            aVar3.f331431d = aVar4;
            dVar.f329745b.f331431d = aVar4;
        } else if ("bottom".equalsIgnoreCase(str)) {
            C110791a aVar5 = dVar.f329744a;
            C110791a.C110792a aVar6 = C110791a.C110792a.BOTTOM;
            aVar5.f331431d = aVar6;
            dVar.f329745b.f331431d = aVar6;
        } else if ("normal".equalsIgnoreCase(str)) {
            C110791a aVar7 = dVar.f329744a;
            C110791a.C110792a aVar8 = C110791a.C110792a.NORMAL;
            aVar7.f331431d = aVar8;
            dVar.f329745b.f331431d = aVar8;
        }
        return true;
    }

    public String getMethod() {
        return "setTextBaseline";
    }
}
