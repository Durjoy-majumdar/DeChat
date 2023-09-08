package oo0;

import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import ol0.C117844w;
import org.json.JSONException;
import org.json.JSONObject;
import pl0.C118080q;

/* renamed from: oo0.f */
public class C117872f implements C118080q.C118113z {

    /* renamed from: a */
    public final /* synthetic */ int f352389a;

    /* renamed from: b */
    public final /* synthetic */ C82381f f352390b;

    public C117872f(C89248j jVar, int i, C82381f fVar) {
        this.f352389a = i;
        this.f352390b = fVar;
    }

    /* renamed from: a */
    public void mo182591a(C118080q.C118106u uVar) {
        C117844w.C117862r rVar = new C117844w.C117862r();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("mapId", this.f352389a);
            jSONObject.put("latitude", uVar.f353051a);
            jSONObject.put("longitude", uVar.f353052b);
            jSONObject.put("name", uVar.f353053c);
            if (!Util.isNullOrNil(uVar.f353054d)) {
                jSONObject.put("buildingId", uVar.f353054d);
                jSONObject.put("floorName", uVar.f353055e);
            }
        } catch (JSONException e) {
            Log.m105921e("MicroMsg.JsApiInsertXWebMap", "put JSON data error : %s", e);
        }
        rVar.f242407f = jSONObject.toString();
        this.f352390b.mo109669n(rVar, (int[]) null);
        Log.m105927v("MicroMsg.JsApiInsertXWebMap", "OnMapPoiClick %s", jSONObject.toString());
    }
}
