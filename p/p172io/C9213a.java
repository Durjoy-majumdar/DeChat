package p172io;

import com.tencent.p014mm.plugin.magicbrush.api.MagicBrushConstants$BizNames;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import e42.C31415g;
import e42.C7596h;
import e42.C86430i;
import gy3.C87412m;
import p150eo.C86596j;
import p227rn.C13089q;

/* renamed from: io.a */
public final class C9213a<T extends C86596j> extends C86430i<T> {
    /* renamed from: e */
    public String mo16e() {
        return "deleteCard";
    }

    /* renamed from: q */
    public void mo18q(C7596h hVar) {
        C87412m.m108594g(hVar, "data");
        long optLong = hVar.optLong("msgId");
        C86596j jVar = (C86596j) this.f251227a;
        String l0 = jVar != null ? jVar.mo118862l0() : null;
        boolean H8 = ((C13089q) C86312j.m106911c(C13089q.class)).mo12585H8(optLong, C87412m.m108589b(l0, MagicBrushConstants$BizNames.BIZ_NAME_MAGIC_BRAND_SERVICE) ? 1 : C87412m.m108589b(l0, MagicBrushConstants$BizNames.BIZ_NAME_MAGIC_AD_BRAND_SERVICE) ? 2 : 0);
        Log.m105924i("MBJsApiDeleteCard", "deleteCard msgId:" + optLong + " ret:" + H8);
        if (H8) {
            mo120840p().invoke(mo120844i());
        } else {
            mo120840p().invoke(mo120843h(new C31415g(1, "fail")));
        }
    }
}
