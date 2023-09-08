package lx2;

import com.tencent.p014mm.plugin.surface.magiclivecard.p950mb.C85486a;
import com.tencent.p014mm.sdk.platformtools.Log;
import e42.C7596h;
import e42.C86430i;
import gy3.C87412m;
import p671qy.C63344h;

/* renamed from: lx2.a */
public final class C88662a extends C86430i<C85486a> {

    /* renamed from: d */
    public final String f255979d = "MBJsApiPerformLiveAction";

    /* renamed from: e */
    public String mo16e() {
        return "performLiveAction";
    }

    /* renamed from: l */
    public boolean mo17l() {
        return true;
    }

    /* renamed from: q */
    public void mo18q(C7596h hVar) {
        C63344h.C63346b bVar;
        C87412m.m108594g(hVar, "data");
        String optString = hVar.optString("action");
        String str = this.f255979d;
        Log.m105924i(str, "action:" + optString);
        C87412m.m108593f(optString, "action");
        if (optString.length() == 0) {
            mo120840p().invoke(mo120842g(1, "performLiveAction action null"));
        }
        C85486a aVar = (C85486a) this.f251227a;
        if (!(aVar == null || (bVar = aVar.f249133t) == null)) {
            bVar.mo87817a(optString, hVar);
        }
        mo120840p().invoke(mo120844i());
    }
}
