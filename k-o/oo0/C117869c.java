package oo0;

import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.sdk.platformtools.Log;
import ol0.C117844w;
import org.json.JSONException;
import org.json.JSONObject;
import pl0.C118080q;

/* renamed from: oo0.c */
public class C117869c implements C118080q.C118102q {

    /* renamed from: a */
    public final /* synthetic */ int f352383a;

    /* renamed from: b */
    public final /* synthetic */ C82381f f352384b;

    public C117869c(C89248j jVar, int i, C82381f fVar) {
        this.f352383a = i;
        this.f352384b = fVar;
    }

    /* renamed from: a */
    public boolean mo182588a(C118080q.C118107v vVar) {
        C117844w.C117861q qVar = new C117844w.C117861q();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("mapId", this.f352383a);
            jSONObject.put("data", vVar.f353056a);
        } catch (JSONException e) {
            Log.m105921e("MicroMsg.JsApiInsertXWebMap", "put JSON data error : %s", e);
        }
        qVar.f242407f = jSONObject.toString();
        this.f352384b.mo109669n(qVar, (int[]) null);
        return true;
    }
}
