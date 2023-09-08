package p172io;

import com.tencent.p014mm.plugin.magicbrush.api.MagicBrushConstants$BizNames;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import e42.C7596h;
import e42.C86430i;
import fy3.C32226l;
import gy3.C87412m;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import p150eo.C86596j;
import p227rn.C13089q;
import rb0.C12966g;
import rx3.C13598b0;
import z04.C112550d0;

/* renamed from: io.b */
public final class C9214b<T extends C86596j> extends C86430i<T> {
    /* renamed from: e */
    public String mo16e() {
        return "getAllDynamicCardInfo";
    }

    /* renamed from: q */
    public void mo18q(C7596h hVar) {
        C87412m.m108594g(hVar, "data");
        String str = mo120841d().f26666a;
        C87412m.m108594g(str, "instanceName");
        String g0 = C112550d0.m153797g0(str, "-", str);
        int i = 0;
        if (C87412m.m108589b(g0, MagicBrushConstants$BizNames.BIZ_NAME_MAGIC_BRAND_SERVICE)) {
            i = 2;
        } else if (C87412m.m108589b(g0, MagicBrushConstants$BizNames.BIZ_NAME_MAGIC_AD_BRAND_SERVICE)) {
            i = 1;
        }
        Log.m105924i("MBJsApiGetAllDynamicCardInfo", "bizName:" + g0);
        JSONArray jSONArray = new JSONArray();
        List<C12966g> Z90 = ((C13089q) C86312j.m106911c(C13089q.class)).Z90(i);
        if (Z90 != null) {
            for (C12966g gVar : Z90) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("msgId", gVar.f36986a);
                jSONObject.put("frameSetName", gVar.f36987b);
                jSONObject.put("frameSetData", gVar.f36988c);
                jSONArray.put(jSONObject);
            }
        }
        C32226l<C7596h, C13598b0> p = mo120840p();
        C7596h hVar2 = new C7596h();
        hVar2.put("dynamicCardInfo", jSONArray);
        C13598b0 b0Var = C13598b0.f38549a;
        mo120845j(hVar2);
        p.invoke(hVar2);
    }
}
