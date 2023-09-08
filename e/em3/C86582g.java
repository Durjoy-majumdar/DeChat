package em3;

import android.graphics.RectF;
import com.tencent.p014mm.sdk.platformtools.Log;
import dm3.C86351b;
import e42.C7596h;
import e42.C86430i;
import fy3.C32226l;
import gy3.C87412m;
import js0.C88020k;
import org.json.JSONObject;
import rx3.C13598b0;

/* renamed from: em3.g */
public final class C86582g extends C86430i<C86351b> {

    /* renamed from: d */
    public static final RectF f251493d = new RectF(0.0f, 0.0f, 0.0f, 0.0f);

    /* renamed from: e */
    public String mo16e() {
        return "setEasterEggBoundingBox";
    }

    /* renamed from: l */
    public boolean mo17l() {
        return true;
    }

    /* renamed from: q */
    public void mo18q(C7596h hVar) {
        RectF rectF;
        C7596h hVar2;
        C87412m.m108594g(hVar, "data");
        C32226l<C7596h, C13598b0> p = mo120840p();
        T t = this.f251227a;
        C87412m.m108591d(t);
        C86351b bVar = (C86351b) t;
        JSONObject optJSONObject = hVar.optJSONObject("frame");
        if (optJSONObject == null) {
            rectF = f251493d;
        } else {
            float c = C88020k.m109552c((float) optJSONObject.optDouble("x"));
            float c2 = C88020k.m109552c((float) optJSONObject.optDouble("y"));
            rectF = new RectF(c, c2, C88020k.m109552c((float) optJSONObject.optDouble("w")) + c, C88020k.m109552c((float) optJSONObject.optDouble("h")) + c2);
        }
        String optString = hVar.optString("eggKey");
        String optString2 = hVar.optString("eggId");
        if (!C87412m.m108589b(rectF, f251493d)) {
            C87412m.m108593f(optString, "eggKey");
            boolean z = false;
            if (!(optString.length() == 0)) {
                C87412m.m108593f(optString2, "eggId");
                if (optString2.length() == 0) {
                    z = true;
                }
                if (!z) {
                    C87412m.m108594g(rectF, "rectF");
                    if (!C87412m.m108589b(optString2, bVar.f251060f.f251248b)) {
                        Log.m105928w("MicroMsg.MEChattingMgr", "[ME]: can't set bbox because " + optString2 + " is not " + bVar.f251060f);
                    } else {
                        bVar.f251056b.setBoundingBox(rectF);
                        bVar.f251058d.removeCallbacks(bVar.f251063i);
                        bVar.f251058d.postDelayed(bVar.f251063i, 300);
                    }
                    hVar2 = mo120844i();
                    p.invoke(hVar2);
                }
            }
        }
        Log.m105920e("MicroMsg.MESetEasterEggBoundingB", "stevecai: set bounding box error: " + rectF + ' ' + optString + ' ' + optString2);
        hVar2 = mo120842g(2, "");
        p.invoke(hVar2);
    }
}
