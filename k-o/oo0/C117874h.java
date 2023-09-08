package oo0;

import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.List;
import ol0.C117844w;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import pl0.C118080q;

/* renamed from: oo0.h */
public class C117874h implements C118080q.C118112y {

    /* renamed from: a */
    public final /* synthetic */ int f352398a;

    /* renamed from: b */
    public final /* synthetic */ C82381f f352399b;

    public C117874h(C89248j jVar, int i, C82381f fVar) {
        this.f352398a = i;
        this.f352399b = fVar;
    }

    /* renamed from: a */
    public void mo182585a(C118080q.C118090g gVar) {
        C117844w.C117859o oVar = new C117844w.C117859o();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("mapId", this.f352398a);
            if (gVar != null) {
                jSONObject.put("buildingId", gVar.f353011a);
                jSONObject.put("buildingName", gVar.f353012b);
                List<C118080q.C118091h> list = gVar.f353013c;
                if (list != null && list.size() > 0) {
                    JSONArray jSONArray = new JSONArray();
                    for (C118080q.C118091h hVar : gVar.f353013c) {
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("name", hVar.f353015a);
                        jSONArray.put(jSONObject2);
                    }
                    jSONObject.put("floorList", jSONArray);
                }
                jSONObject.put("floorIndex", gVar.f353014d);
            }
        } catch (JSONException e) {
            Log.m105921e("MicroMsg.JsApiInsertXWebMap", "put JSON data error : %s", e);
        }
        oVar.f242407f = jSONObject.toString();
        this.f352399b.mo109669n(oVar, (int[]) null);
        this.f352399b.mo109676w(oVar);
        Log.m105927v("MicroMsg.JsApiInsertXWebMap", "OnMapIndoorStateChange:%s", jSONObject.toString());
    }
}
