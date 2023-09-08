package oo0;

import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.sdk.platformtools.Log;
import ol0.C117844w;
import org.json.JSONException;
import org.json.JSONObject;
import pl0.C118080q;

/* renamed from: oo0.i */
public class C117875i implements C118080q.C118105t {

    /* renamed from: a */
    public final /* synthetic */ int f352400a;

    /* renamed from: b */
    public final /* synthetic */ C82381f f352401b;

    public C117875i(C89248j jVar, int i, C82381f fVar) {
        this.f352400a = i;
        this.f352401b = fVar;
    }

    /* renamed from: a */
    public void mo182586a(double d, double d2) {
        C117844w.C117856l lVar = new C117844w.C117856l();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("mapId", this.f352400a);
            jSONObject.put("longitude", d2);
            jSONObject.put("latitude", d);
        } catch (JSONException e) {
            Log.m105921e("MicroMsg.JsApiInsertXWebMap", "put JSON data error : %s", e);
        }
        lVar.f242407f = jSONObject.toString();
        this.f352401b.mo109669n(lVar, (int[]) null);
        Log.m105927v("MicroMsg.JsApiInsertXWebMap", "MapOnMapAnchorPointClick:%s", jSONObject.toString());
    }
}
