package mx2;

import com.tencent.p014mm.plugin.surface.magiclivecard.p950mb.C85486a;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import e42.C7596h;
import e42.C86430i;
import g70.C87164i;
import gy3.C87412m;
import h70.C87459d;
import px2.C89442a;

/* renamed from: mx2.a */
public final class C88860a extends C86430i<C85486a> {
    /* renamed from: e */
    public String mo16e() {
        return "reportFrameSetStatus";
    }

    /* renamed from: q */
    public void mo18q(C7596h hVar) {
        C87412m.m108594g(hVar, "data");
        String optString = hVar.optString("frameSetId");
        C87412m.m108593f(optString, "frameSetId");
        boolean z = false;
        if (optString.length() == 0) {
            mo120840p().invoke(mo120842g(1, "frameSetId empty!"));
        }
        int optInt = hVar.optInt("status");
        Log.m105924i("MBJsApiReportFrameSetStatus", "frameSetId:" + optString + " status:" + optInt);
        if (optInt == 0) {
            C89442a aVar = C89442a.f257487a;
            Log.m105924i("MagicLiveCardReporter", "markFrameSetAvailable frameSetId:" + optString);
            if (!(optString.length() == 0)) {
                long currentTimeMillis = System.currentTimeMillis();
                C89442a.f257489c.put(optString, Long.valueOf(currentTimeMillis));
                C87164i uo = ((C87459d) C86312j.m106911c(C87459d.class)).mo58574uo(optString);
                String str = uo != null ? uo.f252785a : null;
                if (str != null) {
                    if (str.length() > 0) {
                        z = true;
                    }
                    if (z) {
                        aVar.mo123762a(str, 2, currentTimeMillis, 0);
                    }
                }
            }
        }
        mo120840p().invoke(mo120844i());
    }
}
