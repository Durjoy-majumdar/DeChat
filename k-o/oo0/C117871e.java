package oo0;

import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.sdk.platformtools.Log;
import ol0.C117844w;
import org.json.JSONException;
import org.json.JSONObject;
import pl0.C118080q;

/* renamed from: oo0.e */
public class C117871e implements C118080q.C118101p {

    /* renamed from: a */
    public final /* synthetic */ int f352387a;

    /* renamed from: b */
    public final /* synthetic */ C82381f f352388b;

    public C117871e(C89248j jVar, int i, C82381f fVar) {
        this.f352387a = i;
        this.f352388b = fVar;
    }

    /* renamed from: a */
    public boolean mo182590a(C118080q.C118107v vVar) {
        C117844w.C117860p pVar = new C117844w.C117860p();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("mapId", this.f352387a);
            jSONObject.put("data", vVar.f353056a);
        } catch (JSONException e) {
            Log.m105921e("MicroMsg.JsApiInsertXWebMap", "put JSON data error : %s", e);
        }
        pVar.f242407f = jSONObject.toString();
        this.f352388b.mo109669n(pVar, (int[]) null);
        return true;
    }
}
