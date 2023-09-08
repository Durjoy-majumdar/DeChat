package o22;

import c00.C0405n;
import com.tencent.p014mm.plugin.lite.api.C4770c;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import di3.C86312j;
import org.json.JSONObject;
import p167hz.C8835h;

/* renamed from: o22.a */
public class C11344a extends C4770c {
    /* renamed from: a */
    public void mo5693a(String str, JSONObject jSONObject, boolean z) {
        Log.m105924i("LiteAppJsApiDoGoToRecVideoList", "doGoToRecVideoList");
        try {
            ((C0405n) C86312j.m106911c(C0405n.class)).mo273L8(MMApplicationContext.getContext(), ((C8835h) C86312j.m106911c(C8835h.class)).mo9677GP(jSONObject), 1);
        } catch (Exception e) {
            Log.printErrStackTrace("LiteAppJsApiDoGoToRecVideoList", e, "doGoToRecVideoList", new Object[0]);
        }
    }
}
