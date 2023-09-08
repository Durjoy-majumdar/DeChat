package hl0;

import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.HashMap;
import kr0.C88267e;
import kz1.C88349l;
import org.json.JSONObject;

public final /* synthetic */ class j$$b implements C88349l.C88350a {

    /* renamed from: a */
    public final /* synthetic */ C87552j f253642a;

    /* renamed from: b */
    public final /* synthetic */ C88267e f253643b;

    /* renamed from: c */
    public final /* synthetic */ int f253644c;

    public /* synthetic */ j$$b(C87552j jVar, C88267e eVar, int i) {
        this.f253642a = jVar;
        this.f253643b = eVar;
        this.f253644c = i;
    }

    /* renamed from: a */
    public final void mo122013a(int i, int i2, boolean z) {
        C87552j jVar = this.f253642a;
        C88267e eVar = this.f253643b;
        int i3 = this.f253644c;
        jVar.getClass();
        if (!z) {
            HashMap hashMap = new HashMap(2);
            hashMap.put("selectedIndex", Integer.valueOf(i));
            hashMap.put("cgiCode", Integer.valueOf(i2));
            if (BuildInfo.DEBUG) {
                Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 0, "ok");
            }
            hashMap.put("errno", 0);
            eVar.mo109647a(i3, jVar.mo115114o("ok", hashMap));
            return;
        }
        Log.m105924i("JsApiShareInvitationToLiveRoom", "panel is canceled");
        if (BuildInfo.DEBUG) {
            Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 1, "cancel");
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("errno", 1);
        } catch (Exception e) {
            Log.m105921e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e);
        }
        eVar.mo109647a(i3, jVar.mo115115p("cancel", jSONObject));
    }
}
